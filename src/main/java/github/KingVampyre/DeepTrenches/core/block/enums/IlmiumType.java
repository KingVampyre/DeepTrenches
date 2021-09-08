package github.KingVampyre.DeepTrenches.core.block.enums;

import github.KingVampyre.DeepTrenches.core.init.DTBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.Util;

import java.util.Arrays;
import java.util.function.Function;

public enum IlmiumType implements StringIdentifiable {
    BLACK_MARBLE(DTBlocks.BLACK_MARBLE),
    BLUE_STORCERACK(DTBlocks.BLUE_STORCERACK),
    GRAY_MARBLE(DTBlocks.GRAY_MARBLE),
    INFINITAL_STONE(DTBlocks.INFINITAL_STONE),
    LUSHINE(DTBlocks.LUSHINE),
    LUSTRITE(DTBlocks.LUSTRITE),
    MARBLE(DTBlocks.MARBLE),
    PINKINE(DTBlocks.PINKINE),
    STORCENDITE(DTBlocks.STORCENDITE),
    STORCERACK(DTBlocks.STORCERACK),
    VERDINE(DTBlocks.VERDINE),
    VIRDAL_STONE(DTBlocks.VIRDAL_STONE);

    private static final Function<Block, IlmiumType> ILMIUM = Util.memoize(block -> Arrays.stream(values()).filter(type -> type.block == block).findFirst().orElse(null));

    private final Block block;

    IlmiumType(Block block) {
        this.block = block;
    }

    public static IlmiumType from(Block block) {
        return ILMIUM.apply(block);
    }

    public Block asBlock() {
        return this.block;
    }

    public String asString() {
        return this.name().toLowerCase();
    }

}
