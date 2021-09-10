package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.common.item.TagFishBucketItem;
import github.KingVampyre.DeepTrenches.common.item.TagSpawnEggItem;
import github.KingVampyre.DeepTrenches.core.item.*;
import github.Louwind.entityutils.core.item.FabricBoatItem;
import github.Louwind.entityutils.core.util.FabricBoatType;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.*;
import net.minecraft.item.Item.Settings;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.Tag;
import net.minecraft.util.registry.Registry;

import java.util.function.Function;

import static github.KingVampyre.DeepTrenches.core.init.DTBlocks.*;
import static github.KingVampyre.DeepTrenches.core.init.DTFoodComponents.STORCEAN_FISH;
import static github.KingVampyre.DeepTrenches.core.init.DTItemGroups.*;
import static net.minecraft.fluid.Fluids.WATER;
import static net.minecraft.item.FoodComponents.APPLE;
import static net.minecraft.item.FoodComponents.SWEET_BERRIES;
import static net.minecraft.item.Item.BLOCK_ITEMS;
import static net.minecraft.item.Items.BUCKET;
import static net.minecraft.util.registry.Registry.ITEM;

public class DTItems {

	/* FISH BUCKETS */
	public static final Item BARBELED_LOOSEJAW_BUCKET;
	public static final Item BETTA_BUCKET;
	public static final Item BLACK_LOOSEJAW_BUCKET;
	public static final Item DEEP_LAKE_BETTA_BUCKET;
	public static final Item GIANT_HATCHETFISH_BUCKET;
	public static final Item LIGHT_LOOSEJAW_BUCKET;
	public static final Item SMALLTOOTH_DRAGONFISH_BUCKET;

	/* FLUID BUCKETS */
	public static final Item ABYSSOPELAGIC_WATER_BUCKET;
	public static final Item ACID_BUCKET;
	public static final Item BATHYPELAGIC_WATER_BUCKET;
	public static final Item BRINE_BUCKET;
	public static final Item CLEAR_WATER_BUCKET;
	public static final Item HADOPELAGIC_WATER_BUCKET;
	public static final Item MESOPELAGIC_WATER_BUCKET;
	public static final Item STORCEAN_ABYSSOPELAGIC_WATER_BUCKET;
	public static final Item STORCEAN_BATHYPELAGIC_WATER_BUCKET;
	public static final Item STORCEAN_ENDERPELAGIC_WATER_BUCKET;
	public static final Item STORCEAN_GASOPELAGIC_WATER_BUCKET;
	public static final Item STORCEAN_HADOPELAGIC_WATER_BUCKET;
	public static final Item STORCEAN_INFINIPELAGIC_WATER_BUCKET;
	public static final Item STORCEAN_MESOPELAGIC_WATER_BUCKET;
	public static final Item STORCEAN_VIRDIPELAGIC_WATER_BUCKET;
	public static final Item STORCEAN_WATER_BUCKET;

	/* SPAWN EGGS */
	public static final Item BARBELED_LOOSEJAW_SPAWN_EGG;
	public static final Item BETTA_SPAWN_EGG;
	public static final Item BLACK_LOOSEJAW_SPAWN_EGG;
	public static final Item DEEP_LAKE_BETTA_SPAWN_EGG;
	public static final Item GIANT_HATCHETFISH_SPAWN_EGG;
	public static final Item LIGHT_LOOSEJAW_SPAWN_EGG;
	public static final Item SMALLTOOTH_DRAGONFISH_SPAWN_EGG;
	public static final Item STASP_SPAWN_EGG;

	/* FRUITS */
	public static final Item ALMOND;
	public static final Item ALMOND_DRUPE;
	public static final Item AQUEAN_SAP;
	public static final Item BOTTLE_OF_AQUEAN_SAP;
	public static final Item CHERRY;
	public static final Item CROLOOD_FRUIT;
	public static final Item DARK_CROLOOD_FRUIT;
	public static final Item PERSIMMON_FRUIT;
	public static final Item PIN_CHERRY;
	public static final Item PLUM;
	public static final Item THUNDERCLOUD_PLUM;

	/* BOAT */
	public static final Item ALMOND_BOAT;
	public static final Item ANAMEATA_BOAT;
	public static final Item ANGELS_TRUMPET_BOAT;
	public static final Item AQUEAN_BOAT;
	public static final Item BARSHROOKLE_BOAT;
	public static final Item BLACK_BIRCH_BOAT;
	public static final Item BLUE_MAHOE_BOAT;
	public static final Item BLUE_SPRUCE_BOAT;
	public static final Item BOTTLEBRUSH_BOAT;
	public static final Item BROMYA_BOAT;
	public static final Item BUBBLETREE_BOAT;
	public static final Item CALCEARB_BOAT;
	public static final Item CHERRY_BOAT;
	public static final Item CHOTORN_BOAT;
	public static final Item COOK_PINE_BOAT;
	public static final Item CROLOOD_BOAT;
	public static final Item DARK_CROLOOD_BOAT;
	public static final Item DARK_FUCHSITRA_BOAT;
	public static final Item DARK_RED_ELM_BOAT;
	public static final Item DEAD_WART_TREE_BOAT;
	public static final Item DRIGYUS_BOAT;
	public static final Item EBONY_BOAT;
	public static final Item ENDERHEART_BOAT;
	public static final Item FLALM_BOAT;
	public static final Item FRUCE_BOAT;
	public static final Item FUCHSITRA_BOAT;
	public static final Item FUGMOS_BOAT;
	public static final Item FUNERANITE_BOAT;
	public static final Item GHOSHROOM_BOAT;
	public static final Item GIANT_VIOLET_BOAT;
	public static final Item GUAIACUM_BOAT;
	public static final Item JOSHUA_BOAT;
	public static final Item KLINKII_PINE_BOAT;
	public static final Item MELALEUCA_BOAT;
	public static final Item MURKANTUAN_BOAT;
	public static final Item NORFOLK_PINE_BOAT;
	public static final Item OBSCRUS_BOAT;
	public static final Item ORHPRIS_BOAT;
	public static final Item PELTOGYNE_BOAT;
	public static final Item PIN_CHERRY_BOAT;
	public static final Item PLUM_BOAT;
	public static final Item PURFUNGA_BOAT;
	public static final Item RARK_BOAT;
	public static final Item RED_ELM_BOAT;
	public static final Item RHADI_BOAT;
	public static final Item SANGUART_BOAT;
	public static final Item SCARLET_THIORCEN_BOAT;
	public static final Item SEQUOIA_BOAT;
	public static final Item SPROOM_BOAT;
	public static final Item STORTREEAN_BOAT;
	public static final Item STROOMEAN_BOAT;
	public static final Item SUNRISE_FUNGUS_BOAT;
	public static final Item TARK_BOAT;
	public static final Item TEAK_BOAT;
	public static final Item THUNDERCLOUD_PLUM_BOAT;
	public static final Item VYNHERT_BOAT;
	public static final Item WART_TREE_BOAT;
	public static final Item WENGE_BOAT;
	public static final Item YEW_BOAT;

	/* STICK */
	public static final Item ALMOND_STICK;
	public static final Item ANAMEATA_STICK;
	public static final Item ANGELS_TRUMPET_STICK;
	public static final Item AQUEAN_STICK;
	public static final Item BARSHROOKLE_STICK;
	public static final Item BLACK_BIRCH_STICK;
	public static final Item BLUE_MAHOE_STICK;
	public static final Item BLUE_SPRUCE_STICK;
	public static final Item BOTTLEBRUSH_STICK;
	public static final Item BROMYA_STICK;
	public static final Item BUBBLETREE_STICK;
	public static final Item CALCEARB_STICK;
	public static final Item CHERRY_STICK;
	public static final Item CHOTORN_STICK;
	public static final Item COOK_PINE_STICK;
	public static final Item CROLOOD_STICK;
	public static final Item DARK_CROLOOD_STICK;
	public static final Item DARK_FUCHSITRA_STICK;
	public static final Item DARK_RED_ELM_STICK;
	public static final Item DEAD_WART_TREE_STICK;
	public static final Item DRIGYUS_STICK;
	public static final Item EBONY_STICK;
	public static final Item ENDERHEART_STICK;
	public static final Item FLALM_STICK;
	public static final Item FRUCE_STICK;
	public static final Item FUCHSITRA_STICK;
	public static final Item FUGMOS_STICK;
	public static final Item FUNERANITE_STICK;
	public static final Item GHOSHROOM_STICK;
	public static final Item GIANT_VIOLET_STICK;
	public static final Item GUAIACUM_STICK;
	public static final Item JOSHUA_STICK;
	public static final Item KLINKII_PINE_STICK;
	public static final Item MELALEUCA_STICK;
	public static final Item GYLDELION_STICK;
	public static final Item MURKANTUAN_STICK;
	public static final Item NORFOLK_PINE_STICK;
	public static final Item OBSCRUS_STICK;
	public static final Item ORHPRIS_STICK;
	public static final Item PELTOGYNE_STICK;
	public static final Item PIN_CHERRY_STICK;
	public static final Item PLUM_STICK;
	public static final Item PURFUNGA_STICK;
	public static final Item RARK_STICK;
	public static final Item RED_ELM_STICK;
	public static final Item RHADI_STICK;
	public static final Item SANGUART_STICK;
	public static final Item SCARLET_THIORCEN_STICK;
	public static final Item SEQUOIA_STICK;
	public static final Item SPROOM_STICK;
	public static final Item STORTREEAN_STICK;
	public static final Item STROOMEAN_STICK;
	public static final Item SUNRISE_FUNGUS_STICK;
	public static final Item TARK_STICK;
	public static final Item TEAK_STICK;
	public static final Item THUNDERCLOUD_PLUM_STICK;
	public static final Item VYNHERT_STICK;
	public static final Item WART_TREE_STICK;
	public static final Item WENGE_STICK;
	public static final Item YEW_STICK;

	/* FOOD */
	public static final Item BARBELED_LOOSEJAW;
	public static final Item BETTA;
	public static final Item BLACK_LOOSEJAW;
	public static final Item DEEP_LAKE_BETTA;
	public static final Item GIANT_HATCHETFISH;
	public static final Item LIGHT_LOOSEJAW;
	public static final Item SMALLTOOTH_DRAGONFISH;

	/* COOKED FOOD */
	public static final Item COOKED_GIANT_HATCHETFISH;

	/* GOO's */
	public static final Item BLACK_BIOLUMINESCENT_GOO;
	public static final Item BROWN_BIOLUMINESCENT_GOO;
	public static final Item CYAN_BIOLUMINESCENT_GOO;
	public static final Item GREEN_BIOLUMINESCENT_GOO;
	public static final Item LIGHT_BLUE_BIOLUMINESCENT_GOO;
	public static final Item LIME_BIOLUMINESCENT_GOO;
	public static final Item MAGENTA_BIOLUMINESCENT_GOO;
	public static final Item ORANGE_BIOLUMINESCENT_GOO;
	public static final Item PURPLE_BIOLUMINESCENT_GOO;
	public static final Item RED_BIOLUMINESCENT_GOO;
	public static final Item WHITE_BIOLUMINESCENT_GOO;
	public static final Item YELLOW_BIOLUMINESCENT_GOO;

	/* WEAPONS */
	public static final Item ADAIGGER;
	public static final Item BORON_TROOKENT;
	public static final Item RUBY_DISTABBER;
	public static final Item MORGANITE_SABER;
	public static final Item SAPPHIRE_PRISMACE;

	public static final Item BORON_SWORD;
	public static final Item CHALCEDONY_SWORD;
	public static final Item ENRON_SWORD;
	public static final Item ENSTATITE_SWORD;
	public static final Item KRALCTIUM_SWORD;
	public static final Item SAPPHIRE_SWORD;
	public static final Item SPHENE_SWORD;
	public static final Item SPINEL_SWORD;
	public static final Item STROXITE_SWORD;
	public static final Item TANZANITE_SWORD;
	public static final Item TOPAZ_SWORD;

	public static final Item ALMOND_SWORD;
	public static final Item ANAMEATA_SWORD;
	public static final Item ANGELS_TRUMPET_SWORD;
	public static final Item AQUEAN_SWORD;
	public static final Item BARSHROOKLE_SWORD;
	public static final Item BLACK_BIRCH_SWORD;
	public static final Item BLUE_MAHOE_SWORD;
	public static final Item BLUE_SPRUCE_SWORD;
	public static final Item BOTTLEBRUSH_SWORD;
	public static final Item BROMYA_SWORD;
	public static final Item BUBBLETREE_SWORD;
	public static final Item CALCEARB_SWORD;
	public static final Item CHERRY_SWORD;
	public static final Item CHOTORN_SWORD;
	public static final Item COOK_PINE_SWORD;
	public static final Item CROLOOD_SWORD;
	public static final Item DARK_CROLOOD_SWORD;
	public static final Item DARK_FUCHSITRA_SWORD;
	public static final Item DARK_RED_ELM_SWORD;
	public static final Item DEAD_WART_TREE_SWORD;
	public static final Item DRIGYUS_SWORD;
	public static final Item EBONY_SWORD;
	public static final Item ENDERHEART_SWORD;
	public static final Item FLALM_SWORD;
	public static final Item FRUCE_SWORD;
	public static final Item FUCHSITRA_SWORD;
	public static final Item FUGMOS_SWORD;
	public static final Item FUNERANITE_SWORD;
	public static final Item GHOSHROOM_SWORD;
	public static final Item GIANT_VIOLET_SWORD;
	public static final Item GUAIACUM_SWORD;
	public static final Item JOSHUA_SWORD;
	public static final Item KLINKII_PINE_SWORD;
	public static final Item MELALEUCA_SWORD;
	public static final Item MURKANTUAN_SWORD;
	public static final Item NORFOLK_PINE_SWORD;
	public static final Item OBSCRUS_SWORD;
	public static final Item ORHPRIS_SWORD;
	public static final Item PELTOGYNE_SWORD;
	public static final Item PIN_CHERRY_SWORD;
	public static final Item PLUM_SWORD;
	public static final Item PURFUNGA_SWORD;
	public static final Item RARK_SWORD;
	public static final Item RED_ELM_SWORD;
	public static final Item RHADI_SWORD;
	public static final Item SANGUART_SWORD;
	public static final Item SCARLET_THIORCEN_SWORD;
	public static final Item SEQUOIA_SWORD;
	public static final Item SPROOM_SWORD;
	public static final Item STORTREEAN_SWORD;
	public static final Item STROOMEAN_SWORD;
	public static final Item SUNRISE_FUNGUS_SWORD;
	public static final Item TARK_SWORD;
	public static final Item TEAK_SWORD;
	public static final Item THUNDERCLOUD_PLUM_SWORD;
	public static final Item VYNHERT_SWORD;
	public static final Item WART_TREE_SWORD;
	public static final Item WENGE_SWORD;
	public static final Item YEW_SWORD;

	public static final Item AQUAMARINE_SCYTHE;
	public static final Item BORON_SCYTHE;
	public static final Item DIOPSIDE_SCYTHE;
	public static final Item GYLDELION_SCYTHE;
	public static final Item NETHERITE_SCYTHE;
	public static final Item RUBY_DISRAPPER;
	public static final Item SAPPHIRE_SCYTHE;
	public static final Item SPINEL_SCYTHE;
	public static final Item TANZANITE_SCYTHE;
	public static final Item TOPAZ_SCYTHE;
	public static final Item VOID_CRITTERED_DIOPSIDE_SCYTHE;

	public static final Item AQUAMARINE_STAFF;
	public static final Item DIOPSIDE_STAFF;
	public static final Item SPINEL_STAFF;
	public static final Item TANZANITE_STAFF;
	public static final Item TOPAZ_STAFF;
	public static final Item VOID_CRITTERED_DIOPSIDE_STAFF;

	/* METALLIC TOOLS */
	public static final Item AQUAMARINE_AXE;
	public static final Item AQUAMARINE_HOE;
	public static final Item AQUAMARINE_PICKAXE;
	public static final Item AQUAMARINE_SHOVEL;

	public static final Item BORON_AXE;
	public static final Item BORON_HOE;
	public static final Item BORON_PICKAXE;
	public static final Item BORON_SHOVEL;

	public static final Item CHALCEDONY_AXE;
	public static final Item CHALCEDONY_HOE;
	public static final Item CHALCEDONY_PICKAXE;
	public static final Item CHALCEDONY_SHOVEL;

	public static final Item CLINOHUMITE_AXE;
	public static final Item CLINOHUMITE_HOE;
	public static final Item CLINOHUMITE_PICKAXE;
	public static final Item CLINOHUMITE_SHOVEL;

	public static final Item DIOPSIDE_AXE;
	public static final Item DIOPSIDE_HOE;
	public static final Item DIOPSIDE_PICKAXE;
	public static final Item DIOPSIDE_SHOVEL;

	public static final Item ENRON_AXE;
	public static final Item ENRON_HOE;
	public static final Item ENRON_PICKAXE;
	public static final Item ENRON_SHOVEL;

	public static final Item ENSTATITE_AXE;
	public static final Item ENSTATITE_HOE;
	public static final Item ENSTATITE_PICKAXE;
	public static final Item ENSTATITE_SHOVEL;

	public static final Item GYLDELION_AXE;
	public static final Item GYLDELION_HOE;
	public static final Item GYLDELION_PICKAXE;
	public static final Item GYLDELION_SHOVEL;

	public static final Item KRALCTIUM_AXE;
	public static final Item KRALCTIUM_HOE;
	public static final Item KRALCTIUM_PICKAXE;
	public static final Item KRALCTIUM_SHOVEL;

	public static final Item MORGANITE_AXE;
	public static final Item MORGANITE_HOE;
	public static final Item MORGANITE_PICKAXE;
	public static final Item MORGANITE_SHOVEL;

	public static final Item RUBY_DISCARVER;
	public static final Item RUBY_DISDIGGER;
	public static final Item RUBY_DISLOGGER;
	public static final Item RUBY_DISTARVEST;

	public static final Item SAPPHIRE_AXE;
	public static final Item SAPPHIRE_HOE;
	public static final Item SAPPHIRE_PICKAXE;
	public static final Item SAPPHIRE_SHOVEL;

	public static final Item SILVER_AXE;
	public static final Item SILVER_HOE;
	public static final Item SILVER_PICKAXE;
	public static final Item SILVER_SHOVEL;

	public static final Item SPHENE_AXE;
	public static final Item SPHENE_HOE;
	public static final Item SPHENE_PICKAXE;
	public static final Item SPHENE_SHOVEL;

	public static final Item SPINEL_AXE;
	public static final Item SPINEL_HOE;
	public static final Item SPINEL_PICKAXE;
	public static final Item SPINEL_SHOVEL;

	public static final Item STROXITE_AXE;
	public static final Item STROXITE_HOE;
	public static final Item STROXITE_PICKAXE;
	public static final Item STROXITE_SHOVEL;

	public static final Item TANZANITE_AXE;
	public static final Item TANZANITE_HOE;
	public static final Item TANZANITE_PICKAXE;
	public static final Item TANZANITE_SHOVEL;

	public static final Item TOPAZ_AXE;
	public static final Item TOPAZ_HOE;
	public static final Item TOPAZ_PICKAXE;
	public static final Item TOPAZ_SHOVEL;

	public static final Item VOID_CRITTERED_DIOPSIDE_AXE;
	public static final Item VOID_CRITTERED_DIOPSIDE_HOE;
	public static final Item VOID_CRITTERED_DIOPSIDE_PICKAXE;
	public static final Item VOID_CRITTERED_DIOPSIDE_SHOVEL;

	/* WOODEN TOOLS */
	public static final Item ALMOND_AXE;
	public static final Item ALMOND_HOE;
	public static final Item ALMOND_PICKAXE;
	public static final Item ALMOND_SHOVEL;

	public static final Item ANAMEATA_AXE;
	public static final Item ANAMEATA_HOE;
	public static final Item ANAMEATA_PICKAXE;
	public static final Item ANAMEATA_SHOVEL;

	public static final Item ANGELS_TRUMPET_AXE;
	public static final Item ANGELS_TRUMPET_HOE;
	public static final Item ANGELS_TRUMPET_PICKAXE;
	public static final Item ANGELS_TRUMPET_SHOVEL;

	public static final Item AQUEAN_AXE;
	public static final Item AQUEAN_HOE;
	public static final Item AQUEAN_PICKAXE;
	public static final Item AQUEAN_SHOVEL;

	public static final Item BARSHROOKLE_AXE;
	public static final Item BARSHROOKLE_HOE;
	public static final Item BARSHROOKLE_PICKAXE;
	public static final Item BARSHROOKLE_SHOVEL;

	public static final Item BLACK_BIRCH_AXE;
	public static final Item BLACK_BIRCH_HOE;
	public static final Item BLACK_BIRCH_PICKAXE;
	public static final Item BLACK_BIRCH_SHOVEL;

	public static final Item BLUE_MAHOE_AXE;
	public static final Item BLUE_MAHOE_HOE;
	public static final Item BLUE_MAHOE_PICKAXE;
	public static final Item BLUE_MAHOE_SHOVEL;

	public static final Item BLUE_SPRUCE_AXE;
	public static final Item BLUE_SPRUCE_HOE;
	public static final Item BLUE_SPRUCE_PICKAXE;
	public static final Item BLUE_SPRUCE_SHOVEL;

	public static final Item BOTTLEBRUSH_AXE;
	public static final Item BOTTLEBRUSH_HOE;
	public static final Item BOTTLEBRUSH_PICKAXE;
	public static final Item BOTTLEBRUSH_SHOVEL;

	public static final Item BROMYA_AXE;
	public static final Item BROMYA_HOE;
	public static final Item BROMYA_PICKAXE;
	public static final Item BROMYA_SHOVEL;

	public static final Item BUBBLETREE_AXE;
	public static final Item BUBBLETREE_HOE;
	public static final Item BUBBLETREE_PICKAXE;
	public static final Item BUBBLETREE_SHOVEL;

	public static final Item CALCEARB_AXE;
	public static final Item CALCEARB_HOE;
	public static final Item CALCEARB_PICKAXE;
	public static final Item CALCEARB_SHOVEL;

	public static final Item CHERRY_AXE;
	public static final Item CHERRY_HOE;
	public static final Item CHERRY_PICKAXE;
	public static final Item CHERRY_SHOVEL;

	public static final Item CHOTORN_AXE;
	public static final Item CHOTORN_HOE;
	public static final Item CHOTORN_PICKAXE;
	public static final Item CHOTORN_SHOVEL;

	public static final Item COOK_PINE_AXE;
	public static final Item COOK_PINE_HOE;
	public static final Item COOK_PINE_PICKAXE;
	public static final Item COOK_PINE_SHOVEL;

	public static final Item CROLOOD_AXE;
	public static final Item CROLOOD_HOE;
	public static final Item CROLOOD_PICKAXE;
	public static final Item CROLOOD_SHOVEL;

	public static final Item DARK_CROLOOD_AXE;
	public static final Item DARK_CROLOOD_HOE;
	public static final Item DARK_CROLOOD_PICKAXE;
	public static final Item DARK_CROLOOD_SHOVEL;

	public static final Item DARK_FUCHSITRA_AXE;
	public static final Item DARK_FUCHSITRA_HOE;
	public static final Item DARK_FUCHSITRA_PICKAXE;
	public static final Item DARK_FUCHSITRA_SHOVEL;

	public static final Item DARK_RED_ELM_AXE;
	public static final Item DARK_RED_ELM_HOE;
	public static final Item DARK_RED_ELM_PICKAXE;
	public static final Item DARK_RED_ELM_SHOVEL;

	public static final Item DEAD_WART_TREE_AXE;
	public static final Item DEAD_WART_TREE_HOE;
	public static final Item DEAD_WART_TREE_PICKAXE;
	public static final Item DEAD_WART_TREE_SHOVEL;

	public static final Item DRIGYUS_AXE;
	public static final Item DRIGYUS_HOE;
	public static final Item DRIGYUS_PICKAXE;
	public static final Item DRIGYUS_SHOVEL;

	public static final Item EBONY_AXE;
	public static final Item EBONY_HOE;
	public static final Item EBONY_PICKAXE;
	public static final Item EBONY_SHOVEL;

	public static final Item ENDERHEART_AXE;
	public static final Item ENDERHEART_HOE;
	public static final Item ENDERHEART_PICKAXE;
	public static final Item ENDERHEART_SHOVEL;

	public static final Item FLALM_AXE;
	public static final Item FLALM_HOE;
	public static final Item FLALM_PICKAXE;
	public static final Item FLALM_SHOVEL;

	public static final Item FRUCE_AXE;
	public static final Item FRUCE_HOE;
	public static final Item FRUCE_PICKAXE;
	public static final Item FRUCE_SHOVEL;

	public static final Item FUCHSITRA_AXE;
	public static final Item FUCHSITRA_HOE;
	public static final Item FUCHSITRA_PICKAXE;
	public static final Item FUCHSITRA_SHOVEL;

	public static final Item FUGMOS_AXE;
	public static final Item FUGMOS_HOE;
	public static final Item FUGMOS_PICKAXE;
	public static final Item FUGMOS_SHOVEL;

	public static final Item FUNERANITE_AXE;
	public static final Item FUNERANITE_HOE;
	public static final Item FUNERANITE_PICKAXE;
	public static final Item FUNERANITE_SHOVEL;

	public static final Item GHOSHROOM_AXE;
	public static final Item GHOSHROOM_HOE;
	public static final Item GHOSHROOM_PICKAXE;
	public static final Item GHOSHROOM_SHOVEL;

	public static final Item GIANT_VIOLET_AXE;
	public static final Item GIANT_VIOLET_HOE;
	public static final Item GIANT_VIOLET_PICKAXE;
	public static final Item GIANT_VIOLET_SHOVEL;

	public static final Item GUAIACUM_AXE;
	public static final Item GUAIACUM_HOE;
	public static final Item GUAIACUM_PICKAXE;
	public static final Item GUAIACUM_SHOVEL;

	public static final Item JOSHUA_AXE;
	public static final Item JOSHUA_HOE;
	public static final Item JOSHUA_PICKAXE;
	public static final Item JOSHUA_SHOVEL;

	public static final Item KLINKII_PINE_AXE;
	public static final Item KLINKII_PINE_HOE;
	public static final Item KLINKII_PINE_PICKAXE;
	public static final Item KLINKII_PINE_SHOVEL;

	public static final Item MELALEUCA_AXE;
	public static final Item MELALEUCA_HOE;
	public static final Item MELALEUCA_PICKAXE;
	public static final Item MELALEUCA_SHOVEL;

	public static final Item MURKANTUAN_AXE;
	public static final Item MURKANTUAN_HOE;
	public static final Item MURKANTUAN_PICKAXE;
	public static final Item MURKANTUAN_SHOVEL;

	public static final Item NORFOLK_PINE_AXE;
	public static final Item NORFOLK_PINE_HOE;
	public static final Item NORFOLK_PINE_PICKAXE;
	public static final Item NORFOLK_PINE_SHOVEL;

	public static final Item OBSCRUS_AXE;
	public static final Item OBSCRUS_HOE;
	public static final Item OBSCRUS_PICKAXE;
	public static final Item OBSCRUS_SHOVEL;

	public static final Item ORHPRIS_AXE;
	public static final Item ORHPRIS_HOE;
	public static final Item ORHPRIS_PICKAXE;
	public static final Item ORHPRIS_SHOVEL;

	public static final Item PELTOGYNE_AXE;
	public static final Item PELTOGYNE_HOE;
	public static final Item PELTOGYNE_PICKAXE;
	public static final Item PELTOGYNE_SHOVEL;

	public static final Item PIN_CHERRY_AXE;
	public static final Item PIN_CHERRY_HOE;
	public static final Item PIN_CHERRY_PICKAXE;
	public static final Item PIN_CHERRY_SHOVEL;

	public static final Item PLUM_AXE;
	public static final Item PLUM_HOE;
	public static final Item PLUM_PICKAXE;
	public static final Item PLUM_SHOVEL;

	public static final Item PURFUNGA_AXE;
	public static final Item PURFUNGA_HOE;
	public static final Item PURFUNGA_PICKAXE;
	public static final Item PURFUNGA_SHOVEL;

	public static final Item RARK_AXE;
	public static final Item RARK_HOE;
	public static final Item RARK_PICKAXE;
	public static final Item RARK_SHOVEL;

	public static final Item RED_ELM_AXE;
	public static final Item RED_ELM_HOE;
	public static final Item RED_ELM_PICKAXE;
	public static final Item RED_ELM_SHOVEL;

	public static final Item RHADI_AXE;
	public static final Item RHADI_HOE;
	public static final Item RHADI_PICKAXE;
	public static final Item RHADI_SHOVEL;

	public static final Item SANGUART_AXE;
	public static final Item SANGUART_HOE;
	public static final Item SANGUART_PICKAXE;
	public static final Item SANGUART_SHOVEL;

	public static final Item SCARLET_THIORCEN_AXE;
	public static final Item SCARLET_THIORCEN_HOE;
	public static final Item SCARLET_THIORCEN_PICKAXE;
	public static final Item SCARLET_THIORCEN_SHOVEL;

	public static final Item SEQUOIA_AXE;
	public static final Item SEQUOIA_HOE;
	public static final Item SEQUOIA_PICKAXE;
	public static final Item SEQUOIA_SHOVEL;

	public static final Item SPROOM_AXE;
	public static final Item SPROOM_HOE;
	public static final Item SPROOM_PICKAXE;
	public static final Item SPROOM_SHOVEL;

	public static final Item STORTREEAN_AXE;
	public static final Item STORTREEAN_HOE;
	public static final Item STORTREEAN_PICKAXE;
	public static final Item STORTREEAN_SHOVEL;

	public static final Item STROOMEAN_AXE;
	public static final Item STROOMEAN_HOE;
	public static final Item STROOMEAN_PICKAXE;
	public static final Item STROOMEAN_SHOVEL;

	public static final Item SUNRISE_FUNGUS_AXE;
	public static final Item SUNRISE_FUNGUS_HOE;
	public static final Item SUNRISE_FUNGUS_PICKAXE;
	public static final Item SUNRISE_FUNGUS_SHOVEL;

	public static final Item TARK_AXE;
	public static final Item TARK_HOE;
	public static final Item TARK_PICKAXE;
	public static final Item TARK_SHOVEL;

	public static final Item TEAK_AXE;
	public static final Item TEAK_HOE;
	public static final Item TEAK_PICKAXE;
	public static final Item TEAK_SHOVEL;

	public static final Item THUNDERCLOUD_PLUM_AXE;
	public static final Item THUNDERCLOUD_PLUM_HOE;
	public static final Item THUNDERCLOUD_PLUM_PICKAXE;
	public static final Item THUNDERCLOUD_PLUM_SHOVEL;

	public static final Item VYNHERT_AXE;
	public static final Item VYNHERT_HOE;
	public static final Item VYNHERT_PICKAXE;
	public static final Item VYNHERT_SHOVEL;

	public static final Item WART_TREE_AXE;
	public static final Item WART_TREE_HOE;
	public static final Item WART_TREE_PICKAXE;
	public static final Item WART_TREE_SHOVEL;

	public static final Item WENGE_AXE;
	public static final Item WENGE_HOE;
	public static final Item WENGE_PICKAXE;
	public static final Item WENGE_SHOVEL;

	public static final Item YEW_AXE;
	public static final Item YEW_HOE;
	public static final Item YEW_PICKAXE;
	public static final Item YEW_SHOVEL;

	/* ARMOR */
	public static final Item AQUAMARINE_HELMET;
	public static final Item AQUAMARINE_CHESTPLATE;
	public static final Item AQUAMARINE_LEGGINGS;
	public static final Item AQUAMARINE_BOOTS;

	public static final Item BORON_HELMET;
	public static final Item BORON_CHESTPLATE;
	public static final Item BORON_LEGGINGS;
	public static final Item BORON_BOOTS;

	public static final Item CHALCEDONY_HELMET;
	public static final Item CHALCEDONY_CHESTPLATE;
	public static final Item CHALCEDONY_LEGGINGS;
	public static final Item CHALCEDONY_BOOTS;

	public static final Item CLINOHUMITE_HELMET;
	public static final Item CLINOHUMITE_CHESTPLATE;
	public static final Item CLINOHUMITE_LEGGINGS;
	public static final Item CLINOHUMITE_BOOTS;

	public static final Item DIOPSIDE_HELMET;
	public static final Item DIOPSIDE_CHESTPLATE;
	public static final Item DIOPSIDE_LEGGINGS;
	public static final Item DIOPSIDE_BOOTS;

	public static final Item ENRON_HELMET;
	public static final Item ENRON_CHESTPLATE;
	public static final Item ENRON_LEGGINGS;
	public static final Item ENRON_BOOTS;

	public static final Item ENSTATITE_HELMET;
	public static final Item ENSTATITE_CHESTPLATE;
	public static final Item ENSTATITE_LEGGINGS;
	public static final Item ENSTATITE_BOOTS;

	public static final Item KRALCTIUM_HELMET;
	public static final Item KRALCTIUM_CHESTPLATE;
	public static final Item KRALCTIUM_LEGGINGS;
	public static final Item KRALCTIUM_BOOTS;

	public static final Item MORGANITE_HELMET;
	public static final Item MORGANITE_CHESTPLATE;
	public static final Item MORGANITE_LEGGINGS;
	public static final Item MORGANITE_BOOTS;

	public static final Item RUBY_HELMET;
	public static final Item RUBY_CHESTPLATE;
	public static final Item RUBY_LEGGINGS;
	public static final Item RUBY_BOOTS;

	public static final Item SAPPHIRE_HELMET;
	public static final Item SAPPHIRE_CHESTPLATE;
	public static final Item SAPPHIRE_LEGGINGS;
	public static final Item SAPPHIRE_BOOTS;

	public static final Item SILVER_HELMET;
	public static final Item SILVER_CHESTPLATE;
	public static final Item SILVER_LEGGINGS;
	public static final Item SILVER_BOOTS;

	public static final Item SPHENE_HELMET;
	public static final Item SPHENE_CHESTPLATE;
	public static final Item SPHENE_LEGGINGS;
	public static final Item SPHENE_BOOTS;

	public static final Item SPINEL_HELMET;
	public static final Item SPINEL_CHESTPLATE;
	public static final Item SPINEL_LEGGINGS;
	public static final Item SPINEL_BOOTS;

	public static final Item TANZANITE_HELMET;
	public static final Item TANZANITE_CHESTPLATE;
	public static final Item TANZANITE_LEGGINGS;
	public static final Item TANZANITE_BOOTS;

	public static final Item TOPAZ_HELMET;
	public static final Item TOPAZ_CHESTPLATE;
	public static final Item TOPAZ_LEGGINGS;
	public static final Item TOPAZ_BOOTS;

	public static final Item VOID_CRITTERED_DIOPSIDE_HELMET;
	public static final Item VOID_CRITTERED_DIOPSIDE_CHESTPLATE;
	public static final Item VOID_CRITTERED_DIOPSIDE_LEGGINGS;
	public static final Item VOID_CRITTERED_DIOPSIDE_BOOTS;

	/* TALISMANS */
	public static final Item AQUAMARINE_TALISMAN;
	public static final Item SPHENE_TALISMAN;
	public static final Item TANZANITE_TALISMAN;

	/* JEWELRY */
	public static final Item BLACK_PEARL;
	public static final Item BLACK_OPAL_SHARD;
	public static final Item CLINOHUMITE_SHARD;
	public static final Item DIAMOND_SHARD;
	public static final Item GARNET_SHARD;
	public static final Item OPAL_SHARD;
	public static final Item SAPPHIRE_SHARD;
	public static final Item SUGILITE_SHARD;

	/* ORES */
	public static final Item AQUAMARINE;
	public static final Item BLACK_OPAL;
	public static final Item CHALCEDONY;
	public static final Item CLINOHUMITE;
	public static final Item DIOPSIDE;
	public static final Item ENSTATITE;
	public static final Item GARNET;
	public static final Item MORGANITE;
	public static final Item OPAL;
	public static final Item RAW_ACTINIUM;
	public static final Item RAW_BORON;
	public static final Item RAW_ENRON;
	public static final Item RAW_SILICON;
	public static final Item RAW_SILVER;
	public static final Item RAW_STROXITE;
	public static final Item RAW_TUNGSTEN;
	public static final Item CHARGED_RAW_TUNGSTEN;
	public static final Item RAW_URANIUM;
	public static final Item RAW_URANOLUMEN;
	public static final Item RUBY;
	public static final Item SAPPHIRE;
	public static final Item SPHENE;
	public static final Item SPINEL;
	public static final Item SUGILITE;
	public static final Item TANZANITE;
	public static final Item TOPAZ;
	public static final Item VOID_CRITTERED_DIOPSIDE;

	/* INGOTS */
	public static final Item ACTINIUM_INGOT;
	public static final Item BORON_INGOT;
	public static final Item ENRON_INGOT;
	public static final Item GYLDELION_INGOT;
	public static final Item KRALCTIUM_INGOT;
	public static final Item SILICON_INGOT;
	public static final Item SILVER_INGOT;
	public static final Item STROXITE_INGOT;
	public static final Item TUNGSTEN_INGOT;
	public static final Item CHARGED_TUNGSTEN_INGOT;
	public static final Item URANIUM_INGOT;
	public static final Item URANOLUMEN_INGOT;

	/* NUGGETS */
	public static final Item ACTINIUM_NUGGET;
	public static final Item BORON_NUGGET;
	public static final Item ENRON_NUGGET;
	public static final Item GYLDELION_NUGGET;
	public static final Item KRALCTIUM_NUGGET;
	public static final Item SILICON_NUGGET;
	public static final Item SILVER_NUGGET;
	public static final Item STROXITE_NUGGET;
	public static final Item TUNGSTEN_NUGGET;
	public static final Item CHARGED_TUNGSTEN_NUGGET;
	public static final Item URANIUM_NUGGET;
	public static final Item URANOLUMEN_NUGGET;

