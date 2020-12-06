package github.KingVampyre.DeepTrenches.core.entity;

import github.KingVampyre.DeepTrenches.common.entity.ai.control.AngerLookControl;
import github.KingVampyre.DeepTrenches.core.entity.ai.control.StaspFlightMoveControl;
import github.KingVampyre.DeepTrenches.core.entity.ai.pathing.StaspNavigation;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.Durations;
import net.minecraft.entity.ai.goal.UniversalAngerGoal;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.Angerable;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.IntRange;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import software.bernie.geckolib.entity.IAnimatedEntity;
import software.bernie.geckolib.manager.EntityAnimationManager;

import java.util.UUID;

public class StaspEntity extends PathAwareEntity implements Angerable, IAnimatedEntity {

	private static final TrackedData<Integer> ANGER = DataTracker.registerData(StaspEntity.class, TrackedDataHandlerRegistry.INTEGER);
	private static final IntRange ANGER_TIME_RANGE = Durations.betweenSeconds(10, 15);

	private EntityAnimationManager animationManager;
	private UUID targetUuid;

	public StaspEntity(EntityType<? extends StaspEntity> entityType, World world) {
		super(entityType, world);

		this.animationManager = new EntityAnimationManager();
		this.moveControl = new StaspFlightMoveControl(this, 20, 90, false);
		this.lookControl = new AngerLookControl<StaspEntity>(this);

		this.setPathfindingPenalty(PathNodeType.COCOA, -1.0F);
		this.setPathfindingPenalty(PathNodeType.DANGER_FIRE, -1.0F);
		this.setPathfindingPenalty(PathNodeType.FENCE, -1.0F);
		this.setPathfindingPenalty(PathNodeType.WATER, -1.0F);
		this.setPathfindingPenalty(PathNodeType.WATER_BORDER, 16.0F);
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
	public EntityAnimationManager getAnimationManager() {
		return this.animationManager;
	}

	@Override
	public float getPathfindingFavor(BlockPos pos, WorldView world) {
		BlockState state = world.getBlockState(pos);

		return state.isAir() ? 10.0F : 0.0F;
	}

	@Override
	public int getAngerTime() {
		return this.dataTracker.get(ANGER);
	}

	@Override
	public void setAngerTime(int ticks) {
		this.dataTracker.set(ANGER, ticks);
	}

	@Override
	public UUID getAngryAt() {
		return this.targetUuid;
	}

	@Override
	public void setAngryAt(UUID uuid) {
		this.targetUuid = uuid;
	}

	@Override
	public void chooseRandomAngerTime() {
		this.setAngerTime(ANGER_TIME_RANGE.choose(this.random));
	}

	@Override
	protected void initGoals() {
		this.targetSelector.add(3, new UniversalAngerGoal(this, true));
	}

	@Override
	protected void initDataTracker() {
		super.initDataTracker();

		this.dataTracker.startTracking(ANGER, 0);
	}

	@Override
	public void readCustomDataFromTag(CompoundTag tag) {
		super.readCustomDataFromTag(tag);

		ServerWorld server = (ServerWorld) this.world;

		this.angerFromTag(server, tag);
	}

	@Override
	public void writeCustomDataToTag(CompoundTag tag) {
		super.writeCustomDataToTag(tag);

		this.angerToTag(tag);
	}

}
