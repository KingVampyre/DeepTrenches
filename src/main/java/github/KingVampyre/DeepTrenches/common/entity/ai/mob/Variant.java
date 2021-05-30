package github.KingVampyre.DeepTrenches.common.entity.ai.mob;

import net.minecraft.nbt.NbtCompound;

public interface Variant {

    int getVariant();

    void setVariant(int variant);

    default void variantToNbt(NbtCompound tag) {
        tag.putInt("Variant", this.getVariant());
    }

    default void variantFromNbt(NbtCompound tag) {
        this.setVariant(tag.getInt("Variant"));
    }

}
