package github.KingVampyre.DeepTrenches.client.particle.factory;

import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.SpellParticle;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;
import org.jetbrains.annotations.NotNull;

public record AmbientEntitySpellParticleFactory(SpriteProvider spriteProvider) implements ParticleFactory<DefaultParticleType> {

    @Override
    public @NotNull Particle createParticle(DefaultParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
        var particle = new SpellParticle(world, x, y, z, velocityX, velocityY, velocityZ, spriteProvider);
        particle.setColorAlpha(0.15F);

        return particle;
    }

}
