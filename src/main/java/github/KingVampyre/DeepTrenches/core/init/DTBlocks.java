package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.common.block.HorizontalBlock;
import github.KingVampyre.DeepTrenches.core.block.*;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.*;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.SignType;

import java.util.function.Function;

import static github.KingVampyre.DeepTrenches.core.init.DTStatusEffects.*;
import static net.minecraft.block.Blocks.*;
import static net.minecraft.block.PressurePlateBlock.ActivationRule.EVERYTHING;
import static net.minecraft.entity.effect.StatusEffects.*;

public class DTBlocks {

	public static final Block CYAN_BIOLUMINESCENT_BLOCK;
	public static final Block GREEN_BIOLUMINESCENT_BLOCK;
	public static final Block LIGHT_BLUE_BIOLUMINESCENT_BLOCK;

	public static final Block AIRIAL_MOSS;
	public static final Block BLACK_MARBLE;
	public static final Block BLUE_STORCERACK;
	public static final Block DRITEAN;
	public static final Block ENROTIUM;
	public static final Block GYLDELION_BLOCK;

	public static final Block ANDESITE_AQUAMARINE_ORE;
	public static final Block ANDESITE_BLACK_OPAL_ORE;
	public static final Block ANDESITE_CHALCEDONY_ORE;
	public static final Block ANDESITE_CLINOHUMITE_ORE;
	public static final Block ANDESITE_COAL_ORE;
	public static final Block ANDESITE_COPPER_ORE;
	public static final Block ANDESITE_DIAMOND_ORE;
	public static final Block ANDESITE_EMERALD_ORE;
	public static final Block ANDESITE_GOLD_ORE;
	public static final Block ANDESITE_IRON_ORE;
	public static final Block ANDESITE_LAPIS_ORE;
	public static final Block ANDESITE_MORGANITE_ORE;
	public static final Block ANDESITE_REDSTONE_ORE;
	public static final Block ANDESITE_RUBY_ORE;
	public static final Block ANDESITE_SILVER_ORE;
	public static final Block ANDESITE_SPHENE_ORE;
	public static final Block ANDESITE_SPINEL_ORE;
	public static final Block ANDESITE_TANZANITE_ORE;

	public static final Block BLACK_BASALT_AQUAMARINE_ORE;
	public static final Block BLACK_BASALT_BLACK_OPAL_ORE;
	public static final Block BLACK_BASALT_CHALCEDONY_ORE;
	public static final Block BLACK_BASALT_CLINOHUMITE_ORE;
	public static final Block BLACK_BASALT_COAL_ORE;
	public static final Block BLACK_BASALT_COPPER_ORE;
	public static final Block BLACK_BASALT_DIAMOND_ORE;
	public static final Block BLACK_BASALT_EMERALD_ORE;
	public static final Block BLACK_BASALT_GOLD_ORE;
	public static final Block BLACK_BASALT_IRON_ORE;
	public static final Block BLACK_BASALT_LAPIS_ORE;
	public static final Block BLACK_BASALT_MORGANITE_ORE;
	public static final Block BLACK_BASALT_REDSTONE_ORE;
	public static final Block BLACK_BASALT_RUBY_ORE;
	public static final Block BLACK_BASALT_SILVER_ORE;
	public static final Block BLACK_BASALT_SPHENE_ORE;
	public static final Block BLACK_BASALT_SPINEL_ORE;
	public static final Block BLACK_BASALT_TANZANITE_ORE;

	public static final Block BLUE_STORCERACK_AQUAMARINE_ORE;
	public static final Block BLUE_STORCERACK_BLACK_OPAL_ORE;
	public static final Block BLUE_STORCERACK_CHALCEDONY_ORE;
	public static final Block BLUE_STORCERACK_CLINOHUMITE_ORE;
	public static final Block BLUE_STORCERACK_COAL_ORE;
	public static final Block BLUE_STORCERACK_COPPER_ORE;
	public static final Block BLUE_STORCERACK_DIAMOND_ORE;
	public static final Block BLUE_STORCERACK_EMERALD_ORE;
	public static final Block BLUE_STORCERACK_GOLD_ORE;
	public static final Block BLUE_STORCERACK_IRON_ORE;
	public static final Block BLUE_STORCERACK_LAPIS_ORE;
	public static final Block BLUE_STORCERACK_MORGANITE_ORE;
	public static final Block BLUE_STORCERACK_REDSTONE_ORE;
	public static final Block BLUE_STORCERACK_RUBY_ORE;
	public static final Block BLUE_STORCERACK_SILVER_ORE;
	public static final Block BLUE_STORCERACK_SPHENE_ORE;
	public static final Block BLUE_STORCERACK_SPINEL_ORE;
	public static final Block BLUE_STORCERACK_TANZANITE_ORE;

	public static final Block DIORITE_AQUAMARINE_ORE;
	public static final Block DIORITE_BLACK_OPAL_ORE;
	public static final Block DIORITE_CHALCEDONY_ORE;
	public static final Block DIORITE_CLINOHUMITE_ORE;
	public static final Block DIORITE_COAL_ORE;
	public static final Block DIORITE_COPPER_ORE;
	public static final Block DIORITE_DIAMOND_ORE;
	public static final Block DIORITE_EMERALD_ORE;
	public static final Block DIORITE_GOLD_ORE;
	public static final Block DIORITE_IRON_ORE;
	public static final Block DIORITE_LAPIS_ORE;
	public static final Block DIORITE_MORGANITE_ORE;
	public static final Block DIORITE_REDSTONE_ORE;
	public static final Block DIORITE_RUBY_ORE;
	public static final Block DIORITE_SILVER_ORE;
	public static final Block DIORITE_SPHENE_ORE;
	public static final Block DIORITE_SPINEL_ORE;
	public static final Block DIORITE_TANZANITE_ORE;

	public static final Block GRANITE_AQUAMARINE_ORE;
	public static final Block GRANITE_BLACK_OPAL_ORE;
	public static final Block GRANITE_CHALCEDONY_ORE;
	public static final Block GRANITE_CLINOHUMITE_ORE;
	public static final Block GRANITE_COAL_ORE;
	public static final Block GRANITE_COPPER_ORE;
	public static final Block GRANITE_DIAMOND_ORE;
	public static final Block GRANITE_EMERALD_ORE;
	public static final Block GRANITE_GOLD_ORE;
	public static final Block GRANITE_IRON_ORE;
	public static final Block GRANITE_LAPIS_ORE;
	public static final Block GRANITE_MORGANITE_ORE;
	public static final Block GRANITE_REDSTONE_ORE;
	public static final Block GRANITE_RUBY_ORE;
	public static final Block GRANITE_SILVER_ORE;
	public static final Block GRANITE_SPHENE_ORE;
	public static final Block GRANITE_SPINEL_ORE;
	public static final Block GRANITE_TANZANITE_ORE;

	public static final Block LIMESTONE_AQUAMARINE_ORE;
	public static final Block LIMESTONE_BLACK_OPAL_ORE;
	public static final Block LIMESTONE_CHALCEDONY_ORE;
	public static final Block LIMESTONE_CLINOHUMITE_ORE;
	public static final Block LIMESTONE_COAL_ORE;
	public static final Block LIMESTONE_COPPER_ORE;
	public static final Block LIMESTONE_DIAMOND_ORE;
	public static final Block LIMESTONE_EMERALD_ORE;
	public static final Block LIMESTONE_GOLD_ORE;
	public static final Block LIMESTONE_IRON_ORE;
	public static final Block LIMESTONE_LAPIS_ORE;
	public static final Block LIMESTONE_MORGANITE_ORE;
	public static final Block LIMESTONE_REDSTONE_ORE;
	public static final Block LIMESTONE_RUBY_ORE;
	public static final Block LIMESTONE_SILVER_ORE;
	public static final Block LIMESTONE_SPHENE_ORE;
	public static final Block LIMESTONE_SPINEL_ORE;
	public static final Block LIMESTONE_TANZANITE_ORE;

	public static final Block PINKINE_AQUAMARINE_ORE;
	public static final Block PINKINE_BLACK_OPAL_ORE;
	public static final Block PINKINE_CHALCEDONY_ORE;
	public static final Block PINKINE_CLINOHUMITE_ORE;
	public static final Block PINKINE_COAL_ORE;
	public static final Block PINKINE_COPPER_ORE;
	public static final Block PINKINE_DIAMOND_ORE;
	public static final Block PINKINE_EMERALD_ORE;
	public static final Block PINKINE_GOLD_ORE;
	public static final Block PINKINE_IRON_ORE;
	public static final Block PINKINE_LAPIS_ORE;
	public static final Block PINKINE_MORGANITE_ORE;
	public static final Block PINKINE_REDSTONE_ORE;
	public static final Block PINKINE_RUBY_ORE;
	public static final Block PINKINE_SILVER_ORE;
	public static final Block PINKINE_SPHENE_ORE;
	public static final Block PINKINE_SPINEL_ORE;
	public static final Block PINKINE_TANZANITE_ORE;

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

	public static final Block BLACK_PANSY;
	public static final Block BLUE_PANSY;
	public static final Block BLUE_POPPY;
	public static final Block BLUE_VIOLET;
	public static final Block BONNET_SPURGE;
	public static final Block BROWN_PANSY;
	public static final Block CHOCOLATE_COSMOS_FLOWER;
	public static final Block CYAN_BLUE_VIOLET;
	public static final Block CYCAWLER;
	public static final Block GARDEN_PINKS;
	public static final Block GREEN_PANSY;
	public static final Block GYLDELION_FLOWER;
	public static final Block MARSH_VIOLET;
	public static final Block MURKSTEM;
	public static final Block NATIVE_VIOLET;
	public static final Block OPIUM_POPPY;
	public static final Block PINK_AND_ORANGE_PANSY;
	public static final Block PINK_BRAITOR_FLOWER;
	public static final Block PINK_MARSH_VIOLET;
	public static final Block PINK_ROSE;
	public static final Block PINK_ROSE_BUSH;
	public static final Block POPPY;
	public static final Block PURPLE_AND_ORANGE_PANSY;
	public static final Block RED_BRAITOR_FLOWER;
	public static final Block RED_CHOCOLATE_COSMOS_FLOWER;
	public static final Block RED_PANSY;
	public static final Block RED_ROSE;
	public static final Block RUBRA_BLUE_VIOLET;
	public static final Block SKALK;
	public static final Block SPIDREET;
	public static final Block SPIKE_LAVENDER;
	public static final Block SPRIDELION;
	public static final Block SPROOM_SPIKE;
	public static final Block SQUISACLE;
	public static final Block SWEET_VIOLET;
	public static final Block TOPPED_LAVENDER;
	public static final Block VASLAME;
	public static final Block WEEPISTIL;
	public static final Block WEEPY_HOLLOWER;
	public static final Block WHITE_VIOLET;
	public static final Block WILD_PANSY;
	public static final Block YELLOW_VIOLET;

	public static final Block BLACK_LILY;
	public static final Block BULLTHORN;
	public static final Block CACTLOW;
	public static final Block CLAWBULB;
	public static final Block LIME_SPURGE;
	public static final Block LUPIN_FLOWER;
	public static final Block ORANGE_LILY;
	public static final Block PIGAL;
	public static final Block PURPROUND;
	public static final Block SPRINLY;
	public static final Block VELVET_LILY;

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

	public static final Block BUBBLETREE_BUTTON;
	public static final Block BUBBLETREE_DOOR;
	public static final Block BUBBLETREE_FENCE;
	public static final Block BUBBLETREE_FENCE_GATE;
	public static final Block BUBBLETREE_BUBBLES;
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

	public static final Block DRIGYUS_BUTTON;
	public static final Block DRIGYUS_DOOR;
	public static final Block DRIGYUS_FENCE;
	public static final Block DRIGYUS_FENCE_GATE;
	public static final Block DRIGYUS_LOG;
	public static final Block DRIGYUS_PLANKS;
	public static final Block DRIGYUS_PRESSURE_PLATE;
	public static final Block DRIGYUS;
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

	public static final Block FLALM_BUTTON;
	public static final Block FLALM_DOOR;
	public static final Block FLALM_FENCE;
	public static final Block FLALM_FENCE_GATE;
	public static final Block FLALM_PETAL_BLOCK;
	public static final Block FLALM_PLANKS;
	public static final Block FLALM_PRESSURE_PLATE;
	public static final Block FLALM;
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

	public static final Block OBSCRUS_BUTTON;
	public static final Block OBSCRUS_DOOR;
	public static final Block OBSCRUS_FENCE;
	public static final Block OBSCRUS_FENCE_GATE;
	public static final Block OBSCRUS_LEAVES;
	public static final Block OBSCRUS_LOG;
	public static final Block OBSCRUS_PLANKS;
	public static final Block OBSCRUS_PRESSURE_PLATE;
	public static final Block OBSCRUS;
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

	public static final Block SCARLET_THIORCEN_BUTTON;
	public static final Block SCARLET_THIORCEN_DOOR;
	public static final Block SCARLET_THIORCEN_FENCE;
	public static final Block SCARLET_THIORCEN_FENCE_GATE;
	public static final Block SCARLET_THIORCEN_LOG;
	public static final Block SCARLET_THIORCEN_PLANKS;
	public static final Block SCARLET_THIORCEN_PRESSURE_PLATE;
	public static final Block SCARLET_THIORCEN;
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
	public static final Block WART_TREE_WARTS;
	public static final Block WART_TREE_LOG;
	public static final Block WART_TREE_PLANKS;
	public static final Block WART_TREE_PRESSURE_PLATE;
	public static final Block WART_TREE_SIGN;
	public static final Block WART_TREE_SLAB;
	public static final Block WART_TREE_STAIRS;
	public static final Block WART_TREE_TRAPDOOR;
	public static final Block WART_TREE_WALL_SIGN;
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
	public static final Block MOSSY_YEW_LOG;
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

	protected static Block createAcuaticFungus(SaplingGenerator saplingGenerator) {
		// TODO .suffocates(Blocks::never).blockVision(Blocks::never);
		return new AcuaticFungusBlock(saplingGenerator, Settings.of(Material.LEAVES).strength(0, 0).ticksRandomly().sounds(BlockSoundGroup.GRASS).nonOpaque());
	}

	protected static Block createBioluminescentBlock() {
		return new Block(Settings.copy(SEA_LANTERN).luminance(state -> 15).strength(1.5F, 6F));
	}

	protected static Block createBlock(Function<Settings, Block> function, Settings settings) {
		return function.apply(settings);
	}

	protected static Block createBlock(Function<Settings, Block> function, Block block) {
		return createBlock(function, Settings.copy(block));
	}

	protected static Block createCap() {
		// TODO .suffocates(Blocks::never).blockVision(Blocks::never);
		return new CapBlock(Settings.of(Material.LEAVES).strength(0.2F, 0.2F).ticksRandomly().sounds(BlockSoundGroup.GRASS).nonOpaque());
	}

	protected static Block createCopy(Block block) {
		return new Block(Settings.copy(block));
	}

	protected static Block createCoral(Block block) {
		return new CoralBlock(block, Settings.copy(TUBE_CORAL));
	}

	protected static Block createCoralBlock(Block block) {
		return new CoralBlockBlock(block, Settings.copy(TUBE_CORAL_BLOCK));
	}

	protected static Block createCoralFan(Block block) {
		return new CoralFanBlock(block, Settings.copy(TUBE_CORAL_FAN));
	}

	protected static Block createCoralWallFan(Block block) {
		return new CoralWallFanBlock(block, Settings.copy(TUBE_CORAL_WALL_FAN));
	}

	protected static Block createDeadCoral() {
		return createBlock(DeadCoralBlock::new, DEAD_TUBE_CORAL);
	}

	protected static Block createDeadCoralBlock() {
		return createCopy(DEAD_TUBE_CORAL_BLOCK);
	}

	protected static Block createDeadCoralFan() {
		return createBlock(DeadCoralFanBlock::new, DEAD_TUBE_CORAL_FAN);
	}

	protected static Block createDeadCoralWallFan() {
		return createBlock(DeadCoralWallFanBlock::new, DEAD_TUBE_CORAL_WALL_FAN);
	}

	protected static Block createFlowerBlock(StatusEffect effect, int effectDuration) {
		return new FlowerBlock(effect, effectDuration, Settings.copy(RED_TULIP));
	}

	protected static Block createStorceanFlower(StatusEffect effect, int effectDuration) {
		return new StorceanFlowerBlock(effect, effectDuration, Settings.copy(RED_TULIP));
	}

	protected static Block createFlowerPot(Block block, Settings settings) {
		return new FlowerPotBlock(block, settings);
	}

	protected static Block createFlowerPot(Block block) {
		return new FlowerPotBlock(block, Settings.copy(Blocks.POTTED_POPPY));
	}

	protected static Block createFluid(FlowableFluid fluid, Settings settings) {
		return new FluidBlock(fluid, settings);
	}

	protected static Block createHorizontalBlock(Block block) {
		return new HorizontalBlock(Settings.copy(block));
	}

	protected static Block createOakButton() {
		return new WoodenButtonBlock(Settings.copy(OAK_BUTTON));
	}

	protected static Block createOakDoor() {
		return new DoorBlock(Settings.copy(OAK_DOOR));
	}

