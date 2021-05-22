package github.KingVampyre.DeepTrenches.core.entity;

import github.KingVampyre.DeepTrenches.common.entity.LuminousFishEntity;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Variant;
import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;

public class ViperfishEntity extends LuminousFishEntity implements Variant {

    private static final TrackedData<Integer> VARIANT = DataTracker.registerData(ViperfishEntity.class, TrackedDataHandlerRegistry.INTEGER);

    public ViperfishEntity(EntityType<? extends LuminousFishEntity> type, World world) {
        super(type, world);
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();

        this.dataTracker.startTracking(VARIANT, 0);
    }

    @Override
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, EntityData entityData, CompoundTag entityTag) {
        this.setVariant(this.random.nextInt(2));

        return super.initialize(world, difficulty, spawnReason, entityData, entityTag);
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

    @Override
    protected ItemStack getFishBucketItem() {
        return null;
    }

    @Override
    protected SoundEvent getFlopSound() {
        return null;
    }

    @Override
    public EntityAttributeModifier getSpeedModifier() {
        return null;
    }

    @Override
    public int getVariant() {
        return this.dataTracker.get(VARIANT);
    }

    @Override
    public void setVariant(int variant) {
        this.dataTracker.set(VARIANT, variant);
    }

}
