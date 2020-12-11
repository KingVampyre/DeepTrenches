package github.KingVampyre.DeepTrenches.core.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;
import software.bernie.geckolib.entity.IAnimatedEntity;
import software.bernie.geckolib.manager.EntityAnimationManager;

public class BlackScabbardEntity extends PathAwareEntity implements IAnimatedEntity {

    public BlackScabbardEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public EntityAnimationManager getAnimationManager() {
        return null;
    }

}
