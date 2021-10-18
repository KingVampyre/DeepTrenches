package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.fluid.*;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.registry.Registry;

import static net.minecraft.util.registry.Registry.FLUID;

public class DTFluids {

    /* OTHER FLUIDS */
    public static final FlowableFluid ACID;
    public static final FlowableFluid BRINE;
    public static final FlowableFluid FLOWING_ACID;
    public static final FlowableFluid FLOWING_BRINE;

    /* WATERS */
    public static final FlowableFluid ABYSSOPELAGIC_WATER;
    public static final FlowableFluid BATHYPELAGIC_WATER;
    public static final FlowableFluid CLEAR_WATER;
    public static final FlowableFluid HADOPELAGIC_WATER;
    public static final FlowableFluid MESOPELAGIC_WATER;

    /* STORCEAN WATERS */
    public static final FlowableFluid STORCEAN_ABYSSOPELAGIC_WATER;
    public static final FlowableFluid STORCEAN_BATHYPELAGIC_WATER;
    public static final FlowableFluid STORCEAN_ENDERPELAGIC_WATER;
    public static final FlowableFluid STORCEAN_GASOPELAGIC_WATER;
    public static final FlowableFluid STORCEAN_HADOPELAGIC_WATER;
    public static final FlowableFluid STORCEAN_INFINIPELAGIC_WATER;
    public static final FlowableFluid STORCEAN_MESOPELAGIC_WATER;
    public static final FlowableFluid STORCEAN_VIRDIPELAGIC_WATER;
    public static final FlowableFluid STORCEAN_WATER;

    /* FLOWING WATERS */
    public static final FlowableFluid FLOWING_ABYSSOPELAGIC_WATER;
    public static final FlowableFluid FLOWING_BATHYPELAGIC_WATER;
    public static final FlowableFluid FLOWING_CLEAR_WATER;
    public static final FlowableFluid FLOWING_HADOPELAGIC_WATER;
    public static final FlowableFluid FLOWING_MESOPELAGIC_WATER;

    /* FLOWING STORCEAN WATERS */
    public static final FlowableFluid FLOWING_STORCEAN_ABYSSOPELAGIC_WATER;
    public static final FlowableFluid FLOWING_STORCEAN_BATHYPELAGIC_WATER;
    public static final FlowableFluid FLOWING_STORCEAN_ENDERPELAGIC_WATER;
    public static final FlowableFluid FLOWING_STORCEAN_GASOPELAGIC_WATER;
    public static final FlowableFluid FLOWING_STORCEAN_HADOPELAGIC_WATER;
    public static final FlowableFluid FLOWING_STORCEAN_INFINIPELAGIC_WATER;
    public static final FlowableFluid FLOWING_STORCEAN_MESOPELAGIC_WATER;
    public static final FlowableFluid FLOWING_STORCEAN_VIRDIPELAGIC_WATER;
    public static final FlowableFluid FLOWING_STORCEAN_WATER;

    static {
        /* OTHER FLUIDS */
        ACID = new AcidFluid.Still();
        BRINE = new BrineFluid.Still();
        FLOWING_ACID = new AcidFluid.Flowing();
        FLOWING_BRINE = new BrineFluid.Flowing();

        /* WATERS */
        ABYSSOPELAGIC_WATER = new AbyssopelagicWaterFluid.Still();
        BATHYPELAGIC_WATER = new BathypelagicWaterFluid.Still();
        CLEAR_WATER = new ClearWaterFluid.Still();
        HADOPELAGIC_WATER = new HadopelagicWaterFluid.Still();
        MESOPELAGIC_WATER = new MesopelagicWaterFluid.Still();

        /* STORCEAN WATERS */
        FLOWING_ABYSSOPELAGIC_WATER = new AbyssopelagicWaterFluid.Flowing();
        FLOWING_BATHYPELAGIC_WATER = new BathypelagicWaterFluid.Flowing();
        FLOWING_CLEAR_WATER = new ClearWaterFluid.Flowing();
        FLOWING_HADOPELAGIC_WATER = new HadopelagicWaterFluid.Flowing();
        FLOWING_MESOPELAGIC_WATER = new MesopelagicWaterFluid.Flowing();

        /* FLOWING WATERS */
        STORCEAN_ABYSSOPELAGIC_WATER = new StorceanAbyssopelagicWaterFluid.Still();
        STORCEAN_BATHYPELAGIC_WATER = new StorceanBathypelagicWaterFluid.Still();
        STORCEAN_ENDERPELAGIC_WATER = new StorceanEnderpelagicWaterFluid.Still();
        STORCEAN_GASOPELAGIC_WATER = new StorceanGasopelagicWaterFluid.Still();
        STORCEAN_HADOPELAGIC_WATER = new StorceanHadopelagicWaterFluid.Still();
        STORCEAN_INFINIPELAGIC_WATER = new StorceanInfinipelagicWaterFluid.Still();
        STORCEAN_MESOPELAGIC_WATER = new StorceanMesopelagicWaterFluid.Still();
        STORCEAN_VIRDIPELAGIC_WATER = new StorceanVirdipelagicWaterFluid.Still();
        STORCEAN_WATER = new StorceanWaterFluid.Still();

        /* FLOWING STORCEAN WATERS */
        FLOWING_STORCEAN_ABYSSOPELAGIC_WATER = new StorceanAbyssopelagicWaterFluid.Flowing();
        FLOWING_STORCEAN_BATHYPELAGIC_WATER = new StorceanBathypelagicWaterFluid.Flowing();
        FLOWING_STORCEAN_ENDERPELAGIC_WATER = new StorceanEnderpelagicWaterFluid.Flowing();
        FLOWING_STORCEAN_GASOPELAGIC_WATER = new StorceanGasopelagicWaterFluid.Flowing();
        FLOWING_STORCEAN_HADOPELAGIC_WATER = new StorceanHadopelagicWaterFluid.Flowing();
        FLOWING_STORCEAN_INFINIPELAGIC_WATER = new StorceanInfinipelagicWaterFluid.Flowing();
        FLOWING_STORCEAN_MESOPELAGIC_WATER = new StorceanMesopelagicWaterFluid.Flowing();
        FLOWING_STORCEAN_VIRDIPELAGIC_WATER = new StorceanVirdipelagicWaterFluid.Flowing();
        FLOWING_STORCEAN_WATER = new StorceanWaterFluid.Flowing();
    }

