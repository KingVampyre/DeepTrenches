package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.core.block.entity.StaspNestBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager.Builder;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import static net.minecraft.item.Items.GLASS_BOTTLE;
import static net.minecraft.state.property.Properties.HORIZONTAL_FACING;
import static net.minecraft.util.math.Direction.NORTH;

public class StaspNestBlock extends BlockWithEntity {

	public static final IntProperty AQUEAN_SAP_LEVEL = IntProperty.of("aquean_sap_level", 0 ,5);

	public StaspNestBlock(Settings settings) {
		super(settings);

		this.setDefaultState(this.stateManager.getDefaultState().with(AQUEAN_SAP_LEVEL, 0).with(HORIZONTAL_FACING, NORTH));
	}

	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {

		if (!world.isClient) {
			var stack = player.getStackInHand(hand);

			if (stack.getItem() == GLASS_BOTTLE && state.get(AQUEAN_SAP_LEVEL) == 5) {
				// TODO: Aquean Sap Bottle
				return ActionResult.CONSUME;
			}
		}

		return ActionResult.PASS;
	}

	@Override
	public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, BlockEntity blockEntity, ItemStack stack) {
		// TODO: Stasp Nest Disturb on server side
		super.afterBreak(world, player, pos, state, blockEntity, stack);
	}

	@Override
	protected void appendProperties(Builder<Block, BlockState> builder) {
		super.appendProperties(builder);

		builder.add(AQUEAN_SAP_LEVEL, HORIZONTAL_FACING);
	}

	@Nullable
	@Override
	public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		return new StaspNestBlockEntity(pos, state);
	}

}
