package github.KingVampyre.DeepTrenches.core.block;

import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.WorldView;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.ENROTIUM;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.HARSHLES;

public class HarshlesBlock extends AbstractPlantStemBlock {

    protected static final VoxelShape SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D);

    public HarshlesBlock(Settings settings) {
        super(settings, Direction.UP, SHAPE, true, 0.14D);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos down = pos.down();
        BlockState floor = world.getBlockState(down);
        Block block = floor.getBlock();

        return floor.isOf(ENROTIUM) || block == this.getStem() || block == this.getPlant();
    }

    @Override
    protected boolean chooseStemState(BlockState state) {
        return false;
    }

    @Override
    protected int getGrowthLength(Random random) {
        return 1;
    }

    @Override
    protected Block getPlant() {
        return HARSHLES;
    }

}
