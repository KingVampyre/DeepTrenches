package github.KingVampyre.DeepTrenches.core.entity.ai.goal;

import github.KingVampyre.DeepTrenches.common.entity.ai.goal.ChargeTargetGoal;
import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;

public class StaspChargeTargetGoal extends ChargeTargetGoal<StaspEntity> {

    public StaspChargeTargetGoal(StaspEntity mob, double maxDist, double minDist, double probability) {
        super(mob, maxDist, minDist, probability);
    }

    @Override
    public void start() {
        // TODO stasp charge sound
        super.start();
    }

}
