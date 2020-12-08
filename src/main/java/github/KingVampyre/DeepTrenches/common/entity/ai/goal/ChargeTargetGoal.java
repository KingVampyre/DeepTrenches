package github.KingVampyre.DeepTrenches.common.entity.ai.goal;

import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Chargable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;

import java.util.EnumSet;

public class ChargeTargetGoal<T extends MobEntity & Chargable> extends Goal {

    protected final T mob;
    protected double maxDist;
    protected double minDist;
    protected double probability;

    public ChargeTargetGoal(T mob, double maxDist, double minDist, double probability) {
        this.mob = mob;
        this.maxDist = maxDist;
        this.minDist = minDist;
        this.probability = probability;

        this.setControls(EnumSet.of(Goal.Control.MOVE));
    }

    @Override
    public boolean canStart() {
        LivingEntity target = this.mob.getTarget();

        if (target != null && !this.mob.getMoveControl().isMoving() && this.mob.getRandom().nextFloat() >= this.probability)
            return this.mob.squaredDistanceTo(target) > this.minDist;

        return false;
    }

    @Override
    public boolean shouldContinue() {
        LivingEntity target = this.mob.getTarget();

        return this.mob.getMoveControl().isMoving() && this.mob.isCharging() && target != null && target.isAlive();
    }

    @Override
    public void start() {
        LivingEntity target = this.mob.getTarget();

        if(target != null) {
            Vec3d vec3d = target.getCameraPosVec(1.0F);

            this.mob.getMoveControl().moveTo(vec3d.x, vec3d.y, vec3d.z, 1.0D);
            this.mob.setCharging(true);
        }

    }

    @Override
    public void stop() {
        this.mob.setCharging(false);
    }

    @Override
    public void tick() {
        LivingEntity target = this.mob.getTarget();

        if(target != null) {
            Box box = target.getBoundingBox();

            if (this.mob.getBoundingBox().intersects(box)) {
                this.mob.tryAttack(target);
                this.mob.setCharging(false);
            } else if(this.mob.squaredDistanceTo(target) < this.maxDist) {
                Vec3d vec3d = target.getCameraPosVec(1.0F);

                this.mob.getMoveControl().moveTo(vec3d.x, vec3d.y, vec3d.z, 1.0D);
            }

        }

    }

}
