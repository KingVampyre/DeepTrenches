package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.common.item.ModBoatItem;
import github.KingVampyre.DeepTrenches.common.item.TagFishBucketItem;
import github.KingVampyre.DeepTrenches.common.item.TagSpawnEggItem;
import github.KingVampyre.DeepTrenches.core.item.AdaiggerItem;
import net.minecraft.entity.EntityType;
import net.minecraft.item.*;
import net.minecraft.item.Item.Settings;
import net.minecraft.tag.Tag;
import net.minecraft.util.registry.Registry;

import static github.KingVampyre.DeepTrenches.core.init.ItemGroups.GENERAL;
import static github.KingVampyre.DeepTrenches.core.init.ModFoodComponents.STORCEAN_FISH;
import static net.minecraft.fluid.Fluids.WATER;
import static net.minecraft.item.FoodComponents.APPLE;
import static net.minecraft.item.FoodComponents.SWEET_BERRIES;
import static net.minecraft.util.registry.Registry.ITEM;

public class ModItems {

	/* --------------- FISH BUCKETS ----------------- */
	public static final Item BARBELED_LOOSEJAW_BUCKET;
	public static final Item BETTA_BUCKET;
	public static final Item BLACK_LOOSEJAW_BUCKET;
	public static final Item DEEP_LAKE_BETTA_BUCKET;
	public static final Item GIANT_HATCHETFISH_BUCKET;
	public static final Item LIGHT_LOOSEJAW_BUCKET;
	public static final Item SMALLTOOTH_DRAGONFISH_BUCKET;

	/* ----------------- SPAWN EGGS ------------------- */
	public static final Item BARBELED_LOOSEJAW_SPAWN_EGG;
	public static final Item BETTA_SPAWN_EGG;
	public static final Item BLACK_LOOSEJAW_SPAWN_EGG;
	public static final Item DEEP_LAKE_BETTA_SPAWN_EGG;
	public static final Item GIANT_HATCHETFISH_SPAWN_EGG;
	public static final Item LIGHT_LOOSEJAW_SPAWN_EGG;
	public static final Item SMALLTOOTH_DRAGONFISH_SPAWN_EGG;
	public static final Item STASP_SPAWN_EGG;

	/* ------------- FRUITS -------------- */
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

	/* --------------- BOAT -------------- */
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
	public static final Item DARK_FUSHSITRA_BOAT;
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

	/* --------------- STICK -------------- */
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
	public static final Item DARK_FUSHSITRA_STICK;
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

	/* --------------- FOOD ----------------- */
	public static final Item BARBELED_LOOSEJAW;
	public static final Item BETTA;
	public static final Item BLACK_LOOSEJAW;
	public static final Item DEEP_LAKE_BETTA;
	public static final Item GIANT_HATCHETFISH;
	public static final Item LIGHT_LOOSEJAW;
	public static final Item SMALLTOOTH_DRAGONFISH;

	/* ------------- COOKED FOOD ---------------- */
	public static final Item COOKED_GIANT_HATCHETFISH;

	/* ------------- WEAPONS ----------- */
	public static final Item ADAIGGER;

	/* ------------- GOO's --------------------- */
	public static final Item CYAN_BIOLUMINESCENT_GOO;
	public static final Item GREEN_BIOLUMINESCENT_GOO;
	public static final Item LIGHT_BLUE_BIOLUMINESCENT_GOO;

	/* ------------ GYNDELION ------------- */
	public static final Item GYLDELION_DYE;
	public static final Item GYLDELION_INGOT;
	public static final Item GYLDELION_NUGGET;

	/* ------------ MOB DROPS -------------- */
	public static final Item LOOSEJAW_TOOTH;


	protected static Item boat(String id, WoodType type) {
		return register(id, new ModBoatItem(type, new Item.Settings().maxCount(1).group(ItemGroups.GENERAL)));
	}

	protected static Item fishBucket(String id, EntityType<?> type) {
		return register(id, new FishBucketItem(type, WATER, new Item.Settings().maxCount(1).group(ItemGroups.GENERAL)));
	}

	protected static Item food(String id, FoodComponent food) {
		return register(id, new Settings().group(GENERAL).food(food));
	}

	protected static Item spawnEgg(String id, EntityType<?> type, int primaryColor, int secondaryColor) {
		return register(id, new SpawnEggItem(type, primaryColor, secondaryColor, new Item.Settings().maxCount(1).group(ItemGroups.GENERAL)));
	}

