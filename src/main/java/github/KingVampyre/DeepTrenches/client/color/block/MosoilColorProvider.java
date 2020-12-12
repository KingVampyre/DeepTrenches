package github.KingVampyre.DeepTrenches.client.color.block;

import github.KingVampyre.DeepTrenches.core.init.ColorMaps;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.BlockRenderView;

public class MosoilColorProvider implements BlockColorProvider {

    public static final BlockColorProvider INSTANCE = new MosoilColorProvider();

    @Override
    public int getColor(BlockState state, BlockRenderView world, BlockPos pos, int tintIndex) {

        if (world != null && pos != null) {
            ClientWorld client = MinecraftClient.getInstance().world;

            if(client != null)
                return client.calculateColor(pos, (biome, x, z) -> {
                    double temperature = MathHelper.clamp(biome.getTemperature(), 0.0F, 1.0F);
                    double humidity = MathHelper.clamp(biome.getDownfall(), 0.0F, 1.0F);

                    return ColorMaps.STORCEAN_MOSOIL.getColor(temperature, humidity);
                });
        }

        return ColorMaps.STORCEAN_MOSOIL.getDefaultColor();
    }

}
