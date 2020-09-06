package github.KingVampyre.DeepTrenches.common.block;

import github.KingVampyre.DeepTrenches.common.block.entity.ModSignBlockEntity;
import net.minecraft.block.SignBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.SignType;
import net.minecraft.world.BlockView;

public class ModSignBlock extends SignBlock {

	public ModSignBlock(Settings settings, SignType type) {
		super(settings, type);
	}

	@Override
	public BlockEntity createBlockEntity(BlockView view) {
		return new ModSignBlockEntity();
	}

}
