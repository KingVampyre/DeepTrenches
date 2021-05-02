package github.KingVampyre.DeepTrenches.client.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;

public class SkullParticle extends SpellParticle {

    public SkullParticle(ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ, SpriteProvider spriteProvider) {
        super(world, x, y, z, velocityX, velocityY, velocityZ, spriteProvider);
    }

    @Environment(EnvType.CLIENT)
    public static class EntityAmbientFactory implements ParticleFactory<DefaultParticleType> {

        protected final SpriteProvider spriteProvider;

        public EntityAmbientFactory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
            SkullParticle particle = new SkullParticle(clientWorld, d, e, f, g, h, i, this.spriteProvider);
            particle.setColorAlpha(0.15F);

            return particle;
        }

    }

    @Environment(EnvType.CLIENT)
    public static class EntityFactory implements ParticleFactory<DefaultParticleType> {

        protected final SpriteProvider spriteProvider;

        public EntityFactory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
            return new SkullParticle(clientWorld, d, e, f, g, h, i, this.spriteProvider);
        }

    }

}
