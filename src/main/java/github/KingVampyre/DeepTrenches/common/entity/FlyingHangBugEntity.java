package github.KingVampyre.DeepTrenches.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

import static net.minecraft.util.math.Vec3d.ZERO;

public class FlyingHangBugEntity extends FlyingBugEntity {

    private static final TrackedData<Boolean> HANGING = DataTracker.registerData(FlyingHangBugEntity.class, TrackedDataHandlerRegistry.BOOLEAN);

    public FlyingHangBugEntity(EntityType<? extends FlyingBugEntity> entityType, World world) {
        super(entityType, world);
    }

    public boolean getIsHanging() {
        return this.dataTracker.get(HANGING);
    }

    public void setIsHanging(boolean isHanging) {
        this.dataTracker.set(HANGING, isHanging);
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
    public boolean damage(DamageSource source, float amount) {

        if (this.isInvulnerableTo(source))
            return false;

        if (!this.world.isClient() && this.getIsHanging())
            this.setIsHanging(false);

        return super.damage(source, amount);
    }

    @Override
    protected <E extends IAnimatable> PlayState getMovementAnimation(AnimationEvent<E> event) {

        if(this.getIsHanging())
            event.getController().setAnimation(new AnimationBuilder().addAnimation("on_side"));

        return super.getMovementAnimation(event);
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();

        this.dataTracker.startTracking(HANGING, false);
    }

    @Override
    public void tick() {
        super.tick();

        if (this.getIsHanging())
            this.setVelocity(ZERO);
    }

}
