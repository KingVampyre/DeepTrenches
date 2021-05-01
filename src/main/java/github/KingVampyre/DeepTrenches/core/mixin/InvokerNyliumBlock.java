package github.KingVampyre.DeepTrenches.core.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.NyliumBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(NyliumBlock.class)
public interface InvokerNyliumBlock {

    @Invoker("stayAlive")
    static boolean stayAlive(BlockState state, WorldView world, BlockPos pos) {
        throw new AssertionError();
    }

}
