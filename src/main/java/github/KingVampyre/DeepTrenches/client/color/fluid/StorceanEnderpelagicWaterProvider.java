package github.KingVampyre.DeepTrenches.client.color.fluid;

import github.Louwind.Reload.client.color.resolver.FluidColorProvider;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import org.jetbrains.annotations.Nullable;

import static github.KingVampyre.DeepTrenches.client.init.ColorMaps.STORCEAN_ENDERPELAGIC_WATER;

public class StorceanEnderpelagicWaterProvider implements FluidColorProvider {

    public static final StorceanEnderpelagicWaterProvider INSTANCE = new StorceanEnderpelagicWaterProvider();

    @Override
    public int getColor(@Nullable BlockRenderView view, @Nullable BlockPos pos, FluidState state) {

        if (view != null && pos != null)
            return view.getColor(pos, (biome, x, z) -> {
                double temperature = biome.getTemperature();
                double humidity = biome.getDownfall();

                return STORCEAN_ENDERPELAGIC_WATER.getColor(temperature, humidity);
            });

        return STORCEAN_ENDERPELAGIC_WATER.getDefaultColor();
    }

}