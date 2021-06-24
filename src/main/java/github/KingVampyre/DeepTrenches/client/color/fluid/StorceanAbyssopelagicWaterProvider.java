package github.KingVampyre.DeepTrenches.client.color.fluid;

import github.Louwind.Reload.client.color.resolver.FluidColorProvider;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import org.jetbrains.annotations.Nullable;

import static github.KingVampyre.DeepTrenches.client.init.ColorMaps.STORCEAN_ABYSSOPELAGIC_WATER;

public class StorceanAbyssopelagicWaterProvider implements FluidColorProvider {

    public static final StorceanAbyssopelagicWaterProvider INSTANCE = new StorceanAbyssopelagicWaterProvider();

    @Override
    public int getColor(@Nullable BlockRenderView view, @Nullable BlockPos pos, FluidState state) {

        if (view != null && pos != null) {
            ClientWorld client = MinecraftClient.getInstance().world;

            if(client != null)
                return client.calculateColor(pos, (biome, x, z) -> {
                    double temperature = biome.getTemperature();
                    double humidity = biome.getDownfall();

                    return STORCEAN_ABYSSOPELAGIC_WATER.getColor(temperature, humidity);
                });

        }

        return STORCEAN_ABYSSOPELAGIC_WATER.getDefaultColor();
    }

}
