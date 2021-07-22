package github.KingVampyre.DeepTrenches.core.entity;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import github.KingVampyre.DeepTrenches.common.entity.FlyingHangBugEntity;
import github.KingVampyre.DeepTrenches.common.entity.ai.control.AngerLookControl;
import github.KingVampyre.DeepTrenches.core.entity.ai.control.StaspFlightMoveControl;
import github.KingVampyre.DeepTrenches.core.entity.ai.pathing.StaspNavigation;
import github.KingVampyre.DeepTrenches.core.init.MemoryModuleTypes;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.brain.Brain;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.ai.brain.sensor.Sensor;
import net.minecraft.entity.ai.brain.sensor.SensorType;
import net.minecraft.entity.ai.brain.task.*;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

import static github.KingVampyre.DeepTrenches.core.init.MemoryModuleTypes.ANGER;
import static net.minecraft.entity.ai.brain.Activity.*;
import static net.minecraft.entity.ai.brain.MemoryModuleState.VALUE_ABSENT;
import static net.minecraft.entity.ai.brain.MemoryModuleType.*;
import static net.minecraft.entity.ai.brain.sensor.SensorType.HURT_BY;
import static net.minecraft.entity.ai.brain.sensor.SensorType.NEAREST_LIVING_ENTITIES;
import static net.minecraft.entity.ai.brain.task.CompositeTask.Order.ORDERED;
import static net.minecraft.entity.ai.brain.task.CompositeTask.RunMode.TRY_ALL;

public class StaspEntity extends FlyingHangBugEntity {

	private static final UniformIntProvider ANGER_TIME_RANGE = UniformIntProvider.create(10, 15);

	private static final ImmutableList<? extends SensorType<? extends Sensor<? super StaspEntity>>> SENSORS = ImmutableList.of(
			NEAREST_LIVING_ENTITIES, HURT_BY
	);

	private static final ImmutableList<? extends MemoryModuleType<?>> MEMORY_MODULES = ImmutableList.of(
			MemoryModuleTypes.ANGER, ANGRY_AT, UNIVERSAL_ANGER,
			MOBS, VISIBLE_MOBS, NEAREST_VISIBLE_PLAYER, NEAREST_VISIBLE_TARGETABLE_PLAYER,
			LOOK_TARGET, WALK_TARGET, CANT_REACH_WALK_TARGET_SINCE, PATH, ATTACK_TARGET,
			ATTACK_COOLING_DOWN, NEAREST_VISIBLE_ADULT, HURT_BY_ENTITY, NEAREST_ATTACKABLE
	);

	public StaspEntity(EntityType<? extends FlyingHangBugEntity> entityType, World world) {
		super(entityType, world);

		this.moveControl = new StaspFlightMoveControl(this, 20, 90, false);
		this.lookControl = new AngerLookControl<StaspEntity>(this);

		this.setPathfindingPenalty(PathNodeType.COCOA, -1.0F);
		this.setPathfindingPenalty(PathNodeType.DANGER_FIRE, -1.0F);
		this.setPathfindingPenalty(PathNodeType.FENCE, -1.0F);
		this.setPathfindingPenalty(PathNodeType.WATER, -1.0F);
		this.setPathfindingPenalty(PathNodeType.WATER_BORDER, 16.0F);
	}

	@Override
	public void chooseRandomAngerTime() {
		this.setAngerTime(ANGER_TIME_RANGE.get(this.random));
	}

	@Override
	protected Brain.Profile<StaspEntity> createBrainProfile() {
		return Brain.createProfile(MEMORY_MODULES, SENSORS);
	}

	@Override
	protected EntityNavigation createNavigation(World world) {
		StaspNavigation navigation = new StaspNavigation(this, world);

		navigation.setCanPathThroughDoors(false);
		navigation.setCanSwim(false);
		navigation.setCanEnterOpenDoors(true);

		return navigation;
	}

	@Override
	protected Brain<?> deserializeBrain(Dynamic<?> dynamic) {
		var brain = this.createBrainProfile().deserialize(dynamic);

		brain.setTaskList(FIGHT, 0, ImmutableList.of(
				new ForgetAttackTargetTask<>(),
				new RangedApproachTask(0.15F),
				new MeleeAttackTask(20)),
				ATTACK_TARGET);

		brain.setTaskList(CORE, 0, ImmutableList.of(
				new ForgetAngryAtTargetTask<>(),
				new LookAroundTask(45, 90),
				new WanderAroundTask()
		));

		brain.setTaskList(IDLE, ImmutableList.of(
				Pair.of(3, new UpdateAttackTargetTask<>(stasp -> true, this::getPreferredTarget)),
				Pair.of(4, new CompositeTask<>(ImmutableMap.of(WALK_TARGET, VALUE_ABSENT), ImmutableSet.of(), ORDERED, TRY_ALL, ImmutableList.of(
						Pair.of(new StrollTask(0.15F, false), 2),
						Pair.of(new GoTowardsLookTarget(0.15F, 3), 3),
						Pair.of(new ConditionalTask<>(Entity::isOnGround, new WaitTask(200, 400)), 5)))
				)
		));

		brain.setCoreActivities(ImmutableSet.of(CORE));
		brain.setDefaultActivity(IDLE);
		brain.resetPossibleActivities();

		return brain;
	}

	private Optional<? extends LivingEntity> getPreferredTarget(StaspEntity stasp) {
		var angryAt = LookTargetUtil.getEntity(stasp, ANGRY_AT);
		var brain = stasp.getBrain();

		if (angryAt.isPresent()) {
			var living = angryAt.get();

			if(Sensor.testAttackableTargetPredicateIgnoreVisibility(stasp, living))
				return angryAt;
		} else if(brain.hasMemoryModule(UNIVERSAL_ANGER)) {
			var player = brain.getOptionalMemory(NEAREST_VISIBLE_TARGETABLE_PLAYER);

			if (player.isPresent())
				return player;

		}

		return Optional.empty();
	}

	@Nullable
	@Override
	public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, @Nullable EntityData entityData, @Nullable NbtCompound entityNbt) {
		this.setVariant(this.random.nextInt(4));

		return super.initialize(world, difficulty, spawnReason, entityData, entityNbt);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void mobTick() {
		super.mobTick();

		var brain = (Brain<StaspEntity>) this.getBrain();
		var server = (ServerWorld) this.world;

		server.getProfiler().push("staspBrain");
		brain.tick(server, this);
		server.getProfiler().pop();
		server.getProfiler().push("staspActivityUpdate");
		brain.resetPossibleActivities(ImmutableList.of(FIGHT, IDLE));
		server.getProfiler().pop();

		if (!this.isAiDisabled()) {
			var anger = brain.getOptionalMemory(ANGER).orElse(0);
			var uuid = brain.getOptionalMemory(ANGRY_AT).orElse(null);

			this.setAngerTime(anger);
			this.setAngryAt(uuid);
		}

	}

}
