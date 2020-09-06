package github.KingVampyre.DeepTrenches.core.block;

import static net.minecraft.item.Items.GLASS_BOTTLE;

import github.KingVampyre.DeepTrenches.core.block.entity.StaspNestBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager.Builder;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class StaspNestBlock extends BlockWithEntity {

	public static final BooleanProperty SAP = BooleanProperty.of("sap");

	public StaspNestBlock(Settings settings) {
		super(settings);

		this.setDefaultState(this.stateManager.getDefaultState().with(SAP, false));

	}

	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {

		if (!world.isClient) {
			ItemStack stack = player.getStackInHand(hand);

			if (stack.getItem() == GLASS_BOTTLE && state.get(SAP)) {
				// TODO: Aquean Sap Bottle
				return ActionResult.CONSUME;
			}
		}

		return ActionResult.PASS;
	}

	@Override
	public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, BlockEntity blockEntity,
			ItemStack stack) {

		if (!world.isClient()) {
			// TODO: Stasp Nest Disturb
		}

		super.afterBreak(world, player, pos, state, blockEntity, stack);
	}

	@Override
	protected void appendProperties(Builder<Block, BlockState> builder) {
		super.appendProperties(builder);

		builder.add(SAP);
	}

	@Override
	public BlockEntity createBlockEntity(BlockView view) {
		return new StaspNestBlockEntity();
	}

}
