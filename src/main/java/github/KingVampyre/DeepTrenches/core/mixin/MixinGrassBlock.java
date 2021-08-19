package github.KingVampyre.DeepTrenches.core.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.GrassBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import static github.KingVampyre.DeepTrenches.core.init.DTBlocks.*;
import static net.minecraft.block.Blocks.GRASS;

@Mixin(GrassBlock.class)
public class MixinGrassBlock {

    @Redirect(method = "grow", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/Block;getDefaultState()Lnet/minecraft/block/BlockState;"))
    public BlockState getDefaultState(Block block) {
        GrassBlock thisBlock = (GrassBlock) (Object)  this;

        if(thisBlock == AIRIAL_MOSS)
            return AIRIAL_BUSH.getDefaultState();

        if(thisBlock == ENROTIUM)
            return HARSHLES.getDefaultState();

        if(thisBlock == MOSOIL)
            return REEBLOON.getDefaultState();

        if(thisBlock == SPRILIUM)
            return SQUISH_TIPS.getDefaultState();

        return GRASS.getDefaultState();
    }

}