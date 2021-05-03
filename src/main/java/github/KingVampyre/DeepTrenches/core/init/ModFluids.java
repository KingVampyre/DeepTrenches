package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.fluid.AbyssopelagicWaterFluid;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.registry.Registry;

import static net.minecraft.util.registry.Registry.FLUID;

public class ModFluids {

    public static final FlowableFluid ABYSSOPELAGIC_WATER = register("deep_trenches:abyssopelagic_water", new AbyssopelagicWaterFluid.Still());
    public static final FlowableFluid FLOWING_ABYSSOPELAGIC_WATER = register("deep_trenches:flowing_abyssopelagic_water", new AbyssopelagicWaterFluid.Flowing());

    private static <T extends Fluid> T register(String id, T value) {
        return (T) Registry.register(FLUID, id, value);
    }

}
