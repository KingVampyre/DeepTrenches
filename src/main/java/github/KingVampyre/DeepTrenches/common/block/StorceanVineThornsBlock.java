package github.KingVampyre.DeepTrenches.common.block;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static github.KingVampyre.DeepTrenches.core.init.entity.DTDamageSources.STORCEAN_THORNS;

public abstract class StorceanVineThornsBlock extends SpreadingVineBlock {

    public StorceanVineThornsBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        entity.damage(STORCEAN_THORNS, 3);
    }

}
