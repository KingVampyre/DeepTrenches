package github.KingVampyre.DeepTrenches.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import static net.minecraft.item.Items.SHEARS;
import static net.minecraft.sound.SoundCategory.BLOCKS;
import static net.minecraft.sound.SoundEvents.BLOCK_PUMPKIN_CARVE;
import static net.minecraft.util.math.Direction.Axis.Y;

public abstract class CarvingBlock extends Block {

    public CarvingBlock(Settings settings) {
        super(settings);
    }

    public abstract BlockState getCarvedState(Direction direction);

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack stack = player.getStackInHand(hand);

        if (stack.getItem() == SHEARS) {

            if (!world.isClient) {
                Direction side = hit.getSide();
                Direction horizontal = player.getHorizontalFacing();
                Direction direction = side.getAxis() == Y ? horizontal.getOpposite() : side;

                BlockState carvedState = this.getCarvedState(direction);

                world.playSound(null, pos, BLOCK_PUMPKIN_CARVE, BLOCKS, 1.0F, 1.0F);
                world.setBlockState(pos, carvedState);
            }

            return ActionResult.success(world.isClient);
        }

        return super.onUse(state, world, pos, player, hand, hit);
    }

}
