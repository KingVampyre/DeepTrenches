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
	public static final Item CYAN_BIOLUMINESCENT_GOO;
	public static final Item GREEN_BIOLUMINESCENT_GOO;
	public static final Item LIGHT_BLUE_BIOLUMINESCENT_GOO;

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
	public static final Item URANIUM_INGOT;
	public static final Item URANOLUMEN_INGOT;

	/* NUGGETS */
	public static final Item ACTINIUM_NUGGET;
	public static final Item BORON_NUGGET;
	public static final Item ENRON_NUGGET;
	public static final Item GYLDELION_NUGGET;
	public static final Item SILICON_NUGGET;
	public static final Item SILVER_NUGGET;
	public static final Item STROXITE_NUGGET;
	public static final Item TUNGSTEN_NUGGET;
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

	protected static Item createArmorItem(String id, ArmorMaterial material, EquipmentSlot slot) {
		return register(id, new ArmorItem(material, slot, new Settings().group(COMBAT)));
	}

	protected static Item createAxe(String id, ToolMaterial material, float attackDamage, float attackSpeed) {
		return register(id, new AxeItem(material, attackDamage, attackSpeed, new Settings().group(TOOLS)));
	}

	protected static Item createHoe(String id, ToolMaterial material, int attackDamage, float attackSpeed) {
		return register(id, new HoeItem(material, attackDamage, attackSpeed, new Settings().group(TOOLS)));
	}

	protected static Item createPickaxe(String id, ToolMaterial material, int attackDamage, float attackSpeed) {
		return register(id, new PickaxeItem(material, attackDamage, attackSpeed, new Settings().group(TOOLS)));
	}

	protected static Item createShovel(String id, ToolMaterial material, float attackDamage, float attackSpeed) {
		return register(id, new ShovelItem(material, attackDamage, attackSpeed, new Settings().group(TOOLS)));
	}

	protected static Item createScythe(String id, ToolMaterial material, int attackDamage, float attackSpeed) {
		return register(id, new ScytheItem(material, attackDamage, attackSpeed, new Settings().group(COMBAT)));
	}

	protected static Item createStaff(String id) {
		return register(id, new StaffItem(new Settings().group(COMBAT)));
	}

	protected static Item createSword(String id, ToolMaterial material, int attackDamage, float attackSpeed) {
		return register(id, new SwordItem(material, attackDamage, attackSpeed, new Settings().group(COMBAT)));
	}

	protected static Item createHelmet(String id, ArmorMaterial material) {
		return createArmorItem(id, material, EquipmentSlot.HEAD);
	}

	protected static Item createChestplate(String id, ArmorMaterial material) {
		return createArmorItem(id, material, EquipmentSlot.CHEST);
	}

	protected static Item createLeggings(String id, ArmorMaterial material) {
		return createArmorItem(id, material, EquipmentSlot.LEGS);
	}

	protected static Item createBoots(String id, ArmorMaterial material) {
		return createArmorItem(id, material, EquipmentSlot.FEET);
	}

	protected static Item createBlockItem(String id, Block block, ItemGroup itemGroup) {
		return createBlockItem(id, block, new Settings().group(itemGroup));
	}

	protected static Item createBlockItem(String id, Block block, Settings settings) {
		return register(id, new BlockItem(block, settings));
	}

	protected static Item createBoat(String id, FabricBoatType type) {
		return register(id, new FabricBoatItem(DTEntityTypes.BOAT, type, new Item.Settings().maxCount(1).group(ARBOROLOGY)));
	}

	protected static Item createBucket(String id, FlowableFluid fluid) {
		return register(id, new BucketItem(fluid,  new Item.Settings().recipeRemainder(BUCKET).maxCount(1).group(MISC)));
	}

	protected static void createCoralFan(String id, Block standingBlock, Block block) {
		register(id, new WallStandingBlockItem(standingBlock, block, new Settings().maxCount(1).group(SEA_BLOCKS)));
	}

	protected static Item createFishBucket(String id, EntityType<?> type) {
		return register(id, new EntityBucketItem(type, WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, new Item.Settings().maxCount(1).group(MISC)));
	}

	protected static Item createFishBucket(String id, EntityType<?> type, Tag<EntityType<?>> tag) {
		return register(id, new TagFishBucketItem(type, tag, WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, new Item.Settings().maxCount(1).group(MISC)));
	}

	protected static Item createFood(String id, FoodComponent food) {
		return createItem(id, new Settings().group(MISC).food(food));
	}

	protected static Item createItem(String id, ItemGroup itemGroup) {
		return createItem(id, new Settings().group(itemGroup));
	}

	protected static Item createItem(String id, Settings settings) {
		return createItem(id, Item::new, settings);
	}

	protected static Item createItem(String id, Function<Item.Settings, Item> function, Item.Settings settings) {
		return register(id, function.apply(settings));
	}

	protected static void createSignItem(String id, Block standingBlock, Block block) {
		register(id, new SignItem(new Settings().maxCount(16).group(ARBOROLOGY), standingBlock, block));
	}

	protected static Item createSpawnEgg(String id, EntityType<? extends MobEntity> type, int primaryColor, int secondaryColor) {
		return register(id, new SpawnEggItem(type, primaryColor, secondaryColor, new Item.Settings().maxCount(1).group(MISC)));
	}

	protected static Item createSpawnEgg(String id, EntityType<? extends MobEntity> type, Tag<EntityType<?>> tag, int primaryColor, int secondaryColor) {
		return register(id, new TagSpawnEggItem(type, tag, primaryColor, secondaryColor, new Item.Settings().maxCount(1).group(MISC)));
	}

	protected static Item register(String id, Item item) {

		if(item instanceof BlockItem blockItem)
			blockItem.appendBlocks(BLOCK_ITEMS, blockItem);

		return Registry.register(ITEM, id, item);
	}

	static {
		/* BIOLUMINESCENT BLOCKS */
		createBlockItem("deep_trenches:black_bioluminescent_block", BLACK_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:brown_bioluminescent_block", BROWN_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:cyan_bioluminescent_block", CYAN_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:green_bioluminescent_block", GREEN_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:light_blue_bioluminescent_block", LIGHT_BLUE_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:lime_bioluminescent_block", LIME_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:magenta_bioluminescent_block", MAGENTA_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:orange_bioluminescent_block", ORANGE_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:purple_bioluminescent_block", PURPLE_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:red_bioluminescent_block", RED_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:white_bioluminescent_block", WHITE_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:yellow_bioluminescent_block", YELLOW_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);

		/* REDSTONE */
		createBlockItem("deep_trenches:kralctium_microflare", KRALCTIUM_MICROFLARE, MISC);
		createBlockItem("deep_trenches:lightning_dispenser", LIGHTNING_DISPENSER, MISC);
		createBlockItem("deep_trenches:static_lightning_rod", STATIC_LIGHTNING_ROD, MISC);

		/* EXPLOSIVE BLOCKS */
		createBlockItem("deep_trenches:nuclear_bomb", NUCLEAR_BOMB, MISC);
		createBlockItem("deep_trenches:nuclear_waste", NUCLEAR_WASTE, MISC);
		createBlockItem("deep_trenches:sns", SNS, MISC);
		createBlockItem("deep_trenches:sus", SUS, MISC);

		/* ICE BLOCKS */
		createBlockItem("deep_trenches:cryogenic_ice", CRYOGENIC_ICE, MISC);
		createBlockItem("deep_trenches:black_ice", BLACK_ICE, MISC);
		createBlockItem("deep_trenches:green_ice", GREEN_ICE, MISC);
		createBlockItem("deep_trenches:marine_snow", MARINE_SNOW, MISC);
		createBlockItem("deep_trenches:storcean_marine_snow", STORCEAN_MARINE_SNOW, MISC);

		/* BLOCK ENTITIES */
		createBlockItem("deep_trenches:stasp_nest", STASP_NEST, MISC);

		/* OTHER STONES */
		createBlockItem("deep_trenches:black_marble", BLACK_MARBLE, MINERALOGY);
		createBlockItem("deep_trenches:black_opalite", BLACK_OPALITE, MINERALOGY);
		createBlockItem("deep_trenches:gray_marble", GRAY_MARBLE, MINERALOGY);
		createBlockItem("deep_trenches:light_opalite", LIGHT_OPALITE, MINERALOGY);
		createBlockItem("deep_trenches:lushine", LUSHINE, MINERALOGY);
		createBlockItem("deep_trenches:lushine_pillar", LUSHINE_PILLAR, MINERALOGY);
		createBlockItem("deep_trenches:lustrite", LUSTRITE, MINERALOGY);
		createBlockItem("deep_trenches:opalite", OPALITE, MINERALOGY);
		createBlockItem("deep_trenches:poinine", POININE, MINERALOGY);
		createBlockItem("deep_trenches:ringwoodite", RINGWOODITE, MINERALOGY);
		createBlockItem("deep_trenches:skystone", SKYSTONE, MINERALOGY);
		createBlockItem("deep_trenches:sulfur", SULFUR, MINERALOGY);
		createBlockItem("deep_trenches:verdine", VERDINE, MINERALOGY);
		createBlockItem("deep_trenches:waved_bedrock", WAVED_BEDROCK, MINERALOGY);

		/* STONES */
		createBlockItem("deep_trenches:black_basalt", BLACK_BASALT, MINERALOGY);
		createBlockItem("deep_trenches:black_basalt_bricks", BLACK_BASALT_BRICKS, MINERALOGY);
		createBlockItem("deep_trenches:black_basalt_pillar", BLACK_BASALT_PILLAR, MINERALOGY);
		createBlockItem("deep_trenches:black_basalt_tiles", BLACK_BASALT_TILES, MINERALOGY);
		createBlockItem("deep_trenches:chiseled_black_basalt", CHISELED_BLACK_BASALT, MINERALOGY);
		createBlockItem("deep_trenches:cracked_black_basalt_bricks", CRACKED_BLACK_BASALT_BRICKS, MINERALOGY);
		createBlockItem("deep_trenches:cracked_black_basalt_tiles", CRACKED_BLACK_BASALT_TILES, MINERALOGY);
		createBlockItem("deep_trenches:polished_black_basalt_pillar", POLISHED_BLACK_BASALT_PILLAR, MINERALOGY);

		createBlockItem("deep_trenches:bedrock_bricks", BEDROCK_BRICKS, MINERALOGY);
		createBlockItem("deep_trenches:bedrock_pillar", BEDROCK_PILLAR, MINERALOGY);
		createBlockItem("deep_trenches:chiseled_bedrock", CHISELED_BEDROCK, MINERALOGY);

		createBlockItem("deep_trenches:blue_storcerack", BLUE_STORCERACK, MINERALOGY);
		createBlockItem("deep_trenches:chiseled_blue_storcerack", CHISELED_BLUE_STORCERACK, MINERALOGY);
		createBlockItem("deep_trenches:cracked_blue_storcerack_bricks", CRACKED_BLUE_STORCERACK_BRICKS, MINERALOGY);
		createBlockItem("deep_trenches:cracked_blue_storcerack_tiles", CRACKED_BLUE_STORCERACK_TILES, MINERALOGY);
		createBlockItem("deep_trenches:polished_blue_storcerack", POLISHED_BLUE_STORCERACK, MINERALOGY);

		createBlockItem("deep_trenches:hadal_stone", HADAL_STONE, MINERALOGY);
		createBlockItem("deep_trenches:hadal_stone_bricks", HADAL_STONE_BRICKS, MINERALOGY);
		createBlockItem("deep_trenches:hadal_stone_pillar", HADAL_STONE_PILLAR, MINERALOGY);
		createBlockItem("deep_trenches:hadal_stone_tiles", HADAL_STONE_TILES, MINERALOGY);
		createBlockItem("deep_trenches:chiseled_hadal_stone", CHISELED_HADAL_STONE, MINERALOGY);
		createBlockItem("deep_trenches:cracked_hadal_stone_bricks", CRACKED_HADAL_STONE_BRICKS, MINERALOGY);
		createBlockItem("deep_trenches:cracked_hadal_stone_tiles", CRACKED_HADAL_STONE_TILES, MINERALOGY);
		createBlockItem("deep_trenches:polished_hadal_stone", POLISHED_HADAL_STONE, MINERALOGY);

		createBlockItem("deep_trenches:flint_shards", FLINT_SHARDS, MINERALOGY);
		createBlockItem("deep_trenches:flint_stone", FLINT_STONE, MINERALOGY);
		createBlockItem("deep_trenches:polished_flint_stone", POLISHED_FLINT_STONE, MINERALOGY);

		createBlockItem("deep_trenches:garnet_bricks", GARNET_BRICKS, MINERALOGY);
		createBlockItem("deep_trenches:garnet_pillar", GARNET_PILLAR, MINERALOGY);
		createBlockItem("deep_trenches:chiseled_garnet_block", CHISELED_GARNET_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:totem_chiseled_garnet", TOTEM_CHISELED_GARNET, MINERALOGY);

		createBlockItem("deep_trenches:infinital_stone", INFINITAL_STONE, MINERALOGY);
		createBlockItem("deep_trenches:infinital_stone_bricks", INFINITAL_STONE_BRICKS, MINERALOGY);
		createBlockItem("deep_trenches:infinital_stone_pillar", INFINITAL_STONE_PILLAR, MINERALOGY);
		createBlockItem("deep_trenches:infinital_stone_tiles", INFINITAL_STONE_TILES, MINERALOGY);
		createBlockItem("deep_trenches:chiseled_infinital_stone", CHISELED_INFINITAL_STONE, MINERALOGY);
		createBlockItem("deep_trenches:cracked_infinital_stone_bricks", CRACKED_INFINITAL_STONE_BRICKS, MINERALOGY);
		createBlockItem("deep_trenches:cracked_infinital_stone_tiles", CRACKED_INFINITAL_STONE_TILES, MINERALOGY);
		createBlockItem("deep_trenches:polished_infinital_stone", POLISHED_INFINITAL_STONE, MINERALOGY);

		createBlockItem("deep_trenches:pinkine", PINKINE, MINERALOGY);
		createBlockItem("deep_trenches:pinkine_bricks", PINKINE_BRICKS, MINERALOGY);
		createBlockItem("deep_trenches:pinkine_pillar", PINKINE_PILLAR, MINERALOGY);
		createBlockItem("deep_trenches:pinkine_tiles", PINKINE_TILES, MINERALOGY);
		createBlockItem("deep_trenches:chiseled_pinkine", CHISELED_PINKINE, MINERALOGY);
		createBlockItem("deep_trenches:cracked_pinkine_bricks", CRACKED_PINKINE_BRICKS, MINERALOGY);
		createBlockItem("deep_trenches:cracked_pinkine_tiles", CRACKED_PINKINE_TILES, MINERALOGY);
		createBlockItem("deep_trenches:polished_pinkine", POLISHED_PINKINE, MINERALOGY);

		createBlockItem("deep_trenches:limestone", LIMESTONE, MINERALOGY);
		createBlockItem("deep_trenches:limestone_bricks", LIMESTONE_BRICKS, MINERALOGY);
		createBlockItem("deep_trenches:limestone_pillar", LIMESTONE_PILLAR, MINERALOGY);
		createBlockItem("deep_trenches:limestone_tiles", LIMESTONE_TILES, MINERALOGY);
		createBlockItem("deep_trenches:chiseled_limeston", CHISELED_LIMESTON, MINERALOGY);
		createBlockItem("deep_trenches:cracked_limestone_bricks", CRACKED_LIMESTONE_BRICKS, MINERALOGY);
		createBlockItem("deep_trenches:cracked_limestone_tiles", CRACKED_LIMESTONE_TILES, MINERALOGY);
		createBlockItem("deep_trenches:polished_limestone", POLISHED_LIMESTONE, MINERALOGY);

		createBlockItem("deep_trenches:rhodonite", RHODONITE, MINERALOGY);
		createBlockItem("deep_trenches:rhodonite_bricks", RHODONITE_BRICKS, MINERALOGY);
		createBlockItem("deep_trenches:rhodonite_pillar", RHODONITE_PILLAR, MINERALOGY);
		createBlockItem("deep_trenches:chiseled_rhodonite_block", CHISELED_RHODONITE_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:chiseled_rhodonite_bricks", CHISELED_RHODONITE_BRICKS, MINERALOGY);
		createBlockItem("deep_trenches:embed_rhodonite", EMBED_RHODONITE, MINERALOGY);
		createBlockItem("deep_trenches:polished_rhodonite", POLISHED_RHODONITE, MINERALOGY);

		createBlockItem("deep_trenches:storcendite", STORCENDITE, MINERALOGY);
		createBlockItem("deep_trenches:storcendite_bricks", STORCENDITE_BRICKS, MINERALOGY);
		createBlockItem("deep_trenches:storcendite_pillar", STORCENDITE_PILLAR, MINERALOGY);
		createBlockItem("deep_trenches:storcendite_tiles", STORCENDITE_TILES, MINERALOGY);
		createBlockItem("deep_trenches:chiseled_storcendite", CHISELED_STORCENDITE, MINERALOGY);
		createBlockItem("deep_trenches:cracked_storcendite_bricks", CRACKED_STORCENDITE_BRICKS, MINERALOGY);
		createBlockItem("deep_trenches:cracked_storcendite_tiles", CRACKED_STORCENDITE_TILES, MINERALOGY);
		createBlockItem("deep_trenches:polished_storcendite", POLISHED_STORCENDITE, MINERALOGY);

		createBlockItem("deep_trenches:storcerack", STORCERACK, MINERALOGY);
		createBlockItem("deep_trenches:storcerack_bricks", STORCERACK_BRICKS, MINERALOGY);
		createBlockItem("deep_trenches:storcerack_pillar", STORCERACK_PILLAR, MINERALOGY);
		createBlockItem("deep_trenches:storcerack_tiles", STORCERACK_TILES, MINERALOGY);
		createBlockItem("deep_trenches:chiseled_storcerack", CHISELED_STORCERACK, MINERALOGY);
		createBlockItem("deep_trenches:cracked_storcerack_bricks", CRACKED_STORCERACK_BRICKS, MINERALOGY);
		createBlockItem("deep_trenches:cracked_storcerack_tiles", CRACKED_STORCERACK_TILES, MINERALOGY);
		createBlockItem("deep_trenches:polished_storcerack", POLISHED_STORCERACK, MINERALOGY);

		createBlockItem("deep_trenches:sulfur_stone", SULFUR_STONE, MINERALOGY);
		createBlockItem("deep_trenches:sulfur_stone_bricks", SULFUR_STONE_BRICKS, MINERALOGY);
		createBlockItem("deep_trenches:chiseled_sulfur_stone_bricks", CHISELED_SULFUR_STONE_BRICKS, MINERALOGY);
		createBlockItem("deep_trenches:polished_sulfur_stone", POLISHED_SULFUR_STONE, MINERALOGY);

		createBlockItem("deep_trenches:virdal_stone", VIRDAL_STONE, MINERALOGY);
		createBlockItem("deep_trenches:virdal_stone_bricks", VIRDAL_STONE_BRICKS, MINERALOGY);
		createBlockItem("deep_trenches:virdal_stone_pillar", VIRDAL_STONE_PILLAR, MINERALOGY);
		createBlockItem("deep_trenches:virdal_stone_tiles", VIRDAL_STONE_TILES, MINERALOGY);
		createBlockItem("deep_trenches:chiseled_virdal_stone", CHISELED_VIRDAL_STONE, MINERALOGY);
		createBlockItem("deep_trenches:cracked_virdal_stone_bricks", CRACKED_VIRDAL_STONE_BRICKS, MINERALOGY);
		createBlockItem("deep_trenches:cracked_virdal_stone_tiles", CRACKED_VIRDAL_STONE_TILES, MINERALOGY);
		createBlockItem("deep_trenches:polished_vidal_stone", POLISHED_VIRDAL_STONE, MINERALOGY);

		createBlockItem("deep_trenches:waveite", WAVEITE, MINERALOGY);
		createBlockItem("deep_trenches:waveite_bricks", WAVEITE_BRICKS, MINERALOGY);
		createBlockItem("deep_trenches:waveite_pillar", WAVEITE_PILLAR, MINERALOGY);
		createBlockItem("deep_trenches:waveite_tiles", WAVEITE_TILES, MINERALOGY);
		createBlockItem("deep_trenches:chiseled_waveite", CHISELED_WAVEITE, MINERALOGY);
		createBlockItem("deep_trenches:cracked_waveite_bricks", CRACKED_WAVEITE_BRICKS, MINERALOGY);
		createBlockItem("deep_trenches:cracked_waveite_tiles", CRACKED_WAVEITE_TILES, MINERALOGY);
		createBlockItem("deep_trenches:polished_waveite", POLISHED_WAVEITE, MINERALOGY);

		/* ORES */
		createBlockItem("deep_trenches:andesite_aquamarine_ore", ANDESITE_AQUAMARINE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:andesite_black_opal_ore", ANDESITE_BLACK_OPAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:andesite_chalcedony_ore", ANDESITE_CHALCEDONY_ORE, MINERALOGY);
		createBlockItem("deep_trenches:andesite_clinohumite_ore", ANDESITE_CLINOHUMITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:andesite_coal_ore", ANDESITE_COAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:andesite_copper_ore", ANDESITE_COPPER_ORE, MINERALOGY);
		createBlockItem("deep_trenches:andesite_diamond_ore", ANDESITE_DIAMOND_ORE, MINERALOGY);
		createBlockItem("deep_trenches:andesite_emerald_ore", ANDESITE_EMERALD_ORE, MINERALOGY);
		createBlockItem("deep_trenches:andesite_garnet_ore", ANDESITE_GARNET_ORE, MINERALOGY);
		createBlockItem("deep_trenches:andesite_gold_ore", ANDESITE_GOLD_ORE, MINERALOGY);
		createBlockItem("deep_trenches:andesite_iron_ore", ANDESITE_IRON_ORE, MINERALOGY);
		createBlockItem("deep_trenches:andesite_lapis_ore", ANDESITE_LAPIS_ORE, MINERALOGY);
		createBlockItem("deep_trenches:andesite_morganite_ore", ANDESITE_MORGANITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:andesite_redstone_ore", ANDESITE_REDSTONE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:andesite_ruby_ore", ANDESITE_RUBY_ORE, MINERALOGY);
		createBlockItem("deep_trenches:andesite_silver_ore", ANDESITE_SILVER_ORE, MINERALOGY);
		createBlockItem("deep_trenches:andesite_sphene_ore", ANDESITE_SPHENE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:andesite_spinel_ore", ANDESITE_SPINEL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:andesite_tanzanite_ore", ANDESITE_TANZANITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:andesite_topaz_ore", ANDESITE_TOPAZ_ORE, MINERALOGY);

		createBlockItem("deep_trenches:basalt_clinohumite_ore", BASALT_CLINOHUMITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:basalt_coal_ore", BASALT_COAL_ORE, MINERALOGY);

		createBlockItem("deep_trenches:bedrock_diamond_ore", BEDROCK_DIAMOND_ORE, MINERALOGY);
		createBlockItem("deep_trenches:bedrock_diopside_ore", BEDROCK_DIOPSIDE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:bedrock_morganite_ore", BEDROCK_MORGANITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:bedrock_void_crittered_diopside_ore", BEDROCK_VOID_CRITTERED_DIOPSIDE_ORE, MINERALOGY);

		createBlockItem("deep_trenches:black_basalt_aquamarine_ore", BLACK_BASALT_AQUAMARINE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:black_basalt_black_opal_ore", BLACK_BASALT_BLACK_OPAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:black_basalt_chalcedony_ore", BLACK_BASALT_CHALCEDONY_ORE, MINERALOGY);
		createBlockItem("deep_trenches:black_basalt_clinohumite_ore", BLACK_BASALT_CLINOHUMITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:black_basalt_coal_ore", BLACK_BASALT_COAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:black_basalt_copper_ore", BLACK_BASALT_COPPER_ORE, MINERALOGY);
		createBlockItem("deep_trenches:black_basalt_diamond_ore", BLACK_BASALT_DIAMOND_ORE, MINERALOGY);
		createBlockItem("deep_trenches:black_basalt_emerald_ore", BLACK_BASALT_EMERALD_ORE, MINERALOGY);
		createBlockItem("deep_trenches:black_basalt_garnet_ore", BLACK_BASALT_GARNET_ORE, MINERALOGY);
		createBlockItem("deep_trenches:black_basalt_gold_ore", BLACK_BASALT_GOLD_ORE, MINERALOGY);
		createBlockItem("deep_trenches:black_basalt_iron_ore", BLACK_BASALT_IRON_ORE, MINERALOGY);
		createBlockItem("deep_trenches:black_basalt_lapis_ore", BLACK_BASALT_LAPIS_ORE, MINERALOGY);
		createBlockItem("deep_trenches:black_basalt_morganite_ore", BLACK_BASALT_MORGANITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:black_basalt_redstone_ore", BLACK_BASALT_REDSTONE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:black_basalt_ruby_ore", BLACK_BASALT_RUBY_ORE, MINERALOGY);
		createBlockItem("deep_trenches:black_basalt_silver_ore", BLACK_BASALT_SILVER_ORE, MINERALOGY);
		createBlockItem("deep_trenches:black_basalt_sphene_ore", BLACK_BASALT_SPHENE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:black_basalt_spinel_ore", BLACK_BASALT_SPINEL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:black_basalt_tanzanite_ore", BLACK_BASALT_TANZANITE_ORE, MINERALOGY);

		createBlockItem("deep_trenches:blue_storcerack_aquamarine_ore", BLUE_STORCERACK_AQUAMARINE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:blue_storcerack_black_opal_ore", BLUE_STORCERACK_BLACK_OPAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:blue_storcerack_chalcedony_ore", BLUE_STORCERACK_CHALCEDONY_ORE, MINERALOGY);
		createBlockItem("deep_trenches:blue_storcerack_coal_ore", BLUE_STORCERACK_COAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:blue_storcerack_copper_ore", BLUE_STORCERACK_COPPER_ORE, MINERALOGY);
		createBlockItem("deep_trenches:blue_storcerack_diamond_ore", BLUE_STORCERACK_DIAMOND_ORE, MINERALOGY);
		createBlockItem("deep_trenches:blue_storcerack_emerald_ore", BLUE_STORCERACK_EMERALD_ORE, MINERALOGY);
		createBlockItem("deep_trenches:blue_storcerack_gold_ore", BLUE_STORCERACK_GOLD_ORE, MINERALOGY);
		createBlockItem("deep_trenches:blue_storcerack_iron_ore", BLUE_STORCERACK_IRON_ORE, MINERALOGY);
		createBlockItem("deep_trenches:blue_storcerack_lapis_ore", BLUE_STORCERACK_LAPIS_ORE, MINERALOGY);
		createBlockItem("deep_trenches:blue_storcerack_morganite_ore", BLUE_STORCERACK_MORGANITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:blue_storcerack_redstone_ore", BLUE_STORCERACK_REDSTONE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:blue_storcerack_ruby_ore", BLUE_STORCERACK_RUBY_ORE, MINERALOGY);
		createBlockItem("deep_trenches:blue_storcerack_silver_ore", BLUE_STORCERACK_SILVER_ORE, MINERALOGY);
		createBlockItem("deep_trenches:blue_storcerack_sphene_ore", BLUE_STORCERACK_SPHENE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:blue_storcerack_spinel_ore", BLUE_STORCERACK_SPINEL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:blue_storcerack_stroxite_ore", BLUE_STORCERACK_STROXITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:blue_storcerack_tanzanite_ore", BLUE_STORCERACK_TANZANITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:blue_storcerack_charged_tungsten_ore", BLUE_STORCERACK_CHARGED_TUNGSTEN_ORE, MINERALOGY);

		createBlockItem("deep_trenches:calcite_chalcedony_ore", CALCITE_CHALCEDONY_ORE, MINERALOGY);
		createBlockItem("deep_trenches:calcite_clinohumite_ore", CALCITE_CLINOHUMITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:calcite_coal_ore", CALCITE_COAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:calcite_diamond_ore", CALCITE_DIAMOND_ORE, MINERALOGY);
		createBlockItem("deep_trenches:calcite_goal_ore", CALCITE_GOAL_ORE, MINERALOGY);

		createBlockItem("deep_trenches:deepslate_aquamarine_ore", DEEPSLATE_AQUAMARINE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:deepslate_black_opal_ore", DEEPSLATE_BLACK_OPAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:deepslate_chalcedony_ore", DEEPSLATE_CHALCEDONY_ORE, MINERALOGY);
		createBlockItem("deep_trenches:deepslate_clinohumite_ore", DEEPSLATE_CLINOHUMITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:deepslate_garnet_ore", DEEPSLATE_GARNET_ORE, MINERALOGY);
		createBlockItem("deep_trenches:deepslate_morganite_ore", DEEPSLATE_MORGANITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:deepslate_opal_ore", DEEPSLATE_OPAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:deepslate_ruby_ore", DEEPSLATE_RUBY_ORE, MINERALOGY);
		createBlockItem("deep_trenches:deepslate_sapphire_ore", DEEPSLATE_SAPPHIRE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:deepslate_silver_ore", DEEPSLATE_SILVER_ORE, MINERALOGY);
		createBlockItem("deep_trenches:deepslate_sphene_ore", DEEPSLATE_SPHENE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:deepslate_spinel_ore", DEEPSLATE_SPINEL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:deepslate_sugilite_ore", DEEPSLATE_SUGILITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:deepslate_tanzanite_ore", DEEPSLATE_TANZANITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:deepslate_topaz_ore", DEEPSLATE_TOPAZ_ORE, MINERALOGY);

		createBlockItem("deep_trenches:diorite_aquamarine_ore", DIORITE_AQUAMARINE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:diorite_black_opal_ore", DIORITE_BLACK_OPAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:diorite_chalcedony_ore", DIORITE_CHALCEDONY_ORE, MINERALOGY);
		createBlockItem("deep_trenches:diorite_clinohumite_ore", DIORITE_CLINOHUMITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:diorite_coal_ore", DIORITE_COAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:diorite_copper_ore", DIORITE_COPPER_ORE, MINERALOGY);
		createBlockItem("deep_trenches:diorite_diamond_ore", DIORITE_DIAMOND_ORE, MINERALOGY);
		createBlockItem("deep_trenches:diorite_emerald_ore", DIORITE_EMERALD_ORE, MINERALOGY);
		createBlockItem("deep_trenches:diorite_garnet_ore", DIORITE_GARNET_ORE, MINERALOGY);
		createBlockItem("deep_trenches:diorite_gold_ore", DIORITE_GOLD_ORE, MINERALOGY);
		createBlockItem("deep_trenches:diorite_iron_ore", DIORITE_IRON_ORE, MINERALOGY);
		createBlockItem("deep_trenches:diorite_lapis_ore", DIORITE_LAPIS_ORE, MINERALOGY);
		createBlockItem("deep_trenches:diorite_morganite_ore", DIORITE_MORGANITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:diorite_redstone_ore", DIORITE_REDSTONE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:diorite_ruby_ore", DIORITE_RUBY_ORE, MINERALOGY);
		createBlockItem("deep_trenches:diorite_silver_ore", DIORITE_SILVER_ORE, MINERALOGY);
		createBlockItem("deep_trenches:diorite_sphene_ore", DIORITE_SPHENE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:diorite_spinel_ore", DIORITE_SPINEL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:diorite_tanzanite_ore", DIORITE_TANZANITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:diorite_topaz_ore", DIORITE_TOPAZ_ORE, MINERALOGY);
		createBlockItem("deep_trenches:end_stone_diopside_ore", END_STONE_DIOPSIDE_ORE, MINERALOGY);

		createBlockItem("deep_trenches:end_stone_spinel_ore", END_STONE_SPINEL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:end_stone_void_crittered_diopside_ore", END_STONE_VOID_CRITTERED_DIOPSIDE_ORE, MINERALOGY);

		createBlockItem("deep_trenches:flint_stone_silicon_ore", FLINT_STONE_SILICON_ORE, MINERALOGY);
		createBlockItem("deep_trenches:flint_stone_uranolumen_ore", FLINT_STONE_URANOLUMEN_ORE, MINERALOGY);

		createBlockItem("deep_trenches:gray_marble_diamond_ore", GRAY_MARBLE_DIAMOND_ORE, MINERALOGY);

		createBlockItem("deep_trenches:granite_aquamarine_ore", GRANITE_AQUAMARINE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:granite_black_opal_ore", GRANITE_BLACK_OPAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:granite_chalcedony_ore", GRANITE_CHALCEDONY_ORE, MINERALOGY);
		createBlockItem("deep_trenches:granite_clinohumite_ore", GRANITE_CLINOHUMITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:granite_coal_ore", GRANITE_COAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:granite_copper_ore", GRANITE_COPPER_ORE, MINERALOGY);
		createBlockItem("deep_trenches:granite_diamond_ore", GRANITE_DIAMOND_ORE, MINERALOGY);
		createBlockItem("deep_trenches:granite_emerald_ore", GRANITE_EMERALD_ORE, MINERALOGY);
		createBlockItem("deep_trenches:granite_garnet_ore", GRANITE_GARNET_ORE, MINERALOGY);
		createBlockItem("deep_trenches:granite_gold_ore", GRANITE_GOLD_ORE, MINERALOGY);
		createBlockItem("deep_trenches:granite_iron_ore", GRANITE_IRON_ORE, MINERALOGY);
		createBlockItem("deep_trenches:granite_lapis_ore", GRANITE_LAPIS_ORE, MINERALOGY);
		createBlockItem("deep_trenches:granite_morganite_ore", GRANITE_MORGANITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:granite_redstone_ore", GRANITE_REDSTONE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:granite_ruby_ore", GRANITE_RUBY_ORE, MINERALOGY);
		createBlockItem("deep_trenches:granite_silver_ore", GRANITE_SILVER_ORE, MINERALOGY);
		createBlockItem("deep_trenches:granite_sphene_ore", GRANITE_SPHENE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:granite_spinel_ore", GRANITE_SPINEL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:granite_tanzanite_ore", GRANITE_TANZANITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:granite_topaz_ore", GRANITE_TOPAZ_ORE, MINERALOGY);

		createBlockItem("deep_trenches:hadal_stone_aquamarine_ore", HADAL_STONE_AQUAMARINE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:hadal_stone_black_opal_ore", HADAL_STONE_BLACK_OPAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:hadal_stone_clinohumite_ore", HADAL_STONE_CLINOHUMITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:hadal_stone_coal_ore", HADAL_STONE_COAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:hadal_stone_copper_ore", HADAL_STONE_COPPER_ORE, MINERALOGY);
		createBlockItem("deep_trenches:hadal_stone_diamond_ore", HADAL_STONE_DIAMOND_ORE, MINERALOGY);
		createBlockItem("deep_trenches:hadal_stone_emerald_ore", HADAL_STONE_EMERALD_ORE, MINERALOGY);
		createBlockItem("deep_trenches:hadal_stone_garnet_ore", HADAL_STONE_GARNET_ORE, MINERALOGY);
		createBlockItem("deep_trenches:hadal_stone_gold_ore", HADAL_STONE_GOLD_ORE, MINERALOGY);
		createBlockItem("deep_trenches:hadal_stone_iron_ore", HADAL_STONE_IRON_ORE, MINERALOGY);
		createBlockItem("deep_trenches:hadal_stone_lapis_ore", HADAL_STONE_LAPIS_ORE, MINERALOGY);
		createBlockItem("deep_trenches:hadal_stone_morganite_ore", HADAL_STONE_MORGANITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:hadal_stone_redstone_ore", HADAL_STONE_REDSTONE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:hadal_stone_ruby_ore", HADAL_STONE_RUBY_ORE, MINERALOGY);
		createBlockItem("deep_trenches:hadal_stone_sapphire_ore", HADAL_STONE_SAPPHIRE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:hadal_stone_silver_ore", HADAL_STONE_SILVER_ORE, MINERALOGY);
		createBlockItem("deep_trenches:hadal_stone_sphene_ore", HADAL_STONE_SPHENE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:hadal_stone_spinel_ore", HADAL_STONE_SPINEL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:hadal_stone_suglite_ore", HADAL_STONE_SUGLITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:hadal_stone_tanzanite_ore", HADAL_STONE_TANZANITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:hadal_stone_topaz_ore", HADAL_STONE_TOPAZ_ORE, MINERALOGY);

		createBlockItem("deep_trenches:infinital_stone_aquamarine_ore", INFINITAL_STONE_AQUAMARINE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:infinital_stone_black_opal_ore", INFINITAL_STONE_BLACK_OPAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:infinital_stone_coal_ore", INFINITAL_STONE_COAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:infinital_stone_copper_ore", INFINITAL_STONE_COPPER_ORE, MINERALOGY);
		createBlockItem("deep_trenches:infinital_stone_diamond_ore", INFINITAL_STONE_DIAMOND_ORE, MINERALOGY);
		createBlockItem("deep_trenches:infinital_stone_enstatite_ore", INFINITAL_STONE_ENSTATITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:infinital_stone_opal_ore", INFINITAL_STONE_OPAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:infinital_stone_iron_ore", INFINITAL_STONE_IRON_ORE, MINERALOGY);
		createBlockItem("deep_trenches:infinital_stone_ruby_ore", INFINITAL_STONE_RUBY_ORE, MINERALOGY);
		createBlockItem("deep_trenches:infinital_stone_sapphire_ore", INFINITAL_STONE_SAPPHIRE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:infinital_stone_sphene_ore", INFINITAL_STONE_SPHENE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:infinital_stone_spinel_ore", INFINITAL_STONE_SPINEL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:infinital_stone_sugilite_ore", INFINITAL_STONE_SUGILITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:infinital_stone_uranolumen_ore", INFINITAL_STONE_URANOLUMEN_ORE, MINERALOGY);
		createBlockItem("deep_trenches:infinital_stone_silicon_ore", INFINITAL_STONE_SILICON_ORE, MINERALOGY);

		createBlockItem("deep_trenches:limestone_aquamarine_ore", LIMESTONE_AQUAMARINE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:limestone_black_opal_ore", LIMESTONE_BLACK_OPAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:limestone_coal_ore", LIMESTONE_COAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:limestone_copper_ore", LIMESTONE_COPPER_ORE, MINERALOGY);
		createBlockItem("deep_trenches:limestone_diamond_ore", LIMESTONE_DIAMOND_ORE, MINERALOGY);
		createBlockItem("deep_trenches:limestone_opal_ore", LIMESTONE_OPAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:limestone_iron_ore", LIMESTONE_IRON_ORE, MINERALOGY);
		createBlockItem("deep_trenches:limestone_sapphire_ore", LIMESTONE_SAPPHIRE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:limestone_sphene_ore", LIMESTONE_SPHENE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:limestone_spinel_ore", LIMESTONE_SPINEL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:limestone_sugilite_ore", LIMESTONE_SUGILITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:lustred_waveite", LUSTRED_WAVEITE, MINERALOGY);

		createBlockItem("deep_trenches:lustred_waveite_sapphire_ore", LUSTRED_WAVEITE_SAPPHIRE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:lustred_waveite_tanzanite_ore", LUSTRED_WAVEITE_TANZANITE_ORE, MINERALOGY);

		createBlockItem("deep_trenches:marble_diamond_ore", MARBLE_DIAMOND_ORE, MINERALOGY);

		createBlockItem("deep_trenches:netherrack_boron_ore", NETHERRACK_BORON_ORE, MINERALOGY);
		createBlockItem("deep_trenches:netherrack_clinohumite_ore", NETHERRACK_CLINOHUMITE_ORE, MINERALOGY);

		createBlockItem("deep_trenches:pinkine_aquamarine_ore", PINKINE_AQUAMARINE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:pinkine_black_opal_ore", PINKINE_BLACK_OPAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:pinkine_coal_ore", PINKINE_COAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:pinkine_copper_ore", PINKINE_COPPER_ORE, MINERALOGY);
		createBlockItem("deep_trenches:pinkine_diamond_ore", PINKINE_DIAMOND_ORE, MINERALOGY);
		createBlockItem("deep_trenches:pinkine_diopside_ore", PINKINE_DIOPSIDE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:pinkine_enstatite_ore", PINKINE_ENSTATITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:pinkine_opal_ore", PINKINE_OPAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:pinkine_iron_ore", PINKINE_IRON_ORE, MINERALOGY);
		createBlockItem("deep_trenches:pinkine_ruby_ore", PINKINE_RUBY_ORE, MINERALOGY);
		createBlockItem("deep_trenches:pinkine_sapphire_ore", PINKINE_SAPPHIRE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:pinkine_silicon_ore", PINKINE_SILICON_ORE, MINERALOGY);
		createBlockItem("deep_trenches:pinkine_sphene_ore", PINKINE_SPHENE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:pinkine_spinel_ore", PINKINE_SPINEL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:pinkine_sugilite_ore", PINKINE_SUGILITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:pinkine_uranium_ore", PINKINE_URANIUM_ORE, MINERALOGY);
		createBlockItem("deep_trenches:pinkine_uranolumen_ore", PINKINE_URANOLUMEN_ORE, MINERALOGY);
		createBlockItem("deep_trenches:pinkine_void_crittered_diopside_ore", PINKINE_VOID_CRITTERED_DIOPSIDE_ORE, MINERALOGY);

		createBlockItem("deep_trenches:ringwoodite_sapphire_ore", RINGWOODITE_SAPPHIRE_ORE, MINERALOGY);

		createBlockItem("deep_trenches:skystone_opal_ore", SKYSTONE_OPAL_ORE, MINERALOGY);

		createBlockItem("deep_trenches:smooth_basalt_chalcedony_ore", SMOOTH_BASALT_CHALCEDONY_ORE, MINERALOGY);
		createBlockItem("deep_trenches:smooth_basalt_clinohumite_ore", SMOOTH_BASALT_CLINOHUMITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:smooth_basalt_diamond_ore", SMOOTH_BASALT_DIAMOND_ORE, MINERALOGY);
		createBlockItem("deep_trenches:smooth_basalt_gold_ore", SMOOTH_BASALT_GOLD_ORE, MINERALOGY);

		createBlockItem("deep_trenches:storcean_sapphire_ore", STORCEAN_SAPPHIRE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcean_silicon_ore", STORCEAN_SILICON_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcean_snow", STORCEAN_SNOW, MINERALOGY);
		createBlockItem("deep_trenches:storcean_tungsten_ore", STORCEAN_TUNGSTEN_ORE, MINERALOGY);

		createBlockItem("deep_trenches:storcendite_aquamarine_ore", STORCENDITE_AQUAMARINE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcendite_black_opal_ore", STORCENDITE_BLACK_OPAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcendite_coal_ore", STORCENDITE_COAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcendite_copper_ore", STORCENDITE_COPPER_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcendite_diamond_ore", STORCENDITE_DIAMOND_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcendite_enstatite_ore", STORCENDITE_ENSTATITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcendite_iron_ore", STORCENDITE_IRON_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcendite_opal_ore", STORCENDITE_OPAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcendite_ruby_ore", STORCENDITE_RUBY_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcendite_sapphire_ore", STORCENDITE_SAPPHIRE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcendite_silicon_ore", STORCENDITE_SILICON_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcendite_sphene_ore", STORCENDITE_SPHENE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcendite_spinel_ore", STORCENDITE_SPINEL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcendite_sugilite_ore", STORCENDITE_SUGILITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcendite_uranium_ore", STORCENDITE_URANIUM_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcendite_uranolumen_ore", STORCENDITE_URANOLUMEN_ORE, MINERALOGY);

		createBlockItem("deep_trenches:storcerack_aquamarine_ore", STORCERACK_AQUAMARINE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcerack_black_opal_ore", STORCERACK_BLACK_OPAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcerack_coal_ore", STORCERACK_COAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcerack_copper_ore", STORCERACK_COPPER_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcerack_diamond_ore", STORCERACK_DIAMOND_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcerack_gold_ore", STORCERACK_GOLD_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcerack_iron_ore", STORCERACK_IRON_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcerack_opal_ore", STORCERACK_OPAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcerack_redstone_ore", STORCERACK_REDSTONE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcerack_ruby_ore", STORCERACK_RUBY_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcerack_sapphire_ore", STORCERACK_SAPPHIRE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcerack_silicon_ore", STORCERACK_SILICON_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcerack_sphene_ore", STORCERACK_SPHENE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcerack_spinel_ore", STORCERACK_SPINEL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcerack_sugilite_ore", STORCERACK_SUGILITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcerack_tungsten_ore", STORCERACK_TUNGSTEN_ORE, MINERALOGY);
		createBlockItem("deep_trenches:storcerack_uranolumen_ore", STORCERACK_URANOLUMEN_ORE, MINERALOGY);

		createBlockItem("deep_trenches:sulfur_stone_chalcedony_ore", SULFUR_STONE_CHALCEDONY_ORE, MINERALOGY);
		createBlockItem("deep_trenches:sulfur_stone_clinohumite_ore", SULFUR_STONE_CLINOHUMITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:sulfur_stone_coal_ore", SULFUR_STONE_COAL_ORE, MINERALOGY);

		createBlockItem("deep_trenches:tuff_chalcedony_ore", TUFF_CHALCEDONY_ORE, MINERALOGY);
		createBlockItem("deep_trenches:tuff_clinohumite_ore", TUFF_CLINOHUMITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:tuff_coal_ore", TUFF_COAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:tuff_diamond_ore", TUFF_DIAMOND_ORE, MINERALOGY);
		createBlockItem("deep_trenches:tuff_gold_ore", TUFF_GOLD_ORE, MINERALOGY);
		createBlockItem("deep_trenches:verdine_coal_ore", VERDINE_COAL_ORE, MINERALOGY);

		createBlockItem("deep_trenches:virdal_stone_aquamarine_ore", VIRDAL_STONE_AQUAMARINE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:virdal_stone_black_opal_ore", VIRDAL_STONE_BLACK_OPAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:virdal_stone_coal_ore", VIRDAL_STONE_COAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:virdal_stone_copper_ore", VIRDAL_STONE_COPPER_ORE, MINERALOGY);
		createBlockItem("deep_trenches:virdal_stone_diamond_ore", VIRDAL_STONE_DIAMOND_ORE, MINERALOGY);
		createBlockItem("deep_trenches:virdal_stone_iron_ore", VIRDAL_STONE_IRON_ORE, MINERALOGY);
		createBlockItem("deep_trenches:virdal_stone_opal_ore", VIRDAL_STONE_OPAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:virdal_stone_ruby_ore", VIRDAL_STONE_RUBY_ORE, MINERALOGY);
		createBlockItem("deep_trenches:virdal_stone_sapphire_ore", VIRDAL_STONE_SAPPHIRE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:virdal_stone_silicon_ore", VIRDAL_STONE_SILICON_ORE, MINERALOGY);
		createBlockItem("deep_trenches:virdal_stone_sphene_ore", VIRDAL_STONE_SPHENE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:virdal_stone_spinel_ore", VIRDAL_STONE_SPINEL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:virdal_stone_sugilite_ore", VIRDAL_STONE_SUGILITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:virdal_stone_uranolumen_ore", VIRDAL_STONE_URANOLUMEN_ORE, MINERALOGY);

		createBlockItem("deep_trenches:waved_bedrock_diamond_ore", WAVED_BEDROCK_DIAMOND_ORE, MINERALOGY);
		createBlockItem("deep_trenches:waved_bedrock_diopside_ore", WAVED_BEDROCK_DIOPSIDE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:waved_bedrock_morganite_ore", WAVED_BEDROCK_MORGANITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:waved_bedrock_tanzanite_ore", WAVED_BEDROCK_TANZANITE_ORE, MINERALOGY);

		createBlockItem("deep_trenches:waveite_clinohumite_ore", WAVEITE_CLINOHUMITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:waveite_coal_ore", WAVEITE_COAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:waveite_copper_ore", WAVEITE_COPPER_ORE, MINERALOGY);
		createBlockItem("deep_trenches:waveite_diamond_ore", WAVEITE_DIAMOND_ORE, MINERALOGY);
		createBlockItem("deep_trenches:waveite_emerald_ore", WAVEITE_EMERALD_ORE, MINERALOGY);
		createBlockItem("deep_trenches:waveite_iron_ore", WAVEITE_IRON_ORE, MINERALOGY);
		createBlockItem("deep_trenches:waveite_garnet_ore", WAVEITE_GARNET_ORE, MINERALOGY);
		createBlockItem("deep_trenches:waveite_gold_ore", WAVEITE_GOLD_ORE, MINERALOGY);
		createBlockItem("deep_trenches:waveite_lapis_ore", WAVEITE_LAPIS_ORE, MINERALOGY);
		createBlockItem("deep_trenches:waveite_morganite_ore", WAVEITE_MORGANITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:waveite_redstone_ore", WAVEITE_REDSTONE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:waveite_ruby_ore", WAVEITE_RUBY_ORE, MINERALOGY);
		createBlockItem("deep_trenches:waveite_sapphire_ore", WAVEITE_SAPPHIRE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:waveite_silicon_ore", WAVEITE_SILICON_ORE, MINERALOGY);
		createBlockItem("deep_trenches:waveite_silver_ore", WAVEITE_SILVER_ORE, MINERALOGY);
		createBlockItem("deep_trenches:waveite_sphene_ore", WAVEITE_SPHENE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:waveite_spinel_ore", WAVEITE_SPINEL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:waveite_sugilite_ore", WAVEITE_SUGILITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:waveite_tanzanite_ore", WAVEITE_TANZANITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:waveite_topaz_ore", WAVEITE_TOPAZ_ORE, MINERALOGY);

		createBlockItem("deep_trenches:actinium_ore", ACTINIUM_ORE, MINERALOGY);
		createBlockItem("deep_trenches:aquamarine_ore", AQUAMARINE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:black_opal_ore", BLACK_OPAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:clinohumite_ore", CLINOHUMITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:enstatite_ore", ENSTATITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:morganite_ore", MORGANITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:opal_ore", OPAL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:ruby_ore", RUBY_ORE, MINERALOGY);
		createBlockItem("deep_trenches:sapphire_ore", SAPPHIRE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:sugilite_ore", SUGILITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:sphene_ore", SPHENE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:spinel_ore", SPINEL_ORE, MINERALOGY);
		createBlockItem("deep_trenches:tanzanite_ore", TANZANITE_ORE, MINERALOGY);
		createBlockItem("deep_trenches:topaz_ore", TOPAZ_ORE, MINERALOGY);

		/* RAW BLOCKS */
		createBlockItem("deep_trenches:raw_actinium_block", RAW_ACTINIUM_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:raw_boron_block", RAW_BORON_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:raw_enron_block", RAW_ENRON_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:kralium_debris", KRALIUM_DEBRIS, MINERALOGY);
		createBlockItem("deep_trenches:raw_silicon_block", RAW_SILICON_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:raw_silver_block", RAW_SILVER_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:raw_stroxite_block", RAW_STROXITE_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:charged_raw_tungsten_block", CHARGED_RAW_TUNGSTEN_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:raw_tungsten_block", RAW_TUNGSTEN_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:raw_uranolumen_block", RAW_URANOLUMEN_BLOCK, MINERALOGY);

		/* MINERAL BLOCKS */
		createBlockItem("deep_trenches:actinium_block", ACTINIUM_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:aquamarine_block", AQUAMARINE_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:black_pearl_block", BLACK_PEARL_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:boron_block", BORON_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:cut_boron_block", CUT_BORON_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:chalcedony_block", CHALCEDONY_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:diopside_block", DIOPSIDE_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:enron_block", ENRON_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:enstatite_block", ENSTATITE_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:gyldelion_block", GYLDELION_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:kralctium_block", KRALCTIUM_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:kralium_block", KRALIUM_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:cut_kralium_block", CUT_KRALIUM_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:lekralite_block", LEKRALITE_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:morganite_block", MORGANITE_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:ruby_block", RUBY_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:sapphire_block", SAPPHIRE_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:sphene_block", SPHENE_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:spinel_block", SPINEL_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:stroxite_block", STROXITE_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:cut_stroxite_block", CUT_STROXITE_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:tanzanite_block", TANZANITE_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:topaz_block", TOPAZ_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:charged_tungsten_block", CHARGED_TUNGSTEN_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:tungsten_block", TUNGSTEN_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:uranium_block", URANIUM_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:uranium_powder_block", URANIUM_POWDER_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:void_crittered_diopside_block", VOID_CRITTERED_DIOPSIDE_BLOCK, MINERALOGY);

		/* CHISELED MINERAL BLOCKS */
		createBlockItem("deep_trenches:chiseled_silicon_block", CHISELED_SILICON_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:chiseled_silver_block", CHISELED_SILVER_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:chiseled_sugilite_block", CHISELED_SUGILITE_BLOCK, MINERALOGY);

		/* CRYSTALS */
		createBlockItem("deep_trenches:lekralite_crystals", LEKRALITE_CRYSTALS, MINERALOGY);

		createBlockItem("deep_trenches:black_opal_block", BLACK_OPAL_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:budding_black_opal", BUDDING_BLACK_OPAL, MINERALOGY);
		createBlockItem("deep_trenches:black_opal_cluster", BLACK_OPAL_CLUSTER, MINERALOGY);
		createBlockItem("deep_trenches:large_black_opal_bud", LARGE_BLACK_OPAL_BUD, MINERALOGY);
		createBlockItem("deep_trenches:medium_black_opal_bud", MEDIUM_BLACK_OPAL_BUD, MINERALOGY);
		createBlockItem("deep_trenches:small_black_opal_bud", SMALL_BLACK_OPAL_BUD, MINERALOGY);

		createBlockItem("deep_trenches:clinohumite_block", CLINOHUMITE_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:budding_clinohumite", BUDDING_CLINOHUMITE, MINERALOGY);
		createBlockItem("deep_trenches:clinohumite_cluster", CLINOHUMITE_CLUSTER, MINERALOGY);
		createBlockItem("deep_trenches:large_clinohumite_bud", LARGE_CLINOHUMITE_BUD, MINERALOGY);
		createBlockItem("deep_trenches:medium_clinohumite_bud", MEDIUM_CLINOHUMITE_BUD, MINERALOGY);
		createBlockItem("deep_trenches:small_clinohumite_bud", SMALL_CLINOHUMITE_BUD, MINERALOGY);

		createBlockItem("deep_trenches:diamite_block", DIAMITE_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:budding_diamite", BUDDING_DIAMITE, MINERALOGY);
		createBlockItem("deep_trenches:diamite_cluster", DIAMITE_CLUSTER, MINERALOGY);
		createBlockItem("deep_trenches:large_diamite_bud", LARGE_DIAMITE_BUD, MINERALOGY);
		createBlockItem("deep_trenches:medium_diamite_bud", MEDIUM_DIAMITE_BUD, MINERALOGY);
		createBlockItem("deep_trenches:small_diamite_bud", SMALL_DIAMITE_BUD, MINERALOGY);
		createBlockItem("deep_trenches:garnet_block", GARNET_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:budding_garnet", BUDDING_GARNET, MINERALOGY);

		createBlockItem("deep_trenches:garnet_cluster", GARNET_CLUSTER, MINERALOGY);
		createBlockItem("deep_trenches:large_garnet_bud", LARGE_GARNET_BUD, MINERALOGY);
		createBlockItem("deep_trenches:medium_garnet_bud", MEDIUM_GARNET_BUD, MINERALOGY);
		createBlockItem("deep_trenches:small_garnet_bud", SMALL_GARNET_BUD, MINERALOGY);
		createBlockItem("deep_trenches:opal_block", OPAL_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:budding_opal", BUDDING_OPAL, MINERALOGY);

		createBlockItem("deep_trenches:opal_cluster", OPAL_CLUSTER, MINERALOGY);
		createBlockItem("deep_trenches:large_opal_bud", LARGE_OPAL_BUD, MINERALOGY);
		createBlockItem("deep_trenches:medium_opal_bud", MEDIUM_OPAL_BUD, MINERALOGY);
		createBlockItem("deep_trenches:small_opal_bud", SMALL_OPAL_BUD, MINERALOGY);
		createBlockItem("deep_trenches:sapphrite_block", SAPPHRITE_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:budding_sapphrite", BUDDING_SAPPHRITE, MINERALOGY);

		createBlockItem("deep_trenches:sapphrite_cluster", SAPPHRITE_CLUSTER, MINERALOGY);
		createBlockItem("deep_trenches:large_sapphrite_bud", LARGE_SAPPHRITE_BUD, MINERALOGY);
		createBlockItem("deep_trenches:medium_sapphrite_bud", MEDIUM_SAPPHRITE_BUD, MINERALOGY);
		createBlockItem("deep_trenches:small_sapphrite_bud", SMALL_SAPPHRITE_BUD, MINERALOGY);

		createBlockItem("deep_trenches:sugilite_block", SUGILITE_BLOCK, MINERALOGY);
		createBlockItem("deep_trenches:budding_sugilite", BUDDING_SUGILITE, MINERALOGY);
		createBlockItem("deep_trenches:sugilite_cluster", SUGILITE_CLUSTER, MINERALOGY);
		createBlockItem("deep_trenches:large_sugilite_bud", LARGE_SUGILITE_BUD, MINERALOGY);
		createBlockItem("deep_trenches:medium_sugilite_bud", MEDIUM_SUGILITE_BUD, MINERALOGY);
		createBlockItem("deep_trenches:small_sugilite_bud", SMALL_SUGILITE_BUD, MINERALOGY);

		/* POINTED STONES */
		createBlockItem("deep_trenches:pointed_light_opalite", POINTED_LIGHT_OPALITE, MINERALOGY);
		createBlockItem("deep_trenches:pointed_skystone", POINTED_SKYSTONE, MINERALOGY);
		createBlockItem("deep_trenches:twisted_blue_storcerack", TWISTED_BLUE_STORCERACK, MINERALOGY);

		/* SURFACE BLOCKS */
		createBlockItem("deep_trenches:dritean", DRITEAN, MINERALOGY);
		createBlockItem("deep_trenches:enrotium", ENROTIUM, MINERALOGY);
		createBlockItem("deep_trenches:sprilium", SPRILIUM, MINERALOGY);
		createBlockItem("deep_trenches:skysoil", SKYSOIL, MINERALOGY);
		createBlockItem("deep_trenches:mosoil", MOSOIL, MINERALOGY);

		/* FLOWERS */
		createBlockItem("deep_trenches:black_pansy", BLACK_PANSY, PHYTOLOGY);
		createBlockItem("deep_trenches:blue_pansy", BLUE_PANSY, PHYTOLOGY);
		createBlockItem("deep_trenches:blue_poppy", BLUE_POPPY, PHYTOLOGY);
		createBlockItem("deep_trenches:blue_violet", BLUE_VIOLET, PHYTOLOGY);
		createBlockItem("deep_trenches:bonnet_spurge", BONNET_SPURGE, PHYTOLOGY);
		createBlockItem("deep_trenches:brown_pansy", BROWN_PANSY, PHYTOLOGY);
		createBlockItem("deep_trenches:chocolate_cosmos_flower", CHOCOLATE_COSMOS_FLOWER, PHYTOLOGY);
		createBlockItem("deep_trenches:cyan_blue_violet", CYAN_BLUE_VIOLET, PHYTOLOGY);
		createBlockItem("deep_trenches:cycawler", CYCAWLER, PHYTOLOGY);
		createBlockItem("deep_trenches:garden_pinks", GARDEN_PINKS, PHYTOLOGY);
		createBlockItem("deep_trenches:green_pansy", GREEN_PANSY, PHYTOLOGY);
		createBlockItem("deep_trenches:gyldelion_flower", GYLDELION_FLOWER, PHYTOLOGY);
		createBlockItem("deep_trenches:limefork", LIMEFORK, PHYTOLOGY);
		createBlockItem("deep_trenches:marsh_violet", MARSH_VIOLET, PHYTOLOGY);
		createBlockItem("deep_trenches:native_violet", NATIVE_VIOLET, PHYTOLOGY);
		createBlockItem("deep_trenches:opium_poppy", OPIUM_POPPY, PHYTOLOGY);
		createBlockItem("deep_trenches:pink_and_orange_pansy", PINK_AND_ORANGE_PANSY, PHYTOLOGY);
		createBlockItem("deep_trenches:pink_braitor_flower", PINK_BRAITOR_FLOWER, PHYTOLOGY);
		createBlockItem("deep_trenches:pink_marsh_violet", PINK_MARSH_VIOLET, PHYTOLOGY);
		createBlockItem("deep_trenches:pink_rose", PINK_ROSE, PHYTOLOGY);
		createBlockItem("deep_trenches:pink_rose_bush", PINK_ROSE_BUSH, PHYTOLOGY);
		createBlockItem("deep_trenches:poppy", POPPY, PHYTOLOGY);
		createBlockItem("deep_trenches:purple_and_orange_pansy", PURPLE_AND_ORANGE_PANSY, PHYTOLOGY);
		createBlockItem("deep_trenches:red_braitor_flower", RED_BRAITOR_FLOWER, PHYTOLOGY);
		createBlockItem("deep_trenches:red_chocolate_cosmos_flower", RED_CHOCOLATE_COSMOS_FLOWER, PHYTOLOGY);
		createBlockItem("deep_trenches:red_pansy", RED_PANSY, PHYTOLOGY);
		createBlockItem("deep_trenches:red_rose", RED_ROSE, PHYTOLOGY);
		createBlockItem("deep_trenches:rubra_blue_violet", RUBRA_BLUE_VIOLET, PHYTOLOGY);
		createBlockItem("deep_trenches:spidreet", SPIDREET, PHYTOLOGY);
		createBlockItem("deep_trenches:spike_lavender", SPIKE_LAVENDER, PHYTOLOGY);
		createBlockItem("deep_trenches:spridelion", SPRIDELION, PHYTOLOGY);
		createBlockItem("deep_trenches:sproom_spike", SPROOM_SPIKE, PHYTOLOGY);
		createBlockItem("deep_trenches:squisacle", SQUISACLE, PHYTOLOGY);
		createBlockItem("deep_trenches:sweet_violet", SWEET_VIOLET, PHYTOLOGY);
		createBlockItem("deep_trenches:topped_lavender", TOPPED_LAVENDER, PHYTOLOGY);
		createBlockItem("deep_trenches:twisttrap", TWISTTRAP, PHYTOLOGY);
		createBlockItem("deep_trenches:vaslame", VASLAME, PHYTOLOGY);
		createBlockItem("deep_trenches:weepistil", WEEPISTIL, PHYTOLOGY);
		createBlockItem("deep_trenches:weepy_hollower", WEEPY_HOLLOWER, PHYTOLOGY);
		createBlockItem("deep_trenches:white_violet", WHITE_VIOLET, PHYTOLOGY);
		createBlockItem("deep_trenches:wild_pansy", WILD_PANSY, PHYTOLOGY);
		createBlockItem("deep_trenches:yellow_violet", YELLOW_VIOLET, PHYTOLOGY);

		/* LEAVES FLOWERS */
		createBlockItem("deep_trenches:bromya_flower", BROMYA_FLOWER, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_mahoe_flower", BLUE_MAHOE_FLOWER, ARBOROLOGY);
		createBlockItem("deep_trenches:murkantuan_flower", MURKANTUAN_FLOWER, ARBOROLOGY);

		createBlockItem("deep_trenches:rhadi_thorns", RHADI_THORNS, ARBOROLOGY);

		/* TALL FLOWERS */
		createBlockItem("deep_trenches:black_lily", BLACK_LILY, PHYTOLOGY);
		createBlockItem("deep_trenches:bullthorn", BULLTHORN, PHYTOLOGY);
		createBlockItem("deep_trenches:cactlow", CACTLOW, PHYTOLOGY);
		createBlockItem("deep_trenches:clawbulb", CLAWBULB, PHYTOLOGY);
		createBlockItem("deep_trenches:murkstem", MURKSTEM, PHYTOLOGY);
		createBlockItem("deep_trenches:lime_spurge", LIME_SPURGE, PHYTOLOGY);
		createBlockItem("deep_trenches:lupin_flower", LUPIN_FLOWER, PHYTOLOGY);
		createBlockItem("deep_trenches:orange_lily", ORANGE_LILY, PHYTOLOGY);
		createBlockItem("deep_trenches:pigal", PIGAL, PHYTOLOGY);
		createBlockItem("deep_trenches:purpround", PURPROUND, PHYTOLOGY);
		createBlockItem("deep_trenches:sprinly", SPRINLY, PHYTOLOGY);
		createBlockItem("deep_trenches:tall_buckthorn", TALL_BUCKTHORN, PHYTOLOGY);
		createBlockItem("deep_trenches:velvet_lily", VELVET_LILY, PHYTOLOGY);

		/* MOSSES */
		AIRIAL_MOSS = createBlockItem("deep_trenches:airial_moss", DTBlocks.AIRIAL_MOSS, ARBOROLOGY);
		createBlockItem("deep_trenches:ilmium", ILMIUM, ARBOROLOGY);
		createBlockItem("deep_trenches:moss", MOSS, ARBOROLOGY);

		/* PLANTS */
		createBlockItem("deep_trenches:airial_bush", AIRIAL_BUSH, PHYTOLOGY);
		createBlockItem("deep_trenches:buckthorn", BUCKTHORN, PHYTOLOGY);
		createBlockItem("deep_trenches:four_leafed_clover", FOUR_LEAFED_CLOVER, PHYTOLOGY);
		createBlockItem("deep_trenches:fur_plateau", FUR_PLATEAU, PHYTOLOGY);
		createBlockItem("deep_trenches:harshles", HARSHLES, PHYTOLOGY);
		createBlockItem("deep_trenches:ilyine", ILYINE, PHYTOLOGY);
		createBlockItem("deep_trenches:jungle_umbrella", JUNGLE_UMBRELLA, PHYTOLOGY);
		createBlockItem("deep_trenches:lichen", LICHEN, PHYTOLOGY);
		createBlockItem("deep_trenches:mosses", MOSSES, PHYTOLOGY);
		createBlockItem("deep_trenches:pomegranate_bush", POMEGRANATE_BUSH, PHYTOLOGY);
		createBlockItem("deep_trenches:reebloon", REEBLOON, PHYTOLOGY);
		createBlockItem("deep_trenches:sea_buckthorn", SEA_BUCKTHORN, PHYTOLOGY);
		createBlockItem("deep_trenches:skalk", SKALK, PHYTOLOGY);
		createBlockItem("deep_trenches:squish_tips", SQUISH_TIPS, PHYTOLOGY);
		createBlockItem("deep_trenches:three_leafed_clover", THREE_LEAFED_CLOVER, PHYTOLOGY);

		/* MUSHROOMS */
		createBlockItem("deep_trenches:gray_shag_mushroom", GRAY_SHAG_MUSHROOM, PHYTOLOGY);
		createBlockItem("deep_trenches:inky_cap_mushroom", INKY_CAP_MUSHROOM, PHYTOLOGY);
		createBlockItem("deep_trenches:puffball_mushroom", PUFFBALL_MUSHROOM, PHYTOLOGY);
		createBlockItem("deep_trenches:shelf_mushroom", SHELF_MUSHROOM, PHYTOLOGY);
		createBlockItem("deep_trenches:white_mushroom", WHITE_MUSHROOM, PHYTOLOGY);

		/* GIANT VIOLET */
		createBlockItem("deep_trenches:giant_violet", GIANT_VIOLET, PHYTOLOGY);
		createBlockItem("deep_trenches:giant_violet_leaf", GIANT_VIOLET_LEAF, PHYTOLOGY);
		createBlockItem("deep_trenches:giant_violet_petal", GIANT_VIOLET_PETAL, PHYTOLOGY);
		createBlockItem("deep_trenches:giant_violet_pistil", GIANT_VIOLET_PISTIL, PHYTOLOGY);

		/* CORALS */
		createBlockItem("deep_trenches:dead_blackgreen_tree_coral", DEAD_BLACKGREEN_TREE_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_broccoli_coral", DEAD_BROCCOLI_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_bubblegum_coral", DEAD_BUBBLEGUM_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_cabbage_tree_coral", DEAD_CABBAGE_TREE_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_flowertube_coral", DEAD_FLOWERTUBE_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_garnet_spiral_coral", DEAD_GARNET_SPIRAL_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_glow_forest_coral", DEAD_GLOW_FOREST_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_glowtongue_tube_coral", DEAD_GLOWTONGUE_TUBE_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_ivory_coral", DEAD_IVORY_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_lekral_coral", DEAD_LEKRAL_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_lime_brain_coral", DEAD_LIME_BRAIN_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_lophelia_coral", DEAD_LOPHELIA_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_pipe_organ_coral", DEAD_PIPE_ORGAN_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_pipe_organ_tentacles", DEAD_PIPE_ORGAN_TENTACLES, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_red_tree_coral", DEAD_RED_TREE_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_seafan_coral", DEAD_SEAFAN_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_skacur_coral", DEAD_SKACUR_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_straight_willow_coral", DEAD_STRAIGHT_WILLOW_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_sunrise_coral", DEAD_SUNRISE_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_table_coral", DEAD_TABLE_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_thin_blade_coral", DEAD_THIN_BLADE_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_trumpetear_coral", DEAD_TRUMPETEAR_CORAL, SEA_BLOCKS);

		createBlockItem("deep_trenches:dead_blackgreen_tree_coral_block", DEAD_BLACKGREEN_TREE_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_broccoli_coral_block", DEAD_BROCCOLI_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_bubblegum_coral_block", DEAD_BUBBLEGUM_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_cabbage_tree_coral_block", DEAD_CABBAGE_TREE_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_flowertube_coral_block", DEAD_FLOWERTUBE_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_garnet_spiral_coral_block", DEAD_GARNET_SPIRAL_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_glow_forest_coral_block", DEAD_GLOW_FOREST_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_glowtongue_tube_coral_block", DEAD_GLOWTONGUE_TUBE_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_ivory_coral_block", DEAD_IVORY_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_lekral_coral_block", DEAD_LEKRAL_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_lime_brain_coral_block", DEAD_LIME_BRAIN_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_lophelia_coral_block", DEAD_LOPHELIA_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_pipe_organ_coral_block", DEAD_PIPE_ORGAN_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_red_tree_coral_block", DEAD_RED_TREE_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_seafan_coral_block", DEAD_SEAFAN_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_skacur_coral_block", DEAD_SKACUR_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_straight_willow_coral_block", DEAD_STRAIGHT_WILLOW_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_sunrise_coral_block", DEAD_SUNRISE_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_table_coral_block", DEAD_TABLE_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_thin_blade_coral_block", DEAD_THIN_BLADE_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_trumpetear_coral_block", DEAD_TRUMPETEAR_CORAL_BLOCK, SEA_BLOCKS);

		createCoralFan("deep_trenches:dead_blackgreen_tree_coral_fan", DEAD_BLACKGREEN_TREE_CORAL_FAN, DEAD_BLACKGREEN_TREE_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:dead_broccoli_coral_fan", DEAD_BROCCOLI_CORAL_FAN, DEAD_BROCCOLI_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:dead_bubblegum_coral_fan", DEAD_BUBBLEGUM_CORAL_FAN, DEAD_BUBBLEGUM_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:dead_cabbage_tree_coral_fan", DEAD_CABBAGE_TREE_CORAL_FAN, DEAD_CABBAGE_TREE_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:dead_flowertube_coral_fan", DEAD_FLOWERTUBE_CORAL_FAN, DEAD_FLOWERTUBE_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:dead_garnet_spiral_coral_fan", DEAD_GARNET_SPIRAL_CORAL_FAN, DEAD_GARNET_SPIRAL_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:dead_glow_forest_coral_fan", DEAD_GLOW_FOREST_CORAL_FAN, DEAD_GLOW_FOREST_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:dead_glowtongue_tube_coral_fan", DEAD_GLOWTONGUE_TUBE_CORAL_FAN, DEAD_GLOWTONGUE_TUBE_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:dead_ivory_coral_fan", DEAD_IVORY_CORAL_FAN, DEAD_IVORY_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:dead_lekral_coral_fan", DEAD_LEKRAL_CORAL_FAN, DEAD_LEKRAL_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:dead_lime_brain_coral_fan", DEAD_LIME_BRAIN_CORAL_FAN, DEAD_LIME_BRAIN_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:dead_lophelia_coral_fan", DEAD_LOPHELIA_CORAL_FAN, DEAD_LOPHELIA_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:dead_pipe_organ_coral_fan", DEAD_PIPE_ORGAN_CORAL_FAN, DEAD_PIPE_ORGAN_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:dead_red_tree_coral_fan", DEAD_RED_TREE_CORAL_FAN, DEAD_RED_TREE_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:dead_seafan_coral_fan", DEAD_SEAFAN_CORAL_FAN, DEAD_SEAFAN_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:dead_skacur_coral_fan", DEAD_SKACUR_CORAL_FAN, DEAD_SEAFAN_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:dead_straight_willow_coral_fan", DEAD_STRAIGHT_WILLOW_CORAL_FAN, DEAD_STRAIGHT_WILLOW_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:dead_sunrise_coral_fan", DEAD_SUNRISE_CORAL_FAN, DEAD_SUNRISE_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:dead_table_coral_fan", DEAD_TABLE_CORAL_FAN, DEAD_TABLE_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:dead_thin_blade_coral_fan", DEAD_THIN_BLADE_CORAL_FAN, DEAD_THIN_BLADE_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:dead_trumpetear_coral_fan", DEAD_TRUMPETEAR_CORAL_FAN, DEAD_TRUMPETEAR_CORAL_WALL_FAN);

		createBlockItem("deep_trenches:blackgreen_tree_coral", BLACKGREEN_TREE_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:broccoli_coral", BROCCOLI_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:bubblegum_coral", BUBBLEGUM_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:cabbage_tree_coral", CABBAGE_TREE_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:flowertube_coral", FLOWERTUBE_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:garnet_spiral_coral", GARNET_SPIRAL_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:glow_forest_coral", GLOW_FOREST_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:glowtongue_tube_coral", GLOWTONGUE_TUBE_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:ivory_coral", IVORY_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:lekral_coral", LEKRAL_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:lime_brain_coral", LIME_BRAIN_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:lophelia_coral", LOPHELIA_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:pipe_organ_coral", PIPE_ORGAN_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:pipe_organ_tentacles", PIPE_ORGAN_TENTACLES, SEA_BLOCKS);
		createBlockItem("deep_trenches:red_tree_coral", RED_TREE_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:seafan_coral", SEAFAN_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:skacur_coral", SKACUR_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:straight_willow_coral", STRAIGHT_WILLOW_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:sunrise_coral", SUNRISE_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:table_coral", TABLE_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:thin_blade_coral", THIN_BLADE_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:trumpetear_coral", TRUMPETEAR_CORAL, SEA_BLOCKS);

		createBlockItem("deep_trenches:blackgreen_tree_coral_block", BLACKGREEN_TREE_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:broccoli_coral_block", BROCCOLI_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:bubblegum_coral_block", BUBBLEGUM_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:cabbage_tree_coral_block", CABBAGE_TREE_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:flowertube_coral_block", FLOWERTUBE_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:garnet_spiral_coral_block", GARNET_SPIRAL_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:glow_forest_coral_block", GLOW_FOREST_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:glowtongue_tube_coral_block", GLOWTONGUE_TUBE_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:ivory_coral_block", IVORY_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:lekral_coral_block", LEKRAL_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:lime_brain_coral_block", LIME_BRAIN_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:lophelia_coral_block", LOPHELIA_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:pipe_organ_coral_block", PIPE_ORGAN_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:red_tree_coral_block", RED_TREE_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:seafan_coral_block", SEAFAN_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:skacur_coral_block", SKACUR_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:straight_willow_coral_block", STRAIGHT_WILLOW_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:sunrise_coral_block", SUNRISE_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:table_coral_block", TABLE_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:thin_blade_coral_block", THIN_BLADE_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:trumpetear_coral_block", TRUMPETEAR_CORAL_BLOCK, SEA_BLOCKS);

		createCoralFan("deep_trenches:blackgreen_tree_coral_fan", BLACKGREEN_TREE_CORAL_FAN, BLACKGREEN_TREE_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:broccoli_coral_fan", BROCCOLI_CORAL_FAN, BROCCOLI_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:bubblegum_coral_fan", BUBBLEGUM_CORAL_FAN, BUBBLEGUM_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:cabbage_tree_coral_fan", CABBAGE_TREE_CORAL_FAN, CABBAGE_TREE_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:flowertube_coral_fan", FLOWERTUBE_CORAL_FAN, FLOWERTUBE_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:garnet_spiral_coral_fan", GARNET_SPIRAL_CORAL_FAN, GARNET_SPIRAL_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:glow_forest_coral_fan", GLOW_FOREST_CORAL_FAN, GLOW_FOREST_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:glowtongue_tube_coral_fan", GLOWTONGUE_TUBE_CORAL_FAN, GLOWTONGUE_TUBE_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:ivory_coral_fan", IVORY_CORAL_FAN, IVORY_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:lekral_coral_fan", LEKRAL_CORAL_FAN, LEKRAL_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:lime_brain_coral_fan", LIME_BRAIN_CORAL_FAN, LIME_BRAIN_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:lophelia_coral_fan", LOPHELIA_CORAL_FAN, LOPHELIA_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:pipe_organ_coral_fan", PIPE_ORGAN_CORAL_FAN, PIPE_ORGAN_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:red_tree_coral_fan", RED_TREE_CORAL_FAN, RED_TREE_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:seafan_coral_fan", SEAFAN_CORAL_FAN, SEAFAN_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:skacur_coral_fan", SKACUR_CORAL_FAN, SEAFAN_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:straight_willow_coral_fan", STRAIGHT_WILLOW_CORAL_FAN, STRAIGHT_WILLOW_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:sunrise_coral_fan", SUNRISE_CORAL_FAN, SUNRISE_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:table_coral_fan", TABLE_CORAL_FAN, TABLE_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:thin_blade_coral_fan", THIN_BLADE_CORAL_FAN, THIN_BLADE_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:trumpetear_coral_fan", TRUMPETEAR_CORAL_FAN, TRUMPETEAR_CORAL_WALL_FAN);

		/* WOODS */
		createBlockItem("deep_trenches:almond_button", ALMOND_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:anameata_button", ANAMEATA_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:angels_trumpet_button", ANGELS_TRUMPET_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:aquean_button", AQUEAN_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:barshrookle_button", BARSHROOKLE_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:black_birch_button", BLACK_BIRCH_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_mahoe_button", BLUE_MAHOE_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_spruce_button", BLUE_SPRUCE_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:bottlebrush_button", BOTTLEBRUSH_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:bromya_button", BROMYA_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:bubbletree_button", BUBBLETREE_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:calcearb_button", CALCEARB_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:cherry_button", CHERRY_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:chotorn_button", CHOTORN_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:cook_pine_button", COOK_PINE_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:crolood_button", CROLOOD_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_crolood_button", DARK_CROLOOD_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_fuchsitra_button", DARK_FUCHSITRA_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_red_elm_button", DARK_RED_ELM_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:dead_wart_tree_button", DEAD_WART_TREE_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:drigyus_button", DRIGYUS_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:ebony_button", EBONY_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:enderheart_button", ENDERHEART_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:flalm_button", FLALM_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:fruce_button", FRUCE_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:fuchsitra_button", FUCHSITRA_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:fugmos_button", FUGMOS_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:funeranite_button", FUNERANITE_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:ghoshroom_button", GHOSHROOM_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:giant_violet_button", GIANT_VIOLET_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:guaiacum_button", GUAIACUM_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:joshua_button", JOSHUA_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:klinkii_pine_button", KLINKII_PINE_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:melaleuca_button", MELALEUCA_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:murkantuan_button", MURKANTUAN_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:norfolk_pine_button", NORFOLK_PINE_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:obscrus_button", OBSCRUS_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:orhpris_button", ORHPRIS_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:peltogyne_button", PELTOGYNE_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:pin_cherry_button", PIN_CHERRY_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:plum_button", PLUM_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:purfunga_button", PURFUNGA_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:rark_button", RARK_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:red_elm_button", RED_ELM_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:rhadi_button", RHADI_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:sanguart_button", SANGUART_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:scarlet_thiorcen_button", SCARLET_THIORCEN_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:sproom_button", SPROOM_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:sequoia_button", SEQUOIA_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:stortreean_button", STORTREEAN_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:stroomean_button", STROOMEAN_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:sunrise_fungus_button", SUNRISE_FUNGUS_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:tark_button", TARK_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:teak_button", TEAK_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:thundercloud_plum_button", THUNDERCLOUD_PLUM_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:vynhert_button", VYNHERT_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:wart_tree_button", WART_TREE_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:wenge_button", WENGE_BUTTON, ARBOROLOGY);
		createBlockItem("deep_trenches:yew_button", YEW_BUTTON, ARBOROLOGY);

		createBlockItem("deep_trenches:anameata_cap", ANAMEATA_CAP, ARBOROLOGY);
		createBlockItem("deep_trenches:barshrookle_cap", BARSHROOKLE_CAP, ARBOROLOGY);
		createBlockItem("deep_trenches:funeranite_cap", FUNERANITE_CAP, ARBOROLOGY);
		createBlockItem("deep_trenches:ghoshroom_cap", GHOSHROOM_CAP, ARBOROLOGY);
		createBlockItem("deep_trenches:purfunga_cap", PURFUNGA_CAP, ARBOROLOGY);
		createBlockItem("deep_trenches:stroomean_cap", STROOMEAN_CAP, ARBOROLOGY);
		createBlockItem("deep_trenches:sunrise_fungus_cap", SUNRISE_FUNGUS_CAP, ARBOROLOGY);

		createBlockItem("deep_trenches:almond_door", ALMOND_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:anameata_door", ANAMEATA_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:angels_trumpet_door", ANGELS_TRUMPET_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:aquean_door", AQUEAN_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:barshrookle_door", BARSHROOKLE_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:black_birch_door", BLACK_BIRCH_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_mahoe_door", BLUE_MAHOE_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_spruce_door", BLUE_SPRUCE_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:bottlebrush_door", BOTTLEBRUSH_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:bromya_door", BROMYA_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:bubbletree_door", BUBBLETREE_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:calcearb_door", CALCEARB_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:cherry_door", CHERRY_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:chotorn_door", CHOTORN_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:cook_pine_door", COOK_PINE_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:crolood_door", CROLOOD_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_crolood_door", DARK_CROLOOD_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_fuchsitra_door", DARK_FUCHSITRA_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_red_elm_door", DARK_RED_ELM_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:dead_wart_tree_door", DEAD_WART_TREE_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:drigyus_door", DRIGYUS_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:ebony_door", EBONY_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:enderheart_door", ENDERHEART_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:flalm_door", FLALM_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:fruce_door", FRUCE_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:fuchsitra_door", FUCHSITRA_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:fugmos_door", FUGMOS_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:funeranite_door", FUNERANITE_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:ghoshroom_door", GHOSHROOM_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:giant_violet_door", GIANT_VIOLET_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:guaiacum_door", GUAIACUM_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:joshua_door", JOSHUA_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:klinkii_pine_door", KLINKII_PINE_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:melaleuca_door", MELALEUCA_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:murkantuan_door", MURKANTUAN_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:norfolk_pine_door", NORFOLK_PINE_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:obscrus_door", OBSCRUS_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:orhpris_door", ORHPRIS_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:peltogyne_door", PELTOGYNE_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:pin_cherry_door", PIN_CHERRY_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:plum_door", PLUM_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:purfunga_door", PURFUNGA_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:rark_door", RARK_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:red_elm_door", RED_ELM_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:rhadi_door", RHADI_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:sanguart_door", SANGUART_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:scarlet_thiorcen_door", SCARLET_THIORCEN_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:sproom_door", SPROOM_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:sequoia_door", SEQUOIA_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:stortreean_door", STORTREEAN_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:stroomean_door", STROOMEAN_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:sunrise_fungus_door", SUNRISE_FUNGUS_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:tark_door", TARK_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:teak_door", TEAK_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:thundercloud_plum_door", THUNDERCLOUD_PLUM_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:vynhert_door", VYNHERT_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:wart_tree_door", WART_TREE_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:wenge_door", WENGE_DOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:yew_door", YEW_DOOR, ARBOROLOGY);

		createBlockItem("deep_trenches:almond_fence", ALMOND_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:anameata_fence", ANAMEATA_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:angels_trumpet_fence", ANGELS_TRUMPET_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:aquean_fence", AQUEAN_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:barshrookle_fence", BARSHROOKLE_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:black_birch_fence", BLACK_BIRCH_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_mahoe_fence", BLUE_MAHOE_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_spruce_fence", BLUE_SPRUCE_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:bottlebrush_fence", BOTTLEBRUSH_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:bromya_fence", BROMYA_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:bubbletree_fence", BUBBLETREE_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:calcearb_fence", CALCEARB_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:cherry_fence", CHERRY_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:chotorn_fence", CHOTORN_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:cook_pine_fence", COOK_PINE_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:crolood_fence", CROLOOD_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_crolood_fence", DARK_CROLOOD_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_fuchsitra_fence", DARK_FUCHSITRA_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_red_elm_fence", DARK_RED_ELM_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:dead_wart_tree_fence", DEAD_WART_TREE_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:drigyus_fence", DRIGYUS_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:ebony_fence", EBONY_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:enderheart_fence", ENDERHEART_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:flalm_fence", FLALM_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:fruce_fence", FRUCE_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:fuchsitra_fence", FUCHSITRA_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:fugmos_fence", FUGMOS_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:funeranite_fence", FUNERANITE_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:ghoshroom_fence", GHOSHROOM_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:giant_violet_fence", GIANT_VIOLET_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:guaiacum_fence", GUAIACUM_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:joshua_fence", JOSHUA_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:klinkii_pine_fence", KLINKII_PINE_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:melaleuca_fence", MELALEUCA_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:murkantuan_fence", MURKANTUAN_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:norfolk_pine_fence", NORFOLK_PINE_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:obscrus_fence", OBSCRUS_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:orhpris_fence", ORHPRIS_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:peltogyne_fence", PELTOGYNE_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:pin_cherry_fence", PIN_CHERRY_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:plum_fence", PLUM_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:purfunga_fence", PURFUNGA_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:rark_fence", RARK_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:red_elm_fence", RED_ELM_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:rhadi_fence", RHADI_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:sanguart_fence", SANGUART_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:scarlet_thiorcen_fence", SCARLET_THIORCEN_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:sproom_fence", SPROOM_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:sequoia_fence", SEQUOIA_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:stortreean_fence", STORTREEAN_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:stroomean_fence", STROOMEAN_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:sunrise_fungus_fence", SUNRISE_FUNGUS_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:tark_fence", TARK_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:teak_fence", TEAK_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:thundercloud_plum_fence", THUNDERCLOUD_PLUM_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:vynhert_fence", VYNHERT_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:wart_tree_fence", WART_TREE_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:wenge_fence", WENGE_FENCE, ARBOROLOGY);
		createBlockItem("deep_trenches:yew_fence", YEW_FENCE, ARBOROLOGY);

		createBlockItem("deep_trenches:almond_fence_gate", ALMOND_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:anameata_fence_gate", ANAMEATA_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:angels_trumpet_fence_gate", ANGELS_TRUMPET_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:aquean_fence_gate", AQUEAN_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:barshrookle_fence_gate", BARSHROOKLE_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:black_birch_fence_gate", BLACK_BIRCH_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_mahoe_fence_gate", BLUE_MAHOE_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_spruce_fence_gate", BLUE_SPRUCE_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:bottlebrush_fence_gate", BOTTLEBRUSH_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:bromya_fence_gate", BROMYA_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:bubbletree_fence_gate", BUBBLETREE_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:calcearb_fence_gate", CALCEARB_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:cherry_fence_gate", CHERRY_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:chotorn_fence_gate", CHOTORN_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:cook_pine_fence_gate", COOK_PINE_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:crolood_fence_gate", CROLOOD_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_crolood_fence_gate", DARK_CROLOOD_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_fuchsitra_fence_gate", DARK_FUCHSITRA_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_red_elm_fence_gate", DARK_RED_ELM_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:dead_wart_tree_fence_gate", DEAD_WART_TREE_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:drigyus_fence_gate", DRIGYUS_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:ebony_fence_gate", EBONY_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:enderheart_fence_gate", ENDERHEART_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:flalm_fence_gate", FLALM_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:fruce_fence_gate", FRUCE_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:fuchsitra_fence_gate", FUCHSITRA_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:fugmos_fence_gate", FUGMOS_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:funeranite_fence_gate", FUNERANITE_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:ghoshroom_fence_gate", GHOSHROOM_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:giant_violet_fence_gate", GIANT_VIOLET_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:guaiacum_fence_gate", GUAIACUM_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:joshua_fence_gate", JOSHUA_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:klinkii_pine_fence_gate", KLINKII_PINE_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:melaleuca_fence_gate", MELALEUCA_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:murkantuan_fence_gate", MURKANTUAN_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:norfolk_pine_fence_gate", NORFOLK_PINE_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:obscrus_fence_gate", OBSCRUS_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:orhpris_fence_gate", ORHPRIS_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:peltogyne_fence_gate", PELTOGYNE_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:pin_cherry_fence_gate", PIN_CHERRY_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:plum_fence_gate", PLUM_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:purfunga_fence_gate", PURFUNGA_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:rark_fence_gate", RARK_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:red_elm_fence_gate", RED_ELM_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:rhadi_fence_gate", RHADI_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:sanguart_fence_gate", SANGUART_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:scarlet_thiorcen_fence_gate", SCARLET_THIORCEN_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:sproom_fence_gate", SPROOM_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:sequoia_fence_gate", SEQUOIA_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:stortreean_fence_gate", STORTREEAN_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:stroomean_fence_gate", STROOMEAN_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:sunrise_fungus_fence_gate", SUNRISE_FUNGUS_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:tark_fence_gate", TARK_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:teak_fence_gate", TEAK_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:thundercloud_plum_fence_gate", THUNDERCLOUD_PLUM_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:vynhert_fence_gate", VYNHERT_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:wart_tree_fence_gate", WART_TREE_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:wenge_fence_gate", WENGE_FENCE_GATE, ARBOROLOGY);
		createBlockItem("deep_trenches:yew_fence_gate", YEW_FENCE_GATE, ARBOROLOGY);

		createBlockItem("deep_trenches:almond_leaves", ALMOND_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:angels_trumpet_leaves", ANGELS_TRUMPET_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:aquean_leaves", AQUEAN_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:black_birch_leaves", BLACK_BIRCH_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_mahoe_leaves", BLUE_MAHOE_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_spruce_leaves", BLUE_SPRUCE_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:bottlebrush_leaves", BOTTLEBRUSH_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:bromya_leaves", BROMYA_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:calcearb_leaves", CALCEARB_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:cherry_leaves", CHERRY_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:cook_pine_leaves", COOK_PINE_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:crolood_leaves", CROLOOD_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_crolood_leaves", DARK_CROLOOD_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_fuchsitra_leaves", DARK_FUCHSITRA_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_red_elm_leaves", DARK_RED_ELM_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:ebony_leaves", EBONY_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:enderheart_leaves", ENDERHEART_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:fruce_leaves", FRUCE_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:fuchsitra_leaves", FUCHSITRA_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:guaiacum_leaves", GUAIACUM_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:joshua_leaves", JOSHUA_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:klinkii_pine_leaves", KLINKII_PINE_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:melaleuca_leaves", MELALEUCA_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:murkantuan_leaves", MURKANTUAN_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:norfolk_pine_leaves", NORFOLK_PINE_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:obscrus_leaves", OBSCRUS_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:orhpris_leaves", ORHPRIS_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:peltogyne_leaves", PELTOGYNE_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:pin_cherry_leaves", PIN_CHERRY_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:plum_leaves", PLUM_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:rark_leaves", RARK_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:red_elm_leaves", RED_ELM_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:rhadi_leaves", RHADI_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:sanguart_leaves", SANGUART_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:sproom_leaves", SPROOM_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:sequoia_leaves", SEQUOIA_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:stortreean_leaves", STORTREEAN_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:tark_leaves", TARK_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:teak_leaves", TEAK_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:thundercloud_plum_leaves", THUNDERCLOUD_PLUM_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:wenge_leaves", WENGE_LEAVES, ARBOROLOGY);
		createBlockItem("deep_trenches:yew_leaves", YEW_LEAVES, ARBOROLOGY);

		createBlockItem("deep_trenches:almond_log", ALMOND_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:anameata_log", ANAMEATA_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:angels_trumpet_log", ANGELS_TRUMPET_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:aquean_log", AQUEAN_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:barshrookle_log", BARSHROOKLE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:black_birch_log", BLACK_BIRCH_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_mahoe_log", BLUE_MAHOE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_spruce_log", BLUE_SPRUCE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:bottlebrush_log", BOTTLEBRUSH_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:bromya_log", BROMYA_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:bubbletree_log", BUBBLETREE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:calcearb_log", CALCEARB_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:cherry_log", CHERRY_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:chotorn_log", CHOTORN_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:cook_pine_log", COOK_PINE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:crolood_log", CROLOOD_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_crolood_log", DARK_CROLOOD_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_fuchsitra_log", DARK_FUCHSITRA_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_red_elm_log", DARK_RED_ELM_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:dead_wart_tree_log", DEAD_WART_TREE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:drigyus_log", DRIGYUS_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:ebony_log", EBONY_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:enderheart_log", ENDERHEART_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:flalm_stem", FLALM_STEM, ARBOROLOGY);
		createBlockItem("deep_trenches:fruce_log", FRUCE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:fuchsitra_log", FUCHSITRA_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:fugmos_stem", FUGMOS_STEM, ARBOROLOGY);
		createBlockItem("deep_trenches:funeranite_log", FUNERANITE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:ghoshroom_log", GHOSHROOM_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:giant_violet_stem", GIANT_VIOLET_STEM, ARBOROLOGY);
		createBlockItem("deep_trenches:guaiacum_log", GUAIACUM_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:joshua_log", JOSHUA_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:klinkii_pine_log", KLINKII_PINE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:melaleuca_log", MELALEUCA_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:murkantuan_log", MURKANTUAN_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:norfolk_pine_log", NORFOLK_PINE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:obscrus_log", OBSCRUS_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:orhpris_log", ORHPRIS_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:peltogyne_log", PELTOGYNE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:pin_cherry_log", PIN_CHERRY_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:plum_log", PLUM_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:purfunga_log", PURFUNGA_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:rark_log", RARK_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:red_elm_log", RED_ELM_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:rhadi_log", RHADI_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:sanguart_log", SANGUART_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:scarlet_thiorcen_log", SCARLET_THIORCEN_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:sproom_log", SPROOM_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:sequoia_log", SEQUOIA_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stortreean_log", STORTREEAN_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stroomean_log", STROOMEAN_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:sunrise_fungus_log", SUNRISE_FUNGUS_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:tark_log", TARK_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:teak_log", TEAK_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:thundercloud_plum_log", THUNDERCLOUD_PLUM_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:vynhert_log", VYNHERT_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:wart_tree_log", WART_TREE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:wenge_log", WENGE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:mossy_yew_log", MOSSY_YEW_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:yew_log", YEW_LOG, ARBOROLOGY);

		createBlockItem("deep_trenches:almond_planks", ALMOND_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:anameata_planks", ANAMEATA_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:angels_trumpet_planks", ANGELS_TRUMPET_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:aquean_planks", AQUEAN_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:barshrookle_planks", BARSHROOKLE_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:black_birch_planks", BLACK_BIRCH_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_mahoe_planks", BLUE_MAHOE_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_spruce_planks", BLUE_SPRUCE_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:bottlebrush_planks", BOTTLEBRUSH_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:bromya_planks", BROMYA_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:bubbletree_planks", BUBBLETREE_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:calcearb_planks", CALCEARB_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:cherry_planks", CHERRY_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:chotorn_planks", CHOTORN_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:cook_pine_planks", COOK_PINE_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:crolood_planks", CROLOOD_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_crolood_planks", DARK_CROLOOD_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_fuchsitra_planks", DARK_FUCHSITRA_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_red_elm_planks", DARK_RED_ELM_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:dead_wart_tree_planks", DEAD_WART_TREE_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:drigyus_planks", DRIGYUS_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:ebony_planks", EBONY_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:enderheart_planks", ENDERHEART_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:flalm_planks", FLALM_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:fruce_planks", FRUCE_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:fuchsitra_planks", FUCHSITRA_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:fugmos_planks", FUGMOS_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:funeranite_planks", FUNERANITE_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:ghoshroom_planks", GHOSHROOM_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:giant_violet_planks", GIANT_VIOLET_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:guaiacum_planks", GUAIACUM_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:joshua_planks", JOSHUA_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:klinkii_pine_planks", KLINKII_PINE_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:melaleuca_planks", MELALEUCA_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:murkantuan_planks", MURKANTUAN_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:norfolk_pine_planks", NORFOLK_PINE_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:obscrus_planks", OBSCRUS_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:orhpris_planks", ORHPRIS_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:peltogyne_planks", PELTOGYNE_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:pin_cherry_planks", PIN_CHERRY_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:plum_planks", PLUM_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:purfunga_planks", PURFUNGA_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:rark_planks", RARK_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:red_elm_planks", RED_ELM_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:rhadi_planks", RHADI_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:sanguart_planks", SANGUART_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:scarlet_thiorcen_planks", SCARLET_THIORCEN_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:sproom_planks", SPROOM_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:sequoia_planks", SEQUOIA_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:stortreean_planks", STORTREEAN_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:stroomean_planks", STROOMEAN_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:sunrise_fungus_planks", SUNRISE_FUNGUS_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:tark_planks", TARK_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:teak_planks", TEAK_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:thundercloud_plum_planks", THUNDERCLOUD_PLUM_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:vynhert_planks", VYNHERT_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:wart_tree_planks", WART_TREE_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:wenge_planks", WENGE_PLANKS, ARBOROLOGY);
		createBlockItem("deep_trenches:yew_planks", YEW_PLANKS, ARBOROLOGY);

		createBlockItem("deep_trenches:almond_pressure_plate", ALMOND_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:anameata_pressure_plate", ANAMEATA_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:angels_trumpet_pressure_plate", ANGELS_TRUMPET_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:aquean_pressure_plate", AQUEAN_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:barshrookle_pressure_plate", BARSHROOKLE_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:black_birch_pressure_plate", BLACK_BIRCH_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_mahoe_pressure_plate", BLUE_MAHOE_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_spruce_pressure_plate", BLUE_SPRUCE_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:bottlebrush_pressure_plate", BOTTLEBRUSH_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:bromya_pressure_plate", BROMYA_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:bubbletree_pressure_plate", BUBBLETREE_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:calcearb_pressure_plate", CALCEARB_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:cherry_pressure_plate", CHERRY_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:chotorn_pressure_plate", CHOTORN_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:cook_pine_pressure_plate", COOK_PINE_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:crolood_pressure_plate", CROLOOD_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_crolood_pressure_plate", DARK_CROLOOD_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_fuchsitra_pressure_plate", DARK_FUCHSITRA_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_red_elm_pressure_plate", DARK_RED_ELM_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:dead_wart_tree_pressure_plate", DEAD_WART_TREE_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:drigyus_pressure_plate", DRIGYUS_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:ebony_pressure_plate", EBONY_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:enderheart_pressure_plate", ENDERHEART_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:flalm_pressure_plate", FLALM_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:fruce_pressure_plate", FRUCE_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:fuchsitra_pressure_plate", FUCHSITRA_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:fugmos_pressure_plate", FUGMOS_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:funeranite_pressure_plate", FUNERANITE_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:ghoshroom_pressure_plate", GHOSHROOM_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:giant_violet_pressure_plate", GIANT_VIOLET_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:guaiacum_pressure_plate", GUAIACUM_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:joshua_pressure_plate", JOSHUA_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:klinkii_pine_pressure_plate", KLINKII_PINE_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:melaleuca_pressure_plate", MELALEUCA_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:murkantuan_pressure_plate", MURKANTUAN_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:norfolk_pine_pressure_plate", NORFOLK_PINE_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:obscrus_pressure_plate", OBSCRUS_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:orhpris_pressure_plate", ORHPRIS_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:peltogyne_pressure_plate", PELTOGYNE_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:pin_cherry_pressure_plate", PIN_CHERRY_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:plum_pressure_plate", PLUM_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:purfunga_pressure_plate", PURFUNGA_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:rark_pressure_plate", RARK_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:red_elm_pressure_plate", RED_ELM_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:rhadi_pressure_plate", RHADI_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:sanguart_pressure_plate", SANGUART_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:scarlet_thiorcen_pressure_plate", SCARLET_THIORCEN_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:sproom_pressure_plate", SPROOM_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:sequoia_pressure_plate", SEQUOIA_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:stortreean_pressure_plate", STORTREEAN_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:stroomean_pressure_plate", STROOMEAN_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:sunrise_fungus_pressure_plate", SUNRISE_FUNGUS_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:tark_pressure_plate", TARK_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:teak_pressure_plate", TEAK_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:thundercloud_plum_pressure_plate", THUNDERCLOUD_PLUM_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:vynhert_pressure_plate", VYNHERT_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:wart_tree_pressure_plate", WART_TREE_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:wenge_pressure_plate", WENGE_PRESSURE_PLATE, ARBOROLOGY);
		createBlockItem("deep_trenches:yew_pressure_plate", YEW_PRESSURE_PLATE, ARBOROLOGY);

		createBlockItem("deep_trenches:almond_sapling", ALMOND_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:anameata_sapling", ANAMEATA_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:angels_trumpet_sapling", ANGELS_TRUMPET_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:aquean_sapling", AQUEAN_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:barshrookle_sapling", BARSHROOKLE_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:black_birch_sapling", BLACK_BIRCH_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_mahoe_sapling", BLUE_MAHOE_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_spruce_sapling", BLUE_SPRUCE_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:bottlebrush_sapling", BOTTLEBRUSH_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:bromya_sapling", BROMYA_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:bubbletree_sapling", BUBBLETREE_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:calcearb_sapling", CALCEARB_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:cherry_sapling", CHERRY_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:cook_pine_sapling", COOK_PINE_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:crolood_sapling", CROLOOD_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_crolood_sapling", DARK_CROLOOD_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_fuchsitra_sapling", DARK_FUCHSITRA_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_red_elm_sapling", DARK_RED_ELM_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:ebony_sapling", EBONY_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:enderheart_sapling", ENDERHEART_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:fruce_sapling", FRUCE_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:fuchsitra_sapling", FUCHSITRA_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:funeranite_sapling", FUNERANITE_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:ghoshroom_sapling", GHOSHROOM_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:guaiacum_sapling", GUAIACUM_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:joshua_sapling", JOSHUA_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:klinkii_pine_sapling", KLINKII_PINE_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:melaleuca_sapling", MELALEUCA_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:murkantuan_sapling", MURKANTUAN_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:norfolk_pine_sapling", NORFOLK_PINE_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:orhpris_sapling", ORHPRIS_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:peltogyne_sapling", PELTOGYNE_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:pin_cherry_sapling", PIN_CHERRY_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:plum_sapling", PLUM_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:purfunga_sapling", PURFUNGA_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:rark_sapling", RARK_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:red_elm_sapling", RED_ELM_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:rhadi_sapling", RHADI_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:sanguart_sapling", SANGUART_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:sproom_sapling", SPROOM_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:sequoia_sapling", SEQUOIA_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:stortreean_sapling", STORTREEAN_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:stroomean_sapling", STROOMEAN_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:sunrise_fungus_sapling", SUNRISE_FUNGUS_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:tark_sapling", TARK_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:teak_sapling", TEAK_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:thundercloud_plum_sapling", THUNDERCLOUD_PLUM_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:vynhert_sapling", VYNHERT_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:wenge_sapling", WENGE_SAPLING, ARBOROLOGY);
		createBlockItem("deep_trenches:yew_sapling", YEW_SAPLING, ARBOROLOGY);

		createSignItem("deep_trenches:almond_sign", ALMOND_SIGN, ALMOND_WALL_SIGN);
		createSignItem("deep_trenches:anameata_sign", ANAMEATA_SIGN, ANAMEATA_WALL_SIGN);
		createSignItem("deep_trenches:angels_trumpet_sign", ANGELS_TRUMPET_SIGN, ANGELS_TRUMPET_WALL_SIGN);
		createSignItem("deep_trenches:aquean_sign", AQUEAN_SIGN, AQUEAN_WALL_SIGN);
		createSignItem("deep_trenches:barshrookle_sign", BARSHROOKLE_SIGN, BARSHROOKLE_WALL_SIGN);
		createSignItem("deep_trenches:black_birch_sign", BLACK_BIRCH_SIGN, BLACK_BIRCH_WALL_SIGN);
		createSignItem("deep_trenches:blue_mahoe_sign", BLUE_MAHOE_SIGN, BLUE_MAHOE_WALL_SIGN);
		createSignItem("deep_trenches:blue_spruce_sign", BLUE_SPRUCE_SIGN, BLUE_SPRUCE_WALL_SIGN);
		createSignItem("deep_trenches:bottlebrush_sign", BOTTLEBRUSH_SIGN, BOTTLEBRUSH_WALL_SIGN);
		createSignItem("deep_trenches:bromya_sign", BROMYA_SIGN, BROMYA_WALL_SIGN);
		createSignItem("deep_trenches:bubbletree_sign", BUBBLETREE_SIGN, BUBBLETREE_WALL_SIGN);
		createSignItem("deep_trenches:calcearb_sign", CALCEARB_SIGN, CALCEARB_WALL_SIGN);
		createSignItem("deep_trenches:cherry_sign", CHERRY_SIGN, CHERRY_WALL_SIGN);
		createSignItem("deep_trenches:chotorn_sign", CHOTORN_SIGN, CHOTORN_WALL_SIGN);
		createSignItem("deep_trenches:cook_pine_sign", COOK_PINE_SIGN, COOK_PINE_WALL_SIGN);
		createSignItem("deep_trenches:crolood_sign", CROLOOD_SIGN, CROLOOD_WALL_SIGN);
		createSignItem("deep_trenches:dark_crolood_sign", DARK_CROLOOD_SIGN, DARK_CROLOOD_WALL_SIGN);
		createSignItem("deep_trenches:dark_fuchsitra_sign", DARK_FUCHSITRA_SIGN, DARK_FUCHSITRA_WALL_SIGN);
		createSignItem("deep_trenches:dark_red_elm_sign", DARK_RED_ELM_SIGN, DARK_RED_ELM_WALL_SIGN);
		createSignItem("deep_trenches:dead_wart_tree_sign", DEAD_WART_TREE_SIGN, DEAD_WART_TREE_WALL_SIGN);
		createSignItem("deep_trenches:drigyus_sign", DRIGYUS_SIGN, DRIGYUS_WALL_SIGN);
		createSignItem("deep_trenches:ebony_sign", EBONY_SIGN, EBONY_WALL_SIGN);
		createSignItem("deep_trenches:enderheart_sign", ENDERHEART_SIGN, ENDERHEART_WALL_SIGN);
		createSignItem("deep_trenches:flalm_sign", FLALM_SIGN, FLALM_WALL_SIGN);
		createSignItem("deep_trenches:fruce_sign", FRUCE_SIGN, FRUCE_WALL_SIGN);
		createSignItem("deep_trenches:fuchsitra_sign", FUCHSITRA_SIGN, FUCHSITRA_WALL_SIGN);
		createSignItem("deep_trenches:fugmos_sign", FUGMOS_SIGN, FUGMOS_WALL_SIGN);
		createSignItem("deep_trenches:funeranite_sign", FUNERANITE_SIGN, FUNERANITE_WALL_SIGN);
		createSignItem("deep_trenches:ghoshroom_sign", GHOSHROOM_SIGN, GHOSHROOM_WALL_SIGN);
		createSignItem("deep_trenches:giant_violet_sign", GIANT_VIOLET_SIGN, GIANT_VIOLET_WALL_SIGN);
		createSignItem("deep_trenches:guaiacum_sign", GUAIACUM_SIGN, GUAIACUM_WALL_SIGN);
		createSignItem("deep_trenches:joshua_sign", JOSHUA_SIGN, JOSHUA_WALL_SIGN);
		createSignItem("deep_trenches:klinkii_pine_sign", KLINKII_PINE_SIGN, KLINKII_PINE_WALL_SIGN);
		createSignItem("deep_trenches:melaleuca_sign", MELALEUCA_SIGN, MELALEUCA_WALL_SIGN);
		createSignItem("deep_trenches:murkantuan_sign", MURKANTUAN_SIGN, MURKANTUAN_WALL_SIGN);
		createSignItem("deep_trenches:norfolk_pine_sign", NORFOLK_PINE_SIGN, NORFOLK_PINE_WALL_SIGN);
		createSignItem("deep_trenches:obscrus_sign", OBSCRUS_SIGN, OBSCRUS_WALL_SIGN);
		createSignItem("deep_trenches:orhpris_sign", ORHPRIS_SIGN, ORHPRIS_WALL_SIGN);
		createSignItem("deep_trenches:peltogyne_sign", PELTOGYNE_SIGN, PELTOGYNE_WALL_SIGN);
		createSignItem("deep_trenches:pin_cherry_sign", PIN_CHERRY_SIGN, PIN_CHERRY_WALL_SIGN);
		createSignItem("deep_trenches:plum_sign", PLUM_SIGN, PLUM_WALL_SIGN);
		createSignItem("deep_trenches:purfunga_sign", PURFUNGA_SIGN, PURFUNGA_WALL_SIGN);
		createSignItem("deep_trenches:rark_sign", RARK_SIGN, RARK_WALL_SIGN);
		createSignItem("deep_trenches:red_elm_sign", RED_ELM_SIGN, RED_ELM_WALL_SIGN);
		createSignItem("deep_trenches:rhadi_sign", RHADI_SIGN, RHADI_WALL_SIGN);
		createSignItem("deep_trenches:sanguart_sign", SANGUART_SIGN, SANGUART_WALL_SIGN);
		createSignItem("deep_trenches:scarlet_thiorcen_sign", SCARLET_THIORCEN_SIGN, SCARLET_THIORCEN_WALL_SIGN);
		createSignItem("deep_trenches:sproom_sign", SPROOM_SIGN, SPROOM_WALL_SIGN);
		createSignItem("deep_trenches:sequoia_sign", SEQUOIA_SIGN, SEQUOIA_WALL_SIGN);
		createSignItem("deep_trenches:stortreean_sign", STORTREEAN_SIGN, STORTREEAN_WALL_SIGN);
		createSignItem("deep_trenches:stroomean_sign", STROOMEAN_SIGN, STROOMEAN_WALL_SIGN);
		createSignItem("deep_trenches:sunrise_fungus_sign", SUNRISE_FUNGUS_SIGN, SUNRISE_FUNGUS_WALL_SIGN);
		createSignItem("deep_trenches:tark_sign", TARK_SIGN, TARK_WALL_SIGN);
		createSignItem("deep_trenches:teak_sign", TEAK_SIGN, TEAK_WALL_SIGN);
		createSignItem("deep_trenches:thundercloud_plum_sign", THUNDERCLOUD_PLUM_SIGN, THUNDERCLOUD_PLUM_WALL_SIGN);
		createSignItem("deep_trenches:vynhert_sign", VYNHERT_SIGN, VYNHERT_WALL_SIGN);
		createSignItem("deep_trenches:wart_tree_sign", WART_TREE_SIGN, WART_TREE_WALL_SIGN);
		createSignItem("deep_trenches:wenge_sign", WENGE_SIGN, WENGE_WALL_SIGN);
		createSignItem("deep_trenches:yew_sign", YEW_SIGN, YEW_WALL_SIGN);

		createBlockItem("deep_trenches:almond_slab", ALMOND_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:anameata_slab", ANAMEATA_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:angels_trumpet_slab", ANGELS_TRUMPET_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:aquean_slab", AQUEAN_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:barshrookle_slab", BARSHROOKLE_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:black_birch_slab", BLACK_BIRCH_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_mahoe_slab", BLUE_MAHOE_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_spruce_slab", BLUE_SPRUCE_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:bottlebrush_slab", BOTTLEBRUSH_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:bromya_slab", BROMYA_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:bubbletree_slab", BUBBLETREE_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:calcearb_slab", CALCEARB_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:cherry_slab", CHERRY_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:chotorn_slab", CHOTORN_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:cook_pine_slab", COOK_PINE_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:crolood_slab", CROLOOD_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_crolood_slab", DARK_CROLOOD_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_fuchsitra_slab", DARK_FUCHSITRA_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_red_elm_slab", DARK_RED_ELM_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:dead_wart_tree_slab", DEAD_WART_TREE_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:drigyus_slab", DRIGYUS_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:ebony_slab", EBONY_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:enderheart_slab", ENDERHEART_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:flalm_slab", FLALM_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:fruce_slab", FRUCE_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:fuchsitra_slab", FUCHSITRA_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:fugmos_slab", FUGMOS_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:funeranite_slab", FUNERANITE_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:ghoshroom_slab", GHOSHROOM_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:giant_violet_slab", GIANT_VIOLET_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:guaiacum_slab", GUAIACUM_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:joshua_slab", JOSHUA_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:klinkii_pine_slab", KLINKII_PINE_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:melaleuca_slab", MELALEUCA_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:murkantuan_slab", MURKANTUAN_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:norfolk_pine_slab", NORFOLK_PINE_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:obscrus_slab", OBSCRUS_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:orhpris_slab", ORHPRIS_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:peltogyne_slab", PELTOGYNE_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:pin_cherry_slab", PIN_CHERRY_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:plum_slab", PLUM_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:purfunga_slab", PURFUNGA_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:rark_slab", RARK_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:red_elm_slab", RED_ELM_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:rhadi_slab", RHADI_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:sanguart_slab", SANGUART_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:scarlet_thiorcen_slab", SCARLET_THIORCEN_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:sproom_slab", SPROOM_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:sequoia_slab", SEQUOIA_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:stortreean_slab", STORTREEAN_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:stroomean_slab", STROOMEAN_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:sunrise_fungus_slab", SUNRISE_FUNGUS_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:tark_slab", TARK_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:teak_slab", TEAK_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:thundercloud_plum_slab", THUNDERCLOUD_PLUM_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:vynhert_slab", VYNHERT_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:wart_tree_slab", WART_TREE_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:wenge_slab", WENGE_SLAB, ARBOROLOGY);
		createBlockItem("deep_trenches:yew_slab", YEW_SLAB, ARBOROLOGY);

		createBlockItem("deep_trenches:almond_stairs", ALMOND_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:anameata_stairs", ANAMEATA_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:angels_trumpet_stairs", ANGELS_TRUMPET_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:aquean_stairs", AQUEAN_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:barshrookle_stairs", BARSHROOKLE_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:black_birch_stairs", BLACK_BIRCH_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_mahoe_stairs", BLUE_MAHOE_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_spruce_stairs", BLUE_SPRUCE_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:bottlebrush_stairs", BOTTLEBRUSH_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:bromya_stairs", BROMYA_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:bubbletree_stairs", BUBBLETREE_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:calcearb_stairs", CALCEARB_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:cherry_stairs", CHERRY_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:chotorn_stairs", CHOTORN_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:cook_pine_stairs", COOK_PINE_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:crolood_stairs", CROLOOD_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_crolood_stairs", DARK_CROLOOD_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_fuchsitra_stairs", DARK_FUCHSITRA_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_red_elm_stairs", DARK_RED_ELM_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:dead_wart_tree_stairs", DEAD_WART_TREE_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:drigyus_stairs", DRIGYUS_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:ebony_stairs", EBONY_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:enderheart_stairs", ENDERHEART_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:flalm_stairs", FLALM_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:fruce_stairs", FRUCE_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:fuchsitra_stairs", FUCHSITRA_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:fugmos_stairs", FUGMOS_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:funeranite_stairs", FUNERANITE_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:ghoshroom_stairs", GHOSHROOM_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:giant_violet_stairs", GIANT_VIOLET_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:guaiacum_stairs", GUAIACUM_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:joshua_stairs", JOSHUA_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:klinkii_pine_stairs", KLINKII_PINE_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:melaleuca_stairs", MELALEUCA_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:murkantuan_stairs", MURKANTUAN_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:norfolk_pine_stairs", NORFOLK_PINE_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:obscrus_stairs", OBSCRUS_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:orhpris_stairs", ORHPRIS_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:peltogyne_stairs", PELTOGYNE_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:pin_cherry_stairs", PIN_CHERRY_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:plum_stairs", PLUM_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:purfunga_stairs", PURFUNGA_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:rark_stairs", RARK_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:red_elm_stairs", RED_ELM_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:rhadi_stairs", RHADI_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:sanguart_stairs", SANGUART_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:scarlet_thiorcen_stairs", SCARLET_THIORCEN_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:sproom_stairs", SPROOM_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:sequoia_stairs", SANGUART_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:stortreean_stairs", STORTREEAN_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:stroomean_stairs", STROOMEAN_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:sunrise_fungus_stairs", SUNRISE_FUNGUS_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:tark_stairs", TARK_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:teak_stairs", TEAK_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:thundercloud_plum_stairs", THUNDERCLOUD_PLUM_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:vynhert_stairs", VYNHERT_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:wart_tree_stairs", WART_TREE_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:wenge_stairs", WENGE_STAIRS, ARBOROLOGY);
		createBlockItem("deep_trenches:yew_stairs", YEW_STAIRS, ARBOROLOGY);

		createBlockItem("deep_trenches:almond_trapdoor", ALMOND_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:anameata_trapdoor", ANAMEATA_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:angels_trumpet_trapdoor", ANGELS_TRUMPET_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:aquean_trapdoor", AQUEAN_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:barshrookle_trapdoor", BARSHROOKLE_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:black_birch_trapdoor", BLACK_BIRCH_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_mahoe_trapdoor", BLUE_MAHOE_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_spruce_trapdoor", BLUE_SPRUCE_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:bottlebrush_trapdoor", BOTTLEBRUSH_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:bromya_trapdoor", BROMYA_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:bubbletree_trapdoor", BUBBLETREE_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:calcearb_trapdoor", CALCEARB_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:cherry_trapdoor", CHERRY_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:chotorn_trapdoor", CHOTORN_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:cook_pine_trapdoor", COOK_PINE_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:crolood_trapdoor", CROLOOD_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_crolood_trapdoor", DARK_CROLOOD_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_fuchsitra_trapdoor", DARK_FUCHSITRA_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_red_elm_trapdoor", DARK_RED_ELM_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:dead_wart_tree_trapdoor", DEAD_WART_TREE_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:drigyus_trapdoor", DRIGYUS_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:ebony_trapdoor", EBONY_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:enderheart_trapdoor", ENDERHEART_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:flalm_trapdoor", FLALM_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:fruce_trapdoor", FRUCE_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:fuchsitra_trapdoor", FUCHSITRA_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:fugmos_trapdoor", FUGMOS_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:funeranite_trapdoor", FUNERANITE_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:ghoshroom_trapdoor", GHOSHROOM_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:giant_violet_trapdoor", GIANT_VIOLET_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:guaiacum_trapdoor", GUAIACUM_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:joshua_trapdoor", JOSHUA_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:klinkii_pine_trapdoor", KLINKII_PINE_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:melaleuca_trapdoor", MELALEUCA_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:murkantuan_trapdoor", MURKANTUAN_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:norfolk_pine_trapdoor", NORFOLK_PINE_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:obscrus_trapdoor", OBSCRUS_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:orhpris_trapdoor", ORHPRIS_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:peltogyne_trapdoor", PELTOGYNE_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:pin_cherry_trapdoor", PIN_CHERRY_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:plum_trapdoor", PLUM_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:purfunga_trapdoor", PURFUNGA_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:rark_trapdoor", RARK_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:red_elm_trapdoor", RED_ELM_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:rhadi_trapdoor", RHADI_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:sanguart_trapdoor", SANGUART_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:scarlet_thiorcen_trapdoor", SCARLET_THIORCEN_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:sproom_trapdoor", SPROOM_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:sequoia_trapdoor", SEQUOIA_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:stortreean_trapdoor", STORTREEAN_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:stroomean_trapdoor", STROOMEAN_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:sunrise_fungus_trapdoor", SUNRISE_FUNGUS_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:tark_trapdoor", TARK_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:teak_trapdoor", TEAK_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:thundercloud_plum_trapdoor", THUNDERCLOUD_PLUM_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:vynhert_trapdoor", VYNHERT_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:wart_tree_trapdoor", WART_TREE_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:wenge_trapdoor", WENGE_TRAPDOOR, ARBOROLOGY);
		createBlockItem("deep_trenches:yew_trapdoor", YEW_TRAPDOOR, ARBOROLOGY);

		createBlockItem("deep_trenches:almond_wood", ALMOND_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:anameata_wood", ANAMEATA_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:angels_trumpet_wood", ANGELS_TRUMPET_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:aquean_wood", AQUEAN_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:barshrookle_wood", BARSHROOKLE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:black_birch_wood", BLACK_BIRCH_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_mahoe_wood", BLUE_MAHOE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:blue_spruce_wood", BLUE_SPRUCE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:bottlebrush_wood", BOTTLEBRUSH_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:bromya_wood", BROMYA_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:bubbletree_wood", BUBBLETREE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:calcearb_wood", CALCEARB_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:cherry_wood", CHERRY_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:chotorn_wood", CHOTORN_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:cook_pine_wood", COOK_PINE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:crolood_wood", CROLOOD_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_crolood_wood", DARK_CROLOOD_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_fuchsitra_wood", DARK_FUCHSITRA_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:dark_red_elm_wood", DARK_RED_ELM_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:dead_wart_tree_wood", DEAD_WART_TREE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:drigyus_wood", DRIGYUS_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:ebony_wood", EBONY_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:enderheart_wood", ENDERHEART_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:flalm_wood", FLALM_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:fruce_wood", FRUCE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:fuchsitra_wood", FUCHSITRA_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:fugmos_wood", FUGMOS_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:funeranite_wood", FUNERANITE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:ghoshroom_wood", GHOSHROOM_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:giant_violet_wood", GIANT_VIOLET_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:guaiacum_wood", GUAIACUM_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:joshua_wood", JOSHUA_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:klinkii_pine_wood", KLINKII_PINE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:melaleuca_wood", MELALEUCA_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:murkantuan_wood", MURKANTUAN_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:norfolk_pine_wood", NORFOLK_PINE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:obscrus_wood", OBSCRUS_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:orhpris_wood", ORHPRIS_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:peltogyne_wood", PELTOGYNE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:pin_cherry_wood", PIN_CHERRY_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:plum_wood", PLUM_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:purfunga_wood", PURFUNGA_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:rark_wood", RARK_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:red_elm_wood", RED_ELM_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:rhadi_wood", RHADI_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:sanguart_wood", SANGUART_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:scarlet_thiorcen_wood", SCARLET_THIORCEN_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:sproom_wood", SPROOM_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:sequoia_wood", SEQUOIA_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stortreean_wood", STORTREEAN_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stroomean_wood", STROOMEAN_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:sunrise_fungus_wood", SUNRISE_FUNGUS_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:tark_wood", TARK_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:teak_wood", TEAK_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:thundercloud_plum_wood", THUNDERCLOUD_PLUM_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:vynhert_wood", VYNHERT_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:wart_tree_wood", WART_TREE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:wenge_wood", WENGE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:yew_wood", YEW_WOOD, ARBOROLOGY);

		createBlockItem("deep_trenches:stripped_almond_log", STRIPPED_ALMOND_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_anameata_log", STRIPPED_ANAMEATA_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_angels_trumpet_log", STRIPPED_ANGELS_TRUMPET_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_aquean_log", STRIPPED_AQUEAN_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_barshrookle_log", STRIPPED_BARSHROOKLE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_black_birch_log", STRIPPED_BLACK_BIRCH_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_bottlebrush_log", STRIPPED_BOTTLEBRUSH_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_blue_mahoe_log", STRIPPED_BLUE_MAHOE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_blue_spruce_log", STRIPPED_BLUE_SPRUCE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_bromya_log", STRIPPED_BROMYA_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_bubbletree_log", STRIPPED_BUBBLETREE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_calcearb_log", STRIPPED_CALCEARB_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_cherry_log", STRIPPED_CHERRY_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_cook_pine_log", STRIPPED_COOK_PINE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_chotorn_log", STRIPPED_CHOTORN_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_crolood_log", STRIPPED_CROLOOD_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_dark_crolood_log", STRIPPED_DARK_CROLOOD_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_dark_fuchsitra_log", STRIPPED_DARK_FUCHSITRA_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_dark_red_elm_log", STRIPPED_DARK_RED_ELM_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_dead_wart_tree_log", STRIPPED_DEAD_WART_TREE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_drigyus_log", STRIPPED_DRIGYUS_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_ebony_log", STRIPPED_EBONY_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_enderheart_log", STRIPPED_ENDERHEART_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_fruce_log", STRIPPED_FRUCE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_funeranite_log", STRIPPED_FUNERANITE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_fuchsitra_log", STRIPPED_FUCHSITRA_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_fugmos_stem", STRIPPED_FUGMOS_STEM, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_ghoshroom_log", STRIPPED_GHOSHROOM_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_giant_violet_stem", STRIPPED_GIANT_VIOLET_STEM, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_guaiacum_log", STRIPPED_GUAIACUM_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_joshua_log", STRIPPED_JOSHUA_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_klinkii_pine_log", STRIPPED_KLINKII_PINE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_melaleuca_log", STRIPPED_MELALEUCA_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_murkantuan_log", STRIPPED_MURKANTUAN_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_norfolk_pine_log", STRIPPED_NORFOLK_PINE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_obscrus_log", STRIPPED_OBSCRUS_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_orhpris_log", STRIPPED_ORHPRIS_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_peltogyne_log", STRIPPED_PELTOGYNE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_pin_cherry_log", STRIPPED_PIN_CHERRY_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_plum_log", STRIPPED_PLUM_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_purfunga_log", STRIPPED_PURFUNGA_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_rark_log", STRIPPED_RARK_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_red_elm_log", STRIPPED_RED_ELM_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_rhadi_log", STRIPPED_RHADI_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_sanguart_log", STRIPPED_SANGUART_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_scarlet_thiorcen_log", STRIPPED_SCARLET_THIORCEN_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_sequoia_log", STRIPPED_SEQUOIA_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_sproom_log", STRIPPED_SPROOM_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_stortreean_log", STRIPPED_STORTREEAN_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_stroomean_log", STRIPPED_STROOMEAN_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_sunrise_fungus_log", STRIPPED_SUNRISE_FUNGUS_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_tark_log", STRIPPED_TARK_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_teak_log", STRIPPED_TEAK_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_thundercloud_plum_log", STRIPPED_THUNDERCLOUD_PLUM_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_vynhert_log", STRIPPED_VYNHERT_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_wart_tree_log", STRIPPED_WART_TREE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_wenge_log", STRIPPED_WENGE_LOG, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_yew_log", STRIPPED_YEW_LOG, ARBOROLOGY);

		createBlockItem("deep_trenches:stripped_almond_wood", STRIPPED_ALMOND_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_anameata_wood", STRIPPED_ANAMEATA_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_angels_trumpet_wood", STRIPPED_ANGELS_TRUMPET_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_aquean_wood", STRIPPED_AQUEAN_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_barshrookle_wood", STRIPPED_BARSHROOKLE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_black_birch_wood", STRIPPED_BLACK_BIRCH_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_bottlebrush_wood", STRIPPED_BOTTLEBRUSH_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_blue_mahoe_wood", STRIPPED_BLUE_MAHOE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_blue_spruce_wood", STRIPPED_BLUE_SPRUCE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_bromya_wood", STRIPPED_BROMYA_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_bubbletree_wood", STRIPPED_BUBBLETREE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_calcearb_wood", STRIPPED_CALCEARB_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_cherry_wood", STRIPPED_CHERRY_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_chotorn_wood", STRIPPED_CHOTORN_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_cook_pine_wood", STRIPPED_COOK_PINE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_crolood_wood", STRIPPED_CROLOOD_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_dark_crolood_wood", STRIPPED_DARK_CROLOOD_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_dark_fuchsitra_wood", STRIPPED_DARK_FUCHSITRA_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_dark_red_elm_wood", STRIPPED_DARK_RED_ELM_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_dead_wart_tree_wood", STRIPPED_DEAD_WART_TREE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_drigyus_wood", STRIPPED_DRIGYUS_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_ebony_wood", STRIPPED_EBONY_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_enderheart_wood", STRIPPED_ENDERHEART_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_flalm_stem", STRIPPED_FLALM_STEM, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_flalm_wood", STRIPPED_FLALM_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_fruce_wood", STRIPPED_FRUCE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_fuchsitra_wood", STRIPPED_FUCHSITRA_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_fugmos_hyphae", STRIPPED_FUGMOS_HYPHAE, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_funeranite_wood", STRIPPED_FUNERANITE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_ghoshroom_wood", STRIPPED_GHOSHROOM_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_giant_violet_wood", STRIPPED_GIANT_VIOLET_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_guaiacum_wood", STRIPPED_GUAIACUM_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_joshua_wood", STRIPPED_JOSHUA_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_klinkii_pine_wood", STRIPPED_KLINKII_PINE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_melaleuca_wood", STRIPPED_MELALEUCA_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_murkantuan_wood", STRIPPED_MURKANTUAN_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_norfolk_pine_wood", STRIPPED_NORFOLK_PINE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_obscrus_wood", STRIPPED_OBSCRUS_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_orhpris_wood", STRIPPED_ORHPRIS_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_peltogyne_wood", STRIPPED_PELTOGYNE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_pin_cherry_wood", STRIPPED_PIN_CHERRY_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_plum_wood", STRIPPED_PLUM_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_purfunga_wood", STRIPPED_PURFUNGA_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_rark_wood", STRIPPED_RARK_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_red_elm_wood", STRIPPED_RED_ELM_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_rhadi_wood", STRIPPED_RHADI_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_sanguart_wood", STRIPPED_SANGUART_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_scarlet_thiorcen_wood", STRIPPED_SCARLET_THIORCEN_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_sequoia_wood", STRIPPED_SEQUOIA_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_sproom_wood", STRIPPED_SPROOM_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_stortreean_wood", STRIPPED_STORTREEAN_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_stroomean_wood", STRIPPED_STROOMEAN_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_sunrise_fungus_wood", STRIPPED_SUNRISE_FUNGUS_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_tark_wood", STRIPPED_TARK_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_teak_wood", STRIPPED_TEAK_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_thundercloud_plum_wood", STRIPPED_THUNDERCLOUD_PLUM_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_vynhert_wood", STRIPPED_VYNHERT_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_wart_tree_wood", STRIPPED_WART_TREE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_wenge_wood", STRIPPED_WENGE_WOOD, ARBOROLOGY);
		createBlockItem("deep_trenches:stripped_yew_wood", STRIPPED_YEW_WOOD, ARBOROLOGY);

		ABYSSOPELAGIC_WATER_BUCKET = createBucket("deep_trenches:abyssopelagic_water_bucket", DTFluids.ABYSSOPELAGIC_WATER);
		ACID_BUCKET = createBucket("deep_trenches:acid_bucket", DTFluids.ACID);
		BATHYPELAGIC_WATER_BUCKET = createBucket("deep_trenches:bathypelagic_water_bucket", DTFluids.BATHYPELAGIC_WATER);
		BRINE_BUCKET = createBucket("deep_trenches:brine_bucket", DTFluids.BRINE);
		CLEAR_WATER_BUCKET = createBucket("deep_trenches:clear_water_bucket", DTFluids.CLEAR_WATER);
		HADOPELAGIC_WATER_BUCKET = createBucket("deep_trenches:hadopelagic_water_bucket", DTFluids.HADOPELAGIC_WATER);
		MESOPELAGIC_WATER_BUCKET = createBucket("deep_trenches:mesopelagic_water_bucket", DTFluids.MESOPELAGIC_WATER);
		STORCEAN_ABYSSOPELAGIC_WATER_BUCKET = createBucket("deep_trenches:storcean_abyssopelagic_water_bucket", DTFluids.STORCEAN_ABYSSOPELAGIC_WATER);
		STORCEAN_BATHYPELAGIC_WATER_BUCKET = createBucket("deep_trenches:storcean_bathypelagic_water_bucket", DTFluids.STORCEAN_BATHYPELAGIC_WATER);
		STORCEAN_ENDERPELAGIC_WATER_BUCKET = createBucket("deep_trenches:storcean_enderpelagic_water_bucket", DTFluids.STORCEAN_ENDERPELAGIC_WATER);
		STORCEAN_GASOPELAGIC_WATER_BUCKET = createBucket("deep_trenches:storcean_gasopelagic_water_bucket", DTFluids.STORCEAN_GASOPELAGIC_WATER);
		STORCEAN_HADOPELAGIC_WATER_BUCKET = createBucket("deep_trenches:storcean_hadopelagic_water_bucket", DTFluids.STORCEAN_HADOPELAGIC_WATER);
		STORCEAN_INFINIPELAGIC_WATER_BUCKET = createBucket("deep_trenches:storcean_infinipelagic_water_bucket", DTFluids.STORCEAN_INFINIPELAGIC_WATER);
		STORCEAN_MESOPELAGIC_WATER_BUCKET = createBucket("deep_trenches:storcean_mesopelagic_water_bucket", DTFluids.STORCEAN_MESOPELAGIC_WATER);
		STORCEAN_VIRDIPELAGIC_WATER_BUCKET = createBucket("deep_trenches:storcean_virdipelagic_water_bucket", DTFluids.STORCEAN_VIRDIPELAGIC_WATER);
		STORCEAN_WATER_BUCKET = createBucket("deep_trenches:storcean_water_bucket", DTFluids.STORCEAN_WATER);

		BARBELED_LOOSEJAW_BUCKET = createFishBucket("deep_trenches:barbeled_loosejaw_bucket", DTEntityTypes.BARBELED_LOOSEJAW);
		BETTA_BUCKET = createFishBucket("deep_trenches:betta_bucket", DTEntityTypes.BETTA);
		BLACK_LOOSEJAW_BUCKET = createFishBucket("deep_trenches:black_loosejaw_bucket", DTEntityTypes.BLACK_LOOSEJAW);
		LIGHT_LOOSEJAW_BUCKET = createFishBucket("deep_trenches:light_loosejaw_bucket", DTEntityTypes.LIGHT_LOOSEJAW);
		DEEP_LAKE_BETTA_BUCKET = createFishBucket("deep_trenches:deep_lake_betta_bucket", DTEntityTypes.DEEP_LAKE_BETTA, DTEntityTypeTags.TRELOSIAGNUS_BETTA);
		GIANT_HATCHETFISH_BUCKET = createFishBucket("deep_trenches:giant_hatchetfish_bucket", DTEntityTypes.GIANT_HATCHETFISH,  DTEntityTypeTags.ARGYROPELECUS_GIGAS);
		SMALLTOOTH_DRAGONFISH_BUCKET = createFishBucket("deep_trenches:smalltooth_dragonfish_bucket", DTEntityTypes.SMALLTOOTH_DRAGONFISH, DTEntityTypeTags.PACHYSTOMIAS_MICRODON);

		/* SPAWN EGGS */
		BARBELED_LOOSEJAW_SPAWN_EGG = createSpawnEgg("deep_trenches:barbeled_loosejaw_spawn_egg", DTEntityTypes.BARBELED_LOOSEJAW, 921113, 15859744);
		BETTA_SPAWN_EGG = createSpawnEgg("deep_trenches:betta_spawn_egg", DTEntityTypes.BETTA,7347502, 9183521);
		BLACK_LOOSEJAW_SPAWN_EGG = createSpawnEgg("deep_trenches:black_loosejaw_spawn_egg", DTEntityTypes.BLACK_LOOSEJAW,2102566, 11010053);
		LIGHT_LOOSEJAW_SPAWN_EGG = createSpawnEgg("deep_trenches:light_loosejaw_spawn_egg", DTEntityTypes.LIGHT_LOOSEJAW,1643048, 4836351);
		STASP_SPAWN_EGG = createSpawnEgg("deep_trenches:stasp_spawn_egg", DTEntityTypes.STASP, 2695792, 5124510);

		DEEP_LAKE_BETTA_SPAWN_EGG = createSpawnEgg("deep_trenches:deep_lake_betta_spawn_egg", DTEntityTypes.DEEP_LAKE_BETTA, DTEntityTypeTags.TRELOSIAGNUS_BETTA, 1189390, 5013319);
		GIANT_HATCHETFISH_SPAWN_EGG = createSpawnEgg("deep_trenches:giant_hatchetfish_spawn_egg", DTEntityTypes.GIANT_HATCHETFISH, DTEntityTypeTags.ARGYROPELECUS_GIGAS, 9870757, 12311039);
		SMALLTOOTH_DRAGONFISH_SPAWN_EGG = createSpawnEgg("deep_trenches:smalltooth_dragonfish_spawn_egg", DTEntityTypes.SMALLTOOTH_DRAGONFISH, DTEntityTypeTags.PACHYSTOMIAS_MICRODON, 1250598, 16728832);

		/* FRUITS */
		ALMOND = createFood("deep_trenches:almond", SWEET_BERRIES);
		ALMOND_DRUPE = createFood("deep_trenches:almond_drupe", SWEET_BERRIES);
		AQUEAN_SAP = createItem("deep_trenches:aquean_sap", MISC);
		BOTTLE_OF_AQUEAN_SAP = createItem("deep_trenches:bottle_of_aquean_sap", MISC);
		CHERRY = createFood("deep_trenches:cherry", SWEET_BERRIES);
		CROLOOD_FRUIT = createFood("deep_trenches:crolood_fruit", APPLE);
		DARK_CROLOOD_FRUIT = createFood("deep_trenches:dark_crolood_fruit", APPLE);
		PERSIMMON_FRUIT = createFood("deep_trenches:persimmon_fruit", APPLE);
		PIN_CHERRY = createFood("deep_trenches:pin_cherry", SWEET_BERRIES);
		PLUM = createFood("deep_trenches:plum", APPLE);
		THUNDERCLOUD_PLUM = createFood("deep_trenches:thundercloud_plum", APPLE);

		/* BOAT */
		ALMOND_BOAT = createBoat("deep_trenches:almond_boat", DTBoatTypes.ALMOND);
		ANAMEATA_BOAT = createBoat("deep_trenches:anameata_boat", DTBoatTypes.ANAMEATA);
		ANGELS_TRUMPET_BOAT = createBoat("deep_trenches:angels_trumpet_boat", DTBoatTypes.ANGELS_TRUMPET);
		AQUEAN_BOAT = createBoat("deep_trenches:aquean_boat", DTBoatTypes.AQUEAN);
		BARSHROOKLE_BOAT = createBoat("deep_trenches:barshrookle_boat", DTBoatTypes.BARSHROOKLE);
		BLACK_BIRCH_BOAT = createBoat("deep_trenches:black_birch_boat", DTBoatTypes.BLACK_BIRCH);
		BLUE_MAHOE_BOAT = createBoat("deep_trenches:blue_mahoe_boat", DTBoatTypes.BLUE_MAHOE);
		BLUE_SPRUCE_BOAT = createBoat("deep_trenches:blue_spruce_boat", DTBoatTypes.BLUE_SPRUCE);
		BOTTLEBRUSH_BOAT = createBoat("deep_trenches:bottlebrush_boat", DTBoatTypes.BOTTLEBRUSH);
		BROMYA_BOAT = createBoat("deep_trenches:bromya_boat", DTBoatTypes.BROMYA);
		BUBBLETREE_BOAT = createBoat("deep_trenches:bubbletree_boat", DTBoatTypes.BUBBLETREE);
		CALCEARB_BOAT = createBoat("deep_trenches:calcearb_boat", DTBoatTypes.CALCEARB);
		CHERRY_BOAT = createBoat("deep_trenches:cherry_boat", DTBoatTypes.CHERRY);
		CHOTORN_BOAT = createBoat("deep_trenches:chotorn_boat", DTBoatTypes.CHOTORN);
		COOK_PINE_BOAT = createBoat("deep_trenches:cook_pine_boat", DTBoatTypes.COOK_PINE);
		CROLOOD_BOAT = createBoat("deep_trenches:crolood_boat", DTBoatTypes.CROLOOD);
		DARK_CROLOOD_BOAT = createBoat("deep_trenches:dark_crolood_boat", DTBoatTypes.DARK_CROLOOD);
		DARK_FUCHSITRA_BOAT = createBoat("deep_trenches:dark_fuchsitra_boat", DTBoatTypes.DARK_FUCHSITRA);
		DARK_RED_ELM_BOAT = createBoat("deep_trenches:dark_red_elm_boat", DTBoatTypes.DARK_RED_ELM);
		DEAD_WART_TREE_BOAT = createBoat("deep_trenches:dead_wart_tree_boat", DTBoatTypes.DEAD_WART_TREE);
		DRIGYUS_BOAT = createBoat("deep_trenches:drigyus_boat", DTBoatTypes.DRIGYUS);
		EBONY_BOAT = createBoat("deep_trenches:ebony_boat", DTBoatTypes.EBONY);
		ENDERHEART_BOAT = createBoat("deep_trenches:enderheart_boat", DTBoatTypes.ENDERHEART);
		FLALM_BOAT = createBoat("deep_trenches:flalm_boat", DTBoatTypes.FLALM);
		FRUCE_BOAT = createBoat("deep_trenches:fruce_boat", DTBoatTypes.FRUCE);
		FUCHSITRA_BOAT = createBoat("deep_trenches:fuchsitra_boat", DTBoatTypes.FUCHSITRA);
		FUGMOS_BOAT = createBoat("deep_trenches:fugmos_boat", DTBoatTypes.FUGMOS);
		FUNERANITE_BOAT = createBoat("deep_trenches:funeranite_boat", DTBoatTypes.FUNERANITE);
		GHOSHROOM_BOAT = createBoat("deep_trenches:ghoshroom_boat", DTBoatTypes.GHOSHROOM);
		GIANT_VIOLET_BOAT = createBoat("deep_trenches:giant_violet_boat", DTBoatTypes.GIANT_VIOLET);
		GUAIACUM_BOAT = createBoat("deep_trenches:guaiacum_boat", DTBoatTypes.GUAIACUM);
		JOSHUA_BOAT = createBoat("deep_trenches:joshua_boat", DTBoatTypes.JOSHUA);
		KLINKII_PINE_BOAT = createBoat("deep_trenches:klinkii_pine_boat", DTBoatTypes.KLINKII_PINE);
		MELALEUCA_BOAT = createBoat("deep_trenches:melaleuca_boat", DTBoatTypes.MELALEUCA);
		MURKANTUAN_BOAT = createBoat("deep_trenches:murkantuan_boat", DTBoatTypes.MURKANTUAN);
		NORFOLK_PINE_BOAT = createBoat("deep_trenches:norfolk_pine_boat", DTBoatTypes.NORFOLK_PINE);
		OBSCRUS_BOAT = createBoat("deep_trenches:obscrus_boat", DTBoatTypes.OBSCRUS);
		ORHPRIS_BOAT = createBoat("deep_trenches:orhpris_boat", DTBoatTypes.ORHPRIS);
		PELTOGYNE_BOAT = createBoat("deep_trenches:peltogyne_boat", DTBoatTypes.PELTOGYNE);
		PIN_CHERRY_BOAT = createBoat("deep_trenches:pin_cherry_boat", DTBoatTypes.PIN_CHERRY);
		PLUM_BOAT = createBoat("deep_trenches:plum_boat", DTBoatTypes.PLUM);
		PURFUNGA_BOAT = createBoat("deep_trenches:purfunga_boat", DTBoatTypes.PURFUNGA);
		RARK_BOAT = createBoat("deep_trenches:rark_boat", DTBoatTypes.RARK);
		RED_ELM_BOAT = createBoat("deep_trenches:red_elm_boat", DTBoatTypes.RED_ELM);
		RHADI_BOAT = createBoat("deep_trenches:rhadi_boat", DTBoatTypes.RHADI);
		SANGUART_BOAT = createBoat("deep_trenches:sanguart_boat", DTBoatTypes.SANGUART);
		SCARLET_THIORCEN_BOAT = createBoat("deep_trenches:scarlet_thiorcen_boat", DTBoatTypes.SCARLET_THIORCEN);
		SEQUOIA_BOAT = createBoat("deep_trenches:sequoia_boat", DTBoatTypes.SEQUOIA);
		SPROOM_BOAT = createBoat("deep_trenches:sproom_boat", DTBoatTypes.SPROOM);
		STORTREEAN_BOAT = createBoat("deep_trenches:stortreean_boat", DTBoatTypes.STORTREEAN);
		STROOMEAN_BOAT = createBoat("deep_trenches:stroomean_boat", DTBoatTypes.STROOMEAN);
		SUNRISE_FUNGUS_BOAT = createBoat("deep_trenches:sunrise_fungus_boat", DTBoatTypes.SUNRISE_FUNGUS);
		TARK_BOAT = createBoat("deep_trenches:tark_boat", DTBoatTypes.TARK);
		TEAK_BOAT = createBoat("deep_trenches:teak_boat", DTBoatTypes.TEAK);
		THUNDERCLOUD_PLUM_BOAT = createBoat("deep_trenches:thundercloud_plum_boat", DTBoatTypes.THUNDERCLOUD_PLUM);
		VYNHERT_BOAT = createBoat("deep_trenches:vynhert_boat", DTBoatTypes.VYNHERT);
		WART_TREE_BOAT = createBoat("deep_trenches:wart_tree_boat", DTBoatTypes.WART_TREE);
		WENGE_BOAT = createBoat("deep_trenches:wenge_boat", DTBoatTypes.WENGE);
		YEW_BOAT = createBoat("deep_trenches:yew_boat", DTBoatTypes.YEW);

		/* STICK */
		ALMOND_STICK = createItem("deep_trenches:almond_stick", ARBOROLOGY);
		ANAMEATA_STICK = createItem("deep_trenches:anameata_stick", ARBOROLOGY);
		ANGELS_TRUMPET_STICK = createItem("deep_trenches:angels_trumpet_stick", ARBOROLOGY);
		AQUEAN_STICK = createItem("deep_trenches:aquean_stick", ARBOROLOGY);
		BARSHROOKLE_STICK = createItem("deep_trenches:barshrookle_stick", ARBOROLOGY);
		BLACK_BIRCH_STICK = createItem("deep_trenches:black_birch_stick", ARBOROLOGY);
		BLUE_MAHOE_STICK = createItem("deep_trenches:blue_mahoe_stick", ARBOROLOGY);
		BLUE_SPRUCE_STICK = createItem("deep_trenches:blue_spruce_stick", ARBOROLOGY);
		BOTTLEBRUSH_STICK = createItem("deep_trenches:bottlebrush_stick", ARBOROLOGY);
		BROMYA_STICK = createItem("deep_trenches:bromya_stick", ARBOROLOGY);
		BUBBLETREE_STICK = createItem("deep_trenches:bubbletree_stick", ARBOROLOGY);
		CALCEARB_STICK = createItem("deep_trenches:calcearb_stick", ARBOROLOGY);
		CHERRY_STICK = createItem("deep_trenches:cherry_stick", ARBOROLOGY);
		CHOTORN_STICK = createItem("deep_trenches:chotorn_stick", ARBOROLOGY);
		COOK_PINE_STICK = createItem("deep_trenches:cook_pine_stick", ARBOROLOGY);
		CROLOOD_STICK = createItem("deep_trenches:crolood_stick", ARBOROLOGY);
		DARK_CROLOOD_STICK = createItem("deep_trenches:dark_crolood_stick", ARBOROLOGY);
		DARK_FUCHSITRA_STICK = createItem("deep_trenches:dark_fuchsitra_stick", ARBOROLOGY);
		DARK_RED_ELM_STICK = createItem("deep_trenches:dark_red_elm_stick", ARBOROLOGY);
		DEAD_WART_TREE_STICK = createItem("deep_trenches:dead_wart_tree_stick", ARBOROLOGY);
		DRIGYUS_STICK = createItem("deep_trenches:drigyus_stick", ARBOROLOGY);
		EBONY_STICK = createItem("deep_trenches:ebony_stick", ARBOROLOGY);
		ENDERHEART_STICK = createItem("deep_trenches:enderheart_stick", ARBOROLOGY);
		FLALM_STICK = createItem("deep_trenches:flalm_stick", ARBOROLOGY);
		FRUCE_STICK = createItem("deep_trenches:fruce_stick", ARBOROLOGY);
		FUCHSITRA_STICK = createItem("deep_trenches:fuchsitra_stick", ARBOROLOGY);
		FUGMOS_STICK = createItem("deep_trenches:fugmos_stick", ARBOROLOGY);
		FUNERANITE_STICK = createItem("deep_trenches:funeranite_stick", ARBOROLOGY);
		GHOSHROOM_STICK = createItem("deep_trenches:ghoshroom_stick", ARBOROLOGY);
		GIANT_VIOLET_STICK = createItem("deep_trenches:giant_violet_stick", ARBOROLOGY);
		GUAIACUM_STICK = createItem("deep_trenches:guaiacum_stick", ARBOROLOGY);
		JOSHUA_STICK = createItem("deep_trenches:joshua_stick", ARBOROLOGY);
		KLINKII_PINE_STICK = createItem("deep_trenches:klinkii_pine_stick", ARBOROLOGY);
		MELALEUCA_STICK = createItem("deep_trenches:melaleuca_stick", ARBOROLOGY);
		GYLDELION_STICK = createItem("deep_trenches:gyldelion_stick", ARBOROLOGY);
		MURKANTUAN_STICK = createItem("deep_trenches:murkantuan_stick", ARBOROLOGY);
		NORFOLK_PINE_STICK = createItem("deep_trenches:norfolk_pine_stick", ARBOROLOGY);
		OBSCRUS_STICK = createItem("deep_trenches:obscrus_stick", ARBOROLOGY);
		ORHPRIS_STICK = createItem("deep_trenches:orhpris_stick", ARBOROLOGY);
		PELTOGYNE_STICK = createItem("deep_trenches:peltogyne_stick", ARBOROLOGY);
		PIN_CHERRY_STICK = createItem("deep_trenches:pin_cherry_stick", ARBOROLOGY);
		PLUM_STICK = createItem("deep_trenches:plum_stick", ARBOROLOGY);
		PURFUNGA_STICK = createItem("deep_trenches:purfunga_stick", ARBOROLOGY);
		RARK_STICK = createItem("deep_trenches:rark_stick", ARBOROLOGY);
		RED_ELM_STICK = createItem("deep_trenches:red_elm_stick", ARBOROLOGY);
		RHADI_STICK = createItem("deep_trenches:rhadi_stick", ARBOROLOGY);
		SANGUART_STICK = createItem("deep_trenches:sanguart_stick", ARBOROLOGY);
		SCARLET_THIORCEN_STICK = createItem("deep_trenches:scarlet_thiorcen_stick", ARBOROLOGY);
		SEQUOIA_STICK = createItem("deep_trenches:sequoia_stick", ARBOROLOGY);
		SPROOM_STICK = createItem("deep_trenches:sproom_stick", ARBOROLOGY);
		STORTREEAN_STICK = createItem("deep_trenches:stortreean_stick", ARBOROLOGY);
		STROOMEAN_STICK = createItem("deep_trenches:stroomean_stick", ARBOROLOGY);
		SUNRISE_FUNGUS_STICK = createItem("deep_trenches:sunrise_fungus_stick", ARBOROLOGY);
		TARK_STICK = createItem("deep_trenches:tark_stick", ARBOROLOGY);
		TEAK_STICK = createItem("deep_trenches:teak_stick", ARBOROLOGY);
		THUNDERCLOUD_PLUM_STICK = createItem("deep_trenches:thundercloud_plum_stick", ARBOROLOGY);
		VYNHERT_STICK = createItem("deep_trenches:vynhert_stick", ARBOROLOGY);
		WART_TREE_STICK = createItem("deep_trenches:wart_tree_stick", ARBOROLOGY);
		WENGE_STICK = createItem("deep_trenches:wenge_stick", ARBOROLOGY);
		YEW_STICK = createItem("deep_trenches:yew_stick", ARBOROLOGY);

		/* FOOD */
		BARBELED_LOOSEJAW = createFood("deep_trenches:barbeled_loosejaw", STORCEAN_FISH);
		BETTA = createFood("deep_trenches:betta", STORCEAN_FISH);
		BLACK_LOOSEJAW = createFood("deep_trenches:black_loosejaw", STORCEAN_FISH);
		DEEP_LAKE_BETTA = createFood("deep_trenches:deep_lake_betta", STORCEAN_FISH);
		GIANT_HATCHETFISH = createFood("deep_trenches:giant_hatchetfish", DTFoodComponents.GIANT_HATCHETFISH);
		LIGHT_LOOSEJAW = createFood("deep_trenches:light_loosejaw", STORCEAN_FISH);
		SMALLTOOTH_DRAGONFISH =  createFood("deep_trenches:smalltooth_dragonfish", STORCEAN_FISH);

		/* COOKED FOOD */
		COOKED_GIANT_HATCHETFISH = createFood("deep_trenches:cooked_giant_hatchetfish", DTFoodComponents.COOKED_GIANT_HATCHETFISH);

		/* GOO's */
		CYAN_BIOLUMINESCENT_GOO = createItem("deep_trenches:cyan_bioluminescent_goo", MISC);
		GREEN_BIOLUMINESCENT_GOO = createItem("deep_trenches:green_bioluminescent_goo", MISC);
		LIGHT_BLUE_BIOLUMINESCENT_GOO = createItem("deep_trenches:light_blue_bioluminescent_goo", MISC);

		/* WEAPONS */
		ADAIGGER = register("deep_trenches:adaigger", new AdaiggerItem(DTToolMaterials.GYLDELION, 4, 4F, new Settings().group(COMBAT)));
		BORON_TROOKENT = register("deep_trenches:boron_trookent", new TrookentItem(DTToolMaterials.BORON, 4, 4F, new Settings().group(COMBAT)));
		MORGANITE_SABER = register("deep_trenches:morganite_saber", new TrookentItem(DTToolMaterials.MORGANITE, 4, 4F, new Settings().group(COMBAT)));
		SAPPHIRE_PRISMACE = register("deep_trenches:sapphire_prismace", new PrismaceItem(new Settings().group(COMBAT)));

		BORON_SWORD = createSword("deep_trenches:boron_sword", DTToolMaterials.BORON, 4, -2.2F);
		CHALCEDONY_SWORD = createSword("deep_trenches:chalcedony_sword", DTToolMaterials.CHALCEDONY, 4, -2.2F);
		ENRON_SWORD = createSword("deep_trenches:enron_sword", DTToolMaterials.ENRON, 3, -2.4F);
		ENSTATITE_SWORD = createSword("deep_trenches:enstatite_sword", DTToolMaterials.ENSTATITE, 3, -2.4F);
		KRALCTIUM_SWORD = createSword("deep_trenches:kralctium_sword", DTToolMaterials.KRALCTIUM, 3, -2.4F);
		SAPPHIRE_SWORD = createSword("deep_trenches:sapphire_sword", DTToolMaterials.SAPPHIRE, 4, -2.2F);
		RUBY_DISTABBER = createSword("deep_trenches:ruby_distabber", DTToolMaterials.RUBY, 3, -2.4F);
		SPHENE_SWORD = createSword("deep_trenches:sphene_sword", DTToolMaterials.SPHENE, 3, -2.4F);
		SPINEL_SWORD = createSword("deep_trenches:spinel_sword", DTToolMaterials.SPINEL, 3, -2.4F);
		STROXITE_SWORD = createSword("deep_trenches:stroxite_sword", DTToolMaterials.STROXITE, 3, -2.4F);
		TANZANITE_SWORD = createSword("deep_trenches:tanzanite_sword", DTToolMaterials.TANZANITE, 3, -2.4F);
		TOPAZ_SWORD = createSword("deep_trenches:topaz_sword", DTToolMaterials.TOPAZ, 3, -2.4F);

		ALMOND_SWORD = createSword("deep_trenches:almond_sword", DTToolMaterials.ALMOND, 3, -2.4F);
		ANAMEATA_SWORD = createSword("deep_trenches:anameata_sword", DTToolMaterials.ANAMEATA, 3, -2.4F);
		ANGELS_TRUMPET_SWORD = createSword("deep_trenches:angels_trumpet_sword", DTToolMaterials.ANGELS_TRUMPET, 3, -2.4F);
		AQUEAN_SWORD = createSword("deep_trenches:aquean_sword", DTToolMaterials.AQUEAN, 3, -2.4F);
		BARSHROOKLE_SWORD = createSword("deep_trenches:barshrookle_sword", DTToolMaterials.BARSHROOKLE, 3, -2.4F);
		BLACK_BIRCH_SWORD = createSword("deep_trenches:black_birch_sword", DTToolMaterials.BLACK_BIRCH, 3, -2.4F);
		BLUE_MAHOE_SWORD = createSword("deep_trenches:blue_mahoe_sword", DTToolMaterials.BLUE_MAHOE, 3, -2.4F);
		BLUE_SPRUCE_SWORD = createSword("deep_trenches:blue_spruce_sword", DTToolMaterials.BLUE_SPRUCE, 3, -2.4F);
		BOTTLEBRUSH_SWORD = createSword("deep_trenches:bottlebrush_sword", DTToolMaterials.BOTTLEBRUSH, 3, -2.4F);
		BROMYA_SWORD = createSword("deep_trenches:bromya_sword", DTToolMaterials.BROMYA, 3, -2.4F);
		BUBBLETREE_SWORD = createSword("deep_trenches:bubbletree_sword", DTToolMaterials.BUBBLETREE, 3, -2.4F);
		CALCEARB_SWORD = createSword("deep_trenches:calcearb_sword", DTToolMaterials.CALCEARB, 3, -2.4F);
		CHERRY_SWORD = createSword("deep_trenches:cherry_sword", DTToolMaterials.CHERRY, 3, -2.4F);
		CHOTORN_SWORD = createSword("deep_trenches:chotorn_sword", DTToolMaterials.CHOTORN, 3, -2.4F);
		COOK_PINE_SWORD = createSword("deep_trenches:cook_pine_sword", DTToolMaterials.COOK_PINE, 3, -2.4F);
		CROLOOD_SWORD = createSword("deep_trenches:crolood_sword", DTToolMaterials.CROLOOD, 3, -2.4F);
		DARK_CROLOOD_SWORD = createSword("deep_trenches:dark_crolood_sword", DTToolMaterials.DARK_CROLOOD, 3, -2.4F);
		DARK_FUCHSITRA_SWORD = createSword("deep_trenches:dark_fuchsitra_sword", DTToolMaterials.DARK_FUCHSITRA, 3, -2.4F);
		DARK_RED_ELM_SWORD = createSword("deep_trenches:dark_red_elm_sword", DTToolMaterials.DARK_RED_ELM, 3, -2.4F);
		DEAD_WART_TREE_SWORD = createSword("deep_trenches:dead_wart_tree_sword", DTToolMaterials.DEAD_WART_TREE, 3, -2.4F);
		DRIGYUS_SWORD = createSword("deep_trenches:drigyus_sword", DTToolMaterials.DRIGYUS, 3, -2.4F);
		EBONY_SWORD = createSword("deep_trenches:ebony_sword", DTToolMaterials.EBONY, 3, -2.4F);
		ENDERHEART_SWORD = createSword("deep_trenches:enderheart_sword", DTToolMaterials.ENDERHEART, 3, -2.4F);
		FLALM_SWORD = createSword("deep_trenches:flalm_sword", DTToolMaterials.FLALM, 3, -2.4F);
		FRUCE_SWORD = createSword("deep_trenches:fruce_sword", DTToolMaterials.FRUCE, 3, -2.4F);
		FUCHSITRA_SWORD = createSword("deep_trenches:fuchsitra_sword", DTToolMaterials.FUCHSITRA, 3, -2.4F);
		FUGMOS_SWORD = createSword("deep_trenches:fugmos_sword", DTToolMaterials.FUGMOS, 3, -2.4F);
		FUNERANITE_SWORD = createSword("deep_trenches:funeranite_sword", DTToolMaterials.FUNERANITE, 3, -2.4F);
		GHOSHROOM_SWORD = createSword("deep_trenches:ghoshroom_sword", DTToolMaterials.GHOSHROOM, 3, -2.4F);
		GIANT_VIOLET_SWORD = createSword("deep_trenches:giant_violet_sword", DTToolMaterials.GIANT_VIOLET, 3, -2.4F);
		GUAIACUM_SWORD = createSword("deep_trenches:guaiacum_sword", DTToolMaterials.GUAIACUM, 3, -2.4F);
		JOSHUA_SWORD = createSword("deep_trenches:joshua_sword", DTToolMaterials.JOSHUA, 3, -2.4F);
		KLINKII_PINE_SWORD = createSword("deep_trenches:klinkii_pine_sword", DTToolMaterials.KLINKII_PINE, 3, -2.4F);
		MELALEUCA_SWORD = createSword("deep_trenches:melaleuca_sword", DTToolMaterials.MELALEUCA, 3, -2.4F);
		MURKANTUAN_SWORD = createSword("deep_trenches:murkantuan_sword", DTToolMaterials.MURKANTUAN, 3, -2.4F);
		NORFOLK_PINE_SWORD = createSword("deep_trenches:norfolk_pine_sword", DTToolMaterials.NORFOLK_PINE, 3, -2.4F);
		OBSCRUS_SWORD = createSword("deep_trenches:obscrus_sword", DTToolMaterials.OBSCRUS, 3, -2.4F);
		ORHPRIS_SWORD = createSword("deep_trenches:orhpris_sword", DTToolMaterials.ORHPRIS, 3, -2.4F);
		PELTOGYNE_SWORD = createSword("deep_trenches:peltogyne_sword", DTToolMaterials.PELTOGYNE, 3, -2.4F);
		PIN_CHERRY_SWORD = createSword("deep_trenches:pin_cherry_sword", DTToolMaterials.PIN_CHERRY, 3, -2.4F);
		PLUM_SWORD = createSword("deep_trenches:plum_sword", DTToolMaterials.PLUM, 3, -2.4F);
		PURFUNGA_SWORD = createSword("deep_trenches:purfunga_sword", DTToolMaterials.PURFUNGA, 3, -2.4F);
		RARK_SWORD = createSword("deep_trenches:rark_sword", DTToolMaterials.RARK, 3, -2.4F);
		RED_ELM_SWORD = createSword("deep_trenches:red_elm_sword", DTToolMaterials.RED_ELM, 3, -2.4F);
		RHADI_SWORD = createSword("deep_trenches:rhadi_sword", DTToolMaterials.RHADI, 3, -2.4F);
		SANGUART_SWORD = createSword("deep_trenches:sanguart_sword", DTToolMaterials.SANGUART, 3, -2.4F);
		SCARLET_THIORCEN_SWORD = createSword("deep_trenches:scarlet_thiorcen_sword", DTToolMaterials.SCARLET_THIORCEN, 3, -2.4F);
		SEQUOIA_SWORD = createSword("deep_trenches:sequoia_sword", DTToolMaterials.SEQUOIA, 3, -2.4F);
		SPROOM_SWORD = createSword("deep_trenches:sproom_sword", DTToolMaterials.SPROOM, 3, -2.4F);
		STORTREEAN_SWORD = createSword("deep_trenches:stortreean_sword", DTToolMaterials.STORTREEAN, 3, -2.4F);
		STROOMEAN_SWORD = createSword("deep_trenches:stroomean_sword", DTToolMaterials.STROOMEAN, 3, -2.4F);
		SUNRISE_FUNGUS_SWORD = createSword("deep_trenches:sunrise_fungus_sword", DTToolMaterials.SUNRISE_FUNGUS, 3, -2.4F);
		TARK_SWORD = createSword("deep_trenches:tark_sword", DTToolMaterials.TARK, 3, -2.4F);
		TEAK_SWORD = createSword("deep_trenches:teak_sword", DTToolMaterials.TEAK, 3, -2.4F);
		THUNDERCLOUD_PLUM_SWORD = createSword("deep_trenches:thundercloud_plum_sword", DTToolMaterials.THUNDERCLOUD_PLUM, 3, -2.4F);
		VYNHERT_SWORD = createSword("deep_trenches:vynhert_sword", DTToolMaterials.VYNHERT, 3, -2.4F);
		WART_TREE_SWORD = createSword("deep_trenches:wart_tree_sword", DTToolMaterials.WART_TREE, 3, -2.4F);
		WENGE_SWORD = createSword("deep_trenches:wenge_sword", DTToolMaterials.WENGE, 3, -2.4F);
		YEW_SWORD = createSword("deep_trenches:yew_sword", DTToolMaterials.YEW, 3, -2.4F);

		AQUAMARINE_SCYTHE = createScythe("deep_trenches:aquamarine_scythe", DTToolMaterials.AQUAMARINE, 7, -2.1F);
		BORON_SCYTHE = createScythe("deep_trenches:boron_scythe", DTToolMaterials.BORON, 7, -2.1F);
		DIOPSIDE_SCYTHE = createScythe("deep_trenches:diopside_scythe", DTToolMaterials.DIOPSIDE, 7, -2.1F);
		GYLDELION_SCYTHE = createScythe("deep_trenches:gyldelion_scythe", DTToolMaterials.GYLDELION, 8, 2.1F);
		NETHERITE_SCYTHE = createScythe("deep_trenches:netherite_scythe", ToolMaterials.NETHERITE, 7, -2.1F);
		RUBY_DISRAPPER = register("deep_trenches:ruby_disripper", new DisripperItem(DTToolMaterials.RUBY, 4, 4F, new Settings().group(COMBAT)));
		SAPPHIRE_SCYTHE = createScythe("deep_trenches:sapphire_scythe", DTToolMaterials.SAPPHIRE, 7, -2.1F);
		SPINEL_SCYTHE = createScythe("deep_trenches:spinel_scythe", DTToolMaterials.SPINEL, 7, -2.1F);
		TANZANITE_SCYTHE = createScythe("deep_trenches:tanzanite_scythe", DTToolMaterials.TANZANITE, 7, -2.1F);
		TOPAZ_SCYTHE = createScythe("deep_trenches:topaz_scythe", DTToolMaterials.TOPAZ, 7, -2.1F);
		VOID_CRITTERED_DIOPSIDE_SCYTHE = createScythe("deep_trenches:void_crittered_diopside_scythe", DTToolMaterials.VOID_CRITTERED_DIOPSIDE, 7, -2.1F);

		AQUAMARINE_STAFF = createStaff("deep_trenches:aquamarine_staff");
		DIOPSIDE_STAFF = createStaff("deep_trenches:diopside_staff");
		SPINEL_STAFF = createStaff("deep_trenches:spinel_staff");
		TANZANITE_STAFF = createStaff("deep_trenches:tanzanite_staff");
		TOPAZ_STAFF = createStaff("deep_trenches:topaz_staff");
		VOID_CRITTERED_DIOPSIDE_STAFF = createStaff("deep_trenches:void_crittered_diopside_staff");

		/* METALLIC TOOLS */
		AQUAMARINE_AXE = createAxe("deep_trenches:aquamarine_axe", DTToolMaterials.AQUAMARINE, 6F, -3.1F);
		AQUAMARINE_HOE = createHoe("deep_trenches:aquamarine_hoe", DTToolMaterials.AQUAMARINE, -2, -1F);
		AQUAMARINE_PICKAXE = createPickaxe("deep_trenches:aquamarine_pickaxe", DTToolMaterials.AQUAMARINE, 1, -2.8F);
		AQUAMARINE_SHOVEL = createShovel("deep_trenches:aquamarine_shovel", DTToolMaterials.AQUAMARINE, 1.5F, -3F);

		BORON_AXE = createAxe("deep_trenches:boron_axe", DTToolMaterials.BORON, 6F, -3.1F);
		BORON_HOE = createHoe("deep_trenches:boron_hoe", DTToolMaterials.BORON, -2, -1F);
		BORON_PICKAXE = createPickaxe("deep_trenches:boron_pickaxe", DTToolMaterials.BORON, 1, -2.8F);
		BORON_SHOVEL = createShovel("deep_trenches:boron_shovel", DTToolMaterials.BORON, 1.5F, -3F);

		CHALCEDONY_AXE = createAxe("deep_trenches:chalcedony_axe", DTToolMaterials.CHALCEDONY, 6F, -3.1F);
		CHALCEDONY_HOE = createHoe("deep_trenches:chalcedony_hoe", DTToolMaterials.CHALCEDONY, -2, -1F);
		CHALCEDONY_PICKAXE = createPickaxe("deep_trenches:chalcedony_pickaxe", DTToolMaterials.CHALCEDONY, 1, -2.8F);
		CHALCEDONY_SHOVEL = createShovel("deep_trenches:chalcedony_shovel", DTToolMaterials.CHALCEDONY, 1.5F, -3F);

		CLINOHUMITE_AXE = createAxe("deep_trenches:clinohumite_axe", DTToolMaterials.CLINOHUMITE, 6F, -3.1F);
		CLINOHUMITE_HOE = createHoe("deep_trenches:clinohumite_hoe", DTToolMaterials.CLINOHUMITE, -2, -1F);
		CLINOHUMITE_PICKAXE = createPickaxe("deep_trenches:clinohumite_pickaxe", DTToolMaterials.CLINOHUMITE, 1, -2.8F);
		CLINOHUMITE_SHOVEL = createShovel("deep_trenches:clinohumite_shovel", DTToolMaterials.CLINOHUMITE, 1.5F, -3F);

		DIOPSIDE_AXE = createAxe("deep_trenches:diopside_axe", DTToolMaterials.DIOPSIDE, 6F, -3.1F);
		DIOPSIDE_HOE = createHoe("deep_trenches:diopside_hoe", DTToolMaterials.DIOPSIDE, -2, -1F);
		DIOPSIDE_PICKAXE = createPickaxe("deep_trenches:diopside_pickaxe", DTToolMaterials.DIOPSIDE, 1, -2.8F);
		DIOPSIDE_SHOVEL = createShovel("deep_trenches:diopside_shovel", DTToolMaterials.DIOPSIDE, 1.5F, -3F);

		ENRON_AXE = createAxe("deep_trenches:enron_axe", DTToolMaterials.ENRON, 6F, -3.1F);
		ENRON_HOE = createHoe("deep_trenches:enron_hoe", DTToolMaterials.ENRON, -2, -1F);
		ENRON_PICKAXE = createPickaxe("deep_trenches:enron_pickaxe", DTToolMaterials.ENRON, 1, -2.8F);
		ENRON_SHOVEL = createShovel("deep_trenches:enron_shovel", DTToolMaterials.ENRON, 1.5F, -3F);

		ENSTATITE_AXE = createAxe("deep_trenches:enstatite_axe", DTToolMaterials.ENSTATITE, 6F, -3.1F);
		ENSTATITE_HOE = createHoe("deep_trenches:enstatite_hoe", DTToolMaterials.ENSTATITE, -2, -1F);
		ENSTATITE_PICKAXE = createPickaxe("deep_trenches:enstatite_pickaxe", DTToolMaterials.ENSTATITE, 1, -2.8F);
		ENSTATITE_SHOVEL = createShovel("deep_trenches:enstatite_shovel", DTToolMaterials.ENSTATITE, 1.5F, -3F);

		GYLDELION_AXE = createAxe("deep_trenches:gyldelion_axe", DTToolMaterials.GYLDELION, 2F, 3.1F);
		GYLDELION_HOE = createHoe("deep_trenches:gyldelion_hoe", DTToolMaterials.GYLDELION, -1, 1F);
		GYLDELION_PICKAXE = createPickaxe("deep_trenches:gyldelion_pickaxe", DTToolMaterials.GYLDELION, 0, 2.8F);
		GYLDELION_SHOVEL = createShovel("deep_trenches:gyldelion_shovel", DTToolMaterials.GYLDELION, 0.5F, 3F);

		KRALCTIUM_AXE = createAxe("deep_trenches:kralctium_axe", DTToolMaterials.KRALCTIUM, 6F, -3.1F);
		KRALCTIUM_HOE = createHoe("deep_trenches:kralctium_hoe", DTToolMaterials.KRALCTIUM, -2, -1F);
		KRALCTIUM_PICKAXE = createPickaxe("deep_trenches:kralctium_pickaxe", DTToolMaterials.KRALCTIUM, 1, -2.8F);
		KRALCTIUM_SHOVEL = createShovel("deep_trenches:kralctium_shovel", DTToolMaterials.KRALCTIUM, 1.5F, -3F);

		MORGANITE_AXE = createAxe("deep_trenches:morganite_axe", DTToolMaterials.MORGANITE, 6F, -3.1F);
		MORGANITE_HOE = createHoe("deep_trenches:morganite_hoe", DTToolMaterials.MORGANITE, -2, -1F);
		MORGANITE_PICKAXE = createPickaxe("deep_trenches:morganite_pickaxe", DTToolMaterials.MORGANITE, 1, -2.8F);
		MORGANITE_SHOVEL = createShovel("deep_trenches:morganite_shovel", DTToolMaterials.MORGANITE, 1.5F, -3F);

		RUBY_DISCARVER = register("deep_trenches:ruby_discarver", new DiscarverItem(DTToolMaterials.RUBY, 1, -2.8F, new Settings().group(TOOLS)));
		RUBY_DISDIGGER = register("deep_trenches:ruby_disdigger", new DisdiggerItem(DTToolMaterials.RUBY, 1.5F, -3F, new Settings().group(TOOLS)));
		RUBY_DISLOGGER = register("deep_trenches:ruby_dislogger", new DisloggerItem(DTToolMaterials.RUBY, 6F, -3.1F, new Settings().group(TOOLS)));
		RUBY_DISTARVEST = register("deep_trenches:ruby_distarvest", new DistarvestItem(DTToolMaterials.RUBY, -2, -1F, new Settings().group(TOOLS)));

		SAPPHIRE_AXE = createAxe("deep_trenches:sapphire_axe", DTToolMaterials.SAPPHIRE, 6F, -3.1F);
		SAPPHIRE_HOE = createHoe("deep_trenches:sapphire_hoe", DTToolMaterials.SAPPHIRE, -2, -1F);
		SAPPHIRE_PICKAXE = createPickaxe("deep_trenches:sapphire_pickaxe", DTToolMaterials.SAPPHIRE, 1, -2.8F);
		SAPPHIRE_SHOVEL = createShovel("deep_trenches:sapphire_shovel", DTToolMaterials.SAPPHIRE, 1.5F, -3F);

		SILVER_AXE = createAxe("deep_trenches:silver_axe", DTToolMaterials.SILVER, 6F, -3.1F);
		SILVER_HOE = createHoe("deep_trenches:silver_hoe", DTToolMaterials.SILVER, -2, -1F);
		SILVER_PICKAXE = createPickaxe("deep_trenches:silver_pickaxe", DTToolMaterials.SILVER, 1, -2.8F);
		SILVER_SHOVEL = createShovel("deep_trenches:silver_shovel", DTToolMaterials.SILVER, 1.5F, -3F);

		SPHENE_AXE = createAxe("deep_trenches:sphene_axe", DTToolMaterials.SPHENE, 6F, -3.1F);
		SPHENE_HOE = createHoe("deep_trenches:sphene_hoe", DTToolMaterials.SPHENE, -2, -1F);
		SPHENE_PICKAXE = createPickaxe("deep_trenches:sphene_pickaxe", DTToolMaterials.SPHENE, 1, -2.8F);
		SPHENE_SHOVEL = createShovel("deep_trenches:sphene_shovel", DTToolMaterials.SPHENE, 1.5F, -3F);

		SPINEL_AXE = createAxe("deep_trenches:spinel_axe", DTToolMaterials.SPINEL, 6F, -3.1F);
		SPINEL_HOE = createHoe("deep_trenches:spinel_hoe", DTToolMaterials.SPINEL, -2, -1F);
		SPINEL_PICKAXE = createPickaxe("deep_trenches:spinel_pickaxe", DTToolMaterials.SPINEL, 1, -2.8F);
		SPINEL_SHOVEL = createShovel("deep_trenches:spinel_shovel", DTToolMaterials.SPINEL, 1.5F, -3F);

		STROXITE_AXE = createAxe("deep_trenches:stroxite_axe", DTToolMaterials.STROXITE, 6F, -3.1F);
		STROXITE_HOE = createHoe("deep_trenches:stroxite_hoe", DTToolMaterials.STROXITE, -2, -1F);
		STROXITE_PICKAXE = createPickaxe("deep_trenches:stroxite_pickaxe", DTToolMaterials.STROXITE, 1, -2.8F);
		STROXITE_SHOVEL = createShovel("deep_trenches:stroxite_shovel", DTToolMaterials.STROXITE, 1.5F, -3F);

		TANZANITE_AXE = createAxe("deep_trenches:tanzanite_axe", DTToolMaterials.TANZANITE, 6F, -3.1F);
		TANZANITE_HOE = createHoe("deep_trenches:tanzanite_hoe", DTToolMaterials.TANZANITE, -2, -1F);
		TANZANITE_PICKAXE = createPickaxe("deep_trenches:tanzanite_pickaxe", DTToolMaterials.TANZANITE, 1, -2.8F);
		TANZANITE_SHOVEL = createShovel("deep_trenches:tanzanite_shovel", DTToolMaterials.TANZANITE, 1.5F, -3F);

		TOPAZ_AXE = createAxe("deep_trenches:topaz_axe", DTToolMaterials.TOPAZ, 6F, -3.1F);
		TOPAZ_HOE = createHoe("deep_trenches:topaz_hoe", DTToolMaterials.TOPAZ, -2, -1F);
		TOPAZ_PICKAXE = createPickaxe("deep_trenches:topaz_pickaxe", DTToolMaterials.TOPAZ, 1, -2.8F);
		TOPAZ_SHOVEL = createShovel("deep_trenches:topaz_shovel", DTToolMaterials.TOPAZ, 1.5F, -3F);

		VOID_CRITTERED_DIOPSIDE_AXE = createAxe("deep_trenches:void_crittered_diopside_axe", DTToolMaterials.VOID_CRITTERED_DIOPSIDE, 6F, -3.1F);
		VOID_CRITTERED_DIOPSIDE_HOE = createHoe("deep_trenches:void_crittered_diopside_hoe", DTToolMaterials.VOID_CRITTERED_DIOPSIDE, -2, -1F);
		VOID_CRITTERED_DIOPSIDE_PICKAXE = createPickaxe("deep_trenches:void_crittered_diopside_pickaxe", DTToolMaterials.VOID_CRITTERED_DIOPSIDE, 1, -2.8F);
		VOID_CRITTERED_DIOPSIDE_SHOVEL = createShovel("deep_trenches:void_crittered_diopside_shovel", DTToolMaterials.VOID_CRITTERED_DIOPSIDE, 1.5F, -3F);

		/* WOODEN TOOLS */
		ALMOND_AXE = createAxe("deep_trenches:almond_axe", DTToolMaterials.ALMOND, 6F, -3.2F);
		ALMOND_HOE = createHoe("deep_trenches:almond_hoe", DTToolMaterials.ALMOND, 0, -3F);
		ALMOND_PICKAXE = createPickaxe("deep_trenches:almond_pickaxe", DTToolMaterials.ALMOND, 1, -2.8F);
		ALMOND_SHOVEL = createShovel("deep_trenches:almond_shovel", DTToolMaterials.ALMOND, 1.5F, -3F);

		ANAMEATA_AXE = createAxe("deep_trenches:anameata_axe", DTToolMaterials.ANAMEATA, 6F, -3.2F);
		ANAMEATA_HOE = createHoe("deep_trenches:anameata_hoe", DTToolMaterials.ANAMEATA, 0, -3F);
		ANAMEATA_PICKAXE = createPickaxe("deep_trenches:anameata_pickaxe", DTToolMaterials.ANAMEATA, 1, -2.8F);
		ANAMEATA_SHOVEL = createShovel("deep_trenches:anameata_shovel", DTToolMaterials.ANAMEATA, 1.5F, -3F);

		ANGELS_TRUMPET_AXE = createAxe("deep_trenches:angels_trumpet_axe", DTToolMaterials.ANGELS_TRUMPET, 6F, -3.2F);
		ANGELS_TRUMPET_HOE = createHoe("deep_trenches:angels_trumpet_hoe", DTToolMaterials.ANGELS_TRUMPET, 0, -3F);
		ANGELS_TRUMPET_PICKAXE = createPickaxe("deep_trenches:angels_trumpet_pickaxe", DTToolMaterials.ANGELS_TRUMPET, 1, -2.8F);
		ANGELS_TRUMPET_SHOVEL = createShovel("deep_trenches:angels_trumpet_shovel", DTToolMaterials.ANGELS_TRUMPET, 1.5F, -3F);

		AQUEAN_AXE = createAxe("deep_trenches:aquean_axe", DTToolMaterials.AQUEAN, 6F, -3.2F);
		AQUEAN_HOE = createHoe("deep_trenches:aquean_hoe", DTToolMaterials.AQUEAN, 0, -3F);
		AQUEAN_PICKAXE = createPickaxe("deep_trenches:aquean_pickaxe", DTToolMaterials.AQUEAN, 1, -2.8F);
		AQUEAN_SHOVEL = createShovel("deep_trenches:aquean_shovel", DTToolMaterials.AQUEAN, 1.5F, -3F);

		BARSHROOKLE_AXE = createAxe("deep_trenches:barshrookle_axe", DTToolMaterials.BARSHROOKLE, 6F, -3.2F);
		BARSHROOKLE_HOE = createHoe("deep_trenches:barshrookle_hoe", DTToolMaterials.BARSHROOKLE, 0, -3F);
		BARSHROOKLE_PICKAXE = createPickaxe("deep_trenches:barshrookle_pickaxe", DTToolMaterials.BARSHROOKLE, 1, -2.8F);
		BARSHROOKLE_SHOVEL = createShovel("deep_trenches:barshrookle_shovel", DTToolMaterials.BARSHROOKLE, 1.5F, -3F);

		BLACK_BIRCH_AXE = createAxe("deep_trenches:black_birch_axe", DTToolMaterials.BLACK_BIRCH, 6F, -3.2F);
		BLACK_BIRCH_HOE = createHoe("deep_trenches:black_birch_hoe", DTToolMaterials.BLACK_BIRCH, 0, -3F);
		BLACK_BIRCH_PICKAXE = createPickaxe("deep_trenches:black_birch_pickaxe", DTToolMaterials.BLACK_BIRCH, 1, -2.8F);
		BLACK_BIRCH_SHOVEL = createShovel("deep_trenches:black_birch_shovel", DTToolMaterials.BLACK_BIRCH, 1.5F, -3F);

		BLUE_MAHOE_AXE = createAxe("deep_trenches:blue_mahoe_axe", DTToolMaterials.BLUE_MAHOE, 6F, -3.2F);
		BLUE_MAHOE_HOE = createHoe("deep_trenches:blue_mahoe_hoe", DTToolMaterials.BLUE_MAHOE, 0, -3F);
		BLUE_MAHOE_PICKAXE = createPickaxe("deep_trenches:blue_mahoe_pickaxe", DTToolMaterials.BLUE_MAHOE, 1, -2.8F);
		BLUE_MAHOE_SHOVEL = createShovel("deep_trenches:blue_mahoe_shovel", DTToolMaterials.BLUE_MAHOE, 1.5F, -3F);

		BLUE_SPRUCE_AXE = createAxe("deep_trenches:blue_spruce_axe", DTToolMaterials.BLUE_SPRUCE, 6F, -3.2F);
		BLUE_SPRUCE_HOE = createHoe("deep_trenches:blue_spruce_hoe", DTToolMaterials.BLUE_SPRUCE, 0, -3F);
		BLUE_SPRUCE_PICKAXE = createPickaxe("deep_trenches:blue_spruce_pickaxe", DTToolMaterials.BLUE_SPRUCE, 1, -2.8F);
		BLUE_SPRUCE_SHOVEL = createShovel("deep_trenches:blue_spruce_shovel", DTToolMaterials.BLUE_SPRUCE, 1.5F, -3F);

		BOTTLEBRUSH_AXE = createAxe("deep_trenches:bottlebrush_axe", DTToolMaterials.BOTTLEBRUSH, 6F, -3.2F);
		BOTTLEBRUSH_HOE = createHoe("deep_trenches:bottlebrush_hoe", DTToolMaterials.BOTTLEBRUSH, 0, -3F);
		BOTTLEBRUSH_PICKAXE = createPickaxe("deep_trenches:bottlebrush_pickaxe", DTToolMaterials.BOTTLEBRUSH, 1, -2.8F);
		BOTTLEBRUSH_SHOVEL = createShovel("deep_trenches:bottlebrush_shovel", DTToolMaterials.BOTTLEBRUSH, 1.5F, -3F);

		BROMYA_AXE = createAxe("deep_trenches:bromya_axe", DTToolMaterials.BROMYA, 6F, -3.2F);
		BROMYA_HOE = createHoe("deep_trenches:bromya_hoe", DTToolMaterials.BROMYA, 0, -3F);
		BROMYA_PICKAXE = createPickaxe("deep_trenches:bromya_pickaxe", DTToolMaterials.BROMYA, 1, -2.8F);
		BROMYA_SHOVEL = createShovel("deep_trenches:bromya_shovel", DTToolMaterials.BROMYA, 1.5F, -3F);

		BUBBLETREE_AXE = createAxe("deep_trenches:bubbletree_axe", DTToolMaterials.BUBBLETREE, 6F, -3.2F);
		BUBBLETREE_HOE = createHoe("deep_trenches:bubbletree_hoe", DTToolMaterials.BUBBLETREE, 0, -3F);
		BUBBLETREE_PICKAXE = createPickaxe("deep_trenches:bubbletree_pickaxe", DTToolMaterials.BUBBLETREE, 1, -2.8F);
		BUBBLETREE_SHOVEL = createShovel("deep_trenches:bubbletree_shovel", DTToolMaterials.BUBBLETREE, 1.5F, -3F);

		CALCEARB_AXE = createAxe("deep_trenches:calcearb_axe", DTToolMaterials.CALCEARB, 6F, -3.2F);
		CALCEARB_HOE = createHoe("deep_trenches:calcearb_hoe", DTToolMaterials.CALCEARB, 0, -3F);
		CALCEARB_PICKAXE = createPickaxe("deep_trenches:calcearb_pickaxe", DTToolMaterials.CALCEARB, 1, -2.8F);
		CALCEARB_SHOVEL = createShovel("deep_trenches:calcearb_shovel", DTToolMaterials.CALCEARB, 1.5F, -3F);

		CHERRY_AXE = createAxe("deep_trenches:cherry_axe", DTToolMaterials.CHERRY, 6F, -3.2F);
		CHERRY_HOE = createHoe("deep_trenches:cherry_hoe", DTToolMaterials.CHERRY, 0, -3F);
		CHERRY_PICKAXE = createPickaxe("deep_trenches:cherry_pickaxe", DTToolMaterials.CHERRY, 1, -2.8F);
		CHERRY_SHOVEL = createShovel("deep_trenches:cherry_shovel", DTToolMaterials.CHERRY, 1.5F, -3F);

		CHOTORN_AXE = createAxe("deep_trenches:chotorn_axe", DTToolMaterials.CHOTORN, 6F, -3.2F);
		CHOTORN_HOE = createHoe("deep_trenches:chotorn_hoe", DTToolMaterials.CHOTORN, 0, -3F);
		CHOTORN_PICKAXE = createPickaxe("deep_trenches:chotorn_pickaxe", DTToolMaterials.CHOTORN, 1, -2.8F);
		CHOTORN_SHOVEL = createShovel("deep_trenches:chotorn_shovel", DTToolMaterials.CHOTORN, 1.5F, -3F);

		COOK_PINE_AXE = createAxe("deep_trenches:cook_pine_axe", DTToolMaterials.COOK_PINE, 6F, -3.2F);
		COOK_PINE_HOE = createHoe("deep_trenches:cook_pine_hoe", DTToolMaterials.COOK_PINE, 0, -3F);
		COOK_PINE_PICKAXE = createPickaxe("deep_trenches:cook_pine_pickaxe", DTToolMaterials.COOK_PINE, 1, -2.8F);
		COOK_PINE_SHOVEL = createShovel("deep_trenches:cook_pine_shovel", DTToolMaterials.COOK_PINE, 1.5F, -3F);

		CROLOOD_AXE = createAxe("deep_trenches:crolood_axe", DTToolMaterials.CROLOOD, 6F, -3.2F);
		CROLOOD_HOE = createHoe("deep_trenches:crolood_hoe", DTToolMaterials.CROLOOD, 0, -3F);
		CROLOOD_PICKAXE = createPickaxe("deep_trenches:crolood_pickaxe", DTToolMaterials.CROLOOD, 1, -2.8F);
		CROLOOD_SHOVEL = createShovel("deep_trenches:crolood_shovel", DTToolMaterials.CROLOOD, 1.5F, -3F);

		DARK_CROLOOD_AXE = createAxe("deep_trenches:dark_crolood_axe", DTToolMaterials.DARK_CROLOOD, 6F, -3.2F);
		DARK_CROLOOD_HOE = createHoe("deep_trenches:dark_crolood_hoe", DTToolMaterials.DARK_CROLOOD, 0, -3F);
		DARK_CROLOOD_PICKAXE = createPickaxe("deep_trenches:dark_crolood_pickaxe", DTToolMaterials.DARK_CROLOOD, 1, -2.8F);
		DARK_CROLOOD_SHOVEL = createShovel("deep_trenches:dark_crolood_shovel", DTToolMaterials.DARK_CROLOOD, 1.5F, -3F);

		DARK_FUCHSITRA_AXE = createAxe("deep_trenches:dark_fuchsitra_axe", DTToolMaterials.DARK_FUCHSITRA, 6F, -3.2F);
		DARK_FUCHSITRA_HOE = createHoe("deep_trenches:dark_fuchsitra_hoe", DTToolMaterials.DARK_FUCHSITRA, 0, -3F);
		DARK_FUCHSITRA_PICKAXE = createPickaxe("deep_trenches:dark_fuchsitra_pickaxe", DTToolMaterials.DARK_FUCHSITRA, 1, -2.8F);
		DARK_FUCHSITRA_SHOVEL = createShovel("deep_trenches:dark_fuchsitra_shovel", DTToolMaterials.DARK_FUCHSITRA, 1.5F, -3F);

		DARK_RED_ELM_AXE = createAxe("deep_trenches:dark_red_elm_axe", DTToolMaterials.DARK_RED_ELM, 6F, -3.2F);
		DARK_RED_ELM_HOE = createHoe("deep_trenches:dark_red_elm_hoe", DTToolMaterials.DARK_RED_ELM, 0, -3F);
		DARK_RED_ELM_PICKAXE = createPickaxe("deep_trenches:dark_red_elm_pickaxe", DTToolMaterials.DARK_RED_ELM, 1, -2.8F);
		DARK_RED_ELM_SHOVEL = createShovel("deep_trenches:dark_red_elm_shovel", DTToolMaterials.DARK_RED_ELM, 1.5F, -3F);

		DEAD_WART_TREE_AXE = createAxe("deep_trenches:dead_wart_tree_axe", DTToolMaterials.DEAD_WART_TREE, 6F, -3.2F);
		DEAD_WART_TREE_HOE = createHoe("deep_trenches:dead_wart_tree_hoe", DTToolMaterials.DEAD_WART_TREE, 0, -3F);
		DEAD_WART_TREE_PICKAXE = createPickaxe("deep_trenches:dead_wart_tree_pickaxe", DTToolMaterials.DEAD_WART_TREE, 1, -2.8F);
		DEAD_WART_TREE_SHOVEL = createShovel("deep_trenches:dead_wart_tree_shovel", DTToolMaterials.DEAD_WART_TREE, 1.5F, -3F);

		DRIGYUS_AXE = createAxe("deep_trenches:drigyus_axe", DTToolMaterials.DRIGYUS, 6F, -3.2F);
		DRIGYUS_HOE = createHoe("deep_trenches:drigyus_hoe", DTToolMaterials.DRIGYUS, 0, -3F);
		DRIGYUS_PICKAXE = createPickaxe("deep_trenches:drigyus_pickaxe", DTToolMaterials.DRIGYUS, 1, -2.8F);
		DRIGYUS_SHOVEL = createShovel("deep_trenches:drigyus_shovel", DTToolMaterials.DRIGYUS, 1.5F, -3F);

		EBONY_AXE = createAxe("deep_trenches:ebony_axe", DTToolMaterials.EBONY, 6F, -3.2F);
		EBONY_HOE = createHoe("deep_trenches:ebony_hoe", DTToolMaterials.EBONY, 0, -3F);
		EBONY_PICKAXE = createPickaxe("deep_trenches:ebony_pickaxe", DTToolMaterials.EBONY, 1, -2.8F);
		EBONY_SHOVEL = createShovel("deep_trenches:ebony_shovel", DTToolMaterials.EBONY, 1.5F, -3F);

		ENDERHEART_AXE = createAxe("deep_trenches:enderheart_axe", DTToolMaterials.ENDERHEART, 6F, -3.2F);
		ENDERHEART_HOE = createHoe("deep_trenches:enderheart_hoe", DTToolMaterials.ENDERHEART, 0, -3F);
		ENDERHEART_PICKAXE = createPickaxe("deep_trenches:enderheart_pickaxe", DTToolMaterials.ENDERHEART, 1, -2.8F);
		ENDERHEART_SHOVEL = createShovel("deep_trenches:enderheart_shovel", DTToolMaterials.ENDERHEART, 1.5F, -3F);

		FLALM_AXE = createAxe("deep_trenches:flalm_axe", DTToolMaterials.FLALM, 6F, -3.2F);
		FLALM_HOE = createHoe("deep_trenches:flalm_hoe", DTToolMaterials.FLALM, 0, -3F);
		FLALM_PICKAXE = createPickaxe("deep_trenches:flalm_pickaxe", DTToolMaterials.FLALM, 1, -2.8F);
		FLALM_SHOVEL = createShovel("deep_trenches:flalm_shovel", DTToolMaterials.FLALM, 1.5F, -3F);

		FRUCE_AXE = createAxe("deep_trenches:fruce_axe", DTToolMaterials.FRUCE, 6F, -3.2F);
		FRUCE_HOE = createHoe("deep_trenches:fruce_hoe", DTToolMaterials.FRUCE, 0, -3F);
		FRUCE_PICKAXE = createPickaxe("deep_trenches:fruce_pickaxe", DTToolMaterials.FRUCE, 1, -2.8F);
		FRUCE_SHOVEL = createShovel("deep_trenches:fruce_shovel", DTToolMaterials.FRUCE, 1.5F, -3F);

		FUCHSITRA_AXE = createAxe("deep_trenches:fuchsitra_axe", DTToolMaterials.FUCHSITRA, 6F, -3.2F);
		FUCHSITRA_HOE = createHoe("deep_trenches:fuchsitra_hoe", DTToolMaterials.FUCHSITRA, 0, -3F);
		FUCHSITRA_PICKAXE = createPickaxe("deep_trenches:fuchsitra_pickaxe", DTToolMaterials.FUCHSITRA, 1, -2.8F);
		FUCHSITRA_SHOVEL = createShovel("deep_trenches:fuchsitra_shovel", DTToolMaterials.FUCHSITRA, 1.5F, -3F);

		FUGMOS_AXE = createAxe("deep_trenches:fugmos_axe", DTToolMaterials.FUGMOS, 6F, -3.2F);
		FUGMOS_HOE = createHoe("deep_trenches:fugmos_hoe", DTToolMaterials.FUGMOS, 0, -3F);
		FUGMOS_PICKAXE = createPickaxe("deep_trenches:fugmos_pickaxe", DTToolMaterials.FUGMOS, 1, -2.8F);
		FUGMOS_SHOVEL = createShovel("deep_trenches:fugmos_shovel", DTToolMaterials.FUGMOS, 1.5F, -3F);

		FUNERANITE_AXE = createAxe("deep_trenches:funeranite_axe", DTToolMaterials.FUNERANITE, 6F, -3.2F);
		FUNERANITE_HOE = createHoe("deep_trenches:funeranite_hoe", DTToolMaterials.FUNERANITE, 0, -3F);
		FUNERANITE_PICKAXE = createPickaxe("deep_trenches:funeranite_pickaxe", DTToolMaterials.FUNERANITE, 1, -2.8F);
		FUNERANITE_SHOVEL = createShovel("deep_trenches:funeranite_shovel", DTToolMaterials.FUNERANITE, 1.5F, -3F);

		GHOSHROOM_AXE = createAxe("deep_trenches:ghoshroom_axe", DTToolMaterials.GHOSHROOM, 6F, -3.2F);
		GHOSHROOM_HOE = createHoe("deep_trenches:ghoshroom_hoe", DTToolMaterials.GHOSHROOM, 0, -3F);
		GHOSHROOM_PICKAXE = createPickaxe("deep_trenches:ghoshroom_pickaxe", DTToolMaterials.GHOSHROOM, 1, -2.8F);
		GHOSHROOM_SHOVEL = createShovel("deep_trenches:ghoshroom_shovel", DTToolMaterials.GHOSHROOM, 1.5F, -3F);

		GIANT_VIOLET_AXE = createAxe("deep_trenches:giant_violet_axe", DTToolMaterials.GIANT_VIOLET, 6F, -3.2F);
		GIANT_VIOLET_HOE = createHoe("deep_trenches:giant_violet_hoe", DTToolMaterials.GIANT_VIOLET, 0, -3F);
		GIANT_VIOLET_PICKAXE = createPickaxe("deep_trenches:giant_violet_pickaxe", DTToolMaterials.GIANT_VIOLET, 1, -2.8F);
		GIANT_VIOLET_SHOVEL = createShovel("deep_trenches:giant_violet_shovel", DTToolMaterials.GIANT_VIOLET, 1.5F, -3F);

		GUAIACUM_AXE = createAxe("deep_trenches:guaiacum_axe", DTToolMaterials.GUAIACUM, 6F, -3.2F);
		GUAIACUM_HOE = createHoe("deep_trenches:guaiacum_hoe", DTToolMaterials.GUAIACUM, 0, -3F);
		GUAIACUM_PICKAXE = createPickaxe("deep_trenches:guaiacum_pickaxe", DTToolMaterials.GUAIACUM, 1, -2.8F);
		GUAIACUM_SHOVEL = createShovel("deep_trenches:guaiacum_shovel", DTToolMaterials.GUAIACUM, 1.5F, -3F);

		JOSHUA_AXE = createAxe("deep_trenches:joshua_axe", DTToolMaterials.JOSHUA, 6F, -3.2F);
		JOSHUA_HOE = createHoe("deep_trenches:joshua_hoe", DTToolMaterials.JOSHUA, 0, -3F);
		JOSHUA_PICKAXE = createPickaxe("deep_trenches:joshua_pickaxe", DTToolMaterials.JOSHUA, 1, -2.8F);
		JOSHUA_SHOVEL = createShovel("deep_trenches:joshua_shovel", DTToolMaterials.JOSHUA, 1.5F, -3F);

		KLINKII_PINE_AXE = createAxe("deep_trenches:klinkii_pine_axe", DTToolMaterials.KLINKII_PINE, 6F, -3.2F);
		KLINKII_PINE_HOE = createHoe("deep_trenches:klinkii_pine_hoe", DTToolMaterials.KLINKII_PINE, 0, -3F);
		KLINKII_PINE_PICKAXE = createPickaxe("deep_trenches:klinkii_pine_pickaxe", DTToolMaterials.KLINKII_PINE, 1, -2.8F);
		KLINKII_PINE_SHOVEL = createShovel("deep_trenches:klinkii_pine_shovel", DTToolMaterials.KLINKII_PINE, 1.5F, -3F);

		MELALEUCA_AXE = createAxe("deep_trenches:melaleuca_axe", DTToolMaterials.MELALEUCA, 6F, -3.2F);
		MELALEUCA_HOE = createHoe("deep_trenches:melaleuca_hoe", DTToolMaterials.MELALEUCA, 0, -3F);
		MELALEUCA_PICKAXE = createPickaxe("deep_trenches:melaleuca_pickaxe", DTToolMaterials.MELALEUCA, 1, -2.8F);
		MELALEUCA_SHOVEL = createShovel("deep_trenches:melaleuca_shovel", DTToolMaterials.MELALEUCA, 1.5F, -3F);

		MURKANTUAN_AXE = createAxe("deep_trenches:murkantuan_axe", DTToolMaterials.MURKANTUAN, 6F, -3.2F);
		MURKANTUAN_HOE = createHoe("deep_trenches:murkantuan_hoe", DTToolMaterials.MURKANTUAN, 0, -3F);
		MURKANTUAN_PICKAXE = createPickaxe("deep_trenches:murkantuan_pickaxe", DTToolMaterials.MURKANTUAN, 1, -2.8F);
		MURKANTUAN_SHOVEL = createShovel("deep_trenches:murkantuan_shovel", DTToolMaterials.MURKANTUAN, 1.5F, -3F);

		NORFOLK_PINE_AXE = createAxe("deep_trenches:norfolk_pine_axe", DTToolMaterials.NORFOLK_PINE, 6F, -3.2F);
		NORFOLK_PINE_HOE = createHoe("deep_trenches:norfolk_pine_hoe", DTToolMaterials.NORFOLK_PINE, 0, -3F);
		NORFOLK_PINE_PICKAXE = createPickaxe("deep_trenches:norfolk_pine_pickaxe", DTToolMaterials.NORFOLK_PINE, 1, -2.8F);
		NORFOLK_PINE_SHOVEL = createShovel("deep_trenches:norfolk_pine_shovel", DTToolMaterials.NORFOLK_PINE, 1.5F, -3F);

		OBSCRUS_AXE = createAxe("deep_trenches:obscrus_axe", DTToolMaterials.OBSCRUS, 6F, -3.2F);
		OBSCRUS_HOE = createHoe("deep_trenches:obscrus_hoe", DTToolMaterials.OBSCRUS, 0, -3F);
		OBSCRUS_PICKAXE = createPickaxe("deep_trenches:obscrus_pickaxe", DTToolMaterials.OBSCRUS, 1, -2.8F);
		OBSCRUS_SHOVEL = createShovel("deep_trenches:obscrus_shovel", DTToolMaterials.OBSCRUS, 1.5F, -3F);

		ORHPRIS_AXE = createAxe("deep_trenches:orhpris_axe", DTToolMaterials.ORHPRIS, 6F, -3.2F);
		ORHPRIS_HOE = createHoe("deep_trenches:orhpris_hoe", DTToolMaterials.ORHPRIS, 0, -3F);
		ORHPRIS_PICKAXE = createPickaxe("deep_trenches:orhpris_pickaxe", DTToolMaterials.ORHPRIS, 1, -2.8F);
		ORHPRIS_SHOVEL = createShovel("deep_trenches:orhpris_shovel", DTToolMaterials.ORHPRIS, 1.5F, -3F);

		PELTOGYNE_AXE = createAxe("deep_trenches:peltogyne_axe", DTToolMaterials.PELTOGYNE, 6F, -3.2F);
		PELTOGYNE_HOE = createHoe("deep_trenches:peltogyne_hoe", DTToolMaterials.PELTOGYNE, 0, -3F);
		PELTOGYNE_PICKAXE = createPickaxe("deep_trenches:peltogyne_pickaxe", DTToolMaterials.PELTOGYNE, 1, -2.8F);
		PELTOGYNE_SHOVEL = createShovel("deep_trenches:peltogyne_shovel", DTToolMaterials.PELTOGYNE, 1.5F, -3F);

		PIN_CHERRY_AXE = createAxe("deep_trenches:pin_cherry_axe", DTToolMaterials.PIN_CHERRY, 6F, -3.2F);
		PIN_CHERRY_HOE = createHoe("deep_trenches:pin_cherry_hoe", DTToolMaterials.PIN_CHERRY, 0, -3F);
		PIN_CHERRY_PICKAXE = createPickaxe("deep_trenches:pin_cherry_pickaxe", DTToolMaterials.PIN_CHERRY, 1, -2.8F);
		PIN_CHERRY_SHOVEL = createShovel("deep_trenches:pin_cherry_shovel", DTToolMaterials.PIN_CHERRY, 1.5F, -3F);

		PLUM_AXE = createAxe("deep_trenches:plum_axe", DTToolMaterials.PLUM, 6F, -3.2F);
		PLUM_HOE = createHoe("deep_trenches:plum_hoe", DTToolMaterials.PLUM, 0, -3F);
		PLUM_PICKAXE = createPickaxe("deep_trenches:plum_pickaxe", DTToolMaterials.PLUM, 1, -2.8F);
		PLUM_SHOVEL = createShovel("deep_trenches:plum_shovel", DTToolMaterials.PLUM, 1.5F, -3F);

		PURFUNGA_AXE = createAxe("deep_trenches:purfunga_axe", DTToolMaterials.PURFUNGA, 6F, -3.2F);
		PURFUNGA_HOE = createHoe("deep_trenches:purfunga_hoe", DTToolMaterials.PURFUNGA, 0, -3F);
		PURFUNGA_PICKAXE = createPickaxe("deep_trenches:purfunga_pickaxe", DTToolMaterials.PURFUNGA, 1, -2.8F);
		PURFUNGA_SHOVEL = createShovel("deep_trenches:purfunga_shovel", DTToolMaterials.PURFUNGA, 1.5F, -3F);

		RARK_AXE = createAxe("deep_trenches:rark_axe", DTToolMaterials.RARK, 6F, -3.2F);
		RARK_HOE = createHoe("deep_trenches:rark_hoe", DTToolMaterials.RARK, 0, -3F);
		RARK_PICKAXE = createPickaxe("deep_trenches:rark_pickaxe", DTToolMaterials.RARK, 1, -2.8F);
		RARK_SHOVEL = createShovel("deep_trenches:rark_shovel", DTToolMaterials.RARK, 1.5F, -3F);

		RED_ELM_AXE = createAxe("deep_trenches:red_elm_axe", DTToolMaterials.RED_ELM, 6F, -3.2F);
		RED_ELM_HOE = createHoe("deep_trenches:red_elm_hoe", DTToolMaterials.RED_ELM, 0, -3F);
		RED_ELM_PICKAXE = createPickaxe("deep_trenches:red_elm_pickaxe", DTToolMaterials.RED_ELM, 1, -2.8F);
		RED_ELM_SHOVEL = createShovel("deep_trenches:red_elm_shovel", DTToolMaterials.RED_ELM, 1.5F, -3F);

		RHADI_AXE = createAxe("deep_trenches:rhadi_axe", DTToolMaterials.RHADI, 6F, -3.2F);
		RHADI_HOE = createHoe("deep_trenches:rhadi_hoe", DTToolMaterials.RHADI, 0, -3F);
		RHADI_PICKAXE = createPickaxe("deep_trenches:rhadi_pickaxe", DTToolMaterials.RHADI, 1, -2.8F);
		RHADI_SHOVEL = createShovel("deep_trenches:rhadi_shovel", DTToolMaterials.RHADI, 1.5F, -3F);

		SANGUART_AXE = createAxe("deep_trenches:sanguart_axe", DTToolMaterials.SANGUART, 6F, -3.2F);
		SANGUART_HOE = createHoe("deep_trenches:sanguart_hoe", DTToolMaterials.SANGUART, 0, -3F);
		SANGUART_PICKAXE = createPickaxe("deep_trenches:sanguart_pickaxe", DTToolMaterials.SANGUART, 1, -2.8F);
		SANGUART_SHOVEL = createShovel("deep_trenches:sanguart_shovel", DTToolMaterials.SANGUART, 1.5F, -3F);

		SCARLET_THIORCEN_AXE = createAxe("deep_trenches:scarlet_thiorcen_axe", DTToolMaterials.SCARLET_THIORCEN, 6F, -3.2F);
		SCARLET_THIORCEN_HOE = createHoe("deep_trenches:scarlet_thiorcen_hoe", DTToolMaterials.SCARLET_THIORCEN, 0, -3F);
		SCARLET_THIORCEN_PICKAXE = createPickaxe("deep_trenches:scarlet_thiorcen_pickaxe", DTToolMaterials.SCARLET_THIORCEN, 1, -2.8F);
		SCARLET_THIORCEN_SHOVEL = createShovel("deep_trenches:scarlet_thiorcen_shovel", DTToolMaterials.SCARLET_THIORCEN, 1.5F, -3F);

		SEQUOIA_AXE = createAxe("deep_trenches:sequoia_axe", DTToolMaterials.SEQUOIA, 6F, -3.2F);
		SEQUOIA_HOE = createHoe("deep_trenches:sequoia_hoe", DTToolMaterials.SEQUOIA, 0, -3F);
		SEQUOIA_PICKAXE = createPickaxe("deep_trenches:sequoia_pickaxe", DTToolMaterials.SEQUOIA, 1, -2.8F);
		SEQUOIA_SHOVEL = createShovel("deep_trenches:sequoia_shovel", DTToolMaterials.SEQUOIA, 1.5F, -3F);

		SPROOM_AXE = createAxe("deep_trenches:sproom_axe", DTToolMaterials.SPROOM, 6F, -3.2F);
		SPROOM_HOE = createHoe("deep_trenches:sproom_hoe", DTToolMaterials.SPROOM, 0, -3F);
		SPROOM_PICKAXE = createPickaxe("deep_trenches:sproom_pickaxe", DTToolMaterials.SPROOM, 1, -2.8F);
		SPROOM_SHOVEL = createShovel("deep_trenches:sproom_shovel", DTToolMaterials.SPROOM, 1.5F, -3F);

		STORTREEAN_AXE = createAxe("deep_trenches:stortreean_axe", DTToolMaterials.STORTREEAN, 6F, -3.2F);
		STORTREEAN_HOE = createHoe("deep_trenches:stortreean_hoe", DTToolMaterials.STORTREEAN, 0, -3F);
		STORTREEAN_PICKAXE = createPickaxe("deep_trenches:stortreean_pickaxe", DTToolMaterials.STORTREEAN, 1, -2.8F);
		STORTREEAN_SHOVEL = createShovel("deep_trenches:stortreean_shovel", DTToolMaterials.STORTREEAN, 1.5F, -3F);

		STROOMEAN_AXE = createAxe("deep_trenches:stroomean_axe", DTToolMaterials.STROOMEAN, 6F, -3.2F);
		STROOMEAN_HOE = createHoe("deep_trenches:stroomean_hoe", DTToolMaterials.STROOMEAN, 0, -3F);
		STROOMEAN_PICKAXE = createPickaxe("deep_trenches:stroomean_pickaxe", DTToolMaterials.STROOMEAN, 1, -2.8F);
		STROOMEAN_SHOVEL = createShovel("deep_trenches:stroomean_shovel", DTToolMaterials.STROOMEAN, 1.5F, -3F);

		SUNRISE_FUNGUS_AXE = createAxe("deep_trenches:sunrise_fungus_axe", DTToolMaterials.SUNRISE_FUNGUS, 6F, -3.2F);
		SUNRISE_FUNGUS_HOE = createHoe("deep_trenches:sunrise_fungus_hoe", DTToolMaterials.SUNRISE_FUNGUS, 0, -3F);
		SUNRISE_FUNGUS_PICKAXE = createPickaxe("deep_trenches:sunrise_fungus_pickaxe", DTToolMaterials.SUNRISE_FUNGUS, 1, -2.8F);
		SUNRISE_FUNGUS_SHOVEL = createShovel("deep_trenches:sunrise_fungus_shovel", DTToolMaterials.SUNRISE_FUNGUS, 1.5F, -3F);

		TARK_AXE = createAxe("deep_trenches:tark_axe", DTToolMaterials.TARK, 6F, -3.2F);
		TARK_HOE = createHoe("deep_trenches:tark_hoe", DTToolMaterials.TARK, 0, -3F);
		TARK_PICKAXE = createPickaxe("deep_trenches:tark_pickaxe", DTToolMaterials.TARK, 1, -2.8F);
		TARK_SHOVEL = createShovel("deep_trenches:tark_shovel", DTToolMaterials.TARK, 1.5F, -3F);

		TEAK_AXE = createAxe("deep_trenches:teak_axe", DTToolMaterials.TEAK, 6F, -3.2F);
		TEAK_HOE = createHoe("deep_trenches:teak_hoe", DTToolMaterials.TEAK, 0, -3F);
		TEAK_PICKAXE = createPickaxe("deep_trenches:teak_pickaxe", DTToolMaterials.TEAK, 1, -2.8F);
		TEAK_SHOVEL = createShovel("deep_trenches:teak_shovel", DTToolMaterials.TEAK, 1.5F, -3F);

		THUNDERCLOUD_PLUM_AXE = createAxe("deep_trenches:thundercloud_plum_axe", DTToolMaterials.THUNDERCLOUD_PLUM, 6F, -3.2F);
		THUNDERCLOUD_PLUM_HOE = createHoe("deep_trenches:thundercloud_plum_hoe", DTToolMaterials.THUNDERCLOUD_PLUM, 0, -3F);
		THUNDERCLOUD_PLUM_PICKAXE = createPickaxe("deep_trenches:thundercloud_plum_pickaxe", DTToolMaterials.THUNDERCLOUD_PLUM, 1, -2.8F);
		THUNDERCLOUD_PLUM_SHOVEL = createShovel("deep_trenches:thundercloud_plum_shovel", DTToolMaterials.THUNDERCLOUD_PLUM, 1.5F, -3F);

		VYNHERT_AXE = createAxe("deep_trenches:vynhert_axe", DTToolMaterials.VYNHERT, 6F, -3.2F);
		VYNHERT_HOE = createHoe("deep_trenches:vynhert_hoe", DTToolMaterials.VYNHERT, 0, -3F);
		VYNHERT_PICKAXE = createPickaxe("deep_trenches:vynhert_pickaxe", DTToolMaterials.VYNHERT, 1, -2.8F);
		VYNHERT_SHOVEL = createShovel("deep_trenches:vynhert_shovel", DTToolMaterials.VYNHERT, 1.5F, -3F);

		WART_TREE_AXE = createAxe("deep_trenches:wart_tree_axe", DTToolMaterials.WART_TREE, 6F, -3.2F);
		WART_TREE_HOE = createHoe("deep_trenches:wart_tree_hoe", DTToolMaterials.WART_TREE, 0, -3F);
		WART_TREE_PICKAXE = createPickaxe("deep_trenches:wart_tree_pickaxe", DTToolMaterials.WART_TREE, 1, -2.8F);
		WART_TREE_SHOVEL = createShovel("deep_trenches:wart_tree_shovel", DTToolMaterials.WART_TREE, 1.5F, -3F);

		WENGE_AXE = createAxe("deep_trenches:wenge_axe", DTToolMaterials.WENGE, 6F, -3.2F);
		WENGE_HOE = createHoe("deep_trenches:wenge_hoe", DTToolMaterials.WENGE, 0, -3F);
		WENGE_PICKAXE = createPickaxe("deep_trenches:wenge_pickaxe", DTToolMaterials.WENGE, 1, -2.8F);
		WENGE_SHOVEL = createShovel("deep_trenches:wenge_shovel", DTToolMaterials.WENGE, 1.5F, -3F);

		YEW_AXE = createAxe("deep_trenches:yew_axe", DTToolMaterials.YEW, 6F, -3.2F);
		YEW_HOE = createHoe("deep_trenches:yew_hoe", DTToolMaterials.YEW, 0, -3F);
		YEW_PICKAXE = createPickaxe("deep_trenches:yew_pickaxe", DTToolMaterials.YEW, 1, -2.8F);
		YEW_SHOVEL = createShovel("deep_trenches:yew_shovel", DTToolMaterials.YEW, 1.5F, -3F);

		/* ARMOR */
		AQUAMARINE_HELMET = createHelmet("deep_trenches:aquamarine_helmet", DTArmorMaterials.AQUAMARINE);
		AQUAMARINE_CHESTPLATE = createChestplate("deep_trenches:aquamarine_chestplate", DTArmorMaterials.AQUAMARINE);
		AQUAMARINE_LEGGINGS = createLeggings("deep_trenches:aquamarine_leggings", DTArmorMaterials.AQUAMARINE);
		AQUAMARINE_BOOTS = createBoots("deep_trenches:aquamarine_boots", DTArmorMaterials.AQUAMARINE);

		BORON_HELMET = createHelmet("deep_trenches:boron_helmet", DTArmorMaterials.BORON);
		BORON_CHESTPLATE = createChestplate("deep_trenches:boron_chestplate", DTArmorMaterials.BORON);
		BORON_LEGGINGS = createLeggings("deep_trenches:boron_leggings", DTArmorMaterials.BORON);
		BORON_BOOTS = createBoots("deep_trenches:boron_boots", DTArmorMaterials.BORON);

		CHALCEDONY_HELMET = createHelmet("deep_trenches:chalcedony_helmet", DTArmorMaterials.CHALCEDONY);
		CHALCEDONY_CHESTPLATE = createChestplate("deep_trenches:chalcedony_chestplate", DTArmorMaterials.CHALCEDONY);
		CHALCEDONY_LEGGINGS = createLeggings("deep_trenches:chalcedony_leggings", DTArmorMaterials.CHALCEDONY);
		CHALCEDONY_BOOTS = createBoots("deep_trenches:chalcedony_boots", DTArmorMaterials.CHALCEDONY);

		CLINOHUMITE_HELMET = createHelmet("deep_trenches:clinohumite_helmet", DTArmorMaterials.CLINOHUMITE);
		CLINOHUMITE_CHESTPLATE = createChestplate("deep_trenches:clinohumite_chestplate", DTArmorMaterials.CLINOHUMITE);
		CLINOHUMITE_LEGGINGS = createLeggings("deep_trenches:clinohumite_leggings", DTArmorMaterials.CLINOHUMITE);
		CLINOHUMITE_BOOTS = createBoots("deep_trenches:clinohumite_boots", DTArmorMaterials.CLINOHUMITE);

		DIOPSIDE_HELMET = createHelmet("deep_trenches:diopside_helmet", DTArmorMaterials.DIOPSIDE);
		DIOPSIDE_CHESTPLATE = createChestplate("deep_trenches:diopside_chestplate", DTArmorMaterials.DIOPSIDE);
		DIOPSIDE_LEGGINGS = createLeggings("deep_trenches:diopside_leggings", DTArmorMaterials.DIOPSIDE);
		DIOPSIDE_BOOTS = createBoots("deep_trenches:diopside_boots", DTArmorMaterials.DIOPSIDE);

		ENRON_HELMET = createHelmet("deep_trenches:enron_helmet", DTArmorMaterials.ENRON);
		ENRON_CHESTPLATE = createChestplate("deep_trenches:enron_chestplate", DTArmorMaterials.ENRON);
		ENRON_LEGGINGS = createLeggings("deep_trenches:enron_leggings", DTArmorMaterials.ENRON);
		ENRON_BOOTS = createBoots("deep_trenches:enron_boots", DTArmorMaterials.ENRON);

		ENSTATITE_HELMET = createHelmet("deep_trenches:enstatite_helmet", DTArmorMaterials.ENSTATITE);
		ENSTATITE_CHESTPLATE = createChestplate("deep_trenches:enstatite_chestplate", DTArmorMaterials.ENSTATITE);
		ENSTATITE_LEGGINGS = createLeggings("deep_trenches:enstatite_leggings", DTArmorMaterials.ENSTATITE);
		ENSTATITE_BOOTS = createBoots("deep_trenches:enstatite_boots", DTArmorMaterials.ENSTATITE);

		KRALCTIUM_HELMET = createHelmet("deep_trenches:kralctium_helmet", DTArmorMaterials.KRALCTIUM);
		KRALCTIUM_CHESTPLATE = createChestplate("deep_trenches:kralctium_chestplate", DTArmorMaterials.KRALCTIUM);
		KRALCTIUM_LEGGINGS = createLeggings("deep_trenches:kralctium_leggings", DTArmorMaterials.KRALCTIUM);
		KRALCTIUM_BOOTS = createBoots("deep_trenches:kralctium_boots", DTArmorMaterials.KRALCTIUM);

		MORGANITE_HELMET = createHelmet("deep_trenches:morganite_helmet", DTArmorMaterials.MORGANITE);
		MORGANITE_CHESTPLATE = createChestplate("deep_trenches:morganite_chestplate", DTArmorMaterials.MORGANITE);
		MORGANITE_LEGGINGS = createLeggings("deep_trenches:morganite_leggings", DTArmorMaterials.MORGANITE);
		MORGANITE_BOOTS = createBoots("deep_trenches:morganite_boots", DTArmorMaterials.MORGANITE);

		RUBY_HELMET = createHelmet("deep_trenches:ruby_helmet", DTArmorMaterials.RUBY);
		RUBY_CHESTPLATE = createChestplate("deep_trenches:ruby_chestplate", DTArmorMaterials.RUBY);
		RUBY_LEGGINGS = createLeggings("deep_trenches:ruby_leggings", DTArmorMaterials.RUBY);
		RUBY_BOOTS = createBoots("deep_trenches:ruby_boots", DTArmorMaterials.RUBY);

		SAPPHIRE_HELMET = createHelmet("deep_trenches:sapphire_helmet", DTArmorMaterials.SAPPHIRE);
		SAPPHIRE_CHESTPLATE = createChestplate("deep_trenches:sapphire_chestplate", DTArmorMaterials.SAPPHIRE);
		SAPPHIRE_LEGGINGS = createLeggings("deep_trenches:sapphire_leggings", DTArmorMaterials.SAPPHIRE);
		SAPPHIRE_BOOTS = createBoots("deep_trenches:sapphire_boots", DTArmorMaterials.SAPPHIRE);

		SILVER_HELMET = createHelmet("deep_trenches:silver_helmet", DTArmorMaterials.SILVER);
		SILVER_CHESTPLATE = createChestplate("deep_trenches:silver_chestplate", DTArmorMaterials.SILVER);
		SILVER_LEGGINGS = createLeggings("deep_trenches:silver_leggings", DTArmorMaterials.SILVER);
		SILVER_BOOTS = createBoots("deep_trenches:silver_boots", DTArmorMaterials.SILVER);

		SPHENE_HELMET = createHelmet("deep_trenches:sphene_helmet", DTArmorMaterials.SPHENE);
		SPHENE_CHESTPLATE = createChestplate("deep_trenches:sphene_chestplate", DTArmorMaterials.SPHENE);
		SPHENE_LEGGINGS = createLeggings("deep_trenches:sphene_leggings", DTArmorMaterials.SPHENE);
		SPHENE_BOOTS = createBoots("deep_trenches:sphene_boots", DTArmorMaterials.SPHENE);

		SPINEL_HELMET = createHelmet("deep_trenches:spinel_helmet", DTArmorMaterials.SPINEL);
		SPINEL_CHESTPLATE = createChestplate("deep_trenches:spinel_chestplate", DTArmorMaterials.SPINEL);
		SPINEL_LEGGINGS = createLeggings("deep_trenches:spinel_leggings", DTArmorMaterials.SPINEL);
		SPINEL_BOOTS = createBoots("deep_trenches:spinel_boots", DTArmorMaterials.SPINEL);

		TANZANITE_HELMET = createHelmet("deep_trenches:tanzanite_helmet", DTArmorMaterials.TANZANITE);
		TANZANITE_CHESTPLATE = createChestplate("deep_trenches:tanzanite_chestplate", DTArmorMaterials.TANZANITE);
		TANZANITE_LEGGINGS = createLeggings("deep_trenches:tanzanite_leggings", DTArmorMaterials.TANZANITE);
		TANZANITE_BOOTS = createBoots("deep_trenches:tanzanite_boots", DTArmorMaterials.TANZANITE);

		TOPAZ_HELMET = createHelmet("deep_trenches:topaz_helmet", DTArmorMaterials.TOPAZ);
		TOPAZ_CHESTPLATE = createChestplate("deep_trenches:topaz_chestplate", DTArmorMaterials.TOPAZ);
		TOPAZ_LEGGINGS = createLeggings("deep_trenches:topaz_leggings", DTArmorMaterials.TOPAZ);
		TOPAZ_BOOTS = createBoots("deep_trenches:topaz_boots", DTArmorMaterials.TOPAZ);

		VOID_CRITTERED_DIOPSIDE_HELMET = createHelmet("deep_trenches:void_crittered_diopside_helmet", DTArmorMaterials.VOID_CRITTERED_DIOPSIDE);
		VOID_CRITTERED_DIOPSIDE_CHESTPLATE = createChestplate("deep_trenches:void_crittered_diopside_chestplate", DTArmorMaterials.VOID_CRITTERED_DIOPSIDE);
		VOID_CRITTERED_DIOPSIDE_LEGGINGS = createLeggings("deep_trenches:void_crittered_diopside_leggings", DTArmorMaterials.VOID_CRITTERED_DIOPSIDE);
		VOID_CRITTERED_DIOPSIDE_BOOTS = createBoots("deep_trenches:void_crittered_diopside_boots", DTArmorMaterials.VOID_CRITTERED_DIOPSIDE);

		/* TALISMANS */
		AQUAMARINE_TALISMAN = createItem("deep_trenches:aquamarine_talisman", COMBAT);
		SPHENE_TALISMAN = createItem("deep_trenches:sphene_talisman", COMBAT);
		TANZANITE_TALISMAN = createItem("deep_trenches:tanzanite_talisman", COMBAT);

		/* JEWELRY */
		BLACK_PEARL = createItem("deep_trenches:black_pearl", MISC);

		/* ORES */
		AQUAMARINE = createItem("deep_trenches:aquamarine", MISC);
		BLACK_OPAL = createItem("deep_trenches:black_opal", MISC);
		CHALCEDONY = createItem("deep_trenches:chalcedony", MISC);
		CLINOHUMITE = createItem("deep_trenches:clinohumite", MISC);
		DIOPSIDE = createItem("deep_trenches:diopside", MISC);
		ENSTATITE = createItem("deep_trenches:enstatite", MISC);
		GARNET = createItem("deep_trenches:garnet", MISC);
		MORGANITE = createItem("deep_trenches:morganite", MISC);
		OPAL = createItem("deep_trenches:opal", MISC);
		RAW_ACTINIUM = createItem("deep_trenches:raw_actinium", MISC);
		RAW_BORON = createItem("deep_trenches:raw_boron", MISC);
		RAW_ENRON = createItem("deep_trenches:raw_enron", MISC);
		RAW_SILICON = createItem("deep_trenches:raw_silicon", MISC);
		RAW_SILVER = createItem("deep_trenches:raw_silver", MISC);
		RAW_STROXITE = createItem("deep_trenches:raw_stroxite", MISC);
		RAW_TUNGSTEN = createItem("deep_trenches:raw_tungsten", MISC);
		RAW_URANOLUMEN = createItem("deep_trenches:raw_uranolumen", MISC);
		RUBY = createItem("deep_trenches:ruby", MISC);
		SAPPHIRE = createItem("deep_trenches:sapphire", MISC);
		SPHENE = createItem("deep_trenches:sphene", MISC);
		SPINEL = createItem("deep_trenches:spinel", MISC);
		SUGILITE = createItem("deep_trenches:sugilite", MISC);
		TANZANITE = createItem("deep_trenches:tanzanite", MISC);
		TOPAZ = createItem("deep_trenches:topaz", MISC);
		VOID_CRITTERED_DIOPSIDE = createItem("deep_trenches:void_crittered_diopside", MISC);

		/* INGOTS */
		ACTINIUM_INGOT = createItem("deep_trenches:actinium_ingot", MISC);
		BORON_INGOT = createItem("deep_trenches:boron_ingot", MISC);
		ENRON_INGOT = createItem("deep_trenches:enron_ingot", MISC);
		GYLDELION_INGOT = createItem("deep_trenches:gyldelion_ingot", MISC);
		KRALCTIUM_INGOT = createItem("deep_trenches:kralctium_ingot", MISC);
		SILICON_INGOT = createItem("deep_trenches:silicon_ingot", MISC);
		SILVER_INGOT = createItem("deep_trenches:silver_ingot", MISC);
		STROXITE_INGOT = createItem("deep_trenches:stroxite_ingot", MISC);
		TUNGSTEN_INGOT = createItem("deep_trenches:tungsten_ingot", MISC);
		URANIUM_INGOT = createItem("deep_trenches:uranium_ingot", MISC);
		URANOLUMEN_INGOT = createItem("deep_trenches:uranolumen_ingot", MISC);

		/* NUGGETS */
		ACTINIUM_NUGGET = createItem("deep_trenches:actinium_nugget", MISC);
		BORON_NUGGET = createItem("deep_trenches:boron_nugget", MISC);
		ENRON_NUGGET = createItem("deep_trenches:enron_nugget", MISC);
		GYLDELION_NUGGET = createItem("deep_trenches:gyldelion_nugget", MISC);
		SILICON_NUGGET = createItem("deep_trenches:silicon_nugget", MISC);
		SILVER_NUGGET = createItem("deep_trenches:silver_nugget", MISC);
		STROXITE_NUGGET = createItem("deep_trenches:stroxite_nugget", MISC);
		TUNGSTEN_NUGGET = createItem("deep_trenches:tungsten_nugget", MISC);
		URANIUM_NUGGET = createItem("deep_trenches:uranium_nugget", MISC);
		URANOLUMEN_NUGGET = createItem("deep_trenches:uranolumen_nugget", MISC);

		/* POWDERS */
		URANIUM_POWDER = createItem("deep_trenches:uranium_powder", MISC);
		URANOLUMEN_POWDER = createItem("deep_trenches:uranolumen_powder", MISC);

		/* GYNDELION */
		GYLDELION_DYE = createItem("deep_trenches:gyldelion_dye", MISC);

		/* MOB DROPS */
		LOOSEJAW_TOOTH = createItem("deep_trenches:loosejaw_tooth", MISC);
	}

}
