package github.KingVampyre.DeepTrenches.common.entity;

import com.google.common.collect.ImmutableList;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.LightState;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Luminous;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.world.World;

public abstract class LuminousFishEntity extends SkittishFishEntity implements Luminous {

    private static final TrackedData<Integer> LIGHT_STATE = DataTracker.registerData(LuminousFishEntity.class, TrackedDataHandlerRegistry.INTEGER);

    public LuminousFishEntity(EntityType<? extends AnimatedFishEntity> type, World world) {
        super(type, world);
    }

    @Override
    public ImmutableList<LightState> getLightContainer() {
        return ImmutableList.of();
    }

    @Override
    public int getLightStateIndex() {
        return this.dataTracker.get(LIGHT_STATE);
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();

        this.dataTracker.startTracking(LIGHT_STATE, 0);
    }

    @Override
    public void setLightState(LightState state) {
        ImmutableList<LightState> container = this.getLightContainer();
        int index = container.indexOf(state);

        this.dataTracker.set(LIGHT_STATE, index);
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);

        this.luminousToNbt(nbt);
    }

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);

        this.luminousFromNbt(nbt);
    }

}