package github.KingVampyre.DeepTrenches.core.entity;

import com.google.common.collect.ImmutableList;
import github.KingVampyre.DeepTrenches.common.entity.AbstractLoosejawEntity;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.LightState;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Lovable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;

import static github.KingVampyre.DeepTrenches.core.init.entity.DTAttributeModifiers.MOVEMENT_SPEED_BOOST_260;
import static github.KingVampyre.DeepTrenches.core.init.entity.DTEntityTypes.BLACK_LOOSEJAW;
import static github.KingVampyre.DeepTrenches.core.init.entity.DTLightStates.*;
import static github.KingVampyre.DeepTrenches.core.init.entity.DTLightStates.SUBORBITAL_AND_LURE;
import static github.KingVampyre.DeepTrenches.core.init.item.DTItems.BLACK_LOOSEJAW_BUCKET;

public class BlackLoosejawEntity extends AbstractLoosejawEntity {

    private static final UniformIntProvider ANGER_TIME_RANGE = UniformIntProvider.create(25, 30);

    private static final ImmutableList<LightState> CONTAINER = ImmutableList.of(ALL_LIT, FLANK, FLANK_AND_LURE, FLANK_AND_SUBORBITAL, LURE, SUBORBITAL, SUBORBITAL_AND_LURE);

    public BlackLoosejawEntity(EntityType<? extends BlackLoosejawEntity> type, World world) {
        super(type, world);
    }

    @Override
    public int chooseType() {
        return this.random.nextInt(2);
    }

    @Override
    public Entity createChild(ServerWorld world, Lovable lovable) {
        BlackLoosejawEntity loosejaw = BLACK_LOOSEJAW.create(world);

        if(loosejaw != null) {
            PlayerEntity player = lovable.getLovingPlayer();

            loosejaw.setTamedBy(player);
        }

        return loosejaw;
    }

    @Override
    protected UniformIntProvider getAngerTimeRange() {
        return ANGER_TIME_RANGE;
    }

    @Override
    public ItemStack getBucketItem() {
        return new ItemStack(BLACK_LOOSEJAW_BUCKET);
    }

    @Override
    public ImmutableList<LightState> getLightStates() {
        return CONTAINER;
    }

    @Override
    public EntityAttributeModifier getSpeedModifier() {
        return MOVEMENT_SPEED_BOOST_260;
    }

}
