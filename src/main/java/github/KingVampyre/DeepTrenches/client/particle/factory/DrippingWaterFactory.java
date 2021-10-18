package github.KingVampyre.DeepTrenches.client.particle.factory;

import github.KingVampyre.DeepTrenches.client.particle.effect.LeakParticleEffect;
import github.KingVampyre.DeepTrenches.core.util.particle.ParticleEffectHelper;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;

public record DrippingWaterFactory(
            SpriteProvider spriteProvider) implements ParticleFactory<LeakParticleEffect> {

    @Override
    public Particle createParticle(LeakParticleEffect parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
        var effect = ParticleEffectHelper.getFallingEffect(parameters);
        var particle = new BlockLeakParticle.Dripping(world, x, y, z, parameters.fluid(), effect);

        particle.setColor(parameters.red(), parameters.green(), parameters.blue());
        particle.setSprite(this.spriteProvider);

        return particle;
    }

    @Environment(EnvType.CLIENT)
    public record Falling(
            SpriteProvider spriteProvider) implements ParticleFactory<LeakParticleEffect> {

        @Override
        public Particle createParticle(LeakParticleEffect parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            var effect = ParticleEffectHelper.getSplashingEffect(parameters);
            var particle = new BlockLeakParticle.ContinuousFalling(world, x, y, z, parameters.fluid(), effect);

            particle.setColor(parameters.red(), parameters.green(), parameters.blue());
            particle.setSprite(this.spriteProvider);

            return particle;
        }

    }

    @Environment(EnvType.CLIENT)
    public record SplashingFactory(
            SpriteProvider spriteProvider) implements ParticleFactory<LeakParticleEffect> {

        @Override
        public Particle createParticle(LeakParticleEffect parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            var particle = new WaterSplashParticle(world, x, y, z, velocityX, velocityY, velocityZ);

            particle.setColor(parameters.red(), parameters.green(), parameters.blue());
            particle.setSprite(this.spriteProvider);

            return particle;
        }

    }

}
