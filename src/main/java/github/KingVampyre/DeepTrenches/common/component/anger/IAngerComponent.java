package github.KingVampyre.DeepTrenches.common.component.anger;

import dev.onyxstudios.cca.api.v3.component.AutoSyncedComponent;

public interface IAngerComponent extends AutoSyncedComponent {

    int getAnger();

    boolean isAngry();

    void setAnger(int anger);

}
