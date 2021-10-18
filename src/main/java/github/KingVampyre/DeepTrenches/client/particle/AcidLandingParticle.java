package github.KingVampyre.DeepTrenches.client.particle;

import net.minecraft.client.particle.BlockLeakParticle;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.fluid.Fluid;
import net.minecraft.particle.ParticleEffect;

import static github.KingVampyre.DeepTrenches.core.init.DTParticleTypes.ENTITY_NEAR_GASEOUS_ACID;

public class AcidLandingParticle extends BlockLeakParticle.ContinuousFalling {

    protected ParticleEffect smokeParticle;

    public AcidLandingParticle(ClientWorld clientWorld, double d, double e, double f, Fluid fluid, ParticleEffect particleEffect, ParticleEffect smokeParticle) {
        super(clientWorld, d, e, f, fluid, particleEffect);

        this.smokeParticle = smokeParticle;
    }

    @Override
    protected void updateVelocity() {

        if (this.onGround) {
            this.markDead();
            this.world.addParticle(this.nextParticle, this.x, this.y, this.z, 0, 0, 0);
            this.world.addParticle(this.smokeParticle, this.x, this.y + 0.25D, this.z, 0, 0, 0);
        }

    }

    @Override
    public void tick() {
        super.tick();

        if(!this.dead && this.random.nextInt(20) == 0) {
            var x = this.x + this.random.nextDouble();
            var y = this.y + 0.25D;
            var z = this.z + this.random.nextDouble();

            world.addParticle(ENTITY_NEAR_GASEOUS_ACID, x, y, z, 0, 0.05, 0);
        }

    }

}
