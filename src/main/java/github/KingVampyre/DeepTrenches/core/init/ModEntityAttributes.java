package github.KingVampyre.DeepTrenches.core.init;

import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;

public class ModEntityAttributes {

    public static final EntityAttribute BLINK_INTERVAL = new ClampedEntityAttribute("dragonfish.blink.interval", 10, 1, 16);
    public static final EntityAttribute BLINK_RANGE = new ClampedEntityAttribute( "dragonfish.blink.range", 14, 1, 16);
    public static final EntityAttribute BLINK_DELAY = new ClampedEntityAttribute( "dragonfish.blink.delay", 100, 1, 1000);
    public static final EntityAttribute MAX_BLINKS = new ClampedEntityAttribute( "dragonfish.blink.max_blinks", 8, 1, 16);
    public static final EntityAttribute MIN_BLINKS = new ClampedEntityAttribute( "dragonfish.blink.min_blinks", 14, 1, 16);

    public static final EntityAttribute LURE_ATTRACTION = new ClampedEntityAttribute( "dragonfish.lure.attraction", 14, 1, 16);
    public static final EntityAttribute LURE_DELAY = new ClampedEntityAttribute( "dragonfish.lure.delay", 100, 1, 1000);
    public static final EntityAttribute LURE_MAX_LIT = new ClampedEntityAttribute( "dragonfish.lure.max_lit", 10, 1, 1000);
    public static final EntityAttribute LURE_MAX_UNLIT = new ClampedEntityAttribute( "dragonfish.lure.max_unlit", 10, 1, 1000);
    public static final EntityAttribute LURE_MIN_LIT = new ClampedEntityAttribute( "dragonfish.lure.min_lit", 10, 1, 1000);
    public static final EntityAttribute LURE_MIN_UNLIT = new ClampedEntityAttribute( "dragonfish.lure.min_unlit", 10, 1, 1000);
    public static final EntityAttribute MAX_LURING = new ClampedEntityAttribute( "dragonfish.lure.max_luring", 8, 1, 16);
    public static final EntityAttribute MIN_LURING = new ClampedEntityAttribute( "dragonfish.lure.min_luring", 14, 1, 16);

    public static final EntityAttribute PREY_DETECTION = new ClampedEntityAttribute( "dragonfish.prey_detection", 5, 1, 16);

    public static final EntityAttribute SUBORBITAL_DELAY = new ClampedEntityAttribute("loosejaw.suborbital.delay", 100, 1, 1000);
    public static final EntityAttribute SUBORBITAL_MAX_LIT = new ClampedEntityAttribute("loosejaw.suborbital.maxLit", 1, 1, 200);
    public static final EntityAttribute SUBORBITAL_MIN_LIT = new ClampedEntityAttribute( "loosejaw.suborbital.minLit", 1, 1, 100);

}
