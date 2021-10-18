package github.KingVampyre.DeepTrenches.client.init;

import github.KingVampyre.DeepTrenches.client.color.fluid.*;
import github.Louwind.Reload.client.color.resolver.FluidColorProvider;
import github.Louwind.Reload.client.texture.SpriteLoader;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.minecraft.client.texture.Sprite;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import org.jetbrains.annotations.Nullable;

import static github.KingVampyre.DeepTrenches.client.init.DTSpriteLoaders.*;
import static github.KingVampyre.DeepTrenches.core.init.DTFluids.*;

public class DTFluidRenderHandlers {

    public static final FluidRenderHandler ACID_HANDLER;
    public static final FluidRenderHandler BRINE_HANDLER;

    public static final FluidRenderHandler ABYSSOPELAGIC_WATER_HANDLER;
    public static final FluidRenderHandler BATHYPELAGIC_WATER_HANDLER;
    public static final FluidRenderHandler CLEAR_WATER_HANDLER;
    public static final FluidRenderHandler HADOPELAGIC_WATER_HANDLER;
    public static final FluidRenderHandler MESOPELAGIC_WATER_HANDLER;

    public static final FluidRenderHandler STORCEAN_ABYSSOPELAGIC_WATER_HANDLER;
    public static final FluidRenderHandler STORCEAN_BATHYPELAGIC_WATER_HANDLER;
    public static final FluidRenderHandler STORCEAN_ENDERPELAGIC_WATER_HANDLER;
    public static final FluidRenderHandler STORCEAN_GASOPELAGIC_WATER_HANDLER;
    public static final FluidRenderHandler STORCEAN_HADOPELAGIC_WATER_HANDLER;
    public static final FluidRenderHandler STORCEAN_INFINIPELAGIC_WATER_HANDLER;
    public static final FluidRenderHandler STORCEAN_MESOPELAGIC_WATER_HANDLER;
    public static final FluidRenderHandler STORCEAN_VIRDIPELAGIC_WATER_HANDLER;
    public static final FluidRenderHandler STORCEAN_WATER_HANDLER;

    protected static FluidRenderHandler createFluidRender(SpriteLoader spriteLoader) {
        return createFluidRender(FluidColorProvider.NONE, spriteLoader);
    }

    protected static FluidRenderHandler createFluidRender(FluidColorProvider colorProvider, SpriteLoader spriteLoader) {
        return new FluidRenderHandler() {

            @Override
            public int getFluidColor(@Nullable BlockRenderView view, @Nullable BlockPos pos, FluidState state) {
                return colorProvider.getColor(view, pos, state);
            }

            @Override
            public Sprite[] getFluidSprites(@Nullable BlockRenderView view, @Nullable BlockPos pos, FluidState state) {
                return spriteLoader.getSprites();
            }

        };
    }

    static {
        ACID_HANDLER = createFluidRender(AcidProvider.INSTANCE, ACID_SPRITES);
        BRINE_HANDLER = createFluidRender(BrineProvider.INSTANCE, BRINE_SPRITES);

        ABYSSOPELAGIC_WATER_HANDLER = createFluidRender(OverworldWaterProvider.INSTANCE, ABYSSOPELAGIC_WATER_SPRITES);
        BATHYPELAGIC_WATER_HANDLER = createFluidRender(OverworldWaterProvider.INSTANCE, BATHYPELAGIC_WATER_SPRITES);
        CLEAR_WATER_HANDLER = createFluidRender(ClearWaterProvider.INSTANCE, CLEAR_WATER_SPRITES);
        HADOPELAGIC_WATER_HANDLER = createFluidRender(OverworldWaterProvider.INSTANCE, HADOPELAGIC_WATER_SPRITES);
        MESOPELAGIC_WATER_HANDLER = createFluidRender(OverworldWaterProvider.INSTANCE, MESOPELAGIC_WATER_SPRITES);

        STORCEAN_ABYSSOPELAGIC_WATER_HANDLER = createFluidRender(StorceanAbyssopelagicWaterProvider.INSTANCE, STORCEAN_ABYSSOPELAGIC_WATER_SPRITES);
        STORCEAN_BATHYPELAGIC_WATER_HANDLER = createFluidRender(STORCEAN_BATHYPELAGIC_WATER_SPRITES);
        STORCEAN_ENDERPELAGIC_WATER_HANDLER = createFluidRender(StorceanEnderpelagicWaterProvider.INSTANCE, STORCEAN_ENDERPELAGIC_WATER_SPRITES);
        STORCEAN_GASOPELAGIC_WATER_HANDLER = createFluidRender(StorceanGasopelagicWaterProvider.INSTANCE, STORCEAN_GASOPELAGIC_WATER_SPRITES);
        STORCEAN_HADOPELAGIC_WATER_HANDLER = createFluidRender(StorceanHadopelagicWaterProvider.INSTANCE, STORCEAN_HADOPELAGIC_WATER_SPRITES);
        STORCEAN_INFINIPELAGIC_WATER_HANDLER = createFluidRender(StorceanInfinipelagicWaterProvider.INSTANCE, STORCEAN_INFINIPELAGIC_WATER_SPRITES);
        STORCEAN_MESOPELAGIC_WATER_HANDLER = createFluidRender(STORCEAN_MESOPELAGIC_WATER_SPRITE);
        STORCEAN_VIRDIPELAGIC_WATER_HANDLER = createFluidRender(StorceanVerdipelagicWaterProvider.INSTANCE, STORCEAN_VIRDIPELAGIC_WATER_SPRITE);
        STORCEAN_WATER_HANDLER = createFluidRender(StorceanWaterProvider.INSTANCE, STORCEAN_WATER_SPRITE);
    }

