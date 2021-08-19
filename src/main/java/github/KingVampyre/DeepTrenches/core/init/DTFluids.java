package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.fluid.*;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.registry.Registry;

import static net.minecraft.util.registry.Registry.FLUID;

public class DTFluids {

    public static final FlowableFluid ABYSSOPELAGIC_WATER = register("deep_trenches:abyssopelagic_water", new AbyssopelagicWaterFluid.Still());
    public static final FlowableFluid FLOWING_ABYSSOPELAGIC_WATER = register("deep_trenches:flowing_abyssopelagic_water", new AbyssopelagicWaterFluid.Flowing());

    public static final FlowableFluid ACID = register("deep_trenches:acid", new AcidFluid.Still());
    public static final FlowableFluid FLOWING_ACID = register("deep_trenches:flowing_acid", new AcidFluid.Flowing());

    public static final FlowableFluid BATHYPELAGIC_WATER = register("deep_trenches:bathypelagic_water", new BathypelagicWaterFluid.Still());
    public static final FlowableFluid FLOWING_BATHYPELAGIC_WATER = register("deep_trenches:flowing_bathypelagic_water", new BathypelagicWaterFluid.Flowing());

    public static final FlowableFluid BRINE = register("deep_trenches:brine", new BrineFluid.Still());
    public static final FlowableFluid FLOWING_BRINE = register("deep_trenches:flowing_brine", new BrineFluid.Flowing());

    public static final FlowableFluid CLEAR_WATER = register("deep_trenches:clear_water", new ClearWaterFluid.Still());
    public static final FlowableFluid FLOWING_CLEAR_WATER = register("deep_trenches:flowing_clear_water", new ClearWaterFluid.Flowing());

    public static final FlowableFluid HADOPELAGIC_WATER = register("deep_trenches:hadopelagic_water", new HadopelagicWaterFluid.Still());
    public static final FlowableFluid FLOWING_HADOPELAGIC_WATER = register("deep_trenches:flowing_hadopelagic_water", new HadopelagicWaterFluid.Flowing());

    public static final FlowableFluid MESOPELAGIC_WATER = register("deep_trenches:mesopelagic_water", new MesopelagicWaterFluid.Still());
    public static final FlowableFluid FLOWING_MESOPELAGIC_WATER = register("deep_trenches:flowing_mesopelagic_water", new MesopelagicWaterFluid.Flowing());

    public static final FlowableFluid STORCEAN_ABYSSOPELAGIC_WATER = register("deep_trenches:storcean_abyssopelagic_water", new StorceanAbyssopelagicWaterFluid.Still());
    public static final FlowableFluid FLOWING_STORCEAN_ABYSSOPELAGIC_WATER = register("deep_trenches:flowing_storcean_abyssopelagic_water", new StorceanAbyssopelagicWaterFluid.Flowing());

    public static final FlowableFluid STORCEAN_BATHYPELAGIC_WATER = register("deep_trenches:storcean_bathypelagic_water", new StorceanBathypelagicWaterFluid.Still());
    public static final FlowableFluid FLOWING_STORCEAN_BATHYPELAGIC_WATER = register("deep_trenches:flowing_storcean_bathypelagic_water", new StorceanBathypelagicWaterFluid.Flowing());

    public static final FlowableFluid STORCEAN_ENDERPELAGIC_WATER = register("deep_trenches:storcean_enderpelagic_water", new StorceanEnderpelagicWaterFluid.Still());
    public static final FlowableFluid FLOWING_STORCEAN_ENDERPELAGIC_WATER = register("deep_trenches:flowing_storcean_enderpelagic_water", new StorceanEnderpelagicWaterFluid.Flowing());

    public static final FlowableFluid STORCEAN_GASOPELAGIC_WATER = register("deep_trenches:storcean_gasopelagic_water", new StorceanGasopelagicWaterFluid.Still());
    public static final FlowableFluid FLOWING_STORCEAN_GASOPELAGIC_WATER = register("deep_trenches:flowing_storcean_gasopelagic_water", new StorceanGasopelagicWaterFluid.Flowing());

    public static final FlowableFluid STORCEAN_HADOPELAGIC_WATER = register("deep_trenches:storcean_hadopelagic_water", new StorceanHadopelagicWaterFluid.Still());
    public static final FlowableFluid FLOWING_STORCEAN_HADOPELAGIC_WATER = register("deep_trenches:flowing_storcean_hadopelagic_water", new StorceanHadopelagicWaterFluid.Flowing());

    public static final FlowableFluid STORCEAN_INFINIPELAGIC_WATER = register("deep_trenches:storcean_infinipelagic_water", new StorceanInfinipelagicWaterFluid.Still());
    public static final FlowableFluid FLOWING_STORCEAN_INFINIPELAGIC_WATER = register("deep_trenches:flowing_storcean_infinipelagic_water", new StorceanInfinipelagicWaterFluid.Flowing());

    public static final FlowableFluid STORCEAN_MESOPELAGIC_WATER = register("deep_trenches:storcean_mesopelagic_water", new StorceanMesopelagicWaterFluid.Still());
    public static final FlowableFluid FLOWING_STORCEAN_MESOPELAGIC_WATER = register("deep_trenches:flowing_storcean_mesopelagic_water", new StorceanMesopelagicWaterFluid.Flowing());

    public static final FlowableFluid STORCEAN_VIRDIPELAGIC_WATER = register("deep_trenches:storcean_virdipelagic_water", new StorceanVirdipelagicWaterFluid.Still());
    public static final FlowableFluid FLOWING_STORCEAN_VIRDIPELAGIC_WATER = register("deep_trenches:flowing_storcean_verdipelagic_water", new StorceanVirdipelagicWaterFluid.Flowing());

    public static final FlowableFluid STORCEAN_WATER = register("deep_trenches:storcean_water", new StorceanWaterFluid.Still());
    public static final FlowableFluid FLOWING_STORCEAN_WATER = register("deep_trenches:flowing_storcean_water", new StorceanWaterFluid.Flowing());

    private static <T extends Fluid> T register(String id, T value) {
        return Registry.register(FLUID, id, value);
    }

}
