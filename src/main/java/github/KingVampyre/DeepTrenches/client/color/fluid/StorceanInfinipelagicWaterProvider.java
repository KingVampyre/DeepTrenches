package github.KingVampyre.DeepTrenches.client.color.fluid;

import github.Louwind.Reload.client.color.resolver.FluidColorProvider;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import org.jetbrains.annotations.Nullable;

import static github.KingVampyre.DeepTrenches.client.init.ColorMaps.STORCEAN_INFINIPELAGIC_WATER;

public class StorceanInfinipelagicWaterProvider implements FluidColorProvider {

    public static final StorceanInfinipelagicWaterProvider INSTANCE = new StorceanInfinipelagicWaterProvider();

    @Override
    public int getColor(@Nullable BlockRenderView view, @Nullable BlockPos pos, FluidState state) {
        return view != null && pos != null ? view.getColor(pos, STORCEAN_INFINIPELAGIC_WATER) : STORCEAN_INFINIPELAGIC_WATER.getDefaultColor();
    }

}
