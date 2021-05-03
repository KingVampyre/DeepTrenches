package github.KingVampyre.DeepTrenches.client.render.fluid;

import github.KingVampyre.DeepTrenches.client.texture.SpriteLoader;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import net.minecraft.client.texture.Sprite;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import org.jetbrains.annotations.Nullable;

public class ColoredSpriteRenderHandler implements FluidRenderHandler {

    protected final SpriteLoader spriteLoader;

    public ColoredSpriteRenderHandler(SpriteLoader spriteLoader) {
        this.spriteLoader = spriteLoader;
    }

    @Override
    public int getFluidColor(@Nullable BlockRenderView view, @Nullable BlockPos pos, FluidState state) {
        return -1;
    }

    @Override
    public Sprite[] getFluidSprites(@Nullable BlockRenderView blockRenderView, @Nullable BlockPos blockPos, FluidState fluidState) {
        return this.spriteLoader.geSprites();
    }

}
