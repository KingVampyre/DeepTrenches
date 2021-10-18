package github.KingVampyre.DeepTrenches.client.particle.factory;

import github.KingVampyre.DeepTrenches.client.particle.AcidLandingParticle;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.BlockLeakParticle;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;

import static github.KingVampyre.DeepTrenches.core.init.DTFluids.ACID;
import static github.KingVampyre.DeepTrenches.core.init.DTParticleTypes.*;

public record DrippingAcidFactory(
            SpriteProvider spriteProvider) implements ParticleFactory<DefaultParticleType> {

    @Override
    public Particle createParticle(DefaultParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
        var particle = new BlockLeakParticle.Dripping(world, x, y, z, ACID, FALLING_ACID);
        particle.setSprite(this.spriteProvider);

        return particle;
    }

    @Environment(EnvType.CLIENT)
    public record Falling(
            SpriteProvider spriteProvider) implements ParticleFactory<DefaultParticleType> {

        @Override
        public Particle createParticle(DefaultParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            var particle = new AcidLandingParticle(world, x, y, z, ACID, LANDING_ACID, ENTITY_NEAR_GASEOUS_ACID);
            particle.setSprite(this.spriteProvider);

            return particle;
        }

    }

    @Environment(EnvType.CLIENT)
    public record Landing(
            SpriteProvider spriteProvider) implements ParticleFactory<DefaultParticleType> {

        @Override
        public Particle createParticle(DefaultParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            var particle = new BlockLeakParticle.Landing(world, x, y, z, ACID);
            particle.setSprite(this.spriteProvider);

            return particle;
        }

    }

}
