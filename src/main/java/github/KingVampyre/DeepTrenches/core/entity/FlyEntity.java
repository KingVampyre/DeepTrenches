package github.KingVampyre.DeepTrenches.core.entity;

import github.KingVampyre.DeepTrenches.common.entity.FlyingBugEntity;
import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

public class FlyEntity extends FlyingBugEntity {

    private static final TrackedData<Integer> FLY_TYPE = DataTracker.registerData(BettaEntity.class, TrackedDataHandlerRegistry.INTEGER);

    public FlyEntity(EntityType<? extends FlyingBugEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected <E extends IAnimatable> PlayState getMovementAnimation(AnimationEvent<E> event) {

        if(this.isEating())
            event.getController().setAnimation(new AnimationBuilder().addAnimation("walking"));

        return super.getMovementAnimation(event);
    }

    public boolean isEating() {
        return false;
    }

    public int getFlyType() {
        return this.dataTracker.get(FLY_TYPE);
    }

    public void setFlyType(int flyType) {
        this.dataTracker.set(FLY_TYPE, flyType);
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();

        this.dataTracker.startTracking(FLY_TYPE, 0);
    }

    @Override
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, EntityData entityData, CompoundTag entityTag) {
        EntityData data = super.initialize(world, difficulty, spawnReason, entityData, entityTag);

        if (entityTag != null && entityTag.contains("FlyType"))
            this.setFlyType(entityTag.getInt("FlyType"));

        else if (entityData instanceof FlyData)
            this.setFlyType(((FlyData)entityData).type);
        else {
            int type = this.random.nextInt(4);
            this.setFlyType(type);

            return new FlyData(type);
        }

        return data;
    }

    @Override
    public void readCustomDataFromTag(CompoundTag tag) {
        super.readCustomDataFromTag(tag);

        this.setFlyType(tag.getInt("FlyType"));
    }

    @Override
    public void writeCustomDataToTag(CompoundTag tag) {
        super.writeCustomDataToTag(tag);

        tag.putInt("FlyType", this.getFlyType());
    }

    public static class FlyData extends PassiveEntity.PassiveData {

        public final int type;

        public FlyData(int type) {
            super(1.0F);

            this.type = type;
        }

    }

}