	/* POWDERS */
	public static final Item URANIUM_POWDER;
	public static final Item URANOLUMEN_POWDER;

	/* DYES */
	public static final Item GYLDELION_DYE;

	/* MOB DROPS */
	public static final Item LOOSEJAW_TOOTH;

	/* BLOCK ITEMS */
	public static final Item AIRIAL_MOSS;
	public static final Item ILMIUM;

	protected static Item createArmorItem(ArmorMaterial material, EquipmentSlot slot) {
		return new ArmorItem(material, slot, new Settings().group(COMBAT));
	}

	protected static Item createAxe(ToolMaterial material, float attackDamage, float attackSpeed) {
		return new AxeItem(material, attackDamage, attackSpeed, new Settings().group(TOOLS));
	}

	protected static Item createHoe(ToolMaterial material, int attackDamage, float attackSpeed) {
		return new HoeItem(material, attackDamage, attackSpeed, new Settings().group(TOOLS));
	}

	protected static Item createPickaxe(ToolMaterial material, int attackDamage, float attackSpeed) {
		return new PickaxeItem(material, attackDamage, attackSpeed, new Settings().group(TOOLS));
	}

	protected static Item createShovel(ToolMaterial material, float attackDamage, float attackSpeed) {
		return new ShovelItem(material, attackDamage, attackSpeed, new Settings().group(TOOLS));
	}

	protected static Item createScythe(ToolMaterial material, int attackDamage, float attackSpeed) {
		return new ScytheItem(material, attackDamage, attackSpeed, new Settings().group(COMBAT));
	}

	protected static Item createStaff() {
		return new StaffItem(new Settings().group(COMBAT));
	}

	protected static Item createSword(ToolMaterial material, int attackDamage, float attackSpeed) {
		return new SwordItem(material, attackDamage, attackSpeed, new Settings().group(COMBAT));
	}

	protected static Item createHelmet(ArmorMaterial material) {
		return createArmorItem(material, EquipmentSlot.HEAD);
	}

	protected static Item createChestplate(ArmorMaterial material) {
		return createArmorItem(material, EquipmentSlot.CHEST);
	}

	protected static Item createLeggings(ArmorMaterial material) {
		return createArmorItem(material, EquipmentSlot.LEGS);
	}

	protected static Item createBoots(ArmorMaterial material) {
		return createArmorItem(material, EquipmentSlot.FEET);
	}

	protected static Item createBoat(FabricBoatType type) {
		return new FabricBoatItem(DTEntityTypes.BOAT, type, new Item.Settings().maxCount(1).group(ARBOROLOGY));
	}

	protected static Item createBucket(FlowableFluid fluid) {
		return new BucketItem(fluid,  new Item.Settings().recipeRemainder(BUCKET).maxCount(1).group(MISC));
	}

	protected static Item createFishBucket(EntityType<?> type) {
		return new EntityBucketItem(type, WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, new Item.Settings().maxCount(1).group(MISC));
	}

	protected static Item createFishBucket(EntityType<?> type, Tag<EntityType<?>> tag) {
		return new TagFishBucketItem(type, tag, WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, new Item.Settings().maxCount(1).group(MISC));
	}

	protected static Item createFood(FoodComponent food) {
		return createItem(new Settings().group(MISC).food(food));
	}

	protected static Item createBlockItem(Block block, ItemGroup itemGroup) {
		return new BlockItem(block, new Settings().group(itemGroup));
	}

	protected static Item createItem(ItemGroup itemGroup) {
		return createItem(new Settings().group(itemGroup));
	}

	protected static Item createItem(Settings settings) {
		return createItem(Item::new, settings);
	}

	protected static Item createItem(Function<Item.Settings, Item> function, Item.Settings settings) {
		return function.apply(settings);
	}

	protected static Item createSpawnEgg(EntityType<? extends MobEntity> type, int primaryColor, int secondaryColor) {
		return new SpawnEggItem(type, primaryColor, secondaryColor, new Item.Settings().maxCount(1).group(MISC));
	}

	protected static Item createSpawnEgg(EntityType<? extends MobEntity> type, Tag<EntityType<?>> tag, int primaryColor, int secondaryColor) {
		return new TagSpawnEggItem(type, tag, primaryColor, secondaryColor, new Item.Settings().maxCount(1).group(MISC));
	}

	protected static void registerCoralFan(String id, Block standingBlock, Block block) {
		registerItem(id, new WallStandingBlockItem(standingBlock, block, new Settings().maxCount(1).group(SEA_BLOCKS)));
	}

	protected static void registerBlockItem(String id, Block block, ItemGroup itemGroup) {
		registerBlockItem(id, block, new Settings().group(itemGroup));
	}

	protected static void registerBlockItem(String id, Block block, Settings settings) {
		registerItem(id, new BlockItem(block, settings));
	}

	protected static void registerSignItem(String id, Block standingBlock, Block block) {
		registerItem(id, new SignItem(new Settings().maxCount(16).group(ARBOROLOGY), standingBlock, block));
	}

	protected static void registerItem(String id, Item item) {

		if(item instanceof BlockItem blockItem)
			blockItem.appendBlocks(BLOCK_ITEMS, blockItem);

		Registry.register(ITEM, id, item);
	}

