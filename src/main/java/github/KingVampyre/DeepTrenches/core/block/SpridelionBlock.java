package github.KingVampyre.DeepTrenches.core.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.DamageSources.ACID;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.SPRILIUM;
import static github.KingVampyre.DeepTrenches.core.init.ParticleTypes.AMBIENT_CORRODED_SKULL;
import static github.KingVampyre.DeepTrenches.core.init.ParticleTypes.ENTITY_CORRODED_SKULL;
import static github.KingVampyre.DeepTrenches.core.init.StatusEffects.GASEOUS_CORROSION;
import static net.minecraft.world.Difficulty.PEACEFUL;

public class SpridelionBlock extends FlowerBlock {

    public SpridelionBlock(int effectDuration, Settings settings) {
        super(GASEOUS_CORROSION, effectDuration, settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(SPRILIUM);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {

        if (!world.isClient && world.getDifficulty() != PEACEFUL && entity instanceof LivingEntity) {
            LivingEntity living = (LivingEntity) entity;

            if (!living.isInvulnerableTo(ACID))
                living.addStatusEffect(new StatusEffectInstance(GASEOUS_CORROSION, 900));

        }

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
