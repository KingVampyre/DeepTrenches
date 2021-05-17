package github.KingVampyre.DeepTrenches.client.color.block;

import net.minecraft.block.BlockState;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;

public class FoliageColorProvider implements BlockColorProvider {

    public static final BlockColorProvider INSTANCE = new FoliageColorProvider();

    @Override
    public int getColor(BlockState state, BlockRenderView world, BlockPos pos, int tintIndex) {
        return world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : FoliageColors.getDefaultColor();
    }

}
