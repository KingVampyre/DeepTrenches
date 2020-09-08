package github.KingVampyre.DeepTrenches.common.component.pollen;

import dev.onyxstudios.cca.api.v3.component.AutoSyncedComponent;

public interface IPollenComponent extends AutoSyncedComponent {

    int getMaxPollen();

    int getPollen();

    boolean hasPollen();

    boolean hasPollenCapacity();

    void setPollen(int pollen);

}
