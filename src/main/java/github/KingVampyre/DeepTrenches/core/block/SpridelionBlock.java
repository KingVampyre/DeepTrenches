package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.core.util.entity.effect.StatusEffectHelper;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.DTDamageSources.ACID;
import static github.KingVampyre.DeepTrenches.core.init.DTBlocks.SPRILIUM;
import static github.KingVampyre.DeepTrenches.core.init.DTParticleTypes.ENTITY_CORRODED_SKULL;
import static github.KingVampyre.DeepTrenches.core.init.DTStatusEffects.GAS_CORROSION;
import static net.minecraft.world.Difficulty.PEACEFUL;

public class SpridelionBlock extends FlowerBlock {

    public SpridelionBlock(int effectDuration, Settings settings) {
        super(GAS_CORROSION, effectDuration, settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(SPRILIUM);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {

        if (!world.isClient && world.getDifficulty() != PEACEFUL && entity instanceof LivingEntity living && !living.isInvulnerableTo(ACID))
            StatusEffectHelper.addCorrosionEffect(living, GAS_CORROSION, 1, 600);

    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        VoxelShape voxelShape = this.getOutlineShape(state, world, pos, ShapeContext.absent());
        Vec3d vec3d = voxelShape.getBoundingBox().getCenter();

        double dx = (double) pos.getX() + vec3d.x;
        double dz = (double) pos.getZ() + vec3d.z;

        for(int i = 0; i < 3; ++i) {
            double x = dx + random.nextDouble() / 5;
            double y = pos.getY() + (0.5 - random.nextDouble());
            double z = dz + random.nextDouble() / 5;

            if (random.nextBoolean())
                world.addParticle(ENTITY_CORRODED_SKULL, x, y, z, 0, 0, 0);
        }

    }

}
