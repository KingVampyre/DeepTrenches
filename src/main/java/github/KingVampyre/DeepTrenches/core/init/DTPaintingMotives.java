package github.KingVampyre.DeepTrenches.core.init;

import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.registry.Registry;

import static net.minecraft.util.registry.Registry.PAINTING_MOTIVE;

@SuppressWarnings("unused")
public class DTPaintingMotives {

    public static final PaintingMotive BEACH;
    public static final PaintingMotive BEETHOVEN_PIANO;
    public static final PaintingMotive BEETHOVEN_UPRIGHT_PIANO;
    public static final PaintingMotive BEGONE_CREEPY;
    public static final PaintingMotive BLACK_LOOSEJAW_AND_GIANT_SEED_SHRIMP;
    public static final PaintingMotive BLACK_LOOSEJAW_IN_MARINE_SNOW;
    public static final PaintingMotive BLACK_SEADEVIL;
    public static final PaintingMotive BLOORSHROOM;
    public static final PaintingMotive BLUE_MOON_NIGHTSCAPE;
    public static final PaintingMotive BLUE_VIOLET_GARDEN;
    public static final PaintingMotive BUBBLES_AND_SNOW;
    public static final PaintingMotive CREEPERS_MORNING;
    public static final PaintingMotive DISORTED_HEAD;
    public static final PaintingMotive ICHEEL;
    public static final PaintingMotive JUNGLE;
    public static final PaintingMotive MEOWING_TRACTOR;
    public static final PaintingMotive SCUTIGERA;
    public static final PaintingMotive SOUL;
    public static final PaintingMotive STEVE_AND_BOATS;
    public static final PaintingMotive STORCEAN_ISLAND;
    public static final PaintingMotive STORMY_SEASCAPE;
    public static final PaintingMotive SUNRISE_DESERT;
    public static final PaintingMotive SUNRISE_WITH_TREES;
    public static final PaintingMotive SUNSET_AND_FLOWERS;
    public static final PaintingMotive TOOTHY_SOUL;
    public static final PaintingMotive VIOLET_POT;
    public static final PaintingMotive VIVID_FACE;
    public static final PaintingMotive VIVID_FACE_2;

    private static PaintingMotive createPaintingMotive(String id, int width, int height) {
        return Registry.register(PAINTING_MOTIVE, id, new PaintingMotive(width, height));
    }

    static {
        BEACH = createPaintingMotive("deep_trenches:beach", 64, 64);
        BEETHOVEN_PIANO = createPaintingMotive("deep_trenches:beethoven_piano", 32, 32);
        BEETHOVEN_UPRIGHT_PIANO = createPaintingMotive("deep_trenches:beethoven_upright_piano", 64, 64);
        BEGONE_CREEPY = createPaintingMotive("deep_trenches:begone_creepy", 16, 16);
        BLACK_LOOSEJAW_AND_GIANT_SEED_SHRIMP = createPaintingMotive("deep_trenches:black_loosejaw_and_giant_seed_shrimp", 64, 64);
        BLACK_LOOSEJAW_IN_MARINE_SNOW = createPaintingMotive("deep_trenches:black_loosejaw_in_marine_snow", 64, 64);
        BLACK_SEADEVIL = createPaintingMotive("deep_trenches:black_seadevil", 64, 64);
        BLOORSHROOM = createPaintingMotive("deep_trenches:bloorshroom", 16, 16);
        BLUE_MOON_NIGHTSCAPE = createPaintingMotive("deep_trenches:blue_moon_nightscape", 64, 64);
        BLUE_VIOLET_GARDEN = createPaintingMotive("deep_trenches:blue_violet_garden", 64, 64);
        BUBBLES_AND_SNOW = createPaintingMotive("deep_trenches:bubbles_and_snow", 16, 16);
        CREEPERS_MORNING = createPaintingMotive("deep_trenches:creepers_morning", 64, 64);
        DISORTED_HEAD = createPaintingMotive("deep_trenches:disorted_head", 16, 16);
        ICHEEL = createPaintingMotive("deep_trenches:icheel", 32, 32);
        JUNGLE = createPaintingMotive("deep_trenches:jungle", 32, 32);
        MEOWING_TRACTOR = createPaintingMotive("deep_trenches:meowing_tractor", 32, 32);
        SCUTIGERA = createPaintingMotive("deep_trenches:scutigera", 64, 64);
        SOUL = createPaintingMotive("deep_trenches:soul", 32, 16);
        STEVE_AND_BOATS = createPaintingMotive("deep_trenches:steve_and_boats", 32, 16);
        STORCEAN_ISLAND = createPaintingMotive("deep_trenches:storcean_island", 32, 32);
        STORMY_SEASCAPE = createPaintingMotive("deep_trenches:stormy_seascape", 16, 16);
        SUNRISE_DESERT = createPaintingMotive("deep_trenches:sunrise_desert", 32, 16);
        SUNRISE_WITH_TREES = createPaintingMotive("deep_trenches:sunrise_with_trees", 16, 16);
        SUNSET_AND_FLOWERS = createPaintingMotive("deep_trenches:sunset_and_flowers", 64, 64);
        TOOTHY_SOUL = createPaintingMotive("deep_trenches:toothy_soul", 32, 16);
        VIOLET_POT = createPaintingMotive("deep_trenches:violet_pot", 16, 16);
        VIVID_FACE = createPaintingMotive("deep_trenches:vivid_face", 16, 16);
        VIVID_FACE_2 = createPaintingMotive("deep_trenches:vivid_face_2", 16, 16);
    }

}
