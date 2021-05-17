package github.KingVampyre.DeepTrenches.client.color.fluid;

import github.Louwind.Reload.client.color.resolver.FluidColorProvider;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import org.jetbrains.annotations.Nullable;

public class BrineProvider implements FluidColorProvider {

    public static final BrineProvider INSTANCE = new BrineProvider();

    @Override
    public int getColor(@Nullable BlockRenderView view, @Nullable BlockPos pos, FluidState fluidState) {
        return 5211795;
    }

}