	static {
		ABYSSOPELAGIC_WATER_BUCKET = createBucket(DTFluids.ABYSSOPELAGIC_WATER);
		ACID_BUCKET = createBucket(DTFluids.ACID);
		BATHYPELAGIC_WATER_BUCKET = createBucket(DTFluids.BATHYPELAGIC_WATER);
		BRINE_BUCKET = createBucket(DTFluids.BRINE);
		CLEAR_WATER_BUCKET = createBucket(DTFluids.CLEAR_WATER);
		HADOPELAGIC_WATER_BUCKET = createBucket(DTFluids.HADOPELAGIC_WATER);
		MESOPELAGIC_WATER_BUCKET = createBucket(DTFluids.MESOPELAGIC_WATER);
		STORCEAN_ABYSSOPELAGIC_WATER_BUCKET = createBucket(DTFluids.STORCEAN_ABYSSOPELAGIC_WATER);
		STORCEAN_BATHYPELAGIC_WATER_BUCKET = createBucket(DTFluids.STORCEAN_BATHYPELAGIC_WATER);
		STORCEAN_ENDERPELAGIC_WATER_BUCKET = createBucket(DTFluids.STORCEAN_ENDERPELAGIC_WATER);
		STORCEAN_GASOPELAGIC_WATER_BUCKET = createBucket(DTFluids.STORCEAN_GASOPELAGIC_WATER);
		STORCEAN_HADOPELAGIC_WATER_BUCKET = createBucket(DTFluids.STORCEAN_HADOPELAGIC_WATER);
		STORCEAN_INFINIPELAGIC_WATER_BUCKET = createBucket(DTFluids.STORCEAN_INFINIPELAGIC_WATER);
		STORCEAN_MESOPELAGIC_WATER_BUCKET = createBucket(DTFluids.STORCEAN_MESOPELAGIC_WATER);
		STORCEAN_VIRDIPELAGIC_WATER_BUCKET = createBucket(DTFluids.STORCEAN_VIRDIPELAGIC_WATER);
		STORCEAN_WATER_BUCKET = createBucket(DTFluids.STORCEAN_WATER);

		BARBELED_LOOSEJAW_BUCKET = createFishBucket(DTEntityTypes.BARBELED_LOOSEJAW);
		BETTA_BUCKET = createFishBucket(DTEntityTypes.BETTA);
		BLACK_LOOSEJAW_BUCKET = createFishBucket(DTEntityTypes.BLACK_LOOSEJAW);
		LIGHT_LOOSEJAW_BUCKET = createFishBucket(DTEntityTypes.LIGHT_LOOSEJAW);
		DEEP_LAKE_BETTA_BUCKET = createFishBucket(DTEntityTypes.DEEP_LAKE_BETTA, DTEntityTypeTags.TRELOSIAGNUS_BETTA);
		GIANT_HATCHETFISH_BUCKET = createFishBucket(DTEntityTypes.GIANT_HATCHETFISH,  DTEntityTypeTags.ARGYROPELECUS_GIGAS);
		SMALLTOOTH_DRAGONFISH_BUCKET = createFishBucket(DTEntityTypes.SMALLTOOTH_DRAGONFISH, DTEntityTypeTags.PACHYSTOMIAS_MICRODON);

		/* SPAWN EGGS */
		BARBELED_LOOSEJAW_SPAWN_EGG = createSpawnEgg(DTEntityTypes.BARBELED_LOOSEJAW, 921113, 15859744);
		BETTA_SPAWN_EGG = createSpawnEgg(DTEntityTypes.BETTA,7347502, 9183521);
		BLACK_LOOSEJAW_SPAWN_EGG = createSpawnEgg(DTEntityTypes.BLACK_LOOSEJAW,2102566, 11010053);
		LIGHT_LOOSEJAW_SPAWN_EGG = createSpawnEgg(DTEntityTypes.LIGHT_LOOSEJAW,1643048, 4836351);
		STASP_SPAWN_EGG = createSpawnEgg(DTEntityTypes.STASP, 2695792, 5124510);

		DEEP_LAKE_BETTA_SPAWN_EGG = createSpawnEgg(DTEntityTypes.DEEP_LAKE_BETTA, DTEntityTypeTags.TRELOSIAGNUS_BETTA, 1189390, 5013319);
		GIANT_HATCHETFISH_SPAWN_EGG = createSpawnEgg(DTEntityTypes.GIANT_HATCHETFISH, DTEntityTypeTags.ARGYROPELECUS_GIGAS, 9870757, 12311039);
		SMALLTOOTH_DRAGONFISH_SPAWN_EGG = createSpawnEgg(DTEntityTypes.SMALLTOOTH_DRAGONFISH, DTEntityTypeTags.PACHYSTOMIAS_MICRODON, 1250598, 16728832);

		/* FRUITS */
		ALMOND = createFood(SWEET_BERRIES);
		ALMOND_DRUPE = createFood(SWEET_BERRIES);
		AQUEAN_SAP = createItem(MISC);
		BOTTLE_OF_AQUEAN_SAP = createItem(MISC);
		CHERRY = createFood(SWEET_BERRIES);
		CROLOOD_FRUIT = createFood(APPLE);
		DARK_CROLOOD_FRUIT = createFood(APPLE);
		PERSIMMON_FRUIT = createFood(APPLE);
		PIN_CHERRY = createFood(SWEET_BERRIES);
		PLUM = createFood(APPLE);
		THUNDERCLOUD_PLUM = createFood(APPLE);

		/* BOAT */
		ALMOND_BOAT = createBoat(DTBoatTypes.ALMOND);
		ANAMEATA_BOAT = createBoat(DTBoatTypes.ANAMEATA);
		ANGELS_TRUMPET_BOAT = createBoat(DTBoatTypes.ANGELS_TRUMPET);
		AQUEAN_BOAT = createBoat(DTBoatTypes.AQUEAN);
		BARSHROOKLE_BOAT = createBoat(DTBoatTypes.BARSHROOKLE);
		BLACK_BIRCH_BOAT = createBoat(DTBoatTypes.BLACK_BIRCH);
		BLUE_MAHOE_BOAT = createBoat(DTBoatTypes.BLUE_MAHOE);
		BLUE_SPRUCE_BOAT = createBoat(DTBoatTypes.BLUE_SPRUCE);
		BOTTLEBRUSH_BOAT = createBoat(DTBoatTypes.BOTTLEBRUSH);
		BROMYA_BOAT = createBoat(DTBoatTypes.BROMYA);
		BUBBLETREE_BOAT = createBoat(DTBoatTypes.BUBBLETREE);
		CALCEARB_BOAT = createBoat(DTBoatTypes.CALCEARB);
		CHERRY_BOAT = createBoat(DTBoatTypes.CHERRY);
		CHOTORN_BOAT = createBoat(DTBoatTypes.CHOTORN);
		COOK_PINE_BOAT = createBoat(DTBoatTypes.COOK_PINE);
		CROLOOD_BOAT = createBoat(DTBoatTypes.CROLOOD);
		DARK_CROLOOD_BOAT = createBoat(DTBoatTypes.DARK_CROLOOD);
		DARK_FUCHSITRA_BOAT = createBoat(DTBoatTypes.DARK_FUCHSITRA);
		DARK_RED_ELM_BOAT = createBoat(DTBoatTypes.DARK_RED_ELM);
		DEAD_WART_TREE_BOAT = createBoat(DTBoatTypes.DEAD_WART_TREE);
		DRIGYUS_BOAT = createBoat(DTBoatTypes.DRIGYUS);
		EBONY_BOAT = createBoat(DTBoatTypes.EBONY);
		ENDERHEART_BOAT = createBoat(DTBoatTypes.ENDERHEART);
		FLALM_BOAT = createBoat(DTBoatTypes.FLALM);
		FRUCE_BOAT = createBoat(DTBoatTypes.FRUCE);
		FUCHSITRA_BOAT = createBoat(DTBoatTypes.FUCHSITRA);
		FUGMOS_BOAT = createBoat(DTBoatTypes.FUGMOS);
		FUNERANITE_BOAT = createBoat(DTBoatTypes.FUNERANITE);
		GHOSHROOM_BOAT = createBoat(DTBoatTypes.GHOSHROOM);
		GIANT_VIOLET_BOAT = createBoat(DTBoatTypes.GIANT_VIOLET);
		GUAIACUM_BOAT = createBoat(DTBoatTypes.GUAIACUM);
		JOSHUA_BOAT = createBoat(DTBoatTypes.JOSHUA);
		KLINKII_PINE_BOAT = createBoat(DTBoatTypes.KLINKII_PINE);
		MELALEUCA_BOAT = createBoat(DTBoatTypes.MELALEUCA);
		MURKANTUAN_BOAT = createBoat(DTBoatTypes.MURKANTUAN);
		NORFOLK_PINE_BOAT = createBoat(DTBoatTypes.NORFOLK_PINE);
		OBSCRUS_BOAT = createBoat(DTBoatTypes.OBSCRUS);
		ORHPRIS_BOAT = createBoat(DTBoatTypes.ORHPRIS);
		PELTOGYNE_BOAT = createBoat(DTBoatTypes.PELTOGYNE);
		PIN_CHERRY_BOAT = createBoat(DTBoatTypes.PIN_CHERRY);
		PLUM_BOAT = createBoat(DTBoatTypes.PLUM);
		PURFUNGA_BOAT = createBoat(DTBoatTypes.PURFUNGA);
		RARK_BOAT = createBoat(DTBoatTypes.RARK);
		RED_ELM_BOAT = createBoat(DTBoatTypes.RED_ELM);
		RHADI_BOAT = createBoat(DTBoatTypes.RHADI);
		SANGUART_BOAT = createBoat(DTBoatTypes.SANGUART);
		SCARLET_THIORCEN_BOAT = createBoat(DTBoatTypes.SCARLET_THIORCEN);
		SEQUOIA_BOAT = createBoat(DTBoatTypes.SEQUOIA);
		SPROOM_BOAT = createBoat(DTBoatTypes.SPROOM);
		STORTREEAN_BOAT = createBoat(DTBoatTypes.STORTREEAN);
		STROOMEAN_BOAT = createBoat(DTBoatTypes.STROOMEAN);
		SUNRISE_FUNGUS_BOAT = createBoat(DTBoatTypes.SUNRISE_FUNGUS);
		TARK_BOAT = createBoat(DTBoatTypes.TARK);
		TEAK_BOAT = createBoat(DTBoatTypes.TEAK);
		THUNDERCLOUD_PLUM_BOAT = createBoat(DTBoatTypes.THUNDERCLOUD_PLUM);
		VYNHERT_BOAT = createBoat(DTBoatTypes.VYNHERT);
		WART_TREE_BOAT = createBoat(DTBoatTypes.WART_TREE);
		WENGE_BOAT = createBoat(DTBoatTypes.WENGE);
		YEW_BOAT = createBoat(DTBoatTypes.YEW);

		/* STICK */
		ALMOND_STICK = createItem(ARBOROLOGY);
		ANAMEATA_STICK = createItem(ARBOROLOGY);
		ANGELS_TRUMPET_STICK = createItem(ARBOROLOGY);
		AQUEAN_STICK = createItem(ARBOROLOGY);
		BARSHROOKLE_STICK = createItem(ARBOROLOGY);
		BLACK_BIRCH_STICK = createItem(ARBOROLOGY);
		BLUE_MAHOE_STICK = createItem(ARBOROLOGY);
		BLUE_SPRUCE_STICK = createItem(ARBOROLOGY);
		BOTTLEBRUSH_STICK = createItem(ARBOROLOGY);
		BROMYA_STICK = createItem(ARBOROLOGY);
		BUBBLETREE_STICK = createItem(ARBOROLOGY);
		CALCEARB_STICK = createItem(ARBOROLOGY);
		CHERRY_STICK = createItem(ARBOROLOGY);
		CHOTORN_STICK = createItem(ARBOROLOGY);
		COOK_PINE_STICK = createItem(ARBOROLOGY);
		CROLOOD_STICK = createItem(ARBOROLOGY);
		DARK_CROLOOD_STICK = createItem(ARBOROLOGY);
		DARK_FUCHSITRA_STICK = createItem(ARBOROLOGY);
		DARK_RED_ELM_STICK = createItem(ARBOROLOGY);
		DEAD_WART_TREE_STICK = createItem(ARBOROLOGY);
		DRIGYUS_STICK = createItem(ARBOROLOGY);
		EBONY_STICK = createItem(ARBOROLOGY);
		ENDERHEART_STICK = createItem(ARBOROLOGY);
		FLALM_STICK = createItem(ARBOROLOGY);
		FRUCE_STICK = createItem(ARBOROLOGY);
		FUCHSITRA_STICK = createItem(ARBOROLOGY);
		FUGMOS_STICK = createItem(ARBOROLOGY);
		FUNERANITE_STICK = createItem(ARBOROLOGY);
		GHOSHROOM_STICK = createItem(ARBOROLOGY);
		GIANT_VIOLET_STICK = createItem(ARBOROLOGY);
		GUAIACUM_STICK = createItem(ARBOROLOGY);
		JOSHUA_STICK = createItem(ARBOROLOGY);
		KLINKII_PINE_STICK = createItem(ARBOROLOGY);
		MELALEUCA_STICK = createItem(ARBOROLOGY);
		GYLDELION_STICK = createItem(ARBOROLOGY);
		MURKANTUAN_STICK = createItem(ARBOROLOGY);
		NORFOLK_PINE_STICK = createItem(ARBOROLOGY);
		OBSCRUS_STICK = createItem(ARBOROLOGY);
		ORHPRIS_STICK = createItem(ARBOROLOGY);
		PELTOGYNE_STICK = createItem(ARBOROLOGY);
		PIN_CHERRY_STICK = createItem(ARBOROLOGY);
		PLUM_STICK = createItem(ARBOROLOGY);
		PURFUNGA_STICK = createItem(ARBOROLOGY);
		RARK_STICK = createItem(ARBOROLOGY);
		RED_ELM_STICK = createItem(ARBOROLOGY);
		RHADI_STICK = createItem(ARBOROLOGY);
		SANGUART_STICK = createItem(ARBOROLOGY);
		SCARLET_THIORCEN_STICK = createItem(ARBOROLOGY);
		SEQUOIA_STICK = createItem(ARBOROLOGY);
		SPROOM_STICK = createItem(ARBOROLOGY);
		STORTREEAN_STICK = createItem(ARBOROLOGY);
		STROOMEAN_STICK = createItem(ARBOROLOGY);
		SUNRISE_FUNGUS_STICK = createItem(ARBOROLOGY);
		TARK_STICK = createItem(ARBOROLOGY);
		TEAK_STICK = createItem(ARBOROLOGY);
		THUNDERCLOUD_PLUM_STICK = createItem(ARBOROLOGY);
		VYNHERT_STICK = createItem(ARBOROLOGY);
		WART_TREE_STICK = createItem(ARBOROLOGY);
		WENGE_STICK = createItem(ARBOROLOGY);
		YEW_STICK = createItem(ARBOROLOGY);

		/* FOOD */
		BARBELED_LOOSEJAW = createFood(STORCEAN_FISH);
		BETTA = createFood(STORCEAN_FISH);
		BLACK_LOOSEJAW = createFood(STORCEAN_FISH);
		DEEP_LAKE_BETTA = createFood(STORCEAN_FISH);
		GIANT_HATCHETFISH = createFood(DTFoodComponents.GIANT_HATCHETFISH);
		LIGHT_LOOSEJAW = createFood(STORCEAN_FISH);
		SMALLTOOTH_DRAGONFISH =  createFood(STORCEAN_FISH);

		/* COOKED FOOD */
		COOKED_GIANT_HATCHETFISH = createFood(DTFoodComponents.COOKED_GIANT_HATCHETFISH);

		/* GOO's */
		BLACK_BIOLUMINESCENT_GOO = createItem(MISC);
		BROWN_BIOLUMINESCENT_GOO = createItem(MISC);
		CYAN_BIOLUMINESCENT_GOO = createItem(MISC);
		GREEN_BIOLUMINESCENT_GOO = createItem(MISC);
		LIGHT_BLUE_BIOLUMINESCENT_GOO = createItem(MISC);
		LIME_BIOLUMINESCENT_GOO = createItem(MISC);
		MAGENTA_BIOLUMINESCENT_GOO = createItem(MISC);
		ORANGE_BIOLUMINESCENT_GOO = createItem(MISC);
		PURPLE_BIOLUMINESCENT_GOO = createItem(MISC);
		RED_BIOLUMINESCENT_GOO = createItem(MISC);
		WHITE_BIOLUMINESCENT_GOO = createItem(MISC);
		YELLOW_BIOLUMINESCENT_GOO = createItem(MISC);

		/* WEAPONS */
		ADAIGGER = new AdaiggerItem(DTToolMaterials.GYLDELION, 4, 4F, new Settings().group(COMBAT));
		BORON_TROOKENT = new TrookentItem(DTToolMaterials.BORON, 4, 4F, new Settings().group(COMBAT));
		MORGANITE_SABER = new TrookentItem(DTToolMaterials.MORGANITE, 4, 4F, new Settings().group(COMBAT));
		SAPPHIRE_PRISMACE = new PrismaceItem(new Settings().group(COMBAT));

		BORON_SWORD = createSword(DTToolMaterials.BORON, 4, -2.2F);
		CHALCEDONY_SWORD = createSword(DTToolMaterials.CHALCEDONY, 4, -2.2F);
		ENRON_SWORD = createSword(DTToolMaterials.ENRON, 3, -2.4F);
		ENSTATITE_SWORD = createSword(DTToolMaterials.ENSTATITE, 3, -2.4F);
		KRALCTIUM_SWORD = createSword(DTToolMaterials.KRALCTIUM, 3, -2.4F);
		SAPPHIRE_SWORD = createSword(DTToolMaterials.SAPPHIRE, 4, -2.2F);
		RUBY_DISTABBER = createSword(DTToolMaterials.RUBY, 3, -2.4F);
		SPHENE_SWORD = createSword(DTToolMaterials.SPHENE, 3, -2.4F);
		SPINEL_SWORD = createSword(DTToolMaterials.SPINEL, 3, -2.4F);
		STROXITE_SWORD = createSword(DTToolMaterials.STROXITE, 3, -2.4F);
		TANZANITE_SWORD = createSword(DTToolMaterials.TANZANITE, 3, -2.4F);
		TOPAZ_SWORD = createSword(DTToolMaterials.TOPAZ, 3, -2.4F);

		ALMOND_SWORD = createSword(DTToolMaterials.ALMOND, 3, -2.4F);
		ANAMEATA_SWORD = createSword(DTToolMaterials.ANAMEATA, 3, -2.4F);
		ANGELS_TRUMPET_SWORD = createSword(DTToolMaterials.ANGELS_TRUMPET, 3, -2.4F);
		AQUEAN_SWORD = createSword(DTToolMaterials.AQUEAN, 3, -2.4F);
		BARSHROOKLE_SWORD = createSword(DTToolMaterials.BARSHROOKLE, 3, -2.4F);
		BLACK_BIRCH_SWORD = createSword(DTToolMaterials.BLACK_BIRCH, 3, -2.4F);
		BLUE_MAHOE_SWORD = createSword(DTToolMaterials.BLUE_MAHOE, 3, -2.4F);
		BLUE_SPRUCE_SWORD = createSword(DTToolMaterials.BLUE_SPRUCE, 3, -2.4F);
		BOTTLEBRUSH_SWORD = createSword(DTToolMaterials.BOTTLEBRUSH, 3, -2.4F);
		BROMYA_SWORD = createSword(DTToolMaterials.BROMYA, 3, -2.4F);
		BUBBLETREE_SWORD = createSword(DTToolMaterials.BUBBLETREE, 3, -2.4F);
		CALCEARB_SWORD = createSword(DTToolMaterials.CALCEARB, 3, -2.4F);
		CHERRY_SWORD = createSword(DTToolMaterials.CHERRY, 3, -2.4F);
		CHOTORN_SWORD = createSword(DTToolMaterials.CHOTORN, 3, -2.4F);
		COOK_PINE_SWORD = createSword(DTToolMaterials.COOK_PINE, 3, -2.4F);
		CROLOOD_SWORD = createSword(DTToolMaterials.CROLOOD, 3, -2.4F);
		DARK_CROLOOD_SWORD = createSword(DTToolMaterials.DARK_CROLOOD, 3, -2.4F);
		DARK_FUCHSITRA_SWORD = createSword(DTToolMaterials.DARK_FUCHSITRA, 3, -2.4F);
		DARK_RED_ELM_SWORD = createSword(DTToolMaterials.DARK_RED_ELM, 3, -2.4F);
		DEAD_WART_TREE_SWORD = createSword(DTToolMaterials.DEAD_WART_TREE, 3, -2.4F);
		DRIGYUS_SWORD = createSword(DTToolMaterials.DRIGYUS, 3, -2.4F);
		EBONY_SWORD = createSword(DTToolMaterials.EBONY, 3, -2.4F);
		ENDERHEART_SWORD = createSword(DTToolMaterials.ENDERHEART, 3, -2.4F);
		FLALM_SWORD = createSword(DTToolMaterials.FLALM, 3, -2.4F);
		FRUCE_SWORD = createSword(DTToolMaterials.FRUCE, 3, -2.4F);
		FUCHSITRA_SWORD = createSword(DTToolMaterials.FUCHSITRA, 3, -2.4F);
		FUGMOS_SWORD = createSword(DTToolMaterials.FUGMOS, 3, -2.4F);
		FUNERANITE_SWORD = createSword(DTToolMaterials.FUNERANITE, 3, -2.4F);
		GHOSHROOM_SWORD = createSword(DTToolMaterials.GHOSHROOM, 3, -2.4F);
		GIANT_VIOLET_SWORD = createSword(DTToolMaterials.GIANT_VIOLET, 3, -2.4F);
		GUAIACUM_SWORD = createSword(DTToolMaterials.GUAIACUM, 3, -2.4F);
		JOSHUA_SWORD = createSword(DTToolMaterials.JOSHUA, 3, -2.4F);
		KLINKII_PINE_SWORD = createSword(DTToolMaterials.KLINKII_PINE, 3, -2.4F);
		MELALEUCA_SWORD = createSword(DTToolMaterials.MELALEUCA, 3, -2.4F);
		MURKANTUAN_SWORD = createSword(DTToolMaterials.MURKANTUAN, 3, -2.4F);
		NORFOLK_PINE_SWORD = createSword(DTToolMaterials.NORFOLK_PINE, 3, -2.4F);
		OBSCRUS_SWORD = createSword(DTToolMaterials.OBSCRUS, 3, -2.4F);
		ORHPRIS_SWORD = createSword(DTToolMaterials.ORHPRIS, 3, -2.4F);
		PELTOGYNE_SWORD = createSword(DTToolMaterials.PELTOGYNE, 3, -2.4F);
		PIN_CHERRY_SWORD = createSword(DTToolMaterials.PIN_CHERRY, 3, -2.4F);
		PLUM_SWORD = createSword(DTToolMaterials.PLUM, 3, -2.4F);
		PURFUNGA_SWORD = createSword(DTToolMaterials.PURFUNGA, 3, -2.4F);
		RARK_SWORD = createSword(DTToolMaterials.RARK, 3, -2.4F);
		RED_ELM_SWORD = createSword(DTToolMaterials.RED_ELM, 3, -2.4F);
		RHADI_SWORD = createSword(DTToolMaterials.RHADI, 3, -2.4F);
		SANGUART_SWORD = createSword(DTToolMaterials.SANGUART, 3, -2.4F);
		SCARLET_THIORCEN_SWORD = createSword(DTToolMaterials.SCARLET_THIORCEN, 3, -2.4F);
		SEQUOIA_SWORD = createSword(DTToolMaterials.SEQUOIA, 3, -2.4F);
		SPROOM_SWORD = createSword(DTToolMaterials.SPROOM, 3, -2.4F);
		STORTREEAN_SWORD = createSword(DTToolMaterials.STORTREEAN, 3, -2.4F);
		STROOMEAN_SWORD = createSword(DTToolMaterials.STROOMEAN, 3, -2.4F);
		SUNRISE_FUNGUS_SWORD = createSword(DTToolMaterials.SUNRISE_FUNGUS, 3, -2.4F);
		TARK_SWORD = createSword(DTToolMaterials.TARK, 3, -2.4F);
		TEAK_SWORD = createSword(DTToolMaterials.TEAK, 3, -2.4F);
		THUNDERCLOUD_PLUM_SWORD = createSword(DTToolMaterials.THUNDERCLOUD_PLUM, 3, -2.4F);
		VYNHERT_SWORD = createSword(DTToolMaterials.VYNHERT, 3, -2.4F);
		WART_TREE_SWORD = createSword(DTToolMaterials.WART_TREE, 3, -2.4F);
		WENGE_SWORD = createSword(DTToolMaterials.WENGE, 3, -2.4F);
		YEW_SWORD = createSword(DTToolMaterials.YEW, 3, -2.4F);

		AQUAMARINE_SCYTHE = createScythe(DTToolMaterials.AQUAMARINE, 7, -2.1F);
		BORON_SCYTHE = createScythe(DTToolMaterials.BORON, 7, -2.1F);
		DIOPSIDE_SCYTHE = createScythe(DTToolMaterials.DIOPSIDE, 7, -2.1F);
		GYLDELION_SCYTHE = createScythe(DTToolMaterials.GYLDELION, 8, 2.1F);
		NETHERITE_SCYTHE = createScythe(ToolMaterials.NETHERITE, 7, -2.1F);

		RUBY_DISRAPPER = new DisripperItem(DTToolMaterials.RUBY, 4, 4F, new Settings().group(COMBAT));
		SAPPHIRE_SCYTHE = createScythe(DTToolMaterials.SAPPHIRE, 7, -2.1F);
		SPINEL_SCYTHE = createScythe(DTToolMaterials.SPINEL, 7, -2.1F);
		TANZANITE_SCYTHE = createScythe(DTToolMaterials.TANZANITE, 7, -2.1F);
		TOPAZ_SCYTHE = createScythe(DTToolMaterials.TOPAZ, 7, -2.1F);
		VOID_CRITTERED_DIOPSIDE_SCYTHE = createScythe(DTToolMaterials.VOID_CRITTERED_DIOPSIDE, 7, -2.1F);

		AQUAMARINE_STAFF = createStaff();
		DIOPSIDE_STAFF = createStaff();
		SPINEL_STAFF = createStaff();
		TANZANITE_STAFF = createStaff();
		TOPAZ_STAFF = createStaff();
		VOID_CRITTERED_DIOPSIDE_STAFF = createStaff();

		/* METALLIC TOOLS */
		AQUAMARINE_AXE = createAxe(DTToolMaterials.AQUAMARINE, 6F, -3.1F);
		AQUAMARINE_HOE = createHoe(DTToolMaterials.AQUAMARINE, -2, -1F);
		AQUAMARINE_PICKAXE = createPickaxe(DTToolMaterials.AQUAMARINE, 1, -2.8F);
		AQUAMARINE_SHOVEL = createShovel(DTToolMaterials.AQUAMARINE, 1.5F, -3F);

		BORON_AXE = createAxe(DTToolMaterials.BORON, 6F, -3.1F);
		BORON_HOE = createHoe(DTToolMaterials.BORON, -2, -1F);
		BORON_PICKAXE = createPickaxe(DTToolMaterials.BORON, 1, -2.8F);
		BORON_SHOVEL = createShovel(DTToolMaterials.BORON, 1.5F, -3F);

		CHALCEDONY_AXE = createAxe(DTToolMaterials.CHALCEDONY, 6F, -3.1F);
		CHALCEDONY_HOE = createHoe(DTToolMaterials.CHALCEDONY, -2, -1F);
		CHALCEDONY_PICKAXE = createPickaxe(DTToolMaterials.CHALCEDONY, 1, -2.8F);
		CHALCEDONY_SHOVEL = createShovel(DTToolMaterials.CHALCEDONY, 1.5F, -3F);

		CLINOHUMITE_AXE = createAxe(DTToolMaterials.CLINOHUMITE, 6F, -3.1F);
		CLINOHUMITE_HOE = createHoe(DTToolMaterials.CLINOHUMITE, -2, -1F);
		CLINOHUMITE_PICKAXE = createPickaxe(DTToolMaterials.CLINOHUMITE, 1, -2.8F);
		CLINOHUMITE_SHOVEL = createShovel(DTToolMaterials.CLINOHUMITE, 1.5F, -3F);

		DIOPSIDE_AXE = createAxe(DTToolMaterials.DIOPSIDE, 6F, -3.1F);
		DIOPSIDE_HOE = createHoe(DTToolMaterials.DIOPSIDE, -2, -1F);
		DIOPSIDE_PICKAXE = createPickaxe(DTToolMaterials.DIOPSIDE, 1, -2.8F);
		DIOPSIDE_SHOVEL = createShovel(DTToolMaterials.DIOPSIDE, 1.5F, -3F);

		ENRON_AXE = createAxe(DTToolMaterials.ENRON, 6F, -3.1F);
		ENRON_HOE = createHoe(DTToolMaterials.ENRON, -2, -1F);
		ENRON_PICKAXE = createPickaxe(DTToolMaterials.ENRON, 1, -2.8F);
		ENRON_SHOVEL = createShovel(DTToolMaterials.ENRON, 1.5F, -3F);

		ENSTATITE_AXE = createAxe(DTToolMaterials.ENSTATITE, 6F, -3.1F);
		ENSTATITE_HOE = createHoe(DTToolMaterials.ENSTATITE, -2, -1F);
		ENSTATITE_PICKAXE = createPickaxe(DTToolMaterials.ENSTATITE, 1, -2.8F);
		ENSTATITE_SHOVEL = createShovel(DTToolMaterials.ENSTATITE, 1.5F, -3F);

		GYLDELION_AXE = createAxe(DTToolMaterials.GYLDELION, 2F, 3.1F);
		GYLDELION_HOE = createHoe(DTToolMaterials.GYLDELION, -1, 1F);
		GYLDELION_PICKAXE = createPickaxe(DTToolMaterials.GYLDELION, 0, 2.8F);
		GYLDELION_SHOVEL = createShovel(DTToolMaterials.GYLDELION, 0.5F, 3F);

		KRALCTIUM_AXE = createAxe(DTToolMaterials.KRALCTIUM, 6F, -3.1F);
		KRALCTIUM_HOE = createHoe(DTToolMaterials.KRALCTIUM, -2, -1F);
		KRALCTIUM_PICKAXE = createPickaxe(DTToolMaterials.KRALCTIUM, 1, -2.8F);
		KRALCTIUM_SHOVEL = createShovel(DTToolMaterials.KRALCTIUM, 1.5F, -3F);

		MORGANITE_AXE = createAxe(DTToolMaterials.MORGANITE, 6F, -3.1F);
		MORGANITE_HOE = createHoe(DTToolMaterials.MORGANITE, -2, -1F);
		MORGANITE_PICKAXE = createPickaxe(DTToolMaterials.MORGANITE, 1, -2.8F);
		MORGANITE_SHOVEL = createShovel(DTToolMaterials.MORGANITE, 1.5F, -3F);

		RUBY_DISCARVER = new DiscarverItem(DTToolMaterials.RUBY, 1, -2.8F, new Settings().group(TOOLS));
		RUBY_DISDIGGER = new DisdiggerItem(DTToolMaterials.RUBY, 1.5F, -3F, new Settings().group(TOOLS));
		RUBY_DISLOGGER = new DisloggerItem(DTToolMaterials.RUBY, 6F, -3.1F, new Settings().group(TOOLS));
		RUBY_DISTARVEST = new DistarvestItem(DTToolMaterials.RUBY, -2, -1F, new Settings().group(TOOLS));

		SAPPHIRE_AXE = createAxe(DTToolMaterials.SAPPHIRE, 6F, -3.1F);
		SAPPHIRE_HOE = createHoe(DTToolMaterials.SAPPHIRE, -2, -1F);
		SAPPHIRE_PICKAXE = createPickaxe(DTToolMaterials.SAPPHIRE, 1, -2.8F);
		SAPPHIRE_SHOVEL = createShovel(DTToolMaterials.SAPPHIRE, 1.5F, -3F);

		SILVER_AXE = createAxe(DTToolMaterials.SILVER, 6F, -3.1F);
		SILVER_HOE = createHoe(DTToolMaterials.SILVER, -2, -1F);
		SILVER_PICKAXE = createPickaxe(DTToolMaterials.SILVER, 1, -2.8F);
		SILVER_SHOVEL = createShovel(DTToolMaterials.SILVER, 1.5F, -3F);

		SPHENE_AXE = createAxe(DTToolMaterials.SPHENE, 6F, -3.1F);
		SPHENE_HOE = createHoe(DTToolMaterials.SPHENE, -2, -1F);
		SPHENE_PICKAXE = createPickaxe(DTToolMaterials.SPHENE, 1, -2.8F);
		SPHENE_SHOVEL = createShovel(DTToolMaterials.SPHENE, 1.5F, -3F);

		SPINEL_AXE = createAxe(DTToolMaterials.SPINEL, 6F, -3.1F);
		SPINEL_HOE = createHoe(DTToolMaterials.SPINEL, -2, -1F);
		SPINEL_PICKAXE = createPickaxe(DTToolMaterials.SPINEL, 1, -2.8F);
		SPINEL_SHOVEL = createShovel(DTToolMaterials.SPINEL, 1.5F, -3F);

		STROXITE_AXE = createAxe(DTToolMaterials.STROXITE, 6F, -3.1F);
		STROXITE_HOE = createHoe(DTToolMaterials.STROXITE, -2, -1F);
		STROXITE_PICKAXE = createPickaxe(DTToolMaterials.STROXITE, 1, -2.8F);
		STROXITE_SHOVEL = createShovel(DTToolMaterials.STROXITE, 1.5F, -3F);

		TANZANITE_AXE = createAxe(DTToolMaterials.TANZANITE, 6F, -3.1F);
		TANZANITE_HOE = createHoe(DTToolMaterials.TANZANITE, -2, -1F);
		TANZANITE_PICKAXE = createPickaxe(DTToolMaterials.TANZANITE, 1, -2.8F);
		TANZANITE_SHOVEL = createShovel(DTToolMaterials.TANZANITE, 1.5F, -3F);

		TOPAZ_AXE = createAxe(DTToolMaterials.TOPAZ, 6F, -3.1F);
		TOPAZ_HOE = createHoe(DTToolMaterials.TOPAZ, -2, -1F);
		TOPAZ_PICKAXE = createPickaxe(DTToolMaterials.TOPAZ, 1, -2.8F);
		TOPAZ_SHOVEL = createShovel(DTToolMaterials.TOPAZ, 1.5F, -3F);

		VOID_CRITTERED_DIOPSIDE_AXE = createAxe(DTToolMaterials.VOID_CRITTERED_DIOPSIDE, 6F, -3.1F);
		VOID_CRITTERED_DIOPSIDE_HOE = createHoe(DTToolMaterials.VOID_CRITTERED_DIOPSIDE, -2, -1F);
		VOID_CRITTERED_DIOPSIDE_PICKAXE = createPickaxe(DTToolMaterials.VOID_CRITTERED_DIOPSIDE, 1, -2.8F);
		VOID_CRITTERED_DIOPSIDE_SHOVEL = createShovel(DTToolMaterials.VOID_CRITTERED_DIOPSIDE, 1.5F, -3F);

		/* WOODEN TOOLS */
		ALMOND_AXE = createAxe(DTToolMaterials.ALMOND, 6F, -3.2F);
		ALMOND_HOE = createHoe(DTToolMaterials.ALMOND, 0, -3F);
		ALMOND_PICKAXE = createPickaxe(DTToolMaterials.ALMOND, 1, -2.8F);
		ALMOND_SHOVEL = createShovel(DTToolMaterials.ALMOND, 1.5F, -3F);

		ANAMEATA_AXE = createAxe(DTToolMaterials.ANAMEATA, 6F, -3.2F);
		ANAMEATA_HOE = createHoe(DTToolMaterials.ANAMEATA, 0, -3F);
		ANAMEATA_PICKAXE = createPickaxe(DTToolMaterials.ANAMEATA, 1, -2.8F);
		ANAMEATA_SHOVEL = createShovel(DTToolMaterials.ANAMEATA, 1.5F, -3F);

		ANGELS_TRUMPET_AXE = createAxe(DTToolMaterials.ANGELS_TRUMPET, 6F, -3.2F);
		ANGELS_TRUMPET_HOE = createHoe(DTToolMaterials.ANGELS_TRUMPET, 0, -3F);
		ANGELS_TRUMPET_PICKAXE = createPickaxe(DTToolMaterials.ANGELS_TRUMPET, 1, -2.8F);
		ANGELS_TRUMPET_SHOVEL = createShovel(DTToolMaterials.ANGELS_TRUMPET, 1.5F, -3F);

		AQUEAN_AXE = createAxe(DTToolMaterials.AQUEAN, 6F, -3.2F);
		AQUEAN_HOE = createHoe(DTToolMaterials.AQUEAN, 0, -3F);
		AQUEAN_PICKAXE = createPickaxe(DTToolMaterials.AQUEAN, 1, -2.8F);
		AQUEAN_SHOVEL = createShovel(DTToolMaterials.AQUEAN, 1.5F, -3F);

		BARSHROOKLE_AXE = createAxe(DTToolMaterials.BARSHROOKLE, 6F, -3.2F);
		BARSHROOKLE_HOE = createHoe(DTToolMaterials.BARSHROOKLE, 0, -3F);
		BARSHROOKLE_PICKAXE = createPickaxe(DTToolMaterials.BARSHROOKLE, 1, -2.8F);
		BARSHROOKLE_SHOVEL = createShovel(DTToolMaterials.BARSHROOKLE, 1.5F, -3F);

		BLACK_BIRCH_AXE = createAxe(DTToolMaterials.BLACK_BIRCH, 6F, -3.2F);
		BLACK_BIRCH_HOE = createHoe(DTToolMaterials.BLACK_BIRCH, 0, -3F);
		BLACK_BIRCH_PICKAXE = createPickaxe(DTToolMaterials.BLACK_BIRCH, 1, -2.8F);
		BLACK_BIRCH_SHOVEL = createShovel(DTToolMaterials.BLACK_BIRCH, 1.5F, -3F);

		BLUE_MAHOE_AXE = createAxe(DTToolMaterials.BLUE_MAHOE, 6F, -3.2F);
		BLUE_MAHOE_HOE = createHoe(DTToolMaterials.BLUE_MAHOE, 0, -3F);
		BLUE_MAHOE_PICKAXE = createPickaxe(DTToolMaterials.BLUE_MAHOE, 1, -2.8F);
		BLUE_MAHOE_SHOVEL = createShovel(DTToolMaterials.BLUE_MAHOE, 1.5F, -3F);

		BLUE_SPRUCE_AXE = createAxe(DTToolMaterials.BLUE_SPRUCE, 6F, -3.2F);
		BLUE_SPRUCE_HOE = createHoe(DTToolMaterials.BLUE_SPRUCE, 0, -3F);
		BLUE_SPRUCE_PICKAXE = createPickaxe(DTToolMaterials.BLUE_SPRUCE, 1, -2.8F);
		BLUE_SPRUCE_SHOVEL = createShovel(DTToolMaterials.BLUE_SPRUCE, 1.5F, -3F);

		BOTTLEBRUSH_AXE = createAxe(DTToolMaterials.BOTTLEBRUSH, 6F, -3.2F);
		BOTTLEBRUSH_HOE = createHoe(DTToolMaterials.BOTTLEBRUSH, 0, -3F);
		BOTTLEBRUSH_PICKAXE = createPickaxe(DTToolMaterials.BOTTLEBRUSH, 1, -2.8F);
		BOTTLEBRUSH_SHOVEL = createShovel(DTToolMaterials.BOTTLEBRUSH, 1.5F, -3F);

		BROMYA_AXE = createAxe(DTToolMaterials.BROMYA, 6F, -3.2F);
		BROMYA_HOE = createHoe(DTToolMaterials.BROMYA, 0, -3F);
		BROMYA_PICKAXE = createPickaxe(DTToolMaterials.BROMYA, 1, -2.8F);
		BROMYA_SHOVEL = createShovel(DTToolMaterials.BROMYA, 1.5F, -3F);

		BUBBLETREE_AXE = createAxe(DTToolMaterials.BUBBLETREE, 6F, -3.2F);
		BUBBLETREE_HOE = createHoe(DTToolMaterials.BUBBLETREE, 0, -3F);
		BUBBLETREE_PICKAXE = createPickaxe(DTToolMaterials.BUBBLETREE, 1, -2.8F);
		BUBBLETREE_SHOVEL = createShovel(DTToolMaterials.BUBBLETREE, 1.5F, -3F);

		CALCEARB_AXE = createAxe(DTToolMaterials.CALCEARB, 6F, -3.2F);
		CALCEARB_HOE = createHoe(DTToolMaterials.CALCEARB, 0, -3F);
		CALCEARB_PICKAXE = createPickaxe(DTToolMaterials.CALCEARB, 1, -2.8F);
		CALCEARB_SHOVEL = createShovel(DTToolMaterials.CALCEARB, 1.5F, -3F);

		CHERRY_AXE = createAxe(DTToolMaterials.CHERRY, 6F, -3.2F);
		CHERRY_HOE = createHoe(DTToolMaterials.CHERRY, 0, -3F);
		CHERRY_PICKAXE = createPickaxe(DTToolMaterials.CHERRY, 1, -2.8F);
		CHERRY_SHOVEL = createShovel(DTToolMaterials.CHERRY, 1.5F, -3F);

		CHOTORN_AXE = createAxe(DTToolMaterials.CHOTORN, 6F, -3.2F);
		CHOTORN_HOE = createHoe(DTToolMaterials.CHOTORN, 0, -3F);
		CHOTORN_PICKAXE = createPickaxe(DTToolMaterials.CHOTORN, 1, -2.8F);
		CHOTORN_SHOVEL = createShovel(DTToolMaterials.CHOTORN, 1.5F, -3F);

		COOK_PINE_AXE = createAxe(DTToolMaterials.COOK_PINE, 6F, -3.2F);
		COOK_PINE_HOE = createHoe(DTToolMaterials.COOK_PINE, 0, -3F);
		COOK_PINE_PICKAXE = createPickaxe(DTToolMaterials.COOK_PINE, 1, -2.8F);
		COOK_PINE_SHOVEL = createShovel(DTToolMaterials.COOK_PINE, 1.5F, -3F);

		CROLOOD_AXE = createAxe(DTToolMaterials.CROLOOD, 6F, -3.2F);
		CROLOOD_HOE = createHoe(DTToolMaterials.CROLOOD, 0, -3F);
		CROLOOD_PICKAXE = createPickaxe(DTToolMaterials.CROLOOD, 1, -2.8F);
		CROLOOD_SHOVEL = createShovel(DTToolMaterials.CROLOOD, 1.5F, -3F);

		DARK_CROLOOD_AXE = createAxe(DTToolMaterials.DARK_CROLOOD, 6F, -3.2F);
		DARK_CROLOOD_HOE = createHoe(DTToolMaterials.DARK_CROLOOD, 0, -3F);
		DARK_CROLOOD_PICKAXE = createPickaxe(DTToolMaterials.DARK_CROLOOD, 1, -2.8F);
		DARK_CROLOOD_SHOVEL = createShovel(DTToolMaterials.DARK_CROLOOD, 1.5F, -3F);

		DARK_FUCHSITRA_AXE = createAxe(DTToolMaterials.DARK_FUCHSITRA, 6F, -3.2F);
		DARK_FUCHSITRA_HOE = createHoe(DTToolMaterials.DARK_FUCHSITRA, 0, -3F);
		DARK_FUCHSITRA_PICKAXE = createPickaxe(DTToolMaterials.DARK_FUCHSITRA, 1, -2.8F);
		DARK_FUCHSITRA_SHOVEL = createShovel(DTToolMaterials.DARK_FUCHSITRA, 1.5F, -3F);

		DARK_RED_ELM_AXE = createAxe(DTToolMaterials.DARK_RED_ELM, 6F, -3.2F);
		DARK_RED_ELM_HOE = createHoe(DTToolMaterials.DARK_RED_ELM, 0, -3F);
		DARK_RED_ELM_PICKAXE = createPickaxe(DTToolMaterials.DARK_RED_ELM, 1, -2.8F);
		DARK_RED_ELM_SHOVEL = createShovel(DTToolMaterials.DARK_RED_ELM, 1.5F, -3F);

		DEAD_WART_TREE_AXE = createAxe(DTToolMaterials.DEAD_WART_TREE, 6F, -3.2F);
		DEAD_WART_TREE_HOE = createHoe(DTToolMaterials.DEAD_WART_TREE, 0, -3F);
		DEAD_WART_TREE_PICKAXE = createPickaxe(DTToolMaterials.DEAD_WART_TREE, 1, -2.8F);
		DEAD_WART_TREE_SHOVEL = createShovel(DTToolMaterials.DEAD_WART_TREE, 1.5F, -3F);

		DRIGYUS_AXE = createAxe(DTToolMaterials.DRIGYUS, 6F, -3.2F);
		DRIGYUS_HOE = createHoe(DTToolMaterials.DRIGYUS, 0, -3F);
		DRIGYUS_PICKAXE = createPickaxe(DTToolMaterials.DRIGYUS, 1, -2.8F);
		DRIGYUS_SHOVEL = createShovel(DTToolMaterials.DRIGYUS, 1.5F, -3F);

		EBONY_AXE = createAxe(DTToolMaterials.EBONY, 6F, -3.2F);
		EBONY_HOE = createHoe(DTToolMaterials.EBONY, 0, -3F);
		EBONY_PICKAXE = createPickaxe(DTToolMaterials.EBONY, 1, -2.8F);
		EBONY_SHOVEL = createShovel(DTToolMaterials.EBONY, 1.5F, -3F);

		ENDERHEART_AXE = createAxe(DTToolMaterials.ENDERHEART, 6F, -3.2F);
		ENDERHEART_HOE = createHoe(DTToolMaterials.ENDERHEART, 0, -3F);
		ENDERHEART_PICKAXE = createPickaxe(DTToolMaterials.ENDERHEART, 1, -2.8F);
		ENDERHEART_SHOVEL = createShovel(DTToolMaterials.ENDERHEART, 1.5F, -3F);

		FLALM_AXE = createAxe(DTToolMaterials.FLALM, 6F, -3.2F);
		FLALM_HOE = createHoe(DTToolMaterials.FLALM, 0, -3F);
		FLALM_PICKAXE = createPickaxe(DTToolMaterials.FLALM, 1, -2.8F);
		FLALM_SHOVEL = createShovel(DTToolMaterials.FLALM, 1.5F, -3F);

		FRUCE_AXE = createAxe(DTToolMaterials.FRUCE, 6F, -3.2F);
		FRUCE_HOE = createHoe(DTToolMaterials.FRUCE, 0, -3F);
		FRUCE_PICKAXE = createPickaxe(DTToolMaterials.FRUCE, 1, -2.8F);
		FRUCE_SHOVEL = createShovel(DTToolMaterials.FRUCE, 1.5F, -3F);

		FUCHSITRA_AXE = createAxe(DTToolMaterials.FUCHSITRA, 6F, -3.2F);
		FUCHSITRA_HOE = createHoe(DTToolMaterials.FUCHSITRA, 0, -3F);
		FUCHSITRA_PICKAXE = createPickaxe(DTToolMaterials.FUCHSITRA, 1, -2.8F);
		FUCHSITRA_SHOVEL = createShovel(DTToolMaterials.FUCHSITRA, 1.5F, -3F);

		FUGMOS_AXE = createAxe(DTToolMaterials.FUGMOS, 6F, -3.2F);
		FUGMOS_HOE = createHoe(DTToolMaterials.FUGMOS, 0, -3F);
		FUGMOS_PICKAXE = createPickaxe(DTToolMaterials.FUGMOS, 1, -2.8F);
		FUGMOS_SHOVEL = createShovel(DTToolMaterials.FUGMOS, 1.5F, -3F);

		FUNERANITE_AXE = createAxe(DTToolMaterials.FUNERANITE, 6F, -3.2F);
		FUNERANITE_HOE = createHoe(DTToolMaterials.FUNERANITE, 0, -3F);
		FUNERANITE_PICKAXE = createPickaxe(DTToolMaterials.FUNERANITE, 1, -2.8F);
		FUNERANITE_SHOVEL = createShovel(DTToolMaterials.FUNERANITE, 1.5F, -3F);

		GHOSHROOM_AXE = createAxe(DTToolMaterials.GHOSHROOM, 6F, -3.2F);
		GHOSHROOM_HOE = createHoe(DTToolMaterials.GHOSHROOM, 0, -3F);
		GHOSHROOM_PICKAXE = createPickaxe(DTToolMaterials.GHOSHROOM, 1, -2.8F);
		GHOSHROOM_SHOVEL = createShovel(DTToolMaterials.GHOSHROOM, 1.5F, -3F);

		GIANT_VIOLET_AXE = createAxe(DTToolMaterials.GIANT_VIOLET, 6F, -3.2F);
		GIANT_VIOLET_HOE = createHoe(DTToolMaterials.GIANT_VIOLET, 0, -3F);
		GIANT_VIOLET_PICKAXE = createPickaxe(DTToolMaterials.GIANT_VIOLET, 1, -2.8F);
		GIANT_VIOLET_SHOVEL = createShovel(DTToolMaterials.GIANT_VIOLET, 1.5F, -3F);

		GUAIACUM_AXE = createAxe(DTToolMaterials.GUAIACUM, 6F, -3.2F);
		GUAIACUM_HOE = createHoe(DTToolMaterials.GUAIACUM, 0, -3F);
		GUAIACUM_PICKAXE = createPickaxe(DTToolMaterials.GUAIACUM, 1, -2.8F);
		GUAIACUM_SHOVEL = createShovel(DTToolMaterials.GUAIACUM, 1.5F, -3F);

		JOSHUA_AXE = createAxe(DTToolMaterials.JOSHUA, 6F, -3.2F);
		JOSHUA_HOE = createHoe(DTToolMaterials.JOSHUA, 0, -3F);
		JOSHUA_PICKAXE = createPickaxe(DTToolMaterials.JOSHUA, 1, -2.8F);
		JOSHUA_SHOVEL = createShovel(DTToolMaterials.JOSHUA, 1.5F, -3F);

		KLINKII_PINE_AXE = createAxe(DTToolMaterials.KLINKII_PINE, 6F, -3.2F);
		KLINKII_PINE_HOE = createHoe(DTToolMaterials.KLINKII_PINE, 0, -3F);
		KLINKII_PINE_PICKAXE = createPickaxe(DTToolMaterials.KLINKII_PINE, 1, -2.8F);
		KLINKII_PINE_SHOVEL = createShovel(DTToolMaterials.KLINKII_PINE, 1.5F, -3F);

		MELALEUCA_AXE = createAxe(DTToolMaterials.MELALEUCA, 6F, -3.2F);
		MELALEUCA_HOE = createHoe(DTToolMaterials.MELALEUCA, 0, -3F);
		MELALEUCA_PICKAXE = createPickaxe(DTToolMaterials.MELALEUCA, 1, -2.8F);
		MELALEUCA_SHOVEL = createShovel(DTToolMaterials.MELALEUCA, 1.5F, -3F);

		MURKANTUAN_AXE = createAxe(DTToolMaterials.MURKANTUAN, 6F, -3.2F);
		MURKANTUAN_HOE = createHoe(DTToolMaterials.MURKANTUAN, 0, -3F);
		MURKANTUAN_PICKAXE = createPickaxe(DTToolMaterials.MURKANTUAN, 1, -2.8F);
		MURKANTUAN_SHOVEL = createShovel(DTToolMaterials.MURKANTUAN, 1.5F, -3F);

		NORFOLK_PINE_AXE = createAxe(DTToolMaterials.NORFOLK_PINE, 6F, -3.2F);
		NORFOLK_PINE_HOE = createHoe(DTToolMaterials.NORFOLK_PINE, 0, -3F);
		NORFOLK_PINE_PICKAXE = createPickaxe(DTToolMaterials.NORFOLK_PINE, 1, -2.8F);
		NORFOLK_PINE_SHOVEL = createShovel(DTToolMaterials.NORFOLK_PINE, 1.5F, -3F);

		OBSCRUS_AXE = createAxe(DTToolMaterials.OBSCRUS, 6F, -3.2F);
		OBSCRUS_HOE = createHoe(DTToolMaterials.OBSCRUS, 0, -3F);
		OBSCRUS_PICKAXE = createPickaxe(DTToolMaterials.OBSCRUS, 1, -2.8F);
		OBSCRUS_SHOVEL = createShovel(DTToolMaterials.OBSCRUS, 1.5F, -3F);

		ORHPRIS_AXE = createAxe(DTToolMaterials.ORHPRIS, 6F, -3.2F);
		ORHPRIS_HOE = createHoe(DTToolMaterials.ORHPRIS, 0, -3F);
		ORHPRIS_PICKAXE = createPickaxe(DTToolMaterials.ORHPRIS, 1, -2.8F);
		ORHPRIS_SHOVEL = createShovel(DTToolMaterials.ORHPRIS, 1.5F, -3F);

		PELTOGYNE_AXE = createAxe(DTToolMaterials.PELTOGYNE, 6F, -3.2F);
		PELTOGYNE_HOE = createHoe(DTToolMaterials.PELTOGYNE, 0, -3F);
		PELTOGYNE_PICKAXE = createPickaxe(DTToolMaterials.PELTOGYNE, 1, -2.8F);
		PELTOGYNE_SHOVEL = createShovel(DTToolMaterials.PELTOGYNE, 1.5F, -3F);

		PIN_CHERRY_AXE = createAxe(DTToolMaterials.PIN_CHERRY, 6F, -3.2F);
		PIN_CHERRY_HOE = createHoe(DTToolMaterials.PIN_CHERRY, 0, -3F);
		PIN_CHERRY_PICKAXE = createPickaxe(DTToolMaterials.PIN_CHERRY, 1, -2.8F);
		PIN_CHERRY_SHOVEL = createShovel(DTToolMaterials.PIN_CHERRY, 1.5F, -3F);

		PLUM_AXE = createAxe(DTToolMaterials.PLUM, 6F, -3.2F);
		PLUM_HOE = createHoe(DTToolMaterials.PLUM, 0, -3F);
		PLUM_PICKAXE = createPickaxe(DTToolMaterials.PLUM, 1, -2.8F);
		PLUM_SHOVEL = createShovel(DTToolMaterials.PLUM, 1.5F, -3F);

		PURFUNGA_AXE = createAxe(DTToolMaterials.PURFUNGA, 6F, -3.2F);
		PURFUNGA_HOE = createHoe(DTToolMaterials.PURFUNGA, 0, -3F);
		PURFUNGA_PICKAXE = createPickaxe(DTToolMaterials.PURFUNGA, 1, -2.8F);
		PURFUNGA_SHOVEL = createShovel(DTToolMaterials.PURFUNGA, 1.5F, -3F);

		RARK_AXE = createAxe(DTToolMaterials.RARK, 6F, -3.2F);
		RARK_HOE = createHoe(DTToolMaterials.RARK, 0, -3F);
		RARK_PICKAXE = createPickaxe(DTToolMaterials.RARK, 1, -2.8F);
		RARK_SHOVEL = createShovel(DTToolMaterials.RARK, 1.5F, -3F);

		RED_ELM_AXE = createAxe(DTToolMaterials.RED_ELM, 6F, -3.2F);
		RED_ELM_HOE = createHoe(DTToolMaterials.RED_ELM, 0, -3F);
		RED_ELM_PICKAXE = createPickaxe(DTToolMaterials.RED_ELM, 1, -2.8F);
		RED_ELM_SHOVEL = createShovel(DTToolMaterials.RED_ELM, 1.5F, -3F);

		RHADI_AXE = createAxe(DTToolMaterials.RHADI, 6F, -3.2F);
		RHADI_HOE = createHoe(DTToolMaterials.RHADI, 0, -3F);
		RHADI_PICKAXE = createPickaxe(DTToolMaterials.RHADI, 1, -2.8F);
		RHADI_SHOVEL = createShovel(DTToolMaterials.RHADI, 1.5F, -3F);

		SANGUART_AXE = createAxe(DTToolMaterials.SANGUART, 6F, -3.2F);
		SANGUART_HOE = createHoe(DTToolMaterials.SANGUART, 0, -3F);
		SANGUART_PICKAXE = createPickaxe(DTToolMaterials.SANGUART, 1, -2.8F);
		SANGUART_SHOVEL = createShovel(DTToolMaterials.SANGUART, 1.5F, -3F);

		SCARLET_THIORCEN_AXE = createAxe(DTToolMaterials.SCARLET_THIORCEN, 6F, -3.2F);
		SCARLET_THIORCEN_HOE = createHoe(DTToolMaterials.SCARLET_THIORCEN, 0, -3F);
		SCARLET_THIORCEN_PICKAXE = createPickaxe(DTToolMaterials.SCARLET_THIORCEN, 1, -2.8F);
		SCARLET_THIORCEN_SHOVEL = createShovel(DTToolMaterials.SCARLET_THIORCEN, 1.5F, -3F);

		SEQUOIA_AXE = createAxe(DTToolMaterials.SEQUOIA, 6F, -3.2F);
		SEQUOIA_HOE = createHoe(DTToolMaterials.SEQUOIA, 0, -3F);
		SEQUOIA_PICKAXE = createPickaxe(DTToolMaterials.SEQUOIA, 1, -2.8F);
		SEQUOIA_SHOVEL = createShovel(DTToolMaterials.SEQUOIA, 1.5F, -3F);

		SPROOM_AXE = createAxe(DTToolMaterials.SPROOM, 6F, -3.2F);
		SPROOM_HOE = createHoe(DTToolMaterials.SPROOM, 0, -3F);
		SPROOM_PICKAXE = createPickaxe(DTToolMaterials.SPROOM, 1, -2.8F);
		SPROOM_SHOVEL = createShovel(DTToolMaterials.SPROOM, 1.5F, -3F);

		STORTREEAN_AXE = createAxe(DTToolMaterials.STORTREEAN, 6F, -3.2F);
		STORTREEAN_HOE = createHoe(DTToolMaterials.STORTREEAN, 0, -3F);
		STORTREEAN_PICKAXE = createPickaxe(DTToolMaterials.STORTREEAN, 1, -2.8F);
		STORTREEAN_SHOVEL = createShovel(DTToolMaterials.STORTREEAN, 1.5F, -3F);

		STROOMEAN_AXE = createAxe(DTToolMaterials.STROOMEAN, 6F, -3.2F);
		STROOMEAN_HOE = createHoe(DTToolMaterials.STROOMEAN, 0, -3F);
		STROOMEAN_PICKAXE = createPickaxe(DTToolMaterials.STROOMEAN, 1, -2.8F);
		STROOMEAN_SHOVEL = createShovel(DTToolMaterials.STROOMEAN, 1.5F, -3F);

		SUNRISE_FUNGUS_AXE = createAxe(DTToolMaterials.SUNRISE_FUNGUS, 6F, -3.2F);
		SUNRISE_FUNGUS_HOE = createHoe(DTToolMaterials.SUNRISE_FUNGUS, 0, -3F);
		SUNRISE_FUNGUS_PICKAXE = createPickaxe(DTToolMaterials.SUNRISE_FUNGUS, 1, -2.8F);
		SUNRISE_FUNGUS_SHOVEL = createShovel(DTToolMaterials.SUNRISE_FUNGUS, 1.5F, -3F);

		TARK_AXE = createAxe(DTToolMaterials.TARK, 6F, -3.2F);
		TARK_HOE = createHoe(DTToolMaterials.TARK, 0, -3F);
		TARK_PICKAXE = createPickaxe(DTToolMaterials.TARK, 1, -2.8F);
		TARK_SHOVEL = createShovel(DTToolMaterials.TARK, 1.5F, -3F);

		TEAK_AXE = createAxe(DTToolMaterials.TEAK, 6F, -3.2F);
		TEAK_HOE = createHoe(DTToolMaterials.TEAK, 0, -3F);
		TEAK_PICKAXE = createPickaxe(DTToolMaterials.TEAK, 1, -2.8F);
		TEAK_SHOVEL = createShovel(DTToolMaterials.TEAK, 1.5F, -3F);

		THUNDERCLOUD_PLUM_AXE = createAxe(DTToolMaterials.THUNDERCLOUD_PLUM, 6F, -3.2F);
		THUNDERCLOUD_PLUM_HOE = createHoe(DTToolMaterials.THUNDERCLOUD_PLUM, 0, -3F);
		THUNDERCLOUD_PLUM_PICKAXE = createPickaxe(DTToolMaterials.THUNDERCLOUD_PLUM, 1, -2.8F);
		THUNDERCLOUD_PLUM_SHOVEL = createShovel(DTToolMaterials.THUNDERCLOUD_PLUM, 1.5F, -3F);

		VYNHERT_AXE = createAxe(DTToolMaterials.VYNHERT, 6F, -3.2F);
		VYNHERT_HOE = createHoe(DTToolMaterials.VYNHERT, 0, -3F);
		VYNHERT_PICKAXE = createPickaxe(DTToolMaterials.VYNHERT, 1, -2.8F);
		VYNHERT_SHOVEL = createShovel(DTToolMaterials.VYNHERT, 1.5F, -3F);

		WART_TREE_AXE = createAxe(DTToolMaterials.WART_TREE, 6F, -3.2F);
		WART_TREE_HOE = createHoe(DTToolMaterials.WART_TREE, 0, -3F);
		WART_TREE_PICKAXE = createPickaxe(DTToolMaterials.WART_TREE, 1, -2.8F);
		WART_TREE_SHOVEL = createShovel(DTToolMaterials.WART_TREE, 1.5F, -3F);

		WENGE_AXE = createAxe(DTToolMaterials.WENGE, 6F, -3.2F);
		WENGE_HOE = createHoe(DTToolMaterials.WENGE, 0, -3F);
		WENGE_PICKAXE = createPickaxe(DTToolMaterials.WENGE, 1, -2.8F);
		WENGE_SHOVEL = createShovel(DTToolMaterials.WENGE, 1.5F, -3F);

		YEW_AXE = createAxe(DTToolMaterials.YEW, 6F, -3.2F);
		YEW_HOE = createHoe(DTToolMaterials.YEW, 0, -3F);
		YEW_PICKAXE = createPickaxe(DTToolMaterials.YEW, 1, -2.8F);
		YEW_SHOVEL = createShovel(DTToolMaterials.YEW, 1.5F, -3F);

		/* ARMOR */
		AQUAMARINE_HELMET = createHelmet(DTArmorMaterials.AQUAMARINE);
		AQUAMARINE_CHESTPLATE = createChestplate(DTArmorMaterials.AQUAMARINE);
		AQUAMARINE_LEGGINGS = createLeggings(DTArmorMaterials.AQUAMARINE);
		AQUAMARINE_BOOTS = createBoots(DTArmorMaterials.AQUAMARINE);

		BORON_HELMET = createHelmet(DTArmorMaterials.BORON);
		BORON_CHESTPLATE = createChestplate(DTArmorMaterials.BORON);
		BORON_LEGGINGS = createLeggings(DTArmorMaterials.BORON);
		BORON_BOOTS = createBoots(DTArmorMaterials.BORON);

		CHALCEDONY_HELMET = createHelmet(DTArmorMaterials.CHALCEDONY);
		CHALCEDONY_CHESTPLATE = createChestplate(DTArmorMaterials.CHALCEDONY);
		CHALCEDONY_LEGGINGS = createLeggings(DTArmorMaterials.CHALCEDONY);
		CHALCEDONY_BOOTS = createBoots(DTArmorMaterials.CHALCEDONY);

		CLINOHUMITE_HELMET = createHelmet(DTArmorMaterials.CLINOHUMITE);
		CLINOHUMITE_CHESTPLATE = createChestplate(DTArmorMaterials.CLINOHUMITE);
		CLINOHUMITE_LEGGINGS = createLeggings(DTArmorMaterials.CLINOHUMITE);
		CLINOHUMITE_BOOTS = createBoots(DTArmorMaterials.CLINOHUMITE);

		DIOPSIDE_HELMET = createHelmet(DTArmorMaterials.DIOPSIDE);
		DIOPSIDE_CHESTPLATE = createChestplate(DTArmorMaterials.DIOPSIDE);
		DIOPSIDE_LEGGINGS = createLeggings(DTArmorMaterials.DIOPSIDE);
		DIOPSIDE_BOOTS = createBoots(DTArmorMaterials.DIOPSIDE);

		ENRON_HELMET = createHelmet(DTArmorMaterials.ENRON);
		ENRON_CHESTPLATE = createChestplate(DTArmorMaterials.ENRON);
		ENRON_LEGGINGS = createLeggings(DTArmorMaterials.ENRON);
		ENRON_BOOTS = createBoots(DTArmorMaterials.ENRON);

		ENSTATITE_HELMET = createHelmet(DTArmorMaterials.ENSTATITE);
		ENSTATITE_CHESTPLATE = createChestplate(DTArmorMaterials.ENSTATITE);
		ENSTATITE_LEGGINGS = createLeggings(DTArmorMaterials.ENSTATITE);
		ENSTATITE_BOOTS = createBoots(DTArmorMaterials.ENSTATITE);

		KRALCTIUM_HELMET = createHelmet(DTArmorMaterials.KRALCTIUM);
		KRALCTIUM_CHESTPLATE = createChestplate(DTArmorMaterials.KRALCTIUM);
		KRALCTIUM_LEGGINGS = createLeggings(DTArmorMaterials.KRALCTIUM);
		KRALCTIUM_BOOTS = createBoots(DTArmorMaterials.KRALCTIUM);

		MORGANITE_HELMET = createHelmet(DTArmorMaterials.MORGANITE);
		MORGANITE_CHESTPLATE = createChestplate(DTArmorMaterials.MORGANITE);
		MORGANITE_LEGGINGS = createLeggings(DTArmorMaterials.MORGANITE);
		MORGANITE_BOOTS = createBoots(DTArmorMaterials.MORGANITE);

		RUBY_HELMET = createHelmet(DTArmorMaterials.RUBY);
		RUBY_CHESTPLATE = createChestplate(DTArmorMaterials.RUBY);
		RUBY_LEGGINGS = createLeggings(DTArmorMaterials.RUBY);
		RUBY_BOOTS = createBoots(DTArmorMaterials.RUBY);

		SAPPHIRE_HELMET = createHelmet(DTArmorMaterials.SAPPHIRE);
		SAPPHIRE_CHESTPLATE = createChestplate(DTArmorMaterials.SAPPHIRE);
		SAPPHIRE_LEGGINGS = createLeggings(DTArmorMaterials.SAPPHIRE);
		SAPPHIRE_BOOTS = createBoots(DTArmorMaterials.SAPPHIRE);

		SILVER_HELMET = createHelmet(DTArmorMaterials.SILVER);
		SILVER_CHESTPLATE = createChestplate(DTArmorMaterials.SILVER);
		SILVER_LEGGINGS = createLeggings(DTArmorMaterials.SILVER);
		SILVER_BOOTS = createBoots(DTArmorMaterials.SILVER);

		SPHENE_HELMET = createHelmet(DTArmorMaterials.SPHENE);
		SPHENE_CHESTPLATE = createChestplate(DTArmorMaterials.SPHENE);
		SPHENE_LEGGINGS = createLeggings(DTArmorMaterials.SPHENE);
		SPHENE_BOOTS = createBoots(DTArmorMaterials.SPHENE);

		SPINEL_HELMET = createHelmet(DTArmorMaterials.SPINEL);
		SPINEL_CHESTPLATE = createChestplate(DTArmorMaterials.SPINEL);
		SPINEL_LEGGINGS = createLeggings(DTArmorMaterials.SPINEL);
		SPINEL_BOOTS = createBoots(DTArmorMaterials.SPINEL);

		TANZANITE_HELMET = createHelmet(DTArmorMaterials.TANZANITE);
		TANZANITE_CHESTPLATE = createChestplate(DTArmorMaterials.TANZANITE);
		TANZANITE_LEGGINGS = createLeggings(DTArmorMaterials.TANZANITE);
		TANZANITE_BOOTS = createBoots(DTArmorMaterials.TANZANITE);

		TOPAZ_HELMET = createHelmet(DTArmorMaterials.TOPAZ);
		TOPAZ_CHESTPLATE = createChestplate(DTArmorMaterials.TOPAZ);
		TOPAZ_LEGGINGS = createLeggings(DTArmorMaterials.TOPAZ);
		TOPAZ_BOOTS = createBoots(DTArmorMaterials.TOPAZ);

		VOID_CRITTERED_DIOPSIDE_HELMET = createHelmet(DTArmorMaterials.VOID_CRITTERED_DIOPSIDE);
		VOID_CRITTERED_DIOPSIDE_CHESTPLATE = createChestplate(DTArmorMaterials.VOID_CRITTERED_DIOPSIDE);
		VOID_CRITTERED_DIOPSIDE_LEGGINGS = createLeggings(DTArmorMaterials.VOID_CRITTERED_DIOPSIDE);
		VOID_CRITTERED_DIOPSIDE_BOOTS = createBoots(DTArmorMaterials.VOID_CRITTERED_DIOPSIDE);

		/* TALISMANS */
		AQUAMARINE_TALISMAN = createItem(COMBAT);
		SPHENE_TALISMAN = createItem(COMBAT);
		TANZANITE_TALISMAN = createItem(COMBAT);

		/* JEWELRY */
		BLACK_PEARL = createItem(MINERALOGY);
		BLACK_OPAL_SHARD = createItem(MINERALOGY);
		CLINOHUMITE_SHARD = createItem(MINERALOGY);
		DIAMOND_SHARD = createItem(MINERALOGY);
		GARNET_SHARD = createItem(MINERALOGY);
		OPAL_SHARD = createItem(MINERALOGY);
		SAPPHIRE_SHARD = createItem(MINERALOGY);
		SUGILITE_SHARD = createItem(MINERALOGY);

		/* ORES */
		AQUAMARINE = createItem(MINERALOGY);
		BLACK_OPAL = createItem(MINERALOGY);
		CHALCEDONY = createItem(MINERALOGY);
		CLINOHUMITE = createItem(MINERALOGY);
		DIOPSIDE = createItem(MINERALOGY);
		ENSTATITE = createItem(MINERALOGY);
		GARNET = createItem(MINERALOGY);
		MORGANITE = createItem(MINERALOGY);
		OPAL = createItem(MINERALOGY);
		RAW_ACTINIUM = createItem(MINERALOGY);
		RAW_BORON = createItem(MINERALOGY);
		RAW_ENRON = createItem(MINERALOGY);
		RAW_SILICON = createItem(MINERALOGY);
		RAW_SILVER = createItem(MINERALOGY);
		RAW_STROXITE = createItem(MINERALOGY);
		RAW_TUNGSTEN = createItem(MINERALOGY);
		CHARGED_RAW_TUNGSTEN = createItem(MINERALOGY);
		RAW_URANIUM = createItem(MINERALOGY);
		RAW_URANOLUMEN = createItem(MINERALOGY);
		RUBY = createItem(MINERALOGY);
		SAPPHIRE = createItem(MINERALOGY);
		SPHENE = createItem(MINERALOGY);
		SPINEL = createItem(MINERALOGY);
		SUGILITE = createItem(MINERALOGY);
		TANZANITE = createItem(MINERALOGY);
		TOPAZ = createItem(MINERALOGY);
		VOID_CRITTERED_DIOPSIDE = createItem(MINERALOGY);

		/* INGOTS */
		ACTINIUM_INGOT = createItem(MINERALOGY);
		BORON_INGOT = createItem(MINERALOGY);
		ENRON_INGOT = createItem(MINERALOGY);
		GYLDELION_INGOT = createItem(MINERALOGY);
		KRALCTIUM_INGOT = createItem(MINERALOGY);
		SILICON_INGOT = createItem(MINERALOGY);
		SILVER_INGOT = createItem(MINERALOGY);
		STROXITE_INGOT = createItem(MINERALOGY);
		TUNGSTEN_INGOT = createItem(MINERALOGY);
        CHARGED_TUNGSTEN_INGOT = createItem(MINERALOGY);
		URANIUM_INGOT = createItem(MINERALOGY);
		URANOLUMEN_INGOT = createItem(MINERALOGY);

		/* NUGGETS */
		ACTINIUM_NUGGET = createItem(MINERALOGY);
		BORON_NUGGET = createItem(MINERALOGY);
		ENRON_NUGGET = createItem(MINERALOGY);
		GYLDELION_NUGGET = createItem(MINERALOGY);
		KRALCTIUM_NUGGET = createItem(MINERALOGY);
		SILICON_NUGGET = createItem(MINERALOGY);
		SILVER_NUGGET = createItem(MINERALOGY);
		STROXITE_NUGGET = createItem(MINERALOGY);
		TUNGSTEN_NUGGET = createItem(MINERALOGY);
        CHARGED_TUNGSTEN_NUGGET = createItem(MINERALOGY);
		URANIUM_NUGGET = createItem(MINERALOGY);
		URANOLUMEN_NUGGET = createItem(MINERALOGY);

		/* POWDERS */
		URANIUM_POWDER = createItem(MINERALOGY);
		URANOLUMEN_POWDER = createItem(MINERALOGY);

		/* GYNDELION */
		GYLDELION_DYE = createItem(MISC);

		/* MOB DROPS */
		LOOSEJAW_TOOTH = createItem(MISC);

		/* BLOCK ITEMS */
		AIRIAL_MOSS = createBlockItem(DTBlocks.AIRIAL_MOSS, ARBOROLOGY);
		ILMIUM = createBlockItem(DTBlocks.ILMIUM, ARBOROLOGY);
	}

