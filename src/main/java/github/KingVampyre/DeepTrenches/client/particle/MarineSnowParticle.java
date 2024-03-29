package github.KingVampyre.DeepTrenches.client.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.particle.WaterSuspendParticle;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import static net.minecraft.tag.FluidTags.WATER;

public class MarineSnowParticle extends WaterSuspendParticle {

    public MarineSnowParticle(ClientWorld world, SpriteProvider spriteProvider, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
        super(world, spriteProvider, x, y, z);

        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.velocityZ = velocityZ;
    }

    @Override
    public void tick() {
        super.tick();

        var pos = new BlockPos(this.x, this.y, this.z);

        if (!this.world.getFluidState(pos).isIn(WATER))
            this.markDead();
    }

    @Environment(EnvType.CLIENT)
    public static record Factory(
            SpriteProvider spriteProvider) implements ParticleFactory<DefaultParticleType> {

        @Override
        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
            var velocity = (float) (clientWorld.random.nextGaussian() * 9.999999747378752E-5D + (Math.random() - 1.0D) * 0.4000000059604645D);

            var factor = (float) (Math.random() + Math.random() + 1.0D) * 0.15F;
            var sqrt = MathHelper.sqrt(velocity * velocity);
            var velocityY = velocity / (double) sqrt * (double) factor * 0.4000000059604645D;

            var particle = new MarineSnowParticle(clientWorld, this.spriteProvider, d, e, f, 0, velocityY, 0);
            particle.setSprite(this.spriteProvider);

            return particle;
        }

    }
}
