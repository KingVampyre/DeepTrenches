package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.common.block.CustomSignBlock;
import github.KingVampyre.DeepTrenches.common.block.CustomWallSignBlock;
import github.KingVampyre.DeepTrenches.common.block.HorizontalBlock;
import github.KingVampyre.DeepTrenches.core.block.*;
import github.Louwind.Features.impl.block.FeaturesSaplingBlock;
import github.Louwind.Features.impl.block.sapling.FeaturesSaplingGenerator;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.SignType;
import net.minecraft.util.registry.Registry;

import java.util.function.Function;

import static github.KingVampyre.DeepTrenches.core.init.ModMaterials.FUNGUS;
import static github.KingVampyre.DeepTrenches.core.init.StatusEffects.*;
import static net.minecraft.block.Blocks.*;
import static net.minecraft.block.PressurePlateBlock.ActivationRule.EVERYTHING;
import static net.minecraft.entity.effect.StatusEffects.*;
import static net.minecraft.util.registry.Registry.BLOCK;

public class ModBlocks {

	public static final Block CYAN_BIOLUMINESCENT_BLOCK;
	public static final Block GREEN_BIOLUMINESCENT_BLOCK;
	public static final Block LIGHT_BLUE_BIOLUMINESCENT_BLOCK;

	public static final Block AIRIAL_MOSS;
	public static final Block BLACK_MARBLE;
	public static final Block BLUE_STORCERACK;
	public static final Block DRITEAN;
	public static final Block ENROTIUM;
	public static final Block GYLDELION_BLOCK;

	public static final Block LIGHT_OPALITE;
	public static final Block LUSHINE;
	public static final Block LUSHINE_PILLAR;
	public static final Block LUSTRITE;
	public static final Block MARINE_SNOW;
	public static final Block MOSOIL;
	public static final Block OPALITE;
	public static final Block POININE;
	public static final Block RHODONITE;
	public static final Block SPRILIUM;
	public static final Block SKYSOIL;
	public static final Block SKYSTONE;
	public static final Block STORCEAN_MARINE_SNOW;
	public static final Block STORCENDITE;
	public static final Block STORCERACK;
	public static final Block VERDINE;

	public static final Block BLACK_LILY;
	public static final Block BLACK_PANSY;
	public static final Block BLUE_PANSY;
	public static final Block BLUE_POPPY;
	public static final Block BLUE_VIOLET;
	public static final Block BONNET_SPURGE;
	public static final Block BROWN_PANSY;
	public static final Block BULLTHORN;
	public static final Block CACTLOW;
	public static final Block CHOCOLATE_COSMOS_FLOWER;
	public static final Block CLAWBULB;
	public static final Block CYAN_BLUE_VIOLET;
	public static final Block CYCAWLER;
	public static final Block GARDEN_PINKS;
	public static final Block GREEN_PANSY;
	public static final Block GYLDELION_FLOWER;
	public static final Block LIME_SPURGE;
	public static final Block LUPIN_FLOWER;
	public static final Block MARSH_VIOLET;
	public static final Block MURKSTEM;
	public static final Block NATIVE_VIOLET;
	public static final Block OPIUM_POPPY;
	public static final Block ORANGE_LILY;
	public static final Block PIGAL;
	public static final Block PINK_AND_ORANGE_PANSY;
	public static final Block PINK_BRAITOR_FLOWER;
	public static final Block PINK_MARSH_VIOLET;
	public static final Block PINK_ROSE;
	public static final Block PINK_ROSE_BUSH;
	public static final Block POPPY;
	public static final Block PURPLE_AND_ORANGE_PANSY;
	public static final Block PURPROUND;
	public static final Block RED_BRAITOR_FLOWER;
	public static final Block RED_CHOCOLATE_COSMOS_FLOWER;
	public static final Block RED_PANSY;
	public static final Block RED_ROSE;
	public static final Block RUBRA_BLUE_VIOLET;
	public static final Block SKALK;
	public static final Block SPIDREET;
	public static final Block SPIKE_LAVENDER;
	public static final Block SPRIDELION;
	public static final Block SPRINLY;
	public static final Block SPROOM_SPIKE;
	public static final Block SQUISACLE;
	public static final Block SWEET_VIOLET;
	public static final Block TOPPED_LAVENDER;
	public static final Block VASLAME;
	public static final Block VELVET_LILY;
	public static final Block WEEPISTIL;
	public static final Block WEEPY_HOLLOWER;
	public static final Block WHITE_VIOLET;
	public static final Block WILD_PANSY;
	public static final Block YELLOW_VIOLET;

	public static final Block AIRIAL_BUSH;
	public static final Block HARSHLES;
	public static final Block REEBLOON;
	public static final Block SQUISH_TIPS;

	public static final Block STASP_NEST;

	public static final Block GIANT_VIOLET;
	public static final Block GIANT_VIOLET_LEAF;
	public static final Block GIANT_VIOLET_PETAL;
	public static final Block GIANT_VIOLET_PISTIL;

	public static final Block ABYSSOPELAGIC_WATER;
	public static final Block ACID;
	public static final Block BATHYPELAGIC_WATER;
	public static final Block BRINE;
	public static final Block CLEAR_WATER;
	public static final Block HADOPELAGIC_WATER;
	public static final Block MESOPELAGIC_WATER;
	public static final Block STORCEAN_ABYSSOPELAGIC_WATER;
	public static final Block STORCEAN_BATHYPELAGIC_WATER;
	public static final Block STORCEAN_ENDERPELAGIC_WATER;
	public static final Block STORCEAN_GASOPELAGIC_WATER;
	public static final Block STORCEAN_HADOPELAGIC_WATER;
	public static final Block STORCEAN_INFINIPELAGIC_WATER;
	public static final Block STORCEAN_MESOPELAGIC_WATER;
	public static final Block STORCEAN_VIRDIPELAGIC_WATER;
	public static final Block STORCEAN_WATER;

	public static final Block DEAD_BLACKGREEN_TREE_CORAL;
	public static final Block DEAD_BLACKGREEN_TREE_CORAL_BLOCK;
	public static final Block DEAD_BLACKGREEN_TREE_CORAL_FAN;
	public static final Block DEAD_BLACKGREEN_TREE_CORAL_WALL_FAN;

	public static final Block BLACKGREEN_TREE_CORAL;
	public static final Block BLACKGREEN_TREE_CORAL_BLOCK;
	public static final Block BLACKGREEN_TREE_CORAL_FAN;
	public static final Block BLACKGREEN_TREE_CORAL_WALL_FAN;
	
	public static final Block DEAD_BROCCOLI_CORAL;
	public static final Block DEAD_BROCCOLI_CORAL_BLOCK;
	public static final Block DEAD_BROCCOLI_CORAL_BUBBLES;
	public static final Block DEAD_BROCCOLI_CORAL_FAN;
	public static final Block DEAD_BROCCOLI_CORAL_WALL_FAN;

	public static final Block BROCCOLI_CORAL;
	public static final Block BROCCOLI_CORAL_BLOCK;
	public static final Block BROCCOLI_CORAL_BUBBLES;
	public static final Block BROCCOLI_CORAL_FAN;
	public static final Block BROCCOLI_CORAL_WALL_FAN;

	public static final Block DEAD_BUBBLEGUM_CORAL;
	public static final Block DEAD_BUBBLEGUM_CORAL_BLOCK;
	public static final Block DEAD_BUBBLEGUM_CORAL_FAN;
	public static final Block DEAD_BUBBLEGUM_CORAL_WALL_FAN;

	public static final Block BUBBLEGUM_CORAL;
	public static final Block BUBBLEGUM_CORAL_BLOCK;
	public static final Block BUBBLEGUM_CORAL_FAN;
	public static final Block BUBBLEGUM_CORAL_WALL_FAN;

	public static final Block DEAD_CABBAGE_TREE_CORAL;
	public static final Block DEAD_CABBAGE_TREE_CORAL_BLOCK;
	public static final Block DEAD_CABBAGE_TREE_CORAL_FAN;
	public static final Block DEAD_CABBAGE_TREE_CORAL_WALL_FAN;

	public static final Block CABBAGE_TREE_CORAL;
	public static final Block CABBAGE_TREE_CORAL_BLOCK;
	public static final Block CABBAGE_TREE_CORAL_FAN;
	public static final Block CABBAGE_TREE_CORAL_WALL_FAN;
	
	public static final Block DEAD_FLOWERTUBE_CORAL;
	public static final Block DEAD_FLOWERTUBE_CORAL_BLOCK;
	public static final Block DEAD_FLOWERTUBE_CORAL_FAN;
	public static final Block DEAD_FLOWERTUBE_CORAL_WALL_FAN;

	public static final Block FLOWERTUBE_CORAL;
	public static final Block FLOWERTUBE_CORAL_BLOCK;
	public static final Block FLOWERTUBE_CORAL_FAN;
	public static final Block FLOWERTUBE_CORAL_WALL_FAN;
	
	public static final Block DEAD_GARNET_SPIRAL_CORAL;
	public static final Block DEAD_GARNET_SPIRAL_CORAL_BLOCK;
	public static final Block DEAD_GARNET_SPIRAL_CORAL_FAN;
	public static final Block DEAD_GARNET_SPIRAL_CORAL_WALL_FAN;

	public static final Block GARNET_SPIRAL_CORAL;
	public static final Block GARNET_SPIRAL_CORAL_BLOCK;
	public static final Block GARNET_SPIRAL_CORAL_FAN;
	public static final Block GARNET_SPIRAL_CORAL_WALL_FAN;
	
	public static final Block DEAD_GLOW_FOREST_CORAL;
	public static final Block DEAD_GLOW_FOREST_CORAL_BLOCK;
	public static final Block DEAD_GLOW_FOREST_CORAL_FAN;
	public static final Block DEAD_GLOW_FOREST_CORAL_WALL_FAN;

	public static final Block GLOW_FOREST_CORAL;
	public static final Block GLOW_FOREST_CORAL_BLOCK;
	public static final Block GLOW_FOREST_CORAL_FAN;
	public static final Block GLOW_FOREST_CORAL_WALL_FAN;
	
	public static final Block DEAD_GLOWTONGUE_TUBE_CORAL;
	public static final Block DEAD_GLOWTONGUE_TUBE_CORAL_BLOCK;
	public static final Block DEAD_GLOWTONGUE_TUBE_CORAL_FAN;
	public static final Block DEAD_GLOWTONGUE_TUBE_CORAL_WALL_FAN;

	public static final Block GLOWTONGUE_TUBE_CORAL;
	public static final Block GLOWTONGUE_TUBE_CORAL_BLOCK;
	public static final Block GLOWTONGUE_TUBE_CORAL_FAN;
	public static final Block GLOWTONGUE_TUBE_CORAL_WALL_FAN;
	
	public static final Block DEAD_IVORY_CORAL;
	public static final Block DEAD_IVORY_CORAL_BLOCK;
	public static final Block DEAD_IVORY_CORAL_FAN;
	public static final Block DEAD_IVORY_CORAL_WALL_FAN;

	public static final Block IVORY_CORAL;
	public static final Block IVORY_CORAL_BLOCK;
	public static final Block IVORY_CORAL_FAN;
	public static final Block IVORY_CORAL_WALL_FAN;
	
	public static final Block DEAD_LIME_BRAIN_CORAL;
	public static final Block DEAD_LIME_BRAIN_CORAL_BLOCK;
	public static final Block DEAD_LIME_BRAIN_CORAL_FAN;
	public static final Block DEAD_LIME_BRAIN_CORAL_WALL_FAN;

	public static final Block LIME_BRAIN_CORAL;
	public static final Block LIME_BRAIN_CORAL_BLOCK;
	public static final Block LIME_BRAIN_CORAL_FAN;
	public static final Block LIME_BRAIN_CORAL_WALL_FAN;
	
	public static final Block DEAD_LOPHELIA_CORAL;
	public static final Block DEAD_LOPHELIA_CORAL_BLOCK;
	public static final Block DEAD_LOPHELIA_CORAL_FAN;
	public static final Block DEAD_LOPHELIA_CORAL_WALL_FAN;

	public static final Block LOPHELIA_CORAL;
	public static final Block LOPHELIA_CORAL_BLOCK;
	public static final Block LOPHELIA_CORAL_FAN;
	public static final Block LOPHELIA_CORAL_WALL_FAN;
		
	public static final Block DEAD_PIPE_ORGAN_CORAL;
	public static final Block DEAD_PIPE_ORGAN_CORAL_BLOCK;
	public static final Block DEAD_PIPE_ORGAN_CORAL_FAN;
	public static final Block DEAD_PIPE_ORGAN_TENTACLES;
	public static final Block DEAD_PIPE_ORGAN_CORAL_WALL_FAN;

	public static final Block PIPE_ORGAN_CORAL;
	public static final Block PIPE_ORGAN_CORAL_BLOCK;
	public static final Block PIPE_ORGAN_CORAL_FAN;
	public static final Block PIPE_ORGAN_CORAL_WALL_FAN;
	public static final Block PIPE_ORGAN_TENTACLES;
	
	public static final Block DEAD_RED_TREE_CORAL;
	public static final Block DEAD_RED_TREE_CORAL_BLOCK;
	public static final Block DEAD_RED_TREE_CORAL_FAN;
	public static final Block DEAD_RED_TREE_CORAL_WALL_FAN;

	public static final Block RED_TREE_CORAL;
	public static final Block RED_TREE_CORAL_BLOCK;
	public static final Block RED_TREE_CORAL_FAN;
	public static final Block RED_TREE_CORAL_WALL_FAN;
	
	public static final Block DEAD_SEAFAN_CORAL;
	public static final Block DEAD_SEAFAN_CORAL_BLOCK;
	public static final Block DEAD_SEAFAN_CORAL_FAN;
	public static final Block DEAD_SEAFAN_CORAL_WALL_FAN;

	public static final Block SEAFAN_CORAL;
	public static final Block SEAFAN_CORAL_BLOCK;
	public static final Block SEAFAN_CORAL_FAN;
	public static final Block SEAFAN_CORAL_WALL_FAN;
	
	public static final Block DEAD_STRAIGHT_WILLOW_CORAL;
	public static final Block DEAD_STRAIGHT_WILLOW_CORAL_BLOCK;
	public static final Block DEAD_STRAIGHT_WILLOW_CORAL_FAN;
	public static final Block DEAD_STRAIGHT_WILLOW_CORAL_WALL_FAN;

	public static final Block STRAIGHT_WILLOW_CORAL;
	public static final Block STRAIGHT_WILLOW_CORAL_BLOCK;
	public static final Block STRAIGHT_WILLOW_CORAL_FAN;
	public static final Block STRAIGHT_WILLOW_CORAL_WALL_FAN;
	
	public static final Block DEAD_SUNRISE_CORAL;
	public static final Block DEAD_SUNRISE_CORAL_BLOCK;
	public static final Block DEAD_SUNRISE_CORAL_FAN;
	public static final Block DEAD_SUNRISE_CORAL_WALL_FAN;

	public static final Block SUNRISE_CORAL;
	public static final Block SUNRISE_CORAL_BLOCK;
	public static final Block SUNRISE_CORAL_FAN;
	public static final Block SUNRISE_CORAL_WALL_FAN;
	
	public static final Block DEAD_TABLE_CORAL;
	public static final Block DEAD_TABLE_CORAL_BLOCK;
	public static final Block DEAD_TABLE_CORAL_FAN;
	public static final Block DEAD_TABLE_CORAL_WALL_FAN;

	public static final Block TABLE_CORAL;
	public static final Block TABLE_CORAL_BLOCK;
	public static final Block TABLE_CORAL_FAN;
	public static final Block TABLE_CORAL_WALL_FAN;
	
	public static final Block DEAD_THIN_BLADE_CORAL;
	public static final Block DEAD_THIN_BLADE_CORAL_BLOCK;
	public static final Block DEAD_THIN_BLADE_CORAL_FAN;
	public static final Block DEAD_THIN_BLADE_CORAL_WALL_FAN;

	public static final Block THIN_BLADE_CORAL;
	public static final Block THIN_BLADE_CORAL_BLOCK;
	public static final Block THIN_BLADE_CORAL_FAN;
	public static final Block THIN_BLADE_CORAL_WALL_FAN;
	
	public static final Block DEAD_TRUMPETEAR_CORAL;
	public static final Block DEAD_TRUMPETEAR_CORAL_BLOCK;
	public static final Block DEAD_TRUMPETEAR_CORAL_FAN;
	public static final Block DEAD_TRUMPETEAR_CORAL_WALL_FAN;

	public static final Block TRUMPETEAR_CORAL;
	public static final Block TRUMPETEAR_CORAL_BLOCK;
	public static final Block TRUMPETEAR_CORAL_FAN;
	public static final Block TRUMPETEAR_CORAL_WALL_FAN;

	public static final Block ALMOND_BUTTON;
	public static final Block ALMOND_DOOR;
	public static final Block ALMOND_FENCE;
	public static final Block ALMOND_FENCE_GATE;
	public static final Block ALMOND_LEAVES;
	public static final Block ALMOND_LOG;
	public static final Block ALMOND_PLANKS;
	public static final Block ALMOND_PRESSURE_PLATE;
	public static final Block ALMOND_SAPLING;
	public static final Block ALMOND_SIGN;
	public static final Block ALMOND_SLAB;
	public static final Block ALMOND_STAIRS;
	public static final Block ALMOND_TRAPDOOR;
	public static final Block ALMOND_WALL_SIGN;
	public static final Block ALMOND_WOOD;
	
	public static final Block ANAMEATA_BUTTON;
	public static final Block ANAMEATA_CAP;
	public static final Block ANAMEATA_DOOR;
	public static final Block ANAMEATA_FENCE;
	public static final Block ANAMEATA_FENCE_GATE;
	public static final Block ANAMEATA_LOG;
	public static final Block ANAMEATA_PLANKS;
	public static final Block ANAMEATA_PRESSURE_PLATE;
	public static final Block ANAMEATA_SAPLING;
	public static final Block ANAMEATA_SIGN;
	public static final Block ANAMEATA_SLAB;
	public static final Block ANAMEATA_STAIRS;
	public static final Block ANAMEATA_TRAPDOOR;
	public static final Block ANAMEATA_WALL_SIGN;
	public static final Block ANAMEATA_WOOD;

	public static final Block ANGELS_TRUMPET_BUTTON;
	public static final Block ANGELS_TRUMPET_DOOR;
	public static final Block ANGELS_TRUMPET_FENCE;
	public static final Block ANGELS_TRUMPET_FENCE_GATE;
	public static final Block ANGELS_TRUMPET_LEAVES;
	public static final Block ANGELS_TRUMPET_LOG;
	public static final Block ANGELS_TRUMPET_PLANKS;
	public static final Block ANGELS_TRUMPET_PRESSURE_PLATE;
	public static final Block ANGELS_TRUMPET_SAPLING;
	public static final Block ANGELS_TRUMPET_SIGN;
	public static final Block ANGELS_TRUMPET_SLAB;
	public static final Block ANGELS_TRUMPET_STAIRS;
	public static final Block ANGELS_TRUMPET_TRAPDOOR;
	public static final Block ANGELS_TRUMPET_WALL_SIGN;
	public static final Block ANGELS_TRUMPET_WOOD;
	
	public static final Block AQUEAN_BUTTON;
	public static final Block AQUEAN_DOOR;
	public static final Block AQUEAN_FENCE;
	public static final Block AQUEAN_FENCE_GATE;
	public static final Block AQUEAN_LEAVES;
	public static final Block AQUEAN_LOG;
	public static final Block AQUEAN_PLANKS;
	public static final Block AQUEAN_PRESSURE_PLATE;
	public static final Block AQUEAN_SAPLING;
	public static final Block AQUEAN_SIGN;
	public static final Block AQUEAN_SLAB;
	public static final Block AQUEAN_STAIRS;
	public static final Block AQUEAN_TRAPDOOR;
	public static final Block AQUEAN_WALL_SIGN;
	public static final Block AQUEAN_WOOD;
	
	public static final Block BARSHROOKLE_BUTTON;
	public static final Block BARSHROOKLE_CAP;
	public static final Block BARSHROOKLE_DOOR;
	public static final Block BARSHROOKLE_FENCE;
	public static final Block BARSHROOKLE_FENCE_GATE;
	public static final Block BARSHROOKLE_LOG;
	public static final Block BARSHROOKLE_PLANKS;
	public static final Block BARSHROOKLE_PRESSURE_PLATE;
	public static final Block BARSHROOKLE_SAPLING;
	public static final Block BARSHROOKLE_SIGN;
	public static final Block BARSHROOKLE_SLAB;
	public static final Block BARSHROOKLE_STAIRS;
	public static final Block BARSHROOKLE_TRAPDOOR;
	public static final Block BARSHROOKLE_WALL_SIGN;
	public static final Block BARSHROOKLE_WOOD;
	
	public static final Block BLACK_BIRCH_BUTTON;
	public static final Block BLACK_BIRCH_DOOR;
	public static final Block BLACK_BIRCH_FENCE;
	public static final Block BLACK_BIRCH_FENCE_GATE;
	public static final Block BLACK_BIRCH_LEAVES;
	public static final Block BLACK_BIRCH_LOG;
	public static final Block BLACK_BIRCH_PLANKS;
	public static final Block BLACK_BIRCH_PRESSURE_PLATE;
	public static final Block BLACK_BIRCH_SAPLING;
	public static final Block BLACK_BIRCH_SIGN;
	public static final Block BLACK_BIRCH_SLAB;
	public static final Block BLACK_BIRCH_STAIRS;
	public static final Block BLACK_BIRCH_TRAPDOOR;
	public static final Block BLACK_BIRCH_WALL_SIGN;
	public static final Block BLACK_BIRCH_WOOD;

	public static final Block BLUE_MAHOE_BUTTON;
	public static final Block BLUE_MAHOE_DOOR;
	public static final Block BLUE_MAHOE_FENCE;
	public static final Block BLUE_MAHOE_FENCE_GATE;
	public static final Block BLUE_MAHOE_FLOWER;
	public static final Block BLUE_MAHOE_LEAVES;
	public static final Block BLUE_MAHOE_LOG;
	public static final Block BLUE_MAHOE_PLANKS;
	public static final Block BLUE_MAHOE_PRESSURE_PLATE;
	public static final Block BLUE_MAHOE_SAPLING;
	public static final Block BLUE_MAHOE_SIGN;
	public static final Block BLUE_MAHOE_SLAB;
	public static final Block BLUE_MAHOE_STAIRS;
	public static final Block BLUE_MAHOE_TRAPDOOR;
	public static final Block BLUE_MAHOE_WALL_SIGN;
	public static final Block BLUE_MAHOE_WOOD;

	public static final Block BLUE_SPRUCE_BUTTON;
	public static final Block BLUE_SPRUCE_DOOR;
	public static final Block BLUE_SPRUCE_FENCE;
	public static final Block BLUE_SPRUCE_FENCE_GATE;
	public static final Block BLUE_SPRUCE_LEAVES;
	public static final Block BLUE_SPRUCE_LOG;
	public static final Block BLUE_SPRUCE_PLANKS;
	public static final Block BLUE_SPRUCE_PRESSURE_PLATE;
	public static final Block BLUE_SPRUCE_SAPLING;
	public static final Block BLUE_SPRUCE_SIGN;
	public static final Block BLUE_SPRUCE_SLAB;
	public static final Block BLUE_SPRUCE_STAIRS;
	public static final Block BLUE_SPRUCE_TRAPDOOR;
	public static final Block BLUE_SPRUCE_WALL_SIGN;
	public static final Block BLUE_SPRUCE_WOOD;

	public static final Block BOTTLEBRUSH_BUTTON;
	public static final Block BOTTLEBRUSH_DOOR;
	public static final Block BOTTLEBRUSH_FENCE;
	public static final Block BOTTLEBRUSH_FENCE_GATE;
	public static final Block BOTTLEBRUSH_FLOWERS;
	public static final Block BOTTLEBRUSH_LEAVES;
	public static final Block BOTTLEBRUSH_LOG;
	public static final Block BOTTLEBRUSH_PLANKS;
	public static final Block BOTTLEBRUSH_PRESSURE_PLATE;
	public static final Block BOTTLEBRUSH_SAPLING;
	public static final Block BOTTLEBRUSH_SIGN;
	public static final Block BOTTLEBRUSH_SLAB;
	public static final Block BOTTLEBRUSH_STAIRS;
	public static final Block BOTTLEBRUSH_TRAPDOOR;
	public static final Block BOTTLEBRUSH_WALL_SIGN;
	public static final Block BOTTLEBRUSH_WOOD;

	public static final Block BROMYA_BUTTON;
	public static final Block BROMYA_DOOR;
	public static final Block BROMYA_FENCE;
	public static final Block BROMYA_FENCE_GATE;
	public static final Block BROMYA_FLOWER;
	public static final Block BROMYA_LEAVES;
	public static final Block BROMYA_LOG;
	public static final Block BROMYA_PLANKS;
	public static final Block BROMYA_PRESSURE_PLATE;
	public static final Block BROMYA_SAPLING;
	public static final Block BROMYA_SIGN;
	public static final Block BROMYA_SLAB;
	public static final Block BROMYA_STAIRS;
	public static final Block BROMYA_TRAPDOOR;
	public static final Block BROMYA_WALL_SIGN;
	public static final Block BROMYA_WOOD;

	public static final Block BUBBLETREE_BUBBLES;
	public static final Block BUBBLETREE_BUTTON;
	public static final Block BUBBLETREE_DOOR;
	public static final Block BUBBLETREE_FENCE;
	public static final Block BUBBLETREE_FENCE_GATE;
	public static final Block BUBBLETREE_LOG;
	public static final Block BUBBLETREE_PLANKS;
	public static final Block BUBBLETREE_PRESSURE_PLATE;
	public static final Block BUBBLETREE_SAPLING;
	public static final Block BUBBLETREE_SIGN;
	public static final Block BUBBLETREE_SLAB;
	public static final Block BUBBLETREE_STAIRS;
	public static final Block BUBBLETREE_TRAPDOOR;
	public static final Block BUBBLETREE_WALL_SIGN;
	public static final Block BUBBLETREE_WOOD;

	public static final Block CALCEARB_BUTTON;
	public static final Block CALCEARB_DOOR;
	public static final Block CALCEARB_FENCE;
	public static final Block CALCEARB_FENCE_GATE;
	public static final Block CALCEARB_LEAVES;
	public static final Block CALCEARB_LOG;
	public static final Block CALCEARB_PLANKS;
	public static final Block CALCEARB_PRESSURE_PLATE;
	public static final Block CALCEARB_SAPLING;
	public static final Block CALCEARB_SIGN;
	public static final Block CALCEARB_SLAB;
	public static final Block CALCEARB_STAIRS;
	public static final Block CALCEARB_TRAPDOOR;
	public static final Block CALCEARB_WALL_SIGN;
	public static final Block CALCEARB_WOOD;
	
	public static final Block CHERRY_BUTTON;
	public static final Block CHERRY_DOOR;
	public static final Block CHERRY_FENCE;
	public static final Block CHERRY_FENCE_GATE;
	public static final Block CHERRY_LEAVES;
	public static final Block CHERRY_LOG;
	public static final Block CHERRY_PLANKS;
	public static final Block CHERRY_PRESSURE_PLATE;
	public static final Block CHERRY_SAPLING;
	public static final Block CHERRY_SIGN;
	public static final Block CHERRY_SLAB;
	public static final Block CHERRY_STAIRS;
	public static final Block CHERRY_TRAPDOOR;
	public static final Block CHERRY_WALL_SIGN;
	public static final Block CHERRY_WOOD;

	public static final Block CHOTORN_BUTTON;
	public static final Block CHOTORN_DOOR;
	public static final Block CHOTORN_FENCE;
	public static final Block CHOTORN_FENCE_GATE;
	public static final Block CHOTORN_LOG;
	public static final Block CHOTORN_PLANKS;
	public static final Block CHOTORN_PRESSURE_PLATE;
	public static final Block CHOTORN_SAPLING;
	public static final Block CHOTORN_SIGN;
	public static final Block CHOTORN_SLAB;
	public static final Block CHOTORN_STAIRS;
	public static final Block CHOTORN_TRAPDOOR;
	public static final Block CHOTORN_WALL_SIGN;
	public static final Block CHOTORN_WOOD;
	
	public static final Block COOK_PINE_BUTTON;
	public static final Block COOK_PINE_DOOR;
	public static final Block COOK_PINE_FENCE;
	public static final Block COOK_PINE_FENCE_GATE;
	public static final Block COOK_PINE_LEAVES;
	public static final Block COOK_PINE_LOG;
	public static final Block COOK_PINE_PLANKS;
	public static final Block COOK_PINE_PRESSURE_PLATE;
	public static final Block COOK_PINE_SAPLING;
	public static final Block COOK_PINE_SIGN;
	public static final Block COOK_PINE_SLAB;
	public static final Block COOK_PINE_STAIRS;
	public static final Block COOK_PINE_TRAPDOOR;
	public static final Block COOK_PINE_WALL_SIGN;
	public static final Block COOK_PINE_WOOD;
	
	public static final Block CROLOOD_BUTTON;
	public static final Block CROLOOD_DOOR;
	public static final Block CROLOOD_FENCE;
	public static final Block CROLOOD_FENCE_GATE;
	public static final Block CROLOOD_LEAVES;
	public static final Block CROLOOD_LOG;
	public static final Block CROLOOD_PLANKS;
	public static final Block CROLOOD_PRESSURE_PLATE;
	public static final Block CROLOOD_SAPLING;
	public static final Block CROLOOD_SIGN;
	public static final Block CROLOOD_SLAB;
	public static final Block CROLOOD_STAIRS;
	public static final Block CROLOOD_TRAPDOOR;
	public static final Block CROLOOD_WALL_SIGN;
	public static final Block CROLOOD_WOOD;
		
	public static final Block DARK_CROLOOD_BUTTON;
	public static final Block DARK_CROLOOD_DOOR;
	public static final Block DARK_CROLOOD_FENCE;
	public static final Block DARK_CROLOOD_FENCE_GATE;
	public static final Block DARK_CROLOOD_LEAVES;
	public static final Block DARK_CROLOOD_LOG;
	public static final Block DARK_CROLOOD_PLANKS;
	public static final Block DARK_CROLOOD_PRESSURE_PLATE;
	public static final Block DARK_CROLOOD_SAPLING;
	public static final Block DARK_CROLOOD_SIGN;
	public static final Block DARK_CROLOOD_SLAB;
	public static final Block DARK_CROLOOD_STAIRS;
	public static final Block DARK_CROLOOD_TRAPDOOR;
	public static final Block DARK_CROLOOD_WALL_SIGN;
	public static final Block DARK_CROLOOD_WOOD;

