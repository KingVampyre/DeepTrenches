package github.KingVampyre.DeepTrenches.core.block.entity;

import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import net.minecraft.block.entity.BlockEntity;

import static github.KingVampyre.DeepTrenches.core.init.BlockEntityTypes.STASP_NEST;

public class StaspNestBlockEntity extends BlockEntity {

    public StaspNestBlockEntity() {
        super(STASP_NEST);
    }

    public boolean isFullOfStasps() {
        return false;
    }

    public void tryEnterHive(StaspEntity stasp) {

    }

}
