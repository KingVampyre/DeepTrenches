package github.KingVampyre.DeepTrenches.client.color.fluid;

import github.Louwind.Reload.client.color.resolver.FluidColorProvider;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import org.jetbrains.annotations.Nullable;

import static github.KingVampyre.DeepTrenches.client.init.ColorMaps.CLEAR_WATER;

public class ClearWaterProvider implements FluidColorProvider {

    public static final ClearWaterProvider INSTANCE = new ClearWaterProvider();

    @Override
    public int getColor(@Nullable BlockRenderView view, @Nullable BlockPos pos, FluidState state) {

/*
        if (view != null && pos != null) {
            ClientWorld client = MinecraftClient.getInstance().world;

            // TODO CHECK STORCEAN
            if(client != null)
                return client.calculateColor(pos, (biome, x, z) -> {
                    double temperature = biome.getTemperature();
                    double humidity = biome.getDownfall();

                    return CLEAR_WATER.getColor(temperature, humidity);
                });

        }
*/

        return CLEAR_WATER.getDefaultColor();
    }

}
