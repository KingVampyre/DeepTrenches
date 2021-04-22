package github.KingVampyre.DeepTrenches.core.block.enums;

import net.minecraft.util.StringIdentifiable;

public enum BlockThird implements StringIdentifiable {
    BOTTOM,
    MIDDLE,
    TOP;

    public String toString() {
        return this.name().toLowerCase();
    }

    public String asString() {
        return this.toString();
    }

}
