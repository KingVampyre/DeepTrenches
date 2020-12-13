package github.KingVampyre.DeepTrenches.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.world.World;
import software.bernie.geckolib.animation.builder.AnimationBuilder;
import software.bernie.geckolib.animation.controller.EntityAnimationController;
import software.bernie.geckolib.entity.IAnimatedEntity;
import software.bernie.geckolib.event.AnimationTestEvent;
import software.bernie.geckolib.manager.EntityAnimationManager;

import static net.minecraft.entity.attribute.EntityAttributes.*;

public abstract class AnimatedFishEntity extends FishEntity implements IAnimatedEntity {

	protected EntityAnimationManager animationManager = new EntityAnimationManager();
	@SuppressWarnings("unchecked rawtypes")
	protected EntityAnimationController swimmingController = new EntityAnimationController(this, "swimmingController", 20.0F, this::getSwimmingAnimation);

	protected AnimatedFishEntity(EntityType<? extends AnimatedFishEntity> type, World world) {
		super(type, world);

		this.animationManager.addAnimationController(this.swimmingController);
	}

	@Override
	public EntityAnimationManager getAnimationManager() {
		return this.animationManager;
	}

	protected abstract EntityAttributeModifier getSpeedModifier();

	protected <E extends AnimatedFishEntity> boolean getSwimmingAnimation(AnimationTestEvent<E> event) {
		AnimatedFishEntity entity = event.getEntity();

		if(entity.isTouchingWater()) {
			EntityAttributeInstance instance = entity.getAttributeInstance(GENERIC_MOVEMENT_SPEED);
			EntityAttributeModifier modifier = this.getSpeedModifier();

			if(instance != null && instance.hasModifier(modifier))
				this.swimmingController.setAnimation(new AnimationBuilder().addAnimation("swimming_speed_boost"));
			else
				this.swimmingController.setAnimation(new AnimationBuilder().addAnimation("swimming"));

		} else
			this.swimmingController.setAnimation(new AnimationBuilder().addAnimation("on_land"));

		return true;
	}

}
