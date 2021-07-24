package github.KingVampyre.DeepTrenches.client.render;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderPhase;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.function.BiFunction;
import java.util.function.Function;

import static net.minecraft.client.render.VertexFormat.DrawMode.QUADS;
import static net.minecraft.client.render.VertexFormats.POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL;

public class CustomRenderLayer extends RenderLayer {

    protected static final Function<Identifier, RenderLayer> STASP_ANTENNAS = Util.memoize(texture -> {
        var renderPhase = new RenderPhase.Texture(texture, false, false);

        return new RenderLayer.MultiPhase("deep_trenches:stasp_antennas", POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL, QUADS, 256, false, false,
                RenderLayer.MultiPhaseParameters.builder()
                        .cull(DISABLE_CULLING)
                        .overlay(DISABLE_OVERLAY_COLOR)
                        .layering(VIEW_OFFSET_Z_LAYERING)
                        .lightmap(ENABLE_LIGHTMAP)
                        .shader(ENERGY_SWIRL_SHADER)
                        .texture(renderPhase)
                        .transparency(ADDITIVE_TRANSPARENCY)
                        .build(false)
        );
    });

    protected static final BiFunction<Identifier, Boolean, RenderLayer> INVISIBLE = Util.memoize((texture, isInvisible) -> {
        var renderPhase = new RenderPhase.Texture(texture, false, false);

        return new RenderLayer.MultiPhase("deep_trenches:stasp", POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL, QUADS, 256, true, true,
                RenderLayer.MultiPhaseParameters.builder()
                        .cull(DISABLE_CULLING)
                        .lightmap(ENABLE_LIGHTMAP)
                        .overlay(ENABLE_OVERLAY_COLOR)
                        .shader(isInvisible ? ENTITY_TRANSLUCENT_CULL_SHADER : ENTITY_CUTOUT_SHADER)
                        .texture(renderPhase)
                        .transparency(TRANSLUCENT_TRANSPARENCY)
                        .build(true)
        );
    });

    protected static final Function<Identifier, RenderLayer> LOOSEJAW_FINS = Util.memoize(texture -> {
        var renderPhase = new RenderPhase.Texture(texture, false, false);

        return new RenderLayer.MultiPhase("deep_trenches:fins_overlay", POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL, QUADS, 256, false, true,
                RenderLayer.MultiPhaseParameters.builder()
                        .cull(DISABLE_CULLING)
                        .overlay(DISABLE_OVERLAY_COLOR)
                        .shader(ENERGY_SWIRL_SHADER)
                        .texture(renderPhase)
                        .transparency(TRANSLUCENT_TRANSPARENCY)
                        .writeMaskState(ALL_MASK)
                        .build(false)
        );
    });

    protected CustomRenderLayer(String name, VertexFormat vertexFormat, VertexFormat.DrawMode drawMode, int expectedBufferSize, boolean hasCrumbling, boolean translucent, Runnable startAction, Runnable endAction) {
        super(name, vertexFormat, drawMode, expectedBufferSize, hasCrumbling, translucent, startAction, endAction);
    }

    public static RenderLayer getInvisible(Identifier texture, boolean isInvisible) {
        return INVISIBLE.apply(texture, isInvisible);
    }

    public static RenderLayer getLoosejawFins(Identifier texture) {
        return LOOSEJAW_FINS.apply(texture);
    }

    public static RenderLayer getStaspAntennas(Identifier texture) {
        return STASP_ANTENNAS.apply(texture);
    }

}