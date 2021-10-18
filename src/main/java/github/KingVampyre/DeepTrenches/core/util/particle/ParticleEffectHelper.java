package github.KingVampyre.DeepTrenches.core.util.particle;

import github.KingVampyre.DeepTrenches.client.particle.effect.LeakParticleEffect;
import net.minecraft.particle.ParticleEffect;

import static github.KingVampyre.DeepTrenches.core.init.DTParticleTypes.*;

public class ParticleEffectHelper {

    public static ParticleEffect getFallingEffect(LeakParticleEffect effect) {
        return new LeakParticleEffect(FALLING_WATER, effect.fluid(), effect.red(), effect.green(), effect.blue());
    }

    public static ParticleEffect getSplashingEffect(LeakParticleEffect effect) {
        return new LeakParticleEffect(SPLASHING_WATER, effect.fluid(), effect.red(), effect.green(), effect.blue());
    }


}
