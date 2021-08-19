package github.KingVampyre.DeepTrenches.core.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

import static github.KingVampyre.DeepTrenches.core.init.DTBlockEntityTypes.STASP_NEST;

public class StaspNestBlockEntity extends BlockEntity {

    public StaspNestBlockEntity(BlockPos pos, BlockState state) {
        super(STASP_NEST, pos, state);
    }

}
