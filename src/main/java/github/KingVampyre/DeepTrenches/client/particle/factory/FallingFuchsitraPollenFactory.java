package github.KingVampyre.DeepTrenches.client.particle.factory;

import net.minecraft.client.particle.BlockFallingDustParticle;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;

public record FallingFuchsitraPollenFactory(
            SpriteProvider spriteProvider) implements ParticleFactory<DefaultParticleType> {

    @Override
    public Particle createParticle(DefaultParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
        return new BlockFallingDustParticle(world, x, y, z, 0.478F, 0.188F, 0.478F, this.spriteProvider);
    }

}
