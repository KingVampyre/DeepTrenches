package github.KingVampyre.DeepTrenches.core.block.enums;

import net.minecraft.util.StringIdentifiable;

public enum Twisted implements StringIdentifiable {
    BASE,
    FRUSTUM,
    MIDDLE,
    OPAL_ORE_MERGE,
    TIP,
    TIP_MERGE
    ;

    @Override
    public String asString() {
        return this.name().toLowerCase();
    }

    public boolean isMerged() {
        return this == OPAL_ORE_MERGE || this == TIP_MERGE;
    }

}
