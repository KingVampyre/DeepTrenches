package github.KingVampyre.DeepTrenches.core.block.enums;

import github.KingVampyre.DeepTrenches.core.init.ModBlocks;
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

    public static AirialMossType getType(String name) {

        for (AirialMossType type : AirialMossType.values())
            if (type.asString().equals(name))
                return type;

        return null;
    }

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
        else if(ModBlocks.DRITEAN == block)
            return DRITEAN;
        else if(Blocks.DIRT == block)
            return DIRT;
        else if(Blocks.GRANITE == block)
            return GRANITE;
        else if(Blocks.NETHERRACK == block)
            return NETHERRACK;
        else if(ModBlocks.POININE == block)
            return POININE;
        else if(Blocks.SAND == block)
            return SAND;
        else if(ModBlocks.SKYSOIL == block)
            return SKYSOIL;
        else if(ModBlocks.SKYSTONE == block)
            return SKYSTONE;
        else if(Blocks.STONE == block)
            return STONE;
        else if(ModBlocks.STORCERACK == block)
            return STORCERACK;
        else if(ModBlocks.STORCENDITE == block)
            return STORCENDITE;

        return null;
    }

    public Block asBlock() {

        switch (this) {
            case ANDESITE:
                return Blocks.ANDESITE;
            case BASALT:
                return Blocks.BASALT;
            case BLACKSTONE:
                return Blocks.BLACKSTONE;
            case COARSE_DIRT:
                return Blocks.COARSE_DIRT;
            case DIORITE:
                return Blocks.DIORITE;
            case DIRT:
                return Blocks.DIRT;
            case DRITEAN:
                return ModBlocks.DRITEAN;
            case GRANITE:
                return Blocks.GRANITE;
            case NETHERRACK:
                return Blocks.NETHERRACK;
            case POININE:
                return ModBlocks.POININE;
            case RHODONITE:
                return ModBlocks.RHODONITE;
            case SAND:
                return Blocks.SAND;
            case SKYSOIL:
                return ModBlocks.SKYSOIL;
            case SKYSTONE:
                return ModBlocks.SKYSTONE;
            case STONE:
                return Blocks.STONE;
            case STORCERACK:
                return ModBlocks.STORCERACK;
            case STORCENDITE:
                return ModBlocks.STORCENDITE;
            default:
                return null;
        }

    }
    
    public String asString() {
        return this.name().toLowerCase();
    }

}