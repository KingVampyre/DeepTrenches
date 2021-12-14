package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.common.block.LogMushroomBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.function.Supplier;

import static github.KingVampyre.DeepTrenches.core.init.tag.DTBlockTags.SHELF_MUSHROOM_GROW_BLOCK;

public class ShelfMushroomBlock extends LogMushroomBlock {

    public ShelfMushroomBlock(Settings settings, Supplier<ConfiguredFeature<?, ?>> feature) {
        super(settings, feature);
    }

    @Override
    protected boolean canPlantAt(BlockState state, BlockView world, BlockPos pos) {
        return state.isIn(SHELF_MUSHROOM_GROW_BLOCK);
    }

}
