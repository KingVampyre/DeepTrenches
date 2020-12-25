package github.KingVampyre.DeepTrenches.core.entity;

import com.google.common.collect.ImmutableList;
import github.KingVampyre.DeepTrenches.common.entity.AbstractLoosejawEntity;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.LightState;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Lovable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.Durations;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.IntRange;
import net.minecraft.world.World;

import static github.KingVampyre.DeepTrenches.core.init.AttributeModifiers.MOVEMENT_SPEED_BOOST_260;
import static github.KingVampyre.DeepTrenches.core.init.EntityTypes.BLACK_LOOSEJAW;
import static github.KingVampyre.DeepTrenches.core.init.LightStates.*;
import static github.KingVampyre.DeepTrenches.core.init.LightStates.SUBORBITAL_AND_LURE;
import static github.KingVampyre.DeepTrenches.core.init.ModItems.BLACK_LOOSEJAW_BUCKET;

public class BlackLoosejawEntity extends AbstractLoosejawEntity {

    private static final IntRange ANGER_TIME_RANGE = Durations.betweenSeconds(25, 30);

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
    protected IntRange getAngerTimeRange() {
        return ANGER_TIME_RANGE;
    }

    @Override
    protected ItemStack getFishBucketItem() {
        return new ItemStack(BLACK_LOOSEJAW_BUCKET);
    }

    @Override
    public ImmutableList<LightState> getLightContainer() {
        return ImmutableList.of(ALL_LIT, ALL_UNLIT, FLANK, FLANK_AND_LURE, FLANK_AND_SUBORBITAL, LURE, SUBORBITAL, SUBORBITAL_AND_LURE);
    }

    @Override
    public EntityAttributeModifier getSpeedModifier() {
        return MOVEMENT_SPEED_BOOST_260;
    }

}
