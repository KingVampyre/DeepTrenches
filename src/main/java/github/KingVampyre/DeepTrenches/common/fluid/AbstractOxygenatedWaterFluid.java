package github.KingVampyre.DeepTrenches.common.fluid;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.fluid.FluidState;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

import static net.minecraft.sound.SoundCategory.BLOCKS;
import static net.minecraft.sound.SoundEvents.BLOCK_WATER_AMBIENT;

public abstract class AbstractOxygenatedWaterFluid extends AbstractWaterFluid implements OxygenatedFluid {

    @Override
    public void randomDisplayTick(World world, BlockPos pos, FluidState state, Random random) {

        if (!state.isStill() && !state.get(FALLING)) {
            if (random.nextInt(64) == 0) {
                world.playSound(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, BLOCK_WATER_AMBIENT, BLOCKS, random.nextFloat() * 0.25F + 0.75F, random.nextFloat() + 0.5F, false);
            }
        }

        ParticleEffect particleEffect = this.getUnderwaterParticle(random);

        if (state.isStill() && particleEffect != null)
            world.addParticle(particleEffect, pos.getX() + random.nextDouble(), pos.getY() + random.nextDouble(), pos.getZ() + random.nextDouble(), 0.0D, 0.0D, 0.0D);

    }

    @Environment(EnvType.CLIENT)
    @Nullable
    protected abstract ParticleEffect getUnderwaterParticle(Random random);

}
