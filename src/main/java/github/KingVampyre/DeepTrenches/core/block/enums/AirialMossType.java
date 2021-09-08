package github.KingVampyre.DeepTrenches.core.block.enums;

import github.KingVampyre.DeepTrenches.core.init.DTBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.Util;

import java.util.Arrays;
import java.util.function.Function;

public enum AirialMossType implements StringIdentifiable {
    ANDESITE(Blocks.ANDESITE),
    BASALT(Blocks.BASALT),
    BLACKSTONE(Blocks.BLACKSTONE),
    COARSE_DIRT(Blocks.COARSE_DIRT),
    DIORITE(Blocks.DIORITE),
    DIRT(Blocks.DIRT),
    DRITEAN(DTBlocks.DRITEAN),
    GRANITE(Blocks.GRANITE),
    NETHERRACK(Blocks.NETHERRACK),
    POININE(DTBlocks.POININE),
    RHODONITE(DTBlocks.RHODONITE),
    SAND(Blocks.SAND),
    SKYSOIL(DTBlocks.SKYSOIL),
    SKYSTONE(DTBlocks.SKYSTONE),
    STONE(Blocks.STONE),
    STORCERACK(DTBlocks.STORCERACK),
    STORCENDITE(DTBlocks.STORCENDITE);

    private static final Function<Block, AirialMossType> AIRIAL = Util.memoize(block -> Arrays.stream(values()).filter(type -> type.block == block).findFirst().orElse(null));

    private final Block block;

    AirialMossType(Block block) {
        this.block = block;
    }

    public static AirialMossType from(Block block) {
        return AIRIAL.apply(block);
    }

    public Block asBlock() {
        return this.block;
    }
    
    public String asString() {
        return this.name().toLowerCase();
    }

}