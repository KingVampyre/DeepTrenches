package github.KingVampyre.DeepTrenches.core.block.entity;

import static github.KingVampyre.DeepTrenches.core.init.BlockEntityTypes.STASP_NEST;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.Tickable;

public class StaspNestBlockEntity extends BlockEntity implements Tickable {

	public StaspNestBlockEntity() {
		super(STASP_NEST);
	}

	@Override
	public void tick() {

	}

}
