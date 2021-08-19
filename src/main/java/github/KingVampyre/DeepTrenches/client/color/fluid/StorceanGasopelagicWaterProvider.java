package github.KingVampyre.DeepTrenches.client.color.fluid;

import github.Louwind.Reload.client.color.resolver.FluidColorProvider;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import org.jetbrains.annotations.Nullable;

import static github.KingVampyre.DeepTrenches.client.init.DTColorMaps.STORCEAN_GASOPELAGIC_WATER;

public class StorceanGasopelagicWaterProvider implements FluidColorProvider {

    public static final StorceanGasopelagicWaterProvider INSTANCE = new StorceanGasopelagicWaterProvider();

    @Override
    public int getColor(@Nullable BlockRenderView view, @Nullable BlockPos pos, FluidState state) {
        return view != null && pos != null ? view.getColor(pos, STORCEAN_GASOPELAGIC_WATER) : STORCEAN_GASOPELAGIC_WATER.getDefaultColor();
    }

}
