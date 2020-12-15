package github.KingVampyre.DeepTrenches.common.component.lit;

import dev.onyxstudios.cca.api.v3.component.sync.AutoSyncedComponent;

public interface LitComponent extends AutoSyncedComponent {

    enum State {
        ALL_LIT,
        ALL_UNLIT,
        BODY,
        FLANK,
        FLANK_AND_LURE,
        FLANK_AND_SUBORBITAL,
        LURE,
        RECOGNITION,
        SUBORBITAL,
        SUBORBITAL_AND_LURE;

        public static State getState(String name) {
            return State.valueOf(name.toUpperCase());
        }

        @Override
        public String toString() {
            return this.name().toLowerCase();
        }

    }

    State getState();

    void setState(State state);

}