	protected static Block createOakFence() {
		return new FenceBlock(Settings.copy(OAK_FENCE));
	}

	protected static Block createOakFenceGate() {
		return new FenceGateBlock(Settings.copy(OAK_FENCE_GATE));
	}

	protected static Block createOakLeaves() {
		return new LeavesBlock(Settings.copy(OAK_LEAVES));
	}

	protected static Block createOakLog() {
		return new PillarBlock(Settings.copy(OAK_LOG));
	}

	protected static Block createOakPlanks() {
		return new Block(Settings.copy(OAK_PLANKS));
	}

	protected static Block createOakPressurePlate() {
		return new PressurePlateBlock(EVERYTHING, Settings.copy(OAK_PRESSURE_PLATE));
	}

	protected static Block createOakSapling(SaplingGenerator saplingGenerator) {
		return new SaplingBlock(saplingGenerator, Settings.copy(OAK_SAPLING));
	}

	protected static Block createOakSign(SignType type) {
		return new SignBlock(Settings.copy(OAK_SIGN), type);
	}

	protected static Block createOakSlab() {
		return new SlabBlock(Settings.copy(OAK_SLAB));
	}

	protected static Block createOakStairs(Block block) {
		return new StairsBlock(block.getDefaultState(), Settings.copy(OAK_STAIRS));
	}

	protected static Block createOakTrapdoor() {
		return new TrapdoorBlock(Settings.copy(OAK_TRAPDOOR));
	}

	protected static Block createOakWallSign(SignType type) {
		return new WallSignBlock(Settings.copy(OAK_SIGN), type);
	}

	protected static Block createOakWood() {
		return new PillarBlock(Settings.copy(OAK_WOOD));
	}

    protected static Block createPillar(Block block) {
        return new PillarBlock(Settings.copy(block));
    }

	protected static Block createPottedSapling(Block block) {
		return createFlowerPot(block, Settings.copy(POTTED_OAK_SAPLING));
	}

	protected static Block createStrippedOakLog() {
		return new PillarBlock(Settings.copy(STRIPPED_OAK_LOG));
	}

	protected static Block createStrippedOakWood() {
		return new PillarBlock(Settings.copy(STRIPPED_OAK_WOOD));
	}

	protected static Block createStorceanSapling(SaplingGenerator saplingGenerator) {
		return new StorceanTallSaplingBlock(saplingGenerator, Settings.copy(OAK_SAPLING));
	}

	protected static Block createTallFlower(Block block) {
	    return new TallFlowerBlock(Settings.copy(block));
    }

	protected static Block createWaterFluid(FlowableFluid fluid, float multiplier) {
		return createFluid(fluid, Settings.copy(WATER).velocityMultiplier(multiplier));
	}

