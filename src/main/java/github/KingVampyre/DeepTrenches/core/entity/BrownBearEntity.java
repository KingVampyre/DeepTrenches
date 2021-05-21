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

public class BrownBearEntity extends PathAwareEntity implements IAnimatable {

    private static final TrackedData<Integer> BROWN_BEAR_TYPE = DataTracker.registerData(BettaEntity.class, TrackedDataHandlerRegistry.INTEGER);

    public BrownBearEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    public int getBrownBearType() {
        return this.dataTracker.get(BROWN_BEAR_TYPE);
    }

    public void setBrownBearType(int brownBearType) {
        this.dataTracker.set(BROWN_BEAR_TYPE, brownBearType);
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

        this.dataTracker.startTracking(BROWN_BEAR_TYPE, 0);
    }

    @Override
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, EntityData entityData, CompoundTag entityTag) {
        EntityData data = super.initialize(world, difficulty, spawnReason, entityData, entityTag);

        if (entityTag != null && entityTag.contains("BrownBearType"))
            this.setBrownBearType(entityTag.getInt("BrownBearType"));

        else if (entityData instanceof BrownBearData)
            this.setBrownBearType(((BrownBearData)entityData).type);
        else {
            int type = this.random.nextInt(3);
            this.setBrownBearType(type);

            return new BrownBearData(type);
        }

        return data;
    }

    @Override
    public void readCustomDataFromTag(CompoundTag tag) {
        super.readCustomDataFromTag(tag);

        this.setBrownBearType(tag.getInt("BrownBearType"));
    }

    @Override
    public void writeCustomDataToTag(CompoundTag tag) {
        super.writeCustomDataToTag(tag);

        tag.putInt("BrownBearType", this.getBrownBearType());
    }

    public static class BrownBearData extends PassiveEntity.PassiveData {

        public final int type;

        public BrownBearData(int type) {
            super(1.0F);

            this.type = type;
        }

    }

}
