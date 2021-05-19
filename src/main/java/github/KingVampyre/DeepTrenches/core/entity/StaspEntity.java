package github.KingVampyre.DeepTrenches.core.entity;

import github.KingVampyre.DeepTrenches.common.entity.ai.control.AngerLookControl;
import github.KingVampyre.DeepTrenches.common.entity.ai.goal.AngryAttackGoal;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Chargable;
import github.KingVampyre.DeepTrenches.core.entity.ai.control.StaspFlightMoveControl;
import github.KingVampyre.DeepTrenches.core.entity.ai.goal.*;
import github.KingVampyre.DeepTrenches.core.entity.ai.pathing.StaspNavigation;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.Durations;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.Angerable;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.IntRange;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import java.util.UUID;

import static net.minecraft.entity.attribute.EntityAttributes.*;

public class StaspEntity extends PathAwareEntity implements Angerable, Chargable, IAnimatable {

	private static final TrackedData<Integer> ANGER = DataTracker.registerData(StaspEntity.class, TrackedDataHandlerRegistry.INTEGER);
	private static final TrackedData<Boolean> CHARGING = DataTracker.registerData(StaspEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
	private static final TrackedData<Boolean> HANGING = DataTracker.registerData(StaspEntity.class, TrackedDataHandlerRegistry.BOOLEAN);

	private static final IntRange ANGER_TIME_RANGE = Durations.betweenSeconds(10, 15);

	private BlockPos nestPos;
	private UUID targetUuid;

	public StaspEntity(EntityType<? extends StaspEntity> entityType, World world) {
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

	@Override
	public float getPathfindingFavor(BlockPos pos, WorldView world) {
		BlockState state = world.getBlockState(pos);

		return state.isAir() ? 10.0F : 0.0F;
	}

	@Override
	public int getAngerTime() {
		return this.dataTracker.get(ANGER);
	}

	public boolean getIsHanging() {
		return this.dataTracker.get(HANGING);
	}

	@Override
	public void setAngerTime(int ticks) {
		this.dataTracker.set(ANGER, ticks);
	}

	public void setIsHanging(boolean isHanging) {
		this.dataTracker.set(HANGING, isHanging);
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
		this.dataTracker.startTracking(HANGING, false);
	}

	@Override
	public void tick() {
		super.tick();

		if (this.getIsHanging())
			this.setVelocity(Vec3d.ZERO);
	}

	@Override
	public boolean canAvoidTraps() {
		return true;
	}

	@Override
	protected boolean canClimb() {
		return false;
	}

	@Override
	public boolean handleFallDamage(float fallDistance, float damageMultiplier) {
		return false;
	}

	@Override
	protected void fall(double heightDifference, boolean onGround, BlockState landedState, BlockPos landedPosition) {

	}

	@Override
	public boolean damage(DamageSource source, float amount) {

		if (this.isInvulnerableTo(source))
			return false;

		if (!this.world.isClient() && this.getIsHanging())
			this.setIsHanging(false);

		return super.damage(source, amount);
	}

	@Override
	public void readCustomDataFromTag(CompoundTag tag) {
		super.readCustomDataFromTag(tag);

		ServerWorld server = (ServerWorld) this.world;

		this.angerFromTag(server, tag);

		if (tag.contains("NestPos"))
			this.nestPos = NbtHelper.toBlockPos(tag.getCompound("NestPos"));

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
	}

	@Override
	public void registerControllers(AnimationData data) {

	}

	@Override
	public AnimationFactory getFactory() {
		return null;
	}

}
