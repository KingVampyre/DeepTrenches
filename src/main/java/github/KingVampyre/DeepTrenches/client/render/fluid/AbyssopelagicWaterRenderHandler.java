package github.KingVampyre.DeepTrenches.client.render.fluid;

import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import net.minecraft.client.texture.Sprite;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import org.jetbrains.annotations.Nullable;

import static github.KingVampyre.DeepTrenches.client.init.Sprites.ABYSSOPELAGIC_WATER;

public class AbyssopelagicWaterRenderHandler implements FluidRenderHandler {

    @Override
    public int getFluidColor(@Nullable BlockRenderView view, @Nullable BlockPos pos, FluidState state) {
        return -1;
    }

    @Override
    public Sprite[] getFluidSprites(@Nullable BlockRenderView blockRenderView, @Nullable BlockPos blockPos, FluidState fluidState) {
        return ABYSSOPELAGIC_WATER.geSprites();
    }

}
