package github.KingVampyre.DeepTrenches.client.particle;

import github.KingVampyre.DeepTrenches.core.init.ParticleTypes;
import github.KingVampyre.DeepTrenches.core.particle.ColoredWaterFluidParticleEffect;
import github.KingVampyre.DeepTrenches.core.util.ParticleEffectHelper;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.fluid.Fluid;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleEffect;

import static github.KingVampyre.DeepTrenches.core.init.ModFluids.ACID;

public class LeakParticle extends BlockLeakParticle {

    public LeakParticle(ClientWorld world, double x, double y, double z, Fluid fluid) {
        super(world, x, y, z, fluid);
    }

    @Environment(EnvType.CLIENT)
    public static class ContinuousFalling extends LeakParticle.Falling {
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
    public static class Dripping extends LeakParticle {
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
    public static class Falling extends LeakParticle {

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
    public static class Landing extends LeakParticle {

        protected Landing(ClientWorld world, double x, double y, double z, Fluid fluid) {
            super(world, x, y, z, fluid);

            this.maxAge = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
        }

    }

    @Environment(EnvType.CLIENT)
    public static class AcidDripletFactory implements ParticleFactory<DefaultParticleType> {

        protected final SpriteProvider spriteProvider;

        public AcidDripletFactory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(DefaultParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            LeakParticle particle = new LeakParticle.Dripping(world, x, y, z, ACID, ParticleTypes.ACID_FALLING);
            particle.setSprite(this.spriteProvider);

            return particle;
        }

    }

    @Environment(EnvType.CLIENT)
    public static class AcidDrippingFactory implements ParticleFactory<DefaultParticleType> {

        protected final SpriteProvider spriteProvider;

        public AcidDrippingFactory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(DefaultParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            LeakParticle particle = new LeakParticle.Dripping(world, x, y, z, ACID, ParticleTypes.ACID_FALLING);
            particle.setSprite(this.spriteProvider);

            return particle;
        }

    }

    @Environment(EnvType.CLIENT)
    public static class AcidFallingFactory implements ParticleFactory<DefaultParticleType> {

        protected final SpriteProvider spriteProvider;

        public AcidFallingFactory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(DefaultParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            LeakParticle particle = new LeakParticle.ContinuousFalling(world, x, y, z, ACID, ParticleTypes.ACID_LANDING);
            particle.setSprite(this.spriteProvider);

            return particle;
        }

    }

    @Environment(EnvType.CLIENT)
    public static class AcidLandingFactory implements ParticleFactory<DefaultParticleType> {

        protected final SpriteProvider spriteProvider;

        public AcidLandingFactory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(DefaultParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            LeakParticle particle = new LeakParticle.Landing(world, x, y, z, ACID);
            particle.setSprite(this.spriteProvider);

            return particle;
        }

    }

    @Environment(EnvType.CLIENT)
    public static class ColoredWaterDrippingFactory implements ParticleFactory<ColoredWaterFluidParticleEffect> {

        protected final SpriteProvider spriteProvider;

        public ColoredWaterDrippingFactory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(ColoredWaterFluidParticleEffect parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            ParticleEffect particleEffect = ParticleEffectHelper.getFallingEffect(parameters.fluid, parameters.red, parameters.green, parameters.blue);
            LeakParticle dripping = new LeakParticle.Dripping(world, x, y, z, parameters.fluid, particleEffect);

            dripping.setColor(parameters.red, parameters.green, parameters.blue);
            dripping.setSprite(this.spriteProvider);

            return dripping;
        }

    }

    @Environment(EnvType.CLIENT)
    public static class ColoredWaterFallingFactory implements ParticleFactory<ColoredWaterFluidParticleEffect> {

        protected final SpriteProvider spriteProvider;

        public ColoredWaterFallingFactory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(ColoredWaterFluidParticleEffect parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            ParticleEffect particleEffect = ParticleEffectHelper.getSplashingEffect(parameters.fluid, parameters.red, parameters.green, parameters.blue);
            LeakParticle particle = new LeakParticle.ContinuousFalling(world, x, y, z, parameters.fluid, particleEffect);

            particle.setColor(parameters.red, parameters.green, parameters.blue);
            particle.setSprite(this.spriteProvider);

            return particle;
        }

    }

    @Environment(EnvType.CLIENT)
    public static class ColoredWaterSplashingFactory implements ParticleFactory<ColoredWaterFluidParticleEffect> {

        protected final SpriteProvider spriteProvider;

        public ColoredWaterSplashingFactory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(ColoredWaterFluidParticleEffect parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            WaterSplashParticle particle = new WaterSplashParticle(world, x, y, z, velocityX, velocityY, velocityZ);

            particle.setColor(parameters.red, parameters.green, parameters.blue);
            particle.setSprite(this.spriteProvider);

            return particle;
        }

    }

}