    public static void initialize() {
        /* OTHER FLUIDS */
        Registry.register(FLUID, "deep_trenches:acid", ACID);
        Registry.register(FLUID, "deep_trenches:brine", BRINE);
        Registry.register(FLUID, "deep_trenches:flowing_acid", FLOWING_ACID);
        Registry.register(FLUID, "deep_trenches:flowing_brine", FLOWING_BRINE);

        /* WATERS */
        Registry.register(FLUID, "deep_trenches:abyssopelagic_water", ABYSSOPELAGIC_WATER);
        Registry.register(FLUID, "deep_trenches:bathypelagic_water", BATHYPELAGIC_WATER);
        Registry.register(FLUID, "deep_trenches:clear_water", CLEAR_WATER);
        Registry.register(FLUID, "deep_trenches:hadopelagic_water", HADOPELAGIC_WATER);
        Registry.register(FLUID, "deep_trenches:mesopelagic_water", MESOPELAGIC_WATER);

        /* STORCEAN WATERS */
        Registry.register(FLUID, "deep_trenches:storcean_abyssopelagic_water", STORCEAN_ABYSSOPELAGIC_WATER);
        Registry.register(FLUID, "deep_trenches:storcean_bathypelagic_water", STORCEAN_BATHYPELAGIC_WATER);
        Registry.register(FLUID, "deep_trenches:storcean_enderpelagic_water", STORCEAN_ENDERPELAGIC_WATER);
        Registry.register(FLUID, "deep_trenches:storcean_gasopelagic_water", STORCEAN_GASOPELAGIC_WATER);
        Registry.register(FLUID, "deep_trenches:storcean_hadopelagic_water", STORCEAN_HADOPELAGIC_WATER);
        Registry.register(FLUID, "deep_trenches:storcean_infinipelagic_water", STORCEAN_INFINIPELAGIC_WATER);
        Registry.register(FLUID, "deep_trenches:storcean_mesopelagic_water", STORCEAN_MESOPELAGIC_WATER);
        Registry.register(FLUID, "deep_trenches:storcean_virdipelagic_water", STORCEAN_VIRDIPELAGIC_WATER);
        Registry.register(FLUID, "deep_trenches:storcean_water", STORCEAN_WATER);

        /* FLOWING WATERS */
        Registry.register(FLUID, "deep_trenches:flowing_abyssopelagic_water", FLOWING_ABYSSOPELAGIC_WATER);
        Registry.register(FLUID, "deep_trenches:flowing_bathypelagic_water", FLOWING_BATHYPELAGIC_WATER);
        Registry.register(FLUID, "deep_trenches:flowing_clear_water", FLOWING_CLEAR_WATER);
        Registry.register(FLUID, "deep_trenches:flowing_hadopelagic_water", FLOWING_HADOPELAGIC_WATER);
        Registry.register(FLUID, "deep_trenches:flowing_mesopelagic_water", FLOWING_MESOPELAGIC_WATER);

        /* FLOWING STORCEAN WATERS */
        Registry.register(FLUID, "deep_trenches:flowing_storcean_abyssopelagic_water", FLOWING_STORCEAN_ABYSSOPELAGIC_WATER);
        Registry.register(FLUID, "deep_trenches:flowing_storcean_bathypelagic_water", FLOWING_STORCEAN_BATHYPELAGIC_WATER);
        Registry.register(FLUID, "deep_trenches:flowing_storcean_enderpelagic_water", FLOWING_STORCEAN_ENDERPELAGIC_WATER);
        Registry.register(FLUID, "deep_trenches:flowing_storcean_gasopelagic_water", FLOWING_STORCEAN_GASOPELAGIC_WATER);
        Registry.register(FLUID, "deep_trenches:flowing_storcean_hadopelagic_water", FLOWING_STORCEAN_HADOPELAGIC_WATER);
        Registry.register(FLUID, "deep_trenches:flowing_storcean_infinipelagic_water", FLOWING_STORCEAN_INFINIPELAGIC_WATER);
        Registry.register(FLUID, "deep_trenches:flowing_storcean_mesopelagic_water", FLOWING_STORCEAN_MESOPELAGIC_WATER);
        Registry.register(FLUID, "deep_trenches:flowing_storcean_verdipelagic_water", FLOWING_STORCEAN_VIRDIPELAGIC_WATER);
        Registry.register(FLUID, "deep_trenches:flowing_storcean_water", FLOWING_STORCEAN_WATER);
    }

}
