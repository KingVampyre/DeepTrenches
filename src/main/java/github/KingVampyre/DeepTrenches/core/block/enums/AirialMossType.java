package github.KingVampyre.DeepTrenches.core.block.enums;

import github.KingVampyre.DeepTrenches.core.init.DTBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.StringIdentifiable;

public enum AirialMossType implements StringIdentifiable {
    ANDESITE,
    BASALT,
    BLACKSTONE,
    COARSE_DIRT,
    DIORITE,
    DIRT,
    DRITEAN,
    GRANITE,
    NETHERRACK,
    POININE,
    RHODONITE,
    SAND,
    SKYSOIL,
    SKYSTONE,
    STONE,
    STORCERACK,
    STORCENDITE;

    public static AirialMossType from(Block block) {

        if(Blocks.ANDESITE == block)
            return ANDESITE;
        else if(Blocks.BASALT == block)
            return BASALT;
        else if(Blocks.BLACKSTONE == block)
            return BLACKSTONE;
        else if(Blocks.COARSE_DIRT == block)
            return COARSE_DIRT;
        else if(Blocks.DIORITE == block)
            return DIORITE;
        else if(DTBlocks.DRITEAN == block)
            return DRITEAN;
        else if(Blocks.DIRT == block)
            return DIRT;
        else if(Blocks.GRANITE == block)
            return GRANITE;
        else if(Blocks.NETHERRACK == block)
            return NETHERRACK;
        else if(DTBlocks.POININE == block)
            return POININE;
        else if(Blocks.SAND == block)
            return SAND;
        else if(DTBlocks.SKYSOIL == block)
            return SKYSOIL;
        else if(DTBlocks.SKYSTONE == block)
            return SKYSTONE;
        else if(Blocks.STONE == block)
            return STONE;
        else if(DTBlocks.STORCERACK == block)
            return STORCERACK;
        else if(DTBlocks.STORCENDITE == block)
            return STORCENDITE;

        return null;
    }

    public Block asBlock() {
        return switch (this) {
            case ANDESITE -> Blocks.ANDESITE;
            case BASALT -> Blocks.BASALT;
            case BLACKSTONE -> Blocks.BLACKSTONE;
            case COARSE_DIRT -> Blocks.COARSE_DIRT;
            case DIORITE -> Blocks.DIORITE;
            case DIRT -> Blocks.DIRT;
            case DRITEAN -> DTBlocks.DRITEAN;
            case GRANITE -> Blocks.GRANITE;
            case NETHERRACK -> Blocks.NETHERRACK;
            case POININE -> DTBlocks.POININE;
            case RHODONITE -> DTBlocks.RHODONITE;
            case SAND -> Blocks.SAND;
            case SKYSOIL -> DTBlocks.SKYSOIL;
            case SKYSTONE -> DTBlocks.SKYSTONE;
            case STONE -> Blocks.STONE;
            case STORCERACK -> DTBlocks.STORCERACK;
            case STORCENDITE -> DTBlocks.STORCENDITE;
        };

    }
    
    public String asString() {
        return this.name().toLowerCase();
    }

}