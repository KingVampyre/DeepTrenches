package github.KingVampyre.DeepTrenches.core.block.enums;

import github.KingVampyre.DeepTrenches.core.init.DTBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.StringIdentifiable;

public enum IlmiumType implements StringIdentifiable {
    BLACK_MARBLE,
    BLUE_STORCERACK,
    GRAY_MARBLE,
    INFINITAL_STONE,
    LUSHINE,
    LUSTRITE,
    MARBLE,
    PINKINE,
    STORCENDITE,
    STORCERACK,
    VERDINE,
    VIRDAL_STONE;

    public static IlmiumType from(Block block) {

        if(DTBlocks.BLACK_MARBLE == block)
            return BLACK_MARBLE;
        else if(DTBlocks.BLUE_STORCERACK == block)
            return BLUE_STORCERACK;
        else if(DTBlocks.GRAY_MARBLE == block)
            return GRAY_MARBLE;
        else if(DTBlocks.INFINITAL_STONE == block)
            return INFINITAL_STONE;
        else if(DTBlocks.LUSHINE == block)
            return LUSHINE;
        else if(DTBlocks.LUSTRITE == block)
            return LUSTRITE;
        else if(DTBlocks.PINKINE == block)
            return PINKINE;
        else if(DTBlocks.STORCENDITE == block)
            return STORCENDITE;
        else if(DTBlocks.STORCERACK == block)
            return STORCERACK;
        else if(DTBlocks.VERDINE == block)
            return VERDINE;
        else if(DTBlocks.VIRDAL_STONE == block)
            return VIRDAL_STONE;

        return null;
    }

    public Block asBlock() {
        return switch (this) {
            case BLACK_MARBLE -> DTBlocks.BLACK_MARBLE;
            case BLUE_STORCERACK -> DTBlocks.BLUE_STORCERACK;
            case GRAY_MARBLE -> DTBlocks.GRAY_MARBLE;
            case INFINITAL_STONE -> DTBlocks.INFINITAL_STONE;
            case LUSHINE -> DTBlocks.LUSHINE;
            case LUSTRITE -> DTBlocks.LUSTRITE;
            case MARBLE -> DTBlocks.MARBLE;
            case PINKINE -> DTBlocks.PINKINE;
            case STORCENDITE -> DTBlocks.STORCENDITE;
            case STORCERACK -> DTBlocks.STORCERACK;
            case VERDINE -> DTBlocks.VERDINE;
            case VIRDAL_STONE -> DTBlocks.VIRDAL_STONE;
        };

    }

    public String asString() {
        return this.name().toLowerCase();
    }

}
