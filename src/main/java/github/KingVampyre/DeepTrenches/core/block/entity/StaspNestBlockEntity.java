package github.KingVampyre.DeepTrenches.core.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static github.KingVampyre.DeepTrenches.core.init.block.DTBlockEntityTypes.STASP_NEST;

public class StaspNestBlockEntity extends BlockEntity {

    public StaspNestBlockEntity(BlockPos pos, BlockState state) {
        super(STASP_NEST, pos, state);
    }

    public static void serverTick(World world, BlockPos pos, BlockState state, StaspNestBlockEntity blockEntity) {

    }

}
