package github.KingVampyre.DeepTrenches.common.block;

import github.KingVampyre.DeepTrenches.common.block.entity.ModSignBlockEntity;
import net.minecraft.block.WallSignBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.SignType;
import net.minecraft.world.BlockView;

public class ModWallSignBlock extends WallSignBlock  {

    public ModWallSignBlock(Settings settings, SignType signType) {
        super(settings, signType);
    }

    @Override
    public BlockEntity createBlockEntity(BlockView view) {
        return new ModSignBlockEntity();
    }

}
