package github.KingVampyre.DeepTrenches.client.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.particle.WaterSuspendParticle;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;

public class MarineSnowParticle extends WaterSuspendParticle {

    public MarineSnowParticle(ClientWorld world, double x, double y, double z) {
        super(world, x, y, z);
    }

    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
            MarineSnowParticle particle = new MarineSnowParticle(clientWorld, d, e, f);
            particle.setSprite(this.spriteProvider);

            return particle;
        }

    }

}
