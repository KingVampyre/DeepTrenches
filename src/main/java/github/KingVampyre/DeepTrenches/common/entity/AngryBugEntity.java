package github.KingVampyre.DeepTrenches.common.entity;

import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Chargable;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.Angerable;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;

import java.util.UUID;

public abstract class AngryBugEntity extends BugEntity implements Angerable, Chargable {

    private UUID targetUuid;

    private static final TrackedData<Integer> ANGER = DataTracker.registerData(AngryBugEntity.class, TrackedDataHandlerRegistry.INTEGER);
    private static final TrackedData<Boolean> CHARGING = DataTracker.registerData(AngryBugEntity.class, TrackedDataHandlerRegistry.BOOLEAN);

    public AngryBugEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public boolean isCharging() {
        return this.dataTracker.get(CHARGING);
    }

    @Override
    public void setCharging(boolean charging) {
        this.dataTracker.set(CHARGING, charging);
    }

    @Override
    public int getAngerTime() {
        return this.dataTracker.get(ANGER);
    }

    @Override
    public void setAngerTime(int ticks) {
        this.dataTracker.set(ANGER, ticks);
    }

    @Override
    public UUID getAngryAt() {
        return this.targetUuid;
    }

    @Override
    public void setAngryAt(UUID uuid) {
        this.targetUuid = uuid;
    }

    @Override
    public void chooseRandomAngerTime() {
        this.setAngerTime(0);
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();

        this.dataTracker.startTracking(ANGER, 0);
        this.dataTracker.startTracking(CHARGING, false);
    }

    @Override
    public void readCustomDataFromTag(CompoundTag tag) {
        super.readCustomDataFromTag(tag);

        this.angerFromTag((ServerWorld) this.world, tag);
    }

    @Override
    public void writeCustomDataToTag(CompoundTag tag) {
        super.writeCustomDataToTag(tag);

        this.angerToTag(tag);
    }

}