	protected static Item tagFishBucket(String id, EntityType<?> type, Tag<EntityType<?>> tag) {
		return register(id, new TagFishBucketItem(type, tag, WATER, new Item.Settings().maxCount(1).group(ItemGroups.GENERAL)));
	}

	protected static Item tagSpawnEgg(String id, EntityType<?> type, Tag<EntityType<?>> tag, int primaryColor, int secondaryColor) {
		return register(id, new TagSpawnEggItem(type, tag, primaryColor, secondaryColor, new Item.Settings().maxCount(1).group(ItemGroups.GENERAL)));
	}

	protected static Item item(String id, ItemGroup itemGroup) {
		return register(id, new Settings().group(itemGroup));
	}

	protected static Item register(String id, Item item) {
		return Registry.register(ITEM, id, item);
	}

	protected static Item register(String id, Settings settings) {
		return register(id, new Item(settings));
	}

	static {
		BARBELED_LOOSEJAW_BUCKET = fishBucket("deep_trenches:barbeled_loosejaw_bucket", EntityTypes.BARBELED_LOOSEJAW);
		BETTA_BUCKET = fishBucket("deep_trenches:betta_bucket", EntityTypes.BETTA);
		BLACK_LOOSEJAW_BUCKET = fishBucket("deep_trenches:black_loosejaw_bucket", EntityTypes.BLACK_LOOSEJAW);
		LIGHT_LOOSEJAW_BUCKET = fishBucket("deep_trenches:light_loosejaw_bucket", EntityTypes.LIGHT_LOOSEJAW);

		DEEP_LAKE_BETTA_BUCKET = tagFishBucket("deep_trenches:deep_lake_betta_bucket", EntityTypes.DEEP_LAKE_BETTA, EntityTypeTags.TRELOSIAGNUS_BETTA);
		GIANT_HATCHETFISH_BUCKET = tagFishBucket("deep_trenches:giant_hatchetfish_bucket", EntityTypes.GIANT_HATCHETFISH,  EntityTypeTags.ARGYROPELECUS_GIGAS);
		SMALLTOOTH_DRAGONFISH_BUCKET = tagFishBucket("deep_trenches:smalltooth_dragonfish_bucket", EntityTypes.SMALLTOOTH_DRAGONFISH, EntityTypeTags.PACHYSTOMIAS_MICRODON);

		/* -------------------------------- SPAWN EGGS ------------------------------------------- */
		BARBELED_LOOSEJAW_SPAWN_EGG = spawnEgg("deep_trenches:barbeled_loosejaw_spawn_egg", EntityTypes.BARBELED_LOOSEJAW, 921113, 15859744);
		BETTA_SPAWN_EGG = spawnEgg("deep_trenches:betta_spawn_egg", EntityTypes.BETTA,7347502, 9183521);
		BLACK_LOOSEJAW_SPAWN_EGG = spawnEgg("deep_trenches:black_loosejaw_spawn_egg", EntityTypes.BLACK_LOOSEJAW,2102566, 11010053);
		LIGHT_LOOSEJAW_SPAWN_EGG = spawnEgg("deep_trenches:light_loosejaw_spawn_egg", EntityTypes.LIGHT_LOOSEJAW,1643048, 4836351);
		STASP_SPAWN_EGG = tagSpawnEgg("deep_trenches:stasp_spawn_egg", EntityTypes.ORANGE_WINGED_STASP, EntityTypeTags.STASPS, 2695792, 5124510);

		DEEP_LAKE_BETTA_SPAWN_EGG = tagSpawnEgg("deep_trenches:deep_lake_betta_spawn_egg", EntityTypes.DEEP_LAKE_BETTA, EntityTypeTags.TRELOSIAGNUS_BETTA, 1189390, 5013319);
		GIANT_HATCHETFISH_SPAWN_EGG = tagSpawnEgg("deep_trenches:giant_hatchetfish_spawn_egg", EntityTypes.GIANT_HATCHETFISH, EntityTypeTags.ARGYROPELECUS_GIGAS, 9870757, 12311039);
		SMALLTOOTH_DRAGONFISH_SPAWN_EGG = tagSpawnEgg("deep_trenches:smalltooth_dragonfish_spawn_egg", EntityTypes.SMALLTOOTH_DRAGONFISH, EntityTypeTags.PACHYSTOMIAS_MICRODON, 1250598, 16728832);

		/* -------------------------------- FRUITS ------------------------------------------- */
		ALMOND = food("deep_trenches:almond", SWEET_BERRIES);
		ALMOND_DRUPE = food("deep_trenches:almond_drupe", SWEET_BERRIES);
		AQUEAN_SAP = item("deep_trenches:aquean_sap", GENERAL);
		BOTTLE_OF_AQUEAN_SAP = item("deep_trenches:bottle_of_aquean_sap", GENERAL);
		CHERRY = food("deep_trenches:cherry", SWEET_BERRIES);
		CROLOOD_FRUIT = food("deep_trenches:crolood_fruit", APPLE);
		DARK_CROLOOD_FRUIT = food("deep_trenches:dark_crolood_fruit", APPLE);
		PERSIMMON_FRUIT = food("deep_trenches:persimmon_fruit", APPLE);
		PIN_CHERRY = food("deep_trenches:pin_cherry", SWEET_BERRIES);
		PLUM = food("deep_trenches:plum", APPLE);
		THUNDERCLOUD_PLUM = food("deep_trenches:thundercloud_plum", APPLE);

		/* -------------------------------- BOAT ------------------------------------------- */
		ALMOND_BOAT = boat("deep_trenches:almond_boat", WoodType.ALMOND);
		ANAMEATA_BOAT = boat("deep_trenches:anameata_boat", WoodType.ANAMEATA);
		ANGELS_TRUMPET_BOAT = boat("deep_trenches:angels_trumpet_boat", WoodType.AQUEAN);
		AQUEAN_BOAT = boat("deep_trenches:aquean_boat", WoodType.AQUEAN);
		BARSHROOKLE_BOAT = boat("deep_trenches:barshrookle_boat", WoodType.BARSHROOKLE);
		BLACK_BIRCH_BOAT = boat("deep_trenches:black_birch_boat", WoodType.BLACK_BIRCH);
		BLUE_MAHOE_BOAT = boat("deep_trenches:blue_mahoe_boat", WoodType.BARSHROOKLE);
		BLUE_SPRUCE_BOAT = boat("deep_trenches:blue_spruce_boat", WoodType.BARSHROOKLE);
		BOTTLEBRUSH_BOAT = boat("deep_trenches:bottlebrush_boat", WoodType.BARSHROOKLE);
		BROMYA_BOAT = boat("deep_trenches:bromya_boat", WoodType.BARSHROOKLE);
		BUBBLETREE_BOAT = boat("deep_trenches:bubbletree_boat", WoodType.BARSHROOKLE);
		CALCEARB_BOAT = boat("deep_trenches:calcearb_boat", WoodType.BARSHROOKLE);
		CHERRY_BOAT = boat("deep_trenches:cherry_boat", WoodType.CHERRY);
		CHOTORN_BOAT = boat("deep_trenches:chotorn_boat", WoodType.CHERRY);
		COOK_PINE_BOAT = boat("deep_trenches:cook_pine_boat", WoodType.COOK_PINE);
		CROLOOD_BOAT = boat("deep_trenches:crolood_boat", WoodType.CROLOOD);
		DARK_CROLOOD_BOAT = boat("deep_trenches:dark_crolood_boat", WoodType.DARK_CROLOOD);
		DARK_FUSHSITRA_BOAT = boat("deep_trenches:dark_fuchsitra_boat", WoodType.DARK_CROLOOD);
		DARK_RED_ELM_BOAT = boat("deep_trenches:dark_red_elm_boat", WoodType.DARK_CROLOOD);
		DEAD_WART_TREE_BOAT = boat("deep_trenches:dead_wart_tree_boat", WoodType.DARK_CROLOOD);
		DRIGYUS_BOAT = boat("deep_trenches:drigyus_boat", WoodType.DARK_CROLOOD);
		EBONY_BOAT = boat("deep_trenches:ebony_boat", WoodType.EBONY);
		ENDERHEART_BOAT = boat("deep_trenches:enderheart_boat", WoodType.EBONY);
		FLALM_BOAT = boat("deep_trenches:flalm_boat", WoodType.EBONY);
		FRUCE_BOAT = boat("deep_trenches:fruce_boat", WoodType.EBONY);
		FUCHSITRA_BOAT = boat("deep_trenches:fuchsitra_boat", WoodType.FUCHSITRA);
		FUGMOS_BOAT = boat("deep_trenches:fugmos_boat", WoodType.FUCHSITRA);
		FUNERANITE_BOAT = boat("deep_trenches:funeranite_boat", WoodType.FUNERANITE);
		GHOSHROOM_BOAT = boat("deep_trenches:ghoshroom_boat", WoodType.GHOSHROOM);
		GIANT_VIOLET_BOAT = boat("deep_trenches:giant_violet_boat", WoodType.GHOSHROOM);
		GUAIACUM_BOAT = boat("deep_trenches:guaiacum_boat", WoodType.GHOSHROOM);
		JOSHUA_BOAT = boat("deep_trenches:joshua_boat", WoodType.GHOSHROOM);
		KLINKII_PINE_BOAT = boat("deep_trenches:klinkii_pine_boat", WoodType.GHOSHROOM);
		MELALEUCA_BOAT = boat("deep_trenches:melaleuca_boat", WoodType.GHOSHROOM);
		MURKANTUAN_BOAT = boat("deep_trenches:murkantuan_boat", WoodType.MURKANTUAN);
		NORFOLK_PINE_BOAT = boat("deep_trenches:norfolk_pine_boat", WoodType.MURKANTUAN);
		OBSCRUS_BOAT = boat("deep_trenches:obscrus_boat", WoodType.MURKANTUAN);
		ORHPRIS_BOAT = boat("deep_trenches:orhpris_boat", WoodType.MURKANTUAN);
		PELTOGYNE_BOAT = boat("deep_trenches:peltogyne_boat", WoodType.PELTOGYNE);
		PIN_CHERRY_BOAT = boat("deep_trenches:pin_cherry_boat", WoodType.PIN_CHERRY);
		PLUM_BOAT = boat("deep_trenches:plum_boat", WoodType.PLUM);
		PURFUNGA_BOAT = boat("deep_trenches:purfunga_boat", WoodType.PURFUNGA);
		RARK_BOAT = boat("deep_trenches:rark_boat", WoodType.PURFUNGA);
		RED_ELM_BOAT = boat("deep_trenches:red_elm_boat", WoodType.PURFUNGA);
		RHADI_BOAT = boat("deep_trenches:rhadi_boat", WoodType.PURFUNGA);
		SANGUART_BOAT = boat("deep_trenches:sanguart_boat", WoodType.PURFUNGA);
		SCARLET_THIORCEN_BOAT = boat("deep_trenches:scarlet_thiorcen_boat", WoodType.PURFUNGA);
		SEQUOIA_BOAT = boat("deep_trenches:sequoia_boat", WoodType.PURFUNGA);
		SPROOM_BOAT = boat("deep_trenches:sproom_boat", WoodType.SPROOM);
		STORTREEAN_BOAT = boat("deep_trenches:stortreean_boat", WoodType.STORTREEAN);
		STROOMEAN_BOAT = boat("deep_trenches:stroomean_boat", WoodType.STROOMEAN);
		SUNRISE_FUNGUS_BOAT = boat("deep_trenches:sunrise_fungus_boat", WoodType.SUNRISE_FUNGUS);
		TARK_BOAT = boat("deep_trenches:tark_boat", WoodType.SUNRISE_FUNGUS);
		TEAK_BOAT = boat("deep_trenches:teak_boat", WoodType.TEAK);
		THUNDERCLOUD_PLUM_BOAT = boat("deep_trenches:thundercloud_plum_boat", WoodType.THUNDERCLOUD_PLUM);
		VYNHERT_BOAT = boat("deep_trenches:vynhert_boat", WoodType.THUNDERCLOUD_PLUM);
		WART_TREE_BOAT = boat("deep_trenches:wart_tree_boat", WoodType.THUNDERCLOUD_PLUM);
		WENGE_BOAT = boat("deep_trenches:wenge_boat", WoodType.THUNDERCLOUD_PLUM);
		YEW_BOAT = boat("deep_trenches:yew_boat", WoodType.THUNDERCLOUD_PLUM);

		/* -------------------------------- STICK ------------------------------------------- */
		ALMOND_STICK = item("deep_trenches:almond_stick", GENERAL);
		ANAMEATA_STICK = item("deep_trenches:anameata_stick", GENERAL);
		ANGELS_TRUMPET_STICK = boat("deep_trenches:angels_trumpet_stick", WoodType.AQUEAN);
		AQUEAN_STICK = item("deep_trenches:aquean_stick", GENERAL);
		BARSHROOKLE_STICK = item("deep_trenches:barshrookle_stick", GENERAL);
		BLACK_BIRCH_STICK = item("deep_trenches:black_birch_stick", GENERAL);
		BLUE_MAHOE_STICK = boat("deep_trenches:blue_mahoe_stick", WoodType.BARSHROOKLE);
		BLUE_SPRUCE_STICK = boat("deep_trenches:blue_spruce_stick", WoodType.BARSHROOKLE);
		BOTTLEBRUSH_STICK = boat("deep_trenches:bottlebrush_stick", WoodType.BARSHROOKLE);
		BROMYA_STICK = boat("deep_trenches:bromya_stick", WoodType.BARSHROOKLE);
		BUBBLETREE_STICK = boat("deep_trenches:bubbletree_stick", WoodType.BARSHROOKLE);
		CALCEARB_STICK = boat("deep_trenches:calcearb_stick", WoodType.BARSHROOKLE);
		CHERRY_STICK = item("deep_trenches:cherry_stick", GENERAL);
		CHOTORN_STICK = boat("deep_trenches:chotorn_stick", WoodType.CHERRY);
		COOK_PINE_STICK = item("deep_trenches:cook_pine_stick", GENERAL);
		CROLOOD_STICK = item("deep_trenches:crolood_stick", GENERAL);
		DARK_CROLOOD_STICK = item("deep_trenches:dark_crolood_stick", GENERAL);
		DARK_FUSHSITRA_STICK = boat("deep_trenches:dark_fuchsitra_stick", WoodType.DARK_CROLOOD);
		DARK_RED_ELM_STICK = boat("deep_trenches:dark_red_elm_stick", WoodType.DARK_CROLOOD);
		DEAD_WART_TREE_STICK = boat("deep_trenches:dead_wart_tree_stick", WoodType.DARK_CROLOOD);
		DRIGYUS_STICK = boat("deep_trenches:drigyus_stick", WoodType.DARK_CROLOOD);
		EBONY_STICK = item("deep_trenches:ebony_stick", GENERAL);
		ENDERHEART_STICK = boat("deep_trenches:enderheart_stick", WoodType.EBONY);
		FLALM_STICK = boat("deep_trenches:flalm_stick", WoodType.EBONY);
		FRUCE_STICK = boat("deep_trenches:fruce_stick", WoodType.EBONY);
		FUCHSITRA_STICK = item("deep_trenches:fuchsitra_stick", GENERAL);
		FUGMOS_STICK = boat("deep_trenches:fugmos_stick", WoodType.FUCHSITRA);
		FUNERANITE_STICK = item("deep_trenches:funeranite_stick", GENERAL);
		GHOSHROOM_STICK = item("deep_trenches:ghoshroom_stick", GENERAL);
		GIANT_VIOLET_STICK = boat("deep_trenches:giant_violet_stick", WoodType.GHOSHROOM);
		GUAIACUM_STICK = boat("deep_trenches:guaiacum_stick", WoodType.GHOSHROOM);
		JOSHUA_STICK = boat("deep_trenches:joshua_stick", WoodType.GHOSHROOM);
		KLINKII_PINE_STICK = boat("deep_trenches:klinkii_pine_stick", WoodType.GHOSHROOM);
		MELALEUCA_STICK = boat("deep_trenches:melaleuca_stick", WoodType.GHOSHROOM);
		GYLDELION_STICK = item("deep_trenches:gyldelion_stick", GENERAL);
		MURKANTUAN_STICK = item("deep_trenches:murkantuan_stick", GENERAL);
		NORFOLK_PINE_STICK = boat("deep_trenches:norfolk_pine_stick", WoodType.MURKANTUAN);
		OBSCRUS_STICK = boat("deep_trenches:obscrus_stick", WoodType.MURKANTUAN);
		ORHPRIS_STICK = boat("deep_trenches:orhpris_stick", WoodType.MURKANTUAN);
		PELTOGYNE_STICK = item("deep_trenches:peltogyne_stick", GENERAL);
		PIN_CHERRY_STICK = item("deep_trenches:pin_cherry_stick", GENERAL);
		PLUM_STICK = item("deep_trenches:plum_stick", GENERAL);
		PURFUNGA_STICK = item("deep_trenches:purfunga_stick", GENERAL);
		RARK_STICK = boat("deep_trenches:rark_stick", WoodType.PURFUNGA);
		RED_ELM_STICK = boat("deep_trenches:red_elm_stick", WoodType.PURFUNGA);
		RHADI_STICK = boat("deep_trenches:rhadi_stick", WoodType.PURFUNGA);
		SANGUART_STICK = boat("deep_trenches:sanguart_stick", WoodType.PURFUNGA);
		SCARLET_THIORCEN_STICK = boat("deep_trenches:scarlet_thiorcen_stick", WoodType.PURFUNGA);
		SEQUOIA_STICK = boat("deep_trenches:sequoia_stick", WoodType.PURFUNGA);
		SPROOM_STICK = item("deep_trenches:sproom_stick", GENERAL);
		STORTREEAN_STICK = item("deep_trenches:stortreean_stick", GENERAL);
		STROOMEAN_STICK = item("deep_trenches:stroomean_stick", GENERAL);
		SUNRISE_FUNGUS_STICK = item("deep_trenches:sunrise_fungus_stick", GENERAL);
		TARK_STICK = boat("deep_trenches:tark_stick", WoodType.SUNRISE_FUNGUS);
		TEAK_STICK = item("deep_trenches:teak_stick", GENERAL);
		THUNDERCLOUD_PLUM_STICK = item("deep_trenches:thundercloud_plum_stick", GENERAL);
		VYNHERT_STICK = boat("deep_trenches:vynhert_stick", WoodType.THUNDERCLOUD_PLUM);
		WART_TREE_STICK = boat("deep_trenches:wart_tree_stick", WoodType.THUNDERCLOUD_PLUM);
		WENGE_STICK = boat("deep_trenches:wenge_stick", WoodType.THUNDERCLOUD_PLUM);
		YEW_STICK = boat("deep_trenches:yew_stick", WoodType.THUNDERCLOUD_PLUM);

		/* -------------------------------- FOOD ------------------------------------------- */
		BARBELED_LOOSEJAW = food("deep_trenches:barbeled_loosejaw", STORCEAN_FISH);
		BETTA = food("deep_trenches:betta", STORCEAN_FISH);
		BLACK_LOOSEJAW = food("deep_trenches:black_loosejaw", STORCEAN_FISH);
		DEEP_LAKE_BETTA = food("deep_trenches:deep_lake_betta", STORCEAN_FISH);
		GIANT_HATCHETFISH = food("deep_trenches:giant_hatchetfish", ModFoodComponents.GIANT_HATCHETFISH);
		LIGHT_LOOSEJAW = food("deep_trenches:light_loosejaw", STORCEAN_FISH);
		SMALLTOOTH_DRAGONFISH =  food("deep_trenches:smalltooth_dragonfish", STORCEAN_FISH);

		/* -------------------------------- COOKED FOOD ------------------------------------------- */
		COOKED_GIANT_HATCHETFISH = food("deep_trenches:cooked_giant_hatchetfish", ModFoodComponents.COOKED_GIANT_HATCHETFISH);

		/* -------------------------------- WEAPONS ------------------------------------------- */
		ADAIGGER = register("deep_trenches:adaigger", new AdaiggerItem(new Settings().group(GENERAL)));

		/* -------------------------------- GOO's ------------------------------------------- */
		CYAN_BIOLUMINESCENT_GOO = item("deep_trenches:cyan_bioluminescent_goo", GENERAL);
		GREEN_BIOLUMINESCENT_GOO = item("deep_trenches:green_bioluminescent_goo", GENERAL);
		LIGHT_BLUE_BIOLUMINESCENT_GOO = item("deep_trenches:light_blue_bioluminescent_goo", GENERAL);

		/* -------------------------------- GYNDELION ------------------------------------------- */
		GYLDELION_DYE = item("deep_trenches:gyldelion_dye", GENERAL);
		GYLDELION_INGOT = item("deep_trenches:gyldelion_ingot", GENERAL);
		GYLDELION_NUGGET = item("deep_trenches:gyldelion_nugget", GENERAL);

		/* -------------------------------- MOB DROPS ------------------------------------------- */
		LOOSEJAW_TOOTH = item("deep_trenches:loosejaw_tooth", GENERAL);
	}

}
