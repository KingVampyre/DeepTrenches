package github.KingVampyre.DeepTrenches.core.entity;

import github.KingVampyre.DeepTrenches.common.entity.LuminousFishEntity;
import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class ViperfishEntity extends LuminousFishEntity {

    private static final TrackedData<Integer> VIPERFISH_TYPE = DataTracker.registerData(BettaEntity.class, TrackedDataHandlerRegistry.INTEGER);

    public ViperfishEntity(EntityType<? extends LuminousFishEntity> type, World world) {
        super(type, world);
    }

    public int getViperfishType() {
        return this.dataTracker.get(VIPERFISH_TYPE);
    }

    public void setViperfishType(int viperfishType) {
        this.dataTracker.set(VIPERFISH_TYPE, viperfishType);
    }

    @Override
    public AnimationFactory getFactory() {
        return null;
    }

    @Override
    public void registerControllers(AnimationData data) {

    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();

        this.dataTracker.startTracking(VIPERFISH_TYPE, 0);
    }

    @Override
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, EntityData entityData, CompoundTag entityTag) {
        EntityData data = super.initialize(world, difficulty, spawnReason, entityData, entityTag);

        if (entityTag != null && entityTag.contains("ViperfishType"))
            this.setViperfishType(entityTag.getInt("ViperfishType"));

        else if (entityData instanceof ViperfishData)
            this.setViperfishType(((ViperfishData)entityData).type);
        else {
            int type = this.random.nextInt(2);
            this.setViperfishType(type);

            return new ViperfishData(type);
        }

        return data;
    }

    @Override
    public void readCustomDataFromTag(CompoundTag tag) {
        super.readCustomDataFromTag(tag);

        this.setViperfishType(tag.getInt("ViperfishType"));
    }

    @Override
    public void writeCustomDataToTag(CompoundTag tag) {
        super.writeCustomDataToTag(tag);

        tag.putInt("ViperfishType", this.getViperfishType());
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

    public static class ViperfishData extends PassiveEntity.PassiveData {

        public final int type;

        public ViperfishData(int type) {
            super(1.0F);

            this.type = type;
        }

    }

}
