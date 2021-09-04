package github.KingVampyre.DeepTrenches.client.init;

import github.KingVampyre.DeepTrenches.client.color.fluid.*;
import github.Louwind.Reload.client.render.fluid.SpritesFluidRenderHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;

public class DTFluidRenderHandlers {

    public static final FluidRenderHandler ABYSSOPELAGIC_WATER = new SpritesFluidRenderHandler(OverworldWaterProvider.INSTANCE, DTSprites.ABYSSOPELAGIC_WATER);

    public static final FluidRenderHandler ACID = new SpritesFluidRenderHandler(AcidProvider.INSTANCE, DTSprites.ACID);

    public static final FluidRenderHandler BATHYPELAGIC_WATER = new SpritesFluidRenderHandler(OverworldWaterProvider.INSTANCE, DTSprites.BATHYPELAGIC_WATER);

    public static final FluidRenderHandler BRINE = new SpritesFluidRenderHandler(BrineProvider.INSTANCE, DTSprites.BRINE);

    public static final FluidRenderHandler CLEAR_WATER = new SpritesFluidRenderHandler(ClearWaterProvider.INSTANCE, DTSprites.CLEAR_WATER);

    public static final FluidRenderHandler HADOPELAGIC_WATER = new SpritesFluidRenderHandler(OverworldWaterProvider.INSTANCE, DTSprites.HADOPELAGIC_WATER);

    public static final FluidRenderHandler MESOPELAGIC_WATER = new SpritesFluidRenderHandler(OverworldWaterProvider.INSTANCE, DTSprites.MESOPELAGIC_WATER);

    public static final FluidRenderHandler STORCEAN_ABYSSOPELAGIC_WATER = new SpritesFluidRenderHandler(StorceanAbyssopelagicWaterProvider.INSTANCE, DTSprites.STORCEAN_ABYSSOPELAGIC_WATER);

    public static final FluidRenderHandler STORCEAN_BATHYPELAGIC_WATER = new SpritesFluidRenderHandler(DTSprites.STORCEAN_BATHYPELAGIC_WATER);

    public static final FluidRenderHandler STORCEAN_ENDERPELAGIC_WATER = new SpritesFluidRenderHandler(StorceanEnderpelagicWaterProvider.INSTANCE, DTSprites.STORCEAN_ENDERPELAGIC_WATER);

    public static final FluidRenderHandler STORCEAN_GASOPELAGIC_WATER = new SpritesFluidRenderHandler(StorceanGasopelagicWaterProvider.INSTANCE, DTSprites.STORCEAN_GASOPELAGIC_WATER);

    public static final FluidRenderHandler STORCEAN_HADOPELAGIC_WATER = new SpritesFluidRenderHandler(StorceanHadopelagicWaterProvider.INSTANCE, DTSprites.STORCEAN_HADOPELAGIC_WATER);

    public static final FluidRenderHandler STORCEAN_INFINIPELAGIC_WATER = new SpritesFluidRenderHandler(StorceanInfinipelagicWaterProvider.INSTANCE, DTSprites.STORCEAN_INFINIPELAGIC_WATER);

    public static final FluidRenderHandler STORCEAN_MESOPELAGIC_WATER = new SpritesFluidRenderHandler(DTSprites.STORCEAN_MESOPELAGIC_WATER);

    public static final FluidRenderHandler STORCEAN_VIRDIPELAGIC_WATER = new SpritesFluidRenderHandler(StorceanVerdipelagicWaterProvider.INSTANCE, DTSprites.STORCEAN_VIRDIPELAGIC_WATER);

    public static final FluidRenderHandler STORCEAN_WATER = new SpritesFluidRenderHandler(StorceanWaterProvider.INSTANCE, DTSprites.STORCEAN_WATER);

}
