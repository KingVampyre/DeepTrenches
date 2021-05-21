package github.KingVampyre.DeepTrenches.core.entity;

import github.KingVampyre.DeepTrenches.common.entity.FlyingHangBugEntity;
import github.KingVampyre.DeepTrenches.common.entity.ai.control.AngerLookControl;
import github.KingVampyre.DeepTrenches.common.entity.ai.goal.AngryAttackGoal;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Chargable;
import github.KingVampyre.DeepTrenches.core.entity.ai.control.StaspFlightMoveControl;
import github.KingVampyre.DeepTrenches.core.entity.ai.goal.*;
import github.KingVampyre.DeepTrenches.core.entity.ai.pathing.StaspNavigation;
import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.Durations;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.Angerable;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.IntRange;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;

import java.util.UUID;

import static net.minecraft.entity.attribute.EntityAttributes.GENERIC_FLYING_SPEED;

public class StaspEntity extends FlyingHangBugEntity implements Angerable, Chargable {

	private static final TrackedData<Integer> ANGER = DataTracker.registerData(StaspEntity.class, TrackedDataHandlerRegistry.INTEGER);
	private static final TrackedData<Boolean> CHARGING = DataTracker.registerData(StaspEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
	private static final TrackedData<Integer> STASP_TYPE = DataTracker.registerData(BettaEntity.class, TrackedDataHandlerRegistry.INTEGER);

	private static final IntRange ANGER_TIME_RANGE = Durations.betweenSeconds(10, 15);

	private BlockPos nestPos;
	private UUID targetUuid;

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
	protected EntityNavigation createNavigation(World world) {
		StaspNavigation navigation = new StaspNavigation(this, world);

		navigation.setCanPathThroughDoors(false);
		navigation.setCanSwim(false);
		navigation.setCanEnterOpenDoors(true);

		return navigation;
	}

	public int getStaspType() {
		return this.dataTracker.get(STASP_TYPE);
	}

	public void setStaspType(int viperfishType) {
		this.dataTracker.set(STASP_TYPE, viperfishType);
	}

	@Override
	public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, EntityData entityData, CompoundTag entityTag) {
		EntityData data = super.initialize(world, difficulty, spawnReason, entityData, entityTag);

		if (entityTag != null && entityTag.contains("StaspType"))
			this.setStaspType(entityTag.getInt("StaspType"));

		else if (entityData instanceof StaspData)
			this.setStaspType(((StaspData)entityData).type);
		else {
			int type = this.random.nextInt(4);
			this.setStaspType(type);

			return new StaspData(type);
		}

		return data;
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
	public boolean isCharging() {
		return this.dataTracker.get(CHARGING);
	}

	@Override
	public void setCharging(boolean charging) {
		this.dataTracker.set(CHARGING, charging);
	}

	@Override
	protected void initGoals() {
		Box box = new Box(-5, -15, -5, 5, 15,5);

		double speed = this.getAttributeValue(GENERIC_FLYING_SPEED);

		this.goalSelector.add(0, new AngryAttackGoal<>(this,0.3, true));
		this.goalSelector.add(1, new StaspChargeTargetGoal(this, 5, 10, 0.85F));
		this.goalSelector.add(6, new EnterStaspNestGoal(this, speed, 32));
		this.goalSelector.add(4, new PollinateFlowerGoal(this, speed, 16, 32, 0.25F));
		this.goalSelector.add(4, new ExtractAqueanSapGoal(this, speed, 16, 32, 0.35));
		this.goalSelector.add(5, new PollinateSaplingGoal(this, speed, 32, 10, 0.65));
		this.goalSelector.add(5, new PlantSaplingGoal(this, speed, 32, 10, 0.12));
		this.goalSelector.add(7, new StaspFlyOntoTreeGoal(this, box, speed, 0.002F));

		this.targetSelector.add(3, new StaspAngerGoal(this));
	}

	@Override
	protected void initDataTracker() {
		super.initDataTracker();

		this.dataTracker.startTracking(ANGER, 0);
		this.dataTracker.startTracking(CHARGING, false);

		this.dataTracker.startTracking(STASP_TYPE, 0);
	}

	@Override
	public void readCustomDataFromTag(CompoundTag tag) {
		super.readCustomDataFromTag(tag);

		ServerWorld server = (ServerWorld) this.world;

		this.angerFromTag(server, tag);

		if (tag.contains("NestPos"))
			this.nestPos = NbtHelper.toBlockPos(tag.getCompound("NestPos"));

		this.setStaspType(tag.getInt("StaspType"));
	}

	public boolean hasNest() {
		return this.nestPos != null;
	}

	public BlockPos getNestPos() {
		return this.nestPos;
	}

	public void setNestPos(BlockPos nestPos) {
		this.nestPos = nestPos;
	}

	@Override
	public void writeCustomDataToTag(CompoundTag tag) {
		super.writeCustomDataToTag(tag);

		this.angerToTag(tag);

		if (this.hasNest())
			tag.put("NestPos", NbtHelper.fromBlockPos(this.nestPos));

		tag.putInt("StaspType", this.getStaspType());
	}

	public static class StaspData extends PassiveEntity.PassiveData {

		public final int type;

		public StaspData(int type) {
			super(1.0F);

			this.type = type;
		}

	}

}
