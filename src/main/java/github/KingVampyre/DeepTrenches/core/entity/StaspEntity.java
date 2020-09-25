package github.KingVampyre.DeepTrenches.core.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;
import software.bernie.geckolib.entity.IAnimatedEntity;
import software.bernie.geckolib.manager.EntityAnimationManager;

public class StaspEntity extends PathAwareEntity implements IAnimatedEntity {

	private EntityAnimationManager animationManager;

	public StaspEntity(EntityType<? extends StaspEntity> entityType, World world) {
		super(entityType, world);

		this.animationManager = new EntityAnimationManager();
	}

	@Override
	public EntityAnimationManager getAnimationManager() {
		return this.animationManager;
	}

}
