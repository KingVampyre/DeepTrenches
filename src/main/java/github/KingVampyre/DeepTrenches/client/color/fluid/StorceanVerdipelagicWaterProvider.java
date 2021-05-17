package github.KingVampyre.DeepTrenches.client.color.fluid;

import github.Louwind.Reload.client.color.resolver.FluidColorProvider;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import org.jetbrains.annotations.Nullable;

import static github.KingVampyre.DeepTrenches.client.init.ColorMaps.STORCEAN_VIRDIPELAGIC_WATER;

public class StorceanVerdipelagicWaterProvider implements FluidColorProvider {

    public static final StorceanVerdipelagicWaterProvider INSTANCE = new StorceanVerdipelagicWaterProvider();

    @Override
    public int getColor(@Nullable BlockRenderView view, @Nullable BlockPos pos, FluidState state) {

        if (view != null && pos != null)
            return view.getColor(pos, (biome, x, z) -> {
                double temperature = biome.getTemperature();
                double humidity = biome.getDownfall();

                return STORCEAN_VIRDIPELAGIC_WATER.getColor(temperature, humidity);
            });

        return STORCEAN_VIRDIPELAGIC_WATER.getDefaultColor();
    }

}