	static {
		AIRIAL_MOSS = createBlock(AirialMossBlock::new, GRASS_BLOCK);
		BLACK_MARBLE = createCopy(STONE);
		BLUE_STORCERACK = createCopy(STONE);
		DRITEAN = createCopy(DIRT);
		ENROTIUM = createBlock(EnrotiumBlock::new, CRIMSON_NYLIUM);
		GYLDELION_BLOCK = createCopy(IRON_BLOCK);

		STASP_NEST = createBlock(StaspNestBlock::new, OAK_WOOD);

		GIANT_VIOLET = createTallFlower(RED_TULIP);
		GIANT_VIOLET_LEAF = createCopy(COCOA);
		GIANT_VIOLET_PETAL = createCopy(COCOA);
		GIANT_VIOLET_PISTIL = createCopy(COCOA);

		CYAN_BIOLUMINESCENT_BLOCK = createBioluminescentBlock();
		GREEN_BIOLUMINESCENT_BLOCK = createBioluminescentBlock();
		LIGHT_BLUE_BIOLUMINESCENT_BLOCK = createBioluminescentBlock();

		BLACK_PANSY = createFlowerBlock(RESISTANCE, 9);
		BLUE_PANSY = createFlowerBlock(RESISTANCE, 9);
		BLUE_POPPY = createFlowerBlock(NIGHT_VISION, 8);
		BLUE_VIOLET = createFlowerBlock(RESISTANCE, 9);
		BONNET_SPURGE = createFlowerBlock(POISON, 8);
		BROWN_PANSY = createFlowerBlock(RESISTANCE, 9);
		CHOCOLATE_COSMOS_FLOWER = createFlowerBlock(COSMOS_BEAUTY, 14);
		CYAN_BLUE_VIOLET = createFlowerBlock(RESISTANCE, 9);
		CYCAWLER = createStorceanFlower(CYCAWLER_BEAUTY, 24000);
		GARDEN_PINKS = createFlowerBlock(FIRE_RESISTANCE, 6);
		GREEN_PANSY = createFlowerBlock(RESISTANCE, 9);
		GYLDELION_FLOWER = createFlowerBlock(GLOWING, 12);
		MARSH_VIOLET = createFlowerBlock(RESISTANCE, 9);
		NATIVE_VIOLET = createFlowerBlock(RESISTANCE, 9);
		OPIUM_POPPY = createFlowerBlock(WEAKNESS, 11);
		PINK_AND_ORANGE_PANSY = createFlowerBlock(RESISTANCE, 9);
		PINK_BRAITOR_FLOWER = createFlowerBlock(BRAITOR_BEAUTY, 21);
		PINK_MARSH_VIOLET = createFlowerBlock(RESISTANCE, 9);
		PINK_ROSE = createFlowerBlock(FLOWER_BEAUTY, 13);
		PINK_ROSE_BUSH = createFlowerBlock(FLOWER_BEAUTY, 13);
		POPPY = createFlowerBlock(NIGHT_VISION, 5);
		PURPLE_AND_ORANGE_PANSY = createFlowerBlock(RESISTANCE, 9);
		RED_BRAITOR_FLOWER = createFlowerBlock(BRAITOR_BEAUTY, 21);
		RED_CHOCOLATE_COSMOS_FLOWER = createFlowerBlock(COSMOS_BEAUTY, 14);
		RED_PANSY = createFlowerBlock(RESISTANCE, 9);
		RED_ROSE = createFlowerBlock(FLOWER_BEAUTY, 13);
		RUBRA_BLUE_VIOLET = createFlowerBlock(RESISTANCE, 9);
		SPIDREET = createStorceanFlower(REGENERATION, 6);
		SPIKE_LAVENDER = createFlowerBlock(FLOWER_BEAUTY, 6);
		SPRIDELION = new SpridelionBlock(900, Settings.copy(RED_TULIP));
		SQUISACLE = createStorceanFlower(LEVITATION, 4);
		SWEET_VIOLET = createFlowerBlock(RESISTANCE, 9);
		TOPPED_LAVENDER = createFlowerBlock(FLOWER_BEAUTY, 6);
		VASLAME = createStorceanFlower(FIRE_RESISTANCE, 6);
		WEEPISTIL = createStorceanFlower(NAUSEA, 4);
		WEEPY_HOLLOWER = createStorceanFlower(GLOWING, 6);
		WHITE_VIOLET = createFlowerBlock(RESISTANCE, 9);
		WILD_PANSY = createFlowerBlock(RESISTANCE, 9);
		YELLOW_VIOLET = createFlowerBlock(RESISTANCE, 9);

		AIRIAL_BUSH = createBlock(AirialBushBlock::new, GRASS);
		HARSHLES = createBlock(HarshlesBlock::new, GRASS);
		REEBLOON = createBlock(ReebloonBlock::new, GRASS);
		SQUISH_TIPS = createBlock(SquishTipsBlock::new, GRASS);
		SPROOM_SPIKE = createBlock(SproomSpikeBlock::new, SUNFLOWER);

		BLACK_LILY = createTallFlower(SUNFLOWER);
		BULLTHORN = createTallFlower(SUNFLOWER);
		CACTLOW = createTallFlower(SUNFLOWER);
		CLAWBULB = createTallFlower(SUNFLOWER);
		LIME_SPURGE = createTallFlower(SUNFLOWER);
		LUPIN_FLOWER = createTallFlower(SUNFLOWER);
		ORANGE_LILY = createTallFlower(SUNFLOWER);
		PIGAL = createTallFlower(SUNFLOWER);
		PURPROUND = createTallFlower(SUNFLOWER);
		SPRINLY = createTallFlower(SUNFLOWER);
		VELVET_LILY = createTallFlower(SUNFLOWER);

		MURKSTEM = createBlock(MurkstemBlock::new, Settings.copy(SUNFLOWER).ticksRandomly());
		SKALK = createBlock(SkalkBlock::new, Settings.copy(SUNFLOWER).ticksRandomly());

		DEAD_BLACKGREEN_TREE_CORAL = createDeadCoral();
		DEAD_BLACKGREEN_TREE_CORAL_BLOCK = createDeadCoralBlock();
		DEAD_BLACKGREEN_TREE_CORAL_FAN = createDeadCoralFan();
		DEAD_BLACKGREEN_TREE_CORAL_WALL_FAN = createDeadCoralWallFan();

		BLACKGREEN_TREE_CORAL = createCoral(DEAD_BLACKGREEN_TREE_CORAL);
		BLACKGREEN_TREE_CORAL_BLOCK = createCoralBlock(DEAD_BLACKGREEN_TREE_CORAL_BLOCK);
		BLACKGREEN_TREE_CORAL_FAN = createCoralFan(DEAD_BLACKGREEN_TREE_CORAL_FAN);
		BLACKGREEN_TREE_CORAL_WALL_FAN = createCoralWallFan(DEAD_BLACKGREEN_TREE_CORAL_WALL_FAN);

		DEAD_BROCCOLI_CORAL = createDeadCoral();
		DEAD_BROCCOLI_CORAL_BLOCK = createDeadCoralBlock();
		DEAD_BROCCOLI_CORAL_BUBBLES = createDeadCoralBlock();
		DEAD_BROCCOLI_CORAL_FAN = createDeadCoralFan();
		DEAD_BROCCOLI_CORAL_WALL_FAN = createDeadCoralWallFan();

		BROCCOLI_CORAL = createCoral(DEAD_BROCCOLI_CORAL);
		BROCCOLI_CORAL_BLOCK = createCoralBlock(DEAD_BROCCOLI_CORAL_BLOCK);
		BROCCOLI_CORAL_BUBBLES = createCoralBlock(DEAD_BROCCOLI_CORAL_BUBBLES);
		BROCCOLI_CORAL_FAN = createCoralFan(DEAD_BROCCOLI_CORAL_FAN);
		BROCCOLI_CORAL_WALL_FAN = createCoralWallFan(DEAD_BROCCOLI_CORAL_WALL_FAN);

		DEAD_BUBBLEGUM_CORAL = createDeadCoral();
		DEAD_BUBBLEGUM_CORAL_BLOCK = createDeadCoralBlock();
		DEAD_BUBBLEGUM_CORAL_FAN = createDeadCoralFan();
		DEAD_BUBBLEGUM_CORAL_WALL_FAN = createDeadCoralWallFan();

		BUBBLEGUM_CORAL = createCoral(DEAD_BUBBLEGUM_CORAL);
		BUBBLEGUM_CORAL_BLOCK = createCoralBlock(DEAD_BUBBLEGUM_CORAL_BLOCK);
		BUBBLEGUM_CORAL_FAN = createCoralFan(DEAD_BUBBLEGUM_CORAL_FAN);
		BUBBLEGUM_CORAL_WALL_FAN = createCoralWallFan(DEAD_BUBBLEGUM_CORAL_WALL_FAN);

		DEAD_CABBAGE_TREE_CORAL = createDeadCoral();
		DEAD_CABBAGE_TREE_CORAL_BLOCK = createDeadCoralBlock();
		DEAD_CABBAGE_TREE_CORAL_FAN = createDeadCoralFan();
		DEAD_CABBAGE_TREE_CORAL_WALL_FAN = createDeadCoralWallFan();

		CABBAGE_TREE_CORAL = createCoral(DEAD_CABBAGE_TREE_CORAL);
		CABBAGE_TREE_CORAL_BLOCK = createCoralBlock(DEAD_CABBAGE_TREE_CORAL_BLOCK);
		CABBAGE_TREE_CORAL_FAN = createCoralFan(DEAD_CABBAGE_TREE_CORAL_FAN);
		CABBAGE_TREE_CORAL_WALL_FAN = createCoralWallFan(DEAD_CABBAGE_TREE_CORAL_WALL_FAN);

		DEAD_FLOWERTUBE_CORAL = createDeadCoral();
		DEAD_FLOWERTUBE_CORAL_BLOCK = createDeadCoralBlock();
		DEAD_FLOWERTUBE_CORAL_FAN = createDeadCoralFan();
		DEAD_FLOWERTUBE_CORAL_WALL_FAN = createDeadCoralWallFan();

		FLOWERTUBE_CORAL = createCoral(DEAD_FLOWERTUBE_CORAL);
		FLOWERTUBE_CORAL_BLOCK = createCoralBlock(DEAD_FLOWERTUBE_CORAL_BLOCK);
		FLOWERTUBE_CORAL_FAN = createCoralFan(DEAD_FLOWERTUBE_CORAL_FAN);
		FLOWERTUBE_CORAL_WALL_FAN = createCoralWallFan(DEAD_FLOWERTUBE_CORAL_WALL_FAN);

		DEAD_GARNET_SPIRAL_CORAL = createDeadCoral();
		DEAD_GARNET_SPIRAL_CORAL_BLOCK = createDeadCoralBlock();
		DEAD_GARNET_SPIRAL_CORAL_FAN = createDeadCoralFan();
		DEAD_GARNET_SPIRAL_CORAL_WALL_FAN = createDeadCoralWallFan();

		GARNET_SPIRAL_CORAL = createCoral(DEAD_GARNET_SPIRAL_CORAL);
		GARNET_SPIRAL_CORAL_BLOCK = createCoralBlock(DEAD_GARNET_SPIRAL_CORAL_BLOCK);
		GARNET_SPIRAL_CORAL_FAN = createCoralFan(DEAD_GARNET_SPIRAL_CORAL_FAN);
		GARNET_SPIRAL_CORAL_WALL_FAN = createCoralWallFan(DEAD_GARNET_SPIRAL_CORAL_WALL_FAN);

		DEAD_GLOW_FOREST_CORAL = createBlock(DeadTallCoralBlock::new, DEAD_TUBE_CORAL);
		DEAD_GLOW_FOREST_CORAL_BLOCK = createDeadCoralBlock();
		DEAD_GLOW_FOREST_CORAL_FAN = createDeadCoralFan();
		DEAD_GLOW_FOREST_CORAL_WALL_FAN = createDeadCoralWallFan();

		GLOW_FOREST_CORAL = new TallCoralBlock(DEAD_GLOW_FOREST_CORAL, Settings.copy(TUBE_CORAL));
		GLOW_FOREST_CORAL_BLOCK = createCoralBlock(DEAD_GLOW_FOREST_CORAL_BLOCK);
		GLOW_FOREST_CORAL_FAN = createCoralFan(DEAD_GLOW_FOREST_CORAL_FAN);
		GLOW_FOREST_CORAL_WALL_FAN = createCoralWallFan(DEAD_GLOW_FOREST_CORAL_WALL_FAN);

		DEAD_GLOWTONGUE_TUBE_CORAL = createDeadCoral();
		DEAD_GLOWTONGUE_TUBE_CORAL_BLOCK = createDeadCoralBlock();
		DEAD_GLOWTONGUE_TUBE_CORAL_FAN = createDeadCoralFan();
		DEAD_GLOWTONGUE_TUBE_CORAL_WALL_FAN = createDeadCoralWallFan();

		GLOWTONGUE_TUBE_CORAL = createCoral(DEAD_GLOWTONGUE_TUBE_CORAL);
		GLOWTONGUE_TUBE_CORAL_BLOCK = createCoralBlock(DEAD_GLOWTONGUE_TUBE_CORAL_BLOCK);
		GLOWTONGUE_TUBE_CORAL_FAN = createCoralFan(DEAD_GLOWTONGUE_TUBE_CORAL_FAN);
		GLOWTONGUE_TUBE_CORAL_WALL_FAN = createCoralWallFan(DEAD_GLOWTONGUE_TUBE_CORAL_WALL_FAN);

		DEAD_IVORY_CORAL = createDeadCoral();
		DEAD_IVORY_CORAL_BLOCK = createDeadCoralBlock();
		DEAD_IVORY_CORAL_FAN = createDeadCoralFan();
		DEAD_IVORY_CORAL_WALL_FAN = createDeadCoralWallFan();

		IVORY_CORAL = createCoral(DEAD_IVORY_CORAL);
		IVORY_CORAL_BLOCK = createCoralBlock(DEAD_IVORY_CORAL_BLOCK);
		IVORY_CORAL_FAN = createCoralFan(DEAD_IVORY_CORAL_FAN);
		IVORY_CORAL_WALL_FAN = createCoralWallFan(DEAD_IVORY_CORAL_WALL_FAN);

		DEAD_LIME_BRAIN_CORAL = createDeadCoral();
		DEAD_LIME_BRAIN_CORAL_BLOCK = createDeadCoralBlock();
		DEAD_LIME_BRAIN_CORAL_FAN = createDeadCoralFan();
		DEAD_LIME_BRAIN_CORAL_WALL_FAN = createDeadCoralWallFan();

		LIME_BRAIN_CORAL = createCoral(DEAD_LIME_BRAIN_CORAL);
		LIME_BRAIN_CORAL_BLOCK = createCoralBlock(DEAD_LIME_BRAIN_CORAL_BLOCK);
		LIME_BRAIN_CORAL_FAN = createCoralFan(DEAD_LIME_BRAIN_CORAL_FAN);
		LIME_BRAIN_CORAL_WALL_FAN = createCoralWallFan(DEAD_LIME_BRAIN_CORAL_WALL_FAN);

		DEAD_LOPHELIA_CORAL = createDeadCoral();
		DEAD_LOPHELIA_CORAL_BLOCK = createDeadCoralBlock();
		DEAD_LOPHELIA_CORAL_FAN = createDeadCoralFan();
		DEAD_LOPHELIA_CORAL_WALL_FAN = createDeadCoralWallFan();

		LOPHELIA_CORAL = createCoral(DEAD_LOPHELIA_CORAL);
		LOPHELIA_CORAL_BLOCK = createCoralBlock(DEAD_LOPHELIA_CORAL_BLOCK);
		LOPHELIA_CORAL_FAN = createCoralFan(DEAD_LOPHELIA_CORAL_FAN);
		LOPHELIA_CORAL_WALL_FAN = createCoralWallFan(DEAD_LOPHELIA_CORAL_WALL_FAN);

		DEAD_PIPE_ORGAN_CORAL = createDeadCoral();
		DEAD_PIPE_ORGAN_CORAL_BLOCK = createDeadCoralBlock();
		DEAD_PIPE_ORGAN_CORAL_FAN = createDeadCoralFan();
		DEAD_PIPE_ORGAN_TENTACLES = createDeadCoral();
		DEAD_PIPE_ORGAN_CORAL_WALL_FAN = createDeadCoralWallFan();

		PIPE_ORGAN_CORAL = createCoral(DEAD_PIPE_ORGAN_CORAL);
		PIPE_ORGAN_CORAL_BLOCK = createCoralBlock(DEAD_PIPE_ORGAN_CORAL_BLOCK);
		PIPE_ORGAN_CORAL_FAN = createCoralFan(DEAD_PIPE_ORGAN_CORAL_FAN);
		PIPE_ORGAN_CORAL_WALL_FAN = createCoralWallFan(DEAD_PIPE_ORGAN_CORAL_WALL_FAN);
		PIPE_ORGAN_TENTACLES = createCoral(DEAD_PIPE_ORGAN_TENTACLES);

		DEAD_RED_TREE_CORAL = createDeadCoral();
		DEAD_RED_TREE_CORAL_BLOCK = createDeadCoralBlock();
		DEAD_RED_TREE_CORAL_FAN = createDeadCoralFan();
		DEAD_RED_TREE_CORAL_WALL_FAN = createDeadCoralWallFan();

		RED_TREE_CORAL = createCoral(DEAD_RED_TREE_CORAL);
		RED_TREE_CORAL_BLOCK = createCoralBlock(DEAD_RED_TREE_CORAL);
		RED_TREE_CORAL_FAN = createCoralFan(DEAD_RED_TREE_CORAL_FAN);
		RED_TREE_CORAL_WALL_FAN = createCoralWallFan(DEAD_RED_TREE_CORAL_WALL_FAN);

		DEAD_SEAFAN_CORAL = createDeadCoral();
		DEAD_SEAFAN_CORAL_BLOCK = createDeadCoralBlock();
		DEAD_SEAFAN_CORAL_FAN = createDeadCoralFan();
		DEAD_SEAFAN_CORAL_WALL_FAN = createDeadCoralWallFan();

		SEAFAN_CORAL = createCoral(DEAD_SEAFAN_CORAL);
		SEAFAN_CORAL_BLOCK = createCoralBlock(DEAD_SEAFAN_CORAL_BLOCK);
		SEAFAN_CORAL_FAN = createCoralFan(DEAD_SEAFAN_CORAL_FAN);
		SEAFAN_CORAL_WALL_FAN = createCoralWallFan(DEAD_SEAFAN_CORAL_WALL_FAN);

		DEAD_STRAIGHT_WILLOW_CORAL = createDeadCoral();
		DEAD_STRAIGHT_WILLOW_CORAL_BLOCK = createDeadCoralBlock();
		DEAD_STRAIGHT_WILLOW_CORAL_FAN = createDeadCoralFan();
		DEAD_STRAIGHT_WILLOW_CORAL_WALL_FAN = createDeadCoralWallFan();

		STRAIGHT_WILLOW_CORAL = createCoral(DEAD_STRAIGHT_WILLOW_CORAL);
		STRAIGHT_WILLOW_CORAL_BLOCK = createCoralBlock(DEAD_STRAIGHT_WILLOW_CORAL_BLOCK);
		STRAIGHT_WILLOW_CORAL_FAN = createCoralFan(DEAD_STRAIGHT_WILLOW_CORAL_FAN);
		STRAIGHT_WILLOW_CORAL_WALL_FAN = createCoralWallFan(DEAD_STRAIGHT_WILLOW_CORAL_WALL_FAN);

		DEAD_SUNRISE_CORAL = createDeadCoral();
		DEAD_SUNRISE_CORAL_BLOCK = createDeadCoralBlock();
		DEAD_SUNRISE_CORAL_FAN = createDeadCoralFan();
		DEAD_SUNRISE_CORAL_WALL_FAN = createDeadCoralWallFan();

		SUNRISE_CORAL = createCoral(DEAD_SUNRISE_CORAL);
		SUNRISE_CORAL_BLOCK = createCoralBlock(DEAD_SUNRISE_CORAL_BLOCK);
		SUNRISE_CORAL_FAN = createCoralFan(DEAD_SUNRISE_CORAL_FAN);
		SUNRISE_CORAL_WALL_FAN = createCoralWallFan(DEAD_SUNRISE_CORAL_WALL_FAN);

		DEAD_TABLE_CORAL = createDeadCoral();
		DEAD_TABLE_CORAL_BLOCK = createDeadCoralBlock();
		DEAD_TABLE_CORAL_FAN = createDeadCoralFan();
		DEAD_TABLE_CORAL_WALL_FAN = createDeadCoralWallFan();

		TABLE_CORAL = createCoral(DEAD_TABLE_CORAL);
		TABLE_CORAL_BLOCK = createCoralBlock(DEAD_TABLE_CORAL_BLOCK);
		TABLE_CORAL_FAN = createCoralFan(DEAD_TABLE_CORAL_FAN);
		TABLE_CORAL_WALL_FAN = createCoralWallFan(DEAD_TABLE_CORAL_WALL_FAN);

		DEAD_THIN_BLADE_CORAL = createDeadCoral();
		DEAD_THIN_BLADE_CORAL_BLOCK = createDeadCoralBlock();
		DEAD_THIN_BLADE_CORAL_FAN = createDeadCoralFan();
		DEAD_THIN_BLADE_CORAL_WALL_FAN = createDeadCoralWallFan();

		THIN_BLADE_CORAL = createCoral(DEAD_THIN_BLADE_CORAL);
		THIN_BLADE_CORAL_BLOCK = createCoralBlock(DEAD_THIN_BLADE_CORAL_BLOCK);
		THIN_BLADE_CORAL_FAN = createCoralFan(DEAD_THIN_BLADE_CORAL_FAN);
		THIN_BLADE_CORAL_WALL_FAN = createCoralWallFan(DEAD_THIN_BLADE_CORAL_WALL_FAN);

		DEAD_TRUMPETEAR_CORAL = createDeadCoral();
		DEAD_TRUMPETEAR_CORAL_BLOCK = createDeadCoralBlock();
		DEAD_TRUMPETEAR_CORAL_FAN = createDeadCoralFan();
		DEAD_TRUMPETEAR_CORAL_WALL_FAN = createDeadCoralWallFan();

		TRUMPETEAR_CORAL = createCoral(DEAD_TRUMPETEAR_CORAL);
		TRUMPETEAR_CORAL_BLOCK = createCoralBlock(DEAD_TRUMPETEAR_CORAL_BLOCK);
		TRUMPETEAR_CORAL_FAN = createCoralFan(DEAD_TRUMPETEAR_CORAL_FAN);
		TRUMPETEAR_CORAL_WALL_FAN = createCoralWallFan(DEAD_TRUMPETEAR_CORAL_WALL_FAN);

		ALMOND_BUTTON = createOakButton();
		ALMOND_DOOR = createOakDoor();
		ALMOND_FENCE = createOakFence();
		ALMOND_FENCE_GATE = createOakFenceGate();
		ALMOND_LEAVES = createOakLeaves();
		ALMOND_LOG = createOakLog();
		ALMOND_PLANKS = createOakPlanks();
		ALMOND_PRESSURE_PLATE = createOakPressurePlate();
		ALMOND_SAPLING = createOakSapling(DTSaplingGenerators.ALMOND);
		ALMOND_SIGN = createOakSign(DTSignTypes.ALMOND);
		ALMOND_SLAB = createOakSlab();
		ALMOND_STAIRS = createOakStairs(ALMOND_PLANKS);
		ALMOND_TRAPDOOR = createOakTrapdoor();
		ALMOND_WALL_SIGN = createOakWallSign(DTSignTypes.ALMOND);
		ALMOND_WOOD = createOakWood();

		ANAMEATA_BUTTON = createOakButton();
		ANAMEATA_CAP = createCap();
		ANAMEATA_DOOR = createOakDoor();
		ANAMEATA_FENCE = createOakFence();
		ANAMEATA_FENCE_GATE = createOakFenceGate();
		ANAMEATA_LOG = createOakLog();
		ANAMEATA_PLANKS = createOakPlanks();
		ANAMEATA_PRESSURE_PLATE = createOakPressurePlate();
		ANAMEATA_SAPLING = createOakSapling(DTSaplingGenerators.ANAMEATA);
		ANAMEATA_SIGN = createOakSign(DTSignTypes.ANAMEATA);
		ANAMEATA_SLAB = createOakSlab();
		ANAMEATA_STAIRS = createOakStairs(ANAMEATA_PLANKS);
		ANAMEATA_TRAPDOOR = createOakTrapdoor();
		ANAMEATA_WALL_SIGN = createOakWallSign(DTSignTypes.ANAMEATA);
		ANAMEATA_WOOD = createOakWood();

		ANGELS_TRUMPET_BUTTON = createOakButton();
		ANGELS_TRUMPET_DOOR = createOakDoor();
		ANGELS_TRUMPET_FENCE = createOakFence();
		ANGELS_TRUMPET_FENCE_GATE = createOakFenceGate();
		ANGELS_TRUMPET_LEAVES = createOakLeaves();
		ANGELS_TRUMPET_LOG = createOakLog();
		ANGELS_TRUMPET_PLANKS = createOakPlanks();
		ANGELS_TRUMPET_PRESSURE_PLATE = createOakPressurePlate();
		ANGELS_TRUMPET_SAPLING = createOakSapling(DTSaplingGenerators.ANGELS_TRUMPET);
		ANGELS_TRUMPET_SIGN = createOakSign(DTSignTypes.ANGELS_TRUMPET);
		ANGELS_TRUMPET_SLAB = createOakSlab();
		ANGELS_TRUMPET_STAIRS = createOakStairs(ANGELS_TRUMPET_PLANKS);
		ANGELS_TRUMPET_TRAPDOOR = createOakTrapdoor();
		ANGELS_TRUMPET_WALL_SIGN = createOakWallSign(DTSignTypes.ANGELS_TRUMPET);
		ANGELS_TRUMPET_WOOD = createOakWood();

		AQUEAN_BUTTON = createOakButton();
		AQUEAN_DOOR = createOakDoor();
		AQUEAN_FENCE = createOakFence();
		AQUEAN_FENCE_GATE = createOakFenceGate();
		AQUEAN_LEAVES = createOakLeaves();
		AQUEAN_LOG = createOakLog();
		AQUEAN_PLANKS = createOakPlanks();
		AQUEAN_PRESSURE_PLATE = createOakPressurePlate();
		AQUEAN_SAPLING = createOakSapling(DTSaplingGenerators.AQUEAN);
		AQUEAN_SIGN = createOakSign(DTSignTypes.AQUEAN);
		AQUEAN_SLAB = createOakSlab();
		AQUEAN_STAIRS = createOakStairs(AQUEAN_PLANKS);
		AQUEAN_TRAPDOOR = createOakTrapdoor();
		AQUEAN_WALL_SIGN = createOakWallSign(DTSignTypes.AQUEAN);
		AQUEAN_WOOD = createOakWood();

		BARSHROOKLE_BUTTON = createOakButton();
		BARSHROOKLE_CAP = createCap();
		BARSHROOKLE_DOOR = createOakDoor();
		BARSHROOKLE_FENCE = createOakFence();
		BARSHROOKLE_FENCE_GATE = createOakFenceGate();
		BARSHROOKLE_LOG = createOakLog();
		BARSHROOKLE_PLANKS = createOakPlanks();
		BARSHROOKLE_PRESSURE_PLATE = createOakPressurePlate();
		BARSHROOKLE_SAPLING = createAcuaticFungus(DTSaplingGenerators.BARSHROOKLE);
		BARSHROOKLE_SIGN = createOakSign(DTSignTypes.BARSHROOKLE);
		BARSHROOKLE_SLAB = createOakSlab();
		BARSHROOKLE_STAIRS = createOakStairs(BARSHROOKLE_PLANKS);
		BARSHROOKLE_TRAPDOOR = createOakTrapdoor();
		BARSHROOKLE_WALL_SIGN = createOakWallSign(DTSignTypes.BARSHROOKLE);
		BARSHROOKLE_WOOD = createOakWood();

		BLACK_BIRCH_BUTTON = createOakButton();
		BLACK_BIRCH_DOOR = createOakDoor();
		BLACK_BIRCH_FENCE = createOakFence();
		BLACK_BIRCH_FENCE_GATE = createOakFenceGate();
		BLACK_BIRCH_LEAVES = createOakLeaves();
		BLACK_BIRCH_LOG = createOakLog();
		BLACK_BIRCH_PLANKS = createOakPlanks();
		BLACK_BIRCH_PRESSURE_PLATE = createOakPressurePlate();
		BLACK_BIRCH_SAPLING = createOakSapling(DTSaplingGenerators.BLACK_BIRCH);
		BLACK_BIRCH_SIGN = createOakSign(DTSignTypes.BLACK_BIRCH);
		BLACK_BIRCH_SLAB = createOakSlab();
		BLACK_BIRCH_STAIRS = createOakStairs(BLACK_BIRCH_PLANKS);
		BLACK_BIRCH_TRAPDOOR = createOakTrapdoor();
		BLACK_BIRCH_WALL_SIGN = createOakWallSign(DTSignTypes.BLACK_BIRCH);
		BLACK_BIRCH_WOOD = createOakWood();

		BLUE_MAHOE_BUTTON = createOakButton();
		BLUE_MAHOE_DOOR = createOakDoor();
		BLUE_MAHOE_FENCE = createOakFence();
		BLUE_MAHOE_FENCE_GATE = createOakFenceGate();
		BLUE_MAHOE_FLOWER = createBlock(BlueMahoeFlower::new, OAK_LEAVES);
		BLUE_MAHOE_LEAVES = createOakLeaves();
		BLUE_MAHOE_LOG = createOakLog();
		BLUE_MAHOE_PLANKS = createOakPlanks();
		BLUE_MAHOE_PRESSURE_PLATE = createOakPressurePlate();
		BLUE_MAHOE_SAPLING = createOakSapling(DTSaplingGenerators.BLUE_MAHOE);
		BLUE_MAHOE_SIGN = createOakSign(DTSignTypes.BLUE_MAHOE);
		BLUE_MAHOE_SLAB = createOakSlab();
		BLUE_MAHOE_STAIRS = createOakStairs(BLUE_MAHOE_PLANKS);
		BLUE_MAHOE_TRAPDOOR = createOakTrapdoor();
		BLUE_MAHOE_WALL_SIGN = createOakWallSign(DTSignTypes.BLUE_MAHOE);
		BLUE_MAHOE_WOOD = createOakWood();

		BLUE_SPRUCE_BUTTON = createOakButton();
		BLUE_SPRUCE_DOOR = createOakDoor();
		BLUE_SPRUCE_FENCE = createOakFence();
		BLUE_SPRUCE_FENCE_GATE = createOakFenceGate();
		BLUE_SPRUCE_LEAVES = createOakLeaves();
		BLUE_SPRUCE_LOG = createOakLog();
		BLUE_SPRUCE_PLANKS = createOakPlanks();
		BLUE_SPRUCE_PRESSURE_PLATE = createOakPressurePlate();
		BLUE_SPRUCE_SAPLING = createOakSapling(DTSaplingGenerators.BLUE_SPRUCE);
		BLUE_SPRUCE_SIGN = createOakSign(DTSignTypes.BLUE_SPRUCE);
		BLUE_SPRUCE_SLAB = createOakSlab();
		BLUE_SPRUCE_STAIRS = createOakStairs(BLUE_SPRUCE_PLANKS);
		BLUE_SPRUCE_TRAPDOOR = createOakTrapdoor();
		BLUE_SPRUCE_WALL_SIGN = createOakWallSign(DTSignTypes.BLUE_SPRUCE);
		BLUE_SPRUCE_WOOD = createOakWood();

		BOTTLEBRUSH_BUTTON = createOakButton();
		BOTTLEBRUSH_DOOR = createOakDoor();
		BOTTLEBRUSH_FENCE = createOakFence();
		BOTTLEBRUSH_FENCE_GATE = createOakFenceGate();
		BOTTLEBRUSH_FLOWERS = createBlock(BottlebrushFlowersBlock::new, OAK_LEAVES);
		BOTTLEBRUSH_LEAVES = createOakLeaves();
		BOTTLEBRUSH_LOG = createOakLog();
		BOTTLEBRUSH_PLANKS = createOakPlanks();
		BOTTLEBRUSH_PRESSURE_PLATE = createOakPressurePlate();
		BOTTLEBRUSH_SAPLING = createOakSapling(DTSaplingGenerators.BOTTLEBRUSH);
		BOTTLEBRUSH_SIGN = createOakSign(DTSignTypes.BOTTLEBRUSH);
		BOTTLEBRUSH_SLAB = createOakSlab();
		BOTTLEBRUSH_STAIRS = createOakStairs(BOTTLEBRUSH_PLANKS);
		BOTTLEBRUSH_TRAPDOOR = createOakTrapdoor();
		BOTTLEBRUSH_WALL_SIGN = createOakWallSign(DTSignTypes.BOTTLEBRUSH);
		BOTTLEBRUSH_WOOD = createOakWood();

		BROMYA_BUTTON = createOakButton();
		BROMYA_DOOR = createOakDoor();
		BROMYA_FENCE = createOakFence();
		BROMYA_FENCE_GATE = createOakFenceGate();
		BROMYA_FLOWER = createTallFlower(ROSE_BUSH);
		BROMYA_LEAVES = createOakLeaves();
		BROMYA_LOG = createOakLog();
		BROMYA_PLANKS = createOakPlanks();
		BROMYA_PRESSURE_PLATE = createOakPressurePlate();
		BROMYA_SAPLING = createOakSapling(DTSaplingGenerators.BROMYA);
		BROMYA_SIGN = createOakSign(DTSignTypes.BROMYA);
		BROMYA_SLAB = createOakSlab();
		BROMYA_STAIRS = createOakStairs(BROMYA_PLANKS);
		BROMYA_TRAPDOOR = createOakTrapdoor();
		BROMYA_WALL_SIGN = createOakWallSign(DTSignTypes.BROMYA);
		BROMYA_WOOD = createOakWood();

		BUBBLETREE_BUBBLES = createCap();
		BUBBLETREE_BUTTON = createOakButton();
		BUBBLETREE_DOOR = createOakDoor();
		BUBBLETREE_FENCE = createOakFence();
		BUBBLETREE_FENCE_GATE = createOakFenceGate();
		BUBBLETREE_LOG = createOakLog();
		BUBBLETREE_PLANKS = createOakPlanks();
		BUBBLETREE_PRESSURE_PLATE = createOakPressurePlate();
		BUBBLETREE_SAPLING = createOakSapling(DTSaplingGenerators.BUBBLETREE);
		BUBBLETREE_SIGN = createOakSign(DTSignTypes.BUBBLETREE);
		BUBBLETREE_SLAB = createOakSlab();
		BUBBLETREE_STAIRS = createOakStairs(BUBBLETREE_PLANKS);
		BUBBLETREE_TRAPDOOR = createOakTrapdoor();
		BUBBLETREE_WALL_SIGN = createOakWallSign(DTSignTypes.BUBBLETREE);
		BUBBLETREE_WOOD = createOakWood();

		CALCEARB_BUTTON = createOakButton();
		CALCEARB_DOOR = createOakDoor();
		CALCEARB_FENCE = createOakFence();
		CALCEARB_FENCE_GATE = createOakFenceGate();
		CALCEARB_LEAVES = createOakLeaves();
		CALCEARB_LOG = createOakLog();
		CALCEARB_PLANKS = createOakPlanks();
		CALCEARB_PRESSURE_PLATE = createOakPressurePlate();
		CALCEARB_SAPLING = createOakSapling(DTSaplingGenerators.CALCEARB);
		CALCEARB_SIGN = createOakSign(DTSignTypes.CALCEARB);
		CALCEARB_SLAB = createOakSlab();
		CALCEARB_STAIRS = createOakStairs(CALCEARB_PLANKS);
		CALCEARB_TRAPDOOR = createOakTrapdoor();
		CALCEARB_WALL_SIGN = createOakWallSign(DTSignTypes.CALCEARB);
		CALCEARB_WOOD = createOakWood();

		CHERRY_BUTTON = createOakButton();
		CHERRY_DOOR = createOakDoor();
		CHERRY_FENCE = createOakFence();
		CHERRY_FENCE_GATE = createOakFenceGate();
		CHERRY_LEAVES = createOakLeaves();
		CHERRY_LOG = createOakLog();
		CHERRY_PLANKS = createOakPlanks();
		CHERRY_PRESSURE_PLATE = createOakPressurePlate();
		CHERRY_SAPLING = createOakSapling(DTSaplingGenerators.CHERRY);
		CHERRY_SIGN = createOakSign(DTSignTypes.CHERRY);
		CHERRY_SLAB = createOakSlab();
		CHERRY_STAIRS = createOakStairs(CHERRY_PLANKS);
		CHERRY_TRAPDOOR = createOakTrapdoor();
		CHERRY_WALL_SIGN = createOakWallSign(DTSignTypes.CHERRY);
		CHERRY_WOOD = createOakWood();

		CHOTORN_SAPLING = createOakSapling(DTSaplingGenerators.CHOTORN);
		CHOTORN_BUTTON = createOakButton();
		CHOTORN_DOOR = createOakDoor();
		CHOTORN_FENCE = createOakFence();
		CHOTORN_FENCE_GATE = createOakFenceGate();
		CHOTORN_LOG = createOakLog();
		CHOTORN_PLANKS = createOakPlanks();
		CHOTORN_PRESSURE_PLATE = createOakPressurePlate();
		CHOTORN_SIGN = createOakSign(DTSignTypes.CHOTORN);
		CHOTORN_SLAB = createOakSlab();
		CHOTORN_STAIRS = createOakStairs(CHOTORN_PLANKS);
		CHOTORN_TRAPDOOR = createOakTrapdoor();
		CHOTORN_WALL_SIGN = createOakWallSign(DTSignTypes.CHOTORN);
		CHOTORN_WOOD = createOakWood();

		COOK_PINE_BUTTON = createOakButton();
		COOK_PINE_DOOR = createOakDoor();
		COOK_PINE_FENCE = createOakFence();
		COOK_PINE_FENCE_GATE = createOakFenceGate();
		COOK_PINE_LEAVES = createOakLeaves();
		COOK_PINE_LOG = createOakLog();
		COOK_PINE_PLANKS = createOakPlanks();
		COOK_PINE_PRESSURE_PLATE = createOakPressurePlate();
		COOK_PINE_SAPLING = createOakSapling(DTSaplingGenerators.COOK_PINE);
		COOK_PINE_SIGN = createOakSign(DTSignTypes.COOK_PINE);
		COOK_PINE_SLAB = createOakSlab();
		COOK_PINE_STAIRS = createOakStairs(COOK_PINE_PLANKS);
		COOK_PINE_TRAPDOOR = createOakTrapdoor();
		COOK_PINE_WALL_SIGN = createOakWallSign(DTSignTypes.COOK_PINE);
		COOK_PINE_WOOD = createOakWood();

		CROLOOD_BUTTON = createOakButton();
		CROLOOD_DOOR = createOakDoor();
		CROLOOD_FENCE = createOakFence();
		CROLOOD_FENCE_GATE = createOakFenceGate();
		CROLOOD_LEAVES = createOakLeaves();
		CROLOOD_LOG = createOakLog();
		CROLOOD_PLANKS = createOakPlanks();
		CROLOOD_PRESSURE_PLATE = createOakPressurePlate();
		CROLOOD_SAPLING = createOakSapling(DTSaplingGenerators.CROLOOD);
		CROLOOD_SIGN = createOakSign(DTSignTypes.CROLOOD);
		CROLOOD_SLAB = createOakSlab();
		CROLOOD_STAIRS = createOakStairs(CROLOOD_PLANKS);
		CROLOOD_TRAPDOOR = createOakTrapdoor();
		CROLOOD_WALL_SIGN = createOakWallSign(DTSignTypes.CROLOOD);
		CROLOOD_WOOD = createOakWood();

		DARK_CROLOOD_BUTTON = createOakButton();
		DARK_CROLOOD_DOOR = createOakDoor();
		DARK_CROLOOD_FENCE = createOakFence();
		DARK_CROLOOD_FENCE_GATE = createOakFenceGate();
		DARK_CROLOOD_LEAVES = createOakLeaves();
		DARK_CROLOOD_LOG = createOakLog();
		DARK_CROLOOD_PLANKS = createOakPlanks();
		DARK_CROLOOD_PRESSURE_PLATE = createOakPressurePlate();
		DARK_CROLOOD_SAPLING = createOakSapling(DTSaplingGenerators.DARK_CROLOOD);
		DARK_CROLOOD_SIGN = createOakSign(DTSignTypes.DARK_CROLOOD);
		DARK_CROLOOD_SLAB = createOakSlab();
		DARK_CROLOOD_STAIRS = createOakStairs(DARK_CROLOOD_PLANKS);
		DARK_CROLOOD_TRAPDOOR = createOakTrapdoor();
		DARK_CROLOOD_WALL_SIGN = createOakWallSign(DTSignTypes.DARK_CROLOOD);
		DARK_CROLOOD_WOOD = createOakWood();

		DARK_FUCHSITRA_BUTTON = createOakButton();
		DARK_FUCHSITRA_DOOR = createOakDoor();
		DARK_FUCHSITRA_FENCE = createOakFence();
		DARK_FUCHSITRA_FENCE_GATE = createOakFenceGate();
		DARK_FUCHSITRA_LEAVES = createOakLeaves();
		DARK_FUCHSITRA_LOG = createOakLog();
		DARK_FUCHSITRA_PLANKS = createOakPlanks();
		DARK_FUCHSITRA_PRESSURE_PLATE = createOakPressurePlate();
		DARK_FUCHSITRA_SAPLING = createOakSapling(DTSaplingGenerators.DARK_FUCHSITRA);
		DARK_FUCHSITRA_SIGN = createOakSign(DTSignTypes.DARK_FUCHSITRA);
		DARK_FUCHSITRA_SLAB = createOakSlab();
		DARK_FUCHSITRA_STAIRS = createOakStairs(DARK_FUCHSITRA_PLANKS);
		DARK_FUCHSITRA_TRAPDOOR = createOakTrapdoor();
		DARK_FUCHSITRA_WALL_SIGN = createOakWallSign(DTSignTypes.DARK_FUCHSITRA);
		DARK_FUCHSITRA_WOOD = createOakWood();

		DARK_RED_ELM_BUTTON = createOakButton();
		DARK_RED_ELM_DOOR = createOakDoor();
		DARK_RED_ELM_FENCE = createOakFence();
		DARK_RED_ELM_FENCE_GATE = createOakFenceGate();
		DARK_RED_ELM_LEAVES = createOakLeaves();
		DARK_RED_ELM_LOG = createOakLog();
		DARK_RED_ELM_PLANKS = createOakPlanks();
		DARK_RED_ELM_PRESSURE_PLATE = createOakPressurePlate();
		DARK_RED_ELM_SAPLING = createOakSapling(DTSaplingGenerators.DARK_RED_ELM);
		DARK_RED_ELM_SIGN = createOakSign(DTSignTypes.DARK_RED_ELM);
		DARK_RED_ELM_SLAB = createOakSlab();
		DARK_RED_ELM_STAIRS = createOakStairs(DARK_RED_ELM_PLANKS);
		DARK_RED_ELM_TRAPDOOR = createOakTrapdoor();
		DARK_RED_ELM_WALL_SIGN = createOakWallSign(DTSignTypes.DARK_RED_ELM);
		DARK_RED_ELM_WOOD = createOakWood();

		DEAD_WART_TREE_BUTTON = createOakButton();
		DEAD_WART_TREE_DOOR = createOakDoor();
		DEAD_WART_TREE_FENCE = createOakFence();
		DEAD_WART_TREE_FENCE_GATE = createOakFenceGate();
		DEAD_WART_TREE_LOG = createOakLog();
		DEAD_WART_TREE_PLANKS = createOakPlanks();
		DEAD_WART_TREE_PRESSURE_PLATE = createOakPressurePlate();
		DEAD_WART_TREE_SIGN = createOakSign(DTSignTypes.DEAD_WART_TREE);
		DEAD_WART_TREE_SLAB = createOakSlab();
		DEAD_WART_TREE_STAIRS = createOakStairs(DEAD_WART_TREE_PLANKS);
		DEAD_WART_TREE_TRAPDOOR = createOakTrapdoor();
		DEAD_WART_TREE_WALL_SIGN = createOakWallSign(DTSignTypes.DEAD_WART_TREE);
		DEAD_WART_TREE_WOOD = createOakWood();

		DRIGYUS = createCopy(DEAD_BUSH);
		DRIGYUS_BUTTON = createOakButton();
		DRIGYUS_DOOR = createOakDoor();
		DRIGYUS_FENCE = createOakFence();
		DRIGYUS_FENCE_GATE = createOakFenceGate();
		DRIGYUS_LOG = createOakLog();
		DRIGYUS_PLANKS = createOakPlanks();
		DRIGYUS_PRESSURE_PLATE = createOakPressurePlate();
		DRIGYUS_SIGN = createOakSign(DTSignTypes.DRIGYUS);
		DRIGYUS_SLAB = createOakSlab();
		DRIGYUS_STAIRS = createOakStairs(DRIGYUS_PLANKS);
		DRIGYUS_TRAPDOOR = createOakTrapdoor();
		DRIGYUS_WALL_SIGN = createOakWallSign(DTSignTypes.DRIGYUS);
		DRIGYUS_WOOD = createOakWood();

		EBONY_BUTTON = createOakButton();
		EBONY_DOOR = createOakDoor();
		EBONY_FENCE = createOakFence();
		EBONY_FENCE_GATE = createOakFenceGate();
		EBONY_LEAVES = createOakLeaves();
		EBONY_LOG = createOakLog();
		EBONY_PLANKS = createOakPlanks();
		EBONY_PRESSURE_PLATE = createOakPressurePlate();
		EBONY_SAPLING = createOakSapling(DTSaplingGenerators.EBONY);
		EBONY_SIGN = createOakSign(DTSignTypes.EBONY);
		EBONY_SLAB = createOakSlab();
		EBONY_STAIRS = createOakStairs(EBONY_PLANKS);
		EBONY_TRAPDOOR = createOakTrapdoor();
		EBONY_WALL_SIGN = createOakWallSign(DTSignTypes.EBONY);
		EBONY_WOOD = createOakWood();

		ENDERHEART_BUTTON = createOakButton();
		ENDERHEART_DOOR = createOakDoor();
		ENDERHEART_FENCE = createOakFence();
		ENDERHEART_FENCE_GATE = createOakFenceGate();
		ENDERHEART_LEAVES = createOakLeaves();
		ENDERHEART_LEAF = createCopy(OAK_LEAVES);
		ENDERHEART_LOG = createOakLog();
		ENDERHEART_PLANKS = createOakPlanks();
		ENDERHEART_PRESSURE_PLATE = createOakPressurePlate();
		ENDERHEART_SAPLING = createOakSapling(DTSaplingGenerators.ENDERHEART);
		ENDERHEART_SIGN = createOakSign(DTSignTypes.ENDERHEART);
		ENDERHEART_SLAB = createOakSlab();
		ENDERHEART_STAIRS = createOakStairs(ENDERHEART_PLANKS);
		ENDERHEART_TRAPDOOR = createOakTrapdoor();
		ENDERHEART_WALL_SIGN = createOakWallSign(DTSignTypes.ENDERHEART);
		ENDERHEART_WOOD = createOakWood();

		FLALM = createTallFlower(ROSE_BUSH);
		FLALM_BUTTON = createOakButton();
		FLALM_DOOR = createOakDoor();
		FLALM_FENCE = createOakFence();
		FLALM_FENCE_GATE = createOakFenceGate();
		FLALM_PETAL_BLOCK = createCap();
		FLALM_PLANKS = createOakPlanks();
		FLALM_PRESSURE_PLATE = createOakPressurePlate();
		FLALM_SIGN = createOakSign(DTSignTypes.FLALM);
		FLALM_SLAB = createOakSlab();
		FLALM_STAIRS = createOakStairs(FLALM_PLANKS);
		FLALM_STEM = createPillar(COCOA);
		FLALM_THORNS = createBlock(FlalmThornsBlock::new, OAK_LEAVES);
		FLALM_TRAPDOOR = createOakTrapdoor();
		FLALM_WALL_SIGN = createOakWallSign(DTSignTypes.FLALM);
		FLALM_WOOD = createOakWood();

		FRUCE_BUTTON = createOakButton();
		FRUCE_DOOR = createOakDoor();
		FRUCE_FENCE = createOakFence();
		FRUCE_FENCE_GATE = createOakFenceGate();
		FRUCE_LEAVES = createOakLeaves();
		FRUCE_LOG = createOakLog();
		FRUCE_PLANKS = createOakPlanks();
		FRUCE_PRESSURE_PLATE = createOakPressurePlate();
		FRUCE_SAPLING = createOakSapling(DTSaplingGenerators.FRUCE);
		FRUCE_SIGN = createOakSign(DTSignTypes.FRUCE);
		FRUCE_SLAB = createOakSlab();
		FRUCE_STAIRS = createOakStairs(FRUCE_PLANKS);
		FRUCE_TRAPDOOR = createOakTrapdoor();
		FRUCE_WALL_SIGN = createOakWallSign(DTSignTypes.FRUCE);
		FRUCE_WOOD = createOakWood();

		FUCHSITRA_BUTTON = createOakButton();
		FUCHSITRA_DOOR = createOakDoor();
		FUCHSITRA_FENCE = createOakFence();
		FUCHSITRA_FENCE_GATE = createOakFenceGate();
		FUCHSITRA_LEAVES = createOakLeaves();
		FUCHSITRA_LOG = createOakLog();
		FUCHSITRA_PLANKS = createOakPlanks();
		FUCHSITRA_PRESSURE_PLATE = createOakPressurePlate();
		FUCHSITRA_SAPLING = createOakSapling(DTSaplingGenerators.FUCHSITRA);
		FUCHSITRA_SIGN = createOakSign(DTSignTypes.FUCHSITRA);
		FUCHSITRA_SLAB = createOakSlab();
		FUCHSITRA_STAIRS = createOakStairs(FUCHSITRA_PLANKS);
		FUCHSITRA_TRAPDOOR = createOakTrapdoor();
		FUCHSITRA_WALL_SIGN = createOakWallSign(DTSignTypes.FUCHSITRA);
		FUCHSITRA_WOOD = createOakWood();

		FUGMOS = createOakSapling(DTSaplingGenerators.FUGMOS);
		FUGMOS_BUTTON = createOakButton();
		FUGMOS_DOOR = createOakDoor();
		FUGMOS_FENCE = createOakFence();
		FUGMOS_FENCE_GATE = createOakFenceGate();
		FUGMOS_STEM = createOakLog();
		FUGMOS_MOSS = createOakLeaves();
		FUGMOS_PLANKS = createOakPlanks();
		FUGMOS_PRESSURE_PLATE = createOakPressurePlate();
		FUGMOS_SIGN = createOakSign(DTSignTypes.FUGMOS);
		FUGMOS_SLAB = createOakSlab();
		FUGMOS_STAIRS = createOakStairs(FUGMOS_PLANKS);
		FUGMOS_TRAPDOOR = createOakTrapdoor();
		FUGMOS_WALL_SIGN = createOakWallSign(DTSignTypes.FUGMOS);
		FUGMOS_WOOD = createOakWood();

		FUNERANITE_BUTTON = createOakButton();
		FUNERANITE_CAP = createCap();
		FUNERANITE_DOOR = createOakDoor();
		FUNERANITE_FENCE = createOakFence();
		FUNERANITE_FENCE_GATE = createOakFenceGate();
		FUNERANITE_LOG = createOakLog();
		FUNERANITE_PLANKS = createOakPlanks();
		FUNERANITE_PRESSURE_PLATE = createOakPressurePlate();
		FUNERANITE_SAPLING = createOakSapling(DTSaplingGenerators.FUNERANITE);
		FUNERANITE_SIGN = createOakSign(DTSignTypes.FUNERANITE);
		FUNERANITE_SLAB = createOakSlab();
		FUNERANITE_STAIRS = createOakStairs(FUNERANITE_PLANKS);
		FUNERANITE_TRAPDOOR = createOakTrapdoor();
		FUNERANITE_WALL_SIGN = createOakWallSign(DTSignTypes.FUNERANITE);
		FUNERANITE_WOOD = createOakWood();

		GHOSHROOM_BUTTON = createOakButton();
		GHOSHROOM_CAP = createCap();
		GHOSHROOM_DOOR = createOakDoor();
		GHOSHROOM_FENCE = createOakFence();
		GHOSHROOM_FENCE_GATE = createOakFenceGate();
		GHOSHROOM_LOG = createOakLog();
		GHOSHROOM_PLANKS = createOakPlanks();
		GHOSHROOM_PRESSURE_PLATE = createOakPressurePlate();
		GHOSHROOM_SAPLING = createOakSapling(DTSaplingGenerators.GHOSHROOM);
		GHOSHROOM_SIGN = createOakSign(DTSignTypes.GHOSHROOM);
		GHOSHROOM_SLAB = createOakSlab();
		GHOSHROOM_STAIRS = createOakStairs(GHOSHROOM_PLANKS);
		GHOSHROOM_TRAPDOOR = createOakTrapdoor();
		GHOSHROOM_WALL_SIGN = createOakWallSign(DTSignTypes.GHOSHROOM);
		GHOSHROOM_WOOD = createOakWood();

		GIANT_VIOLET_BUTTON = createOakButton();
		GIANT_VIOLET_DOOR = createOakDoor();
		GIANT_VIOLET_FENCE = createOakFence();
		GIANT_VIOLET_FENCE_GATE = createOakFenceGate();
		GIANT_VIOLET_PLANKS = createOakPlanks();
		GIANT_VIOLET_PRESSURE_PLATE = createOakPressurePlate();
		GIANT_VIOLET_SIGN = createOakSign(DTSignTypes.GIANT_VIOLET);
		GIANT_VIOLET_SLAB = createOakSlab();
		GIANT_VIOLET_STAIRS = createOakStairs(GIANT_VIOLET_PLANKS);
		GIANT_VIOLET_STEM = createOakLog();
		GIANT_VIOLET_TRAPDOOR = createOakTrapdoor();
		GIANT_VIOLET_WALL_SIGN = createOakWallSign(DTSignTypes.GIANT_VIOLET);
		GIANT_VIOLET_WOOD = createOakWood();

		GUAIACUM_BUTTON = createOakButton();
		GUAIACUM_DOOR = createOakDoor();
		GUAIACUM_FENCE = createOakFence();
		GUAIACUM_FENCE_GATE = createOakFenceGate();
		GUAIACUM_FLOWERS = createBlock(GuaiacumFlowersBlock::new, OAK_LEAVES);
		GUAIACUM_LEAVES = createOakLeaves();
		GUAIACUM_LOG = createOakLog();
		GUAIACUM_PLANKS = createOakPlanks();
		GUAIACUM_PRESSURE_PLATE = createOakPressurePlate();
		GUAIACUM_SAPLING = createOakSapling(DTSaplingGenerators.GUAIACUM);
		GUAIACUM_SIGN = createOakSign(DTSignTypes.GUAIACUM);
		GUAIACUM_SLAB = createOakSlab();
		GUAIACUM_STAIRS = createOakStairs(GUAIACUM_PLANKS);
		GUAIACUM_TRAPDOOR = createOakTrapdoor();
		GUAIACUM_WALL_SIGN = createOakWallSign(DTSignTypes.GUAIACUM);
		GUAIACUM_WOOD = createOakWood();

		JOSHUA_BUTTON = createOakButton();
		JOSHUA_DOOR = createOakDoor();
		JOSHUA_FENCE = createOakFence();
		JOSHUA_FENCE_GATE = createOakFenceGate();
		JOSHUA_LEAVES = createOakLeaves();
		JOSHUA_LOG = createOakLog();
		JOSHUA_PLANKS = createOakPlanks();
		JOSHUA_PRESSURE_PLATE = createOakPressurePlate();
		JOSHUA_SAPLING = createOakSapling(DTSaplingGenerators.JOSHUA);
		JOSHUA_SIGN = createOakSign(DTSignTypes.JOSHUA);
		JOSHUA_SLAB = createOakSlab();
		JOSHUA_STAIRS = createOakStairs(JOSHUA_PLANKS);
		JOSHUA_TRAPDOOR = createOakTrapdoor();
		JOSHUA_WALL_SIGN = createOakWallSign(DTSignTypes.JOSHUA);
		JOSHUA_WOOD = createOakWood();

		KLINKII_PINE_BUTTON = createOakButton();
		KLINKII_PINE_DOOR = createOakDoor();
		KLINKII_PINE_FENCE = createOakFence();
		KLINKII_PINE_FENCE_GATE = createOakFenceGate();
		KLINKII_PINE_LEAVES = createOakLeaves();
		KLINKII_PINE_LOG = createOakLog();
		KLINKII_PINE_PLANKS = createOakPlanks();
		KLINKII_PINE_PRESSURE_PLATE = createOakPressurePlate();
		KLINKII_PINE_SAPLING = createOakSapling(DTSaplingGenerators.KLINKII_PINE);
		KLINKII_PINE_SIGN = createOakSign(DTSignTypes.KLINKII_PINE);
		KLINKII_PINE_SLAB = createOakSlab();
		KLINKII_PINE_STAIRS = createOakStairs(KLINKII_PINE_PLANKS);
		KLINKII_PINE_TRAPDOOR = createOakTrapdoor();
		KLINKII_PINE_WALL_SIGN = createOakWallSign(DTSignTypes.KLINKII_PINE);
		KLINKII_PINE_WOOD = createOakWood();

		MELALEUCA_BUTTON = createOakButton();
		MELALEUCA_DOOR = createOakDoor();
		MELALEUCA_FENCE = createOakFence();
		MELALEUCA_FENCE_GATE = createOakFenceGate();
		MELALEUCA_FLOWERS = createBlock(MelaleucaFlowersBlock::new, OAK_LEAVES);
		MELALEUCA_LEAVES = createOakLeaves();
		MELALEUCA_LOG = createOakLog();
		MELALEUCA_PLANKS = createOakPlanks();
		MELALEUCA_PRESSURE_PLATE = createOakPressurePlate();
		MELALEUCA_SAPLING = createOakSapling(DTSaplingGenerators.MELALEUCA);
		MELALEUCA_SIGN = createOakSign(DTSignTypes.MELALEUCA);
		MELALEUCA_SLAB = createOakSlab();
		MELALEUCA_STAIRS = createOakStairs(MELALEUCA_PLANKS);
		MELALEUCA_TRAPDOOR = createOakTrapdoor();
		MELALEUCA_WALL_SIGN = createOakWallSign(DTSignTypes.MELALEUCA);
		MELALEUCA_WOOD = createOakWood();

		MOSSY_YEW_LOG = createOakLog();

		MURKANTUAN_BUTTON = createOakButton();
		MURKANTUAN_DOOR = createOakDoor();
		MURKANTUAN_FENCE = createOakFence();
		MURKANTUAN_FENCE_GATE = createOakFenceGate();
		MURKANTUAN_LEAVES = createOakLeaves();
		MURKANTUAN_FLOWER = createBlock(MurkantuanFlowerBlock::new, OAK_LEAVES);
		MURKANTUAN_LOG = createOakLog();
		MURKANTUAN_PLANKS = createOakPlanks();
		MURKANTUAN_PRESSURE_PLATE = createOakPressurePlate();
		MURKANTUAN_SAPLING = createOakSapling(DTSaplingGenerators.MURKANTUAN);
		MURKANTUAN_SIGN = createOakSign(DTSignTypes.MURKANTUAN);
		MURKANTUAN_SLAB = createOakSlab();
		MURKANTUAN_STAIRS = createOakStairs(MURKANTUAN_PLANKS);
		MURKANTUAN_TRAPDOOR = createOakTrapdoor();
		MURKANTUAN_WALL_SIGN = createOakWallSign(DTSignTypes.MURKANTUAN);
		MURKANTUAN_WOOD = createOakWood();

		NORFOLK_PINE_BUTTON = createOakButton();
		NORFOLK_PINE_DOOR = createOakDoor();
		NORFOLK_PINE_FENCE = createOakFence();
		NORFOLK_PINE_FENCE_GATE = createOakFenceGate();
		NORFOLK_PINE_LEAVES = createOakLeaves();
		NORFOLK_PINE_LOG = createOakLog();
		NORFOLK_PINE_PLANKS = createOakPlanks();
		NORFOLK_PINE_PRESSURE_PLATE = createOakPressurePlate();
		NORFOLK_PINE_SAPLING = createOakSapling(DTSaplingGenerators.NORFOLK_PINE);
		NORFOLK_PINE_SIGN = createOakSign(DTSignTypes.NORFOLK_PINE);
		NORFOLK_PINE_SLAB = createOakSlab();
		NORFOLK_PINE_STAIRS = createOakStairs(NORFOLK_PINE_PLANKS);
		NORFOLK_PINE_TRAPDOOR = createOakTrapdoor();
		NORFOLK_PINE_WALL_SIGN = createOakWallSign(DTSignTypes.NORFOLK_PINE);
		NORFOLK_PINE_WOOD = createOakWood();

		OBSCRUS = createBlock(ObscrusBlock::new, Settings.copy(SUNFLOWER).ticksRandomly());
		OBSCRUS_BUTTON = createOakButton();
		OBSCRUS_DOOR = createOakDoor();
		OBSCRUS_FENCE = createOakFence();
		OBSCRUS_FENCE_GATE = createOakFenceGate();
		OBSCRUS_LEAVES = createOakLeaves();
		OBSCRUS_LOG = createOakLog();
		OBSCRUS_PLANKS = createOakPlanks();
		OBSCRUS_PRESSURE_PLATE = createOakPressurePlate();
		OBSCRUS_SIGN = createOakSign(DTSignTypes.OBSCRUS);
		OBSCRUS_SLAB = createOakSlab();
		OBSCRUS_STAIRS = createOakStairs(OBSCRUS_PLANKS);
		OBSCRUS_TRAPDOOR = createOakTrapdoor();
		OBSCRUS_WALL_SIGN = createOakWallSign(DTSignTypes.OBSCRUS);
		OBSCRUS_WOOD = createOakWood();

		ORHPRIS_BUTTON = createOakButton();
		ORHPRIS_DOOR = createOakDoor();
		ORHPRIS_FENCE = createOakFence();
		ORHPRIS_FENCE_GATE = createOakFenceGate();
		ORHPRIS_LEAVES = createOakLeaves();
		ORHPRIS_LOG = createOakLog();
		ORHPRIS_PLANKS = createOakPlanks();
		ORHPRIS_PRESSURE_PLATE = createOakPressurePlate();
		ORHPRIS_SAPLING = createOakSapling(DTSaplingGenerators.ORHPRIS);
		ORHPRIS_SIGN = createOakSign(DTSignTypes.ORHPRIS);
		ORHPRIS_SLAB = createOakSlab();
		ORHPRIS_STAIRS = createOakStairs(ORHPRIS_PLANKS);
		ORHPRIS_TRAPDOOR = createOakTrapdoor();
		ORHPRIS_WALL_SIGN = createOakWallSign(DTSignTypes.ORHPRIS);
		ORHPRIS_WOOD = createOakWood();

		PELTOGYNE_BUTTON = createOakButton();
		PELTOGYNE_DOOR = createOakDoor();
		PELTOGYNE_FENCE = createOakFence();
		PELTOGYNE_FENCE_GATE = createOakFenceGate();
		PELTOGYNE_LEAVES = createOakLeaves();
		PELTOGYNE_LOG = createOakLog();
		PELTOGYNE_PLANKS = createOakPlanks();
		PELTOGYNE_PRESSURE_PLATE = createOakPressurePlate();
		PELTOGYNE_SAPLING = createOakSapling(DTSaplingGenerators.PELTOGYNE);
		PELTOGYNE_SIGN = createOakSign(DTSignTypes.PELTOGYNE);
		PELTOGYNE_SLAB = createOakSlab();
		PELTOGYNE_STAIRS = createOakStairs(PELTOGYNE_PLANKS);
		PELTOGYNE_TRAPDOOR = createOakTrapdoor();
		PELTOGYNE_WALL_SIGN = createOakWallSign(DTSignTypes.PELTOGYNE);
		PELTOGYNE_WOOD = createOakWood();

		PIN_CHERRY_BUTTON = createOakButton();
		PIN_CHERRY_DOOR = createOakDoor();
		PIN_CHERRY_FENCE = createOakFence();
		PIN_CHERRY_FENCE_GATE = createOakFenceGate();
		PIN_CHERRY_LEAVES = createOakLeaves();
		PIN_CHERRY_LOG = createOakLog();
		PIN_CHERRY_PLANKS = createOakPlanks();
		PIN_CHERRY_PRESSURE_PLATE = createOakPressurePlate();
		PIN_CHERRY_SAPLING = createOakSapling(DTSaplingGenerators.PIN_CHERRY);
		PIN_CHERRY_SIGN = createOakSign(DTSignTypes.PIN_CHERRY);
		PIN_CHERRY_SLAB = createOakSlab();
		PIN_CHERRY_STAIRS = createOakStairs(PIN_CHERRY_PLANKS);
		PIN_CHERRY_TRAPDOOR = createOakTrapdoor();
		PIN_CHERRY_WALL_SIGN = createOakWallSign(DTSignTypes.PIN_CHERRY);
		PIN_CHERRY_WOOD = createOakWood();

		PLUM_BUTTON = createOakButton();
		PLUM_DOOR = createOakDoor();
		PLUM_FENCE = createOakFence();
		PLUM_FENCE_GATE = createOakFenceGate();
		PLUM_LEAVES = createOakLeaves();
		PLUM_LOG = createOakLog();
		PLUM_PLANKS = createOakPlanks();
		PLUM_PRESSURE_PLATE = createOakPressurePlate();
		PLUM_SAPLING = createOakSapling(DTSaplingGenerators.PLUM);
		PLUM_SIGN = createOakSign(DTSignTypes.PLUM);
		PLUM_SLAB = createOakSlab();
		PLUM_STAIRS = createOakStairs(PLUM_PLANKS);
		PLUM_TRAPDOOR = createOakTrapdoor();
		PLUM_WALL_SIGN = createOakWallSign(DTSignTypes.PLUM);
		PLUM_WOOD = createOakWood();

		PURFUNGA_BUTTON = createOakButton();
		PURFUNGA_CAP = createCap();
		PURFUNGA_DOOR = createOakDoor();
		PURFUNGA_FENCE = createOakFence();
		PURFUNGA_FENCE_GATE = createOakFenceGate();
		PURFUNGA_LOG = createOakLog();
		PURFUNGA_PLANKS = createOakPlanks();
		PURFUNGA_PRESSURE_PLATE = createOakPressurePlate();
		PURFUNGA_SAPLING = createAcuaticFungus(DTSaplingGenerators.PURFUNGA);
		PURFUNGA_SIGN = createOakSign(DTSignTypes.PURFUNGA);
		PURFUNGA_SLAB = createOakSlab();
		PURFUNGA_STAIRS = createOakStairs(PURFUNGA_PLANKS);
		PURFUNGA_TRAPDOOR = createOakTrapdoor();
		PURFUNGA_WALL_SIGN = createOakWallSign(DTSignTypes.PURFUNGA);
		PURFUNGA_WOOD = createOakWood();

		RARK_BUTTON = createOakButton();
		RARK_DOOR = createOakDoor();
		RARK_FENCE = createOakFence();
		RARK_FENCE_GATE = createOakFenceGate();
		RARK_LEAVES = createOakLeaves();
		RARK_LOG = createOakLog();
		RARK_PLANKS = createOakPlanks();
		RARK_PRESSURE_PLATE = createOakPressurePlate();
		RARK_SAPLING = createOakSapling(DTSaplingGenerators.RARK);
		RARK_SIGN = createOakSign(DTSignTypes.RARK);
		RARK_SLAB = createOakSlab();
		RARK_STAIRS = createOakStairs(RARK_PLANKS);
		RARK_TRAPDOOR = createOakTrapdoor();
		RARK_WALL_SIGN = createOakWallSign(DTSignTypes.RARK);
		RARK_WOOD = createOakWood();

		RED_ELM_BUTTON = createOakButton();
		RED_ELM_DOOR = createOakDoor();
		RED_ELM_FENCE = createOakFence();
		RED_ELM_FENCE_GATE = createOakFenceGate();
		RED_ELM_LEAVES = createOakLeaves();
		RED_ELM_LOG = createOakLog();
		RED_ELM_PLANKS = createOakPlanks();
		RED_ELM_PRESSURE_PLATE = createOakPressurePlate();
		RED_ELM_SAPLING = createOakSapling(DTSaplingGenerators.RED_ELM);
		RED_ELM_SIGN = createOakSign(DTSignTypes.RED_ELM);
		RED_ELM_SLAB = createOakSlab();
		RED_ELM_STAIRS = createOakStairs(RED_ELM_PLANKS);
		RED_ELM_TRAPDOOR = createOakTrapdoor();
		RED_ELM_WALL_SIGN = createOakWallSign(DTSignTypes.RED_ELM);
		RED_ELM_WOOD = createOakWood();

		RHADI_BUTTON = createOakButton();
		RHADI_DOOR = createOakDoor();
		RHADI_FENCE = createOakFence();
		RHADI_FENCE_GATE = createOakFenceGate();
		RHADI_FRUIT = createBlock(RhadiFruit::new, MELON);
		CARVED_RHADI_FRUIT = createHorizontalBlock(MELON);
		RHADI_LEAVES = createOakLeaves();
		RHADI_LOG = createOakLog();
		RHADI_O_LANTERN = createHorizontalBlock(JACK_O_LANTERN);
		RHADI_PLANKS = createOakPlanks();
		RHADI_PRESSURE_PLATE = createOakPressurePlate();
		RHADI_SAPLING = createOakSapling(DTSaplingGenerators.RHADI);
		RHADI_SIGN = createOakSign(DTSignTypes.RHADI);
		RHADI_SLAB = createOakSlab();
		RHADI_STAIRS = createOakStairs(RHADI_PLANKS);
		RHADI_THORNS = createBlock(RhadiVineThornsBlock::new, OAK_LEAVES);
		RHADI_TRAPDOOR = createOakTrapdoor();
		RHADI_WALL_SIGN = createOakWallSign(DTSignTypes.RHADI);
		RHADI_WOOD = createOakWood();

		SANGUART_BUTTON = createOakButton();
		SANGUART_DOOR = createOakDoor();
		SANGUART_FENCE = createOakFence();
		SANGUART_FENCE_GATE = createOakFenceGate();
		SANGUART_LEAVES = createOakLeaves();
		SANGUART_LOG = createOakLog();
		SANGUART_PLANKS = createOakPlanks();
		SANGUART_PRESSURE_PLATE = createOakPressurePlate();
		SANGUART_SAPLING = createOakSapling(DTSaplingGenerators.SANGUART);
		SANGUART_SIGN = createOakSign(DTSignTypes.SANGUART);
		SANGUART_SLAB = createOakSlab();
		SANGUART_STAIRS = createOakStairs(SANGUART_PLANKS);
		SANGUART_TRAPDOOR = createOakTrapdoor();
		SANGUART_WALL_SIGN = createOakWallSign(DTSignTypes.SANGUART);
		SANGUART_WOOD = createOakWood();

		SCARLET_THIORCEN = createCopy(DEAD_BUSH);
		SCARLET_THIORCEN_BUTTON = createOakButton();
		SCARLET_THIORCEN_DOOR = createOakDoor();
		SCARLET_THIORCEN_FENCE = createOakFence();
		SCARLET_THIORCEN_FENCE_GATE = createOakFenceGate();
		SCARLET_THIORCEN_LOG = createOakLog();
		SCARLET_THIORCEN_PLANKS = createOakPlanks();
		SCARLET_THIORCEN_PRESSURE_PLATE = createOakPressurePlate();
		SCARLET_THIORCEN_SIGN = createOakSign(DTSignTypes.SCARLET_THIORCEN);
		SCARLET_THIORCEN_SLAB = createOakSlab();
		SCARLET_THIORCEN_STAIRS = createOakStairs(SCARLET_THIORCEN_PLANKS);
		SCARLET_THIORCEN_TRAPDOOR = createOakTrapdoor();
		SCARLET_THIORCEN_WALL_SIGN = createOakWallSign(DTSignTypes.SCARLET_THIORCEN);
		SCARLET_THIORCEN_WOOD = createOakWood();

		SEQUOIA_BUTTON = createOakButton();
		SEQUOIA_DOOR = createOakDoor();
		SEQUOIA_FENCE = createOakFence();
		SEQUOIA_FENCE_GATE = createOakFenceGate();
		SEQUOIA_LEAVES = createOakLeaves();
		SEQUOIA_LOG = createOakLog();
		SEQUOIA_PLANKS = createOakPlanks();
		SEQUOIA_PRESSURE_PLATE = createOakPressurePlate();
		SEQUOIA_SAPLING = createOakSapling(DTSaplingGenerators.SEQUOIA);
		SEQUOIA_SIGN = createOakSign(DTSignTypes.SEQUOIA);
		SEQUOIA_SLAB = createOakSlab();
		SEQUOIA_STAIRS = createOakStairs(SEQUOIA_PLANKS);
		SEQUOIA_TRAPDOOR = createOakTrapdoor();
		SEQUOIA_WALL_SIGN = createOakWallSign(DTSignTypes.SEQUOIA);
		SEQUOIA_WOOD = createOakWood();

		SPROOM_BUTTON = createOakButton();
		SPROOM_DOOR = createOakDoor();
		SPROOM_FENCE = createOakFence();
		SPROOM_FENCE_GATE = createOakFenceGate();
		SPROOM_LEAVES = createOakLeaves();
		SPROOM_LOG = createOakLog();
		SPROOM_PLANKS = createOakPlanks();
		SPROOM_PRESSURE_PLATE = createOakPressurePlate();
		SPROOM_SAPLING = createStorceanSapling(DTSaplingGenerators.SPROOM);
		SPROOM_SIGN = createOakSign(DTSignTypes.SPROOM);
		SPROOM_SLAB = createOakSlab();
		SPROOM_STAIRS = createOakStairs(SPROOM_PLANKS);
		SPROOM_TRAPDOOR = createOakTrapdoor();
		SPROOM_WALL_SIGN = createOakWallSign(DTSignTypes.SPROOM);
		SPROOM_WOOD = createOakWood();

		STORTREEAN_BUTTON = createOakButton();
		STORTREEAN_DOOR = createOakDoor();
		STORTREEAN_FENCE = createOakFence();
		STORTREEAN_FENCE_GATE = createOakFenceGate();
		STORTREEAN_LEAVES = createOakLeaves();
		STORTREEAN_LOG = createOakLog();
		STORTREEAN_PLANKS = createOakPlanks();
		STORTREEAN_PRESSURE_PLATE = createOakPressurePlate();
		STORTREEAN_SAPLING = createStorceanSapling(DTSaplingGenerators.STORTREEAN);
		STORTREEAN_SIGN = createOakSign(DTSignTypes.STORTREEAN);
		STORTREEAN_SLAB = createOakSlab();
		STORTREEAN_STAIRS = createOakStairs(STORTREEAN_PLANKS);
		STORTREEAN_TRAPDOOR = createOakTrapdoor();
		STORTREEAN_WALL_SIGN = createOakWallSign(DTSignTypes.STORTREEAN);
		STORTREEAN_WOOD = createOakWood();

		STRIPPED_ALMOND_LOG = createStrippedOakLog();
		STRIPPED_ALMOND_WOOD = createStrippedOakWood();
		STRIPPED_ANAMEATA_LOG = createStrippedOakLog();
		STRIPPED_ANAMEATA_WOOD = createStrippedOakWood();
		STRIPPED_ANGELS_TRUMPET_LOG = createStrippedOakLog();
		STRIPPED_ANGELS_TRUMPET_WOOD = createStrippedOakWood();
		STRIPPED_AQUEAN_LOG = createStrippedOakLog();
		STRIPPED_AQUEAN_WOOD = createStrippedOakWood();
		STRIPPED_BARSHROOKLE_LOG = createStrippedOakLog();
		STRIPPED_BARSHROOKLE_WOOD = createStrippedOakWood();
		STRIPPED_BLACK_BIRCH_LOG = createStrippedOakLog();
		STRIPPED_BLACK_BIRCH_WOOD = createStrippedOakWood();
		STRIPPED_BLUE_MAHOE_LOG = createStrippedOakLog();
		STRIPPED_BLUE_MAHOE_WOOD = createStrippedOakWood();
		STRIPPED_BLUE_SPRUCE_LOG = createStrippedOakLog();
		STRIPPED_BLUE_SPRUCE_WOOD = createStrippedOakWood();
		STRIPPED_BOTTLEBRUSH_LOG = createStrippedOakLog();
		STRIPPED_BOTTLEBRUSH_WOOD = createStrippedOakWood();
		STRIPPED_BROMYA_LOG = createStrippedOakLog();
		STRIPPED_BROMYA_WOOD = createStrippedOakWood();
		STRIPPED_BUBBLETREE_LOG = createStrippedOakLog();
		STRIPPED_BUBBLETREE_WOOD = createStrippedOakWood();
		STRIPPED_CALCEARB_LOG = createStrippedOakLog();
		STRIPPED_CALCEARB_WOOD = createStrippedOakWood();
		STRIPPED_CHERRY_LOG = createStrippedOakLog();
		STRIPPED_CHERRY_WOOD = createStrippedOakWood();
		STRIPPED_CHOTORN_LOG = createStrippedOakLog();
		STRIPPED_CHOTORN_WOOD = createStrippedOakWood();
		STRIPPED_COOK_PINE_LOG = createStrippedOakLog();
		STRIPPED_COOK_PINE_WOOD = createStrippedOakWood();
		STRIPPED_CROLOOD_LOG = createStrippedOakLog();
		STRIPPED_CROLOOD_WOOD = createStrippedOakWood();
		STRIPPED_DARK_CROLOOD_LOG = createStrippedOakLog();
		STRIPPED_DARK_CROLOOD_WOOD = createStrippedOakWood();
		STRIPPED_DARK_FUCHSITRA_LOG = createStrippedOakLog();
		STRIPPED_DARK_FUCHSITRA_WOOD = createStrippedOakWood();
		STRIPPED_DARK_RED_ELM_LOG = createStrippedOakLog();
		STRIPPED_DARK_RED_ELM_WOOD = createStrippedOakWood();
		STRIPPED_DEAD_WART_TREE_LOG = createStrippedOakLog();
		STRIPPED_DEAD_WART_TREE_WOOD = createStrippedOakWood();
		STRIPPED_DRIGYUS_LOG = createStrippedOakLog();
		STRIPPED_DRIGYUS_WOOD = createStrippedOakWood();
		STRIPPED_EBONY_LOG = createStrippedOakLog();
		STRIPPED_EBONY_WOOD = createStrippedOakWood();
		STRIPPED_ENDERHEART_LOG = createStrippedOakLog();
		STRIPPED_ENDERHEART_WOOD = createStrippedOakWood();
		STRIPPED_FLALM_STEM = createStrippedOakLog();
		STRIPPED_FLALM_WOOD = createStrippedOakWood();
		STRIPPED_FRUCE_LOG = createStrippedOakLog();
		STRIPPED_FRUCE_WOOD = createStrippedOakWood();
		STRIPPED_FUCHSITRA_LOG = createStrippedOakLog();
		STRIPPED_FUCHSITRA_WOOD = createStrippedOakWood();
		STRIPPED_FUGMOS_STEM = createStrippedOakLog();
		STRIPPED_FUGMOS_HYPHAE = createStrippedOakWood();
		STRIPPED_FUNERANITE_LOG = createStrippedOakLog();
		STRIPPED_FUNERANITE_WOOD = createStrippedOakWood();
		STRIPPED_GHOSHROOM_LOG = createStrippedOakLog();
		STRIPPED_GHOSHROOM_WOOD = createStrippedOakWood();
		STRIPPED_GIANT_VIOLET_STEM = createStrippedOakLog();
		STRIPPED_GIANT_VIOLET_WOOD = createStrippedOakWood();
		STRIPPED_GUAIACUM_LOG = createStrippedOakLog();
		STRIPPED_GUAIACUM_WOOD = createStrippedOakWood();
		STRIPPED_JOSHUA_LOG = createStrippedOakLog();
		STRIPPED_JOSHUA_WOOD = createStrippedOakWood();
		STRIPPED_KLINKII_PINE_LOG = createStrippedOakLog();
		STRIPPED_KLINKII_PINE_WOOD = createStrippedOakWood();
		STRIPPED_MELALEUCA_LOG = createStrippedOakLog();
		STRIPPED_MELALEUCA_WOOD = createStrippedOakWood();
		STRIPPED_MURKANTUAN_LOG = createStrippedOakLog();
		STRIPPED_MURKANTUAN_WOOD = createStrippedOakWood();
		STRIPPED_NORFOLK_PINE_LOG = createStrippedOakLog();
		STRIPPED_NORFOLK_PINE_WOOD = createStrippedOakWood();
		STRIPPED_OBSCRUS_LOG = createStrippedOakLog();
		STRIPPED_OBSCRUS_WOOD = createStrippedOakWood();
		STRIPPED_ORHPRIS_LOG = createStrippedOakLog();
		STRIPPED_ORHPRIS_WOOD = createStrippedOakWood();
		STRIPPED_PELTOGYNE_LOG = createStrippedOakLog();
		STRIPPED_PELTOGYNE_WOOD = createStrippedOakWood();
		STRIPPED_PIN_CHERRY_LOG = createStrippedOakLog();
		STRIPPED_PIN_CHERRY_WOOD = createStrippedOakWood();
		STRIPPED_PLUM_LOG = createStrippedOakLog();
		STRIPPED_PLUM_WOOD = createStrippedOakWood();
		STRIPPED_PURFUNGA_LOG = createStrippedOakLog();
		STRIPPED_PURFUNGA_WOOD = createStrippedOakWood();
		STRIPPED_RARK_LOG = createStrippedOakLog();
		STRIPPED_RARK_WOOD = createStrippedOakWood();
		STRIPPED_RED_ELM_LOG = createStrippedOakLog();
		STRIPPED_RED_ELM_WOOD = createStrippedOakWood();
		STRIPPED_RHADI_LOG = createStrippedOakLog();
		STRIPPED_RHADI_WOOD = createStrippedOakWood();
		STRIPPED_SANGUART_LOG = createStrippedOakLog();
		STRIPPED_SANGUART_WOOD = createStrippedOakWood();
		STRIPPED_SCARLET_THIORCEN_LOG = createStrippedOakLog();
		STRIPPED_SCARLET_THIORCEN_WOOD = createStrippedOakWood();
		STRIPPED_SEQUOIA_LOG = createStrippedOakLog();
		STRIPPED_SEQUOIA_WOOD = createStrippedOakWood();
		STRIPPED_SPROOM_LOG = createStrippedOakLog();
		STRIPPED_SPROOM_WOOD = createStrippedOakWood();
		STRIPPED_STORTREEAN_LOG = createStrippedOakLog();
		STRIPPED_STORTREEAN_WOOD = createStrippedOakWood();
		STRIPPED_STROOMEAN_LOG = createStrippedOakLog();
		STRIPPED_STROOMEAN_WOOD = createStrippedOakWood();
		STRIPPED_SUNRISE_FUNGUS_LOG = createStrippedOakLog();
		STRIPPED_SUNRISE_FUNGUS_WOOD = createStrippedOakWood();
		STRIPPED_TARK_LOG = createStrippedOakLog();
		STRIPPED_TARK_WOOD = createStrippedOakWood();
		STRIPPED_TEAK_LOG = createStrippedOakLog();
		STRIPPED_TEAK_WOOD = createStrippedOakWood();
		STRIPPED_THUNDERCLOUD_PLUM_LOG = createStrippedOakLog();
		STRIPPED_THUNDERCLOUD_PLUM_WOOD = createStrippedOakWood();
		STRIPPED_VYNHERT_LOG = createStrippedOakLog();
		STRIPPED_VYNHERT_WOOD = createStrippedOakWood();
		STRIPPED_WART_TREE_LOG = createStrippedOakLog();
		STRIPPED_WART_TREE_WOOD = createStrippedOakWood();
		STRIPPED_WENGE_LOG = createStrippedOakLog();
		STRIPPED_WENGE_WOOD = createStrippedOakWood();
		STRIPPED_YEW_LOG = createStrippedOakLog();
		STRIPPED_YEW_WOOD = createStrippedOakWood();

		STROOMEAN_BUTTON = createOakButton();
		STROOMEAN_CAP = createCap();
		STROOMEAN_DOOR = createOakDoor();
		STROOMEAN_FENCE = createOakFence();
		STROOMEAN_FENCE_GATE = createOakFenceGate();
		STROOMEAN_LOG = createOakLog();
		STROOMEAN_PLANKS = createOakPlanks();
		STROOMEAN_PRESSURE_PLATE = createOakPressurePlate();
		STROOMEAN_SAPLING = createAcuaticFungus(DTSaplingGenerators.STROOMEAN);
		STROOMEAN_SIGN = createOakSign(DTSignTypes.STORTREEAN);
		STROOMEAN_SLAB = createOakSlab();
		STROOMEAN_STAIRS = createOakStairs(STROOMEAN_PLANKS);
		STROOMEAN_TRAPDOOR = createOakTrapdoor();
		STROOMEAN_WALL_SIGN = createOakWallSign(DTSignTypes.STROOMEAN);
		STROOMEAN_WOOD = createOakWood();

		SUNRISE_FUNGUS_BUTTON = createOakButton();
		SUNRISE_FUNGUS_CAP = createCap();
		SUNRISE_FUNGUS_DOOR = createOakDoor();
		SUNRISE_FUNGUS_FENCE = createOakFence();
		SUNRISE_FUNGUS_FENCE_GATE = createOakFenceGate();
		SUNRISE_FUNGUS_LOG = createOakLog();
		SUNRISE_FUNGUS_PLANKS = createOakPlanks();
		SUNRISE_FUNGUS_PRESSURE_PLATE = createOakPressurePlate();
		SUNRISE_FUNGUS_SAPLING = createAcuaticFungus(DTSaplingGenerators.SUNRISE_FUNGUS);
		SUNRISE_FUNGUS_SIGN = createOakSign(DTSignTypes.SUNRISE_FUNGUS);
		SUNRISE_FUNGUS_SLAB = createOakSlab();
		SUNRISE_FUNGUS_STAIRS = createOakStairs(SUNRISE_FUNGUS_PLANKS);
		SUNRISE_FUNGUS_TRAPDOOR = createOakTrapdoor();
		SUNRISE_FUNGUS_WALL_SIGN = createOakWallSign(DTSignTypes.SUNRISE_FUNGUS);
		SUNRISE_FUNGUS_WOOD = createOakWood();

		TARK_BUTTON = createOakButton();
		TARK_DOOR = createOakDoor();
		TARK_FENCE = createOakFence();
		TARK_FENCE_GATE = createOakFenceGate();
		TARK_LEAVES = createOakLeaves();
		TARK_LOG = createOakLog();
		TARK_PLANKS = createOakPlanks();
		TARK_PRESSURE_PLATE = createOakPressurePlate();
		TARK_SAPLING = createOakSapling(DTSaplingGenerators.TARK);
		TARK_SIGN = createOakSign(DTSignTypes.TARK);
		TARK_SLAB = createOakSlab();
		TARK_STAIRS = createOakStairs(TARK_PLANKS);
		TARK_TRAPDOOR = createOakTrapdoor();
		TARK_WALL_SIGN = createOakWallSign(DTSignTypes.TARK);
		TARK_WOOD = createOakWood();

		TEAK_BUTTON = createOakButton();
		TEAK_DOOR = createOakDoor();
		TEAK_FENCE = createOakFence();
		TEAK_FENCE_GATE = createOakFenceGate();
		TEAK_LEAVES = createOakLeaves();
		TEAK_LOG = createOakLog();
		TEAK_PLANKS = createOakPlanks();
		TEAK_PRESSURE_PLATE = createOakPressurePlate();
		TEAK_SAPLING = createOakSapling(DTSaplingGenerators.TEAK);
		TEAK_SIGN = createOakSign(DTSignTypes.TEAK);
		TEAK_SLAB = createOakSlab();
		TEAK_STAIRS = createOakStairs(TEAK_PLANKS);
		TEAK_TRAPDOOR = createOakTrapdoor();
		TEAK_WALL_SIGN = createOakWallSign(DTSignTypes.TEAK);
		TEAK_WOOD = createOakWood();

		THUNDERCLOUD_PLUM_BUTTON = createOakButton();
		THUNDERCLOUD_PLUM_DOOR = createOakDoor();
		THUNDERCLOUD_PLUM_FENCE = createOakFence();
		THUNDERCLOUD_PLUM_FENCE_GATE = createOakFenceGate();
		THUNDERCLOUD_PLUM_LEAVES = createOakLeaves();
		THUNDERCLOUD_PLUM_LOG = createOakLog();
		THUNDERCLOUD_PLUM_PLANKS = createOakPlanks();
		THUNDERCLOUD_PLUM_SAPLING = createOakSapling(DTSaplingGenerators.THUNDERCLOUD_PLUM);
		THUNDERCLOUD_PLUM_PRESSURE_PLATE = createOakPressurePlate();
		THUNDERCLOUD_PLUM_SIGN = createOakSign(DTSignTypes.THUNDERCLOUD_PLUM);
		THUNDERCLOUD_PLUM_SLAB = createOakSlab();
		THUNDERCLOUD_PLUM_STAIRS = createOakStairs(THUNDERCLOUD_PLUM_PLANKS);
		THUNDERCLOUD_PLUM_TRAPDOOR = createOakTrapdoor();
		THUNDERCLOUD_PLUM_WALL_SIGN = createOakWallSign(DTSignTypes.THUNDERCLOUD_PLUM);
		THUNDERCLOUD_PLUM_WOOD = createOakWood();

		VYNHERT_BUTTON = createOakButton();
		VYNHERT_DOOR = createOakDoor();
		VYNHERT_FENCE = createOakFence();
		VYNHERT_FENCE_GATE = createOakFenceGate();
		VYNHERT_FRUIT = createBlock(VynhertFruit::new, MELON);
		CARVED_VYNHERT_FRUIT = createHorizontalBlock(MELON);
		VYNHERT_LEAF = createBlock(VynhertLeafBlock::new, ROSE_BUSH);
		VYNHERT_LOG = createOakLog();
		VYNHERT_O_LANTERN = createHorizontalBlock(JACK_O_LANTERN);
		VYNHERT_PLANKS = createOakPlanks();
		VYNHERT_PRESSURE_PLATE = createOakPressurePlate();
		VYNHERT_SAPLING = createOakSapling(DTSaplingGenerators.VYNHERT);
		VYNHERT_SIGN = createOakSign(DTSignTypes.VYNHERT);
		VYNHERT_SLAB = createOakSlab();
		VYNHERT_STAIRS = createOakStairs(VYNHERT_PLANKS);
		VYNHERT_TENTACLES = createBlock(VynhertThornsBlock::new, OAK_LEAVES);
		VYNHERT_THORNS = createBlock(VynhertThornsBlock::new, OAK_LEAVES);
		VYNHERT_TRAPDOOR = createOakTrapdoor();
		VYNHERT_WALL_SIGN = createOakWallSign(DTSignTypes.VYNHERT);
		VYNHERT_WOOD = createOakWood();

		WART_TREE_BUTTON = createOakButton();
		WART_TREE_DOOR = createOakDoor();
		WART_TREE_FENCE = createOakFence();
		WART_TREE_FENCE_GATE = createOakFenceGate();
		WART_TREE_LOG = createOakLog();
		WART_TREE_PLANKS = createOakPlanks();
		WART_TREE_PRESSURE_PLATE = createOakPressurePlate();
		WART_TREE_SIGN = createOakSign(DTSignTypes.WART_TREE);
		WART_TREE_SLAB = createOakSlab();
		WART_TREE_STAIRS = createOakStairs(WART_TREE_PLANKS);
		WART_TREE_TRAPDOOR = createOakTrapdoor();
		WART_TREE_WALL_SIGN = createOakWallSign(DTSignTypes.WART_TREE);
		WART_TREE_WARTS = createCopy(NETHER_WART_BLOCK);
		WART_TREE_WOOD = createOakWood();

		WENGE_BUTTON = createOakButton();
		WENGE_DOOR = createOakDoor();
		WENGE_FENCE = createOakFence();
		WENGE_FENCE_GATE = createOakFenceGate();
		WENGE_LEAVES = createOakLeaves();
		WENGE_LOG = createOakLog();
		WENGE_PLANKS = createOakPlanks();
		WENGE_PRESSURE_PLATE = createOakPressurePlate();
		WENGE_SAPLING = createOakSapling(DTSaplingGenerators.WENGE);
		WENGE_SIGN = createOakSign(DTSignTypes.WENGE);
		WENGE_SLAB = createOakSlab();
		WENGE_STAIRS = createOakStairs(WENGE_PLANKS);
		WENGE_TRAPDOOR = createOakTrapdoor();
		WENGE_WALL_SIGN = createOakWallSign(DTSignTypes.WENGE);
		WENGE_WOOD = createOakWood();

		YEW_BUTTON = createOakButton();
		YEW_DOOR = createOakDoor();
		YEW_FENCE = createOakFence();
		YEW_FENCE_GATE = createOakFenceGate();
		YEW_LEAVES = createOakLeaves();
		YEW_LOG = createOakLog();
		YEW_PLANKS = createOakPlanks();
		YEW_PRESSURE_PLATE = createOakPressurePlate();
		YEW_SAPLING = createOakSapling(DTSaplingGenerators.YEW);
		YEW_SIGN = createOakSign(DTSignTypes.YEW);
		YEW_SLAB = createOakSlab();
		YEW_STAIRS = createOakStairs(YEW_PLANKS);
		YEW_TRAPDOOR = createOakTrapdoor();
		YEW_WALL_SIGN = createOakWallSign(DTSignTypes.YEW);
		YEW_WOOD = createOakWood();

		POTTED_ALMOND_SAPLING = createPottedSapling(ALMOND_SAPLING);
		POTTED_ANAMEATA_SAPLING = createPottedSapling(ANAMEATA_SAPLING);
		POTTED_ANGELS_TRUMPET_SAPLING = createPottedSapling(ANGELS_TRUMPET_SAPLING);
		POTTED_AQUEAN_SAPLING = createPottedSapling(AQUEAN_SAPLING);
		POTTED_BARSHROOKLE_SAPLING = createPottedSapling(BARSHROOKLE_SAPLING);
		POTTED_BLACK_BIRCH_SAPLING = createPottedSapling(BLACK_BIRCH_SAPLING);
		POTTED_BLUE_MAHOE_SAPLING = createPottedSapling(BLUE_MAHOE_SAPLING);
		POTTED_BLUE_SPRUCE_SAPLING = createPottedSapling(BLUE_SPRUCE_SAPLING);
		POTTED_BOTTLEBRUSH_SAPLING = createPottedSapling(BOTTLEBRUSH_SAPLING);
		POTTED_BROMYA_SAPLING = createPottedSapling(BROMYA_SAPLING);
		POTTED_BUBBLETREE_SAPLING = createPottedSapling(BUBBLETREE_SAPLING);
		POTTED_CALCEARB_SAPLING = createPottedSapling(CALCEARB_SAPLING);
		POTTED_CHERRY_SAPLING = createPottedSapling(CHERRY_SAPLING);
		POTTED_COOK_PINE_SAPLING = createPottedSapling(COOK_PINE_SAPLING);
		POTTED_CROLOOD_SAPLING = createPottedSapling(CROLOOD_SAPLING);
		POTTED_DARK_CROLOOD_SAPLING = createPottedSapling(DARK_CROLOOD_SAPLING);
		POTTED_DARK_FUCHSITRA_SAPLING = createPottedSapling(DARK_FUCHSITRA_SAPLING);
		POTTED_DARK_RED_ELM_SAPLING = createPottedSapling(DARK_RED_ELM_SAPLING);
		POTTED_EBONY_SAPLING = createPottedSapling(EBONY_SAPLING);
		POTTED_ENDERHEART_SAPLING = createPottedSapling(ENDERHEART_SAPLING);
		POTTED_FRUCE_SAPLING = createPottedSapling(FRUCE_SAPLING);
		POTTED_FUCHSITRA_SAPLING = createPottedSapling(FUCHSITRA_SAPLING);
		POTTED_FUGMOS = createPottedSapling(FUGMOS);
		POTTED_FUNERANITE_SAPLING = createPottedSapling(FUNERANITE_SAPLING);
		POTTED_GHOSHROOM_SAPLING = createPottedSapling(GHOSHROOM_SAPLING);
		POTTED_GUAIACUM_SAPLING = createPottedSapling(GUAIACUM_SAPLING);
		POTTED_JOSHUA_SAPLING = createPottedSapling(JOSHUA_SAPLING);
		POTTED_KLINKII_PINE_SAPLING = createPottedSapling(KLINKII_PINE_SAPLING);
		POTTED_MELALEUCA_SAPLING = createPottedSapling(MELALEUCA_SAPLING);
		POTTED_MURKANTUAN_SAPLING = createPottedSapling(MURKANTUAN_SAPLING);
		POTTED_NORFOLK_PINE_SAPLING = createPottedSapling(NORFOLK_PINE_SAPLING);
		POTTED_ORHPRIS_SAPLING = createPottedSapling(ORHPRIS_SAPLING);
		POTTED_PELTOGYNE_SAPLING = createPottedSapling(PELTOGYNE_SAPLING);
		POTTED_PIN_CHERRY_SAPLING = createPottedSapling(PIN_CHERRY_SAPLING);
		POTTED_PLUM_SAPLING = createPottedSapling(PLUM_SAPLING);
		POTTED_PURFUNGA_SAPLING = createPottedSapling(PURFUNGA_SAPLING);
		POTTED_RARK_SAPLING = createPottedSapling(RARK_SAPLING);
		POTTED_RED_ELM_SAPLING = createPottedSapling(RED_ELM_SAPLING);
		POTTED_RHADI_SAPLING = createPottedSapling(RHADI_SAPLING);
		POTTED_SANGUART_SAPLING = createPottedSapling(SANGUART_SAPLING);
		POTTED_SEQUOIA_SAPLING = createPottedSapling(SEQUOIA_SAPLING);
		POTTED_SPROOM_SAPLING = createPottedSapling(SPROOM_SAPLING);
		POTTED_STORTREEAN_SAPLING = createPottedSapling(STORTREEAN_SAPLING);
		POTTED_STROOMEAN_SAPLING = createPottedSapling(STROOMEAN_SAPLING);
		POTTED_SUNRISE_FUNGUS_SAPLING = createPottedSapling(SUNRISE_FUNGUS_SAPLING);
		POTTED_TARK_SAPLING = createPottedSapling(TARK_SAPLING);
		POTTED_TEAK_SAPLING = createPottedSapling(TEAK_SAPLING);
		POTTED_THUNDERCLOUD_PLUM_SAPLING = createPottedSapling(THUNDERCLOUD_PLUM_SAPLING);
		POTTED_VYNHERT_SAPLING = createPottedSapling(VYNHERT_SAPLING);
		POTTED_WENGE_SAPLING = createPottedSapling(WENGE_SAPLING);
		POTTED_YEW_SAPLING = createPottedSapling(YEW_SAPLING);

		POTTED_BLACK_PANSY = createFlowerPot(BLACK_PANSY);
		POTTED_BLUE_PANSY = createFlowerPot(BLUE_PANSY);
		POTTED_BLUE_POPPY = createFlowerPot(BLUE_POPPY);
		POTTED_BLUE_VIOLET = createFlowerPot(BLUE_VIOLET);
		POTTED_BONNET_SPURGE = createFlowerPot(BONNET_SPURGE);
		POTTED_BROWN_PANSY = createFlowerPot(BROWN_PANSY);
		POTTED_CACTLOW = createFlowerPot(CACTLOW);
		POTTED_CHOCOLATE_COSMOS_FLOWER = createFlowerPot(CHOCOLATE_COSMOS_FLOWER);
		POTTED_CYAN_BLUE_VIOLET = createFlowerPot(CYAN_BLUE_VIOLET);
		POTTED_CYCAWLER = createFlowerPot(CYCAWLER);
		POTTED_DRIGYUS = createFlowerPot(DRIGYUS);
		POTTED_GARDEN_PINKS = createFlowerPot(GARDEN_PINKS);
		POTTED_GREEN_PANSY = createFlowerPot(GREEN_PANSY);
		POTTED_GYLDELION_FLOWER = createFlowerPot(GYLDELION_FLOWER);
		POTTED_MARSH_VIOLET = createFlowerPot(MARSH_VIOLET);
		POTTED_NATIVE_VIOLET = createFlowerPot(NATIVE_VIOLET);
		POTTED_OPIUM_POPPY = createFlowerPot(OPIUM_POPPY);
		POTTED_POPPY = createFlowerPot(POPPY);
		POTTED_PINK_AND_ORANGE_PANSY = createFlowerPot(PINK_AND_ORANGE_PANSY);
		POTTED_PINK_BRAITOR_FLOWER = createFlowerPot(PINK_BRAITOR_FLOWER);
		POTTED_PINK_MARSH_VIOLET = createFlowerPot(PINK_MARSH_VIOLET);
		POTTED_PINK_ROSE = createFlowerPot(PINK_ROSE);
		POTTED_PINK_ROSE_BUSH = createFlowerPot(PINK_ROSE_BUSH);
		POTTED_PURPLE_AND_ORANGE_PANSY = createFlowerPot(PURPLE_AND_ORANGE_PANSY);
		POTTED_SPIKE_LAVENDER = createFlowerPot(SPIKE_LAVENDER);
		POTTED_RED_BRAITOR_FLOWER = createFlowerPot(RED_BRAITOR_FLOWER);
		POTTED_RED_CHOCOLATE_COSMOS_FLOWER = createFlowerPot(RED_CHOCOLATE_COSMOS_FLOWER);
		POTTED_RED_PANSY = createFlowerPot(RED_PANSY);
		POTTED_RED_ROSE = createFlowerPot(RED_ROSE);
		POTTED_RUBRA_BLUE_VIOLET = createFlowerPot(RUBRA_BLUE_VIOLET);
		POTTED_SCARLET_THIORCEN = createFlowerPot(SCARLET_THIORCEN);
		POTTED_SPIDREET = createFlowerPot(SPIDREET);
		POTTED_SPROOM_SPIKE = createFlowerPot(SPROOM_SPIKE);
		POTTED_SQUISACLE = createFlowerPot(SQUISACLE);
		POTTED_SWEET_VIOLET = createFlowerPot(SWEET_VIOLET);
		POTTED_TOPPED_LAVENDER = createFlowerPot(TOPPED_LAVENDER);
		POTTED_VASLAME = createFlowerPot(VASLAME);
		POTTED_WEEPISTIL = createFlowerPot(WEEPISTIL);
		POTTED_WEEPY_HOLLOWER = createFlowerPot(WEEPY_HOLLOWER);
		POTTED_YELLOW_VIOLET = createFlowerPot(YELLOW_VIOLET);

		ANDESITE_AQUAMARINE_ORE = createCopy(COAL_ORE);
		ANDESITE_BLACK_OPAL_ORE = createCopy(COAL_ORE);
		ANDESITE_CHALCEDONY_ORE = createCopy(COAL_ORE);
		ANDESITE_CLINOHUMITE_ORE = createCopy(COAL_ORE);
		ANDESITE_COAL_ORE = createCopy(COAL_ORE);
		ANDESITE_COPPER_ORE = createCopy(COAL_ORE);
		ANDESITE_DIAMOND_ORE = createCopy(COAL_ORE);
		ANDESITE_EMERALD_ORE = createCopy(COAL_ORE);
		ANDESITE_GOLD_ORE = createCopy(COAL_ORE);
		ANDESITE_IRON_ORE = createCopy(COAL_ORE);
		ANDESITE_LAPIS_ORE = createCopy(COAL_ORE);
		ANDESITE_MORGANITE_ORE = createCopy(COAL_ORE);
		ANDESITE_REDSTONE_ORE = createCopy(COAL_ORE);
		ANDESITE_RUBY_ORE = createCopy(COAL_ORE);
		ANDESITE_SILVER_ORE = createCopy(COAL_ORE);
		ANDESITE_SPHENE_ORE = createCopy(COAL_ORE);
		ANDESITE_SPINEL_ORE = createCopy(COAL_ORE);
		ANDESITE_TANZANITE_ORE = createCopy(COAL_ORE);

		BLACK_BASALT_AQUAMARINE_ORE = createCopy(COAL_ORE);
		BLACK_BASALT_BLACK_OPAL_ORE = createCopy(COAL_ORE);
		BLACK_BASALT_CHALCEDONY_ORE = createCopy(COAL_ORE);
		BLACK_BASALT_CLINOHUMITE_ORE = createCopy(COAL_ORE);
		BLACK_BASALT_COAL_ORE = createCopy(COAL_ORE);
		BLACK_BASALT_COPPER_ORE = createCopy(COAL_ORE);
		BLACK_BASALT_DIAMOND_ORE = createCopy(COAL_ORE);
		BLACK_BASALT_EMERALD_ORE = createCopy(COAL_ORE);
		BLACK_BASALT_GOLD_ORE = createCopy(COAL_ORE);
		BLACK_BASALT_IRON_ORE = createCopy(COAL_ORE);
		BLACK_BASALT_LAPIS_ORE = createCopy(COAL_ORE);
		BLACK_BASALT_MORGANITE_ORE = createCopy(COAL_ORE);
		BLACK_BASALT_REDSTONE_ORE = createCopy(COAL_ORE);
		BLACK_BASALT_RUBY_ORE = createCopy(COAL_ORE);
		BLACK_BASALT_SILVER_ORE = createCopy(COAL_ORE);
		BLACK_BASALT_SPHENE_ORE = createCopy(COAL_ORE);
		BLACK_BASALT_SPINEL_ORE = createCopy(COAL_ORE);
		BLACK_BASALT_TANZANITE_ORE = createCopy(COAL_ORE);

		BLUE_STORCERACK_AQUAMARINE_ORE = createCopy(COAL_ORE);
		BLUE_STORCERACK_BLACK_OPAL_ORE = createCopy(COAL_ORE);
		BLUE_STORCERACK_CHALCEDONY_ORE = createCopy(COAL_ORE);
		BLUE_STORCERACK_CLINOHUMITE_ORE = createCopy(COAL_ORE);
		BLUE_STORCERACK_COAL_ORE = createCopy(COAL_ORE);
		BLUE_STORCERACK_COPPER_ORE = createCopy(COAL_ORE);
		BLUE_STORCERACK_DIAMOND_ORE = createCopy(COAL_ORE);
		BLUE_STORCERACK_EMERALD_ORE = createCopy(COAL_ORE);
		BLUE_STORCERACK_GOLD_ORE = createCopy(COAL_ORE);
		BLUE_STORCERACK_IRON_ORE = createCopy(COAL_ORE);
		BLUE_STORCERACK_LAPIS_ORE = createCopy(COAL_ORE);
		BLUE_STORCERACK_MORGANITE_ORE = createCopy(COAL_ORE);
		BLUE_STORCERACK_REDSTONE_ORE = createCopy(COAL_ORE);
		BLUE_STORCERACK_RUBY_ORE = createCopy(COAL_ORE);
		BLUE_STORCERACK_SILVER_ORE = createCopy(COAL_ORE);
		BLUE_STORCERACK_SPHENE_ORE = createCopy(COAL_ORE);
		BLUE_STORCERACK_SPINEL_ORE = createCopy(COAL_ORE);
		BLUE_STORCERACK_TANZANITE_ORE = createCopy(COAL_ORE);

		DIORITE_AQUAMARINE_ORE = createCopy(COAL_ORE);
		DIORITE_BLACK_OPAL_ORE = createCopy(COAL_ORE);
		DIORITE_CHALCEDONY_ORE = createCopy(COAL_ORE);
		DIORITE_CLINOHUMITE_ORE = createCopy(COAL_ORE);
		DIORITE_COAL_ORE = createCopy(COAL_ORE);
		DIORITE_COPPER_ORE = createCopy(COAL_ORE);
		DIORITE_DIAMOND_ORE = createCopy(COAL_ORE);
		DIORITE_EMERALD_ORE = createCopy(COAL_ORE);
		DIORITE_GOLD_ORE = createCopy(COAL_ORE);
		DIORITE_IRON_ORE = createCopy(COAL_ORE);
		DIORITE_LAPIS_ORE = createCopy(COAL_ORE);
		DIORITE_MORGANITE_ORE = createCopy(COAL_ORE);
		DIORITE_REDSTONE_ORE = createCopy(COAL_ORE);
		DIORITE_RUBY_ORE = createCopy(COAL_ORE);
		DIORITE_SILVER_ORE = createCopy(COAL_ORE);
		DIORITE_SPHENE_ORE = createCopy(COAL_ORE);
		DIORITE_SPINEL_ORE = createCopy(COAL_ORE);
		DIORITE_TANZANITE_ORE = createCopy(COAL_ORE);

		GRANITE_AQUAMARINE_ORE = createCopy(COAL_ORE);
		GRANITE_BLACK_OPAL_ORE = createCopy(COAL_ORE);
		GRANITE_CHALCEDONY_ORE = createCopy(COAL_ORE);
		GRANITE_CLINOHUMITE_ORE = createCopy(COAL_ORE);
		GRANITE_COAL_ORE = createCopy(COAL_ORE);
		GRANITE_COPPER_ORE = createCopy(COAL_ORE);
		GRANITE_DIAMOND_ORE = createCopy(COAL_ORE);
		GRANITE_EMERALD_ORE = createCopy(COAL_ORE);
		GRANITE_GOLD_ORE = createCopy(COAL_ORE);
		GRANITE_IRON_ORE = createCopy(COAL_ORE);
		GRANITE_LAPIS_ORE = createCopy(COAL_ORE);
		GRANITE_MORGANITE_ORE = createCopy(COAL_ORE);
		GRANITE_REDSTONE_ORE = createCopy(COAL_ORE);
		GRANITE_RUBY_ORE = createCopy(COAL_ORE);
		GRANITE_SILVER_ORE = createCopy(COAL_ORE);
		GRANITE_SPHENE_ORE = createCopy(COAL_ORE);
		GRANITE_SPINEL_ORE = createCopy(COAL_ORE);
		GRANITE_TANZANITE_ORE = createCopy(COAL_ORE);

		LIMESTONE_AQUAMARINE_ORE = createCopy(COAL_ORE);
		LIMESTONE_BLACK_OPAL_ORE = createCopy(COAL_ORE);
		LIMESTONE_CHALCEDONY_ORE = createCopy(COAL_ORE);
		LIMESTONE_CLINOHUMITE_ORE = createCopy(COAL_ORE);
		LIMESTONE_COAL_ORE = createCopy(COAL_ORE);
		LIMESTONE_COPPER_ORE = createCopy(COAL_ORE);
		LIMESTONE_DIAMOND_ORE = createCopy(COAL_ORE);
		LIMESTONE_EMERALD_ORE = createCopy(COAL_ORE);
		LIMESTONE_GOLD_ORE = createCopy(COAL_ORE);
		LIMESTONE_IRON_ORE = createCopy(COAL_ORE);
		LIMESTONE_LAPIS_ORE = createCopy(COAL_ORE);
		LIMESTONE_MORGANITE_ORE = createCopy(COAL_ORE);
		LIMESTONE_REDSTONE_ORE = createCopy(COAL_ORE);
		LIMESTONE_RUBY_ORE = createCopy(COAL_ORE);
		LIMESTONE_SILVER_ORE = createCopy(COAL_ORE);
		LIMESTONE_SPHENE_ORE = createCopy(COAL_ORE);
		LIMESTONE_SPINEL_ORE = createCopy(COAL_ORE);
		LIMESTONE_TANZANITE_ORE = createCopy(COAL_ORE);

		PINKINE_AQUAMARINE_ORE = createCopy(COAL_ORE);
		PINKINE_BLACK_OPAL_ORE = createCopy(COAL_ORE);
		PINKINE_CHALCEDONY_ORE = createCopy(COAL_ORE);
		PINKINE_CLINOHUMITE_ORE = createCopy(COAL_ORE);
		PINKINE_COAL_ORE = createCopy(COAL_ORE);
		PINKINE_COPPER_ORE = createCopy(COAL_ORE);
		PINKINE_DIAMOND_ORE = createCopy(COAL_ORE);
		PINKINE_EMERALD_ORE = createCopy(COAL_ORE);
		PINKINE_GOLD_ORE = createCopy(COAL_ORE);
		PINKINE_IRON_ORE = createCopy(COAL_ORE);
		PINKINE_LAPIS_ORE = createCopy(COAL_ORE);
		PINKINE_MORGANITE_ORE = createCopy(COAL_ORE);
		PINKINE_REDSTONE_ORE = createCopy(COAL_ORE);
		PINKINE_RUBY_ORE = createCopy(COAL_ORE);
		PINKINE_SILVER_ORE = createCopy(COAL_ORE);
		PINKINE_SPHENE_ORE = createCopy(COAL_ORE);
		PINKINE_SPINEL_ORE = createCopy(COAL_ORE);
		PINKINE_TANZANITE_ORE = createCopy(COAL_ORE);

		LIGHT_OPALITE = createCopy(QUARTZ_BLOCK);
		LUSHINE = createCopy(STONE);
		LUSHINE_PILLAR = createPillar(QUARTZ_PILLAR);
		LUSTRITE = createCopy(STONE);
		MARINE_SNOW = createCopy(SOUL_SAND);
		MOSOIL = createBlock(MosoilBlock::new, GRASS_BLOCK);
		OPALITE = createCopy(QUARTZ_BLOCK);
		POININE = createPillar(BASALT);
		RHODONITE = createCopy(QUARTZ_BLOCK);
		SPRILIUM = createBlock(SpriliumBlock::new, Settings.copy(STONE).ticksRandomly());
		SKYSOIL = createCopy(DIRT);
		SKYSTONE = createCopy(STONE);
		STORCEAN_MARINE_SNOW = createCopy(SOUL_SAND);
		STORCENDITE = createCopy(STONE);
		STORCERACK = createCopy(STONE);
		VERDINE = createCopy(STONE);

		ABYSSOPELAGIC_WATER = createWaterFluid(DTFluids.ABYSSOPELAGIC_WATER, 0.22F);
		ACID = createFluid(DTFluids.ACID, Settings.copy(WATER));
		BATHYPELAGIC_WATER = createWaterFluid(DTFluids.BATHYPELAGIC_WATER, 1.25F);
		BRINE = createFluid(DTFluids.BRINE, Settings.copy(WATER));
		CLEAR_WATER = createWaterFluid(DTFluids.CLEAR_WATER, 1.25F);
		HADOPELAGIC_WATER = createWaterFluid(DTFluids.HADOPELAGIC_WATER, 0.16F);
		MESOPELAGIC_WATER = createWaterFluid(DTFluids.MESOPELAGIC_WATER, 0.5F);
		STORCEAN_ABYSSOPELAGIC_WATER = createWaterFluid(DTFluids.STORCEAN_ABYSSOPELAGIC_WATER, 0.12F);
		STORCEAN_BATHYPELAGIC_WATER = createWaterFluid(DTFluids.STORCEAN_BATHYPELAGIC_WATER, 0.16F);
		STORCEAN_ENDERPELAGIC_WATER = createWaterFluid(DTFluids.STORCEAN_ENDERPELAGIC_WATER, 1.25F);
		STORCEAN_GASOPELAGIC_WATER = createWaterFluid(DTFluids.STORCEAN_GASOPELAGIC_WATER, 1.35F);
		STORCEAN_HADOPELAGIC_WATER = createWaterFluid(DTFluids.STORCEAN_HADOPELAGIC_WATER, 0.1F);
		STORCEAN_INFINIPELAGIC_WATER = createWaterFluid(DTFluids.STORCEAN_INFINIPELAGIC_WATER, 0.05F);
		STORCEAN_MESOPELAGIC_WATER = createWaterFluid(DTFluids.STORCEAN_MESOPELAGIC_WATER, 0.2F);
		STORCEAN_VIRDIPELAGIC_WATER = createWaterFluid(DTFluids.STORCEAN_VIRDIPELAGIC_WATER, 1.25F);
		STORCEAN_WATER = createWaterFluid(DTFluids.ABYSSOPELAGIC_WATER, 0.5F);
	}

}