	public static void initialize() {
		/* BIOLUMINESCENT BLOCKS */
		registerBlockItem("deep_trenches:black_bioluminescent_block", BLACK_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:brown_bioluminescent_block", BROWN_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:cyan_bioluminescent_block", CYAN_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:green_bioluminescent_block", GREEN_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:light_blue_bioluminescent_block", LIGHT_BLUE_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:lime_bioluminescent_block", LIME_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:magenta_bioluminescent_block", MAGENTA_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:orange_bioluminescent_block", ORANGE_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:purple_bioluminescent_block", PURPLE_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:red_bioluminescent_block", RED_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:white_bioluminescent_block", WHITE_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:yellow_bioluminescent_block", YELLOW_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);

		/* REDSTONE */
		registerBlockItem("deep_trenches:kralctium_microflare", KRALCTIUM_MICROFLARE, MISC);
		registerBlockItem("deep_trenches:lightning_dispenser", LIGHTNING_DISPENSER, MISC);
		registerBlockItem("deep_trenches:static_lightning_rod", STATIC_LIGHTNING_ROD, MISC);

		/* EXPLOSIVE BLOCKS */
		registerBlockItem("deep_trenches:nuclear_bomb", NUCLEAR_BOMB, MISC);
		registerBlockItem("deep_trenches:nuclear_waste", NUCLEAR_WASTE, MISC);
		registerBlockItem("deep_trenches:sns", SNS, MISC);
		registerBlockItem("deep_trenches:sus", SUS, MISC);

		/* ICE BLOCKS */
		registerBlockItem("deep_trenches:cryogenic_ice", CRYOGENIC_ICE, MISC);
		registerBlockItem("deep_trenches:black_ice", BLACK_ICE, MISC);
		registerBlockItem("deep_trenches:green_ice", GREEN_ICE, MISC);
		registerBlockItem("deep_trenches:marine_snow", MARINE_SNOW, MISC);
		registerBlockItem("deep_trenches:storcean_marine_snow", STORCEAN_MARINE_SNOW, MISC);

		/* BLOCK ENTITIES */
		registerBlockItem("deep_trenches:stasp_nest", STASP_NEST, MISC);

		/* OTHER STONES */
		registerBlockItem("deep_trenches:black_marble", BLACK_MARBLE, MINERALOGY);
		registerBlockItem("deep_trenches:gray_marble", GRAY_MARBLE, MINERALOGY);
		registerBlockItem("deep_trenches:marble", MARBLE, MINERALOGY);
		registerBlockItem("deep_trenches:light_opalite", LIGHT_OPALITE, MINERALOGY);
		registerBlockItem("deep_trenches:lushine", LUSHINE, MINERALOGY);
		registerBlockItem("deep_trenches:lushine_pillar", LUSHINE_PILLAR, MINERALOGY);
		registerBlockItem("deep_trenches:lustrite", LUSTRITE, MINERALOGY);
		registerBlockItem("deep_trenches:poinine", POININE, MINERALOGY);
		registerBlockItem("deep_trenches:ringwoodite", RINGWOODITE, MINERALOGY);
		registerBlockItem("deep_trenches:skystone", SKYSTONE, MINERALOGY);
		registerBlockItem("deep_trenches:sulfur", SULFUR, MINERALOGY);
		registerBlockItem("deep_trenches:verdine", VERDINE, MINERALOGY);
		registerBlockItem("deep_trenches:waved_bedrock", WAVED_BEDROCK, MINERALOGY);

		/* STONES */
		registerBlockItem("deep_trenches:black_basalt", BLACK_BASALT, MINERALOGY);
		registerBlockItem("deep_trenches:black_basalt_bricks", BLACK_BASALT_BRICKS, MINERALOGY);
		registerBlockItem("deep_trenches:black_basalt_pillar", BLACK_BASALT_PILLAR, MINERALOGY);
		registerBlockItem("deep_trenches:black_basalt_tiles", BLACK_BASALT_TILES, MINERALOGY);
		registerBlockItem("deep_trenches:chiseled_black_basalt", CHISELED_BLACK_BASALT, MINERALOGY);
		registerBlockItem("deep_trenches:cracked_black_basalt_bricks", CRACKED_BLACK_BASALT_BRICKS, MINERALOGY);
		registerBlockItem("deep_trenches:cracked_black_basalt_tiles", CRACKED_BLACK_BASALT_TILES, MINERALOGY);

		registerBlockItem("deep_trenches:bedrock_bricks", BEDROCK_BRICKS, MINERALOGY);
		registerBlockItem("deep_trenches:bedrock_pillar", BEDROCK_PILLAR, MINERALOGY);
		registerBlockItem("deep_trenches:chiseled_bedrock", CHISELED_BEDROCK, MINERALOGY);

		registerBlockItem("deep_trenches:blue_storcerack", BLUE_STORCERACK, MINERALOGY);
		registerBlockItem("deep_trenches:chiseled_blue_storcerack", CHISELED_BLUE_STORCERACK, MINERALOGY);
		registerBlockItem("deep_trenches:cracked_blue_storcerack_bricks", CRACKED_BLUE_STORCERACK_BRICKS, MINERALOGY);
		registerBlockItem("deep_trenches:cracked_blue_storcerack_tiles", CRACKED_BLUE_STORCERACK_TILES, MINERALOGY);
		registerBlockItem("deep_trenches:polished_blue_storcerack", POLISHED_BLUE_STORCERACK, MINERALOGY);

		registerBlockItem("deep_trenches:hadal_stone", HADAL_STONE, MINERALOGY);
		registerBlockItem("deep_trenches:hadal_stone_bricks", HADAL_STONE_BRICKS, MINERALOGY);
		registerBlockItem("deep_trenches:hadal_stone_pillar", HADAL_STONE_PILLAR, MINERALOGY);
		registerBlockItem("deep_trenches:hadal_stone_tiles", HADAL_STONE_TILES, MINERALOGY);
		registerBlockItem("deep_trenches:chiseled_hadal_stone", CHISELED_HADAL_STONE, MINERALOGY);
		registerBlockItem("deep_trenches:cracked_hadal_stone_bricks", CRACKED_HADAL_STONE_BRICKS, MINERALOGY);
		registerBlockItem("deep_trenches:cracked_hadal_stone_tiles", CRACKED_HADAL_STONE_TILES, MINERALOGY);
		registerBlockItem("deep_trenches:polished_hadal_stone", POLISHED_HADAL_STONE, MINERALOGY);

		registerBlockItem("deep_trenches:flint_shards", FLINT_SHARDS, MINERALOGY);
		registerBlockItem("deep_trenches:flint_stone", FLINT_STONE, MINERALOGY);
		registerBlockItem("deep_trenches:polished_flint_stone", POLISHED_FLINT_STONE, MINERALOGY);

		registerBlockItem("deep_trenches:garnet_bricks", GARNET_BRICKS, MINERALOGY);
		registerBlockItem("deep_trenches:garnet_pillar", GARNET_PILLAR, MINERALOGY);
		registerBlockItem("deep_trenches:chiseled_garnet_block", CHISELED_GARNET_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:totem_chiseled_garnet", TOTEM_CHISELED_GARNET, MINERALOGY);

		registerBlockItem("deep_trenches:infinital_stone", INFINITAL_STONE, MINERALOGY);
		registerBlockItem("deep_trenches:infinital_stone_bricks", INFINITAL_STONE_BRICKS, MINERALOGY);
		registerBlockItem("deep_trenches:infinital_stone_pillar", INFINITAL_STONE_PILLAR, MINERALOGY);
		registerBlockItem("deep_trenches:infinital_stone_tiles", INFINITAL_STONE_TILES, MINERALOGY);
		registerBlockItem("deep_trenches:chiseled_infinital_stone", CHISELED_INFINITAL_STONE, MINERALOGY);
		registerBlockItem("deep_trenches:cracked_infinital_stone_bricks", CRACKED_INFINITAL_STONE_BRICKS, MINERALOGY);
		registerBlockItem("deep_trenches:cracked_infinital_stone_tiles", CRACKED_INFINITAL_STONE_TILES, MINERALOGY);
		registerBlockItem("deep_trenches:polished_infinital_stone", POLISHED_INFINITAL_STONE, MINERALOGY);

		registerBlockItem("deep_trenches:pinkine", PINKINE, MINERALOGY);
		registerBlockItem("deep_trenches:pinkine_bricks", PINKINE_BRICKS, MINERALOGY);
		registerBlockItem("deep_trenches:pinkine_pillar", PINKINE_PILLAR, MINERALOGY);
		registerBlockItem("deep_trenches:pinkine_tiles", PINKINE_TILES, MINERALOGY);
		registerBlockItem("deep_trenches:chiseled_pinkine", CHISELED_PINKINE, MINERALOGY);
		registerBlockItem("deep_trenches:cracked_pinkine_bricks", CRACKED_PINKINE_BRICKS, MINERALOGY);
		registerBlockItem("deep_trenches:cracked_pinkine_tiles", CRACKED_PINKINE_TILES, MINERALOGY);
		registerBlockItem("deep_trenches:polished_pinkine", POLISHED_PINKINE, MINERALOGY);

		registerBlockItem("deep_trenches:limestone", LIMESTONE, MINERALOGY);
		registerBlockItem("deep_trenches:limestone_bricks", LIMESTONE_BRICKS, MINERALOGY);
		registerBlockItem("deep_trenches:limestone_pillar", LIMESTONE_PILLAR, MINERALOGY);
		registerBlockItem("deep_trenches:limestone_tiles", LIMESTONE_TILES, MINERALOGY);
		registerBlockItem("deep_trenches:chiseled_limeston", CHISELED_LIMESTON, MINERALOGY);
		registerBlockItem("deep_trenches:cracked_limestone_bricks", CRACKED_LIMESTONE_BRICKS, MINERALOGY);
		registerBlockItem("deep_trenches:cracked_limestone_tiles", CRACKED_LIMESTONE_TILES, MINERALOGY);
		registerBlockItem("deep_trenches:polished_limestone", POLISHED_LIMESTONE, MINERALOGY);

		registerBlockItem("deep_trenches:rhodonite", RHODONITE, MINERALOGY);
		registerBlockItem("deep_trenches:rhodonite_bricks", RHODONITE_BRICKS, MINERALOGY);
		registerBlockItem("deep_trenches:rhodonite_pillar", RHODONITE_PILLAR, MINERALOGY);
		registerBlockItem("deep_trenches:chiseled_rhodonite_block", CHISELED_RHODONITE_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:chiseled_rhodonite_bricks", CHISELED_RHODONITE_BRICKS, MINERALOGY);
		registerBlockItem("deep_trenches:embed_rhodonite", EMBED_RHODONITE, MINERALOGY);
		registerBlockItem("deep_trenches:polished_rhodonite", POLISHED_RHODONITE, MINERALOGY);

		registerBlockItem("deep_trenches:storcendite", STORCENDITE, MINERALOGY);
		registerBlockItem("deep_trenches:storcendite_bricks", STORCENDITE_BRICKS, MINERALOGY);
		registerBlockItem("deep_trenches:storcendite_pillar", STORCENDITE_PILLAR, MINERALOGY);
		registerBlockItem("deep_trenches:storcendite_tiles", STORCENDITE_TILES, MINERALOGY);
		registerBlockItem("deep_trenches:chiseled_storcendite", CHISELED_STORCENDITE, MINERALOGY);
		registerBlockItem("deep_trenches:cracked_storcendite_bricks", CRACKED_STORCENDITE_BRICKS, MINERALOGY);
		registerBlockItem("deep_trenches:cracked_storcendite_tiles", CRACKED_STORCENDITE_TILES, MINERALOGY);
		registerBlockItem("deep_trenches:polished_storcendite", POLISHED_STORCENDITE, MINERALOGY);

		registerBlockItem("deep_trenches:storcerack", STORCERACK, MINERALOGY);
		registerBlockItem("deep_trenches:storcerack_bricks", STORCERACK_BRICKS, MINERALOGY);
		registerBlockItem("deep_trenches:storcerack_pillar", STORCERACK_PILLAR, MINERALOGY);
		registerBlockItem("deep_trenches:storcerack_tiles", STORCERACK_TILES, MINERALOGY);
		registerBlockItem("deep_trenches:chiseled_storcerack", CHISELED_STORCERACK, MINERALOGY);
		registerBlockItem("deep_trenches:cracked_storcerack_bricks", CRACKED_STORCERACK_BRICKS, MINERALOGY);
		registerBlockItem("deep_trenches:cracked_storcerack_tiles", CRACKED_STORCERACK_TILES, MINERALOGY);
		registerBlockItem("deep_trenches:polished_storcerack", POLISHED_STORCERACK, MINERALOGY);

		registerBlockItem("deep_trenches:sulfur_stone", SULFUR_STONE, MINERALOGY);
		registerBlockItem("deep_trenches:sulfur_stone_bricks", SULFUR_STONE_BRICKS, MINERALOGY);
		registerBlockItem("deep_trenches:chiseled_sulfur_stone_bricks", CHISELED_SULFUR_STONE_BRICKS, MINERALOGY);
		registerBlockItem("deep_trenches:polished_sulfur_stone", POLISHED_SULFUR_STONE, MINERALOGY);

		registerBlockItem("deep_trenches:virdal_stone", VIRDAL_STONE, MINERALOGY);
		registerBlockItem("deep_trenches:virdal_stone_bricks", VIRDAL_STONE_BRICKS, MINERALOGY);
		registerBlockItem("deep_trenches:virdal_stone_pillar", VIRDAL_STONE_PILLAR, MINERALOGY);
		registerBlockItem("deep_trenches:virdal_stone_tiles", VIRDAL_STONE_TILES, MINERALOGY);
		registerBlockItem("deep_trenches:chiseled_virdal_stone", CHISELED_VIRDAL_STONE, MINERALOGY);
		registerBlockItem("deep_trenches:cracked_virdal_stone_bricks", CRACKED_VIRDAL_STONE_BRICKS, MINERALOGY);
		registerBlockItem("deep_trenches:cracked_virdal_stone_tiles", CRACKED_VIRDAL_STONE_TILES, MINERALOGY);
		registerBlockItem("deep_trenches:polished_virdal_stone", POLISHED_VIRDAL_STONE, MINERALOGY);

		registerBlockItem("deep_trenches:waveite", WAVEITE, MINERALOGY);
		registerBlockItem("deep_trenches:waveite_bricks", WAVEITE_BRICKS, MINERALOGY);
		registerBlockItem("deep_trenches:waveite_pillar", WAVEITE_PILLAR, MINERALOGY);
		registerBlockItem("deep_trenches:waveite_tiles", WAVEITE_TILES, MINERALOGY);
		registerBlockItem("deep_trenches:chiseled_waveite", CHISELED_WAVEITE, MINERALOGY);
		registerBlockItem("deep_trenches:cracked_waveite_bricks", CRACKED_WAVEITE_BRICKS, MINERALOGY);
		registerBlockItem("deep_trenches:cracked_waveite_tiles", CRACKED_WAVEITE_TILES, MINERALOGY);
		registerBlockItem("deep_trenches:polished_waveite", POLISHED_WAVEITE, MINERALOGY);

		/* ORES */
		registerBlockItem("deep_trenches:andesite_aquamarine_ore", ANDESITE_AQUAMARINE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:andesite_black_opal_ore", ANDESITE_BLACK_OPAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:andesite_chalcedony_ore", ANDESITE_CHALCEDONY_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:andesite_clinohumite_ore", ANDESITE_CLINOHUMITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:andesite_coal_ore", ANDESITE_COAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:andesite_copper_ore", ANDESITE_COPPER_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:andesite_diamond_ore", ANDESITE_DIAMOND_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:andesite_emerald_ore", ANDESITE_EMERALD_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:andesite_garnet_ore", ANDESITE_GARNET_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:andesite_gold_ore", ANDESITE_GOLD_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:andesite_iron_ore", ANDESITE_IRON_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:andesite_lapis_ore", ANDESITE_LAPIS_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:andesite_morganite_ore", ANDESITE_MORGANITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:andesite_redstone_ore", ANDESITE_REDSTONE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:andesite_ruby_ore", ANDESITE_RUBY_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:andesite_silver_ore", ANDESITE_SILVER_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:andesite_sphene_ore", ANDESITE_SPHENE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:andesite_spinel_ore", ANDESITE_SPINEL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:andesite_tanzanite_ore", ANDESITE_TANZANITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:andesite_topaz_ore", ANDESITE_TOPAZ_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:basalt_clinohumite_ore", BASALT_CLINOHUMITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:basalt_coal_ore", BASALT_COAL_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:bedrock_diamond_ore", BEDROCK_DIAMOND_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:bedrock_diopside_ore", BEDROCK_DIOPSIDE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:bedrock_morganite_ore", BEDROCK_MORGANITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:bedrock_void_crittered_diopside_ore", BEDROCK_VOID_CRITTERED_DIOPSIDE_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:black_basalt_chalcedony_ore", BLACK_BASALT_CHALCEDONY_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:black_basalt_clinohumite_ore", BLACK_BASALT_CLINOHUMITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:black_basalt_coal_ore", BLACK_BASALT_COAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:black_basalt_diamond_ore", BLACK_BASALT_DIAMOND_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:black_basalt_gold_ore", BLACK_BASALT_GOLD_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:black_basalt_iron_ore", BLACK_BASALT_IRON_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:blue_storcerack_black_opal_ore", BLUE_STORCERACK_BLACK_OPAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:blue_storcerack_coal_ore", BLUE_STORCERACK_COAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:blue_storcerack_copper_ore", BLUE_STORCERACK_COPPER_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:blue_storcerack_diamond_ore", BLUE_STORCERACK_DIAMOND_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:blue_storcerack_gold_ore", BLUE_STORCERACK_GOLD_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:blue_storcerack_iron_ore", BLUE_STORCERACK_IRON_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:blue_storcerack_redstone_ore", BLUE_STORCERACK_REDSTONE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:blue_storcerack_ruby_ore", BLUE_STORCERACK_RUBY_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:blue_storcerack_sphene_ore", BLUE_STORCERACK_SPHENE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:blue_storcerack_spinel_ore", BLUE_STORCERACK_SPINEL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:blue_storcerack_stroxite_ore", BLUE_STORCERACK_STROXITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:blue_storcerack_charged_tungsten_ore", BLUE_STORCERACK_CHARGED_TUNGSTEN_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:calcite_chalcedony_ore", CALCITE_CHALCEDONY_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:calcite_clinohumite_ore", CALCITE_CLINOHUMITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:calcite_coal_ore", CALCITE_COAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:calcite_diamond_ore", CALCITE_DIAMOND_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:calcite_gold_ore", CALCITE_GOLD_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:deepslate_aquamarine_ore", DEEPSLATE_AQUAMARINE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:deepslate_black_opal_ore", DEEPSLATE_BLACK_OPAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:deepslate_chalcedony_ore", DEEPSLATE_CHALCEDONY_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:deepslate_clinohumite_ore", DEEPSLATE_CLINOHUMITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:deepslate_garnet_ore", DEEPSLATE_GARNET_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:deepslate_morganite_ore", DEEPSLATE_MORGANITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:deepslate_opal_ore", DEEPSLATE_OPAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:deepslate_ruby_ore", DEEPSLATE_RUBY_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:deepslate_sapphire_ore", DEEPSLATE_SAPPHIRE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:deepslate_silver_ore", DEEPSLATE_SILVER_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:deepslate_sphene_ore", DEEPSLATE_SPHENE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:deepslate_spinel_ore", DEEPSLATE_SPINEL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:deepslate_sugilite_ore", DEEPSLATE_SUGILITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:deepslate_tanzanite_ore", DEEPSLATE_TANZANITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:deepslate_topaz_ore", DEEPSLATE_TOPAZ_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:diorite_aquamarine_ore", DIORITE_AQUAMARINE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:diorite_black_opal_ore", DIORITE_BLACK_OPAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:diorite_chalcedony_ore", DIORITE_CHALCEDONY_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:diorite_clinohumite_ore", DIORITE_CLINOHUMITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:diorite_coal_ore", DIORITE_COAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:diorite_copper_ore", DIORITE_COPPER_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:diorite_diamond_ore", DIORITE_DIAMOND_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:diorite_emerald_ore", DIORITE_EMERALD_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:diorite_garnet_ore", DIORITE_GARNET_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:diorite_gold_ore", DIORITE_GOLD_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:diorite_iron_ore", DIORITE_IRON_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:diorite_lapis_ore", DIORITE_LAPIS_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:diorite_morganite_ore", DIORITE_MORGANITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:diorite_redstone_ore", DIORITE_REDSTONE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:diorite_ruby_ore", DIORITE_RUBY_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:diorite_silver_ore", DIORITE_SILVER_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:diorite_sphene_ore", DIORITE_SPHENE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:diorite_spinel_ore", DIORITE_SPINEL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:diorite_tanzanite_ore", DIORITE_TANZANITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:diorite_topaz_ore", DIORITE_TOPAZ_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:end_stone_diopside_ore", END_STONE_DIOPSIDE_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:end_stone_spinel_ore", END_STONE_SPINEL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:end_stone_void_crittered_diopside_ore", END_STONE_VOID_CRITTERED_DIOPSIDE_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:flint_stone_silicon_ore", FLINT_STONE_SILICON_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:flint_stone_uranolumen_ore", FLINT_STONE_URANOLUMEN_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:gray_marble_diamond_ore", GRAY_MARBLE_DIAMOND_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:granite_aquamarine_ore", GRANITE_AQUAMARINE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:granite_black_opal_ore", GRANITE_BLACK_OPAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:granite_chalcedony_ore", GRANITE_CHALCEDONY_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:granite_clinohumite_ore", GRANITE_CLINOHUMITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:granite_coal_ore", GRANITE_COAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:granite_copper_ore", GRANITE_COPPER_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:granite_diamond_ore", GRANITE_DIAMOND_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:granite_emerald_ore", GRANITE_EMERALD_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:granite_garnet_ore", GRANITE_GARNET_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:granite_gold_ore", GRANITE_GOLD_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:granite_iron_ore", GRANITE_IRON_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:granite_lapis_ore", GRANITE_LAPIS_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:granite_morganite_ore", GRANITE_MORGANITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:granite_redstone_ore", GRANITE_REDSTONE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:granite_ruby_ore", GRANITE_RUBY_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:granite_silver_ore", GRANITE_SILVER_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:granite_sphene_ore", GRANITE_SPHENE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:granite_spinel_ore", GRANITE_SPINEL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:granite_tanzanite_ore", GRANITE_TANZANITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:granite_topaz_ore", GRANITE_TOPAZ_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:hadal_stone_aquamarine_ore", HADAL_STONE_AQUAMARINE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:hadal_stone_black_opal_ore", HADAL_STONE_BLACK_OPAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:hadal_stone_clinohumite_ore", HADAL_STONE_CLINOHUMITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:hadal_stone_coal_ore", HADAL_STONE_COAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:hadal_stone_copper_ore", HADAL_STONE_COPPER_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:hadal_stone_diamond_ore", HADAL_STONE_DIAMOND_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:hadal_stone_emerald_ore", HADAL_STONE_EMERALD_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:hadal_stone_garnet_ore", HADAL_STONE_GARNET_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:hadal_stone_gold_ore", HADAL_STONE_GOLD_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:hadal_stone_iron_ore", HADAL_STONE_IRON_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:hadal_stone_lapis_ore", HADAL_STONE_LAPIS_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:hadal_stone_morganite_ore", HADAL_STONE_MORGANITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:hadal_stone_redstone_ore", HADAL_STONE_REDSTONE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:hadal_stone_ruby_ore", HADAL_STONE_RUBY_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:hadal_stone_sapphire_ore", HADAL_STONE_SAPPHIRE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:hadal_stone_silver_ore", HADAL_STONE_SILVER_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:hadal_stone_sphene_ore", HADAL_STONE_SPHENE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:hadal_stone_spinel_ore", HADAL_STONE_SPINEL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:hadal_stone_sugilite_ore", HADAL_STONE_SUGILITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:hadal_stone_tanzanite_ore", HADAL_STONE_TANZANITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:hadal_stone_topaz_ore", HADAL_STONE_TOPAZ_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:infinital_stone_aquamarine_ore", INFINITAL_STONE_AQUAMARINE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:infinital_stone_black_opal_ore", INFINITAL_STONE_BLACK_OPAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:infinital_stone_coal_ore", INFINITAL_STONE_COAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:infinital_stone_copper_ore", INFINITAL_STONE_COPPER_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:infinital_stone_diamond_ore", INFINITAL_STONE_DIAMOND_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:infinital_stone_enstatite_ore", INFINITAL_STONE_ENSTATITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:infinital_stone_opal_ore", INFINITAL_STONE_OPAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:infinital_stone_iron_ore", INFINITAL_STONE_IRON_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:infinital_stone_ruby_ore", INFINITAL_STONE_RUBY_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:infinital_stone_sapphire_ore", INFINITAL_STONE_SAPPHIRE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:infinital_stone_sphene_ore", INFINITAL_STONE_SPHENE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:infinital_stone_spinel_ore", INFINITAL_STONE_SPINEL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:infinital_stone_sugilite_ore", INFINITAL_STONE_SUGILITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:infinital_stone_uranolumen_ore", INFINITAL_STONE_URANOLUMEN_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:infinital_stone_silicon_ore", INFINITAL_STONE_SILICON_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:limestone_aquamarine_ore", LIMESTONE_AQUAMARINE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:limestone_black_opal_ore", LIMESTONE_BLACK_OPAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:limestone_coal_ore", LIMESTONE_COAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:limestone_copper_ore", LIMESTONE_COPPER_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:limestone_diamond_ore", LIMESTONE_DIAMOND_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:limestone_opal_ore", LIMESTONE_OPAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:limestone_iron_ore", LIMESTONE_IRON_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:limestone_sapphire_ore", LIMESTONE_SAPPHIRE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:limestone_sphene_ore", LIMESTONE_SPHENE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:limestone_spinel_ore", LIMESTONE_SPINEL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:limestone_sugilite_ore", LIMESTONE_SUGILITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:lustred_waveite", LUSTRED_WAVEITE, MINERALOGY);

		registerBlockItem("deep_trenches:lustred_waveite_sapphire_ore", LUSTRED_WAVEITE_SAPPHIRE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:lustred_waveite_tanzanite_ore", LUSTRED_WAVEITE_TANZANITE_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:marble_diamond_ore", MARBLE_DIAMOND_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:netherrack_boron_ore", NETHERRACK_BORON_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:netherrack_clinohumite_ore", NETHERRACK_CLINOHUMITE_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:pinkine_aquamarine_ore", PINKINE_AQUAMARINE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:pinkine_black_opal_ore", PINKINE_BLACK_OPAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:pinkine_coal_ore", PINKINE_COAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:pinkine_copper_ore", PINKINE_COPPER_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:pinkine_diamond_ore", PINKINE_DIAMOND_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:pinkine_diopside_ore", PINKINE_DIOPSIDE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:pinkine_enstatite_ore", PINKINE_ENSTATITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:pinkine_opal_ore", PINKINE_OPAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:pinkine_iron_ore", PINKINE_IRON_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:pinkine_ruby_ore", PINKINE_RUBY_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:pinkine_sapphire_ore", PINKINE_SAPPHIRE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:pinkine_silicon_ore", PINKINE_SILICON_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:pinkine_sphene_ore", PINKINE_SPHENE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:pinkine_spinel_ore", PINKINE_SPINEL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:pinkine_sugilite_ore", PINKINE_SUGILITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:pinkine_uranium_ore", PINKINE_URANIUM_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:pinkine_uranolumen_ore", PINKINE_URANOLUMEN_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:pinkine_void_crittered_diopside_ore", PINKINE_VOID_CRITTERED_DIOPSIDE_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:ringwoodite_sapphire_ore", RINGWOODITE_SAPPHIRE_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:skystone_opal_ore", SKYSTONE_OPAL_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:smooth_basalt_chalcedony_ore", SMOOTH_BASALT_CHALCEDONY_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:smooth_basalt_clinohumite_ore", SMOOTH_BASALT_CLINOHUMITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:smooth_basalt_diamond_ore", SMOOTH_BASALT_DIAMOND_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:smooth_basalt_gold_ore", SMOOTH_BASALT_GOLD_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:storcean_sapphire_ore", STORCEAN_SAPPHIRE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcean_silicon_ore", STORCEAN_SILICON_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcean_snow", STORCEAN_SNOW, MINERALOGY);
		registerBlockItem("deep_trenches:storcean_tungsten_ore", STORCEAN_TUNGSTEN_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:storcendite_aquamarine_ore", STORCENDITE_AQUAMARINE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcendite_black_opal_ore", STORCENDITE_BLACK_OPAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcendite_coal_ore", STORCENDITE_COAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcendite_copper_ore", STORCENDITE_COPPER_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcendite_diamond_ore", STORCENDITE_DIAMOND_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcendite_enstatite_ore", STORCENDITE_ENSTATITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcendite_iron_ore", STORCENDITE_IRON_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcendite_opal_ore", STORCENDITE_OPAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcendite_ruby_ore", STORCENDITE_RUBY_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcendite_sapphire_ore", STORCENDITE_SAPPHIRE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcendite_silicon_ore", STORCENDITE_SILICON_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcendite_sphene_ore", STORCENDITE_SPHENE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcendite_spinel_ore", STORCENDITE_SPINEL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcendite_sugilite_ore", STORCENDITE_SUGILITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcendite_uranium_ore", STORCENDITE_URANIUM_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcendite_uranolumen_ore", STORCENDITE_URANOLUMEN_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:storcerack_aquamarine_ore", STORCERACK_AQUAMARINE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcerack_black_opal_ore", STORCERACK_BLACK_OPAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcerack_coal_ore", STORCERACK_COAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcerack_copper_ore", STORCERACK_COPPER_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcerack_diamond_ore", STORCERACK_DIAMOND_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcerack_gold_ore", STORCERACK_GOLD_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcerack_iron_ore", STORCERACK_IRON_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcerack_opal_ore", STORCERACK_OPAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcerack_redstone_ore", STORCERACK_REDSTONE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcerack_ruby_ore", STORCERACK_RUBY_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcerack_sapphire_ore", STORCERACK_SAPPHIRE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcerack_silicon_ore", STORCERACK_SILICON_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcerack_sphene_ore", STORCERACK_SPHENE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcerack_spinel_ore", STORCERACK_SPINEL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcerack_sugilite_ore", STORCERACK_SUGILITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcerack_tungsten_ore", STORCERACK_TUNGSTEN_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:storcerack_uranolumen_ore", STORCERACK_URANOLUMEN_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:sulfur_stone_chalcedony_ore", SULFUR_STONE_CHALCEDONY_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:sulfur_stone_clinohumite_ore", SULFUR_STONE_CLINOHUMITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:sulfur_stone_coal_ore", SULFUR_STONE_COAL_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:tuff_chalcedony_ore", TUFF_CHALCEDONY_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:tuff_clinohumite_ore", TUFF_CLINOHUMITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:tuff_coal_ore", TUFF_COAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:tuff_diamond_ore", TUFF_DIAMOND_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:tuff_gold_ore", TUFF_GOLD_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:verdine_coal_ore", VERDINE_COAL_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:virdal_stone_aquamarine_ore", VIRDAL_STONE_AQUAMARINE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:virdal_stone_black_opal_ore", VIRDAL_STONE_BLACK_OPAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:virdal_stone_coal_ore", VIRDAL_STONE_COAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:virdal_stone_copper_ore", VIRDAL_STONE_COPPER_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:virdal_stone_diamond_ore", VIRDAL_STONE_DIAMOND_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:virdal_stone_iron_ore", VIRDAL_STONE_IRON_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:virdal_stone_opal_ore", VIRDAL_STONE_OPAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:virdal_stone_ruby_ore", VIRDAL_STONE_RUBY_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:virdal_stone_sapphire_ore", VIRDAL_STONE_SAPPHIRE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:virdal_stone_silicon_ore", VIRDAL_STONE_SILICON_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:virdal_stone_sphene_ore", VIRDAL_STONE_SPHENE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:virdal_stone_spinel_ore", VIRDAL_STONE_SPINEL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:virdal_stone_sugilite_ore", VIRDAL_STONE_SUGILITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:virdal_stone_uranolumen_ore", VIRDAL_STONE_URANOLUMEN_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:waved_bedrock_diamond_ore", WAVED_BEDROCK_DIAMOND_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:waved_bedrock_diopside_ore", WAVED_BEDROCK_DIOPSIDE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:waved_bedrock_morganite_ore", WAVED_BEDROCK_MORGANITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:waved_bedrock_tanzanite_ore", WAVED_BEDROCK_TANZANITE_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:waveite_clinohumite_ore", WAVEITE_CLINOHUMITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:waveite_coal_ore", WAVEITE_COAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:waveite_copper_ore", WAVEITE_COPPER_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:waveite_diamond_ore", WAVEITE_DIAMOND_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:waveite_emerald_ore", WAVEITE_EMERALD_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:waveite_iron_ore", WAVEITE_IRON_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:waveite_garnet_ore", WAVEITE_GARNET_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:waveite_gold_ore", WAVEITE_GOLD_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:waveite_lapis_ore", WAVEITE_LAPIS_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:waveite_morganite_ore", WAVEITE_MORGANITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:waveite_redstone_ore", WAVEITE_REDSTONE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:waveite_ruby_ore", WAVEITE_RUBY_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:waveite_sapphire_ore", WAVEITE_SAPPHIRE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:waveite_silicon_ore", WAVEITE_SILICON_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:waveite_silver_ore", WAVEITE_SILVER_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:waveite_sphene_ore", WAVEITE_SPHENE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:waveite_spinel_ore", WAVEITE_SPINEL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:waveite_sugilite_ore", WAVEITE_SUGILITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:waveite_tanzanite_ore", WAVEITE_TANZANITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:waveite_topaz_ore", WAVEITE_TOPAZ_ORE, MINERALOGY);

		registerBlockItem("deep_trenches:actinium_ore", ACTINIUM_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:aquamarine_ore", AQUAMARINE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:black_opal_ore", BLACK_OPAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:clinohumite_ore", CLINOHUMITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:enstatite_ore", ENSTATITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:morganite_ore", MORGANITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:opal_ore", OPAL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:ruby_ore", RUBY_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:sapphire_ore", SAPPHIRE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:sugilite_ore", SUGILITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:sphene_ore", SPHENE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:spinel_ore", SPINEL_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:tanzanite_ore", TANZANITE_ORE, MINERALOGY);
		registerBlockItem("deep_trenches:topaz_ore", TOPAZ_ORE, MINERALOGY);

		/* RAW BLOCKS */
		registerBlockItem("deep_trenches:raw_actinium_block", RAW_ACTINIUM_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:raw_boron_block", RAW_BORON_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:raw_enron_block", RAW_ENRON_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:kralium_debris", KRALIUM_DEBRIS, MINERALOGY);
		registerBlockItem("deep_trenches:raw_silicon_block", RAW_SILICON_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:raw_silver_block", RAW_SILVER_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:raw_stroxite_block", RAW_STROXITE_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:charged_raw_tungsten_block", CHARGED_RAW_TUNGSTEN_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:raw_tungsten_block", RAW_TUNGSTEN_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:raw_uranolumen_block", RAW_URANOLUMEN_BLOCK, MINERALOGY);

		/* MINERAL BLOCKS */
		registerBlockItem("deep_trenches:actinium_block", ACTINIUM_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:aquamarine_block", AQUAMARINE_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:black_opal_block", BLACK_OPAL_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:black_pearl_block", BLACK_PEARL_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:boron_block", BORON_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:cut_boron_block", CUT_BORON_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:chalcedony_block", CHALCEDONY_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:cut_clinohumite_block", CUT_CLINOHUMITE_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:diopside_block", DIOPSIDE_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:enron_block", ENRON_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:enstatite_block", ENSTATITE_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:gyldelion_block", GYLDELION_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:kralctium_block", KRALCTIUM_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:kralium_block", KRALIUM_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:cut_kralium_block", CUT_KRALIUM_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:lekralite_block", LEKRALITE_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:morganite_block", MORGANITE_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:opal_block", OPAL_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:ruby_block", RUBY_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:sapphire_block", SAPPHIRE_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:silicon_block", SILICON_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:silver_block", SILVER_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:sphene_block", SPHENE_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:spinel_block", SPINEL_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:stroxite_block", STROXITE_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:cut_stroxite_block", CUT_STROXITE_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:tanzanite_block", TANZANITE_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:topaz_block", TOPAZ_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:charged_tungsten_block", CHARGED_TUNGSTEN_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:tungsten_block", TUNGSTEN_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:uranium_block", URANIUM_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:uranium_powder_block", URANIUM_POWDER_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:uranolumen_block", URANOLUMEN_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:void_crittered_diopside_block", VOID_CRITTERED_DIOPSIDE_BLOCK, MINERALOGY);

		/* CHISELED MINERAL BLOCKS */
		registerBlockItem("deep_trenches:chiseled_silicon_block", CHISELED_SILICON_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:chiseled_silver_block", CHISELED_SILVER_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:chiseled_sugilite_block", CHISELED_SUGILITE_BLOCK, MINERALOGY);

		/* CRYSTALS */
		registerBlockItem("deep_trenches:lekralite_crystals", LEKRALITE_CRYSTALS, MINERALOGY);

		registerBlockItem("deep_trenches:black_opalite_block", BLACK_OPALITE_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:budding_black_opalite", BUDDING_BLACK_OPALITE, MINERALOGY);
		registerBlockItem("deep_trenches:black_opal_cluster", BLACK_OPAL_CLUSTER, MINERALOGY);
		registerBlockItem("deep_trenches:large_black_opal_bud", LARGE_BLACK_OPAL_BUD, MINERALOGY);
		registerBlockItem("deep_trenches:medium_black_opal_bud", MEDIUM_BLACK_OPAL_BUD, MINERALOGY);
		registerBlockItem("deep_trenches:small_black_opal_bud", SMALL_BLACK_OPAL_BUD, MINERALOGY);

		registerBlockItem("deep_trenches:clinohumite_block", CLINOHUMITE_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:budding_clinohumite", BUDDING_CLINOHUMITE, MINERALOGY);
		registerBlockItem("deep_trenches:clinohumite_cluster", CLINOHUMITE_CLUSTER, MINERALOGY);
		registerBlockItem("deep_trenches:large_clinohumite_bud", LARGE_CLINOHUMITE_BUD, MINERALOGY);
		registerBlockItem("deep_trenches:medium_clinohumite_bud", MEDIUM_CLINOHUMITE_BUD, MINERALOGY);
		registerBlockItem("deep_trenches:small_clinohumite_bud", SMALL_CLINOHUMITE_BUD, MINERALOGY);

		registerBlockItem("deep_trenches:diamite_block", DIAMITE_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:budding_diamite", BUDDING_DIAMITE, MINERALOGY);
		registerBlockItem("deep_trenches:diamond_cluster", DIAMOND_CLUSTER, MINERALOGY);
		registerBlockItem("deep_trenches:large_diamond_bud", LARGE_DIAMOND_BUD, MINERALOGY);
		registerBlockItem("deep_trenches:medium_diamond_bud", MEDIUM_DIAMOND_BUD, MINERALOGY);
		registerBlockItem("deep_trenches:small_diamond_bud", SMALL_DIAMOND_BUD, MINERALOGY);

		registerBlockItem("deep_trenches:garnet_block", GARNET_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:budding_garnet", BUDDING_GARNET, MINERALOGY);
		registerBlockItem("deep_trenches:garnet_cluster", GARNET_CLUSTER, MINERALOGY);
		registerBlockItem("deep_trenches:large_garnet_bud", LARGE_GARNET_BUD, MINERALOGY);
		registerBlockItem("deep_trenches:medium_garnet_bud", MEDIUM_GARNET_BUD, MINERALOGY);
		registerBlockItem("deep_trenches:small_garnet_bud", SMALL_GARNET_BUD, MINERALOGY);

		registerBlockItem("deep_trenches:opalite_block", OPALITE_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:budding_opalite", BUDDING_OPALITE, MINERALOGY);
		registerBlockItem("deep_trenches:opal_cluster", OPAL_CLUSTER, MINERALOGY);
		registerBlockItem("deep_trenches:large_opal_bud", LARGE_OPAL_BUD, MINERALOGY);
		registerBlockItem("deep_trenches:medium_opal_bud", MEDIUM_OPAL_BUD, MINERALOGY);
		registerBlockItem("deep_trenches:small_opal_bud", SMALL_OPAL_BUD, MINERALOGY);

		registerBlockItem("deep_trenches:sapphrite_block", SAPPHRITE_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:budding_sapphrite", BUDDING_SAPPHRITE, MINERALOGY);
		registerBlockItem("deep_trenches:sapphire_cluster", SAPPHIRE_CLUSTER, MINERALOGY);
		registerBlockItem("deep_trenches:large_sapphire_bud", LARGE_SAPPHIRE_BUD, MINERALOGY);
		registerBlockItem("deep_trenches:medium_sapphire_bud", MEDIUM_SAPPHIRE_BUD, MINERALOGY);
		registerBlockItem("deep_trenches:small_sapphire_bud", SMALL_SAPPHIRE_BUD, MINERALOGY);

		registerBlockItem("deep_trenches:sugilite_block", SUGILITE_BLOCK, MINERALOGY);
		registerBlockItem("deep_trenches:budding_sugilite", BUDDING_SUGILITE, MINERALOGY);
		registerBlockItem("deep_trenches:sugilite_cluster", SUGILITE_CLUSTER, MINERALOGY);
		registerBlockItem("deep_trenches:large_sugilite_bud", LARGE_SUGILITE_BUD, MINERALOGY);
		registerBlockItem("deep_trenches:medium_sugilite_bud", MEDIUM_SUGILITE_BUD, MINERALOGY);
		registerBlockItem("deep_trenches:small_sugilite_bud", SMALL_SUGILITE_BUD, MINERALOGY);

		/* POINTED STONES */
		registerBlockItem("deep_trenches:pointed_light_opalite", POINTED_LIGHT_OPALITE, MINERALOGY);
		registerBlockItem("deep_trenches:pointed_skystone", POINTED_SKYSTONE, MINERALOGY);
		registerBlockItem("deep_trenches:twisted_blue_storcerack", TWISTED_BLUE_STORCERACK, MINERALOGY);

		/* SURFACE BLOCKS */
		registerBlockItem("deep_trenches:dritean", DRITEAN, MINERALOGY);
		registerBlockItem("deep_trenches:enrotium", ENROTIUM, MINERALOGY);
		registerBlockItem("deep_trenches:sprilium", SPRILIUM, MINERALOGY);
		registerBlockItem("deep_trenches:skysoil", SKYSOIL, MINERALOGY);
		registerBlockItem("deep_trenches:mosoil", MOSOIL, MINERALOGY);

		/* FLOWERS */
		registerBlockItem("deep_trenches:black_pansy", BLACK_PANSY, PHYTOLOGY);
		registerBlockItem("deep_trenches:blue_pansy", BLUE_PANSY, PHYTOLOGY);
		registerBlockItem("deep_trenches:blue_poppy", BLUE_POPPY, PHYTOLOGY);
		registerBlockItem("deep_trenches:blue_violet", BLUE_VIOLET, PHYTOLOGY);
		registerBlockItem("deep_trenches:bonnet_spurge", BONNET_SPURGE, PHYTOLOGY);
		registerBlockItem("deep_trenches:brown_pansy", BROWN_PANSY, PHYTOLOGY);
		registerBlockItem("deep_trenches:chocolate_cosmos_flower", CHOCOLATE_COSMOS_FLOWER, PHYTOLOGY);
		registerBlockItem("deep_trenches:cyan_blue_violet", CYAN_BLUE_VIOLET, PHYTOLOGY);
		registerBlockItem("deep_trenches:cycawler", CYCAWLER, PHYTOLOGY);
		registerBlockItem("deep_trenches:garden_pinks", GARDEN_PINKS, PHYTOLOGY);
		registerBlockItem("deep_trenches:green_pansy", GREEN_PANSY, PHYTOLOGY);
		registerBlockItem("deep_trenches:gyldelion_flower", GYLDELION_FLOWER, PHYTOLOGY);
		registerBlockItem("deep_trenches:limefork", LIMEFORK, PHYTOLOGY);
		registerBlockItem("deep_trenches:marsh_violet", MARSH_VIOLET, PHYTOLOGY);
		registerBlockItem("deep_trenches:native_violet", NATIVE_VIOLET, PHYTOLOGY);
		registerBlockItem("deep_trenches:opium_poppy", OPIUM_POPPY, PHYTOLOGY);
		registerBlockItem("deep_trenches:pink_and_orange_pansy", PINK_AND_ORANGE_PANSY, PHYTOLOGY);
		registerBlockItem("deep_trenches:pink_braitor_flower", PINK_BRAITOR_FLOWER, PHYTOLOGY);
		registerBlockItem("deep_trenches:pink_marsh_violet", PINK_MARSH_VIOLET, PHYTOLOGY);
		registerBlockItem("deep_trenches:pink_rose", PINK_ROSE, PHYTOLOGY);
		registerBlockItem("deep_trenches:pink_rose_bush", PINK_ROSE_BUSH, PHYTOLOGY);
		registerBlockItem("deep_trenches:poppy", POPPY, PHYTOLOGY);
		registerBlockItem("deep_trenches:purple_and_orange_pansy", PURPLE_AND_ORANGE_PANSY, PHYTOLOGY);
		registerBlockItem("deep_trenches:red_braitor_flower", RED_BRAITOR_FLOWER, PHYTOLOGY);
		registerBlockItem("deep_trenches:red_chocolate_cosmos_flower", RED_CHOCOLATE_COSMOS_FLOWER, PHYTOLOGY);
		registerBlockItem("deep_trenches:red_pansy", RED_PANSY, PHYTOLOGY);
		registerBlockItem("deep_trenches:red_rose", RED_ROSE, PHYTOLOGY);
		registerBlockItem("deep_trenches:rubra_blue_violet", RUBRA_BLUE_VIOLET, PHYTOLOGY);
		registerBlockItem("deep_trenches:spidreet", SPIDREET, PHYTOLOGY);
		registerBlockItem("deep_trenches:spike_lavender", SPIKE_LAVENDER, PHYTOLOGY);
		registerBlockItem("deep_trenches:spridelion", SPRIDELION, PHYTOLOGY);
		registerBlockItem("deep_trenches:sproom_spike", SPROOM_SPIKE, PHYTOLOGY);
		registerBlockItem("deep_trenches:squisacle", SQUISACLE, PHYTOLOGY);
		registerBlockItem("deep_trenches:sweet_violet", SWEET_VIOLET, PHYTOLOGY);
		registerBlockItem("deep_trenches:topped_lavender", TOPPED_LAVENDER, PHYTOLOGY);
		registerBlockItem("deep_trenches:twisttrap", TWISTTRAP, PHYTOLOGY);
		registerBlockItem("deep_trenches:vaslame", VASLAME, PHYTOLOGY);
		registerBlockItem("deep_trenches:weepistil", WEEPISTIL, PHYTOLOGY);
		registerBlockItem("deep_trenches:weepy_hollower", WEEPY_HOLLOWER, PHYTOLOGY);
		registerBlockItem("deep_trenches:white_violet", WHITE_VIOLET, PHYTOLOGY);
		registerBlockItem("deep_trenches:wild_pansy", WILD_PANSY, PHYTOLOGY);
		registerBlockItem("deep_trenches:yellow_violet", YELLOW_VIOLET, PHYTOLOGY);

		/* LEAVES FLOWERS */
		registerBlockItem("deep_trenches:bromya_flower", BROMYA_FLOWER, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_mahoe_flower", BLUE_MAHOE_FLOWER, ARBOROLOGY);
		registerBlockItem("deep_trenches:murkantuan_flower", MURKANTUAN_FLOWER, ARBOROLOGY);

		/* TALL FLOWERS */
		registerBlockItem("deep_trenches:black_lily", BLACK_LILY, PHYTOLOGY);
		registerBlockItem("deep_trenches:bullthorn", BULLTHORN, PHYTOLOGY);
		registerBlockItem("deep_trenches:cactlow", CACTLOW, PHYTOLOGY);
		registerBlockItem("deep_trenches:clawbulb", CLAWBULB, PHYTOLOGY);
		registerBlockItem("deep_trenches:lime_spurge", LIME_SPURGE, PHYTOLOGY);
		registerBlockItem("deep_trenches:lupin_flower", LUPIN_FLOWER, PHYTOLOGY);
		registerBlockItem("deep_trenches:orange_lily", ORANGE_LILY, PHYTOLOGY);
		registerBlockItem("deep_trenches:pigal", PIGAL, PHYTOLOGY);
		registerBlockItem("deep_trenches:purpround", PURPROUND, PHYTOLOGY);
		registerBlockItem("deep_trenches:sprinly", SPRINLY, PHYTOLOGY);
		registerBlockItem("deep_trenches:tall_buckthorn", TALL_BUCKTHORN, PHYTOLOGY);
		registerBlockItem("deep_trenches:velvet_lily", VELVET_LILY, PHYTOLOGY);

		/* MOSSES */
		registerItem("deep_trenches:airial_moss", AIRIAL_MOSS);
		registerItem("deep_trenches:ilmium", ILMIUM);
		registerBlockItem("deep_trenches:moss", MOSS, PHYTOLOGY);

		/* PLANTS */
		registerBlockItem("deep_trenches:airial_bush", AIRIAL_BUSH, PHYTOLOGY);
		registerBlockItem("deep_trenches:buckthorn", BUCKTHORN, PHYTOLOGY);
		registerBlockItem("deep_trenches:four_leafed_clover", FOUR_LEAFED_CLOVER, PHYTOLOGY);
		registerBlockItem("deep_trenches:fur_plateau", FUR_PLATEAU, PHYTOLOGY);
		registerBlockItem("deep_trenches:harshles", HARSHLES, PHYTOLOGY);
		registerBlockItem("deep_trenches:ilyine", ILYINE, PHYTOLOGY);
		registerBlockItem("deep_trenches:jungle_umbrella", JUNGLE_UMBRELLA, PHYTOLOGY);
		registerBlockItem("deep_trenches:lichen", LICHEN, PHYTOLOGY);
		registerBlockItem("deep_trenches:mosses", MOSSES, PHYTOLOGY);
		registerBlockItem("deep_trenches:murkstem", MURKSTEM, PHYTOLOGY);
		registerBlockItem("deep_trenches:pomegranate_bush", POMEGRANATE_BUSH, PHYTOLOGY);
		registerBlockItem("deep_trenches:reebloon", REEBLOON, PHYTOLOGY);
		registerBlockItem("deep_trenches:sea_buckthorn", SEA_BUCKTHORN, PHYTOLOGY);
		registerBlockItem("deep_trenches:skalk", SKALK, PHYTOLOGY);
		registerBlockItem("deep_trenches:squish_tips", SQUISH_TIPS, PHYTOLOGY);
		registerBlockItem("deep_trenches:three_leafed_clover", THREE_LEAFED_CLOVER, PHYTOLOGY);

		/* MUSHROOMS */
		registerBlockItem("deep_trenches:gray_shag_mushroom", GRAY_SHAG_MUSHROOM, PHYTOLOGY);
		registerBlockItem("deep_trenches:inky_cap_mushroom", INKY_CAP_MUSHROOM, PHYTOLOGY);
		registerBlockItem("deep_trenches:puffball_mushroom", PUFFBALL_MUSHROOM, PHYTOLOGY);
		registerBlockItem("deep_trenches:shelf_mushroom", SHELF_MUSHROOM, PHYTOLOGY);
		registerBlockItem("deep_trenches:white_mushroom", WHITE_MUSHROOM, PHYTOLOGY);

		/* GIANT VIOLET */
		registerBlockItem("deep_trenches:flalm_petal_block", FLALM_PETAL_BLOCK, PHYTOLOGY);
		registerBlockItem("deep_trenches:giant_violet", GIANT_VIOLET, PHYTOLOGY);
		registerBlockItem("deep_trenches:giant_violet_leaf", GIANT_VIOLET_LEAF, PHYTOLOGY);
		registerBlockItem("deep_trenches:giant_violet_petal", GIANT_VIOLET_PETAL, PHYTOLOGY);
		registerBlockItem("deep_trenches:giant_violet_pistil", GIANT_VIOLET_PISTIL, PHYTOLOGY);

		/* CORALS */
		registerBlockItem("deep_trenches:dead_blackgreen_tree_coral", DEAD_BLACKGREEN_TREE_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_broccoli_coral", DEAD_BROCCOLI_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_bubblegum_coral", DEAD_BUBBLEGUM_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_cabbage_tree_coral", DEAD_CABBAGE_TREE_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_flowertube_coral", DEAD_FLOWERTUBE_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_garnet_spiral_coral", DEAD_GARNET_SPIRAL_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_glow_forest_coral", DEAD_GLOW_FOREST_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_glowtongue_tube_coral", DEAD_GLOWTONGUE_TUBE_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_ivory_coral", DEAD_IVORY_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_lekral_coral", DEAD_LEKRAL_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_lime_brain_coral", DEAD_LIME_BRAIN_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_lophelia_coral", DEAD_LOPHELIA_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_pipe_organ_coral", DEAD_PIPE_ORGAN_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_pipe_organ_tentacles", DEAD_PIPE_ORGAN_TENTACLES, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_red_tree_coral", DEAD_RED_TREE_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_seafan_coral", DEAD_SEAFAN_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_skacur_coral", DEAD_SKACUR_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_straight_willow_coral", DEAD_STRAIGHT_WILLOW_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_sunrise_coral", DEAD_SUNRISE_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_table_coral", DEAD_TABLE_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_thin_blade_coral", DEAD_THIN_BLADE_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_trumpetear_coral", DEAD_TRUMPETEAR_CORAL, SEA_BLOCKS);

		registerBlockItem("deep_trenches:dead_blackgreen_tree_coral_block", DEAD_BLACKGREEN_TREE_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_broccoli_coral_block", DEAD_BROCCOLI_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_bubblegum_coral_block", DEAD_BUBBLEGUM_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_cabbage_tree_coral_block", DEAD_CABBAGE_TREE_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_flowertube_coral_block", DEAD_FLOWERTUBE_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_garnet_spiral_coral_block", DEAD_GARNET_SPIRAL_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_glow_forest_coral_block", DEAD_GLOW_FOREST_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_glowtongue_tube_coral_block", DEAD_GLOWTONGUE_TUBE_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_ivory_coral_block", DEAD_IVORY_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_lekral_coral_block", DEAD_LEKRAL_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_lime_brain_coral_block", DEAD_LIME_BRAIN_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_lophelia_coral_block", DEAD_LOPHELIA_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_pipe_organ_coral_block", DEAD_PIPE_ORGAN_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_red_tree_coral_block", DEAD_RED_TREE_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_seafan_coral_block", DEAD_SEAFAN_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_skacur_coral_block", DEAD_SKACUR_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_straight_willow_coral_block", DEAD_STRAIGHT_WILLOW_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_sunrise_coral_block", DEAD_SUNRISE_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_table_coral_block", DEAD_TABLE_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_thin_blade_coral_block", DEAD_THIN_BLADE_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:dead_trumpetear_coral_block", DEAD_TRUMPETEAR_CORAL_BLOCK, SEA_BLOCKS);

		registerCoralFan("deep_trenches:dead_blackgreen_tree_coral_fan", DEAD_BLACKGREEN_TREE_CORAL_FAN, DEAD_BLACKGREEN_TREE_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:dead_broccoli_coral_fan", DEAD_BROCCOLI_CORAL_FAN, DEAD_BROCCOLI_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:dead_bubblegum_coral_fan", DEAD_BUBBLEGUM_CORAL_FAN, DEAD_BUBBLEGUM_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:dead_cabbage_tree_coral_fan", DEAD_CABBAGE_TREE_CORAL_FAN, DEAD_CABBAGE_TREE_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:dead_flowertube_coral_fan", DEAD_FLOWERTUBE_CORAL_FAN, DEAD_FLOWERTUBE_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:dead_garnet_spiral_coral_fan", DEAD_GARNET_SPIRAL_CORAL_FAN, DEAD_GARNET_SPIRAL_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:dead_glow_forest_coral_fan", DEAD_GLOW_FOREST_CORAL_FAN, DEAD_GLOW_FOREST_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:dead_glowtongue_tube_coral_fan", DEAD_GLOWTONGUE_TUBE_CORAL_FAN, DEAD_GLOWTONGUE_TUBE_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:dead_ivory_coral_fan", DEAD_IVORY_CORAL_FAN, DEAD_IVORY_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:dead_lekral_coral_fan", DEAD_LEKRAL_CORAL_FAN, DEAD_LEKRAL_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:dead_lime_brain_coral_fan", DEAD_LIME_BRAIN_CORAL_FAN, DEAD_LIME_BRAIN_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:dead_lophelia_coral_fan", DEAD_LOPHELIA_CORAL_FAN, DEAD_LOPHELIA_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:dead_pipe_organ_coral_fan", DEAD_PIPE_ORGAN_CORAL_FAN, DEAD_PIPE_ORGAN_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:dead_red_tree_coral_fan", DEAD_RED_TREE_CORAL_FAN, DEAD_RED_TREE_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:dead_seafan_coral_fan", DEAD_SEAFAN_CORAL_FAN, DEAD_SEAFAN_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:dead_skacur_coral_fan", DEAD_SKACUR_CORAL_FAN, DEAD_SEAFAN_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:dead_straight_willow_coral_fan", DEAD_STRAIGHT_WILLOW_CORAL_FAN, DEAD_STRAIGHT_WILLOW_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:dead_sunrise_coral_fan", DEAD_SUNRISE_CORAL_FAN, DEAD_SUNRISE_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:dead_table_coral_fan", DEAD_TABLE_CORAL_FAN, DEAD_TABLE_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:dead_thin_blade_coral_fan", DEAD_THIN_BLADE_CORAL_FAN, DEAD_THIN_BLADE_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:dead_trumpetear_coral_fan", DEAD_TRUMPETEAR_CORAL_FAN, DEAD_TRUMPETEAR_CORAL_WALL_FAN);

		registerBlockItem("deep_trenches:blackgreen_tree_coral", BLACKGREEN_TREE_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:broccoli_coral", BROCCOLI_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:bubblegum_coral", BUBBLEGUM_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:cabbage_tree_coral", CABBAGE_TREE_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:flowertube_coral", FLOWERTUBE_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:garnet_spiral_coral", GARNET_SPIRAL_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:glow_forest_coral", GLOW_FOREST_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:glowtongue_tube_coral", GLOWTONGUE_TUBE_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:ivory_coral", IVORY_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:lekral_coral", LEKRAL_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:lime_brain_coral", LIME_BRAIN_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:lophelia_coral", LOPHELIA_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:pipe_organ_coral", PIPE_ORGAN_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:pipe_organ_tentacles", PIPE_ORGAN_TENTACLES, SEA_BLOCKS);
		registerBlockItem("deep_trenches:red_tree_coral", RED_TREE_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:seafan_coral", SEAFAN_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:skacur_coral", SKACUR_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:straight_willow_coral", STRAIGHT_WILLOW_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:sunrise_coral", SUNRISE_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:table_coral", TABLE_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:thin_blade_coral", THIN_BLADE_CORAL, SEA_BLOCKS);
		registerBlockItem("deep_trenches:trumpetear_coral", TRUMPETEAR_CORAL, SEA_BLOCKS);

		registerBlockItem("deep_trenches:blackgreen_tree_coral_block", BLACKGREEN_TREE_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:broccoli_coral_block", BROCCOLI_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:bubblegum_coral_block", BUBBLEGUM_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:cabbage_tree_coral_block", CABBAGE_TREE_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:flowertube_coral_block", FLOWERTUBE_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:garnet_spiral_coral_block", GARNET_SPIRAL_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:glow_forest_coral_block", GLOW_FOREST_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:glowtongue_tube_coral_block", GLOWTONGUE_TUBE_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:ivory_coral_block", IVORY_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:lekral_coral_block", LEKRAL_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:lime_brain_coral_block", LIME_BRAIN_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:lophelia_coral_block", LOPHELIA_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:pipe_organ_coral_block", PIPE_ORGAN_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:red_tree_coral_block", RED_TREE_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:seafan_coral_block", SEAFAN_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:skacur_coral_block", SKACUR_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:straight_willow_coral_block", STRAIGHT_WILLOW_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:sunrise_coral_block", SUNRISE_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:table_coral_block", TABLE_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:thin_blade_coral_block", THIN_BLADE_CORAL_BLOCK, SEA_BLOCKS);
		registerBlockItem("deep_trenches:trumpetear_coral_block", TRUMPETEAR_CORAL_BLOCK, SEA_BLOCKS);

		registerCoralFan("deep_trenches:blackgreen_tree_coral_fan", BLACKGREEN_TREE_CORAL_FAN, BLACKGREEN_TREE_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:broccoli_coral_fan", BROCCOLI_CORAL_FAN, BROCCOLI_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:bubblegum_coral_fan", BUBBLEGUM_CORAL_FAN, BUBBLEGUM_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:cabbage_tree_coral_fan", CABBAGE_TREE_CORAL_FAN, CABBAGE_TREE_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:flowertube_coral_fan", FLOWERTUBE_CORAL_FAN, FLOWERTUBE_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:garnet_spiral_coral_fan", GARNET_SPIRAL_CORAL_FAN, GARNET_SPIRAL_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:glow_forest_coral_fan", GLOW_FOREST_CORAL_FAN, GLOW_FOREST_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:glowtongue_tube_coral_fan", GLOWTONGUE_TUBE_CORAL_FAN, GLOWTONGUE_TUBE_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:ivory_coral_fan", IVORY_CORAL_FAN, IVORY_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:lekral_coral_fan", LEKRAL_CORAL_FAN, LEKRAL_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:lime_brain_coral_fan", LIME_BRAIN_CORAL_FAN, LIME_BRAIN_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:lophelia_coral_fan", LOPHELIA_CORAL_FAN, LOPHELIA_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:pipe_organ_coral_fan", PIPE_ORGAN_CORAL_FAN, PIPE_ORGAN_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:red_tree_coral_fan", RED_TREE_CORAL_FAN, RED_TREE_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:seafan_coral_fan", SEAFAN_CORAL_FAN, SEAFAN_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:skacur_coral_fan", SKACUR_CORAL_FAN, SEAFAN_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:straight_willow_coral_fan", STRAIGHT_WILLOW_CORAL_FAN, STRAIGHT_WILLOW_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:sunrise_coral_fan", SUNRISE_CORAL_FAN, SUNRISE_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:table_coral_fan", TABLE_CORAL_FAN, TABLE_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:thin_blade_coral_fan", THIN_BLADE_CORAL_FAN, THIN_BLADE_CORAL_WALL_FAN);
		registerCoralFan("deep_trenches:trumpetear_coral_fan", TRUMPETEAR_CORAL_FAN, TRUMPETEAR_CORAL_WALL_FAN);

		/* WOODS */
		registerBlockItem("deep_trenches:almond_button", ALMOND_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:anameata_button", ANAMEATA_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:angels_trumpet_button", ANGELS_TRUMPET_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:aquean_button", AQUEAN_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:barshrookle_button", BARSHROOKLE_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:black_birch_button", BLACK_BIRCH_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_mahoe_button", BLUE_MAHOE_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_spruce_button", BLUE_SPRUCE_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:bottlebrush_button", BOTTLEBRUSH_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:bromya_button", BROMYA_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:bubbletree_button", BUBBLETREE_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:calcearb_button", CALCEARB_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:cherry_button", CHERRY_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:chotorn_button", CHOTORN_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:cook_pine_button", COOK_PINE_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:crolood_button", CROLOOD_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_crolood_button", DARK_CROLOOD_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_fuchsitra_button", DARK_FUCHSITRA_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_red_elm_button", DARK_RED_ELM_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:dead_wart_tree_button", DEAD_WART_TREE_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:drigyus_button", DRIGYUS_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:ebony_button", EBONY_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:enderheart_button", ENDERHEART_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:flalm_button", FLALM_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:fruce_button", FRUCE_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:fuchsitra_button", FUCHSITRA_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:fugmos_button", FUGMOS_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:funeranite_button", FUNERANITE_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:ghoshroom_button", GHOSHROOM_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:giant_violet_button", GIANT_VIOLET_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:guaiacum_button", GUAIACUM_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:joshua_button", JOSHUA_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:klinkii_pine_button", KLINKII_PINE_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:melaleuca_button", MELALEUCA_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:murkantuan_button", MURKANTUAN_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:norfolk_pine_button", NORFOLK_PINE_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:obscrus_button", OBSCRUS_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:orhpris_button", ORHPRIS_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:peltogyne_button", PELTOGYNE_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:pin_cherry_button", PIN_CHERRY_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:plum_button", PLUM_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:purfunga_button", PURFUNGA_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:rark_button", RARK_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:red_elm_button", RED_ELM_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:rhadi_button", RHADI_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:sanguart_button", SANGUART_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:scarlet_thiorcen_button", SCARLET_THIORCEN_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:sproom_button", SPROOM_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:sequoia_button", SEQUOIA_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:stortreean_button", STORTREEAN_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:stroomean_button", STROOMEAN_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:sunrise_fungus_button", SUNRISE_FUNGUS_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:tark_button", TARK_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:teak_button", TEAK_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:thundercloud_plum_button", THUNDERCLOUD_PLUM_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:vynhert_button", VYNHERT_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:wart_tree_button", WART_TREE_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:wenge_button", WENGE_BUTTON, ARBOROLOGY);
		registerBlockItem("deep_trenches:yew_button", YEW_BUTTON, ARBOROLOGY);

		registerBlockItem("deep_trenches:anameata_cap", ANAMEATA_CAP, ARBOROLOGY);
		registerBlockItem("deep_trenches:barshrookle_cap", BARSHROOKLE_CAP, ARBOROLOGY);
		registerBlockItem("deep_trenches:funeranite_cap", FUNERANITE_CAP, ARBOROLOGY);
		registerBlockItem("deep_trenches:ghoshroom_cap", GHOSHROOM_CAP, ARBOROLOGY);
		registerBlockItem("deep_trenches:purfunga_cap", PURFUNGA_CAP, ARBOROLOGY);
		registerBlockItem("deep_trenches:stroomean_cap", STROOMEAN_CAP, ARBOROLOGY);
		registerBlockItem("deep_trenches:sunrise_fungus_cap", SUNRISE_FUNGUS_CAP, ARBOROLOGY);

		registerBlockItem("deep_trenches:almond_door", ALMOND_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:anameata_door", ANAMEATA_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:angels_trumpet_door", ANGELS_TRUMPET_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:aquean_door", AQUEAN_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:barshrookle_door", BARSHROOKLE_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:black_birch_door", BLACK_BIRCH_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_mahoe_door", BLUE_MAHOE_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_spruce_door", BLUE_SPRUCE_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:bottlebrush_door", BOTTLEBRUSH_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:bromya_door", BROMYA_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:bubbletree_door", BUBBLETREE_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:calcearb_door", CALCEARB_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:cherry_door", CHERRY_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:chotorn_door", CHOTORN_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:cook_pine_door", COOK_PINE_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:crolood_door", CROLOOD_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_crolood_door", DARK_CROLOOD_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_fuchsitra_door", DARK_FUCHSITRA_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_red_elm_door", DARK_RED_ELM_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:dead_wart_tree_door", DEAD_WART_TREE_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:drigyus_door", DRIGYUS_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:ebony_door", EBONY_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:enderheart_door", ENDERHEART_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:flalm_door", FLALM_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:fruce_door", FRUCE_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:fuchsitra_door", FUCHSITRA_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:fugmos_door", FUGMOS_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:funeranite_door", FUNERANITE_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:ghoshroom_door", GHOSHROOM_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:giant_violet_door", GIANT_VIOLET_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:guaiacum_door", GUAIACUM_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:joshua_door", JOSHUA_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:klinkii_pine_door", KLINKII_PINE_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:melaleuca_door", MELALEUCA_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:murkantuan_door", MURKANTUAN_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:norfolk_pine_door", NORFOLK_PINE_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:obscrus_door", OBSCRUS_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:orhpris_door", ORHPRIS_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:peltogyne_door", PELTOGYNE_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:pin_cherry_door", PIN_CHERRY_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:plum_door", PLUM_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:purfunga_door", PURFUNGA_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:rark_door", RARK_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:red_elm_door", RED_ELM_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:rhadi_door", RHADI_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:sanguart_door", SANGUART_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:scarlet_thiorcen_door", SCARLET_THIORCEN_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:sproom_door", SPROOM_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:sequoia_door", SEQUOIA_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:stortreean_door", STORTREEAN_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:stroomean_door", STROOMEAN_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:sunrise_fungus_door", SUNRISE_FUNGUS_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:tark_door", TARK_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:teak_door", TEAK_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:thundercloud_plum_door", THUNDERCLOUD_PLUM_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:vynhert_door", VYNHERT_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:wart_tree_door", WART_TREE_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:wenge_door", WENGE_DOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:yew_door", YEW_DOOR, ARBOROLOGY);

		registerBlockItem("deep_trenches:almond_fence", ALMOND_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:anameata_fence", ANAMEATA_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:angels_trumpet_fence", ANGELS_TRUMPET_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:aquean_fence", AQUEAN_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:barshrookle_fence", BARSHROOKLE_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:black_birch_fence", BLACK_BIRCH_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_mahoe_fence", BLUE_MAHOE_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_spruce_fence", BLUE_SPRUCE_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:bottlebrush_fence", BOTTLEBRUSH_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:bromya_fence", BROMYA_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:bubbletree_fence", BUBBLETREE_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:bubbletree_bubbles", BUBBLETREE_BUBBLES, ARBOROLOGY);
		registerBlockItem("deep_trenches:calcearb_fence", CALCEARB_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:cherry_fence", CHERRY_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:chotorn_fence", CHOTORN_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:cook_pine_fence", COOK_PINE_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:crolood_fence", CROLOOD_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_crolood_fence", DARK_CROLOOD_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_fuchsitra_fence", DARK_FUCHSITRA_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_red_elm_fence", DARK_RED_ELM_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:dead_wart_tree_fence", DEAD_WART_TREE_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:drigyus_fence", DRIGYUS_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:ebony_fence", EBONY_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:enderheart_fence", ENDERHEART_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:flalm_fence", FLALM_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:fruce_fence", FRUCE_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:fuchsitra_fence", FUCHSITRA_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:fugmos_fence", FUGMOS_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:funeranite_fence", FUNERANITE_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:ghoshroom_fence", GHOSHROOM_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:giant_violet_fence", GIANT_VIOLET_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:guaiacum_fence", GUAIACUM_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:joshua_fence", JOSHUA_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:klinkii_pine_fence", KLINKII_PINE_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:melaleuca_fence", MELALEUCA_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:murkantuan_fence", MURKANTUAN_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:norfolk_pine_fence", NORFOLK_PINE_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:obscrus_fence", OBSCRUS_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:orhpris_fence", ORHPRIS_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:peltogyne_fence", PELTOGYNE_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:pin_cherry_fence", PIN_CHERRY_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:plum_fence", PLUM_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:purfunga_fence", PURFUNGA_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:rark_fence", RARK_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:red_elm_fence", RED_ELM_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:rhadi_fence", RHADI_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:sanguart_fence", SANGUART_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:scarlet_thiorcen_fence", SCARLET_THIORCEN_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:sproom_fence", SPROOM_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:sequoia_fence", SEQUOIA_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:stortreean_fence", STORTREEAN_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:stroomean_fence", STROOMEAN_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:sunrise_fungus_fence", SUNRISE_FUNGUS_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:tark_fence", TARK_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:teak_fence", TEAK_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:thundercloud_plum_fence", THUNDERCLOUD_PLUM_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:vynhert_fence", VYNHERT_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:wart_tree_fence", WART_TREE_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:wenge_fence", WENGE_FENCE, ARBOROLOGY);
		registerBlockItem("deep_trenches:yew_fence", YEW_FENCE, ARBOROLOGY);

		registerBlockItem("deep_trenches:almond_fence_gate", ALMOND_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:anameata_fence_gate", ANAMEATA_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:angels_trumpet_fence_gate", ANGELS_TRUMPET_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:aquean_fence_gate", AQUEAN_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:barshrookle_fence_gate", BARSHROOKLE_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:black_birch_fence_gate", BLACK_BIRCH_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_mahoe_fence_gate", BLUE_MAHOE_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_spruce_fence_gate", BLUE_SPRUCE_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:bottlebrush_fence_gate", BOTTLEBRUSH_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:bromya_fence_gate", BROMYA_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:bubbletree_fence_gate", BUBBLETREE_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:calcearb_fence_gate", CALCEARB_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:cherry_fence_gate", CHERRY_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:chotorn_fence_gate", CHOTORN_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:cook_pine_fence_gate", COOK_PINE_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:crolood_fence_gate", CROLOOD_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_crolood_fence_gate", DARK_CROLOOD_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_fuchsitra_fence_gate", DARK_FUCHSITRA_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_red_elm_fence_gate", DARK_RED_ELM_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:dead_wart_tree_fence_gate", DEAD_WART_TREE_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:drigyus_fence_gate", DRIGYUS_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:ebony_fence_gate", EBONY_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:enderheart_fence_gate", ENDERHEART_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:flalm_fence_gate", FLALM_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:fruce_fence_gate", FRUCE_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:fuchsitra_fence_gate", FUCHSITRA_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:fugmos_fence_gate", FUGMOS_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:funeranite_fence_gate", FUNERANITE_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:ghoshroom_fence_gate", GHOSHROOM_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:giant_violet_fence_gate", GIANT_VIOLET_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:guaiacum_fence_gate", GUAIACUM_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:joshua_fence_gate", JOSHUA_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:klinkii_pine_fence_gate", KLINKII_PINE_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:melaleuca_fence_gate", MELALEUCA_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:murkantuan_fence_gate", MURKANTUAN_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:norfolk_pine_fence_gate", NORFOLK_PINE_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:obscrus_fence_gate", OBSCRUS_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:orhpris_fence_gate", ORHPRIS_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:peltogyne_fence_gate", PELTOGYNE_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:pin_cherry_fence_gate", PIN_CHERRY_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:plum_fence_gate", PLUM_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:purfunga_fence_gate", PURFUNGA_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:rark_fence_gate", RARK_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:red_elm_fence_gate", RED_ELM_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:rhadi_fence_gate", RHADI_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:sanguart_fence_gate", SANGUART_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:scarlet_thiorcen_fence_gate", SCARLET_THIORCEN_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:sproom_fence_gate", SPROOM_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:sequoia_fence_gate", SEQUOIA_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:stortreean_fence_gate", STORTREEAN_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:stroomean_fence_gate", STROOMEAN_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:sunrise_fungus_fence_gate", SUNRISE_FUNGUS_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:tark_fence_gate", TARK_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:teak_fence_gate", TEAK_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:thundercloud_plum_fence_gate", THUNDERCLOUD_PLUM_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:vynhert_fence_gate", VYNHERT_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:wart_tree_fence_gate", WART_TREE_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:wenge_fence_gate", WENGE_FENCE_GATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:yew_fence_gate", YEW_FENCE_GATE, ARBOROLOGY);

		registerBlockItem("deep_trenches:almond_leaves", ALMOND_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:angels_trumpet_leaves", ANGELS_TRUMPET_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:aquean_leaves", AQUEAN_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:black_birch_leaves", BLACK_BIRCH_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_mahoe_leaves", BLUE_MAHOE_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_spruce_leaves", BLUE_SPRUCE_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:bottlebrush_leaves", BOTTLEBRUSH_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:bromya_leaves", BROMYA_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:calcearb_leaves", CALCEARB_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:cherry_leaves", CHERRY_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:cook_pine_leaves", COOK_PINE_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:crolood_leaves", CROLOOD_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_crolood_leaves", DARK_CROLOOD_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_fuchsitra_leaves", DARK_FUCHSITRA_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_red_elm_leaves", DARK_RED_ELM_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:ebony_leaves", EBONY_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:enderheart_leaves", ENDERHEART_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:fruce_leaves", FRUCE_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:fuchsitra_leaves", FUCHSITRA_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:guaiacum_leaves", GUAIACUM_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:joshua_leaves", JOSHUA_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:klinkii_pine_leaves", KLINKII_PINE_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:melaleuca_leaves", MELALEUCA_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:murkantuan_leaves", MURKANTUAN_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:norfolk_pine_leaves", NORFOLK_PINE_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:obscrus_leaves", OBSCRUS_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:orhpris_leaves", ORHPRIS_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:peltogyne_leaves", PELTOGYNE_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:pin_cherry_leaves", PIN_CHERRY_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:plum_leaves", PLUM_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:rark_leaves", RARK_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:red_elm_leaves", RED_ELM_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:rhadi_leaves", RHADI_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:sanguart_leaves", SANGUART_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:sproom_leaves", SPROOM_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:sequoia_leaves", SEQUOIA_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:stortreean_leaves", STORTREEAN_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:tark_leaves", TARK_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:teak_leaves", TEAK_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:thundercloud_plum_leaves", THUNDERCLOUD_PLUM_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:wenge_leaves", WENGE_LEAVES, ARBOROLOGY);
		registerBlockItem("deep_trenches:yew_leaves", YEW_LEAVES, ARBOROLOGY);

		registerBlockItem("deep_trenches:almond_log", ALMOND_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:anameata_log", ANAMEATA_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:angels_trumpet_log", ANGELS_TRUMPET_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:aquean_log", AQUEAN_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:barshrookle_log", BARSHROOKLE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:black_birch_log", BLACK_BIRCH_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_mahoe_log", BLUE_MAHOE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_spruce_log", BLUE_SPRUCE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:bottlebrush_log", BOTTLEBRUSH_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:bromya_log", BROMYA_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:bubbletree_log", BUBBLETREE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:calcearb_log", CALCEARB_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:cherry_log", CHERRY_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:chotorn_log", CHOTORN_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:cook_pine_log", COOK_PINE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:crolood_log", CROLOOD_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_crolood_log", DARK_CROLOOD_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_fuchsitra_log", DARK_FUCHSITRA_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_red_elm_log", DARK_RED_ELM_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:dead_wart_tree_log", DEAD_WART_TREE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:drigyus_log", DRIGYUS_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:ebony_log", EBONY_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:enderheart_log", ENDERHEART_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:flalm_stem", FLALM_STEM, ARBOROLOGY);
		registerBlockItem("deep_trenches:fruce_log", FRUCE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:fuchsitra_log", FUCHSITRA_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:fugmos_stem", FUGMOS_STEM, ARBOROLOGY);
		registerBlockItem("deep_trenches:funeranite_log", FUNERANITE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:ghoshroom_log", GHOSHROOM_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:giant_violet_stem", GIANT_VIOLET_STEM, ARBOROLOGY);
		registerBlockItem("deep_trenches:guaiacum_log", GUAIACUM_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:joshua_log", JOSHUA_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:klinkii_pine_log", KLINKII_PINE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:melaleuca_log", MELALEUCA_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:murkantuan_log", MURKANTUAN_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:norfolk_pine_log", NORFOLK_PINE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:obscrus_log", OBSCRUS_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:orhpris_log", ORHPRIS_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:peltogyne_log", PELTOGYNE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:pin_cherry_log", PIN_CHERRY_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:plum_log", PLUM_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:purfunga_log", PURFUNGA_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:rark_log", RARK_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:red_elm_log", RED_ELM_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:rhadi_log", RHADI_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:sanguart_log", SANGUART_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:scarlet_thiorcen_log", SCARLET_THIORCEN_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:sproom_log", SPROOM_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:sequoia_log", SEQUOIA_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stortreean_log", STORTREEAN_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stroomean_log", STROOMEAN_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:sunrise_fungus_log", SUNRISE_FUNGUS_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:tark_log", TARK_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:teak_log", TEAK_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:thundercloud_plum_log", THUNDERCLOUD_PLUM_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:vynhert_log", VYNHERT_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:wart_tree_log", WART_TREE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:wenge_log", WENGE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:mossy_yew_log", MOSSY_YEW_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:yew_log", YEW_LOG, ARBOROLOGY);

		registerBlockItem("deep_trenches:almond_planks", ALMOND_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:anameata_planks", ANAMEATA_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:angels_trumpet_planks", ANGELS_TRUMPET_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:aquean_planks", AQUEAN_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:barshrookle_planks", BARSHROOKLE_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:black_birch_planks", BLACK_BIRCH_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_mahoe_planks", BLUE_MAHOE_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_spruce_planks", BLUE_SPRUCE_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:bottlebrush_planks", BOTTLEBRUSH_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:bromya_planks", BROMYA_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:bubbletree_planks", BUBBLETREE_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:calcearb_planks", CALCEARB_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:cherry_planks", CHERRY_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:chotorn_planks", CHOTORN_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:cook_pine_planks", COOK_PINE_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:crolood_planks", CROLOOD_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_crolood_planks", DARK_CROLOOD_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_fuchsitra_planks", DARK_FUCHSITRA_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_red_elm_planks", DARK_RED_ELM_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:dead_wart_tree_planks", DEAD_WART_TREE_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:drigyus_planks", DRIGYUS_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:ebony_planks", EBONY_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:enderheart_planks", ENDERHEART_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:flalm_planks", FLALM_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:fruce_planks", FRUCE_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:fuchsitra_planks", FUCHSITRA_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:fugmos_planks", FUGMOS_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:funeranite_planks", FUNERANITE_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:ghoshroom_planks", GHOSHROOM_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:giant_violet_planks", GIANT_VIOLET_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:guaiacum_planks", GUAIACUM_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:joshua_planks", JOSHUA_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:klinkii_pine_planks", KLINKII_PINE_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:melaleuca_planks", MELALEUCA_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:murkantuan_planks", MURKANTUAN_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:norfolk_pine_planks", NORFOLK_PINE_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:obscrus_planks", OBSCRUS_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:orhpris_planks", ORHPRIS_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:peltogyne_planks", PELTOGYNE_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:pin_cherry_planks", PIN_CHERRY_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:plum_planks", PLUM_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:purfunga_planks", PURFUNGA_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:rark_planks", RARK_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:red_elm_planks", RED_ELM_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:rhadi_planks", RHADI_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:sanguart_planks", SANGUART_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:scarlet_thiorcen_planks", SCARLET_THIORCEN_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:sproom_planks", SPROOM_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:sequoia_planks", SEQUOIA_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:stortreean_planks", STORTREEAN_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:stroomean_planks", STROOMEAN_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:sunrise_fungus_planks", SUNRISE_FUNGUS_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:tark_planks", TARK_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:teak_planks", TEAK_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:thundercloud_plum_planks", THUNDERCLOUD_PLUM_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:vynhert_planks", VYNHERT_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:wart_tree_planks", WART_TREE_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:wenge_planks", WENGE_PLANKS, ARBOROLOGY);
		registerBlockItem("deep_trenches:yew_planks", YEW_PLANKS, ARBOROLOGY);

		registerBlockItem("deep_trenches:almond_pressure_plate", ALMOND_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:anameata_pressure_plate", ANAMEATA_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:angels_trumpet_pressure_plate", ANGELS_TRUMPET_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:aquean_pressure_plate", AQUEAN_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:barshrookle_pressure_plate", BARSHROOKLE_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:black_birch_pressure_plate", BLACK_BIRCH_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_mahoe_pressure_plate", BLUE_MAHOE_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_spruce_pressure_plate", BLUE_SPRUCE_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:bottlebrush_pressure_plate", BOTTLEBRUSH_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:bromya_pressure_plate", BROMYA_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:bubbletree_pressure_plate", BUBBLETREE_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:calcearb_pressure_plate", CALCEARB_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:cherry_pressure_plate", CHERRY_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:chotorn_pressure_plate", CHOTORN_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:cook_pine_pressure_plate", COOK_PINE_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:crolood_pressure_plate", CROLOOD_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_crolood_pressure_plate", DARK_CROLOOD_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_fuchsitra_pressure_plate", DARK_FUCHSITRA_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_red_elm_pressure_plate", DARK_RED_ELM_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:dead_wart_tree_pressure_plate", DEAD_WART_TREE_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:drigyus_pressure_plate", DRIGYUS_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:ebony_pressure_plate", EBONY_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:enderheart_pressure_plate", ENDERHEART_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:flalm_pressure_plate", FLALM_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:fruce_pressure_plate", FRUCE_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:fuchsitra_pressure_plate", FUCHSITRA_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:fugmos_pressure_plate", FUGMOS_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:funeranite_pressure_plate", FUNERANITE_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:ghoshroom_pressure_plate", GHOSHROOM_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:giant_violet_pressure_plate", GIANT_VIOLET_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:guaiacum_pressure_plate", GUAIACUM_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:joshua_pressure_plate", JOSHUA_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:klinkii_pine_pressure_plate", KLINKII_PINE_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:melaleuca_pressure_plate", MELALEUCA_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:murkantuan_pressure_plate", MURKANTUAN_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:norfolk_pine_pressure_plate", NORFOLK_PINE_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:obscrus_pressure_plate", OBSCRUS_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:orhpris_pressure_plate", ORHPRIS_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:peltogyne_pressure_plate", PELTOGYNE_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:pin_cherry_pressure_plate", PIN_CHERRY_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:plum_pressure_plate", PLUM_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:purfunga_pressure_plate", PURFUNGA_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:rark_pressure_plate", RARK_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:red_elm_pressure_plate", RED_ELM_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:rhadi_pressure_plate", RHADI_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:sanguart_pressure_plate", SANGUART_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:scarlet_thiorcen_pressure_plate", SCARLET_THIORCEN_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:sproom_pressure_plate", SPROOM_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:sequoia_pressure_plate", SEQUOIA_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:stortreean_pressure_plate", STORTREEAN_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:stroomean_pressure_plate", STROOMEAN_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:sunrise_fungus_pressure_plate", SUNRISE_FUNGUS_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:tark_pressure_plate", TARK_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:teak_pressure_plate", TEAK_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:thundercloud_plum_pressure_plate", THUNDERCLOUD_PLUM_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:vynhert_pressure_plate", VYNHERT_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:wart_tree_pressure_plate", WART_TREE_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:wenge_pressure_plate", WENGE_PRESSURE_PLATE, ARBOROLOGY);
		registerBlockItem("deep_trenches:yew_pressure_plate", YEW_PRESSURE_PLATE, ARBOROLOGY);

		registerBlockItem("deep_trenches:almond_sapling", ALMOND_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:anameata_sapling", ANAMEATA_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:angels_trumpet_sapling", ANGELS_TRUMPET_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:aquean_sapling", AQUEAN_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:barshrookle_sapling", BARSHROOKLE_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:black_birch_sapling", BLACK_BIRCH_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_mahoe_sapling", BLUE_MAHOE_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_spruce_sapling", BLUE_SPRUCE_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:bottlebrush_sapling", BOTTLEBRUSH_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:bromya_sapling", BROMYA_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:bubbletree_sapling", BUBBLETREE_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:calcearb_sapling", CALCEARB_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:cherry_sapling", CHERRY_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:cook_pine_sapling", COOK_PINE_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:crolood_sapling", CROLOOD_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_crolood_sapling", DARK_CROLOOD_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_fuchsitra_sapling", DARK_FUCHSITRA_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_red_elm_sapling", DARK_RED_ELM_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:ebony_sapling", EBONY_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:enderheart_sapling", ENDERHEART_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:fruce_sapling", FRUCE_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:fuchsitra_sapling", FUCHSITRA_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:funeranite_sapling", FUNERANITE_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:ghoshroom_sapling", GHOSHROOM_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:guaiacum_sapling", GUAIACUM_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:joshua_sapling", JOSHUA_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:klinkii_pine_sapling", KLINKII_PINE_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:melaleuca_sapling", MELALEUCA_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:murkantuan_sapling", MURKANTUAN_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:norfolk_pine_sapling", NORFOLK_PINE_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:orhpris_sapling", ORHPRIS_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:peltogyne_sapling", PELTOGYNE_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:pin_cherry_sapling", PIN_CHERRY_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:plum_sapling", PLUM_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:purfunga_sapling", PURFUNGA_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:rark_sapling", RARK_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:red_elm_sapling", RED_ELM_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:rhadi_sapling", RHADI_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:sanguart_sapling", SANGUART_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:sproom_sapling", SPROOM_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:sequoia_sapling", SEQUOIA_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:stortreean_sapling", STORTREEAN_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:stroomean_sapling", STROOMEAN_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:sunrise_fungus_sapling", SUNRISE_FUNGUS_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:tark_sapling", TARK_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:teak_sapling", TEAK_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:thundercloud_plum_sapling", THUNDERCLOUD_PLUM_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:vynhert_sapling", VYNHERT_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:wenge_sapling", WENGE_SAPLING, ARBOROLOGY);
		registerBlockItem("deep_trenches:yew_sapling", YEW_SAPLING, ARBOROLOGY);

		registerSignItem("deep_trenches:almond_sign", ALMOND_SIGN, ALMOND_WALL_SIGN);
		registerSignItem("deep_trenches:anameata_sign", ANAMEATA_SIGN, ANAMEATA_WALL_SIGN);
		registerSignItem("deep_trenches:angels_trumpet_sign", ANGELS_TRUMPET_SIGN, ANGELS_TRUMPET_WALL_SIGN);
		registerSignItem("deep_trenches:aquean_sign", AQUEAN_SIGN, AQUEAN_WALL_SIGN);
		registerSignItem("deep_trenches:barshrookle_sign", BARSHROOKLE_SIGN, BARSHROOKLE_WALL_SIGN);
		registerSignItem("deep_trenches:black_birch_sign", BLACK_BIRCH_SIGN, BLACK_BIRCH_WALL_SIGN);
		registerSignItem("deep_trenches:blue_mahoe_sign", BLUE_MAHOE_SIGN, BLUE_MAHOE_WALL_SIGN);
		registerSignItem("deep_trenches:blue_spruce_sign", BLUE_SPRUCE_SIGN, BLUE_SPRUCE_WALL_SIGN);
		registerSignItem("deep_trenches:bottlebrush_sign", BOTTLEBRUSH_SIGN, BOTTLEBRUSH_WALL_SIGN);
		registerSignItem("deep_trenches:bromya_sign", BROMYA_SIGN, BROMYA_WALL_SIGN);
		registerSignItem("deep_trenches:bubbletree_sign", BUBBLETREE_SIGN, BUBBLETREE_WALL_SIGN);
		registerSignItem("deep_trenches:calcearb_sign", CALCEARB_SIGN, CALCEARB_WALL_SIGN);
		registerSignItem("deep_trenches:cherry_sign", CHERRY_SIGN, CHERRY_WALL_SIGN);
		registerSignItem("deep_trenches:chotorn_sign", CHOTORN_SIGN, CHOTORN_WALL_SIGN);
		registerSignItem("deep_trenches:cook_pine_sign", COOK_PINE_SIGN, COOK_PINE_WALL_SIGN);
		registerSignItem("deep_trenches:crolood_sign", CROLOOD_SIGN, CROLOOD_WALL_SIGN);
		registerSignItem("deep_trenches:dark_crolood_sign", DARK_CROLOOD_SIGN, DARK_CROLOOD_WALL_SIGN);
		registerSignItem("deep_trenches:dark_fuchsitra_sign", DARK_FUCHSITRA_SIGN, DARK_FUCHSITRA_WALL_SIGN);
		registerSignItem("deep_trenches:dark_red_elm_sign", DARK_RED_ELM_SIGN, DARK_RED_ELM_WALL_SIGN);
		registerSignItem("deep_trenches:dead_wart_tree_sign", DEAD_WART_TREE_SIGN, DEAD_WART_TREE_WALL_SIGN);
		registerSignItem("deep_trenches:drigyus_sign", DRIGYUS_SIGN, DRIGYUS_WALL_SIGN);
		registerSignItem("deep_trenches:ebony_sign", EBONY_SIGN, EBONY_WALL_SIGN);
		registerSignItem("deep_trenches:enderheart_sign", ENDERHEART_SIGN, ENDERHEART_WALL_SIGN);
		registerSignItem("deep_trenches:flalm_sign", FLALM_SIGN, FLALM_WALL_SIGN);
		registerSignItem("deep_trenches:fruce_sign", FRUCE_SIGN, FRUCE_WALL_SIGN);
		registerSignItem("deep_trenches:fuchsitra_sign", FUCHSITRA_SIGN, FUCHSITRA_WALL_SIGN);
		registerSignItem("deep_trenches:fugmos_sign", FUGMOS_SIGN, FUGMOS_WALL_SIGN);
		registerSignItem("deep_trenches:funeranite_sign", FUNERANITE_SIGN, FUNERANITE_WALL_SIGN);
		registerSignItem("deep_trenches:ghoshroom_sign", GHOSHROOM_SIGN, GHOSHROOM_WALL_SIGN);
		registerSignItem("deep_trenches:giant_violet_sign", GIANT_VIOLET_SIGN, GIANT_VIOLET_WALL_SIGN);
		registerSignItem("deep_trenches:guaiacum_sign", GUAIACUM_SIGN, GUAIACUM_WALL_SIGN);
		registerSignItem("deep_trenches:joshua_sign", JOSHUA_SIGN, JOSHUA_WALL_SIGN);
		registerSignItem("deep_trenches:klinkii_pine_sign", KLINKII_PINE_SIGN, KLINKII_PINE_WALL_SIGN);
		registerSignItem("deep_trenches:melaleuca_sign", MELALEUCA_SIGN, MELALEUCA_WALL_SIGN);
		registerSignItem("deep_trenches:murkantuan_sign", MURKANTUAN_SIGN, MURKANTUAN_WALL_SIGN);
		registerSignItem("deep_trenches:norfolk_pine_sign", NORFOLK_PINE_SIGN, NORFOLK_PINE_WALL_SIGN);
		registerSignItem("deep_trenches:obscrus_sign", OBSCRUS_SIGN, OBSCRUS_WALL_SIGN);
		registerSignItem("deep_trenches:orhpris_sign", ORHPRIS_SIGN, ORHPRIS_WALL_SIGN);
		registerSignItem("deep_trenches:peltogyne_sign", PELTOGYNE_SIGN, PELTOGYNE_WALL_SIGN);
		registerSignItem("deep_trenches:pin_cherry_sign", PIN_CHERRY_SIGN, PIN_CHERRY_WALL_SIGN);
		registerSignItem("deep_trenches:plum_sign", PLUM_SIGN, PLUM_WALL_SIGN);
		registerSignItem("deep_trenches:purfunga_sign", PURFUNGA_SIGN, PURFUNGA_WALL_SIGN);
		registerSignItem("deep_trenches:rark_sign", RARK_SIGN, RARK_WALL_SIGN);
		registerSignItem("deep_trenches:red_elm_sign", RED_ELM_SIGN, RED_ELM_WALL_SIGN);
		registerSignItem("deep_trenches:rhadi_sign", RHADI_SIGN, RHADI_WALL_SIGN);
		registerSignItem("deep_trenches:sanguart_sign", SANGUART_SIGN, SANGUART_WALL_SIGN);
		registerSignItem("deep_trenches:scarlet_thiorcen_sign", SCARLET_THIORCEN_SIGN, SCARLET_THIORCEN_WALL_SIGN);
		registerSignItem("deep_trenches:sproom_sign", SPROOM_SIGN, SPROOM_WALL_SIGN);
		registerSignItem("deep_trenches:sequoia_sign", SEQUOIA_SIGN, SEQUOIA_WALL_SIGN);
		registerSignItem("deep_trenches:stortreean_sign", STORTREEAN_SIGN, STORTREEAN_WALL_SIGN);
		registerSignItem("deep_trenches:stroomean_sign", STROOMEAN_SIGN, STROOMEAN_WALL_SIGN);
		registerSignItem("deep_trenches:sunrise_fungus_sign", SUNRISE_FUNGUS_SIGN, SUNRISE_FUNGUS_WALL_SIGN);
		registerSignItem("deep_trenches:tark_sign", TARK_SIGN, TARK_WALL_SIGN);
		registerSignItem("deep_trenches:teak_sign", TEAK_SIGN, TEAK_WALL_SIGN);
		registerSignItem("deep_trenches:thundercloud_plum_sign", THUNDERCLOUD_PLUM_SIGN, THUNDERCLOUD_PLUM_WALL_SIGN);
		registerSignItem("deep_trenches:vynhert_sign", VYNHERT_SIGN, VYNHERT_WALL_SIGN);
		registerSignItem("deep_trenches:wart_tree_sign", WART_TREE_SIGN, WART_TREE_WALL_SIGN);
		registerSignItem("deep_trenches:wenge_sign", WENGE_SIGN, WENGE_WALL_SIGN);
		registerSignItem("deep_trenches:yew_sign", YEW_SIGN, YEW_WALL_SIGN);

		registerBlockItem("deep_trenches:almond_slab", ALMOND_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:anameata_slab", ANAMEATA_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:angels_trumpet_slab", ANGELS_TRUMPET_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:aquean_slab", AQUEAN_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:barshrookle_slab", BARSHROOKLE_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:black_birch_slab", BLACK_BIRCH_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_mahoe_slab", BLUE_MAHOE_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_spruce_slab", BLUE_SPRUCE_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:bottlebrush_slab", BOTTLEBRUSH_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:bromya_slab", BROMYA_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:bubbletree_slab", BUBBLETREE_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:calcearb_slab", CALCEARB_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:cherry_slab", CHERRY_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:chotorn_slab", CHOTORN_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:cook_pine_slab", COOK_PINE_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:crolood_slab", CROLOOD_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_crolood_slab", DARK_CROLOOD_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_fuchsitra_slab", DARK_FUCHSITRA_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_red_elm_slab", DARK_RED_ELM_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:dead_wart_tree_slab", DEAD_WART_TREE_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:drigyus_slab", DRIGYUS_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:ebony_slab", EBONY_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:enderheart_slab", ENDERHEART_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:flalm_slab", FLALM_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:fruce_slab", FRUCE_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:fuchsitra_slab", FUCHSITRA_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:fugmos_slab", FUGMOS_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:funeranite_slab", FUNERANITE_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:ghoshroom_slab", GHOSHROOM_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:giant_violet_slab", GIANT_VIOLET_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:guaiacum_slab", GUAIACUM_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:joshua_slab", JOSHUA_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:klinkii_pine_slab", KLINKII_PINE_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:melaleuca_slab", MELALEUCA_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:murkantuan_slab", MURKANTUAN_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:norfolk_pine_slab", NORFOLK_PINE_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:obscrus_slab", OBSCRUS_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:orhpris_slab", ORHPRIS_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:peltogyne_slab", PELTOGYNE_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:pin_cherry_slab", PIN_CHERRY_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:plum_slab", PLUM_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:purfunga_slab", PURFUNGA_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:rark_slab", RARK_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:red_elm_slab", RED_ELM_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:rhadi_slab", RHADI_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:sanguart_slab", SANGUART_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:scarlet_thiorcen_slab", SCARLET_THIORCEN_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:sproom_slab", SPROOM_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:sequoia_slab", SEQUOIA_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:stortreean_slab", STORTREEAN_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:stroomean_slab", STROOMEAN_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:sunrise_fungus_slab", SUNRISE_FUNGUS_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:tark_slab", TARK_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:teak_slab", TEAK_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:thundercloud_plum_slab", THUNDERCLOUD_PLUM_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:vynhert_slab", VYNHERT_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:wart_tree_slab", WART_TREE_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:wenge_slab", WENGE_SLAB, ARBOROLOGY);
		registerBlockItem("deep_trenches:yew_slab", YEW_SLAB, ARBOROLOGY);

		registerBlockItem("deep_trenches:almond_stairs", ALMOND_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:anameata_stairs", ANAMEATA_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:angels_trumpet_stairs", ANGELS_TRUMPET_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:aquean_stairs", AQUEAN_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:barshrookle_stairs", BARSHROOKLE_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:black_birch_stairs", BLACK_BIRCH_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_mahoe_stairs", BLUE_MAHOE_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_spruce_stairs", BLUE_SPRUCE_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:bottlebrush_stairs", BOTTLEBRUSH_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:bromya_stairs", BROMYA_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:bubbletree_stairs", BUBBLETREE_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:calcearb_stairs", CALCEARB_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:cherry_stairs", CHERRY_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:chotorn_stairs", CHOTORN_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:cook_pine_stairs", COOK_PINE_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:crolood_stairs", CROLOOD_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_crolood_stairs", DARK_CROLOOD_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_fuchsitra_stairs", DARK_FUCHSITRA_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_red_elm_stairs", DARK_RED_ELM_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:dead_wart_tree_stairs", DEAD_WART_TREE_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:drigyus_stairs", DRIGYUS_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:ebony_stairs", EBONY_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:enderheart_stairs", ENDERHEART_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:flalm_stairs", FLALM_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:fruce_stairs", FRUCE_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:fuchsitra_stairs", FUCHSITRA_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:fugmos_stairs", FUGMOS_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:funeranite_stairs", FUNERANITE_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:ghoshroom_stairs", GHOSHROOM_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:giant_violet_stairs", GIANT_VIOLET_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:guaiacum_stairs", GUAIACUM_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:joshua_stairs", JOSHUA_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:klinkii_pine_stairs", KLINKII_PINE_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:melaleuca_stairs", MELALEUCA_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:murkantuan_stairs", MURKANTUAN_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:norfolk_pine_stairs", NORFOLK_PINE_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:obscrus_stairs", OBSCRUS_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:orhpris_stairs", ORHPRIS_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:peltogyne_stairs", PELTOGYNE_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:pin_cherry_stairs", PIN_CHERRY_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:plum_stairs", PLUM_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:purfunga_stairs", PURFUNGA_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:rark_stairs", RARK_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:red_elm_stairs", RED_ELM_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:rhadi_stairs", RHADI_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:sanguart_stairs", SANGUART_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:scarlet_thiorcen_stairs", SCARLET_THIORCEN_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:sproom_stairs", SPROOM_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:sequoia_stairs", SANGUART_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:stortreean_stairs", STORTREEAN_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:stroomean_stairs", STROOMEAN_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:sunrise_fungus_stairs", SUNRISE_FUNGUS_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:tark_stairs", TARK_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:teak_stairs", TEAK_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:thundercloud_plum_stairs", THUNDERCLOUD_PLUM_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:vynhert_stairs", VYNHERT_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:wart_tree_stairs", WART_TREE_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:wenge_stairs", WENGE_STAIRS, ARBOROLOGY);
		registerBlockItem("deep_trenches:yew_stairs", YEW_STAIRS, ARBOROLOGY);

		registerBlockItem("deep_trenches:almond_trapdoor", ALMOND_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:anameata_trapdoor", ANAMEATA_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:angels_trumpet_trapdoor", ANGELS_TRUMPET_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:aquean_trapdoor", AQUEAN_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:barshrookle_trapdoor", BARSHROOKLE_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:black_birch_trapdoor", BLACK_BIRCH_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_mahoe_trapdoor", BLUE_MAHOE_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_spruce_trapdoor", BLUE_SPRUCE_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:bottlebrush_trapdoor", BOTTLEBRUSH_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:bromya_trapdoor", BROMYA_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:bubbletree_trapdoor", BUBBLETREE_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:calcearb_trapdoor", CALCEARB_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:cherry_trapdoor", CHERRY_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:chotorn_trapdoor", CHOTORN_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:cook_pine_trapdoor", COOK_PINE_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:crolood_trapdoor", CROLOOD_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_crolood_trapdoor", DARK_CROLOOD_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_fuchsitra_trapdoor", DARK_FUCHSITRA_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_red_elm_trapdoor", DARK_RED_ELM_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:dead_wart_tree_trapdoor", DEAD_WART_TREE_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:drigyus_trapdoor", DRIGYUS_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:ebony_trapdoor", EBONY_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:enderheart_trapdoor", ENDERHEART_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:flalm_trapdoor", FLALM_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:fruce_trapdoor", FRUCE_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:fuchsitra_trapdoor", FUCHSITRA_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:fugmos_trapdoor", FUGMOS_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:funeranite_trapdoor", FUNERANITE_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:ghoshroom_trapdoor", GHOSHROOM_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:giant_violet_trapdoor", GIANT_VIOLET_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:guaiacum_trapdoor", GUAIACUM_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:joshua_trapdoor", JOSHUA_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:klinkii_pine_trapdoor", KLINKII_PINE_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:melaleuca_trapdoor", MELALEUCA_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:murkantuan_trapdoor", MURKANTUAN_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:norfolk_pine_trapdoor", NORFOLK_PINE_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:obscrus_trapdoor", OBSCRUS_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:orhpris_trapdoor", ORHPRIS_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:peltogyne_trapdoor", PELTOGYNE_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:pin_cherry_trapdoor", PIN_CHERRY_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:plum_trapdoor", PLUM_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:purfunga_trapdoor", PURFUNGA_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:rark_trapdoor", RARK_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:red_elm_trapdoor", RED_ELM_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:rhadi_trapdoor", RHADI_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:sanguart_trapdoor", SANGUART_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:scarlet_thiorcen_trapdoor", SCARLET_THIORCEN_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:sproom_trapdoor", SPROOM_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:sequoia_trapdoor", SEQUOIA_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:stortreean_trapdoor", STORTREEAN_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:stroomean_trapdoor", STROOMEAN_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:sunrise_fungus_trapdoor", SUNRISE_FUNGUS_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:tark_trapdoor", TARK_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:teak_trapdoor", TEAK_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:thundercloud_plum_trapdoor", THUNDERCLOUD_PLUM_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:vynhert_trapdoor", VYNHERT_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:wart_tree_trapdoor", WART_TREE_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:wenge_trapdoor", WENGE_TRAPDOOR, ARBOROLOGY);
		registerBlockItem("deep_trenches:yew_trapdoor", YEW_TRAPDOOR, ARBOROLOGY);

		registerBlockItem("deep_trenches:almond_wood", ALMOND_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:anameata_wood", ANAMEATA_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:angels_trumpet_wood", ANGELS_TRUMPET_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:aquean_wood", AQUEAN_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:barshrookle_wood", BARSHROOKLE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:black_birch_wood", BLACK_BIRCH_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_mahoe_wood", BLUE_MAHOE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:blue_spruce_wood", BLUE_SPRUCE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:bottlebrush_wood", BOTTLEBRUSH_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:bromya_wood", BROMYA_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:bubbletree_wood", BUBBLETREE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:calcearb_wood", CALCEARB_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:cherry_wood", CHERRY_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:chotorn_wood", CHOTORN_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:cook_pine_wood", COOK_PINE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:crolood_wood", CROLOOD_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_crolood_wood", DARK_CROLOOD_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_fuchsitra_wood", DARK_FUCHSITRA_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:dark_red_elm_wood", DARK_RED_ELM_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:dead_wart_tree_wood", DEAD_WART_TREE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:drigyus_wood", DRIGYUS_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:ebony_wood", EBONY_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:enderheart_wood", ENDERHEART_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:flalm_wood", FLALM_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:fruce_wood", FRUCE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:fuchsitra_wood", FUCHSITRA_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:fugmos_wood", FUGMOS_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:funeranite_wood", FUNERANITE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:ghoshroom_wood", GHOSHROOM_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:giant_violet_wood", GIANT_VIOLET_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:guaiacum_wood", GUAIACUM_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:joshua_wood", JOSHUA_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:klinkii_pine_wood", KLINKII_PINE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:melaleuca_wood", MELALEUCA_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:murkantuan_wood", MURKANTUAN_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:norfolk_pine_wood", NORFOLK_PINE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:obscrus_wood", OBSCRUS_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:orhpris_wood", ORHPRIS_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:peltogyne_wood", PELTOGYNE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:pin_cherry_wood", PIN_CHERRY_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:plum_wood", PLUM_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:purfunga_wood", PURFUNGA_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:rark_wood", RARK_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:red_elm_wood", RED_ELM_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:rhadi_wood", RHADI_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:sanguart_wood", SANGUART_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:scarlet_thiorcen_wood", SCARLET_THIORCEN_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:sproom_wood", SPROOM_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:sequoia_wood", SEQUOIA_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stortreean_wood", STORTREEAN_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stroomean_wood", STROOMEAN_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:sunrise_fungus_wood", SUNRISE_FUNGUS_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:tark_wood", TARK_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:teak_wood", TEAK_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:thundercloud_plum_wood", THUNDERCLOUD_PLUM_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:vynhert_wood", VYNHERT_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:wart_tree_wood", WART_TREE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:wenge_wood", WENGE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:yew_wood", YEW_WOOD, ARBOROLOGY);

		registerBlockItem("deep_trenches:stripped_almond_log", STRIPPED_ALMOND_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_anameata_log", STRIPPED_ANAMEATA_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_angels_trumpet_log", STRIPPED_ANGELS_TRUMPET_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_aquean_log", STRIPPED_AQUEAN_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_barshrookle_log", STRIPPED_BARSHROOKLE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_black_birch_log", STRIPPED_BLACK_BIRCH_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_bottlebrush_log", STRIPPED_BOTTLEBRUSH_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_blue_mahoe_log", STRIPPED_BLUE_MAHOE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_blue_spruce_log", STRIPPED_BLUE_SPRUCE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_bromya_log", STRIPPED_BROMYA_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_bubbletree_log", STRIPPED_BUBBLETREE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_calcearb_log", STRIPPED_CALCEARB_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_cherry_log", STRIPPED_CHERRY_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_cook_pine_log", STRIPPED_COOK_PINE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_chotorn_log", STRIPPED_CHOTORN_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_crolood_log", STRIPPED_CROLOOD_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_dark_crolood_log", STRIPPED_DARK_CROLOOD_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_dark_fuchsitra_log", STRIPPED_DARK_FUCHSITRA_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_dark_red_elm_log", STRIPPED_DARK_RED_ELM_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_dead_wart_tree_log", STRIPPED_DEAD_WART_TREE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_drigyus_log", STRIPPED_DRIGYUS_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_ebony_log", STRIPPED_EBONY_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_enderheart_log", STRIPPED_ENDERHEART_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_fruce_log", STRIPPED_FRUCE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_funeranite_log", STRIPPED_FUNERANITE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_fuchsitra_log", STRIPPED_FUCHSITRA_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_fugmos_stem", STRIPPED_FUGMOS_STEM, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_ghoshroom_log", STRIPPED_GHOSHROOM_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_giant_violet_stem", STRIPPED_GIANT_VIOLET_STEM, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_guaiacum_log", STRIPPED_GUAIACUM_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_joshua_log", STRIPPED_JOSHUA_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_klinkii_pine_log", STRIPPED_KLINKII_PINE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_melaleuca_log", STRIPPED_MELALEUCA_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_murkantuan_log", STRIPPED_MURKANTUAN_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_norfolk_pine_log", STRIPPED_NORFOLK_PINE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_obscrus_log", STRIPPED_OBSCRUS_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_orhpris_log", STRIPPED_ORHPRIS_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_peltogyne_log", STRIPPED_PELTOGYNE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_pin_cherry_log", STRIPPED_PIN_CHERRY_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_plum_log", STRIPPED_PLUM_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_purfunga_log", STRIPPED_PURFUNGA_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_rark_log", STRIPPED_RARK_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_red_elm_log", STRIPPED_RED_ELM_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_rhadi_log", STRIPPED_RHADI_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_sanguart_log", STRIPPED_SANGUART_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_scarlet_thiorcen_log", STRIPPED_SCARLET_THIORCEN_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_sequoia_log", STRIPPED_SEQUOIA_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_sproom_log", STRIPPED_SPROOM_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_stortreean_log", STRIPPED_STORTREEAN_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_stroomean_log", STRIPPED_STROOMEAN_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_sunrise_fungus_log", STRIPPED_SUNRISE_FUNGUS_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_tark_log", STRIPPED_TARK_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_teak_log", STRIPPED_TEAK_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_thundercloud_plum_log", STRIPPED_THUNDERCLOUD_PLUM_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_vynhert_log", STRIPPED_VYNHERT_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_wart_tree_log", STRIPPED_WART_TREE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_wenge_log", STRIPPED_WENGE_LOG, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_yew_log", STRIPPED_YEW_LOG, ARBOROLOGY);

		registerBlockItem("deep_trenches:stripped_almond_wood", STRIPPED_ALMOND_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_anameata_wood", STRIPPED_ANAMEATA_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_angels_trumpet_wood", STRIPPED_ANGELS_TRUMPET_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_aquean_wood", STRIPPED_AQUEAN_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_barshrookle_wood", STRIPPED_BARSHROOKLE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_black_birch_wood", STRIPPED_BLACK_BIRCH_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_bottlebrush_wood", STRIPPED_BOTTLEBRUSH_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_blue_mahoe_wood", STRIPPED_BLUE_MAHOE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_blue_spruce_wood", STRIPPED_BLUE_SPRUCE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_bromya_wood", STRIPPED_BROMYA_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_bubbletree_wood", STRIPPED_BUBBLETREE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_calcearb_wood", STRIPPED_CALCEARB_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_cherry_wood", STRIPPED_CHERRY_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_chotorn_wood", STRIPPED_CHOTORN_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_cook_pine_wood", STRIPPED_COOK_PINE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_crolood_wood", STRIPPED_CROLOOD_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_dark_crolood_wood", STRIPPED_DARK_CROLOOD_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_dark_fuchsitra_wood", STRIPPED_DARK_FUCHSITRA_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_dark_red_elm_wood", STRIPPED_DARK_RED_ELM_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_dead_wart_tree_wood", STRIPPED_DEAD_WART_TREE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_drigyus_wood", STRIPPED_DRIGYUS_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_ebony_wood", STRIPPED_EBONY_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_enderheart_wood", STRIPPED_ENDERHEART_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_flalm_stem", STRIPPED_FLALM_STEM, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_flalm_wood", STRIPPED_FLALM_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_fruce_wood", STRIPPED_FRUCE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_fuchsitra_wood", STRIPPED_FUCHSITRA_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_fugmos_hyphae", STRIPPED_FUGMOS_HYPHAE, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_funeranite_wood", STRIPPED_FUNERANITE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_ghoshroom_wood", STRIPPED_GHOSHROOM_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_giant_violet_wood", STRIPPED_GIANT_VIOLET_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_guaiacum_wood", STRIPPED_GUAIACUM_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_joshua_wood", STRIPPED_JOSHUA_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_klinkii_pine_wood", STRIPPED_KLINKII_PINE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_melaleuca_wood", STRIPPED_MELALEUCA_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_murkantuan_wood", STRIPPED_MURKANTUAN_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_norfolk_pine_wood", STRIPPED_NORFOLK_PINE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_obscrus_wood", STRIPPED_OBSCRUS_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_orhpris_wood", STRIPPED_ORHPRIS_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_peltogyne_wood", STRIPPED_PELTOGYNE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_pin_cherry_wood", STRIPPED_PIN_CHERRY_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_plum_wood", STRIPPED_PLUM_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_purfunga_wood", STRIPPED_PURFUNGA_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_rark_wood", STRIPPED_RARK_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_red_elm_wood", STRIPPED_RED_ELM_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_rhadi_wood", STRIPPED_RHADI_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_sanguart_wood", STRIPPED_SANGUART_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_scarlet_thiorcen_wood", STRIPPED_SCARLET_THIORCEN_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_sequoia_wood", STRIPPED_SEQUOIA_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_sproom_wood", STRIPPED_SPROOM_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_stortreean_wood", STRIPPED_STORTREEAN_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_stroomean_wood", STRIPPED_STROOMEAN_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_sunrise_fungus_wood", STRIPPED_SUNRISE_FUNGUS_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_tark_wood", STRIPPED_TARK_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_teak_wood", STRIPPED_TEAK_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_thundercloud_plum_wood", STRIPPED_THUNDERCLOUD_PLUM_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_vynhert_wood", STRIPPED_VYNHERT_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_wart_tree_wood", STRIPPED_WART_TREE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_wenge_wood", STRIPPED_WENGE_WOOD, ARBOROLOGY);
		registerBlockItem("deep_trenches:stripped_yew_wood", STRIPPED_YEW_WOOD, ARBOROLOGY);

		registerBlockItem("deep_trenches:fugmos_moss", FUGMOS_MOSS, PHYTOLOGY);
		registerBlockItem("deep_trenches:wart_tree_warts", WART_TREE_WARTS, PHYTOLOGY);

		registerBlockItem("deep_trenches:rhadi_fruit", RHADI_FRUIT, PHYTOLOGY);
		registerBlockItem("deep_trenches:carved_rhadi_fruit", CARVED_RHADI_FRUIT, PHYTOLOGY);
		registerBlockItem("deep_trenches:rhadi_o_lantern", RHADI_O_LANTERN, PHYTOLOGY);

		registerBlockItem("deep_trenches:vynhert_fruit", VYNHERT_FRUIT, PHYTOLOGY);
		registerBlockItem("deep_trenches:carved_vynhert_fruit", CARVED_VYNHERT_FRUIT, PHYTOLOGY);
		registerBlockItem("deep_trenches:vynhert_o_lantern", VYNHERT_O_LANTERN, PHYTOLOGY);

		registerBlockItem("deep_trenches:bottlebrush_flowers", BOTTLEBRUSH_FLOWERS, PHYTOLOGY);
		registerBlockItem("deep_trenches:guaiacum_flowers", GUAIACUM_FLOWERS, PHYTOLOGY);
		registerBlockItem("deep_trenches:melaleuca_flowers", MELALEUCA_FLOWERS, PHYTOLOGY);

		registerBlockItem("deep_trenches:chotorn", CHOTORN, PHYTOLOGY);
		registerBlockItem("deep_trenches:drigyus", DRIGYUS, PHYTOLOGY);
		registerBlockItem("deep_trenches:flalm", FLALM, PHYTOLOGY);
		registerBlockItem("deep_trenches:fugmos", FUGMOS, PHYTOLOGY);
		registerBlockItem("deep_trenches:obscrus", OBSCRUS, PHYTOLOGY);
		registerBlockItem("deep_trenches:scarlet_thiorcen", SCARLET_THIORCEN, PHYTOLOGY);

		registerBlockItem("deep_trenches:enderheart_leaf", ENDERHEART_LEAF, PHYTOLOGY);
		registerBlockItem("deep_trenches:vynhert_leaf", VYNHERT_LEAF, PHYTOLOGY);

		registerBlockItem("deep_trenches:flalm_thorns", FLALM_THORNS, PHYTOLOGY);
		registerBlockItem("deep_trenches:rhadi_thorns", RHADI_THORNS, PHYTOLOGY);
		registerBlockItem("deep_trenches:vynhert_tentacles", VYNHERT_TENTACLES, PHYTOLOGY);
		registerBlockItem("deep_trenches:vynhert_thorns", VYNHERT_THORNS, PHYTOLOGY);

		/* FISH BUCKETS */
		registerItem("deep_trenches:barbeled_loosejaw_bucket", BARBELED_LOOSEJAW_BUCKET);
		registerItem("deep_trenches:betta_bucket", BETTA_BUCKET);
		registerItem("deep_trenches:black_loosejaw_bucket", BLACK_LOOSEJAW_BUCKET);
		registerItem("deep_trenches:deep_lake_betta_bucket", DEEP_LAKE_BETTA_BUCKET);
		registerItem("deep_trenches:giant_hatchetfish_bucket", GIANT_HATCHETFISH_BUCKET);
		registerItem("deep_trenches:light_loosejaw_bucket", LIGHT_LOOSEJAW_BUCKET);
		registerItem("deep_trenches:smalltooth_dragonfish_bucket", SMALLTOOTH_DRAGONFISH_BUCKET);

		/* FLUID BUCKETS */
		registerItem("deep_trenches:abyssopelagic_water_bucket", ABYSSOPELAGIC_WATER_BUCKET);
		registerItem("deep_trenches:acid_bucket", ACID_BUCKET);
		registerItem("deep_trenches:bathypelagic_water_bucket", BATHYPELAGIC_WATER_BUCKET);
		registerItem("deep_trenches:brine_bucket", BRINE_BUCKET);
		registerItem("deep_trenches:clear_water_bucket", CLEAR_WATER_BUCKET);
		registerItem("deep_trenches:hadopelagic_water_bucket", HADOPELAGIC_WATER_BUCKET);
		registerItem("deep_trenches:mesopelagic_water_bucket", MESOPELAGIC_WATER_BUCKET);
		registerItem("deep_trenches:storcean_abyssopelagic_water_bucket", STORCEAN_ABYSSOPELAGIC_WATER_BUCKET);
		registerItem("deep_trenches:storcean_bathypelagic_water_bucket", STORCEAN_BATHYPELAGIC_WATER_BUCKET);
		registerItem("deep_trenches:storcean_enderpelagic_water_bucket", STORCEAN_ENDERPELAGIC_WATER_BUCKET);
		registerItem("deep_trenches:storcean_gasopelagic_water_bucket", STORCEAN_GASOPELAGIC_WATER_BUCKET);
		registerItem("deep_trenches:storcean_hadopelagic_water_bucket", STORCEAN_HADOPELAGIC_WATER_BUCKET);
		registerItem("deep_trenches:storcean_infinipelagic_water_bucket", STORCEAN_INFINIPELAGIC_WATER_BUCKET);
		registerItem("deep_trenches:storcean_mesopelagic_water_bucket", STORCEAN_MESOPELAGIC_WATER_BUCKET);
		registerItem("deep_trenches:storcean_virdipelagic_water_bucket", STORCEAN_VIRDIPELAGIC_WATER_BUCKET);
		registerItem("deep_trenches:storcean_water_bucket", STORCEAN_WATER_BUCKET);

		/* SPAWN EGGS */
		registerItem("deep_trenches:barbeled_loosejaw_spawn_egg", BARBELED_LOOSEJAW_SPAWN_EGG);
		registerItem("deep_trenches:betta_spawn_egg", BETTA_SPAWN_EGG);
		registerItem("deep_trenches:black_loosejaw_spawn_egg", BLACK_LOOSEJAW_SPAWN_EGG);
		registerItem("deep_trenches:deep_lake_betta_spawn_egg", DEEP_LAKE_BETTA_SPAWN_EGG);
		registerItem("deep_trenches:giant_hatchetfish_spawn_egg", GIANT_HATCHETFISH_SPAWN_EGG);
		registerItem("deep_trenches:light_loosejaw_spawn_egg", LIGHT_LOOSEJAW_SPAWN_EGG);
		registerItem("deep_trenches:smalltooth_dragonfish_spawn_egg", SMALLTOOTH_DRAGONFISH_SPAWN_EGG);
		registerItem("deep_trenches:stasp_spawn_egg", STASP_SPAWN_EGG);

		/* FRUITS */
		registerItem("deep_trenches:almond", ALMOND);
		registerItem("deep_trenches:almond_drupe", ALMOND_DRUPE);
		registerItem("deep_trenches:aquean_sap", AQUEAN_SAP);
		registerItem("deep_trenches:bottle_of_aquean_sap", BOTTLE_OF_AQUEAN_SAP);
		registerItem("deep_trenches:cherry", CHERRY);
		registerItem("deep_trenches:crolood_fruit", CROLOOD_FRUIT);
		registerItem("deep_trenches:dark_crolood_fruit", DARK_CROLOOD_FRUIT);
		registerItem("deep_trenches:persimmon_fruit", PERSIMMON_FRUIT);
		registerItem("deep_trenches:pin_cherry", PIN_CHERRY);
		registerItem("deep_trenches:plum", PLUM);
		registerItem("deep_trenches:thundercloud_plum", THUNDERCLOUD_PLUM);

		/* BOAT */
		registerItem("deep_trenches:almond_boat", ALMOND_BOAT);
		registerItem("deep_trenches:anameata_boat", ANAMEATA_BOAT);
		registerItem("deep_trenches:angels_trumpet_boat", ANGELS_TRUMPET_BOAT);
		registerItem("deep_trenches:aquean_boat", AQUEAN_BOAT);
		registerItem("deep_trenches:barshrookle_boat", BARSHROOKLE_BOAT);
		registerItem("deep_trenches:black_birch_boat", BLACK_BIRCH_BOAT);
		registerItem("deep_trenches:blue_mahoe_boat", BLUE_MAHOE_BOAT);
		registerItem("deep_trenches:blue_spruce_boat", BLUE_SPRUCE_BOAT);
		registerItem("deep_trenches:bottlebrush_boat", BOTTLEBRUSH_BOAT);
		registerItem("deep_trenches:bromya_boat", BROMYA_BOAT);
		registerItem("deep_trenches:bubbletree_boat", BUBBLETREE_BOAT);
		registerItem("deep_trenches:calcearb_boat", CALCEARB_BOAT);
		registerItem("deep_trenches:cherry_boat", CHERRY_BOAT);
		registerItem("deep_trenches:chotorn_boat", CHOTORN_BOAT);
		registerItem("deep_trenches:cook_pine_boat", COOK_PINE_BOAT);
		registerItem("deep_trenches:crolood_boat", CROLOOD_BOAT);
		registerItem("deep_trenches:dark_crolood_boat", DARK_CROLOOD_BOAT);
		registerItem("deep_trenches:dark_fuchsitra_boat", DARK_FUCHSITRA_BOAT);
		registerItem("deep_trenches:dark_red_elm_boat", DARK_RED_ELM_BOAT);
		registerItem("deep_trenches:dead_wart_tree_boat", DEAD_WART_TREE_BOAT);
		registerItem("deep_trenches:drigyus_boat", DRIGYUS_BOAT);
		registerItem("deep_trenches:ebony_boat", EBONY_BOAT);
		registerItem("deep_trenches:enderheart_boat", ENDERHEART_BOAT);
		registerItem("deep_trenches:flalm_boat", FLALM_BOAT);
		registerItem("deep_trenches:fruce_boat", FRUCE_BOAT);
		registerItem("deep_trenches:fuchsitra_boat", FUCHSITRA_BOAT);
		registerItem("deep_trenches:fugmos_boat", FUGMOS_BOAT);
		registerItem("deep_trenches:funeranite_boat", FUNERANITE_BOAT);
		registerItem("deep_trenches:ghoshroom_boat", GHOSHROOM_BOAT);
		registerItem("deep_trenches:giant_violet_boat", GIANT_VIOLET_BOAT);
		registerItem("deep_trenches:guaiacum_boat", GUAIACUM_BOAT);
		registerItem("deep_trenches:joshua_boat", JOSHUA_BOAT);
		registerItem("deep_trenches:klinkii_pine_boat", KLINKII_PINE_BOAT);
		registerItem("deep_trenches:melaleuca_boat", MELALEUCA_BOAT);
		registerItem("deep_trenches:murkantuan_boat", MURKANTUAN_BOAT);
		registerItem("deep_trenches:norfolk_pine_boat", NORFOLK_PINE_BOAT);
		registerItem("deep_trenches:obscrus_boat", OBSCRUS_BOAT);
		registerItem("deep_trenches:orhpris_boat", ORHPRIS_BOAT);
		registerItem("deep_trenches:peltogyne_boat", PELTOGYNE_BOAT);
		registerItem("deep_trenches:pin_cherry_boat", PIN_CHERRY_BOAT);
		registerItem("deep_trenches:plum_boat", PLUM_BOAT);
		registerItem("deep_trenches:purfunga_boat", PURFUNGA_BOAT);
		registerItem("deep_trenches:rark_boat", RARK_BOAT);
		registerItem("deep_trenches:red_elm_boat", RED_ELM_BOAT);
		registerItem("deep_trenches:rhadi_boat", RHADI_BOAT);
		registerItem("deep_trenches:sanguart_boat", SANGUART_BOAT);
		registerItem("deep_trenches:scarlet_thiorcen_boat", SCARLET_THIORCEN_BOAT);
		registerItem("deep_trenches:sequoia_boat", SEQUOIA_BOAT);
		registerItem("deep_trenches:sproom_boat", SPROOM_BOAT);
		registerItem("deep_trenches:stortreean_boat", STORTREEAN_BOAT);
		registerItem("deep_trenches:stroomean_boat", STROOMEAN_BOAT);
		registerItem("deep_trenches:sunrise_fungus_boat", SUNRISE_FUNGUS_BOAT);
		registerItem("deep_trenches:tark_boat", TARK_BOAT);
		registerItem("deep_trenches:teak_boat", TEAK_BOAT);
		registerItem("deep_trenches:thundercloud_plum_boat", THUNDERCLOUD_PLUM_BOAT);
		registerItem("deep_trenches:vynhert_boat", VYNHERT_BOAT);
		registerItem("deep_trenches:wart_tree_boat", WART_TREE_BOAT);
		registerItem("deep_trenches:wenge_boat", WENGE_BOAT);
		registerItem("deep_trenches:yew_boat", YEW_BOAT);

		/* STICK */
		registerItem("deep_trenches:almond_stick", ALMOND_STICK);
		registerItem("deep_trenches:anameata_stick", ANAMEATA_STICK);
		registerItem("deep_trenches:angels_trumpet_stick", ANGELS_TRUMPET_STICK);
		registerItem("deep_trenches:aquean_stick", AQUEAN_STICK);
		registerItem("deep_trenches:barshrookle_stick", BARSHROOKLE_STICK);
		registerItem("deep_trenches:black_birch_stick", BLACK_BIRCH_STICK);
		registerItem("deep_trenches:blue_mahoe_stick", BLUE_MAHOE_STICK);
		registerItem("deep_trenches:blue_spruce_stick", BLUE_SPRUCE_STICK);
		registerItem("deep_trenches:bottlebrush_stick", BOTTLEBRUSH_STICK);
		registerItem("deep_trenches:bromya_stick", BROMYA_STICK);
		registerItem("deep_trenches:bubbletree_stick", BUBBLETREE_STICK);
		registerItem("deep_trenches:calcearb_stick", CALCEARB_STICK);
		registerItem("deep_trenches:cherry_stick", CHERRY_STICK);
		registerItem("deep_trenches:chotorn_stick", CHOTORN_STICK);
		registerItem("deep_trenches:cook_pine_stick", COOK_PINE_STICK);
		registerItem("deep_trenches:crolood_stick", CROLOOD_STICK);
		registerItem("deep_trenches:dark_crolood_stick", DARK_CROLOOD_STICK);
		registerItem("deep_trenches:dark_fuchsitra_stick", DARK_FUCHSITRA_STICK);
		registerItem("deep_trenches:dark_red_elm_stick", DARK_RED_ELM_STICK);
		registerItem("deep_trenches:dead_wart_tree_stick", DEAD_WART_TREE_STICK);
		registerItem("deep_trenches:drigyus_stick", DRIGYUS_STICK);
		registerItem("deep_trenches:ebony_stick", EBONY_STICK);
		registerItem("deep_trenches:enderheart_stick", ENDERHEART_STICK);
		registerItem("deep_trenches:flalm_stick", FLALM_STICK);
		registerItem("deep_trenches:fruce_stick", FRUCE_STICK);
		registerItem("deep_trenches:fuchsitra_stick", FUCHSITRA_STICK);
		registerItem("deep_trenches:fugmos_stick", FUGMOS_STICK);
		registerItem("deep_trenches:funeranite_stick", FUNERANITE_STICK);
		registerItem("deep_trenches:ghoshroom_stick", GHOSHROOM_STICK);
		registerItem("deep_trenches:giant_violet_stick", GIANT_VIOLET_STICK);
		registerItem("deep_trenches:guaiacum_stick", GUAIACUM_STICK);
		registerItem("deep_trenches:joshua_stick", JOSHUA_STICK);
		registerItem("deep_trenches:klinkii_pine_stick", KLINKII_PINE_STICK);
		registerItem("deep_trenches:melaleuca_stick", MELALEUCA_STICK);
		registerItem("deep_trenches:gyldelion_stick", GYLDELION_STICK);
		registerItem("deep_trenches:murkantuan_stick", MURKANTUAN_STICK);
		registerItem("deep_trenches:norfolk_pine_stick", NORFOLK_PINE_STICK);
		registerItem("deep_trenches:obscrus_stick", OBSCRUS_STICK);
		registerItem("deep_trenches:orhpris_stick", ORHPRIS_STICK);
		registerItem("deep_trenches:peltogyne_stick", PELTOGYNE_STICK);
		registerItem("deep_trenches:pin_cherry_stick", PIN_CHERRY_STICK);
		registerItem("deep_trenches:plum_stick", PLUM_STICK);
		registerItem("deep_trenches:purfunga_stick", PURFUNGA_STICK);
		registerItem("deep_trenches:rark_stick", RARK_STICK);
		registerItem("deep_trenches:red_elm_stick", RED_ELM_STICK);
		registerItem("deep_trenches:rhadi_stick", RHADI_STICK);
		registerItem("deep_trenches:sanguart_stick", SANGUART_STICK);
		registerItem("deep_trenches:scarlet_thiorcen_stick", SCARLET_THIORCEN_STICK);
		registerItem("deep_trenches:sequoia_stick", SEQUOIA_STICK);
		registerItem("deep_trenches:sproom_stick", SPROOM_STICK);
		registerItem("deep_trenches:stortreean_stick", STORTREEAN_STICK);
		registerItem("deep_trenches:stroomean_stick", STROOMEAN_STICK);
		registerItem("deep_trenches:sunrise_fungus_stick", SUNRISE_FUNGUS_STICK);
		registerItem("deep_trenches:tark_stick", TARK_STICK);
		registerItem("deep_trenches:teak_stick", TEAK_STICK);
		registerItem("deep_trenches:thundercloud_plum_stick", THUNDERCLOUD_PLUM_STICK);
		registerItem("deep_trenches:vynhert_stick", VYNHERT_STICK);
		registerItem("deep_trenches:wart_tree_stick", WART_TREE_STICK);
		registerItem("deep_trenches:wenge_stick", WENGE_STICK);
		registerItem("deep_trenches:yew_stick", YEW_STICK);

		/* FOOD */
		registerItem("deep_trenches:barbeled_loosejaw", BARBELED_LOOSEJAW);
		registerItem("deep_trenches:betta", BETTA);
		registerItem("deep_trenches:black_loosejaw", BLACK_LOOSEJAW);
		registerItem("deep_trenches:deep_lake_betta", DEEP_LAKE_BETTA);
		registerItem("deep_trenches:giant_hatchetfish", GIANT_HATCHETFISH);
		registerItem("deep_trenches:light_loosejaw", LIGHT_LOOSEJAW);
		registerItem("deep_trenches:smalltooth_dragonfish", SMALLTOOTH_DRAGONFISH);

		/* COOKED FOOD */
		registerItem("deep_trenches:cooked_giant_hatchetfish", COOKED_GIANT_HATCHETFISH);

		/* GOO's */
		registerItem("deep_trenches:black_bioluminescent_goo", BLACK_BIOLUMINESCENT_GOO);
		registerItem("deep_trenches:brown_bioluminescent_goo", BROWN_BIOLUMINESCENT_GOO);
		registerItem("deep_trenches:cyan_bioluminescent_goo", CYAN_BIOLUMINESCENT_GOO);
		registerItem("deep_trenches:green_bioluminescent_goo", GREEN_BIOLUMINESCENT_GOO);
		registerItem("deep_trenches:light_blue_bioluminescent_goo", LIGHT_BLUE_BIOLUMINESCENT_GOO);
		registerItem("deep_trenches:lime_bioluminescent_goo", LIME_BIOLUMINESCENT_GOO);
		registerItem("deep_trenches:magenta_bioluminescent_goo", MAGENTA_BIOLUMINESCENT_GOO);
		registerItem("deep_trenches:orange_bioluminescent_goo", ORANGE_BIOLUMINESCENT_GOO);
		registerItem("deep_trenches:purple_bioluminescent_goo", PURPLE_BIOLUMINESCENT_GOO);
		registerItem("deep_trenches:red_bioluminescent_goo", RED_BIOLUMINESCENT_GOO);
		registerItem("deep_trenches:white_bioluminescent_goo", WHITE_BIOLUMINESCENT_GOO);
		registerItem("deep_trenches:yellow_bioluminescent_goo", YELLOW_BIOLUMINESCENT_GOO);

		/* WEAPONS */
		registerItem("deep_trenches:adaigger", ADAIGGER);
		registerItem("deep_trenches:boron_trookent", BORON_TROOKENT);
		registerItem("deep_trenches:ruby_distabber", RUBY_DISTABBER);
		registerItem("deep_trenches:morganite_saber", MORGANITE_SABER);
		registerItem("deep_trenches:sapphire_prismace", SAPPHIRE_PRISMACE);

		registerItem("deep_trenches:boron_sword", BORON_SWORD);
		registerItem("deep_trenches:chalcedony_sword", CHALCEDONY_SWORD);
		registerItem("deep_trenches:enron_sword", ENRON_SWORD);
		registerItem("deep_trenches:enstatite_sword", ENSTATITE_SWORD);
		registerItem("deep_trenches:kralctium_sword", KRALCTIUM_SWORD);
		registerItem("deep_trenches:sapphire_sword", SAPPHIRE_SWORD);
		registerItem("deep_trenches:sphene_sword", SPHENE_SWORD);
		registerItem("deep_trenches:spinel_sword", SPINEL_SWORD);
		registerItem("deep_trenches:stroxite_sword", STROXITE_SWORD);
		registerItem("deep_trenches:tanzanite_sword", TANZANITE_SWORD);
		registerItem("deep_trenches:topaz_sword", TOPAZ_SWORD);
		registerItem("deep_trenches:almond_sword", ALMOND_SWORD);
		registerItem("deep_trenches:anameata_sword", ANAMEATA_SWORD);
		registerItem("deep_trenches:angels_trumpet_sword", ANGELS_TRUMPET_SWORD);
		registerItem("deep_trenches:aquean_sword", AQUEAN_SWORD);
		registerItem("deep_trenches:barshrookle_sword", BARSHROOKLE_SWORD);
		registerItem("deep_trenches:black_birch_sword", BLACK_BIRCH_SWORD);
		registerItem("deep_trenches:blue_mahoe_sword", BLUE_MAHOE_SWORD);
		registerItem("deep_trenches:blue_spruce_sword", BLUE_SPRUCE_SWORD);
		registerItem("deep_trenches:bottlebrush_sword", BOTTLEBRUSH_SWORD);
		registerItem("deep_trenches:bromya_sword", BROMYA_SWORD);
		registerItem("deep_trenches:bubbletree_sword", BUBBLETREE_SWORD);
		registerItem("deep_trenches:calcearb_sword", CALCEARB_SWORD);
		registerItem("deep_trenches:cherry_sword", CHERRY_SWORD);
		registerItem("deep_trenches:chotorn_sword", CHOTORN_SWORD);
		registerItem("deep_trenches:cook_pine_sword", COOK_PINE_SWORD);
		registerItem("deep_trenches:crolood_sword", CROLOOD_SWORD);
		registerItem("deep_trenches:dark_crolood_sword", DARK_CROLOOD_SWORD);
		registerItem("deep_trenches:dark_fuchsitra_sword", DARK_FUCHSITRA_SWORD);
		registerItem("deep_trenches:dark_red_elm_sword", DARK_RED_ELM_SWORD);
		registerItem("deep_trenches:dead_wart_tree_sword", DEAD_WART_TREE_SWORD);
		registerItem("deep_trenches:drigyus_sword", DRIGYUS_SWORD);
		registerItem("deep_trenches:ebony_sword", EBONY_SWORD);
		registerItem("deep_trenches:enderheart_sword", ENDERHEART_SWORD);
		registerItem("deep_trenches:flalm_sword", FLALM_SWORD);
		registerItem("deep_trenches:fruce_sword", FRUCE_SWORD);
		registerItem("deep_trenches:fuchsitra_sword", FUCHSITRA_SWORD);
		registerItem("deep_trenches:fugmos_sword", FUGMOS_SWORD);
		registerItem("deep_trenches:funeranite_sword", FUNERANITE_SWORD);
		registerItem("deep_trenches:ghoshroom_sword", GHOSHROOM_SWORD);
		registerItem("deep_trenches:giant_violet_sword", GIANT_VIOLET_SWORD);
		registerItem("deep_trenches:guaiacum_sword", GUAIACUM_SWORD);
		registerItem("deep_trenches:joshua_sword", JOSHUA_SWORD);
		registerItem("deep_trenches:klinkii_pine_sword", KLINKII_PINE_SWORD);
		registerItem("deep_trenches:melaleuca_sword", MELALEUCA_SWORD);
		registerItem("deep_trenches:murkantuan_sword", MURKANTUAN_SWORD);
		registerItem("deep_trenches:norfolk_pine_sword", NORFOLK_PINE_SWORD);
		registerItem("deep_trenches:obscrus_sword", OBSCRUS_SWORD);
		registerItem("deep_trenches:orhpris_sword", ORHPRIS_SWORD);
		registerItem("deep_trenches:peltogyne_sword", PELTOGYNE_SWORD);
		registerItem("deep_trenches:pin_cherry_sword", PIN_CHERRY_SWORD);
		registerItem("deep_trenches:plum_sword", PLUM_SWORD);
		registerItem("deep_trenches:purfunga_sword", PURFUNGA_SWORD);
		registerItem("deep_trenches:rark_sword", RARK_SWORD);
		registerItem("deep_trenches:red_elm_sword", RED_ELM_SWORD);
		registerItem("deep_trenches:rhadi_sword", RHADI_SWORD);
		registerItem("deep_trenches:sanguart_sword", SANGUART_SWORD);
		registerItem("deep_trenches:scarlet_thiorcen_sword", SCARLET_THIORCEN_SWORD);
		registerItem("deep_trenches:sequoia_sword", SEQUOIA_SWORD);
		registerItem("deep_trenches:sproom_sword", SPROOM_SWORD);
		registerItem("deep_trenches:stortreean_sword", STORTREEAN_SWORD);
		registerItem("deep_trenches:stroomean_sword", STROOMEAN_SWORD);
		registerItem("deep_trenches:sunrise_fungus_sword", SUNRISE_FUNGUS_SWORD);
		registerItem("deep_trenches:tark_sword", TARK_SWORD);
		registerItem("deep_trenches:teak_sword", TEAK_SWORD);
		registerItem("deep_trenches:thundercloud_plum_sword", THUNDERCLOUD_PLUM_SWORD);
		registerItem("deep_trenches:vynhert_sword", VYNHERT_SWORD);
		registerItem("deep_trenches:wart_tree_sword", WART_TREE_SWORD);
		registerItem("deep_trenches:wenge_sword", WENGE_SWORD);
		registerItem("deep_trenches:yew_sword", YEW_SWORD);

		registerItem("deep_trenches:aquamarine_scythe", AQUAMARINE_SCYTHE);
		registerItem("deep_trenches:boron_scythe", BORON_SCYTHE);
		registerItem("deep_trenches:diopside_scythe", DIOPSIDE_SCYTHE);
		registerItem("deep_trenches:gyldelion_scythe", GYLDELION_SCYTHE);
		registerItem("deep_trenches:netherite_scythe", NETHERITE_SCYTHE);
		registerItem("deep_trenches:ruby_disripper", RUBY_DISRAPPER);
		registerItem("deep_trenches:sapphire_scythe", SAPPHIRE_SCYTHE);
		registerItem("deep_trenches:spinel_scythe", SPINEL_SCYTHE);
		registerItem("deep_trenches:tanzanite_scythe", TANZANITE_SCYTHE);
		registerItem("deep_trenches:topaz_scythe", TOPAZ_SCYTHE);
		registerItem("deep_trenches:void_crittered_diopside_scythe", VOID_CRITTERED_DIOPSIDE_SCYTHE);

		registerItem("deep_trenches:aquamarine_staff", AQUAMARINE_STAFF);
		registerItem("deep_trenches:diopside_staff", DIOPSIDE_STAFF);
		registerItem("deep_trenches:spinel_staff", SPINEL_STAFF);
		registerItem("deep_trenches:tanzanite_staff", TANZANITE_STAFF);
		registerItem("deep_trenches:topaz_staff", TOPAZ_STAFF);
		registerItem("deep_trenches:void_crittered_diopside_staff", VOID_CRITTERED_DIOPSIDE_STAFF);

		/* METALLIC TOOLS */
		registerItem("deep_trenches:aquamarine_axe", AQUAMARINE_AXE);
		registerItem("deep_trenches:aquamarine_hoe", AQUAMARINE_HOE);
		registerItem("deep_trenches:aquamarine_pickaxe", AQUAMARINE_PICKAXE);
		registerItem("deep_trenches:aquamarine_shovel", AQUAMARINE_SHOVEL);

		registerItem("deep_trenches:boron_axe", BORON_AXE);
		registerItem("deep_trenches:boron_hoe", BORON_HOE);
		registerItem("deep_trenches:boron_pickaxe", BORON_PICKAXE);
		registerItem("deep_trenches:boron_shovel", BORON_SHOVEL);

		registerItem("deep_trenches:chalcedony_axe", CHALCEDONY_AXE);
		registerItem("deep_trenches:chalcedony_hoe", CHALCEDONY_HOE);
		registerItem("deep_trenches:chalcedony_pickaxe", CHALCEDONY_PICKAXE);
		registerItem("deep_trenches:chalcedony_shovel", CHALCEDONY_SHOVEL);

		registerItem("deep_trenches:clinohumite_axe", CLINOHUMITE_AXE);
		registerItem("deep_trenches:clinohumite_hoe", CLINOHUMITE_HOE);
		registerItem("deep_trenches:clinohumite_pickaxe", CLINOHUMITE_PICKAXE);
		registerItem("deep_trenches:clinohumite_shovel", CLINOHUMITE_SHOVEL);

		registerItem("deep_trenches:diopside_axe", DIOPSIDE_AXE);
		registerItem("deep_trenches:diopside_hoe", DIOPSIDE_HOE);
		registerItem("deep_trenches:diopside_pickaxe", DIOPSIDE_PICKAXE);
		registerItem("deep_trenches:diopside_shovel", DIOPSIDE_SHOVEL);

		registerItem("deep_trenches:enron_axe", ENRON_AXE);
		registerItem("deep_trenches:enron_hoe", ENRON_HOE);
		registerItem("deep_trenches:enron_pickaxe", ENRON_PICKAXE);
		registerItem("deep_trenches:enron_shovel", ENRON_SHOVEL);

		registerItem("deep_trenches:enstatite_axe", ENSTATITE_AXE);
		registerItem("deep_trenches:enstatite_hoe", ENSTATITE_HOE);
		registerItem("deep_trenches:enstatite_pickaxe", ENSTATITE_PICKAXE);
		registerItem("deep_trenches:enstatite_shovel", ENSTATITE_SHOVEL);

		registerItem("deep_trenches:gyldelion_axe", GYLDELION_AXE);
		registerItem("deep_trenches:gyldelion_hoe", GYLDELION_HOE);
		registerItem("deep_trenches:gyldelion_pickaxe", GYLDELION_PICKAXE);
		registerItem("deep_trenches:gyldelion_shovel", GYLDELION_SHOVEL);

		registerItem("deep_trenches:kralctium_axe", KRALCTIUM_AXE);
		registerItem("deep_trenches:kralctium_hoe", KRALCTIUM_HOE);
		registerItem("deep_trenches:kralctium_pickaxe", KRALCTIUM_PICKAXE);
		registerItem("deep_trenches:kralctium_shovel", KRALCTIUM_SHOVEL);

		registerItem("deep_trenches:morganite_axe", MORGANITE_AXE);
		registerItem("deep_trenches:morganite_hoe", MORGANITE_HOE);
		registerItem("deep_trenches:morganite_pickaxe", MORGANITE_PICKAXE);
		registerItem("deep_trenches:morganite_shovel", MORGANITE_SHOVEL);

		registerItem("deep_trenches:ruby_discarver", RUBY_DISCARVER);
		registerItem("deep_trenches:ruby_disdigger", RUBY_DISDIGGER);
		registerItem("deep_trenches:ruby_dislogger", RUBY_DISLOGGER);
		registerItem("deep_trenches:ruby_distarvest", RUBY_DISTARVEST);

		registerItem("deep_trenches:sapphire_axe", SAPPHIRE_AXE);
		registerItem("deep_trenches:sapphire_hoe", SAPPHIRE_HOE);
		registerItem("deep_trenches:sapphire_pickaxe", SAPPHIRE_PICKAXE);
		registerItem("deep_trenches:sapphire_shovel", SAPPHIRE_SHOVEL);

		registerItem("deep_trenches:silver_axe", SILVER_AXE);
		registerItem("deep_trenches:silver_hoe", SILVER_HOE);
		registerItem("deep_trenches:silver_pickaxe", SILVER_PICKAXE);
		registerItem("deep_trenches:silver_shovel", SILVER_SHOVEL);

		registerItem("deep_trenches:sphene_axe", SPHENE_AXE);
		registerItem("deep_trenches:sphene_hoe", SPHENE_HOE);
		registerItem("deep_trenches:sphene_pickaxe", SPHENE_PICKAXE);
		registerItem("deep_trenches:sphene_shovel", SPHENE_SHOVEL);

		registerItem("deep_trenches:spinel_axe", SPINEL_AXE);
		registerItem("deep_trenches:spinel_hoe", SPINEL_HOE);
		registerItem("deep_trenches:spinel_pickaxe", SPINEL_PICKAXE);
		registerItem("deep_trenches:spinel_shovel", SPINEL_SHOVEL);

		registerItem("deep_trenches:stroxite_axe", STROXITE_AXE);
		registerItem("deep_trenches:stroxite_hoe", STROXITE_HOE);
		registerItem("deep_trenches:stroxite_pickaxe", STROXITE_PICKAXE);
		registerItem("deep_trenches:stroxite_shovel", STROXITE_SHOVEL);

		registerItem("deep_trenches:tanzanite_axe", TANZANITE_AXE);
		registerItem("deep_trenches:tanzanite_hoe", TANZANITE_HOE);
		registerItem("deep_trenches:tanzanite_pickaxe", TANZANITE_PICKAXE);
		registerItem("deep_trenches:tanzanite_shovel", TANZANITE_SHOVEL);

		registerItem("deep_trenches:topaz_axe", TOPAZ_AXE);
		registerItem("deep_trenches:topaz_hoe", TOPAZ_HOE);
		registerItem("deep_trenches:topaz_pickaxe", TOPAZ_PICKAXE);
		registerItem("deep_trenches:topaz_shovel", TOPAZ_SHOVEL);

		registerItem("deep_trenches:void_crittered_diopside_axe", VOID_CRITTERED_DIOPSIDE_AXE);
		registerItem("deep_trenches:void_crittered_diopside_hoe", VOID_CRITTERED_DIOPSIDE_HOE);
		registerItem("deep_trenches:void_crittered_diopside_pickaxe", VOID_CRITTERED_DIOPSIDE_PICKAXE);
		registerItem("deep_trenches:void_crittered_diopside_shovel", VOID_CRITTERED_DIOPSIDE_SHOVEL);

		/* WOODEN TOOLS */
		registerItem("deep_trenches:almond_axe", ALMOND_AXE);
		registerItem("deep_trenches:almond_hoe", ALMOND_HOE);
		registerItem("deep_trenches:almond_pickaxe", ALMOND_PICKAXE);
		registerItem("deep_trenches:almond_shovel", ALMOND_SHOVEL);

		registerItem("deep_trenches:anameata_axe", ANAMEATA_AXE);
		registerItem("deep_trenches:anameata_hoe", ANAMEATA_HOE);
		registerItem("deep_trenches:anameata_pickaxe", ANAMEATA_PICKAXE);
		registerItem("deep_trenches:anameata_shovel", ANAMEATA_SHOVEL);

		registerItem("deep_trenches:angels_trumpet_axe", ANGELS_TRUMPET_AXE);
		registerItem("deep_trenches:angels_trumpet_hoe", ANGELS_TRUMPET_HOE);
		registerItem("deep_trenches:angels_trumpet_pickaxe", ANGELS_TRUMPET_PICKAXE);
		registerItem("deep_trenches:angels_trumpet_shovel", ANGELS_TRUMPET_SHOVEL);

		registerItem("deep_trenches:aquean_axe", AQUEAN_AXE);
		registerItem("deep_trenches:aquean_hoe", AQUEAN_HOE);
		registerItem("deep_trenches:aquean_pickaxe", AQUEAN_PICKAXE);
		registerItem("deep_trenches:aquean_shovel", AQUEAN_SHOVEL);

		registerItem("deep_trenches:barshrookle_axe", BARSHROOKLE_AXE);
		registerItem("deep_trenches:barshrookle_hoe", BARSHROOKLE_HOE);
		registerItem("deep_trenches:barshrookle_pickaxe", BARSHROOKLE_PICKAXE);
		registerItem("deep_trenches:barshrookle_shovel", BARSHROOKLE_SHOVEL);

		registerItem("deep_trenches:black_birch_axe", BLACK_BIRCH_AXE);
		registerItem("deep_trenches:black_birch_hoe", BLACK_BIRCH_HOE);
		registerItem("deep_trenches:black_birch_pickaxe", BLACK_BIRCH_PICKAXE);
		registerItem("deep_trenches:black_birch_shovel", BLACK_BIRCH_SHOVEL);

		registerItem("deep_trenches:blue_mahoe_axe", BLUE_MAHOE_AXE);
		registerItem("deep_trenches:blue_mahoe_hoe", BLUE_MAHOE_HOE);
		registerItem("deep_trenches:blue_mahoe_pickaxe", BLUE_MAHOE_PICKAXE);
		registerItem("deep_trenches:blue_mahoe_shovel", BLUE_MAHOE_SHOVEL);

		registerItem("deep_trenches:blue_spruce_axe", BLUE_SPRUCE_AXE);
		registerItem("deep_trenches:blue_spruce_hoe", BLUE_SPRUCE_HOE);
		registerItem("deep_trenches:blue_spruce_pickaxe", BLUE_SPRUCE_PICKAXE);
		registerItem("deep_trenches:blue_spruce_shovel", BLUE_SPRUCE_SHOVEL);

		registerItem("deep_trenches:bottlebrush_axe", BOTTLEBRUSH_AXE);
		registerItem("deep_trenches:bottlebrush_hoe", BOTTLEBRUSH_HOE);
		registerItem("deep_trenches:bottlebrush_pickaxe", BOTTLEBRUSH_PICKAXE);
		registerItem("deep_trenches:bottlebrush_shovel", BOTTLEBRUSH_SHOVEL);

		registerItem("deep_trenches:bromya_axe", BROMYA_AXE);
		registerItem("deep_trenches:bromya_hoe", BROMYA_HOE);
		registerItem("deep_trenches:bromya_pickaxe", BROMYA_PICKAXE);
		registerItem("deep_trenches:bromya_shovel", BROMYA_SHOVEL);

		registerItem("deep_trenches:bubbletree_axe", BUBBLETREE_AXE);
		registerItem("deep_trenches:bubbletree_hoe", BUBBLETREE_HOE);
		registerItem("deep_trenches:bubbletree_pickaxe", BUBBLETREE_PICKAXE);
		registerItem("deep_trenches:bubbletree_shovel", BUBBLETREE_SHOVEL);

		registerItem("deep_trenches:calcearb_axe", CALCEARB_AXE);
		registerItem("deep_trenches:calcearb_hoe", CALCEARB_HOE);
		registerItem("deep_trenches:calcearb_pickaxe", CALCEARB_PICKAXE);
		registerItem("deep_trenches:calcearb_shovel", CALCEARB_SHOVEL);

		registerItem("deep_trenches:cherry_axe", CHERRY_AXE);
		registerItem("deep_trenches:cherry_hoe", CHERRY_HOE);
		registerItem("deep_trenches:cherry_pickaxe", CHERRY_PICKAXE);
		registerItem("deep_trenches:cherry_shovel", CHERRY_SHOVEL);

		registerItem("deep_trenches:chotorn_axe", CHOTORN_AXE);
		registerItem("deep_trenches:chotorn_hoe", CHOTORN_HOE);
		registerItem("deep_trenches:chotorn_pickaxe", CHOTORN_PICKAXE);
		registerItem("deep_trenches:chotorn_shovel", CHOTORN_SHOVEL);

		registerItem("deep_trenches:cook_pine_axe", COOK_PINE_AXE);
		registerItem("deep_trenches:cook_pine_hoe", COOK_PINE_HOE);
		registerItem("deep_trenches:cook_pine_pickaxe", COOK_PINE_PICKAXE);
		registerItem("deep_trenches:cook_pine_shovel", COOK_PINE_SHOVEL);

		registerItem("deep_trenches:crolood_axe", CROLOOD_AXE);
		registerItem("deep_trenches:crolood_hoe", CROLOOD_HOE);
		registerItem("deep_trenches:crolood_pickaxe", CROLOOD_PICKAXE);
		registerItem("deep_trenches:crolood_shovel", CROLOOD_SHOVEL);

		registerItem("deep_trenches:dark_crolood_axe", DARK_CROLOOD_AXE);
		registerItem("deep_trenches:dark_crolood_hoe", DARK_CROLOOD_HOE);
		registerItem("deep_trenches:dark_crolood_pickaxe", DARK_CROLOOD_PICKAXE);
		registerItem("deep_trenches:dark_crolood_shovel", DARK_CROLOOD_SHOVEL);

		registerItem("deep_trenches:dark_fuchsitra_axe", DARK_FUCHSITRA_AXE);
		registerItem("deep_trenches:dark_fuchsitra_hoe", DARK_FUCHSITRA_HOE);
		registerItem("deep_trenches:dark_fuchsitra_pickaxe", DARK_FUCHSITRA_PICKAXE);
		registerItem("deep_trenches:dark_fuchsitra_shovel", DARK_FUCHSITRA_SHOVEL);

		registerItem("deep_trenches:dark_red_elm_axe", DARK_RED_ELM_AXE);
		registerItem("deep_trenches:dark_red_elm_hoe", DARK_RED_ELM_HOE);
		registerItem("deep_trenches:dark_red_elm_pickaxe", DARK_RED_ELM_PICKAXE);
		registerItem("deep_trenches:dark_red_elm_shovel", DARK_RED_ELM_SHOVEL);

		registerItem("deep_trenches:dead_wart_tree_axe", DEAD_WART_TREE_AXE);
		registerItem("deep_trenches:dead_wart_tree_hoe", DEAD_WART_TREE_HOE);
		registerItem("deep_trenches:dead_wart_tree_pickaxe", DEAD_WART_TREE_PICKAXE);
		registerItem("deep_trenches:dead_wart_tree_shovel", DEAD_WART_TREE_SHOVEL);

		registerItem("deep_trenches:drigyus_axe", DRIGYUS_AXE);
		registerItem("deep_trenches:drigyus_hoe", DRIGYUS_HOE);
		registerItem("deep_trenches:drigyus_pickaxe", DRIGYUS_PICKAXE);
		registerItem("deep_trenches:drigyus_shovel", DRIGYUS_SHOVEL);

		registerItem("deep_trenches:ebony_axe", EBONY_AXE);
		registerItem("deep_trenches:ebony_hoe", EBONY_HOE);
		registerItem("deep_trenches:ebony_pickaxe", EBONY_PICKAXE);
		registerItem("deep_trenches:ebony_shovel", EBONY_SHOVEL);

		registerItem("deep_trenches:enderheart_axe", ENDERHEART_AXE);
		registerItem("deep_trenches:enderheart_hoe", ENDERHEART_HOE);
		registerItem("deep_trenches:enderheart_pickaxe", ENDERHEART_PICKAXE);
		registerItem("deep_trenches:enderheart_shovel", ENDERHEART_SHOVEL);

		registerItem("deep_trenches:flalm_axe", FLALM_AXE);
		registerItem("deep_trenches:flalm_hoe", FLALM_HOE);
		registerItem("deep_trenches:flalm_pickaxe", FLALM_PICKAXE);
		registerItem("deep_trenches:flalm_shovel", FLALM_SHOVEL);

		registerItem("deep_trenches:fruce_axe", FRUCE_AXE);
		registerItem("deep_trenches:fruce_hoe", FRUCE_HOE);
		registerItem("deep_trenches:fruce_pickaxe", FRUCE_PICKAXE);
		registerItem("deep_trenches:fruce_shovel", FRUCE_SHOVEL);

		registerItem("deep_trenches:fuchsitra_axe", FUCHSITRA_AXE);
		registerItem("deep_trenches:fuchsitra_hoe", FUCHSITRA_HOE);
		registerItem("deep_trenches:fuchsitra_pickaxe", FUCHSITRA_PICKAXE);
		registerItem("deep_trenches:fuchsitra_shovel", FUCHSITRA_SHOVEL);

		registerItem("deep_trenches:fugmos_axe", FUGMOS_AXE);
		registerItem("deep_trenches:fugmos_hoe", FUGMOS_HOE);
		registerItem("deep_trenches:fugmos_pickaxe", FUGMOS_PICKAXE);
		registerItem("deep_trenches:fugmos_shovel", FUGMOS_SHOVEL);

		registerItem("deep_trenches:funeranite_axe", FUNERANITE_AXE);
		registerItem("deep_trenches:funeranite_hoe", FUNERANITE_HOE);
		registerItem("deep_trenches:funeranite_pickaxe", FUNERANITE_PICKAXE);
		registerItem("deep_trenches:funeranite_shovel", FUNERANITE_SHOVEL);

		registerItem("deep_trenches:ghoshroom_axe", GHOSHROOM_AXE);
		registerItem("deep_trenches:ghoshroom_hoe", GHOSHROOM_HOE);
		registerItem("deep_trenches:ghoshroom_pickaxe", GHOSHROOM_PICKAXE);
		registerItem("deep_trenches:ghoshroom_shovel", GHOSHROOM_SHOVEL);

		registerItem("deep_trenches:giant_violet_axe", GIANT_VIOLET_AXE);
		registerItem("deep_trenches:giant_violet_hoe", GIANT_VIOLET_HOE);
		registerItem("deep_trenches:giant_violet_pickaxe", GIANT_VIOLET_PICKAXE);
		registerItem("deep_trenches:giant_violet_shovel", GIANT_VIOLET_SHOVEL);

		registerItem("deep_trenches:guaiacum_axe", GUAIACUM_AXE);
		registerItem("deep_trenches:guaiacum_hoe", GUAIACUM_HOE);
		registerItem("deep_trenches:guaiacum_pickaxe", GUAIACUM_PICKAXE);
		registerItem("deep_trenches:guaiacum_shovel", GUAIACUM_SHOVEL);

		registerItem("deep_trenches:joshua_axe", JOSHUA_AXE);
		registerItem("deep_trenches:joshua_hoe", JOSHUA_HOE);
		registerItem("deep_trenches:joshua_pickaxe", JOSHUA_PICKAXE);
		registerItem("deep_trenches:joshua_shovel", JOSHUA_SHOVEL);

		registerItem("deep_trenches:klinkii_pine_axe", KLINKII_PINE_AXE);
		registerItem("deep_trenches:klinkii_pine_hoe", KLINKII_PINE_HOE);
		registerItem("deep_trenches:klinkii_pine_pickaxe", KLINKII_PINE_PICKAXE);
		registerItem("deep_trenches:klinkii_pine_shovel", KLINKII_PINE_SHOVEL);

		registerItem("deep_trenches:melaleuca_axe", MELALEUCA_AXE);
		registerItem("deep_trenches:melaleuca_hoe", MELALEUCA_HOE);
		registerItem("deep_trenches:melaleuca_pickaxe", MELALEUCA_PICKAXE);
		registerItem("deep_trenches:melaleuca_shovel", MELALEUCA_SHOVEL);

		registerItem("deep_trenches:murkantuan_axe", MURKANTUAN_AXE);
		registerItem("deep_trenches:murkantuan_hoe", MURKANTUAN_HOE);
		registerItem("deep_trenches:murkantuan_pickaxe", MURKANTUAN_PICKAXE);
		registerItem("deep_trenches:murkantuan_shovel", MURKANTUAN_SHOVEL);

		registerItem("deep_trenches:norfolk_pine_axe", NORFOLK_PINE_AXE);
		registerItem("deep_trenches:norfolk_pine_hoe", NORFOLK_PINE_HOE);
		registerItem("deep_trenches:norfolk_pine_pickaxe", NORFOLK_PINE_PICKAXE);
		registerItem("deep_trenches:norfolk_pine_shovel", NORFOLK_PINE_SHOVEL);

		registerItem("deep_trenches:obscrus_axe", OBSCRUS_AXE);
		registerItem("deep_trenches:obscrus_hoe", OBSCRUS_HOE);
		registerItem("deep_trenches:obscrus_pickaxe", OBSCRUS_PICKAXE);
		registerItem("deep_trenches:obscrus_shovel", OBSCRUS_SHOVEL);

		registerItem("deep_trenches:orhpris_axe", ORHPRIS_AXE);
		registerItem("deep_trenches:orhpris_hoe", ORHPRIS_HOE);
		registerItem("deep_trenches:orhpris_pickaxe", ORHPRIS_PICKAXE);
		registerItem("deep_trenches:orhpris_shovel", ORHPRIS_SHOVEL);

		registerItem("deep_trenches:peltogyne_axe", PELTOGYNE_AXE);
		registerItem("deep_trenches:peltogyne_hoe", PELTOGYNE_HOE);
		registerItem("deep_trenches:peltogyne_pickaxe", PELTOGYNE_PICKAXE);
		registerItem("deep_trenches:peltogyne_shovel", PELTOGYNE_SHOVEL);

		registerItem("deep_trenches:pin_cherry_axe", PIN_CHERRY_AXE);
		registerItem("deep_trenches:pin_cherry_hoe", PIN_CHERRY_HOE);
		registerItem("deep_trenches:pin_cherry_pickaxe", PIN_CHERRY_PICKAXE);
		registerItem("deep_trenches:pin_cherry_shovel", PIN_CHERRY_SHOVEL);

		registerItem("deep_trenches:plum_axe", PLUM_AXE);
		registerItem("deep_trenches:plum_hoe", PLUM_HOE);
		registerItem("deep_trenches:plum_pickaxe", PLUM_PICKAXE);
		registerItem("deep_trenches:plum_shovel", PLUM_SHOVEL);

		registerItem("deep_trenches:purfunga_axe", PURFUNGA_AXE);
		registerItem("deep_trenches:purfunga_hoe", PURFUNGA_HOE);
		registerItem("deep_trenches:purfunga_pickaxe", PURFUNGA_PICKAXE);
		registerItem("deep_trenches:purfunga_shovel", PURFUNGA_SHOVEL);

		registerItem("deep_trenches:rark_axe", RARK_AXE);
		registerItem("deep_trenches:rark_hoe", RARK_HOE);
		registerItem("deep_trenches:rark_pickaxe", RARK_PICKAXE);
		registerItem("deep_trenches:rark_shovel", RARK_SHOVEL);

		registerItem("deep_trenches:red_elm_axe", RED_ELM_AXE);
		registerItem("deep_trenches:red_elm_hoe", RED_ELM_HOE);
		registerItem("deep_trenches:red_elm_pickaxe", RED_ELM_PICKAXE);
		registerItem("deep_trenches:red_elm_shovel", RED_ELM_SHOVEL);

		registerItem("deep_trenches:rhadi_axe", RHADI_AXE);
		registerItem("deep_trenches:rhadi_hoe", RHADI_HOE);
		registerItem("deep_trenches:rhadi_pickaxe", RHADI_PICKAXE);
		registerItem("deep_trenches:rhadi_shovel", RHADI_SHOVEL);

		registerItem("deep_trenches:sanguart_axe", SANGUART_AXE);
		registerItem("deep_trenches:sanguart_hoe", SANGUART_HOE);
		registerItem("deep_trenches:sanguart_pickaxe", SANGUART_PICKAXE);
		registerItem("deep_trenches:sanguart_shovel", SANGUART_SHOVEL);

		registerItem("deep_trenches:scarlet_thiorcen_axe", SCARLET_THIORCEN_AXE);
		registerItem("deep_trenches:scarlet_thiorcen_hoe", SCARLET_THIORCEN_HOE);
		registerItem("deep_trenches:scarlet_thiorcen_pickaxe", SCARLET_THIORCEN_PICKAXE);
		registerItem("deep_trenches:scarlet_thiorcen_shovel", SCARLET_THIORCEN_SHOVEL);

		registerItem("deep_trenches:sequoia_axe", SEQUOIA_AXE);
		registerItem("deep_trenches:sequoia_hoe", SEQUOIA_HOE);
		registerItem("deep_trenches:sequoia_pickaxe", SEQUOIA_PICKAXE);
		registerItem("deep_trenches:sequoia_shovel", SEQUOIA_SHOVEL);

		registerItem("deep_trenches:sproom_axe", SPROOM_AXE);
		registerItem("deep_trenches:sproom_hoe", SPROOM_HOE);
		registerItem("deep_trenches:sproom_pickaxe", SPROOM_PICKAXE);
		registerItem("deep_trenches:sproom_shovel", SPROOM_SHOVEL);

		registerItem("deep_trenches:stortreean_axe", STORTREEAN_AXE);
		registerItem("deep_trenches:stortreean_hoe", STORTREEAN_HOE);
		registerItem("deep_trenches:stortreean_pickaxe", STORTREEAN_PICKAXE);
		registerItem("deep_trenches:stortreean_shovel", STORTREEAN_SHOVEL);

		registerItem("deep_trenches:stroomean_axe", STROOMEAN_AXE);
		registerItem("deep_trenches:stroomean_hoe", STROOMEAN_HOE);
		registerItem("deep_trenches:stroomean_pickaxe", STROOMEAN_PICKAXE);
		registerItem("deep_trenches:stroomean_shovel", STROOMEAN_SHOVEL);

		registerItem("deep_trenches:sunrise_fungus_axe", SUNRISE_FUNGUS_AXE);
		registerItem("deep_trenches:sunrise_fungus_hoe", SUNRISE_FUNGUS_HOE);
		registerItem("deep_trenches:sunrise_fungus_pickaxe", SUNRISE_FUNGUS_PICKAXE);
		registerItem("deep_trenches:sunrise_fungus_shovel", SUNRISE_FUNGUS_SHOVEL);

		registerItem("deep_trenches:tark_axe", TARK_AXE);
		registerItem("deep_trenches:tark_hoe", TARK_HOE);
		registerItem("deep_trenches:tark_pickaxe", TARK_PICKAXE);
		registerItem("deep_trenches:tark_shovel", TARK_SHOVEL);

		registerItem("deep_trenches:teak_axe", TEAK_AXE);
		registerItem("deep_trenches:teak_hoe", TEAK_HOE);
		registerItem("deep_trenches:teak_pickaxe", TEAK_PICKAXE);
		registerItem("deep_trenches:teak_shovel", TEAK_SHOVEL);

		registerItem("deep_trenches:thundercloud_plum_axe", THUNDERCLOUD_PLUM_AXE);
		registerItem("deep_trenches:thundercloud_plum_hoe", THUNDERCLOUD_PLUM_HOE);
		registerItem("deep_trenches:thundercloud_plum_pickaxe", THUNDERCLOUD_PLUM_PICKAXE);
		registerItem("deep_trenches:thundercloud_plum_shovel", THUNDERCLOUD_PLUM_SHOVEL);

		registerItem("deep_trenches:vynhert_axe", VYNHERT_AXE);
		registerItem("deep_trenches:vynhert_hoe", VYNHERT_HOE);
		registerItem("deep_trenches:vynhert_pickaxe", VYNHERT_PICKAXE);
		registerItem("deep_trenches:vynhert_shovel", VYNHERT_SHOVEL);

		registerItem("deep_trenches:wart_tree_axe", WART_TREE_AXE);
		registerItem("deep_trenches:wart_tree_hoe", WART_TREE_HOE);
		registerItem("deep_trenches:wart_tree_pickaxe", WART_TREE_PICKAXE);
		registerItem("deep_trenches:wart_tree_shovel", WART_TREE_SHOVEL);

		registerItem("deep_trenches:wenge_axe", WENGE_AXE);
		registerItem("deep_trenches:wenge_hoe", WENGE_HOE);
		registerItem("deep_trenches:wenge_pickaxe", WENGE_PICKAXE);
		registerItem("deep_trenches:wenge_shovel", WENGE_SHOVEL);

		registerItem("deep_trenches:yew_axe", YEW_AXE);
		registerItem("deep_trenches:yew_hoe", YEW_HOE);
		registerItem("deep_trenches:yew_pickaxe", YEW_PICKAXE);
		registerItem("deep_trenches:yew_shovel", YEW_SHOVEL);

		/* ARMOR */
		registerItem("deep_trenches:aquamarine_helmet", AQUAMARINE_HELMET);
		registerItem("deep_trenches:aquamarine_chestplate", AQUAMARINE_CHESTPLATE);
		registerItem("deep_trenches:aquamarine_leggings", AQUAMARINE_LEGGINGS);
		registerItem("deep_trenches:aquamarine_boots", AQUAMARINE_BOOTS);

		registerItem("deep_trenches:boron_helmet", BORON_HELMET);
		registerItem("deep_trenches:boron_chestplate", BORON_CHESTPLATE);
		registerItem("deep_trenches:boron_leggings", BORON_LEGGINGS);
		registerItem("deep_trenches:boron_boots", BORON_BOOTS);

		registerItem("deep_trenches:chalcedony_helmet", CHALCEDONY_HELMET);
		registerItem("deep_trenches:chalcedony_chestplate", CHALCEDONY_CHESTPLATE);
		registerItem("deep_trenches:chalcedony_leggings", CHALCEDONY_LEGGINGS);
		registerItem("deep_trenches:chalcedony_boots", CHALCEDONY_BOOTS);

		registerItem("deep_trenches:clinohumite_helmet", CLINOHUMITE_HELMET);
		registerItem("deep_trenches:clinohumite_chestplate", CLINOHUMITE_CHESTPLATE);
		registerItem("deep_trenches:clinohumite_leggings", CLINOHUMITE_LEGGINGS);
		registerItem("deep_trenches:clinohumite_boots", CLINOHUMITE_BOOTS);

		registerItem("deep_trenches:diopside_helmet", DIOPSIDE_HELMET);
		registerItem("deep_trenches:diopside_chestplate", DIOPSIDE_CHESTPLATE);
		registerItem("deep_trenches:diopside_leggings", DIOPSIDE_LEGGINGS);
		registerItem("deep_trenches:diopside_boots", DIOPSIDE_BOOTS);

		registerItem("deep_trenches:enron_helmet", ENRON_HELMET);
		registerItem("deep_trenches:enron_chestplate", ENRON_CHESTPLATE);
		registerItem("deep_trenches:enron_leggings", ENRON_LEGGINGS);
		registerItem("deep_trenches:enron_boots", ENRON_BOOTS);

		registerItem("deep_trenches:enstatite_helmet", ENSTATITE_HELMET);
		registerItem("deep_trenches:enstatite_chestplate", ENSTATITE_CHESTPLATE);
		registerItem("deep_trenches:enstatite_leggings", ENSTATITE_LEGGINGS);
		registerItem("deep_trenches:enstatite_boots", ENSTATITE_BOOTS);

		registerItem("deep_trenches:kralctium_helmet", KRALCTIUM_HELMET);
		registerItem("deep_trenches:kralctium_chestplate", KRALCTIUM_CHESTPLATE);
		registerItem("deep_trenches:kralctium_leggings", KRALCTIUM_LEGGINGS);
		registerItem("deep_trenches:kralctium_boots", KRALCTIUM_BOOTS);

		registerItem("deep_trenches:morganite_helmet", MORGANITE_HELMET);
		registerItem("deep_trenches:morganite_chestplate", MORGANITE_CHESTPLATE);
		registerItem("deep_trenches:morganite_leggings", MORGANITE_LEGGINGS);
		registerItem("deep_trenches:morganite_boots", MORGANITE_BOOTS);

		registerItem("deep_trenches:ruby_helmet", RUBY_HELMET);
		registerItem("deep_trenches:ruby_chestplate", RUBY_CHESTPLATE);
		registerItem("deep_trenches:ruby_leggings", RUBY_LEGGINGS);
		registerItem("deep_trenches:ruby_boots", RUBY_BOOTS);

		registerItem("deep_trenches:sapphire_helmet", SAPPHIRE_HELMET);
		registerItem("deep_trenches:sapphire_chestplate", SAPPHIRE_CHESTPLATE);
		registerItem("deep_trenches:sapphire_leggings", SAPPHIRE_LEGGINGS);
		registerItem("deep_trenches:sapphire_boots", SAPPHIRE_BOOTS);

		registerItem("deep_trenches:silver_helmet", SILVER_HELMET);
		registerItem("deep_trenches:silver_chestplate", SILVER_CHESTPLATE);
		registerItem("deep_trenches:silver_leggings", SILVER_LEGGINGS);
		registerItem("deep_trenches:silver_boots", SILVER_BOOTS);

		registerItem("deep_trenches:sphene_helmet", SPHENE_HELMET);
		registerItem("deep_trenches:sphene_chestplate", SPHENE_CHESTPLATE);
		registerItem("deep_trenches:sphene_leggings", SPHENE_LEGGINGS);
		registerItem("deep_trenches:sphene_boots", SPHENE_BOOTS);

		registerItem("deep_trenches:spinel_helmet", SPINEL_HELMET);
		registerItem("deep_trenches:spinel_chestplate", SPINEL_CHESTPLATE);
		registerItem("deep_trenches:spinel_leggings", SPINEL_LEGGINGS);
		registerItem("deep_trenches:spinel_boots", SPINEL_BOOTS);

		registerItem("deep_trenches:tanzanite_helmet", TANZANITE_HELMET);
		registerItem("deep_trenches:tanzanite_chestplate", TANZANITE_CHESTPLATE);
		registerItem("deep_trenches:tanzanite_leggings", TANZANITE_LEGGINGS);
		registerItem("deep_trenches:tanzanite_boots", TANZANITE_BOOTS);

		registerItem("deep_trenches:topaz_helmet", TOPAZ_HELMET);
		registerItem("deep_trenches:topaz_chestplate", TOPAZ_CHESTPLATE);
		registerItem("deep_trenches:topaz_leggings", TOPAZ_LEGGINGS);
		registerItem("deep_trenches:topaz_boots", TOPAZ_BOOTS);

		registerItem("deep_trenches:void_crittered_diopside_helmet", VOID_CRITTERED_DIOPSIDE_HELMET);
		registerItem("deep_trenches:void_crittered_diopside_chestplate", VOID_CRITTERED_DIOPSIDE_CHESTPLATE);
		registerItem("deep_trenches:void_crittered_diopside_leggings", VOID_CRITTERED_DIOPSIDE_LEGGINGS);
		registerItem("deep_trenches:void_crittered_diopside_boots", VOID_CRITTERED_DIOPSIDE_BOOTS);

		/* TALISMANS */
		registerItem("deep_trenches:aquamarine_talisman", AQUAMARINE_TALISMAN);
		registerItem("deep_trenches:sphene_talisman", SPHENE_TALISMAN);
		registerItem("deep_trenches:tanzanite_talisman", TANZANITE_TALISMAN);

		/* JEWELRY */
		registerItem("deep_trenches:black_pearl", BLACK_PEARL);
		registerItem("deep_trenches:black_opal_shard", BLACK_OPAL_SHARD);
		registerItem("deep_trenches:clinohumite_shard", CLINOHUMITE_SHARD);
		registerItem("deep_trenches:diamond_shard", DIAMOND_SHARD);
		registerItem("deep_trenches:garnet_shard", GARNET_SHARD);
		registerItem("deep_trenches:opal_shard", OPAL_SHARD);
		registerItem("deep_trenches:sapphire_shard", SAPPHIRE_SHARD);
		registerItem("deep_trenches:sugilite_shard", SUGILITE_SHARD);

		/* ORES */
		registerItem("deep_trenches:aquamarine", AQUAMARINE);
		registerItem("deep_trenches:black_opal", BLACK_OPAL);
		registerItem("deep_trenches:chalcedony", CHALCEDONY);
		registerItem("deep_trenches:clinohumite", CLINOHUMITE);
		registerItem("deep_trenches:diopside", DIOPSIDE);
		registerItem("deep_trenches:enstatite", ENSTATITE);
		registerItem("deep_trenches:garnet", GARNET);
		registerItem("deep_trenches:morganite", MORGANITE);
		registerItem("deep_trenches:opal", OPAL);
		registerItem("deep_trenches:raw_actinium", RAW_ACTINIUM);
		registerItem("deep_trenches:raw_boron", RAW_BORON);
		registerItem("deep_trenches:raw_enron", RAW_ENRON);
		registerItem("deep_trenches:raw_silicon", RAW_SILICON);
		registerItem("deep_trenches:raw_silver", RAW_SILVER);
		registerItem("deep_trenches:raw_stroxite", RAW_STROXITE);
		registerItem("deep_trenches:raw_tungsten", RAW_TUNGSTEN);
		registerItem("deep_trenches:charged_raw_tungsten", CHARGED_RAW_TUNGSTEN);
		registerItem("deep_trenches:raw_uranium", RAW_URANIUM);
		registerItem("deep_trenches:raw_uranolumen", RAW_URANOLUMEN);
		registerItem("deep_trenches:ruby", RUBY);
		registerItem("deep_trenches:sapphire", SAPPHIRE);
		registerItem("deep_trenches:sphene", SPHENE);
		registerItem("deep_trenches:spinel", SPINEL);
		registerItem("deep_trenches:sugilite", SUGILITE);
		registerItem("deep_trenches:tanzanite", TANZANITE);
		registerItem("deep_trenches:topaz", TOPAZ);
		registerItem("deep_trenches:void_crittered_diopside", VOID_CRITTERED_DIOPSIDE);

		/* INGOTS */
		registerItem("deep_trenches:actinium_ingot", ACTINIUM_INGOT);
		registerItem("deep_trenches:boron_ingot", BORON_INGOT);
		registerItem("deep_trenches:enron_ingot", ENRON_INGOT);
		registerItem("deep_trenches:gyldelion_ingot", GYLDELION_INGOT);
		registerItem("deep_trenches:kralctium_ingot", KRALCTIUM_INGOT);
		registerItem("deep_trenches:silicon_ingot", SILICON_INGOT);
		registerItem("deep_trenches:silver_ingot", SILVER_INGOT);
		registerItem("deep_trenches:stroxite_ingot", STROXITE_INGOT);
		registerItem("deep_trenches:tungsten_ingot", TUNGSTEN_INGOT);
		registerItem("deep_trenches:charged_tungsten_ingot", CHARGED_TUNGSTEN_INGOT);
		registerItem("deep_trenches:uranium_ingot", URANIUM_INGOT);
		registerItem("deep_trenches:uranolumen_ingot", URANOLUMEN_INGOT);

		/* NUGGETS */
		registerItem("deep_trenches:actinium_nugget", ACTINIUM_NUGGET);
		registerItem("deep_trenches:boron_nugget", BORON_NUGGET);
		registerItem("deep_trenches:enron_nugget", ENRON_NUGGET);
		registerItem("deep_trenches:gyldelion_nugget", GYLDELION_NUGGET);
		registerItem("deep_trenches:kralctium_nugget", KRALCTIUM_NUGGET);
		registerItem("deep_trenches:silicon_nugget", SILICON_NUGGET);
		registerItem("deep_trenches:silver_nugget", SILVER_NUGGET);
		registerItem("deep_trenches:stroxite_nugget", STROXITE_NUGGET);
		registerItem("deep_trenches:tungsten_nugget", TUNGSTEN_NUGGET);
		registerItem("deep_trenches:charged_tungsten_nugget", CHARGED_TUNGSTEN_NUGGET);
		registerItem("deep_trenches:uranium_nugget", URANIUM_NUGGET);
		registerItem("deep_trenches:uranolumen_nugget", URANOLUMEN_NUGGET);

		/* POWDERS */
		registerItem("deep_trenches:uranium_powder", URANIUM_POWDER);
		registerItem("deep_trenches:uranolumen_powder", URANOLUMEN_POWDER);

		/* DYES */
		registerItem("deep_trenches:gyldelion_dye", GYLDELION_DYE);

		/* MOB DROPS */
		registerItem("deep_trenches:loosejaw_tooth", LOOSEJAW_TOOTH);
	}

}
