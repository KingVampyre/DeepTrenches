package github.KingVampyre.DeepTrenches.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public abstract class BugEntity extends PathAwareEntity implements IAnimatable {

    protected AnimationFactory animationFactory;

    public BugEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);

        this.animationFactory = new AnimationFactory(this);
    }

    @Override
    public AnimationFactory getFactory() {
        return this.animationFactory;
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<>(this, "movementController", 0, this::getMovementAnimation));
    }

    protected abstract <E extends IAnimatable> PlayState getMovementAnimation(AnimationEvent<E> event);

}
