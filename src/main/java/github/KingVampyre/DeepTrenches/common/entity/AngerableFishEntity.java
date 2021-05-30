package github.KingVampyre.DeepTrenches.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.Angerable;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;

import java.util.UUID;

public abstract class AngerableFishEntity extends NourishFishEntity implements Angerable {

    private static final TrackedData<Integer> ANGER = DataTracker.registerData(AngerableFishEntity.class, TrackedDataHandlerRegistry.INTEGER);

    protected UUID targetUuid;

    public AngerableFishEntity(EntityType<? extends AngerableFishEntity> type, World world) {
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

    protected abstract UniformIntProvider getAngerTimeRange();

    protected boolean isAngerToPlayersPermanent() {
        return false;
    }

    @Override
    public void chooseRandomAngerTime() {
        UniformIntProvider range = this.getAngerTimeRange();

        this.setAngerTime(range.get(this.random));
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();

        this.dataTracker.startTracking(ANGER, 0);
    }

    @Override
    protected void mobTick() {
        super.mobTick();

        if(!this.world.isClient()) {
            ServerWorld server = (ServerWorld) this.world;

            this.tickAngerLogic(server, this.isAngerToPlayersPermanent());
        }

    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);

        this.readAngerFromNbt(this.world, nbt);
    }

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);

        this.writeAngerToNbt(nbt);
    }

}
