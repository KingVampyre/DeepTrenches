package github.KingVampyre.DeepTrenches.client.color.block;

import github.KingVampyre.DeepTrenches.client.init.ColorMaps;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;

public class StorceanFoliageColorProvider implements BlockColorProvider {

    public static final BlockColorProvider INSTANCE = new StorceanFoliageColorProvider();

    @Override
    public int getColor(BlockState state, BlockRenderView world, BlockPos pos, int tintIndex) {

        if (world != null && pos != null) {
            ClientWorld client = MinecraftClient.getInstance().world;

            if(client != null)
                return client.calculateColor(pos, (biome, d, e) -> {
                    double temperature = biome.getTemperature();
                    double humidity = biome.getDownfall();

                    return ColorMaps.STORCEAN_FOLIAGE.getColor(temperature, humidity);
                });
        }

        return ColorMaps.STORCEAN_FOLIAGE.getDefaultColor();
    }
}
