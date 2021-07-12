package github.KingVampyre.DeepTrenches.client.color.block;

import net.minecraft.block.BlockState;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;

import static github.KingVampyre.DeepTrenches.client.init.ColorMaps.STORCEAN_FOLIAGE;

public class StorceanFoliageColorProvider implements BlockColorProvider {

    public static final BlockColorProvider INSTANCE = new StorceanFoliageColorProvider();

    @Override
    public int getColor(BlockState state, BlockRenderView world, BlockPos pos, int tintIndex) {
        return world != null && pos != null ? world.getColor(pos, STORCEAN_FOLIAGE) : STORCEAN_FOLIAGE.getDefaultColor();
    }

}
