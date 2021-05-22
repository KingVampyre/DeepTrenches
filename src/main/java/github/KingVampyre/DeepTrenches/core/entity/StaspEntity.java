package github.KingVampyre.DeepTrenches.core.entity;

import github.KingVampyre.DeepTrenches.common.entity.FlyingHangBugEntity;
import github.KingVampyre.DeepTrenches.common.entity.ai.control.AngerLookControl;
import github.KingVampyre.DeepTrenches.core.entity.ai.control.StaspFlightMoveControl;
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
import net.minecraft.util.math.IntRange;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;

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