    public static void initialize() {
        FluidRenderHandlerRegistry.INSTANCE.register(ACID, ACID_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(BRINE, BRINE_HANDLER);

        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_ACID, ACID_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_BRINE, BRINE_HANDLER);

        FluidRenderHandlerRegistry.INSTANCE.register(ABYSSOPELAGIC_WATER, ABYSSOPELAGIC_WATER_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(BATHYPELAGIC_WATER, BATHYPELAGIC_WATER_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(CLEAR_WATER, CLEAR_WATER_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(HADOPELAGIC_WATER, HADOPELAGIC_WATER_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(MESOPELAGIC_WATER, MESOPELAGIC_WATER_HANDLER);

        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_ABYSSOPELAGIC_WATER, STORCEAN_ABYSSOPELAGIC_WATER_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_BATHYPELAGIC_WATER, STORCEAN_BATHYPELAGIC_WATER_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_ENDERPELAGIC_WATER, STORCEAN_ENDERPELAGIC_WATER_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_GASOPELAGIC_WATER, STORCEAN_GASOPELAGIC_WATER_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_HADOPELAGIC_WATER, STORCEAN_HADOPELAGIC_WATER_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_INFINIPELAGIC_WATER, STORCEAN_INFINIPELAGIC_WATER_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_MESOPELAGIC_WATER, STORCEAN_MESOPELAGIC_WATER_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_VIRDIPELAGIC_WATER, STORCEAN_VIRDIPELAGIC_WATER_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_WATER, STORCEAN_WATER_HANDLER);

        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_ABYSSOPELAGIC_WATER, ABYSSOPELAGIC_WATER_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_BATHYPELAGIC_WATER, BATHYPELAGIC_WATER_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_CLEAR_WATER, CLEAR_WATER_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_HADOPELAGIC_WATER, HADOPELAGIC_WATER_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_MESOPELAGIC_WATER, MESOPELAGIC_WATER_HANDLER);

        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_ABYSSOPELAGIC_WATER, STORCEAN_ABYSSOPELAGIC_WATER_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_BATHYPELAGIC_WATER, STORCEAN_BATHYPELAGIC_WATER_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_ENDERPELAGIC_WATER, STORCEAN_ENDERPELAGIC_WATER_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_GASOPELAGIC_WATER, STORCEAN_GASOPELAGIC_WATER_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_HADOPELAGIC_WATER, STORCEAN_HADOPELAGIC_WATER_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_INFINIPELAGIC_WATER, STORCEAN_INFINIPELAGIC_WATER_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_MESOPELAGIC_WATER, STORCEAN_MESOPELAGIC_WATER_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_VIRDIPELAGIC_WATER, STORCEAN_VIRDIPELAGIC_WATER_HANDLER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_WATER, STORCEAN_WATER_HANDLER);
    }

}
