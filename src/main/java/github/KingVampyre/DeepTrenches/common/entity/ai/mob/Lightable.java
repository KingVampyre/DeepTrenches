package github.KingVampyre.DeepTrenches.common.entity.ai.mob;

import com.google.common.collect.ImmutableList;
import net.minecraft.nbt.CompoundTag;

public interface Lightable {

    ImmutableList<LightState> getLightContainer();

    LightState getLightState();

    int getLightStateIndex();

    void setLightState(LightState state);

    default void lightableToTag(CompoundTag tag) {
        int index = this.getLightStateIndex();

        tag.putInt("LightState", index);
    }

    default void lightableFromTag(CompoundTag tag) {
        ImmutableList<LightState> container = this.getLightContainer();
        LightState state = container.get(tag.getInt("LightState"));

        this.setLightState(state);
    }

}
