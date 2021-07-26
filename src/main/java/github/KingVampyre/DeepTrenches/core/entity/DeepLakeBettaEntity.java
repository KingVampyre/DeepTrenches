package github.KingVampyre.DeepTrenches.core.entity;

import com.google.common.collect.ImmutableList;
import github.KingVampyre.DeepTrenches.common.entity.AbstractBettaEntity;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.LightState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.brain.Brain;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.ai.brain.sensor.Sensor;
import net.minecraft.entity.ai.brain.sensor.SensorType;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import static github.KingVampyre.DeepTrenches.core.init.AttributeModifiers.MOVEMENT_SPEED_BOOST_250;
import static github.KingVampyre.DeepTrenches.core.init.LightStates.*;
import static github.KingVampyre.DeepTrenches.core.init.MemoryModuleTypes.*;
import static github.KingVampyre.DeepTrenches.core.init.ModItems.DEEP_LAKE_BETTA_BUCKET;
import static github.KingVampyre.DeepTrenches.core.init.SensorTypes.*;
import static net.minecraft.entity.ai.brain.MemoryModuleType.*;
import static net.minecraft.entity.ai.brain.sensor.SensorType.NEAREST_LIVING_ENTITIES;

public class DeepLakeBettaEntity extends AbstractBettaEntity {

    private static final ImmutableList<? extends MemoryModuleType<?>> MEMORY_MODULES = ImmutableList.of(OWNER, SITTING, TAMED, LOVE_TICKS, LOVING_PLAYER, BREEDING_AGE, FORCED_AGE, HAPPY_TICKS_REMAINING, HURT_BY, HURT_BY_ENTITY, TEMPTATION_COOLDOWN_TICKS, TEMPTING_PLAYER, IS_TEMPTED, BREEDING_TARGET, CANT_REACH_WALK_TARGET_SINCE, LOOK_TARGET, PATH, VISIBLE_MOBS, WALK_TARGET);
    private static final ImmutableList<SensorType<? extends Sensor<? super BettaEntity>>> SENSORS = ImmutableList.of(COD_TEMPTING, NEAREST_LIVING_ENTITIES, SKITTISH_HURT_BY);

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

    @Override
    protected Brain.Profile<?> createBrainProfile() {
        return Brain.createProfile(MEMORY_MODULES, SENSORS);
    }

}
