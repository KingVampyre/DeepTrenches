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

import static github.KingVampyre.DeepTrenches.core.init.DTItemGroups.*;
import static github.KingVampyre.DeepTrenches.core.init.DTBlocks.*;
import static github.KingVampyre.DeepTrenches.core.init.DTFoodComponents.STORCEAN_FISH;
import static net.minecraft.fluid.Fluids.WATER;
import static net.minecraft.item.FoodComponents.APPLE;
import static net.minecraft.item.FoodComponents.SWEET_BERRIES;
import static net.minecraft.item.Item.BLOCK_ITEMS;
import static net.minecraft.item.Items.BUCKET;
import static net.minecraft.util.registry.Registry.ITEM;

public class DTItems {

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

	/* ------------- GOO's --------------------- */
	public static final Item CYAN_BIOLUMINESCENT_GOO;
	public static final Item GREEN_BIOLUMINESCENT_GOO;
	public static final Item LIGHT_BLUE_BIOLUMINESCENT_GOO;

	/* ------------- WEAPONS ----------- */
	public static final Item ADAIGGER;
	public static final Item BORON_TROOKENT;
	public static final Item RUBY_DISTABBER;
	public static final Item MORGANITE_SABER;
	public static final Item SAPPHIRE_PRISMACE;

	public static final Item BORON_SWORD;
	public static final Item CHALCEDONY_SWORD;
	public static final Item ENSTATITE_SWORD;
	public static final Item KRALCTIUM_SWORD;
	public static final Item SAPPHIRE_SWORD;
	public static final Item SPHENE_SWORD;
	public static final Item SPINEL_SWORD;
	public static final Item STROXITE_SWORD;
	public static final Item TANZANITE_SWORD;
	public static final Item TOPAZ_SWORD;

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

	/* ------------- TOOLS ----------- */
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

	/* ------------- ARMOR --------------------- */
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

	/* ------------- TALISMANS --------------------- */
	public static final Item AQUAMARINE_TALISMAN;
	public static final Item SPHENE_TALISMAN;
	public static final Item TANZANITE_TALISMAN;

	/* ------------- JEWELRY --------------------- */
	public static final Item BLACK_PEARL;

	/* ------------- ORES --------------------- */
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

	/* ------------ INGOTS ------------- */
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

	/* ------------ NUGGETS ------------- */
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

	/* ------------ POWDERS ------------- */
	public static final Item URANIUM_POWDER;
	public static final Item URANOLUMEN_POWDER;

	/* --------------- DYES --------------- */
	public static final Item GYLDELION_DYE;

	/* ------------ MOB DROPS -------------- */
	public static final Item LOOSEJAW_TOOTH;

