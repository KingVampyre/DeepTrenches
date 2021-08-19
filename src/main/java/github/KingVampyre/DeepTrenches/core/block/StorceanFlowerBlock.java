package github.KingVampyre.DeepTrenches.core.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerBlock;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import static github.KingVampyre.DeepTrenches.core.init.DTBlockTags.DRITEAN;

public class StorceanFlowerBlock extends FlowerBlock {

	public StorceanFlowerBlock(StatusEffect suspiciousStewEffect, int effectDuration, Settings settings) {
		super(suspiciousStewEffect, effectDuration, settings);
	}

	@Override
	protected boolean canPlantOnTop(BlockState floor, BlockView view, BlockPos pos) {
		return floor.isIn(DRITEAN);
	}

}