	public static final Block DARK_FUCHSITRA_BUTTON;
	public static final Block DARK_FUCHSITRA_DOOR;
	public static final Block DARK_FUCHSITRA_FENCE;
	public static final Block DARK_FUCHSITRA_FENCE_GATE;
	public static final Block DARK_FUCHSITRA_LEAVES;
	public static final Block DARK_FUCHSITRA_LOG;
	public static final Block DARK_FUCHSITRA_PLANKS;
	public static final Block DARK_FUCHSITRA_PRESSURE_PLATE;
	public static final Block DARK_FUCHSITRA_SAPLING;
	public static final Block DARK_FUCHSITRA_SIGN;
	public static final Block DARK_FUCHSITRA_SLAB;
	public static final Block DARK_FUCHSITRA_STAIRS;
	public static final Block DARK_FUCHSITRA_TRAPDOOR;
	public static final Block DARK_FUCHSITRA_WALL_SIGN;
	public static final Block DARK_FUCHSITRA_WOOD;

	public static final Block DARK_RED_ELM_BUTTON;
	public static final Block DARK_RED_ELM_DOOR;
	public static final Block DARK_RED_ELM_FENCE;
	public static final Block DARK_RED_ELM_FENCE_GATE;
	public static final Block DARK_RED_ELM_LEAVES;
	public static final Block DARK_RED_ELM_LOG;
	public static final Block DARK_RED_ELM_PLANKS;
	public static final Block DARK_RED_ELM_PRESSURE_PLATE;
	public static final Block DARK_RED_ELM_SAPLING;
	public static final Block DARK_RED_ELM_SIGN;
	public static final Block DARK_RED_ELM_SLAB;
	public static final Block DARK_RED_ELM_STAIRS;
	public static final Block DARK_RED_ELM_TRAPDOOR;
	public static final Block DARK_RED_ELM_WALL_SIGN;
	public static final Block DARK_RED_ELM_WOOD;

	public static final Block DEAD_WART_TREE_BUTTON;
	public static final Block DEAD_WART_TREE_DOOR;
	public static final Block DEAD_WART_TREE_FENCE;
	public static final Block DEAD_WART_TREE_FENCE_GATE;
	public static final Block DEAD_WART_TREE_LOG;
	public static final Block DEAD_WART_TREE_PLANKS;
	public static final Block DEAD_WART_TREE_PRESSURE_PLATE;
	public static final Block DEAD_WART_TREE_SIGN;
	public static final Block DEAD_WART_TREE_SLAB;
	public static final Block DEAD_WART_TREE_STAIRS;
	public static final Block DEAD_WART_TREE_TRAPDOOR;
	public static final Block DEAD_WART_TREE_WALL_SIGN;
	public static final Block DEAD_WART_TREE_WOOD;

	public static final Block DRIGYUS;
	public static final Block DRIGYUS_BUTTON;
	public static final Block DRIGYUS_DOOR;
	public static final Block DRIGYUS_FENCE;
	public static final Block DRIGYUS_FENCE_GATE;
	public static final Block DRIGYUS_LOG;
	public static final Block DRIGYUS_PLANKS;
	public static final Block DRIGYUS_PRESSURE_PLATE;
	public static final Block DRIGYUS_SIGN;
	public static final Block DRIGYUS_SLAB;
	public static final Block DRIGYUS_STAIRS;
	public static final Block DRIGYUS_TRAPDOOR;
	public static final Block DRIGYUS_WALL_SIGN;
	public static final Block DRIGYUS_WOOD;
		
	public static final Block EBONY_BUTTON;
	public static final Block EBONY_DOOR;
	public static final Block EBONY_FENCE;
	public static final Block EBONY_FENCE_GATE;
	public static final Block EBONY_LEAVES;
	public static final Block EBONY_LOG;
	public static final Block EBONY_PLANKS;
	public static final Block EBONY_PRESSURE_PLATE;
	public static final Block EBONY_SAPLING;
	public static final Block EBONY_SIGN;
	public static final Block EBONY_SLAB;
	public static final Block EBONY_STAIRS;
	public static final Block EBONY_TRAPDOOR;
	public static final Block EBONY_WALL_SIGN;
	public static final Block EBONY_WOOD;

	public static final Block ENDERHEART_BUTTON;
	public static final Block ENDERHEART_DOOR;
	public static final Block ENDERHEART_FENCE;
	public static final Block ENDERHEART_FENCE_GATE;
	public static final Block ENDERHEART_LEAF;
	public static final Block ENDERHEART_LEAVES;
	public static final Block ENDERHEART_LOG;
	public static final Block ENDERHEART_PLANKS;
	public static final Block ENDERHEART_PRESSURE_PLATE;
	public static final Block ENDERHEART_SAPLING;
	public static final Block ENDERHEART_SIGN;
	public static final Block ENDERHEART_SLAB;
	public static final Block ENDERHEART_STAIRS;
	public static final Block ENDERHEART_TRAPDOOR;
	public static final Block ENDERHEART_WALL_SIGN;
	public static final Block ENDERHEART_WOOD;

	public static final Block FLALM;
	public static final Block FLALM_BUTTON;
	public static final Block FLALM_DOOR;
	public static final Block FLALM_FENCE;
	public static final Block FLALM_FENCE_GATE;
	public static final Block FLALM_PETAL_BLOCK;
	public static final Block FLALM_PLANKS;
	public static final Block FLALM_PRESSURE_PLATE;
	public static final Block FLALM_SIGN;
	public static final Block FLALM_SLAB;
	public static final Block FLALM_STAIRS;
	public static final Block FLALM_STEM;
	public static final Block FLALM_THORNS;
	public static final Block FLALM_TRAPDOOR;
	public static final Block FLALM_WALL_SIGN;
	public static final Block FLALM_WOOD;

	public static final Block FRUCE_BUTTON;
	public static final Block FRUCE_DOOR;
	public static final Block FRUCE_FENCE;
	public static final Block FRUCE_FENCE_GATE;
	public static final Block FRUCE_LEAVES;
	public static final Block FRUCE_LOG;
	public static final Block FRUCE_PLANKS;
	public static final Block FRUCE_PRESSURE_PLATE;
	public static final Block FRUCE_SAPLING;
	public static final Block FRUCE_SIGN;
	public static final Block FRUCE_SLAB;
	public static final Block FRUCE_STAIRS;
	public static final Block FRUCE_TRAPDOOR;
	public static final Block FRUCE_WALL_SIGN;
	public static final Block FRUCE_WOOD;

	public static final Block FUCHSITRA_BUTTON;
	public static final Block FUCHSITRA_DOOR;
	public static final Block FUCHSITRA_FENCE;
	public static final Block FUCHSITRA_FENCE_GATE;
	public static final Block FUCHSITRA_LEAVES;
	public static final Block FUCHSITRA_LOG;
	public static final Block FUCHSITRA_PLANKS;
	public static final Block FUCHSITRA_PRESSURE_PLATE;
	public static final Block FUCHSITRA_SAPLING;
	public static final Block FUCHSITRA_SIGN;
	public static final Block FUCHSITRA_SLAB;
	public static final Block FUCHSITRA_STAIRS;
	public static final Block FUCHSITRA_TRAPDOOR;
	public static final Block FUCHSITRA_WALL_SIGN;
	public static final Block FUCHSITRA_WOOD;

	public static final Block FUGMOS_BUTTON;
	public static final Block FUGMOS_DOOR;
	public static final Block FUGMOS_FENCE;
	public static final Block FUGMOS_FENCE_GATE;
	public static final Block FUGMOS_MOSS;
	public static final Block FUGMOS_PLANKS;
	public static final Block FUGMOS_PRESSURE_PLATE;
	public static final Block FUGMOS;
	public static final Block FUGMOS_SIGN;
	public static final Block FUGMOS_SLAB;
	public static final Block FUGMOS_STAIRS;
	public static final Block FUGMOS_STEM;
	public static final Block FUGMOS_TRAPDOOR;
	public static final Block FUGMOS_WALL_SIGN;
	public static final Block FUGMOS_WOOD;
	
	public static final Block FUNERANITE_BUTTON;
	public static final Block FUNERANITE_CAP;
	public static final Block FUNERANITE_DOOR;
	public static final Block FUNERANITE_FENCE;
	public static final Block FUNERANITE_FENCE_GATE;
	public static final Block FUNERANITE_LOG;
	public static final Block FUNERANITE_PLANKS;
	public static final Block FUNERANITE_PRESSURE_PLATE;
	public static final Block FUNERANITE_SAPLING;
	public static final Block FUNERANITE_SIGN;
	public static final Block FUNERANITE_SLAB;
	public static final Block FUNERANITE_STAIRS;
	public static final Block FUNERANITE_TRAPDOOR;
	public static final Block FUNERANITE_WALL_SIGN;
	public static final Block FUNERANITE_WOOD;
	
	public static final Block GHOSHROOM_BUTTON;
	public static final Block GHOSHROOM_CAP;
	public static final Block GHOSHROOM_DOOR;
	public static final Block GHOSHROOM_FENCE;
	public static final Block GHOSHROOM_FENCE_GATE;
	public static final Block GHOSHROOM_LOG;
	public static final Block GHOSHROOM_PLANKS;
	public static final Block GHOSHROOM_PRESSURE_PLATE;
	public static final Block GHOSHROOM_SAPLING;
	public static final Block GHOSHROOM_SIGN;
	public static final Block GHOSHROOM_SLAB;
	public static final Block GHOSHROOM_STAIRS;
	public static final Block GHOSHROOM_TRAPDOOR;
	public static final Block GHOSHROOM_WALL_SIGN;
	public static final Block GHOSHROOM_WOOD;

	public static final Block GIANT_VIOLET_BUTTON;
	public static final Block GIANT_VIOLET_DOOR;
	public static final Block GIANT_VIOLET_FENCE;
	public static final Block GIANT_VIOLET_FENCE_GATE;
	public static final Block GIANT_VIOLET_PLANKS;
	public static final Block GIANT_VIOLET_PRESSURE_PLATE;
	public static final Block GIANT_VIOLET_SIGN;
	public static final Block GIANT_VIOLET_SLAB;
	public static final Block GIANT_VIOLET_STAIRS;
	public static final Block GIANT_VIOLET_STEM;
	public static final Block GIANT_VIOLET_TRAPDOOR;
	public static final Block GIANT_VIOLET_WALL_SIGN;
	public static final Block GIANT_VIOLET_WOOD;

	public static final Block GUAIACUM_BUTTON;
	public static final Block GUAIACUM_DOOR;
	public static final Block GUAIACUM_FENCE;
	public static final Block GUAIACUM_FENCE_GATE;
	public static final Block GUAIACUM_FLOWERS;
	public static final Block GUAIACUM_LEAVES;
	public static final Block GUAIACUM_LOG;
	public static final Block GUAIACUM_PLANKS;
	public static final Block GUAIACUM_PRESSURE_PLATE;
	public static final Block GUAIACUM_SAPLING;
	public static final Block GUAIACUM_SIGN;
	public static final Block GUAIACUM_SLAB;
	public static final Block GUAIACUM_STAIRS;
	public static final Block GUAIACUM_TRAPDOOR;
	public static final Block GUAIACUM_WALL_SIGN;
	public static final Block GUAIACUM_WOOD;

	public static final Block JOSHUA_BUTTON;
	public static final Block JOSHUA_DOOR;
	public static final Block JOSHUA_FENCE;
	public static final Block JOSHUA_FENCE_GATE;
	public static final Block JOSHUA_LEAVES;
	public static final Block JOSHUA_LOG;
	public static final Block JOSHUA_PLANKS;
	public static final Block JOSHUA_PRESSURE_PLATE;
	public static final Block JOSHUA_SAPLING;
	public static final Block JOSHUA_SIGN;
	public static final Block JOSHUA_SLAB;
	public static final Block JOSHUA_STAIRS;
	public static final Block JOSHUA_TRAPDOOR;
	public static final Block JOSHUA_WALL_SIGN;
	public static final Block JOSHUA_WOOD;

	public static final Block KLINKII_PINE_BUTTON;
	public static final Block KLINKII_PINE_DOOR;
	public static final Block KLINKII_PINE_FENCE;
	public static final Block KLINKII_PINE_FENCE_GATE;
	public static final Block KLINKII_PINE_LEAVES;
	public static final Block KLINKII_PINE_LOG;
	public static final Block KLINKII_PINE_PLANKS;
	public static final Block KLINKII_PINE_PRESSURE_PLATE;
	public static final Block KLINKII_PINE_SAPLING;
	public static final Block KLINKII_PINE_SIGN;
	public static final Block KLINKII_PINE_SLAB;
	public static final Block KLINKII_PINE_STAIRS;
	public static final Block KLINKII_PINE_TRAPDOOR;
	public static final Block KLINKII_PINE_WALL_SIGN;
	public static final Block KLINKII_PINE_WOOD;

	public static final Block MELALEUCA_BUTTON;
	public static final Block MELALEUCA_DOOR;
	public static final Block MELALEUCA_FENCE;
	public static final Block MELALEUCA_FENCE_GATE;
	public static final Block MELALEUCA_LEAVES;
	public static final Block MELALEUCA_FLOWERS;
	public static final Block MELALEUCA_LOG;
	public static final Block MELALEUCA_PLANKS;
	public static final Block MELALEUCA_PRESSURE_PLATE;
	public static final Block MELALEUCA_SAPLING;
	public static final Block MELALEUCA_SIGN;
	public static final Block MELALEUCA_SLAB;
	public static final Block MELALEUCA_STAIRS;
	public static final Block MELALEUCA_TRAPDOOR;
	public static final Block MELALEUCA_WALL_SIGN;
	public static final Block MELALEUCA_WOOD;

	public static final Block MOSSY_YEW_LOG;

	public static final Block MURKANTUAN_BUTTON;
	public static final Block MURKANTUAN_DOOR;
	public static final Block MURKANTUAN_FENCE;
	public static final Block MURKANTUAN_FENCE_GATE;
	public static final Block MURKANTUAN_LEAVES;
	public static final Block MURKANTUAN_FLOWER;
	public static final Block MURKANTUAN_LOG;
	public static final Block MURKANTUAN_PLANKS;
	public static final Block MURKANTUAN_PRESSURE_PLATE;
	public static final Block MURKANTUAN_SAPLING;
	public static final Block MURKANTUAN_SIGN;
	public static final Block MURKANTUAN_SLAB;
	public static final Block MURKANTUAN_STAIRS;
	public static final Block MURKANTUAN_TRAPDOOR;
	public static final Block MURKANTUAN_WALL_SIGN;
	public static final Block MURKANTUAN_WOOD;

	public static final Block NORFOLK_PINE_BUTTON;
	public static final Block NORFOLK_PINE_DOOR;
	public static final Block NORFOLK_PINE_FENCE;
	public static final Block NORFOLK_PINE_FENCE_GATE;
	public static final Block NORFOLK_PINE_LEAVES;
	public static final Block NORFOLK_PINE_LOG;
	public static final Block NORFOLK_PINE_PLANKS;
	public static final Block NORFOLK_PINE_PRESSURE_PLATE;
	public static final Block NORFOLK_PINE_SAPLING;
	public static final Block NORFOLK_PINE_SIGN;
	public static final Block NORFOLK_PINE_SLAB;
	public static final Block NORFOLK_PINE_STAIRS;
	public static final Block NORFOLK_PINE_TRAPDOOR;
	public static final Block NORFOLK_PINE_WALL_SIGN;
	public static final Block NORFOLK_PINE_WOOD;

	public static final Block OBSCRUS;
	public static final Block OBSCRUS_BUTTON;
	public static final Block OBSCRUS_DOOR;
	public static final Block OBSCRUS_FENCE;
	public static final Block OBSCRUS_FENCE_GATE;
	public static final Block OBSCRUS_LEAVES;
	public static final Block OBSCRUS_LOG;
	public static final Block OBSCRUS_PLANKS;
	public static final Block OBSCRUS_PRESSURE_PLATE;
	public static final Block OBSCRUS_SIGN;
	public static final Block OBSCRUS_SLAB;
	public static final Block OBSCRUS_STAIRS;
	public static final Block OBSCRUS_TRAPDOOR;
	public static final Block OBSCRUS_WALL_SIGN;
	public static final Block OBSCRUS_WOOD;

	public static final Block ORHPRIS_BUTTON;
	public static final Block ORHPRIS_DOOR;
	public static final Block ORHPRIS_FENCE;
	public static final Block ORHPRIS_FENCE_GATE;
	public static final Block ORHPRIS_LEAVES;
	public static final Block ORHPRIS_LOG;
	public static final Block ORHPRIS_PLANKS;
	public static final Block ORHPRIS_PRESSURE_PLATE;
	public static final Block ORHPRIS_SAPLING;
	public static final Block ORHPRIS_SIGN;
	public static final Block ORHPRIS_SLAB;
	public static final Block ORHPRIS_STAIRS;
	public static final Block ORHPRIS_TRAPDOOR;
	public static final Block ORHPRIS_WALL_SIGN;
	public static final Block ORHPRIS_WOOD;
		
	public static final Block PELTOGYNE_BUTTON;
	public static final Block PELTOGYNE_DOOR;
	public static final Block PELTOGYNE_FENCE;
	public static final Block PELTOGYNE_FENCE_GATE;
	public static final Block PELTOGYNE_LEAVES;
	public static final Block PELTOGYNE_LOG;
	public static final Block PELTOGYNE_PLANKS;
	public static final Block PELTOGYNE_PRESSURE_PLATE;
	public static final Block PELTOGYNE_SAPLING;
	public static final Block PELTOGYNE_SIGN;
	public static final Block PELTOGYNE_SLAB;
	public static final Block PELTOGYNE_STAIRS;
	public static final Block PELTOGYNE_TRAPDOOR;
	public static final Block PELTOGYNE_WALL_SIGN;
	public static final Block PELTOGYNE_WOOD;
	
	public static final Block PIN_CHERRY_BUTTON;
	public static final Block PIN_CHERRY_DOOR;
	public static final Block PIN_CHERRY_FENCE;
	public static final Block PIN_CHERRY_FENCE_GATE;
	public static final Block PIN_CHERRY_LEAVES;
	public static final Block PIN_CHERRY_LOG;
	public static final Block PIN_CHERRY_PLANKS;
	public static final Block PIN_CHERRY_PRESSURE_PLATE;
	public static final Block PIN_CHERRY_SAPLING;
	public static final Block PIN_CHERRY_SIGN;
	public static final Block PIN_CHERRY_SLAB;
	public static final Block PIN_CHERRY_STAIRS;
	public static final Block PIN_CHERRY_TRAPDOOR;
	public static final Block PIN_CHERRY_WALL_SIGN;
	public static final Block PIN_CHERRY_WOOD;
	
	public static final Block PLUM_BUTTON;
	public static final Block PLUM_DOOR;
	public static final Block PLUM_FENCE;
	public static final Block PLUM_FENCE_GATE;
	public static final Block PLUM_LEAVES;
	public static final Block PLUM_LOG;
	public static final Block PLUM_PLANKS;
	public static final Block PLUM_PRESSURE_PLATE;
	public static final Block PLUM_SAPLING;
	public static final Block PLUM_SIGN;
	public static final Block PLUM_SLAB;
	public static final Block PLUM_STAIRS;
	public static final Block PLUM_TRAPDOOR;
	public static final Block PLUM_WALL_SIGN;
	public static final Block PLUM_WOOD;
		
	public static final Block PURFUNGA_BUTTON;
	public static final Block PURFUNGA_CAP;
	public static final Block PURFUNGA_DOOR;
	public static final Block PURFUNGA_FENCE;
	public static final Block PURFUNGA_FENCE_GATE;
	public static final Block PURFUNGA_LOG;
	public static final Block PURFUNGA_PLANKS;	
	public static final Block PURFUNGA_PRESSURE_PLATE;
	public static final Block PURFUNGA_SAPLING;
	public static final Block PURFUNGA_SIGN;
	public static final Block PURFUNGA_SLAB;
	public static final Block PURFUNGA_STAIRS;
	public static final Block PURFUNGA_TRAPDOOR;
	public static final Block PURFUNGA_WALL_SIGN;
	public static final Block PURFUNGA_WOOD;

	public static final Block RARK_BUTTON;
	public static final Block RARK_DOOR;
	public static final Block RARK_FENCE;
	public static final Block RARK_FENCE_GATE;
	public static final Block RARK_LEAVES;
	public static final Block RARK_LOG;
	public static final Block RARK_PLANKS;
	public static final Block RARK_PRESSURE_PLATE;
	public static final Block RARK_SAPLING;
	public static final Block RARK_SIGN;
	public static final Block RARK_SLAB;
	public static final Block RARK_STAIRS;
	public static final Block RARK_TRAPDOOR;
	public static final Block RARK_WALL_SIGN;
	public static final Block RARK_WOOD;

	public static final Block RED_ELM_BUTTON;
	public static final Block RED_ELM_DOOR;
	public static final Block RED_ELM_FENCE;
	public static final Block RED_ELM_FENCE_GATE;
	public static final Block RED_ELM_LEAVES;
	public static final Block RED_ELM_LOG;
	public static final Block RED_ELM_PLANKS;
	public static final Block RED_ELM_PRESSURE_PLATE;
	public static final Block RED_ELM_SAPLING;
	public static final Block RED_ELM_SIGN;
	public static final Block RED_ELM_SLAB;
	public static final Block RED_ELM_STAIRS;
	public static final Block RED_ELM_TRAPDOOR;
	public static final Block RED_ELM_WALL_SIGN;
	public static final Block RED_ELM_WOOD;

	public static final Block RHADI_BUTTON;
	public static final Block RHADI_DOOR;
	public static final Block RHADI_FENCE;
	public static final Block RHADI_FENCE_GATE;
	public static final Block RHADI_FRUIT;
	public static final Block CARVED_RHADI_FRUIT;
	public static final Block RHADI_LEAVES;
	public static final Block RHADI_LOG;
	public static final Block RHADI_O_LANTERN;
	public static final Block RHADI_PLANKS;
	public static final Block RHADI_PRESSURE_PLATE;
	public static final Block RHADI_SAPLING;
	public static final Block RHADI_SIGN;
	public static final Block RHADI_SLAB;
	public static final Block RHADI_STAIRS;
	public static final Block RHADI_THORNS;
	public static final Block RHADI_TRAPDOOR;
	public static final Block RHADI_WALL_SIGN;
	public static final Block RHADI_WOOD;

	public static final Block SANGUART_BUTTON;
	public static final Block SANGUART_DOOR;
	public static final Block SANGUART_FENCE;
	public static final Block SANGUART_FENCE_GATE;
	public static final Block SANGUART_LEAVES;
	public static final Block SANGUART_LOG;
	public static final Block SANGUART_PLANKS;
	public static final Block SANGUART_PRESSURE_PLATE;
	public static final Block SANGUART_SAPLING;
	public static final Block SANGUART_SIGN;
	public static final Block SANGUART_SLAB;
	public static final Block SANGUART_STAIRS;
	public static final Block SANGUART_TRAPDOOR;
	public static final Block SANGUART_WALL_SIGN;
	public static final Block SANGUART_WOOD;

	public static final Block SCARLET_THIORCEN;
	public static final Block SCARLET_THIORCEN_BUTTON;
	public static final Block SCARLET_THIORCEN_DOOR;
	public static final Block SCARLET_THIORCEN_FENCE;
	public static final Block SCARLET_THIORCEN_FENCE_GATE;
	public static final Block SCARLET_THIORCEN_LOG;
	public static final Block SCARLET_THIORCEN_PLANKS;
	public static final Block SCARLET_THIORCEN_PRESSURE_PLATE;
	public static final Block SCARLET_THIORCEN_SIGN;
	public static final Block SCARLET_THIORCEN_SLAB;
	public static final Block SCARLET_THIORCEN_STAIRS;
	public static final Block SCARLET_THIORCEN_TRAPDOOR;
	public static final Block SCARLET_THIORCEN_WALL_SIGN;
	public static final Block SCARLET_THIORCEN_WOOD;

	public static final Block SEQUOIA_BUTTON;
	public static final Block SEQUOIA_DOOR;
	public static final Block SEQUOIA_FENCE;
	public static final Block SEQUOIA_FENCE_GATE;
	public static final Block SEQUOIA_LEAVES;
	public static final Block SEQUOIA_LOG;
	public static final Block SEQUOIA_PLANKS;
	public static final Block SEQUOIA_PRESSURE_PLATE;
	public static final Block SEQUOIA_SAPLING;
	public static final Block SEQUOIA_SIGN;
	public static final Block SEQUOIA_SLAB;
	public static final Block SEQUOIA_STAIRS;
	public static final Block SEQUOIA_TRAPDOOR;
	public static final Block SEQUOIA_WALL_SIGN;
	public static final Block SEQUOIA_WOOD;
		
	public static final Block SPROOM_BUTTON;
	public static final Block SPROOM_DOOR;
	public static final Block SPROOM_FENCE;
	public static final Block SPROOM_FENCE_GATE;
	public static final Block SPROOM_LEAVES;
	public static final Block SPROOM_LOG;
	public static final Block SPROOM_PLANKS;
	public static final Block SPROOM_PRESSURE_PLATE;
	public static final Block SPROOM_SAPLING;
	public static final Block SPROOM_SIGN;
	public static final Block SPROOM_SLAB;
	public static final Block SPROOM_STAIRS;
	public static final Block SPROOM_TRAPDOOR;
	public static final Block SPROOM_WALL_SIGN;
	public static final Block SPROOM_WOOD;
		
	public static final Block STORTREEAN_BUTTON;
	public static final Block STORTREEAN_DOOR;
	public static final Block STORTREEAN_FENCE;
	public static final Block STORTREEAN_FENCE_GATE;
	public static final Block STORTREEAN_LEAVES;
	public static final Block STORTREEAN_LOG;
	public static final Block STORTREEAN_PLANKS;
	public static final Block STORTREEAN_PRESSURE_PLATE;
	public static final Block STORTREEAN_SAPLING;
	public static final Block STORTREEAN_SIGN;
	public static final Block STORTREEAN_SLAB;
	public static final Block STORTREEAN_STAIRS;
	public static final Block STORTREEAN_TRAPDOOR;
	public static final Block STORTREEAN_WALL_SIGN;
	public static final Block STORTREEAN_WOOD;
	
