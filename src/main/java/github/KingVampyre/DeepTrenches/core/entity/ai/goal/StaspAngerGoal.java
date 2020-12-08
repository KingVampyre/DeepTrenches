package github.KingVampyre.DeepTrenches.core.entity.ai.goal;

import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.ai.goal.RevengeGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

import static github.KingVampyre.DeepTrenches.core.init.StatusEffects.FLOWER_BEAUTY;
import static net.minecraft.entity.attribute.EntityAttributes.GENERIC_FOLLOW_RANGE;

public class StaspAngerGoal extends RevengeGoal {

	protected StaspEntity stasp;

    public StaspAngerGoal(StaspEntity stasp) {
		super(stasp);

		this.stasp = stasp;

		this.setGroupRevenge();
    }

    @Override
    protected void callSameTypeForRevenge() {
		double range = this.stasp.getAttributeValue(GENERIC_FOLLOW_RANGE);
		LivingEntity target = this.stasp.getTarget();

		BlockPos pos = this.stasp.getBlockPos();
		World world = this.stasp.getEntityWorld();

		Box box = new Box(pos).expand(range);

		for (StaspEntity stasp : world.getEntitiesIncludingUngeneratedChunks(StaspEntity.class, box)) {

			if (stasp.hasStatusEffect(FLOWER_BEAUTY))
				continue;

			this.setMobEntityTarget(this.stasp, target);
		}

    }

    @Override
    public boolean shouldContinue() {

		if (this.stasp.hasAngerTime()) {
			LivingEntity target = this.stasp.getTarget();

			if (!this.canTrack(target, TargetPredicate.DEFAULT) || this.stasp.hasStatusEffect(FLOWER_BEAUTY))
				return false;

			return super.shouldContinue();
		}

		return false;
    }

    @Override
    public boolean canStart() {
		LivingEntity target = this.stasp.getTarget();

		if (!this.canTrack(target, TargetPredicate.DEFAULT) || this.stasp.hasStatusEffect(FLOWER_BEAUTY))
			return false;

		return super.canStart();
    }

	@Override
	protected boolean canTrack(LivingEntity target, TargetPredicate targetPredicate) {

    	if(super.canTrack(target, targetPredicate)) {

			if (target == null)
				return false;

			if (!target.isAlive())
				return false;

			if (target.hasStatusEffect(FLOWER_BEAUTY))
				return false;

			if (target instanceof PlayerEntity) {
				PlayerEntity player = (PlayerEntity) target;

				if (player.abilities.creativeMode)
					return false;
			}

			return true;
		}

		return false;
	}

}
