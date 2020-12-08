package github.KingVampyre.DeepTrenches.core.entity.ai.goal;

import github.KingVampyre.DeepTrenches.core.block.entity.StaspNestBlockEntity;
import github.KingVampyre.DeepTrenches.core.component.StaspPollenComponent;
import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import github.KingVampyre.DeepTrenches.core.init.Components;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.goal.MoveToTargetPosGoal;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

import java.util.EnumSet;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.*;

public class EnterStaspNestGoal extends MoveToTargetPosGoal {

	protected final StaspPollenComponent pollen;
	protected final StaspEntity stasp;

    public EnterStaspNestGoal(StaspEntity stasp, double speed, int range) {
		super(stasp, speed, range);

		this.pollen = (StaspPollenComponent) Components.POLLEN.get(this.mob);
		this.stasp = stasp;

		this.setControls(EnumSet.of(Goal.Control.MOVE));
    }

    @Override
    protected int getInterval(PathAwareEntity mob) {
		return 100;
    }

    @Override
    protected boolean findTargetPos() {

		if(this.stasp.hasNest()) {
			this.targetPos = this.stasp.getNestPos();

			return true;
		}

		return super.findTargetPos();
    }

    @Override
    public boolean shouldContinue() {
		return !this.stasp.hasAngerTime() && super.shouldContinue();
    }

    @Override
    public boolean canStart() {

		if (!this.stasp.hasNest() && !this.pollen.hasAqueanSapCapacity())
			return !this.stasp.hasAngerTime() && super.canStart();

		return false;
	}

	@Override
	protected boolean isTargetPos(WorldView world, BlockPos pos) {
		BlockState state = world.getBlockState(pos);

		if (state.getBlock() == STASP_NEST) {
			StaspNestBlockEntity staspNest = (StaspNestBlockEntity) world.getBlockEntity(pos);

			if(staspNest != null)
				return !staspNest.isFullOfStasps();
		}

		return false;
    }

    @Override
    public void start() {
		super.start();

		this.stasp.setNestPos(this.targetPos);
    }

    @Override
    public void tick() {
		super.tick();

		if (!pollen.hasAqueanSapCapacity()) {
			double distance = this.getDesiredSquaredDistanceToTarget();
			Vec3d vec = this.stasp.getPos();

			if (this.targetPos.isWithinDistance(vec, distance)) {
				BlockPos nestPos = this.stasp.getNestPos();
				World world = this.stasp.getEntityWorld();

				BlockEntity blockEntity = world.getBlockEntity(nestPos);

				if (blockEntity instanceof StaspNestBlockEntity) {
					StaspNestBlockEntity staspNest = (StaspNestBlockEntity) blockEntity;

					staspNest.tryEnterHive(this.stasp);
				}
			}
		}
    }

}