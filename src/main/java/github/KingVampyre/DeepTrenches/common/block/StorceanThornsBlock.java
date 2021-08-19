package github.KingVampyre.DeepTrenches.common.block;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static github.KingVampyre.DeepTrenches.core.init.DTDamageSources.STORCEAN_THORNS;
import static github.KingVampyre.DeepTrenches.core.init.DTProperties.FACING_EXCEPT_DOWN;
import static net.minecraft.util.math.Direction.NORTH;

public abstract class StorceanThornsBlock extends FanPlantBlock {

    public StorceanThornsBlock(Settings settings) {
        super(settings);

        this.setDefaultState(this.stateManager.getDefaultState().with(FACING_EXCEPT_DOWN, NORTH));
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        entity.damage(STORCEAN_THORNS, 3);
    }

}
