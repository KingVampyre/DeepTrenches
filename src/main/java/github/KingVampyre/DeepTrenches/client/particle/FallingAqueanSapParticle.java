package github.KingVampyre.DeepTrenches.client.particle;

import net.minecraft.client.particle.BlockLeakParticle;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.fluid.Fluid;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.MathHelper;

public class FallingAqueanSapParticle extends BlockLeakParticle.ContinuousFalling {

    public FallingAqueanSapParticle(ClientWorld clientWorld, double x, double y, double z, Fluid fluid, ParticleEffect particleEffect) {
        super(clientWorld, x, y, z, fluid, particleEffect);
    }

    @Override
    protected void updateVelocity() {

        if (this.onGround) {
            this.markDead();
            this.world.addParticle(this.nextParticle, this.x, this.y, this.z, 0, 0, 0);
            float f = MathHelper.nextBetween(this.random, 0.3F, 1.0F);
            // TODO AQUEAN SAP DRIP SOUND
            this.world.playSound(this.x, this.y, this.z, SoundEvents.BLOCK_BEEHIVE_DRIP, SoundCategory.BLOCKS, f, 1.0F, false);
        }

    }

}
