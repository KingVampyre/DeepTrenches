package github.KingVampyre.DeepTrenches.common.block;

import github.KingVampyre.DeepTrenches.common.block.entity.CustomSignBlockEntity;
import net.minecraft.block.SignBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.SignType;
import net.minecraft.world.BlockView;

public class CustomSignBlock extends SignBlock {

    public CustomSignBlock(Settings settings, SignType signType) {
        super(settings, signType);
    }

    @Override
    public BlockEntity createBlockEntity(BlockView world) {
        return new CustomSignBlockEntity();
    }

}
