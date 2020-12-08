package github.KingVampyre.DeepTrenches.core.block.entity;

import static github.KingVampyre.DeepTrenches.core.init.BlockEntityTypes.STASP_NEST;

import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.Entity;

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
