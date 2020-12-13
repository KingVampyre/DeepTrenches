package github.KingVampyre.DeepTrenches.core.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.world.World;
import software.bernie.geckolib.manager.EntityAnimationManager;

import static github.KingVampyre.DeepTrenches.core.init.AttributeModifiers.MOVEMENT_SPEED_BOOST_250;

public class DeepLakeBettaEntity extends BettaEntity {

    public DeepLakeBettaEntity(EntityType<? extends DeepLakeBettaEntity> type, World world) {
        super(type, world);
    }

    @Override
    public EntityAnimationManager getAnimationManager() {
        // TODO animation manager
        return null;
    }

    @Override
    protected EntityAttributeModifier getSpeedModifier() {
        return MOVEMENT_SPEED_BOOST_250;
    }

}
