package github.KingVampyre.DeepTrenches.client.render;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderPhase;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.function.Function;

import static net.minecraft.client.render.VertexFormat.DrawMode.QUADS;
import static net.minecraft.client.render.VertexFormats.POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL;

public class CustomRenderLayer extends RenderLayer {

    protected static final Function<Identifier, RenderLayer> BRIGHT_OVERLAY = Util.memoize(texture -> {
        var renderPhase = new RenderPhase.Texture(texture, false, false);

        return new RenderLayer.MultiPhase("deep_trenches:bright_overlay", POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL, QUADS, 256, false, false,
                RenderLayer.MultiPhaseParameters.builder()
                        .shader(ENERGY_SWIRL_SHADER)
                        .texture(renderPhase)
                        .transparency(TRANSLUCENT_TRANSPARENCY)
                        .lightmap(ENABLE_LIGHTMAP)
                        .overlay(DISABLE_OVERLAY_COLOR)
                        .cull(DISABLE_CULLING)
                        .layering(VIEW_OFFSET_Z_LAYERING)
                        .build(true)
        );
        /*var renderPhase = new RenderPhase.Texture(texture, false, false);

        return new RenderLayer.MultiPhase("deep_trenches:bright_overlay", POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL, QUADS, 256, false, true,
                RenderLayer.MultiPhaseParameters.builder()
                        .shader(EYES_SHADER)
                        .texture(renderPhase)
                        .transparency(ADDITIVE_TRANSPARENCY)
                        .writeMaskState(COLOR_MASK)
                        .build(false));*/
    });

    protected static final Function<Identifier, RenderLayer> LOOSEJAW_FINS = Util.memoize(texture -> {
        var renderPhase = new RenderPhase.Texture(texture, false, false);

        return new RenderLayer.MultiPhase("deep_trenches:fins_overlay", POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL, QUADS, 256, false, true,
                RenderLayer.MultiPhaseParameters.builder()
                        .texture(renderPhase)
                        .transparency(TRANSLUCENT_TRANSPARENCY)
                        .writeMaskState(ALL_MASK)
                        .cull(DISABLE_CULLING)
                        .layering(VIEW_OFFSET_Z_LAYERING)
                        .shader(ENTITY_SMOOTH_CUTOUT_SHADER)
                        .build(false)
        );
    });

    protected CustomRenderLayer(String name, VertexFormat vertexFormat, VertexFormat.DrawMode drawMode, int expectedBufferSize, boolean hasCrumbling, boolean translucent, Runnable startAction, Runnable endAction) {
        super(name, vertexFormat, drawMode, expectedBufferSize, hasCrumbling, translucent, startAction, endAction);
    }

    public static RenderLayer getBrightOverlayTexture(Identifier texture) {
        return BRIGHT_OVERLAY.apply(texture);
    }

    public static RenderLayer getLoosejawFinsLayer(Identifier texture) {
        return LOOSEJAW_FINS.apply(texture);
    }

}
