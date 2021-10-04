package github.KingVampyre.DeepTrenches.core.entity;

import github.KingVampyre.DeepTrenches.common.entity.FlyingHangBugEntity;
import github.KingVampyre.DeepTrenches.core.entity.ai.control.StaspFlightMoveControl;
import github.KingVampyre.DeepTrenches.core.entity.ai.pathing.StaspNavigation;
import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class StaspEntity extends FlyingHangBugEntity {

	private static final UniformIntProvider ANGER_TIME_RANGE = UniformIntProvider.create(200, 300);

	public StaspEntity(EntityType<? extends FlyingHangBugEntity> entityType, World world) {
		super(entityType, world);

		this.moveControl = new StaspFlightMoveControl(this, 20, 90, false);

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
	protected EntityNavigation createNavigation(World world) {
		StaspNavigation navigation = new StaspNavigation(this, world);

		navigation.setCanPathThroughDoors(false);
		navigation.setCanSwim(false);
		navigation.setCanEnterOpenDoors(true);

		return navigation;
	}

	@Nullable
	@Override
	public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, @Nullable EntityData entityData, @Nullable NbtCompound entityNbt) {
		this.setVariant(this.random.nextInt(4));

		return super.initialize(world, difficulty, spawnReason, entityData, entityNbt);
	}

}
