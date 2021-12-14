package github.KingVampyre.DeepTrenches.core.entity;

import com.google.common.collect.ImmutableList;
import github.KingVampyre.DeepTrenches.common.entity.AbstractBettaEntity;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.LightState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import static github.KingVampyre.DeepTrenches.core.init.entity.DTAttributeModifiers.MOVEMENT_SPEED_BOOST_250;
import static github.KingVampyre.DeepTrenches.core.init.item.DTItems.DEEP_LAKE_BETTA_BUCKET;
import static github.KingVampyre.DeepTrenches.core.init.entity.DTLightStates.*;

public class DeepLakeBettaEntity extends AbstractBettaEntity {

    private static final ImmutableList<LightState> CONTAINER = ImmutableList.of(ALL_LIT, BODY, LURE);

    public DeepLakeBettaEntity(EntityType<? extends DeepLakeBettaEntity> type, World world) {
        super(type, world);
    }

    @Override
    public ImmutableList<LightState> getLightStates() {
        return CONTAINER;
    }

    @Override
    public EntityAttributeModifier getSpeedModifier() {
        return MOVEMENT_SPEED_BOOST_250;
    }

    @Override
    public ItemStack getBucketItem() {
        return new ItemStack(DEEP_LAKE_BETTA_BUCKET);
    }

}