	/* ------------ BLOCK ITEMS -------------- */
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
		return register(id, new FabricBoatItem(DTEntityTypes.BOAT, type, new Item.Settings().maxCount(1).group(WOODS)));
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
		register(id, new SignItem(new Settings().maxCount(16).group(WOODS), standingBlock, block));
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
		createBlockItem("deep_trenches:dead_blackgreen_tree_coral", DEAD_BLACKGREEN_TREE_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_broccoli_coral", DEAD_BROCCOLI_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_bubblegum_coral", DEAD_BUBBLEGUM_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_cabbage_tree_coral", DEAD_CABBAGE_TREE_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_flowertube_coral", DEAD_FLOWERTUBE_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_garnet_spiral_coral", DEAD_GARNET_SPIRAL_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_glow_forest_coral", DEAD_GLOW_FOREST_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_glowtongue_tube_coral", DEAD_GLOWTONGUE_TUBE_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_ivory_coral", DEAD_IVORY_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_lime_brain_coral", DEAD_LIME_BRAIN_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_lophelia_coral", DEAD_LOPHELIA_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_pipe_organ_coral", DEAD_PIPE_ORGAN_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_pipe_organ_tentacles", DEAD_PIPE_ORGAN_TENTACLES, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_red_tree_coral", DEAD_RED_TREE_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_seafan_coral", DEAD_SEAFAN_CORAL, SEA_BLOCKS);
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
		createBlockItem("deep_trenches:dead_lime_brain_coral_block", DEAD_LIME_BRAIN_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_lophelia_coral_block", DEAD_LOPHELIA_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_pipe_organ_coral_block", DEAD_PIPE_ORGAN_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_red_tree_coral_block", DEAD_RED_TREE_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:dead_seafan_coral_block", DEAD_SEAFAN_CORAL_BLOCK, SEA_BLOCKS);
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
		createCoralFan("deep_trenches:dead_lime_brain_coral_fan", DEAD_LIME_BRAIN_CORAL_FAN, DEAD_LIME_BRAIN_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:dead_lophelia_coral_fan", DEAD_LOPHELIA_CORAL_FAN, DEAD_LOPHELIA_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:dead_pipe_organ_coral_fan", DEAD_PIPE_ORGAN_CORAL_FAN, DEAD_PIPE_ORGAN_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:dead_red_tree_coral_fan", DEAD_RED_TREE_CORAL_FAN, DEAD_RED_TREE_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:dead_seafan_coral_fan", DEAD_SEAFAN_CORAL_FAN, DEAD_SEAFAN_CORAL_WALL_FAN);
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
		createBlockItem("deep_trenches:lime_brain_coral", LIME_BRAIN_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:lophelia_coral", LOPHELIA_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:pipe_organ_coral", PIPE_ORGAN_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:pipe_organ_tentacles", PIPE_ORGAN_TENTACLES, SEA_BLOCKS);
		createBlockItem("deep_trenches:red_tree_coral", RED_TREE_CORAL, SEA_BLOCKS);
		createBlockItem("deep_trenches:seafan_coral", SEAFAN_CORAL, SEA_BLOCKS);
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
		createBlockItem("deep_trenches:lime_brain_coral_block", LIME_BRAIN_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:lophelia_coral_block", LOPHELIA_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:pipe_organ_coral_block", PIPE_ORGAN_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:red_tree_coral_block", RED_TREE_CORAL_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:seafan_coral_block", SEAFAN_CORAL_BLOCK, SEA_BLOCKS);
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
		createCoralFan("deep_trenches:lime_brain_coral_fan", LIME_BRAIN_CORAL_FAN, LIME_BRAIN_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:lophelia_coral_fan", LOPHELIA_CORAL_FAN, LOPHELIA_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:pipe_organ_coral_fan", PIPE_ORGAN_CORAL_FAN, PIPE_ORGAN_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:red_tree_coral_fan", RED_TREE_CORAL_FAN, RED_TREE_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:seafan_coral_fan", SEAFAN_CORAL_FAN, SEAFAN_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:straight_willow_coral_fan", STRAIGHT_WILLOW_CORAL_FAN, STRAIGHT_WILLOW_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:sunrise_coral_fan", SUNRISE_CORAL_FAN, SUNRISE_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:table_coral_fan", TABLE_CORAL_FAN, TABLE_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:thin_blade_coral_fan", THIN_BLADE_CORAL_FAN, THIN_BLADE_CORAL_WALL_FAN);
		createCoralFan("deep_trenches:trumpetear_coral_fan", TRUMPETEAR_CORAL_FAN, TRUMPETEAR_CORAL_WALL_FAN);

		createBlockItem("deep_trenches:andesite_aquamarine_ore", ANDESITE_AQUAMARINE_ORE, MISC);
		createBlockItem("deep_trenches:andesite_black_opal_ore", ANDESITE_BLACK_OPAL_ORE, MISC);
		createBlockItem("deep_trenches:andesite_chalcedony_ore", ANDESITE_CHALCEDONY_ORE, MISC);
		createBlockItem("deep_trenches:andesite_clinohumite_ore", ANDESITE_CLINOHUMITE_ORE, MISC);
		createBlockItem("deep_trenches:andesite_coal_ore", ANDESITE_COAL_ORE, MISC);
		createBlockItem("deep_trenches:andesite_copper_ore", ANDESITE_COPPER_ORE, MISC);
		createBlockItem("deep_trenches:andesite_diamond_ore", ANDESITE_DIAMOND_ORE, MISC);
		createBlockItem("deep_trenches:andesite_emerald_ore", ANDESITE_EMERALD_ORE, MISC);
		createBlockItem("deep_trenches:andesite_gold_ore", ANDESITE_GOLD_ORE, MISC);
		createBlockItem("deep_trenches:andesite_iron_ore", ANDESITE_IRON_ORE, MISC);
		createBlockItem("deep_trenches:andesite_lapis_ore", ANDESITE_LAPIS_ORE, MISC);
		createBlockItem("deep_trenches:andesite_morganite_ore", ANDESITE_MORGANITE_ORE, MISC);
		createBlockItem("deep_trenches:andesite_redstone_ore", ANDESITE_REDSTONE_ORE, MISC);
		createBlockItem("deep_trenches:andesite_ruby_ore", ANDESITE_RUBY_ORE, MISC);
		createBlockItem("deep_trenches:andesite_silver_ore", ANDESITE_SILVER_ORE, MISC);
		createBlockItem("deep_trenches:andesite_sphene_ore", ANDESITE_SPHENE_ORE, MISC);
		createBlockItem("deep_trenches:andesite_spinel_ore", ANDESITE_SPINEL_ORE, MISC);
		createBlockItem("deep_trenches:andesite_tanzanite_ore", ANDESITE_TANZANITE_ORE, MISC);

		createBlockItem("deep_trenches:black_basalt_aquamarine_ore", BLACK_BASALT_AQUAMARINE_ORE, MISC);
		createBlockItem("deep_trenches:black_basalt_black_opal_ore", BLACK_BASALT_BLACK_OPAL_ORE, MISC);
		createBlockItem("deep_trenches:black_basalt_chalcedony_ore", BLACK_BASALT_CHALCEDONY_ORE, MISC);
		createBlockItem("deep_trenches:black_basalt_clinohumite_ore", BLACK_BASALT_CLINOHUMITE_ORE, MISC);
		createBlockItem("deep_trenches:black_basalt_coal_ore", BLACK_BASALT_COAL_ORE, MISC);
		createBlockItem("deep_trenches:black_basalt_copper_ore", BLACK_BASALT_COPPER_ORE, MISC);
		createBlockItem("deep_trenches:black_basalt_diamond_ore", BLACK_BASALT_DIAMOND_ORE, MISC);
		createBlockItem("deep_trenches:black_basalt_emerald_ore", BLACK_BASALT_EMERALD_ORE, MISC);
		createBlockItem("deep_trenches:black_basalt_gold_ore", BLACK_BASALT_GOLD_ORE, MISC);
		createBlockItem("deep_trenches:black_basalt_iron_ore", BLACK_BASALT_IRON_ORE, MISC);
		createBlockItem("deep_trenches:black_basalt_lapis_ore", BLACK_BASALT_LAPIS_ORE, MISC);
		createBlockItem("deep_trenches:black_basalt_morganite_ore", BLACK_BASALT_MORGANITE_ORE, MISC);
		createBlockItem("deep_trenches:black_basalt_redstone_ore", BLACK_BASALT_REDSTONE_ORE, MISC);
		createBlockItem("deep_trenches:black_basalt_ruby_ore", BLACK_BASALT_RUBY_ORE, MISC);
		createBlockItem("deep_trenches:black_basalt_silver_ore", BLACK_BASALT_SILVER_ORE, MISC);
		createBlockItem("deep_trenches:black_basalt_sphene_ore", BLACK_BASALT_SPHENE_ORE, MISC);
		createBlockItem("deep_trenches:black_basalt_spinel_ore", BLACK_BASALT_SPINEL_ORE, MISC);
		createBlockItem("deep_trenches:black_basalt_tanzanite_ore", BLACK_BASALT_TANZANITE_ORE, MISC);

		createBlockItem("deep_trenches:blue_storcerack_aquamarine_ore", BLUE_STORCERACK_AQUAMARINE_ORE, MISC);
		createBlockItem("deep_trenches:blue_storcerack_black_opal_ore", BLUE_STORCERACK_BLACK_OPAL_ORE, MISC);
		createBlockItem("deep_trenches:blue_storcerack_chalcedony_ore", BLUE_STORCERACK_CHALCEDONY_ORE, MISC);
		createBlockItem("deep_trenches:blue_storcerack_coal_ore", BLUE_STORCERACK_COAL_ORE, MISC);
		createBlockItem("deep_trenches:blue_storcerack_copper_ore", BLUE_STORCERACK_COPPER_ORE, MISC);
		createBlockItem("deep_trenches:blue_storcerack_diamond_ore", BLUE_STORCERACK_DIAMOND_ORE, MISC);
		createBlockItem("deep_trenches:blue_storcerack_emerald_ore", BLUE_STORCERACK_EMERALD_ORE, MISC);
		createBlockItem("deep_trenches:blue_storcerack_gold_ore", BLUE_STORCERACK_GOLD_ORE, MISC);
		createBlockItem("deep_trenches:blue_storcerack_iron_ore", BLUE_STORCERACK_IRON_ORE, MISC);
		createBlockItem("deep_trenches:blue_storcerack_lapis_ore", BLUE_STORCERACK_LAPIS_ORE, MISC);
		createBlockItem("deep_trenches:blue_storcerack_morganite_ore", BLUE_STORCERACK_MORGANITE_ORE, MISC);
		createBlockItem("deep_trenches:blue_storcerack_redstone_ore", BLUE_STORCERACK_REDSTONE_ORE, MISC);
		createBlockItem("deep_trenches:blue_storcerack_ruby_ore", BLUE_STORCERACK_RUBY_ORE, MISC);
		createBlockItem("deep_trenches:blue_storcerack_silver_ore", BLUE_STORCERACK_SILVER_ORE, MISC);
		createBlockItem("deep_trenches:blue_storcerack_sphene_ore", BLUE_STORCERACK_SPHENE_ORE, MISC);
		createBlockItem("deep_trenches:blue_storcerack_spinel_ore", BLUE_STORCERACK_SPINEL_ORE, MISC);
		createBlockItem("deep_trenches:blue_storcerack_tanzanite_ore", BLUE_STORCERACK_TANZANITE_ORE, MISC);

		createBlockItem("deep_trenches:diorite_aquamarine_ore", DIORITE_AQUAMARINE_ORE, MISC);
		createBlockItem("deep_trenches:diorite_black_opal_ore", DIORITE_BLACK_OPAL_ORE, MISC);
		createBlockItem("deep_trenches:diorite_chalcedony_ore", DIORITE_CHALCEDONY_ORE, MISC);
		createBlockItem("deep_trenches:diorite_clinohumite_ore", DIORITE_CLINOHUMITE_ORE, MISC);
		createBlockItem("deep_trenches:diorite_coal_ore", DIORITE_COAL_ORE, MISC);
		createBlockItem("deep_trenches:diorite_copper_ore", DIORITE_COPPER_ORE, MISC);
		createBlockItem("deep_trenches:diorite_diamond_ore", DIORITE_DIAMOND_ORE, MISC);
		createBlockItem("deep_trenches:diorite_emerald_ore", DIORITE_EMERALD_ORE, MISC);
		createBlockItem("deep_trenches:diorite_gold_ore", DIORITE_GOLD_ORE, MISC);
		createBlockItem("deep_trenches:diorite_iron_ore", DIORITE_IRON_ORE, MISC);
		createBlockItem("deep_trenches:diorite_lapis_ore", DIORITE_LAPIS_ORE, MISC);
		createBlockItem("deep_trenches:diorite_morganite_ore", DIORITE_MORGANITE_ORE, MISC);
		createBlockItem("deep_trenches:diorite_redstone_ore", DIORITE_REDSTONE_ORE, MISC);
		createBlockItem("deep_trenches:diorite_ruby_ore", DIORITE_RUBY_ORE, MISC);
		createBlockItem("deep_trenches:diorite_silver_ore", DIORITE_SILVER_ORE, MISC);
		createBlockItem("deep_trenches:diorite_sphene_ore", DIORITE_SPHENE_ORE, MISC);
		createBlockItem("deep_trenches:diorite_spinel_ore", DIORITE_SPINEL_ORE, MISC);
		createBlockItem("deep_trenches:diorite_tanzanite_ore", DIORITE_TANZANITE_ORE, MISC);

		createBlockItem("deep_trenches:granite_aquamarine_ore", GRANITE_AQUAMARINE_ORE, MISC);
		createBlockItem("deep_trenches:granite_black_opal_ore", GRANITE_BLACK_OPAL_ORE, MISC);
		createBlockItem("deep_trenches:granite_chalcedony_ore", GRANITE_CHALCEDONY_ORE, MISC);
		createBlockItem("deep_trenches:granite_clinohumite_ore", GRANITE_CLINOHUMITE_ORE, MISC);
		createBlockItem("deep_trenches:granite_coal_ore", GRANITE_COAL_ORE, MISC);
		createBlockItem("deep_trenches:granite_copper_ore", GRANITE_COPPER_ORE, MISC);
		createBlockItem("deep_trenches:granite_diamond_ore", GRANITE_DIAMOND_ORE, MISC);
		createBlockItem("deep_trenches:granite_emerald_ore", GRANITE_EMERALD_ORE, MISC);
		createBlockItem("deep_trenches:granite_gold_ore", GRANITE_GOLD_ORE, MISC);
		createBlockItem("deep_trenches:granite_iron_ore", GRANITE_IRON_ORE, MISC);
		createBlockItem("deep_trenches:granite_lapis_ore", GRANITE_LAPIS_ORE, MISC);
		createBlockItem("deep_trenches:granite_morganite_ore", GRANITE_MORGANITE_ORE, MISC);
		createBlockItem("deep_trenches:granite_redstone_ore", GRANITE_REDSTONE_ORE, MISC);
		createBlockItem("deep_trenches:granite_ruby_ore", GRANITE_RUBY_ORE, MISC);
		createBlockItem("deep_trenches:granite_silver_ore", GRANITE_SILVER_ORE, MISC);
		createBlockItem("deep_trenches:granite_sphene_ore", GRANITE_SPHENE_ORE, MISC);
		createBlockItem("deep_trenches:granite_spinel_ore", GRANITE_SPINEL_ORE, MISC);
		createBlockItem("deep_trenches:granite_tanzanite_ore", GRANITE_TANZANITE_ORE, MISC);

		createBlockItem("deep_trenches:limestone_aquamarine_ore", LIMESTONE_AQUAMARINE_ORE, MISC);
		createBlockItem("deep_trenches:limestone_black_opal_ore", LIMESTONE_BLACK_OPAL_ORE, MISC);
		createBlockItem("deep_trenches:limestone_chalcedony_ore", LIMESTONE_CHALCEDONY_ORE, MISC);
		createBlockItem("deep_trenches:limestone_coal_ore", LIMESTONE_COAL_ORE, MISC);
		createBlockItem("deep_trenches:limestone_copper_ore", LIMESTONE_COPPER_ORE, MISC);
		createBlockItem("deep_trenches:limestone_diamond_ore", LIMESTONE_DIAMOND_ORE, MISC);
		createBlockItem("deep_trenches:limestone_emerald_ore", LIMESTONE_EMERALD_ORE, MISC);
		createBlockItem("deep_trenches:limestone_gold_ore", LIMESTONE_GOLD_ORE, MISC);
		createBlockItem("deep_trenches:limestone_iron_ore", LIMESTONE_IRON_ORE, MISC);
		createBlockItem("deep_trenches:limestone_lapis_ore", LIMESTONE_LAPIS_ORE, MISC);
		createBlockItem("deep_trenches:limestone_morganite_ore", LIMESTONE_MORGANITE_ORE, MISC);
		createBlockItem("deep_trenches:limestone_redstone_ore", LIMESTONE_REDSTONE_ORE, MISC);
		createBlockItem("deep_trenches:limestone_ruby_ore", LIMESTONE_RUBY_ORE, MISC);
		createBlockItem("deep_trenches:limestone_silver_ore", LIMESTONE_SILVER_ORE, MISC);
		createBlockItem("deep_trenches:limestone_sphene_ore", LIMESTONE_SPHENE_ORE, MISC);
		createBlockItem("deep_trenches:limestone_spinel_ore", LIMESTONE_SPINEL_ORE, MISC);
		createBlockItem("deep_trenches:limestone_tanzanite_ore", LIMESTONE_TANZANITE_ORE, MISC);

		createBlockItem("deep_trenches:pinkine_aquamarine_ore", PINKINE_AQUAMARINE_ORE, MISC);
		createBlockItem("deep_trenches:pinkine_black_opal_ore", PINKINE_BLACK_OPAL_ORE, MISC);
		createBlockItem("deep_trenches:pinkine_chalcedony_ore", PINKINE_CHALCEDONY_ORE, MISC);
		createBlockItem("deep_trenches:pinkine_coal_ore", PINKINE_COAL_ORE, MISC);
		createBlockItem("deep_trenches:pinkine_copper_ore", PINKINE_COPPER_ORE, MISC);
		createBlockItem("deep_trenches:pinkine_diamond_ore", PINKINE_DIAMOND_ORE, MISC);
		createBlockItem("deep_trenches:pinkine_emerald_ore", PINKINE_EMERALD_ORE, MISC);
		createBlockItem("deep_trenches:pinkine_gold_ore", PINKINE_GOLD_ORE, MISC);
		createBlockItem("deep_trenches:pinkine_iron_ore", PINKINE_IRON_ORE, MISC);
		createBlockItem("deep_trenches:pinkine_lapis_ore", PINKINE_LAPIS_ORE, MISC);
		createBlockItem("deep_trenches:pinkine_morganite_ore", PINKINE_MORGANITE_ORE, MISC);
		createBlockItem("deep_trenches:pinkine_redstone_ore", PINKINE_REDSTONE_ORE, MISC);
		createBlockItem("deep_trenches:pinkine_ruby_ore", PINKINE_RUBY_ORE, MISC);
		createBlockItem("deep_trenches:pinkine_silver_ore", PINKINE_SILVER_ORE, MISC);
		createBlockItem("deep_trenches:pinkine_sphene_ore", PINKINE_SPHENE_ORE, MISC);
		createBlockItem("deep_trenches:pinkine_spinel_ore", PINKINE_SPINEL_ORE, MISC);
		createBlockItem("deep_trenches:pinkine_tanzanite_ore", PINKINE_TANZANITE_ORE, MISC);

		createBlockItem("deep_trenches:almond_button", ALMOND_BUTTON, WOODS);
		createBlockItem("deep_trenches:anameata_button", ANAMEATA_BUTTON, WOODS);
		createBlockItem("deep_trenches:angels_trumpet_button", ANGELS_TRUMPET_BUTTON, WOODS);
		createBlockItem("deep_trenches:aquean_button", AQUEAN_BUTTON, WOODS);
		createBlockItem("deep_trenches:barshrookle_button", BARSHROOKLE_BUTTON, WOODS);
		createBlockItem("deep_trenches:black_birch_button", BLACK_BIRCH_BUTTON, WOODS);
		createBlockItem("deep_trenches:blue_mahoe_button", BLUE_MAHOE_BUTTON, WOODS);
		createBlockItem("deep_trenches:blue_spruce_button", BLUE_SPRUCE_BUTTON, WOODS);
		createBlockItem("deep_trenches:bottlebrush_button", BOTTLEBRUSH_BUTTON, WOODS);
		createBlockItem("deep_trenches:bromya_button", BROMYA_BUTTON, WOODS);
		createBlockItem("deep_trenches:bubbletree_button", BUBBLETREE_BUTTON, WOODS);
		createBlockItem("deep_trenches:calcearb_button", CALCEARB_BUTTON, WOODS);
		createBlockItem("deep_trenches:cherry_button", CHERRY_BUTTON, WOODS);
		createBlockItem("deep_trenches:chotorn_button", CHOTORN_BUTTON, WOODS);
		createBlockItem("deep_trenches:cook_pine_button", COOK_PINE_BUTTON, WOODS);
		createBlockItem("deep_trenches:crolood_button", CROLOOD_BUTTON, WOODS);
		createBlockItem("deep_trenches:dark_crolood_button", DARK_CROLOOD_BUTTON, WOODS);
		createBlockItem("deep_trenches:dark_fuchsitra_button", DARK_FUCHSITRA_BUTTON, WOODS);
		createBlockItem("deep_trenches:dark_red_elm_button", DARK_RED_ELM_BUTTON, WOODS);
		createBlockItem("deep_trenches:dead_wart_tree_button", DEAD_WART_TREE_BUTTON, WOODS);
		createBlockItem("deep_trenches:drigyus_button", DRIGYUS_BUTTON, WOODS);
		createBlockItem("deep_trenches:ebony_button", EBONY_BUTTON, WOODS);
		createBlockItem("deep_trenches:enderheart_button", ENDERHEART_BUTTON, WOODS);
		createBlockItem("deep_trenches:flalm_button", FLALM_BUTTON, WOODS);
		createBlockItem("deep_trenches:fruce_button", FRUCE_BUTTON, WOODS);
		createBlockItem("deep_trenches:fuchsitra_button", FUCHSITRA_BUTTON, WOODS);
		createBlockItem("deep_trenches:fugmos_button", FUGMOS_BUTTON, WOODS);
		createBlockItem("deep_trenches:funeranite_button", FUNERANITE_BUTTON, WOODS);
		createBlockItem("deep_trenches:ghoshroom_button", GHOSHROOM_BUTTON, WOODS);
		createBlockItem("deep_trenches:giant_violet_button", GIANT_VIOLET_BUTTON, WOODS);
		createBlockItem("deep_trenches:guaiacum_button", GUAIACUM_BUTTON, WOODS);
		createBlockItem("deep_trenches:joshua_button", JOSHUA_BUTTON, WOODS);
		createBlockItem("deep_trenches:klinkii_pine_button", KLINKII_PINE_BUTTON, WOODS);
		createBlockItem("deep_trenches:melaleuca_button", MELALEUCA_BUTTON, WOODS);
		createBlockItem("deep_trenches:murkantuan_button", MURKANTUAN_BUTTON, WOODS);
		createBlockItem("deep_trenches:norfolk_pine_button", NORFOLK_PINE_BUTTON, WOODS);
		createBlockItem("deep_trenches:obscrus_button", OBSCRUS_BUTTON, WOODS);
		createBlockItem("deep_trenches:orhpris_button", ORHPRIS_BUTTON, WOODS);
		createBlockItem("deep_trenches:peltogyne_button", PELTOGYNE_BUTTON, WOODS);
		createBlockItem("deep_trenches:pin_cherry_button", PIN_CHERRY_BUTTON, WOODS);
		createBlockItem("deep_trenches:plum_button", PLUM_BUTTON, WOODS);
		createBlockItem("deep_trenches:purfunga_button", PURFUNGA_BUTTON, WOODS);
		createBlockItem("deep_trenches:rark_button", RARK_BUTTON, WOODS);
		createBlockItem("deep_trenches:red_elm_button", RED_ELM_BUTTON, WOODS);
		createBlockItem("deep_trenches:rhadi_button", RHADI_BUTTON, WOODS);
		createBlockItem("deep_trenches:sanguart_button", SANGUART_BUTTON, WOODS);
		createBlockItem("deep_trenches:scarlet_thiorcen_button", SCARLET_THIORCEN_BUTTON, WOODS);
		createBlockItem("deep_trenches:sproom_button", SPROOM_BUTTON, WOODS);
		createBlockItem("deep_trenches:sequoia_button", SEQUOIA_BUTTON, WOODS);
		createBlockItem("deep_trenches:stortreean_button", STORTREEAN_BUTTON, WOODS);
		createBlockItem("deep_trenches:stroomean_button", STROOMEAN_BUTTON, WOODS);
		createBlockItem("deep_trenches:sunrise_fungus_button", SUNRISE_FUNGUS_BUTTON, WOODS);
		createBlockItem("deep_trenches:tark_button", TARK_BUTTON, WOODS);
		createBlockItem("deep_trenches:teak_button", TEAK_BUTTON, WOODS);
		createBlockItem("deep_trenches:thundercloud_plum_button", THUNDERCLOUD_PLUM_BUTTON, WOODS);
		createBlockItem("deep_trenches:vynhert_button", VYNHERT_BUTTON, WOODS);
		createBlockItem("deep_trenches:wart_tree_button", WART_TREE_BUTTON, WOODS);
		createBlockItem("deep_trenches:wenge_button", WENGE_BUTTON, WOODS);
		createBlockItem("deep_trenches:yew_button", YEW_BUTTON, WOODS);

		createBlockItem("deep_trenches:anameata_cap", ANAMEATA_CAP, WOODS);
		createBlockItem("deep_trenches:barshrookle_cap", BARSHROOKLE_CAP, WOODS);
		createBlockItem("deep_trenches:funeranite_cap", FUNERANITE_CAP, WOODS);
		createBlockItem("deep_trenches:ghoshroom_cap", GHOSHROOM_CAP, WOODS);
		createBlockItem("deep_trenches:purfunga_cap", PURFUNGA_CAP, WOODS);
		createBlockItem("deep_trenches:stroomean_cap", STROOMEAN_CAP, WOODS);
		createBlockItem("deep_trenches:sunrise_fungus_cap", SUNRISE_FUNGUS_CAP, WOODS);

		createBlockItem("deep_trenches:almond_door", ALMOND_DOOR, WOODS);
		createBlockItem("deep_trenches:anameata_door", ANAMEATA_DOOR, WOODS);
		createBlockItem("deep_trenches:angels_trumpet_door", ANGELS_TRUMPET_DOOR, WOODS);
		createBlockItem("deep_trenches:aquean_door", AQUEAN_DOOR, WOODS);
		createBlockItem("deep_trenches:barshrookle_door", BARSHROOKLE_DOOR, WOODS);
		createBlockItem("deep_trenches:black_birch_door", BLACK_BIRCH_DOOR, WOODS);
		createBlockItem("deep_trenches:blue_mahoe_door", BLUE_MAHOE_DOOR, WOODS);
		createBlockItem("deep_trenches:blue_spruce_door", BLUE_SPRUCE_DOOR, WOODS);
		createBlockItem("deep_trenches:bottlebrush_door", BOTTLEBRUSH_DOOR, WOODS);
		createBlockItem("deep_trenches:bromya_door", BROMYA_DOOR, WOODS);
		createBlockItem("deep_trenches:bubbletree_door", BUBBLETREE_DOOR, WOODS);
		createBlockItem("deep_trenches:calcearb_door", CALCEARB_DOOR, WOODS);
		createBlockItem("deep_trenches:cherry_door", CHERRY_DOOR, WOODS);
		createBlockItem("deep_trenches:chotorn_door", CHOTORN_DOOR, WOODS);
		createBlockItem("deep_trenches:cook_pine_door", COOK_PINE_DOOR, WOODS);
		createBlockItem("deep_trenches:crolood_door", CROLOOD_DOOR, WOODS);
		createBlockItem("deep_trenches:dark_crolood_door", DARK_CROLOOD_DOOR, WOODS);
		createBlockItem("deep_trenches:dark_fuchsitra_door", DARK_FUCHSITRA_DOOR, WOODS);
		createBlockItem("deep_trenches:dark_red_elm_door", DARK_RED_ELM_DOOR, WOODS);
		createBlockItem("deep_trenches:dead_wart_tree_door", DEAD_WART_TREE_DOOR, WOODS);
		createBlockItem("deep_trenches:drigyus_door", DRIGYUS_DOOR, WOODS);
		createBlockItem("deep_trenches:ebony_door", EBONY_DOOR, WOODS);
		createBlockItem("deep_trenches:enderheart_door", ENDERHEART_DOOR, WOODS);
		createBlockItem("deep_trenches:flalm_door", FLALM_DOOR, WOODS);
		createBlockItem("deep_trenches:fruce_door", FRUCE_DOOR, WOODS);
		createBlockItem("deep_trenches:fuchsitra_door", FUCHSITRA_DOOR, WOODS);
		createBlockItem("deep_trenches:fugmos_door", FUGMOS_DOOR, WOODS);
		createBlockItem("deep_trenches:funeranite_door", FUNERANITE_DOOR, WOODS);
		createBlockItem("deep_trenches:ghoshroom_door", GHOSHROOM_DOOR, WOODS);
		createBlockItem("deep_trenches:giant_violet_door", GIANT_VIOLET_DOOR, WOODS);
		createBlockItem("deep_trenches:guaiacum_door", GUAIACUM_DOOR, WOODS);
		createBlockItem("deep_trenches:joshua_door", JOSHUA_DOOR, WOODS);
		createBlockItem("deep_trenches:klinkii_pine_door", KLINKII_PINE_DOOR, WOODS);
		createBlockItem("deep_trenches:melaleuca_door", MELALEUCA_DOOR, WOODS);
		createBlockItem("deep_trenches:murkantuan_door", MURKANTUAN_DOOR, WOODS);
		createBlockItem("deep_trenches:norfolk_pine_door", NORFOLK_PINE_DOOR, WOODS);
		createBlockItem("deep_trenches:obscrus_door", OBSCRUS_DOOR, WOODS);
		createBlockItem("deep_trenches:orhpris_door", ORHPRIS_DOOR, WOODS);
		createBlockItem("deep_trenches:peltogyne_door", PELTOGYNE_DOOR, WOODS);
		createBlockItem("deep_trenches:pin_cherry_door", PIN_CHERRY_DOOR, WOODS);
		createBlockItem("deep_trenches:plum_door", PLUM_DOOR, WOODS);
		createBlockItem("deep_trenches:purfunga_door", PURFUNGA_DOOR, WOODS);
		createBlockItem("deep_trenches:rark_door", RARK_DOOR, WOODS);
		createBlockItem("deep_trenches:red_elm_door", RED_ELM_DOOR, WOODS);
		createBlockItem("deep_trenches:rhadi_door", RHADI_DOOR, WOODS);
		createBlockItem("deep_trenches:sanguart_door", SANGUART_DOOR, WOODS);
		createBlockItem("deep_trenches:scarlet_thiorcen_door", SCARLET_THIORCEN_DOOR, WOODS);
		createBlockItem("deep_trenches:sproom_door", SPROOM_DOOR, WOODS);
		createBlockItem("deep_trenches:sequoia_door", SEQUOIA_DOOR, WOODS);
		createBlockItem("deep_trenches:stortreean_door", STORTREEAN_DOOR, WOODS);
		createBlockItem("deep_trenches:stroomean_door", STROOMEAN_DOOR, WOODS);
		createBlockItem("deep_trenches:sunrise_fungus_door", SUNRISE_FUNGUS_DOOR, WOODS);
		createBlockItem("deep_trenches:tark_door", TARK_DOOR, WOODS);
		createBlockItem("deep_trenches:teak_door", TEAK_DOOR, WOODS);
		createBlockItem("deep_trenches:thundercloud_plum_door", THUNDERCLOUD_PLUM_DOOR, WOODS);
		createBlockItem("deep_trenches:vynhert_door", VYNHERT_DOOR, WOODS);
		createBlockItem("deep_trenches:wart_tree_door", WART_TREE_DOOR, WOODS);
		createBlockItem("deep_trenches:wenge_door", WENGE_DOOR, WOODS);
		createBlockItem("deep_trenches:yew_door", YEW_DOOR, WOODS);

		createBlockItem("deep_trenches:almond_fence", ALMOND_FENCE, WOODS);
		createBlockItem("deep_trenches:anameata_fence", ANAMEATA_FENCE, WOODS);
		createBlockItem("deep_trenches:angels_trumpet_fence", ANGELS_TRUMPET_FENCE, WOODS);
		createBlockItem("deep_trenches:aquean_fence", AQUEAN_FENCE, WOODS);
		createBlockItem("deep_trenches:barshrookle_fence", BARSHROOKLE_FENCE, WOODS);
		createBlockItem("deep_trenches:black_birch_fence", BLACK_BIRCH_FENCE, WOODS);
		createBlockItem("deep_trenches:blue_mahoe_fence", BLUE_MAHOE_FENCE, WOODS);
		createBlockItem("deep_trenches:blue_spruce_fence", BLUE_SPRUCE_FENCE, WOODS);
		createBlockItem("deep_trenches:bottlebrush_fence", BOTTLEBRUSH_FENCE, WOODS);
		createBlockItem("deep_trenches:bromya_fence", BROMYA_FENCE, WOODS);
		createBlockItem("deep_trenches:bubbletree_fence", BUBBLETREE_FENCE, WOODS);
		createBlockItem("deep_trenches:calcearb_fence", CALCEARB_FENCE, WOODS);
		createBlockItem("deep_trenches:cherry_fence", CHERRY_FENCE, WOODS);
		createBlockItem("deep_trenches:chotorn_fence", CHOTORN_FENCE, WOODS);
		createBlockItem("deep_trenches:cook_pine_fence", COOK_PINE_FENCE, WOODS);
		createBlockItem("deep_trenches:crolood_fence", CROLOOD_FENCE, WOODS);
		createBlockItem("deep_trenches:dark_crolood_fence", DARK_CROLOOD_FENCE, WOODS);
		createBlockItem("deep_trenches:dark_fuchsitra_fence", DARK_FUCHSITRA_FENCE, WOODS);
		createBlockItem("deep_trenches:dark_red_elm_fence", DARK_RED_ELM_FENCE, WOODS);
		createBlockItem("deep_trenches:dead_wart_tree_fence", DEAD_WART_TREE_FENCE, WOODS);
		createBlockItem("deep_trenches:drigyus_fence", DRIGYUS_FENCE, WOODS);
		createBlockItem("deep_trenches:ebony_fence", EBONY_FENCE, WOODS);
		createBlockItem("deep_trenches:enderheart_fence", ENDERHEART_FENCE, WOODS);
		createBlockItem("deep_trenches:flalm_fence", FLALM_FENCE, WOODS);
		createBlockItem("deep_trenches:fruce_fence", FRUCE_FENCE, WOODS);
		createBlockItem("deep_trenches:fuchsitra_fence", FUCHSITRA_FENCE, WOODS);
		createBlockItem("deep_trenches:fugmos_fence", FUGMOS_FENCE, WOODS);
		createBlockItem("deep_trenches:funeranite_fence", FUNERANITE_FENCE, WOODS);
		createBlockItem("deep_trenches:ghoshroom_fence", GHOSHROOM_FENCE, WOODS);
		createBlockItem("deep_trenches:giant_violet_fence", GIANT_VIOLET_FENCE, WOODS);
		createBlockItem("deep_trenches:guaiacum_fence", GUAIACUM_FENCE, WOODS);
		createBlockItem("deep_trenches:joshua_fence", JOSHUA_FENCE, WOODS);
		createBlockItem("deep_trenches:klinkii_pine_fence", KLINKII_PINE_FENCE, WOODS);
		createBlockItem("deep_trenches:melaleuca_fence", MELALEUCA_FENCE, WOODS);
		createBlockItem("deep_trenches:murkantuan_fence", MURKANTUAN_FENCE, WOODS);
		createBlockItem("deep_trenches:norfolk_pine_fence", NORFOLK_PINE_FENCE, WOODS);
		createBlockItem("deep_trenches:obscrus_fence", OBSCRUS_FENCE, WOODS);
		createBlockItem("deep_trenches:orhpris_fence", ORHPRIS_FENCE, WOODS);
		createBlockItem("deep_trenches:peltogyne_fence", PELTOGYNE_FENCE, WOODS);
		createBlockItem("deep_trenches:pin_cherry_fence", PIN_CHERRY_FENCE, WOODS);
		createBlockItem("deep_trenches:plum_fence", PLUM_FENCE, WOODS);
		createBlockItem("deep_trenches:purfunga_fence", PURFUNGA_FENCE, WOODS);
		createBlockItem("deep_trenches:rark_fence", RARK_FENCE, WOODS);
		createBlockItem("deep_trenches:red_elm_fence", RED_ELM_FENCE, WOODS);
		createBlockItem("deep_trenches:rhadi_fence", RHADI_FENCE, WOODS);
		createBlockItem("deep_trenches:sanguart_fence", SANGUART_FENCE, WOODS);
		createBlockItem("deep_trenches:scarlet_thiorcen_fence", SCARLET_THIORCEN_FENCE, WOODS);
		createBlockItem("deep_trenches:sproom_fence", SPROOM_FENCE, WOODS);
		createBlockItem("deep_trenches:sequoia_fence", SEQUOIA_FENCE, WOODS);
		createBlockItem("deep_trenches:stortreean_fence", STORTREEAN_FENCE, WOODS);
		createBlockItem("deep_trenches:stroomean_fence", STROOMEAN_FENCE, WOODS);
		createBlockItem("deep_trenches:sunrise_fungus_fence", SUNRISE_FUNGUS_FENCE, WOODS);
		createBlockItem("deep_trenches:tark_fence", TARK_FENCE, WOODS);
		createBlockItem("deep_trenches:teak_fence", TEAK_FENCE, WOODS);
		createBlockItem("deep_trenches:thundercloud_plum_fence", THUNDERCLOUD_PLUM_FENCE, WOODS);
		createBlockItem("deep_trenches:vynhert_fence", VYNHERT_FENCE, WOODS);
		createBlockItem("deep_trenches:wart_tree_fence", WART_TREE_FENCE, WOODS);
		createBlockItem("deep_trenches:wenge_fence", WENGE_FENCE, WOODS);
		createBlockItem("deep_trenches:yew_fence", YEW_FENCE, WOODS);

		createBlockItem("deep_trenches:almond_fence_gate", ALMOND_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:anameata_fence_gate", ANAMEATA_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:angels_trumpet_fence_gate", ANGELS_TRUMPET_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:aquean_fence_gate", AQUEAN_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:barshrookle_fence_gate", BARSHROOKLE_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:black_birch_fence_gate", BLACK_BIRCH_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:blue_mahoe_fence_gate", BLUE_MAHOE_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:blue_spruce_fence_gate", BLUE_SPRUCE_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:bottlebrush_fence_gate", BOTTLEBRUSH_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:bromya_fence_gate", BROMYA_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:bubbletree_fence_gate", BUBBLETREE_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:calcearb_fence_gate", CALCEARB_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:cherry_fence_gate", CHERRY_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:chotorn_fence_gate", CHOTORN_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:cook_pine_fence_gate", COOK_PINE_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:crolood_fence_gate", CROLOOD_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:dark_crolood_fence_gate", DARK_CROLOOD_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:dark_fuchsitra_fence_gate", DARK_FUCHSITRA_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:dark_red_elm_fence_gate", DARK_RED_ELM_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:dead_wart_tree_fence_gate", DEAD_WART_TREE_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:drigyus_fence_gate", DRIGYUS_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:ebony_fence_gate", EBONY_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:enderheart_fence_gate", ENDERHEART_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:flalm_fence_gate", FLALM_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:fruce_fence_gate", FRUCE_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:fuchsitra_fence_gate", FUCHSITRA_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:fugmos_fence_gate", FUGMOS_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:funeranite_fence_gate", FUNERANITE_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:ghoshroom_fence_gate", GHOSHROOM_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:giant_violet_fence_gate", GIANT_VIOLET_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:guaiacum_fence_gate", GUAIACUM_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:joshua_fence_gate", JOSHUA_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:klinkii_pine_fence_gate", KLINKII_PINE_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:melaleuca_fence_gate", MELALEUCA_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:murkantuan_fence_gate", MURKANTUAN_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:norfolk_pine_fence_gate", NORFOLK_PINE_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:obscrus_fence_gate", OBSCRUS_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:orhpris_fence_gate", ORHPRIS_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:peltogyne_fence_gate", PELTOGYNE_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:pin_cherry_fence_gate", PIN_CHERRY_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:plum_fence_gate", PLUM_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:purfunga_fence_gate", PURFUNGA_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:rark_fence_gate", RARK_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:red_elm_fence_gate", RED_ELM_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:rhadi_fence_gate", RHADI_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:sanguart_fence_gate", SANGUART_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:scarlet_thiorcen_fence_gate", SCARLET_THIORCEN_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:sproom_fence_gate", SPROOM_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:sequoia_fence_gate", SEQUOIA_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:stortreean_fence_gate", STORTREEAN_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:stroomean_fence_gate", STROOMEAN_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:sunrise_fungus_fence_gate", SUNRISE_FUNGUS_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:tark_fence_gate", TARK_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:teak_fence_gate", TEAK_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:thundercloud_plum_fence_gate", THUNDERCLOUD_PLUM_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:vynhert_fence_gate", VYNHERT_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:wart_tree_fence_gate", WART_TREE_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:wenge_fence_gate", WENGE_FENCE_GATE, WOODS);
		createBlockItem("deep_trenches:yew_fence_gate", YEW_FENCE_GATE, WOODS);

		createBlockItem("deep_trenches:almond_leaves", ALMOND_LEAVES, WOODS);
		createBlockItem("deep_trenches:angels_trumpet_leaves", ANGELS_TRUMPET_LEAVES, WOODS);
		createBlockItem("deep_trenches:aquean_leaves", AQUEAN_LEAVES, WOODS);
		createBlockItem("deep_trenches:black_birch_leaves", BLACK_BIRCH_LEAVES, WOODS);
		createBlockItem("deep_trenches:blue_mahoe_leaves", BLUE_MAHOE_LEAVES, WOODS);
		createBlockItem("deep_trenches:blue_spruce_leaves", BLUE_SPRUCE_LEAVES, WOODS);
		createBlockItem("deep_trenches:bottlebrush_leaves", BOTTLEBRUSH_LEAVES, WOODS);
		createBlockItem("deep_trenches:bromya_leaves", BROMYA_LEAVES, WOODS);
		createBlockItem("deep_trenches:calcearb_leaves", CALCEARB_LEAVES, WOODS);
		createBlockItem("deep_trenches:cherry_leaves", CHERRY_LEAVES, WOODS);
		createBlockItem("deep_trenches:cook_pine_leaves", COOK_PINE_LEAVES, WOODS);
		createBlockItem("deep_trenches:crolood_leaves", CROLOOD_LEAVES, WOODS);
		createBlockItem("deep_trenches:dark_crolood_leaves", DARK_CROLOOD_LEAVES, WOODS);
		createBlockItem("deep_trenches:dark_fuchsitra_leaves", DARK_FUCHSITRA_LEAVES, WOODS);
		createBlockItem("deep_trenches:dark_red_elm_leaves", DARK_RED_ELM_LEAVES, WOODS);
		createBlockItem("deep_trenches:ebony_leaves", EBONY_LEAVES, WOODS);
		createBlockItem("deep_trenches:enderheart_leaves", ENDERHEART_LEAVES, WOODS);
		createBlockItem("deep_trenches:fruce_leaves", FRUCE_LEAVES, WOODS);
		createBlockItem("deep_trenches:fuchsitra_leaves", FUCHSITRA_LEAVES, WOODS);
		createBlockItem("deep_trenches:guaiacum_leaves", GUAIACUM_LEAVES, WOODS);
		createBlockItem("deep_trenches:joshua_leaves", JOSHUA_LEAVES, WOODS);
		createBlockItem("deep_trenches:klinkii_pine_leaves", KLINKII_PINE_LEAVES, WOODS);
		createBlockItem("deep_trenches:melaleuca_leaves", MELALEUCA_LEAVES, WOODS);
		createBlockItem("deep_trenches:murkantuan_leaves", MURKANTUAN_LEAVES, WOODS);
		createBlockItem("deep_trenches:norfolk_pine_leaves", NORFOLK_PINE_LEAVES, WOODS);
		createBlockItem("deep_trenches:obscrus_leaves", OBSCRUS_LEAVES, WOODS);
		createBlockItem("deep_trenches:orhpris_leaves", ORHPRIS_LEAVES, WOODS);
		createBlockItem("deep_trenches:peltogyne_leaves", PELTOGYNE_LEAVES, WOODS);
		createBlockItem("deep_trenches:pin_cherry_leaves", PIN_CHERRY_LEAVES, WOODS);
		createBlockItem("deep_trenches:plum_leaves", PLUM_LEAVES, WOODS);
		createBlockItem("deep_trenches:rark_leaves", RARK_LEAVES, WOODS);
		createBlockItem("deep_trenches:red_elm_leaves", RED_ELM_LEAVES, WOODS);
		createBlockItem("deep_trenches:rhadi_leaves", RHADI_LEAVES, WOODS);
		createBlockItem("deep_trenches:sanguart_leaves", SANGUART_LEAVES, WOODS);
		createBlockItem("deep_trenches:sproom_leaves", SPROOM_LEAVES, WOODS);
		createBlockItem("deep_trenches:sequoia_leaves", SEQUOIA_LEAVES, WOODS);
		createBlockItem("deep_trenches:stortreean_leaves", STORTREEAN_LEAVES, WOODS);
		createBlockItem("deep_trenches:tark_leaves", TARK_LEAVES, WOODS);
		createBlockItem("deep_trenches:teak_leaves", TEAK_LEAVES, WOODS);
		createBlockItem("deep_trenches:thundercloud_plum_leaves", THUNDERCLOUD_PLUM_LEAVES, WOODS);
		createBlockItem("deep_trenches:wenge_leaves", WENGE_LEAVES, WOODS);
		createBlockItem("deep_trenches:yew_leaves", YEW_LEAVES, WOODS);

		createBlockItem("deep_trenches:almond_log", ALMOND_LOG, WOODS);
		createBlockItem("deep_trenches:anameata_log", ANAMEATA_LOG, WOODS);
		createBlockItem("deep_trenches:angels_trumpet_log", ANGELS_TRUMPET_LOG, WOODS);
		createBlockItem("deep_trenches:aquean_log", AQUEAN_LOG, WOODS);
		createBlockItem("deep_trenches:barshrookle_log", BARSHROOKLE_LOG, WOODS);
		createBlockItem("deep_trenches:black_birch_log", BLACK_BIRCH_LOG, WOODS);
		createBlockItem("deep_trenches:blue_mahoe_log", BLUE_MAHOE_LOG, WOODS);
		createBlockItem("deep_trenches:blue_spruce_log", BLUE_SPRUCE_LOG, WOODS);
		createBlockItem("deep_trenches:bottlebrush_log", BOTTLEBRUSH_LOG, WOODS);
		createBlockItem("deep_trenches:bromya_log", BROMYA_LOG, WOODS);
		createBlockItem("deep_trenches:bubbletree_log", BUBBLETREE_LOG, WOODS);
		createBlockItem("deep_trenches:calcearb_log", CALCEARB_LOG, WOODS);
		createBlockItem("deep_trenches:cherry_log", CHERRY_LOG, WOODS);
		createBlockItem("deep_trenches:chotorn_log", CHOTORN_LOG, WOODS);
		createBlockItem("deep_trenches:cook_pine_log", COOK_PINE_LOG, WOODS);
		createBlockItem("deep_trenches:crolood_log", CROLOOD_LOG, WOODS);
		createBlockItem("deep_trenches:dark_crolood_log", DARK_CROLOOD_LOG, WOODS);
		createBlockItem("deep_trenches:dark_fuchsitra_log", DARK_FUCHSITRA_LOG, WOODS);
		createBlockItem("deep_trenches:dark_red_elm_log", DARK_RED_ELM_LOG, WOODS);
		createBlockItem("deep_trenches:dead_wart_tree_log", DEAD_WART_TREE_LOG, WOODS);
		createBlockItem("deep_trenches:drigyus_log", DRIGYUS_LOG, WOODS);
		createBlockItem("deep_trenches:ebony_log", EBONY_LOG, WOODS);
		createBlockItem("deep_trenches:enderheart_log", ENDERHEART_LOG, WOODS);
		createBlockItem("deep_trenches:flalm_stem", FLALM_STEM, WOODS);
		createBlockItem("deep_trenches:fruce_log", FRUCE_LOG, WOODS);
		createBlockItem("deep_trenches:fuchsitra_log", FUCHSITRA_LOG, WOODS);
		createBlockItem("deep_trenches:fugmos_stem", FUGMOS_STEM, WOODS);
		createBlockItem("deep_trenches:funeranite_log", FUNERANITE_LOG, WOODS);
		createBlockItem("deep_trenches:ghoshroom_log", GHOSHROOM_LOG, WOODS);
		createBlockItem("deep_trenches:giant_violet_stem", GIANT_VIOLET_STEM, WOODS);
		createBlockItem("deep_trenches:guaiacum_log", GUAIACUM_LOG, WOODS);
		createBlockItem("deep_trenches:joshua_log", JOSHUA_LOG, WOODS);
		createBlockItem("deep_trenches:klinkii_pine_log", KLINKII_PINE_LOG, WOODS);
		createBlockItem("deep_trenches:melaleuca_log", MELALEUCA_LOG, WOODS);
		createBlockItem("deep_trenches:murkantuan_log", MURKANTUAN_LOG, WOODS);
		createBlockItem("deep_trenches:norfolk_pine_log", NORFOLK_PINE_LOG, WOODS);
		createBlockItem("deep_trenches:obscrus_log", OBSCRUS_LOG, WOODS);
		createBlockItem("deep_trenches:orhpris_log", ORHPRIS_LOG, WOODS);
		createBlockItem("deep_trenches:peltogyne_log", PELTOGYNE_LOG, WOODS);
		createBlockItem("deep_trenches:pin_cherry_log", PIN_CHERRY_LOG, WOODS);
		createBlockItem("deep_trenches:plum_log", PLUM_LOG, WOODS);
		createBlockItem("deep_trenches:purfunga_log", PURFUNGA_LOG, WOODS);
		createBlockItem("deep_trenches:rark_log", RARK_LOG, WOODS);
		createBlockItem("deep_trenches:red_elm_log", RED_ELM_LOG, WOODS);
		createBlockItem("deep_trenches:rhadi_log", RHADI_LOG, WOODS);
		createBlockItem("deep_trenches:sanguart_log", SANGUART_LOG, WOODS);
		createBlockItem("deep_trenches:scarlet_thiorcen_log", SCARLET_THIORCEN_LOG, WOODS);
		createBlockItem("deep_trenches:sproom_log", SPROOM_LOG, WOODS);
		createBlockItem("deep_trenches:sequoia_log", SEQUOIA_LOG, WOODS);
		createBlockItem("deep_trenches:stortreean_log", STORTREEAN_LOG, WOODS);
		createBlockItem("deep_trenches:stroomean_log", STROOMEAN_LOG, WOODS);
		createBlockItem("deep_trenches:sunrise_fungus_log", SUNRISE_FUNGUS_LOG, WOODS);
		createBlockItem("deep_trenches:tark_log", TARK_LOG, WOODS);
		createBlockItem("deep_trenches:teak_log", TEAK_LOG, WOODS);
		createBlockItem("deep_trenches:thundercloud_plum_log", THUNDERCLOUD_PLUM_LOG, WOODS);
		createBlockItem("deep_trenches:vynhert_log", VYNHERT_LOG, WOODS);
		createBlockItem("deep_trenches:wart_tree_log", WART_TREE_LOG, WOODS);
		createBlockItem("deep_trenches:wenge_log", WENGE_LOG, WOODS);
		createBlockItem("deep_trenches:mossy_yew_log", MOSSY_YEW_LOG, WOODS);
		createBlockItem("deep_trenches:yew_log", YEW_LOG, WOODS);

		createBlockItem("deep_trenches:almond_planks", ALMOND_PLANKS, WOODS);
		createBlockItem("deep_trenches:anameata_planks", ANAMEATA_PLANKS, WOODS);
		createBlockItem("deep_trenches:angels_trumpet_planks", ANGELS_TRUMPET_PLANKS, WOODS);
		createBlockItem("deep_trenches:aquean_planks", AQUEAN_PLANKS, WOODS);
		createBlockItem("deep_trenches:barshrookle_planks", BARSHROOKLE_PLANKS, WOODS);
		createBlockItem("deep_trenches:black_birch_planks", BLACK_BIRCH_PLANKS, WOODS);
		createBlockItem("deep_trenches:blue_mahoe_planks", BLUE_MAHOE_PLANKS, WOODS);
		createBlockItem("deep_trenches:blue_spruce_planks", BLUE_SPRUCE_PLANKS, WOODS);
		createBlockItem("deep_trenches:bottlebrush_planks", BOTTLEBRUSH_PLANKS, WOODS);
		createBlockItem("deep_trenches:bromya_planks", BROMYA_PLANKS, WOODS);
		createBlockItem("deep_trenches:bubbletree_planks", BUBBLETREE_PLANKS, WOODS);
		createBlockItem("deep_trenches:calcearb_planks", CALCEARB_PLANKS, WOODS);
		createBlockItem("deep_trenches:cherry_planks", CHERRY_PLANKS, WOODS);
		createBlockItem("deep_trenches:chotorn_planks", CHOTORN_PLANKS, WOODS);
		createBlockItem("deep_trenches:cook_pine_planks", COOK_PINE_PLANKS, WOODS);
		createBlockItem("deep_trenches:crolood_planks", CROLOOD_PLANKS, WOODS);
		createBlockItem("deep_trenches:dark_crolood_planks", DARK_CROLOOD_PLANKS, WOODS);
		createBlockItem("deep_trenches:dark_fuchsitra_planks", DARK_FUCHSITRA_PLANKS, WOODS);
		createBlockItem("deep_trenches:dark_red_elm_planks", DARK_RED_ELM_PLANKS, WOODS);
		createBlockItem("deep_trenches:dead_wart_tree_planks", DEAD_WART_TREE_PLANKS, WOODS);
		createBlockItem("deep_trenches:drigyus_planks", DRIGYUS_PLANKS, WOODS);
		createBlockItem("deep_trenches:ebony_planks", EBONY_PLANKS, WOODS);
		createBlockItem("deep_trenches:enderheart_planks", ENDERHEART_PLANKS, WOODS);
		createBlockItem("deep_trenches:flalm_planks", FLALM_PLANKS, WOODS);
		createBlockItem("deep_trenches:fruce_planks", FRUCE_PLANKS, WOODS);
		createBlockItem("deep_trenches:fuchsitra_planks", FUCHSITRA_PLANKS, WOODS);
		createBlockItem("deep_trenches:fugmos_planks", FUGMOS_PLANKS, WOODS);
		createBlockItem("deep_trenches:funeranite_planks", FUNERANITE_PLANKS, WOODS);
		createBlockItem("deep_trenches:ghoshroom_planks", GHOSHROOM_PLANKS, WOODS);
		createBlockItem("deep_trenches:giant_violet_planks", GIANT_VIOLET_PLANKS, WOODS);
		createBlockItem("deep_trenches:guaiacum_planks", GUAIACUM_PLANKS, WOODS);
		createBlockItem("deep_trenches:joshua_planks", JOSHUA_PLANKS, WOODS);
		createBlockItem("deep_trenches:klinkii_pine_planks", KLINKII_PINE_PLANKS, WOODS);
		createBlockItem("deep_trenches:melaleuca_planks", MELALEUCA_PLANKS, WOODS);
		createBlockItem("deep_trenches:murkantuan_planks", MURKANTUAN_PLANKS, WOODS);
		createBlockItem("deep_trenches:norfolk_pine_planks", NORFOLK_PINE_PLANKS, WOODS);
		createBlockItem("deep_trenches:obscrus_planks", OBSCRUS_PLANKS, WOODS);
		createBlockItem("deep_trenches:orhpris_planks", ORHPRIS_PLANKS, WOODS);
		createBlockItem("deep_trenches:peltogyne_planks", PELTOGYNE_PLANKS, WOODS);
		createBlockItem("deep_trenches:pin_cherry_planks", PIN_CHERRY_PLANKS, WOODS);
		createBlockItem("deep_trenches:plum_planks", PLUM_PLANKS, WOODS);
		createBlockItem("deep_trenches:purfunga_planks", PURFUNGA_PLANKS, WOODS);
		createBlockItem("deep_trenches:rark_planks", RARK_PLANKS, WOODS);
		createBlockItem("deep_trenches:red_elm_planks", RED_ELM_PLANKS, WOODS);
		createBlockItem("deep_trenches:rhadi_planks", RHADI_PLANKS, WOODS);
		createBlockItem("deep_trenches:sanguart_planks", SANGUART_PLANKS, WOODS);
		createBlockItem("deep_trenches:scarlet_thiorcen_planks", SCARLET_THIORCEN_PLANKS, WOODS);
		createBlockItem("deep_trenches:sproom_planks", SPROOM_PLANKS, WOODS);
		createBlockItem("deep_trenches:sequoia_planks", SEQUOIA_PLANKS, WOODS);
		createBlockItem("deep_trenches:stortreean_planks", STORTREEAN_PLANKS, WOODS);
		createBlockItem("deep_trenches:stroomean_planks", STROOMEAN_PLANKS, WOODS);
		createBlockItem("deep_trenches:sunrise_fungus_planks", SUNRISE_FUNGUS_PLANKS, WOODS);
		createBlockItem("deep_trenches:tark_planks", TARK_PLANKS, WOODS);
		createBlockItem("deep_trenches:teak_planks", TEAK_PLANKS, WOODS);
		createBlockItem("deep_trenches:thundercloud_plum_planks", THUNDERCLOUD_PLUM_PLANKS, WOODS);
		createBlockItem("deep_trenches:vynhert_planks", VYNHERT_PLANKS, WOODS);
		createBlockItem("deep_trenches:wart_tree_planks", WART_TREE_PLANKS, WOODS);
		createBlockItem("deep_trenches:wenge_planks", WENGE_PLANKS, WOODS);
		createBlockItem("deep_trenches:yew_planks", YEW_PLANKS, WOODS);

		createBlockItem("deep_trenches:almond_pressure_plate", ALMOND_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:anameata_pressure_plate", ANAMEATA_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:angels_trumpet_pressure_plate", ANGELS_TRUMPET_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:aquean_pressure_plate", AQUEAN_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:barshrookle_pressure_plate", BARSHROOKLE_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:black_birch_pressure_plate", BLACK_BIRCH_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:blue_mahoe_pressure_plate", BLUE_MAHOE_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:blue_spruce_pressure_plate", BLUE_SPRUCE_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:bottlebrush_pressure_plate", BOTTLEBRUSH_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:bromya_pressure_plate", BROMYA_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:bubbletree_pressure_plate", BUBBLETREE_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:calcearb_pressure_plate", CALCEARB_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:cherry_pressure_plate", CHERRY_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:chotorn_pressure_plate", CHOTORN_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:cook_pine_pressure_plate", COOK_PINE_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:crolood_pressure_plate", CROLOOD_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:dark_crolood_pressure_plate", DARK_CROLOOD_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:dark_fuchsitra_pressure_plate", DARK_FUCHSITRA_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:dark_red_elm_pressure_plate", DARK_RED_ELM_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:dead_wart_tree_pressure_plate", DEAD_WART_TREE_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:drigyus_pressure_plate", DRIGYUS_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:ebony_pressure_plate", EBONY_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:enderheart_pressure_plate", ENDERHEART_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:flalm_pressure_plate", FLALM_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:fruce_pressure_plate", FRUCE_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:fuchsitra_pressure_plate", FUCHSITRA_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:fugmos_pressure_plate", FUGMOS_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:funeranite_pressure_plate", FUNERANITE_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:ghoshroom_pressure_plate", GHOSHROOM_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:giant_violet_pressure_plate", GIANT_VIOLET_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:guaiacum_pressure_plate", GUAIACUM_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:joshua_pressure_plate", JOSHUA_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:klinkii_pine_pressure_plate", KLINKII_PINE_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:melaleuca_pressure_plate", MELALEUCA_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:murkantuan_pressure_plate", MURKANTUAN_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:norfolk_pine_pressure_plate", NORFOLK_PINE_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:obscrus_pressure_plate", OBSCRUS_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:orhpris_pressure_plate", ORHPRIS_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:peltogyne_pressure_plate", PELTOGYNE_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:pin_cherry_pressure_plate", PIN_CHERRY_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:plum_pressure_plate", PLUM_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:purfunga_pressure_plate", PURFUNGA_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:rark_pressure_plate", RARK_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:red_elm_pressure_plate", RED_ELM_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:rhadi_pressure_plate", RHADI_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:sanguart_pressure_plate", SANGUART_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:scarlet_thiorcen_pressure_plate", SCARLET_THIORCEN_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:sproom_pressure_plate", SPROOM_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:sequoia_pressure_plate", SEQUOIA_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:stortreean_pressure_plate", STORTREEAN_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:stroomean_pressure_plate", STROOMEAN_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:sunrise_fungus_pressure_plate", SUNRISE_FUNGUS_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:tark_pressure_plate", TARK_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:teak_pressure_plate", TEAK_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:thundercloud_plum_pressure_plate", THUNDERCLOUD_PLUM_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:vynhert_pressure_plate", VYNHERT_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:wart_tree_pressure_plate", WART_TREE_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:wenge_pressure_plate", WENGE_PRESSURE_PLATE, WOODS);
		createBlockItem("deep_trenches:yew_pressure_plate", YEW_PRESSURE_PLATE, WOODS);

		createBlockItem("deep_trenches:almond_sapling", ALMOND_SAPLING, WOODS);
		createBlockItem("deep_trenches:anameata_sapling", ANAMEATA_SAPLING, WOODS);
		createBlockItem("deep_trenches:angels_trumpet_sapling", ANGELS_TRUMPET_SAPLING, WOODS);
		createBlockItem("deep_trenches:aquean_sapling", AQUEAN_SAPLING, WOODS);
		createBlockItem("deep_trenches:barshrookle_sapling", BARSHROOKLE_SAPLING, WOODS);
		createBlockItem("deep_trenches:black_birch_sapling", BLACK_BIRCH_SAPLING, WOODS);
		createBlockItem("deep_trenches:blue_mahoe_sapling", BLUE_MAHOE_SAPLING, WOODS);
		createBlockItem("deep_trenches:blue_spruce_sapling", BLUE_SPRUCE_SAPLING, WOODS);
		createBlockItem("deep_trenches:bottlebrush_sapling", BOTTLEBRUSH_SAPLING, WOODS);
		createBlockItem("deep_trenches:bromya_sapling", BROMYA_SAPLING, WOODS);
		createBlockItem("deep_trenches:bubbletree_sapling", BUBBLETREE_SAPLING, WOODS);
		createBlockItem("deep_trenches:calcearb_sapling", CALCEARB_SAPLING, WOODS);
		createBlockItem("deep_trenches:cherry_sapling", CHERRY_SAPLING, WOODS);
		createBlockItem("deep_trenches:cook_pine_sapling", COOK_PINE_SAPLING, WOODS);
		createBlockItem("deep_trenches:crolood_sapling", CROLOOD_SAPLING, WOODS);
		createBlockItem("deep_trenches:dark_crolood_sapling", DARK_CROLOOD_SAPLING, WOODS);
		createBlockItem("deep_trenches:dark_fuchsitra_sapling", DARK_FUCHSITRA_SAPLING, WOODS);
		createBlockItem("deep_trenches:dark_red_elm_sapling", DARK_RED_ELM_SAPLING, WOODS);
		createBlockItem("deep_trenches:ebony_sapling", EBONY_SAPLING, WOODS);
		createBlockItem("deep_trenches:enderheart_sapling", ENDERHEART_SAPLING, WOODS);
		createBlockItem("deep_trenches:fruce_sapling", FRUCE_SAPLING, WOODS);
		createBlockItem("deep_trenches:fuchsitra_sapling", FUCHSITRA_SAPLING, WOODS);
		createBlockItem("deep_trenches:funeranite_sapling", FUNERANITE_SAPLING, WOODS);
		createBlockItem("deep_trenches:ghoshroom_sapling", GHOSHROOM_SAPLING, WOODS);
		createBlockItem("deep_trenches:guaiacum_sapling", GUAIACUM_SAPLING, WOODS);
		createBlockItem("deep_trenches:joshua_sapling", JOSHUA_SAPLING, WOODS);
		createBlockItem("deep_trenches:klinkii_pine_sapling", KLINKII_PINE_SAPLING, WOODS);
		createBlockItem("deep_trenches:melaleuca_sapling", MELALEUCA_SAPLING, WOODS);
		createBlockItem("deep_trenches:murkantuan_sapling", MURKANTUAN_SAPLING, WOODS);
		createBlockItem("deep_trenches:norfolk_pine_sapling", NORFOLK_PINE_SAPLING, WOODS);
		createBlockItem("deep_trenches:orhpris_sapling", ORHPRIS_SAPLING, WOODS);
		createBlockItem("deep_trenches:peltogyne_sapling", PELTOGYNE_SAPLING, WOODS);
		createBlockItem("deep_trenches:pin_cherry_sapling", PIN_CHERRY_SAPLING, WOODS);
		createBlockItem("deep_trenches:plum_sapling", PLUM_SAPLING, WOODS);
		createBlockItem("deep_trenches:purfunga_sapling", PURFUNGA_SAPLING, WOODS);
		createBlockItem("deep_trenches:rark_sapling", RARK_SAPLING, WOODS);
		createBlockItem("deep_trenches:red_elm_sapling", RED_ELM_SAPLING, WOODS);
		createBlockItem("deep_trenches:rhadi_sapling", RHADI_SAPLING, WOODS);
		createBlockItem("deep_trenches:sanguart_sapling", SANGUART_SAPLING, WOODS);
		createBlockItem("deep_trenches:sproom_sapling", SPROOM_SAPLING, WOODS);
		createBlockItem("deep_trenches:sequoia_sapling", SEQUOIA_SAPLING, WOODS);
		createBlockItem("deep_trenches:stortreean_sapling", STORTREEAN_SAPLING, WOODS);
		createBlockItem("deep_trenches:stroomean_sapling", STROOMEAN_SAPLING, WOODS);
		createBlockItem("deep_trenches:sunrise_fungus_sapling", SUNRISE_FUNGUS_SAPLING, WOODS);
		createBlockItem("deep_trenches:tark_sapling", TARK_SAPLING, WOODS);
		createBlockItem("deep_trenches:teak_sapling", TEAK_SAPLING, WOODS);
		createBlockItem("deep_trenches:thundercloud_plum_sapling", THUNDERCLOUD_PLUM_SAPLING, WOODS);
		createBlockItem("deep_trenches:vynhert_sapling", VYNHERT_SAPLING, WOODS);
		createBlockItem("deep_trenches:wenge_sapling", WENGE_SAPLING, WOODS);
		createBlockItem("deep_trenches:yew_sapling", YEW_SAPLING, WOODS);

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

		createBlockItem("deep_trenches:almond_slab", ALMOND_SLAB, WOODS);
		createBlockItem("deep_trenches:anameata_slab", ANAMEATA_SLAB, WOODS);
		createBlockItem("deep_trenches:angels_trumpet_slab", ANGELS_TRUMPET_SLAB, WOODS);
		createBlockItem("deep_trenches:aquean_slab", AQUEAN_SLAB, WOODS);
		createBlockItem("deep_trenches:barshrookle_slab", BARSHROOKLE_SLAB, WOODS);
		createBlockItem("deep_trenches:black_birch_slab", BLACK_BIRCH_SLAB, WOODS);
		createBlockItem("deep_trenches:blue_mahoe_slab", BLUE_MAHOE_SLAB, WOODS);
		createBlockItem("deep_trenches:blue_spruce_slab", BLUE_SPRUCE_SLAB, WOODS);
		createBlockItem("deep_trenches:bottlebrush_slab", BOTTLEBRUSH_SLAB, WOODS);
		createBlockItem("deep_trenches:bromya_slab", BROMYA_SLAB, WOODS);
		createBlockItem("deep_trenches:bubbletree_slab", BUBBLETREE_SLAB, WOODS);
		createBlockItem("deep_trenches:calcearb_slab", CALCEARB_SLAB, WOODS);
		createBlockItem("deep_trenches:cherry_slab", CHERRY_SLAB, WOODS);
		createBlockItem("deep_trenches:chotorn_slab", CHOTORN_SLAB, WOODS);
		createBlockItem("deep_trenches:cook_pine_slab", COOK_PINE_SLAB, WOODS);
		createBlockItem("deep_trenches:crolood_slab", CROLOOD_SLAB, WOODS);
		createBlockItem("deep_trenches:dark_crolood_slab", DARK_CROLOOD_SLAB, WOODS);
		createBlockItem("deep_trenches:dark_fuchsitra_slab", DARK_FUCHSITRA_SLAB, WOODS);
		createBlockItem("deep_trenches:dark_red_elm_slab", DARK_RED_ELM_SLAB, WOODS);
		createBlockItem("deep_trenches:dead_wart_tree_slab", DEAD_WART_TREE_SLAB, WOODS);
		createBlockItem("deep_trenches:drigyus_slab", DRIGYUS_SLAB, WOODS);
		createBlockItem("deep_trenches:ebony_slab", EBONY_SLAB, WOODS);
		createBlockItem("deep_trenches:enderheart_slab", ENDERHEART_SLAB, WOODS);
		createBlockItem("deep_trenches:flalm_slab", FLALM_SLAB, WOODS);
		createBlockItem("deep_trenches:fruce_slab", FRUCE_SLAB, WOODS);
		createBlockItem("deep_trenches:fuchsitra_slab", FUCHSITRA_SLAB, WOODS);
		createBlockItem("deep_trenches:fugmos_slab", FUGMOS_SLAB, WOODS);
		createBlockItem("deep_trenches:funeranite_slab", FUNERANITE_SLAB, WOODS);
		createBlockItem("deep_trenches:ghoshroom_slab", GHOSHROOM_SLAB, WOODS);
		createBlockItem("deep_trenches:giant_violet_slab", GIANT_VIOLET_SLAB, WOODS);
		createBlockItem("deep_trenches:guaiacum_slab", GUAIACUM_SLAB, WOODS);
		createBlockItem("deep_trenches:joshua_slab", JOSHUA_SLAB, WOODS);
		createBlockItem("deep_trenches:klinkii_pine_slab", KLINKII_PINE_SLAB, WOODS);
		createBlockItem("deep_trenches:melaleuca_slab", MELALEUCA_SLAB, WOODS);
		createBlockItem("deep_trenches:murkantuan_slab", MURKANTUAN_SLAB, WOODS);
		createBlockItem("deep_trenches:norfolk_pine_slab", NORFOLK_PINE_SLAB, WOODS);
		createBlockItem("deep_trenches:obscrus_slab", OBSCRUS_SLAB, WOODS);
		createBlockItem("deep_trenches:orhpris_slab", ORHPRIS_SLAB, WOODS);
		createBlockItem("deep_trenches:peltogyne_slab", PELTOGYNE_SLAB, WOODS);
		createBlockItem("deep_trenches:pin_cherry_slab", PIN_CHERRY_SLAB, WOODS);
		createBlockItem("deep_trenches:plum_slab", PLUM_SLAB, WOODS);
		createBlockItem("deep_trenches:purfunga_slab", PURFUNGA_SLAB, WOODS);
		createBlockItem("deep_trenches:rark_slab", RARK_SLAB, WOODS);
		createBlockItem("deep_trenches:red_elm_slab", RED_ELM_SLAB, WOODS);
		createBlockItem("deep_trenches:rhadi_slab", RHADI_SLAB, WOODS);
		createBlockItem("deep_trenches:sanguart_slab", SANGUART_SLAB, WOODS);
		createBlockItem("deep_trenches:scarlet_thiorcen_slab", SCARLET_THIORCEN_SLAB, WOODS);
		createBlockItem("deep_trenches:sproom_slab", SPROOM_SLAB, WOODS);
		createBlockItem("deep_trenches:sequoia_slab", SEQUOIA_SLAB, WOODS);
		createBlockItem("deep_trenches:stortreean_slab", STORTREEAN_SLAB, WOODS);
		createBlockItem("deep_trenches:stroomean_slab", STROOMEAN_SLAB, WOODS);
		createBlockItem("deep_trenches:sunrise_fungus_slab", SUNRISE_FUNGUS_SLAB, WOODS);
		createBlockItem("deep_trenches:tark_slab", TARK_SLAB, WOODS);
		createBlockItem("deep_trenches:teak_slab", TEAK_SLAB, WOODS);
		createBlockItem("deep_trenches:thundercloud_plum_slab", THUNDERCLOUD_PLUM_SLAB, WOODS);
		createBlockItem("deep_trenches:vynhert_slab", VYNHERT_SLAB, WOODS);
		createBlockItem("deep_trenches:wart_tree_slab", WART_TREE_SLAB, WOODS);
		createBlockItem("deep_trenches:wenge_slab", WENGE_SLAB, WOODS);
		createBlockItem("deep_trenches:yew_slab", YEW_SLAB, WOODS);

		createBlockItem("deep_trenches:almond_stairs", ALMOND_STAIRS, WOODS);
		createBlockItem("deep_trenches:anameata_stairs", ANAMEATA_STAIRS, WOODS);
		createBlockItem("deep_trenches:angels_trumpet_stairs", ANGELS_TRUMPET_STAIRS, WOODS);
		createBlockItem("deep_trenches:aquean_stairs", AQUEAN_STAIRS, WOODS);
		createBlockItem("deep_trenches:barshrookle_stairs", BARSHROOKLE_STAIRS, WOODS);
		createBlockItem("deep_trenches:black_birch_stairs", BLACK_BIRCH_STAIRS, WOODS);
		createBlockItem("deep_trenches:blue_mahoe_stairs", BLUE_MAHOE_STAIRS, WOODS);
		createBlockItem("deep_trenches:blue_spruce_stairs", BLUE_SPRUCE_STAIRS, WOODS);
		createBlockItem("deep_trenches:bottlebrush_stairs", BOTTLEBRUSH_STAIRS, WOODS);
		createBlockItem("deep_trenches:bromya_stairs", BROMYA_STAIRS, WOODS);
		createBlockItem("deep_trenches:bubbletree_stairs", BUBBLETREE_STAIRS, WOODS);
		createBlockItem("deep_trenches:calcearb_stairs", CALCEARB_STAIRS, WOODS);
		createBlockItem("deep_trenches:cherry_stairs", CHERRY_STAIRS, WOODS);
		createBlockItem("deep_trenches:chotorn_stairs", CHOTORN_STAIRS, WOODS);
		createBlockItem("deep_trenches:cook_pine_stairs", COOK_PINE_STAIRS, WOODS);
		createBlockItem("deep_trenches:crolood_stairs", CROLOOD_STAIRS, WOODS);
		createBlockItem("deep_trenches:dark_crolood_stairs", DARK_CROLOOD_STAIRS, WOODS);
		createBlockItem("deep_trenches:dark_fuchsitra_stairs", DARK_FUCHSITRA_STAIRS, WOODS);
		createBlockItem("deep_trenches:dark_red_elm_stairs", DARK_RED_ELM_STAIRS, WOODS);
		createBlockItem("deep_trenches:dead_wart_tree_stairs", DEAD_WART_TREE_STAIRS, WOODS);
		createBlockItem("deep_trenches:drigyus_stairs", DRIGYUS_STAIRS, WOODS);
		createBlockItem("deep_trenches:ebony_stairs", EBONY_STAIRS, WOODS);
		createBlockItem("deep_trenches:enderheart_stairs", ENDERHEART_STAIRS, WOODS);
		createBlockItem("deep_trenches:flalm_stairs", FLALM_STAIRS, WOODS);
		createBlockItem("deep_trenches:fruce_stairs", FRUCE_STAIRS, WOODS);
		createBlockItem("deep_trenches:fuchsitra_stairs", FUCHSITRA_STAIRS, WOODS);
		createBlockItem("deep_trenches:fugmos_stairs", FUGMOS_STAIRS, WOODS);
		createBlockItem("deep_trenches:funeranite_stairs", FUNERANITE_STAIRS, WOODS);
		createBlockItem("deep_trenches:ghoshroom_stairs", GHOSHROOM_STAIRS, WOODS);
		createBlockItem("deep_trenches:giant_violet_stairs", GIANT_VIOLET_STAIRS, WOODS);
		createBlockItem("deep_trenches:guaiacum_stairs", GUAIACUM_STAIRS, WOODS);
		createBlockItem("deep_trenches:joshua_stairs", JOSHUA_STAIRS, WOODS);
		createBlockItem("deep_trenches:klinkii_pine_stairs", KLINKII_PINE_STAIRS, WOODS);
		createBlockItem("deep_trenches:melaleuca_stairs", MELALEUCA_STAIRS, WOODS);
		createBlockItem("deep_trenches:murkantuan_stairs", MURKANTUAN_STAIRS, WOODS);
		createBlockItem("deep_trenches:norfolk_pine_stairs", NORFOLK_PINE_STAIRS, WOODS);
		createBlockItem("deep_trenches:obscrus_stairs", OBSCRUS_STAIRS, WOODS);
		createBlockItem("deep_trenches:orhpris_stairs", ORHPRIS_STAIRS, WOODS);
		createBlockItem("deep_trenches:peltogyne_stairs", PELTOGYNE_STAIRS, WOODS);
		createBlockItem("deep_trenches:pin_cherry_stairs", PIN_CHERRY_STAIRS, WOODS);
		createBlockItem("deep_trenches:plum_stairs", PLUM_STAIRS, WOODS);
		createBlockItem("deep_trenches:purfunga_stairs", PURFUNGA_STAIRS, WOODS);
		createBlockItem("deep_trenches:rark_stairs", RARK_STAIRS, WOODS);
		createBlockItem("deep_trenches:red_elm_stairs", RED_ELM_STAIRS, WOODS);
		createBlockItem("deep_trenches:rhadi_stairs", RHADI_STAIRS, WOODS);
		createBlockItem("deep_trenches:sanguart_stairs", SANGUART_STAIRS, WOODS);
		createBlockItem("deep_trenches:scarlet_thiorcen_stairs", SCARLET_THIORCEN_STAIRS, WOODS);
		createBlockItem("deep_trenches:sproom_stairs", SPROOM_STAIRS, WOODS);
		createBlockItem("deep_trenches:sequoia_stairs", SANGUART_STAIRS, WOODS);
		createBlockItem("deep_trenches:stortreean_stairs", STORTREEAN_STAIRS, WOODS);
		createBlockItem("deep_trenches:stroomean_stairs", STROOMEAN_STAIRS, WOODS);
		createBlockItem("deep_trenches:sunrise_fungus_stairs", SUNRISE_FUNGUS_STAIRS, WOODS);
		createBlockItem("deep_trenches:tark_stairs", TARK_STAIRS, WOODS);
		createBlockItem("deep_trenches:teak_stairs", TEAK_STAIRS, WOODS);
		createBlockItem("deep_trenches:thundercloud_plum_stairs", THUNDERCLOUD_PLUM_STAIRS, WOODS);
		createBlockItem("deep_trenches:vynhert_stairs", VYNHERT_STAIRS, WOODS);
		createBlockItem("deep_trenches:wart_tree_stairs", WART_TREE_STAIRS, WOODS);
		createBlockItem("deep_trenches:wenge_stairs", WENGE_STAIRS, WOODS);
		createBlockItem("deep_trenches:yew_stairs", YEW_STAIRS, WOODS);

		createBlockItem("deep_trenches:almond_trapdoor", ALMOND_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:anameata_trapdoor", ANAMEATA_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:angels_trumpet_trapdoor", ANGELS_TRUMPET_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:aquean_trapdoor", AQUEAN_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:barshrookle_trapdoor", BARSHROOKLE_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:black_birch_trapdoor", BLACK_BIRCH_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:blue_mahoe_trapdoor", BLUE_MAHOE_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:blue_spruce_trapdoor", BLUE_SPRUCE_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:bottlebrush_trapdoor", BOTTLEBRUSH_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:bromya_trapdoor", BROMYA_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:bubbletree_trapdoor", BUBBLETREE_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:calcearb_trapdoor", CALCEARB_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:cherry_trapdoor", CHERRY_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:chotorn_trapdoor", CHOTORN_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:cook_pine_trapdoor", COOK_PINE_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:crolood_trapdoor", CROLOOD_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:dark_crolood_trapdoor", DARK_CROLOOD_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:dark_fuchsitra_trapdoor", DARK_FUCHSITRA_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:dark_red_elm_trapdoor", DARK_RED_ELM_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:dead_wart_tree_trapdoor", DEAD_WART_TREE_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:drigyus_trapdoor", DRIGYUS_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:ebony_trapdoor", EBONY_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:enderheart_trapdoor", ENDERHEART_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:flalm_trapdoor", FLALM_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:fruce_trapdoor", FRUCE_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:fuchsitra_trapdoor", FUCHSITRA_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:fugmos_trapdoor", FUGMOS_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:funeranite_trapdoor", FUNERANITE_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:ghoshroom_trapdoor", GHOSHROOM_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:giant_violet_trapdoor", GIANT_VIOLET_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:guaiacum_trapdoor", GUAIACUM_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:joshua_trapdoor", JOSHUA_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:klinkii_pine_trapdoor", KLINKII_PINE_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:melaleuca_trapdoor", MELALEUCA_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:murkantuan_trapdoor", MURKANTUAN_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:norfolk_pine_trapdoor", NORFOLK_PINE_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:obscrus_trapdoor", OBSCRUS_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:orhpris_trapdoor", ORHPRIS_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:peltogyne_trapdoor", PELTOGYNE_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:pin_cherry_trapdoor", PIN_CHERRY_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:plum_trapdoor", PLUM_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:purfunga_trapdoor", PURFUNGA_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:rark_trapdoor", RARK_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:red_elm_trapdoor", RED_ELM_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:rhadi_trapdoor", RHADI_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:sanguart_trapdoor", SANGUART_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:scarlet_thiorcen_trapdoor", SCARLET_THIORCEN_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:sproom_trapdoor", SPROOM_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:sequoia_trapdoor", SEQUOIA_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:stortreean_trapdoor", STORTREEAN_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:stroomean_trapdoor", STROOMEAN_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:sunrise_fungus_trapdoor", SUNRISE_FUNGUS_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:tark_trapdoor", TARK_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:teak_trapdoor", TEAK_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:thundercloud_plum_trapdoor", THUNDERCLOUD_PLUM_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:vynhert_trapdoor", VYNHERT_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:wart_tree_trapdoor", WART_TREE_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:wenge_trapdoor", WENGE_TRAPDOOR, WOODS);
		createBlockItem("deep_trenches:yew_trapdoor", YEW_TRAPDOOR, WOODS);

		createBlockItem("deep_trenches:almond_wood", ALMOND_WOOD, WOODS);
		createBlockItem("deep_trenches:anameata_wood", ANAMEATA_WOOD, WOODS);
		createBlockItem("deep_trenches:angels_trumpet_wood", ANGELS_TRUMPET_WOOD, WOODS);
		createBlockItem("deep_trenches:aquean_wood", AQUEAN_WOOD, WOODS);
		createBlockItem("deep_trenches:barshrookle_wood", BARSHROOKLE_WOOD, WOODS);
		createBlockItem("deep_trenches:black_birch_wood", BLACK_BIRCH_WOOD, WOODS);
		createBlockItem("deep_trenches:blue_mahoe_wood", BLUE_MAHOE_WOOD, WOODS);
		createBlockItem("deep_trenches:blue_spruce_wood", BLUE_SPRUCE_WOOD, WOODS);
		createBlockItem("deep_trenches:bottlebrush_wood", BOTTLEBRUSH_WOOD, WOODS);
		createBlockItem("deep_trenches:bromya_wood", BROMYA_WOOD, WOODS);
		createBlockItem("deep_trenches:bubbletree_wood", BUBBLETREE_WOOD, WOODS);
		createBlockItem("deep_trenches:calcearb_wood", CALCEARB_WOOD, WOODS);
		createBlockItem("deep_trenches:cherry_wood", CHERRY_WOOD, WOODS);
		createBlockItem("deep_trenches:chotorn_wood", CHOTORN_WOOD, WOODS);
		createBlockItem("deep_trenches:cook_pine_wood", COOK_PINE_WOOD, WOODS);
		createBlockItem("deep_trenches:crolood_wood", CROLOOD_WOOD, WOODS);
		createBlockItem("deep_trenches:dark_crolood_wood", DARK_CROLOOD_WOOD, WOODS);
		createBlockItem("deep_trenches:dark_fuchsitra_wood", DARK_FUCHSITRA_WOOD, WOODS);
		createBlockItem("deep_trenches:dark_red_elm_wood", DARK_RED_ELM_WOOD, WOODS);
		createBlockItem("deep_trenches:dead_wart_tree_wood", DEAD_WART_TREE_WOOD, WOODS);
		createBlockItem("deep_trenches:drigyus_wood", DRIGYUS_WOOD, WOODS);
		createBlockItem("deep_trenches:ebony_wood", EBONY_WOOD, WOODS);
		createBlockItem("deep_trenches:enderheart_wood", ENDERHEART_WOOD, WOODS);
		createBlockItem("deep_trenches:flalm_wood", FLALM_WOOD, WOODS);
		createBlockItem("deep_trenches:fruce_wood", FRUCE_WOOD, WOODS);
		createBlockItem("deep_trenches:fuchsitra_wood", FUCHSITRA_WOOD, WOODS);
		createBlockItem("deep_trenches:fugmos_wood", FUGMOS_WOOD, WOODS);
		createBlockItem("deep_trenches:funeranite_wood", FUNERANITE_WOOD, WOODS);
		createBlockItem("deep_trenches:ghoshroom_wood", GHOSHROOM_WOOD, WOODS);
		createBlockItem("deep_trenches:giant_violet_wood", GIANT_VIOLET_WOOD, WOODS);
		createBlockItem("deep_trenches:guaiacum_wood", GUAIACUM_WOOD, WOODS);
		createBlockItem("deep_trenches:joshua_wood", JOSHUA_WOOD, WOODS);
		createBlockItem("deep_trenches:klinkii_pine_wood", KLINKII_PINE_WOOD, WOODS);
		createBlockItem("deep_trenches:melaleuca_wood", MELALEUCA_WOOD, WOODS);
		createBlockItem("deep_trenches:murkantuan_wood", MURKANTUAN_WOOD, WOODS);
		createBlockItem("deep_trenches:norfolk_pine_wood", NORFOLK_PINE_WOOD, WOODS);
		createBlockItem("deep_trenches:obscrus_wood", OBSCRUS_WOOD, WOODS);
		createBlockItem("deep_trenches:orhpris_wood", ORHPRIS_WOOD, WOODS);
		createBlockItem("deep_trenches:peltogyne_wood", PELTOGYNE_WOOD, WOODS);
		createBlockItem("deep_trenches:pin_cherry_wood", PIN_CHERRY_WOOD, WOODS);
		createBlockItem("deep_trenches:plum_wood", PLUM_WOOD, WOODS);
		createBlockItem("deep_trenches:purfunga_wood", PURFUNGA_WOOD, WOODS);
		createBlockItem("deep_trenches:rark_wood", RARK_WOOD, WOODS);
		createBlockItem("deep_trenches:red_elm_wood", RED_ELM_WOOD, WOODS);
		createBlockItem("deep_trenches:rhadi_wood", RHADI_WOOD, WOODS);
		createBlockItem("deep_trenches:sanguart_wood", SANGUART_WOOD, WOODS);
		createBlockItem("deep_trenches:scarlet_thiorcen_wood", SCARLET_THIORCEN_WOOD, WOODS);
		createBlockItem("deep_trenches:sproom_wood", SPROOM_WOOD, WOODS);
		createBlockItem("deep_trenches:sequoia_wood", SEQUOIA_WOOD, WOODS);
		createBlockItem("deep_trenches:stortreean_wood", STORTREEAN_WOOD, WOODS);
		createBlockItem("deep_trenches:stroomean_wood", STROOMEAN_WOOD, WOODS);
		createBlockItem("deep_trenches:sunrise_fungus_wood", SUNRISE_FUNGUS_WOOD, WOODS);
		createBlockItem("deep_trenches:tark_wood", TARK_WOOD, WOODS);
		createBlockItem("deep_trenches:teak_wood", TEAK_WOOD, WOODS);
		createBlockItem("deep_trenches:thundercloud_plum_wood", THUNDERCLOUD_PLUM_WOOD, WOODS);
		createBlockItem("deep_trenches:vynhert_wood", VYNHERT_WOOD, WOODS);
		createBlockItem("deep_trenches:wart_tree_wood", WART_TREE_WOOD, WOODS);
		createBlockItem("deep_trenches:wenge_wood", WENGE_WOOD, WOODS);
		createBlockItem("deep_trenches:yew_wood", YEW_WOOD, WOODS);

		createBlockItem("deep_trenches:stripped_almond_log", STRIPPED_ALMOND_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_anameata_log", STRIPPED_ANAMEATA_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_angels_trumpet_log", STRIPPED_ANGELS_TRUMPET_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_aquean_log", STRIPPED_AQUEAN_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_barshrookle_log", STRIPPED_BARSHROOKLE_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_black_birch_log", STRIPPED_BLACK_BIRCH_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_bottlebrush_log", STRIPPED_BOTTLEBRUSH_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_blue_mahoe_log", STRIPPED_BLUE_MAHOE_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_blue_spruce_log", STRIPPED_BLUE_SPRUCE_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_bromya_log", STRIPPED_BROMYA_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_bubbletree_log", STRIPPED_BUBBLETREE_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_calcearb_log", STRIPPED_CALCEARB_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_cherry_log", STRIPPED_CHERRY_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_cook_pine_log", STRIPPED_COOK_PINE_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_chotorn_log", STRIPPED_CHOTORN_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_crolood_log", STRIPPED_CROLOOD_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_dark_crolood_log", STRIPPED_DARK_CROLOOD_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_dark_fuchsitra_log", STRIPPED_DARK_FUCHSITRA_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_dark_red_elm_log", STRIPPED_DARK_RED_ELM_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_dead_wart_tree_log", STRIPPED_DEAD_WART_TREE_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_drigyus_log", STRIPPED_DRIGYUS_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_ebony_log", STRIPPED_EBONY_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_enderheart_log", STRIPPED_ENDERHEART_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_fruce_log", STRIPPED_FRUCE_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_funeranite_log", STRIPPED_FUNERANITE_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_fuchsitra_log", STRIPPED_FUCHSITRA_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_fugmos_stem", STRIPPED_FUGMOS_STEM, WOODS);
		createBlockItem("deep_trenches:stripped_ghoshroom_log", STRIPPED_GHOSHROOM_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_giant_violet_stem", STRIPPED_GIANT_VIOLET_STEM, WOODS);
		createBlockItem("deep_trenches:stripped_guaiacum_log", STRIPPED_GUAIACUM_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_joshua_log", STRIPPED_JOSHUA_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_klinkii_pine_log", STRIPPED_KLINKII_PINE_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_melaleuca_log", STRIPPED_MELALEUCA_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_murkantuan_log", STRIPPED_MURKANTUAN_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_norfolk_pine_log", STRIPPED_NORFOLK_PINE_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_obscrus_log", STRIPPED_OBSCRUS_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_orhpris_log", STRIPPED_ORHPRIS_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_peltogyne_log", STRIPPED_PELTOGYNE_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_pin_cherry_log", STRIPPED_PIN_CHERRY_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_plum_log", STRIPPED_PLUM_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_purfunga_log", STRIPPED_PURFUNGA_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_rark_log", STRIPPED_RARK_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_red_elm_log", STRIPPED_RED_ELM_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_rhadi_log", STRIPPED_RHADI_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_sanguart_log", STRIPPED_SANGUART_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_scarlet_thiorcen_log", STRIPPED_SCARLET_THIORCEN_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_sequoia_log", STRIPPED_SEQUOIA_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_sproom_log", STRIPPED_SPROOM_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_stortreean_log", STRIPPED_STORTREEAN_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_stroomean_log", STRIPPED_STROOMEAN_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_sunrise_fungus_log", STRIPPED_SUNRISE_FUNGUS_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_tark_log", STRIPPED_TARK_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_teak_log", STRIPPED_TEAK_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_thundercloud_plum_log", STRIPPED_THUNDERCLOUD_PLUM_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_vynhert_log", STRIPPED_VYNHERT_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_wart_tree_log", STRIPPED_WART_TREE_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_wenge_log", STRIPPED_WENGE_LOG, WOODS);
		createBlockItem("deep_trenches:stripped_yew_log", STRIPPED_YEW_LOG, WOODS);

		createBlockItem("deep_trenches:stripped_almond_wood", STRIPPED_ALMOND_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_anameata_wood", STRIPPED_ANAMEATA_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_angels_trumpet_wood", STRIPPED_ANGELS_TRUMPET_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_aquean_wood", STRIPPED_AQUEAN_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_barshrookle_wood", STRIPPED_BARSHROOKLE_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_black_birch_wood", STRIPPED_BLACK_BIRCH_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_bottlebrush_wood", STRIPPED_BOTTLEBRUSH_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_blue_mahoe_wood", STRIPPED_BLUE_MAHOE_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_blue_spruce_wood", STRIPPED_BLUE_SPRUCE_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_bromya_wood", STRIPPED_BROMYA_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_bubbletree_wood", STRIPPED_BUBBLETREE_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_calcearb_wood", STRIPPED_CALCEARB_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_cherry_wood", STRIPPED_CHERRY_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_chotorn_wood", STRIPPED_CHOTORN_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_cook_pine_wood", STRIPPED_COOK_PINE_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_crolood_wood", STRIPPED_CROLOOD_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_dark_crolood_wood", STRIPPED_DARK_CROLOOD_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_dark_fuchsitra_wood", STRIPPED_DARK_FUCHSITRA_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_dark_red_elm_wood", STRIPPED_DARK_RED_ELM_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_dead_wart_tree_wood", STRIPPED_DEAD_WART_TREE_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_drigyus_wood", STRIPPED_DRIGYUS_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_ebony_wood", STRIPPED_EBONY_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_enderheart_wood", STRIPPED_ENDERHEART_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_flalm_stem", STRIPPED_FLALM_STEM, WOODS);
		createBlockItem("deep_trenches:stripped_flalm_wood", STRIPPED_FLALM_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_fruce_wood", STRIPPED_FRUCE_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_fuchsitra_wood", STRIPPED_FUCHSITRA_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_fugmos_hyphae", STRIPPED_FUGMOS_HYPHAE, WOODS);
		createBlockItem("deep_trenches:stripped_funeranite_wood", STRIPPED_FUNERANITE_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_ghoshroom_wood", STRIPPED_GHOSHROOM_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_giant_violet_wood", STRIPPED_GIANT_VIOLET_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_guaiacum_wood", STRIPPED_GUAIACUM_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_joshua_wood", STRIPPED_JOSHUA_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_klinkii_pine_wood", STRIPPED_KLINKII_PINE_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_melaleuca_wood", STRIPPED_MELALEUCA_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_murkantuan_wood", STRIPPED_MURKANTUAN_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_norfolk_pine_wood", STRIPPED_NORFOLK_PINE_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_obscrus_wood", STRIPPED_OBSCRUS_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_orhpris_wood", STRIPPED_ORHPRIS_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_peltogyne_wood", STRIPPED_PELTOGYNE_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_pin_cherry_wood", STRIPPED_PIN_CHERRY_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_plum_wood", STRIPPED_PLUM_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_purfunga_wood", STRIPPED_PURFUNGA_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_rark_wood", STRIPPED_RARK_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_red_elm_wood", STRIPPED_RED_ELM_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_rhadi_wood", STRIPPED_RHADI_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_sanguart_wood", STRIPPED_SANGUART_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_scarlet_thiorcen_wood", STRIPPED_SCARLET_THIORCEN_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_sequoia_wood", STRIPPED_SEQUOIA_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_sproom_wood", STRIPPED_SPROOM_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_stortreean_wood", STRIPPED_STORTREEAN_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_stroomean_wood", STRIPPED_STROOMEAN_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_sunrise_fungus_wood", STRIPPED_SUNRISE_FUNGUS_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_tark_wood", STRIPPED_TARK_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_teak_wood", STRIPPED_TEAK_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_thundercloud_plum_wood", STRIPPED_THUNDERCLOUD_PLUM_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_vynhert_wood", STRIPPED_VYNHERT_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_wart_tree_wood", STRIPPED_WART_TREE_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_wenge_wood", STRIPPED_WENGE_WOOD, WOODS);
		createBlockItem("deep_trenches:stripped_yew_wood", STRIPPED_YEW_WOOD, WOODS);

		createBlockItem("deep_trenches:bubbletree_bubbles", BUBBLETREE_BUBBLES, WOODS);
		createBlockItem("deep_trenches:fugmos_moss", FUGMOS_MOSS, WOODS);
		createBlockItem("deep_trenches:wart_tree_warts", WART_TREE_WARTS, WOODS);

		createBlockItem("deep_trenches:stasp_nest", STASP_NEST, WOODS);

		createBlockItem("deep_trenches:rhadi_fruit", RHADI_FRUIT, WOODS);
		createBlockItem("deep_trenches:carved_rhadi_fruit", CARVED_RHADI_FRUIT, WOODS);
		createBlockItem("deep_trenches:rhadi_o_lantern", RHADI_O_LANTERN, WOODS);

		createBlockItem("deep_trenches:vynhert_fruit", VYNHERT_FRUIT, WOODS);
		createBlockItem("deep_trenches:carved_vynhert_fruit", CARVED_VYNHERT_FRUIT, WOODS);
		createBlockItem("deep_trenches:vynhert_o_lantern", VYNHERT_O_LANTERN, WOODS);

		createBlockItem("deep_trenches:giant_violet", GIANT_VIOLET, WOODS);
		createBlockItem("deep_trenches:giant_violet_leaf", GIANT_VIOLET_LEAF, WOODS);
		createBlockItem("deep_trenches:giant_violet_petal", GIANT_VIOLET_PETAL, WOODS);
		createBlockItem("deep_trenches:flalm_petal_block", FLALM_PETAL_BLOCK, WOODS);
		createBlockItem("deep_trenches:giant_violet_pistil", GIANT_VIOLET_PISTIL, WOODS);

		createBlockItem("deep_trenches:cyan_bioluminescent_block", CYAN_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:green_bioluminescent_block", GREEN_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);
		createBlockItem("deep_trenches:light_blue_bioluminescent_block", LIGHT_BLUE_BIOLUMINESCENT_BLOCK, SEA_BLOCKS);


		AIRIAL_MOSS = createBlockItem("deep_trenches:airial_moss", DTBlocks.AIRIAL_MOSS, WOODS);

		createBlockItem("deep_trenches:light_opalite", LIGHT_OPALITE, WOODS);
		createBlockItem("deep_trenches:lushine", LUSHINE, WOODS);
		createBlockItem("deep_trenches:lushine_pillar", LUSHINE_PILLAR, WOODS);
		createBlockItem("deep_trenches:lustrite", LUSTRITE, WOODS);
		createBlockItem("deep_trenches:marine_snow", MARINE_SNOW, WOODS);
		createBlockItem("deep_trenches:opalite", OPALITE, WOODS);
		createBlockItem("deep_trenches:rhodonite", RHODONITE, WOODS);
		createBlockItem("deep_trenches:storcean_marine_snow", STORCEAN_MARINE_SNOW, WOODS);
		createBlockItem("deep_trenches:storcendite", STORCENDITE, WOODS);
		createBlockItem("deep_trenches:storcerack", STORCERACK, WOODS);

		createBlockItem("deep_trenches:skystone", SKYSTONE, WOODS);
		createBlockItem("deep_trenches:skysoil", SKYSOIL, WOODS);
		createBlockItem("deep_trenches:sprilium", SPRILIUM, WOODS);
		createBlockItem("deep_trenches:verdine", VERDINE, WOODS);
		createBlockItem("deep_trenches:enrotium", ENROTIUM, WOODS);
		createBlockItem("deep_trenches:poinine", POININE, WOODS);
		createBlockItem("deep_trenches:mosoil", MOSOIL, WOODS);
		createBlockItem("deep_trenches:dritean", DRITEAN, WOODS);

		createBlockItem("deep_trenches:bottlebrush_flowers", BOTTLEBRUSH_FLOWERS, WOODS);
		createBlockItem("deep_trenches:guaiacum_flowers", GUAIACUM_FLOWERS, WOODS);
		createBlockItem("deep_trenches:melaleuca_flowers", MELALEUCA_FLOWERS, WOODS);

		createBlockItem("deep_trenches:airial_bush", AIRIAL_BUSH, WOODS);
		createBlockItem("deep_trenches:harshles", HARSHLES, WOODS);
		createBlockItem("deep_trenches:reebloon", REEBLOON, WOODS);
		createBlockItem("deep_trenches:squish_tips", SQUISH_TIPS, WOODS);
		createBlockItem("deep_trenches:sproom_spike", SPROOM_SPIKE, WOODS);

		createBlockItem("deep_trenches:chotorn", CHOTORN_SAPLING, WOODS);
		createBlockItem("deep_trenches:drigyus", DRIGYUS, WOODS);
		createBlockItem("deep_trenches:flalm", FLALM, WOODS);
		createBlockItem("deep_trenches:fugmos", FUGMOS, WOODS);
		createBlockItem("deep_trenches:obscrus", OBSCRUS, WOODS);
		createBlockItem("deep_trenches:scarlet_thiorcen", SCARLET_THIORCEN, WOODS);

		createBlockItem("deep_trenches:enderheart_leaf", ENDERHEART_LEAF, WOODS);
		createBlockItem("deep_trenches:vynhert_leaf", VYNHERT_LEAF, WOODS);

		createBlockItem("deep_trenches:flalm_thorns", FLALM_THORNS, WOODS);
		createBlockItem("deep_trenches:rhadi_thorns", RHADI_THORNS, WOODS);
		createBlockItem("deep_trenches:vynhert_thorns", VYNHERT_THORNS, WOODS);
		createBlockItem("deep_trenches:vynhert_tentacles", VYNHERT_TENTACLES, WOODS);

		createBlockItem("deep_trenches:blue_mahoe_flower", BLUE_MAHOE_FLOWER, WOODS);
		createBlockItem("deep_trenches:bromya_flower", BROMYA_FLOWER, WOODS);
		createBlockItem("deep_trenches:murkantuan_flower", MURKANTUAN_FLOWER, WOODS);

		createBlockItem("deep_trenches:black_lily", BLACK_LILY, WOODS);
		createBlockItem("deep_trenches:black_pansy", BLACK_PANSY, WOODS);
		createBlockItem("deep_trenches:blue_pansy", BLUE_PANSY, WOODS);
		createBlockItem("deep_trenches:blue_poppy", BLUE_POPPY, WOODS);
		createBlockItem("deep_trenches:blue_violet", BLUE_VIOLET, WOODS);
		createBlockItem("deep_trenches:bonnet_spurge", BONNET_SPURGE, WOODS);
		createBlockItem("deep_trenches:brown_pansy", BROWN_PANSY, WOODS);
		createBlockItem("deep_trenches:bullthorn", BULLTHORN, WOODS);
		createBlockItem("deep_trenches:cactlow", CACTLOW, WOODS);
		createBlockItem("deep_trenches:chocolate_cosmos_flower", CHOCOLATE_COSMOS_FLOWER, WOODS);
		createBlockItem("deep_trenches:clawbulb", CLAWBULB, WOODS);
		createBlockItem("deep_trenches:cyan_blue_violet", CYAN_BLUE_VIOLET, WOODS);
		createBlockItem("deep_trenches:cycawler", CYCAWLER, WOODS);
		createBlockItem("deep_trenches:garden_pinks", GARDEN_PINKS, WOODS);
		createBlockItem("deep_trenches:green_pansy", GREEN_PANSY, WOODS);
		createBlockItem("deep_trenches:gyldelion_flower", GYLDELION_FLOWER, WOODS);
		createBlockItem("deep_trenches:lime_spurge", LIME_SPURGE, WOODS);
		createBlockItem("deep_trenches:lupin_flower", LUPIN_FLOWER, WOODS);
		createBlockItem("deep_trenches:marsh_violet", MARSH_VIOLET, WOODS);
		createBlockItem("deep_trenches:murkstem", MURKSTEM, WOODS);
		createBlockItem("deep_trenches:native_violet", NATIVE_VIOLET, WOODS);
		createBlockItem("deep_trenches:opium_poppy", OPIUM_POPPY, WOODS);
		createBlockItem("deep_trenches:orange_lily", ORANGE_LILY, WOODS);
		createBlockItem("deep_trenches:pigal", PIGAL, WOODS);
		createBlockItem("deep_trenches:pink_and_orange_pansy", PINK_AND_ORANGE_PANSY, WOODS);
		createBlockItem("deep_trenches:pink_braitor_flower", PINK_BRAITOR_FLOWER, WOODS);
		createBlockItem("deep_trenches:pink_marsh_violet", PINK_MARSH_VIOLET, WOODS);
		createBlockItem("deep_trenches:pink_rose", PINK_ROSE, WOODS);
		createBlockItem("deep_trenches:pink_rose_bush", PINK_ROSE_BUSH, WOODS);
		createBlockItem("deep_trenches:poppy", DTBlocks.POPPY, WOODS);
		createBlockItem("deep_trenches:purple_and_orange_pansy", PURPLE_AND_ORANGE_PANSY, WOODS);
		createBlockItem("deep_trenches:purpround", PURPROUND, WOODS);
		createBlockItem("deep_trenches:red_braitor_flower", RED_BRAITOR_FLOWER, WOODS);
		createBlockItem("deep_trenches:red_chocolate_cosmos_flower", RED_CHOCOLATE_COSMOS_FLOWER, WOODS);
		createBlockItem("deep_trenches:red_pansy", RED_PANSY, WOODS);
		createBlockItem("deep_trenches:red_rose", RED_ROSE, WOODS);
		createBlockItem("deep_trenches:rubra_blue_violet", RUBRA_BLUE_VIOLET, WOODS);
		createBlockItem("deep_trenches:skalk", SKALK, WOODS);
		createBlockItem("deep_trenches:spidreet", SPIDREET, WOODS);
		createBlockItem("deep_trenches:spike_lavender", SPIKE_LAVENDER, WOODS);
		createBlockItem("deep_trenches:spridelion", SPRIDELION, WOODS);
		createBlockItem("deep_trenches:sprinly", SPRINLY, WOODS);
		createBlockItem("deep_trenches:squisacle", SQUISACLE, WOODS);
		createBlockItem("deep_trenches:sweet_violet", SWEET_VIOLET, WOODS);
		createBlockItem("deep_trenches:topped_lavender", TOPPED_LAVENDER, WOODS);
		createBlockItem("deep_trenches:vaslame", VASLAME, WOODS);
		createBlockItem("deep_trenches:velvet_lily", VELVET_LILY, WOODS);
		createBlockItem("deep_trenches:weepistil", WEEPISTIL, WOODS);
		createBlockItem("deep_trenches:weepy_hollower", WEEPY_HOLLOWER, WOODS);
		createBlockItem("deep_trenches:white_violet", WHITE_VIOLET, WOODS);
		createBlockItem("deep_trenches:wild_pansy", WILD_PANSY, WOODS);
		createBlockItem("deep_trenches:yellow_violet", YELLOW_VIOLET, WOODS);

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

		/* -------------------------------- SPAWN EGGS ------------------------------------------- */
		BARBELED_LOOSEJAW_SPAWN_EGG = createSpawnEgg("deep_trenches:barbeled_loosejaw_spawn_egg", DTEntityTypes.BARBELED_LOOSEJAW, 921113, 15859744);
		BETTA_SPAWN_EGG = createSpawnEgg("deep_trenches:betta_spawn_egg", DTEntityTypes.BETTA,7347502, 9183521);
		BLACK_LOOSEJAW_SPAWN_EGG = createSpawnEgg("deep_trenches:black_loosejaw_spawn_egg", DTEntityTypes.BLACK_LOOSEJAW,2102566, 11010053);
		LIGHT_LOOSEJAW_SPAWN_EGG = createSpawnEgg("deep_trenches:light_loosejaw_spawn_egg", DTEntityTypes.LIGHT_LOOSEJAW,1643048, 4836351);
		STASP_SPAWN_EGG = createSpawnEgg("deep_trenches:stasp_spawn_egg", DTEntityTypes.STASP, 2695792, 5124510);

		DEEP_LAKE_BETTA_SPAWN_EGG = createSpawnEgg("deep_trenches:deep_lake_betta_spawn_egg", DTEntityTypes.DEEP_LAKE_BETTA, DTEntityTypeTags.TRELOSIAGNUS_BETTA, 1189390, 5013319);
		GIANT_HATCHETFISH_SPAWN_EGG = createSpawnEgg("deep_trenches:giant_hatchetfish_spawn_egg", DTEntityTypes.GIANT_HATCHETFISH, DTEntityTypeTags.ARGYROPELECUS_GIGAS, 9870757, 12311039);
		SMALLTOOTH_DRAGONFISH_SPAWN_EGG = createSpawnEgg("deep_trenches:smalltooth_dragonfish_spawn_egg", DTEntityTypes.SMALLTOOTH_DRAGONFISH, DTEntityTypeTags.PACHYSTOMIAS_MICRODON, 1250598, 16728832);

		/* -------------------------------- FRUITS ------------------------------------------- */
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

		/* -------------------------------- BOAT ------------------------------------------- */
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
		DARK_FUSHSITRA_BOAT = createBoat("deep_trenches:dark_fuchsitra_boat", DTBoatTypes.DARK_FUSHSITRA);
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

		/* -------------------------------- STICK ------------------------------------------- */
		ALMOND_STICK = createItem("deep_trenches:almond_stick", WOODS);
		ANAMEATA_STICK = createItem("deep_trenches:anameata_stick", WOODS);
		ANGELS_TRUMPET_STICK = createItem("deep_trenches:angels_trumpet_stick", WOODS);
		AQUEAN_STICK = createItem("deep_trenches:aquean_stick", WOODS);
		BARSHROOKLE_STICK = createItem("deep_trenches:barshrookle_stick", WOODS);
		BLACK_BIRCH_STICK = createItem("deep_trenches:black_birch_stick", WOODS);
		BLUE_MAHOE_STICK = createItem("deep_trenches:blue_mahoe_stick", WOODS);
		BLUE_SPRUCE_STICK = createItem("deep_trenches:blue_spruce_stick", WOODS);
		BOTTLEBRUSH_STICK = createItem("deep_trenches:bottlebrush_stick", WOODS);
		BROMYA_STICK = createItem("deep_trenches:bromya_stick", WOODS);
		BUBBLETREE_STICK = createItem("deep_trenches:bubbletree_stick", WOODS);
		CALCEARB_STICK = createItem("deep_trenches:calcearb_stick", WOODS);
		CHERRY_STICK = createItem("deep_trenches:cherry_stick", WOODS);
		CHOTORN_STICK = createItem("deep_trenches:chotorn_stick", WOODS);
		COOK_PINE_STICK = createItem("deep_trenches:cook_pine_stick", WOODS);
		CROLOOD_STICK = createItem("deep_trenches:crolood_stick", WOODS);
		DARK_CROLOOD_STICK = createItem("deep_trenches:dark_crolood_stick", WOODS);
		DARK_FUSHSITRA_STICK = createItem("deep_trenches:dark_fuchsitra_stick", WOODS);
		DARK_RED_ELM_STICK = createItem("deep_trenches:dark_red_elm_stick", WOODS);
		DEAD_WART_TREE_STICK = createItem("deep_trenches:dead_wart_tree_stick", WOODS);
		DRIGYUS_STICK = createItem("deep_trenches:drigyus_stick", WOODS);
		EBONY_STICK = createItem("deep_trenches:ebony_stick", WOODS);
		ENDERHEART_STICK = createItem("deep_trenches:enderheart_stick", WOODS);
		FLALM_STICK = createItem("deep_trenches:flalm_stick", WOODS);
		FRUCE_STICK = createItem("deep_trenches:fruce_stick", WOODS);
		FUCHSITRA_STICK = createItem("deep_trenches:fuchsitra_stick", WOODS);
		FUGMOS_STICK = createItem("deep_trenches:fugmos_stick", WOODS);
		FUNERANITE_STICK = createItem("deep_trenches:funeranite_stick", WOODS);
		GHOSHROOM_STICK = createItem("deep_trenches:ghoshroom_stick", WOODS);
		GIANT_VIOLET_STICK = createItem("deep_trenches:giant_violet_stick", WOODS);
		GUAIACUM_STICK = createItem("deep_trenches:guaiacum_stick", WOODS);
		JOSHUA_STICK = createItem("deep_trenches:joshua_stick", WOODS);
		KLINKII_PINE_STICK = createItem("deep_trenches:klinkii_pine_stick", WOODS);
		MELALEUCA_STICK = createItem("deep_trenches:melaleuca_stick", WOODS);
		GYLDELION_STICK = createItem("deep_trenches:gyldelion_stick", WOODS);
		MURKANTUAN_STICK = createItem("deep_trenches:murkantuan_stick", WOODS);
		NORFOLK_PINE_STICK = createItem("deep_trenches:norfolk_pine_stick", WOODS);
		OBSCRUS_STICK = createItem("deep_trenches:obscrus_stick", WOODS);
		ORHPRIS_STICK = createItem("deep_trenches:orhpris_stick", WOODS);
		PELTOGYNE_STICK = createItem("deep_trenches:peltogyne_stick", WOODS);
		PIN_CHERRY_STICK = createItem("deep_trenches:pin_cherry_stick", WOODS);
		PLUM_STICK = createItem("deep_trenches:plum_stick", WOODS);
		PURFUNGA_STICK = createItem("deep_trenches:purfunga_stick", WOODS);
		RARK_STICK = createItem("deep_trenches:rark_stick", WOODS);
		RED_ELM_STICK = createItem("deep_trenches:red_elm_stick", WOODS);
		RHADI_STICK = createItem("deep_trenches:rhadi_stick", WOODS);
		SANGUART_STICK = createItem("deep_trenches:sanguart_stick", WOODS);
		SCARLET_THIORCEN_STICK = createItem("deep_trenches:scarlet_thiorcen_stick", WOODS);
		SEQUOIA_STICK = createItem("deep_trenches:sequoia_stick", WOODS);
		SPROOM_STICK = createItem("deep_trenches:sproom_stick", WOODS);
		STORTREEAN_STICK = createItem("deep_trenches:stortreean_stick", WOODS);
		STROOMEAN_STICK = createItem("deep_trenches:stroomean_stick", WOODS);
		SUNRISE_FUNGUS_STICK = createItem("deep_trenches:sunrise_fungus_stick", WOODS);
		TARK_STICK = createItem("deep_trenches:tark_stick", WOODS);
		TEAK_STICK = createItem("deep_trenches:teak_stick", WOODS);
		THUNDERCLOUD_PLUM_STICK = createItem("deep_trenches:thundercloud_plum_stick", WOODS);
		VYNHERT_STICK = createItem("deep_trenches:vynhert_stick", WOODS);
		WART_TREE_STICK = createItem("deep_trenches:wart_tree_stick", WOODS);
		WENGE_STICK = createItem("deep_trenches:wenge_stick", WOODS);
		YEW_STICK = createItem("deep_trenches:yew_stick", WOODS);

		/* -------------------------------- FOOD ------------------------------------------- */
		BARBELED_LOOSEJAW = createFood("deep_trenches:barbeled_loosejaw", STORCEAN_FISH);
		BETTA = createFood("deep_trenches:betta", STORCEAN_FISH);
		BLACK_LOOSEJAW = createFood("deep_trenches:black_loosejaw", STORCEAN_FISH);
		DEEP_LAKE_BETTA = createFood("deep_trenches:deep_lake_betta", STORCEAN_FISH);
		GIANT_HATCHETFISH = createFood("deep_trenches:giant_hatchetfish", DTFoodComponents.GIANT_HATCHETFISH);
		LIGHT_LOOSEJAW = createFood("deep_trenches:light_loosejaw", STORCEAN_FISH);
		SMALLTOOTH_DRAGONFISH =  createFood("deep_trenches:smalltooth_dragonfish", STORCEAN_FISH);

		/* -------------------------------- COOKED FOOD ------------------------------------------- */
		COOKED_GIANT_HATCHETFISH = createFood("deep_trenches:cooked_giant_hatchetfish", DTFoodComponents.COOKED_GIANT_HATCHETFISH);

		/* -------------------------------- GOO's ------------------------------------------- */
		CYAN_BIOLUMINESCENT_GOO = createItem("deep_trenches:cyan_bioluminescent_goo", MISC);
		GREEN_BIOLUMINESCENT_GOO = createItem("deep_trenches:green_bioluminescent_goo", MISC);
		LIGHT_BLUE_BIOLUMINESCENT_GOO = createItem("deep_trenches:light_blue_bioluminescent_goo", MISC);

		/* -------------------------------- WEAPONS ------------------------------------------- */
		ADAIGGER = register("deep_trenches:adaigger", new AdaiggerItem(DTToolMaterials.GYLDELION, 4, 4F, new Settings().group(COMBAT)));
		BORON_TROOKENT = register("deep_trenches:boron_trookent", new TrookentItem(DTToolMaterials.BORON, 4, 4F, new Settings().group(COMBAT)));
		MORGANITE_SABER = register("deep_trenches:morganite_saber", new TrookentItem(DTToolMaterials.MORGANITE, 4, 4F, new Settings().group(COMBAT)));
		SAPPHIRE_PRISMACE = register("deep_trenches:sapphire_prismace", new PrismaceItem(new Settings().group(COMBAT)));

		BORON_SWORD = createSword("deep_trenches:boron_sword", DTToolMaterials.BORON, 4, -2.2F);
		CHALCEDONY_SWORD = createSword("deep_trenches:chalcedony_sword", DTToolMaterials.CHALCEDONY, 4, -2.2F);
		ENSTATITE_SWORD = createSword("deep_trenches:enstatite_sword", DTToolMaterials.ENSTATITE, 3, -2.4F);
		KRALCTIUM_SWORD = createSword("deep_trenches:kralctium_sword", DTToolMaterials.KRALCTIUM, 3, -2.4F);
		SAPPHIRE_SWORD = createSword("deep_trenches:sapphire_sword", DTToolMaterials.SAPPHIRE, 4, -2.2F);
		RUBY_DISTABBER = createSword("deep_trenches:ruby_distabber", DTToolMaterials.RUBY, 3, -2.4F);
		SPHENE_SWORD = createSword("deep_trenches:sphene_sword", DTToolMaterials.SPHENE, 3, -2.4F);
		SPINEL_SWORD = createSword("deep_trenches:spinel_sword", DTToolMaterials.SPINEL, 3, -2.4F);
		STROXITE_SWORD = createSword("deep_trenches:stroxite_sword", DTToolMaterials.STROXITE, 3, -2.4F);
		TANZANITE_SWORD = createSword("deep_trenches:tanzanite_sword", DTToolMaterials.TANZANITE, 3, -2.4F);
		TOPAZ_SWORD = createSword("deep_trenches:topaz_sword", DTToolMaterials.TOPAZ, 3, -2.4F);

		AQUAMARINE_SCYTHE = createScythe("deep_trenches:aquamarine_scythe", DTToolMaterials.AQUAMARINE, 7, -2.1F);
		BORON_SCYTHE = createScythe("deep_trenches:boron_scythe", DTToolMaterials.BORON, 7, -2.1F);
		DIOPSIDE_SCYTHE = createScythe("deep_trenches:diopside_scythe", DTToolMaterials.DIOPSIDE, 7, -2.1F);
		GYLDELION_SCYTHE = createScythe("deep_trenches:gyldelion_scythe", DTToolMaterials.GYLDELION, 8, 2.1F);
		NETHERITE_SCYTHE = createScythe("deep_trenches:netherite_scythe", ToolMaterials.NETHERITE, 7, -2.1F);
		RUBY_DISRAPPER = register("deep_trenches:ruby_disrapper", new DisrapperItem(DTToolMaterials.RUBY, 4, 4F, new Settings().group(COMBAT)));
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

		/* --------------------------------- TOOLS -------------------------------------------- */
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

		/* ------------------------------------- ARMOR ----------------------------------------------- */
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

		/* -------------------- TALISMANS -------------------------------- */
		AQUAMARINE_TALISMAN = createItem("deep_trenches:aquamarine_talisman", COMBAT);
		SPHENE_TALISMAN = createItem("deep_trenches:sphene_talisman", COMBAT);
		TANZANITE_TALISMAN = createItem("deep_trenches:tanzanite_talisman", COMBAT);

		/* -------------------- JEWELRY -------------------------------- */
		BLACK_PEARL = createItem("deep_trenches:black_pearl", MISC);

		/* -------------------- ORES -------------------------------- */
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

		/* ------------ INGOTS ------------- */
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

		/* ------------ NUGGETS ------------- */
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

		/* ------------ POWDERS ------------- */
		URANIUM_POWDER = createItem("deep_trenches:uranium_powder", MISC);
		URANOLUMEN_POWDER = createItem("deep_trenches:uranolumen_powder", MISC);

		/* -------------------------------- GYNDELION ------------------------------------------- */
		GYLDELION_DYE = createItem("deep_trenches:gyldelion_dye", MISC);
		createBlockItem("deep_trenches:gyldelion_block", GYLDELION_BLOCK, MISC);

		/* -------------------------------- MOB DROPS ------------------------------------------- */
		LOOSEJAW_TOOTH = createItem("deep_trenches:loosejaw_tooth", MISC);
	}

}
