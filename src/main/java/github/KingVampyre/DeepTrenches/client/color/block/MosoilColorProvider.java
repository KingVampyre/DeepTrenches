package github.KingVampyre.DeepTrenches.client.color.block;

import net.minecraft.block.BlockState;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import org.jetbrains.annotations.Nullable;

import static github.KingVampyre.DeepTrenches.client.init.ColorMaps.STORCEAN_MOSOIL;

public class MosoilColorProvider implements BlockColorProvider {

    public static final BlockColorProvider INSTANCE = new MosoilColorProvider();

    @Override
    public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
        return world != null && pos != null ? world.getColor(pos, STORCEAN_MOSOIL) : STORCEAN_MOSOIL.getDefaultColor();
    }

}
