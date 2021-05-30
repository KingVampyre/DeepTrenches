package github.KingVampyre.DeepTrenches.core.entity;

import com.google.common.collect.ImmutableList;
import github.KingVampyre.DeepTrenches.common.entity.AbstractBettaEntity;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.LightState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.brain.Brain;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import static github.KingVampyre.DeepTrenches.core.init.AttributeModifiers.MOVEMENT_SPEED_BOOST_250;
import static github.KingVampyre.DeepTrenches.core.init.LightStates.*;
import static github.KingVampyre.DeepTrenches.core.init.MemoryModuleTypes.*;
import static github.KingVampyre.DeepTrenches.core.init.ModItems.DEEP_LAKE_BETTA_BUCKET;
import static github.KingVampyre.DeepTrenches.core.init.SensorTypes.COD_TEMPTING;
import static github.KingVampyre.DeepTrenches.core.init.SensorTypes.SKITTISH_HURT_BY;
import static net.minecraft.entity.ai.brain.MemoryModuleType.*;
import static net.minecraft.entity.ai.brain.sensor.SensorType.NEAREST_LIVING_ENTITIES;

public class DeepLakeBettaEntity extends AbstractBettaEntity {

    public DeepLakeBettaEntity(EntityType<? extends DeepLakeBettaEntity> type, World world) {
        super(type, world);
    }

    @Override
    public ImmutableList<LightState> getLightContainer() {
        return ImmutableList.of(ALL_LIT, ALL_UNLIT, BODY, LURE);
    }

    @Override
    public EntityAttributeModifier getSpeedModifier() {
        return MOVEMENT_SPEED_BOOST_250;
    }

    @Override
    public ItemStack getBucketItem() {
        return new ItemStack(DEEP_LAKE_BETTA_BUCKET);
    }

    @Override
    protected Brain.Profile<?> createBrainProfile() {
        return Brain.createProfile(
                ImmutableList.of(OWNER, SITTING, TAMED, LOVE_TICKS, LOVING_PLAYER, BREEDING_AGE, FORCED_AGE, HAPPY_TICKS_REMAINING, HURT_BY, HURT_BY_ENTITY, TEMPTATION_COOLDOWN_TICKS, TEMPTING_PLAYER, IS_TEMPTED, BREEDING_TARGET, CANT_REACH_WALK_TARGET_SINCE, LOOK_TARGET, PATH, VISIBLE_MOBS, WALK_TARGET),
                ImmutableList.of(COD_TEMPTING, NEAREST_LIVING_ENTITIES, SKITTISH_HURT_BY));
    }

}