	public static final Block STRIPPED_ALMOND_LOG;
	public static final Block STRIPPED_ALMOND_WOOD;
	public static final Block STRIPPED_ANAMEATA_LOG;
	public static final Block STRIPPED_ANAMEATA_WOOD;
	public static final Block STRIPPED_ANGELS_TRUMPET_LOG;
	public static final Block STRIPPED_ANGELS_TRUMPET_WOOD;
	public static final Block STRIPPED_AQUEAN_LOG;
	public static final Block STRIPPED_AQUEAN_WOOD;
	public static final Block STRIPPED_BARSHROOKLE_LOG;
	public static final Block STRIPPED_BARSHROOKLE_WOOD;
	public static final Block STRIPPED_BLACK_BIRCH_LOG;
	public static final Block STRIPPED_BLACK_BIRCH_WOOD;
	public static final Block STRIPPED_BLUE_MAHOE_LOG;
	public static final Block STRIPPED_BLUE_MAHOE_WOOD;
	public static final Block STRIPPED_BLUE_SPRUCE_LOG;
	public static final Block STRIPPED_BLUE_SPRUCE_WOOD;
	public static final Block STRIPPED_BOTTLEBRUSH_LOG;
	public static final Block STRIPPED_BOTTLEBRUSH_WOOD;
	public static final Block STRIPPED_BROMYA_LOG;
	public static final Block STRIPPED_BROMYA_WOOD;
	public static final Block STRIPPED_BUBBLETREE_LOG;
	public static final Block STRIPPED_BUBBLETREE_WOOD;
	public static final Block STRIPPED_CALCEARB_LOG;
	public static final Block STRIPPED_CALCEARB_WOOD;
	public static final Block STRIPPED_CHERRY_LOG;
	public static final Block STRIPPED_CHERRY_WOOD;
	public static final Block STRIPPED_COOK_PINE_LOG;
	public static final Block STRIPPED_COOK_PINE_WOOD;
	public static final Block STRIPPED_CHOTORN_LOG;
	public static final Block STRIPPED_CHOTORN_WOOD;
	public static final Block STRIPPED_CROLOOD_LOG;
	public static final Block STRIPPED_CROLOOD_WOOD;
	public static final Block STRIPPED_DARK_CROLOOD_LOG;
	public static final Block STRIPPED_DARK_CROLOOD_WOOD;
	public static final Block STRIPPED_DARK_FUCHSITRA_LOG;
	public static final Block STRIPPED_DARK_FUCHSITRA_WOOD;
	public static final Block STRIPPED_DARK_RED_ELM_LOG;
	public static final Block STRIPPED_DARK_RED_ELM_WOOD;
	public static final Block STRIPPED_DEAD_WART_TREE_LOG;
	public static final Block STRIPPED_DEAD_WART_TREE_WOOD;
	public static final Block STRIPPED_DRIGYUS_LOG;
	public static final Block STRIPPED_DRIGYUS_WOOD;
	public static final Block STRIPPED_EBONY_LOG;
	public static final Block STRIPPED_EBONY_WOOD;
	public static final Block STRIPPED_ENDERHEART_LOG;
	public static final Block STRIPPED_ENDERHEART_WOOD;
	public static final Block STRIPPED_FLALM_STEM;
	public static final Block STRIPPED_FLALM_WOOD;
	public static final Block STRIPPED_FRUCE_LOG;
	public static final Block STRIPPED_FRUCE_WOOD;
	public static final Block STRIPPED_FUCHSITRA_LOG;
	public static final Block STRIPPED_FUCHSITRA_WOOD;
	public static final Block STRIPPED_FUNERANITE_LOG;
	public static final Block STRIPPED_FUNERANITE_WOOD;
	public static final Block STRIPPED_FUGMOS_STEM;
	public static final Block STRIPPED_FUGMOS_HYPHAE;
	public static final Block STRIPPED_GHOSHROOM_LOG;
	public static final Block STRIPPED_GHOSHROOM_WOOD;
	public static final Block STRIPPED_GIANT_VIOLET_STEM;
	public static final Block STRIPPED_GIANT_VIOLET_WOOD;
	public static final Block STRIPPED_GUAIACUM_LOG;
	public static final Block STRIPPED_GUAIACUM_WOOD;
	public static final Block STRIPPED_JOSHUA_LOG;
	public static final Block STRIPPED_JOSHUA_WOOD;
	public static final Block STRIPPED_KLINKII_PINE_LOG;
	public static final Block STRIPPED_KLINKII_PINE_WOOD;
	public static final Block STRIPPED_MELALEUCA_LOG;
	public static final Block STRIPPED_MELALEUCA_WOOD;
	public static final Block STRIPPED_MURKANTUAN_LOG;
	public static final Block STRIPPED_MURKANTUAN_WOOD;
	public static final Block STRIPPED_NORFOLK_PINE_LOG;
	public static final Block STRIPPED_NORFOLK_PINE_WOOD;
	public static final Block STRIPPED_OBSCRUS_LOG;
	public static final Block STRIPPED_OBSCRUS_WOOD;
	public static final Block STRIPPED_ORHPRIS_LOG;
	public static final Block STRIPPED_ORHPRIS_WOOD;
	public static final Block STRIPPED_PELTOGYNE_LOG;
	public static final Block STRIPPED_PELTOGYNE_WOOD;
	public static final Block STRIPPED_PIN_CHERRY_LOG;
	public static final Block STRIPPED_PIN_CHERRY_WOOD;
	public static final Block STRIPPED_PLUM_LOG;
	public static final Block STRIPPED_PLUM_WOOD;
	public static final Block STRIPPED_PURFUNGA_LOG;
	public static final Block STRIPPED_PURFUNGA_WOOD;
	public static final Block STRIPPED_RARK_LOG;
	public static final Block STRIPPED_RARK_WOOD;
	public static final Block STRIPPED_RED_ELM_LOG;
	public static final Block STRIPPED_RED_ELM_WOOD;
	public static final Block STRIPPED_RHADI_LOG;
	public static final Block STRIPPED_RHADI_WOOD;
	public static final Block STRIPPED_SANGUART_LOG;
	public static final Block STRIPPED_SANGUART_WOOD;
	public static final Block STRIPPED_SCARLET_THIORCEN_LOG;
	public static final Block STRIPPED_SCARLET_THIORCEN_WOOD;
	public static final Block STRIPPED_SEQUOIA_LOG;
	public static final Block STRIPPED_SEQUOIA_WOOD;
	public static final Block STRIPPED_SPROOM_LOG;
	public static final Block STRIPPED_SPROOM_WOOD;
	public static final Block STRIPPED_STORTREEAN_LOG;
	public static final Block STRIPPED_STORTREEAN_WOOD;
	public static final Block STRIPPED_STROOMEAN_LOG;
	public static final Block STRIPPED_STROOMEAN_WOOD;
	public static final Block STRIPPED_SUNRISE_FUNGUS_LOG;
	public static final Block STRIPPED_SUNRISE_FUNGUS_WOOD;
	public static final Block STRIPPED_TARK_LOG;
	public static final Block STRIPPED_TARK_WOOD;
	public static final Block STRIPPED_TEAK_LOG;
	public static final Block STRIPPED_TEAK_WOOD;
	public static final Block STRIPPED_THUNDERCLOUD_PLUM_LOG;
	public static final Block STRIPPED_THUNDERCLOUD_PLUM_WOOD;
	public static final Block STRIPPED_VYNHERT_LOG;
	public static final Block STRIPPED_VYNHERT_WOOD;
	public static final Block STRIPPED_WART_TREE_LOG;
	public static final Block STRIPPED_WART_TREE_WOOD;
	public static final Block STRIPPED_WENGE_LOG;
	public static final Block STRIPPED_WENGE_WOOD;
	public static final Block STRIPPED_YEW_LOG;
	public static final Block STRIPPED_YEW_WOOD;
	
	public static final Block STROOMEAN_BUTTON;
	public static final Block STROOMEAN_CAP;
	public static final Block STROOMEAN_DOOR;
	public static final Block STROOMEAN_FENCE;
	public static final Block STROOMEAN_FENCE_GATE;
	public static final Block STROOMEAN_LOG;
	public static final Block STROOMEAN_PLANKS;
	public static final Block STROOMEAN_PRESSURE_PLATE;
	public static final Block STROOMEAN_SAPLING;
	public static final Block STROOMEAN_SIGN;
	public static final Block STROOMEAN_SLAB;
	public static final Block STROOMEAN_STAIRS;
	public static final Block STROOMEAN_TRAPDOOR;
	public static final Block STROOMEAN_WALL_SIGN;
	public static final Block STROOMEAN_WOOD;
	
	public static final Block SUNRISE_FUNGUS_BUTTON;
	public static final Block SUNRISE_FUNGUS_CAP;
	public static final Block SUNRISE_FUNGUS_DOOR;
	public static final Block SUNRISE_FUNGUS_FENCE;
	public static final Block SUNRISE_FUNGUS_FENCE_GATE;
	public static final Block SUNRISE_FUNGUS_LOG;
	public static final Block SUNRISE_FUNGUS_PLANKS;
	public static final Block SUNRISE_FUNGUS_PRESSURE_PLATE;
	public static final Block SUNRISE_FUNGUS_SAPLING;
	public static final Block SUNRISE_FUNGUS_SIGN;
	public static final Block SUNRISE_FUNGUS_SLAB;
	public static final Block SUNRISE_FUNGUS_STAIRS;
	public static final Block SUNRISE_FUNGUS_TRAPDOOR;
	public static final Block SUNRISE_FUNGUS_WALL_SIGN;
	public static final Block SUNRISE_FUNGUS_WOOD;

	public static final Block TARK_BUTTON;
	public static final Block TARK_DOOR;
	public static final Block TARK_FENCE;
	public static final Block TARK_FENCE_GATE;
	public static final Block TARK_LEAVES;
	public static final Block TARK_LOG;
	public static final Block TARK_PLANKS;
	public static final Block TARK_PRESSURE_PLATE;
	public static final Block TARK_SAPLING;
	public static final Block TARK_SIGN;
	public static final Block TARK_SLAB;
	public static final Block TARK_STAIRS;
	public static final Block TARK_TRAPDOOR;
	public static final Block TARK_WALL_SIGN;
	public static final Block TARK_WOOD;
	
	public static final Block TEAK_BUTTON;
	public static final Block TEAK_DOOR;
	public static final Block TEAK_FENCE;
	public static final Block TEAK_FENCE_GATE;
	public static final Block TEAK_LEAVES;
	public static final Block TEAK_LOG;
	public static final Block TEAK_PLANKS;
	public static final Block TEAK_PRESSURE_PLATE;
	public static final Block TEAK_SAPLING;
	public static final Block TEAK_SIGN;
	public static final Block TEAK_SLAB;
	public static final Block TEAK_STAIRS;
	public static final Block TEAK_TRAPDOOR;
	public static final Block TEAK_WALL_SIGN;
	public static final Block TEAK_WOOD;
	
	public static final Block THUNDERCLOUD_PLUM_BUTTON;
	public static final Block THUNDERCLOUD_PLUM_DOOR;
	public static final Block THUNDERCLOUD_PLUM_FENCE;
	public static final Block THUNDERCLOUD_PLUM_FENCE_GATE;
	public static final Block THUNDERCLOUD_PLUM_LEAVES;
	public static final Block THUNDERCLOUD_PLUM_LOG;
	public static final Block THUNDERCLOUD_PLUM_PLANKS;
	public static final Block THUNDERCLOUD_PLUM_PRESSURE_PLATE;
	public static final Block THUNDERCLOUD_PLUM_SAPLING;
	public static final Block THUNDERCLOUD_PLUM_SIGN;
	public static final Block THUNDERCLOUD_PLUM_SLAB;
	public static final Block THUNDERCLOUD_PLUM_STAIRS;
	public static final Block THUNDERCLOUD_PLUM_TRAPDOOR;
	public static final Block THUNDERCLOUD_PLUM_WALL_SIGN;
	public static final Block THUNDERCLOUD_PLUM_WOOD;

	public static final Block VYNHERT_BUTTON;
	public static final Block VYNHERT_DOOR;
	public static final Block VYNHERT_FENCE;
	public static final Block VYNHERT_FENCE_GATE;
	public static final Block VYNHERT_FRUIT;
	public static final Block CARVED_VYNHERT_FRUIT;
	public static final Block VYNHERT_LEAF;
	public static final Block VYNHERT_LOG;
	public static final Block VYNHERT_O_LANTERN;
	public static final Block VYNHERT_PLANKS;
	public static final Block VYNHERT_PRESSURE_PLATE;
	public static final Block VYNHERT_SAPLING;
	public static final Block VYNHERT_SIGN;
	public static final Block VYNHERT_SLAB;
	public static final Block VYNHERT_STAIRS;
	public static final Block VYNHERT_TENTACLES;
	public static final Block VYNHERT_THORNS;
	public static final Block VYNHERT_TRAPDOOR;
	public static final Block VYNHERT_WALL_SIGN;
	public static final Block VYNHERT_WOOD;

	public static final Block WART_TREE_BUTTON;
	public static final Block WART_TREE_DOOR;
	public static final Block WART_TREE_FENCE;
	public static final Block WART_TREE_FENCE_GATE;
	public static final Block WART_TREE_LOG;
	public static final Block WART_TREE_PLANKS;
	public static final Block WART_TREE_PRESSURE_PLATE;
	public static final Block WART_TREE_SIGN;
	public static final Block WART_TREE_SLAB;
	public static final Block WART_TREE_STAIRS;
	public static final Block WART_TREE_TRAPDOOR;
	public static final Block WART_TREE_WALL_SIGN;
	public static final Block WART_TREE_WARTS;
	public static final Block WART_TREE_WOOD;

	public static final Block WENGE_BUTTON;
	public static final Block WENGE_DOOR;
	public static final Block WENGE_FENCE;
	public static final Block WENGE_FENCE_GATE;
	public static final Block WENGE_LEAVES;
	public static final Block WENGE_LOG;
	public static final Block WENGE_PLANKS;
	public static final Block WENGE_PRESSURE_PLATE;
	public static final Block WENGE_SAPLING;
	public static final Block WENGE_SIGN;
	public static final Block WENGE_SLAB;
	public static final Block WENGE_STAIRS;
	public static final Block WENGE_TRAPDOOR;
	public static final Block WENGE_WALL_SIGN;
	public static final Block WENGE_WOOD;

	public static final Block YEW_BUTTON;
	public static final Block YEW_DOOR;
	public static final Block YEW_FENCE;
	public static final Block YEW_FENCE_GATE;
	public static final Block YEW_LEAVES;
	public static final Block YEW_LOG;
	public static final Block YEW_PLANKS;
	public static final Block YEW_PRESSURE_PLATE;
	public static final Block YEW_SAPLING;
	public static final Block YEW_SIGN;
	public static final Block YEW_SLAB;
	public static final Block YEW_STAIRS;
	public static final Block YEW_TRAPDOOR;
	public static final Block YEW_WALL_SIGN;
	public static final Block YEW_WOOD;

	public static final Block POTTED_ALMOND_SAPLING;
	public static final Block POTTED_ANGELS_TRUMPET_SAPLING;
	public static final Block POTTED_ANAMEATA_SAPLING;
	public static final Block POTTED_AQUEAN_SAPLING;
	public static final Block POTTED_BARSHROOKLE_SAPLING;
	public static final Block POTTED_BLACK_BIRCH_SAPLING;
	public static final Block POTTED_BLUE_MAHOE_SAPLING;
	public static final Block POTTED_BLUE_SPRUCE_SAPLING;
	public static final Block POTTED_BOTTLEBRUSH_SAPLING;
	public static final Block POTTED_BROMYA_SAPLING;
	public static final Block POTTED_BUBBLETREE_SAPLING;
	public static final Block POTTED_CALCEARB_SAPLING;
	public static final Block POTTED_CHERRY_SAPLING;
	public static final Block POTTED_COOK_PINE_SAPLING;
	public static final Block POTTED_CROLOOD_SAPLING;
	public static final Block POTTED_DARK_CROLOOD_SAPLING;
	public static final Block POTTED_DARK_FUCHSITRA_SAPLING;
	public static final Block POTTED_DARK_RED_ELM_SAPLING;
	public static final Block POTTED_EBONY_SAPLING;
	public static final Block POTTED_ENDERHEART_SAPLING;
	public static final Block POTTED_FRUCE_SAPLING;
	public static final Block POTTED_FUCHSITRA_SAPLING;
	public static final Block POTTED_FUGMOS;
	public static final Block POTTED_FUNERANITE_SAPLING;
	public static final Block POTTED_GHOSHROOM_SAPLING;
	public static final Block POTTED_GUAIACUM_SAPLING;
	public static final Block POTTED_JOSHUA_SAPLING;
	public static final Block POTTED_KLINKII_PINE_SAPLING;
	public static final Block POTTED_MELALEUCA_SAPLING;
	public static final Block POTTED_MURKANTUAN_SAPLING;
	public static final Block POTTED_NORFOLK_PINE_SAPLING;
	public static final Block POTTED_ORHPRIS_SAPLING;
	public static final Block POTTED_PELTOGYNE_SAPLING;
	public static final Block POTTED_PIN_CHERRY_SAPLING;
	public static final Block POTTED_PLUM_SAPLING;
	public static final Block POTTED_PURFUNGA_SAPLING;
	public static final Block POTTED_RARK_SAPLING;
	public static final Block POTTED_RED_ELM_SAPLING;
	public static final Block POTTED_RHADI_SAPLING;
	public static final Block POTTED_SANGUART_SAPLING;
	public static final Block POTTED_SEQUOIA_SAPLING;
	public static final Block POTTED_SPROOM_SAPLING;
	public static final Block POTTED_STORTREEAN_SAPLING;
	public static final Block POTTED_STROOMEAN_SAPLING;
	public static final Block POTTED_SUNRISE_FUNGUS_SAPLING;
	public static final Block POTTED_TARK_SAPLING;
	public static final Block POTTED_TEAK_SAPLING;
	public static final Block POTTED_THUNDERCLOUD_PLUM_SAPLING;
	public static final Block POTTED_VYNHERT_SAPLING;
	public static final Block POTTED_WENGE_SAPLING;
	public static final Block POTTED_YEW_SAPLING;

	public static final Block POTTED_BLACK_PANSY;
	public static final Block POTTED_BLUE_PANSY;
	public static final Block POTTED_BLUE_POPPY;
	public static final Block POTTED_BLUE_VIOLET;
	public static final Block POTTED_BONNET_SPURGE;
	public static final Block POTTED_BROWN_PANSY;
	public static final Block POTTED_CACTLOW;
	public static final Block POTTED_CHOCOLATE_COSMOS_FLOWER;
	public static final Block POTTED_CYAN_BLUE_VIOLET;
	public static final Block POTTED_CYCAWLER;
	public static final Block POTTED_DRIGYUS;
	public static final Block POTTED_GARDEN_PINKS;
	public static final Block POTTED_GREEN_PANSY;
	public static final Block POTTED_GYLDELION_FLOWER;
	public static final Block POTTED_MARSH_VIOLET;
	public static final Block POTTED_NATIVE_VIOLET;
	public static final Block POTTED_OPIUM_POPPY;
	public static final Block POTTED_POPPY;
	public static final Block POTTED_PINK_AND_ORANGE_PANSY;
	public static final Block POTTED_PINK_BRAITOR_FLOWER;
	public static final Block POTTED_PINK_MARSH_VIOLET;
	public static final Block POTTED_PINK_ROSE;
	public static final Block POTTED_PINK_ROSE_BUSH;
	public static final Block POTTED_PURPLE_AND_ORANGE_PANSY;
	public static final Block POTTED_RED_BRAITOR_FLOWER;
	public static final Block POTTED_RED_CHOCOLATE_COSMOS_FLOWER;
	public static final Block POTTED_RED_PANSY;
	public static final Block POTTED_RED_ROSE;
	public static final Block POTTED_RUBRA_BLUE_VIOLET;
	public static final Block POTTED_SCARLET_THIORCEN;
	public static final Block POTTED_SPIDREET;
	public static final Block POTTED_SPIKE_LAVENDER;
	public static final Block POTTED_SPROOM_SPIKE;
	public static final Block POTTED_SQUISACLE;
	public static final Block POTTED_SWEET_VIOLET;
	public static final Block POTTED_TOPPED_LAVENDER;
	public static final Block POTTED_VASLAME;
	public static final Block POTTED_WEEPISTIL;
	public static final Block POTTED_WEEPY_HOLLOWER;
	public static final Block POTTED_YELLOW_VIOLET;

	protected static Block register(String id, Block block) {
		return Registry.register(BLOCK, id, block);
	}

	protected static Block createBioluminescentBlock(String id) {
		return register(id, new Block(Settings.copy(SEA_LANTERN).luminance(state -> 15).strength(1.5F, 6F)));
	}

	protected static Block createBlock(String id, Function<Settings, Block> function, Settings settings) {
		return register(id, function.apply(settings));
	}

	protected static Block createBlock(String id, Function<Settings, Block> function, Block block) {
		return createBlock(id, function, Settings.copy(block));
	}

	protected static Block createCap(String id) {
		return register(id, new CapBlock(Settings.of(FUNGUS).strength(0.2F, 0.2F)));
	}

	protected static Block createCopy(String id, Block block) {
		return register(id, new Block(Settings.copy(block)));
	}

	protected static Block createCoral(String id, Block block) {
		return register(id, new CoralBlock(block, Settings.copy(TUBE_CORAL)));
	}

	protected static Block createCoralBlock(String id, Block block) {
		return register(id, new CoralBlockBlock(block, Settings.copy(TUBE_CORAL_BLOCK)));
	}

	protected static Block createCoralFan(String id, Block block) {
		return register(id, new CoralFanBlock(block, Settings.copy(TUBE_CORAL_FAN)));
	}

	protected static Block createCoralWallFan(String id, Block block) {
		return register(id, new CoralWallFanBlock(block, Settings.copy(TUBE_CORAL_WALL_FAN)));
	}

	protected static Block createDeadCoral(String id) {
		return createBlock(id, DeadCoralBlock::new, DEAD_TUBE_CORAL);
	}

	protected static Block createDeadCoralBlock(String id) {
		return createCopy(id, DEAD_TUBE_CORAL_BLOCK);
	}

	protected static Block createDeadCoralFan(String id) {
		return createBlock(id, DeadCoralFanBlock::new, DEAD_TUBE_CORAL_FAN);
	}

	protected static Block createDeadCoralWallFan(String id) {
		return createBlock(id, DeadCoralWallFanBlock::new, DEAD_TUBE_CORAL_WALL_FAN);
	}

	protected static Block createFlowerBlock(String id, StatusEffect effect, int effectDuration) {
		return register(id, new FlowerBlock(effect, effectDuration, Settings.copy(RED_TULIP)));
	}

	protected static Block createStorceanFlower(String id, StatusEffect effect, int effectDuration) {
		return register(id, new StorceanFlowerBlock(effect, effectDuration, Settings.copy(RED_TULIP)));
	}

	protected static Block createFlowerPot(String id, Block block, Settings settings) {
		return register(id, new FlowerPotBlock(block, settings));
	}

	protected static Block createFlowerPot(String id, Block block) {
		return register(id, new FlowerPotBlock(block, Settings.copy(Blocks.POTTED_POPPY)));
	}

	protected static Block createFluid(String id, FlowableFluid fluid, Settings settings) {
		return register(id, new FluidBlock(fluid, settings));
	}

	protected static Block createHorizontalBlock(String id, Block block) {
		return register(id, new HorizontalBlock(Settings.copy(block)));
	}

	protected static Block createOakButton(String id) {
		return register(id, new WoodenButtonBlock(Settings.copy(OAK_BUTTON)));
	}

	protected static Block createOakDoor(String id) {
		return register(id, new DoorBlock(Settings.copy(OAK_DOOR)));
	}

	protected static Block createOakFence(String id) {
		return register(id, new FenceBlock(Settings.copy(OAK_FENCE)));
	}

	protected static Block createOakFenceGate(String id) {
		return register(id, new FenceGateBlock(Settings.copy(OAK_FENCE_GATE)));
	}

	protected static Block createOakLeaves(String id) {
		return register(id, new LeavesBlock(Settings.copy(OAK_LEAVES)));
	}

	protected static Block createOakLog(String id) {
		return register(id, new PillarBlock(Settings.copy(OAK_LOG)));
	}

	protected static Block createOakPlanks(String id) {
		return register(id, new Block(Settings.copy(OAK_PLANKS)));
	}

	protected static Block createOakPressurePlate(String id) {
		return register(id, new PressurePlateBlock(EVERYTHING, Settings.copy(OAK_PRESSURE_PLATE)));
	}

	protected static Block createOakSapling(String id, FeaturesSaplingGenerator saplingGenerator) {
		return register(id, new FeaturesSaplingBlock(saplingGenerator, Settings.copy(OAK_SAPLING)));
	}

	protected static Block createOakSign(String id, SignType type) {
		return register(id, new CustomSignBlock(Settings.copy(OAK_SIGN), type));
	}

	protected static Block createOakSlab(String id) {
		return register(id, new SlabBlock(Settings.copy(OAK_SLAB)));
	}

	protected static Block createOakStairs(String id, Block block) {
		return register(id, new StairsBlock(block.getDefaultState(), Settings.copy(OAK_STAIRS)));
	}

	protected static Block createOakTrapdoor(String id) {
		return register(id, new TrapdoorBlock(Settings.copy(OAK_TRAPDOOR)));
	}

	protected static Block createOakWallSign(String id, SignType type) {
		return register(id, new CustomWallSignBlock(Settings.copy(OAK_SIGN), type));
	}

	protected static Block createOakWood(String id) {
		return register(id, new PillarBlock(Settings.copy(OAK_WOOD)));
	}

    protected static Block createPillar(String id, Block block) {
        return register(id, new PillarBlock(Settings.copy(block)));
    }

	protected static Block createPottedSapling(String id, Block block) {
		return createFlowerPot(id, block, Settings.copy(POTTED_OAK_SAPLING));
	}

	protected static Block createStrippedOakLog(String id) {
		return register(id, new PillarBlock(Settings.copy(STRIPPED_OAK_LOG)));
	}

	protected static Block createStrippedOakWood(String id) {
		return register(id, new PillarBlock(Settings.copy(STRIPPED_OAK_WOOD)));
	}

	protected static Block createStorceanSapling(String id, FeaturesSaplingGenerator saplingGenerator) {
		return register(id, new StorceanTallSaplingBlock(saplingGenerator, Settings.copy(OAK_SAPLING)));
	}

	protected static Block createTallFlower(String id, Block block) {
	    return register(id, new TallFlowerBlock(Settings.copy(block)));
    }

	protected static Block createWaterFluid(String id, FlowableFluid fluid) {
		return createWaterFluid(id, fluid, 1F);
	}

	protected static Block createWaterFluid(String id, FlowableFluid fluid, float multiplier) {
		return createFluid(id, fluid, Settings.copy(WATER).velocityMultiplier(multiplier));
	}

