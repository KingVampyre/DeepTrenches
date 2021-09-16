package github.KingVampyre.DeepTrenches.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

import static net.minecraft.entity.attribute.EntityAttributes.GENERIC_MOVEMENT_SPEED;

@Deprecated
public abstract class SkittishFishEntity extends AnimatedFishEntity {

    public SkittishFishEntity(EntityType<? extends AnimatedFishEntity> type, World world) {
        super(type, world);
    }

    @Override
    protected  <E extends IAnimatable> PlayState getSwimmingAnimation(AnimationEvent<E> event)
    {
        AnimationController<?> controller = event.getController();

        if(this.isTouchingWater()) {
            EntityAttributeInstance instance = this.getAttributeInstance(GENERIC_MOVEMENT_SPEED);
            EntityAttributeModifier modifier = this.getSpeedModifier();

            if(instance != null && instance.hasModifier(modifier))
                controller.setAnimation(new AnimationBuilder().addAnimation("swimming_speed_boost"));
            else
                controller.setAnimation(new AnimationBuilder().addAnimation("swimming"));

        } else
            controller.setAnimation(new AnimationBuilder().addAnimation("on_land"));

        return PlayState.CONTINUE;
    }

}
