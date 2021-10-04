package github.KingVampyre.DeepTrenches.core.mixin;

import net.minecraft.block.AbstractLichenBlock;
import net.minecraft.block.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(AbstractLichenBlock.class)
public interface InvokerAbstractLichenBlock {

    @Invoker("isNotFullBlock")
    static boolean isNotFullBlock(BlockState state) {
        throw new AssertionError();
    }

}