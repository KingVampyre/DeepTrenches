package github.KingVampyre.DeepTrenches.client.render;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderPhase;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.util.Identifier;

public class CustomRenderLayer extends RenderLayer {

    protected static final RenderPhase.Alpha ONE_SEVENTH_ALPHA = new RenderPhase.Alpha(0.1F);

    public CustomRenderLayer(String name, VertexFormat vertexFormat, int drawMode, int expectedBufferSize, boolean hasCrumbling, boolean translucent, Runnable startAction, Runnable endAction) {
        super(name, vertexFormat, drawMode, expectedBufferSize, hasCrumbling, translucent, startAction, endAction);
    }

    public static RenderLayer getBrightOverlayTexture(String texture) {
        Identifier identifier = Identifier.tryParse(texture);

        if(identifier != null) {
            RenderPhase.Texture renderPhase = new RenderPhase.Texture(identifier, false, false);

            return RenderLayer.of("deep_trenches:bright_overlay", VertexFormats.POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL, 7, 256, false, true,
                    RenderLayer.MultiPhaseParameters.builder().texture(renderPhase)
                            .transparency(ADDITIVE_TRANSPARENCY)
                            .alpha(ONE_TENTH_ALPHA)
                            .writeMaskState(COLOR_MASK)
                            .fog(BLACK_FOG)
                            .build(false));
        }

        return null;
    }

    public static RenderLayer getFinsLayer(Identifier texture) {
        RenderPhase.Texture renderPhase = new RenderPhase.Texture(texture, false, false);

        return RenderLayer.of("deep_trenches:fins_overlay", VertexFormats.POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL, 7, 256, false, true,
                RenderLayer.MultiPhaseParameters.builder().texture(renderPhase)
                        .transparency(TRANSLUCENT_TRANSPARENCY)
                        .alpha(ONE_SEVENTH_ALPHA)
                        .writeMaskState(ALL_MASK)
                        .cull(DISABLE_CULLING)
                        .layering(VIEW_OFFSET_Z_LAYERING)
                        .shadeModel(SMOOTH_SHADE_MODEL)
                        .build(true));
    }

}
