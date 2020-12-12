package github.KingVampyre.DeepTrenches.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.world.World;
import software.bernie.geckolib.animation.builder.AnimationBuilder;
import software.bernie.geckolib.animation.controller.EntityAnimationController;
import software.bernie.geckolib.entity.IAnimatedEntity;
import software.bernie.geckolib.event.AnimationTestEvent;
import software.bernie.geckolib.manager.EntityAnimationManager;

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

	protected <E extends AnimatedFishEntity> boolean getSwimmingAnimation(AnimationTestEvent<E> event) {
		this.swimmingController.setAnimation(new AnimationBuilder().addAnimation("swimming"));

		return true;
	}

}
