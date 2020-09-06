package github.KingVampyre.DeepTrenches.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.CoralBlock;

public class ModCoralBlock extends CoralBlock {

	protected Block deadCoralBlock;
	
	public ModCoralBlock(Block deadCoralBlock, Settings settings) {
		super(deadCoralBlock, settings);
		
		this.deadCoralBlock = deadCoralBlock;
	}

}
