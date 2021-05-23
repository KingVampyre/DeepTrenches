package github.KingVampyre.DeepTrenches.core.init;

import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.util.registry.Registry;

import static net.minecraft.util.registry.Registry.ATTRIBUTE;

public class ModEntityAttributes {

    public static final EntityAttribute BLINK_INTERVAL;
    public static final EntityAttribute BLINK_RANGE;
    public static final EntityAttribute BLINK_DELAY;
    public static final EntityAttribute MAX_BLINKS;
    public static final EntityAttribute MAX_LURING;
    public static final EntityAttribute MIN_BLINKS;
    public static final EntityAttribute MIN_LURING;
    public static final EntityAttribute LURE_ATTRACTION;
    public static final EntityAttribute LURE_DELAY;
    public static final EntityAttribute LURE_MAX_LIT;
    public static final EntityAttribute LURE_MAX_UNLIT;
    public static final EntityAttribute LURE_MIN_LIT;
    public static final EntityAttribute LURE_MIN_UNLIT;
    public static final EntityAttribute PREY_DETECTION;
    public static final EntityAttribute SUBORBITAL_DELAY;
    public static final EntityAttribute SUBORBITAL_MAX_LIT;
    public static final EntityAttribute SUBORBITAL_MIN_LIT;

    private static EntityAttribute createClamped(String id, String translationKey, double fallback, double min, double max) {
        return Registry.register(ATTRIBUTE, id, new ClampedEntityAttribute(translationKey, fallback, min, max));
    }

    static {
        BLINK_INTERVAL = createClamped("deep_trenches:blink_interval", "attribute.blink.interval", 10, 0, 16);
        BLINK_RANGE = createClamped("deep_trenches:blink_range", "attribute.blink.range", 14, 1, 16);
        BLINK_DELAY = createClamped("deep_trenches:blink_delay", "attribute.blink.delay", 100, 1, 1000);
        MAX_BLINKS = createClamped("deep_trenches:max_blinks", "attribute.blink.max_blinks", 8, 1, 16);
        MAX_LURING = createClamped("deep_trenches:max_luring", "attribute.lure.max_luring", 8, 1, 16);
        MIN_BLINKS = createClamped("deep_trenches:min_blinks", "attribute.blink.min_blinks", 14, 1, 16);
        MIN_LURING = createClamped("deep_trenches:min_luring", "attribute.lure.min_luring", 14, 1, 16);
        LURE_ATTRACTION = createClamped("deep_trenches:lure_attraction", "attribute.lure.attraction", 14, 1, 16);
        LURE_DELAY = createClamped("deep_trenches:lure_delay", "attribute.lure.delay", 100, 1, 1000);
        LURE_MAX_LIT = createClamped("deep_trenches:lure_max_lit", "attribute.lure.max_lit", 10, 1, 1000);
        LURE_MAX_UNLIT = createClamped("deep_trenches:lure_max_unlit", "attribute.lure.max_unlit", 10, 1, 1000);
        LURE_MIN_LIT = createClamped("deep_trenches:lure_min_lit", "attribute.lure.min_lit", 10, 1, 1000);
        LURE_MIN_UNLIT = createClamped("deep_trenches:lure_min_unlit", "attribute.lure.min_unlit", 10, 1, 1000);
        PREY_DETECTION = createClamped("deep_trenches:prey_detection", "attribute.prey_detection", 5, 1, 16);
        SUBORBITAL_DELAY = createClamped("deep_trenches:suborbital_delay", "loosejaw.suborbital.delay", 100, 1, 1000);
        SUBORBITAL_MAX_LIT = createClamped("deep_trenches:suborbital_max_lit", "loosejaw.suborbital.maxLit", 1, 1, 200);
        SUBORBITAL_MIN_LIT = createClamped("deep_trenches:suborbital_min_lit", "loosejaw.suborbital.minLit", 1, 1, 100);
    }

}
