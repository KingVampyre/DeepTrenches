package github.KingVampyre.DeepTrenches.client.color.fluid;

import github.Louwind.Reload.client.color.resolver.FluidColorProvider;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import org.jetbrains.annotations.Nullable;

import static github.KingVampyre.DeepTrenches.client.init.DTColorMaps.STORCEAN_HADOPELAGIC_WATER;

public class StorceanHadopelagicWaterProvider implements FluidColorProvider {

    public static final StorceanHadopelagicWaterProvider INSTANCE = new StorceanHadopelagicWaterProvider();

    @Override
    public int getColor(@Nullable BlockRenderView view, @Nullable BlockPos pos, FluidState state) {
        return view != null && pos != null ? view.getColor(pos, STORCEAN_HADOPELAGIC_WATER) : STORCEAN_HADOPELAGIC_WATER.getDefaultColor();
    }

}
