package github.KingVampyre.DeepTrenches.common.entity.ai.mob;

import net.minecraft.nbt.CompoundTag;

public interface Variant {

    int getVariant();

    void setVariant(int variant);

    default void variantToTag(CompoundTag tag) {
        tag.putInt("Variant", this.getVariant());
    }

    default void variantFromTag(CompoundTag tag) {
        this.setVariant(tag.getInt("Variant"));
    }

}
