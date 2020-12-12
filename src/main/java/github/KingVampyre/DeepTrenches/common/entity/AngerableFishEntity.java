package github.KingVampyre.DeepTrenches.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.Angerable;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.IntRange;
import net.minecraft.world.World;

import java.util.UUID;

public abstract class AngerableFishEntity extends AnimatedFishEntity implements Angerable {

    private static final TrackedData<Integer> ANGER = DataTracker.registerData(AngerableFishEntity.class, TrackedDataHandlerRegistry.INTEGER);

    protected UUID targetUuid;

    protected AngerableFishEntity(EntityType<? extends AngerableFishEntity> type, World world) {
        super(type, world);
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

    protected abstract IntRange getAngerTimeRange();

    @Override
    public void chooseRandomAngerTime() {
        IntRange range = this.getAngerTimeRange();

        this.setAngerTime(range.choose(this.random));
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();

        this.dataTracker.startTracking(ANGER, 0);
    }

    @Override
    public void readCustomDataFromTag(CompoundTag tag) {
        super.readCustomDataFromTag(tag);

        ServerWorld server = (ServerWorld) this.world;
        this.angerFromTag(server, tag);
    }

    @Override
    public void writeCustomDataToTag(CompoundTag tag) {
        super.writeCustomDataToTag(tag);

        this.angerToTag(tag);
    }

}
