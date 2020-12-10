package github.KingVampyre.DeepTrenches.client.init;

import github.KingVampyre.DeepTrenches.client.mixin.AccessorRenderPhase;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderPhase;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.util.Identifier;

public class RenderLayers {

    public static RenderLayer getBrightTexture(Identifier texture) {
        RenderPhase.Texture renderPhase = new RenderPhase.Texture(texture, false, false);

        return RenderLayer.of("bright", VertexFormats.POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL, 7, 256, false, true,
                RenderLayer.MultiPhaseParameters.builder().texture(renderPhase)
                        .transparency(AccessorRenderPhase.additiveTransparency())
                        .alpha(AccessorRenderPhase.oneTenthAlpha())
                        .writeMaskState(AccessorRenderPhase.colorMask())
                        .fog(AccessorRenderPhase.blackFog())
                        .build(false));
    }

}
