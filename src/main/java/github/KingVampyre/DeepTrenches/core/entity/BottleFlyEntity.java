package github.KingVampyre.DeepTrenches.core.entity;

import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class BottleFlyEntity extends PathAwareEntity implements IAnimatable {

    private static final TrackedData<Integer> BOTTLE_FLY_TYPE = DataTracker.registerData(BettaEntity.class, TrackedDataHandlerRegistry.INTEGER);

    public BottleFlyEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    public int getBottleFlyType() {
        return this.dataTracker.get(BOTTLE_FLY_TYPE);
    }

    public void setBottleFlyType(int bottleFlyType) {
        this.dataTracker.set(BOTTLE_FLY_TYPE, bottleFlyType);
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

        this.dataTracker.startTracking(BOTTLE_FLY_TYPE, 0);
    }

    @Override
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, EntityData entityData, CompoundTag entityTag) {
        EntityData data = super.initialize(world, difficulty, spawnReason, entityData, entityTag);

        if (entityTag != null && entityTag.contains("BottleFlyType"))
            this.setBottleFlyType(entityTag.getInt("BottleFlyType"));

        else if (entityData instanceof BottleFlyData)
            this.setBottleFlyType(((BottleFlyData)entityData).type);
        else {
            int type = this.random.nextInt(9);
            this.setBottleFlyType(type);

            return new BottleFlyData(type);
        }

        return data;
    }

    @Override
    public void readCustomDataFromTag(CompoundTag tag) {
        super.readCustomDataFromTag(tag);

        this.setBottleFlyType(tag.getInt("BottleFlyType"));
    }

    @Override
    public void writeCustomDataToTag(CompoundTag tag) {
        super.writeCustomDataToTag(tag);

        tag.putInt("BottleFlyType", this.getBottleFlyType());
    }

    public static class BottleFlyData extends PassiveEntity.PassiveData {

        public final int type;

        public BottleFlyData(int type) {
            super(1.0F);

            this.type = type;
        }

    }

}
