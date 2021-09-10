package github.KingVampyre.DeepTrenches.core.mixin;

import github.KingVampyre.DeepTrenches.common.block.AbstractPointedStone;
import net.minecraft.block.AbstractCauldronBlock;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(AbstractCauldronBlock.class)
public class MixinAbstractCauldronBlock {

    @Inject(method = "scheduledTick", at = @At("HEAD"), cancellable = true)
    private void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random, CallbackInfo ci) {
        var tipPos = AbstractPointedStone.getDripPos(world, pos);
        var cauldronBlock = (AbstractCauldronBlock) (Object) this;

        if (tipPos != null) {
            var tipState = world.getBlockState(tipPos);
            var block = (AbstractPointedStone) tipState.getBlock();
            var fluid = block.getFlowableFluid(world, tipPos, tipState);

            if (fluid != Fluids.EMPTY && cauldronBlock.canBeFilledByDripstone(fluid))
                cauldronBlock.fillFromDripstone(state, world, pos, fluid);

        }

    }

}
