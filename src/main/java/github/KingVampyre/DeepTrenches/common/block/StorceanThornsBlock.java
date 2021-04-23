package github.KingVampyre.DeepTrenches.common.block;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static github.KingVampyre.DeepTrenches.core.init.DamageSources.STORCEAN_THORNS;

public abstract class StorceanThornsBlock extends FanPlantBlock {

    public StorceanThornsBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        entity.damage(STORCEAN_THORNS, 3);
    }

}
