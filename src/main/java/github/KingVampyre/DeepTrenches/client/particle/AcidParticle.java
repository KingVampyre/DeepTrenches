package github.KingVampyre.DeepTrenches.client.particle;

import github.KingVampyre.DeepTrenches.core.init.ParticleTypes;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.BlockLeakParticle;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.fluid.Fluid;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleEffect;

import static github.KingVampyre.DeepTrenches.core.init.ModFluids.ACID;

public class AcidParticle extends BlockLeakParticle {

    public AcidParticle(ClientWorld world, double x, double y, double z, Fluid fluid) {
        super(world, x, y, z, fluid);
    }

    @Environment(EnvType.CLIENT)
    public static class ContinuousFalling extends AcidParticle.Falling {
        protected final ParticleEffect nextParticle;

        protected ContinuousFalling(ClientWorld clientWorld, double x, double y, double z, Fluid fluid, ParticleEffect nextParticle) {
            super(clientWorld, x, y, z, fluid);

            this.nextParticle = nextParticle;
        }

        @Override
        protected void updateVelocity() {

            if (this.onGround) {
                this.markDead();
                this.world.addParticle(this.nextParticle, this.x, this.y, this.z, 0, 0, 0);
            }

        }
    }

    @Environment(EnvType.CLIENT)
    public static class Dripping extends AcidParticle {
        private final ParticleEffect nextParticle;

        protected Dripping(ClientWorld clientWorld, double x, double y, double z, Fluid fluid, ParticleEffect nextParticle) {
            super(clientWorld, x, y, z, fluid);

            this.nextParticle = nextParticle;
            this.gravityStrength *= 0.02F;
            this.maxAge = 40;
        }

        @Override
        protected void updateAge() {
            if (this.maxAge-- <= 0) {
                this.markDead();
                this.world.addParticle(this.nextParticle, this.x, this.y, this.z, this.velocityX, this.velocityY, this.velocityZ);
            }

        }

    }

    @Environment(EnvType.CLIENT)
    public static class Falling extends AcidParticle {

        protected Falling(ClientWorld world, double x, double y, double z, Fluid fluid) {
            super(world, x, y, z, fluid);

            this.maxAge = (int)(64.0D / (Math.random() * 0.8D + 0.2D));
        }

        @Override
        protected void updateVelocity() {

            if (this.onGround)
                this.markDead();

        }
    }

    @Environment(EnvType.CLIENT)
    public static class Landing extends AcidParticle {

        protected Landing(ClientWorld world, double x, double y, double z, Fluid fluid) {
            super(world, x, y, z, fluid);

            this.maxAge = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
        }

    }

    @Environment(EnvType.CLIENT)
    public static class DripletFactory implements ParticleFactory<DefaultParticleType> {

        protected final SpriteProvider spriteProvider;

        public DripletFactory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(DefaultParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            AcidParticle particle = new AcidParticle.Dripping(world, x, y, z, ACID, ParticleTypes.ACID_FALLING);
            particle.setSprite(this.spriteProvider);

            return particle;
        }

    }

    @Environment(EnvType.CLIENT)
    public static class DrippingFactory implements ParticleFactory<DefaultParticleType> {

        protected final SpriteProvider spriteProvider;

        public DrippingFactory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(DefaultParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            AcidParticle particle = new AcidParticle.Dripping(world, x, y, z, ACID, ParticleTypes.ACID_FALLING);
            particle.setSprite(this.spriteProvider);

            return particle;
        }

    }

    @Environment(EnvType.CLIENT)
    public static class FallingFactory implements ParticleFactory<DefaultParticleType> {

        protected final SpriteProvider spriteProvider;

        public FallingFactory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(DefaultParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            AcidParticle particle = new AcidParticle.ContinuousFalling(world, x, y, z, ACID, ParticleTypes.ACID_LANDING);
            particle.setSprite(this.spriteProvider);

            return particle;
        }

    }

    @Environment(EnvType.CLIENT)
    public static class LandingFactory implements ParticleFactory<DefaultParticleType> {

        protected final SpriteProvider spriteProvider;

        public LandingFactory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(DefaultParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            AcidParticle particle = new AcidParticle.Landing(world, x, y, z, ACID);
            particle.setSprite(this.spriteProvider);

            return particle;
        }

    }

}
