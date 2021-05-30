package github.KingVampyre.DeepTrenches.common.entity.ai.mob;

import com.google.common.collect.ImmutableList;
import net.minecraft.nbt.NbtCompound;

public interface Luminous {

    ImmutableList<LightState> getLightContainer();

    default LightState getLightState() {
        ImmutableList<LightState> container = this.getLightContainer();
        int state = this.getLightStateIndex();

        return container.get(state);
    }

    int getLightStateIndex();

    void setLightState(LightState state);

    default void luminousToNbt(NbtCompound nbt) {
        int index = this.getLightStateIndex();

        nbt.putInt("LightState", index);
    }

    default void luminousFromNbt(NbtCompound nbt) {
        ImmutableList<LightState> container = this.getLightContainer();
        LightState state = container.get(nbt.getInt("LightState"));

        this.setLightState(state);
    }

}
