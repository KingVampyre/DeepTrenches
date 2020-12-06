package github.KingVampyre.DeepTrenches.core.entity.ai.pathing;

import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import net.minecraft.block.BlockState;
import net.minecraft.entity.ai.pathing.BirdNavigation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StaspNavigation extends BirdNavigation {

    public StaspNavigation(StaspEntity stasp, World world) {
        super(stasp, world);
    }

    @Override
    public boolean isValidPosition(BlockPos pos) {
        BlockPos down = pos.down();
        BlockState state = this.world.getBlockState(down);

        return !state.isAir();
    }

    @Override
    public void tick() {
        StaspEntity stasp = (StaspEntity) this.entity;

        // TODO if is not pollinating
        super.tick();
    }

}
