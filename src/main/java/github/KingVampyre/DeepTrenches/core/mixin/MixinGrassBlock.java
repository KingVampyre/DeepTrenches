package github.KingVampyre.DeepTrenches.core.mixin;

import github.KingVampyre.DeepTrenches.core.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.GrassBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(GrassBlock.class)
public class MixinGrassBlock {

    @Redirect(method = "grow", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/Block;getDefaultState()Lnet/minecraft/block/BlockState;"))
    public BlockState getDefaultState(Block block) {
        GrassBlock thisBlock = (GrassBlock) (Object)  this;

        return thisBlock == ModBlocks.MOSOIL ? ModBlocks.REEBLOON.getDefaultState() : Blocks.GRASS.getDefaultState();
    }

}