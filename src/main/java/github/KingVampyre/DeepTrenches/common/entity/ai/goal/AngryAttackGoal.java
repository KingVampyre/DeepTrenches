package github.KingVampyre.DeepTrenches.common.entity.ai.goal;

import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.mob.Angerable;
import net.minecraft.entity.mob.PathAwareEntity;

public class AngryAttackGoal<T extends PathAwareEntity & Angerable> extends MeleeAttackGoal {

    protected final T angerable;

    public AngryAttackGoal(T angerable, double speed, boolean pauseWhenMobIdle) {
        super(angerable, speed, pauseWhenMobIdle);

        this.angerable = angerable;
    }

    @Override
    public boolean canStart() {
        return super.canStart() && this.angerable.hasAngerTime();
    }

    @Override
    public boolean shouldContinue() {
        return super.shouldContinue() && this.angerable.hasAngerTime();
    }

}
