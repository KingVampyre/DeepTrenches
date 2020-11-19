package github.KingVampyre.DeepTrenches.core.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.SpreadableBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(SpreadableBlock.class)
public interface SpreadableBlockInvoker {

    @Invoker("canSurvive")
    static boolean canSurvive(BlockState state, WorldView worldView, BlockPos pos) {
        throw new AssertionError();
    }

    @Invoker("canSpread")
    static boolean canSpread(BlockState state, WorldView worldView, BlockPos pos) {
        throw new AssertionError();
    }

}
