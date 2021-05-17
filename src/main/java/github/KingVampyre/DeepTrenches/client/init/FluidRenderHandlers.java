package github.KingVampyre.DeepTrenches.client.init;

import github.KingVampyre.DeepTrenches.client.color.fluid.*;
import github.Louwind.Reload.client.render.fluid.SpritesFluidRenderHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;

public class FluidRenderHandlers {

    public static final FluidRenderHandler ABYSSOPELAGIC_WATER = new SpritesFluidRenderHandler(Sprites.ABYSSOPELAGIC_WATER);

    public static final FluidRenderHandler ACID = new SpritesFluidRenderHandler(AcidProvider.INSTANCE, Sprites.ACID);

    public static final FluidRenderHandler BATHYPELAGIC_WATER = new SpritesFluidRenderHandler(Sprites.BATHYPELAGIC_WATER);

    public static final FluidRenderHandler BRINE = new SpritesFluidRenderHandler(BrineProvider.INSTANCE, Sprites.BRINE);

    public static final FluidRenderHandler CLEAR_WATER = new SpritesFluidRenderHandler(ClearWaterProvider.INSTANCE, Sprites.CLEAR_WATER);

    public static final FluidRenderHandler HADOPELAGIC_WATER = new SpritesFluidRenderHandler(Sprites.HADOPELAGIC_WATER);

    public static final FluidRenderHandler MESOPELAGIC_WATER = new SpritesFluidRenderHandler(Sprites.MESOPELAGIC_WATER);

    public static final FluidRenderHandler STORCEAN_ABYSSOPELAGIC_WATER = new SpritesFluidRenderHandler(StorceanAbyssopelagicWaterProvider.INSTANCE, Sprites.STORCEAN_ABYSSOPELAGIC_WATER);

    public static final FluidRenderHandler STORCEAN_BATHYPELAGIC_WATER = new SpritesFluidRenderHandler(Sprites.STORCEAN_BATHYPELAGIC_WATER);

    public static final FluidRenderHandler STORCEAN_ENDERPELAGIC_WATER = new SpritesFluidRenderHandler(StorceanEnderpelagicWaterProvider.INSTANCE, Sprites.STORCEAN_ENDERPELAGIC_WATER);

    public static final FluidRenderHandler STORCEAN_GASOPELAGIC_WATER = new SpritesFluidRenderHandler(StorceanGasopelagicWaterProvider.INSTANCE, Sprites.STORCEAN_GASOPELAGIC_WATER);

    public static final FluidRenderHandler STORCEAN_HADOPELAGIC_WATER = new SpritesFluidRenderHandler(StorceanHadopelagicWaterProvider.INSTANCE, Sprites.STORCEAN_HADOPELAGIC_WATER);

    public static final FluidRenderHandler STORCEAN_INFINIPELAGIC_WATER = new SpritesFluidRenderHandler(StorceanInfinipelagicWaterProvider.INSTANCE, Sprites.STORCEAN_INFINIPELAGIC_WATER);

    public static final FluidRenderHandler STORCEAN_MESOPELAGIC_WATER = new SpritesFluidRenderHandler(Sprites.STORCEAN_MESOPELAGIC_WATER);

    public static final FluidRenderHandler STORCEAN_VIRDIPELAGIC_WATER = new SpritesFluidRenderHandler(StorceanVerdipelagicWaterProvider.INSTANCE, Sprites.STORCEAN_VIRDIPELAGIC_WATER);

    public static final FluidRenderHandler STORCEAN_WATER = new SpritesFluidRenderHandler(StorceanWaterProvider.INSTANCE, Sprites.STORCEAN_WATER);

}
