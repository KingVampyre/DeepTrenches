package github.KingVampyre.DeepTrenches.common.entity.ai.mob;

import com.google.common.collect.ImmutableList;
import net.minecraft.nbt.CompoundTag;

public interface Luminous {

    ImmutableList<LightState> getLightContainer();

    default LightState getLightState() {
        ImmutableList<LightState> container = this.getLightContainer();
        int state = this.getLightStateIndex();

        return container.get(state);
    }

    int getLightStateIndex();

    void setLightState(LightState state);

    default void luminousToTag(CompoundTag tag) {
        int index = this.getLightStateIndex();

        tag.putInt("LightState", index);
    }

    default void luminousFromTag(CompoundTag tag) {
        ImmutableList<LightState> container = this.getLightContainer();
        LightState state = container.get(tag.getInt("LightState"));

        this.setLightState(state);
    }

}
