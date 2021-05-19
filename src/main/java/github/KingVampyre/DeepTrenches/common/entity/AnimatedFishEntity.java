package github.KingVampyre.DeepTrenches.common.entity;

import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Skittish;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import static net.minecraft.entity.attribute.EntityAttributes.GENERIC_MOVEMENT_SPEED;

public abstract class AnimatedFishEntity extends FishEntity implements IAnimatable, Skittish {

	protected final AnimationFactory animationFactory;

	protected AnimatedFishEntity(EntityType<? extends AnimatedFishEntity> type, World world) {
		super(type, world);

		this.animationFactory = new AnimationFactory(this);
	}

	@Override
	public AnimationFactory getFactory() {
		return this.animationFactory;
	}

	@Override
	protected void initGoals() {

	}

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

	@Override
	public void registerControllers(AnimationData data) {
		data.addAnimationController(new AnimationController<>(this, "swimmingController", 0, this::getSwimmingAnimation));
	}

}
