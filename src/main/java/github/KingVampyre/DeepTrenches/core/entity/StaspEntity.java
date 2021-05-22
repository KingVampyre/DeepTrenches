package github.KingVampyre.DeepTrenches.core.entity;

import github.KingVampyre.DeepTrenches.common.entity.FlyingHangBugEntity;
import github.KingVampyre.DeepTrenches.common.entity.ai.control.AngerLookControl;
import github.KingVampyre.DeepTrenches.common.entity.ai.goal.AngryAttackGoal;
import github.KingVampyre.DeepTrenches.core.entity.ai.control.StaspFlightMoveControl;
import github.KingVampyre.DeepTrenches.core.entity.ai.goal.*;
import github.KingVampyre.DeepTrenches.core.entity.ai.pathing.StaspNavigation;
import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.Durations;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.IntRange;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;

import static net.minecraft.entity.attribute.EntityAttributes.GENERIC_FLYING_SPEED;

public class StaspEntity extends FlyingHangBugEntity {

	private static final IntRange ANGER_TIME_RANGE = Durations.betweenSeconds(10, 15);

	private BlockPos nestPos;

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
		this.setAngerTime(ANGER_TIME_RANGE.choose(this.random));
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
	public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, EntityData entityData, CompoundTag entityTag) {
		this.setVariant(this.random.nextInt(4));

		return super.initialize(world, difficulty, spawnReason, entityData, entityTag);
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
	public void readCustomDataFromTag(CompoundTag tag) {
		super.readCustomDataFromTag(tag);

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

		if (this.hasNest())
			tag.put("NestPos", NbtHelper.fromBlockPos(this.nestPos));
	}

}
