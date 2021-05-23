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
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.*;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.BROCCOLI_CORAL_WALL_FAN;
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

	protected static Item createWallStandingItem(String id, Block standingBlock, Block block, ItemGroup itemGroup) {
		return register(id, new WallStandingBlockItem(standingBlock, block, new Item.Settings().maxCount(1).group(itemGroup)));
	}

	protected static Item createSignItem(String id, Block standingBlock, Block block, ItemGroup itemGroup) {
		return register(id, new SignItem(new Item.Settings().maxCount(16).group(itemGroup), standingBlock, block));
	}

	protected static Item register(String id, Item item) {
		return Registry.register(ITEM, id, item);
	}

	static {
		createBlockItem("deep_trenches:skystone", SKYSTONE, GENERAL);
		createBlockItem("deep_trenches:skysoil", SKYSOIL, GENERAL);

		createBlockItem("deep_trenches:dead_blackgreen_tree_coral", DEAD_BLACKGREEN_TREE_CORAL, GENERAL);
		createBlockItem("deep_trenches:dead_blackgreen_tree_coral_block", DEAD_BLACKGREEN_TREE_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:dead_blackgreen_tree_coral_fan", DEAD_BLACKGREEN_TREE_CORAL_FAN, DEAD_BLACKGREEN_TREE_CORAL_WALL_FAN, GENERAL);
		createBlockItem("deep_trenches:blackgreen_tree_coral", BLACKGREEN_TREE_CORAL, GENERAL);
		createBlockItem("deep_trenches:blackgreen_tree_coral_block", BLACKGREEN_TREE_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:blackgreen_tree_coral_fan", BLACKGREEN_TREE_CORAL_FAN, BLACKGREEN_TREE_CORAL_WALL_FAN, GENERAL);

		createBlockItem("deep_trenches:dead_broccoli_coral", DEAD_BROCCOLI_CORAL, GENERAL);
		createBlockItem("deep_trenches:dead_broccoli_coral_block", DEAD_BROCCOLI_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:dead_broccoli_coral_fan", DEAD_BROCCOLI_CORAL_FAN, DEAD_BROCCOLI_CORAL_WALL_FAN, GENERAL);
		createBlockItem("deep_trenches:broccoli_coral", BROCCOLI_CORAL, GENERAL);
		createBlockItem("deep_trenches:broccoli_coral_block", BROCCOLI_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:broccoli_coral_fan", BROCCOLI_CORAL_FAN, BROCCOLI_CORAL_WALL_FAN, GENERAL);

		createBlockItem("deep_trenches:dead_bubblegum_coral", DEAD_BUBBLEGUM_CORAL, GENERAL);
		createBlockItem("deep_trenches:dead_bubblegum_coral_block", DEAD_BUBBLEGUM_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:dead_bubblegum_coral_fan", DEAD_BUBBLEGUM_CORAL_FAN, DEAD_BUBBLEGUM_CORAL_WALL_FAN, GENERAL);
		createBlockItem("deep_trenches:bubblegum_coral", BUBBLEGUM_CORAL, GENERAL);
		createBlockItem("deep_trenches:bubblegum_coral_block", BUBBLEGUM_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:bubblegum_coral_fan", BUBBLEGUM_CORAL_FAN, BUBBLEGUM_CORAL_WALL_FAN, GENERAL);

		createBlockItem("deep_trenches:dead_cabbage_tree_coral", DEAD_CABBAGE_TREE_CORAL, GENERAL);
		createBlockItem("deep_trenches:dead_cabbage_tree_coral_block", DEAD_CABBAGE_TREE_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:dead_cabbage_tree_coral_fan", DEAD_CABBAGE_TREE_CORAL_FAN, DEAD_CABBAGE_TREE_CORAL_WALL_FAN, GENERAL);
		createBlockItem("deep_trenches:cabbage_tree_coral", CABBAGE_TREE_CORAL, GENERAL);
		createBlockItem("deep_trenches:cabbage_tree_coral_block", CABBAGE_TREE_CORAL_BLOCK, GENERAL);
		createBlockItem("deep_trenches:cabbage_tree_coral_fan", CABBAGE_TREE_CORAL_FAN, GENERAL);

		createBlockItem("deep_trenches:dead_flowertube_coral", DEAD_FLOWERTUBE_CORAL, GENERAL);
		createBlockItem("deep_trenches:dead_flowertube_coral_block", DEAD_FLOWERTUBE_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:dead_flowertube_coral_fan", DEAD_FLOWERTUBE_CORAL_FAN, DEAD_FLOWERTUBE_CORAL_WALL_FAN, GENERAL);
		createBlockItem("deep_trenches:flowertube_coral", FLOWERTUBE_CORAL, GENERAL);
		createBlockItem("deep_trenches:flowertube_coral_block", FLOWERTUBE_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:flowertube_coral_fan", FLOWERTUBE_CORAL_FAN, FLOWERTUBE_CORAL_WALL_FAN, GENERAL);

		createBlockItem("deep_trenches:dead_garnet_spiral_coral", DEAD_GARNET_SPIRAL_CORAL, GENERAL);
		createBlockItem("deep_trenches:dead_garnet_spiral_coral_block", DEAD_GARNET_SPIRAL_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:dead_garnet_spiral_coral_fan", DEAD_GARNET_SPIRAL_CORAL_FAN, DEAD_GARNET_SPIRAL_CORAL_WALL_FAN, GENERAL);
		createBlockItem("deep_trenches:garnet_spiral_coral", GARNET_SPIRAL_CORAL, GENERAL);
		createBlockItem("deep_trenches:garnet_spiral_coral_block", GARNET_SPIRAL_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:garnet_spiral_coral_fan", GARNET_SPIRAL_CORAL_FAN, GARNET_SPIRAL_CORAL_WALL_FAN, GENERAL);

		createBlockItem("deep_trenches:dead_glow_forest_coral", DEAD_GLOW_FOREST_CORAL, GENERAL);
		createBlockItem("deep_trenches:dead_glow_forest_coral_block", DEAD_GLOW_FOREST_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:dead_glow_forest_coral_fan", DEAD_GLOW_FOREST_CORAL_FAN, DEAD_GLOW_FOREST_CORAL_WALL_FAN, GENERAL);
		createBlockItem("deep_trenches:glow_forest_coral", GLOW_FOREST_CORAL, GENERAL);
		createBlockItem("deep_trenches:glow_forest_coral_block", GLOW_FOREST_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:glow_forest_coral_fan", GLOW_FOREST_CORAL_FAN, GLOW_FOREST_CORAL_WALL_FAN, GENERAL);

		createBlockItem("deep_trenches:dead_glowtongue_tube_coral", DEAD_GLOWTONGUE_TUBE_CORAL, GENERAL);
		createBlockItem("deep_trenches:dead_glowtongue_tube_coral_block", DEAD_GLOWTONGUE_TUBE_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:dead_glowtongue_tube_coral_fan", DEAD_GLOWTONGUE_TUBE_CORAL_FAN, DEAD_GLOWTONGUE_TUBE_CORAL_WALL_FAN, GENERAL);
		createBlockItem("deep_trenches:glowtongue_tube_coral", GLOWTONGUE_TUBE_CORAL, GENERAL);
		createBlockItem("deep_trenches:glowtongue_tube_coral_block", GLOWTONGUE_TUBE_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:glowtongue_tube_coral_fan", GLOWTONGUE_TUBE_CORAL_FAN, GLOWTONGUE_TUBE_CORAL_WALL_FAN,GENERAL);

		createBlockItem("deep_trenches:dead_ivory_coral", DEAD_IVORY_CORAL, GENERAL);
		createBlockItem("deep_trenches:dead_ivory_coral_block", DEAD_IVORY_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:dead_ivory_coral_fan", DEAD_IVORY_CORAL_FAN, DEAD_IVORY_CORAL_WALL_FAN, GENERAL);
		createBlockItem("deep_trenches:ivory_coral", IVORY_CORAL, GENERAL);
		createBlockItem("deep_trenches:ivory_coral_block", IVORY_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:ivory_coral_fan", IVORY_CORAL_FAN, IVORY_CORAL_WALL_FAN, GENERAL);

		createBlockItem("deep_trenches:dead_lime_brain_coral", DEAD_LIME_BRAIN_CORAL, GENERAL);
		createBlockItem("deep_trenches:dead_lime_brain_coral_block", DEAD_LIME_BRAIN_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:dead_lime_brain_coral_fan", DEAD_LIME_BRAIN_CORAL_FAN, DEAD_LIME_BRAIN_CORAL_WALL_FAN, GENERAL);
		createBlockItem("deep_trenches:lime_brain_coral", LIME_BRAIN_CORAL, GENERAL);
		createBlockItem("deep_trenches:lime_brain_coral_block", LIME_BRAIN_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:lime_brain_coral_fan", LIME_BRAIN_CORAL_FAN, LIME_BRAIN_CORAL_WALL_FAN, GENERAL);

		createBlockItem("deep_trenches:dead_lophelia_coral", DEAD_LOPHELIA_CORAL, GENERAL);
		createBlockItem("deep_trenches:dead_lophelia_coral_block", DEAD_LOPHELIA_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:dead_lophelia_coral_fan", DEAD_LOPHELIA_CORAL_FAN, DEAD_LOPHELIA_CORAL_WALL_FAN, GENERAL);
		createBlockItem("deep_trenches:lophelia_coral", LOPHELIA_CORAL, GENERAL);
		createBlockItem("deep_trenches:lophelia_coral_block", LOPHELIA_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:lophelia_coral_fan", LOPHELIA_CORAL_FAN, LOPHELIA_CORAL_WALL_FAN, GENERAL);

		createBlockItem("deep_trenches:dead_pipe_organ_coral", DEAD_PIPE_ORGAN_CORAL, GENERAL);
		createBlockItem("deep_trenches:dead_pipe_organ_coral_block", DEAD_PIPE_ORGAN_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:dead_pipe_organ_coral_fan", DEAD_PIPE_ORGAN_CORAL_FAN, DEAD_PIPE_ORGAN_CORAL_WALL_FAN, GENERAL);
		createBlockItem("deep_trenches:dead_pipe_organ_tentacles", DEAD_PIPE_ORGAN_TENTACLES, GENERAL);
		createBlockItem("deep_trenches:pipe_organ_coral", PIPE_ORGAN_CORAL, GENERAL);
		createBlockItem("deep_trenches:pipe_organ_coral_block", PIPE_ORGAN_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:pipe_organ_coral_fan", PIPE_ORGAN_CORAL_FAN, PIPE_ORGAN_CORAL_WALL_FAN, GENERAL);
		createBlockItem("deep_trenches:pipe_organ_tentacles", PIPE_ORGAN_TENTACLES, GENERAL);

		createBlockItem("deep_trenches:dead_red_tree_coral", DEAD_RED_TREE_CORAL, GENERAL);
		createBlockItem("deep_trenches:dead_red_tree_coral_block", DEAD_RED_TREE_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:dead_red_tree_coral_fan", DEAD_RED_TREE_CORAL_FAN, DEAD_RED_TREE_CORAL_WALL_FAN, GENERAL);
		createBlockItem("deep_trenches:red_tree_coral", RED_TREE_CORAL, GENERAL);
		createBlockItem("deep_trenches:red_tree_coral_block", RED_TREE_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:red_tree_coral_fan", RED_TREE_CORAL_FAN, RED_TREE_CORAL_WALL_FAN, GENERAL);

		createBlockItem("deep_trenches:dead_seafan_coral", DEAD_SEAFAN_CORAL, GENERAL);
		createBlockItem("deep_trenches:dead_seafan_coral_block", DEAD_SEAFAN_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:dead_seafan_coral_fan", DEAD_SEAFAN_CORAL_FAN, DEAD_SEAFAN_CORAL_WALL_FAN,GENERAL);
		createBlockItem("deep_trenches:seafan_coral", SEAFAN_CORAL, GENERAL);
		createBlockItem("deep_trenches:seafan_coral_block", SEAFAN_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:seafan_coral_fan", SEAFAN_CORAL_FAN, SEAFAN_CORAL_WALL_FAN, GENERAL);

		createBlockItem("deep_trenches:dead_straight_willow_coral", DEAD_STRAIGHT_WILLOW_CORAL, GENERAL);
		createBlockItem("deep_trenches:dead_straight_willow_coral_block", DEAD_STRAIGHT_WILLOW_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:dead_straight_willow_coral_fan", DEAD_STRAIGHT_WILLOW_CORAL_FAN, DEAD_STRAIGHT_WILLOW_CORAL_WALL_FAN, GENERAL);
		createBlockItem("deep_trenches:straight_willow_coral", STRAIGHT_WILLOW_CORAL, GENERAL);
		createBlockItem("deep_trenches:straight_willow_coral_block", STRAIGHT_WILLOW_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:straight_willow_coral_fan", STRAIGHT_WILLOW_CORAL_FAN, STRAIGHT_WILLOW_CORAL_WALL_FAN, GENERAL);

		createBlockItem("deep_trenches:dead_sunrise_coral", DEAD_SUNRISE_CORAL, GENERAL);
		createBlockItem("deep_trenches:dead_sunrise_coral_block", DEAD_SUNRISE_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:dead_sunrise_coral_fan", DEAD_SUNRISE_CORAL_FAN, DEAD_SUNRISE_CORAL_WALL_FAN, GENERAL);
		createBlockItem("deep_trenches:sunrise_coral", SUNRISE_CORAL, GENERAL);
		createBlockItem("deep_trenches:sunrise_coral_block", SUNRISE_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:sunrise_coral_fan", SUNRISE_CORAL_FAN, SUNRISE_CORAL_WALL_FAN, GENERAL);

		createBlockItem("deep_trenches:dead_table_coral", DEAD_TABLE_CORAL, GENERAL);
		createBlockItem("deep_trenches:dead_table_coral_block", DEAD_TABLE_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:dead_table_coral_fan", DEAD_TABLE_CORAL_FAN, DEAD_TABLE_CORAL_WALL_FAN, GENERAL);
		createBlockItem("deep_trenches:table_coral", TABLE_CORAL, GENERAL);
		createBlockItem("deep_trenches:table_coral_block", TABLE_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:table_coral_fan", TABLE_CORAL_FAN, TABLE_CORAL_WALL_FAN, GENERAL);

		createBlockItem("deep_trenches:dead_thin_blade_coral", DEAD_THIN_BLADE_CORAL, GENERAL);
		createBlockItem("deep_trenches:dead_thin_blade_coral_block", DEAD_THIN_BLADE_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:dead_thin_blade_coral_fan", DEAD_THIN_BLADE_CORAL_FAN, DEAD_THIN_BLADE_CORAL_WALL_FAN, GENERAL);
		createBlockItem("deep_trenches:thin_blade_coral", THIN_BLADE_CORAL, GENERAL);
		createBlockItem("deep_trenches:thin_blade_coral_block", THIN_BLADE_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:thin_blade_coral_fan", THIN_BLADE_CORAL_FAN, THIN_BLADE_CORAL_WALL_FAN, GENERAL);

		createBlockItem("deep_trenches:dead_trumpetear_coral", DEAD_TRUMPETEAR_CORAL, GENERAL);
		createBlockItem("deep_trenches:dead_trumpetear_coral_block", DEAD_TRUMPETEAR_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:dead_trumpetear_coral_fan", DEAD_TRUMPETEAR_CORAL_FAN, DEAD_TRUMPETEAR_CORAL_WALL_FAN, GENERAL);
		createBlockItem("deep_trenches:trumpetear_coral", TRUMPETEAR_CORAL, GENERAL);
		createBlockItem("deep_trenches:trumpetear_coral_block", TRUMPETEAR_CORAL_BLOCK, GENERAL);
		createWallStandingItem("deep_trenches:trumpetear_coral_fan", TRUMPETEAR_CORAL_FAN, TRUMPETEAR_CORAL_WALL_FAN, GENERAL);

		createBlockItem("deep_trenches:almond_button", ALMOND_BUTTON, GENERAL);
		createBlockItem("deep_trenches:almond_door", ALMOND_DOOR, GENERAL);
		createBlockItem("deep_trenches:almond_fence", ALMOND_FENCE, GENERAL);
		createBlockItem("deep_trenches:almond_fence_gate", ALMOND_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:almond_leaves", ALMOND_LEAVES, GENERAL);
		createBlockItem("deep_trenches:almond_log", ALMOND_LOG, GENERAL);
		createBlockItem("deep_trenches:almond_planks", ALMOND_PLANKS, GENERAL);
		createBlockItem("deep_trenches:almond_pressure_plate", ALMOND_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:almond_sapling", ALMOND_SAPLING, GENERAL);
		createSignItem("deep_trenches:almond_sign", ALMOND_SIGN, ALMOND_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:almond_slab", ALMOND_SLAB, GENERAL);
		createBlockItem("deep_trenches:almond_stairs", ALMOND_STAIRS, GENERAL);
		createBlockItem("deep_trenches:almond_trapdoor", ALMOND_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:almond_wood", ALMOND_WOOD, GENERAL);

		createBlockItem("deep_trenches:anameata_button", ANAMEATA_BUTTON, GENERAL);
		createBlockItem("deep_trenches:anameata_cap", ANAMEATA_CAP, GENERAL);
		createBlockItem("deep_trenches:anameata_door", ANAMEATA_DOOR, GENERAL);
		createBlockItem("deep_trenches:anameata_fence", ANAMEATA_FENCE, GENERAL);
		createBlockItem("deep_trenches:anameata_fence_gate", ANAMEATA_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:anameata_log", ANAMEATA_LOG, GENERAL);
		createBlockItem("deep_trenches:anameata_planks", ANAMEATA_PLANKS, GENERAL);
		createBlockItem("deep_trenches:anameata_pressure_plate", ANAMEATA_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:anameata_sapling", ANAMEATA_SAPLING, GENERAL);
		createSignItem("deep_trenches:anameata_sign", ANAMEATA_SIGN, ANAMEATA_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:anameata_slab", ANAMEATA_SLAB, GENERAL);
		createBlockItem("deep_trenches:anameata_stairs", ANAMEATA_STAIRS, GENERAL);
		createBlockItem("deep_trenches:anameata_trapdoor", ANAMEATA_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:anameata_wood", ANAMEATA_WOOD, GENERAL);

		createBlockItem("deep_trenches:angels_trumpet_button", ANGELS_TRUMPET_BUTTON, GENERAL);
		createBlockItem("deep_trenches:angels_trumpet_door", ANGELS_TRUMPET_DOOR, GENERAL);
		createBlockItem("deep_trenches:angels_trumpet_fence", ANGELS_TRUMPET_FENCE, GENERAL);
		createBlockItem("deep_trenches:angels_trumpet_fence_gate", ANGELS_TRUMPET_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:angels_trumpet_leaves", ANGELS_TRUMPET_LEAVES, GENERAL);
		createBlockItem("deep_trenches:angels_trumpet_log", ANGELS_TRUMPET_LOG, GENERAL);
		createBlockItem("deep_trenches:angels_trumpet_planks", ANGELS_TRUMPET_PLANKS, GENERAL);
		createBlockItem("deep_trenches:angels_trumpet_pressure_plate", ANGELS_TRUMPET_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:angels_trumpet_sapling", ANGELS_TRUMPET_SAPLING, GENERAL);
		createSignItem("deep_trenches:angels_trumpet_sign", ANGELS_TRUMPET_SIGN, ANGELS_TRUMPET_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:angels_trumpet_slab", ANGELS_TRUMPET_SLAB, GENERAL);
		createBlockItem("deep_trenches:angels_trumpet_stairs", ANGELS_TRUMPET_STAIRS, GENERAL);
		createBlockItem("deep_trenches:angels_trumpet_trapdoor", ANGELS_TRUMPET_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:angels_trumpet_wood", ANGELS_TRUMPET_WOOD, GENERAL);

		createBlockItem("deep_trenches:aquean_button", AQUEAN_BUTTON, GENERAL);
		createBlockItem("deep_trenches:aquean_door", AQUEAN_DOOR, GENERAL);
		createBlockItem("deep_trenches:aquean_fence", AQUEAN_FENCE, GENERAL);
		createBlockItem("deep_trenches:aquean_fence_gate", AQUEAN_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:aquean_leaves", AQUEAN_LEAVES, GENERAL);
		createBlockItem("deep_trenches:aquean_log", AQUEAN_LOG, GENERAL);
		createBlockItem("deep_trenches:aquean_planks", AQUEAN_PLANKS, GENERAL);
		createBlockItem("deep_trenches:aquean_pressure_plate", AQUEAN_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:aquean_sapling", AQUEAN_SAPLING, GENERAL);
		createSignItem("deep_trenches:aquean_sign", AQUEAN_SIGN, AQUEAN_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:aquean_slab", AQUEAN_SLAB, GENERAL);
		createBlockItem("deep_trenches:aquean_stairs", AQUEAN_STAIRS, GENERAL);
		createBlockItem("deep_trenches:aquean_trapdoor", AQUEAN_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:aquean_wood", AQUEAN_WOOD, GENERAL);

		createBlockItem("deep_trenches:barshrookle_button", BARSHROOKLE_BUTTON, GENERAL);
		createBlockItem("deep_trenches:barshrookle_cap", BARSHROOKLE_CAP, GENERAL);
		createBlockItem("deep_trenches:barshrookle_door", BARSHROOKLE_DOOR, GENERAL);
		createBlockItem("deep_trenches:barshrookle_fence", BARSHROOKLE_FENCE, GENERAL);
		createBlockItem("deep_trenches:barshrookle_fence_gate", BARSHROOKLE_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:barshrookle_log", BARSHROOKLE_LOG, GENERAL);
		createBlockItem("deep_trenches:barshrookle_planks", BARSHROOKLE_PLANKS, GENERAL);
		createBlockItem("deep_trenches:barshrookle_pressure_plate", BARSHROOKLE_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:barshrookle_sapling", BARSHROOKLE_SAPLING, GENERAL);
		createSignItem("deep_trenches:barshrookle_sign", BARSHROOKLE_SIGN, BARSHROOKLE_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:barshrookle_slab", BARSHROOKLE_SLAB, GENERAL);
		createBlockItem("deep_trenches:barshrookle_stairs", BARSHROOKLE_STAIRS, GENERAL);
		createBlockItem("deep_trenches:barshrookle_trapdoor", BARSHROOKLE_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:barshrookle_wood", BARSHROOKLE_WOOD, GENERAL);

		createBlockItem("deep_trenches:black_birch_button", BLACK_BIRCH_BUTTON, GENERAL);
		createBlockItem("deep_trenches:black_birch_door", BLACK_BIRCH_DOOR, GENERAL);
		createBlockItem("deep_trenches:black_birch_fence", BLACK_BIRCH_FENCE, GENERAL);
		createBlockItem("deep_trenches:black_birch_fence_gate", BLACK_BIRCH_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:black_birch_leaves", BLACK_BIRCH_LEAVES, GENERAL);
		createBlockItem("deep_trenches:black_birch_log", BLACK_BIRCH_LOG, GENERAL);
		createBlockItem("deep_trenches:black_birch_planks", BLACK_BIRCH_PLANKS, GENERAL);
		createBlockItem("deep_trenches:black_birch_pressure_plate", BLACK_BIRCH_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:black_birch_sapling", BLACK_BIRCH_SAPLING, GENERAL);
		createSignItem("deep_trenches:black_birch_sign", BLACK_BIRCH_SIGN, BLACK_BIRCH_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:black_birch_slab", BLACK_BIRCH_SLAB, GENERAL);
		createBlockItem("deep_trenches:black_birch_stairs", BLACK_BIRCH_STAIRS, GENERAL);
		createBlockItem("deep_trenches:black_birch_trapdoor", BLACK_BIRCH_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:black_birch_wood", BLACK_BIRCH_WOOD, GENERAL);

		createBlockItem("deep_trenches:blue_mahoe_button", BLUE_MAHOE_BUTTON, GENERAL);
		createBlockItem("deep_trenches:blue_mahoe_door", BLUE_MAHOE_DOOR, GENERAL);
		createBlockItem("deep_trenches:blue_mahoe_fence", BLUE_MAHOE_FENCE, GENERAL);
		createBlockItem("deep_trenches:blue_mahoe_flower", BLUE_MAHOE_FLOWER, GENERAL);
		createBlockItem("deep_trenches:blue_mahoe_fence_gate", BLUE_MAHOE_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:blue_mahoe_leaves", BLUE_MAHOE_LEAVES, GENERAL);
		createBlockItem("deep_trenches:blue_mahoe_log", BLUE_MAHOE_LOG, GENERAL);
		createBlockItem("deep_trenches:blue_mahoe_planks", BLUE_MAHOE_PLANKS, GENERAL);
		createBlockItem("deep_trenches:blue_mahoe_pressure_plate", BLUE_MAHOE_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:blue_mahoe_sapling", BLUE_MAHOE_SAPLING, GENERAL);
		createSignItem("deep_trenches:blue_mahoe_sign", BLUE_MAHOE_SIGN, BLUE_MAHOE_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:blue_mahoe_slab", BLUE_MAHOE_SLAB, GENERAL);
		createBlockItem("deep_trenches:blue_mahoe_stairs", BLUE_MAHOE_STAIRS, GENERAL);
		createBlockItem("deep_trenches:blue_mahoe_trapdoor", BLUE_MAHOE_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:blue_mahoe_wood", BLUE_MAHOE_WOOD, GENERAL);

		createBlockItem("deep_trenches:blue_spruce_button", BLUE_SPRUCE_BUTTON, GENERAL);
		createBlockItem("deep_trenches:blue_spruce_door", BLUE_SPRUCE_DOOR, GENERAL);
		createBlockItem("deep_trenches:blue_spruce_fence", BLUE_SPRUCE_FENCE, GENERAL);
		createBlockItem("deep_trenches:blue_spruce_fence_gate", BLUE_SPRUCE_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:blue_spruce_leaves", BLUE_SPRUCE_LEAVES, GENERAL);
		createBlockItem("deep_trenches:blue_spruce_log", BLUE_SPRUCE_LOG, GENERAL);
		createBlockItem("deep_trenches:blue_spruce_planks", BLUE_SPRUCE_PLANKS, GENERAL);
		createBlockItem("deep_trenches:blue_spruce_pressure_plate", BLUE_SPRUCE_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:blue_spruce_sapling", BLUE_SPRUCE_SAPLING, GENERAL);
		createSignItem("deep_trenches:blue_spruce_sign", BLUE_SPRUCE_SIGN, BLUE_SPRUCE_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:blue_spruce_slab", BLUE_SPRUCE_SLAB, GENERAL);
		createBlockItem("deep_trenches:blue_spruce_stairs", BLUE_SPRUCE_STAIRS, GENERAL);
		createBlockItem("deep_trenches:blue_spruce_trapdoor", BLUE_SPRUCE_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:blue_spruce_wood", BLUE_SPRUCE_WOOD, GENERAL);

		createBlockItem("deep_trenches:bottlebrush_button", BOTTLEBRUSH_BUTTON, GENERAL);
		createBlockItem("deep_trenches:bottlebrush_door", BOTTLEBRUSH_DOOR, GENERAL);
		createBlockItem("deep_trenches:bottlebrush_fence", BOTTLEBRUSH_FENCE, GENERAL);
		createBlockItem("deep_trenches:bottlebrush_fence_gate", BOTTLEBRUSH_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:bottlebrush_flowers", BOTTLEBRUSH_FLOWERS, GENERAL);
		createBlockItem("deep_trenches:bottlebrush_leaves", BOTTLEBRUSH_LEAVES, GENERAL);
		createBlockItem("deep_trenches:bottlebrush_log", BOTTLEBRUSH_LOG, GENERAL);
		createBlockItem("deep_trenches:bottlebrush_planks", BOTTLEBRUSH_PLANKS, GENERAL);
		createBlockItem("deep_trenches:bottlebrush_pressure_plate", BOTTLEBRUSH_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:bottlebrush_sapling", BOTTLEBRUSH_SAPLING, GENERAL);
		createSignItem("deep_trenches:bottlebrush_sign", BOTTLEBRUSH_SIGN, BOTTLEBRUSH_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:bottlebrush_slab", BOTTLEBRUSH_SLAB, GENERAL);
		createBlockItem("deep_trenches:bottlebrush_stairs", BOTTLEBRUSH_STAIRS, GENERAL);
		createBlockItem("deep_trenches:bottlebrush_trapdoor", BOTTLEBRUSH_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:bottlebrush_wood", BOTTLEBRUSH_WOOD, GENERAL);

		createBlockItem("deep_trenches:bromya_button", BROMYA_BUTTON, GENERAL);
		createBlockItem("deep_trenches:bromya_door", BROMYA_DOOR, GENERAL);
		createBlockItem("deep_trenches:bromya_fence", BROMYA_FENCE, GENERAL);
		createBlockItem("deep_trenches:bromya_fence_gate", BROMYA_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:bromya_flower", BROMYA_FLOWER, GENERAL);
		createBlockItem("deep_trenches:bromya_leaves", BROMYA_LEAVES, GENERAL);
		createBlockItem("deep_trenches:bromya_log", BROMYA_LOG, GENERAL);
		createBlockItem("deep_trenches:bromya_planks", BROMYA_PLANKS, GENERAL);
		createBlockItem("deep_trenches:bromya_pressure_plate", BROMYA_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:bromya_sapling", BROMYA_SAPLING, GENERAL);
		createSignItem("deep_trenches:bromya_sign", BROMYA_SIGN, BROMYA_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:bromya_slab", BROMYA_SLAB, GENERAL);
		createBlockItem("deep_trenches:bromya_stairs", BROMYA_STAIRS, GENERAL);
		createBlockItem("deep_trenches:bromya_trapdoor", BROMYA_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:bromya_wood", BROMYA_WOOD, GENERAL);

		createBlockItem("deep_trenches:bubbletree_bubbles", BUBBLETREE_BUBBLES, GENERAL);
		createBlockItem("deep_trenches:bubbletree_button", BUBBLETREE_BUTTON, GENERAL);
		createBlockItem("deep_trenches:bubbletree_door", BUBBLETREE_DOOR, GENERAL);
		createBlockItem("deep_trenches:bubbletree_fence", BUBBLETREE_FENCE, GENERAL);
		createBlockItem("deep_trenches:bubbletree_fence_gate", BUBBLETREE_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:bubbletree_log", BUBBLETREE_LOG, GENERAL);
		createBlockItem("deep_trenches:bubbletree_planks", BUBBLETREE_PLANKS, GENERAL);
		createBlockItem("deep_trenches:bubbletree_pressure_plate", BUBBLETREE_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:bubbletree_sapling", BUBBLETREE_SAPLING, GENERAL);
		createSignItem("deep_trenches:bubbletree_sign", BUBBLETREE_SIGN, BUBBLETREE_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:bubbletree_slab", BUBBLETREE_SLAB, GENERAL);
		createBlockItem("deep_trenches:bubbletree_stairs", BUBBLETREE_STAIRS, GENERAL);
		createBlockItem("deep_trenches:bubbletree_trapdoor", BUBBLETREE_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:bubbletree_wood", BUBBLETREE_WOOD, GENERAL);

		createBlockItem("deep_trenches:calcearb_button", CALCEARB_BUTTON, GENERAL);
		createBlockItem("deep_trenches:calcearb_door", CALCEARB_DOOR, GENERAL);
		createBlockItem("deep_trenches:calcearb_fence", CALCEARB_FENCE, GENERAL);
		createBlockItem("deep_trenches:calcearb_fence_gate", CALCEARB_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:calcearb_leaves", CALCEARB_LEAVES, GENERAL);
		createBlockItem("deep_trenches:calcearb_log", CALCEARB_LOG, GENERAL);
		createBlockItem("deep_trenches:calcearb_planks", CALCEARB_PLANKS, GENERAL);
		createBlockItem("deep_trenches:calcearb_pressure_plate", CALCEARB_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:calcearb_sapling", CALCEARB_SAPLING, GENERAL);
		createSignItem("deep_trenches:calcearb_sign", CALCEARB_SIGN, CALCEARB_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:calcearb_slab", CALCEARB_SLAB, GENERAL);
		createBlockItem("deep_trenches:calcearb_stairs", CALCEARB_STAIRS, GENERAL);
		createBlockItem("deep_trenches:calcearb_trapdoor", CALCEARB_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:calcearb_wood", CALCEARB_WOOD, GENERAL);

		createBlockItem("deep_trenches:cherry_button", CHERRY_BUTTON, GENERAL);
		createBlockItem("deep_trenches:cherry_door", CHERRY_DOOR, GENERAL);
		createBlockItem("deep_trenches:cherry_fence", CHERRY_FENCE, GENERAL);
		createBlockItem("deep_trenches:cherry_fence_gate", CHERRY_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:cherry_leaves", CHERRY_LEAVES, GENERAL);
		createBlockItem("deep_trenches:cherry_log", CHERRY_LOG, GENERAL);
		createBlockItem("deep_trenches:cherry_planks", CHERRY_PLANKS, GENERAL);
		createBlockItem("deep_trenches:cherry_pressure_plate", CHERRY_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:cherry_sapling", CHERRY_SAPLING, GENERAL);
		createSignItem("deep_trenches:cherry_sign", CHERRY_SIGN, CHERRY_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:cherry_slab", CHERRY_SLAB, GENERAL);
		createBlockItem("deep_trenches:cherry_stairs", CHERRY_STAIRS, GENERAL);
		createBlockItem("deep_trenches:cherry_trapdoor", CHERRY_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:cherry_wood", CHERRY_WOOD, GENERAL);

		createBlockItem("deep_trenches:chotorn", CHOTORN_SAPLING, GENERAL);
		createBlockItem("deep_trenches:chotorn_button", CHOTORN_BUTTON, GENERAL);
		createBlockItem("deep_trenches:chotorn_door", CHOTORN_DOOR, GENERAL);
		createBlockItem("deep_trenches:chotorn_fence", CHOTORN_FENCE, GENERAL);
		createBlockItem("deep_trenches:chotorn_fence_gate", CHOTORN_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:chotorn_log", CHOTORN_LOG, GENERAL);
		createBlockItem("deep_trenches:chotorn_planks", CHOTORN_PLANKS, GENERAL);
		createBlockItem("deep_trenches:chotorn_pressure_plate", CHOTORN_PRESSURE_PLATE, GENERAL);
		createSignItem("deep_trenches:chotorn_sign", CHOTORN_SIGN, CHOTORN_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:chotorn_slab", CHOTORN_SLAB, GENERAL);
		createBlockItem("deep_trenches:chotorn_stairs", CHOTORN_STAIRS, GENERAL);
		createBlockItem("deep_trenches:chotorn_trapdoor", CHOTORN_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:chotorn_wood", CHOTORN_WOOD, GENERAL);

		createBlockItem("deep_trenches:cook_pine_button", COOK_PINE_BUTTON, GENERAL);
		createBlockItem("deep_trenches:cook_pine_door", COOK_PINE_DOOR, GENERAL);
		createBlockItem("deep_trenches:cook_pine_fence", COOK_PINE_FENCE, GENERAL);
		createBlockItem("deep_trenches:cook_pine_fence_gate", COOK_PINE_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:cook_pine_leaves", COOK_PINE_LEAVES, GENERAL);
		createBlockItem("deep_trenches:cook_pine_log", COOK_PINE_LOG, GENERAL);
		createBlockItem("deep_trenches:cook_pine_planks", COOK_PINE_PLANKS, GENERAL);
		createBlockItem("deep_trenches:cook_pine_pressure_plate", COOK_PINE_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:cook_pine_sapling", COOK_PINE_SAPLING, GENERAL);
		createSignItem("deep_trenches:cook_pine_sign", COOK_PINE_SIGN, COOK_PINE_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:cook_pine_slab", COOK_PINE_SLAB, GENERAL);
		createBlockItem("deep_trenches:cook_pine_stairs", COOK_PINE_STAIRS, GENERAL);
		createBlockItem("deep_trenches:cook_pine_trapdoor", COOK_PINE_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:cook_pine_wood", COOK_PINE_WOOD, GENERAL);

		createBlockItem("deep_trenches:crolood_button", CROLOOD_BUTTON, GENERAL);
		createBlockItem("deep_trenches:crolood_door", CROLOOD_DOOR, GENERAL);
		createBlockItem("deep_trenches:crolood_fence", CROLOOD_FENCE, GENERAL);
		createBlockItem("deep_trenches:crolood_fence_gate", CROLOOD_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:crolood_leaves", CROLOOD_LEAVES, GENERAL);
		createBlockItem("deep_trenches:crolood_log", CROLOOD_LOG, GENERAL);
		createBlockItem("deep_trenches:crolood_planks", CROLOOD_PLANKS, GENERAL);
		createBlockItem("deep_trenches:crolood_pressure_plate", CROLOOD_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:crolood_sapling", CROLOOD_SAPLING, GENERAL);
		createSignItem("deep_trenches:crolood_sign", CROLOOD_SIGN, CROLOOD_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:crolood_slab", CROLOOD_SLAB, GENERAL);
		createBlockItem("deep_trenches:crolood_stairs", CROLOOD_STAIRS, GENERAL);
		createBlockItem("deep_trenches:crolood_trapdoor", CROLOOD_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:crolood_wood", CROLOOD_WOOD, GENERAL);

		createBlockItem("deep_trenches:dark_crolood_button", DARK_CROLOOD_BUTTON, GENERAL);
		createBlockItem("deep_trenches:dark_crolood_door", DARK_CROLOOD_DOOR, GENERAL);
		createBlockItem("deep_trenches:dark_crolood_fence", DARK_CROLOOD_FENCE, GENERAL);
		createBlockItem("deep_trenches:dark_crolood_fence_gate", DARK_CROLOOD_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:dark_crolood_leaves", DARK_CROLOOD_LEAVES, GENERAL);
		createBlockItem("deep_trenches:dark_crolood_log", DARK_CROLOOD_LOG, GENERAL);
		createBlockItem("deep_trenches:dark_crolood_planks", DARK_CROLOOD_PLANKS, GENERAL);
		createBlockItem("deep_trenches:dark_crolood_pressure_plate", DARK_CROLOOD_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:dark_crolood_sapling", DARK_CROLOOD_SAPLING, GENERAL);
		createSignItem("deep_trenches:dark_crolood_sign", DARK_CROLOOD_SIGN, DARK_CROLOOD_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:dark_crolood_slab", DARK_CROLOOD_SLAB, GENERAL);
		createBlockItem("deep_trenches:dark_crolood_stairs", DARK_CROLOOD_STAIRS, GENERAL);
		createBlockItem("deep_trenches:dark_crolood_trapdoor", DARK_CROLOOD_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:dark_crolood_wood", DARK_CROLOOD_WOOD, GENERAL);

		createBlockItem("deep_trenches:dark_fuchsitra_button", DARK_FUCHSITRA_BUTTON, GENERAL);
		createBlockItem("deep_trenches:dark_fuchsitra_door", DARK_FUCHSITRA_DOOR, GENERAL);
		createBlockItem("deep_trenches:dark_fuchsitra_fence", DARK_FUCHSITRA_FENCE, GENERAL);
		createBlockItem("deep_trenches:dark_fuchsitra_fence_gate", DARK_FUCHSITRA_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:dark_fuchsitra_leaves", DARK_FUCHSITRA_LEAVES, GENERAL);
		createBlockItem("deep_trenches:dark_fuchsitra_log", DARK_FUCHSITRA_LOG, GENERAL);
		createBlockItem("deep_trenches:dark_fuchsitra_planks", DARK_FUCHSITRA_PLANKS, GENERAL);
		createBlockItem("deep_trenches:dark_fuchsitra_pressure_plate", DARK_FUCHSITRA_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:dark_fuchsitra_sapling", DARK_FUCHSITRA_SAPLING, GENERAL);
		createSignItem("deep_trenches:dark_fuchsitra_sign", DARK_FUCHSITRA_SIGN, DARK_FUCHSITRA_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:dark_fuchsitra_slab", DARK_FUCHSITRA_SLAB, GENERAL);
		createBlockItem("deep_trenches:dark_fuchsitra_stairs", DARK_FUCHSITRA_STAIRS, GENERAL);
		createBlockItem("deep_trenches:dark_fuchsitra_trapdoor", DARK_FUCHSITRA_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:dark_fuchsitra_wood", DARK_FUCHSITRA_WOOD, GENERAL);

		createBlockItem("deep_trenches:dark_red_elm_button", DARK_RED_ELM_BUTTON, GENERAL);
		createBlockItem("deep_trenches:dark_red_elm_door", DARK_RED_ELM_DOOR, GENERAL);
		createBlockItem("deep_trenches:dark_red_elm_fence", DARK_RED_ELM_FENCE, GENERAL);
		createBlockItem("deep_trenches:dark_red_elm_fence_gate", DARK_RED_ELM_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:dark_red_elm_leaves", DARK_RED_ELM_LEAVES, GENERAL);
		createBlockItem("deep_trenches:dark_red_elm_log", DARK_RED_ELM_LOG, GENERAL);
		createBlockItem("deep_trenches:dark_red_elm_planks", DARK_RED_ELM_PLANKS, GENERAL);
		createBlockItem("deep_trenches:dark_red_elm_pressure_plate", DARK_RED_ELM_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:dark_red_elm_sapling", DARK_RED_ELM_SAPLING, GENERAL);
		createSignItem("deep_trenches:dark_red_elm_sign", DARK_RED_ELM_SIGN, DARK_RED_ELM_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:dark_red_elm_slab", DARK_RED_ELM_SLAB, GENERAL);
		createBlockItem("deep_trenches:dark_red_elm_stairs", DARK_RED_ELM_STAIRS, GENERAL);
		createBlockItem("deep_trenches:dark_red_elm_trapdoor", DARK_RED_ELM_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:dark_red_elm_wood", DARK_RED_ELM_WOOD, GENERAL);

		createBlockItem("deep_trenches:dead_wart_tree_button", DEAD_WART_TREE_BUTTON, GENERAL);
		createBlockItem("deep_trenches:dead_wart_tree_door", DEAD_WART_TREE_DOOR, GENERAL);
		createBlockItem("deep_trenches:dead_wart_tree_fence", DEAD_WART_TREE_FENCE, GENERAL);
		createBlockItem("deep_trenches:dead_wart_tree_fence_gate", DEAD_WART_TREE_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:dead_wart_tree_log", DEAD_WART_TREE_LOG, GENERAL);
		createBlockItem("deep_trenches:dead_wart_tree_planks", DEAD_WART_TREE_PLANKS, GENERAL);
		createBlockItem("deep_trenches:dead_wart_tree_pressure_plate", DEAD_WART_TREE_PRESSURE_PLATE, GENERAL);
		createSignItem("deep_trenches:dead_wart_tree_sign", DEAD_WART_TREE_SIGN, DEAD_WART_TREE_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:dead_wart_tree_slab", DEAD_WART_TREE_SLAB, GENERAL);
		createBlockItem("deep_trenches:dead_wart_tree_stairs", DEAD_WART_TREE_STAIRS, GENERAL);
		createBlockItem("deep_trenches:dead_wart_tree_trapdoor", DEAD_WART_TREE_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:dead_wart_tree_wood", DEAD_WART_TREE_WOOD, GENERAL);

		createBlockItem("deep_trenches:drigyus", DRIGYUS, GENERAL);
		createBlockItem("deep_trenches:drigyus_button", DRIGYUS_BUTTON, GENERAL);
		createBlockItem("deep_trenches:drigyus_door", DRIGYUS_DOOR, GENERAL);
		createBlockItem("deep_trenches:drigyus_fence", DRIGYUS_FENCE, GENERAL);
		createBlockItem("deep_trenches:drigyus_fence_gate", DRIGYUS_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:drigyus_log", DRIGYUS_LOG, GENERAL);
		createBlockItem("deep_trenches:drigyus_planks", DRIGYUS_PLANKS, GENERAL);
		createBlockItem("deep_trenches:drigyus_pressure_plate", DRIGYUS_PRESSURE_PLATE, GENERAL);
		createSignItem("deep_trenches:drigyus_sign", DRIGYUS_SIGN, DRIGYUS_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:drigyus_slab", DRIGYUS_SLAB, GENERAL);
		createBlockItem("deep_trenches:drigyus_stairs", DRIGYUS_STAIRS, GENERAL);
		createBlockItem("deep_trenches:drigyus_trapdoor", DRIGYUS_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:drigyus_wood", DRIGYUS_WOOD, GENERAL);

		createBlockItem("deep_trenches:ebony_button", EBONY_BUTTON, GENERAL);
		createBlockItem("deep_trenches:ebony_door", EBONY_DOOR, GENERAL);
		createBlockItem("deep_trenches:ebony_fence", EBONY_FENCE, GENERAL);
		createBlockItem("deep_trenches:ebony_fence_gate", EBONY_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:ebony_leaves", EBONY_LEAVES, GENERAL);
		createBlockItem("deep_trenches:ebony_log", EBONY_LOG, GENERAL);
		createBlockItem("deep_trenches:ebony_planks", EBONY_PLANKS, GENERAL);
		createBlockItem("deep_trenches:ebony_pressure_plate", EBONY_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:ebony_sapling", EBONY_SAPLING, GENERAL);
		createSignItem("deep_trenches:ebony_sign", EBONY_SIGN, EBONY_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:ebony_slab", EBONY_SLAB, GENERAL);
		createBlockItem("deep_trenches:ebony_stairs", EBONY_STAIRS, GENERAL);
		createBlockItem("deep_trenches:ebony_trapdoor", EBONY_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:ebony_wood", EBONY_WOOD, GENERAL);

		createBlockItem("deep_trenches:enderheart_button", ENDERHEART_BUTTON, GENERAL);
		createBlockItem("deep_trenches:enderheart_door", ENDERHEART_DOOR, GENERAL);
		createBlockItem("deep_trenches:enderheart_fence", ENDERHEART_FENCE, GENERAL);
		createBlockItem("deep_trenches:enderheart_fence_gate", ENDERHEART_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:enderheart_leaf", ENDERHEART_LEAF, GENERAL);
		createBlockItem("deep_trenches:enderheart_leaves", ENDERHEART_LEAVES, GENERAL);
		createBlockItem("deep_trenches:enderheart_log", ENDERHEART_LOG, GENERAL);
		createBlockItem("deep_trenches:enderheart_planks", ENDERHEART_PLANKS, GENERAL);
		createBlockItem("deep_trenches:enderheart_pressure_plate", ENDERHEART_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:enderheart_sapling", ENDERHEART_SAPLING, GENERAL);
		createSignItem("deep_trenches:enderheart_sign", ENDERHEART_SIGN, ENDERHEART_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:enderheart_slab", ENDERHEART_SLAB, GENERAL);
		createBlockItem("deep_trenches:enderheart_stairs", ENDERHEART_STAIRS, GENERAL);
		createBlockItem("deep_trenches:enderheart_trapdoor", ENDERHEART_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:enderheart_wood", ENDERHEART_WOOD, GENERAL);

		createBlockItem("deep_trenches:flalm", FLALM, GENERAL);
		createBlockItem("deep_trenches:flalm_button", FLALM_BUTTON, GENERAL);
		createBlockItem("deep_trenches:flalm_door", FLALM_DOOR, GENERAL);
		createBlockItem("deep_trenches:flalm_fence", FLALM_FENCE, GENERAL);
		createBlockItem("deep_trenches:flalm_fence_gate", FLALM_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:flalm_petal_block", FLALM_PETAL_BLOCK, GENERAL);
		createBlockItem("deep_trenches:flalm_planks", FLALM_PLANKS, GENERAL);
		createBlockItem("deep_trenches:flalm_pressure_plate", FLALM_PRESSURE_PLATE, GENERAL);
		createSignItem("deep_trenches:flalm_sign", FLALM_SIGN, FLALM_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:flalm_slab", FLALM_SLAB, GENERAL);
		createBlockItem("deep_trenches:flalm_stairs", FLALM_STAIRS, GENERAL);
		createBlockItem("deep_trenches:flalm_stem", FLALM_STEM, GENERAL);
		createBlockItem("deep_trenches:flalm_thorns", FLALM_THORNS, GENERAL);
		createBlockItem("deep_trenches:flalm_trapdoor", FLALM_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:flalm_wood", FLALM_WOOD, GENERAL);

		createBlockItem("deep_trenches:fruce_button", FRUCE_BUTTON, GENERAL);
		createBlockItem("deep_trenches:fruce_door", FRUCE_DOOR, GENERAL);
		createBlockItem("deep_trenches:fruce_fence", FRUCE_FENCE, GENERAL);
		createBlockItem("deep_trenches:fruce_fence_gate", FRUCE_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:fruce_leaves", FRUCE_LEAVES, GENERAL);
		createBlockItem("deep_trenches:fruce_log", FRUCE_LOG, GENERAL);
		createBlockItem("deep_trenches:fruce_planks", FRUCE_PLANKS, GENERAL);
		createBlockItem("deep_trenches:fruce_pressure_plate", FRUCE_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:fruce_sapling", FRUCE_SAPLING, GENERAL);
		createSignItem("deep_trenches:fruce_sign", FRUCE_SIGN, FRUCE_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:fruce_slab", FRUCE_SLAB, GENERAL);
		createBlockItem("deep_trenches:fruce_stairs", FRUCE_STAIRS, GENERAL);
		createBlockItem("deep_trenches:fruce_trapdoor", FRUCE_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:fruce_wood", FRUCE_WOOD, GENERAL);

		createBlockItem("deep_trenches:fuchsitra_button", FUCHSITRA_BUTTON, GENERAL);
		createBlockItem("deep_trenches:fuchsitra_door", FUCHSITRA_DOOR, GENERAL);
		createBlockItem("deep_trenches:fuchsitra_fence", FUCHSITRA_FENCE, GENERAL);
		createBlockItem("deep_trenches:fuchsitra_fence_gate", FUCHSITRA_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:fuchsitra_leaves", FUCHSITRA_LEAVES, GENERAL);
		createBlockItem("deep_trenches:fuchsitra_log", FUCHSITRA_LOG, GENERAL);
		createBlockItem("deep_trenches:fuchsitra_planks", FUCHSITRA_PLANKS, GENERAL);
		createBlockItem("deep_trenches:fuchsitra_pressure_plate", FUCHSITRA_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:fuchsitra_sapling", FUCHSITRA_SAPLING, GENERAL);
		createSignItem("deep_trenches:fuchsitra_sign", FUCHSITRA_SIGN, FUCHSITRA_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:fuchsitra_slab", FUCHSITRA_SLAB, GENERAL);
		createBlockItem("deep_trenches:fuchsitra_stairs", FUCHSITRA_STAIRS, GENERAL);
		createBlockItem("deep_trenches:fuchsitra_trapdoor", FUCHSITRA_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:fuchsitra_wood", FUCHSITRA_WOOD, GENERAL);

		createBlockItem("deep_trenches:fugmos_button", FUGMOS_BUTTON, GENERAL);
		createBlockItem("deep_trenches:fugmos_door", FUGMOS_DOOR, GENERAL);
		createBlockItem("deep_trenches:fugmos_fence", FUGMOS_FENCE, GENERAL);
		createBlockItem("deep_trenches:fugmos_fence_gate", FUGMOS_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:fugmos_moss", FUGMOS_MOSS, GENERAL);
		createBlockItem("deep_trenches:fugmos_planks", FUGMOS_PLANKS, GENERAL);
		createBlockItem("deep_trenches:fugmos_pressure_plate", FUGMOS_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:fugmos", FUGMOS, GENERAL);
		createSignItem("deep_trenches:fugmos_sign", FUGMOS_SIGN, FUGMOS_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:fugmos_slab", FUGMOS_SLAB, GENERAL);
		createBlockItem("deep_trenches:fugmos_stairs", FUGMOS_STAIRS, GENERAL);
		createBlockItem("deep_trenches:fugmos_stem", FUGMOS_STEM, GENERAL);
		createBlockItem("deep_trenches:fugmos_trapdoor", FUGMOS_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:fugmos_wood", FUGMOS_WOOD, GENERAL);

		createBlockItem("deep_trenches:funeranite_button", FUNERANITE_BUTTON, GENERAL);
		createBlockItem("deep_trenches:funeranite_cap", FUNERANITE_CAP, GENERAL);
		createBlockItem("deep_trenches:funeranite_door", FUNERANITE_DOOR, GENERAL);
		createBlockItem("deep_trenches:funeranite_fence", FUNERANITE_FENCE, GENERAL);
		createBlockItem("deep_trenches:funeranite_fence_gate", FUNERANITE_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:funeranite_log", FUNERANITE_LOG, GENERAL);
		createBlockItem("deep_trenches:funeranite_planks", FUNERANITE_PLANKS, GENERAL);
		createBlockItem("deep_trenches:funeranite_pressure_plate", FUNERANITE_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:funeranite_sapling", FUNERANITE_SAPLING, GENERAL);
		createSignItem("deep_trenches:funeranite_sign", FUNERANITE_SIGN, FUNERANITE_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:funeranite_slab", FUNERANITE_SLAB, GENERAL);
		createBlockItem("deep_trenches:funeranite_stairs", FUNERANITE_STAIRS, GENERAL);
		createBlockItem("deep_trenches:funeranite_trapdoor", FUNERANITE_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:funeranite_wood", FUNERANITE_WOOD, GENERAL);

		createBlockItem("deep_trenches:ghoshroom_button", GHOSHROOM_BUTTON, GENERAL);
		createBlockItem("deep_trenches:ghoshroom_cap", GHOSHROOM_CAP, GENERAL);
		createBlockItem("deep_trenches:ghoshroom_door", GHOSHROOM_DOOR, GENERAL);
		createBlockItem("deep_trenches:ghoshroom_fence", GHOSHROOM_FENCE, GENERAL);
		createBlockItem("deep_trenches:ghoshroom_fence_gate", GHOSHROOM_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:ghoshroom_log", GHOSHROOM_LOG, GENERAL);
		createBlockItem("deep_trenches:ghoshroom_planks", GHOSHROOM_PLANKS, GENERAL);
		createBlockItem("deep_trenches:ghoshroom_pressure_plate", GHOSHROOM_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:ghoshroom_sapling", GHOSHROOM_SAPLING, GENERAL);
		createSignItem("deep_trenches:ghoshroom_sign", GHOSHROOM_SIGN, GHOSHROOM_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:ghoshroom_slab", GHOSHROOM_SLAB, GENERAL);
		createBlockItem("deep_trenches:ghoshroom_stairs", GHOSHROOM_STAIRS, GENERAL);
		createBlockItem("deep_trenches:ghoshroom_trapdoor", GHOSHROOM_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:ghoshroom_wood", GHOSHROOM_WOOD, GENERAL);

		createBlockItem("deep_trenches:giant_violet_button", GIANT_VIOLET_BUTTON, GENERAL);
		createBlockItem("deep_trenches:giant_violet_door", GIANT_VIOLET_DOOR, GENERAL);
		createBlockItem("deep_trenches:giant_violet_fence", GIANT_VIOLET_FENCE, GENERAL);
		createBlockItem("deep_trenches:giant_violet_fence_gate", GIANT_VIOLET_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:giant_violet_planks", GIANT_VIOLET_PLANKS, GENERAL);
		createBlockItem("deep_trenches:giant_violet_pressure_plate", GIANT_VIOLET_PRESSURE_PLATE, GENERAL);
		createSignItem("deep_trenches:giant_violet_sign", GIANT_VIOLET_SIGN, GIANT_VIOLET_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:giant_violet_slab", GIANT_VIOLET_SLAB, GENERAL);
		createBlockItem("deep_trenches:giant_violet_stairs", GIANT_VIOLET_STAIRS, GENERAL);
		createBlockItem("deep_trenches:giant_violet_trapdoor", GIANT_VIOLET_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:giant_violet_stem", GIANT_VIOLET_STEM, GENERAL);
		createBlockItem("deep_trenches:giant_violet_wood", GIANT_VIOLET_WOOD, GENERAL);

		createBlockItem("deep_trenches:guaiacum_button", GUAIACUM_BUTTON, GENERAL);
		createBlockItem("deep_trenches:guaiacum_door", GUAIACUM_DOOR, GENERAL);
		createBlockItem("deep_trenches:guaiacum_fence", GUAIACUM_FENCE, GENERAL);
		createBlockItem("deep_trenches:guaiacum_fence_gate", GUAIACUM_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:guaiacum_flowers", GUAIACUM_FLOWERS, GENERAL);
		createBlockItem("deep_trenches:guaiacum_leaves", GUAIACUM_LEAVES, GENERAL);
		createBlockItem("deep_trenches:guaiacum_log", GUAIACUM_LOG, GENERAL);
		createBlockItem("deep_trenches:guaiacum_planks", GUAIACUM_PLANKS, GENERAL);
		createBlockItem("deep_trenches:guaiacum_pressure_plate", GUAIACUM_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:guaiacum_sapling", GUAIACUM_SAPLING, GENERAL);
		createSignItem("deep_trenches:guaiacum_sign", GUAIACUM_SIGN, GUAIACUM_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:guaiacum_slab", GUAIACUM_SLAB, GENERAL);
		createBlockItem("deep_trenches:guaiacum_stairs", GUAIACUM_STAIRS, GENERAL);
		createBlockItem("deep_trenches:guaiacum_trapdoor", GUAIACUM_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:guaiacum_wood", GUAIACUM_WOOD, GENERAL);

		createBlockItem("deep_trenches:joshua_button", JOSHUA_BUTTON, GENERAL);
		createBlockItem("deep_trenches:joshua_door", JOSHUA_DOOR, GENERAL);
		createBlockItem("deep_trenches:joshua_fence", JOSHUA_FENCE, GENERAL);
		createBlockItem("deep_trenches:joshua_fence_gate", JOSHUA_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:joshua_leaves", JOSHUA_LEAVES, GENERAL);
		createBlockItem("deep_trenches:joshua_log", JOSHUA_LOG, GENERAL);
		createBlockItem("deep_trenches:joshua_planks", JOSHUA_PLANKS, GENERAL);
		createBlockItem("deep_trenches:joshua_pressure_plate", JOSHUA_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:joshua_sapling", JOSHUA_SAPLING, GENERAL);
		createSignItem("deep_trenches:joshua_sign", JOSHUA_SIGN, JOSHUA_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:joshua_slab", JOSHUA_SLAB, GENERAL);
		createBlockItem("deep_trenches:joshua_stairs", JOSHUA_STAIRS, GENERAL);
		createBlockItem("deep_trenches:joshua_trapdoor", JOSHUA_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:joshua_wood", JOSHUA_WOOD, GENERAL);

		createBlockItem("deep_trenches:klinkii_pine_button", KLINKII_PINE_BUTTON, GENERAL);
		createBlockItem("deep_trenches:klinkii_pine_door", KLINKII_PINE_DOOR, GENERAL);
		createBlockItem("deep_trenches:klinkii_pine_fence", KLINKII_PINE_FENCE, GENERAL);
		createBlockItem("deep_trenches:klinkii_pine_fence_gate", KLINKII_PINE_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:klinkii_pine_leaves", KLINKII_PINE_LEAVES, GENERAL);
		createBlockItem("deep_trenches:klinkii_pine_log", KLINKII_PINE_LOG, GENERAL);
		createBlockItem("deep_trenches:klinkii_pine_planks", KLINKII_PINE_PLANKS, GENERAL);
		createBlockItem("deep_trenches:klinkii_pine_pressure_plate", KLINKII_PINE_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:klinkii_pine_sapling", KLINKII_PINE_SAPLING, GENERAL);
		createSignItem("deep_trenches:klinkii_pine_sign", KLINKII_PINE_SIGN, KLINKII_PINE_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:klinkii_pine_slab", KLINKII_PINE_SLAB, GENERAL);
		createBlockItem("deep_trenches:klinkii_pine_stairs", KLINKII_PINE_STAIRS, GENERAL);
		createBlockItem("deep_trenches:klinkii_pine_trapdoor", KLINKII_PINE_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:klinkii_pine_wood", KLINKII_PINE_WOOD, GENERAL);

		createBlockItem("deep_trenches:melaleuca_button", MELALEUCA_BUTTON, GENERAL);
		createBlockItem("deep_trenches:melaleuca_door", MELALEUCA_DOOR, GENERAL);
		createBlockItem("deep_trenches:melaleuca_fence", MELALEUCA_FENCE, GENERAL);
		createBlockItem("deep_trenches:melaleuca_fence_gate", MELALEUCA_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:melaleuca_flowers", MELALEUCA_FLOWERS, GENERAL);
		createBlockItem("deep_trenches:melaleuca_leaves", MELALEUCA_LEAVES, GENERAL);
		createBlockItem("deep_trenches:melaleuca_log", MELALEUCA_LOG, GENERAL);
		createBlockItem("deep_trenches:melaleuca_planks", MELALEUCA_PLANKS, GENERAL);
		createBlockItem("deep_trenches:melaleuca_pressure_plate", MELALEUCA_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:melaleuca_sapling", MELALEUCA_SAPLING, GENERAL);
		createSignItem("deep_trenches:melaleuca_sign", MELALEUCA_SIGN, MELALEUCA_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:melaleuca_slab", MELALEUCA_SLAB, GENERAL);
		createBlockItem("deep_trenches:melaleuca_stairs", MELALEUCA_STAIRS, GENERAL);
		createBlockItem("deep_trenches:melaleuca_trapdoor", MELALEUCA_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:melaleuca_wood", MELALEUCA_WOOD, GENERAL);

		createBlockItem("deep_trenches:mossy_yew_log", MOSSY_YEW_LOG, GENERAL);
		createBlockItem("deep_trenches:sprilium", SPRILIUM, GENERAL);

		createBlockItem("deep_trenches:murkantuan_button", MURKANTUAN_BUTTON, GENERAL);
		createBlockItem("deep_trenches:murkantuan_door", MURKANTUAN_DOOR, GENERAL);
		createBlockItem("deep_trenches:murkantuan_fence", MURKANTUAN_FENCE, GENERAL);
		createBlockItem("deep_trenches:murkantuan_fence_gate", MURKANTUAN_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:murkantuan_flower", MURKANTUAN_FLOWER, GENERAL);
		createBlockItem("deep_trenches:murkantuan_leaves", MURKANTUAN_LEAVES, GENERAL);
		createBlockItem("deep_trenches:murkantuan_log", MURKANTUAN_LOG, GENERAL);
		createBlockItem("deep_trenches:murkantuan_planks", MURKANTUAN_PLANKS, GENERAL);
		createBlockItem("deep_trenches:murkantuan_pressure_plate", MURKANTUAN_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:murkantuan_sapling", MURKANTUAN_SAPLING, GENERAL);
		createSignItem("deep_trenches:murkantuan_sign", MURKANTUAN_SIGN, MURKANTUAN_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:murkantuan_slab", MURKANTUAN_SLAB, GENERAL);
		createBlockItem("deep_trenches:murkantuan_stairs", MURKANTUAN_STAIRS, GENERAL);
		createBlockItem("deep_trenches:murkantuan_trapdoor", MURKANTUAN_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:murkantuan_wood", MURKANTUAN_WOOD, GENERAL);

		createBlockItem("deep_trenches:norfolk_pine_button", NORFOLK_PINE_BUTTON, GENERAL);
		createBlockItem("deep_trenches:norfolk_pine_door", NORFOLK_PINE_DOOR, GENERAL);
		createBlockItem("deep_trenches:norfolk_pine_fence", NORFOLK_PINE_FENCE, GENERAL);
		createBlockItem("deep_trenches:norfolk_pine_fence_gate", NORFOLK_PINE_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:norfolk_pine_leaves", NORFOLK_PINE_LEAVES, GENERAL);
		createBlockItem("deep_trenches:norfolk_pine_log", NORFOLK_PINE_LOG, GENERAL);
		createBlockItem("deep_trenches:norfolk_pine_planks", NORFOLK_PINE_PLANKS, GENERAL);
		createBlockItem("deep_trenches:norfolk_pine_pressure_plate", NORFOLK_PINE_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:norfolk_pine_sapling", NORFOLK_PINE_SAPLING, GENERAL);
		createSignItem("deep_trenches:norfolk_pine_sign", NORFOLK_PINE_SIGN, NORFOLK_PINE_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:norfolk_pine_slab", NORFOLK_PINE_SLAB, GENERAL);
		createBlockItem("deep_trenches:norfolk_pine_stairs", NORFOLK_PINE_STAIRS, GENERAL);
		createBlockItem("deep_trenches:norfolk_pine_trapdoor", NORFOLK_PINE_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:norfolk_pine_wood", NORFOLK_PINE_WOOD, GENERAL);


		createBlockItem("deep_trenches:obscrus", OBSCRUS, GENERAL);
		createBlockItem("deep_trenches:obscrus_button", OBSCRUS_BUTTON, GENERAL);
		createBlockItem("deep_trenches:obscrus_door", OBSCRUS_DOOR, GENERAL);
		createBlockItem("deep_trenches:obscrus_fence", OBSCRUS_FENCE, GENERAL);
		createBlockItem("deep_trenches:obscrus_fence_gate", OBSCRUS_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:obscrus_leaves", OBSCRUS_LEAVES, GENERAL);
		createBlockItem("deep_trenches:obscrus_log", OBSCRUS_LOG, GENERAL);
		createBlockItem("deep_trenches:obscrus_planks", OBSCRUS_PLANKS, GENERAL);
		createBlockItem("deep_trenches:obscrus_pressure_plate", OBSCRUS_PRESSURE_PLATE, GENERAL);
		createSignItem("deep_trenches:obscrus_sign", OBSCRUS_SIGN, OBSCRUS_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:obscrus_slab", OBSCRUS_SLAB, GENERAL);
		createBlockItem("deep_trenches:obscrus_stairs", OBSCRUS_STAIRS, GENERAL);
		createBlockItem("deep_trenches:obscrus_trapdoor", OBSCRUS_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:obscrus_wood", OBSCRUS_WOOD, GENERAL);

		createBlockItem("deep_trenches:orhpris_button", ORHPRIS_BUTTON, GENERAL);
		createBlockItem("deep_trenches:orhpris_door", ORHPRIS_DOOR, GENERAL);
		createBlockItem("deep_trenches:orhpris_fence", ORHPRIS_FENCE, GENERAL);
		createBlockItem("deep_trenches:orhpris_fence_gate", ORHPRIS_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:orhpris_leaves", ORHPRIS_LEAVES, GENERAL);
		createBlockItem("deep_trenches:orhpris_log", ORHPRIS_LOG, GENERAL);
		createBlockItem("deep_trenches:orhpris_planks", ORHPRIS_PLANKS, GENERAL);
		createBlockItem("deep_trenches:orhpris_pressure_plate", ORHPRIS_PRESSURE_PLATE, GENERAL);
		createSignItem("deep_trenches:orhpris_sign", ORHPRIS_SIGN, ORHPRIS_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:orhpris_sapling", ORHPRIS_SAPLING, GENERAL);
		createBlockItem("deep_trenches:orhpris_slab", ORHPRIS_SLAB, GENERAL);
		createBlockItem("deep_trenches:orhpris_stairs", ORHPRIS_STAIRS, GENERAL);
		createBlockItem("deep_trenches:orhpris_trapdoor", ORHPRIS_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:orhpris_wood", ORHPRIS_WOOD, GENERAL);

		createBlockItem("deep_trenches:peltogyne_button", PELTOGYNE_BUTTON, GENERAL);
		createBlockItem("deep_trenches:peltogyne_door", PELTOGYNE_DOOR, GENERAL);
		createBlockItem("deep_trenches:peltogyne_fence", PELTOGYNE_FENCE, GENERAL);
		createBlockItem("deep_trenches:peltogyne_fence_gate", PELTOGYNE_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:peltogyne_leaves", PELTOGYNE_LEAVES, GENERAL);
		createBlockItem("deep_trenches:peltogyne_log", PELTOGYNE_LOG, GENERAL);
		createBlockItem("deep_trenches:peltogyne_planks", PELTOGYNE_PLANKS, GENERAL);
		createBlockItem("deep_trenches:peltogyne_pressure_plate", PELTOGYNE_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:peltogyne_sapling", PELTOGYNE_SAPLING, GENERAL);
		createSignItem("deep_trenches:peltogyne_sign", PELTOGYNE_SIGN, PELTOGYNE_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:peltogyne_slab", PELTOGYNE_SLAB, GENERAL);
		createBlockItem("deep_trenches:peltogyne_stairs", PELTOGYNE_STAIRS, GENERAL);
		createBlockItem("deep_trenches:peltogyne_trapdoor", PELTOGYNE_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:peltogyne_wood", PELTOGYNE_WOOD, GENERAL);

		createBlockItem("deep_trenches:pin_cherry_button", PIN_CHERRY_BUTTON, GENERAL);
		createBlockItem("deep_trenches:pin_cherry_door", PIN_CHERRY_DOOR, GENERAL);
		createBlockItem("deep_trenches:pin_cherry_fence", PIN_CHERRY_FENCE, GENERAL);
		createBlockItem("deep_trenches:pin_cherry_fence_gate", PIN_CHERRY_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:pin_cherry_leaves", PIN_CHERRY_LEAVES, GENERAL);
		createBlockItem("deep_trenches:pin_cherry_log", PIN_CHERRY_LOG, GENERAL);
		createBlockItem("deep_trenches:pin_cherry_planks", PIN_CHERRY_PLANKS, GENERAL);
		createBlockItem("deep_trenches:pin_cherry_pressure_plate", PIN_CHERRY_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:pin_cherry_sapling", PIN_CHERRY_SAPLING, GENERAL);
		createSignItem("deep_trenches:pin_cherry_sign", PIN_CHERRY_SIGN, PIN_CHERRY_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:pin_cherry_slab", PIN_CHERRY_SLAB, GENERAL);
		createBlockItem("deep_trenches:pin_cherry_stairs", PIN_CHERRY_STAIRS, GENERAL);
		createBlockItem("deep_trenches:pin_cherry_trapdoor", PIN_CHERRY_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:pin_cherry_wood", PIN_CHERRY_WOOD, GENERAL);

		createBlockItem("deep_trenches:plum_button", PLUM_BUTTON, GENERAL);
		createBlockItem("deep_trenches:plum_door", PLUM_DOOR, GENERAL);
		createBlockItem("deep_trenches:plum_fence", PLUM_FENCE, GENERAL);
		createBlockItem("deep_trenches:plum_fence_gate", PLUM_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:plum_leaves", PLUM_LEAVES, GENERAL);
		createBlockItem("deep_trenches:plum_log", PLUM_LOG, GENERAL);
		createBlockItem("deep_trenches:plum_planks", PLUM_PLANKS, GENERAL);
		createBlockItem("deep_trenches:plum_pressure_plate", PLUM_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:plum_sapling", PLUM_SAPLING, GENERAL);
		createSignItem("deep_trenches:plum_sign", PLUM_SIGN, PLUM_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:plum_slab", PLUM_SLAB, GENERAL);
		createBlockItem("deep_trenches:plum_stairs", PLUM_STAIRS, GENERAL);
		createBlockItem("deep_trenches:plum_trapdoor", PLUM_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:plum_wood", PLUM_WOOD, GENERAL);

		createBlockItem("deep_trenches:purfunga_button", PURFUNGA_BUTTON, GENERAL);
		createBlockItem("deep_trenches:purfunga_cap", PURFUNGA_CAP, GENERAL);
		createBlockItem("deep_trenches:purfunga_door", PURFUNGA_DOOR, GENERAL);
		createBlockItem("deep_trenches:purfunga_fence", PURFUNGA_FENCE, GENERAL);
		createBlockItem("deep_trenches:purfunga_fence_gate", PURFUNGA_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:purfunga_log", PURFUNGA_LOG, GENERAL);
		createBlockItem("deep_trenches:purfunga_planks", PURFUNGA_PLANKS, GENERAL);
		createBlockItem("deep_trenches:purfunga_pressure_plate", PURFUNGA_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:purfunga_sapling", PURFUNGA_SAPLING, GENERAL);
		createSignItem("deep_trenches:purfunga_sign", PURFUNGA_SIGN, PURFUNGA_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:purfunga_slab", PURFUNGA_SLAB, GENERAL);
		createBlockItem("deep_trenches:purfunga_stairs", PURFUNGA_STAIRS, GENERAL);
		createBlockItem("deep_trenches:purfunga_trapdoor", PURFUNGA_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:purfunga_wood", PURFUNGA_WOOD, GENERAL);

		createBlockItem("deep_trenches:rark_button", RARK_BUTTON, GENERAL);
		createBlockItem("deep_trenches:rark_door", RARK_DOOR, GENERAL);
		createBlockItem("deep_trenches:rark_fence", RARK_FENCE, GENERAL);
		createBlockItem("deep_trenches:rark_fence_gate", RARK_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:rark_leaves", RARK_LEAVES, GENERAL);
		createBlockItem("deep_trenches:rark_log", RARK_LOG, GENERAL);
		createBlockItem("deep_trenches:rark_planks", RARK_PLANKS, GENERAL);
		createBlockItem("deep_trenches:rark_pressure_plate", RARK_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:rark_sapling", RARK_SAPLING, GENERAL);
		createSignItem("deep_trenches:rark_sign", RARK_SIGN, RARK_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:rark_slab", RARK_SLAB, GENERAL);
		createBlockItem("deep_trenches:rark_stairs", RARK_STAIRS, GENERAL);
		createBlockItem("deep_trenches:rark_trapdoor", RARK_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:rark_wood", RARK_WOOD, GENERAL);

		createBlockItem("deep_trenches:red_elm_button", RED_ELM_BUTTON, GENERAL);
		createBlockItem("deep_trenches:red_elm_door", RED_ELM_DOOR, GENERAL);
		createBlockItem("deep_trenches:red_elm_fence", RED_ELM_FENCE, GENERAL);
		createBlockItem("deep_trenches:red_elm_fence_gate", RED_ELM_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:red_elm_leaves", RED_ELM_LEAVES, GENERAL);
		createBlockItem("deep_trenches:red_elm_log", RED_ELM_LOG, GENERAL);
		createBlockItem("deep_trenches:red_elm_planks", RED_ELM_PLANKS, GENERAL);
		createBlockItem("deep_trenches:red_elm_pressure_plate", RED_ELM_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:red_elm_sapling", RED_ELM_SAPLING, GENERAL);
		createSignItem("deep_trenches:red_elm_sign", RED_ELM_SIGN, RED_ELM_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:red_elm_slab", RED_ELM_SLAB, GENERAL);
		createBlockItem("deep_trenches:red_elm_stairs", RED_ELM_STAIRS, GENERAL);
		createBlockItem("deep_trenches:red_elm_trapdoor", RED_ELM_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:red_elm_wood", RED_ELM_WOOD, GENERAL);

		createBlockItem("deep_trenches:rhadi_button", RHADI_BUTTON, GENERAL);
		createBlockItem("deep_trenches:rhadi_door", RHADI_DOOR, GENERAL);
		createBlockItem("deep_trenches:rhadi_fence", RHADI_FENCE, GENERAL);
		createBlockItem("deep_trenches:rhadi_fence_gate", RHADI_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:rhadi_fruit", RHADI_FRUIT, GENERAL);
		createBlockItem("deep_trenches:carved_rhadi_fruit", CARVED_RHADI_FRUIT, GENERAL);
		createBlockItem("deep_trenches:rhadi_leaves", RHADI_LEAVES, GENERAL);
		createBlockItem("deep_trenches:rhadi_log", RHADI_LOG, GENERAL);
		createBlockItem("deep_trenches:rhadi_o_lantern", RHADI_O_LANTERN, GENERAL);
		createBlockItem("deep_trenches:rhadi_planks", RHADI_PLANKS, GENERAL);
		createBlockItem("deep_trenches:rhadi_pressure_plate", RHADI_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:rhadi_sapling", RHADI_SAPLING, GENERAL);
		createSignItem("deep_trenches:rhadi_sign", RHADI_SIGN, RHADI_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:rhadi_slab", RHADI_SLAB, GENERAL);
		createBlockItem("deep_trenches:rhadi_stairs", RHADI_STAIRS, GENERAL);
		createBlockItem("deep_trenches:rhadi_thorns", RHADI_THORNS, GENERAL);
		createBlockItem("deep_trenches:rhadi_trapdoor", RHADI_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:rhadi_wood", RHADI_WOOD, GENERAL);

		createBlockItem("deep_trenches:sanguart_button", SANGUART_BUTTON, GENERAL);
		createBlockItem("deep_trenches:sanguart_door", SANGUART_DOOR, GENERAL);
		createBlockItem("deep_trenches:sanguart_fence", SANGUART_FENCE, GENERAL);
		createBlockItem("deep_trenches:sanguart_fence_gate", SANGUART_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:sanguart_leaves", SANGUART_LEAVES, GENERAL);
		createBlockItem("deep_trenches:sanguart_log", SANGUART_LOG, GENERAL);
		createBlockItem("deep_trenches:sanguart_planks", SANGUART_PLANKS, GENERAL);
		createBlockItem("deep_trenches:sanguart_pressure_plate", SANGUART_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:sanguart_sapling", SANGUART_SAPLING, GENERAL);
		createSignItem("deep_trenches:sanguart_sign", SANGUART_SIGN, SANGUART_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:sanguart_slab", SANGUART_SLAB, GENERAL);
		createBlockItem("deep_trenches:sanguart_stairs", SANGUART_STAIRS, GENERAL);
		createBlockItem("deep_trenches:sanguart_trapdoor", SANGUART_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:sanguart_wood", SANGUART_WOOD, GENERAL);

		createBlockItem("deep_trenches:scarlet_thiorcen", SCARLET_THIORCEN, GENERAL);
		createBlockItem("deep_trenches:scarlet_thiorcen_button", SCARLET_THIORCEN_BUTTON, GENERAL);
		createBlockItem("deep_trenches:scarlet_thiorcen_door", SCARLET_THIORCEN_DOOR, GENERAL);
		createBlockItem("deep_trenches:scarlet_thiorcen_fence", SCARLET_THIORCEN_FENCE, GENERAL);
		createBlockItem("deep_trenches:scarlet_thiorcen_fence_gate", SCARLET_THIORCEN_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:scarlet_thiorcen_log", SCARLET_THIORCEN_LOG, GENERAL);
		createBlockItem("deep_trenches:scarlet_thiorcen_planks", SCARLET_THIORCEN_PLANKS, GENERAL);
		createBlockItem("deep_trenches:scarlet_thiorcen_pressure_plate", SCARLET_THIORCEN_PRESSURE_PLATE, GENERAL);
		createSignItem("deep_trenches:scarlet_thiorcen_sign", SCARLET_THIORCEN_SIGN, SCARLET_THIORCEN_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:scarlet_thiorcen_slab", SCARLET_THIORCEN_SLAB, GENERAL);
		createBlockItem("deep_trenches:scarlet_thiorcen_stairs", SCARLET_THIORCEN_STAIRS, GENERAL);
		createBlockItem("deep_trenches:scarlet_thiorcen_trapdoor", SCARLET_THIORCEN_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:scarlet_thiorcen_wood", SCARLET_THIORCEN_WOOD, GENERAL);

		createBlockItem("deep_trenches:sproom_button", SPROOM_BUTTON, GENERAL);
		createBlockItem("deep_trenches:sproom_door", SPROOM_DOOR, GENERAL);
		createBlockItem("deep_trenches:sproom_fence", SPROOM_FENCE, GENERAL);
		createBlockItem("deep_trenches:sproom_fence_gate", SPROOM_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:sproom_leaves", SPROOM_LEAVES, GENERAL);
		createBlockItem("deep_trenches:sproom_log", SPROOM_LOG, GENERAL);
		createBlockItem("deep_trenches:sproom_planks", SPROOM_PLANKS, GENERAL);
		createBlockItem("deep_trenches:sproom_pressure_plate", SPROOM_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:sproom_sapling", SPROOM_SAPLING, GENERAL);
		createSignItem("deep_trenches:sproom_sign", SPROOM_SIGN, SPROOM_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:sproom_slab", SPROOM_SLAB, GENERAL);
		createBlockItem("deep_trenches:sproom_stairs", SPROOM_STAIRS, GENERAL);
		createBlockItem("deep_trenches:sproom_trapdoor", SPROOM_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:sproom_wood", SPROOM_WOOD, GENERAL);

		createBlockItem("deep_trenches:sequoia_button", SEQUOIA_BUTTON, GENERAL);
		createBlockItem("deep_trenches:sequoia_door", SEQUOIA_DOOR, GENERAL);
		createBlockItem("deep_trenches:sequoia_fence", SEQUOIA_FENCE, GENERAL);
		createBlockItem("deep_trenches:sequoia_fence_gate", SEQUOIA_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:sequoia_leaves", SEQUOIA_LEAVES, GENERAL);
		createBlockItem("deep_trenches:sequoia_log", SEQUOIA_LOG, GENERAL);
		createBlockItem("deep_trenches:sequoia_planks", SEQUOIA_PLANKS, GENERAL);
		createBlockItem("deep_trenches:sequoia_pressure_plate", SEQUOIA_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:sequoia_sapling", SEQUOIA_SAPLING, GENERAL);
		createSignItem("deep_trenches:sequoia_sign", SEQUOIA_SIGN, SEQUOIA_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:sequoia_slab", SEQUOIA_SLAB, GENERAL);
		createBlockItem("deep_trenches:sequoia_stairs", SANGUART_STAIRS, GENERAL);
		createBlockItem("deep_trenches:sequoia_trapdoor", SEQUOIA_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:sequoia_wood", SEQUOIA_WOOD, GENERAL);

		createBlockItem("deep_trenches:stasp_nest", STASP_NEST, GENERAL);

		createBlockItem("deep_trenches:stortreean_button", STORTREEAN_BUTTON, GENERAL);
		createBlockItem("deep_trenches:stortreean_door", STORTREEAN_DOOR, GENERAL);
		createBlockItem("deep_trenches:stortreean_fence", STORTREEAN_FENCE, GENERAL);
		createBlockItem("deep_trenches:stortreean_fence_gate", STORTREEAN_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:stortreean_leaves", STORTREEAN_LEAVES, GENERAL);
		createBlockItem("deep_trenches:stortreean_log", STORTREEAN_LOG, GENERAL);
		createBlockItem("deep_trenches:stortreean_planks", STORTREEAN_PLANKS, GENERAL);
		createBlockItem("deep_trenches:stortreean_pressure_plate", STORTREEAN_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:stortreean_sapling", STORTREEAN_SAPLING, GENERAL);
		createSignItem("deep_trenches:stortreean_sign", STORTREEAN_SIGN, STORTREEAN_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:stortreean_slab", STORTREEAN_SLAB, GENERAL);
		createBlockItem("deep_trenches:stortreean_stairs", STORTREEAN_STAIRS, GENERAL);
		createBlockItem("deep_trenches:stortreean_trapdoor", STORTREEAN_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:stortreean_wood", STORTREEAN_WOOD, GENERAL);

		createBlockItem("deep_trenches:stripped_almond_log", STRIPPED_ALMOND_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_almond_wood", STRIPPED_ALMOND_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_anameata_log", STRIPPED_ANAMEATA_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_anameata_wood", STRIPPED_ANAMEATA_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_angels_trumpet_log", STRIPPED_ANGELS_TRUMPET_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_angels_trumpet_wood", STRIPPED_ANGELS_TRUMPET_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_aquean_log", STRIPPED_AQUEAN_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_aquean_wood", STRIPPED_AQUEAN_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_barshrookle_log", STRIPPED_BARSHROOKLE_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_barshrookle_wood", STRIPPED_BARSHROOKLE_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_black_birch_log", STRIPPED_BLACK_BIRCH_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_black_birch_wood", STRIPPED_BLACK_BIRCH_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_bottlebrush_log", STRIPPED_BOTTLEBRUSH_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_bottlebrush_wood", STRIPPED_BOTTLEBRUSH_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_blue_mahoe_log", STRIPPED_BLUE_MAHOE_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_blue_mahoe_wood", STRIPPED_BLUE_MAHOE_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_blue_spruce_log", STRIPPED_BLUE_SPRUCE_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_blue_spruce_wood", STRIPPED_BLUE_SPRUCE_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_bromya_log", STRIPPED_BROMYA_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_bromya_wood", STRIPPED_BROMYA_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_bubbletree_log", STRIPPED_BUBBLETREE_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_bubbletree_wood", STRIPPED_BUBBLETREE_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_calcearb_log", STRIPPED_CALCEARB_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_calcearb_wood", STRIPPED_CALCEARB_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_cherry_log", STRIPPED_CHERRY_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_cherry_wood", STRIPPED_CHERRY_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_cook_pine_log", STRIPPED_COOK_PINE_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_chotorn_log", STRIPPED_CHOTORN_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_chotorn_wood", STRIPPED_CHOTORN_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_crolood_log", STRIPPED_CROLOOD_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_cook_pine_wood", STRIPPED_COOK_PINE_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_crolood_wood", STRIPPED_CROLOOD_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_dark_crolood_log", STRIPPED_DARK_CROLOOD_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_dark_crolood_wood", STRIPPED_DARK_CROLOOD_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_dark_fuchsitra_log", STRIPPED_DARK_FUCHSITRA_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_dark_fuchsitra_wood", STRIPPED_DARK_FUCHSITRA_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_dark_red_elm_log", STRIPPED_DARK_RED_ELM_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_dark_red_elm_wood", STRIPPED_DARK_RED_ELM_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_dead_wart_tree_log", STRIPPED_DEAD_WART_TREE_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_dead_wart_tree_wood", STRIPPED_DEAD_WART_TREE_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_drigyus_log", STRIPPED_DRIGYUS_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_drigyus_wood", STRIPPED_DRIGYUS_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_ebony_log", STRIPPED_EBONY_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_ebony_wood", STRIPPED_EBONY_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_enderheart_log", STRIPPED_ENDERHEART_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_enderheart_wood", STRIPPED_ENDERHEART_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_flalm_stem", STRIPPED_FLALM_STEM, GENERAL);
		createBlockItem("deep_trenches:stripped_flalm_wood", STRIPPED_FLALM_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_fruce_log", STRIPPED_FRUCE_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_fruce_wood", STRIPPED_FRUCE_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_fugmos_stem", STRIPPED_FUGMOS_STEM, GENERAL);
		createBlockItem("deep_trenches:stripped_fugmos_hyphae", STRIPPED_FUGMOS_HYPHAE, GENERAL);
		createBlockItem("deep_trenches:stripped_fuchsitra_log", STRIPPED_FUCHSITRA_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_fuchsitra_wood", STRIPPED_FUCHSITRA_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_funeranite_log", STRIPPED_FUNERANITE_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_funeranite_wood", STRIPPED_FUNERANITE_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_ghoshroom_log", STRIPPED_GHOSHROOM_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_ghoshroom_wood", STRIPPED_GHOSHROOM_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_giant_violet_stem", STRIPPED_GIANT_VIOLET_STEM, GENERAL);
		createBlockItem("deep_trenches:stripped_giant_violet_wood", STRIPPED_GIANT_VIOLET_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_guaiacum_log", STRIPPED_GUAIACUM_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_guaiacum_wood", STRIPPED_GUAIACUM_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_joshua_log", STRIPPED_JOSHUA_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_joshua_wood", STRIPPED_JOSHUA_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_klinkii_pine_log", STRIPPED_KLINKII_PINE_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_klinkii_pine_wood", STRIPPED_KLINKII_PINE_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_melaleuca_log", STRIPPED_MELALEUCA_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_melaleuca_wood", STRIPPED_MELALEUCA_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_murkantuan_log", STRIPPED_MURKANTUAN_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_murkantuan_wood", STRIPPED_MURKANTUAN_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_norfolk_pine_log", STRIPPED_NORFOLK_PINE_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_norfolk_pine_wood", STRIPPED_NORFOLK_PINE_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_obscrus_log", STRIPPED_OBSCRUS_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_obscrus_wood", STRIPPED_OBSCRUS_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_orhpris_log", STRIPPED_ORHPRIS_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_orhpris_wood", STRIPPED_ORHPRIS_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_peltogyne_log", STRIPPED_PELTOGYNE_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_peltogyne_wood", STRIPPED_PELTOGYNE_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_pin_cherry_log", STRIPPED_PIN_CHERRY_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_pin_cherry_wood", STRIPPED_PIN_CHERRY_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_plum_log", STRIPPED_PLUM_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_plum_wood", STRIPPED_PLUM_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_purfunga_log", STRIPPED_PURFUNGA_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_purfunga_wood", STRIPPED_PURFUNGA_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_rark_log", STRIPPED_RARK_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_rark_wood", STRIPPED_RARK_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_red_elm_log", STRIPPED_RED_ELM_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_red_elm_wood", STRIPPED_RED_ELM_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_rhadi_log", STRIPPED_RHADI_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_rhadi_wood", STRIPPED_RHADI_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_sanguart_log", STRIPPED_SANGUART_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_sanguart_wood", STRIPPED_SANGUART_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_scarlet_thiorcen_log", STRIPPED_SCARLET_THIORCEN_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_scarlet_thiorcen_wood", STRIPPED_SCARLET_THIORCEN_WOOD, GENERAL);

		createBlockItem("deep_trenches:stripped_sequoia_log", STRIPPED_SEQUOIA_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_sequoia_wood", STRIPPED_SEQUOIA_WOOD, GENERAL);

		createBlockItem("deep_trenches:stripped_sproom_log", STRIPPED_SPROOM_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_sproom_wood", STRIPPED_SPROOM_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_stortreean_log", STRIPPED_STORTREEAN_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_stortreean_wood", STRIPPED_STORTREEAN_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_stroomean_log", STRIPPED_STROOMEAN_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_stroomean_wood", STRIPPED_STROOMEAN_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_sunrise_fungus_log", STRIPPED_SUNRISE_FUNGUS_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_sunrise_fungus_wood", STRIPPED_SUNRISE_FUNGUS_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_tark_log", STRIPPED_TARK_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_tark_wood", STRIPPED_TARK_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_teak_log", STRIPPED_TEAK_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_teak_wood", STRIPPED_TEAK_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_thundercloud_plum_log", STRIPPED_THUNDERCLOUD_PLUM_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_thundercloud_plum_wood", STRIPPED_THUNDERCLOUD_PLUM_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_vynhert_log", STRIPPED_VYNHERT_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_vynhert_wood", STRIPPED_VYNHERT_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_wart_tree_log", STRIPPED_WART_TREE_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_wart_tree_wood", STRIPPED_WART_TREE_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_wenge_log", STRIPPED_WENGE_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_wenge_wood", STRIPPED_WENGE_WOOD, GENERAL);
		createBlockItem("deep_trenches:stripped_yew_log", STRIPPED_YEW_LOG, GENERAL);
		createBlockItem("deep_trenches:stripped_yew_wood", STRIPPED_YEW_WOOD, GENERAL);

		createBlockItem("deep_trenches:stroomean_button", STROOMEAN_BUTTON, GENERAL);
		createBlockItem("deep_trenches:stroomean_cap", STROOMEAN_CAP, GENERAL);
		createBlockItem("deep_trenches:stroomean_door", STROOMEAN_DOOR, GENERAL);
		createBlockItem("deep_trenches:stroomean_fence", STROOMEAN_FENCE, GENERAL);
		createBlockItem("deep_trenches:stroomean_fence_gate", STROOMEAN_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:stroomean_log", STROOMEAN_LOG, GENERAL);
		createBlockItem("deep_trenches:stroomean_planks", STROOMEAN_PLANKS, GENERAL);
		createBlockItem("deep_trenches:stroomean_pressure_plate", STROOMEAN_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:stroomean_sapling", STROOMEAN_SAPLING, GENERAL);
		createSignItem("deep_trenches:stroomean_sign", STROOMEAN_SIGN, STROOMEAN_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:stroomean_slab", STROOMEAN_SLAB, GENERAL);
		createBlockItem("deep_trenches:stroomean_stairs", STROOMEAN_STAIRS, GENERAL);
		createBlockItem("deep_trenches:stroomean_trapdoor", STROOMEAN_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:stroomean_wood", STROOMEAN_WOOD, GENERAL);

		createBlockItem("deep_trenches:sunrise_fungus_button", SUNRISE_FUNGUS_BUTTON, GENERAL);
		createBlockItem("deep_trenches:sunrise_fungus_cap", SUNRISE_FUNGUS_CAP, GENERAL);
		createBlockItem("deep_trenches:sunrise_fungus_door", SUNRISE_FUNGUS_DOOR, GENERAL);
		createBlockItem("deep_trenches:sunrise_fungus_fence", SUNRISE_FUNGUS_FENCE, GENERAL);
		createBlockItem("deep_trenches:sunrise_fungus_fence_gate", SUNRISE_FUNGUS_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:sunrise_fungus_log", SUNRISE_FUNGUS_LOG, GENERAL);
		createBlockItem("deep_trenches:sunrise_fungus_planks", SUNRISE_FUNGUS_PLANKS, GENERAL);
		createBlockItem("deep_trenches:sunrise_fungus_pressure_plate", SUNRISE_FUNGUS_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:sunrise_fungus_sapling", SUNRISE_FUNGUS_SAPLING, GENERAL);
		createSignItem("deep_trenches:sunrise_fungus_sign", SUNRISE_FUNGUS_SIGN, SUNRISE_FUNGUS_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:sunrise_fungus_slab", SUNRISE_FUNGUS_SLAB, GENERAL);
		createBlockItem("deep_trenches:sunrise_fungus_stairs", SUNRISE_FUNGUS_STAIRS, GENERAL);
		createBlockItem("deep_trenches:sunrise_fungus_trapdoor", SUNRISE_FUNGUS_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:sunrise_fungus_wood", SUNRISE_FUNGUS_WOOD, GENERAL);

		createBlockItem("deep_trenches:tark_button", TARK_BUTTON, GENERAL);
		createBlockItem("deep_trenches:tark_door", TARK_DOOR, GENERAL);
		createBlockItem("deep_trenches:tark_fence", TARK_FENCE, GENERAL);
		createBlockItem("deep_trenches:tark_fence_gate", TARK_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:tark_leaves", TARK_LEAVES, GENERAL);
		createBlockItem("deep_trenches:tark_log", TARK_LOG, GENERAL);
		createBlockItem("deep_trenches:tark_planks", TARK_PLANKS, GENERAL);
		createBlockItem("deep_trenches:tark_pressure_plate", TARK_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:tark_sapling", TARK_SAPLING, GENERAL);
		createSignItem("deep_trenches:tark_sign", TARK_SIGN, TARK_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:tark_slab", TARK_SLAB, GENERAL);
		createBlockItem("deep_trenches:tark_stairs", TARK_STAIRS, GENERAL);
		createBlockItem("deep_trenches:tark_trapdoor", TARK_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:tark_wood", TARK_WOOD, GENERAL);

		createBlockItem("deep_trenches:teak_button", TEAK_BUTTON, GENERAL);
		createBlockItem("deep_trenches:teak_door", TEAK_DOOR, GENERAL);
		createBlockItem("deep_trenches:teak_fence", TEAK_FENCE, GENERAL);
		createBlockItem("deep_trenches:teak_fence_gate", TEAK_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:teak_leaves", TEAK_LEAVES, GENERAL);
		createBlockItem("deep_trenches:teak_log", TEAK_LOG, GENERAL);
		createBlockItem("deep_trenches:teak_planks", TEAK_PLANKS, GENERAL);
		createBlockItem("deep_trenches:teak_pressure_plate", TEAK_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:teak_sapling", TEAK_SAPLING, GENERAL);
		createSignItem("deep_trenches:teak_sign", TEAK_SIGN, TEAK_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:teak_slab", TEAK_SLAB, GENERAL);
		createBlockItem("deep_trenches:teak_stairs", TEAK_STAIRS, GENERAL);
		createBlockItem("deep_trenches:teak_trapdoor", TEAK_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:teak_wood", TEAK_WOOD, GENERAL);

		createBlockItem("deep_trenches:thundercloud_plum_button", THUNDERCLOUD_PLUM_BUTTON, GENERAL);
		createBlockItem("deep_trenches:thundercloud_plum_door", THUNDERCLOUD_PLUM_DOOR, GENERAL);
		createBlockItem("deep_trenches:thundercloud_plum_fence", THUNDERCLOUD_PLUM_FENCE, GENERAL);
		createBlockItem("deep_trenches:thundercloud_plum_fence_gate", THUNDERCLOUD_PLUM_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:thundercloud_plum_leaves", THUNDERCLOUD_PLUM_LEAVES, GENERAL);
		createBlockItem("deep_trenches:thundercloud_plum_log", THUNDERCLOUD_PLUM_LOG, GENERAL);
		createBlockItem("deep_trenches:thundercloud_plum_planks", THUNDERCLOUD_PLUM_PLANKS, GENERAL);
		createBlockItem("deep_trenches:thundercloud_plum_pressure_plate", THUNDERCLOUD_PLUM_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:thundercloud_plum_sapling", THUNDERCLOUD_PLUM_SAPLING, GENERAL);
		createSignItem("deep_trenches:thundercloud_plum_sign", THUNDERCLOUD_PLUM_SIGN, THUNDERCLOUD_PLUM_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:thundercloud_plum_slab", THUNDERCLOUD_PLUM_SLAB, GENERAL);
		createBlockItem("deep_trenches:thundercloud_plum_stairs", THUNDERCLOUD_PLUM_STAIRS, GENERAL);
		createBlockItem("deep_trenches:thundercloud_plum_trapdoor", THUNDERCLOUD_PLUM_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:thundercloud_plum_wood", THUNDERCLOUD_PLUM_WOOD, GENERAL);

		createBlockItem("deep_trenches:vynhert_button", VYNHERT_BUTTON, GENERAL);
		createBlockItem("deep_trenches:vynhert_door", VYNHERT_DOOR, GENERAL);
		createBlockItem("deep_trenches:vynhert_fence", VYNHERT_FENCE, GENERAL);
		createBlockItem("deep_trenches:vynhert_fence_gate", VYNHERT_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:vynhert_fruit", VYNHERT_FRUIT, GENERAL);
		createBlockItem("deep_trenches:carved_vynhert_fruit", CARVED_VYNHERT_FRUIT, GENERAL);
		createBlockItem("deep_trenches:vynhert_leaf", VYNHERT_LEAF, GENERAL);
		createBlockItem("deep_trenches:vynhert_log", VYNHERT_LOG, GENERAL);
		createBlockItem("deep_trenches:vynhert_o_lantern", VYNHERT_O_LANTERN, GENERAL);
		createBlockItem("deep_trenches:vynhert_planks", VYNHERT_PLANKS, GENERAL);
		createBlockItem("deep_trenches:vynhert_pressure_plate", VYNHERT_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:vynhert_sapling", VYNHERT_SAPLING, GENERAL);
		createSignItem("deep_trenches:vynhert_sign", VYNHERT_SIGN, VYNHERT_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:vynhert_slab", VYNHERT_SLAB, GENERAL);
		createBlockItem("deep_trenches:vynhert_stairs", VYNHERT_STAIRS, GENERAL);
		createBlockItem("deep_trenches:vynhert_tentacles", VYNHERT_TENTACLES, GENERAL);
		createBlockItem("deep_trenches:vynhert_thorns", VYNHERT_THORNS, GENERAL);
		createBlockItem("deep_trenches:vynhert_trapdoor", VYNHERT_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:vynhert_wood", VYNHERT_WOOD, GENERAL);

		createBlockItem("deep_trenches:wart_tree_button", WART_TREE_BUTTON, GENERAL);
		createBlockItem("deep_trenches:wart_tree_door", WART_TREE_DOOR, GENERAL);
		createBlockItem("deep_trenches:wart_tree_fence", WART_TREE_FENCE, GENERAL);
		createBlockItem("deep_trenches:wart_tree_fence_gate", WART_TREE_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:wart_tree_warts", WART_TREE_WARTS, GENERAL);
		createBlockItem("deep_trenches:wart_tree_log", WART_TREE_LOG, GENERAL);
		createBlockItem("deep_trenches:wart_tree_planks", WART_TREE_PLANKS, GENERAL);
		createBlockItem("deep_trenches:wart_tree_pressure_plate", WART_TREE_PRESSURE_PLATE, GENERAL);
		createSignItem("deep_trenches:wart_tree_sign", WART_TREE_SIGN, WART_TREE_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:wart_tree_slab", WART_TREE_SLAB, GENERAL);
		createBlockItem("deep_trenches:wart_tree_stairs", WART_TREE_STAIRS, GENERAL);
		createBlockItem("deep_trenches:wart_tree_trapdoor", WART_TREE_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:wart_tree_wood", WART_TREE_WOOD, GENERAL);

		createBlockItem("deep_trenches:wenge_button", WENGE_BUTTON, GENERAL);
		createBlockItem("deep_trenches:wenge_door", WENGE_DOOR, GENERAL);
		createBlockItem("deep_trenches:wenge_fence", WENGE_FENCE, GENERAL);
		createBlockItem("deep_trenches:wenge_fence_gate", WENGE_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:wenge_leaves", WENGE_LEAVES, GENERAL);
		createBlockItem("deep_trenches:wenge_log", WENGE_LOG, GENERAL);
		createBlockItem("deep_trenches:wenge_planks", WENGE_PLANKS, GENERAL);
		createBlockItem("deep_trenches:wenge_pressure_plate", WENGE_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:wenge_sapling", WENGE_SAPLING, GENERAL);
		createSignItem("deep_trenches:wenge_sign", WENGE_SIGN, WENGE_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:wenge_slab", WENGE_SLAB, GENERAL);
		createBlockItem("deep_trenches:wenge_stairs", WENGE_STAIRS, GENERAL);
		createBlockItem("deep_trenches:wenge_trapdoor", WENGE_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:wenge_wood", WENGE_WOOD, GENERAL);

		createBlockItem("deep_trenches:yew_button", YEW_BUTTON, GENERAL);
		createBlockItem("deep_trenches:yew_door", YEW_DOOR, GENERAL);
		createBlockItem("deep_trenches:yew_fence", YEW_FENCE, GENERAL);
		createBlockItem("deep_trenches:yew_fence_gate", YEW_FENCE_GATE, GENERAL);
		createBlockItem("deep_trenches:yew_leaves", YEW_LEAVES, GENERAL);
		createBlockItem("deep_trenches:yew_log", YEW_LOG, GENERAL);
		createBlockItem("deep_trenches:yew_planks", YEW_PLANKS, GENERAL);
		createBlockItem("deep_trenches:yew_pressure_plate", YEW_PRESSURE_PLATE, GENERAL);
		createBlockItem("deep_trenches:yew_sapling", YEW_SAPLING, GENERAL);
		createSignItem("deep_trenches:yew_sign", YEW_SIGN, YEW_WALL_SIGN, GENERAL);
		createBlockItem("deep_trenches:yew_slab", YEW_SLAB, GENERAL);
		createBlockItem("deep_trenches:yew_stairs", YEW_STAIRS, GENERAL);
		createBlockItem("deep_trenches:yew_trapdoor", YEW_TRAPDOOR, GENERAL);
		createBlockItem("deep_trenches:yew_wood", YEW_WOOD, GENERAL);

		createBlockItem("deep_trenches:giant_violet", GIANT_VIOLET, GENERAL);
		createBlockItem("deep_trenches:giant_violet_leaf", GIANT_VIOLET_LEAF, GENERAL);
		createBlockItem("deep_trenches:giant_violet_petal", GIANT_VIOLET_PETAL, GENERAL);
		createBlockItem("deep_trenches:giant_violet_pistil", GIANT_VIOLET_PISTIL, GENERAL);

		createBlockItem("deep_trenches:cyan_bioluminescent_block", CYAN_BIOLUMINESCENT_BLOCK, GENERAL);
		createBlockItem("deep_trenches:green_bioluminescent_block", GREEN_BIOLUMINESCENT_BLOCK, GENERAL);
		createBlockItem("deep_trenches:light_blue_bioluminescent_block", LIGHT_BLUE_BIOLUMINESCENT_BLOCK, GENERAL);

		createBlockItem("deep_trenches:enrotium", ENROTIUM, GENERAL);
		createBlockItem("deep_trenches:verdine", VERDINE, GENERAL);

		createBlockItem("deep_trenches:dritean", DRITEAN, GENERAL);
		createBlockItem("deep_trenches:gyldelion_block", GYLDELION_BLOCK, GENERAL);
		createBlockItem("deep_trenches:mosoil", MOSOIL, GENERAL);
		createBlockItem("deep_trenches:black_lily", BLACK_LILY, GENERAL);
		createBlockItem("deep_trenches:black_pansy", BLACK_PANSY, GENERAL);
		createBlockItem("deep_trenches:blue_pansy", BLUE_PANSY, GENERAL);
		createBlockItem("deep_trenches:blue_poppy", BLUE_POPPY, GENERAL);
		createBlockItem("deep_trenches:blue_violet", BLUE_VIOLET, GENERAL);
		createBlockItem("deep_trenches:bonnet_spurge", BONNET_SPURGE, GENERAL);
		createBlockItem("deep_trenches:brown_pansy", BROWN_PANSY, GENERAL);
		createBlockItem("deep_trenches:bullthorn", BULLTHORN, GENERAL);
		createBlockItem("deep_trenches:cactlow", CACTLOW, GENERAL);
		createBlockItem("deep_trenches:chocolate_cosmos_flower", CHOCOLATE_COSMOS_FLOWER, GENERAL);
		createBlockItem("deep_trenches:clawbulb", CLAWBULB, GENERAL);
		createBlockItem("deep_trenches:cyan_blue_violet", CYAN_BLUE_VIOLET, GENERAL);
		createBlockItem("deep_trenches:cycawler", CYCAWLER, GENERAL);
		createBlockItem("deep_trenches:garden_pinks", GARDEN_PINKS, GENERAL);
		createBlockItem("deep_trenches:green_pansy", GREEN_PANSY, GENERAL);
		createBlockItem("deep_trenches:gyldelion_flower", GYLDELION_FLOWER, GENERAL);
		createBlockItem("deep_trenches:lime_spurge", LIME_SPURGE, GENERAL);
		createBlockItem("deep_trenches:lupin_flower", LUPIN_FLOWER, GENERAL);
		createBlockItem("deep_trenches:marsh_violet", MARSH_VIOLET, GENERAL);
		createBlockItem("deep_trenches:murkstem", MURKSTEM, GENERAL);
		createBlockItem("deep_trenches:native_violet", NATIVE_VIOLET, GENERAL);
		createBlockItem("deep_trenches:opium_poppy", OPIUM_POPPY, GENERAL);
		createBlockItem("deep_trenches:orange_lily", ORANGE_LILY, GENERAL);
		createBlockItem("deep_trenches:pigal", PIGAL, GENERAL);
		createBlockItem("deep_trenches:pink_and_orange_pansy", PINK_AND_ORANGE_PANSY, GENERAL);
		createBlockItem("deep_trenches:pink_braitor_flower", PINK_BRAITOR_FLOWER, GENERAL);
		createBlockItem("deep_trenches:pink_marsh_violet", PINK_MARSH_VIOLET, GENERAL);
		createBlockItem("deep_trenches:pink_rose", PINK_ROSE, GENERAL);
		createBlockItem("deep_trenches:pink_rose_bush", PINK_ROSE_BUSH, GENERAL);
		createBlockItem("deep_trenches:poppy", ModBlocks.POPPY, GENERAL);
		createBlockItem("deep_trenches:purple_and_orange_pansy", PURPLE_AND_ORANGE_PANSY, GENERAL);
		createBlockItem("deep_trenches:purpround", PURPROUND, GENERAL);
		createBlockItem("deep_trenches:red_braitor_flower", RED_BRAITOR_FLOWER, GENERAL);
		createBlockItem("deep_trenches:red_chocolate_cosmos_flower", RED_CHOCOLATE_COSMOS_FLOWER, GENERAL);
		createBlockItem("deep_trenches:red_pansy", RED_PANSY, GENERAL);
		createBlockItem("deep_trenches:red_rose", RED_ROSE, GENERAL);
		createBlockItem("deep_trenches:rubra_blue_violet", RUBRA_BLUE_VIOLET, GENERAL);
		createBlockItem("deep_trenches:skalk", SKALK, GENERAL);
		createBlockItem("deep_trenches:spidreet", SPIDREET, GENERAL);
		createBlockItem("deep_trenches:spike_lavender", SPIKE_LAVENDER, GENERAL);
		createBlockItem("deep_trenches:spridelion", SPRIDELION, GENERAL);
		createBlockItem("deep_trenches:sprinly", SPRINLY, GENERAL);
		createBlockItem("deep_trenches:squisacle", SQUISACLE, GENERAL);
		createBlockItem("deep_trenches:sweet_violet", SWEET_VIOLET, GENERAL);
		createBlockItem("deep_trenches:topped_lavender", TOPPED_LAVENDER, GENERAL);
		createBlockItem("deep_trenches:vaslame", VASLAME, GENERAL);
		createBlockItem("deep_trenches:velvet_lily", VELVET_LILY, GENERAL);
		createBlockItem("deep_trenches:weepistil", WEEPISTIL, GENERAL);
		createBlockItem("deep_trenches:weepy_hollower", WEEPY_HOLLOWER, GENERAL);
		createBlockItem("deep_trenches:white_violet", WHITE_VIOLET, GENERAL);
		createBlockItem("deep_trenches:wild_pansy", WILD_PANSY, GENERAL);
		createBlockItem("deep_trenches:yellow_violet", YELLOW_VIOLET, GENERAL);

		createBlockItem("deep_trenches:airial_bush", AIRIAL_BUSH, GENERAL);
		createBlockItem("deep_trenches:harshles", HARSHLES, GENERAL);
		createBlockItem("deep_trenches:reebloon", REEBLOON, GENERAL);
		createBlockItem("deep_trenches:squish_tips", SQUISH_TIPS, GENERAL);
		createBlockItem("deep_trenches:sproom_spike", SPROOM_SPIKE, GENERAL);

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
		STASP_SPAWN_EGG = createSpawnEgg("deep_trenches:stasp_spawn_egg", EntityTypes.STASP, 2695792, 5124510);

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
