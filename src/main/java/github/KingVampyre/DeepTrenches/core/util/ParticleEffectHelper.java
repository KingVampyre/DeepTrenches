package github.KingVampyre.DeepTrenches.core.util;

import github.KingVampyre.DeepTrenches.core.particle.ColoredWaterFluidParticleEffect;
import net.minecraft.fluid.Fluid;
import net.minecraft.particle.ParticleEffect;

import static github.KingVampyre.DeepTrenches.core.init.DTParticleTypes.*;

public class ParticleEffectHelper {

    public static ParticleEffect getDrippingEffect(Fluid fluid, float red, float green, float blue) {
        return new ColoredWaterFluidParticleEffect(DRIPPING_COLORED_WATER, fluid, red, green,blue);
    }

    public static ParticleEffect getFallingEffect(Fluid fluid, float red, float green, float blue) {
        return new ColoredWaterFluidParticleEffect(FALLING_COLORED_WATER, fluid, red, green,blue);
    }

    public static ParticleEffect getSplashingEffect(Fluid fluid, float red, float green, float blue) {
        return new ColoredWaterFluidParticleEffect(SPLASHING_COLORED_WATER, fluid, red, green,blue);
    }


}
