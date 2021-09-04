package github.KingVampyre.DeepTrenches.client.color.fluid;

import github.Louwind.Reload.client.color.resolver.FluidColorProvider;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import org.jetbrains.annotations.Nullable;

public class OverworldWaterProvider implements FluidColorProvider {

    public static final OverworldWaterProvider INSTANCE = new OverworldWaterProvider();

    @Override
    public int getColor(@Nullable BlockRenderView view, @Nullable BlockPos pos, FluidState fluidState) {
        return view != null && pos != null ? BiomeColors.getWaterColor(view, pos) : -1;
    }

}
