package github.KingVampyre.DeepTrenches.common.entity.ai.mob;

import net.minecraft.nbt.CompoundTag;

public interface Lightable {

    LightState getLightState();

    void setLightState(LightState state);

    default void lightableToTag(CompoundTag tag) {
        LightState state = this.getLightState();

        tag.putInt("LightState", state.ordinal());
    }

    default void lightableFromTag(CompoundTag tag) {
        LightState state = LightState.values()[tag.getInt("LightState")];

        this.setLightState(state);
    }

}
