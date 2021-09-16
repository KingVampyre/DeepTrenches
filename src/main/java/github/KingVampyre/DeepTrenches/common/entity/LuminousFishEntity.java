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

import static github.KingVampyre.DeepTrenches.core.init.DTLightStates.ALL_UNLIT;

@Deprecated
public abstract class LuminousFishEntity extends SkittishFishEntity implements Luminous {

    private static final TrackedData<String> LIGHT_STATE = DataTracker.registerData(LuminousFishEntity.class, TrackedDataHandlerRegistry.STRING);

    public LuminousFishEntity(EntityType<? extends AnimatedFishEntity> type, World world) {
        super(type, world);
    }

    @Override
    public ImmutableList<LightState> getLightStates() {
        return ImmutableList.of();
    }

    @Override
    public LightState getLightState() {
        return LightState.from(this.dataTracker.get(LIGHT_STATE));
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();

        this.dataTracker.startTracking(LIGHT_STATE, ALL_UNLIT.toString());
    }

    @Override
    public void setLightState(LightState state) {
        this.dataTracker.set(LIGHT_STATE, state.toString());
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);

        this.luminousFromNbt(nbt);
    }

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);

        this.luminousToNbt(nbt);
    }

}