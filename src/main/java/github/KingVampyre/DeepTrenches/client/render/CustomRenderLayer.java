package github.KingVampyre.DeepTrenches.client.render;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderPhase;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.util.Identifier;

public class CustomRenderLayer extends RenderLayer {

    public CustomRenderLayer(String name, VertexFormat vertexFormat, VertexFormat.DrawMode drawMode, int expectedBufferSize, boolean hasCrumbling, boolean translucent, Runnable startAction, Runnable endAction) {
        super(name, vertexFormat, drawMode, expectedBufferSize, hasCrumbling, translucent, startAction, endAction);
    }

    public static RenderLayer getBrightOverlayTexture(String texture) {
        Identifier identifier = Identifier.tryParse(texture);

        if(identifier != null) {
            RenderPhase.Texture renderPhase = new RenderPhase.Texture(identifier, false, false);

            return new RenderLayer.MultiPhase("deep_trenches:bright_overlay", VertexFormats.POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL, VertexFormat.DrawMode.QUADS, 256, false, true,
                    RenderLayer.MultiPhaseParameters.builder().texture(renderPhase)
                            .transparency(ADDITIVE_TRANSPARENCY)
                            .writeMaskState(COLOR_MASK)
                            .build(false));
        }

        return null;
    }

    public static RenderLayer getFinsLayer(String texture) {
        Identifier identifier = Identifier.tryParse(texture);

        if(identifier != null) {
            RenderPhase.Texture renderPhase = new RenderPhase.Texture(identifier, false, false);

            return new RenderLayer.MultiPhase("deep_trenches:fins_overlay", VertexFormats.POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL, VertexFormat.DrawMode.QUADS, 256, false, true,
                    RenderLayer.MultiPhaseParameters.builder().texture(renderPhase)
                            .transparency(TRANSLUCENT_TRANSPARENCY)
                            .writeMaskState(ALL_MASK)
                            .cull(DISABLE_CULLING)
                            .layering(VIEW_OFFSET_Z_LAYERING)
                            .shader(ENTITY_SMOOTH_CUTOUT_SHADER)
                            .build(true));
        }

        return null;
    }

}
