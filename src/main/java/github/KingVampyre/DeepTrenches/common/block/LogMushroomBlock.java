package github.KingVampyre.DeepTrenches.common.block;

import github.KingVampyre.DeepTrenches.common.block.FanPlantBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.Tag;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;
import java.util.function.Supplier;

public abstract class LogMushroomBlock extends FanPlantBlock implements Fertilizable {

    private final Supplier<ConfiguredFeature<?, ?>> feature;

    public LogMushroomBlock(Settings settings, Supplier<ConfiguredFeature<?, ?>> feature) {
        super(settings);

        this.feature = feature;
    }
    
    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return (double) random.nextFloat() < 0.4D;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        var chunkGenerator = world.getChunkManager().getChunkGenerator();

        world.removeBlock(pos, false);
        if (!this.feature.get().generate(world, chunkGenerator, random, pos))
            world.setBlockState(pos, state, Block.NOTIFY_ALL);

    }

}
