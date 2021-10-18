package github.KingVampyre.DeepTrenches.client.particle.factory;

import github.KingVampyre.DeepTrenches.client.particle.FallingAqueanSapParticle;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.BlockLeakParticle;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;

import static github.KingVampyre.DeepTrenches.core.init.DTParticleTypes.FALLING_AQUEAN_SAP;
import static github.KingVampyre.DeepTrenches.core.init.DTParticleTypes.LANDING_AQUEAN_SAP;
import static net.minecraft.fluid.Fluids.EMPTY;

public record DrippingAqueanSapFactory(
            SpriteProvider spriteProvider) implements ParticleFactory<DefaultParticleType> {

    @Override
    public Particle createParticle(DefaultParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
        var particle = new BlockLeakParticle.Dripping(world, x, y, z, EMPTY, FALLING_AQUEAN_SAP);
        particle.setColor(0.509F, 0.239F, 0.239F);
        particle.setSprite(this.spriteProvider);
        particle.gravityStrength *= 0.01F;
        particle.maxAge = 100;

        return particle;
    }

    @Environment(EnvType.CLIENT)
    public record Falling(
            SpriteProvider spriteProvider) implements ParticleFactory<DefaultParticleType> {

        @Override
        public Particle createParticle(DefaultParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            var particle = new FallingAqueanSapParticle(world, x, y, z, EMPTY, LANDING_AQUEAN_SAP);
            particle.setColor(0.509F, 0.239F, 0.239F);
            particle.setSprite(this.spriteProvider);
            particle.gravityStrength = 0.01F;

            return particle;
        }

    }

    @Environment(EnvType.CLIENT)
    public record Landing(
            SpriteProvider spriteProvider) implements ParticleFactory<DefaultParticleType> {

        @Override
        public Particle createParticle(DefaultParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            var particle = new BlockLeakParticle.Landing(world, x, y, z, EMPTY);
            particle.setColor(0.509F, 0.239F, 0.239F);
            particle.setSprite(this.spriteProvider);
            particle.maxAge = (int) (128.0D / (Math.random() * 0.8D + 0.2D));

            return particle;
        }

    }

}
