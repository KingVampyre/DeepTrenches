package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.common.item.ModBoatItem;
import github.KingVampyre.DeepTrenches.common.item.TagFishBucketItem;
import github.KingVampyre.DeepTrenches.common.item.TagSpawnEggItem;
import github.KingVampyre.DeepTrenches.core.item.AdaiggerItem;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.*;
import net.minecraft.item.Item.Settings;
import net.minecraft.tag.Tag;
import net.minecraft.util.registry.Registry;

import java.util.function.Function;

import static github.KingVampyre.DeepTrenches.core.init.ItemGroups.GENERAL;
import static github.KingVampyre.DeepTrenches.core.init.ModFoodComponents.STORCEAN_FISH;
import static net.minecraft.fluid.Fluids.WATER;
import static net.minecraft.item.FoodComponents.APPLE;
import static net.minecraft.item.FoodComponents.SWEET_BERRIES;
import static net.minecraft.item.Items.BUCKET;
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

	/* --------------- FLUID BUCKETS ----------------- */
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

	/* ------------ BLOCK ITEMS -------------- */
	public static final Item AIRIAL_MOSS;

	protected static Item createBlockItem(String id, Block block, ItemGroup itemGroup) {
		return createBlockItem(id, block, new Settings().group(itemGroup));
	}

	protected static Item createBlockItem(String id, Block block, Settings settings) {
		return register(id, new BlockItem(block, settings));
	}

	protected static Item createBoat(String id, WoodType type) {
		return register(id, new ModBoatItem(type, new Item.Settings().maxCount(1).group(ItemGroups.GENERAL)));
	}

	protected static Item createBucket(String id, FlowableFluid fluid) {
		return register(id, new BucketItem(fluid,  new Item.Settings().recipeRemainder(BUCKET).maxCount(1).group(ItemGroups.GENERAL)));
	}

	protected static Item createFishBucket(String id, EntityType<?> type) {
		return register(id, new FishBucketItem(type, WATER, new Item.Settings().maxCount(1).group(ItemGroups.GENERAL)));
	}

	protected static Item createFishBucket(String id, EntityType<?> type, Tag<EntityType<?>> tag) {
		return register(id, new TagFishBucketItem(type, tag, WATER, new Item.Settings().maxCount(1).group(ItemGroups.GENERAL)));
	}

	protected static Item createFood(String id, FoodComponent food) {
		return createItem(id, new Settings().group(GENERAL).food(food));
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

	protected static Item createSpawnEgg(String id, EntityType<?> type, int primaryColor, int secondaryColor) {
		return register(id, new SpawnEggItem(type, primaryColor, secondaryColor, new Item.Settings().maxCount(1).group(ItemGroups.GENERAL)));
	}

	protected static Item createSpawnEgg(String id, EntityType<?> type, Tag<EntityType<?>> tag, int primaryColor, int secondaryColor) {
		return register(id, new TagSpawnEggItem(type, tag, primaryColor, secondaryColor, new Item.Settings().maxCount(1).group(ItemGroups.GENERAL)));
	}

	protected static Item register(String id, Item item) {
		return Registry.register(ITEM, id, item);
	}

	static {
		BARBELED_LOOSEJAW_BUCKET = createFishBucket("deep_trenches:barbeled_loosejaw_bucket", EntityTypes.BARBELED_LOOSEJAW);
		BETTA_BUCKET = createFishBucket("deep_trenches:betta_bucket", EntityTypes.BETTA);
		BLACK_LOOSEJAW_BUCKET = createFishBucket("deep_trenches:black_loosejaw_bucket", EntityTypes.BLACK_LOOSEJAW);
		LIGHT_LOOSEJAW_BUCKET = createFishBucket("deep_trenches:light_loosejaw_bucket", EntityTypes.LIGHT_LOOSEJAW);

		ABYSSOPELAGIC_WATER_BUCKET = createBucket("deep_trenches:abyssopelagic_water_bucket", ModFluids.ABYSSOPELAGIC_WATER);
		ACID_BUCKET = createBucket("deep_trenches:acid_bucket", ModFluids.ACID);
		BATHYPELAGIC_WATER_BUCKET = createBucket("deep_trenches:bathypelagic_water_bucket", ModFluids.BATHYPELAGIC_WATER);
		BRINE_BUCKET = createBucket("deep_trenches:brine_bucket", ModFluids.BRINE);
		CLEAR_WATER_BUCKET = createBucket("deep_trenches:clear_water_bucket", ModFluids.CLEAR_WATER);
		HADOPELAGIC_WATER_BUCKET = createBucket("deep_trenches:hadopelagic_water_bucket", ModFluids.HADOPELAGIC_WATER);
		MESOPELAGIC_WATER_BUCKET = createBucket("deep_trenches:mesopelagic_water_bucket", ModFluids.MESOPELAGIC_WATER);
		STORCEAN_ABYSSOPELAGIC_WATER_BUCKET = createBucket("deep_trenches:storcean_abyssopelagic_water_bucket", ModFluids.STORCEAN_ABYSSOPELAGIC_WATER);
		STORCEAN_BATHYPELAGIC_WATER_BUCKET = createBucket("deep_trenches:storcean_bathypelagic_water_bucket", ModFluids.STORCEAN_BATHYPELAGIC_WATER);
		STORCEAN_ENDERPELAGIC_WATER_BUCKET = createBucket("deep_trenches:storcean_enderpelagic_water_bucket", ModFluids.STORCEAN_ENDERPELAGIC_WATER);
		STORCEAN_GASOPELAGIC_WATER_BUCKET = createBucket("deep_trenches:storcean_gasopelagic_water_bucket", ModFluids.STORCEAN_GASOPELAGIC_WATER);
		STORCEAN_HADOPELAGIC_WATER_BUCKET = createBucket("deep_trenches:storcean_hadopelagic_water_bucket", ModFluids.STORCEAN_HADOPELAGIC_WATER);
		STORCEAN_INFINIPELAGIC_WATER_BUCKET = createBucket("deep_trenches:storcean_infinipelagic_water_bucket", ModFluids.STORCEAN_INFINIPELAGIC_WATER);
		STORCEAN_MESOPELAGIC_WATER_BUCKET = createBucket("deep_trenches:storcean_mesopelagic_water_bucket", ModFluids.STORCEAN_MESOPELAGIC_WATER);
		STORCEAN_VIRDIPELAGIC_WATER_BUCKET = createBucket("deep_trenches:storcean_virdipelagic_water_bucket", ModFluids.STORCEAN_VIRDIPELAGIC_WATER);
		STORCEAN_WATER_BUCKET = createBucket("deep_trenches:storcean_water_bucket", ModFluids.STORCEAN_WATER);

		DEEP_LAKE_BETTA_BUCKET = createFishBucket("deep_trenches:deep_lake_betta_bucket", EntityTypes.DEEP_LAKE_BETTA, EntityTypeTags.TRELOSIAGNUS_BETTA);
		GIANT_HATCHETFISH_BUCKET = createFishBucket("deep_trenches:giant_hatchetfish_bucket", EntityTypes.GIANT_HATCHETFISH,  EntityTypeTags.ARGYROPELECUS_GIGAS);
		SMALLTOOTH_DRAGONFISH_BUCKET = createFishBucket("deep_trenches:smalltooth_dragonfish_bucket", EntityTypes.SMALLTOOTH_DRAGONFISH, EntityTypeTags.PACHYSTOMIAS_MICRODON);

		/* -------------------------------- SPAWN EGGS ------------------------------------------- */
		BARBELED_LOOSEJAW_SPAWN_EGG = createSpawnEgg("deep_trenches:barbeled_loosejaw_spawn_egg", EntityTypes.BARBELED_LOOSEJAW, 921113, 15859744);
		BETTA_SPAWN_EGG = createSpawnEgg("deep_trenches:betta_spawn_egg", EntityTypes.BETTA,7347502, 9183521);
		BLACK_LOOSEJAW_SPAWN_EGG = createSpawnEgg("deep_trenches:black_loosejaw_spawn_egg", EntityTypes.BLACK_LOOSEJAW,2102566, 11010053);
		LIGHT_LOOSEJAW_SPAWN_EGG = createSpawnEgg("deep_trenches:light_loosejaw_spawn_egg", EntityTypes.LIGHT_LOOSEJAW,1643048, 4836351);
		STASP_SPAWN_EGG = createSpawnEgg("deep_trenches:stasp_spawn_egg", EntityTypes.ORANGE_WINGED_STASP, EntityTypeTags.STASPS, 2695792, 5124510);

		DEEP_LAKE_BETTA_SPAWN_EGG = createSpawnEgg("deep_trenches:deep_lake_betta_spawn_egg", EntityTypes.DEEP_LAKE_BETTA, EntityTypeTags.TRELOSIAGNUS_BETTA, 1189390, 5013319);
		GIANT_HATCHETFISH_SPAWN_EGG = createSpawnEgg("deep_trenches:giant_hatchetfish_spawn_egg", EntityTypes.GIANT_HATCHETFISH, EntityTypeTags.ARGYROPELECUS_GIGAS, 9870757, 12311039);
		SMALLTOOTH_DRAGONFISH_SPAWN_EGG = createSpawnEgg("deep_trenches:smalltooth_dragonfish_spawn_egg", EntityTypes.SMALLTOOTH_DRAGONFISH, EntityTypeTags.PACHYSTOMIAS_MICRODON, 1250598, 16728832);

		/* -------------------------------- FRUITS ------------------------------------------- */
		ALMOND = createFood("deep_trenches:almond", SWEET_BERRIES);
		ALMOND_DRUPE = createFood("deep_trenches:almond_drupe", SWEET_BERRIES);
		AQUEAN_SAP = createItem("deep_trenches:aquean_sap", GENERAL);
		BOTTLE_OF_AQUEAN_SAP = createItem("deep_trenches:bottle_of_aquean_sap", GENERAL);
		CHERRY = createFood("deep_trenches:cherry", SWEET_BERRIES);
		CROLOOD_FRUIT = createFood("deep_trenches:crolood_fruit", APPLE);
		DARK_CROLOOD_FRUIT = createFood("deep_trenches:dark_crolood_fruit", APPLE);
		PERSIMMON_FRUIT = createFood("deep_trenches:persimmon_fruit", APPLE);
		PIN_CHERRY = createFood("deep_trenches:pin_cherry", SWEET_BERRIES);
		PLUM = createFood("deep_trenches:plum", APPLE);
		THUNDERCLOUD_PLUM = createFood("deep_trenches:thundercloud_plum", APPLE);

		/* -------------------------------- BOAT ------------------------------------------- */
		ALMOND_BOAT = createBoat("deep_trenches:almond_boat", WoodType.ALMOND);
		ANAMEATA_BOAT = createBoat("deep_trenches:anameata_boat", WoodType.ANAMEATA);
		ANGELS_TRUMPET_BOAT = createBoat("deep_trenches:angels_trumpet_boat", WoodType.AQUEAN);
		AQUEAN_BOAT = createBoat("deep_trenches:aquean_boat", WoodType.AQUEAN);
		BARSHROOKLE_BOAT = createBoat("deep_trenches:barshrookle_boat", WoodType.BARSHROOKLE);
		BLACK_BIRCH_BOAT = createBoat("deep_trenches:black_birch_boat", WoodType.BLACK_BIRCH);
		BLUE_MAHOE_BOAT = createBoat("deep_trenches:blue_mahoe_boat", WoodType.BARSHROOKLE);
		BLUE_SPRUCE_BOAT = createBoat("deep_trenches:blue_spruce_boat", WoodType.BARSHROOKLE);
		BOTTLEBRUSH_BOAT = createBoat("deep_trenches:bottlebrush_boat", WoodType.BARSHROOKLE);
		BROMYA_BOAT = createBoat("deep_trenches:bromya_boat", WoodType.BARSHROOKLE);
		BUBBLETREE_BOAT = createBoat("deep_trenches:bubbletree_boat", WoodType.BARSHROOKLE);
		CALCEARB_BOAT = createBoat("deep_trenches:calcearb_boat", WoodType.BARSHROOKLE);
		CHERRY_BOAT = createBoat("deep_trenches:cherry_boat", WoodType.CHERRY);
		CHOTORN_BOAT = createBoat("deep_trenches:chotorn_boat", WoodType.CHERRY);
		COOK_PINE_BOAT = createBoat("deep_trenches:cook_pine_boat", WoodType.COOK_PINE);
		CROLOOD_BOAT = createBoat("deep_trenches:crolood_boat", WoodType.CROLOOD);
		DARK_CROLOOD_BOAT = createBoat("deep_trenches:dark_crolood_boat", WoodType.DARK_CROLOOD);
		DARK_FUSHSITRA_BOAT = createBoat("deep_trenches:dark_fuchsitra_boat", WoodType.DARK_CROLOOD);
		DARK_RED_ELM_BOAT = createBoat("deep_trenches:dark_red_elm_boat", WoodType.DARK_CROLOOD);
		DEAD_WART_TREE_BOAT = createBoat("deep_trenches:dead_wart_tree_boat", WoodType.DARK_CROLOOD);
		DRIGYUS_BOAT = createBoat("deep_trenches:drigyus_boat", WoodType.DARK_CROLOOD);
		EBONY_BOAT = createBoat("deep_trenches:ebony_boat", WoodType.EBONY);
		ENDERHEART_BOAT = createBoat("deep_trenches:enderheart_boat", WoodType.EBONY);
		FLALM_BOAT = createBoat("deep_trenches:flalm_boat", WoodType.EBONY);
		FRUCE_BOAT = createBoat("deep_trenches:fruce_boat", WoodType.EBONY);
		FUCHSITRA_BOAT = createBoat("deep_trenches:fuchsitra_boat", WoodType.FUCHSITRA);
		FUGMOS_BOAT = createBoat("deep_trenches:fugmos_boat", WoodType.FUCHSITRA);
		FUNERANITE_BOAT = createBoat("deep_trenches:funeranite_boat", WoodType.FUNERANITE);
		GHOSHROOM_BOAT = createBoat("deep_trenches:ghoshroom_boat", WoodType.GHOSHROOM);
		GIANT_VIOLET_BOAT = createBoat("deep_trenches:giant_violet_boat", WoodType.GHOSHROOM);
		GUAIACUM_BOAT = createBoat("deep_trenches:guaiacum_boat", WoodType.GHOSHROOM);
		JOSHUA_BOAT = createBoat("deep_trenches:joshua_boat", WoodType.GHOSHROOM);
		KLINKII_PINE_BOAT = createBoat("deep_trenches:klinkii_pine_boat", WoodType.GHOSHROOM);
		MELALEUCA_BOAT = createBoat("deep_trenches:melaleuca_boat", WoodType.GHOSHROOM);
		MURKANTUAN_BOAT = createBoat("deep_trenches:murkantuan_boat", WoodType.MURKANTUAN);
		NORFOLK_PINE_BOAT = createBoat("deep_trenches:norfolk_pine_boat", WoodType.MURKANTUAN);
		OBSCRUS_BOAT = createBoat("deep_trenches:obscrus_boat", WoodType.MURKANTUAN);
		ORHPRIS_BOAT = createBoat("deep_trenches:orhpris_boat", WoodType.MURKANTUAN);
		PELTOGYNE_BOAT = createBoat("deep_trenches:peltogyne_boat", WoodType.PELTOGYNE);
		PIN_CHERRY_BOAT = createBoat("deep_trenches:pin_cherry_boat", WoodType.PIN_CHERRY);
		PLUM_BOAT = createBoat("deep_trenches:plum_boat", WoodType.PLUM);
		PURFUNGA_BOAT = createBoat("deep_trenches:purfunga_boat", WoodType.PURFUNGA);
		RARK_BOAT = createBoat("deep_trenches:rark_boat", WoodType.PURFUNGA);
		RED_ELM_BOAT = createBoat("deep_trenches:red_elm_boat", WoodType.PURFUNGA);
		RHADI_BOAT = createBoat("deep_trenches:rhadi_boat", WoodType.PURFUNGA);
		SANGUART_BOAT = createBoat("deep_trenches:sanguart_boat", WoodType.PURFUNGA);
		SCARLET_THIORCEN_BOAT = createBoat("deep_trenches:scarlet_thiorcen_boat", WoodType.PURFUNGA);
		SEQUOIA_BOAT = createBoat("deep_trenches:sequoia_boat", WoodType.PURFUNGA);
		SPROOM_BOAT = createBoat("deep_trenches:sproom_boat", WoodType.SPROOM);
		STORTREEAN_BOAT = createBoat("deep_trenches:stortreean_boat", WoodType.STORTREEAN);
		STROOMEAN_BOAT = createBoat("deep_trenches:stroomean_boat", WoodType.STROOMEAN);
		SUNRISE_FUNGUS_BOAT = createBoat("deep_trenches:sunrise_fungus_boat", WoodType.SUNRISE_FUNGUS);
		TARK_BOAT = createBoat("deep_trenches:tark_boat", WoodType.SUNRISE_FUNGUS);
		TEAK_BOAT = createBoat("deep_trenches:teak_boat", WoodType.TEAK);
		THUNDERCLOUD_PLUM_BOAT = createBoat("deep_trenches:thundercloud_plum_boat", WoodType.THUNDERCLOUD_PLUM);
		VYNHERT_BOAT = createBoat("deep_trenches:vynhert_boat", WoodType.THUNDERCLOUD_PLUM);
		WART_TREE_BOAT = createBoat("deep_trenches:wart_tree_boat", WoodType.THUNDERCLOUD_PLUM);
		WENGE_BOAT = createBoat("deep_trenches:wenge_boat", WoodType.THUNDERCLOUD_PLUM);
		YEW_BOAT = createBoat("deep_trenches:yew_boat", WoodType.THUNDERCLOUD_PLUM);

		/* -------------------------------- STICK ------------------------------------------- */
		ALMOND_STICK = createItem("deep_trenches:almond_stick", GENERAL);
		ANAMEATA_STICK = createItem("deep_trenches:anameata_stick", GENERAL);
		ANGELS_TRUMPET_STICK = createBoat("deep_trenches:angels_trumpet_stick", WoodType.AQUEAN);
		AQUEAN_STICK = createItem("deep_trenches:aquean_stick", GENERAL);
		BARSHROOKLE_STICK = createItem("deep_trenches:barshrookle_stick", GENERAL);
		BLACK_BIRCH_STICK = createItem("deep_trenches:black_birch_stick", GENERAL);
		BLUE_MAHOE_STICK = createBoat("deep_trenches:blue_mahoe_stick", WoodType.BARSHROOKLE);
		BLUE_SPRUCE_STICK = createBoat("deep_trenches:blue_spruce_stick", WoodType.BARSHROOKLE);
		BOTTLEBRUSH_STICK = createBoat("deep_trenches:bottlebrush_stick", WoodType.BARSHROOKLE);
		BROMYA_STICK = createBoat("deep_trenches:bromya_stick", WoodType.BARSHROOKLE);
		BUBBLETREE_STICK = createBoat("deep_trenches:bubbletree_stick", WoodType.BARSHROOKLE);
		CALCEARB_STICK = createBoat("deep_trenches:calcearb_stick", WoodType.BARSHROOKLE);
		CHERRY_STICK = createItem("deep_trenches:cherry_stick", GENERAL);
		CHOTORN_STICK = createBoat("deep_trenches:chotorn_stick", WoodType.CHERRY);
		COOK_PINE_STICK = createItem("deep_trenches:cook_pine_stick", GENERAL);
		CROLOOD_STICK = createItem("deep_trenches:crolood_stick", GENERAL);
		DARK_CROLOOD_STICK = createItem("deep_trenches:dark_crolood_stick", GENERAL);
		DARK_FUSHSITRA_STICK = createBoat("deep_trenches:dark_fuchsitra_stick", WoodType.DARK_CROLOOD);
		DARK_RED_ELM_STICK = createBoat("deep_trenches:dark_red_elm_stick", WoodType.DARK_CROLOOD);
		DEAD_WART_TREE_STICK = createBoat("deep_trenches:dead_wart_tree_stick", WoodType.DARK_CROLOOD);
		DRIGYUS_STICK = createBoat("deep_trenches:drigyus_stick", WoodType.DARK_CROLOOD);
		EBONY_STICK = createItem("deep_trenches:ebony_stick", GENERAL);
		ENDERHEART_STICK = createBoat("deep_trenches:enderheart_stick", WoodType.EBONY);
		FLALM_STICK = createBoat("deep_trenches:flalm_stick", WoodType.EBONY);
		FRUCE_STICK = createBoat("deep_trenches:fruce_stick", WoodType.EBONY);
		FUCHSITRA_STICK = createItem("deep_trenches:fuchsitra_stick", GENERAL);
		FUGMOS_STICK = createBoat("deep_trenches:fugmos_stick", WoodType.FUCHSITRA);
		FUNERANITE_STICK = createItem("deep_trenches:funeranite_stick", GENERAL);
		GHOSHROOM_STICK = createItem("deep_trenches:ghoshroom_stick", GENERAL);
		GIANT_VIOLET_STICK = createBoat("deep_trenches:giant_violet_stick", WoodType.GHOSHROOM);
		GUAIACUM_STICK = createBoat("deep_trenches:guaiacum_stick", WoodType.GHOSHROOM);
		JOSHUA_STICK = createBoat("deep_trenches:joshua_stick", WoodType.GHOSHROOM);
		KLINKII_PINE_STICK = createBoat("deep_trenches:klinkii_pine_stick", WoodType.GHOSHROOM);
		MELALEUCA_STICK = createBoat("deep_trenches:melaleuca_stick", WoodType.GHOSHROOM);
		GYLDELION_STICK = createItem("deep_trenches:gyldelion_stick", GENERAL);
		MURKANTUAN_STICK = createItem("deep_trenches:murkantuan_stick", GENERAL);
		NORFOLK_PINE_STICK = createBoat("deep_trenches:norfolk_pine_stick", WoodType.MURKANTUAN);
		OBSCRUS_STICK = createBoat("deep_trenches:obscrus_stick", WoodType.MURKANTUAN);
		ORHPRIS_STICK = createBoat("deep_trenches:orhpris_stick", WoodType.MURKANTUAN);
		PELTOGYNE_STICK = createItem("deep_trenches:peltogyne_stick", GENERAL);
		PIN_CHERRY_STICK = createItem("deep_trenches:pin_cherry_stick", GENERAL);
		PLUM_STICK = createItem("deep_trenches:plum_stick", GENERAL);
		PURFUNGA_STICK = createItem("deep_trenches:purfunga_stick", GENERAL);
		RARK_STICK = createBoat("deep_trenches:rark_stick", WoodType.PURFUNGA);
		RED_ELM_STICK = createBoat("deep_trenches:red_elm_stick", WoodType.PURFUNGA);
		RHADI_STICK = createBoat("deep_trenches:rhadi_stick", WoodType.PURFUNGA);
		SANGUART_STICK = createBoat("deep_trenches:sanguart_stick", WoodType.PURFUNGA);
		SCARLET_THIORCEN_STICK = createBoat("deep_trenches:scarlet_thiorcen_stick", WoodType.PURFUNGA);
		SEQUOIA_STICK = createBoat("deep_trenches:sequoia_stick", WoodType.PURFUNGA);
		SPROOM_STICK = createItem("deep_trenches:sproom_stick", GENERAL);
		STORTREEAN_STICK = createItem("deep_trenches:stortreean_stick", GENERAL);
		STROOMEAN_STICK = createItem("deep_trenches:stroomean_stick", GENERAL);
		SUNRISE_FUNGUS_STICK = createItem("deep_trenches:sunrise_fungus_stick", GENERAL);
		TARK_STICK = createBoat("deep_trenches:tark_stick", WoodType.SUNRISE_FUNGUS);
		TEAK_STICK = createItem("deep_trenches:teak_stick", GENERAL);
		THUNDERCLOUD_PLUM_STICK = createItem("deep_trenches:thundercloud_plum_stick", GENERAL);
		VYNHERT_STICK = createBoat("deep_trenches:vynhert_stick", WoodType.THUNDERCLOUD_PLUM);
		WART_TREE_STICK = createBoat("deep_trenches:wart_tree_stick", WoodType.THUNDERCLOUD_PLUM);
		WENGE_STICK = createBoat("deep_trenches:wenge_stick", WoodType.THUNDERCLOUD_PLUM);
		YEW_STICK = createBoat("deep_trenches:yew_stick", WoodType.THUNDERCLOUD_PLUM);

		/* -------------------------------- FOOD ------------------------------------------- */
		BARBELED_LOOSEJAW = createFood("deep_trenches:barbeled_loosejaw", STORCEAN_FISH);
		BETTA = createFood("deep_trenches:betta", STORCEAN_FISH);
		BLACK_LOOSEJAW = createFood("deep_trenches:black_loosejaw", STORCEAN_FISH);
		DEEP_LAKE_BETTA = createFood("deep_trenches:deep_lake_betta", STORCEAN_FISH);
		GIANT_HATCHETFISH = createFood("deep_trenches:giant_hatchetfish", ModFoodComponents.GIANT_HATCHETFISH);
		LIGHT_LOOSEJAW = createFood("deep_trenches:light_loosejaw", STORCEAN_FISH);
		SMALLTOOTH_DRAGONFISH =  createFood("deep_trenches:smalltooth_dragonfish", STORCEAN_FISH);

		/* -------------------------------- COOKED FOOD ------------------------------------------- */
		COOKED_GIANT_HATCHETFISH = createFood("deep_trenches:cooked_giant_hatchetfish", ModFoodComponents.COOKED_GIANT_HATCHETFISH);

		/* -------------------------------- WEAPONS ------------------------------------------- */
		ADAIGGER = register("deep_trenches:adaigger", new AdaiggerItem(new Settings().group(GENERAL)));

		/* -------------------------------- GOO's ------------------------------------------- */
		CYAN_BIOLUMINESCENT_GOO = createItem("deep_trenches:cyan_bioluminescent_goo", GENERAL);
		GREEN_BIOLUMINESCENT_GOO = createItem("deep_trenches:green_bioluminescent_goo", GENERAL);
		LIGHT_BLUE_BIOLUMINESCENT_GOO = createItem("deep_trenches:light_blue_bioluminescent_goo", GENERAL);

		/* -------------------------------- GYNDELION ------------------------------------------- */
		GYLDELION_DYE = createItem("deep_trenches:gyldelion_dye", GENERAL);
		GYLDELION_INGOT = createItem("deep_trenches:gyldelion_ingot", GENERAL);
		GYLDELION_NUGGET = createItem("deep_trenches:gyldelion_nugget", GENERAL);

		/* -------------------------------- MOB DROPS ------------------------------------------- */
		LOOSEJAW_TOOTH = createItem("deep_trenches:loosejaw_tooth", GENERAL);

		AIRIAL_MOSS = createBlockItem("deep_trenches:airial_moss", ModBlocks.AIRIAL_MOSS, GENERAL);
	}

}
