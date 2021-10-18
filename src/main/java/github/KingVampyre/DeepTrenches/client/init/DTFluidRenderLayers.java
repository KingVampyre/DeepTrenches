package github.KingVampyre.DeepTrenches.client.init;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

import static github.KingVampyre.DeepTrenches.core.init.DTFluids.*;

public class DTFluidRenderLayers {

    public static void initialize() {
        BlockRenderLayerMap.INSTANCE.putFluid(ABYSSOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_ABYSSOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(ACID, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_ACID, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(BATHYPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_BATHYPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(BRINE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_BRINE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(CLEAR_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_CLEAR_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(HADOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_HADOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(MESOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_MESOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(STORCEAN_ABYSSOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_STORCEAN_ABYSSOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(STORCEAN_BATHYPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_STORCEAN_BATHYPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(STORCEAN_ENDERPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_STORCEAN_ENDERPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(STORCEAN_GASOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_STORCEAN_GASOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(STORCEAN_HADOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_STORCEAN_HADOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(STORCEAN_INFINIPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_STORCEAN_INFINIPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(STORCEAN_MESOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_STORCEAN_MESOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(STORCEAN_VIRDIPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_STORCEAN_VIRDIPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(STORCEAN_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_STORCEAN_WATER, RenderLayer.getTranslucent());
    }

}
