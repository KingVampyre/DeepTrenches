package github.KingVampyre.DeepTrenches.core.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;
import software.bernie.geckolib.manager.EntityAnimationManager;

public class DeepLakeBettaEntity extends BettaEntity {

    public DeepLakeBettaEntity(EntityType<? extends DeepLakeBettaEntity> type, World world) {
        super(type, world);
    }

    @Override
    public EntityAnimationManager getAnimationManager() {
        // TODO animation manager
        return null;
    }

}
