package github.KingVampyre.DeepTrenches.common.entity.ai.mob;

public enum LightState {
    ALL_LIT,
    ALL_UNLIT,
    FLANK,
    FLANK_AND_LURE,
    FLANK_AND_SUBORBITAL,
    LURE,
    RECOGNITION,
    SUBORBITAL,
    SUBORBITAL_AND_LURE;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }

}