	static {
		AIRIAL_MOSS = createBlock("deep_trenches:airial_moss", AirialMossBlock::new, GRASS_BLOCK);
		BLACK_MARBLE = createCopy("deep_trenches:black_marble", STONE);
		BLUE_STORCERACK = createCopy("deep_trenches:blue_storcerack", STONE);
		DRITEAN = createCopy("deep_trenches:dritean", DIRT);
		ENROTIUM = createBlock("deep_trenches:enrotium", EnrotiumBlock::new, CRIMSON_NYLIUM);
		GYLDELION_BLOCK = createCopy("deep_trenches:gyldelion_block", IRON_BLOCK);

		STASP_NEST = createBlock("deep_trenches:stasp_nest", StaspNestBlock::new, OAK_WOOD);

		GIANT_VIOLET = createTallFlower("deep_trenches:giant_violet", RED_TULIP);
		GIANT_VIOLET_LEAF = createCopy("deep_trenches:giant_violet_leaf", COCOA);
		GIANT_VIOLET_PETAL = createCopy("deep_trenches:giant_violet_petal", COCOA);
		GIANT_VIOLET_PISTIL = createCopy("deep_trenches:giant_violet_pistil", COCOA);

		CYAN_BIOLUMINESCENT_BLOCK = createBioluminescentBlock("deep_trenches:cyan_bioluminescent_block");
		GREEN_BIOLUMINESCENT_BLOCK = createBioluminescentBlock("deep_trenches:green_bioluminescent_block");
		LIGHT_BLUE_BIOLUMINESCENT_BLOCK = createBioluminescentBlock("deep_trenches:light_blue_bioluminescent_block");

		BLACK_PANSY = createFlowerBlock("deep_trenches:black_pansy", RESISTANCE, 9);
		BLUE_PANSY = createFlowerBlock("deep_trenches:blue_pansy", RESISTANCE, 9);
		BLUE_POPPY = createFlowerBlock("deep_trenches:blue_poppy", NIGHT_VISION, 8);
		BLUE_VIOLET = createFlowerBlock("deep_trenches:blue_violet", RESISTANCE, 9);
		BONNET_SPURGE = createFlowerBlock("deep_trenches:bonnet_spurge", POISON, 8);
		BROWN_PANSY = createFlowerBlock("deep_trenches:brown_pansy", RESISTANCE, 9);
		CHOCOLATE_COSMOS_FLOWER = createFlowerBlock("deep_trenches:chocolate_cosmos_flower", COSMOS_BEAUTY, 14);
		CYAN_BLUE_VIOLET = createFlowerBlock("deep_trenches:cyan_blue_violet", RESISTANCE, 9);
		CYCAWLER = createStorceanFlower("deep_trenches:cycawler", CYCAWLER_BEAUTY, 24000);
		GARDEN_PINKS = createFlowerBlock("deep_trenches:garden_pinks", FIRE_RESISTANCE, 6);
		GREEN_PANSY = createFlowerBlock("deep_trenches:green_pansy", RESISTANCE, 9);
		GYLDELION_FLOWER = createFlowerBlock("deep_trenches:gyldelion_flower", GLOWING, 12);
		MARSH_VIOLET = createFlowerBlock("deep_trenches:marsh_violet", RESISTANCE, 9);
		NATIVE_VIOLET = createFlowerBlock("deep_trenches:native_violet", RESISTANCE, 9);
		OPIUM_POPPY = createFlowerBlock("deep_trenches:opium_poppy", WEAKNESS, 11);
		PINK_AND_ORANGE_PANSY = createFlowerBlock("deep_trenches:pink_and_orange_pansy", RESISTANCE, 9);
		PINK_BRAITOR_FLOWER = createFlowerBlock("deep_trenches:pink_braitor_flower", BRAITOR_BEAUTY, 21);
		PINK_MARSH_VIOLET = createFlowerBlock("deep_trenches:pink_marsh_violet", RESISTANCE, 9);
		PINK_ROSE = createFlowerBlock("deep_trenches:pink_rose", FLOWER_BEAUTY, 13);
		PINK_ROSE_BUSH = createFlowerBlock("deep_trenches:pink_rose_bush", FLOWER_BEAUTY, 13);
		POPPY = createFlowerBlock("deep_trenches:poppy", NIGHT_VISION, 5);
		PURPLE_AND_ORANGE_PANSY = createFlowerBlock("deep_trenches:purple_and_orange_pansy", RESISTANCE, 9);
		RED_BRAITOR_FLOWER = createFlowerBlock("deep_trenches:red_braitor_flower", BRAITOR_BEAUTY, 21);
		RED_CHOCOLATE_COSMOS_FLOWER = createFlowerBlock("deep_trenches:red_chocolate_cosmos_flower", COSMOS_BEAUTY, 14);
		RED_PANSY = createFlowerBlock("deep_trenches:red_pansy", RESISTANCE, 9);
		RED_ROSE = createFlowerBlock("deep_trenches:red_rose", FLOWER_BEAUTY, 13);
		RUBRA_BLUE_VIOLET = createFlowerBlock("deep_trenches:rubra_blue_violet", RESISTANCE, 9);
		SPIDREET = createStorceanFlower("deep_trenches:spidreet", REGENERATION, 6);
		SPIKE_LAVENDER = createFlowerBlock("deep_trenches:spike_lavender", FLOWER_BEAUTY, 6);
		SPRIDELION = register("deep_trenches:spridelion", new SpridelionBlock(900, Settings.copy(RED_TULIP)));
		SQUISACLE = createStorceanFlower("deep_trenches:squisacle", LEVITATION, 4);
		SWEET_VIOLET = createFlowerBlock("deep_trenches:sweet_violet", RESISTANCE, 9);
		TOPPED_LAVENDER = createFlowerBlock("deep_trenches:topped_lavender", FLOWER_BEAUTY, 6);
		VASLAME = createStorceanFlower("deep_trenches:vaslame", FIRE_RESISTANCE, 6);
		WEEPISTIL = createStorceanFlower("deep_trenches:weepistil", NAUSEA, 4);
		WEEPY_HOLLOWER = createStorceanFlower("deep_trenches:weepy_hollower", GLOWING, 6);
		WHITE_VIOLET = createFlowerBlock("deep_trenches:white_violet", RESISTANCE, 9);
		WILD_PANSY = createFlowerBlock("deep_trenches:wild_pansy", RESISTANCE, 9);
		YELLOW_VIOLET = createFlowerBlock("deep_trenches:yellow_violet", RESISTANCE, 9);

		AIRIAL_BUSH = createBlock("deep_trenches:airial_bush", AirialBushBlock::new, GRASS);
		HARSHLES = createBlock("deep_trenches:harshles", HarshlesBlock::new, GRASS);
		REEBLOON = createBlock("deep_trenches:reebloon", ReebloonBlock::new, GRASS);
		MURKSTEM = createBlock("deep_trenches:murkstem", MurkstemBlock::new, SUNFLOWER);
		SQUISH_TIPS = createBlock("deep_trenches:squish_tips", SquishTipsBlock::new, GRASS);
		SPROOM_SPIKE = createBlock("deep_trenches:sproom_spike", SproomSpikeBlock::new, SUNFLOWER);

		BLACK_LILY = createTallFlower("deep_trenches:black_lily", SUNFLOWER);
		BULLTHORN = createTallFlower("deep_trenches:bullthorn", SUNFLOWER);
		CACTLOW = createTallFlower("deep_trenches:cactlow", SUNFLOWER);
		CLAWBULB = createTallFlower("deep_trenches:clawbulb", SUNFLOWER);
		LIME_SPURGE = createTallFlower("deep_trenches:lime_spurge", SUNFLOWER);
		LUPIN_FLOWER = createTallFlower("deep_trenches:lupin_flower", SUNFLOWER);
		ORANGE_LILY = createTallFlower("deep_trenches:orange_lily", SUNFLOWER);
		PIGAL = createTallFlower("deep_trenches:pigal", SUNFLOWER);
		PURPROUND = createTallFlower("deep_trenches:purpround", SUNFLOWER);
		SKALK = createTallFlower("deep_trenches:skalk", SUNFLOWER);
		SPRINLY = createTallFlower("deep_trenches:sprinly", SUNFLOWER);
		VELVET_LILY = createTallFlower("deep_trenches:velvet_lily", SUNFLOWER);

		DEAD_BLACKGREEN_TREE_CORAL = createDeadCoral("deep_trenches:dead_blackgreen_tree_coral");
		DEAD_BLACKGREEN_TREE_CORAL_BLOCK = createDeadCoralBlock("deep_trenches:dead_blackgreen_tree_coral_block");
		DEAD_BLACKGREEN_TREE_CORAL_FAN = createDeadCoralFan("deep_trenches:dead_blackgreen_tree_coral_fan");
		DEAD_BLACKGREEN_TREE_CORAL_WALL_FAN = createDeadCoralWallFan("deep_trenches:dead_blackgreen_tree_coral_wall_fan");

		BLACKGREEN_TREE_CORAL = createCoral("deep_trenches:blackgreen_tree_coral", DEAD_BLACKGREEN_TREE_CORAL);
		BLACKGREEN_TREE_CORAL_BLOCK = createCoralBlock("deep_trenches:blackgreen_tree_coral_block", DEAD_BLACKGREEN_TREE_CORAL_BLOCK);
		BLACKGREEN_TREE_CORAL_FAN = createCoralFan("deep_trenches:blackgreen_tree_coral_fan", DEAD_BLACKGREEN_TREE_CORAL_FAN);
		BLACKGREEN_TREE_CORAL_WALL_FAN = createCoralWallFan("deep_trenches:blackgreen_tree_coral_wall_fan", DEAD_BLACKGREEN_TREE_CORAL_WALL_FAN);

		DEAD_BROCCOLI_CORAL = createDeadCoral("deep_trenches:dead_broccoli_coral");
		DEAD_BROCCOLI_CORAL_BLOCK = createDeadCoralBlock("deep_trenches:dead_broccoli_coral_block");
		DEAD_BROCCOLI_CORAL_BUBBLES = createDeadCoralBlock("deep_trenches:dead_broccoli_coral_bubbles");
		DEAD_BROCCOLI_CORAL_FAN = createDeadCoralFan("deep_trenches:dead_broccoli_coral_fan");
		DEAD_BROCCOLI_CORAL_WALL_FAN = createDeadCoralWallFan("deep_trenches:dead_broccoli_coral_wall_fan");

		BROCCOLI_CORAL = createCoral("deep_trenches:broccoli_coral", DEAD_BROCCOLI_CORAL);
		BROCCOLI_CORAL_BLOCK = createCoralBlock("deep_trenches:broccoli_coral_block", DEAD_BROCCOLI_CORAL_BLOCK);
		BROCCOLI_CORAL_BUBBLES = createCoralBlock("deep_trenches:broccoli_coral_bubbles", DEAD_BROCCOLI_CORAL_BUBBLES);
		BROCCOLI_CORAL_FAN = createCoralFan("deep_trenches:broccoli_coral_fan", DEAD_BROCCOLI_CORAL_FAN);
		BROCCOLI_CORAL_WALL_FAN = createCoralWallFan("deep_trenches:broccoli_coral_wall_fan", DEAD_BROCCOLI_CORAL_WALL_FAN);

		DEAD_BUBBLEGUM_CORAL = createDeadCoral("deep_trenches:dead_bubblegum_coral");
		DEAD_BUBBLEGUM_CORAL_BLOCK = createDeadCoralBlock("deep_trenches:dead_bubblegum_coral_block");
		DEAD_BUBBLEGUM_CORAL_FAN = createDeadCoralFan("deep_trenches:dead_bubblegum_coral_fan");
		DEAD_BUBBLEGUM_CORAL_WALL_FAN = createDeadCoralWallFan("deep_trenches:dead_bubblegum_coral_wall_fan");

		BUBBLEGUM_CORAL = createCoral("deep_trenches:bubblegum_coral", DEAD_BUBBLEGUM_CORAL);
		BUBBLEGUM_CORAL_BLOCK = createCoralBlock("deep_trenches:bubblegum_coral_block", DEAD_BUBBLEGUM_CORAL_BLOCK);
		BUBBLEGUM_CORAL_FAN = createCoralFan("deep_trenches:bubblegum_coral_fan", DEAD_BUBBLEGUM_CORAL_FAN);
		BUBBLEGUM_CORAL_WALL_FAN = createCoralWallFan("deep_trenches:bubblegum_coral_wall_fan", DEAD_BUBBLEGUM_CORAL_WALL_FAN);

		DEAD_CABBAGE_TREE_CORAL = createDeadCoral("deep_trenches:dead_cabbage_tree_coral");
		DEAD_CABBAGE_TREE_CORAL_BLOCK = createDeadCoralBlock("deep_trenches:dead_cabbage_tree_coral_block");
		DEAD_CABBAGE_TREE_CORAL_FAN = createDeadCoralFan("deep_trenches:dead_cabbage_tree_coral_fan");
		DEAD_CABBAGE_TREE_CORAL_WALL_FAN = createDeadCoralWallFan("deep_trenches:dead_cabbage_tree_coral_wall_fan");

		CABBAGE_TREE_CORAL = createCoral("deep_trenches:cabbage_tree_coral", DEAD_CABBAGE_TREE_CORAL);
		CABBAGE_TREE_CORAL_BLOCK = createCoralBlock("deep_trenches:cabbage_tree_coral_block", DEAD_CABBAGE_TREE_CORAL_BLOCK);
		CABBAGE_TREE_CORAL_FAN = createCoralFan("deep_trenches:cabbage_tree_coral_fan", DEAD_CABBAGE_TREE_CORAL_FAN);
		CABBAGE_TREE_CORAL_WALL_FAN = createCoralWallFan("deep_trenches:cabbage_tree_coral_wall_fan", DEAD_CABBAGE_TREE_CORAL_WALL_FAN);

		DEAD_FLOWERTUBE_CORAL = createDeadCoral("deep_trenches:dead_flowertube_coral");
		DEAD_FLOWERTUBE_CORAL_BLOCK = createDeadCoralBlock("deep_trenches:dead_flowertube_coral_block");
		DEAD_FLOWERTUBE_CORAL_FAN = createDeadCoralFan("deep_trenches:dead_flowertube_coral_fan");
		DEAD_FLOWERTUBE_CORAL_WALL_FAN = createDeadCoralWallFan("deep_trenches:dead_flowertube_coral_wall_fan");

		FLOWERTUBE_CORAL = createCoral("deep_trenches:flowertube_coral", DEAD_FLOWERTUBE_CORAL);
		FLOWERTUBE_CORAL_BLOCK = createCoralBlock("deep_trenches:flowertube_coral_block", DEAD_FLOWERTUBE_CORAL_BLOCK);
		FLOWERTUBE_CORAL_FAN = createCoralFan("deep_trenches:flowertube_coral_fan", DEAD_FLOWERTUBE_CORAL_FAN);
		FLOWERTUBE_CORAL_WALL_FAN = createCoralWallFan("deep_trenches:flowertube_coral_wall_fan", DEAD_FLOWERTUBE_CORAL_WALL_FAN);

		DEAD_GARNET_SPIRAL_CORAL = createDeadCoral("deep_trenches:dead_garnet_spiral_coral");
		DEAD_GARNET_SPIRAL_CORAL_BLOCK = createDeadCoralBlock("deep_trenches:dead_garnet_spiral_coral_block");
		DEAD_GARNET_SPIRAL_CORAL_FAN = createDeadCoralFan("deep_trenches:dead_garnet_spiral_coral_fan");
		DEAD_GARNET_SPIRAL_CORAL_WALL_FAN = createDeadCoralWallFan("deep_trenches:dead_garnet_spiral_coral_wall_fan");

		GARNET_SPIRAL_CORAL = createCoral("deep_trenches:garnet_spiral_coral", DEAD_GARNET_SPIRAL_CORAL);
		GARNET_SPIRAL_CORAL_BLOCK = createCoralBlock("deep_trenches:garnet_spiral_coral_block", DEAD_GARNET_SPIRAL_CORAL_BLOCK);
		GARNET_SPIRAL_CORAL_FAN = createCoralFan("deep_trenches:garnet_spiral_coral_fan", DEAD_GARNET_SPIRAL_CORAL_FAN);
		GARNET_SPIRAL_CORAL_WALL_FAN = createCoralWallFan("deep_trenches:garnet_spiral_coral_wall_fan", DEAD_GARNET_SPIRAL_CORAL_WALL_FAN);

		DEAD_GLOW_FOREST_CORAL = createBlock("deep_trenches:dead_glow_forest_coral", DeadTallCoralBlock::new, DEAD_TUBE_CORAL);
		DEAD_GLOW_FOREST_CORAL_BLOCK = createDeadCoralBlock("deep_trenches:dead_glow_forest_coral_block");
		DEAD_GLOW_FOREST_CORAL_FAN = createDeadCoralFan("deep_trenches:dead_glow_forest_coral_fan");
		DEAD_GLOW_FOREST_CORAL_WALL_FAN = createDeadCoralWallFan("deep_trenches:dead_glow_forest_coral_wall_fan");

		GLOW_FOREST_CORAL = register("deep_trenches:glow_forest_coral", new TallCoralBlock(DEAD_GLOW_FOREST_CORAL, Settings.copy(TUBE_CORAL)));
		GLOW_FOREST_CORAL_BLOCK = createCoralBlock("deep_trenches:glow_forest_coral_block", DEAD_GLOW_FOREST_CORAL_BLOCK);
		GLOW_FOREST_CORAL_FAN = createCoralFan("deep_trenches:glow_forest_coral_fan", DEAD_GLOW_FOREST_CORAL_FAN);
		GLOW_FOREST_CORAL_WALL_FAN = createCoralWallFan("deep_trenches:glow_forest_coral_wall_fan", DEAD_GLOW_FOREST_CORAL_WALL_FAN);

		DEAD_GLOWTONGUE_TUBE_CORAL = createDeadCoral("deep_trenches:dead_glowtongue_tube_coral");
		DEAD_GLOWTONGUE_TUBE_CORAL_BLOCK = createDeadCoralBlock("deep_trenches:dead_glowtongue_tube_coral_block");
		DEAD_GLOWTONGUE_TUBE_CORAL_FAN = createDeadCoralFan("deep_trenches:dead_glowtongue_tube_coral_fan");
		DEAD_GLOWTONGUE_TUBE_CORAL_WALL_FAN = createDeadCoralWallFan("deep_trenches:dead_glowtongue_tube_coral_wall_fan");

		GLOWTONGUE_TUBE_CORAL = createCoral("deep_trenches:glowtongue_tube_coral", DEAD_GLOWTONGUE_TUBE_CORAL);
		GLOWTONGUE_TUBE_CORAL_BLOCK = createCoralBlock("deep_trenches:glowtongue_tube_coral_block", DEAD_GLOWTONGUE_TUBE_CORAL_BLOCK);
		GLOWTONGUE_TUBE_CORAL_FAN = createCoralFan("deep_trenches:glowtongue_tube_coral_fan", DEAD_GLOWTONGUE_TUBE_CORAL_FAN);
		GLOWTONGUE_TUBE_CORAL_WALL_FAN = createCoralWallFan("deep_trenches:glowtongue_tube_coral_wall_fan", DEAD_GLOWTONGUE_TUBE_CORAL_WALL_FAN);

		DEAD_IVORY_CORAL = createDeadCoral("deep_trenches:dead_ivory_coral");
		DEAD_IVORY_CORAL_BLOCK = createDeadCoralBlock("deep_trenches:dead_ivory_coral_block");
		DEAD_IVORY_CORAL_FAN = createDeadCoralFan("deep_trenches:dead_ivory_coral_fan");
		DEAD_IVORY_CORAL_WALL_FAN = createDeadCoralWallFan("deep_trenches:dead_ivory_coral_wall_fan");

		IVORY_CORAL = createCoral("deep_trenches:ivory_coral", DEAD_IVORY_CORAL);
		IVORY_CORAL_BLOCK = createCoralBlock("deep_trenches:ivory_coral_block", DEAD_IVORY_CORAL_BLOCK);
		IVORY_CORAL_FAN = createCoralFan("deep_trenches:ivory_coral_fan", DEAD_IVORY_CORAL_FAN);
		IVORY_CORAL_WALL_FAN = createCoralWallFan("deep_trenches:ivory_coral_wall_fan", DEAD_IVORY_CORAL_WALL_FAN);

		DEAD_LIME_BRAIN_CORAL = createDeadCoral("deep_trenches:dead_lime_brain_coral");
		DEAD_LIME_BRAIN_CORAL_BLOCK = createDeadCoralBlock("deep_trenches:dead_lime_brain_coral_block");
		DEAD_LIME_BRAIN_CORAL_FAN = createDeadCoralFan("deep_trenches:dead_lime_brain_coral_fan");
		DEAD_LIME_BRAIN_CORAL_WALL_FAN = createDeadCoralWallFan("deep_trenches:dead_lime_brain_coral_wall_fan");

		LIME_BRAIN_CORAL = createCoral("deep_trenches:lime_brain_coral", DEAD_LIME_BRAIN_CORAL);
		LIME_BRAIN_CORAL_BLOCK = createCoralBlock("deep_trenches:lime_brain_coral_block", DEAD_LIME_BRAIN_CORAL_BLOCK);
		LIME_BRAIN_CORAL_FAN = createCoralFan("deep_trenches:lime_brain_coral_fan", DEAD_LIME_BRAIN_CORAL_FAN);
		LIME_BRAIN_CORAL_WALL_FAN = createCoralWallFan("deep_trenches:lime_brain_coral_wall_fan", DEAD_LIME_BRAIN_CORAL_WALL_FAN);

		DEAD_LOPHELIA_CORAL = createDeadCoral("deep_trenches:dead_lophelia_coral");
		DEAD_LOPHELIA_CORAL_BLOCK = createDeadCoralBlock("deep_trenches:dead_lophelia_coral_block");
		DEAD_LOPHELIA_CORAL_FAN = createDeadCoralFan("deep_trenches:dead_lophelia_coral_fan");
		DEAD_LOPHELIA_CORAL_WALL_FAN = createDeadCoralWallFan("deep_trenches:dead_lophelia_coral_wall_fan");

		LOPHELIA_CORAL = createCoral("deep_trenches:lophelia_coral", DEAD_LOPHELIA_CORAL);
		LOPHELIA_CORAL_BLOCK = createCoralBlock("deep_trenches:lophelia_coral_block", DEAD_LOPHELIA_CORAL_BLOCK);
		LOPHELIA_CORAL_FAN = createCoralFan("deep_trenches:lophelia_coral_fan", DEAD_LOPHELIA_CORAL_FAN);
		LOPHELIA_CORAL_WALL_FAN = createCoralWallFan("deep_trenches:lophelia_coral_wall_fan", DEAD_LOPHELIA_CORAL_WALL_FAN);

		DEAD_PIPE_ORGAN_CORAL = createDeadCoral("deep_trenches:dead_pipe_organ_coral");
		DEAD_PIPE_ORGAN_CORAL_BLOCK = createDeadCoralBlock("deep_trenches:dead_pipe_organ_coral_block");
		DEAD_PIPE_ORGAN_CORAL_FAN = createDeadCoralFan("deep_trenches:dead_pipe_organ_coral_fan");
		DEAD_PIPE_ORGAN_TENTACLES = createDeadCoral("deep_trenches:dead_pipe_organ_tentacles");
		DEAD_PIPE_ORGAN_CORAL_WALL_FAN = createDeadCoralWallFan("deep_trenches:dead_pipe_organ_coral_wall_fan");

		PIPE_ORGAN_CORAL = createCoral("deep_trenches:pipe_organ_coral", DEAD_PIPE_ORGAN_CORAL);
		PIPE_ORGAN_CORAL_BLOCK = createCoralBlock("deep_trenches:pipe_organ_coral_block", DEAD_PIPE_ORGAN_CORAL_BLOCK);
		PIPE_ORGAN_CORAL_FAN = createCoralFan("deep_trenches:pipe_organ_coral_fan", DEAD_PIPE_ORGAN_CORAL_FAN);
		PIPE_ORGAN_CORAL_WALL_FAN = createCoralWallFan("deep_trenches:pipe_organ_coral_wall_fan", DEAD_PIPE_ORGAN_CORAL_WALL_FAN);
		PIPE_ORGAN_TENTACLES = createCoral("deep_trenches:pipe_organ_tentacles", DEAD_PIPE_ORGAN_TENTACLES);

		DEAD_RED_TREE_CORAL = createDeadCoral("deep_trenches:dead_red_tree_coral");
		DEAD_RED_TREE_CORAL_BLOCK = createDeadCoralBlock("deep_trenches:dead_red_tree_coral_block");
		DEAD_RED_TREE_CORAL_FAN = createDeadCoralFan("deep_trenches:dead_red_tree_coral_fan");
		DEAD_RED_TREE_CORAL_WALL_FAN = createDeadCoralWallFan("deep_trenches:dead_red_tree_coral_wall_fan");

		RED_TREE_CORAL = createCoral("deep_trenches:red_tree_coral", DEAD_RED_TREE_CORAL);
		RED_TREE_CORAL_BLOCK = createCoralBlock("deep_trenches:red_tree_coral_block", DEAD_RED_TREE_CORAL);
		RED_TREE_CORAL_FAN = createCoralFan("deep_trenches:red_tree_coral_fan", DEAD_RED_TREE_CORAL_FAN);
		RED_TREE_CORAL_WALL_FAN = createCoralWallFan("deep_trenches:red_tree_coral_wall_fan", DEAD_RED_TREE_CORAL_WALL_FAN);

		DEAD_SEAFAN_CORAL = createDeadCoral("deep_trenches:dead_seafan_coral");
		DEAD_SEAFAN_CORAL_BLOCK = createDeadCoralBlock("deep_trenches:dead_seafan_coral_block");
		DEAD_SEAFAN_CORAL_FAN = createDeadCoralFan("deep_trenches:dead_seafan_coral_fan");
		DEAD_SEAFAN_CORAL_WALL_FAN = createDeadCoralWallFan("deep_trenches:dead_seafan_coral_wall_fan");

		SEAFAN_CORAL = createCoral("deep_trenches:seafan_coral", DEAD_SEAFAN_CORAL);
		SEAFAN_CORAL_BLOCK = createCoralBlock("deep_trenches:seafan_coral_block", DEAD_SEAFAN_CORAL_BLOCK);
		SEAFAN_CORAL_FAN = createCoralFan("deep_trenches:seafan_coral_fan", DEAD_SEAFAN_CORAL_FAN);
		SEAFAN_CORAL_WALL_FAN = createCoralWallFan("deep_trenches:seafan_coral_wall_fan", DEAD_SEAFAN_CORAL_WALL_FAN);

		DEAD_STRAIGHT_WILLOW_CORAL = createDeadCoral("deep_trenches:dead_straight_willow_coral");
		DEAD_STRAIGHT_WILLOW_CORAL_BLOCK = createDeadCoralBlock("deep_trenches:dead_straight_willow_coral_block");
		DEAD_STRAIGHT_WILLOW_CORAL_FAN = createDeadCoralFan("deep_trenches:dead_straight_willow_coral_fan");
		DEAD_STRAIGHT_WILLOW_CORAL_WALL_FAN = createDeadCoralWallFan("deep_trenches:dead_straight_willow_coral_wall_fan");

		STRAIGHT_WILLOW_CORAL = createCoral("deep_trenches:straight_willow_coral", DEAD_STRAIGHT_WILLOW_CORAL);
		STRAIGHT_WILLOW_CORAL_BLOCK = createCoralBlock("deep_trenches:straight_willow_coral_block", DEAD_STRAIGHT_WILLOW_CORAL_BLOCK);
		STRAIGHT_WILLOW_CORAL_FAN = createCoralFan("deep_trenches:straight_willow_coral_fan", DEAD_STRAIGHT_WILLOW_CORAL_FAN);
		STRAIGHT_WILLOW_CORAL_WALL_FAN = createCoralWallFan("deep_trenches:straight_willow_coral_wall_fan", DEAD_STRAIGHT_WILLOW_CORAL_WALL_FAN);

		DEAD_SUNRISE_CORAL = createDeadCoral("deep_trenches:dead_sunrise_coral");
		DEAD_SUNRISE_CORAL_BLOCK = createDeadCoralBlock("deep_trenches:dead_sunrise_coral_block");
		DEAD_SUNRISE_CORAL_FAN = createDeadCoralFan("deep_trenches:dead_sunrise_coral_fan");
		DEAD_SUNRISE_CORAL_WALL_FAN = createDeadCoralWallFan("deep_trenches:dead_sunrise_coral_wall_fan");

		SUNRISE_CORAL = createCoral("deep_trenches:sunrise_coral", DEAD_SUNRISE_CORAL);
		SUNRISE_CORAL_BLOCK = createCoralBlock("deep_trenches:sunrise_coral_block", DEAD_SUNRISE_CORAL_BLOCK);
		SUNRISE_CORAL_FAN = createCoralFan("deep_trenches:sunrise_coral_fan", DEAD_SUNRISE_CORAL_FAN);
		SUNRISE_CORAL_WALL_FAN = createCoralWallFan("deep_trenches:sunrise_coral_wall_fan", DEAD_SUNRISE_CORAL_WALL_FAN);

		DEAD_TABLE_CORAL = createDeadCoral("deep_trenches:dead_table_coral");
		DEAD_TABLE_CORAL_BLOCK = createDeadCoralBlock("deep_trenches:dead_table_coral_block");
		DEAD_TABLE_CORAL_FAN = createDeadCoralFan("deep_trenches:dead_table_coral_fan");
		DEAD_TABLE_CORAL_WALL_FAN = createDeadCoralWallFan("deep_trenches:dead_table_coral_wall_fan");

		TABLE_CORAL = createCoral("deep_trenches:table_coral", DEAD_TABLE_CORAL);
		TABLE_CORAL_BLOCK = createCoralBlock("deep_trenches:table_coral_block", DEAD_TABLE_CORAL_BLOCK);
		TABLE_CORAL_FAN = createCoralFan("deep_trenches:table_coral_fan", DEAD_TABLE_CORAL_FAN);
		TABLE_CORAL_WALL_FAN = createCoralWallFan("deep_trenches:table_coral_wall_fan", DEAD_TABLE_CORAL_WALL_FAN);

		DEAD_THIN_BLADE_CORAL = createDeadCoral("deep_trenches:dead_thin_blade_coral");
		DEAD_THIN_BLADE_CORAL_BLOCK = createDeadCoralBlock("deep_trenches:dead_thin_blade_coral_block");
		DEAD_THIN_BLADE_CORAL_FAN = createDeadCoralFan("deep_trenches:dead_thin_blade_coral_fan");
		DEAD_THIN_BLADE_CORAL_WALL_FAN = createDeadCoralWallFan("deep_trenches:dead_thin_blade_coral_wall_fan");

		THIN_BLADE_CORAL = createCoral("deep_trenches:thin_blade_coral", DEAD_THIN_BLADE_CORAL);
		THIN_BLADE_CORAL_BLOCK = createCoralBlock("deep_trenches:thin_blade_coral_block", DEAD_THIN_BLADE_CORAL_BLOCK);
		THIN_BLADE_CORAL_FAN = createCoralFan("deep_trenches:thin_blade_coral_fan", DEAD_THIN_BLADE_CORAL_FAN);
		THIN_BLADE_CORAL_WALL_FAN = createCoralWallFan("deep_trenches:thin_blade_coral_wall_fan", DEAD_THIN_BLADE_CORAL_WALL_FAN);

		DEAD_TRUMPETEAR_CORAL = createDeadCoral("deep_trenches:dead_trumpetear_coral");
		DEAD_TRUMPETEAR_CORAL_BLOCK = createDeadCoralBlock("deep_trenches:dead_trumpetear_coral_block");
		DEAD_TRUMPETEAR_CORAL_FAN = createDeadCoralFan("deep_trenches:dead_trumpetear_coral_fan");
		DEAD_TRUMPETEAR_CORAL_WALL_FAN = createDeadCoralWallFan("deep_trenches:dead_trumpetear_coral_wall_fan");

		TRUMPETEAR_CORAL = createCoral("deep_trenches:trumpetear_coral", DEAD_TRUMPETEAR_CORAL);
		TRUMPETEAR_CORAL_BLOCK = createCoralBlock("deep_trenches:trumpetear_coral_block", DEAD_TRUMPETEAR_CORAL_BLOCK);
		TRUMPETEAR_CORAL_FAN = createCoralFan("deep_trenches:trumpetear_coral_fan", DEAD_TRUMPETEAR_CORAL_FAN);
		TRUMPETEAR_CORAL_WALL_FAN = createCoralWallFan("deep_trenches:trumpetear_coral_wall_fan", DEAD_TRUMPETEAR_CORAL_WALL_FAN);

		ALMOND_BUTTON = createOakButton("deep_trenches:almond_button");
		ALMOND_DOOR = createOakDoor("deep_trenches:almond_door");
		ALMOND_FENCE = createOakFence("deep_trenches:almond_fence");
		ALMOND_FENCE_GATE = createOakFenceGate("deep_trenches:almond_fence_gate");
		ALMOND_LEAVES = createOakLeaves("deep_trenches:almond_leaves");
		ALMOND_LOG = createOakLog("deep_trenches:almond_log");
		ALMOND_PLANKS = createOakPlanks("deep_trenches:almond_planks");
		ALMOND_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:almond_pressure_plate");
		ALMOND_SAPLING = createOakSapling("deep_trenches:almond_sapling", SaplingGenerators.ALMOND);
		ALMOND_SIGN = createOakSign("deep_trenches:almond_sign", SignTypes.ALMOND);
		ALMOND_SLAB = createOakSlab("deep_trenches:almond_slab");
		ALMOND_STAIRS = createOakStairs("deep_trenches:almond_stairs", ALMOND_PLANKS);
		ALMOND_TRAPDOOR = createOakTrapdoor("deep_trenches:almond_trapdoor");
		ALMOND_WALL_SIGN = createOakWallSign("deep_trenches:almond_wall_sign", SignTypes.ALMOND);
		ALMOND_WOOD = createOakWood("deep_trenches:almond_wood");

		ANAMEATA_BUTTON = createOakButton("deep_trenches:anameata_button");
		ANAMEATA_CAP = createCap("deep_trenches:anameata_cap");
		ANAMEATA_DOOR = createOakDoor("deep_trenches:anameata_door");
		ANAMEATA_FENCE = createOakFence("deep_trenches:anameata_fence");
		ANAMEATA_FENCE_GATE = createOakFenceGate("deep_trenches:anameata_fence_gate");
		ANAMEATA_LOG = createOakLog("deep_trenches:anameata_log");
		ANAMEATA_PLANKS = createOakPlanks("deep_trenches:anameata_planks");
		ANAMEATA_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:anameata_pressure_plate");
		ANAMEATA_SAPLING = createOakSapling("deep_trenches:anameata_sapling", SaplingGenerators.ANAMEATA);
		ANAMEATA_SIGN = createOakSign("deep_trenches:anameata_sign", SignTypes.ANAMEATA);
		ANAMEATA_SLAB = createOakSlab("deep_trenches:anameata_slab");
		ANAMEATA_STAIRS = createOakStairs("deep_trenches:anameata_stairs", ANAMEATA_PLANKS);
		ANAMEATA_TRAPDOOR = createOakTrapdoor("deep_trenches:anameata_trapdoor");
		ANAMEATA_WALL_SIGN = createOakWallSign("deep_trenches:anameata_wall_sign", SignTypes.ANAMEATA);
		ANAMEATA_WOOD = createOakWood("deep_trenches:anameata_wood");

		ANGELS_TRUMPET_BUTTON = createOakButton("deep_trenches:angels_trumpet_button");
		ANGELS_TRUMPET_DOOR = createOakDoor("deep_trenches:angels_trumpet_door");
		ANGELS_TRUMPET_FENCE = createOakFence("deep_trenches:angels_trumpet_fence");
		ANGELS_TRUMPET_FENCE_GATE = createOakFenceGate("deep_trenches:angels_trumpet_fence_gate");
		ANGELS_TRUMPET_LEAVES = createOakLeaves("deep_trenches:angels_trumpet_leaves");
		ANGELS_TRUMPET_LOG = createOakLog("deep_trenches:angels_trumpet_log");
		ANGELS_TRUMPET_PLANKS = createOakPlanks("deep_trenches:angels_trumpet_planks");
		ANGELS_TRUMPET_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:angels_trumpet_pressure_plate");
		ANGELS_TRUMPET_SAPLING = createOakSapling("deep_trenches:angels_trumpet_sapling", SaplingGenerators.ANGELS_TRUMPET);
		ANGELS_TRUMPET_SIGN = createOakSign("deep_trenches:angels_trumpet_sign", SignTypes.ANGELS_TRUMPET);
		ANGELS_TRUMPET_SLAB = createOakSlab("deep_trenches:angels_trumpet_slab");
		ANGELS_TRUMPET_STAIRS = createOakStairs("deep_trenches:angels_trumpet_stairs", ANGELS_TRUMPET_PLANKS);
		ANGELS_TRUMPET_TRAPDOOR = createOakTrapdoor("deep_trenches:angels_trumpet_trapdoor");
		ANGELS_TRUMPET_WALL_SIGN = createOakWallSign("deep_trenches:angels_trumpet_wall_sign", SignTypes.ANGELS_TRUMPET);
		ANGELS_TRUMPET_WOOD = createOakWood("deep_trenches:angels_trumpet_wood");

		AQUEAN_BUTTON = createOakButton("deep_trenches:aquean_button");
		AQUEAN_DOOR = createOakDoor("deep_trenches:aquean_door");
		AQUEAN_FENCE = createOakFence("deep_trenches:aquean_fence");
		AQUEAN_FENCE_GATE = createOakFenceGate("deep_trenches:aquean_fence_gate");
		AQUEAN_LEAVES = createOakLeaves("deep_trenches:aquean_leaves");
		AQUEAN_LOG = createOakLog("deep_trenches:aquean_log");
		AQUEAN_PLANKS = createOakPlanks("deep_trenches:aquean_planks");
		AQUEAN_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:aquean_pressure_plate");
		AQUEAN_SAPLING = createOakSapling("deep_trenches:aquean_sapling", SaplingGenerators.AQUEAN);
		AQUEAN_SIGN = createOakSign("deep_trenches:aquean_sign", SignTypes.AQUEAN);
		AQUEAN_SLAB = createOakSlab("deep_trenches:aquean_slab");
		AQUEAN_STAIRS = createOakStairs("deep_trenches:aquean_stairs", AQUEAN_PLANKS);
		AQUEAN_TRAPDOOR = createOakTrapdoor("deep_trenches:aquean_trapdoor");
		AQUEAN_WALL_SIGN = createOakWallSign("deep_trenches:aquean_wall_sign", SignTypes.AQUEAN);
		AQUEAN_WOOD = createOakWood("deep_trenches:aquean_wood");

		BARSHROOKLE_BUTTON = createOakButton("deep_trenches:barshrookle_button");
		BARSHROOKLE_CAP = createCap("deep_trenches:barshrookle_cap");
		BARSHROOKLE_DOOR = createOakDoor("deep_trenches:barshrookle_door");
		BARSHROOKLE_FENCE = createOakFence("deep_trenches:barshrookle_fence");
		BARSHROOKLE_FENCE_GATE = createOakFenceGate("deep_trenches:barshrookle_fence_gate");
		BARSHROOKLE_LOG = createOakLog("deep_trenches:barshrookle_log");
		BARSHROOKLE_PLANKS = createOakPlanks("deep_trenches:barshrookle_planks");
		BARSHROOKLE_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:barshrookle_pressure_plate");
		BARSHROOKLE_SAPLING = createOakSapling("deep_trenches:barshrookle_sapling", SaplingGenerators.BARSHROOKLE);
		BARSHROOKLE_SIGN = createOakSign("deep_trenches:barshrookle_sign", SignTypes.BARSHROOKLE);
		BARSHROOKLE_SLAB = createOakSlab("deep_trenches:barshrookle_slab");
		BARSHROOKLE_STAIRS = createOakStairs("deep_trenches:barshrookle_stairs", BARSHROOKLE_PLANKS);
		BARSHROOKLE_TRAPDOOR = createOakTrapdoor("deep_trenches:barshrookle_trapdoor");
		BARSHROOKLE_WALL_SIGN = createOakWallSign("deep_trenches:barshrookle_wall_sign", SignTypes.BARSHROOKLE);
		BARSHROOKLE_WOOD = createOakWood("deep_trenches:barshrookle_wood");

		BLACK_BIRCH_BUTTON = createOakButton("deep_trenches:black_birch_button");
		BLACK_BIRCH_DOOR = createOakDoor("deep_trenches:black_birch_door");
		BLACK_BIRCH_FENCE = createOakFence("deep_trenches:black_birch_fence");
		BLACK_BIRCH_FENCE_GATE = createOakFenceGate("deep_trenches:black_birch_fence_gate");
		BLACK_BIRCH_LEAVES = createOakLeaves("deep_trenches:black_birch_leaves");
		BLACK_BIRCH_LOG = createOakLog("deep_trenches:black_birch_log");
		BLACK_BIRCH_PLANKS = createOakPlanks("deep_trenches:black_birch_planks");
		BLACK_BIRCH_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:black_birch_pressure_plate");
		BLACK_BIRCH_SAPLING = createOakSapling("deep_trenches:black_birch_sapling", SaplingGenerators.BLACK_BIRCH);
		BLACK_BIRCH_SIGN = createOakSign("deep_trenches:black_birch_sign", SignTypes.BLACK_BIRCH);
		BLACK_BIRCH_SLAB = createOakSlab("deep_trenches:black_birch_slab");
		BLACK_BIRCH_STAIRS = createOakStairs("deep_trenches:black_birch_stairs", BLACK_BIRCH_PLANKS);
		BLACK_BIRCH_TRAPDOOR = createOakTrapdoor("deep_trenches:black_birch_trapdoor");
		BLACK_BIRCH_WALL_SIGN = createOakWallSign("deep_trenches:black_birch_wall_sign", SignTypes.BLACK_BIRCH);
		BLACK_BIRCH_WOOD = createOakWood("deep_trenches:black_birch_wood");

		BLUE_MAHOE_BUTTON = createOakButton("deep_trenches:blue_mahoe_button");
		BLUE_MAHOE_DOOR = createOakDoor("deep_trenches:blue_mahoe_door");
		BLUE_MAHOE_FENCE = createOakFence("deep_trenches:blue_mahoe_fence");
		BLUE_MAHOE_FENCE_GATE = createOakFenceGate("deep_trenches:blue_mahoe_fence_gate");
		BLUE_MAHOE_FLOWER = createBlock("deep_trenches:blue_mahoe_flower", BlueMahoeFlower::new, OAK_LEAVES);
		BLUE_MAHOE_LEAVES = createOakLeaves("deep_trenches:blue_mahoe_leaves");
		BLUE_MAHOE_LOG = createOakLog("deep_trenches:blue_mahoe_log");
		BLUE_MAHOE_PLANKS = createOakPlanks("deep_trenches:blue_mahoe_planks");
		BLUE_MAHOE_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:blue_mahoe_pressure_plate");
		BLUE_MAHOE_SAPLING = createOakSapling("deep_trenches:blue_mahoe_sapling", SaplingGenerators.BLUE_MAHOE);
		BLUE_MAHOE_SIGN = createOakSign("deep_trenches:blue_mahoe_sign", SignTypes.BLUE_MAHOE);
		BLUE_MAHOE_SLAB = createOakSlab("deep_trenches:blue_mahoe_slab");
		BLUE_MAHOE_STAIRS = createOakStairs("deep_trenches:blue_mahoe_stairs", BLUE_MAHOE_PLANKS);
		BLUE_MAHOE_TRAPDOOR = createOakTrapdoor("deep_trenches:blue_mahoe_trapdoor");
		BLUE_MAHOE_WALL_SIGN = createOakWallSign("deep_trenches:blue_mahoe_wall_sign", SignTypes.BLUE_MAHOE);
		BLUE_MAHOE_WOOD = createOakWood("deep_trenches:blue_mahoe_wood");

		BLUE_SPRUCE_BUTTON = createOakButton("deep_trenches:blue_spruce_button");
		BLUE_SPRUCE_DOOR = createOakDoor("deep_trenches:blue_spruce_door");
		BLUE_SPRUCE_FENCE = createOakFence("deep_trenches:blue_spruce_fence");
		BLUE_SPRUCE_FENCE_GATE = createOakFenceGate("deep_trenches:blue_spruce_fence_gate");
		BLUE_SPRUCE_LEAVES = createOakLeaves("deep_trenches:blue_spruce_leaves");
		BLUE_SPRUCE_LOG = createOakLog("deep_trenches:blue_spruce_log");
		BLUE_SPRUCE_PLANKS = createOakPlanks("deep_trenches:blue_spruce_planks");
		BLUE_SPRUCE_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:blue_spruce_pressure_plate");
		BLUE_SPRUCE_SAPLING = createOakSapling("deep_trenches:blue_spruce_sapling", SaplingGenerators.BLUE_SPRUCE);
		BLUE_SPRUCE_SIGN = createOakSign("deep_trenches:blue_spruce_sign", SignTypes.BLUE_SPRUCE);
		BLUE_SPRUCE_SLAB = createOakSlab("deep_trenches:blue_spruce_slab");
		BLUE_SPRUCE_STAIRS = createOakStairs("deep_trenches:blue_spruce_stairs", BLUE_SPRUCE_PLANKS);
		BLUE_SPRUCE_TRAPDOOR = createOakTrapdoor("deep_trenches:blue_spruce_trapdoor");
		BLUE_SPRUCE_WALL_SIGN = createOakWallSign("deep_trenches:blue_spruce_wall_sign", SignTypes.BLUE_SPRUCE);
		BLUE_SPRUCE_WOOD = createOakWood("deep_trenches:blue_spruce_wood");

		BOTTLEBRUSH_BUTTON = createOakButton("deep_trenches:bottlebrush_button");
		BOTTLEBRUSH_DOOR = createOakDoor("deep_trenches:bottlebrush_door");
		BOTTLEBRUSH_FENCE = createOakFence("deep_trenches:bottlebrush_fence");
		BOTTLEBRUSH_FENCE_GATE = createOakFenceGate("deep_trenches:bottlebrush_fence_gate");
		BOTTLEBRUSH_FLOWERS = createBlock("deep_trenches:bottlebrush_flowers", BottlebrushFlowersBlock::new, OAK_LEAVES);
		BOTTLEBRUSH_LEAVES = createOakLeaves("deep_trenches:bottlebrush_leaves");
		BOTTLEBRUSH_LOG = createOakLog("deep_trenches:bottlebrush_log");
		BOTTLEBRUSH_PLANKS = createOakPlanks("deep_trenches:bottlebrush_planks");
		BOTTLEBRUSH_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:bottlebrush_pressure_plate");
		BOTTLEBRUSH_SAPLING = createOakSapling("deep_trenches:bottlebrush_sapling", SaplingGenerators.BOTTLEBRUSH);
		BOTTLEBRUSH_SIGN = createOakSign("deep_trenches:bottlebrush_sign", SignTypes.BOTTLEBRUSH);
		BOTTLEBRUSH_SLAB = createOakSlab("deep_trenches:bottlebrush_slab");
		BOTTLEBRUSH_STAIRS = createOakStairs("deep_trenches:bottlebrush_stairs", BOTTLEBRUSH_PLANKS);
		BOTTLEBRUSH_TRAPDOOR = createOakTrapdoor("deep_trenches:bottlebrush_trapdoor");
		BOTTLEBRUSH_WALL_SIGN = createOakWallSign("deep_trenches:bottlebrush_wall_sign", SignTypes.BOTTLEBRUSH);
		BOTTLEBRUSH_WOOD = createOakWood("deep_trenches:bottlebrush_wood");

		BROMYA_BUTTON = createOakButton("deep_trenches:bromya_button");
		BROMYA_DOOR = createOakDoor("deep_trenches:bromya_door");
		BROMYA_FENCE = createOakFence("deep_trenches:bromya_fence");
		BROMYA_FENCE_GATE = createOakFenceGate("deep_trenches:bromya_fence_gate");
		BROMYA_FLOWER = createTallFlower("deep_trenches:bromya_flower", ROSE_BUSH);
		BROMYA_LEAVES = createOakLeaves("deep_trenches:bromya_leaves");
		BROMYA_LOG = createOakLog("deep_trenches:bromya_log");
		BROMYA_PLANKS = createOakPlanks("deep_trenches:bromya_planks");
		BROMYA_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:bromya_pressure_plate");
		BROMYA_SAPLING = createOakSapling("deep_trenches:bromya_sapling", SaplingGenerators.BROMYA);
		BROMYA_SIGN = createOakSign("deep_trenches:bromya_sign", SignTypes.BROMYA);
		BROMYA_SLAB = createOakSlab("deep_trenches:bromya_slab");
		BROMYA_STAIRS = createOakStairs("deep_trenches:bromya_stairs", BROMYA_PLANKS);
		BROMYA_TRAPDOOR = createOakTrapdoor("deep_trenches:bromya_trapdoor");
		BROMYA_WALL_SIGN = createOakWallSign("deep_trenches:bromya_wall_sign", SignTypes.BROMYA);
		BROMYA_WOOD = createOakWood("deep_trenches:bromya_wood");

		BUBBLETREE_BUBBLES = createCap("deep_trenches:bubbletree_bubbles");
		BUBBLETREE_BUTTON = createOakButton("deep_trenches:bubbletree_button");
		BUBBLETREE_DOOR = createOakDoor("deep_trenches:bubbletree_door");
		BUBBLETREE_FENCE = createOakFence("deep_trenches:bubbletree_fence");
		BUBBLETREE_FENCE_GATE = createOakFenceGate("deep_trenches:bubbletree_fence_gate");
		BUBBLETREE_LOG = createOakLog("deep_trenches:bubbletree_log");
		BUBBLETREE_PLANKS = createOakPlanks("deep_trenches:bubbletree_planks");
		BUBBLETREE_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:bubbletree_pressure_plate");
		BUBBLETREE_SAPLING = createOakSapling("deep_trenches:bubbletree_sapling", SaplingGenerators.BUBBLETREE);
		BUBBLETREE_SIGN = createOakSign("deep_trenches:bubbletree_sign", SignTypes.BUBBLETREE);
		BUBBLETREE_SLAB = createOakSlab("deep_trenches:bubbletree_slab");
		BUBBLETREE_STAIRS = createOakStairs("deep_trenches:bubbletree_stairs", BUBBLETREE_PLANKS);
		BUBBLETREE_TRAPDOOR = createOakTrapdoor("deep_trenches:bubbletree_trapdoor");
		BUBBLETREE_WALL_SIGN = createOakWallSign("deep_trenches:bubbletree_wall_sign", SignTypes.BUBBLETREE);
		BUBBLETREE_WOOD = createOakWood("deep_trenches:bubbletree_wood");

		CALCEARB_BUTTON = createOakButton("deep_trenches:calcearb_button");
		CALCEARB_DOOR = createOakDoor("deep_trenches:calcearb_door");
		CALCEARB_FENCE = createOakFence("deep_trenches:calcearb_fence");
		CALCEARB_FENCE_GATE = createOakFenceGate("deep_trenches:calcearb_fence_gate");
		CALCEARB_LEAVES = createOakLeaves("deep_trenches:calcearb_leaves");
		CALCEARB_LOG = createOakLog("deep_trenches:calcearb_log");
		CALCEARB_PLANKS = createOakPlanks("deep_trenches:calcearb_planks");
		CALCEARB_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:calcearb_pressure_plate");
		CALCEARB_SAPLING = createOakSapling("deep_trenches:calcearb_sapling", SaplingGenerators.CALCEARB);
		CALCEARB_SIGN = createOakSign("deep_trenches:calcearb_sign", SignTypes.CALCEARB);
		CALCEARB_SLAB = createOakSlab("deep_trenches:calcearb_slab");
		CALCEARB_STAIRS = createOakStairs("deep_trenches:calcearb_stairs", CALCEARB_PLANKS);
		CALCEARB_TRAPDOOR = createOakTrapdoor("deep_trenches:calcearb_trapdoor");
		CALCEARB_WALL_SIGN = createOakWallSign("deep_trenches:calcearb_wall_sign", SignTypes.CALCEARB);
		CALCEARB_WOOD = createOakWood("deep_trenches:calcearb_wood");

		CHERRY_BUTTON = createOakButton("deep_trenches:cherry_button");
		CHERRY_DOOR = createOakDoor("deep_trenches:cherry_door");
		CHERRY_FENCE = createOakFence("deep_trenches:cherry_fence");
		CHERRY_FENCE_GATE = createOakFenceGate("deep_trenches:cherry_fence_gate");
		CHERRY_LEAVES = createOakLeaves("deep_trenches:cherry_leaves");
		CHERRY_LOG = createOakLog("deep_trenches:cherry_log");
		CHERRY_PLANKS = createOakPlanks("deep_trenches:cherry_planks");
		CHERRY_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:cherry_pressure_plate");
		CHERRY_SAPLING = createOakSapling("deep_trenches:cherry_sapling", SaplingGenerators.CHERRY);
		CHERRY_SIGN = createOakSign("deep_trenches:cherry_sign", SignTypes.CHERRY);
		CHERRY_SLAB = createOakSlab("deep_trenches:cherry_slab");
		CHERRY_STAIRS = createOakStairs("deep_trenches:cherry_stairs", CHERRY_PLANKS);
		CHERRY_TRAPDOOR = createOakTrapdoor("deep_trenches:cherry_trapdoor");
		CHERRY_WALL_SIGN = createOakWallSign("deep_trenches:cherry_wall_sign", SignTypes.CHERRY);
		CHERRY_WOOD = createOakWood("deep_trenches:cherry_wood");

		CHOTORN_SAPLING = createOakSapling("deep_trenches:chotorn", SaplingGenerators.CHOTORN);
		CHOTORN_BUTTON = createOakButton("deep_trenches:chotorn_button");
		CHOTORN_DOOR = createOakDoor("deep_trenches:chotorn_door");
		CHOTORN_FENCE = createOakFence("deep_trenches:chotorn_fence");
		CHOTORN_FENCE_GATE = createOakFenceGate("deep_trenches:chotorn_fence_gate");
		CHOTORN_LOG = createOakLog("deep_trenches:chotorn_log");
		CHOTORN_PLANKS = createOakPlanks("deep_trenches:chotorn_planks");
		CHOTORN_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:chotorn_pressure_plate");
		CHOTORN_SIGN = createOakSign("deep_trenches:chotorn_sign", SignTypes.CHOTORN);
		CHOTORN_SLAB = createOakSlab("deep_trenches:chotorn_slab");
		CHOTORN_STAIRS = createOakStairs("deep_trenches:chotorn_stairs", CHOTORN_PLANKS);
		CHOTORN_TRAPDOOR = createOakTrapdoor("deep_trenches:chotorn_trapdoor");
		CHOTORN_WALL_SIGN = createOakWallSign("deep_trenches:chotorn_wall_sign", SignTypes.CHOTORN);
		CHOTORN_WOOD = createOakWood("deep_trenches:chotorn_wood");

		COOK_PINE_BUTTON = createOakButton("deep_trenches:cook_pine_button");
		COOK_PINE_DOOR = createOakDoor("deep_trenches:cook_pine_door");
		COOK_PINE_FENCE = createOakFence("deep_trenches:cook_pine_fence");
		COOK_PINE_FENCE_GATE = createOakFenceGate("deep_trenches:cook_pine_fence_gate");
		COOK_PINE_LEAVES = createOakLeaves("deep_trenches:cook_pine_leaves");
		COOK_PINE_LOG = createOakLog("deep_trenches:cook_pine_log");
		COOK_PINE_PLANKS = createOakPlanks("deep_trenches:cook_pine_planks");
		COOK_PINE_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:cook_pine_pressure_plate");
		COOK_PINE_SAPLING = createOakSapling("deep_trenches:cook_pine_sapling", SaplingGenerators.COOK_PINE);
		COOK_PINE_SIGN = createOakSign("deep_trenches:cook_pine_sign", SignTypes.COOK_PINE);
		COOK_PINE_SLAB = createOakSlab("deep_trenches:cook_pine_slab");
		COOK_PINE_STAIRS = createOakStairs("deep_trenches:cook_pine_stairs", COOK_PINE_PLANKS);
		COOK_PINE_TRAPDOOR = createOakTrapdoor("deep_trenches:cook_pine_trapdoor");
		COOK_PINE_WALL_SIGN = createOakWallSign("deep_trenches:cook_pine_wall_sign", SignTypes.COOK_PINE);
		COOK_PINE_WOOD = createOakWood("deep_trenches:cook_pine_wood");

		CROLOOD_BUTTON = createOakButton("deep_trenches:crolood_button");
		CROLOOD_DOOR = createOakDoor("deep_trenches:crolood_door");
		CROLOOD_FENCE = createOakFence("deep_trenches:crolood_fence");
		CROLOOD_FENCE_GATE = createOakFenceGate("deep_trenches:crolood_fence_gate");
		CROLOOD_LEAVES = createOakLeaves("deep_trenches:crolood_leaves");
		CROLOOD_LOG = createOakLog("deep_trenches:crolood_log");
		CROLOOD_PLANKS = createOakPlanks("deep_trenches:crolood_planks");
		CROLOOD_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:crolood_pressure_plate");
		CROLOOD_SAPLING = createOakSapling("deep_trenches:crolood_sapling", SaplingGenerators.CROLOOD);
		CROLOOD_SIGN = createOakSign("deep_trenches:crolood_sign", SignTypes.CROLOOD);
		CROLOOD_SLAB = createOakSlab("deep_trenches:crolood_slab");
		CROLOOD_STAIRS = createOakStairs("deep_trenches:crolood_stairs", CROLOOD_PLANKS);
		CROLOOD_TRAPDOOR = createOakTrapdoor("deep_trenches:crolood_trapdoor");
		CROLOOD_WALL_SIGN = createOakWallSign("deep_trenches:crolood_wall_sign", SignTypes.CROLOOD);
		CROLOOD_WOOD = createOakWood("deep_trenches:crolood_wood");

		DARK_CROLOOD_BUTTON = createOakButton("deep_trenches:dark_crolood_button");
		DARK_CROLOOD_DOOR = createOakDoor("deep_trenches:dark_crolood_door");
		DARK_CROLOOD_FENCE = createOakFence("deep_trenches:dark_crolood_fence");
		DARK_CROLOOD_FENCE_GATE = createOakFenceGate("deep_trenches:dark_crolood_fence_gate");
		DARK_CROLOOD_LEAVES = createOakLeaves("deep_trenches:dark_crolood_leaves");
		DARK_CROLOOD_LOG = createOakLog("deep_trenches:dark_crolood_log");
		DARK_CROLOOD_PLANKS = createOakPlanks("deep_trenches:dark_crolood_planks");
		DARK_CROLOOD_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:dark_crolood_pressure_plate");
		DARK_CROLOOD_SAPLING = createOakSapling("deep_trenches:dark_crolood_sapling", SaplingGenerators.DARK_CROLOOD);
		DARK_CROLOOD_SIGN = createOakSign("deep_trenches:dark_crolood_sign", SignTypes.DARK_CROLOOD);
		DARK_CROLOOD_SLAB = createOakSlab("deep_trenches:dark_crolood_slab");
		DARK_CROLOOD_STAIRS = createOakStairs("deep_trenches:dark_crolood_stairs", DARK_CROLOOD_PLANKS);
		DARK_CROLOOD_TRAPDOOR = createOakTrapdoor("deep_trenches:dark_crolood_trapdoor");
		DARK_CROLOOD_WALL_SIGN = createOakWallSign("deep_trenches:dark_crolood_wall_sign", SignTypes.DARK_CROLOOD);
		DARK_CROLOOD_WOOD = createOakWood("deep_trenches:dark_crolood_wood");

		DARK_FUCHSITRA_BUTTON = createOakButton("deep_trenches:dark_fuchsitra_button");
		DARK_FUCHSITRA_DOOR = createOakDoor("deep_trenches:dark_fuchsitra_door");
		DARK_FUCHSITRA_FENCE = createOakFence("deep_trenches:dark_fuchsitra_fence");
		DARK_FUCHSITRA_FENCE_GATE = createOakFenceGate("deep_trenches:dark_fuchsitra_fence_gate");
		DARK_FUCHSITRA_LEAVES = createOakLeaves("deep_trenches:dark_fuchsitra_leaves");
		DARK_FUCHSITRA_LOG = createOakLog("deep_trenches:dark_fuchsitra_log");
		DARK_FUCHSITRA_PLANKS = createOakPlanks("deep_trenches:dark_fuchsitra_planks");
		DARK_FUCHSITRA_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:dark_fuchsitra_pressure_plate");
		DARK_FUCHSITRA_SAPLING = createOakSapling("deep_trenches:dark_fuchsitra_sapling", SaplingGenerators.DARK_FUCHSITRA);
		DARK_FUCHSITRA_SIGN = createOakSign("deep_trenches:dark_fuchsitra_sign", SignTypes.DARK_FUCHSITRA);
		DARK_FUCHSITRA_SLAB = createOakSlab("deep_trenches:dark_fuchsitra_slab");
		DARK_FUCHSITRA_STAIRS = createOakStairs("deep_trenches:dark_fuchsitra_stairs", DARK_FUCHSITRA_PLANKS);
		DARK_FUCHSITRA_TRAPDOOR = createOakTrapdoor("deep_trenches:dark_fuchsitra_trapdoor");
		DARK_FUCHSITRA_WALL_SIGN = createOakWallSign("deep_trenches:dark_fuchsitra_wall_sign", SignTypes.DARK_FUCHSITRA);
		DARK_FUCHSITRA_WOOD = createOakWood("deep_trenches:dark_fuchsitra_wood");

		DARK_RED_ELM_BUTTON = createOakButton("deep_trenches:dark_red_elm_button");
		DARK_RED_ELM_DOOR = createOakDoor("deep_trenches:dark_red_elm_door");
		DARK_RED_ELM_FENCE = createOakFence("deep_trenches:dark_red_elm_fence");
		DARK_RED_ELM_FENCE_GATE = createOakFenceGate("deep_trenches:dark_red_elm_fence_gate");
		DARK_RED_ELM_LEAVES = createOakLeaves("deep_trenches:dark_red_elm_leaves");
		DARK_RED_ELM_LOG = createOakLog("deep_trenches:dark_red_elm_log");
		DARK_RED_ELM_PLANKS = createOakPlanks("deep_trenches:dark_red_elm_planks");
		DARK_RED_ELM_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:dark_red_elm_pressure_plate");
		DARK_RED_ELM_SAPLING = createOakSapling("deep_trenches:dark_red_elm_sapling", SaplingGenerators.DARK_RED_ELM);
		DARK_RED_ELM_SIGN = createOakSign("deep_trenches:dark_red_elm_sign", SignTypes.DARK_RED_ELM);
		DARK_RED_ELM_SLAB = createOakSlab("deep_trenches:dark_red_elm_slab");
		DARK_RED_ELM_STAIRS = createOakStairs("deep_trenches:dark_red_elm_stairs", DARK_RED_ELM_PLANKS);
		DARK_RED_ELM_TRAPDOOR = createOakTrapdoor("deep_trenches:dark_red_elm_trapdoor");
		DARK_RED_ELM_WALL_SIGN = createOakWallSign("deep_trenches:dark_red_elm_wall_sign", SignTypes.DARK_RED_ELM);
		DARK_RED_ELM_WOOD = createOakWood("deep_trenches:dark_red_elm_wood");

		DEAD_WART_TREE_BUTTON = createOakButton("deep_trenches:dead_wart_tree_button");
		DEAD_WART_TREE_DOOR = createOakDoor("deep_trenches:dead_wart_tree_door");
		DEAD_WART_TREE_FENCE = createOakFence("deep_trenches:dead_wart_tree_fence");
		DEAD_WART_TREE_FENCE_GATE = createOakFenceGate("deep_trenches:dead_wart_tree_fence_gate");
		DEAD_WART_TREE_LOG = createOakLog("deep_trenches:dead_wart_tree_log");
		DEAD_WART_TREE_PLANKS = createOakPlanks("deep_trenches:dead_wart_tree_planks");
		DEAD_WART_TREE_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:dead_wart_tree_pressure_plate");
		DEAD_WART_TREE_SIGN = createOakSign("deep_trenches:dead_wart_tree_sign", SignTypes.DEAD_WART_TREE);
		DEAD_WART_TREE_SLAB = createOakSlab("deep_trenches:dead_wart_tree_slab");
		DEAD_WART_TREE_STAIRS = createOakStairs("deep_trenches:dead_wart_tree_stairs", DEAD_WART_TREE_PLANKS);
		DEAD_WART_TREE_TRAPDOOR = createOakTrapdoor("deep_trenches:dead_wart_tree_trapdoor");
		DEAD_WART_TREE_WALL_SIGN = createOakWallSign("deep_trenches:dead_wart_tree_wall_sign", SignTypes.DEAD_WART_TREE);
		DEAD_WART_TREE_WOOD = createOakWood("deep_trenches:dead_wart_tree_wood");

		DRIGYUS = createCopy("deep_trenches:drigyus", DEAD_BUSH);
		DRIGYUS_BUTTON = createOakButton("deep_trenches:drigyus_button");
		DRIGYUS_DOOR = createOakDoor("deep_trenches:drigyus_door");
		DRIGYUS_FENCE = createOakFence("deep_trenches:drigyus_fence");
		DRIGYUS_FENCE_GATE = createOakFenceGate("deep_trenches:drigyus_fence_gate");
		DRIGYUS_LOG = createOakLog("deep_trenches:drigyus_log");
		DRIGYUS_PLANKS = createOakPlanks("deep_trenches:drigyus_planks");
		DRIGYUS_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:drigyus_pressure_plate");
		DRIGYUS_SIGN = createOakSign("deep_trenches:drigyus_sign", SignTypes.DRIGYUS);
		DRIGYUS_SLAB = createOakSlab("deep_trenches:drigyus_slab");
		DRIGYUS_STAIRS = createOakStairs("deep_trenches:drigyus_stairs", DRIGYUS_PLANKS);
		DRIGYUS_TRAPDOOR = createOakTrapdoor("deep_trenches:drigyus_trapdoor");
		DRIGYUS_WALL_SIGN = createOakWallSign("deep_trenches:drigyus_wall_sign", SignTypes.DRIGYUS);
		DRIGYUS_WOOD = createOakWood("deep_trenches:drigyus_wood");

		EBONY_BUTTON = createOakButton("deep_trenches:ebony_button");
		EBONY_DOOR = createOakDoor("deep_trenches:ebony_door");
		EBONY_FENCE = createOakFence("deep_trenches:ebony_fence");
		EBONY_FENCE_GATE = createOakFenceGate("deep_trenches:ebony_fence_gate");
		EBONY_LEAVES = createOakLeaves("deep_trenches:ebony_leaves");
		EBONY_LOG = createOakLog("deep_trenches:ebony_log");
		EBONY_PLANKS = createOakPlanks("deep_trenches:ebony_planks");
		EBONY_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:ebony_pressure_plate");
		EBONY_SAPLING = createOakSapling("deep_trenches:ebony_sapling", SaplingGenerators.EBONY);
		EBONY_SIGN = createOakSign("deep_trenches:ebony_sign", SignTypes.EBONY);
		EBONY_SLAB = createOakSlab("deep_trenches:ebony_slab");
		EBONY_STAIRS = createOakStairs("deep_trenches:ebony_stairs", EBONY_PLANKS);
		EBONY_TRAPDOOR = createOakTrapdoor("deep_trenches:ebony_trapdoor");
		EBONY_WALL_SIGN = createOakWallSign("deep_trenches:ebony_wall_sign", SignTypes.EBONY);
		EBONY_WOOD = createOakWood("deep_trenches:ebony_wood");

		ENDERHEART_BUTTON = createOakButton("deep_trenches:enderheart_button");
		ENDERHEART_DOOR = createOakDoor("deep_trenches:enderheart_door");
		ENDERHEART_FENCE = createOakFence("deep_trenches:enderheart_fence");
		ENDERHEART_FENCE_GATE = createOakFenceGate("deep_trenches:enderheart_fence_gate");
		ENDERHEART_LEAVES = createOakLeaves("deep_trenches:enderheart_leaves");
		ENDERHEART_LEAF = createCopy("deep_trenches:enderheart_leaf", OAK_LEAVES);
		ENDERHEART_LOG = createOakLog("deep_trenches:enderheart_log");
		ENDERHEART_PLANKS = createOakPlanks("deep_trenches:enderheart_planks");
		ENDERHEART_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:enderheart_pressure_plate");
		ENDERHEART_SAPLING = createOakSapling("deep_trenches:enderheart_sapling", SaplingGenerators.ENDERHEART);
		ENDERHEART_SIGN = createOakSign("deep_trenches:enderheart_sign", SignTypes.ENDERHEART);
		ENDERHEART_SLAB = createOakSlab("deep_trenches:enderheart_slab");
		ENDERHEART_STAIRS = createOakStairs("deep_trenches:enderheart_stairs", ENDERHEART_PLANKS);
		ENDERHEART_TRAPDOOR = createOakTrapdoor("deep_trenches:enderheart_trapdoor");
		ENDERHEART_WALL_SIGN = createOakWallSign("deep_trenches:enderheart_wall_sign", SignTypes.ENDERHEART);
		ENDERHEART_WOOD = createOakWood("deep_trenches:enderheart_wood");

		FLALM = createTallFlower("deep_trenches:flalm", ROSE_BUSH);
		FLALM_BUTTON = createOakButton("deep_trenches:flalm_button");
		FLALM_DOOR = createOakDoor("deep_trenches:flalm_door");
		FLALM_FENCE = createOakFence("deep_trenches:flalm_fence");
		FLALM_FENCE_GATE = createOakFenceGate("deep_trenches:flalm_fence_gate");
		FLALM_PETAL_BLOCK = createCap("deep_trenches:flalm_petal_block");
		FLALM_PLANKS = createOakPlanks("deep_trenches:flalm_planks");
		FLALM_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:flalm_pressure_plate");
		FLALM_SIGN = createOakSign("deep_trenches:flalm_sign", SignTypes.FLALM);
		FLALM_SLAB = createOakSlab("deep_trenches:flalm_slab");
		FLALM_STAIRS = createOakStairs("deep_trenches:flalm_stairs", FLALM_PLANKS);
		FLALM_STEM = createPillar("deep_trenches:flalm_stem", COCOA);
		FLALM_THORNS = createBlock("deep_trenches:flalm_thorns", FlalmThornsBlock::new, OAK_LEAVES);
		FLALM_TRAPDOOR = createOakTrapdoor("deep_trenches:flalm_trapdoor");
		FLALM_WALL_SIGN = createOakWallSign("deep_trenches:flalm_wall_sign", SignTypes.FLALM);
		FLALM_WOOD = createOakWood("deep_trenches:flalm_wood");

		FRUCE_BUTTON = createOakButton("deep_trenches:fruce_button");
		FRUCE_DOOR = createOakDoor("deep_trenches:fruce_door");
		FRUCE_FENCE = createOakFence("deep_trenches:fruce_fence");
		FRUCE_FENCE_GATE = createOakFenceGate("deep_trenches:fruce_fence_gate");
		FRUCE_LEAVES = createOakLeaves("deep_trenches:fruce_leaves");
		FRUCE_LOG = createOakLog("deep_trenches:fruce_log");
		FRUCE_PLANKS = createOakPlanks("deep_trenches:fruce_planks");
		FRUCE_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:fruce_pressure_plate");
		FRUCE_SAPLING = createOakSapling("deep_trenches:fruce_sapling", SaplingGenerators.FRUCE);
		FRUCE_SIGN = createOakSign("deep_trenches:fruce_sign", SignTypes.FRUCE);
		FRUCE_SLAB = createOakSlab("deep_trenches:fruce_slab");
		FRUCE_STAIRS = createOakStairs("deep_trenches:fruce_stairs", FRUCE_PLANKS);
		FRUCE_TRAPDOOR = createOakTrapdoor("deep_trenches:fruce_trapdoor");
		FRUCE_WALL_SIGN = createOakWallSign("deep_trenches:fruce_wall_sign", SignTypes.FRUCE);
		FRUCE_WOOD = createOakWood("deep_trenches:fruce_wood");

		FUCHSITRA_BUTTON = createOakButton("deep_trenches:fuchsitra_button");
		FUCHSITRA_DOOR = createOakDoor("deep_trenches:fuchsitra_door");
		FUCHSITRA_FENCE = createOakFence("deep_trenches:fuchsitra_fence");
		FUCHSITRA_FENCE_GATE = createOakFenceGate("deep_trenches:fuchsitra_fence_gate");
		FUCHSITRA_LEAVES = createOakLeaves("deep_trenches:fuchsitra_leaves");
		FUCHSITRA_LOG = createOakLog("deep_trenches:fuchsitra_log");
		FUCHSITRA_PLANKS = createOakPlanks("deep_trenches:fuchsitra_planks");
		FUCHSITRA_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:fuchsitra_pressure_plate");
		FUCHSITRA_SAPLING = createOakSapling("deep_trenches:fuchsitra_sapling", SaplingGenerators.FUCHSITRA);
		FUCHSITRA_SIGN = createOakSign("deep_trenches:fuchsitra_sign", SignTypes.FUCHSITRA);
		FUCHSITRA_SLAB = createOakSlab("deep_trenches:fuchsitra_slab");
		FUCHSITRA_STAIRS = createOakStairs("deep_trenches:fuchsitra_stairs", FUCHSITRA_PLANKS);
		FUCHSITRA_TRAPDOOR = createOakTrapdoor("deep_trenches:fuchsitra_trapdoor");
		FUCHSITRA_WALL_SIGN = createOakWallSign("deep_trenches:fuchsitra_wall_sign", SignTypes.FUCHSITRA);
		FUCHSITRA_WOOD = createOakWood("deep_trenches:fuchsitra_wood");

		FUGMOS = createOakSapling("deep_trenches:fugmos", SaplingGenerators.FUGMOS);
		FUGMOS_BUTTON = createOakButton("deep_trenches:fugmos_button");
		FUGMOS_DOOR = createOakDoor("deep_trenches:fugmos_door");
		FUGMOS_FENCE = createOakFence("deep_trenches:fugmos_fence");
		FUGMOS_FENCE_GATE = createOakFenceGate("deep_trenches:fugmos_fence_gate");
		FUGMOS_STEM = createOakLog("deep_trenches:fugmos_stem");
		FUGMOS_MOSS = createOakLeaves("deep_trenches:fugmos_moss");
		FUGMOS_PLANKS = createOakPlanks("deep_trenches:fugmos_planks");
		FUGMOS_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:fugmos_pressure_plate");
		FUGMOS_SIGN = createOakSign("deep_trenches:fugmos_sign", SignTypes.FUGMOS);
		FUGMOS_SLAB = createOakSlab("deep_trenches:fugmos_slab");
		FUGMOS_STAIRS = createOakStairs("deep_trenches:fugmos_stairs", FUGMOS_PLANKS);
		FUGMOS_TRAPDOOR = createOakTrapdoor("deep_trenches:fugmos_trapdoor");
		FUGMOS_WALL_SIGN = createOakWallSign("deep_trenches:fugmos_wall_sign", SignTypes.FUGMOS);
		FUGMOS_WOOD = createOakWood("deep_trenches:fugmos_wood");

		FUNERANITE_BUTTON = createOakButton("deep_trenches:funeranite_button");
		FUNERANITE_CAP = createCap("deep_trenches:funeranite_cap");
		FUNERANITE_DOOR = createOakDoor("deep_trenches:funeranite_door");
		FUNERANITE_FENCE = createOakFence("deep_trenches:funeranite_fence");
		FUNERANITE_FENCE_GATE = createOakFenceGate("deep_trenches:funeranite_fence_gate");
		FUNERANITE_LOG = createOakLog("deep_trenches:funeranite_log");
		FUNERANITE_PLANKS = createOakPlanks("deep_trenches:funeranite_planks");
		FUNERANITE_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:funeranite_pressure_plate");
		FUNERANITE_SAPLING = createOakSapling("deep_trenches:funeranite_sapling", SaplingGenerators.FUNERANITE);
		FUNERANITE_SIGN = createOakSign("deep_trenches:funeranite_sign", SignTypes.FUNERANITE);
		FUNERANITE_SLAB = createOakSlab("deep_trenches:funeranite_slab");
		FUNERANITE_STAIRS = createOakStairs("deep_trenches:funeranite_stairs", FUNERANITE_PLANKS);
		FUNERANITE_TRAPDOOR = createOakTrapdoor("deep_trenches:funeranite_trapdoor");
		FUNERANITE_WALL_SIGN = createOakWallSign("deep_trenches:funeranite_wall_sign", SignTypes.FUNERANITE);
		FUNERANITE_WOOD = createOakWood("deep_trenches:funeranite_wood");

		GHOSHROOM_BUTTON = createOakButton("deep_trenches:ghoshroom_button");
		GHOSHROOM_CAP = createCap("deep_trenches:ghoshroom_cap");
		GHOSHROOM_DOOR = createOakDoor("deep_trenches:ghoshroom_door");
		GHOSHROOM_FENCE = createOakFence("deep_trenches:ghoshroom_fence");
		GHOSHROOM_FENCE_GATE = createOakFenceGate("deep_trenches:ghoshroom_fence_gate");
		GHOSHROOM_LOG = createOakLog("deep_trenches:ghoshroom_log");
		GHOSHROOM_PLANKS = createOakPlanks("deep_trenches:ghoshroom_planks");
		GHOSHROOM_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:ghoshroom_pressure_plate");
		GHOSHROOM_SAPLING = createOakSapling("deep_trenches:ghoshroom_sapling", SaplingGenerators.GHOSHROOM);
		GHOSHROOM_SIGN = createOakSign("deep_trenches:ghoshroom_sign", SignTypes.GHOSHROOM);
		GHOSHROOM_SLAB = createOakSlab("deep_trenches:ghoshroom_slab");
		GHOSHROOM_STAIRS = createOakStairs("deep_trenches:ghoshroom_stairs", GHOSHROOM_PLANKS);
		GHOSHROOM_TRAPDOOR = createOakTrapdoor("deep_trenches:ghoshroom_trapdoor");
		GHOSHROOM_WALL_SIGN = createOakWallSign("deep_trenches:ghoshroom_wall_sign", SignTypes.GHOSHROOM);
		GHOSHROOM_WOOD = createOakWood("deep_trenches:ghoshroom_wood");

		GIANT_VIOLET_BUTTON = createOakButton("deep_trenches:giant_violet_button");
		GIANT_VIOLET_DOOR = createOakDoor("deep_trenches:giant_violet_door");
		GIANT_VIOLET_FENCE = createOakFence("deep_trenches:giant_violet_fence");
		GIANT_VIOLET_FENCE_GATE = createOakFenceGate("deep_trenches:giant_violet_fence_gate");
		GIANT_VIOLET_PLANKS = createOakPlanks("deep_trenches:giant_violet_planks");
		GIANT_VIOLET_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:giant_violet_pressure_plate");
		GIANT_VIOLET_SIGN = createOakSign("deep_trenches:giant_violet_sign", SignTypes.GIANT_VIOLET);
		GIANT_VIOLET_SLAB = createOakSlab("deep_trenches:giant_violet_slab");
		GIANT_VIOLET_STAIRS = createOakStairs("deep_trenches:giant_violet_stairs", GIANT_VIOLET_PLANKS);
		GIANT_VIOLET_STEM = createOakLog("deep_trenches:giant_violet_stem");
		GIANT_VIOLET_TRAPDOOR = createOakTrapdoor("deep_trenches:giant_violet_trapdoor");
		GIANT_VIOLET_WALL_SIGN = createOakWallSign("deep_trenches:giant_violet_wall_sign", SignTypes.GIANT_VIOLET);
		GIANT_VIOLET_WOOD = createOakWood("deep_trenches:giant_violet_wood");

		GUAIACUM_BUTTON = createOakButton("deep_trenches:guaiacum_button");
		GUAIACUM_DOOR = createOakDoor("deep_trenches:guaiacum_door");
		GUAIACUM_FENCE = createOakFence("deep_trenches:guaiacum_fence");
		GUAIACUM_FENCE_GATE = createOakFenceGate("deep_trenches:guaiacum_fence_gate");
		GUAIACUM_FLOWERS = createBlock("deep_trenches:guaiacum_flowers", GuaiacumFlowersBlock::new, OAK_LEAVES);
		GUAIACUM_LEAVES = createOakLeaves("deep_trenches:guaiacum_leaves");
		GUAIACUM_LOG = createOakLog("deep_trenches:guaiacum_log");
		GUAIACUM_PLANKS = createOakPlanks("deep_trenches:guaiacum_planks");
		GUAIACUM_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:guaiacum_pressure_plate");
		GUAIACUM_SAPLING = createOakSapling("deep_trenches:guaiacum_sapling", SaplingGenerators.GUAIACUM);
		GUAIACUM_SIGN = createOakSign("deep_trenches:guaiacum_sign", SignTypes.GUAIACUM);
		GUAIACUM_SLAB = createOakSlab("deep_trenches:guaiacum_slab");
		GUAIACUM_STAIRS = createOakStairs("deep_trenches:guaiacum_stairs", GUAIACUM_PLANKS);
		GUAIACUM_TRAPDOOR = createOakTrapdoor("deep_trenches:guaiacum_trapdoor");
		GUAIACUM_WALL_SIGN = createOakWallSign("deep_trenches:guaiacum_wall_sign", SignTypes.GUAIACUM);
		GUAIACUM_WOOD = createOakWood("deep_trenches:guaiacum_wood");

		JOSHUA_BUTTON = createOakButton("deep_trenches:joshua_button");
		JOSHUA_DOOR = createOakDoor("deep_trenches:joshua_door");
		JOSHUA_FENCE = createOakFence("deep_trenches:joshua_fence");
		JOSHUA_FENCE_GATE = createOakFenceGate("deep_trenches:joshua_fence_gate");
		JOSHUA_LEAVES = createOakLeaves("deep_trenches:joshua_leaves");
		JOSHUA_LOG = createOakLog("deep_trenches:joshua_log");
		JOSHUA_PLANKS = createOakPlanks("deep_trenches:joshua_planks");
		JOSHUA_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:joshua_pressure_plate");
		JOSHUA_SAPLING = createOakSapling("deep_trenches:joshua_sapling", SaplingGenerators.JOSHUA);
		JOSHUA_SIGN = createOakSign("deep_trenches:joshua_sign", SignTypes.JOSHUA);
		JOSHUA_SLAB = createOakSlab("deep_trenches:joshua_slab");
		JOSHUA_STAIRS = createOakStairs("deep_trenches:joshua_stairs", JOSHUA_PLANKS);
		JOSHUA_TRAPDOOR = createOakTrapdoor("deep_trenches:joshua_trapdoor");
		JOSHUA_WALL_SIGN = createOakWallSign("deep_trenches:joshua_wall_sign", SignTypes.JOSHUA);
		JOSHUA_WOOD = createOakWood("deep_trenches:joshua_wood");

		KLINKII_PINE_BUTTON = createOakButton("deep_trenches:klinkii_pine_button");
		KLINKII_PINE_DOOR = createOakDoor("deep_trenches:klinkii_pine_door");
		KLINKII_PINE_FENCE = createOakFence("deep_trenches:klinkii_pine_fence");
		KLINKII_PINE_FENCE_GATE = createOakFenceGate("deep_trenches:klinkii_pine_fence_gate");
		KLINKII_PINE_LEAVES = createOakLeaves("deep_trenches:klinkii_pine_leaves");
		KLINKII_PINE_LOG = createOakLog("deep_trenches:klinkii_pine_log");
		KLINKII_PINE_PLANKS = createOakPlanks("deep_trenches:klinkii_pine_planks");
		KLINKII_PINE_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:klinkii_pine_pressure_plate");
		KLINKII_PINE_SAPLING = createOakSapling("deep_trenches:klinkii_pine_sapling", SaplingGenerators.KLINKII_PINE);
		KLINKII_PINE_SIGN = createOakSign("deep_trenches:klinkii_pine_sign", SignTypes.KLINKII_PINE);
		KLINKII_PINE_SLAB = createOakSlab("deep_trenches:klinkii_pine_slab");
		KLINKII_PINE_STAIRS = createOakStairs("deep_trenches:klinkii_pine_stairs", KLINKII_PINE_PLANKS);
		KLINKII_PINE_TRAPDOOR = createOakTrapdoor("deep_trenches:klinkii_pine_trapdoor");
		KLINKII_PINE_WALL_SIGN = createOakWallSign("deep_trenches:klinkii_pine_wall_sign", SignTypes.KLINKII_PINE);
		KLINKII_PINE_WOOD = createOakWood("deep_trenches:klinkii_pine_wood");

		MELALEUCA_BUTTON = createOakButton("deep_trenches:melaleuca_button");
		MELALEUCA_DOOR = createOakDoor("deep_trenches:melaleuca_door");
		MELALEUCA_FENCE = createOakFence("deep_trenches:melaleuca_fence");
		MELALEUCA_FENCE_GATE = createOakFenceGate("deep_trenches:melaleuca_fence_gate");
		MELALEUCA_FLOWERS = createBlock("deep_trenches:melaleuca_flowers", MelaleucaFlowersBlock::new, OAK_LEAVES);
		MELALEUCA_LEAVES = createOakLeaves("deep_trenches:melaleuca_leaves");
		MELALEUCA_LOG = createOakLog("deep_trenches:melaleuca_log");
		MELALEUCA_PLANKS = createOakPlanks("deep_trenches:melaleuca_planks");
		MELALEUCA_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:melaleuca_pressure_plate");
		MELALEUCA_SAPLING = createOakSapling("deep_trenches:melaleuca_sapling", SaplingGenerators.MELALEUCA);
		MELALEUCA_SIGN = createOakSign("deep_trenches:melaleuca_sign", SignTypes.MELALEUCA);
		MELALEUCA_SLAB = createOakSlab("deep_trenches:melaleuca_slab");
		MELALEUCA_STAIRS = createOakStairs("deep_trenches:melaleuca_stairs", MELALEUCA_PLANKS);
		MELALEUCA_TRAPDOOR = createOakTrapdoor("deep_trenches:melaleuca_trapdoor");
		MELALEUCA_WALL_SIGN = createOakWallSign("deep_trenches:melaleuca_wall_sign", SignTypes.MELALEUCA);
		MELALEUCA_WOOD = createOakWood("deep_trenches:melaleuca_wood");

		MOSSY_YEW_LOG = createOakLog("deep_trenches:mossy_yew_log");

		MURKANTUAN_BUTTON = createOakButton("deep_trenches:murkantuan_button");
		MURKANTUAN_DOOR = createOakDoor("deep_trenches:murkantuan_door");
		MURKANTUAN_FENCE = createOakFence("deep_trenches:murkantuan_fence");
		MURKANTUAN_FENCE_GATE = createOakFenceGate("deep_trenches:murkantuan_fence_gate");
		MURKANTUAN_LEAVES = createOakLeaves("deep_trenches:murkantuan_leaves");
		MURKANTUAN_FLOWER = createBlock("deep_trenches:murkantuan_flower", MurkantuanFlowerBlock::new, OAK_LEAVES);
		MURKANTUAN_LOG = createOakLog("deep_trenches:murkantuan_log");
		MURKANTUAN_PLANKS = createOakPlanks("deep_trenches:murkantuan_planks");
		MURKANTUAN_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:murkantuan_pressure_plate");
		MURKANTUAN_SAPLING = createOakSapling("deep_trenches:murkantuan_sapling", SaplingGenerators.MURKANTUAN);
		MURKANTUAN_SIGN = createOakSign("deep_trenches:murkantuan_sign", SignTypes.MURKANTUAN);
		MURKANTUAN_SLAB = createOakSlab("deep_trenches:murkantuan_slab");
		MURKANTUAN_STAIRS = createOakStairs("deep_trenches:murkantuan_stairs", MURKANTUAN_PLANKS);
		MURKANTUAN_TRAPDOOR = createOakTrapdoor("deep_trenches:murkantuan_trapdoor");
		MURKANTUAN_WALL_SIGN = createOakWallSign("deep_trenches:murkantuan_wall_sign", SignTypes.MURKANTUAN);
		MURKANTUAN_WOOD = createOakWood("deep_trenches:murkantuan_wood");

		NORFOLK_PINE_BUTTON = createOakButton("deep_trenches:norfolk_pine_button");
		NORFOLK_PINE_DOOR = createOakDoor("deep_trenches:norfolk_pine_door");
		NORFOLK_PINE_FENCE = createOakFence("deep_trenches:norfolk_pine_fence");
		NORFOLK_PINE_FENCE_GATE = createOakFenceGate("deep_trenches:norfolk_pine_fence_gate");
		NORFOLK_PINE_LEAVES = createOakLeaves("deep_trenches:norfolk_pine_leaves");
		NORFOLK_PINE_LOG = createOakLog("deep_trenches:norfolk_pine_log");
		NORFOLK_PINE_PLANKS = createOakPlanks("deep_trenches:norfolk_pine_planks");
		NORFOLK_PINE_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:norfolk_pine_pressure_plate");
		NORFOLK_PINE_SAPLING = createOakSapling("deep_trenches:norfolk_pine_sapling", SaplingGenerators.NORFOLK_PINE);
		NORFOLK_PINE_SIGN = createOakSign("deep_trenches:norfolk_pine_sign", SignTypes.NORFOLK_PINE);
		NORFOLK_PINE_SLAB = createOakSlab("deep_trenches:norfolk_pine_slab");
		NORFOLK_PINE_STAIRS = createOakStairs("deep_trenches:norfolk_pine_stairs", NORFOLK_PINE_PLANKS);
		NORFOLK_PINE_TRAPDOOR = createOakTrapdoor("deep_trenches:norfolk_pine_trapdoor");
		NORFOLK_PINE_WALL_SIGN = createOakWallSign("deep_trenches:norfolk_pine_wall_sign", SignTypes.NORFOLK_PINE);
		NORFOLK_PINE_WOOD = createOakWood("deep_trenches:norfolk_pine_wood");

		OBSCRUS = createCopy("deep_trenches:obscrus", KELP_PLANT);
		OBSCRUS_BUTTON = createOakButton("deep_trenches:obscrus_button");
		OBSCRUS_DOOR = createOakDoor("deep_trenches:obscrus_door");
		OBSCRUS_FENCE = createOakFence("deep_trenches:obscrus_fence");
		OBSCRUS_FENCE_GATE = createOakFenceGate("deep_trenches:obscrus_fence_gate");
		OBSCRUS_LEAVES = createOakLeaves("deep_trenches:obscrus_leaves");
		OBSCRUS_LOG = createOakLog("deep_trenches:obscrus_log");
		OBSCRUS_PLANKS = createOakPlanks("deep_trenches:obscrus_planks");
		OBSCRUS_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:obscrus_pressure_plate");
		OBSCRUS_SIGN = createOakSign("deep_trenches:obscrus_sign", SignTypes.OBSCRUS);
		OBSCRUS_SLAB = createOakSlab("deep_trenches:obscrus_slab");
		OBSCRUS_STAIRS = createOakStairs("deep_trenches:obscrus_stairs", OBSCRUS_PLANKS);
		OBSCRUS_TRAPDOOR = createOakTrapdoor("deep_trenches:obscrus_trapdoor");
		OBSCRUS_WALL_SIGN = createOakWallSign("deep_trenches:obscrus_wall_sign", SignTypes.OBSCRUS);
		OBSCRUS_WOOD = createOakWood("deep_trenches:obscrus_wood");

		ORHPRIS_BUTTON = createOakButton("deep_trenches:orhpris_button");
		ORHPRIS_DOOR = createOakDoor("deep_trenches:orhpris_door");
		ORHPRIS_FENCE = createOakFence("deep_trenches:orhpris_fence");
		ORHPRIS_FENCE_GATE = createOakFenceGate("deep_trenches:orhpris_fence_gate");
		ORHPRIS_LEAVES = createOakLeaves("deep_trenches:orhpris_leaves");
		ORHPRIS_LOG = createOakLog("deep_trenches:orhpris_log");
		ORHPRIS_PLANKS = createOakPlanks("deep_trenches:orhpris_planks");
		ORHPRIS_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:orhpris_pressure_plate");
		ORHPRIS_SAPLING = createOakSapling("deep_trenches:orhpris_sapling", SaplingGenerators.ORHPRIS);
		ORHPRIS_SIGN = createOakSign("deep_trenches:orhpris_sign", SignTypes.ORHPRIS);
		ORHPRIS_SLAB = createOakSlab("deep_trenches:orhpris_slab");
		ORHPRIS_STAIRS = createOakStairs("deep_trenches:orhpris_stairs", ORHPRIS_PLANKS);
		ORHPRIS_TRAPDOOR = createOakTrapdoor("deep_trenches:orhpris_trapdoor");
		ORHPRIS_WALL_SIGN = createOakWallSign("deep_trenches:orhpris_wall_sign", SignTypes.ORHPRIS);
		ORHPRIS_WOOD = createOakWood("deep_trenches:orhpris_wood");

		PELTOGYNE_BUTTON = createOakButton("deep_trenches:peltogyne_button");
		PELTOGYNE_DOOR = createOakDoor("deep_trenches:peltogyne_door");
		PELTOGYNE_FENCE = createOakFence("deep_trenches:peltogyne_fence");
		PELTOGYNE_FENCE_GATE = createOakFenceGate("deep_trenches:peltogyne_fence_gate");
		PELTOGYNE_LEAVES = createOakLeaves("deep_trenches:peltogyne_leaves");
		PELTOGYNE_LOG = createOakLog("deep_trenches:peltogyne_log");
		PELTOGYNE_PLANKS = createOakPlanks("deep_trenches:peltogyne_planks");
		PELTOGYNE_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:peltogyne_pressure_plate");
		PELTOGYNE_SAPLING = createOakSapling("deep_trenches:peltogyne_sapling", SaplingGenerators.PELTOGYNE);
		PELTOGYNE_SIGN = createOakSign("deep_trenches:peltogyne_sign", SignTypes.PELTOGYNE);
		PELTOGYNE_SLAB = createOakSlab("deep_trenches:peltogyne_slab");
		PELTOGYNE_STAIRS = createOakStairs("deep_trenches:peltogyne_stairs", PELTOGYNE_PLANKS);
		PELTOGYNE_TRAPDOOR = createOakTrapdoor("deep_trenches:peltogyne_trapdoor");
		PELTOGYNE_WALL_SIGN = createOakWallSign("deep_trenches:peltogyne_wall_sign", SignTypes.PELTOGYNE);
		PELTOGYNE_WOOD = createOakWood("deep_trenches:peltogyne_wood");

		PIN_CHERRY_BUTTON = createOakButton("deep_trenches:pin_cherry_button");
		PIN_CHERRY_DOOR = createOakDoor("deep_trenches:pin_cherry_door");
		PIN_CHERRY_FENCE = createOakFence("deep_trenches:pin_cherry_fence");
		PIN_CHERRY_FENCE_GATE = createOakFenceGate("deep_trenches:pin_cherry_fence_gate");
		PIN_CHERRY_LEAVES = createOakLeaves("deep_trenches:pin_cherry_leaves");
		PIN_CHERRY_LOG = createOakLog("deep_trenches:pin_cherry_log");
		PIN_CHERRY_PLANKS = createOakPlanks("deep_trenches:pin_cherry_planks");
		PIN_CHERRY_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:pin_cherry_pressure_plate");
		PIN_CHERRY_SAPLING = createOakSapling("deep_trenches:pin_cherry_sapling", SaplingGenerators.PIN_CHERRY);
		PIN_CHERRY_SIGN = createOakSign("deep_trenches:pin_cherry_sign", SignTypes.PIN_CHERRY);
		PIN_CHERRY_SLAB = createOakSlab("deep_trenches:pin_cherry_slab");
		PIN_CHERRY_STAIRS = createOakStairs("deep_trenches:pin_cherry_stairs", PIN_CHERRY_PLANKS);
		PIN_CHERRY_TRAPDOOR = createOakTrapdoor("deep_trenches:pin_cherry_trapdoor");
		PIN_CHERRY_WALL_SIGN = createOakWallSign("deep_trenches:pin_cherry_wall_sign", SignTypes.PIN_CHERRY);
		PIN_CHERRY_WOOD = createOakWood("deep_trenches:pin_cherry_wood");

		PLUM_BUTTON = createOakButton("deep_trenches:plum_button");
		PLUM_DOOR = createOakDoor("deep_trenches:plum_door");
		PLUM_FENCE = createOakFence("deep_trenches:plum_fence");
		PLUM_FENCE_GATE = createOakFenceGate("deep_trenches:plum_fence_gate");
		PLUM_LEAVES = createOakLeaves("deep_trenches:plum_leaves");
		PLUM_LOG = createOakLog("deep_trenches:plum_log");
		PLUM_PLANKS = createOakPlanks("deep_trenches:plum_planks");
		PLUM_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:plum_pressure_plate");
		PLUM_SAPLING = createOakSapling("deep_trenches:plum_sapling", SaplingGenerators.PLUM);
		PLUM_SIGN = createOakSign("deep_trenches:plum_sign", SignTypes.PLUM);
		PLUM_SLAB = createOakSlab("deep_trenches:plum_slab");
		PLUM_STAIRS = createOakStairs("deep_trenches:plum_stairs", PLUM_PLANKS);
		PLUM_TRAPDOOR = createOakTrapdoor("deep_trenches:plum_trapdoor");
		PLUM_WALL_SIGN = createOakWallSign("deep_trenches:plum_wall_sign", SignTypes.PLUM);
		PLUM_WOOD = createOakWood("deep_trenches:plum_wood");

		PURFUNGA_BUTTON = createOakButton("deep_trenches:purfunga_button");
		PURFUNGA_CAP = createCap("deep_trenches:purfunga_cap");
		PURFUNGA_DOOR = createOakDoor("deep_trenches:purfunga_door");
		PURFUNGA_FENCE = createOakFence("deep_trenches:purfunga_fence");
		PURFUNGA_FENCE_GATE = createOakFenceGate("deep_trenches:purfunga_fence_gate");
		PURFUNGA_LOG = createOakLog("deep_trenches:purfunga_log");
		PURFUNGA_PLANKS = createOakPlanks("deep_trenches:purfunga_planks");
		PURFUNGA_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:purfunga_pressure_plate");
		PURFUNGA_SAPLING = createOakSapling("deep_trenches:purfunga_sapling", SaplingGenerators.PURFUNGA);
		PURFUNGA_SIGN = createOakSign("deep_trenches:purfunga_sign", SignTypes.PURFUNGA);
		PURFUNGA_SLAB = createOakSlab("deep_trenches:purfunga_slab");
		PURFUNGA_STAIRS = createOakStairs("deep_trenches:purfunga_stairs", PURFUNGA_PLANKS);
		PURFUNGA_TRAPDOOR = createOakTrapdoor("deep_trenches:purfunga_trapdoor");
		PURFUNGA_WALL_SIGN = createOakWallSign("deep_trenches:purfunga_wall_sign", SignTypes.PURFUNGA);
		PURFUNGA_WOOD = createOakWood("deep_trenches:purfunga_wood");

		RARK_BUTTON = createOakButton("deep_trenches:rark_button");
		RARK_DOOR = createOakDoor("deep_trenches:rark_door");
		RARK_FENCE = createOakFence("deep_trenches:rark_fence");
		RARK_FENCE_GATE = createOakFenceGate("deep_trenches:rark_fence_gate");
		RARK_LEAVES = createOakLeaves("deep_trenches:rark_leaves");
		RARK_LOG = createOakLog("deep_trenches:rark_log");
		RARK_PLANKS = createOakPlanks("deep_trenches:rark_planks");
		RARK_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:rark_pressure_plate");
		RARK_SAPLING = createOakSapling("deep_trenches:rark_sapling", SaplingGenerators.RARK);
		RARK_SIGN = createOakSign("deep_trenches:rark_sign", SignTypes.RARK);
		RARK_SLAB = createOakSlab("deep_trenches:rark_slab");
		RARK_STAIRS = createOakStairs("deep_trenches:rark_stairs", RARK_PLANKS);
		RARK_TRAPDOOR = createOakTrapdoor("deep_trenches:rark_trapdoor");
		RARK_WALL_SIGN = createOakWallSign("deep_trenches:rark_wall_sign", SignTypes.RARK);
		RARK_WOOD = createOakWood("deep_trenches:rark_wood");

		RED_ELM_BUTTON = createOakButton("deep_trenches:red_elm_button");
		RED_ELM_DOOR = createOakDoor("deep_trenches:red_elm_door");
		RED_ELM_FENCE = createOakFence("deep_trenches:red_elm_fence");
		RED_ELM_FENCE_GATE = createOakFenceGate("deep_trenches:red_elm_fence_gate");
		RED_ELM_LEAVES = createOakLeaves("deep_trenches:red_elm_leaves");
		RED_ELM_LOG = createOakLog("deep_trenches:red_elm_log");
		RED_ELM_PLANKS = createOakPlanks("deep_trenches:red_elm_planks");
		RED_ELM_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:red_elm_pressure_plate");
		RED_ELM_SAPLING = createOakSapling("deep_trenches:red_elm_sapling", SaplingGenerators.RED_ELM);
		RED_ELM_SIGN = createOakSign("deep_trenches:red_elm_sign", SignTypes.RED_ELM);
		RED_ELM_SLAB = createOakSlab("deep_trenches:red_elm_slab");
		RED_ELM_STAIRS = createOakStairs("deep_trenches:red_elm_stairs", RED_ELM_PLANKS);
		RED_ELM_TRAPDOOR = createOakTrapdoor("deep_trenches:red_elm_trapdoor");
		RED_ELM_WALL_SIGN = createOakWallSign("deep_trenches:red_elm_wall_sign", SignTypes.RED_ELM);
		RED_ELM_WOOD = createOakWood("deep_trenches:red_elm_wood");

		RHADI_BUTTON = createOakButton("deep_trenches:rhadi_button");
		RHADI_DOOR = createOakDoor("deep_trenches:rhadi_door");
		RHADI_FENCE = createOakFence("deep_trenches:rhadi_fence");
		RHADI_FENCE_GATE = createOakFenceGate("deep_trenches:rhadi_fence_gate");
		RHADI_FRUIT = createBlock("deep_trenches:rhadi_fruit", RhadiFruit::new, MELON);
		CARVED_RHADI_FRUIT = createHorizontalBlock("deep_trenches:carved_rhadi_fruit", MELON);
		RHADI_LEAVES = createOakLeaves("deep_trenches:rhadi_leaves");
		RHADI_LOG = createOakLog("deep_trenches:rhadi_log");
		RHADI_O_LANTERN = createHorizontalBlock("deep_trenches:rhadi_o_lantern", JACK_O_LANTERN);
		RHADI_PLANKS = createOakPlanks("deep_trenches:rhadi_planks");
		RHADI_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:rhadi_pressure_plate");
		RHADI_SAPLING = createOakSapling("deep_trenches:rhadi_sapling", SaplingGenerators.RHADI);
		RHADI_SIGN = createOakSign("deep_trenches:rhadi_sign", SignTypes.RHADI);
		RHADI_SLAB = createOakSlab("deep_trenches:rhadi_slab");
		RHADI_STAIRS = createOakStairs("deep_trenches:rhadi_stairs", RHADI_PLANKS);
		RHADI_THORNS = createBlock("deep_trenches:rhadi_thorns", RhadiVineThornsBlock::new, OAK_LEAVES);
		RHADI_TRAPDOOR = createOakTrapdoor("deep_trenches:rhadi_trapdoor");
		RHADI_WALL_SIGN = createOakWallSign("deep_trenches:rhadi_wall_sign", SignTypes.RHADI);
		RHADI_WOOD = createOakWood("deep_trenches:rhadi_wood");

		SANGUART_BUTTON = createOakButton("deep_trenches:sanguart_button");
		SANGUART_DOOR = createOakDoor("deep_trenches:sanguart_door");
		SANGUART_FENCE = createOakFence("deep_trenches:sanguart_fence");
		SANGUART_FENCE_GATE = createOakFenceGate("deep_trenches:sanguart_fence_gate");
		SANGUART_LEAVES = createOakLeaves("deep_trenches:sanguart_leaves");
		SANGUART_LOG = createOakLog("deep_trenches:sanguart_log");
		SANGUART_PLANKS = createOakPlanks("deep_trenches:sanguart_planks");
		SANGUART_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:sanguart_pressure_plate");
		SANGUART_SAPLING = createOakSapling("deep_trenches:sanguart_sapling", SaplingGenerators.SANGUART);
		SANGUART_SIGN = createOakSign("deep_trenches:sanguart_sign", SignTypes.SANGUART);
		SANGUART_SLAB = createOakSlab("deep_trenches:sanguart_slab");
		SANGUART_STAIRS = createOakStairs("deep_trenches:sanguart_stairs", SANGUART_PLANKS);
		SANGUART_TRAPDOOR = createOakTrapdoor("deep_trenches:sanguart_trapdoor");
		SANGUART_WALL_SIGN = createOakWallSign("deep_trenches:sanguart_wall_sign", SignTypes.SANGUART);
		SANGUART_WOOD = createOakWood("deep_trenches:sanguart_wood");

		SCARLET_THIORCEN = createCopy("deep_trenches:scarlet_thiorcen", DEAD_BUSH);
		SCARLET_THIORCEN_BUTTON = createOakButton("deep_trenches:scarlet_thiorcen_button");
		SCARLET_THIORCEN_DOOR = createOakDoor("deep_trenches:scarlet_thiorcen_door");
		SCARLET_THIORCEN_FENCE = createOakFence("deep_trenches:scarlet_thiorcen_fence");
		SCARLET_THIORCEN_FENCE_GATE = createOakFenceGate("deep_trenches:scarlet_thiorcen_fence_gate");
		SCARLET_THIORCEN_LOG = createOakLog("deep_trenches:scarlet_thiorcen_log");
		SCARLET_THIORCEN_PLANKS = createOakPlanks("deep_trenches:scarlet_thiorcen_planks");
		SCARLET_THIORCEN_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:scarlet_thiorcen_pressure_plate");
		SCARLET_THIORCEN_SIGN = createOakSign("deep_trenches:scarlet_thiorcen_sign", SignTypes.SCARLET_THIORCEN);
		SCARLET_THIORCEN_SLAB = createOakSlab("deep_trenches:scarlet_thiorcen_slab");
		SCARLET_THIORCEN_STAIRS = createOakStairs("deep_trenches:scarlet_thiorcen_stairs", SCARLET_THIORCEN_PLANKS);
		SCARLET_THIORCEN_TRAPDOOR = createOakTrapdoor("deep_trenches:scarlet_thiorcen_trapdoor");
		SCARLET_THIORCEN_WALL_SIGN = createOakWallSign("deep_trenches:scarlet_thiorcen_wall_sign", SignTypes.SCARLET_THIORCEN);
		SCARLET_THIORCEN_WOOD = createOakWood("deep_trenches:scarlet_thiorcen_wood");

		SEQUOIA_BUTTON = createOakButton("deep_trenches:sequoia_button");
		SEQUOIA_DOOR = createOakDoor("deep_trenches:sequoia_door");
		SEQUOIA_FENCE = createOakFence("deep_trenches:sequoia_fence");
		SEQUOIA_FENCE_GATE = createOakFenceGate("deep_trenches:sequoia_fence_gate");
		SEQUOIA_LEAVES = createOakLeaves("deep_trenches:sequoia_leaves");
		SEQUOIA_LOG = createOakLog("deep_trenches:sequoia_log");
		SEQUOIA_PLANKS = createOakPlanks("deep_trenches:sequoia_planks");
		SEQUOIA_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:sequoia_pressure_plate");
		SEQUOIA_SAPLING = createOakSapling("deep_trenches:sequoia_sapling", SaplingGenerators.SEQUOIA);
		SEQUOIA_SIGN = createOakSign("deep_trenches:sequoia_sign", SignTypes.SEQUOIA);
		SEQUOIA_SLAB = createOakSlab("deep_trenches:sequoia_slab");
		SEQUOIA_STAIRS = createOakStairs("deep_trenches:sequoia_stairs", SEQUOIA_PLANKS);
		SEQUOIA_TRAPDOOR = createOakTrapdoor("deep_trenches:sequoia_trapdoor");
		SEQUOIA_WALL_SIGN = createOakWallSign("deep_trenches:sequoia_wall_sign", SignTypes.SEQUOIA);
		SEQUOIA_WOOD = createOakWood("deep_trenches:sequoia_wood");

		SPROOM_BUTTON = createOakButton("deep_trenches:sproom_button");
		SPROOM_DOOR = createOakDoor("deep_trenches:sproom_door");
		SPROOM_FENCE = createOakFence("deep_trenches:sproom_fence");
		SPROOM_FENCE_GATE = createOakFenceGate("deep_trenches:sproom_fence_gate");
		SPROOM_LEAVES = createOakLeaves("deep_trenches:sproom_leaves");
		SPROOM_LOG = createOakLog("deep_trenches:sproom_log");
		SPROOM_PLANKS = createOakPlanks("deep_trenches:sproom_planks");
		SPROOM_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:sproom_pressure_plate");
		SPROOM_SAPLING = createStorceanSapling("deep_trenches:sproom_sapling", SaplingGenerators.SPROOM);
		SPROOM_SIGN = createOakSign("deep_trenches:sproom_sign", SignTypes.SPROOM);
		SPROOM_SLAB = createOakSlab("deep_trenches:sproom_slab");
		SPROOM_STAIRS = createOakStairs("deep_trenches:sproom_stairs", SPROOM_PLANKS);
		SPROOM_TRAPDOOR = createOakTrapdoor("deep_trenches:sproom_trapdoor");
		SPROOM_WALL_SIGN = createOakWallSign("deep_trenches:sproom_wall_sign", SignTypes.SPROOM);
		SPROOM_WOOD = createOakWood("deep_trenches:sproom_wood");

		STORTREEAN_BUTTON = createOakButton("deep_trenches:stortreean_button");
		STORTREEAN_DOOR = createOakDoor("deep_trenches:stortreean_door");
		STORTREEAN_FENCE = createOakFence("deep_trenches:stortreean_fence");
		STORTREEAN_FENCE_GATE = createOakFenceGate("deep_trenches:stortreean_fence_gate");
		STORTREEAN_LEAVES = createOakLeaves("deep_trenches:stortreean_leaves");
		STORTREEAN_LOG = createOakLog("deep_trenches:stortreean_log");
		STORTREEAN_PLANKS = createOakPlanks("deep_trenches:stortreean_planks");
		STORTREEAN_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:stortreean_pressure_plate");
		STORTREEAN_SAPLING = createStorceanSapling("deep_trenches:stortreean_sapling", SaplingGenerators.STORTREEAN);
		STORTREEAN_SIGN = createOakSign("deep_trenches:stortreean_sign", SignTypes.STORTREEAN);
		STORTREEAN_SLAB = createOakSlab("deep_trenches:stortreean_slab");
		STORTREEAN_STAIRS = createOakStairs("deep_trenches:stortreean_stairs", STORTREEAN_PLANKS);
		STORTREEAN_TRAPDOOR = createOakTrapdoor("deep_trenches:stortreean_trapdoor");
		STORTREEAN_WALL_SIGN = createOakWallSign("deep_trenches:stortreean_wall_sign", SignTypes.STORTREEAN);
		STORTREEAN_WOOD = createOakWood("deep_trenches:stortreean_wood");

		STRIPPED_ALMOND_LOG = createStrippedOakLog("deep_trenches:stripped_almond_log");
		STRIPPED_ALMOND_WOOD = createStrippedOakWood("deep_trenches:stripped_almond_wood");
		STRIPPED_ANAMEATA_LOG = createStrippedOakLog("deep_trenches:stripped_anameata_log");
		STRIPPED_ANAMEATA_WOOD = createStrippedOakWood("deep_trenches:stripped_anameata_wood");
		STRIPPED_ANGELS_TRUMPET_LOG = createStrippedOakLog("deep_trenches:stripped_angels_trumpet_log");
		STRIPPED_ANGELS_TRUMPET_WOOD = createStrippedOakWood("deep_trenches:stripped_angels_trumpet_wood");
		STRIPPED_AQUEAN_LOG = createStrippedOakLog("deep_trenches:stripped_aquean_log");
		STRIPPED_AQUEAN_WOOD = createStrippedOakWood("deep_trenches:stripped_aquean_wood");
		STRIPPED_BARSHROOKLE_LOG = createStrippedOakLog("deep_trenches:stripped_barshrookle_log");
		STRIPPED_BARSHROOKLE_WOOD = createStrippedOakWood("deep_trenches:stripped_barshrookle_wood");
		STRIPPED_BLACK_BIRCH_LOG = createStrippedOakLog("deep_trenches:stripped_black_birch_log");
		STRIPPED_BLACK_BIRCH_WOOD = createStrippedOakWood("deep_trenches:stripped_black_birch_wood");
		STRIPPED_BLUE_MAHOE_LOG = createStrippedOakLog("deep_trenches:stripped_blue_mahoe_log");
		STRIPPED_BLUE_MAHOE_WOOD = createStrippedOakWood("deep_trenches:stripped_blue_mahoe_wood");
		STRIPPED_BLUE_SPRUCE_LOG = createStrippedOakLog("deep_trenches:stripped_blue_spruce_log");
		STRIPPED_BLUE_SPRUCE_WOOD = createStrippedOakWood("deep_trenches:stripped_blue_spruce_wood");
		STRIPPED_BOTTLEBRUSH_LOG = createStrippedOakLog("deep_trenches:stripped_bottlebrush_log");
		STRIPPED_BOTTLEBRUSH_WOOD = createStrippedOakWood("deep_trenches:stripped_bottlebrush_wood");
		STRIPPED_BROMYA_LOG = createStrippedOakLog("deep_trenches:stripped_bromya_log");
		STRIPPED_BROMYA_WOOD = createStrippedOakWood("deep_trenches:stripped_bromya_wood");
		STRIPPED_BUBBLETREE_LOG = createStrippedOakLog("deep_trenches:stripped_bubbletree_log");
		STRIPPED_BUBBLETREE_WOOD = createStrippedOakWood("deep_trenches:stripped_bubbletree_wood");
		STRIPPED_CALCEARB_LOG = createStrippedOakLog("deep_trenches:stripped_calcearb_log");
		STRIPPED_CALCEARB_WOOD = createStrippedOakWood("deep_trenches:stripped_calcearb_wood");
		STRIPPED_CHERRY_LOG = createStrippedOakLog("deep_trenches:stripped_cherry_log");
		STRIPPED_CHERRY_WOOD = createStrippedOakWood("deep_trenches:stripped_cherry_wood");
		STRIPPED_CHOTORN_LOG = createStrippedOakLog("deep_trenches:stripped_chotorn_log");
		STRIPPED_CHOTORN_WOOD = createStrippedOakWood("deep_trenches:stripped_chotorn_wood");
		STRIPPED_COOK_PINE_LOG = createStrippedOakLog("deep_trenches:stripped_cook_pine_log");
		STRIPPED_COOK_PINE_WOOD = createStrippedOakWood("deep_trenches:stripped_cook_pine_wood");
		STRIPPED_CROLOOD_LOG = createStrippedOakLog("deep_trenches:stripped_crolood_log");
		STRIPPED_CROLOOD_WOOD = createStrippedOakWood("deep_trenches:stripped_crolood_wood");
		STRIPPED_DARK_CROLOOD_LOG = createStrippedOakLog("deep_trenches:stripped_dark_crolood_log");
		STRIPPED_DARK_CROLOOD_WOOD = createStrippedOakWood("deep_trenches:stripped_dark_crolood_wood");
		STRIPPED_DARK_FUCHSITRA_LOG = createStrippedOakLog("deep_trenches:stripped_dark_fuchsitra_log");
		STRIPPED_DARK_FUCHSITRA_WOOD = createStrippedOakWood("deep_trenches:stripped_dark_fuchsitra_wood");
		STRIPPED_DARK_RED_ELM_LOG = createStrippedOakLog("deep_trenches:stripped_dark_red_elm_log");
		STRIPPED_DARK_RED_ELM_WOOD = createStrippedOakWood("deep_trenches:stripped_dark_red_elm_wood");
		STRIPPED_DEAD_WART_TREE_LOG = createStrippedOakLog("deep_trenches:stripped_dead_wart_tree_log");
		STRIPPED_DEAD_WART_TREE_WOOD = createStrippedOakWood("deep_trenches:stripped_dead_wart_tree_wood");
		STRIPPED_DRIGYUS_LOG = createStrippedOakLog("deep_trenches:stripped_drigyus_log");
		STRIPPED_DRIGYUS_WOOD = createStrippedOakWood("deep_trenches:stripped_drigyus_wood");
		STRIPPED_EBONY_LOG = createStrippedOakLog("deep_trenches:stripped_ebony_log");
		STRIPPED_EBONY_WOOD = createStrippedOakWood("deep_trenches:stripped_ebony_wood");
		STRIPPED_ENDERHEART_LOG = createStrippedOakLog("deep_trenches:stripped_enderheart_log");
		STRIPPED_ENDERHEART_WOOD = createStrippedOakWood("deep_trenches:stripped_enderheart_wood");
		STRIPPED_FLALM_STEM = createStrippedOakLog("deep_trenches:stripped_flalm_stem");
		STRIPPED_FLALM_WOOD = createStrippedOakWood("deep_trenches:stripped_flalm_wood");
		STRIPPED_FRUCE_LOG = createStrippedOakLog("deep_trenches:stripped_fruce_log");
		STRIPPED_FRUCE_WOOD = createStrippedOakWood("deep_trenches:stripped_fruce_wood");
		STRIPPED_FUCHSITRA_LOG = createStrippedOakLog("deep_trenches:stripped_fuchsitra_log");
		STRIPPED_FUCHSITRA_WOOD = createStrippedOakWood("deep_trenches:stripped_fuchsitra_wood");
		STRIPPED_FUGMOS_STEM = createStrippedOakLog("deep_trenches:stripped_fugmos_stem");
		STRIPPED_FUGMOS_HYPHAE = createStrippedOakWood("deep_trenches:stripped_fugmos_hyphae");
		STRIPPED_FUNERANITE_LOG = createStrippedOakLog("deep_trenches:stripped_funeranite_log");
		STRIPPED_FUNERANITE_WOOD = createStrippedOakWood("deep_trenches:stripped_funeranite_wood");
		STRIPPED_GHOSHROOM_LOG = createStrippedOakLog("deep_trenches:stripped_ghoshroom_log");
		STRIPPED_GHOSHROOM_WOOD = createStrippedOakWood("deep_trenches:stripped_ghoshroom_wood");
		STRIPPED_GIANT_VIOLET_STEM = createStrippedOakLog("deep_trenches:stripped_giant_violet_stem");
		STRIPPED_GIANT_VIOLET_WOOD = createStrippedOakWood("deep_trenches:stripped_giant_violet_wood");
		STRIPPED_GUAIACUM_LOG = createStrippedOakLog("deep_trenches:stripped_guaiacum_log");
		STRIPPED_GUAIACUM_WOOD = createStrippedOakWood("deep_trenches:stripped_guaiacum_wood");
		STRIPPED_JOSHUA_LOG = createStrippedOakLog("deep_trenches:stripped_joshua_log");
		STRIPPED_JOSHUA_WOOD = createStrippedOakWood("deep_trenches:stripped_joshua_wood");
		STRIPPED_KLINKII_PINE_LOG = createStrippedOakLog("deep_trenches:stripped_klinkii_pine_log");
		STRIPPED_KLINKII_PINE_WOOD = createStrippedOakWood("deep_trenches:stripped_klinkii_pine_wood");
		STRIPPED_MELALEUCA_LOG = createStrippedOakLog("deep_trenches:stripped_melaleuca_log");
		STRIPPED_MELALEUCA_WOOD = createStrippedOakWood("deep_trenches:stripped_melaleuca_wood");
		STRIPPED_MURKANTUAN_LOG = createStrippedOakLog("deep_trenches:stripped_murkantuan_log");
		STRIPPED_MURKANTUAN_WOOD = createStrippedOakWood("deep_trenches:stripped_murkantuan_wood");
		STRIPPED_NORFOLK_PINE_LOG = createStrippedOakLog("deep_trenches:stripped_norfolk_pine_log");
		STRIPPED_NORFOLK_PINE_WOOD = createStrippedOakWood("deep_trenches:stripped_norfolk_pine_wood");
		STRIPPED_OBSCRUS_LOG = createStrippedOakLog("deep_trenches:stripped_obscrus_log");
		STRIPPED_OBSCRUS_WOOD = createStrippedOakWood("deep_trenches:stripped_obscrus_wood");
		STRIPPED_ORHPRIS_LOG = createStrippedOakLog("deep_trenches:stripped_orhpris_log");
		STRIPPED_ORHPRIS_WOOD = createStrippedOakWood("deep_trenches:stripped_orhpris_wood");
		STRIPPED_PELTOGYNE_LOG = createStrippedOakLog("deep_trenches:stripped_peltogyne_log");
		STRIPPED_PELTOGYNE_WOOD = createStrippedOakWood("deep_trenches:stripped_peltogyne_wood");
		STRIPPED_PIN_CHERRY_LOG = createStrippedOakLog("deep_trenches:stripped_pin_cherry_log");
		STRIPPED_PIN_CHERRY_WOOD = createStrippedOakWood("deep_trenches:stripped_pin_cherry_wood");
		STRIPPED_PLUM_LOG = createStrippedOakLog("deep_trenches:stripped_plum_log");
		STRIPPED_PLUM_WOOD = createStrippedOakWood("deep_trenches:stripped_plum_wood");
		STRIPPED_PURFUNGA_LOG = createStrippedOakLog("deep_trenches:stripped_purfunga_log");
		STRIPPED_PURFUNGA_WOOD = createStrippedOakWood("deep_trenches:stripped_purfunga_wood");
		STRIPPED_RARK_LOG = createStrippedOakLog("deep_trenches:stripped_rark_log");
		STRIPPED_RARK_WOOD = createStrippedOakWood("deep_trenches:stripped_rark_wood");
		STRIPPED_RED_ELM_LOG = createStrippedOakLog("deep_trenches:stripped_red_elm_log");
		STRIPPED_RED_ELM_WOOD = createStrippedOakWood("deep_trenches:stripped_red_elm_wood");
		STRIPPED_RHADI_LOG = createStrippedOakLog("deep_trenches:stripped_rhadi_log");
		STRIPPED_RHADI_WOOD = createStrippedOakWood("deep_trenches:stripped_rhadi_wood");
		STRIPPED_SANGUART_LOG = createStrippedOakLog("deep_trenches:stripped_sanguart_log");
		STRIPPED_SANGUART_WOOD = createStrippedOakWood("deep_trenches:stripped_sanguart_wood");
		STRIPPED_SCARLET_THIORCEN_LOG = createStrippedOakLog("deep_trenches:stripped_scarlet_thiorcen_log");
		STRIPPED_SCARLET_THIORCEN_WOOD = createStrippedOakWood("deep_trenches:stripped_scarlet_thiorcen_wood");
		STRIPPED_SEQUOIA_LOG = createStrippedOakLog("deep_trenches:stripped_sequoia_log");
		STRIPPED_SEQUOIA_WOOD = createStrippedOakWood("deep_trenches:stripped_sequoia_wood");
		STRIPPED_SPROOM_LOG = createStrippedOakLog("deep_trenches:stripped_sproom_log");
		STRIPPED_SPROOM_WOOD = createStrippedOakWood("deep_trenches:stripped_sproom_wood");
		STRIPPED_STORTREEAN_LOG = createStrippedOakLog("deep_trenches:stripped_stortreean_log");
		STRIPPED_STORTREEAN_WOOD = createStrippedOakWood("deep_trenches:stripped_stortreean_wood");
		STRIPPED_STROOMEAN_LOG = createStrippedOakLog("deep_trenches:stripped_stroomean_log");
		STRIPPED_STROOMEAN_WOOD = createStrippedOakWood("deep_trenches:stripped_stroomean_wood");
		STRIPPED_SUNRISE_FUNGUS_LOG = createStrippedOakLog("deep_trenches:stripped_sunrise_fungus_log");
		STRIPPED_SUNRISE_FUNGUS_WOOD = createStrippedOakWood("deep_trenches:stripped_sunrise_fungus_wood");
		STRIPPED_TARK_LOG = createStrippedOakLog("deep_trenches:stripped_tark_log");
		STRIPPED_TARK_WOOD = createStrippedOakWood("deep_trenches:stripped_tark_wood");
		STRIPPED_TEAK_LOG = createStrippedOakLog("deep_trenches:stripped_teak_log");
		STRIPPED_TEAK_WOOD = createStrippedOakWood("deep_trenches:stripped_teak_wood");
		STRIPPED_THUNDERCLOUD_PLUM_LOG = createStrippedOakLog("deep_trenches:stripped_thundercloud_plum_log");
		STRIPPED_THUNDERCLOUD_PLUM_WOOD = createStrippedOakWood("deep_trenches:stripped_thundercloud_plum_wood");
		STRIPPED_VYNHERT_LOG = createStrippedOakLog("deep_trenches:stripped_vynhert_log");
		STRIPPED_VYNHERT_WOOD = createStrippedOakWood("deep_trenches:stripped_vynhert_wood");
		STRIPPED_WART_TREE_LOG = createStrippedOakLog("deep_trenches:stripped_wart_tree_log");
		STRIPPED_WART_TREE_WOOD = createStrippedOakWood("deep_trenches:stripped_wart_tree_wood");
		STRIPPED_WENGE_LOG = createStrippedOakLog("deep_trenches:stripped_wenge_log");
		STRIPPED_WENGE_WOOD = createStrippedOakWood("deep_trenches:stripped_wenge_wood");
		STRIPPED_YEW_LOG = createStrippedOakLog("deep_trenches:stripped_yew_log");
		STRIPPED_YEW_WOOD = createStrippedOakWood("deep_trenches:stripped_yew_wood");

		STROOMEAN_BUTTON = createOakButton("deep_trenches:stroomean_button");
		STROOMEAN_CAP = createCap("deep_trenches:stroomean_cap");
		STROOMEAN_DOOR = createOakDoor("deep_trenches:stroomean_door");
		STROOMEAN_FENCE = createOakFence("deep_trenches:stroomean_fence");
		STROOMEAN_FENCE_GATE = createOakFenceGate("deep_trenches:stroomean_fence_gate");
		STROOMEAN_LOG = createOakLog("deep_trenches:stroomean_log");
		STROOMEAN_PLANKS = createOakPlanks("deep_trenches:stroomean_planks");
		STROOMEAN_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:stroomean_pressure_plate");
		STROOMEAN_SAPLING = createOakSapling("deep_trenches:stroomean_sapling", SaplingGenerators.STROOMEAN);
		STROOMEAN_SIGN = createOakSign("deep_trenches:stroomean_sign", SignTypes.STORTREEAN);
		STROOMEAN_SLAB = createOakSlab("deep_trenches:stroomean_slab");
		STROOMEAN_STAIRS = createOakStairs("deep_trenches:stroomean_stairs", STROOMEAN_PLANKS);
		STROOMEAN_TRAPDOOR = createOakTrapdoor("deep_trenches:stroomean_trapdoor");
		STROOMEAN_WALL_SIGN = createOakWallSign("deep_trenches:stroomean_wall_sign", SignTypes.STROOMEAN);
		STROOMEAN_WOOD = createOakWood("deep_trenches:stroomean_wood");

		SUNRISE_FUNGUS_BUTTON = createOakButton("deep_trenches:sunrise_fungus_button");
		SUNRISE_FUNGUS_CAP = createCap("deep_trenches:sunrise_fungus_cap");
		SUNRISE_FUNGUS_DOOR = createOakDoor("deep_trenches:sunrise_fungus_door");
		SUNRISE_FUNGUS_FENCE = createOakFence("deep_trenches:sunrise_fungus_fence");
		SUNRISE_FUNGUS_FENCE_GATE = createOakFenceGate("deep_trenches:sunrise_fungus_fence_gate");
		SUNRISE_FUNGUS_LOG = createOakLog("deep_trenches:sunrise_fungus_log");
		SUNRISE_FUNGUS_PLANKS = createOakPlanks("deep_trenches:sunrise_fungus_planks");
		SUNRISE_FUNGUS_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:sunrise_fungus_pressure_plate");
		SUNRISE_FUNGUS_SAPLING = createOakSapling("deep_trenches:sunrise_fungus_sapling", SaplingGenerators.SUNRISE_FUNGUS);
		SUNRISE_FUNGUS_SIGN = createOakSign("deep_trenches:sunrise_fungus_sign", SignTypes.SUNRISE_FUNGUS);
		SUNRISE_FUNGUS_SLAB = createOakSlab("deep_trenches:sunrise_fungus_slab");
		SUNRISE_FUNGUS_STAIRS = createOakStairs("deep_trenches:sunrise_fungus_stairs", SUNRISE_FUNGUS_PLANKS);
		SUNRISE_FUNGUS_TRAPDOOR = createOakTrapdoor("deep_trenches:sunrise_fungus_trapdoor");
		SUNRISE_FUNGUS_WALL_SIGN = createOakWallSign("deep_trenches:sunrise_fungus_wall_sign", SignTypes.SUNRISE_FUNGUS);
		SUNRISE_FUNGUS_WOOD = createOakWood("deep_trenches:sunrise_fungus_wood");

		TARK_BUTTON = createOakButton("deep_trenches:tark_button");
		TARK_DOOR = createOakDoor("deep_trenches:tark_door");
		TARK_FENCE = createOakFence("deep_trenches:tark_fence");
		TARK_FENCE_GATE = createOakFenceGate("deep_trenches:tark_fence_gate");
		TARK_LEAVES = createOakLeaves("deep_trenches:tark_leaves");
		TARK_LOG = createOakLog("deep_trenches:tark_log");
		TARK_PLANKS = createOakPlanks("deep_trenches:tark_planks");
		TARK_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:tark_pressure_plate");
		TARK_SAPLING = createOakSapling("deep_trenches:tark_sapling", SaplingGenerators.TARK);
		TARK_SIGN = createOakSign("deep_trenches:tark_sign", SignTypes.TARK);
		TARK_SLAB = createOakSlab("deep_trenches:tark_slab");
		TARK_STAIRS = createOakStairs("deep_trenches:tark_stairs", TARK_PLANKS);
		TARK_TRAPDOOR = createOakTrapdoor("deep_trenches:tark_trapdoor");
		TARK_WALL_SIGN = createOakWallSign("deep_trenches:tark_wall_sign", SignTypes.TARK);
		TARK_WOOD = createOakWood("deep_trenches:tark_wood");

		TEAK_BUTTON = createOakButton("deep_trenches:teak_button");
		TEAK_DOOR = createOakDoor("deep_trenches:teak_door");
		TEAK_FENCE = createOakFence("deep_trenches:teak_fence");
		TEAK_FENCE_GATE = createOakFenceGate("deep_trenches:teak_fence_gate");
		TEAK_LEAVES = createOakLeaves("deep_trenches:teak_leaves");
		TEAK_LOG = createOakLog("deep_trenches:teak_log");
		TEAK_PLANKS = createOakPlanks("deep_trenches:teak_planks");
		TEAK_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:teak_pressure_plate");
		TEAK_SAPLING = createOakSapling("deep_trenches:teak_sapling", SaplingGenerators.TEAK);
		TEAK_SIGN = createOakSign("deep_trenches:teak_sign", SignTypes.TEAK);
		TEAK_SLAB = createOakSlab("deep_trenches:teak_slab");
		TEAK_STAIRS = createOakStairs("deep_trenches:teak_stairs", TEAK_PLANKS);
		TEAK_TRAPDOOR = createOakTrapdoor("deep_trenches:teak_trapdoor");
		TEAK_WALL_SIGN = createOakWallSign("deep_trenches:teak_wall_sign", SignTypes.TEAK);
		TEAK_WOOD = createOakWood("deep_trenches:teak_wood");

		THUNDERCLOUD_PLUM_BUTTON = createOakButton("deep_trenches:thundercloud_plum_button");
		THUNDERCLOUD_PLUM_DOOR = createOakDoor("deep_trenches:thundercloud_plum_door");
		THUNDERCLOUD_PLUM_FENCE = createOakFence("deep_trenches:thundercloud_plum_fence");
		THUNDERCLOUD_PLUM_FENCE_GATE = createOakFenceGate("deep_trenches:thundercloud_plum_fence_gate");
		THUNDERCLOUD_PLUM_LEAVES = createOakLeaves("deep_trenches:thundercloud_plum_leaves");
		THUNDERCLOUD_PLUM_LOG = createOakLog("deep_trenches:thundercloud_plum_log");
		THUNDERCLOUD_PLUM_PLANKS = createOakPlanks("deep_trenches:thundercloud_plum_planks");
		THUNDERCLOUD_PLUM_SAPLING = createOakSapling("deep_trenches:thundercloud_plum_sapling", SaplingGenerators.THUNDERCLOUD_PLUM);
		THUNDERCLOUD_PLUM_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:thundercloud_plum_pressure_plate");
		THUNDERCLOUD_PLUM_SIGN = createOakSign("deep_trenches:thundercloud_plum_sign", SignTypes.THUNDERCLOUD_PLUM);
		THUNDERCLOUD_PLUM_SLAB = createOakSlab("deep_trenches:thundercloud_plum_slab");
		THUNDERCLOUD_PLUM_STAIRS = createOakStairs("deep_trenches:thundercloud_plum_stairs", THUNDERCLOUD_PLUM_PLANKS);
		THUNDERCLOUD_PLUM_TRAPDOOR = createOakTrapdoor("deep_trenches:thundercloud_plum_trapdoor");
		THUNDERCLOUD_PLUM_WALL_SIGN = createOakWallSign("deep_trenches:thundercloud_plum_wall_sign", SignTypes.THUNDERCLOUD_PLUM);
		THUNDERCLOUD_PLUM_WOOD = createOakWood("deep_trenches:thundercloud_plum_wood");

		VYNHERT_BUTTON = createOakButton("deep_trenches:vynhert_button");
		VYNHERT_DOOR = createOakDoor("deep_trenches:vynhert_door");
		VYNHERT_FENCE = createOakFence("deep_trenches:vynhert_fence");
		VYNHERT_FENCE_GATE = createOakFenceGate("deep_trenches:vynhert_fence_gate");
		VYNHERT_FRUIT = createBlock("deep_trenches:vynhert_fruit", VynhertFruit::new, MELON);
		CARVED_VYNHERT_FRUIT = createHorizontalBlock("deep_trenches:carved_vynhert_fruit", MELON);
		VYNHERT_LEAF = createBlock("deep_trenches:vynhert_leaf", VynhertLeafBlock::new, ROSE_BUSH);
		VYNHERT_LOG = createOakLog("deep_trenches:vynhert_log");
		VYNHERT_O_LANTERN = createHorizontalBlock("deep_trenches:vynhert_o_lantern", JACK_O_LANTERN);
		VYNHERT_PLANKS = createOakPlanks("deep_trenches:vynhert_planks");
		VYNHERT_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:vynhert_pressure_plate");
		VYNHERT_SAPLING = createOakSapling("deep_trenches:vynhert_sapling", SaplingGenerators.VYNHERT);
		VYNHERT_SIGN = createOakSign("deep_trenches:vynhert_sign", SignTypes.VYNHERT);
		VYNHERT_SLAB = createOakSlab("deep_trenches:vynhert_slab");
		VYNHERT_STAIRS = createOakStairs("deep_trenches:vynhert_stairs", VYNHERT_PLANKS);
		VYNHERT_TENTACLES = createBlock("deep_trenches:vynhert_tentacles", VynhertThornsBlock::new, OAK_LEAVES);
		VYNHERT_THORNS = createBlock("deep_trenches:vynhert_thorns", VynhertThornsBlock::new, OAK_LEAVES);
		VYNHERT_TRAPDOOR = createOakTrapdoor("deep_trenches:vynhert_trapdoor");
		VYNHERT_WALL_SIGN = createOakWallSign("deep_trenches:vynhert_wall_sign", SignTypes.VYNHERT);
		VYNHERT_WOOD = createOakWood("deep_trenches:vynhert_wood");

		WART_TREE_BUTTON = createOakButton("deep_trenches:wart_tree_button");
		WART_TREE_DOOR = createOakDoor("deep_trenches:wart_tree_door");
		WART_TREE_FENCE = createOakFence("deep_trenches:wart_tree_fence");
		WART_TREE_FENCE_GATE = createOakFenceGate("deep_trenches:wart_tree_fence_gate");
		WART_TREE_LOG = createOakLog("deep_trenches:wart_tree_log");
		WART_TREE_PLANKS = createOakPlanks("deep_trenches:wart_tree_planks");
		WART_TREE_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:wart_tree_pressure_plate");
		WART_TREE_SIGN = createOakSign("deep_trenches:wart_tree_sign", SignTypes.WART_TREE);
		WART_TREE_SLAB = createOakSlab("deep_trenches:wart_tree_slab");
		WART_TREE_STAIRS = createOakStairs("deep_trenches:wart_tree_stairs", WART_TREE_PLANKS);
		WART_TREE_TRAPDOOR = createOakTrapdoor("deep_trenches:wart_tree_trapdoor");
		WART_TREE_WALL_SIGN = createOakWallSign("deep_trenches:wart_tree_wall_sign", SignTypes.WART_TREE);
		WART_TREE_WARTS = createCopy("deep_trenches:wart_tree_warts", NETHER_WART_BLOCK);
		WART_TREE_WOOD = createOakWood("deep_trenches:wart_tree_wood");

		WENGE_BUTTON = createOakButton("deep_trenches:wenge_button");
		WENGE_DOOR = createOakDoor("deep_trenches:wenge_door");
		WENGE_FENCE = createOakFence("deep_trenches:wenge_fence");
		WENGE_FENCE_GATE = createOakFenceGate("deep_trenches:wenge_fence_gate");
		WENGE_LEAVES = createOakLeaves("deep_trenches:wenge_leaves");
		WENGE_LOG = createOakLog("deep_trenches:wenge_log");
		WENGE_PLANKS = createOakPlanks("deep_trenches:wenge_planks");
		WENGE_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:wenge_pressure_plate");
		WENGE_SAPLING = createOakSapling("deep_trenches:wenge_sapling", SaplingGenerators.WENGE);
		WENGE_SIGN = createOakSign("deep_trenches:wenge_sign", SignTypes.WENGE);
		WENGE_SLAB = createOakSlab("deep_trenches:wenge_slab");
		WENGE_STAIRS = createOakStairs("deep_trenches:wenge_stairs", WENGE_PLANKS);
		WENGE_TRAPDOOR = createOakTrapdoor("deep_trenches:wenge_trapdoor");
		WENGE_WALL_SIGN = createOakWallSign("deep_trenches:wenge_wall_sign", SignTypes.WENGE);
		WENGE_WOOD = createOakWood("deep_trenches:wenge_wood");

		YEW_BUTTON = createOakButton("deep_trenches:yew_button");
		YEW_DOOR = createOakDoor("deep_trenches:yew_door");
		YEW_FENCE = createOakFence("deep_trenches:yew_fence");
		YEW_FENCE_GATE = createOakFenceGate("deep_trenches:yew_fence_gate");
		YEW_LEAVES = createOakLeaves("deep_trenches:yew_leaves");
		YEW_LOG = createOakLog("deep_trenches:yew_log");
		YEW_PLANKS = createOakPlanks("deep_trenches:yew_planks");
		YEW_PRESSURE_PLATE = createOakPressurePlate("deep_trenches:yew_pressure_plate");
		YEW_SAPLING = createOakSapling("deep_trenches:yew_sapling", SaplingGenerators.YEW);
		YEW_SIGN = createOakSign("deep_trenches:yew_sign", SignTypes.YEW);
		YEW_SLAB = createOakSlab("deep_trenches:yew_slab");
		YEW_STAIRS = createOakStairs("deep_trenches:yew_stairs", YEW_PLANKS);
		YEW_TRAPDOOR = createOakTrapdoor("deep_trenches:yew_trapdoor");
		YEW_WALL_SIGN = createOakWallSign("deep_trenches:yew_wall_sign", SignTypes.YEW);
		YEW_WOOD = createOakWood("deep_trenches:yew_wood");

		POTTED_ALMOND_SAPLING = createPottedSapling("deep_trenches:potted_almond_sapling", ALMOND_SAPLING);
		POTTED_ANAMEATA_SAPLING = createPottedSapling("deep_trenches:potted_anameata_sapling", ANAMEATA_SAPLING);
		POTTED_ANGELS_TRUMPET_SAPLING = createPottedSapling("deep_trenches:potted_angels_trumpet_sapling", ANGELS_TRUMPET_SAPLING);
		POTTED_AQUEAN_SAPLING = createPottedSapling("deep_trenches:potted_aquean_sapling", AQUEAN_SAPLING);
		POTTED_BARSHROOKLE_SAPLING = createPottedSapling("deep_trenches:potted_barshrookle_sapling", BARSHROOKLE_SAPLING);
		POTTED_BLACK_BIRCH_SAPLING = createPottedSapling("deep_trenches:potted_black_birch_sapling", BLACK_BIRCH_SAPLING);
		POTTED_BLUE_MAHOE_SAPLING = createPottedSapling("deep_trenches:potted_blue_mahoe_sapling", BLUE_MAHOE_SAPLING);
		POTTED_BLUE_SPRUCE_SAPLING = createPottedSapling("deep_trenches:potted_blue_spruce_sapling", BLUE_SPRUCE_SAPLING);
		POTTED_BOTTLEBRUSH_SAPLING = createPottedSapling("deep_trenches:potted_bottlebrush_sapling", BOTTLEBRUSH_SAPLING);
		POTTED_BROMYA_SAPLING = createPottedSapling("deep_trenches:potted_bromya_sapling", BROMYA_SAPLING);
		POTTED_BUBBLETREE_SAPLING = createPottedSapling("deep_trenches:potted_bubbletree_sapling", BUBBLETREE_SAPLING);
		POTTED_CALCEARB_SAPLING = createPottedSapling("deep_trenches:potted_calcearb_sapling", CALCEARB_SAPLING);
		POTTED_CHERRY_SAPLING = createPottedSapling("deep_trenches:potted_cherry_sapling", CHERRY_SAPLING);
		POTTED_COOK_PINE_SAPLING = createPottedSapling("deep_trenches:potted_cook_pine_sapling", COOK_PINE_SAPLING);
		POTTED_CROLOOD_SAPLING = createPottedSapling("deep_trenches:potted_crolood_sapling", CROLOOD_SAPLING);
		POTTED_DARK_CROLOOD_SAPLING = createPottedSapling("deep_trenches:potted_dark_crolood_sapling", DARK_CROLOOD_SAPLING);
		POTTED_DARK_FUCHSITRA_SAPLING = createPottedSapling("deep_trenches:potted_dark_fuchsitra_sapling", DARK_FUCHSITRA_SAPLING);
		POTTED_DARK_RED_ELM_SAPLING = createPottedSapling("deep_trenches:potted_dark_red_elm_sapling", DARK_RED_ELM_SAPLING);
		POTTED_EBONY_SAPLING = createPottedSapling("deep_trenches:potted_ebony_sapling", EBONY_SAPLING);
		POTTED_ENDERHEART_SAPLING = createPottedSapling("deep_trenches:potted_enderheart_sapling", ENDERHEART_SAPLING);
		POTTED_FRUCE_SAPLING = createPottedSapling("deep_trenches:potted_fruce_sapling", FRUCE_SAPLING);
		POTTED_FUCHSITRA_SAPLING = createPottedSapling("deep_trenches:potted_fuchsitra_sapling", FUCHSITRA_SAPLING);
		POTTED_FUGMOS = createPottedSapling("deep_trenches:potted_fugmos", FUGMOS);
		POTTED_FUNERANITE_SAPLING = createPottedSapling("deep_trenches:potted_funeranite_sapling", FUNERANITE_SAPLING);
		POTTED_GHOSHROOM_SAPLING = createPottedSapling("deep_trenches:potted_ghoshroom_sapling", GHOSHROOM_SAPLING);
		POTTED_GUAIACUM_SAPLING = createPottedSapling("deep_trenches:potted_guaiacum_sapling", GUAIACUM_SAPLING);
		POTTED_JOSHUA_SAPLING = createPottedSapling("deep_trenches:potted_joshua_sapling", JOSHUA_SAPLING);
		POTTED_KLINKII_PINE_SAPLING = createPottedSapling("deep_trenches:potted_klinkii_pine_sapling", KLINKII_PINE_SAPLING);
		POTTED_MELALEUCA_SAPLING = createPottedSapling("deep_trenches:potted_melaleuca_sapling", MELALEUCA_SAPLING);
		POTTED_MURKANTUAN_SAPLING = createPottedSapling("deep_trenches:potted_murkantuan_sapling", MURKANTUAN_SAPLING);
		POTTED_NORFOLK_PINE_SAPLING = createPottedSapling("deep_trenches:potted_norfolk_pine_sapling", NORFOLK_PINE_SAPLING);
		POTTED_ORHPRIS_SAPLING = createPottedSapling("deep_trenches:potted_orhpris_sapling", ORHPRIS_SAPLING);
		POTTED_PELTOGYNE_SAPLING = createPottedSapling("deep_trenches:potted_peltogyne_sapling", PELTOGYNE_SAPLING);
		POTTED_PIN_CHERRY_SAPLING = createPottedSapling("deep_trenches:potted_pin_cherry_sapling", PIN_CHERRY_SAPLING);
		POTTED_PLUM_SAPLING = createPottedSapling("deep_trenches:potted_plum_sapling", PLUM_SAPLING);
		POTTED_PURFUNGA_SAPLING = createPottedSapling("deep_trenches:potted_purfunga_sapling", PURFUNGA_SAPLING);
		POTTED_RARK_SAPLING = createPottedSapling("deep_trenches:potted_rark_sapling", RARK_SAPLING);
		POTTED_RED_ELM_SAPLING = createPottedSapling("deep_trenches:potted_red_elm_sapling", RED_ELM_SAPLING);
		POTTED_RHADI_SAPLING = createPottedSapling("deep_trenches:potted_rhadi_sapling", RHADI_SAPLING);
		POTTED_SANGUART_SAPLING = createPottedSapling("deep_trenches:potted_sanguart_sapling", SANGUART_SAPLING);
		POTTED_SEQUOIA_SAPLING = createPottedSapling("deep_trenches:potted_sequoia_sapling", SEQUOIA_SAPLING);
		POTTED_SPROOM_SAPLING = createPottedSapling("deep_trenches:potted_sproom_sapling", SPROOM_SAPLING);
		POTTED_STORTREEAN_SAPLING = createPottedSapling("deep_trenches:potted_stortreean_sapling", STORTREEAN_SAPLING);
		POTTED_STROOMEAN_SAPLING = createPottedSapling("deep_trenches:potted_stroomean_sapling", STROOMEAN_SAPLING);
		POTTED_SUNRISE_FUNGUS_SAPLING = createPottedSapling("deep_trenches:potted_sunrise_fungus_sapling", SUNRISE_FUNGUS_SAPLING);
		POTTED_TARK_SAPLING = createPottedSapling("deep_trenches:potted_tark_sapling", TARK_SAPLING);
		POTTED_TEAK_SAPLING = createPottedSapling("deep_trenches:potted_teak_sapling", TEAK_SAPLING);
		POTTED_THUNDERCLOUD_PLUM_SAPLING = createPottedSapling("deep_trenches:potted_thundercloud_plum_sapling", THUNDERCLOUD_PLUM_SAPLING);
		POTTED_VYNHERT_SAPLING = createPottedSapling("deep_trenches:potted_vynhert_sapling", VYNHERT_SAPLING);
		POTTED_WENGE_SAPLING = createPottedSapling("deep_trenches:potted_wenge_sapling", WENGE_SAPLING);
		POTTED_YEW_SAPLING = createPottedSapling("deep_trenches:potted_yew_sapling", YEW_SAPLING);

		POTTED_BLACK_PANSY = createFlowerPot("deep_trenches:potted_black_pansy", BLACK_PANSY);
		POTTED_BLUE_PANSY = createFlowerPot("deep_trenches:potted_blue_pansy", BLUE_PANSY);
		POTTED_BLUE_POPPY = createFlowerPot("deep_trenches:potted_blue_poppy", BLUE_POPPY);
		POTTED_BLUE_VIOLET = createFlowerPot("deep_trenches:potted_blue_violet", BLUE_VIOLET);
		POTTED_BONNET_SPURGE = createFlowerPot("deep_trenches:potted_bonnet_spurge", BONNET_SPURGE);
		POTTED_BROWN_PANSY = createFlowerPot("deep_trenches:potted_brown_pansy", BROWN_PANSY);
		POTTED_CACTLOW = createFlowerPot("deep_trenches:potted_cactlow", CACTLOW);
		POTTED_CHOCOLATE_COSMOS_FLOWER = createFlowerPot("deep_trenches:potted_chocolate_cosmos_flower", CHOCOLATE_COSMOS_FLOWER);
		POTTED_CYAN_BLUE_VIOLET = createFlowerPot("deep_trenches:potted_cyan_blue_violet", CYAN_BLUE_VIOLET);
		POTTED_CYCAWLER = createFlowerPot("deep_trenches:potted_cycawler", CYCAWLER);
		POTTED_DRIGYUS = createFlowerPot("deep_trenches:potted_drigyus", DRIGYUS);
		POTTED_GARDEN_PINKS = createFlowerPot("deep_trenches:potted_garden_pinks", GARDEN_PINKS);
		POTTED_GREEN_PANSY = createFlowerPot("deep_trenches:potted_green_pansy", GREEN_PANSY);
		POTTED_GYLDELION_FLOWER = createFlowerPot("deep_trenches:potted_gyldelion_flower", GYLDELION_FLOWER);
		POTTED_MARSH_VIOLET = createFlowerPot("deep_trenches:potted_marsh_violet", MARSH_VIOLET);
		POTTED_NATIVE_VIOLET = createFlowerPot("deep_trenches:potted_native_violet", NATIVE_VIOLET);
		POTTED_OPIUM_POPPY = createFlowerPot("deep_trenches:potted_opium_poppy", OPIUM_POPPY);
		POTTED_POPPY = createFlowerPot("deep_trenches:potted_poppy", POPPY);
		POTTED_PINK_AND_ORANGE_PANSY = createFlowerPot("deep_trenches:potted_pink_and_orange_pansy", PINK_AND_ORANGE_PANSY);
		POTTED_PINK_BRAITOR_FLOWER = createFlowerPot("deep_trenches:potted_pink_braitor_flower", PINK_BRAITOR_FLOWER);
		POTTED_PINK_MARSH_VIOLET = createFlowerPot("deep_trenches:potted_pink_marsh_violet", PINK_MARSH_VIOLET);
		POTTED_PINK_ROSE = createFlowerPot("deep_trenches:potted_pink_rose", PINK_ROSE);
		POTTED_PINK_ROSE_BUSH = createFlowerPot("deep_trenches:potted_pink_rose_bush", PINK_ROSE_BUSH);
		POTTED_PURPLE_AND_ORANGE_PANSY = createFlowerPot("deep_trenches:potted_purple_and_orange_pansy", PURPLE_AND_ORANGE_PANSY);
		POTTED_SPIKE_LAVENDER = createFlowerPot("deep_trenches:potted_spike_lavender", SPIKE_LAVENDER);
		POTTED_RED_BRAITOR_FLOWER = createFlowerPot("deep_trenches:potted_red_braitor_flower", RED_BRAITOR_FLOWER);
		POTTED_RED_CHOCOLATE_COSMOS_FLOWER = createFlowerPot("deep_trenches:potted_red_chocolate_cosmos_flower", RED_CHOCOLATE_COSMOS_FLOWER);
		POTTED_RED_PANSY = createFlowerPot("deep_trenches:potted_red_pansy", RED_PANSY);
		POTTED_RED_ROSE = createFlowerPot("deep_trenches:potted_red_rose", RED_ROSE);
		POTTED_RUBRA_BLUE_VIOLET = createFlowerPot("deep_trenches:potted_rubra_blue_violet", RUBRA_BLUE_VIOLET);
		POTTED_SCARLET_THIORCEN = createFlowerPot("deep_trenches:potted_scarlet_thiorcen", SCARLET_THIORCEN);
		POTTED_SPIDREET = createFlowerPot("deep_trenches:potted_spidreet", SPIDREET);
		POTTED_SPROOM_SPIKE = createFlowerPot("deep_trenches:potted_sproom_spike", SPROOM_SPIKE);
		POTTED_SQUISACLE = createFlowerPot("deep_trenches:potted_squisacle", SQUISACLE);
		POTTED_SWEET_VIOLET = createFlowerPot("deep_trenches:potted_sweet_violet", SWEET_VIOLET);
		POTTED_TOPPED_LAVENDER = createFlowerPot("deep_trenches:potted_topped_lavender", TOPPED_LAVENDER);
		POTTED_VASLAME = createFlowerPot("deep_trenches:potted_vaslame", VASLAME);
		POTTED_WEEPISTIL = createFlowerPot("deep_trenches:potted_weepistil", WEEPISTIL);
		POTTED_WEEPY_HOLLOWER = createFlowerPot("deep_trenches:potted_weepy_hollower", WEEPY_HOLLOWER);
		POTTED_YELLOW_VIOLET = createFlowerPot("deep_trenches:potted_yellow_violet", YELLOW_VIOLET);

		LIGHT_OPALITE = createCopy("deep_trenches:light_opalite", QUARTZ_BLOCK);
		LUSHINE = createCopy("deep_trenches:lushine", STONE);
		LUSHINE_PILLAR = createPillar("deep_trenches:lushine_pillar", QUARTZ_PILLAR);
		LUSTRITE = createCopy("deep_trenches:lustrite", STONE);
		MARINE_SNOW = createCopy("deep_trenches:marine_snow", SOUL_SAND);
		MOSOIL = createBlock("deep_trenches:mosoil", MosoilBlock::new, GRASS_BLOCK);
		OPALITE = createCopy("deep_trenches:opalite", QUARTZ_BLOCK);
		POININE = createPillar("deep_trenches:poinine", BASALT);
		RHODONITE = createCopy("deep_trenches:rhodonite", QUARTZ_BLOCK);
		SPRILIUM = createBlock("deep_trenches:sprilium", SpriliumBlock::new, Settings.copy(STONE).ticksRandomly());
		SKYSOIL = createCopy("deep_trenches:skysoil", DIRT);
		SKYSTONE = createCopy("deep_trenches:skystone", STONE);
		STORCEAN_MARINE_SNOW = createCopy("deep_trenches:storcean_marine_snow", SOUL_SAND);
		STORCENDITE = createCopy("deep_trenches:storcendite", STONE);
		STORCERACK = createCopy("deep_trenches:storcerack", STONE);
		VERDINE = createCopy("deep_trenches:verdine", STONE);

		ABYSSOPELAGIC_WATER = createWaterFluid("deep_trenches:abyssopelagic_water", ModFluids.ABYSSOPELAGIC_WATER, 0.22F);
		ACID = createWaterFluid("deep_trenches:acid", ModFluids.ACID);
		BATHYPELAGIC_WATER = createWaterFluid("deep_trenches:bathypelagic_water", ModFluids.BATHYPELAGIC_WATER, 1.25F);
		BRINE = createWaterFluid("deep_trenches:brine", ModFluids.BRINE);
		CLEAR_WATER = createWaterFluid("deep_trenches:clear_water", ModFluids.CLEAR_WATER, 1.25F);
		HADOPELAGIC_WATER = createWaterFluid("deep_trenches:hadopelagic_water", ModFluids.HADOPELAGIC_WATER, 0.16F);
		MESOPELAGIC_WATER = createWaterFluid("deep_trenches:mesopelagic_water", ModFluids.MESOPELAGIC_WATER, 0.5F);
		STORCEAN_ABYSSOPELAGIC_WATER = createWaterFluid("deep_trenches:storcean_abyssopelagic_water", ModFluids.STORCEAN_ABYSSOPELAGIC_WATER, 0.12F);
		STORCEAN_BATHYPELAGIC_WATER = createWaterFluid("deep_trenches:storcean_bathypelagic_water", ModFluids.STORCEAN_BATHYPELAGIC_WATER, 0.16F);
		STORCEAN_ENDERPELAGIC_WATER = createWaterFluid("deep_trenches:storcean_enderpelagic_water", ModFluids.STORCEAN_ENDERPELAGIC_WATER, 1.25F);
		STORCEAN_GASOPELAGIC_WATER = createWaterFluid("deep_trenches:storcean_gasopelagic_water", ModFluids.STORCEAN_GASOPELAGIC_WATER, 1.35F);
		STORCEAN_HADOPELAGIC_WATER = createWaterFluid("deep_trenches:storcean_hadopelagic_water", ModFluids.STORCEAN_HADOPELAGIC_WATER, 0.1F);
		STORCEAN_INFINIPELAGIC_WATER = createWaterFluid("deep_trenches:storcean_infinipelagic_water", ModFluids.STORCEAN_INFINIPELAGIC_WATER, 0.05F);
		STORCEAN_MESOPELAGIC_WATER = createWaterFluid("deep_trenches:storcean_mesopelagic_water", ModFluids.STORCEAN_MESOPELAGIC_WATER, 0.2F);
		STORCEAN_VIRDIPELAGIC_WATER = createWaterFluid("deep_trenches:storcean_virdipelagic_water", ModFluids.STORCEAN_VIRDIPELAGIC_WATER, 1.25F);
		STORCEAN_WATER = createWaterFluid("deep_trenches:storcean_water", ModFluids.ABYSSOPELAGIC_WATER, 0.5F);
	}

}
