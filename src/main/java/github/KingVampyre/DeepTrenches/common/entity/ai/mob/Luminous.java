package github.KingVampyre.DeepTrenches.common.entity.ai.mob;

import com.google.common.collect.ImmutableList;
import net.minecraft.nbt.NbtCompound;

import static github.KingVampyre.DeepTrenches.core.init.entity.DTLightStates.ALL_UNLIT;

public interface Luminous {

    ImmutableList<LightState> getLightStates();

    LightState getLightState();

    void setLightState(LightState state);

    default int getLightStateIndex() {
        var container = this.getLightStates();
        var state = this.getLightState();

        return container.indexOf(state);
    }

    default boolean isLit() {
        return this.getLightState() != ALL_UNLIT;
    }

    default void luminousToNbt(NbtCompound nbt) {
        var state = this.getLightState();

        nbt.putString("LightState", state.toString());
    }

    default void luminousFromNbt(NbtCompound nbt) {
        var state = LightState.from(nbt.getString("LightState"));

        this.setLightState(state);
    }

}
