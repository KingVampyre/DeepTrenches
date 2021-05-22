package github.KingVampyre.DeepTrenches.core.entity;

import com.google.common.collect.ImmutableList;
import github.KingVampyre.DeepTrenches.common.entity.AbstractBettaEntity;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Lovable;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Variant;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.brain.Brain;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;

import static github.KingVampyre.DeepTrenches.core.init.AttributeModifiers.MOVEMENT_SPEED_BOOST_235;
import static github.KingVampyre.DeepTrenches.core.init.MemoryModuleTypes.*;
import static github.KingVampyre.DeepTrenches.core.init.ModItems.BETTA_BUCKET;
import static github.KingVampyre.DeepTrenches.core.init.SensorTypes.COD_TEMPTING;
import static github.KingVampyre.DeepTrenches.core.init.SensorTypes.SKITTISH_HURT_BY;
import static net.minecraft.entity.ai.brain.MemoryModuleType.*;
import static net.minecraft.entity.ai.brain.sensor.SensorType.NEAREST_LIVING_ENTITIES;

public class BettaEntity extends AbstractBettaEntity implements Variant {

    private static final TrackedData<Integer> BETTA_TYPE = DataTracker.registerData(BettaEntity.class, TrackedDataHandlerRegistry.INTEGER);

    public BettaEntity(EntityType<? extends BettaEntity> type, World world) {
        super(type, world);
    }

    @Override
    public int getVariant() {
        return this.dataTracker.get(BETTA_TYPE);
    }

    @Override
    public void setVariant(int bettaType) {
        this.dataTracker.set(BETTA_TYPE, bettaType);
    }

    @Override
    protected void copyDataToStack(ItemStack stack) {
        super.copyDataToStack(stack);

        stack.getOrCreateTag().putInt("Variant", this.getVariant());
    }

    @Override
    protected Brain.Profile<?> createBrainProfile() {
        return Brain.createProfile(
                ImmutableList.of(BREEDING_AGE, FORCED_AGE, HAPPY_TICKS_REMAINING, LOVE_TICKS, LOVING_PLAYER, OWNER, SITTING, TAMED, BREEDING_TARGET, CANT_REACH_WALK_TARGET_SINCE, HURT_BY, HURT_BY_ENTITY, LOOK_TARGET, PATH, TEMPTATION_COOLDOWN_TICKS, TEMPTING_PLAYER, TEMPTED, VISIBLE_MOBS, WALK_TARGET),
                ImmutableList.of(COD_TEMPTING, NEAREST_LIVING_ENTITIES, SKITTISH_HURT_BY));
    }

    @Override
    public Entity createChild(ServerWorld world, Lovable lovable) {
        BettaEntity betta = (BettaEntity) super.createChild(world, lovable);

        if(betta != null)
            betta.setVariant(this.random.nextInt(7));

        return betta;
    }

    @Override
    protected ItemStack getFishBucketItem() {
        return new ItemStack(BETTA_BUCKET);
    }

    @Override
    public EntityAttributeModifier getSpeedModifier() {
        return MOVEMENT_SPEED_BOOST_235;
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();

        this.dataTracker.startTracking(BETTA_TYPE, 0);
    }

    @Override
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, EntityData entityData, CompoundTag entityTag) {
        this.setVariant(this.random.nextInt(7));

        return super.initialize(world, difficulty, spawnReason, entityData != null ? entityData : new PassiveEntity.PassiveData(false), entityTag);
    }

    @Override
    public void readCustomDataFromTag(CompoundTag tag) {
        super.readCustomDataFromTag(tag);

        this.variantFromTag(tag);
    }

    @Override
    public void writeCustomDataToTag(CompoundTag tag) {
        super.writeCustomDataToTag(tag);

        this.variantToTag(tag);
    }

}
