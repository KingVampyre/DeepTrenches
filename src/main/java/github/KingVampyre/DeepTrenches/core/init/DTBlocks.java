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
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.function.Function;
import java.util.function.Supplier;

import static github.KingVampyre.DeepTrenches.core.init.DTStatusEffects.*;
import static net.minecraft.block.Blocks.*;
import static net.minecraft.block.PressurePlateBlock.ActivationRule.EVERYTHING;
import static net.minecraft.entity.effect.StatusEffects.*;
import static net.minecraft.util.registry.Registry.BLOCK;

public class DTBlocks {

	/* BIOLUMINESCENT BLOCKS */
	public static final Block BLACK_BIOLUMINESCENT_BLOCK;
	public static final Block BLUE_BIOLUMINESCENT_BLOCK;
	public static final Block BROWN_BIOLUMINESCENT_BLOCK;
	public static final Block CYAN_BIOLUMINESCENT_BLOCK;
	public static final Block GRAY_BIOLUMINESCENT_BLOCK;
	public static final Block GREEN_BIOLUMINESCENT_BLOCK;
	public static final Block GYLDELION_BIOLUMINESCENT_BLOCK;
	public static final Block LIGHT_BLUE_BIOLUMINESCENT_BLOCK;
	public static final Block LIGHT_GRAY_BIOLUMINESCENT_BLOCK;
	public static final Block LIME_BIOLUMINESCENT_BLOCK;
	public static final Block MAGENTA_BIOLUMINESCENT_BLOCK;
	public static final Block ORANGE_BIOLUMINESCENT_BLOCK;
	public static final Block PINK_BIOLUMINESCENT_BLOCK;
	public static final Block PURPLE_BIOLUMINESCENT_BLOCK;
	public static final Block RED_BIOLUMINESCENT_BLOCK;
	public static final Block WHITE_BIOLUMINESCENT_BLOCK;
	public static final Block YELLOW_BIOLUMINESCENT_BLOCK;

	/* REDSTONE */
	public static final Block KRALCTIUM_MICROFLARE;
	public static final Block LIGHTNING_DISPENSER;
	public static final Block STATIC_LIGHTNING_ROD;

	/* EXPLOSIVE BLOCKS */
	public static final Block NUCLEAR_BOMB;
	public static final Block NUCLEAR_WASTE;
	public static final Block SNS;
	public static final Block SUS;

	/* ICE BLOCKS */
	public static final Block STORCEAN_SNOW;
	public static final Block CRYOGENIC_ICE;
	public static final Block BLACK_ICE;
	public static final Block GREEN_ICE;
	public static final Block MARINE_SNOW;
	public static final Block STORCEAN_MARINE_SNOW;

	/* BLOCK ENTITIES */
	public static final Block STASP_NEST;

	/* OTHER STONES */
	public static final Block BLACK_MARBLE;
	public static final Block GRAY_MARBLE;
	public static final Block MARBLE;
	public static final Block LIGHT_OPALITE;
	public static final Block LUSHINE;
	public static final Block LUSHINE_PILLAR;
	public static final Block LUSTERED_WAVEITE;
	public static final Block LUSTRITE;
	public static final Block POININE;
	public static final Block RINGWOODITE;
	public static final Block SKYSTONE;
	public static final Block SULFUR;
	public static final Block VERDINE;
	public static final Block WAVED_BEDROCK;

	/* STONES */
	public static final Block BLACK_BASALT;
	public static final Block BLACK_BASALT_BRICKS;
	public static final Block BLACK_BASALT_PILLAR;
	public static final Block BLACK_BASALT_TILES;
	public static final Block CHISELED_BLACK_BASALT;
	public static final Block CRACKED_BLACK_BASALT_BRICKS;
	public static final Block CRACKED_BLACK_BASALT_TILES;

	public static final Block BEDROCK_BRICKS;
	public static final Block BEDROCK_PILLAR;
	public static final Block CHISELED_BEDROCK;

	public static final Block BLUE_STORCERACK;
	public static final Block CHISELED_BLUE_STORCERACK;
	public static final Block CRACKED_BLUE_STORCERACK_BRICKS;
	public static final Block CRACKED_BLUE_STORCERACK_TILES;
	public static final Block POLISHED_BLUE_STORCERACK;

	public static final Block HADAL_STONE;
	public static final Block HADAL_STONE_BRICKS;
	public static final Block HADAL_STONE_PILLAR;
	public static final Block HADAL_STONE_TILES;
	public static final Block CHISELED_HADAL_STONE;
	public static final Block CRACKED_HADAL_STONE_BRICKS;
	public static final Block CRACKED_HADAL_STONE_TILES;
	public static final Block POLISHED_HADAL_STONE;

	public static final Block FLINT_SHARDS;
	public static final Block FLINT_STONE;
	public static final Block POLISHED_FLINT_STONE;

	public static final Block GARNET_BRICKS;
	public static final Block GARNET_PILLAR;
	public static final Block CHISELED_GARNET_BLOCK;
	public static final Block TOTEM_CHISELED_GARNET;

	public static final Block INFINITAL_STONE;
	public static final Block INFINITAL_STONE_BRICKS;
	public static final Block INFINITAL_STONE_PILLAR;
	public static final Block INFINITAL_STONE_TILES;
	public static final Block CHISELED_INFINITAL_STONE;
	public static final Block CRACKED_INFINITAL_STONE_BRICKS;
	public static final Block CRACKED_INFINITAL_STONE_TILES;
	public static final Block POLISHED_INFINITAL_STONE;

	public static final Block PINKINE;
	public static final Block PINKINE_BRICKS;
	public static final Block PINKINE_PILLAR;
	public static final Block PINKINE_TILES;
	public static final Block CHISELED_PINKINE;
	public static final Block CRACKED_PINKINE_BRICKS;
	public static final Block CRACKED_PINKINE_TILES;
	public static final Block POLISHED_PINKINE;

	public static final Block LIMESTONE;
	public static final Block LIMESTONE_BRICKS;
	public static final Block LIMESTONE_PILLAR;
	public static final Block LIMESTONE_TILES;
	public static final Block CHISELED_LIMESTON;
	public static final Block CRACKED_LIMESTONE_BRICKS;
	public static final Block CRACKED_LIMESTONE_TILES;
	public static final Block POLISHED_LIMESTONE;

	public static final Block RHODONITE;
	public static final Block RHODONITE_BRICKS;
	public static final Block RHODONITE_PILLAR;
	public static final Block CHISELED_RHODONITE_BLOCK;
	public static final Block CHISELED_RHODONITE_BRICKS;
	public static final Block EMBED_RHODONITE;
	public static final Block POLISHED_RHODONITE;

	public static final Block STORCENDITE;
	public static final Block STORCENDITE_BRICKS;
	public static final Block STORCENDITE_PILLAR;
	public static final Block STORCENDITE_TILES;
	public static final Block CHISELED_STORCENDITE;
	public static final Block CRACKED_STORCENDITE_BRICKS;
	public static final Block CRACKED_STORCENDITE_TILES;
	public static final Block POLISHED_STORCENDITE;

	public static final Block STORCERACK;
	public static final Block STORCERACK_BRICKS;
	public static final Block STORCERACK_PILLAR;
	public static final Block STORCERACK_TILES;
	public static final Block CHISELED_STORCERACK;
	public static final Block CRACKED_STORCERACK_BRICKS;
	public static final Block CRACKED_STORCERACK_TILES;
	public static final Block POLISHED_STORCERACK;

	public static final Block SULFUR_STONE;
	public static final Block SULFUR_STONE_BRICKS;
	public static final Block CHISELED_SULFUR_STONE_BRICKS;
	public static final Block POLISHED_SULFUR_STONE;

	public static final Block VIRDAL_STONE;
	public static final Block VIRDAL_STONE_BRICKS;
	public static final Block VIRDAL_STONE_PILLAR;
	public static final Block VIRDAL_STONE_TILES;
	public static final Block CHISELED_VIRDAL_STONE;
	public static final Block CRACKED_VIRDAL_STONE_BRICKS;
	public static final Block CRACKED_VIRDAL_STONE_TILES;
	public static final Block POLISHED_VIRDAL_STONE;

	public static final Block WAVEITE;
	public static final Block WAVEITE_BRICKS;
	public static final Block WAVEITE_PILLAR;
	public static final Block WAVEITE_TILES;
	public static final Block CHISELED_WAVEITE;
	public static final Block CRACKED_WAVEITE_BRICKS;
	public static final Block CRACKED_WAVEITE_TILES;
	public static final Block POLISHED_WAVEITE;

	/* ORES */
	public static final Block ANDESITE_AQUAMARINE_ORE;
	public static final Block ANDESITE_BLACK_OPAL_ORE;
	public static final Block ANDESITE_CHALCEDONY_ORE;
	public static final Block ANDESITE_CLINOHUMITE_ORE;
	public static final Block ANDESITE_COAL_ORE;
	public static final Block ANDESITE_COPPER_ORE;
	public static final Block ANDESITE_DIAMOND_ORE;
	public static final Block ANDESITE_EMERALD_ORE;
	public static final Block ANDESITE_GARNET_ORE;
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
	public static final Block ANDESITE_TOPAZ_ORE;

	public static final Block BASALT_CLINOHUMITE_ORE;
	public static final Block BASALT_COAL_ORE;

	public static final Block BEDROCK_DIAMOND_ORE;
	public static final Block BEDROCK_DIOPSIDE_ORE;
	public static final Block BEDROCK_MORGANITE_ORE;
	public static final Block BEDROCK_VOID_CRITTERED_DIOPSIDE_ORE;

	public static final Block BLACK_BASALT_CHALCEDONY_ORE;
	public static final Block BLACK_BASALT_CLINOHUMITE_ORE;
	public static final Block BLACK_BASALT_COAL_ORE;
	public static final Block BLACK_BASALT_DIAMOND_ORE;
	public static final Block BLACK_BASALT_GOLD_ORE;
	public static final Block BLACK_BASALT_IRON_ORE;

	public static final Block BLUE_STORCERACK_BLACK_OPAL_ORE;
	public static final Block BLUE_STORCERACK_COAL_ORE;
	public static final Block BLUE_STORCERACK_COPPER_ORE;
	public static final Block BLUE_STORCERACK_DIAMOND_ORE;
	public static final Block BLUE_STORCERACK_GOLD_ORE;
	public static final Block BLUE_STORCERACK_IRON_ORE;
	public static final Block BLUE_STORCERACK_REDSTONE_ORE;
	public static final Block BLUE_STORCERACK_RUBY_ORE;
	public static final Block BLUE_STORCERACK_SPHENE_ORE;
	public static final Block BLUE_STORCERACK_SPINEL_ORE;
	public static final Block BLUE_STORCERACK_STROXITE_ORE;
	public static final Block BLUE_STORCERACK_CHARGED_TUNGSTEN_ORE;

	public static final Block CALCITE_CHALCEDONY_ORE;
	public static final Block CALCITE_CLINOHUMITE_ORE;
	public static final Block CALCITE_COAL_ORE;
	public static final Block CALCITE_DIAMOND_ORE;
	public static final Block CALCITE_GOLD_ORE;

	public static final Block DEEPSLATE_AQUAMARINE_ORE;
	public static final Block DEEPSLATE_BLACK_OPAL_ORE;
	public static final Block DEEPSLATE_CHALCEDONY_ORE;
	public static final Block DEEPSLATE_CLINOHUMITE_ORE;
	public static final Block DEEPSLATE_GARNET_ORE;
	public static final Block DEEPSLATE_MORGANITE_ORE;
	public static final Block DEEPSLATE_OPAL_ORE;
	public static final Block DEEPSLATE_RUBY_ORE;
	public static final Block DEEPSLATE_SAPPHIRE_ORE;
	public static final Block DEEPSLATE_SILVER_ORE;
	public static final Block DEEPSLATE_SPHENE_ORE;
	public static final Block DEEPSLATE_SPINEL_ORE;
	public static final Block DEEPSLATE_SUGILITE_ORE;
	public static final Block DEEPSLATE_TANZANITE_ORE;
	public static final Block DEEPSLATE_TOPAZ_ORE;

	public static final Block DIORITE_AQUAMARINE_ORE;
	public static final Block DIORITE_BLACK_OPAL_ORE;
	public static final Block DIORITE_CHALCEDONY_ORE;
	public static final Block DIORITE_CLINOHUMITE_ORE;
	public static final Block DIORITE_COAL_ORE;
	public static final Block DIORITE_COPPER_ORE;
	public static final Block DIORITE_DIAMOND_ORE;
	public static final Block DIORITE_EMERALD_ORE;
	public static final Block DIORITE_GARNET_ORE;
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
	public static final Block DIORITE_TOPAZ_ORE;

	public static final Block END_STONE_DIOPSIDE_ORE;
	public static final Block END_STONE_SPINEL_ORE;
	public static final Block END_STONE_VOID_CRITTERED_DIOPSIDE_ORE;

	public static final Block FLINT_STONE_SILICON_ORE;
	public static final Block FLINT_STONE_URANOLUMEN_ORE;

	public static final Block GRAY_MARBLE_DIAMOND_ORE;

	public static final Block GRANITE_AQUAMARINE_ORE;
	public static final Block GRANITE_BLACK_OPAL_ORE;
	public static final Block GRANITE_CHALCEDONY_ORE;
	public static final Block GRANITE_CLINOHUMITE_ORE;
	public static final Block GRANITE_COAL_ORE;
	public static final Block GRANITE_COPPER_ORE;
	public static final Block GRANITE_DIAMOND_ORE;
	public static final Block GRANITE_EMERALD_ORE;
	public static final Block GRANITE_GARNET_ORE;
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
	public static final Block GRANITE_TOPAZ_ORE;

	public static final Block HADAL_STONE_AQUAMARINE_ORE;
	public static final Block HADAL_STONE_BLACK_OPAL_ORE;
	public static final Block HADAL_STONE_CLINOHUMITE_ORE;
	public static final Block HADAL_STONE_COAL_ORE;
	public static final Block HADAL_STONE_COPPER_ORE;
	public static final Block HADAL_STONE_DIAMOND_ORE;
	public static final Block HADAL_STONE_EMERALD_ORE;
	public static final Block HADAL_STONE_GARNET_ORE;
	public static final Block HADAL_STONE_GOLD_ORE;
	public static final Block HADAL_STONE_IRON_ORE;
	public static final Block HADAL_STONE_LAPIS_ORE;
	public static final Block HADAL_STONE_MORGANITE_ORE;
	public static final Block HADAL_STONE_REDSTONE_ORE;
	public static final Block HADAL_STONE_RUBY_ORE;
	public static final Block HADAL_STONE_SAPPHIRE_ORE;
	public static final Block HADAL_STONE_SILVER_ORE;
	public static final Block HADAL_STONE_SPHENE_ORE;
	public static final Block HADAL_STONE_SPINEL_ORE;
	public static final Block HADAL_STONE_SUGILITE_ORE;
	public static final Block HADAL_STONE_TANZANITE_ORE;
	public static final Block HADAL_STONE_TOPAZ_ORE;

	public static final Block INFINITAL_STONE_AQUAMARINE_ORE;
	public static final Block INFINITAL_STONE_BLACK_OPAL_ORE;
	public static final Block INFINITAL_STONE_COAL_ORE;
	public static final Block INFINITAL_STONE_COPPER_ORE;
	public static final Block INFINITAL_STONE_DIAMOND_ORE;
	public static final Block INFINITAL_STONE_ENSTATITE_ORE;
	public static final Block INFINITAL_STONE_OPAL_ORE;
	public static final Block INFINITAL_STONE_IRON_ORE;
	public static final Block INFINITAL_STONE_RUBY_ORE;
	public static final Block INFINITAL_STONE_SAPPHIRE_ORE;
	public static final Block INFINITAL_STONE_SPHENE_ORE;
	public static final Block INFINITAL_STONE_SPINEL_ORE;
	public static final Block INFINITAL_STONE_SUGILITE_ORE;
	public static final Block INFINITAL_STONE_URANOLUMEN_ORE;
	public static final Block INFINITAL_STONE_SILICON_ORE;

	public static final Block LIMESTONE_AQUAMARINE_ORE;
	public static final Block LIMESTONE_BLACK_OPAL_ORE;
	public static final Block LIMESTONE_COAL_ORE;
	public static final Block LIMESTONE_COPPER_ORE;
	public static final Block LIMESTONE_DIAMOND_ORE;
	public static final Block LIMESTONE_OPAL_ORE;
	public static final Block LIMESTONE_IRON_ORE;
	public static final Block LIMESTONE_SAPPHIRE_ORE;
	public static final Block LIMESTONE_SPHENE_ORE;
	public static final Block LIMESTONE_SPINEL_ORE;
	public static final Block LIMESTONE_SUGILITE_ORE;

	public static final Block LUSTERED_WAVEITE_SAPPHIRE_ORE;
	public static final Block LUSTERED_WAVEITE_TANZANITE_ORE;

	public static final Block MARBLE_DIAMOND_ORE;

	public static final Block NETHERRACK_BORON_ORE;
	public static final Block NETHERRACK_CLINOHUMITE_ORE;

	public static final Block PINKINE_AQUAMARINE_ORE;
	public static final Block PINKINE_BLACK_OPAL_ORE;
	public static final Block PINKINE_COAL_ORE;
	public static final Block PINKINE_COPPER_ORE;
	public static final Block PINKINE_DIAMOND_ORE;
	public static final Block PINKINE_DIOPSIDE_ORE;
	public static final Block PINKINE_ENSTATITE_ORE;
	public static final Block PINKINE_OPAL_ORE;
	public static final Block PINKINE_IRON_ORE;
	public static final Block PINKINE_RUBY_ORE;
	public static final Block PINKINE_SAPPHIRE_ORE;
	public static final Block PINKINE_SILICON_ORE;
	public static final Block PINKINE_SPHENE_ORE;
	public static final Block PINKINE_SPINEL_ORE;
	public static final Block PINKINE_SUGILITE_ORE;
	public static final Block PINKINE_URANIUM_ORE;
	public static final Block PINKINE_URANOLUMEN_ORE;
	public static final Block PINKINE_VOID_CRITTERED_DIOPSIDE_ORE;

	public static final Block RHODONITE_GARNET_ORE;
	public static final Block RINGWOODITE_SAPPHIRE_ORE;
	public static final Block SKYSTONE_OPAL_ORE;

	public static final Block SMOOTH_BASALT_CHALCEDONY_ORE;
	public static final Block SMOOTH_BASALT_CLINOHUMITE_ORE;
	public static final Block SMOOTH_BASALT_DIAMOND_ORE;
	public static final Block SMOOTH_BASALT_GOLD_ORE;

	public static final Block STORCEAN_SAPPHIRE_ORE;
	public static final Block STORCEAN_SILICON_ORE;
	public static final Block STORCEAN_TUNGSTEN_ORE;

	public static final Block STORCENDITE_AQUAMARINE_ORE;
	public static final Block STORCENDITE_BLACK_OPAL_ORE;
	public static final Block STORCENDITE_COAL_ORE;
	public static final Block STORCENDITE_COPPER_ORE;
	public static final Block STORCENDITE_DIAMOND_ORE;
	public static final Block STORCENDITE_ENSTATITE_ORE;
	public static final Block STORCENDITE_IRON_ORE;
	public static final Block STORCENDITE_OPAL_ORE;
	public static final Block STORCENDITE_RUBY_ORE;
	public static final Block STORCENDITE_SAPPHIRE_ORE;
	public static final Block STORCENDITE_SILICON_ORE;
	public static final Block STORCENDITE_SPHENE_ORE;
	public static final Block STORCENDITE_SPINEL_ORE;
	public static final Block STORCENDITE_SUGILITE_ORE;
	public static final Block STORCENDITE_URANIUM_ORE;
	public static final Block STORCENDITE_URANOLUMEN_ORE;

	public static final Block STORCERACK_AQUAMARINE_ORE;
	public static final Block STORCERACK_BLACK_OPAL_ORE;
	public static final Block STORCERACK_COAL_ORE;
	public static final Block STORCERACK_COPPER_ORE;
	public static final Block STORCERACK_DIAMOND_ORE;
	public static final Block STORCERACK_GOLD_ORE;
	public static final Block STORCERACK_IRON_ORE;
	public static final Block STORCERACK_OPAL_ORE;
	public static final Block STORCERACK_REDSTONE_ORE;
	public static final Block STORCERACK_RUBY_ORE;
	public static final Block STORCERACK_SAPPHIRE_ORE;
	public static final Block STORCERACK_SILICON_ORE;
	public static final Block STORCERACK_SPHENE_ORE;
	public static final Block STORCERACK_SPINEL_ORE;
	public static final Block STORCERACK_SUGILITE_ORE;
	public static final Block STORCERACK_TUNGSTEN_ORE;
	public static final Block STORCERACK_URANOLUMEN_ORE;

	public static final Block SULFUR_STONE_CHALCEDONY_ORE;
	public static final Block SULFUR_STONE_CLINOHUMITE_ORE;
	public static final Block SULFUR_STONE_COAL_ORE;

	public static final Block TUFF_CHALCEDONY_ORE;
	public static final Block TUFF_CLINOHUMITE_ORE;
	public static final Block TUFF_COAL_ORE;
	public static final Block TUFF_DIAMOND_ORE;
	public static final Block TUFF_GOLD_ORE;

	public static final Block VERDINE_COAL_ORE;

	public static final Block VIRDAL_STONE_AQUAMARINE_ORE;
	public static final Block VIRDAL_STONE_BLACK_OPAL_ORE;
	public static final Block VIRDAL_STONE_COAL_ORE;
	public static final Block VIRDAL_STONE_COPPER_ORE;
	public static final Block VIRDAL_STONE_DIAMOND_ORE;
	public static final Block VIRDAL_STONE_IRON_ORE;
	public static final Block VIRDAL_STONE_OPAL_ORE;
	public static final Block VIRDAL_STONE_RUBY_ORE;
	public static final Block VIRDAL_STONE_SAPPHIRE_ORE;
	public static final Block VIRDAL_STONE_SILICON_ORE;
	public static final Block VIRDAL_STONE_SPHENE_ORE;
	public static final Block VIRDAL_STONE_SPINEL_ORE;
	public static final Block VIRDAL_STONE_SUGILITE_ORE;
	public static final Block VIRDAL_STONE_URANOLUMEN_ORE;

	public static final Block WAVED_BEDROCK_DIAMOND_ORE;
	public static final Block WAVED_BEDROCK_DIOPSIDE_ORE;
	public static final Block WAVED_BEDROCK_MORGANITE_ORE;
	public static final Block WAVED_BEDROCK_TANZANITE_ORE;

	public static final Block WAVEITE_CLINOHUMITE_ORE;
	public static final Block WAVEITE_COAL_ORE;
	public static final Block WAVEITE_COPPER_ORE;
	public static final Block WAVEITE_DIAMOND_ORE;
	public static final Block WAVEITE_EMERALD_ORE;
	public static final Block WAVEITE_IRON_ORE;
	public static final Block WAVEITE_GARNET_ORE;
	public static final Block WAVEITE_GOLD_ORE;
	public static final Block WAVEITE_LAPIS_ORE;
	public static final Block WAVEITE_MORGANITE_ORE;
	public static final Block WAVEITE_REDSTONE_ORE;
	public static final Block WAVEITE_RUBY_ORE;
	public static final Block WAVEITE_SAPPHIRE_ORE;
	public static final Block WAVEITE_SILICON_ORE;
	public static final Block WAVEITE_SILVER_ORE;
	public static final Block WAVEITE_SPHENE_ORE;
	public static final Block WAVEITE_SPINEL_ORE;
	public static final Block WAVEITE_SUGILITE_ORE;
	public static final Block WAVEITE_TANZANITE_ORE;
	public static final Block WAVEITE_TOPAZ_ORE;

	public static final Block ACTINIUM_ORE;
	public static final Block AQUAMARINE_ORE;
	public static final Block BLACK_OPAL_ORE;
	public static final Block CLINOHUMITE_ORE;
	public static final Block ENSTATITE_ORE;
	public static final Block MORGANITE_ORE;
	public static final Block OPAL_ORE;
	public static final Block RUBY_ORE;
	public static final Block SAPPHIRE_ORE;
	public static final Block SUGILITE_ORE;
	public static final Block SPHENE_ORE;
	public static final Block SPINEL_ORE;
	public static final Block TANZANITE_ORE;
	public static final Block TOPAZ_ORE;

	/* RAW BLOCKS */
	public static final Block RAW_ACTINIUM_BLOCK;
	public static final Block RAW_BORON_BLOCK;
	public static final Block RAW_ENRON_BLOCK;
	public static final Block KRALIUM_DEBRIS;
	public static final Block RAW_SILICON_BLOCK;
	public static final Block RAW_SILVER_BLOCK;
	public static final Block RAW_STROXITE_BLOCK;
	public static final Block CHARGED_RAW_TUNGSTEN_BLOCK;
	public static final Block RAW_TUNGSTEN_BLOCK;
	public static final Block RAW_URANOLUMEN_BLOCK;

	/* MINERAL BLOCKS */
	public static final Block ACTINIUM_BLOCK;
	public static final Block AQUAMARINE_BLOCK;
    public static final Block BLACK_OPAL_BLOCK;
    public static final Block BLACK_PEARL_BLOCK;
	public static final Block BORON_BLOCK;
	public static final Block CUT_BORON_BLOCK;
	public static final Block CHALCEDONY_BLOCK;
	public static final Block CUT_CLINOHUMITE_BLOCK;
	public static final Block DIOPSIDE_BLOCK;
	public static final Block ENRON_BLOCK;
	public static final Block ENSTATITE_BLOCK;
	public static final Block CUT_GARNET_BLOCK;
	public static final Block GYLDELION_BLOCK;
	public static final Block KRALCTIUM_BLOCK;
	public static final Block KRALIUM_BLOCK;
	public static final Block CUT_KRALIUM_BLOCK;
	public static final Block LEKRALITE_BLOCK;
	public static final Block MORGANITE_BLOCK;
    public static final Block OPAL_BLOCK;
    public static final Block RUBY_BLOCK;
	public static final Block SAPPHIRE_BLOCK;
	public static final Block SILICON_BLOCK;
	public static final Block SILVER_BLOCK;
	public static final Block SPHENE_BLOCK;
	public static final Block SPINEL_BLOCK;
	public static final Block STROXITE_BLOCK;
	public static final Block CUT_STROXITE_BLOCK;
	public static final Block TANZANITE_BLOCK;
	public static final Block TOPAZ_BLOCK;
	public static final Block CHARGED_TUNGSTEN_BLOCK;
	public static final Block TUNGSTEN_BLOCK;
	public static final Block URANIUM_BLOCK;
	public static final Block URANIUM_POWDER_BLOCK;
	public static final Block URANOLUMEN_BLOCK;
	public static final Block VOID_CRITTERED_DIOPSIDE_BLOCK;

	/* CHISELED MINERAL BLOCKS */
	public static final Block CHISELED_SILICON_BLOCK;
	public static final Block CHISELED_SILVER_BLOCK;
	public static final Block CHISELED_SUGILITE_BLOCK;

	/* AMETHYST */
	public static final Block BLACK_OPALITE_BLOCK;
	public static final Block BUDDING_BLACK_OPALITE;
	public static final Block BLACK_OPAL_CLUSTER;
	public static final Block LARGE_BLACK_OPAL_BUD;
	public static final Block MEDIUM_BLACK_OPAL_BUD;
	public static final Block SMALL_BLACK_OPAL_BUD;

	public static final Block CLINOHUMITE_BLOCK;
	public static final Block BUDDING_CLINOHUMITE;
	public static final Block CLINOHUMITE_CLUSTER;
	public static final Block LARGE_CLINOHUMITE_BUD;
	public static final Block MEDIUM_CLINOHUMITE_BUD;
	public static final Block SMALL_CLINOHUMITE_BUD;

	public static final Block DIAMITE_BLOCK;
	public static final Block BUDDING_DIAMITE;
	public static final Block DIAMOND_CLUSTER;
	public static final Block LARGE_DIAMOND_BUD;
	public static final Block MEDIUM_DIAMOND_BUD;
	public static final Block SMALL_DIAMOND_BUD;

	public static final Block GARNET_BLOCK;
	public static final Block BUDDING_GARNET;
	public static final Block GARNET_CLUSTER;
	public static final Block LARGE_GARNET_BUD;
	public static final Block MEDIUM_GARNET_BUD;
	public static final Block SMALL_GARNET_BUD;

	public static final Block OPALITE_BLOCK;
	public static final Block BUDDING_OPALITE;
	public static final Block OPAL_CLUSTER;
	public static final Block LARGE_OPAL_BUD;
	public static final Block MEDIUM_OPAL_BUD;
	public static final Block SMALL_OPAL_BUD;

    public static final Block SAPPHRITE_BLOCK;
    public static final Block BUDDING_SAPPHRITE;
    public static final Block SAPPHIRE_CLUSTER;
    public static final Block LARGE_SAPPHIRE_BUD;
    public static final Block MEDIUM_SAPPHIRE_BUD;
    public static final Block SMALL_SAPPHIRE_BUD;

	public static final Block SUGILITE_BLOCK;
	public static final Block BUDDING_SUGILITE;
	public static final Block SUGILITE_CLUSTER;
	public static final Block LARGE_SUGILITE_BUD;
	public static final Block MEDIUM_SUGILITE_BUD;
	public static final Block SMALL_SUGILITE_BUD;

	/* POINTED STONES */
	public static final Block POINTED_LIGHT_OPALITE;
	public static final Block POINTED_SKYSTONE;
	public static final Block TWISTED_BLUE_STORCERACK;

	/* SURFACE BLOCKS */
	public static final Block DRITEAN;
	public static final Block ENROTIUM;
	public static final Block SPRILIUM;
	public static final Block SKYSOIL;
	public static final Block MOSOIL;

	/* FLOWERS */
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
	public static final Block LIMEFORK;
	public static final Block MARSH_VIOLET;
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
	public static final Block SPIDREET;
	public static final Block SPIKE_LAVENDER;
	public static final Block SPRIDELION;
	public static final Block SPROOM_SPIKE;
	public static final Block SQUISACLE;
	public static final Block SWEET_VIOLET;
	public static final Block TOPPED_LAVENDER;
	public static final Block TWISTTRAP;
	public static final Block VASLAME;
	public static final Block WEEPISTIL;
	public static final Block WEEPY_HOLLOWER;
	public static final Block WHEEPING_AZURE_BLOOM;
	public static final Block WHITE_VIOLET;
	public static final Block WILD_PANSY;
	public static final Block YELLOW_VIOLET;

	/* TALL FLOWERS */
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
	public static final Block TALL_BUCKTHORN;
	public static final Block VELVET_LILY;

	/* MOSSES */
	public static final Block AIRIAL_MOSS;
	public static final Block ILMIUM;
	public static final Block MOSS;

	/* PLANTS */
	public static final Block AIRIAL_BUSH;
	public static final Block BUCKTHORN;
	public static final Block BULK_GRASSES;
	public static final Block CRUSTED_FUNGUS;
	public static final Block FOUR_LEAFED_CLOVER;
	public static final Block FRAREL;
	public static final Block FUR_PLATEAU;
	public static final Block HARSHLES;
	public static final Block ILYINE;
	public static final Block JUNGLE_UMBRELLA;
	public static final Block LICHEN;
	public static final Block MOSSES;
	public static final Block MURKSTEM;
	public static final Block POMEGRANATE_BUSH;
	public static final Block REEBLOON;
	public static final Block SEA_BUCKTHORN;
	public static final Block SKALK;
	public static final Block SQUISH_TIPS;
	public static final Block THREE_LEAFED_CLOVER;

	/* MUSHROOMS */
	public static final Block GRAY_SHAG_MUSHROOM;
	public static final Block INKY_CAP_MUSHROOM;
	public static final Block PUFFBALL_MUSHROOM;
	public static final Block SHELF_MUSHROOM;
	public static final Block WHITE_MUSHROOM;

	public static final Block GRAY_SHAG_MUSHROOM_BLOCK;
	public static final Block INKY_CAP_MUSHROOM_BLOCK;
	public static final Block PUFFBALL_MUSHROOM_BLOCK;
	public static final Block SHELF_MUSHROOM_BLOCK;
	public static final Block WHITE_MUSHROOM_BLOCK;

	public static final Block GRAY_SHAG_MUSHROOM_STEM;
	public static final Block INKY_CAP_MUSHROOM_STEM;
	public static final Block PUFFBALL_MUSHROOM_STEM;
	public static final Block SHELF_MUSHROOM_STEM;
	public static final Block WHITE_MUSHROOM_STEM;

	/* GIANT VIOLET */
	public static final Block GIANT_VIOLET;
	public static final Block GIANT_VIOLET_LEAF;
	public static final Block GIANT_VIOLET_PETAL;
	public static final Block GIANT_VIOLET_PISTIL;

	/* FLUIDS */
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

	/* CORALS */
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

	public static final Block DEAD_LEKRAL_CORAL;
	public static final Block DEAD_LEKRAL_CORAL_BLOCK;
	public static final Block DEAD_LEKRAL_CORAL_FAN;
	public static final Block DEAD_LEKRAL_CORAL_WALL_FAN;

	public static final Block LEKRAL_CORAL;
	public static final Block LEKRAL_CLUSTER;
	public static final Block LEKRAL_ORE;
	public static final Block BUDDING_LEKRAL;
	public static final Block LEKRAL_CORAL_BLOCK;
	public static final Block LEKRAL_CORAL_FAN;
	public static final Block LEKRAL_CORAL_WALL_FAN;

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

	public static final Block DEAD_SKACUR_CORAL;
	public static final Block DEAD_SKACUR_CORAL_BLOCK;
	public static final Block DEAD_SKACUR_CORAL_FAN;
	public static final Block DEAD_SKACUR_CORAL_WALL_FAN;

	public static final Block SKACUR_CORAL;
	public static final Block SKACUR_CORAL_BLOCK;
	public static final Block SKACUR_CORAL_FAN;
	public static final Block SKACUR_CORAL_WALL_FAN;

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

	/* WOOD */
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
	public static final Block CHOTORN;
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
	public static final Block MURKANTUAN_FLOWER;
	public static final Block MURKANTUAN_LEAVES;
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
	public static final Block POTTED_LIMEFORK;
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
	public static final Block POTTED_TWISTTRAP;
	public static final Block POTTED_VASLAME;
	public static final Block POTTED_WEEPISTIL;
	public static final Block POTTED_WEEPY_HOLLOWER;
	public static final Block POTTED_WHEEPING_AZURE_BLOOM;
	public static final Block POTTED_WHITE_VIOLET;
	public static final Block POTTED_WILD_PANSY;
	public static final Block POTTED_YELLOW_VIOLET;

	public static final Block POTTED_GRAY_SHAG_MUSHROOM;
	public static final Block POTTED_INKY_CAP_MUSHROOM;
	public static final Block POTTED_PUFFBALL_MUSHROOM;
	public static final Block POTTED_SHELF_MUSHROOM;
	public static final Block POTTED_WHITE_MUSHROOM;

	protected static Block createAcuaticFungus(SaplingGenerator saplingGenerator) {
		return new AcuaticFungusBlock(saplingGenerator, Settings.of(Material.LEAVES).suffocates((state, world, pos) -> false).blockVision((state, world, pos) -> false).strength(0, 0).ticksRandomly().sounds(BlockSoundGroup.GRASS).nonOpaque());
	}

	protected static Block createAmethystBlock() {
		return createBlock(AmethystBlock::new, Settings.of(Material.AMETHYST, MapColor.PURPLE).strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool());
	}

	protected static Block createBuddingAmethyst(Function<Settings, Block> function) {
		return createBlock(function, Settings.of(Material.AMETHYST, MapColor.PURPLE).strength(1.5F).ticksRandomly().sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool());
	}

	protected static Block createClusterAmethyst(int height, int xzOffset, int luminance) {
		return new AmethystClusterBlock(height, xzOffset, Settings.copy(AMETHYST_CLUSTER).sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance(state -> luminance));
	}

	protected static Block createClusterAmethyst() {
		return createClusterAmethyst(7, 3, 5);
	}

	protected static Block createLargeAmethystBud() {
		return createClusterAmethyst(5, 3, 4);
	}

	protected static Block createMediumAmethystBud() {
		return createClusterAmethyst(4, 3, 2);
	}

	protected static Block createSmallAmethystBud() {
		return createClusterAmethyst(3, 4, 1);
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
		return new CapBlock(Settings.of(Material.LEAVES).suffocates((state, world, pos) -> false).blockVision((state, world, pos) -> false).strength(0.2F, 0.2F).ticksRandomly().sounds(BlockSoundGroup.GRASS).nonOpaque());
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

	protected static Block createMushroomPlant(Supplier<ConfiguredFeature<?, ?>> supplier) {
		return new MushroomPlantBlock(Settings.copy(BROWN_MUSHROOM), supplier);
	}

	protected static Block createMushroomBlock() {
		return new MushroomBlock(Settings.copy(BROWN_MUSHROOM_BLOCK));
	}

	protected static Block createMushroomStem() {
		return new MushroomBlock(Settings.copy(MUSHROOM_STEM));
	}

	protected static Block createOre(Settings settings, int min, int max) {
		return new OreBlock(settings, UniformIntProvider.create(min, max));
	}

	protected static Block createOre(float strength, int min, int max) {
		return createOre(strength, strength, min, max);
	}

	protected static Block createOre(float hardness, float resistance, int min, int max) {
		return createOre(Settings.copy(IRON_ORE).strength(hardness, resistance), min, max);
	}

	protected static Block createOre() {
		return createOre(3.0F, 3.0F, 0, 0);
	}

	protected static Block createDeepslateOre() {
		return createOre(Settings.copy(DEEPSLATE_IRON_ORE).strength(4.5F, 3.0F), 3, 7);
	}

	protected static Block createBasaltOre(int min, int max) {
		return createOre(Settings.copy(BASALT).strength(3.0F, 3.0F), min, max);
	}

	protected static Block createRedstoneOre() {
		return createBlock(RedstoneOreBlock::new, Settings.copy(REDSTONE_ORE).strength(3.0F, 3.0F));
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
		/* BIOLUMINESCENT BLOCKS */
		BLACK_BIOLUMINESCENT_BLOCK = createBioluminescentBlock();
		BLUE_BIOLUMINESCENT_BLOCK = createBioluminescentBlock();
		BROWN_BIOLUMINESCENT_BLOCK = createBioluminescentBlock();
		CYAN_BIOLUMINESCENT_BLOCK = createBioluminescentBlock();
		GRAY_BIOLUMINESCENT_BLOCK = createBioluminescentBlock();
		GREEN_BIOLUMINESCENT_BLOCK = createBioluminescentBlock();
		GYLDELION_BIOLUMINESCENT_BLOCK = createBioluminescentBlock();
		LIGHT_BLUE_BIOLUMINESCENT_BLOCK = createBioluminescentBlock();
		LIGHT_GRAY_BIOLUMINESCENT_BLOCK = createBioluminescentBlock();
		LIME_BIOLUMINESCENT_BLOCK = createBioluminescentBlock();
		MAGENTA_BIOLUMINESCENT_BLOCK = createBioluminescentBlock();
		ORANGE_BIOLUMINESCENT_BLOCK = createBioluminescentBlock();
		PINK_BIOLUMINESCENT_BLOCK = createBioluminescentBlock();
		PURPLE_BIOLUMINESCENT_BLOCK = createBioluminescentBlock();
		RED_BIOLUMINESCENT_BLOCK = createBioluminescentBlock();
		WHITE_BIOLUMINESCENT_BLOCK = createBioluminescentBlock();
		YELLOW_BIOLUMINESCENT_BLOCK = createBioluminescentBlock();

		/* REDSTONE */
		KRALCTIUM_MICROFLARE = createCopy(STONE);
		LIGHTNING_DISPENSER = createCopy(STONE);
		STATIC_LIGHTNING_ROD = createBlock(LightningRodBlock::new, LIGHTNING_ROD);

		/* EXPLOSIVE BLOCKS */
		NUCLEAR_BOMB = createCopy(STONE);
		NUCLEAR_WASTE = createCopy(STONE);
		SNS = createCopy(STONE);
		SUS = createCopy(STONE);

		/* ICE BLOCKS */
		STORCEAN_SNOW = createCopy(SNOW_BLOCK);
		CRYOGENIC_ICE = createCopy(ICE);
		BLACK_ICE = createCopy(ICE);
		GREEN_ICE = createCopy(ICE);
		MARINE_SNOW = createCopy(SNOW_BLOCK);
		STORCEAN_MARINE_SNOW = createCopy(SNOW_BLOCK);

		/* BLOCK ENTITIES */
		STASP_NEST = createBlock(StaspNestBlock::new, OAK_WOOD);

		/* OTHER STONES */
		BLACK_MARBLE = createCopy(STONE);
		GRAY_MARBLE = createCopy(STONE);
		MARBLE = createCopy(STONE);
		LIGHT_OPALITE = createCopy(STONE);
		LUSHINE = createCopy(STONE);
		LUSHINE_PILLAR = createCopy(STONE);
		LUSTERED_WAVEITE = createCopy(STONE);
		LUSTRITE = createCopy(STONE);
		POININE = createCopy(STONE);
		RINGWOODITE = createCopy(STONE);
		SKYSTONE = createCopy(STONE);
		SULFUR = createCopy(STONE);
		VERDINE = createCopy(STONE);
		WAVED_BEDROCK = createCopy(STONE);

		/* STONES */
		BLACK_BASALT = createCopy(STONE);
		BLACK_BASALT_BRICKS = createCopy(STONE);
		BLACK_BASALT_PILLAR = createPillar(STONE);
		BLACK_BASALT_TILES = createCopy(STONE);
		CHISELED_BLACK_BASALT = createCopy(STONE);
		CRACKED_BLACK_BASALT_BRICKS = createCopy(STONE);
		CRACKED_BLACK_BASALT_TILES = createCopy(STONE);

		BEDROCK_BRICKS = createCopy(STONE);
		BEDROCK_PILLAR = createPillar(STONE);
		CHISELED_BEDROCK = createCopy(STONE);

		BLUE_STORCERACK = createCopy(STONE);
		CHISELED_BLUE_STORCERACK = createCopy(STONE);
		CRACKED_BLUE_STORCERACK_BRICKS = createCopy(STONE);
		CRACKED_BLUE_STORCERACK_TILES = createCopy(STONE);
		POLISHED_BLUE_STORCERACK = createCopy(STONE);

		HADAL_STONE = createCopy(STONE);
		HADAL_STONE_BRICKS = createCopy(STONE);
		HADAL_STONE_PILLAR = createPillar(STONE);
		HADAL_STONE_TILES = createCopy(STONE);
		CHISELED_HADAL_STONE = createCopy(STONE);
		CRACKED_HADAL_STONE_BRICKS = createCopy(STONE);
		CRACKED_HADAL_STONE_TILES = createCopy(STONE);
		POLISHED_HADAL_STONE = createCopy(STONE);

		FLINT_SHARDS = createCopy(STONE);
		FLINT_STONE = createCopy(STONE);
		POLISHED_FLINT_STONE = createCopy(STONE);

		GARNET_BRICKS = createCopy(STONE);
		GARNET_PILLAR = createPillar(STONE);
		CHISELED_GARNET_BLOCK = createCopy(STONE);
		TOTEM_CHISELED_GARNET = createCopy(STONE);

		INFINITAL_STONE = createCopy(STONE);
		INFINITAL_STONE_BRICKS = createCopy(STONE);
		INFINITAL_STONE_PILLAR = createPillar(STONE);
		INFINITAL_STONE_TILES = createCopy(STONE);
		CHISELED_INFINITAL_STONE = createCopy(STONE);
		CRACKED_INFINITAL_STONE_BRICKS = createCopy(STONE);
		CRACKED_INFINITAL_STONE_TILES = createCopy(STONE);
		POLISHED_INFINITAL_STONE = createCopy(STONE);

		PINKINE = createCopy(STONE);
		PINKINE_BRICKS = createCopy(STONE);
		PINKINE_PILLAR = createPillar(STONE);
		PINKINE_TILES = createCopy(STONE);
		CHISELED_PINKINE = createCopy(STONE);
		CRACKED_PINKINE_BRICKS = createCopy(STONE);
		CRACKED_PINKINE_TILES = createCopy(STONE);
		POLISHED_PINKINE = createCopy(STONE);

		LIMESTONE = createCopy(STONE);
		LIMESTONE_BRICKS = createCopy(STONE);
		LIMESTONE_PILLAR = createPillar(STONE);
		LIMESTONE_TILES = createCopy(STONE);
		CHISELED_LIMESTON = createCopy(STONE);
		CRACKED_LIMESTONE_BRICKS = createCopy(STONE);
		CRACKED_LIMESTONE_TILES = createCopy(STONE);
		POLISHED_LIMESTONE = createCopy(STONE);

		RHODONITE = createCopy(STONE);
		RHODONITE_BRICKS = createCopy(STONE);
		RHODONITE_PILLAR = createPillar(STONE);
		CHISELED_RHODONITE_BLOCK = createCopy(STONE);
		CHISELED_RHODONITE_BRICKS = createCopy(STONE);
		EMBED_RHODONITE = createCopy(STONE);
		POLISHED_RHODONITE = createCopy(STONE);

		STORCENDITE = createCopy(STONE);
		STORCENDITE_BRICKS = createCopy(STONE);
		STORCENDITE_PILLAR = createPillar(STONE);
		STORCENDITE_TILES = createCopy(STONE);
		CHISELED_STORCENDITE = createCopy(STONE);
		CRACKED_STORCENDITE_BRICKS = createCopy(STONE);
		CRACKED_STORCENDITE_TILES = createCopy(STONE);
		POLISHED_STORCENDITE = createCopy(STONE);

		STORCERACK = createCopy(STONE);
		STORCERACK_BRICKS = createCopy(STONE);
		STORCERACK_PILLAR = createPillar(STONE);
		STORCERACK_TILES = createCopy(STONE);
		CHISELED_STORCERACK = createCopy(STONE);
		CRACKED_STORCERACK_BRICKS = createCopy(STONE);
		CRACKED_STORCERACK_TILES = createCopy(STONE);
		POLISHED_STORCERACK = createCopy(STONE);

		SULFUR_STONE = createCopy(STONE);
		SULFUR_STONE_BRICKS = createCopy(STONE);
		CHISELED_SULFUR_STONE_BRICKS = createCopy(STONE);
		POLISHED_SULFUR_STONE = createCopy(STONE);

		VIRDAL_STONE = createCopy(STONE);
		VIRDAL_STONE_BRICKS = createCopy(STONE);
		VIRDAL_STONE_PILLAR = createPillar(STONE);
		VIRDAL_STONE_TILES = createCopy(STONE);
		CHISELED_VIRDAL_STONE = createCopy(STONE);
		CRACKED_VIRDAL_STONE_BRICKS = createCopy(STONE);
		CRACKED_VIRDAL_STONE_TILES = createCopy(STONE);
		POLISHED_VIRDAL_STONE = createCopy(STONE);

		WAVEITE = createCopy(STONE);
		WAVEITE_BRICKS = createCopy(STONE);
		WAVEITE_PILLAR = createPillar(STONE);
		WAVEITE_TILES = createCopy(STONE);
		CHISELED_WAVEITE = createCopy(STONE);
		CRACKED_WAVEITE_BRICKS = createCopy(STONE);
		CRACKED_WAVEITE_TILES = createCopy(STONE);
		POLISHED_WAVEITE = createCopy(STONE);

		/* ORES */
		ANDESITE_AQUAMARINE_ORE = createOre(3.0F, 3, 7);
		ANDESITE_BLACK_OPAL_ORE = createOre(3.0F, 3, 7);
		ANDESITE_CHALCEDONY_ORE = createOre(3.0F, 3, 7);
		ANDESITE_CLINOHUMITE_ORE = createOre(3.0F, 3, 7);
		ANDESITE_COAL_ORE = createOre(3.0F, 0, 2);
		ANDESITE_COPPER_ORE = createOre();
		ANDESITE_DIAMOND_ORE = createOre(3.0F, 3, 7);
		ANDESITE_EMERALD_ORE = createOre(3.0F, 3, 7);
		ANDESITE_GARNET_ORE = createOre(3.0F, 3, 7);
		ANDESITE_GOLD_ORE = createOre();
		ANDESITE_IRON_ORE = createOre();
		ANDESITE_LAPIS_ORE = createOre(3.0F, 2, 5);
		ANDESITE_MORGANITE_ORE = createOre(3.0F, 3, 7);
		ANDESITE_REDSTONE_ORE = createRedstoneOre();
		ANDESITE_RUBY_ORE = createOre(3.0F, 3, 7);
		ANDESITE_SILVER_ORE = createOre(3.0F, 3, 7);
		ANDESITE_SPHENE_ORE = createOre(3.0F, 3, 7);
		ANDESITE_SPINEL_ORE = createOre(3.0F, 3, 7);
		ANDESITE_TANZANITE_ORE = createOre(3.0F, 3, 7);
		ANDESITE_TOPAZ_ORE = createOre(3.0F, 3, 7);

		BASALT_CLINOHUMITE_ORE = createBasaltOre(3, 7);
		BASALT_COAL_ORE = createBasaltOre(0, 2);

		BEDROCK_DIAMOND_ORE = createOre(3.0F, 3, 7);
		BEDROCK_DIOPSIDE_ORE = createOre(3.0F, 3, 7);
		BEDROCK_MORGANITE_ORE = createOre(3.0F, 3, 7);
		BEDROCK_VOID_CRITTERED_DIOPSIDE_ORE = createOre(3.0F, 3, 7);

		BLACK_BASALT_CHALCEDONY_ORE = createOre(3.0F, 3, 7);
		BLACK_BASALT_CLINOHUMITE_ORE = createOre(3.0F, 3, 7);
		BLACK_BASALT_COAL_ORE = createOre(3.0F, 0, 2);
		BLACK_BASALT_DIAMOND_ORE = createOre(3.0F, 3, 7);
		BLACK_BASALT_GOLD_ORE = createOre();
		BLACK_BASALT_IRON_ORE = createOre();

		BLUE_STORCERACK_BLACK_OPAL_ORE = createOre(3.0F, 3, 7);
		BLUE_STORCERACK_COAL_ORE = createOre(3.0F, 0, 2);
		BLUE_STORCERACK_COPPER_ORE = createOre();
		BLUE_STORCERACK_DIAMOND_ORE = createOre(3.0F, 3, 7);
		BLUE_STORCERACK_GOLD_ORE = createOre();
		BLUE_STORCERACK_IRON_ORE = createOre();
		BLUE_STORCERACK_REDSTONE_ORE = createRedstoneOre();
		BLUE_STORCERACK_RUBY_ORE = createOre(3.0F, 3, 7);
		BLUE_STORCERACK_SPHENE_ORE = createOre(3.0F, 3, 7);
		BLUE_STORCERACK_SPINEL_ORE = createOre(3.0F, 3, 7);
		BLUE_STORCERACK_STROXITE_ORE = createOre();
		BLUE_STORCERACK_CHARGED_TUNGSTEN_ORE = createOre();

		CALCITE_CHALCEDONY_ORE = createOre(3.0F, 3, 7);
		CALCITE_CLINOHUMITE_ORE = createOre(3.0F, 3, 7);
		CALCITE_COAL_ORE = createOre(3.0F, 0, 2);
		CALCITE_DIAMOND_ORE = createOre(3.0F, 3, 7);
		CALCITE_GOLD_ORE = createOre();

		DEEPSLATE_AQUAMARINE_ORE = createDeepslateOre();
		DEEPSLATE_BLACK_OPAL_ORE = createDeepslateOre();
		DEEPSLATE_CHALCEDONY_ORE = createDeepslateOre();
		DEEPSLATE_CLINOHUMITE_ORE = createDeepslateOre();
		DEEPSLATE_GARNET_ORE = createDeepslateOre();
		DEEPSLATE_MORGANITE_ORE = createDeepslateOre();
		DEEPSLATE_OPAL_ORE = createDeepslateOre();
		DEEPSLATE_RUBY_ORE = createDeepslateOre();
		DEEPSLATE_SAPPHIRE_ORE = createDeepslateOre();
		DEEPSLATE_SILVER_ORE = createDeepslateOre();
		DEEPSLATE_SPHENE_ORE = createDeepslateOre();
		DEEPSLATE_SPINEL_ORE = createDeepslateOre();
		DEEPSLATE_SUGILITE_ORE = createDeepslateOre();
		DEEPSLATE_TANZANITE_ORE = createDeepslateOre();
		DEEPSLATE_TOPAZ_ORE = createDeepslateOre();

		DIORITE_AQUAMARINE_ORE = createOre(3.0F, 3, 7);
		DIORITE_BLACK_OPAL_ORE = createOre(3.0F, 3, 7);
		DIORITE_CHALCEDONY_ORE = createOre(3.0F, 3, 7);
		DIORITE_CLINOHUMITE_ORE = createOre(3.0F, 3, 7);
		DIORITE_COAL_ORE = createOre(3.0F, 0, 2);
		DIORITE_COPPER_ORE = createOre();
		DIORITE_DIAMOND_ORE = createOre(3.0F, 3, 7);
		DIORITE_EMERALD_ORE = createOre(3.0F, 3, 7);
		DIORITE_GARNET_ORE = createOre(3.0F, 3, 7);
		DIORITE_GOLD_ORE = createOre();
		DIORITE_IRON_ORE = createOre();
		DIORITE_LAPIS_ORE = createOre(3.0F, 2, 5);
		DIORITE_MORGANITE_ORE = createOre(3.0F, 3, 7);
		DIORITE_REDSTONE_ORE = createRedstoneOre();
		DIORITE_RUBY_ORE = createOre(3.0F, 3, 7);
		DIORITE_SILVER_ORE = createOre();
		DIORITE_SPHENE_ORE = createOre(3.0F, 3, 7);
		DIORITE_SPINEL_ORE = createOre(3.0F, 3, 7);
		DIORITE_TANZANITE_ORE = createOre(3.0F, 3, 7);
		DIORITE_TOPAZ_ORE = createOre(3.0F, 3, 7);

		END_STONE_DIOPSIDE_ORE = createOre(3.0F, 3, 7);
		END_STONE_SPINEL_ORE = createOre(3.0F, 3, 7);
		END_STONE_VOID_CRITTERED_DIOPSIDE_ORE = createOre(3.0F, 3, 7);

		FLINT_STONE_SILICON_ORE = createOre();
		FLINT_STONE_URANOLUMEN_ORE = createOre();

		GRAY_MARBLE_DIAMOND_ORE = createOre(3.0F, 3, 7);

		GRANITE_AQUAMARINE_ORE = createOre(3.0F, 3, 7);
		GRANITE_BLACK_OPAL_ORE = createOre(3.0F, 3, 7);
		GRANITE_CHALCEDONY_ORE = createOre(3.0F, 3, 7);
		GRANITE_CLINOHUMITE_ORE = createOre(3.0F, 3, 7);
		GRANITE_COAL_ORE = createOre(3.0F, 0, 2);
		GRANITE_COPPER_ORE = createOre();
		GRANITE_DIAMOND_ORE = createOre(3.0F, 3, 7);
		GRANITE_EMERALD_ORE = createOre(3.0F, 3, 7);
		GRANITE_GARNET_ORE = createOre(3.0F, 3, 7);
		GRANITE_GOLD_ORE = createOre();
		GRANITE_IRON_ORE = createOre();
		GRANITE_LAPIS_ORE = createOre(3.0F, 2, 5);
		GRANITE_MORGANITE_ORE = createOre(3.0F, 3, 7);
		GRANITE_REDSTONE_ORE = createRedstoneOre();
		GRANITE_RUBY_ORE = createOre(3.0F, 3, 7);
		GRANITE_SILVER_ORE = createOre(3.0F, 3, 7);
		GRANITE_SPHENE_ORE = createOre(3.0F, 3, 7);
		GRANITE_SPINEL_ORE = createOre(3.0F, 3, 7);
		GRANITE_TANZANITE_ORE = createOre(3.0F, 3, 7);
		GRANITE_TOPAZ_ORE = createOre(3.0F, 3, 7);

		HADAL_STONE_AQUAMARINE_ORE = createOre(3.0F, 3, 7);
		HADAL_STONE_BLACK_OPAL_ORE = createOre(3.0F, 3, 7);
		HADAL_STONE_CLINOHUMITE_ORE = createOre(3.0F, 3, 7);
		HADAL_STONE_COAL_ORE = createOre(3.0F, 0, 2);
		HADAL_STONE_COPPER_ORE = createOre();
		HADAL_STONE_DIAMOND_ORE = createOre(3.0F, 3, 7);
		HADAL_STONE_EMERALD_ORE = createOre(3.0F, 3, 7);
		HADAL_STONE_GARNET_ORE = createOre(3.0F, 3, 7);
		HADAL_STONE_GOLD_ORE = createOre();
		HADAL_STONE_IRON_ORE = createOre();
		HADAL_STONE_LAPIS_ORE = createOre(3.0F, 2, 5);
		HADAL_STONE_MORGANITE_ORE = createOre(3.0F, 3, 7);
		HADAL_STONE_REDSTONE_ORE = createRedstoneOre();
		HADAL_STONE_RUBY_ORE = createOre(3.0F, 3, 7);
		HADAL_STONE_SAPPHIRE_ORE = createOre(3.0F, 3, 7);
		HADAL_STONE_SILVER_ORE = createOre();
		HADAL_STONE_SPHENE_ORE = createOre(3.0F, 3, 7);
		HADAL_STONE_SPINEL_ORE = createOre(3.0F, 3, 7);
		HADAL_STONE_SUGILITE_ORE = createOre(3.0F, 3, 7);
		HADAL_STONE_TANZANITE_ORE = createOre(3.0F, 3, 7);
		HADAL_STONE_TOPAZ_ORE = createOre(3.0F, 3, 7);

		INFINITAL_STONE_AQUAMARINE_ORE = createOre(3.0F, 3, 7);
		INFINITAL_STONE_BLACK_OPAL_ORE = createOre(3.0F, 3, 7);
		INFINITAL_STONE_COAL_ORE = createOre(3.0F, 0, 2);
		INFINITAL_STONE_COPPER_ORE = createOre();
		INFINITAL_STONE_DIAMOND_ORE = createOre(3.0F, 3, 7);
		INFINITAL_STONE_ENSTATITE_ORE = createOre(3.0F, 3, 7);
		INFINITAL_STONE_OPAL_ORE = createOre(3.0F, 3, 7);
		INFINITAL_STONE_IRON_ORE = createOre();
		INFINITAL_STONE_RUBY_ORE = createOre(3.0F, 3, 7);
		INFINITAL_STONE_SAPPHIRE_ORE = createOre(3.0F, 3, 7);
		INFINITAL_STONE_SPHENE_ORE = createOre(3.0F, 3, 7);
		INFINITAL_STONE_SPINEL_ORE = createOre(3.0F, 3, 7);
		INFINITAL_STONE_SUGILITE_ORE = createOre(3.0F, 3, 7);
		INFINITAL_STONE_URANOLUMEN_ORE = createOre();
		INFINITAL_STONE_SILICON_ORE = createOre();

		LIMESTONE_AQUAMARINE_ORE = createOre(3.0F, 3, 7);
		LIMESTONE_BLACK_OPAL_ORE = createOre(3.0F, 3, 7);
		LIMESTONE_COAL_ORE = createOre(3.0F, 0, 2);
		LIMESTONE_COPPER_ORE = createOre();
		LIMESTONE_DIAMOND_ORE = createOre(3.0F, 3, 7);
		LIMESTONE_OPAL_ORE = createOre(3.0F, 3, 7);
		LIMESTONE_IRON_ORE = createOre();
		LIMESTONE_SAPPHIRE_ORE = createOre(3.0F, 3, 7);
		LIMESTONE_SPHENE_ORE = createOre(3.0F, 3, 7);
		LIMESTONE_SPINEL_ORE = createOre(3.0F, 3, 7);
		LIMESTONE_SUGILITE_ORE = createOre(3.0F, 3, 7);

		LUSTERED_WAVEITE_SAPPHIRE_ORE = createOre(3.0F, 3, 7);
		LUSTERED_WAVEITE_TANZANITE_ORE = createOre(3.0F, 3, 7);

		MARBLE_DIAMOND_ORE = createOre(3.0F, 3, 7);

		NETHERRACK_BORON_ORE = createOre();
		NETHERRACK_CLINOHUMITE_ORE = createOre(3.0F, 3, 7);

		PINKINE_AQUAMARINE_ORE = createOre(3.0F, 3, 7);
		PINKINE_BLACK_OPAL_ORE = createOre(3.0F, 3, 7);
		PINKINE_COAL_ORE = createOre(3.0F, 0, 2);
		PINKINE_COPPER_ORE = createOre();
		PINKINE_DIAMOND_ORE = createOre(3.0F, 3, 7);
		PINKINE_DIOPSIDE_ORE = createOre(3.0F, 3, 7);
		PINKINE_ENSTATITE_ORE = createOre(3.0F, 3, 7);
		PINKINE_OPAL_ORE = createOre(3.0F, 3, 7);
		PINKINE_IRON_ORE = createOre();
		PINKINE_RUBY_ORE = createOre(3.0F, 3, 7);
		PINKINE_SAPPHIRE_ORE = createOre(3.0F, 3, 7);
		PINKINE_SILICON_ORE = createOre();
		PINKINE_SPHENE_ORE = createOre(3.0F, 3, 7);
		PINKINE_SPINEL_ORE = createOre(3.0F, 3, 7);
		PINKINE_SUGILITE_ORE = createOre(3.0F, 3, 7);
		PINKINE_URANIUM_ORE = createOre();
		PINKINE_URANOLUMEN_ORE = createOre();
		PINKINE_VOID_CRITTERED_DIOPSIDE_ORE = createOre(3.0F, 3, 7);

		RHODONITE_GARNET_ORE = createOre(3.0F, 3, 7);
		RINGWOODITE_SAPPHIRE_ORE = createOre(3.0F, 3, 7);
		SKYSTONE_OPAL_ORE = createOre(3.0F, 3, 7);

		SMOOTH_BASALT_CHALCEDONY_ORE = createBasaltOre(3, 7);
		SMOOTH_BASALT_CLINOHUMITE_ORE = createBasaltOre(3, 7);
		SMOOTH_BASALT_DIAMOND_ORE = createBasaltOre(3, 7);
		SMOOTH_BASALT_GOLD_ORE = createBasaltOre(0, 0);

		STORCEAN_SAPPHIRE_ORE = createOre(3.0F, 3, 7);
		STORCEAN_SILICON_ORE = createOre();
		STORCEAN_TUNGSTEN_ORE = createOre();

		STORCENDITE_AQUAMARINE_ORE = createOre(3.0F, 3, 7);
		STORCENDITE_BLACK_OPAL_ORE = createOre(3.0F, 3, 7);
		STORCENDITE_COAL_ORE = createOre(3.0F, 0, 2);
		STORCENDITE_COPPER_ORE = createOre();
		STORCENDITE_DIAMOND_ORE = createOre(3.0F, 3, 7);
		STORCENDITE_ENSTATITE_ORE = createOre(3.0F, 3, 7);
		STORCENDITE_IRON_ORE = createOre();
		STORCENDITE_OPAL_ORE = createOre(3.0F, 3, 7);
		STORCENDITE_RUBY_ORE = createOre(3.0F, 3, 7);
		STORCENDITE_SAPPHIRE_ORE = createOre(3.0F, 3, 7);
		STORCENDITE_SILICON_ORE = createOre();
		STORCENDITE_SPHENE_ORE = createOre(3.0F, 3, 7);
		STORCENDITE_SPINEL_ORE = createOre(3.0F, 3, 7);
		STORCENDITE_SUGILITE_ORE = createOre(3.0F, 3, 7);
		STORCENDITE_URANIUM_ORE = createOre();
		STORCENDITE_URANOLUMEN_ORE = createOre();

		STORCERACK_AQUAMARINE_ORE = createOre(3.0F, 3, 7);
		STORCERACK_BLACK_OPAL_ORE = createOre(3.0F, 3, 7);
		STORCERACK_COAL_ORE = createOre(3.0F, 0, 2);
		STORCERACK_COPPER_ORE = createOre();
		STORCERACK_DIAMOND_ORE = createOre(3.0F, 3, 7);
		STORCERACK_GOLD_ORE = createOre(3.0F, 3, 7);
		STORCERACK_IRON_ORE = createOre();
		STORCERACK_OPAL_ORE = createOre(3.0F, 3, 7);
		STORCERACK_REDSTONE_ORE = createRedstoneOre();
		STORCERACK_RUBY_ORE = createOre(3.0F, 3, 7);
		STORCERACK_SAPPHIRE_ORE = createOre(3.0F, 3, 7);
		STORCERACK_SILICON_ORE = createOre();
		STORCERACK_SPHENE_ORE = createOre(3.0F, 3, 7);
		STORCERACK_SPINEL_ORE = createOre(3.0F, 3, 7);
		STORCERACK_SUGILITE_ORE = createOre(3.0F, 3, 7);
		STORCERACK_TUNGSTEN_ORE = createOre();
		STORCERACK_URANOLUMEN_ORE = createOre();

		SULFUR_STONE_CHALCEDONY_ORE = createOre(3.0F, 3, 7);
		SULFUR_STONE_CLINOHUMITE_ORE = createOre(3.0F, 3, 7);
		SULFUR_STONE_COAL_ORE = createOre(3.0F, 0, 2);

		TUFF_CHALCEDONY_ORE = createOre(3.0F, 3, 7);
		TUFF_CLINOHUMITE_ORE = createOre(3.0F, 3, 7);
		TUFF_COAL_ORE = createOre(3.0F, 0, 2);
		TUFF_DIAMOND_ORE = createOre(3.0F, 3, 7);
		TUFF_GOLD_ORE = createOre();

		VERDINE_COAL_ORE = createOre(3.0F, 0, 2);

		VIRDAL_STONE_AQUAMARINE_ORE = createOre(3.0F, 3, 7);
		VIRDAL_STONE_BLACK_OPAL_ORE = createOre(3.0F, 3, 7);
		VIRDAL_STONE_COAL_ORE = createOre(3.0F, 0, 2);
		VIRDAL_STONE_COPPER_ORE = createOre();
		VIRDAL_STONE_DIAMOND_ORE = createOre(3.0F, 3, 7);
		VIRDAL_STONE_IRON_ORE = createOre();
		VIRDAL_STONE_OPAL_ORE = createOre(3.0F, 3, 7);
		VIRDAL_STONE_RUBY_ORE = createOre(3.0F, 3, 7);
		VIRDAL_STONE_SAPPHIRE_ORE = createOre(3.0F, 3, 7);
		VIRDAL_STONE_SILICON_ORE = createOre();
		VIRDAL_STONE_SPHENE_ORE = createOre(3.0F, 3, 7);
		VIRDAL_STONE_SPINEL_ORE = createOre(3.0F, 3, 7);
		VIRDAL_STONE_SUGILITE_ORE = createOre(3.0F, 3, 7);
		VIRDAL_STONE_URANOLUMEN_ORE = createOre();

		WAVED_BEDROCK_DIAMOND_ORE = createOre(3.0F, 3, 7);
		WAVED_BEDROCK_DIOPSIDE_ORE = createOre(3.0F, 3, 7);
		WAVED_BEDROCK_MORGANITE_ORE = createOre(3.0F, 3, 7);
		WAVED_BEDROCK_TANZANITE_ORE = createOre(3.0F, 3, 7);

		WAVEITE_CLINOHUMITE_ORE = createOre(3.0F, 3, 7);
		WAVEITE_COAL_ORE = createOre(3.0F, 0, 2);
		WAVEITE_COPPER_ORE = createOre();
		WAVEITE_DIAMOND_ORE = createOre(3.0F, 3, 7);
		WAVEITE_EMERALD_ORE = createOre(3.0F, 3, 7);
		WAVEITE_IRON_ORE = createOre();
		WAVEITE_GARNET_ORE = createOre(3.0F, 3, 7);
		WAVEITE_GOLD_ORE = createOre();
		WAVEITE_LAPIS_ORE = createOre(3.0F, 2, 5);
		WAVEITE_MORGANITE_ORE = createOre(3.0F, 3, 7);
		WAVEITE_REDSTONE_ORE = createRedstoneOre();
		WAVEITE_RUBY_ORE = createOre(3.0F, 3, 7);
		WAVEITE_SAPPHIRE_ORE = createOre(3.0F, 3, 7);
		WAVEITE_SILICON_ORE = createOre();
		WAVEITE_SILVER_ORE = createOre();
		WAVEITE_SPHENE_ORE = createOre(3.0F, 3, 7);
		WAVEITE_SPINEL_ORE = createOre(3.0F, 3, 7);
		WAVEITE_SUGILITE_ORE = createOre(3.0F, 3, 7);
		WAVEITE_TANZANITE_ORE = createOre(3.0F, 3, 7);
		WAVEITE_TOPAZ_ORE = createOre(3.0F, 3, 7);

		ACTINIUM_ORE = createOre();
		AQUAMARINE_ORE = createOre(3.0F, 3, 7);
		BLACK_OPAL_ORE = createOre(3.0F, 3, 7);
		CLINOHUMITE_ORE = createOre(3.0F, 3, 7);
		ENSTATITE_ORE = createOre(3.0F, 3, 7);
		MORGANITE_ORE = createOre(3.0F, 3, 7);
		OPAL_ORE = createOre(3.0F, 3, 7);
		RUBY_ORE = createOre(3.0F, 3, 7);
		SAPPHIRE_ORE = createOre(3.0F, 3, 7);
		SUGILITE_ORE = createOre(3.0F, 3, 7);
		SPHENE_ORE = createOre(3.0F, 3, 7);
		SPINEL_ORE = createOre(3.0F, 3, 7);
		TANZANITE_ORE = createOre(3.0F, 3, 7);
		TOPAZ_ORE = createOre(3.0F, 3, 7);

		/* RAW BLOCKS */
		RAW_ACTINIUM_BLOCK = createCopy(RAW_IRON_BLOCK);
		RAW_BORON_BLOCK = createCopy(RAW_IRON_BLOCK);
		RAW_ENRON_BLOCK = createCopy(RAW_IRON_BLOCK);
		KRALIUM_DEBRIS = createCopy(RAW_IRON_BLOCK);
		RAW_SILICON_BLOCK = createCopy(RAW_IRON_BLOCK);
		RAW_SILVER_BLOCK = createCopy(RAW_IRON_BLOCK);
		RAW_STROXITE_BLOCK = createCopy(RAW_IRON_BLOCK);
		CHARGED_RAW_TUNGSTEN_BLOCK = createCopy(RAW_IRON_BLOCK);
		RAW_TUNGSTEN_BLOCK = createCopy(RAW_IRON_BLOCK);
		RAW_URANOLUMEN_BLOCK = createCopy(RAW_IRON_BLOCK);

		/* MINERAL BLOCKS */
		ACTINIUM_BLOCK = createCopy(IRON_BLOCK);
		AQUAMARINE_BLOCK = createCopy(IRON_BLOCK);
        BLACK_OPAL_BLOCK = createCopy(IRON_BLOCK);
		BLACK_PEARL_BLOCK = createCopy(IRON_BLOCK);
		BORON_BLOCK = createCopy(IRON_BLOCK);
		CUT_BORON_BLOCK = createCopy(IRON_BLOCK);
		CHALCEDONY_BLOCK = createCopy(IRON_BLOCK);
		CUT_CLINOHUMITE_BLOCK = createCopy(IRON_BLOCK);
		DIOPSIDE_BLOCK = createCopy(IRON_BLOCK);
		ENRON_BLOCK = createCopy(IRON_BLOCK);
		ENSTATITE_BLOCK = createCopy(IRON_BLOCK);
		CUT_GARNET_BLOCK = createCopy(IRON_BLOCK);
		GYLDELION_BLOCK = createCopy(IRON_BLOCK);
		KRALCTIUM_BLOCK = createCopy(IRON_BLOCK);
		KRALIUM_BLOCK = createCopy(IRON_BLOCK);
		CUT_KRALIUM_BLOCK = createCopy(IRON_BLOCK);
		LEKRALITE_BLOCK = createCopy(IRON_BLOCK);
		MORGANITE_BLOCK = createCopy(IRON_BLOCK);
        OPAL_BLOCK = createCopy(IRON_BLOCK);
		RUBY_BLOCK = createCopy(IRON_BLOCK);
		SAPPHIRE_BLOCK = createCopy(IRON_BLOCK);
		SILICON_BLOCK = createCopy(IRON_BLOCK);
		SILVER_BLOCK = createCopy(IRON_BLOCK);
		SPHENE_BLOCK = createCopy(IRON_BLOCK);
		SPINEL_BLOCK = createCopy(IRON_BLOCK);
		STROXITE_BLOCK = createCopy(IRON_BLOCK);
		CUT_STROXITE_BLOCK = createCopy(IRON_BLOCK);
		TANZANITE_BLOCK = createCopy(IRON_BLOCK);
		TOPAZ_BLOCK = createCopy(IRON_BLOCK);
		CHARGED_TUNGSTEN_BLOCK = createCopy(IRON_BLOCK);
		TUNGSTEN_BLOCK = createCopy(IRON_BLOCK);
		URANIUM_BLOCK = createCopy(IRON_BLOCK);
		URANIUM_POWDER_BLOCK = createCopy(IRON_BLOCK);
		URANOLUMEN_BLOCK = createCopy(IRON_BLOCK);
		VOID_CRITTERED_DIOPSIDE_BLOCK = createCopy(IRON_BLOCK);

		/* CHISELED MINERAL BLOCKS */
		CHISELED_SILICON_BLOCK = createCopy(IRON_BLOCK);
		CHISELED_SILVER_BLOCK = createCopy(IRON_BLOCK);
		CHISELED_SUGILITE_BLOCK = createCopy(IRON_BLOCK);

		BLACK_OPALITE_BLOCK = createAmethystBlock();
		BUDDING_BLACK_OPALITE = createBuddingAmethyst(BuddingBlackOpalBlock::new);
		BLACK_OPAL_CLUSTER = createClusterAmethyst();
		LARGE_BLACK_OPAL_BUD = createLargeAmethystBud();
		MEDIUM_BLACK_OPAL_BUD = createMediumAmethystBud();
		SMALL_BLACK_OPAL_BUD = createSmallAmethystBud();

		CLINOHUMITE_BLOCK = createAmethystBlock();
		BUDDING_CLINOHUMITE = createBuddingAmethyst(BuddingClinohumiteBlock::new);
		CLINOHUMITE_CLUSTER = createClusterAmethyst();
		LARGE_CLINOHUMITE_BUD = createLargeAmethystBud();
		MEDIUM_CLINOHUMITE_BUD = createMediumAmethystBud();
		SMALL_CLINOHUMITE_BUD = createSmallAmethystBud();

		DIAMITE_BLOCK = createAmethystBlock();
		BUDDING_DIAMITE = createBuddingAmethyst(BuddingDiamiteBlock::new);
		DIAMOND_CLUSTER = createClusterAmethyst();
		LARGE_DIAMOND_BUD = createLargeAmethystBud();
		MEDIUM_DIAMOND_BUD = createMediumAmethystBud();
		SMALL_DIAMOND_BUD = createSmallAmethystBud();

		GARNET_BLOCK = createAmethystBlock();
		BUDDING_GARNET = createBuddingAmethyst(BuddingGarnetBlock::new);
		GARNET_CLUSTER = createClusterAmethyst();
		LARGE_GARNET_BUD = createLargeAmethystBud();
		MEDIUM_GARNET_BUD = createMediumAmethystBud();
		SMALL_GARNET_BUD = createSmallAmethystBud();

		OPALITE_BLOCK = createAmethystBlock();
		BUDDING_OPALITE = createBuddingAmethyst(BuddingOpaliteBlock::new);
		OPAL_CLUSTER = createClusterAmethyst();
		LARGE_OPAL_BUD = createLargeAmethystBud();
		MEDIUM_OPAL_BUD = createMediumAmethystBud();
		SMALL_OPAL_BUD = createSmallAmethystBud();

		SAPPHRITE_BLOCK = createAmethystBlock();
		BUDDING_SAPPHRITE = createBuddingAmethyst(BuddingSapphriteBlock::new);
		SAPPHIRE_CLUSTER = createClusterAmethyst();
		LARGE_SAPPHIRE_BUD = createLargeAmethystBud();
		MEDIUM_SAPPHIRE_BUD = createMediumAmethystBud();
		SMALL_SAPPHIRE_BUD = createSmallAmethystBud();

		SUGILITE_BLOCK = createAmethystBlock();
		BUDDING_SUGILITE = createBuddingAmethyst(BuddingSugiliteBlock::new);
		SUGILITE_CLUSTER = createClusterAmethyst();
		LARGE_SUGILITE_BUD = createLargeAmethystBud();
		MEDIUM_SUGILITE_BUD = createMediumAmethystBud();
		SMALL_SUGILITE_BUD = createSmallAmethystBud();

		/* POINTED STONES */
		POINTED_LIGHT_OPALITE = createBlock(PointedDripstoneBlock::new, POINTED_DRIPSTONE);
		POINTED_SKYSTONE = createBlock(PointedDripstoneBlock::new, POINTED_DRIPSTONE);
		TWISTED_BLUE_STORCERACK = new TwistedBlueStorcerack(Settings.copy(POINTED_DRIPSTONE), UniformIntProvider.create(2, 5));

		/* SURFACE BLOCKS */
		DRITEAN = createCopy(DIRT);
		ENROTIUM = createBlock(EnrotiumBlock::new, CRIMSON_NYLIUM);
		SPRILIUM = createBlock(SpriliumBlock::new, Settings.copy(STONE).ticksRandomly());
		SKYSOIL = createCopy(DIRT);
		MOSOIL = createBlock(MosoilBlock::new, GRASS_BLOCK);

		/* FLOWERS */
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
		LIMEFORK = createFlowerBlock(GLOWING, 12);
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
		SPROOM_SPIKE = createBlock(SproomSpikeBlock::new, SUNFLOWER);
		SQUISACLE = createStorceanFlower(LEVITATION, 4);
		SWEET_VIOLET = createFlowerBlock(RESISTANCE, 9);
		TOPPED_LAVENDER = createFlowerBlock(FLOWER_BEAUTY, 6);
		TWISTTRAP = createFlowerBlock(FLOWER_BEAUTY, 6);
		VASLAME = createStorceanFlower(FIRE_RESISTANCE, 6);
		WEEPISTIL = createStorceanFlower(NAUSEA, 4);
		WEEPY_HOLLOWER = createStorceanFlower(GLOWING, 6);
		WHEEPING_AZURE_BLOOM = createStorceanFlower(GLOWING, 6);
		WHITE_VIOLET = createFlowerBlock(RESISTANCE, 9);
		WILD_PANSY = createFlowerBlock(RESISTANCE, 9);
		YELLOW_VIOLET = createFlowerBlock(RESISTANCE, 9);

		/* TALL FLOWERS */
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
		TALL_BUCKTHORN = createTallFlower(SUNFLOWER);
		VELVET_LILY = createTallFlower(SUNFLOWER);

		/* MOSSES */
		AIRIAL_MOSS = createBlock(AirialMossBlock::new, GRASS_BLOCK);
		ILMIUM = createBlock(IlmiumBlock::new, Settings.copy(GRASS_BLOCK).luminance(state -> 6));
		MOSS = createCopy(GRASS_BLOCK);

		/* PLANTS */
		AIRIAL_BUSH = createCopy(SWEET_BERRY_BUSH);
		BUCKTHORN = createCopy(GRASS);
		BULK_GRASSES = createCopy(GRASS);
		CRUSTED_FUNGUS = createCopy(GRASS);
		FOUR_LEAFED_CLOVER = createCopy(GRASS);
		FRAREL = createCopy(GRASS);
		FUR_PLATEAU = createCopy(GRASS);
		HARSHLES = createCopy(GRASS);
		ILYINE = createCopy(GRASS);
		JUNGLE_UMBRELLA = createCopy(GRASS);
		LICHEN = createCopy(GRASS);
		MOSSES = createCopy(GRASS);
		MURKSTEM = createBlock(MurkstemBlock::new, Settings.copy(SUNFLOWER).ticksRandomly());
		POMEGRANATE_BUSH = createCopy(GRASS);
		REEBLOON = createCopy(GRASS);
		SEA_BUCKTHORN = createCopy(GRASS);
		SKALK = createBlock(SkalkBlock::new, Settings.copy(SUNFLOWER).ticksRandomly());
		SQUISH_TIPS = createCopy(GRASS);
		THREE_LEAFED_CLOVER = createCopy(GRASS);

		/* MUSHROOMS */
		GRAY_SHAG_MUSHROOM = createMushroomPlant(() -> DTConfiguredFeatures.GRAY_SHAG_MUSHROOM);
		INKY_CAP_MUSHROOM = createMushroomPlant(() -> DTConfiguredFeatures.INKY_CAP_MUSHROOM);
		PUFFBALL_MUSHROOM = createMushroomPlant(() -> DTConfiguredFeatures.PUFFBALL_MUSHROOM);
		SHELF_MUSHROOM = new ShelfMushroomBlock(Settings.copy(BROWN_MUSHROOM), () -> DTConfiguredFeatures.SHELF_MUSHROOM);
		WHITE_MUSHROOM = createMushroomPlant(() -> DTConfiguredFeatures.WHITE_MUSHROOM);

		GRAY_SHAG_MUSHROOM_BLOCK = createMushroomBlock();
		INKY_CAP_MUSHROOM_BLOCK = createMushroomBlock();
		PUFFBALL_MUSHROOM_BLOCK = createMushroomBlock();
		SHELF_MUSHROOM_BLOCK = createMushroomBlock();
		WHITE_MUSHROOM_BLOCK = createMushroomBlock();

		GRAY_SHAG_MUSHROOM_STEM = createMushroomStem();
		INKY_CAP_MUSHROOM_STEM = createMushroomStem();
		PUFFBALL_MUSHROOM_STEM = createMushroomStem();
		SHELF_MUSHROOM_STEM = createMushroomStem();
		WHITE_MUSHROOM_STEM = createMushroomStem();

		/* GIANT VIOLET */
		GIANT_VIOLET = createCopy(IRON_BLOCK);
		GIANT_VIOLET_LEAF = createCopy(IRON_BLOCK);
		GIANT_VIOLET_PETAL = createCopy(IRON_BLOCK);
		GIANT_VIOLET_PISTIL = createCopy(IRON_BLOCK);

		/* CORALS */
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

		DEAD_LEKRAL_CORAL = createDeadCoral();
		DEAD_LEKRAL_CORAL_BLOCK = createDeadCoralBlock();
		DEAD_LEKRAL_CORAL_FAN = createDeadCoralFan();
		DEAD_LEKRAL_CORAL_WALL_FAN = createDeadCoralWallFan();

		LEKRAL_CORAL = createCoral(DEAD_LEKRAL_CORAL);
		LEKRAL_CLUSTER = createClusterAmethyst();
		LEKRAL_CORAL_BLOCK = createCoralBlock(DEAD_LEKRAL_CORAL_BLOCK);
		LEKRAL_ORE = createOre(2.5F, 3, 7);
		BUDDING_LEKRAL = createBuddingAmethyst(BuddingLekralBlock::new);
		LEKRAL_CORAL_FAN = createCoralFan(DEAD_LEKRAL_CORAL_FAN);
		LEKRAL_CORAL_WALL_FAN = createCoralWallFan(DEAD_LEKRAL_CORAL_WALL_FAN);

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

		DEAD_SKACUR_CORAL = createDeadCoral();
		DEAD_SKACUR_CORAL_BLOCK = createDeadCoralBlock();
		DEAD_SKACUR_CORAL_FAN = createDeadCoralFan();
		DEAD_SKACUR_CORAL_WALL_FAN = createDeadCoralWallFan();

		SKACUR_CORAL = createCoral(DEAD_SKACUR_CORAL);
		SKACUR_CORAL_BLOCK = createCoralBlock(DEAD_SKACUR_CORAL_BLOCK);
		SKACUR_CORAL_FAN = createCoralFan(DEAD_SKACUR_CORAL_FAN);
		SKACUR_CORAL_WALL_FAN = createCoralWallFan(DEAD_SKACUR_CORAL_WALL_FAN);

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

		CHOTORN = createOakSapling(DTSaplingGenerators.CHOTORN);
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
		POTTED_LIMEFORK = createFlowerPot(LIMEFORK);
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
		POTTED_TWISTTRAP = createFlowerPot(TWISTTRAP);
		POTTED_VASLAME = createFlowerPot(VASLAME);
		POTTED_WEEPISTIL = createFlowerPot(WEEPISTIL);
		POTTED_WEEPY_HOLLOWER = createFlowerPot(WEEPY_HOLLOWER);
		POTTED_WHEEPING_AZURE_BLOOM = createFlowerPot(WHEEPING_AZURE_BLOOM);
		POTTED_WHITE_VIOLET = createFlowerPot(WHITE_VIOLET);
		POTTED_WILD_PANSY = createFlowerPot(WILD_PANSY);
		POTTED_YELLOW_VIOLET = createFlowerPot(YELLOW_VIOLET);

		POTTED_GRAY_SHAG_MUSHROOM = createFlowerPot(GRAY_SHAG_MUSHROOM);
		POTTED_INKY_CAP_MUSHROOM = createFlowerPot(INKY_CAP_MUSHROOM);
		POTTED_PUFFBALL_MUSHROOM = createFlowerPot(PUFFBALL_MUSHROOM);
		POTTED_SHELF_MUSHROOM = createFlowerPot(SHELF_MUSHROOM);
		POTTED_WHITE_MUSHROOM = createFlowerPot(WHITE_MUSHROOM);

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

	public static void initialize() {
		/* BIOLUMINESCENT BLOCKS */
		Registry.register(BLOCK, "deep_trenches:black_bioluminescent_block", BLACK_BIOLUMINESCENT_BLOCK);
		Registry.register(BLOCK, "deep_trenches:blue_bioluminescent_block", BLUE_BIOLUMINESCENT_BLOCK);
		Registry.register(BLOCK, "deep_trenches:brown_bioluminescent_block", BROWN_BIOLUMINESCENT_BLOCK);
		Registry.register(BLOCK, "deep_trenches:cyan_bioluminescent_block", CYAN_BIOLUMINESCENT_BLOCK);
		Registry.register(BLOCK, "deep_trenches:gray_bioluminescent_block", GRAY_BIOLUMINESCENT_BLOCK);
		Registry.register(BLOCK, "deep_trenches:green_bioluminescent_block", GREEN_BIOLUMINESCENT_BLOCK);
		Registry.register(BLOCK, "deep_trenches:gyldelion_bioluminescent_block", GYLDELION_BIOLUMINESCENT_BLOCK);
		Registry.register(BLOCK, "deep_trenches:light_blue_bioluminescent_block", LIGHT_BLUE_BIOLUMINESCENT_BLOCK);
		Registry.register(BLOCK, "deep_trenches:light_gray_bioluminescent_block", LIGHT_GRAY_BIOLUMINESCENT_BLOCK);
		Registry.register(BLOCK, "deep_trenches:lime_bioluminescent_block", LIME_BIOLUMINESCENT_BLOCK);
		Registry.register(BLOCK, "deep_trenches:magenta_bioluminescent_block", MAGENTA_BIOLUMINESCENT_BLOCK);
		Registry.register(BLOCK, "deep_trenches:orange_bioluminescent_block", ORANGE_BIOLUMINESCENT_BLOCK);
		Registry.register(BLOCK, "deep_trenches:pink_bioluminescent_block", PINK_BIOLUMINESCENT_BLOCK);
		Registry.register(BLOCK, "deep_trenches:purple_bioluminescent_block", PURPLE_BIOLUMINESCENT_BLOCK);
		Registry.register(BLOCK, "deep_trenches:red_bioluminescent_block", RED_BIOLUMINESCENT_BLOCK);
		Registry.register(BLOCK, "deep_trenches:white_bioluminescent_block", WHITE_BIOLUMINESCENT_BLOCK);
		Registry.register(BLOCK, "deep_trenches:yellow_bioluminescent_block", YELLOW_BIOLUMINESCENT_BLOCK);

		/* REDSTONE */
		Registry.register(BLOCK, "deep_trenches:kralctium_microflare", KRALCTIUM_MICROFLARE);
		Registry.register(BLOCK, "deep_trenches:lightning_dispenser", LIGHTNING_DISPENSER);
		Registry.register(BLOCK, "deep_trenches:static_lightning_rod", STATIC_LIGHTNING_ROD);

		/* EXPLOSIVE BLOCKS */
		Registry.register(BLOCK, "deep_trenches:nuclear_bomb", NUCLEAR_BOMB);
		Registry.register(BLOCK, "deep_trenches:nuclear_waste", NUCLEAR_WASTE);
		Registry.register(BLOCK, "deep_trenches:sns", SNS);
		Registry.register(BLOCK, "deep_trenches:sus", SUS);

		/* ICE BLOCKS */
		Registry.register(BLOCK, "deep_trenches:storcean_snow", STORCEAN_SNOW);
		Registry.register(BLOCK, "deep_trenches:cryogenic_ice", CRYOGENIC_ICE);
		Registry.register(BLOCK, "deep_trenches:black_ice", BLACK_ICE);
		Registry.register(BLOCK, "deep_trenches:green_ice", GREEN_ICE);
		Registry.register(BLOCK, "deep_trenches:marine_snow", MARINE_SNOW);
		Registry.register(BLOCK, "deep_trenches:storcean_marine_snow", STORCEAN_MARINE_SNOW);

		/* BLOCK ENTITIES */
		Registry.register(BLOCK, "deep_trenches:stasp_nest", STASP_NEST);

		/* OTHER STONES */
		Registry.register(BLOCK, "deep_trenches:black_marble", BLACK_MARBLE);
		Registry.register(BLOCK, "deep_trenches:gray_marble", GRAY_MARBLE);
		Registry.register(BLOCK, "deep_trenches:marble", MARBLE);
		Registry.register(BLOCK, "deep_trenches:light_opalite", LIGHT_OPALITE);
		Registry.register(BLOCK, "deep_trenches:lushine", LUSHINE);
		Registry.register(BLOCK, "deep_trenches:lushine_pillar", LUSHINE_PILLAR);
		Registry.register(BLOCK, "deep_trenches:lustered_waveite", LUSTERED_WAVEITE);
		Registry.register(BLOCK, "deep_trenches:lustrite", LUSTRITE);
		Registry.register(BLOCK, "deep_trenches:poinine", POININE);
		Registry.register(BLOCK, "deep_trenches:ringwoodite", RINGWOODITE);
		Registry.register(BLOCK, "deep_trenches:skystone", SKYSTONE);
		Registry.register(BLOCK, "deep_trenches:sulfur", SULFUR);
		Registry.register(BLOCK, "deep_trenches:verdine", VERDINE);
		Registry.register(BLOCK, "deep_trenches:waved_bedrock", WAVED_BEDROCK);

		/* STONES */
		Registry.register(BLOCK, "deep_trenches:black_basalt", BLACK_BASALT);
		Registry.register(BLOCK, "deep_trenches:black_basalt_bricks", BLACK_BASALT_BRICKS);
		Registry.register(BLOCK, "deep_trenches:black_basalt_pillar", BLACK_BASALT_PILLAR);
		Registry.register(BLOCK, "deep_trenches:black_basalt_tiles", BLACK_BASALT_TILES);
		Registry.register(BLOCK, "deep_trenches:chiseled_black_basalt", CHISELED_BLACK_BASALT);
		Registry.register(BLOCK, "deep_trenches:cracked_black_basalt_bricks", CRACKED_BLACK_BASALT_BRICKS);
		Registry.register(BLOCK, "deep_trenches:cracked_black_basalt_tiles", CRACKED_BLACK_BASALT_TILES);
		Registry.register(BLOCK, "deep_trenches:bedrock_bricks", BEDROCK_BRICKS);
		Registry.register(BLOCK, "deep_trenches:bedrock_pillar", BEDROCK_PILLAR);
		Registry.register(BLOCK, "deep_trenches:chiseled_bedrock", CHISELED_BEDROCK);
		Registry.register(BLOCK, "deep_trenches:blue_storcerack", BLUE_STORCERACK);
		Registry.register(BLOCK, "deep_trenches:chiseled_blue_storcerack", CHISELED_BLUE_STORCERACK);
		Registry.register(BLOCK, "deep_trenches:cracked_blue_storcerack_bricks", CRACKED_BLUE_STORCERACK_BRICKS);
		Registry.register(BLOCK, "deep_trenches:cracked_blue_storcerack_tiles", CRACKED_BLUE_STORCERACK_TILES);
		Registry.register(BLOCK, "deep_trenches:polished_blue_storcerack", POLISHED_BLUE_STORCERACK);
		Registry.register(BLOCK, "deep_trenches:hadal_stone", HADAL_STONE);
		Registry.register(BLOCK, "deep_trenches:hadal_stone_bricks", HADAL_STONE_BRICKS);
		Registry.register(BLOCK, "deep_trenches:hadal_stone_pillar", HADAL_STONE_PILLAR);
		Registry.register(BLOCK, "deep_trenches:hadal_stone_tiles", HADAL_STONE_TILES);
		Registry.register(BLOCK, "deep_trenches:chiseled_hadal_stone", CHISELED_HADAL_STONE);
		Registry.register(BLOCK, "deep_trenches:cracked_hadal_stone_bricks", CRACKED_HADAL_STONE_BRICKS);
		Registry.register(BLOCK, "deep_trenches:cracked_hadal_stone_tiles", CRACKED_HADAL_STONE_TILES);
		Registry.register(BLOCK, "deep_trenches:polished_hadal_stone", POLISHED_HADAL_STONE);
		Registry.register(BLOCK, "deep_trenches:flint_shards", FLINT_SHARDS);
		Registry.register(BLOCK, "deep_trenches:flint_stone", FLINT_STONE);
		Registry.register(BLOCK, "deep_trenches:polished_flint_stone", POLISHED_FLINT_STONE);
		Registry.register(BLOCK, "deep_trenches:garnet_bricks", GARNET_BRICKS);
		Registry.register(BLOCK, "deep_trenches:garnet_pillar", GARNET_PILLAR);
		Registry.register(BLOCK, "deep_trenches:chiseled_garnet_block", CHISELED_GARNET_BLOCK);
		Registry.register(BLOCK, "deep_trenches:totem_chiseled_garnet", TOTEM_CHISELED_GARNET);
		Registry.register(BLOCK, "deep_trenches:infinital_stone", INFINITAL_STONE);
		Registry.register(BLOCK, "deep_trenches:infinital_stone_bricks", INFINITAL_STONE_BRICKS);
		Registry.register(BLOCK, "deep_trenches:infinital_stone_pillar", INFINITAL_STONE_PILLAR);
		Registry.register(BLOCK, "deep_trenches:infinital_stone_tiles", INFINITAL_STONE_TILES);
		Registry.register(BLOCK, "deep_trenches:chiseled_infinital_stone", CHISELED_INFINITAL_STONE);
		Registry.register(BLOCK, "deep_trenches:cracked_infinital_stone_bricks", CRACKED_INFINITAL_STONE_BRICKS);
		Registry.register(BLOCK, "deep_trenches:cracked_infinital_stone_tiles", CRACKED_INFINITAL_STONE_TILES);
		Registry.register(BLOCK, "deep_trenches:polished_infinital_stone", POLISHED_INFINITAL_STONE);
		Registry.register(BLOCK, "deep_trenches:pinkine", PINKINE);
		Registry.register(BLOCK, "deep_trenches:pinkine_bricks", PINKINE_BRICKS);
		Registry.register(BLOCK, "deep_trenches:pinkine_pillar", PINKINE_PILLAR);
		Registry.register(BLOCK, "deep_trenches:pinkine_tiles", PINKINE_TILES);
		Registry.register(BLOCK, "deep_trenches:chiseled_pinkine", CHISELED_PINKINE);
		Registry.register(BLOCK, "deep_trenches:cracked_pinkine_bricks", CRACKED_PINKINE_BRICKS);
		Registry.register(BLOCK, "deep_trenches:cracked_pinkine_tiles", CRACKED_PINKINE_TILES);
		Registry.register(BLOCK, "deep_trenches:polished_pinkine", POLISHED_PINKINE);
		Registry.register(BLOCK, "deep_trenches:limestone", LIMESTONE);
		Registry.register(BLOCK, "deep_trenches:limestone_bricks", LIMESTONE_BRICKS);
		Registry.register(BLOCK, "deep_trenches:limestone_pillar", LIMESTONE_PILLAR);
		Registry.register(BLOCK, "deep_trenches:limestone_tiles", LIMESTONE_TILES);
		Registry.register(BLOCK, "deep_trenches:chiseled_limeston", CHISELED_LIMESTON);
		Registry.register(BLOCK, "deep_trenches:cracked_limestone_bricks", CRACKED_LIMESTONE_BRICKS);
		Registry.register(BLOCK, "deep_trenches:cracked_limestone_tiles", CRACKED_LIMESTONE_TILES);
		Registry.register(BLOCK, "deep_trenches:polished_limestone", POLISHED_LIMESTONE);
		Registry.register(BLOCK, "deep_trenches:rhodonite", RHODONITE);
		Registry.register(BLOCK, "deep_trenches:rhodonite_bricks", RHODONITE_BRICKS);
		Registry.register(BLOCK, "deep_trenches:rhodonite_pillar", RHODONITE_PILLAR);
		Registry.register(BLOCK, "deep_trenches:chiseled_rhodonite_block", CHISELED_RHODONITE_BLOCK);
		Registry.register(BLOCK, "deep_trenches:chiseled_rhodonite_bricks", CHISELED_RHODONITE_BRICKS);
		Registry.register(BLOCK, "deep_trenches:embed_rhodonite", EMBED_RHODONITE);
		Registry.register(BLOCK, "deep_trenches:polished_rhodonite", POLISHED_RHODONITE);
		Registry.register(BLOCK, "deep_trenches:storcendite", STORCENDITE);
		Registry.register(BLOCK, "deep_trenches:storcendite_bricks", STORCENDITE_BRICKS);
		Registry.register(BLOCK, "deep_trenches:storcendite_pillar", STORCENDITE_PILLAR);
		Registry.register(BLOCK, "deep_trenches:storcendite_tiles", STORCENDITE_TILES);
		Registry.register(BLOCK, "deep_trenches:chiseled_storcendite", CHISELED_STORCENDITE);
		Registry.register(BLOCK, "deep_trenches:cracked_storcendite_bricks", CRACKED_STORCENDITE_BRICKS);
		Registry.register(BLOCK, "deep_trenches:cracked_storcendite_tiles", CRACKED_STORCENDITE_TILES);
		Registry.register(BLOCK, "deep_trenches:polished_storcendite", POLISHED_STORCENDITE);
		Registry.register(BLOCK, "deep_trenches:storcerack", STORCERACK);
		Registry.register(BLOCK, "deep_trenches:storcerack_bricks", STORCERACK_BRICKS);
		Registry.register(BLOCK, "deep_trenches:storcerack_pillar", STORCERACK_PILLAR);
		Registry.register(BLOCK, "deep_trenches:storcerack_tiles", STORCERACK_TILES);
		Registry.register(BLOCK, "deep_trenches:chiseled_storcerack", CHISELED_STORCERACK);
		Registry.register(BLOCK, "deep_trenches:cracked_storcerack_bricks", CRACKED_STORCERACK_BRICKS);
		Registry.register(BLOCK, "deep_trenches:cracked_storcerack_tiles", CRACKED_STORCERACK_TILES);
		Registry.register(BLOCK, "deep_trenches:polished_storcerack", POLISHED_STORCERACK);
		Registry.register(BLOCK, "deep_trenches:sulfur_stone", SULFUR_STONE);
		Registry.register(BLOCK, "deep_trenches:sulfur_stone_bricks", SULFUR_STONE_BRICKS);
		Registry.register(BLOCK, "deep_trenches:chiseled_sulfur_stone_bricks", CHISELED_SULFUR_STONE_BRICKS);
		Registry.register(BLOCK, "deep_trenches:polished_sulfur_stone", POLISHED_SULFUR_STONE);
		Registry.register(BLOCK, "deep_trenches:virdal_stone", VIRDAL_STONE);
		Registry.register(BLOCK, "deep_trenches:virdal_stone_bricks", VIRDAL_STONE_BRICKS);
		Registry.register(BLOCK, "deep_trenches:virdal_stone_pillar", VIRDAL_STONE_PILLAR);
		Registry.register(BLOCK, "deep_trenches:virdal_stone_tiles", VIRDAL_STONE_TILES);
		Registry.register(BLOCK, "deep_trenches:chiseled_virdal_stone", CHISELED_VIRDAL_STONE);
		Registry.register(BLOCK, "deep_trenches:cracked_virdal_stone_bricks", CRACKED_VIRDAL_STONE_BRICKS);
		Registry.register(BLOCK, "deep_trenches:cracked_virdal_stone_tiles", CRACKED_VIRDAL_STONE_TILES);
		Registry.register(BLOCK, "deep_trenches:polished_virdal_stone", POLISHED_VIRDAL_STONE);
		Registry.register(BLOCK, "deep_trenches:waveite", WAVEITE);
		Registry.register(BLOCK, "deep_trenches:waveite_bricks", WAVEITE_BRICKS);
		Registry.register(BLOCK, "deep_trenches:waveite_pillar", WAVEITE_PILLAR);
		Registry.register(BLOCK, "deep_trenches:waveite_tiles", WAVEITE_TILES);
		Registry.register(BLOCK, "deep_trenches:chiseled_waveite", CHISELED_WAVEITE);
		Registry.register(BLOCK, "deep_trenches:cracked_waveite_bricks", CRACKED_WAVEITE_BRICKS);
		Registry.register(BLOCK, "deep_trenches:cracked_waveite_tiles", CRACKED_WAVEITE_TILES);
		Registry.register(BLOCK, "deep_trenches:polished_waveite", POLISHED_WAVEITE);

		/* ORES */
		Registry.register(BLOCK, "deep_trenches:andesite_aquamarine_ore", ANDESITE_AQUAMARINE_ORE);
		Registry.register(BLOCK, "deep_trenches:andesite_black_opal_ore", ANDESITE_BLACK_OPAL_ORE);
		Registry.register(BLOCK, "deep_trenches:andesite_chalcedony_ore", ANDESITE_CHALCEDONY_ORE);
		Registry.register(BLOCK, "deep_trenches:andesite_clinohumite_ore", ANDESITE_CLINOHUMITE_ORE);
		Registry.register(BLOCK, "deep_trenches:andesite_coal_ore", ANDESITE_COAL_ORE);
		Registry.register(BLOCK, "deep_trenches:andesite_copper_ore", ANDESITE_COPPER_ORE);
		Registry.register(BLOCK, "deep_trenches:andesite_diamond_ore", ANDESITE_DIAMOND_ORE);
		Registry.register(BLOCK, "deep_trenches:andesite_emerald_ore", ANDESITE_EMERALD_ORE);
		Registry.register(BLOCK, "deep_trenches:andesite_garnet_ore", ANDESITE_GARNET_ORE);
		Registry.register(BLOCK, "deep_trenches:andesite_gold_ore", ANDESITE_GOLD_ORE);
		Registry.register(BLOCK, "deep_trenches:andesite_iron_ore", ANDESITE_IRON_ORE);
		Registry.register(BLOCK, "deep_trenches:andesite_lapis_ore", ANDESITE_LAPIS_ORE);
		Registry.register(BLOCK, "deep_trenches:andesite_morganite_ore", ANDESITE_MORGANITE_ORE);
		Registry.register(BLOCK, "deep_trenches:andesite_redstone_ore", ANDESITE_REDSTONE_ORE);
		Registry.register(BLOCK, "deep_trenches:andesite_ruby_ore", ANDESITE_RUBY_ORE);
		Registry.register(BLOCK, "deep_trenches:andesite_silver_ore", ANDESITE_SILVER_ORE);
		Registry.register(BLOCK, "deep_trenches:andesite_sphene_ore", ANDESITE_SPHENE_ORE);
		Registry.register(BLOCK, "deep_trenches:andesite_spinel_ore", ANDESITE_SPINEL_ORE);
		Registry.register(BLOCK, "deep_trenches:andesite_tanzanite_ore", ANDESITE_TANZANITE_ORE);
		Registry.register(BLOCK, "deep_trenches:andesite_topaz_ore", ANDESITE_TOPAZ_ORE);

		Registry.register(BLOCK, "deep_trenches:basalt_clinohumite_ore", BASALT_CLINOHUMITE_ORE);
		Registry.register(BLOCK, "deep_trenches:basalt_coal_ore", BASALT_COAL_ORE);

		Registry.register(BLOCK, "deep_trenches:bedrock_diamond_ore", BEDROCK_DIAMOND_ORE);
		Registry.register(BLOCK, "deep_trenches:bedrock_diopside_ore", BEDROCK_DIOPSIDE_ORE);
		Registry.register(BLOCK, "deep_trenches:bedrock_morganite_ore", BEDROCK_MORGANITE_ORE);
		Registry.register(BLOCK, "deep_trenches:bedrock_void_crittered_diopside_ore", BEDROCK_VOID_CRITTERED_DIOPSIDE_ORE);

		Registry.register(BLOCK, "deep_trenches:black_basalt_chalcedony_ore", BLACK_BASALT_CHALCEDONY_ORE);
		Registry.register(BLOCK, "deep_trenches:black_basalt_clinohumite_ore", BLACK_BASALT_CLINOHUMITE_ORE);
		Registry.register(BLOCK, "deep_trenches:black_basalt_coal_ore", BLACK_BASALT_COAL_ORE);
		Registry.register(BLOCK, "deep_trenches:black_basalt_diamond_ore", BLACK_BASALT_DIAMOND_ORE);
		Registry.register(BLOCK, "deep_trenches:black_basalt_gold_ore", BLACK_BASALT_GOLD_ORE);
		Registry.register(BLOCK, "deep_trenches:black_basalt_iron_ore", BLACK_BASALT_IRON_ORE);

		Registry.register(BLOCK, "deep_trenches:blue_storcerack_black_opal_ore", BLUE_STORCERACK_BLACK_OPAL_ORE);
		Registry.register(BLOCK, "deep_trenches:blue_storcerack_coal_ore", BLUE_STORCERACK_COAL_ORE);
		Registry.register(BLOCK, "deep_trenches:blue_storcerack_copper_ore", BLUE_STORCERACK_COPPER_ORE);
		Registry.register(BLOCK, "deep_trenches:blue_storcerack_diamond_ore", BLUE_STORCERACK_DIAMOND_ORE);
		Registry.register(BLOCK, "deep_trenches:blue_storcerack_gold_ore", BLUE_STORCERACK_GOLD_ORE);
		Registry.register(BLOCK, "deep_trenches:blue_storcerack_iron_ore", BLUE_STORCERACK_IRON_ORE);
		Registry.register(BLOCK, "deep_trenches:blue_storcerack_redstone_ore", BLUE_STORCERACK_REDSTONE_ORE);
		Registry.register(BLOCK, "deep_trenches:blue_storcerack_ruby_ore", BLUE_STORCERACK_RUBY_ORE);
		Registry.register(BLOCK, "deep_trenches:blue_storcerack_sphene_ore", BLUE_STORCERACK_SPHENE_ORE);
		Registry.register(BLOCK, "deep_trenches:blue_storcerack_spinel_ore", BLUE_STORCERACK_SPINEL_ORE);
		Registry.register(BLOCK, "deep_trenches:blue_storcerack_stroxite_ore", BLUE_STORCERACK_STROXITE_ORE);
		Registry.register(BLOCK, "deep_trenches:blue_storcerack_charged_tungsten_ore", BLUE_STORCERACK_CHARGED_TUNGSTEN_ORE);

		Registry.register(BLOCK, "deep_trenches:calcite_chalcedony_ore", CALCITE_CHALCEDONY_ORE);
		Registry.register(BLOCK, "deep_trenches:calcite_clinohumite_ore", CALCITE_CLINOHUMITE_ORE);
		Registry.register(BLOCK, "deep_trenches:calcite_coal_ore", CALCITE_COAL_ORE);
		Registry.register(BLOCK, "deep_trenches:calcite_diamond_ore", CALCITE_DIAMOND_ORE);
		Registry.register(BLOCK, "deep_trenches:calcite_gold_ore", CALCITE_GOLD_ORE);

		Registry.register(BLOCK, "deep_trenches:deepslate_aquamarine_ore", DEEPSLATE_AQUAMARINE_ORE);
		Registry.register(BLOCK, "deep_trenches:deepslate_black_opal_ore", DEEPSLATE_BLACK_OPAL_ORE);
		Registry.register(BLOCK, "deep_trenches:deepslate_chalcedony_ore", DEEPSLATE_CHALCEDONY_ORE);
		Registry.register(BLOCK, "deep_trenches:deepslate_clinohumite_ore", DEEPSLATE_CLINOHUMITE_ORE);
		Registry.register(BLOCK, "deep_trenches:deepslate_garnet_ore", DEEPSLATE_GARNET_ORE);
		Registry.register(BLOCK, "deep_trenches:deepslate_morganite_ore", DEEPSLATE_MORGANITE_ORE);
		Registry.register(BLOCK, "deep_trenches:deepslate_opal_ore", DEEPSLATE_OPAL_ORE);
		Registry.register(BLOCK, "deep_trenches:deepslate_ruby_ore", DEEPSLATE_RUBY_ORE);
		Registry.register(BLOCK, "deep_trenches:deepslate_sapphire_ore", DEEPSLATE_SAPPHIRE_ORE);
		Registry.register(BLOCK, "deep_trenches:deepslate_silver_ore", DEEPSLATE_SILVER_ORE);
		Registry.register(BLOCK, "deep_trenches:deepslate_sphene_ore", DEEPSLATE_SPHENE_ORE);
		Registry.register(BLOCK, "deep_trenches:deepslate_spinel_ore", DEEPSLATE_SPINEL_ORE);
		Registry.register(BLOCK, "deep_trenches:deepslate_sugilite_ore", DEEPSLATE_SUGILITE_ORE);
		Registry.register(BLOCK, "deep_trenches:deepslate_tanzanite_ore", DEEPSLATE_TANZANITE_ORE);
		Registry.register(BLOCK, "deep_trenches:deepslate_topaz_ore", DEEPSLATE_TOPAZ_ORE);

		Registry.register(BLOCK, "deep_trenches:diorite_aquamarine_ore", DIORITE_AQUAMARINE_ORE);
		Registry.register(BLOCK, "deep_trenches:diorite_black_opal_ore", DIORITE_BLACK_OPAL_ORE);
		Registry.register(BLOCK, "deep_trenches:diorite_chalcedony_ore", DIORITE_CHALCEDONY_ORE);
		Registry.register(BLOCK, "deep_trenches:diorite_clinohumite_ore", DIORITE_CLINOHUMITE_ORE);
		Registry.register(BLOCK, "deep_trenches:diorite_coal_ore", DIORITE_COAL_ORE);
		Registry.register(BLOCK, "deep_trenches:diorite_copper_ore", DIORITE_COPPER_ORE);
		Registry.register(BLOCK, "deep_trenches:diorite_diamond_ore", DIORITE_DIAMOND_ORE);
		Registry.register(BLOCK, "deep_trenches:diorite_emerald_ore", DIORITE_EMERALD_ORE);
		Registry.register(BLOCK, "deep_trenches:diorite_garnet_ore", DIORITE_GARNET_ORE);
		Registry.register(BLOCK, "deep_trenches:diorite_gold_ore", DIORITE_GOLD_ORE);
		Registry.register(BLOCK, "deep_trenches:diorite_iron_ore", DIORITE_IRON_ORE);
		Registry.register(BLOCK, "deep_trenches:diorite_lapis_ore", DIORITE_LAPIS_ORE);
		Registry.register(BLOCK, "deep_trenches:diorite_morganite_ore", DIORITE_MORGANITE_ORE);
		Registry.register(BLOCK, "deep_trenches:diorite_redstone_ore", DIORITE_REDSTONE_ORE);
		Registry.register(BLOCK, "deep_trenches:diorite_ruby_ore", DIORITE_RUBY_ORE);
		Registry.register(BLOCK, "deep_trenches:diorite_silver_ore", DIORITE_SILVER_ORE);
		Registry.register(BLOCK, "deep_trenches:diorite_sphene_ore", DIORITE_SPHENE_ORE);
		Registry.register(BLOCK, "deep_trenches:diorite_spinel_ore", DIORITE_SPINEL_ORE);
		Registry.register(BLOCK, "deep_trenches:diorite_tanzanite_ore", DIORITE_TANZANITE_ORE);
		Registry.register(BLOCK, "deep_trenches:diorite_topaz_ore", DIORITE_TOPAZ_ORE);

		Registry.register(BLOCK, "deep_trenches:end_stone_diopside_ore", END_STONE_DIOPSIDE_ORE);
		Registry.register(BLOCK, "deep_trenches:end_stone_spinel_ore", END_STONE_SPINEL_ORE);
		Registry.register(BLOCK, "deep_trenches:end_stone_void_crittered_diopside_ore", END_STONE_VOID_CRITTERED_DIOPSIDE_ORE);

		Registry.register(BLOCK, "deep_trenches:flint_stone_silicon_ore", FLINT_STONE_SILICON_ORE);
		Registry.register(BLOCK, "deep_trenches:flint_stone_uranolumen_ore", FLINT_STONE_URANOLUMEN_ORE);

		Registry.register(BLOCK, "deep_trenches:gray_marble_diamond_ore", GRAY_MARBLE_DIAMOND_ORE);

		Registry.register(BLOCK, "deep_trenches:granite_aquamarine_ore", GRANITE_AQUAMARINE_ORE);
		Registry.register(BLOCK, "deep_trenches:granite_black_opal_ore", GRANITE_BLACK_OPAL_ORE);
		Registry.register(BLOCK, "deep_trenches:granite_chalcedony_ore", GRANITE_CHALCEDONY_ORE);
		Registry.register(BLOCK, "deep_trenches:granite_clinohumite_ore", GRANITE_CLINOHUMITE_ORE);
		Registry.register(BLOCK, "deep_trenches:granite_coal_ore", GRANITE_COAL_ORE);
		Registry.register(BLOCK, "deep_trenches:granite_copper_ore", GRANITE_COPPER_ORE);
		Registry.register(BLOCK, "deep_trenches:granite_diamond_ore", GRANITE_DIAMOND_ORE);
		Registry.register(BLOCK, "deep_trenches:granite_emerald_ore", GRANITE_EMERALD_ORE);
		Registry.register(BLOCK, "deep_trenches:granite_garnet_ore", GRANITE_GARNET_ORE);
		Registry.register(BLOCK, "deep_trenches:granite_gold_ore", GRANITE_GOLD_ORE);
		Registry.register(BLOCK, "deep_trenches:granite_iron_ore", GRANITE_IRON_ORE);
		Registry.register(BLOCK, "deep_trenches:granite_lapis_ore", GRANITE_LAPIS_ORE);
		Registry.register(BLOCK, "deep_trenches:granite_morganite_ore", GRANITE_MORGANITE_ORE);
		Registry.register(BLOCK, "deep_trenches:granite_redstone_ore", GRANITE_REDSTONE_ORE);
		Registry.register(BLOCK, "deep_trenches:granite_ruby_ore", GRANITE_RUBY_ORE);
		Registry.register(BLOCK, "deep_trenches:granite_silver_ore", GRANITE_SILVER_ORE);
		Registry.register(BLOCK, "deep_trenches:granite_sphene_ore", GRANITE_SPHENE_ORE);
		Registry.register(BLOCK, "deep_trenches:granite_spinel_ore", GRANITE_SPINEL_ORE);
		Registry.register(BLOCK, "deep_trenches:granite_tanzanite_ore", GRANITE_TANZANITE_ORE);
		Registry.register(BLOCK, "deep_trenches:granite_topaz_ore", GRANITE_TOPAZ_ORE);

		Registry.register(BLOCK, "deep_trenches:hadal_stone_aquamarine_ore", HADAL_STONE_AQUAMARINE_ORE);
		Registry.register(BLOCK, "deep_trenches:hadal_stone_black_opal_ore", HADAL_STONE_BLACK_OPAL_ORE);
		Registry.register(BLOCK, "deep_trenches:hadal_stone_clinohumite_ore", HADAL_STONE_CLINOHUMITE_ORE);
		Registry.register(BLOCK, "deep_trenches:hadal_stone_coal_ore", HADAL_STONE_COAL_ORE);
		Registry.register(BLOCK, "deep_trenches:hadal_stone_copper_ore", HADAL_STONE_COPPER_ORE);
		Registry.register(BLOCK, "deep_trenches:hadal_stone_diamond_ore", HADAL_STONE_DIAMOND_ORE);
		Registry.register(BLOCK, "deep_trenches:hadal_stone_emerald_ore", HADAL_STONE_EMERALD_ORE);
		Registry.register(BLOCK, "deep_trenches:hadal_stone_garnet_ore", HADAL_STONE_GARNET_ORE);
		Registry.register(BLOCK, "deep_trenches:hadal_stone_gold_ore", HADAL_STONE_GOLD_ORE);
		Registry.register(BLOCK, "deep_trenches:hadal_stone_iron_ore", HADAL_STONE_IRON_ORE);
		Registry.register(BLOCK, "deep_trenches:hadal_stone_lapis_ore", HADAL_STONE_LAPIS_ORE);
		Registry.register(BLOCK, "deep_trenches:hadal_stone_morganite_ore", HADAL_STONE_MORGANITE_ORE);
		Registry.register(BLOCK, "deep_trenches:hadal_stone_redstone_ore", HADAL_STONE_REDSTONE_ORE);
		Registry.register(BLOCK, "deep_trenches:hadal_stone_ruby_ore", HADAL_STONE_RUBY_ORE);
		Registry.register(BLOCK, "deep_trenches:hadal_stone_sapphire_ore", HADAL_STONE_SAPPHIRE_ORE);
		Registry.register(BLOCK, "deep_trenches:hadal_stone_silver_ore", HADAL_STONE_SILVER_ORE);
		Registry.register(BLOCK, "deep_trenches:hadal_stone_sphene_ore", HADAL_STONE_SPHENE_ORE);
		Registry.register(BLOCK, "deep_trenches:hadal_stone_spinel_ore", HADAL_STONE_SPINEL_ORE);
		Registry.register(BLOCK, "deep_trenches:hadal_stone_sugilite_ore", HADAL_STONE_SUGILITE_ORE);
		Registry.register(BLOCK, "deep_trenches:hadal_stone_tanzanite_ore", HADAL_STONE_TANZANITE_ORE);
		Registry.register(BLOCK, "deep_trenches:hadal_stone_topaz_ore", HADAL_STONE_TOPAZ_ORE);

		Registry.register(BLOCK, "deep_trenches:infinital_stone_aquamarine_ore", INFINITAL_STONE_AQUAMARINE_ORE);
		Registry.register(BLOCK, "deep_trenches:infinital_stone_black_opal_ore", INFINITAL_STONE_BLACK_OPAL_ORE);
		Registry.register(BLOCK, "deep_trenches:infinital_stone_coal_ore", INFINITAL_STONE_COAL_ORE);
		Registry.register(BLOCK, "deep_trenches:infinital_stone_copper_ore", INFINITAL_STONE_COPPER_ORE);
		Registry.register(BLOCK, "deep_trenches:infinital_stone_diamond_ore", INFINITAL_STONE_DIAMOND_ORE);
		Registry.register(BLOCK, "deep_trenches:infinital_stone_enstatite_ore", INFINITAL_STONE_ENSTATITE_ORE);
		Registry.register(BLOCK, "deep_trenches:infinital_stone_opal_ore", INFINITAL_STONE_OPAL_ORE);
		Registry.register(BLOCK, "deep_trenches:infinital_stone_iron_ore", INFINITAL_STONE_IRON_ORE);
		Registry.register(BLOCK, "deep_trenches:infinital_stone_ruby_ore", INFINITAL_STONE_RUBY_ORE);
		Registry.register(BLOCK, "deep_trenches:infinital_stone_sapphire_ore", INFINITAL_STONE_SAPPHIRE_ORE);
		Registry.register(BLOCK, "deep_trenches:infinital_stone_sphene_ore", INFINITAL_STONE_SPHENE_ORE);
		Registry.register(BLOCK, "deep_trenches:infinital_stone_spinel_ore", INFINITAL_STONE_SPINEL_ORE);
		Registry.register(BLOCK, "deep_trenches:infinital_stone_sugilite_ore", INFINITAL_STONE_SUGILITE_ORE);
		Registry.register(BLOCK, "deep_trenches:infinital_stone_uranolumen_ore", INFINITAL_STONE_URANOLUMEN_ORE);
		Registry.register(BLOCK, "deep_trenches:infinital_stone_silicon_ore", INFINITAL_STONE_SILICON_ORE);

		Registry.register(BLOCK, "deep_trenches:limestone_aquamarine_ore", LIMESTONE_AQUAMARINE_ORE);
		Registry.register(BLOCK, "deep_trenches:limestone_black_opal_ore", LIMESTONE_BLACK_OPAL_ORE);
		Registry.register(BLOCK, "deep_trenches:limestone_coal_ore", LIMESTONE_COAL_ORE);
		Registry.register(BLOCK, "deep_trenches:limestone_copper_ore", LIMESTONE_COPPER_ORE);
		Registry.register(BLOCK, "deep_trenches:limestone_diamond_ore", LIMESTONE_DIAMOND_ORE);
		Registry.register(BLOCK, "deep_trenches:limestone_opal_ore", LIMESTONE_OPAL_ORE);
		Registry.register(BLOCK, "deep_trenches:limestone_iron_ore", LIMESTONE_IRON_ORE);
		Registry.register(BLOCK, "deep_trenches:limestone_sapphire_ore", LIMESTONE_SAPPHIRE_ORE);
		Registry.register(BLOCK, "deep_trenches:limestone_sphene_ore", LIMESTONE_SPHENE_ORE);
		Registry.register(BLOCK, "deep_trenches:limestone_spinel_ore", LIMESTONE_SPINEL_ORE);
		Registry.register(BLOCK, "deep_trenches:limestone_sugilite_ore", LIMESTONE_SUGILITE_ORE);

		Registry.register(BLOCK, "deep_trenches:lustered_waveite_sapphire_ore", LUSTERED_WAVEITE_SAPPHIRE_ORE);
		Registry.register(BLOCK, "deep_trenches:lustered_waveite_tanzanite_ore", LUSTERED_WAVEITE_TANZANITE_ORE);

		Registry.register(BLOCK, "deep_trenches:marble_diamond_ore", MARBLE_DIAMOND_ORE);

		Registry.register(BLOCK, "deep_trenches:netherrack_boron_ore", NETHERRACK_BORON_ORE);
		Registry.register(BLOCK, "deep_trenches:netherrack_clinohumite_ore", NETHERRACK_CLINOHUMITE_ORE);

		Registry.register(BLOCK, "deep_trenches:pinkine_aquamarine_ore", PINKINE_AQUAMARINE_ORE);
		Registry.register(BLOCK, "deep_trenches:pinkine_black_opal_ore", PINKINE_BLACK_OPAL_ORE);
		Registry.register(BLOCK, "deep_trenches:pinkine_coal_ore", PINKINE_COAL_ORE);
		Registry.register(BLOCK, "deep_trenches:pinkine_copper_ore", PINKINE_COPPER_ORE);
		Registry.register(BLOCK, "deep_trenches:pinkine_diamond_ore", PINKINE_DIAMOND_ORE);
		Registry.register(BLOCK, "deep_trenches:pinkine_diopside_ore", PINKINE_DIOPSIDE_ORE);
		Registry.register(BLOCK, "deep_trenches:pinkine_enstatite_ore", PINKINE_ENSTATITE_ORE);
		Registry.register(BLOCK, "deep_trenches:pinkine_opal_ore", PINKINE_OPAL_ORE);
		Registry.register(BLOCK, "deep_trenches:pinkine_iron_ore", PINKINE_IRON_ORE);
		Registry.register(BLOCK, "deep_trenches:pinkine_ruby_ore", PINKINE_RUBY_ORE);
		Registry.register(BLOCK, "deep_trenches:pinkine_sapphire_ore", PINKINE_SAPPHIRE_ORE);
		Registry.register(BLOCK, "deep_trenches:pinkine_silicon_ore", PINKINE_SILICON_ORE);
		Registry.register(BLOCK, "deep_trenches:pinkine_sphene_ore", PINKINE_SPHENE_ORE);
		Registry.register(BLOCK, "deep_trenches:pinkine_spinel_ore", PINKINE_SPINEL_ORE);
		Registry.register(BLOCK, "deep_trenches:pinkine_sugilite_ore", PINKINE_SUGILITE_ORE);
		Registry.register(BLOCK, "deep_trenches:pinkine_uranium_ore", PINKINE_URANIUM_ORE);
		Registry.register(BLOCK, "deep_trenches:pinkine_uranolumen_ore", PINKINE_URANOLUMEN_ORE);
		Registry.register(BLOCK, "deep_trenches:pinkine_void_crittered_diopside_ore", PINKINE_VOID_CRITTERED_DIOPSIDE_ORE);

		Registry.register(BLOCK, "deep_trenches:rhodonite_garnet_ore", RHODONITE_GARNET_ORE);
		Registry.register(BLOCK, "deep_trenches:ringwoodite_sapphire_ore", RINGWOODITE_SAPPHIRE_ORE);
		Registry.register(BLOCK, "deep_trenches:skystone_opal_ore", SKYSTONE_OPAL_ORE);

		Registry.register(BLOCK, "deep_trenches:smooth_basalt_chalcedony_ore", SMOOTH_BASALT_CHALCEDONY_ORE);
		Registry.register(BLOCK, "deep_trenches:smooth_basalt_clinohumite_ore", SMOOTH_BASALT_CLINOHUMITE_ORE);
		Registry.register(BLOCK, "deep_trenches:smooth_basalt_diamond_ore", SMOOTH_BASALT_DIAMOND_ORE);
		Registry.register(BLOCK, "deep_trenches:smooth_basalt_gold_ore", SMOOTH_BASALT_GOLD_ORE);

		Registry.register(BLOCK, "deep_trenches:storcean_sapphire_ore", STORCEAN_SAPPHIRE_ORE);
		Registry.register(BLOCK, "deep_trenches:storcean_silicon_ore", STORCEAN_SILICON_ORE);
		Registry.register(BLOCK, "deep_trenches:storcean_tungsten_ore", STORCEAN_TUNGSTEN_ORE);

		Registry.register(BLOCK, "deep_trenches:storcendite_aquamarine_ore", STORCENDITE_AQUAMARINE_ORE);
		Registry.register(BLOCK, "deep_trenches:storcendite_black_opal_ore", STORCENDITE_BLACK_OPAL_ORE);
		Registry.register(BLOCK, "deep_trenches:storcendite_coal_ore", STORCENDITE_COAL_ORE);
		Registry.register(BLOCK, "deep_trenches:storcendite_copper_ore", STORCENDITE_COPPER_ORE);
		Registry.register(BLOCK, "deep_trenches:storcendite_diamond_ore", STORCENDITE_DIAMOND_ORE);
		Registry.register(BLOCK, "deep_trenches:storcendite_enstatite_ore", STORCENDITE_ENSTATITE_ORE);
		Registry.register(BLOCK, "deep_trenches:storcendite_iron_ore", STORCENDITE_IRON_ORE);
		Registry.register(BLOCK, "deep_trenches:storcendite_opal_ore", STORCENDITE_OPAL_ORE);
		Registry.register(BLOCK, "deep_trenches:storcendite_ruby_ore", STORCENDITE_RUBY_ORE);
		Registry.register(BLOCK, "deep_trenches:storcendite_sapphire_ore", STORCENDITE_SAPPHIRE_ORE);
		Registry.register(BLOCK, "deep_trenches:storcendite_silicon_ore", STORCENDITE_SILICON_ORE);
		Registry.register(BLOCK, "deep_trenches:storcendite_sphene_ore", STORCENDITE_SPHENE_ORE);
		Registry.register(BLOCK, "deep_trenches:storcendite_spinel_ore", STORCENDITE_SPINEL_ORE);
		Registry.register(BLOCK, "deep_trenches:storcendite_sugilite_ore", STORCENDITE_SUGILITE_ORE);
		Registry.register(BLOCK, "deep_trenches:storcendite_uranium_ore", STORCENDITE_URANIUM_ORE);
		Registry.register(BLOCK, "deep_trenches:storcendite_uranolumen_ore", STORCENDITE_URANOLUMEN_ORE);

		Registry.register(BLOCK, "deep_trenches:storcerack_aquamarine_ore", STORCERACK_AQUAMARINE_ORE);
		Registry.register(BLOCK, "deep_trenches:storcerack_black_opal_ore", STORCERACK_BLACK_OPAL_ORE);
		Registry.register(BLOCK, "deep_trenches:storcerack_coal_ore", STORCERACK_COAL_ORE);
		Registry.register(BLOCK, "deep_trenches:storcerack_copper_ore", STORCERACK_COPPER_ORE);
		Registry.register(BLOCK, "deep_trenches:storcerack_diamond_ore", STORCERACK_DIAMOND_ORE);
		Registry.register(BLOCK, "deep_trenches:storcerack_gold_ore", STORCERACK_GOLD_ORE);
		Registry.register(BLOCK, "deep_trenches:storcerack_iron_ore", STORCERACK_IRON_ORE);
		Registry.register(BLOCK, "deep_trenches:storcerack_opal_ore", STORCERACK_OPAL_ORE);
		Registry.register(BLOCK, "deep_trenches:storcerack_redstone_ore", STORCERACK_REDSTONE_ORE);
		Registry.register(BLOCK, "deep_trenches:storcerack_ruby_ore", STORCERACK_RUBY_ORE);
		Registry.register(BLOCK, "deep_trenches:storcerack_sapphire_ore", STORCERACK_SAPPHIRE_ORE);
		Registry.register(BLOCK, "deep_trenches:storcerack_silicon_ore", STORCERACK_SILICON_ORE);
		Registry.register(BLOCK, "deep_trenches:storcerack_sphene_ore", STORCERACK_SPHENE_ORE);
		Registry.register(BLOCK, "deep_trenches:storcerack_spinel_ore", STORCERACK_SPINEL_ORE);
		Registry.register(BLOCK, "deep_trenches:storcerack_sugilite_ore", STORCERACK_SUGILITE_ORE);
		Registry.register(BLOCK, "deep_trenches:storcerack_tungsten_ore", STORCERACK_TUNGSTEN_ORE);
		Registry.register(BLOCK, "deep_trenches:storcerack_uranolumen_ore", STORCERACK_URANOLUMEN_ORE);

		Registry.register(BLOCK, "deep_trenches:sulfur_stone_chalcedony_ore", SULFUR_STONE_CHALCEDONY_ORE);
		Registry.register(BLOCK, "deep_trenches:sulfur_stone_clinohumite_ore", SULFUR_STONE_CLINOHUMITE_ORE);
		Registry.register(BLOCK, "deep_trenches:sulfur_stone_coal_ore", SULFUR_STONE_COAL_ORE);

		Registry.register(BLOCK, "deep_trenches:tuff_chalcedony_ore", TUFF_CHALCEDONY_ORE);
		Registry.register(BLOCK, "deep_trenches:tuff_clinohumite_ore", TUFF_CLINOHUMITE_ORE);
		Registry.register(BLOCK, "deep_trenches:tuff_coal_ore", TUFF_COAL_ORE);
		Registry.register(BLOCK, "deep_trenches:tuff_diamond_ore", TUFF_DIAMOND_ORE);
		Registry.register(BLOCK, "deep_trenches:tuff_gold_ore", TUFF_GOLD_ORE);

		Registry.register(BLOCK, "deep_trenches:verdine_coal_ore", VERDINE_COAL_ORE);

		Registry.register(BLOCK, "deep_trenches:virdal_stone_aquamarine_ore", VIRDAL_STONE_AQUAMARINE_ORE);
		Registry.register(BLOCK, "deep_trenches:virdal_stone_black_opal_ore", VIRDAL_STONE_BLACK_OPAL_ORE);
		Registry.register(BLOCK, "deep_trenches:virdal_stone_coal_ore", VIRDAL_STONE_COAL_ORE);
		Registry.register(BLOCK, "deep_trenches:virdal_stone_copper_ore", VIRDAL_STONE_COPPER_ORE);
		Registry.register(BLOCK, "deep_trenches:virdal_stone_diamond_ore", VIRDAL_STONE_DIAMOND_ORE);
		Registry.register(BLOCK, "deep_trenches:virdal_stone_iron_ore", VIRDAL_STONE_IRON_ORE);
		Registry.register(BLOCK, "deep_trenches:virdal_stone_opal_ore", VIRDAL_STONE_OPAL_ORE);
		Registry.register(BLOCK, "deep_trenches:virdal_stone_ruby_ore", VIRDAL_STONE_RUBY_ORE);
		Registry.register(BLOCK, "deep_trenches:virdal_stone_sapphire_ore", VIRDAL_STONE_SAPPHIRE_ORE);
		Registry.register(BLOCK, "deep_trenches:virdal_stone_silicon_ore", VIRDAL_STONE_SILICON_ORE);
		Registry.register(BLOCK, "deep_trenches:virdal_stone_sphene_ore", VIRDAL_STONE_SPHENE_ORE);
		Registry.register(BLOCK, "deep_trenches:virdal_stone_spinel_ore", VIRDAL_STONE_SPINEL_ORE);
		Registry.register(BLOCK, "deep_trenches:virdal_stone_sugilite_ore", VIRDAL_STONE_SUGILITE_ORE);
		Registry.register(BLOCK, "deep_trenches:virdal_stone_uranolumen_ore", VIRDAL_STONE_URANOLUMEN_ORE);

		Registry.register(BLOCK, "deep_trenches:waved_bedrock_diamond_ore", WAVED_BEDROCK_DIAMOND_ORE);
		Registry.register(BLOCK, "deep_trenches:waved_bedrock_diopside_ore", WAVED_BEDROCK_DIOPSIDE_ORE);
		Registry.register(BLOCK, "deep_trenches:waved_bedrock_morganite_ore", WAVED_BEDROCK_MORGANITE_ORE);
		Registry.register(BLOCK, "deep_trenches:waved_bedrock_tanzanite_ore", WAVED_BEDROCK_TANZANITE_ORE);

		Registry.register(BLOCK, "deep_trenches:waveite_clinohumite_ore", WAVEITE_CLINOHUMITE_ORE);
		Registry.register(BLOCK, "deep_trenches:waveite_coal_ore", WAVEITE_COAL_ORE);
		Registry.register(BLOCK, "deep_trenches:waveite_copper_ore", WAVEITE_COPPER_ORE);
		Registry.register(BLOCK, "deep_trenches:waveite_diamond_ore", WAVEITE_DIAMOND_ORE);
		Registry.register(BLOCK, "deep_trenches:waveite_emerald_ore", WAVEITE_EMERALD_ORE);
		Registry.register(BLOCK, "deep_trenches:waveite_iron_ore", WAVEITE_IRON_ORE);
		Registry.register(BLOCK, "deep_trenches:waveite_garnet_ore", WAVEITE_GARNET_ORE);
		Registry.register(BLOCK, "deep_trenches:waveite_gold_ore", WAVEITE_GOLD_ORE);
		Registry.register(BLOCK, "deep_trenches:waveite_lapis_ore", WAVEITE_LAPIS_ORE);
		Registry.register(BLOCK, "deep_trenches:waveite_morganite_ore", WAVEITE_MORGANITE_ORE);
		Registry.register(BLOCK, "deep_trenches:waveite_redstone_ore", WAVEITE_REDSTONE_ORE);
		Registry.register(BLOCK, "deep_trenches:waveite_ruby_ore", WAVEITE_RUBY_ORE);
		Registry.register(BLOCK, "deep_trenches:waveite_sapphire_ore", WAVEITE_SAPPHIRE_ORE);
		Registry.register(BLOCK, "deep_trenches:waveite_silicon_ore", WAVEITE_SILICON_ORE);
		Registry.register(BLOCK, "deep_trenches:waveite_silver_ore", WAVEITE_SILVER_ORE);
		Registry.register(BLOCK, "deep_trenches:waveite_sphene_ore", WAVEITE_SPHENE_ORE);
		Registry.register(BLOCK, "deep_trenches:waveite_spinel_ore", WAVEITE_SPINEL_ORE);
		Registry.register(BLOCK, "deep_trenches:waveite_sugilite_ore", WAVEITE_SUGILITE_ORE);
		Registry.register(BLOCK, "deep_trenches:waveite_tanzanite_ore", WAVEITE_TANZANITE_ORE);
		Registry.register(BLOCK, "deep_trenches:waveite_topaz_ore", WAVEITE_TOPAZ_ORE);

		Registry.register(BLOCK, "deep_trenches:actinium_ore", ACTINIUM_ORE);
		Registry.register(BLOCK, "deep_trenches:aquamarine_ore", AQUAMARINE_ORE);
		Registry.register(BLOCK, "deep_trenches:black_opal_ore", BLACK_OPAL_ORE);
		Registry.register(BLOCK, "deep_trenches:clinohumite_ore", CLINOHUMITE_ORE);
		Registry.register(BLOCK, "deep_trenches:enstatite_ore", ENSTATITE_ORE);
		Registry.register(BLOCK, "deep_trenches:morganite_ore", MORGANITE_ORE);
		Registry.register(BLOCK, "deep_trenches:opal_ore", OPAL_ORE);
		Registry.register(BLOCK, "deep_trenches:ruby_ore", RUBY_ORE);
		Registry.register(BLOCK, "deep_trenches:sapphire_ore", SAPPHIRE_ORE);
		Registry.register(BLOCK, "deep_trenches:sugilite_ore", SUGILITE_ORE);
		Registry.register(BLOCK, "deep_trenches:sphene_ore", SPHENE_ORE);
		Registry.register(BLOCK, "deep_trenches:spinel_ore", SPINEL_ORE);
		Registry.register(BLOCK, "deep_trenches:tanzanite_ore", TANZANITE_ORE);
		Registry.register(BLOCK, "deep_trenches:topaz_ore", TOPAZ_ORE);

		/* RAW BLOCKS */
		Registry.register(BLOCK, "deep_trenches:raw_actinium_block", RAW_ACTINIUM_BLOCK);
		Registry.register(BLOCK, "deep_trenches:raw_boron_block", RAW_BORON_BLOCK);
		Registry.register(BLOCK, "deep_trenches:raw_enron_block", RAW_ENRON_BLOCK);
		Registry.register(BLOCK, "deep_trenches:kralium_debris", KRALIUM_DEBRIS);
		Registry.register(BLOCK, "deep_trenches:raw_silicon_block", RAW_SILICON_BLOCK);
		Registry.register(BLOCK, "deep_trenches:raw_silver_block", RAW_SILVER_BLOCK);
		Registry.register(BLOCK, "deep_trenches:raw_stroxite_block", RAW_STROXITE_BLOCK);
		Registry.register(BLOCK, "deep_trenches:charged_raw_tungsten_block", CHARGED_RAW_TUNGSTEN_BLOCK);
		Registry.register(BLOCK, "deep_trenches:raw_tungsten_block", RAW_TUNGSTEN_BLOCK);
		Registry.register(BLOCK, "deep_trenches:raw_uranolumen_block", RAW_URANOLUMEN_BLOCK);

		/* MINERAL BLOCKS */
		Registry.register(BLOCK, "deep_trenches:actinium_block", ACTINIUM_BLOCK);
		Registry.register(BLOCK, "deep_trenches:aquamarine_block", AQUAMARINE_BLOCK);
		Registry.register(BLOCK, "deep_trenches:black_opal_block", BLACK_OPAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:black_pearl_block", BLACK_PEARL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:boron_block", BORON_BLOCK);
		Registry.register(BLOCK, "deep_trenches:cut_boron_block", CUT_BORON_BLOCK);
		Registry.register(BLOCK, "deep_trenches:chalcedony_block", CHALCEDONY_BLOCK);
		Registry.register(BLOCK, "deep_trenches:cut_clinohumite_block", CUT_CLINOHUMITE_BLOCK);
		Registry.register(BLOCK, "deep_trenches:diopside_block", DIOPSIDE_BLOCK);
		Registry.register(BLOCK, "deep_trenches:enron_block", ENRON_BLOCK);
		Registry.register(BLOCK, "deep_trenches:enstatite_block", ENSTATITE_BLOCK);
		Registry.register(BLOCK, "deep_trenches:cut_garnet_block", CUT_GARNET_BLOCK);
		Registry.register(BLOCK, "deep_trenches:gyldelion_block", GYLDELION_BLOCK);
		Registry.register(BLOCK, "deep_trenches:kralctium_block", KRALCTIUM_BLOCK);
		Registry.register(BLOCK, "deep_trenches:kralium_block", KRALIUM_BLOCK);
		Registry.register(BLOCK, "deep_trenches:cut_kralium_block", CUT_KRALIUM_BLOCK);
		Registry.register(BLOCK, "deep_trenches:lekralite_block", LEKRALITE_BLOCK);
		Registry.register(BLOCK, "deep_trenches:morganite_block", MORGANITE_BLOCK);
		Registry.register(BLOCK, "deep_trenches:opal_block", OPAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:ruby_block", RUBY_BLOCK);
		Registry.register(BLOCK, "deep_trenches:sapphire_block", SAPPHIRE_BLOCK);
		Registry.register(BLOCK, "deep_trenches:silicon_block", SILICON_BLOCK);
		Registry.register(BLOCK, "deep_trenches:silver_block", SILVER_BLOCK);
		Registry.register(BLOCK, "deep_trenches:sphene_block", SPHENE_BLOCK);
		Registry.register(BLOCK, "deep_trenches:spinel_block", SPINEL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:stroxite_block", STROXITE_BLOCK);
		Registry.register(BLOCK, "deep_trenches:cut_stroxite_block", CUT_STROXITE_BLOCK);
		Registry.register(BLOCK, "deep_trenches:tanzanite_block", TANZANITE_BLOCK);
		Registry.register(BLOCK, "deep_trenches:topaz_block", TOPAZ_BLOCK);
		Registry.register(BLOCK, "deep_trenches:charged_tungsten_block", CHARGED_TUNGSTEN_BLOCK);
		Registry.register(BLOCK, "deep_trenches:tungsten_block", TUNGSTEN_BLOCK);
		Registry.register(BLOCK, "deep_trenches:uranium_block", URANIUM_BLOCK);
		Registry.register(BLOCK, "deep_trenches:uranium_powder_block", URANIUM_POWDER_BLOCK);
		Registry.register(BLOCK, "deep_trenches:uranolumen_block", URANOLUMEN_BLOCK);
		Registry.register(BLOCK, "deep_trenches:void_crittered_diopside_block", VOID_CRITTERED_DIOPSIDE_BLOCK);

		/* CHISELED MINERAL BLOCKS */
		Registry.register(BLOCK, "deep_trenches:chiseled_silicon_block", CHISELED_SILICON_BLOCK);
		Registry.register(BLOCK, "deep_trenches:chiseled_silver_block", CHISELED_SILVER_BLOCK);
		Registry.register(BLOCK, "deep_trenches:chiseled_sugilite_block", CHISELED_SUGILITE_BLOCK);

		/* AMETHYSTS */
		Registry.register(BLOCK, "deep_trenches:black_opalite_block", BLACK_OPALITE_BLOCK);
		Registry.register(BLOCK, "deep_trenches:budding_black_opalite", BUDDING_BLACK_OPALITE);
		Registry.register(BLOCK, "deep_trenches:black_opal_cluster", BLACK_OPAL_CLUSTER);
		Registry.register(BLOCK, "deep_trenches:large_black_opal_bud", LARGE_BLACK_OPAL_BUD);
		Registry.register(BLOCK, "deep_trenches:medium_black_opal_bud", MEDIUM_BLACK_OPAL_BUD);
		Registry.register(BLOCK, "deep_trenches:small_black_opal_bud", SMALL_BLACK_OPAL_BUD);

		Registry.register(BLOCK, "deep_trenches:clinohumite_block", CLINOHUMITE_BLOCK);
		Registry.register(BLOCK, "deep_trenches:budding_clinohumite", BUDDING_CLINOHUMITE);
		Registry.register(BLOCK, "deep_trenches:clinohumite_cluster", CLINOHUMITE_CLUSTER);
		Registry.register(BLOCK, "deep_trenches:large_clinohumite_bud", LARGE_CLINOHUMITE_BUD);
		Registry.register(BLOCK, "deep_trenches:medium_clinohumite_bud", MEDIUM_CLINOHUMITE_BUD);
		Registry.register(BLOCK, "deep_trenches:small_clinohumite_bud", SMALL_CLINOHUMITE_BUD);

		Registry.register(BLOCK, "deep_trenches:diamite_block", DIAMITE_BLOCK);
		Registry.register(BLOCK, "deep_trenches:budding_diamite", BUDDING_DIAMITE);
		Registry.register(BLOCK, "deep_trenches:diamond_cluster", DIAMOND_CLUSTER);
		Registry.register(BLOCK, "deep_trenches:large_diamond_bud", LARGE_DIAMOND_BUD);
		Registry.register(BLOCK, "deep_trenches:medium_diamond_bud", MEDIUM_DIAMOND_BUD);
		Registry.register(BLOCK, "deep_trenches:small_diamond_bud", SMALL_DIAMOND_BUD);

		Registry.register(BLOCK, "deep_trenches:garnet_block", GARNET_BLOCK);
		Registry.register(BLOCK, "deep_trenches:budding_garnet", BUDDING_GARNET);
		Registry.register(BLOCK, "deep_trenches:garnet_cluster", GARNET_CLUSTER);
		Registry.register(BLOCK, "deep_trenches:large_garnet_bud", LARGE_GARNET_BUD);
		Registry.register(BLOCK, "deep_trenches:medium_garnet_bud", MEDIUM_GARNET_BUD);
		Registry.register(BLOCK, "deep_trenches:small_garnet_bud", SMALL_GARNET_BUD);

		Registry.register(BLOCK, "deep_trenches:opalite_block", OPALITE_BLOCK);
		Registry.register(BLOCK, "deep_trenches:budding_opalite", BUDDING_OPALITE);
		Registry.register(BLOCK, "deep_trenches:opal_cluster", OPAL_CLUSTER);
		Registry.register(BLOCK, "deep_trenches:large_opal_bud", LARGE_OPAL_BUD);
		Registry.register(BLOCK, "deep_trenches:medium_opal_bud", MEDIUM_OPAL_BUD);
		Registry.register(BLOCK, "deep_trenches:small_opal_bud", SMALL_OPAL_BUD);

		Registry.register(BLOCK, "deep_trenches:sapphrite_block", SAPPHRITE_BLOCK);
		Registry.register(BLOCK, "deep_trenches:budding_sapphrite", BUDDING_SAPPHRITE);
		Registry.register(BLOCK, "deep_trenches:sapphire_cluster", SAPPHIRE_CLUSTER);
		Registry.register(BLOCK, "deep_trenches:large_sapphire_bud", LARGE_SAPPHIRE_BUD);
		Registry.register(BLOCK, "deep_trenches:medium_sapphire_bud", MEDIUM_SAPPHIRE_BUD);
		Registry.register(BLOCK, "deep_trenches:small_sapphire_bud", SMALL_SAPPHIRE_BUD);

		Registry.register(BLOCK, "deep_trenches:sugilite_block", SUGILITE_BLOCK);
		Registry.register(BLOCK, "deep_trenches:budding_sugilite", BUDDING_SUGILITE);
		Registry.register(BLOCK, "deep_trenches:sugilite_cluster", SUGILITE_CLUSTER);
		Registry.register(BLOCK, "deep_trenches:large_sugilite_bud", LARGE_SUGILITE_BUD);
		Registry.register(BLOCK, "deep_trenches:medium_sugilite_bud", MEDIUM_SUGILITE_BUD);
		Registry.register(BLOCK, "deep_trenches:small_sugilite_bud", SMALL_SUGILITE_BUD);

		/* POINTED STONES */
		Registry.register(BLOCK, "deep_trenches:pointed_light_opalite", POINTED_LIGHT_OPALITE);
		Registry.register(BLOCK, "deep_trenches:pointed_skystone", POINTED_SKYSTONE);
		Registry.register(BLOCK, "deep_trenches:twisted_blue_storcerack", TWISTED_BLUE_STORCERACK);

		/* SURFACE BLOCKS */
		Registry.register(BLOCK, "deep_trenches:dritean", DRITEAN);
		Registry.register(BLOCK, "deep_trenches:enrotium", ENROTIUM);
		Registry.register(BLOCK, "deep_trenches:sprilium", SPRILIUM);
		Registry.register(BLOCK, "deep_trenches:skysoil", SKYSOIL);
		Registry.register(BLOCK, "deep_trenches:mosoil", MOSOIL);

		/* FLOWERS */
		Registry.register(BLOCK, "deep_trenches:black_pansy", BLACK_PANSY);
		Registry.register(BLOCK, "deep_trenches:blue_pansy", BLUE_PANSY);
		Registry.register(BLOCK, "deep_trenches:blue_poppy", BLUE_POPPY);
		Registry.register(BLOCK, "deep_trenches:blue_violet", BLUE_VIOLET);
		Registry.register(BLOCK, "deep_trenches:bonnet_spurge", BONNET_SPURGE);
		Registry.register(BLOCK, "deep_trenches:brown_pansy", BROWN_PANSY);
		Registry.register(BLOCK, "deep_trenches:chocolate_cosmos_flower", CHOCOLATE_COSMOS_FLOWER);
		Registry.register(BLOCK, "deep_trenches:cyan_blue_violet", CYAN_BLUE_VIOLET);
		Registry.register(BLOCK, "deep_trenches:cycawler", CYCAWLER);
		Registry.register(BLOCK, "deep_trenches:garden_pinks", GARDEN_PINKS);
		Registry.register(BLOCK, "deep_trenches:green_pansy", GREEN_PANSY);
		Registry.register(BLOCK, "deep_trenches:gyldelion_flower", GYLDELION_FLOWER);
		Registry.register(BLOCK, "deep_trenches:limefork", LIMEFORK);
		Registry.register(BLOCK, "deep_trenches:marsh_violet", MARSH_VIOLET);
		Registry.register(BLOCK, "deep_trenches:native_violet", NATIVE_VIOLET);
		Registry.register(BLOCK, "deep_trenches:opium_poppy", OPIUM_POPPY);
		Registry.register(BLOCK, "deep_trenches:pink_and_orange_pansy", PINK_AND_ORANGE_PANSY);
		Registry.register(BLOCK, "deep_trenches:pink_braitor_flower", PINK_BRAITOR_FLOWER);
		Registry.register(BLOCK, "deep_trenches:pink_marsh_violet", PINK_MARSH_VIOLET);
		Registry.register(BLOCK, "deep_trenches:pink_rose", PINK_ROSE);
		Registry.register(BLOCK, "deep_trenches:pink_rose_bush", PINK_ROSE_BUSH);
		Registry.register(BLOCK, "deep_trenches:poppy", POPPY);
		Registry.register(BLOCK, "deep_trenches:purple_and_orange_pansy", PURPLE_AND_ORANGE_PANSY);
		Registry.register(BLOCK, "deep_trenches:red_braitor_flower", RED_BRAITOR_FLOWER);
		Registry.register(BLOCK, "deep_trenches:red_chocolate_cosmos_flower", RED_CHOCOLATE_COSMOS_FLOWER);
		Registry.register(BLOCK, "deep_trenches:red_pansy", RED_PANSY);
		Registry.register(BLOCK, "deep_trenches:red_rose", RED_ROSE);
		Registry.register(BLOCK, "deep_trenches:rubra_blue_violet", RUBRA_BLUE_VIOLET);
		Registry.register(BLOCK, "deep_trenches:spidreet", SPIDREET);
		Registry.register(BLOCK, "deep_trenches:spike_lavender", SPIKE_LAVENDER);
		Registry.register(BLOCK, "deep_trenches:spridelion", SPRIDELION);
		Registry.register(BLOCK, "deep_trenches:sproom_spike", SPROOM_SPIKE);
		Registry.register(BLOCK, "deep_trenches:squisacle", SQUISACLE);
		Registry.register(BLOCK, "deep_trenches:sweet_violet", SWEET_VIOLET);
		Registry.register(BLOCK, "deep_trenches:topped_lavender", TOPPED_LAVENDER);
		Registry.register(BLOCK, "deep_trenches:twisttrap", TWISTTRAP);
		Registry.register(BLOCK, "deep_trenches:vaslame", VASLAME);
		Registry.register(BLOCK, "deep_trenches:weepistil", WEEPISTIL);
		Registry.register(BLOCK, "deep_trenches:weepy_hollower", WEEPY_HOLLOWER);
		Registry.register(BLOCK, "deep_trenches:white_violet", WHITE_VIOLET);
		Registry.register(BLOCK, "deep_trenches:wild_pansy", WILD_PANSY);
		Registry.register(BLOCK, "deep_trenches:yellow_violet", YELLOW_VIOLET);

		/* TALL FLOWERS */
		Registry.register(BLOCK, "deep_trenches:black_lily", BLACK_LILY);
		Registry.register(BLOCK, "deep_trenches:bullthorn", BULLTHORN);
		Registry.register(BLOCK, "deep_trenches:cactlow", CACTLOW);
		Registry.register(BLOCK, "deep_trenches:clawbulb", CLAWBULB);
		Registry.register(BLOCK, "deep_trenches:lime_spurge", LIME_SPURGE);
		Registry.register(BLOCK, "deep_trenches:lupin_flower", LUPIN_FLOWER);
		Registry.register(BLOCK, "deep_trenches:orange_lily", ORANGE_LILY);
		Registry.register(BLOCK, "deep_trenches:pigal", PIGAL);
		Registry.register(BLOCK, "deep_trenches:purpround", PURPROUND);
		Registry.register(BLOCK, "deep_trenches:sprinly", SPRINLY);
		Registry.register(BLOCK, "deep_trenches:tall_buckthorn", TALL_BUCKTHORN);
		Registry.register(BLOCK, "deep_trenches:velvet_lily", VELVET_LILY);

		/* MOSSES */
		Registry.register(BLOCK, "deep_trenches:airial_moss", AIRIAL_MOSS);
		Registry.register(BLOCK, "deep_trenches:ilmium", ILMIUM);
		Registry.register(BLOCK, "deep_trenches:moss", MOSS);

		/* PLANTS */
		Registry.register(BLOCK, "deep_trenches:airial_bush", AIRIAL_BUSH);
		Registry.register(BLOCK, "deep_trenches:buckthorn", BUCKTHORN);
		Registry.register(BLOCK, "deep_trenches:bulk_grasses", BULK_GRASSES);
		Registry.register(BLOCK, "deep_trenches:crusted_fungus", CRUSTED_FUNGUS);
		Registry.register(BLOCK, "deep_trenches:four_leafed_clover", FOUR_LEAFED_CLOVER);
		Registry.register(BLOCK, "deep_trenches:frarel", FRAREL);
		Registry.register(BLOCK, "deep_trenches:fur_plateau", FUR_PLATEAU);
		Registry.register(BLOCK, "deep_trenches:harshles", HARSHLES);
		Registry.register(BLOCK, "deep_trenches:ilyine", ILYINE);
		Registry.register(BLOCK, "deep_trenches:jungle_umbrella", JUNGLE_UMBRELLA);
		Registry.register(BLOCK, "deep_trenches:lichen", LICHEN);
		Registry.register(BLOCK, "deep_trenches:mosses", MOSSES);
		Registry.register(BLOCK, "deep_trenches:murkstem", MURKSTEM);
		Registry.register(BLOCK, "deep_trenches:pomegranate_bush", POMEGRANATE_BUSH);
		Registry.register(BLOCK, "deep_trenches:reebloon", REEBLOON);
		Registry.register(BLOCK, "deep_trenches:sea_buckthorn", SEA_BUCKTHORN);
		Registry.register(BLOCK, "deep_trenches:skalk", SKALK);
		Registry.register(BLOCK, "deep_trenches:squish_tips", SQUISH_TIPS);
		Registry.register(BLOCK, "deep_trenches:three_leafed_clover", THREE_LEAFED_CLOVER);

		/* MUSHROOMS */
		Registry.register(BLOCK, "deep_trenches:gray_shag_mushroom", GRAY_SHAG_MUSHROOM);
		Registry.register(BLOCK, "deep_trenches:inky_cap_mushroom", INKY_CAP_MUSHROOM);
		Registry.register(BLOCK, "deep_trenches:puffball_mushroom", PUFFBALL_MUSHROOM);
		Registry.register(BLOCK, "deep_trenches:shelf_mushroom", SHELF_MUSHROOM);
		Registry.register(BLOCK, "deep_trenches:white_mushroom", WHITE_MUSHROOM);

		Registry.register(BLOCK, "deep_trenches:gray_shag_mushroom_block", GRAY_SHAG_MUSHROOM_BLOCK);
		Registry.register(BLOCK, "deep_trenches:inky_cap_mushroom_block", INKY_CAP_MUSHROOM_BLOCK);
		Registry.register(BLOCK, "deep_trenches:puffball_mushroom_block", PUFFBALL_MUSHROOM_BLOCK);
		Registry.register(BLOCK, "deep_trenches:shelf_mushroom_block", SHELF_MUSHROOM_BLOCK);
		Registry.register(BLOCK, "deep_trenches:white_mushroom_block", WHITE_MUSHROOM_BLOCK);

		Registry.register(BLOCK, "deep_trenches:gray_shag_mushroom_stem", GRAY_SHAG_MUSHROOM_STEM);
		Registry.register(BLOCK, "deep_trenches:inky_cap_mushroom_stem", INKY_CAP_MUSHROOM_STEM);
		Registry.register(BLOCK, "deep_trenches:puffball_mushroom_stem", PUFFBALL_MUSHROOM_STEM);
		Registry.register(BLOCK, "deep_trenches:shelf_mushroom_stem", SHELF_MUSHROOM_STEM);
		Registry.register(BLOCK, "deep_trenches:white_mushroom_stem", WHITE_MUSHROOM_STEM);

		/* GIANT VIOLET */
		Registry.register(BLOCK, "deep_trenches:giant_violet", GIANT_VIOLET);
		Registry.register(BLOCK, "deep_trenches:giant_violet_leaf", GIANT_VIOLET_LEAF);
		Registry.register(BLOCK, "deep_trenches:giant_violet_petal", GIANT_VIOLET_PETAL);
		Registry.register(BLOCK, "deep_trenches:giant_violet_pistil", GIANT_VIOLET_PISTIL);

		/* FLUIDS */
		Registry.register(BLOCK, "deep_trenches:abyssopelagic_water", ABYSSOPELAGIC_WATER);
		Registry.register(BLOCK, "deep_trenches:acid", ACID);
		Registry.register(BLOCK, "deep_trenches:bathypelagic_water", BATHYPELAGIC_WATER);
		Registry.register(BLOCK, "deep_trenches:brine", BRINE);
		Registry.register(BLOCK, "deep_trenches:clear_water", CLEAR_WATER);
		Registry.register(BLOCK, "deep_trenches:hadopelagic_water", HADOPELAGIC_WATER);
		Registry.register(BLOCK, "deep_trenches:mesopelagic_water", MESOPELAGIC_WATER);
		Registry.register(BLOCK, "deep_trenches:storcean_abyssopelagic_water", STORCEAN_ABYSSOPELAGIC_WATER);
		Registry.register(BLOCK, "deep_trenches:storcean_bathypelagic_water", STORCEAN_BATHYPELAGIC_WATER);
		Registry.register(BLOCK, "deep_trenches:storcean_enderpelagic_water", STORCEAN_ENDERPELAGIC_WATER);
		Registry.register(BLOCK, "deep_trenches:storcean_gasopelagic_water", STORCEAN_GASOPELAGIC_WATER);
		Registry.register(BLOCK, "deep_trenches:storcean_hadopelagic_water", STORCEAN_HADOPELAGIC_WATER);
		Registry.register(BLOCK, "deep_trenches:storcean_infinipelagic_water", STORCEAN_INFINIPELAGIC_WATER);
		Registry.register(BLOCK, "deep_trenches:storcean_mesopelagic_water", STORCEAN_MESOPELAGIC_WATER);
		Registry.register(BLOCK, "deep_trenches:storcean_virdipelagic_water", STORCEAN_VIRDIPELAGIC_WATER);
		Registry.register(BLOCK, "deep_trenches:storcean_water", STORCEAN_WATER);

		/* CORALS */
		Registry.register(BLOCK, "deep_trenches:dead_blackgreen_tree_coral", DEAD_BLACKGREEN_TREE_CORAL);
		Registry.register(BLOCK, "deep_trenches:dead_blackgreen_tree_coral_block", DEAD_BLACKGREEN_TREE_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:dead_blackgreen_tree_coral_fan", DEAD_BLACKGREEN_TREE_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:dead_blackgreen_tree_coral_wall_fan", DEAD_BLACKGREEN_TREE_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:blackgreen_tree_coral", BLACKGREEN_TREE_CORAL);
		Registry.register(BLOCK, "deep_trenches:blackgreen_tree_coral_block", BLACKGREEN_TREE_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:blackgreen_tree_coral_fan", BLACKGREEN_TREE_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:blackgreen_tree_coral_wall_fan", BLACKGREEN_TREE_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:dead_broccoli_coral", DEAD_BROCCOLI_CORAL);
		Registry.register(BLOCK, "deep_trenches:dead_broccoli_coral_block", DEAD_BROCCOLI_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:dead_broccoli_coral_bubbles", DEAD_BROCCOLI_CORAL_BUBBLES);
		Registry.register(BLOCK, "deep_trenches:dead_broccoli_coral_fan", DEAD_BROCCOLI_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:dead_broccoli_coral_wall_fan", DEAD_BROCCOLI_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:broccoli_coral", BROCCOLI_CORAL);
		Registry.register(BLOCK, "deep_trenches:broccoli_coral_block", BROCCOLI_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:broccoli_coral_bubbles", BROCCOLI_CORAL_BUBBLES);
		Registry.register(BLOCK, "deep_trenches:broccoli_coral_fan", BROCCOLI_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:broccoli_coral_wall_fan", BROCCOLI_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:dead_bubblegum_coral", DEAD_BUBBLEGUM_CORAL);
		Registry.register(BLOCK, "deep_trenches:dead_bubblegum_coral_block", DEAD_BUBBLEGUM_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:dead_bubblegum_coral_fan", DEAD_BUBBLEGUM_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:dead_bubblegum_coral_wall_fan", DEAD_BUBBLEGUM_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:bubblegum_coral", BUBBLEGUM_CORAL);
		Registry.register(BLOCK, "deep_trenches:bubblegum_coral_block", BUBBLEGUM_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:bubblegum_coral_fan", BUBBLEGUM_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:bubblegum_coral_wall_fan", BUBBLEGUM_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:dead_cabbage_tree_coral", DEAD_CABBAGE_TREE_CORAL);
		Registry.register(BLOCK, "deep_trenches:dead_cabbage_tree_coral_block", DEAD_CABBAGE_TREE_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:dead_cabbage_tree_coral_fan", DEAD_CABBAGE_TREE_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:dead_cabbage_tree_coral_wall_fan", DEAD_CABBAGE_TREE_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:cabbage_tree_coral", CABBAGE_TREE_CORAL);
		Registry.register(BLOCK, "deep_trenches:cabbage_tree_coral_block", CABBAGE_TREE_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:cabbage_tree_coral_fan", CABBAGE_TREE_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:cabbage_tree_coral_wall_fan", CABBAGE_TREE_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:dead_flowertube_coral", DEAD_FLOWERTUBE_CORAL);
		Registry.register(BLOCK, "deep_trenches:dead_flowertube_coral_block", DEAD_FLOWERTUBE_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:dead_flowertube_coral_fan", DEAD_FLOWERTUBE_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:dead_flowertube_coral_wall_fan", DEAD_FLOWERTUBE_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:flowertube_coral", FLOWERTUBE_CORAL);
		Registry.register(BLOCK, "deep_trenches:flowertube_coral_block", FLOWERTUBE_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:flowertube_coral_fan", FLOWERTUBE_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:flowertube_coral_wall_fan", FLOWERTUBE_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:dead_garnet_spiral_coral", DEAD_GARNET_SPIRAL_CORAL);
		Registry.register(BLOCK, "deep_trenches:dead_garnet_spiral_coral_block", DEAD_GARNET_SPIRAL_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:dead_garnet_spiral_coral_fan", DEAD_GARNET_SPIRAL_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:dead_garnet_spiral_coral_wall_fan", DEAD_GARNET_SPIRAL_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:garnet_spiral_coral", GARNET_SPIRAL_CORAL);
		Registry.register(BLOCK, "deep_trenches:garnet_spiral_coral_block", GARNET_SPIRAL_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:garnet_spiral_coral_fan", GARNET_SPIRAL_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:garnet_spiral_coral_wall_fan", GARNET_SPIRAL_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:dead_glow_forest_coral", DEAD_GLOW_FOREST_CORAL);
		Registry.register(BLOCK, "deep_trenches:dead_glow_forest_coral_block", DEAD_GLOW_FOREST_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:dead_glow_forest_coral_fan", DEAD_GLOW_FOREST_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:dead_glow_forest_coral_wall_fan", DEAD_GLOW_FOREST_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:glow_forest_coral", GLOW_FOREST_CORAL);
		Registry.register(BLOCK, "deep_trenches:glow_forest_coral_block", GLOW_FOREST_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:glow_forest_coral_fan", GLOW_FOREST_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:glow_forest_coral_wall_fan", GLOW_FOREST_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:dead_glowtongue_tube_coral", DEAD_GLOWTONGUE_TUBE_CORAL);
		Registry.register(BLOCK, "deep_trenches:dead_glowtongue_tube_coral_block", DEAD_GLOWTONGUE_TUBE_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:dead_glowtongue_tube_coral_fan", DEAD_GLOWTONGUE_TUBE_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:dead_glowtongue_tube_coral_wall_fan", DEAD_GLOWTONGUE_TUBE_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:glowtongue_tube_coral", GLOWTONGUE_TUBE_CORAL);
		Registry.register(BLOCK, "deep_trenches:glowtongue_tube_coral_block", GLOWTONGUE_TUBE_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:glowtongue_tube_coral_fan", GLOWTONGUE_TUBE_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:glowtongue_tube_coral_wall_fan", GLOWTONGUE_TUBE_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:dead_ivory_coral", DEAD_IVORY_CORAL);
		Registry.register(BLOCK, "deep_trenches:dead_ivory_coral_block", DEAD_IVORY_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:dead_ivory_coral_fan", DEAD_IVORY_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:dead_ivory_coral_wall_fan", DEAD_IVORY_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:ivory_coral", IVORY_CORAL);
		Registry.register(BLOCK, "deep_trenches:ivory_coral_block", IVORY_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:ivory_coral_fan", IVORY_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:ivory_coral_wall_fan", IVORY_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:dead_lime_brain_coral", DEAD_LIME_BRAIN_CORAL);
		Registry.register(BLOCK, "deep_trenches:dead_lime_brain_coral_block", DEAD_LIME_BRAIN_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:dead_lime_brain_coral_fan", DEAD_LIME_BRAIN_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:dead_lime_brain_coral_wall_fan", DEAD_LIME_BRAIN_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:lime_brain_coral", LIME_BRAIN_CORAL);
		Registry.register(BLOCK, "deep_trenches:lime_brain_coral_block", LIME_BRAIN_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:lime_brain_coral_fan", LIME_BRAIN_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:lime_brain_coral_wall_fan", LIME_BRAIN_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:dead_lekral_coral", DEAD_LEKRAL_CORAL);
		Registry.register(BLOCK, "deep_trenches:dead_lekral_coral_block", DEAD_LEKRAL_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:dead_lekral_coral_fan", DEAD_LEKRAL_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:dead_lekral_coral_wall_fan", DEAD_LEKRAL_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:lekral_coral", LEKRAL_CORAL);
		Registry.register(BLOCK, "deep_trenches:lekral_cluster", LEKRAL_CLUSTER);
		Registry.register(BLOCK, "deep_trenches:lekral_coral_block", LEKRAL_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:lekral_ore", LEKRAL_ORE);
		Registry.register(BLOCK, "deep_trenches:budding_lekral", BUDDING_LEKRAL);
		Registry.register(BLOCK, "deep_trenches:lekral_coral_fan", LEKRAL_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:lekral_coral_wall_fan", LEKRAL_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:dead_lophelia_coral", DEAD_LOPHELIA_CORAL);
		Registry.register(BLOCK, "deep_trenches:dead_lophelia_coral_block", DEAD_LOPHELIA_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:dead_lophelia_coral_fan", DEAD_LOPHELIA_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:dead_lophelia_coral_wall_fan", DEAD_LOPHELIA_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:lophelia_coral", LOPHELIA_CORAL);
		Registry.register(BLOCK, "deep_trenches:lophelia_coral_block", LOPHELIA_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:lophelia_coral_fan", LOPHELIA_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:lophelia_coral_wall_fan", LOPHELIA_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:dead_pipe_organ_coral", DEAD_PIPE_ORGAN_CORAL);
		Registry.register(BLOCK, "deep_trenches:dead_pipe_organ_coral_block", DEAD_PIPE_ORGAN_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:dead_pipe_organ_coral_fan", DEAD_PIPE_ORGAN_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:dead_pipe_organ_coral_wall_fan", DEAD_PIPE_ORGAN_CORAL_WALL_FAN);
		Registry.register(BLOCK, "deep_trenches:dead_pipe_organ_tentacles", DEAD_PIPE_ORGAN_TENTACLES);

		Registry.register(BLOCK, "deep_trenches:pipe_organ_coral", PIPE_ORGAN_CORAL);
		Registry.register(BLOCK, "deep_trenches:pipe_organ_coral_block", PIPE_ORGAN_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:pipe_organ_coral_fan", PIPE_ORGAN_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:pipe_organ_coral_wall_fan", PIPE_ORGAN_CORAL_WALL_FAN);
		Registry.register(BLOCK, "deep_trenches:pipe_organ_tentacles", PIPE_ORGAN_TENTACLES);

		Registry.register(BLOCK, "deep_trenches:dead_red_tree_coral", DEAD_RED_TREE_CORAL);
		Registry.register(BLOCK, "deep_trenches:dead_red_tree_coral_block", DEAD_RED_TREE_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:dead_red_tree_coral_fan", DEAD_RED_TREE_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:dead_red_tree_coral_wall_fan", DEAD_RED_TREE_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:red_tree_coral", RED_TREE_CORAL);
		Registry.register(BLOCK, "deep_trenches:red_tree_coral_block", RED_TREE_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:red_tree_coral_fan", RED_TREE_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:red_tree_coral_wall_fan", RED_TREE_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:dead_seafan_coral", DEAD_SEAFAN_CORAL);
		Registry.register(BLOCK, "deep_trenches:dead_seafan_coral_block", DEAD_SEAFAN_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:dead_seafan_coral_fan", DEAD_SEAFAN_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:dead_seafan_coral_wall_fan", DEAD_SEAFAN_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:seafan_coral", SEAFAN_CORAL);
		Registry.register(BLOCK, "deep_trenches:seafan_coral_block", SEAFAN_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:seafan_coral_fan", SEAFAN_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:seafan_coral_wall_fan", SEAFAN_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:dead_skacur_coral", DEAD_SKACUR_CORAL);
		Registry.register(BLOCK, "deep_trenches:dead_skacur_coral_block", DEAD_SKACUR_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:dead_skacur_coral_fan", DEAD_SKACUR_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:dead_skacur_coral_wall_fan", DEAD_SKACUR_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:skacur_coral", SKACUR_CORAL);
		Registry.register(BLOCK, "deep_trenches:skacur_coral_block", SKACUR_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:skacur_coral_fan", SKACUR_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:skacur_coral_wall_fan", SKACUR_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:dead_straight_willow_coral", DEAD_STRAIGHT_WILLOW_CORAL);
		Registry.register(BLOCK, "deep_trenches:dead_straight_willow_coral_block", DEAD_STRAIGHT_WILLOW_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:dead_straight_willow_coral_fan", DEAD_STRAIGHT_WILLOW_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:dead_straight_willow_coral_wall_fan", DEAD_STRAIGHT_WILLOW_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:straight_willow_coral", STRAIGHT_WILLOW_CORAL);
		Registry.register(BLOCK, "deep_trenches:straight_willow_coral_block", STRAIGHT_WILLOW_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:straight_willow_coral_fan", STRAIGHT_WILLOW_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:straight_willow_coral_wall_fan", STRAIGHT_WILLOW_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:dead_sunrise_coral", DEAD_SUNRISE_CORAL);
		Registry.register(BLOCK, "deep_trenches:dead_sunrise_coral_block", DEAD_SUNRISE_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:dead_sunrise_coral_fan", DEAD_SUNRISE_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:dead_sunrise_coral_wall_fan", DEAD_SUNRISE_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:sunrise_coral", SUNRISE_CORAL);
		Registry.register(BLOCK, "deep_trenches:sunrise_coral_block", SUNRISE_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:sunrise_coral_fan", SUNRISE_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:sunrise_coral_wall_fan", SUNRISE_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:dead_table_coral", DEAD_TABLE_CORAL);
		Registry.register(BLOCK, "deep_trenches:dead_table_coral_block", DEAD_TABLE_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:dead_table_coral_fan", DEAD_TABLE_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:dead_table_coral_wall_fan", DEAD_TABLE_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:table_coral", TABLE_CORAL);
		Registry.register(BLOCK, "deep_trenches:table_coral_block", TABLE_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:table_coral_fan", TABLE_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:table_coral_wall_fan", TABLE_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:dead_thin_blade_coral", DEAD_THIN_BLADE_CORAL);
		Registry.register(BLOCK, "deep_trenches:dead_thin_blade_coral_block", DEAD_THIN_BLADE_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:dead_thin_blade_coral_fan", DEAD_THIN_BLADE_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:dead_thin_blade_coral_wall_fan", DEAD_THIN_BLADE_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:thin_blade_coral", THIN_BLADE_CORAL);
		Registry.register(BLOCK, "deep_trenches:thin_blade_coral_block", THIN_BLADE_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:thin_blade_coral_fan", THIN_BLADE_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:thin_blade_coral_wall_fan", THIN_BLADE_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:dead_trumpetear_coral", DEAD_TRUMPETEAR_CORAL);
		Registry.register(BLOCK, "deep_trenches:dead_trumpetear_coral_block", DEAD_TRUMPETEAR_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:dead_trumpetear_coral_fan", DEAD_TRUMPETEAR_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:dead_trumpetear_coral_wall_fan", DEAD_TRUMPETEAR_CORAL_WALL_FAN);

		Registry.register(BLOCK, "deep_trenches:trumpetear_coral", TRUMPETEAR_CORAL);
		Registry.register(BLOCK, "deep_trenches:trumpetear_coral_block", TRUMPETEAR_CORAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:trumpetear_coral_fan", TRUMPETEAR_CORAL_FAN);
		Registry.register(BLOCK, "deep_trenches:trumpetear_coral_wall_fan", TRUMPETEAR_CORAL_WALL_FAN);

		/* WOOD */
		Registry.register(BLOCK, "deep_trenches:almond_button", ALMOND_BUTTON);
		Registry.register(BLOCK, "deep_trenches:almond_door", ALMOND_DOOR);
		Registry.register(BLOCK, "deep_trenches:almond_fence", ALMOND_FENCE);
		Registry.register(BLOCK, "deep_trenches:almond_fence_gate", ALMOND_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:almond_leaves", ALMOND_LEAVES);
		Registry.register(BLOCK, "deep_trenches:almond_log", ALMOND_LOG);
		Registry.register(BLOCK, "deep_trenches:almond_planks", ALMOND_PLANKS);
		Registry.register(BLOCK, "deep_trenches:almond_pressure_plate", ALMOND_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:almond_sapling", ALMOND_SAPLING);
		Registry.register(BLOCK, "deep_trenches:almond_sign", ALMOND_SIGN);
		Registry.register(BLOCK, "deep_trenches:almond_slab", ALMOND_SLAB);
		Registry.register(BLOCK, "deep_trenches:almond_stairs", ALMOND_STAIRS);
		Registry.register(BLOCK, "deep_trenches:almond_trapdoor", ALMOND_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:almond_wall_sign", ALMOND_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:almond_wood", ALMOND_WOOD);

		Registry.register(BLOCK, "deep_trenches:anameata_button", ANAMEATA_BUTTON);
		Registry.register(BLOCK, "deep_trenches:anameata_door", ANAMEATA_DOOR);
		Registry.register(BLOCK, "deep_trenches:anameata_fence", ANAMEATA_FENCE);
		Registry.register(BLOCK, "deep_trenches:anameata_fence_gate", ANAMEATA_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:anameata_cap", ANAMEATA_CAP);
		Registry.register(BLOCK, "deep_trenches:anameata_log", ANAMEATA_LOG);
		Registry.register(BLOCK, "deep_trenches:anameata_planks", ANAMEATA_PLANKS);
		Registry.register(BLOCK, "deep_trenches:anameata_pressure_plate", ANAMEATA_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:anameata_sapling", ANAMEATA_SAPLING);
		Registry.register(BLOCK, "deep_trenches:anameata_sign", ANAMEATA_SIGN);
		Registry.register(BLOCK, "deep_trenches:anameata_slab", ANAMEATA_SLAB);
		Registry.register(BLOCK, "deep_trenches:anameata_stairs", ANAMEATA_STAIRS);
		Registry.register(BLOCK, "deep_trenches:anameata_trapdoor", ANAMEATA_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:anameata_wall_sign", ANAMEATA_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:anameata_wood", ANAMEATA_WOOD);

		Registry.register(BLOCK, "deep_trenches:angels_trumpet_button", ANGELS_TRUMPET_BUTTON);
		Registry.register(BLOCK, "deep_trenches:angels_trumpet_door", ANGELS_TRUMPET_DOOR);
		Registry.register(BLOCK, "deep_trenches:angels_trumpet_fence", ANGELS_TRUMPET_FENCE);
		Registry.register(BLOCK, "deep_trenches:angels_trumpet_fence_gate", ANGELS_TRUMPET_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:angels_trumpet_leaves", ANGELS_TRUMPET_LEAVES);
		Registry.register(BLOCK, "deep_trenches:angels_trumpet_log", ANGELS_TRUMPET_LOG);
		Registry.register(BLOCK, "deep_trenches:angels_trumpet_planks", ANGELS_TRUMPET_PLANKS);
		Registry.register(BLOCK, "deep_trenches:angels_trumpet_pressure_plate", ANGELS_TRUMPET_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:angels_trumpet_sapling", ANGELS_TRUMPET_SAPLING);
		Registry.register(BLOCK, "deep_trenches:angels_trumpet_sign", ANGELS_TRUMPET_SIGN);
		Registry.register(BLOCK, "deep_trenches:angels_trumpet_slab", ANGELS_TRUMPET_SLAB);
		Registry.register(BLOCK, "deep_trenches:angels_trumpet_stairs", ANGELS_TRUMPET_STAIRS);
		Registry.register(BLOCK, "deep_trenches:angels_trumpet_trapdoor", ANGELS_TRUMPET_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:angels_trumpet_wall_sign", ANGELS_TRUMPET_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:angels_trumpet_wood", ANGELS_TRUMPET_WOOD);

		Registry.register(BLOCK, "deep_trenches:aquean_button", AQUEAN_BUTTON);
		Registry.register(BLOCK, "deep_trenches:aquean_door", AQUEAN_DOOR);
		Registry.register(BLOCK, "deep_trenches:aquean_fence", AQUEAN_FENCE);
		Registry.register(BLOCK, "deep_trenches:aquean_fence_gate", AQUEAN_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:aquean_leaves", AQUEAN_LEAVES);
		Registry.register(BLOCK, "deep_trenches:aquean_log", AQUEAN_LOG);
		Registry.register(BLOCK, "deep_trenches:aquean_planks", AQUEAN_PLANKS);
		Registry.register(BLOCK, "deep_trenches:aquean_pressure_plate", AQUEAN_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:aquean_sapling", AQUEAN_SAPLING);
		Registry.register(BLOCK, "deep_trenches:aquean_sign", AQUEAN_SIGN);
		Registry.register(BLOCK, "deep_trenches:aquean_slab", AQUEAN_SLAB);
		Registry.register(BLOCK, "deep_trenches:aquean_stairs", AQUEAN_STAIRS);
		Registry.register(BLOCK, "deep_trenches:aquean_trapdoor", AQUEAN_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:aquean_wall_sign", AQUEAN_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:aquean_wood", AQUEAN_WOOD);

		Registry.register(BLOCK, "deep_trenches:barshrookle_button", BARSHROOKLE_BUTTON);
		Registry.register(BLOCK, "deep_trenches:barshrookle_door", BARSHROOKLE_DOOR);
		Registry.register(BLOCK, "deep_trenches:barshrookle_fence", BARSHROOKLE_FENCE);
		Registry.register(BLOCK, "deep_trenches:barshrookle_fence_gate", BARSHROOKLE_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:barshrookle_cap", BARSHROOKLE_CAP);
		Registry.register(BLOCK, "deep_trenches:barshrookle_log", BARSHROOKLE_LOG);
		Registry.register(BLOCK, "deep_trenches:barshrookle_planks", BARSHROOKLE_PLANKS);
		Registry.register(BLOCK, "deep_trenches:barshrookle_pressure_plate", BARSHROOKLE_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:barshrookle_sapling", BARSHROOKLE_SAPLING);
		Registry.register(BLOCK, "deep_trenches:barshrookle_sign", BARSHROOKLE_SIGN);
		Registry.register(BLOCK, "deep_trenches:barshrookle_slab", BARSHROOKLE_SLAB);
		Registry.register(BLOCK, "deep_trenches:barshrookle_stairs", BARSHROOKLE_STAIRS);
		Registry.register(BLOCK, "deep_trenches:barshrookle_trapdoor", BARSHROOKLE_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:barshrookle_wall_sign", BARSHROOKLE_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:barshrookle_wood", BARSHROOKLE_WOOD);

		Registry.register(BLOCK, "deep_trenches:black_birch_button", BLACK_BIRCH_BUTTON);
		Registry.register(BLOCK, "deep_trenches:black_birch_door", BLACK_BIRCH_DOOR);
		Registry.register(BLOCK, "deep_trenches:black_birch_fence", BLACK_BIRCH_FENCE);
		Registry.register(BLOCK, "deep_trenches:black_birch_fence_gate", BLACK_BIRCH_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:black_birch_leaves", BLACK_BIRCH_LEAVES);
		Registry.register(BLOCK, "deep_trenches:black_birch_log", BLACK_BIRCH_LOG);
		Registry.register(BLOCK, "deep_trenches:black_birch_planks", BLACK_BIRCH_PLANKS);
		Registry.register(BLOCK, "deep_trenches:black_birch_pressure_plate", BLACK_BIRCH_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:black_birch_sapling", BLACK_BIRCH_SAPLING);
		Registry.register(BLOCK, "deep_trenches:black_birch_sign", BLACK_BIRCH_SIGN);
		Registry.register(BLOCK, "deep_trenches:black_birch_slab", BLACK_BIRCH_SLAB);
		Registry.register(BLOCK, "deep_trenches:black_birch_stairs", BLACK_BIRCH_STAIRS);
		Registry.register(BLOCK, "deep_trenches:black_birch_trapdoor", BLACK_BIRCH_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:black_birch_wall_sign", BLACK_BIRCH_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:black_birch_wood", BLACK_BIRCH_WOOD);

		Registry.register(BLOCK, "deep_trenches:blue_mahoe_button", BLUE_MAHOE_BUTTON);
		Registry.register(BLOCK, "deep_trenches:blue_mahoe_door", BLUE_MAHOE_DOOR);
		Registry.register(BLOCK, "deep_trenches:blue_mahoe_fence", BLUE_MAHOE_FENCE);
		Registry.register(BLOCK, "deep_trenches:blue_mahoe_fence_gate", BLUE_MAHOE_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:blue_mahoe_flower", BLUE_MAHOE_FLOWER);
		Registry.register(BLOCK, "deep_trenches:blue_mahoe_leaves", BLUE_MAHOE_LEAVES);
		Registry.register(BLOCK, "deep_trenches:blue_mahoe_log", BLUE_MAHOE_LOG);
		Registry.register(BLOCK, "deep_trenches:blue_mahoe_planks", BLUE_MAHOE_PLANKS);
		Registry.register(BLOCK, "deep_trenches:blue_mahoe_pressure_plate", BLUE_MAHOE_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:blue_mahoe_sapling", BLUE_MAHOE_SAPLING);
		Registry.register(BLOCK, "deep_trenches:blue_mahoe_sign", BLUE_MAHOE_SIGN);
		Registry.register(BLOCK, "deep_trenches:blue_mahoe_slab", BLUE_MAHOE_SLAB);
		Registry.register(BLOCK, "deep_trenches:blue_mahoe_stairs", BLUE_MAHOE_STAIRS);
		Registry.register(BLOCK, "deep_trenches:blue_mahoe_trapdoor", BLUE_MAHOE_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:blue_mahoe_wall_sign", BLUE_MAHOE_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:blue_mahoe_wood", BLUE_MAHOE_WOOD);

		Registry.register(BLOCK, "deep_trenches:blue_spruce_button", BLUE_SPRUCE_BUTTON);
		Registry.register(BLOCK, "deep_trenches:blue_spruce_door", BLUE_SPRUCE_DOOR);
		Registry.register(BLOCK, "deep_trenches:blue_spruce_fence", BLUE_SPRUCE_FENCE);
		Registry.register(BLOCK, "deep_trenches:blue_spruce_fence_gate", BLUE_SPRUCE_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:blue_spruce_leaves", BLUE_SPRUCE_LEAVES);
		Registry.register(BLOCK, "deep_trenches:blue_spruce_log", BLUE_SPRUCE_LOG);
		Registry.register(BLOCK, "deep_trenches:blue_spruce_planks", BLUE_SPRUCE_PLANKS);
		Registry.register(BLOCK, "deep_trenches:blue_spruce_pressure_plate", BLUE_SPRUCE_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:blue_spruce_sapling", BLUE_SPRUCE_SAPLING);
		Registry.register(BLOCK, "deep_trenches:blue_spruce_sign", BLUE_SPRUCE_SIGN);
		Registry.register(BLOCK, "deep_trenches:blue_spruce_slab", BLUE_SPRUCE_SLAB);
		Registry.register(BLOCK, "deep_trenches:blue_spruce_stairs", BLUE_SPRUCE_STAIRS);
		Registry.register(BLOCK, "deep_trenches:blue_spruce_trapdoor", BLUE_SPRUCE_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:blue_spruce_wall_sign", BLUE_SPRUCE_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:blue_spruce_wood", BLUE_SPRUCE_WOOD);

		Registry.register(BLOCK, "deep_trenches:bottlebrush_button", BOTTLEBRUSH_BUTTON);
		Registry.register(BLOCK, "deep_trenches:bottlebrush_door", BOTTLEBRUSH_DOOR);
		Registry.register(BLOCK, "deep_trenches:bottlebrush_fence", BOTTLEBRUSH_FENCE);
		Registry.register(BLOCK, "deep_trenches:bottlebrush_fence_gate", BOTTLEBRUSH_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:bottlebrush_flowers", BOTTLEBRUSH_FLOWERS);
		Registry.register(BLOCK, "deep_trenches:bottlebrush_leaves", BOTTLEBRUSH_LEAVES);
		Registry.register(BLOCK, "deep_trenches:bottlebrush_log", BOTTLEBRUSH_LOG);
		Registry.register(BLOCK, "deep_trenches:bottlebrush_planks", BOTTLEBRUSH_PLANKS);
		Registry.register(BLOCK, "deep_trenches:bottlebrush_pressure_plate", BOTTLEBRUSH_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:bottlebrush_sapling", BOTTLEBRUSH_SAPLING);
		Registry.register(BLOCK, "deep_trenches:bottlebrush_sign", BOTTLEBRUSH_SIGN);
		Registry.register(BLOCK, "deep_trenches:bottlebrush_slab", BOTTLEBRUSH_SLAB);
		Registry.register(BLOCK, "deep_trenches:bottlebrush_stairs", BOTTLEBRUSH_STAIRS);
		Registry.register(BLOCK, "deep_trenches:bottlebrush_trapdoor", BOTTLEBRUSH_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:bottlebrush_wall_sign", BOTTLEBRUSH_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:bottlebrush_wood", BOTTLEBRUSH_WOOD);

		Registry.register(BLOCK, "deep_trenches:bromya_button", BROMYA_BUTTON);
		Registry.register(BLOCK, "deep_trenches:bromya_door", BROMYA_DOOR);
		Registry.register(BLOCK, "deep_trenches:bromya_fence", BROMYA_FENCE);
		Registry.register(BLOCK, "deep_trenches:bromya_fence_gate", BROMYA_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:bromya_flower", BROMYA_FLOWER);
		Registry.register(BLOCK, "deep_trenches:bromya_leaves", BROMYA_LEAVES);
		Registry.register(BLOCK, "deep_trenches:bromya_log", BROMYA_LOG);
		Registry.register(BLOCK, "deep_trenches:bromya_planks", BROMYA_PLANKS);
		Registry.register(BLOCK, "deep_trenches:bromya_pressure_plate", BROMYA_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:bromya_sapling", BROMYA_SAPLING);
		Registry.register(BLOCK, "deep_trenches:bromya_sign", BROMYA_SIGN);
		Registry.register(BLOCK, "deep_trenches:bromya_slab", BROMYA_SLAB);
		Registry.register(BLOCK, "deep_trenches:bromya_stairs", BROMYA_STAIRS);
		Registry.register(BLOCK, "deep_trenches:bromya_trapdoor", BROMYA_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:bromya_wall_sign", BROMYA_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:bromya_wood", BROMYA_WOOD);

		Registry.register(BLOCK, "deep_trenches:bubbletree_button", BUBBLETREE_BUTTON);
		Registry.register(BLOCK, "deep_trenches:bubbletree_door", BUBBLETREE_DOOR);
		Registry.register(BLOCK, "deep_trenches:bubbletree_fence", BUBBLETREE_FENCE);
		Registry.register(BLOCK, "deep_trenches:bubbletree_fence_gate", BUBBLETREE_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:bubbletree_bubbles", BUBBLETREE_BUBBLES);
		Registry.register(BLOCK, "deep_trenches:bubbletree_log", BUBBLETREE_LOG);
		Registry.register(BLOCK, "deep_trenches:bubbletree_planks", BUBBLETREE_PLANKS);
		Registry.register(BLOCK, "deep_trenches:bubbletree_pressure_plate", BUBBLETREE_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:bubbletree_sapling", BUBBLETREE_SAPLING);
		Registry.register(BLOCK, "deep_trenches:bubbletree_sign", BUBBLETREE_SIGN);
		Registry.register(BLOCK, "deep_trenches:bubbletree_slab", BUBBLETREE_SLAB);
		Registry.register(BLOCK, "deep_trenches:bubbletree_stairs", BUBBLETREE_STAIRS);
		Registry.register(BLOCK, "deep_trenches:bubbletree_trapdoor", BUBBLETREE_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:bubbletree_wall_sign", BUBBLETREE_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:bubbletree_wood", BUBBLETREE_WOOD);

		Registry.register(BLOCK, "deep_trenches:calcearb_button", CALCEARB_BUTTON);
		Registry.register(BLOCK, "deep_trenches:calcearb_door", CALCEARB_DOOR);
		Registry.register(BLOCK, "deep_trenches:calcearb_fence", CALCEARB_FENCE);
		Registry.register(BLOCK, "deep_trenches:calcearb_fence_gate", CALCEARB_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:calcearb_leaves", CALCEARB_LEAVES);
		Registry.register(BLOCK, "deep_trenches:calcearb_log", CALCEARB_LOG);
		Registry.register(BLOCK, "deep_trenches:calcearb_planks", CALCEARB_PLANKS);
		Registry.register(BLOCK, "deep_trenches:calcearb_pressure_plate", CALCEARB_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:calcearb_sapling", CALCEARB_SAPLING);
		Registry.register(BLOCK, "deep_trenches:calcearb_sign", CALCEARB_SIGN);
		Registry.register(BLOCK, "deep_trenches:calcearb_slab", CALCEARB_SLAB);
		Registry.register(BLOCK, "deep_trenches:calcearb_stairs", CALCEARB_STAIRS);
		Registry.register(BLOCK, "deep_trenches:calcearb_trapdoor", CALCEARB_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:calcearb_wall_sign", CALCEARB_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:calcearb_wood", CALCEARB_WOOD);

		Registry.register(BLOCK, "deep_trenches:cherry_button", CHERRY_BUTTON);
		Registry.register(BLOCK, "deep_trenches:cherry_door", CHERRY_DOOR);
		Registry.register(BLOCK, "deep_trenches:cherry_fence", CHERRY_FENCE);
		Registry.register(BLOCK, "deep_trenches:cherry_fence_gate", CHERRY_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:cherry_leaves", CHERRY_LEAVES);
		Registry.register(BLOCK, "deep_trenches:cherry_log", CHERRY_LOG);
		Registry.register(BLOCK, "deep_trenches:cherry_planks", CHERRY_PLANKS);
		Registry.register(BLOCK, "deep_trenches:cherry_pressure_plate", CHERRY_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:cherry_sapling", CHERRY_SAPLING);
		Registry.register(BLOCK, "deep_trenches:cherry_sign", CHERRY_SIGN);
		Registry.register(BLOCK, "deep_trenches:cherry_slab", CHERRY_SLAB);
		Registry.register(BLOCK, "deep_trenches:cherry_stairs", CHERRY_STAIRS);
		Registry.register(BLOCK, "deep_trenches:cherry_trapdoor", CHERRY_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:cherry_wall_sign", CHERRY_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:cherry_wood", CHERRY_WOOD);

		Registry.register(BLOCK, "deep_trenches:chotorn_button", CHOTORN_BUTTON);
		Registry.register(BLOCK, "deep_trenches:chotorn_door", CHOTORN_DOOR);
		Registry.register(BLOCK, "deep_trenches:chotorn_fence", CHOTORN_FENCE);
		Registry.register(BLOCK, "deep_trenches:chotorn_fence_gate", CHOTORN_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:chotorn_log", CHOTORN_LOG);
		Registry.register(BLOCK, "deep_trenches:chotorn_planks", CHOTORN_PLANKS);
		Registry.register(BLOCK, "deep_trenches:chotorn_pressure_plate", CHOTORN_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:chotorn", CHOTORN);
		Registry.register(BLOCK, "deep_trenches:chotorn_sign", CHOTORN_SIGN);
		Registry.register(BLOCK, "deep_trenches:chotorn_slab", CHOTORN_SLAB);
		Registry.register(BLOCK, "deep_trenches:chotorn_stairs", CHOTORN_STAIRS);
		Registry.register(BLOCK, "deep_trenches:chotorn_trapdoor", CHOTORN_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:chotorn_wall_sign", CHOTORN_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:chotorn_wood", CHOTORN_WOOD);

		Registry.register(BLOCK, "deep_trenches:cook_pine_button", COOK_PINE_BUTTON);
		Registry.register(BLOCK, "deep_trenches:cook_pine_door", COOK_PINE_DOOR);
		Registry.register(BLOCK, "deep_trenches:cook_pine_fence", COOK_PINE_FENCE);
		Registry.register(BLOCK, "deep_trenches:cook_pine_fence_gate", COOK_PINE_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:cook_pine_leaves", COOK_PINE_LEAVES);
		Registry.register(BLOCK, "deep_trenches:cook_pine_log", COOK_PINE_LOG);
		Registry.register(BLOCK, "deep_trenches:cook_pine_planks", COOK_PINE_PLANKS);
		Registry.register(BLOCK, "deep_trenches:cook_pine_pressure_plate", COOK_PINE_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:cook_pine_sapling", COOK_PINE_SAPLING);
		Registry.register(BLOCK, "deep_trenches:cook_pine_sign", COOK_PINE_SIGN);
		Registry.register(BLOCK, "deep_trenches:cook_pine_slab", COOK_PINE_SLAB);
		Registry.register(BLOCK, "deep_trenches:cook_pine_stairs", COOK_PINE_STAIRS);
		Registry.register(BLOCK, "deep_trenches:cook_pine_trapdoor", COOK_PINE_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:cook_pine_wall_sign", COOK_PINE_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:cook_pine_wood", COOK_PINE_WOOD);

		Registry.register(BLOCK, "deep_trenches:crolood_button", CROLOOD_BUTTON);
		Registry.register(BLOCK, "deep_trenches:crolood_door", CROLOOD_DOOR);
		Registry.register(BLOCK, "deep_trenches:crolood_fence", CROLOOD_FENCE);
		Registry.register(BLOCK, "deep_trenches:crolood_fence_gate", CROLOOD_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:crolood_leaves", CROLOOD_LEAVES);
		Registry.register(BLOCK, "deep_trenches:crolood_log", CROLOOD_LOG);
		Registry.register(BLOCK, "deep_trenches:crolood_planks", CROLOOD_PLANKS);
		Registry.register(BLOCK, "deep_trenches:crolood_pressure_plate", CROLOOD_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:crolood_sapling", CROLOOD_SAPLING);
		Registry.register(BLOCK, "deep_trenches:crolood_sign", CROLOOD_SIGN);
		Registry.register(BLOCK, "deep_trenches:crolood_slab", CROLOOD_SLAB);
		Registry.register(BLOCK, "deep_trenches:crolood_stairs", CROLOOD_STAIRS);
		Registry.register(BLOCK, "deep_trenches:crolood_trapdoor", CROLOOD_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:crolood_wall_sign", CROLOOD_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:crolood_wood", CROLOOD_WOOD);

		Registry.register(BLOCK, "deep_trenches:dark_crolood_button", DARK_CROLOOD_BUTTON);
		Registry.register(BLOCK, "deep_trenches:dark_crolood_door", DARK_CROLOOD_DOOR);
		Registry.register(BLOCK, "deep_trenches:dark_crolood_fence", DARK_CROLOOD_FENCE);
		Registry.register(BLOCK, "deep_trenches:dark_crolood_fence_gate", DARK_CROLOOD_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:dark_crolood_leaves", DARK_CROLOOD_LEAVES);
		Registry.register(BLOCK, "deep_trenches:dark_crolood_log", DARK_CROLOOD_LOG);
		Registry.register(BLOCK, "deep_trenches:dark_crolood_planks", DARK_CROLOOD_PLANKS);
		Registry.register(BLOCK, "deep_trenches:dark_crolood_pressure_plate", DARK_CROLOOD_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:dark_crolood_sapling", DARK_CROLOOD_SAPLING);
		Registry.register(BLOCK, "deep_trenches:dark_crolood_sign", DARK_CROLOOD_SIGN);
		Registry.register(BLOCK, "deep_trenches:dark_crolood_slab", DARK_CROLOOD_SLAB);
		Registry.register(BLOCK, "deep_trenches:dark_crolood_stairs", DARK_CROLOOD_STAIRS);
		Registry.register(BLOCK, "deep_trenches:dark_crolood_trapdoor", DARK_CROLOOD_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:dark_crolood_wall_sign", DARK_CROLOOD_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:dark_crolood_wood", DARK_CROLOOD_WOOD);

		Registry.register(BLOCK, "deep_trenches:dark_fuchsitra_button", DARK_FUCHSITRA_BUTTON);
		Registry.register(BLOCK, "deep_trenches:dark_fuchsitra_door", DARK_FUCHSITRA_DOOR);
		Registry.register(BLOCK, "deep_trenches:dark_fuchsitra_fence", DARK_FUCHSITRA_FENCE);
		Registry.register(BLOCK, "deep_trenches:dark_fuchsitra_fence_gate", DARK_FUCHSITRA_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:dark_fuchsitra_leaves", DARK_FUCHSITRA_LEAVES);
		Registry.register(BLOCK, "deep_trenches:dark_fuchsitra_log", DARK_FUCHSITRA_LOG);
		Registry.register(BLOCK, "deep_trenches:dark_fuchsitra_planks", DARK_FUCHSITRA_PLANKS);
		Registry.register(BLOCK, "deep_trenches:dark_fuchsitra_pressure_plate", DARK_FUCHSITRA_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:dark_fuchsitra_sapling", DARK_FUCHSITRA_SAPLING);
		Registry.register(BLOCK, "deep_trenches:dark_fuchsitra_sign", DARK_FUCHSITRA_SIGN);
		Registry.register(BLOCK, "deep_trenches:dark_fuchsitra_slab", DARK_FUCHSITRA_SLAB);
		Registry.register(BLOCK, "deep_trenches:dark_fuchsitra_stairs", DARK_FUCHSITRA_STAIRS);
		Registry.register(BLOCK, "deep_trenches:dark_fuchsitra_trapdoor", DARK_FUCHSITRA_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:dark_fuchsitra_wall_sign", DARK_FUCHSITRA_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:dark_fuchsitra_wood", DARK_FUCHSITRA_WOOD);

		Registry.register(BLOCK, "deep_trenches:dark_red_elm_button", DARK_RED_ELM_BUTTON);
		Registry.register(BLOCK, "deep_trenches:dark_red_elm_door", DARK_RED_ELM_DOOR);
		Registry.register(BLOCK, "deep_trenches:dark_red_elm_fence", DARK_RED_ELM_FENCE);
		Registry.register(BLOCK, "deep_trenches:dark_red_elm_fence_gate", DARK_RED_ELM_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:dark_red_elm_leaves", DARK_RED_ELM_LEAVES);
		Registry.register(BLOCK, "deep_trenches:dark_red_elm_log", DARK_RED_ELM_LOG);
		Registry.register(BLOCK, "deep_trenches:dark_red_elm_planks", DARK_RED_ELM_PLANKS);
		Registry.register(BLOCK, "deep_trenches:dark_red_elm_pressure_plate", DARK_RED_ELM_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:dark_red_elm_sapling", DARK_RED_ELM_SAPLING);
		Registry.register(BLOCK, "deep_trenches:dark_red_elm_sign", DARK_RED_ELM_SIGN);
		Registry.register(BLOCK, "deep_trenches:dark_red_elm_slab", DARK_RED_ELM_SLAB);
		Registry.register(BLOCK, "deep_trenches:dark_red_elm_stairs", DARK_RED_ELM_STAIRS);
		Registry.register(BLOCK, "deep_trenches:dark_red_elm_trapdoor", DARK_RED_ELM_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:dark_red_elm_wall_sign", DARK_RED_ELM_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:dark_red_elm_wood", DARK_RED_ELM_WOOD);

		Registry.register(BLOCK, "deep_trenches:dead_wart_tree_button", DEAD_WART_TREE_BUTTON);
		Registry.register(BLOCK, "deep_trenches:dead_wart_tree_door", DEAD_WART_TREE_DOOR);
		Registry.register(BLOCK, "deep_trenches:dead_wart_tree_fence", DEAD_WART_TREE_FENCE);
		Registry.register(BLOCK, "deep_trenches:dead_wart_tree_fence_gate", DEAD_WART_TREE_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:dead_wart_tree_log", DEAD_WART_TREE_LOG);
		Registry.register(BLOCK, "deep_trenches:dead_wart_tree_planks", DEAD_WART_TREE_PLANKS);
		Registry.register(BLOCK, "deep_trenches:dead_wart_tree_pressure_plate", DEAD_WART_TREE_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:dead_wart_tree_sign", DEAD_WART_TREE_SIGN);
		Registry.register(BLOCK, "deep_trenches:dead_wart_tree_slab", DEAD_WART_TREE_SLAB);
		Registry.register(BLOCK, "deep_trenches:dead_wart_tree_stairs", DEAD_WART_TREE_STAIRS);
		Registry.register(BLOCK, "deep_trenches:dead_wart_tree_trapdoor", DEAD_WART_TREE_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:dead_wart_tree_wall_sign", DEAD_WART_TREE_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:dead_wart_tree_wood", DEAD_WART_TREE_WOOD);

		Registry.register(BLOCK, "deep_trenches:drigyus_button", DRIGYUS_BUTTON);
		Registry.register(BLOCK, "deep_trenches:drigyus_door", DRIGYUS_DOOR);
		Registry.register(BLOCK, "deep_trenches:drigyus_fence", DRIGYUS_FENCE);
		Registry.register(BLOCK, "deep_trenches:drigyus_fence_gate", DRIGYUS_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:drigyus_log", DRIGYUS_LOG);
		Registry.register(BLOCK, "deep_trenches:drigyus_planks", DRIGYUS_PLANKS);
		Registry.register(BLOCK, "deep_trenches:drigyus_pressure_plate", DRIGYUS_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:drigyus", DRIGYUS);
		Registry.register(BLOCK, "deep_trenches:drigyus_sign", DRIGYUS_SIGN);
		Registry.register(BLOCK, "deep_trenches:drigyus_slab", DRIGYUS_SLAB);
		Registry.register(BLOCK, "deep_trenches:drigyus_stairs", DRIGYUS_STAIRS);
		Registry.register(BLOCK, "deep_trenches:drigyus_trapdoor", DRIGYUS_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:drigyus_wall_sign", DRIGYUS_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:drigyus_wood", DRIGYUS_WOOD);

		Registry.register(BLOCK, "deep_trenches:ebony_button", EBONY_BUTTON);
		Registry.register(BLOCK, "deep_trenches:ebony_door", EBONY_DOOR);
		Registry.register(BLOCK, "deep_trenches:ebony_fence", EBONY_FENCE);
		Registry.register(BLOCK, "deep_trenches:ebony_fence_gate", EBONY_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:ebony_leaves", EBONY_LEAVES);
		Registry.register(BLOCK, "deep_trenches:ebony_log", EBONY_LOG);
		Registry.register(BLOCK, "deep_trenches:ebony_planks", EBONY_PLANKS);
		Registry.register(BLOCK, "deep_trenches:ebony_pressure_plate", EBONY_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:ebony_sapling", EBONY_SAPLING);
		Registry.register(BLOCK, "deep_trenches:ebony_sign", EBONY_SIGN);
		Registry.register(BLOCK, "deep_trenches:ebony_slab", EBONY_SLAB);
		Registry.register(BLOCK, "deep_trenches:ebony_stairs", EBONY_STAIRS);
		Registry.register(BLOCK, "deep_trenches:ebony_trapdoor", EBONY_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:ebony_wall_sign", EBONY_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:ebony_wood", EBONY_WOOD);

		Registry.register(BLOCK, "deep_trenches:enderheart_button", ENDERHEART_BUTTON);
		Registry.register(BLOCK, "deep_trenches:enderheart_door", ENDERHEART_DOOR);
		Registry.register(BLOCK, "deep_trenches:enderheart_fence", ENDERHEART_FENCE);
		Registry.register(BLOCK, "deep_trenches:enderheart_fence_gate", ENDERHEART_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:enderheart_leaves", ENDERHEART_LEAVES);
		Registry.register(BLOCK, "deep_trenches:enderheart_log", ENDERHEART_LOG);
		Registry.register(BLOCK, "deep_trenches:enderheart_planks", ENDERHEART_PLANKS);
		Registry.register(BLOCK, "deep_trenches:enderheart_pressure_plate", ENDERHEART_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:enderheart_sapling", ENDERHEART_SAPLING);
		Registry.register(BLOCK, "deep_trenches:enderheart_sign", ENDERHEART_SIGN);
		Registry.register(BLOCK, "deep_trenches:enderheart_slab", ENDERHEART_SLAB);
		Registry.register(BLOCK, "deep_trenches:enderheart_stairs", ENDERHEART_STAIRS);
		Registry.register(BLOCK, "deep_trenches:enderheart_trapdoor", ENDERHEART_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:enderheart_wall_sign", ENDERHEART_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:enderheart_wood", ENDERHEART_WOOD);

		Registry.register(BLOCK, "deep_trenches:flalm_button", FLALM_BUTTON);
		Registry.register(BLOCK, "deep_trenches:flalm_door", FLALM_DOOR);
		Registry.register(BLOCK, "deep_trenches:flalm_fence", FLALM_FENCE);
		Registry.register(BLOCK, "deep_trenches:flalm_fence_gate", FLALM_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:flalm_petal_block", FLALM_PETAL_BLOCK);
		Registry.register(BLOCK, "deep_trenches:flalm_planks", FLALM_PLANKS);
		Registry.register(BLOCK, "deep_trenches:flalm_pressure_plate", FLALM_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:flalm", FLALM);
		Registry.register(BLOCK, "deep_trenches:flalm_sign", FLALM_SIGN);
		Registry.register(BLOCK, "deep_trenches:flalm_slab", FLALM_SLAB);
		Registry.register(BLOCK, "deep_trenches:flalm_stairs", FLALM_STAIRS);
		Registry.register(BLOCK, "deep_trenches:flalm_stem", FLALM_STEM);
		Registry.register(BLOCK, "deep_trenches:flalm_thorns", FLALM_THORNS);
		Registry.register(BLOCK, "deep_trenches:flalm_trapdoor", FLALM_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:flalm_wall_sign", FLALM_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:flalm_wood", FLALM_WOOD);

		Registry.register(BLOCK, "deep_trenches:fruce_button", FRUCE_BUTTON);
		Registry.register(BLOCK, "deep_trenches:fruce_door", FRUCE_DOOR);
		Registry.register(BLOCK, "deep_trenches:fruce_fence", FRUCE_FENCE);
		Registry.register(BLOCK, "deep_trenches:fruce_fence_gate", FRUCE_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:fruce_leaves", FRUCE_LEAVES);
		Registry.register(BLOCK, "deep_trenches:fruce_log", FRUCE_LOG);
		Registry.register(BLOCK, "deep_trenches:fruce_planks", FRUCE_PLANKS);
		Registry.register(BLOCK, "deep_trenches:fruce_pressure_plate", FRUCE_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:fruce_sapling", FRUCE_SAPLING);
		Registry.register(BLOCK, "deep_trenches:fruce_sign", FRUCE_SIGN);
		Registry.register(BLOCK, "deep_trenches:fruce_slab", FRUCE_SLAB);
		Registry.register(BLOCK, "deep_trenches:fruce_stairs", FRUCE_STAIRS);
		Registry.register(BLOCK, "deep_trenches:fruce_trapdoor", FRUCE_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:fruce_wall_sign", FRUCE_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:fruce_wood", FRUCE_WOOD);

		Registry.register(BLOCK, "deep_trenches:fuchsitra_button", FUCHSITRA_BUTTON);
		Registry.register(BLOCK, "deep_trenches:fuchsitra_door", FUCHSITRA_DOOR);
		Registry.register(BLOCK, "deep_trenches:fuchsitra_fence", FUCHSITRA_FENCE);
		Registry.register(BLOCK, "deep_trenches:fuchsitra_fence_gate", FUCHSITRA_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:fuchsitra_leaves", FUCHSITRA_LEAVES);
		Registry.register(BLOCK, "deep_trenches:fuchsitra_log", FUCHSITRA_LOG);
		Registry.register(BLOCK, "deep_trenches:fuchsitra_planks", FUCHSITRA_PLANKS);
		Registry.register(BLOCK, "deep_trenches:fuchsitra_pressure_plate", FUCHSITRA_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:fuchsitra_sapling", FUCHSITRA_SAPLING);
		Registry.register(BLOCK, "deep_trenches:fuchsitra_sign", FUCHSITRA_SIGN);
		Registry.register(BLOCK, "deep_trenches:fuchsitra_slab", FUCHSITRA_SLAB);
		Registry.register(BLOCK, "deep_trenches:fuchsitra_stairs", FUCHSITRA_STAIRS);
		Registry.register(BLOCK, "deep_trenches:fuchsitra_trapdoor", FUCHSITRA_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:fuchsitra_wall_sign", FUCHSITRA_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:fuchsitra_wood", FUCHSITRA_WOOD);

		Registry.register(BLOCK, "deep_trenches:fugmos_button", FUGMOS_BUTTON);
		Registry.register(BLOCK, "deep_trenches:fugmos_door", FUGMOS_DOOR);
		Registry.register(BLOCK, "deep_trenches:fugmos_fence", FUGMOS_FENCE);
		Registry.register(BLOCK, "deep_trenches:fugmos_fence_gate", FUGMOS_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:fugmos_moss", FUGMOS_MOSS);
		Registry.register(BLOCK, "deep_trenches:fugmos_stem", FUGMOS_STEM);
		Registry.register(BLOCK, "deep_trenches:fugmos_planks", FUGMOS_PLANKS);
		Registry.register(BLOCK, "deep_trenches:fugmos_pressure_plate", FUGMOS_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:fugmos", FUGMOS);
		Registry.register(BLOCK, "deep_trenches:fugmos_sign", FUGMOS_SIGN);
		Registry.register(BLOCK, "deep_trenches:fugmos_slab", FUGMOS_SLAB);
		Registry.register(BLOCK, "deep_trenches:fugmos_stairs", FUGMOS_STAIRS);
		Registry.register(BLOCK, "deep_trenches:fugmos_trapdoor", FUGMOS_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:fugmos_wall_sign", FUGMOS_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:fugmos_wood", FUGMOS_WOOD);

		Registry.register(BLOCK, "deep_trenches:funeranite_button", FUNERANITE_BUTTON);
		Registry.register(BLOCK, "deep_trenches:funeranite_door", FUNERANITE_DOOR);
		Registry.register(BLOCK, "deep_trenches:funeranite_fence", FUNERANITE_FENCE);
		Registry.register(BLOCK, "deep_trenches:funeranite_fence_gate", FUNERANITE_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:funeranite_cap", FUNERANITE_CAP);
		Registry.register(BLOCK, "deep_trenches:funeranite_log", FUNERANITE_LOG);
		Registry.register(BLOCK, "deep_trenches:funeranite_planks", FUNERANITE_PLANKS);
		Registry.register(BLOCK, "deep_trenches:funeranite_pressure_plate", FUNERANITE_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:funeranite_sapling", FUNERANITE_SAPLING);
		Registry.register(BLOCK, "deep_trenches:funeranite_sign", FUNERANITE_SIGN);
		Registry.register(BLOCK, "deep_trenches:funeranite_slab", FUNERANITE_SLAB);
		Registry.register(BLOCK, "deep_trenches:funeranite_stairs", FUNERANITE_STAIRS);
		Registry.register(BLOCK, "deep_trenches:funeranite_trapdoor", FUNERANITE_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:funeranite_wall_sign", FUNERANITE_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:funeranite_wood", FUNERANITE_WOOD);

		Registry.register(BLOCK, "deep_trenches:ghoshroom_button", GHOSHROOM_BUTTON);
		Registry.register(BLOCK, "deep_trenches:ghoshroom_door", GHOSHROOM_DOOR);
		Registry.register(BLOCK, "deep_trenches:ghoshroom_fence", GHOSHROOM_FENCE);
		Registry.register(BLOCK, "deep_trenches:ghoshroom_fence_gate", GHOSHROOM_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:ghoshroom_cap", GHOSHROOM_CAP);
		Registry.register(BLOCK, "deep_trenches:ghoshroom_log", GHOSHROOM_LOG);
		Registry.register(BLOCK, "deep_trenches:ghoshroom_planks", GHOSHROOM_PLANKS);
		Registry.register(BLOCK, "deep_trenches:ghoshroom_pressure_plate", GHOSHROOM_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:ghoshroom_sapling", GHOSHROOM_SAPLING);
		Registry.register(BLOCK, "deep_trenches:ghoshroom_sign", GHOSHROOM_SIGN);
		Registry.register(BLOCK, "deep_trenches:ghoshroom_slab", GHOSHROOM_SLAB);
		Registry.register(BLOCK, "deep_trenches:ghoshroom_stairs", GHOSHROOM_STAIRS);
		Registry.register(BLOCK, "deep_trenches:ghoshroom_trapdoor", GHOSHROOM_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:ghoshroom_wall_sign", GHOSHROOM_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:ghoshroom_wood", GHOSHROOM_WOOD);

		Registry.register(BLOCK, "deep_trenches:giant_violet_button", GIANT_VIOLET_BUTTON);
		Registry.register(BLOCK, "deep_trenches:giant_violet_door", GIANT_VIOLET_DOOR);
		Registry.register(BLOCK, "deep_trenches:giant_violet_fence", GIANT_VIOLET_FENCE);
		Registry.register(BLOCK, "deep_trenches:giant_violet_fence_gate", GIANT_VIOLET_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:giant_violet_stem", GIANT_VIOLET_STEM);
		Registry.register(BLOCK, "deep_trenches:giant_violet_planks", GIANT_VIOLET_PLANKS);
		Registry.register(BLOCK, "deep_trenches:giant_violet_pressure_plate", GIANT_VIOLET_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:giant_violet_sign", GIANT_VIOLET_SIGN);
		Registry.register(BLOCK, "deep_trenches:giant_violet_slab", GIANT_VIOLET_SLAB);
		Registry.register(BLOCK, "deep_trenches:giant_violet_stairs", GIANT_VIOLET_STAIRS);
		Registry.register(BLOCK, "deep_trenches:giant_violet_trapdoor", GIANT_VIOLET_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:giant_violet_wall_sign", GIANT_VIOLET_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:giant_violet_wood", GIANT_VIOLET_WOOD);

		Registry.register(BLOCK, "deep_trenches:guaiacum_button", GUAIACUM_BUTTON);
		Registry.register(BLOCK, "deep_trenches:guaiacum_door", GUAIACUM_DOOR);
		Registry.register(BLOCK, "deep_trenches:guaiacum_fence", GUAIACUM_FENCE);
		Registry.register(BLOCK, "deep_trenches:guaiacum_fence_gate", GUAIACUM_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:guaiacum_flowers", GUAIACUM_FLOWERS);
		Registry.register(BLOCK, "deep_trenches:guaiacum_leaves", GUAIACUM_LEAVES);
		Registry.register(BLOCK, "deep_trenches:guaiacum_log", GUAIACUM_LOG);
		Registry.register(BLOCK, "deep_trenches:guaiacum_planks", GUAIACUM_PLANKS);
		Registry.register(BLOCK, "deep_trenches:guaiacum_pressure_plate", GUAIACUM_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:guaiacum_sapling", GUAIACUM_SAPLING);
		Registry.register(BLOCK, "deep_trenches:guaiacum_sign", GUAIACUM_SIGN);
		Registry.register(BLOCK, "deep_trenches:guaiacum_slab", GUAIACUM_SLAB);
		Registry.register(BLOCK, "deep_trenches:guaiacum_stairs", GUAIACUM_STAIRS);
		Registry.register(BLOCK, "deep_trenches:guaiacum_trapdoor", GUAIACUM_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:guaiacum_wall_sign", GUAIACUM_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:guaiacum_wood", GUAIACUM_WOOD);

		Registry.register(BLOCK, "deep_trenches:joshua_button", JOSHUA_BUTTON);
		Registry.register(BLOCK, "deep_trenches:joshua_door", JOSHUA_DOOR);
		Registry.register(BLOCK, "deep_trenches:joshua_fence", JOSHUA_FENCE);
		Registry.register(BLOCK, "deep_trenches:joshua_fence_gate", JOSHUA_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:joshua_leaves", JOSHUA_LEAVES);
		Registry.register(BLOCK, "deep_trenches:joshua_log", JOSHUA_LOG);
		Registry.register(BLOCK, "deep_trenches:joshua_planks", JOSHUA_PLANKS);
		Registry.register(BLOCK, "deep_trenches:joshua_pressure_plate", JOSHUA_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:joshua_sapling", JOSHUA_SAPLING);
		Registry.register(BLOCK, "deep_trenches:joshua_sign", JOSHUA_SIGN);
		Registry.register(BLOCK, "deep_trenches:joshua_slab", JOSHUA_SLAB);
		Registry.register(BLOCK, "deep_trenches:joshua_stairs", JOSHUA_STAIRS);
		Registry.register(BLOCK, "deep_trenches:joshua_trapdoor", JOSHUA_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:joshua_wall_sign", JOSHUA_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:joshua_wood", JOSHUA_WOOD);

		Registry.register(BLOCK, "deep_trenches:klinkii_pine_button", KLINKII_PINE_BUTTON);
		Registry.register(BLOCK, "deep_trenches:klinkii_pine_door", KLINKII_PINE_DOOR);
		Registry.register(BLOCK, "deep_trenches:klinkii_pine_fence", KLINKII_PINE_FENCE);
		Registry.register(BLOCK, "deep_trenches:klinkii_pine_fence_gate", KLINKII_PINE_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:klinkii_pine_leaves", KLINKII_PINE_LEAVES);
		Registry.register(BLOCK, "deep_trenches:klinkii_pine_log", KLINKII_PINE_LOG);
		Registry.register(BLOCK, "deep_trenches:klinkii_pine_planks", KLINKII_PINE_PLANKS);
		Registry.register(BLOCK, "deep_trenches:klinkii_pine_pressure_plate", KLINKII_PINE_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:klinkii_pine_sapling", KLINKII_PINE_SAPLING);
		Registry.register(BLOCK, "deep_trenches:klinkii_pine_sign", KLINKII_PINE_SIGN);
		Registry.register(BLOCK, "deep_trenches:klinkii_pine_slab", KLINKII_PINE_SLAB);
		Registry.register(BLOCK, "deep_trenches:klinkii_pine_stairs", KLINKII_PINE_STAIRS);
		Registry.register(BLOCK, "deep_trenches:klinkii_pine_trapdoor", KLINKII_PINE_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:klinkii_pine_wall_sign", KLINKII_PINE_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:klinkii_pine_wood", KLINKII_PINE_WOOD);

		Registry.register(BLOCK, "deep_trenches:melaleuca_button", MELALEUCA_BUTTON);
		Registry.register(BLOCK, "deep_trenches:melaleuca_door", MELALEUCA_DOOR);
		Registry.register(BLOCK, "deep_trenches:melaleuca_fence", MELALEUCA_FENCE);
		Registry.register(BLOCK, "deep_trenches:melaleuca_fence_gate", MELALEUCA_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:melaleuca_flowers", MELALEUCA_FLOWERS);
		Registry.register(BLOCK, "deep_trenches:melaleuca_leaves", MELALEUCA_LEAVES);
		Registry.register(BLOCK, "deep_trenches:melaleuca_log", MELALEUCA_LOG);
		Registry.register(BLOCK, "deep_trenches:melaleuca_planks", MELALEUCA_PLANKS);
		Registry.register(BLOCK, "deep_trenches:melaleuca_pressure_plate", MELALEUCA_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:melaleuca_sapling", MELALEUCA_SAPLING);
		Registry.register(BLOCK, "deep_trenches:melaleuca_sign", MELALEUCA_SIGN);
		Registry.register(BLOCK, "deep_trenches:melaleuca_slab", MELALEUCA_SLAB);
		Registry.register(BLOCK, "deep_trenches:melaleuca_stairs", MELALEUCA_STAIRS);
		Registry.register(BLOCK, "deep_trenches:melaleuca_trapdoor", MELALEUCA_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:melaleuca_wall_sign", MELALEUCA_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:melaleuca_wood", MELALEUCA_WOOD);

		Registry.register(BLOCK, "deep_trenches:murkantuan_button", MURKANTUAN_BUTTON);
		Registry.register(BLOCK, "deep_trenches:murkantuan_door", MURKANTUAN_DOOR);
		Registry.register(BLOCK, "deep_trenches:murkantuan_fence", MURKANTUAN_FENCE);
		Registry.register(BLOCK, "deep_trenches:murkantuan_fence_gate", MURKANTUAN_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:murkantuan_flower", MURKANTUAN_FLOWER);
		Registry.register(BLOCK, "deep_trenches:murkantuan_leaves", MURKANTUAN_LEAVES);
		Registry.register(BLOCK, "deep_trenches:murkantuan_log", MURKANTUAN_LOG);
		Registry.register(BLOCK, "deep_trenches:murkantuan_planks", MURKANTUAN_PLANKS);
		Registry.register(BLOCK, "deep_trenches:murkantuan_pressure_plate", MURKANTUAN_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:murkantuan_sapling", MURKANTUAN_SAPLING);
		Registry.register(BLOCK, "deep_trenches:murkantuan_sign", MURKANTUAN_SIGN);
		Registry.register(BLOCK, "deep_trenches:murkantuan_slab", MURKANTUAN_SLAB);
		Registry.register(BLOCK, "deep_trenches:murkantuan_stairs", MURKANTUAN_STAIRS);
		Registry.register(BLOCK, "deep_trenches:murkantuan_trapdoor", MURKANTUAN_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:murkantuan_wall_sign", MURKANTUAN_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:murkantuan_wood", MURKANTUAN_WOOD);

		Registry.register(BLOCK, "deep_trenches:norfolk_pine_button", NORFOLK_PINE_BUTTON);
		Registry.register(BLOCK, "deep_trenches:norfolk_pine_door", NORFOLK_PINE_DOOR);
		Registry.register(BLOCK, "deep_trenches:norfolk_pine_fence", NORFOLK_PINE_FENCE);
		Registry.register(BLOCK, "deep_trenches:norfolk_pine_fence_gate", NORFOLK_PINE_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:norfolk_pine_leaves", NORFOLK_PINE_LEAVES);
		Registry.register(BLOCK, "deep_trenches:norfolk_pine_log", NORFOLK_PINE_LOG);
		Registry.register(BLOCK, "deep_trenches:norfolk_pine_planks", NORFOLK_PINE_PLANKS);
		Registry.register(BLOCK, "deep_trenches:norfolk_pine_pressure_plate", NORFOLK_PINE_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:norfolk_pine_sapling", NORFOLK_PINE_SAPLING);
		Registry.register(BLOCK, "deep_trenches:norfolk_pine_sign", NORFOLK_PINE_SIGN);
		Registry.register(BLOCK, "deep_trenches:norfolk_pine_slab", NORFOLK_PINE_SLAB);
		Registry.register(BLOCK, "deep_trenches:norfolk_pine_stairs", NORFOLK_PINE_STAIRS);
		Registry.register(BLOCK, "deep_trenches:norfolk_pine_trapdoor", NORFOLK_PINE_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:norfolk_pine_wall_sign", NORFOLK_PINE_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:norfolk_pine_wood", NORFOLK_PINE_WOOD);

		Registry.register(BLOCK, "deep_trenches:obscrus_button", OBSCRUS_BUTTON);
		Registry.register(BLOCK, "deep_trenches:obscrus_door", OBSCRUS_DOOR);
		Registry.register(BLOCK, "deep_trenches:obscrus_fence", OBSCRUS_FENCE);
		Registry.register(BLOCK, "deep_trenches:obscrus_fence_gate", OBSCRUS_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:obscrus_leaves", OBSCRUS_LEAVES);
		Registry.register(BLOCK, "deep_trenches:obscrus_log", OBSCRUS_LOG);
		Registry.register(BLOCK, "deep_trenches:obscrus_planks", OBSCRUS_PLANKS);
		Registry.register(BLOCK, "deep_trenches:obscrus_pressure_plate", OBSCRUS_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:obscrus", OBSCRUS);
		Registry.register(BLOCK, "deep_trenches:obscrus_sign", OBSCRUS_SIGN);
		Registry.register(BLOCK, "deep_trenches:obscrus_slab", OBSCRUS_SLAB);
		Registry.register(BLOCK, "deep_trenches:obscrus_stairs", OBSCRUS_STAIRS);
		Registry.register(BLOCK, "deep_trenches:obscrus_trapdoor", OBSCRUS_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:obscrus_wall_sign", OBSCRUS_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:obscrus_wood", OBSCRUS_WOOD);

		Registry.register(BLOCK, "deep_trenches:orhpris_button", ORHPRIS_BUTTON);
		Registry.register(BLOCK, "deep_trenches:orhpris_door", ORHPRIS_DOOR);
		Registry.register(BLOCK, "deep_trenches:orhpris_fence", ORHPRIS_FENCE);
		Registry.register(BLOCK, "deep_trenches:orhpris_fence_gate", ORHPRIS_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:orhpris_leaves", ORHPRIS_LEAVES);
		Registry.register(BLOCK, "deep_trenches:orhpris_log", ORHPRIS_LOG);
		Registry.register(BLOCK, "deep_trenches:orhpris_planks", ORHPRIS_PLANKS);
		Registry.register(BLOCK, "deep_trenches:orhpris_pressure_plate", ORHPRIS_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:orhpris_sapling", ORHPRIS_SAPLING);
		Registry.register(BLOCK, "deep_trenches:orhpris_sign", ORHPRIS_SIGN);
		Registry.register(BLOCK, "deep_trenches:orhpris_slab", ORHPRIS_SLAB);
		Registry.register(BLOCK, "deep_trenches:orhpris_stairs", ORHPRIS_STAIRS);
		Registry.register(BLOCK, "deep_trenches:orhpris_trapdoor", ORHPRIS_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:orhpris_wall_sign", ORHPRIS_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:orhpris_wood", ORHPRIS_WOOD);

		Registry.register(BLOCK, "deep_trenches:peltogyne_button", PELTOGYNE_BUTTON);
		Registry.register(BLOCK, "deep_trenches:peltogyne_door", PELTOGYNE_DOOR);
		Registry.register(BLOCK, "deep_trenches:peltogyne_fence", PELTOGYNE_FENCE);
		Registry.register(BLOCK, "deep_trenches:peltogyne_fence_gate", PELTOGYNE_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:peltogyne_leaves", PELTOGYNE_LEAVES);
		Registry.register(BLOCK, "deep_trenches:peltogyne_log", PELTOGYNE_LOG);
		Registry.register(BLOCK, "deep_trenches:peltogyne_planks", PELTOGYNE_PLANKS);
		Registry.register(BLOCK, "deep_trenches:peltogyne_pressure_plate", PELTOGYNE_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:peltogyne_sapling", PELTOGYNE_SAPLING);
		Registry.register(BLOCK, "deep_trenches:peltogyne_sign", PELTOGYNE_SIGN);
		Registry.register(BLOCK, "deep_trenches:peltogyne_slab", PELTOGYNE_SLAB);
		Registry.register(BLOCK, "deep_trenches:peltogyne_stairs", PELTOGYNE_STAIRS);
		Registry.register(BLOCK, "deep_trenches:peltogyne_trapdoor", PELTOGYNE_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:peltogyne_wall_sign", PELTOGYNE_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:peltogyne_wood", PELTOGYNE_WOOD);

		Registry.register(BLOCK, "deep_trenches:pin_cherry_button", PIN_CHERRY_BUTTON);
		Registry.register(BLOCK, "deep_trenches:pin_cherry_door", PIN_CHERRY_DOOR);
		Registry.register(BLOCK, "deep_trenches:pin_cherry_fence", PIN_CHERRY_FENCE);
		Registry.register(BLOCK, "deep_trenches:pin_cherry_fence_gate", PIN_CHERRY_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:pin_cherry_leaves", PIN_CHERRY_LEAVES);
		Registry.register(BLOCK, "deep_trenches:pin_cherry_log", PIN_CHERRY_LOG);
		Registry.register(BLOCK, "deep_trenches:pin_cherry_planks", PIN_CHERRY_PLANKS);
		Registry.register(BLOCK, "deep_trenches:pin_cherry_pressure_plate", PIN_CHERRY_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:pin_cherry_sapling", PIN_CHERRY_SAPLING);
		Registry.register(BLOCK, "deep_trenches:pin_cherry_sign", PIN_CHERRY_SIGN);
		Registry.register(BLOCK, "deep_trenches:pin_cherry_slab", PIN_CHERRY_SLAB);
		Registry.register(BLOCK, "deep_trenches:pin_cherry_stairs", PIN_CHERRY_STAIRS);
		Registry.register(BLOCK, "deep_trenches:pin_cherry_trapdoor", PIN_CHERRY_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:pin_cherry_wall_sign", PIN_CHERRY_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:pin_cherry_wood", PIN_CHERRY_WOOD);

		Registry.register(BLOCK, "deep_trenches:plum_button", PLUM_BUTTON);
		Registry.register(BLOCK, "deep_trenches:plum_door", PLUM_DOOR);
		Registry.register(BLOCK, "deep_trenches:plum_fence", PLUM_FENCE);
		Registry.register(BLOCK, "deep_trenches:plum_fence_gate", PLUM_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:plum_leaves", PLUM_LEAVES);
		Registry.register(BLOCK, "deep_trenches:plum_log", PLUM_LOG);
		Registry.register(BLOCK, "deep_trenches:plum_planks", PLUM_PLANKS);
		Registry.register(BLOCK, "deep_trenches:plum_pressure_plate", PLUM_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:plum_sapling", PLUM_SAPLING);
		Registry.register(BLOCK, "deep_trenches:plum_sign", PLUM_SIGN);
		Registry.register(BLOCK, "deep_trenches:plum_slab", PLUM_SLAB);
		Registry.register(BLOCK, "deep_trenches:plum_stairs", PLUM_STAIRS);
		Registry.register(BLOCK, "deep_trenches:plum_trapdoor", PLUM_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:plum_wall_sign", PLUM_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:plum_wood", PLUM_WOOD);

		Registry.register(BLOCK, "deep_trenches:purfunga_button", PURFUNGA_BUTTON);
		Registry.register(BLOCK, "deep_trenches:purfunga_door", PURFUNGA_DOOR);
		Registry.register(BLOCK, "deep_trenches:purfunga_fence", PURFUNGA_FENCE);
		Registry.register(BLOCK, "deep_trenches:purfunga_fence_gate", PURFUNGA_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:purfunga_cap", PURFUNGA_CAP);
		Registry.register(BLOCK, "deep_trenches:purfunga_log", PURFUNGA_LOG);
		Registry.register(BLOCK, "deep_trenches:purfunga_planks", PURFUNGA_PLANKS);
		Registry.register(BLOCK, "deep_trenches:purfunga_pressure_plate", PURFUNGA_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:purfunga_sapling", PURFUNGA_SAPLING);
		Registry.register(BLOCK, "deep_trenches:purfunga_sign", PURFUNGA_SIGN);
		Registry.register(BLOCK, "deep_trenches:purfunga_slab", PURFUNGA_SLAB);
		Registry.register(BLOCK, "deep_trenches:purfunga_stairs", PURFUNGA_STAIRS);
		Registry.register(BLOCK, "deep_trenches:purfunga_trapdoor", PURFUNGA_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:purfunga_wall_sign", PURFUNGA_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:purfunga_wood", PURFUNGA_WOOD);

		Registry.register(BLOCK, "deep_trenches:rark_button", RARK_BUTTON);
		Registry.register(BLOCK, "deep_trenches:rark_door", RARK_DOOR);
		Registry.register(BLOCK, "deep_trenches:rark_fence", RARK_FENCE);
		Registry.register(BLOCK, "deep_trenches:rark_fence_gate", RARK_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:rark_leaves", RARK_LEAVES);
		Registry.register(BLOCK, "deep_trenches:rark_log", RARK_LOG);
		Registry.register(BLOCK, "deep_trenches:rark_planks", RARK_PLANKS);
		Registry.register(BLOCK, "deep_trenches:rark_pressure_plate", RARK_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:rark_sapling", RARK_SAPLING);
		Registry.register(BLOCK, "deep_trenches:rark_sign", RARK_SIGN);
		Registry.register(BLOCK, "deep_trenches:rark_slab", RARK_SLAB);
		Registry.register(BLOCK, "deep_trenches:rark_stairs", RARK_STAIRS);
		Registry.register(BLOCK, "deep_trenches:rark_trapdoor", RARK_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:rark_wall_sign", RARK_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:rark_wood", RARK_WOOD);

		Registry.register(BLOCK, "deep_trenches:red_elm_button", RED_ELM_BUTTON);
		Registry.register(BLOCK, "deep_trenches:red_elm_door", RED_ELM_DOOR);
		Registry.register(BLOCK, "deep_trenches:red_elm_fence", RED_ELM_FENCE);
		Registry.register(BLOCK, "deep_trenches:red_elm_fence_gate", RED_ELM_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:red_elm_leaves", RED_ELM_LEAVES);
		Registry.register(BLOCK, "deep_trenches:red_elm_log", RED_ELM_LOG);
		Registry.register(BLOCK, "deep_trenches:red_elm_planks", RED_ELM_PLANKS);
		Registry.register(BLOCK, "deep_trenches:red_elm_pressure_plate", RED_ELM_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:red_elm_sapling", RED_ELM_SAPLING);
		Registry.register(BLOCK, "deep_trenches:red_elm_sign", RED_ELM_SIGN);
		Registry.register(BLOCK, "deep_trenches:red_elm_slab", RED_ELM_SLAB);
		Registry.register(BLOCK, "deep_trenches:red_elm_stairs", RED_ELM_STAIRS);
		Registry.register(BLOCK, "deep_trenches:red_elm_trapdoor", RED_ELM_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:red_elm_wall_sign", RED_ELM_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:red_elm_wood", RED_ELM_WOOD);

		Registry.register(BLOCK, "deep_trenches:rhadi_button", RHADI_BUTTON);
		Registry.register(BLOCK, "deep_trenches:rhadi_door", RHADI_DOOR);
		Registry.register(BLOCK, "deep_trenches:rhadi_fence", RHADI_FENCE);
		Registry.register(BLOCK, "deep_trenches:rhadi_fence_gate", RHADI_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:rhadi_fruit", RHADI_FRUIT);
		Registry.register(BLOCK, "deep_trenches:carved_rhadi_fruit", CARVED_RHADI_FRUIT);
		Registry.register(BLOCK, "deep_trenches:rhadi_leaves", RHADI_LEAVES);
		Registry.register(BLOCK, "deep_trenches:rhadi_log", RHADI_LOG);
		Registry.register(BLOCK, "deep_trenches:rhadi_o_lantern", RHADI_O_LANTERN);
		Registry.register(BLOCK, "deep_trenches:rhadi_planks", RHADI_PLANKS);
		Registry.register(BLOCK, "deep_trenches:rhadi_pressure_plate", RHADI_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:rhadi_sapling", RHADI_SAPLING);
		Registry.register(BLOCK, "deep_trenches:rhadi_sign", RHADI_SIGN);
		Registry.register(BLOCK, "deep_trenches:rhadi_slab", RHADI_SLAB);
		Registry.register(BLOCK, "deep_trenches:rhadi_stairs", RHADI_STAIRS);
		Registry.register(BLOCK, "deep_trenches:rhadi_thorns", RHADI_THORNS);
		Registry.register(BLOCK, "deep_trenches:rhadi_trapdoor", RHADI_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:rhadi_wall_sign", RHADI_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:rhadi_wood", RHADI_WOOD);

		Registry.register(BLOCK, "deep_trenches:sanguart_button", SANGUART_BUTTON);
		Registry.register(BLOCK, "deep_trenches:sanguart_door", SANGUART_DOOR);
		Registry.register(BLOCK, "deep_trenches:sanguart_fence", SANGUART_FENCE);
		Registry.register(BLOCK, "deep_trenches:sanguart_fence_gate", SANGUART_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:sanguart_leaves", SANGUART_LEAVES);
		Registry.register(BLOCK, "deep_trenches:sanguart_log", SANGUART_LOG);
		Registry.register(BLOCK, "deep_trenches:sanguart_planks", SANGUART_PLANKS);
		Registry.register(BLOCK, "deep_trenches:sanguart_pressure_plate", SANGUART_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:sanguart_sapling", SANGUART_SAPLING);
		Registry.register(BLOCK, "deep_trenches:sanguart_sign", SANGUART_SIGN);
		Registry.register(BLOCK, "deep_trenches:sanguart_slab", SANGUART_SLAB);
		Registry.register(BLOCK, "deep_trenches:sanguart_stairs", SANGUART_STAIRS);
		Registry.register(BLOCK, "deep_trenches:sanguart_trapdoor", SANGUART_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:sanguart_wall_sign", SANGUART_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:sanguart_wood", SANGUART_WOOD);

		Registry.register(BLOCK, "deep_trenches:scarlet_thiorcen", SCARLET_THIORCEN);
		Registry.register(BLOCK, "deep_trenches:scarlet_thiorcen_button", SCARLET_THIORCEN_BUTTON);
		Registry.register(BLOCK, "deep_trenches:scarlet_thiorcen_door", SCARLET_THIORCEN_DOOR);
		Registry.register(BLOCK, "deep_trenches:scarlet_thiorcen_fence", SCARLET_THIORCEN_FENCE);
		Registry.register(BLOCK, "deep_trenches:scarlet_thiorcen_fence_gate", SCARLET_THIORCEN_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:scarlet_thiorcen_log", SCARLET_THIORCEN_LOG);
		Registry.register(BLOCK, "deep_trenches:scarlet_thiorcen_planks", SCARLET_THIORCEN_PLANKS);
		Registry.register(BLOCK, "deep_trenches:scarlet_thiorcen_pressure_plate", SCARLET_THIORCEN_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:scarlet_thiorcen_sign", SCARLET_THIORCEN_SIGN);
		Registry.register(BLOCK, "deep_trenches:scarlet_thiorcen_slab", SCARLET_THIORCEN_SLAB);
		Registry.register(BLOCK, "deep_trenches:scarlet_thiorcen_stairs", SCARLET_THIORCEN_STAIRS);
		Registry.register(BLOCK, "deep_trenches:scarlet_thiorcen_trapdoor", SCARLET_THIORCEN_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:scarlet_thiorcen_wall_sign", SCARLET_THIORCEN_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:scarlet_thiorcen_wood", SCARLET_THIORCEN_WOOD);

		Registry.register(BLOCK, "deep_trenches:sequoia_button", SEQUOIA_BUTTON);
		Registry.register(BLOCK, "deep_trenches:sequoia_door", SEQUOIA_DOOR);
		Registry.register(BLOCK, "deep_trenches:sequoia_fence", SEQUOIA_FENCE);
		Registry.register(BLOCK, "deep_trenches:sequoia_fence_gate", SEQUOIA_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:sequoia_leaves", SEQUOIA_LEAVES);
		Registry.register(BLOCK, "deep_trenches:sequoia_log", SEQUOIA_LOG);
		Registry.register(BLOCK, "deep_trenches:sequoia_planks", SEQUOIA_PLANKS);
		Registry.register(BLOCK, "deep_trenches:sequoia_pressure_plate", SEQUOIA_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:sequoia_sapling", SEQUOIA_SAPLING);
		Registry.register(BLOCK, "deep_trenches:sequoia_sign", SEQUOIA_SIGN);
		Registry.register(BLOCK, "deep_trenches:sequoia_slab", SEQUOIA_SLAB);
		Registry.register(BLOCK, "deep_trenches:sequoia_stairs", SEQUOIA_STAIRS);
		Registry.register(BLOCK, "deep_trenches:sequoia_trapdoor", SEQUOIA_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:sequoia_wall_sign", SEQUOIA_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:sequoia_wood", SEQUOIA_WOOD);

		Registry.register(BLOCK, "deep_trenches:sproom_button", SPROOM_BUTTON);
		Registry.register(BLOCK, "deep_trenches:sproom_door", SPROOM_DOOR);
		Registry.register(BLOCK, "deep_trenches:sproom_fence", SPROOM_FENCE);
		Registry.register(BLOCK, "deep_trenches:sproom_fence_gate", SPROOM_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:sproom_leaves", SPROOM_LEAVES);
		Registry.register(BLOCK, "deep_trenches:sproom_log", SPROOM_LOG);
		Registry.register(BLOCK, "deep_trenches:sproom_planks", SPROOM_PLANKS);
		Registry.register(BLOCK, "deep_trenches:sproom_pressure_plate", SPROOM_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:sproom_sapling", SPROOM_SAPLING);
		Registry.register(BLOCK, "deep_trenches:sproom_sign", SPROOM_SIGN);
		Registry.register(BLOCK, "deep_trenches:sproom_slab", SPROOM_SLAB);
		Registry.register(BLOCK, "deep_trenches:sproom_stairs", SPROOM_STAIRS);
		Registry.register(BLOCK, "deep_trenches:sproom_trapdoor", SPROOM_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:sproom_wall_sign", SPROOM_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:sproom_wood", SPROOM_WOOD);

		Registry.register(BLOCK, "deep_trenches:stortreean_button", STORTREEAN_BUTTON);
		Registry.register(BLOCK, "deep_trenches:stortreean_door", STORTREEAN_DOOR);
		Registry.register(BLOCK, "deep_trenches:stortreean_fence", STORTREEAN_FENCE);
		Registry.register(BLOCK, "deep_trenches:stortreean_fence_gate", STORTREEAN_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:stortreean_leaves", STORTREEAN_LEAVES);
		Registry.register(BLOCK, "deep_trenches:stortreean_log", STORTREEAN_LOG);
		Registry.register(BLOCK, "deep_trenches:stortreean_planks", STORTREEAN_PLANKS);
		Registry.register(BLOCK, "deep_trenches:stortreean_pressure_plate", STORTREEAN_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:stortreean_sapling", STORTREEAN_SAPLING);
		Registry.register(BLOCK, "deep_trenches:stortreean_sign", STORTREEAN_SIGN);
		Registry.register(BLOCK, "deep_trenches:stortreean_slab", STORTREEAN_SLAB);
		Registry.register(BLOCK, "deep_trenches:stortreean_stairs", STORTREEAN_STAIRS);
		Registry.register(BLOCK, "deep_trenches:stortreean_trapdoor", STORTREEAN_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:stortreean_wall_sign", STORTREEAN_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:stortreean_wood", STORTREEAN_WOOD);

		Registry.register(BLOCK, "deep_trenches:stroomean_button", STROOMEAN_BUTTON);
		Registry.register(BLOCK, "deep_trenches:stroomean_door", STROOMEAN_DOOR);
		Registry.register(BLOCK, "deep_trenches:stroomean_fence", STROOMEAN_FENCE);
		Registry.register(BLOCK, "deep_trenches:stroomean_fence_gate", STROOMEAN_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:stroomean_cap", STROOMEAN_CAP);
		Registry.register(BLOCK, "deep_trenches:stroomean_log", STROOMEAN_LOG);
		Registry.register(BLOCK, "deep_trenches:stroomean_planks", STROOMEAN_PLANKS);
		Registry.register(BLOCK, "deep_trenches:stroomean_pressure_plate", STROOMEAN_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:stroomean_sapling", STROOMEAN_SAPLING);
		Registry.register(BLOCK, "deep_trenches:stroomean_sign", STROOMEAN_SIGN);
		Registry.register(BLOCK, "deep_trenches:stroomean_slab", STROOMEAN_SLAB);
		Registry.register(BLOCK, "deep_trenches:stroomean_stairs", STROOMEAN_STAIRS);
		Registry.register(BLOCK, "deep_trenches:stroomean_trapdoor", STROOMEAN_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:stroomean_wall_sign", STROOMEAN_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:stroomean_wood", STROOMEAN_WOOD);

		Registry.register(BLOCK, "deep_trenches:sunrise_fungus_button", SUNRISE_FUNGUS_BUTTON);
		Registry.register(BLOCK, "deep_trenches:sunrise_fungus_door", SUNRISE_FUNGUS_DOOR);
		Registry.register(BLOCK, "deep_trenches:sunrise_fungus_fence", SUNRISE_FUNGUS_FENCE);
		Registry.register(BLOCK, "deep_trenches:sunrise_fungus_fence_gate", SUNRISE_FUNGUS_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:sunrise_fungus_cap", SUNRISE_FUNGUS_CAP);
		Registry.register(BLOCK, "deep_trenches:sunrise_fungus_log", SUNRISE_FUNGUS_LOG);
		Registry.register(BLOCK, "deep_trenches:sunrise_fungus_planks", SUNRISE_FUNGUS_PLANKS);
		Registry.register(BLOCK, "deep_trenches:sunrise_fungus_pressure_plate", SUNRISE_FUNGUS_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:sunrise_fungus_sapling", SUNRISE_FUNGUS_SAPLING);
		Registry.register(BLOCK, "deep_trenches:sunrise_fungus_sign", SUNRISE_FUNGUS_SIGN);
		Registry.register(BLOCK, "deep_trenches:sunrise_fungus_slab", SUNRISE_FUNGUS_SLAB);
		Registry.register(BLOCK, "deep_trenches:sunrise_fungus_stairs", SUNRISE_FUNGUS_STAIRS);
		Registry.register(BLOCK, "deep_trenches:sunrise_fungus_trapdoor", SUNRISE_FUNGUS_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:sunrise_fungus_wall_sign", SUNRISE_FUNGUS_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:sunrise_fungus_wood", SUNRISE_FUNGUS_WOOD);

		Registry.register(BLOCK, "deep_trenches:tark_button", TARK_BUTTON);
		Registry.register(BLOCK, "deep_trenches:tark_door", TARK_DOOR);
		Registry.register(BLOCK, "deep_trenches:tark_fence", TARK_FENCE);
		Registry.register(BLOCK, "deep_trenches:tark_fence_gate", TARK_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:tark_leaves", TARK_LEAVES);
		Registry.register(BLOCK, "deep_trenches:tark_log", TARK_LOG);
		Registry.register(BLOCK, "deep_trenches:tark_planks", TARK_PLANKS);
		Registry.register(BLOCK, "deep_trenches:tark_pressure_plate", TARK_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:tark_sapling", TARK_SAPLING);
		Registry.register(BLOCK, "deep_trenches:tark_sign", TARK_SIGN);
		Registry.register(BLOCK, "deep_trenches:tark_slab", TARK_SLAB);
		Registry.register(BLOCK, "deep_trenches:tark_stairs", TARK_STAIRS);
		Registry.register(BLOCK, "deep_trenches:tark_trapdoor", TARK_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:tark_wall_sign", TARK_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:tark_wood", TARK_WOOD);

		Registry.register(BLOCK, "deep_trenches:teak_button", TEAK_BUTTON);
		Registry.register(BLOCK, "deep_trenches:teak_door", TEAK_DOOR);
		Registry.register(BLOCK, "deep_trenches:teak_fence", TEAK_FENCE);
		Registry.register(BLOCK, "deep_trenches:teak_fence_gate", TEAK_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:teak_leaves", TEAK_LEAVES);
		Registry.register(BLOCK, "deep_trenches:teak_log", TEAK_LOG);
		Registry.register(BLOCK, "deep_trenches:teak_planks", TEAK_PLANKS);
		Registry.register(BLOCK, "deep_trenches:teak_pressure_plate", TEAK_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:teak_sapling", TEAK_SAPLING);
		Registry.register(BLOCK, "deep_trenches:teak_sign", TEAK_SIGN);
		Registry.register(BLOCK, "deep_trenches:teak_slab", TEAK_SLAB);
		Registry.register(BLOCK, "deep_trenches:teak_stairs", TEAK_STAIRS);
		Registry.register(BLOCK, "deep_trenches:teak_trapdoor", TEAK_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:teak_wall_sign", TEAK_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:teak_wood", TEAK_WOOD);

		Registry.register(BLOCK, "deep_trenches:thundercloud_plum_button", THUNDERCLOUD_PLUM_BUTTON);
		Registry.register(BLOCK, "deep_trenches:thundercloud_plum_door", THUNDERCLOUD_PLUM_DOOR);
		Registry.register(BLOCK, "deep_trenches:thundercloud_plum_fence", THUNDERCLOUD_PLUM_FENCE);
		Registry.register(BLOCK, "deep_trenches:thundercloud_plum_fence_gate", THUNDERCLOUD_PLUM_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:thundercloud_plum_leaves", THUNDERCLOUD_PLUM_LEAVES);
		Registry.register(BLOCK, "deep_trenches:thundercloud_plum_log", THUNDERCLOUD_PLUM_LOG);
		Registry.register(BLOCK, "deep_trenches:thundercloud_plum_planks", THUNDERCLOUD_PLUM_PLANKS);
		Registry.register(BLOCK, "deep_trenches:thundercloud_plum_pressure_plate", THUNDERCLOUD_PLUM_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:thundercloud_plum_sapling", THUNDERCLOUD_PLUM_SAPLING);
		Registry.register(BLOCK, "deep_trenches:thundercloud_plum_sign", THUNDERCLOUD_PLUM_SIGN);
		Registry.register(BLOCK, "deep_trenches:thundercloud_plum_slab", THUNDERCLOUD_PLUM_SLAB);
		Registry.register(BLOCK, "deep_trenches:thundercloud_plum_stairs", THUNDERCLOUD_PLUM_STAIRS);
		Registry.register(BLOCK, "deep_trenches:thundercloud_plum_trapdoor", THUNDERCLOUD_PLUM_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:thundercloud_plum_wall_sign", THUNDERCLOUD_PLUM_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:thundercloud_plum_wood", THUNDERCLOUD_PLUM_WOOD);

		Registry.register(BLOCK, "deep_trenches:vynhert_button", VYNHERT_BUTTON);
		Registry.register(BLOCK, "deep_trenches:vynhert_door", VYNHERT_DOOR);
		Registry.register(BLOCK, "deep_trenches:vynhert_fence", VYNHERT_FENCE);
		Registry.register(BLOCK, "deep_trenches:vynhert_fence_gate", VYNHERT_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:vynhert_fruit", VYNHERT_FRUIT);
		Registry.register(BLOCK, "deep_trenches:carved_vynhert_fruit", CARVED_VYNHERT_FRUIT);
		Registry.register(BLOCK, "deep_trenches:vynhert_leaf", VYNHERT_LEAF);
		Registry.register(BLOCK, "deep_trenches:vynhert_log", VYNHERT_LOG);
		Registry.register(BLOCK, "deep_trenches:vynhert_o_lantern", VYNHERT_O_LANTERN);
		Registry.register(BLOCK, "deep_trenches:vynhert_planks", VYNHERT_PLANKS);
		Registry.register(BLOCK, "deep_trenches:vynhert_pressure_plate", VYNHERT_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:vynhert_sapling", VYNHERT_SAPLING);
		Registry.register(BLOCK, "deep_trenches:vynhert_sign", VYNHERT_SIGN);
		Registry.register(BLOCK, "deep_trenches:vynhert_slab", VYNHERT_SLAB);
		Registry.register(BLOCK, "deep_trenches:vynhert_stairs", VYNHERT_STAIRS);
		Registry.register(BLOCK, "deep_trenches:vynhert_tentacles", VYNHERT_TENTACLES);
		Registry.register(BLOCK, "deep_trenches:vynhert_thorns", VYNHERT_THORNS);
		Registry.register(BLOCK, "deep_trenches:vynhert_trapdoor", VYNHERT_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:vynhert_wall_sign", VYNHERT_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:vynhert_wood", VYNHERT_WOOD);

		Registry.register(BLOCK, "deep_trenches:wart_tree_button", WART_TREE_BUTTON);
		Registry.register(BLOCK, "deep_trenches:wart_tree_door", WART_TREE_DOOR);
		Registry.register(BLOCK, "deep_trenches:wart_tree_fence", WART_TREE_FENCE);
		Registry.register(BLOCK, "deep_trenches:wart_tree_fence_gate", WART_TREE_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:wart_tree_warts", WART_TREE_WARTS);
		Registry.register(BLOCK, "deep_trenches:wart_tree_log", WART_TREE_LOG);
		Registry.register(BLOCK, "deep_trenches:wart_tree_planks", WART_TREE_PLANKS);
		Registry.register(BLOCK, "deep_trenches:wart_tree_pressure_plate", WART_TREE_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:wart_tree_sign", WART_TREE_SIGN);
		Registry.register(BLOCK, "deep_trenches:wart_tree_slab", WART_TREE_SLAB);
		Registry.register(BLOCK, "deep_trenches:wart_tree_stairs", WART_TREE_STAIRS);
		Registry.register(BLOCK, "deep_trenches:wart_tree_trapdoor", WART_TREE_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:wart_tree_wall_sign", WART_TREE_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:wart_tree_wood", WART_TREE_WOOD);

		Registry.register(BLOCK, "deep_trenches:wenge_button", WENGE_BUTTON);
		Registry.register(BLOCK, "deep_trenches:wenge_door", WENGE_DOOR);
		Registry.register(BLOCK, "deep_trenches:wenge_fence", WENGE_FENCE);
		Registry.register(BLOCK, "deep_trenches:wenge_fence_gate", WENGE_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:wenge_leaves", WENGE_LEAVES);
		Registry.register(BLOCK, "deep_trenches:wenge_log", WENGE_LOG);
		Registry.register(BLOCK, "deep_trenches:wenge_planks", WENGE_PLANKS);
		Registry.register(BLOCK, "deep_trenches:wenge_pressure_plate", WENGE_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:wenge_sapling", WENGE_SAPLING);
		Registry.register(BLOCK, "deep_trenches:wenge_sign", WENGE_SIGN);
		Registry.register(BLOCK, "deep_trenches:wenge_slab", WENGE_SLAB);
		Registry.register(BLOCK, "deep_trenches:wenge_stairs", WENGE_STAIRS);
		Registry.register(BLOCK, "deep_trenches:wenge_trapdoor", WENGE_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:wenge_wall_sign", WENGE_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:wenge_wood", WENGE_WOOD);

		Registry.register(BLOCK, "deep_trenches:yew_button", YEW_BUTTON);
		Registry.register(BLOCK, "deep_trenches:yew_door", YEW_DOOR);
		Registry.register(BLOCK, "deep_trenches:yew_fence", YEW_FENCE);
		Registry.register(BLOCK, "deep_trenches:yew_fence_gate", YEW_FENCE_GATE);
		Registry.register(BLOCK, "deep_trenches:yew_leaves", YEW_LEAVES);
		Registry.register(BLOCK, "deep_trenches:yew_log", YEW_LOG);
		Registry.register(BLOCK, "deep_trenches:mossy_yew_log", MOSSY_YEW_LOG);
		Registry.register(BLOCK, "deep_trenches:yew_planks", YEW_PLANKS);
		Registry.register(BLOCK, "deep_trenches:yew_pressure_plate", YEW_PRESSURE_PLATE);
		Registry.register(BLOCK, "deep_trenches:yew_sapling", YEW_SAPLING);
		Registry.register(BLOCK, "deep_trenches:yew_sign", YEW_SIGN);
		Registry.register(BLOCK, "deep_trenches:yew_slab", YEW_SLAB);
		Registry.register(BLOCK, "deep_trenches:yew_stairs", YEW_STAIRS);
		Registry.register(BLOCK, "deep_trenches:yew_trapdoor", YEW_TRAPDOOR);
		Registry.register(BLOCK, "deep_trenches:yew_wall_sign", YEW_WALL_SIGN);
		Registry.register(BLOCK, "deep_trenches:yew_wood", YEW_WOOD);

		Registry.register(BLOCK, "deep_trenches:stripped_almond_log", STRIPPED_ALMOND_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_almond_wood", STRIPPED_ALMOND_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_anameata_log", STRIPPED_ANAMEATA_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_anameata_wood", STRIPPED_ANAMEATA_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_angels_trumpet_log", STRIPPED_ANGELS_TRUMPET_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_angels_trumpet_wood", STRIPPED_ANGELS_TRUMPET_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_aquean_log", STRIPPED_AQUEAN_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_aquean_wood", STRIPPED_AQUEAN_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_barshrookle_log", STRIPPED_BARSHROOKLE_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_barshrookle_wood", STRIPPED_BARSHROOKLE_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_black_birch_log", STRIPPED_BLACK_BIRCH_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_black_birch_wood", STRIPPED_BLACK_BIRCH_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_blue_mahoe_log", STRIPPED_BLUE_MAHOE_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_blue_mahoe_wood", STRIPPED_BLUE_MAHOE_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_blue_spruce_log", STRIPPED_BLUE_SPRUCE_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_blue_spruce_wood", STRIPPED_BLUE_SPRUCE_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_bottlebrush_log", STRIPPED_BOTTLEBRUSH_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_bottlebrush_wood", STRIPPED_BOTTLEBRUSH_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_bromya_log", STRIPPED_BROMYA_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_bromya_wood", STRIPPED_BROMYA_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_bubbletree_log", STRIPPED_BUBBLETREE_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_bubbletree_wood", STRIPPED_BUBBLETREE_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_calcearb_log", STRIPPED_CALCEARB_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_calcearb_wood", STRIPPED_CALCEARB_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_cherry_log", STRIPPED_CHERRY_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_cherry_wood", STRIPPED_CHERRY_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_chotorn_log", STRIPPED_CHOTORN_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_chotorn_wood", STRIPPED_CHOTORN_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_cook_pine_log", STRIPPED_COOK_PINE_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_cook_pine_wood", STRIPPED_COOK_PINE_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_crolood_log", STRIPPED_CROLOOD_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_crolood_wood", STRIPPED_CROLOOD_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_dark_crolood_log", STRIPPED_DARK_CROLOOD_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_dark_crolood_wood", STRIPPED_DARK_CROLOOD_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_dark_fuchsitra_log", STRIPPED_DARK_FUCHSITRA_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_dark_fuchsitra_wood", STRIPPED_DARK_FUCHSITRA_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_dark_red_elm_log", STRIPPED_DARK_RED_ELM_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_dark_red_elm_wood", STRIPPED_DARK_RED_ELM_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_dead_wart_tree_log", STRIPPED_DEAD_WART_TREE_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_dead_wart_tree_wood", STRIPPED_DEAD_WART_TREE_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_drigyus_log", STRIPPED_DRIGYUS_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_drigyus_wood", STRIPPED_DRIGYUS_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_ebony_log", STRIPPED_EBONY_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_ebony_wood", STRIPPED_EBONY_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_enderheart_log", STRIPPED_ENDERHEART_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_enderheart_wood", STRIPPED_ENDERHEART_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_flalm_stem", STRIPPED_FLALM_STEM);
		Registry.register(BLOCK, "deep_trenches:stripped_flalm_wood", STRIPPED_FLALM_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_fruce_log", STRIPPED_FRUCE_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_fruce_wood", STRIPPED_FRUCE_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_fuchsitra_log", STRIPPED_FUCHSITRA_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_fuchsitra_wood", STRIPPED_FUCHSITRA_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_fugmos_stem", STRIPPED_FUGMOS_STEM);
		Registry.register(BLOCK, "deep_trenches:stripped_fugmos_hyphae", STRIPPED_FUGMOS_HYPHAE);
		Registry.register(BLOCK, "deep_trenches:stripped_funeranite_log", STRIPPED_FUNERANITE_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_funeranite_wood", STRIPPED_FUNERANITE_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_ghoshroom_log", STRIPPED_GHOSHROOM_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_ghoshroom_wood", STRIPPED_GHOSHROOM_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_giant_violet_stem", STRIPPED_GIANT_VIOLET_STEM);
		Registry.register(BLOCK, "deep_trenches:stripped_giant_violet_wood", STRIPPED_GIANT_VIOLET_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_guaiacum_log", STRIPPED_GUAIACUM_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_guaiacum_wood", STRIPPED_GUAIACUM_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_joshua_log", STRIPPED_JOSHUA_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_joshua_wood", STRIPPED_JOSHUA_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_klinkii_pine_log", STRIPPED_KLINKII_PINE_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_klinkii_pine_wood", STRIPPED_KLINKII_PINE_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_melaleuca_log", STRIPPED_MELALEUCA_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_melaleuca_wood", STRIPPED_MELALEUCA_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_murkantuan_log", STRIPPED_MURKANTUAN_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_murkantuan_wood", STRIPPED_MURKANTUAN_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_norfolk_pine_log", STRIPPED_NORFOLK_PINE_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_norfolk_pine_wood", STRIPPED_NORFOLK_PINE_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_obscrus_log", STRIPPED_OBSCRUS_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_obscrus_wood", STRIPPED_OBSCRUS_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_orhpris_log", STRIPPED_ORHPRIS_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_orhpris_wood", STRIPPED_ORHPRIS_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_peltogyne_log", STRIPPED_PELTOGYNE_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_peltogyne_wood", STRIPPED_PELTOGYNE_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_pin_cherry_log", STRIPPED_PIN_CHERRY_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_pin_cherry_wood", STRIPPED_PIN_CHERRY_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_plum_log", STRIPPED_PLUM_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_plum_wood", STRIPPED_PLUM_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_purfunga_log", STRIPPED_PURFUNGA_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_purfunga_wood", STRIPPED_PURFUNGA_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_rark_log", STRIPPED_RARK_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_rark_wood", STRIPPED_RARK_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_red_elm_log", STRIPPED_RED_ELM_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_red_elm_wood", STRIPPED_RED_ELM_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_rhadi_log", STRIPPED_RHADI_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_rhadi_wood", STRIPPED_RHADI_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_sanguart_log", STRIPPED_SANGUART_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_sanguart_wood", STRIPPED_SANGUART_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_scarlet_thiorcen_log", STRIPPED_SCARLET_THIORCEN_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_scarlet_thiorcen_wood", STRIPPED_SCARLET_THIORCEN_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_sequoia_log", STRIPPED_SEQUOIA_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_sequoia_wood", STRIPPED_SEQUOIA_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_sproom_log", STRIPPED_SPROOM_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_sproom_wood", STRIPPED_SPROOM_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_stortreean_log", STRIPPED_STORTREEAN_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_stortreean_wood", STRIPPED_STORTREEAN_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_stroomean_log", STRIPPED_STROOMEAN_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_stroomean_wood", STRIPPED_STROOMEAN_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_sunrise_fungus_log", STRIPPED_SUNRISE_FUNGUS_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_sunrise_fungus_wood", STRIPPED_SUNRISE_FUNGUS_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_tark_log", STRIPPED_TARK_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_tark_wood", STRIPPED_TARK_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_teak_log", STRIPPED_TEAK_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_teak_wood", STRIPPED_TEAK_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_thundercloud_plum_log", STRIPPED_THUNDERCLOUD_PLUM_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_thundercloud_plum_wood", STRIPPED_THUNDERCLOUD_PLUM_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_vynhert_log", STRIPPED_VYNHERT_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_vynhert_wood", STRIPPED_VYNHERT_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_wart_tree_log", STRIPPED_WART_TREE_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_wart_tree_wood", STRIPPED_WART_TREE_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_wenge_log", STRIPPED_WENGE_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_wenge_wood", STRIPPED_WENGE_WOOD);
		Registry.register(BLOCK, "deep_trenches:stripped_yew_log", STRIPPED_YEW_LOG);
		Registry.register(BLOCK, "deep_trenches:stripped_yew_wood", STRIPPED_YEW_WOOD);

		Registry.register(BLOCK, "deep_trenches:potted_almond_sapling", POTTED_ALMOND_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_anameata_sapling", POTTED_ANAMEATA_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_angels_trumpet_sapling", POTTED_ANGELS_TRUMPET_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_aquean_sapling", POTTED_AQUEAN_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_barshrookle_sapling", POTTED_BARSHROOKLE_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_black_birch_sapling", POTTED_BLACK_BIRCH_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_blue_mahoe_sapling", POTTED_BLUE_MAHOE_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_blue_spruce_sapling", POTTED_BLUE_SPRUCE_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_bottlebrush_sapling", POTTED_BOTTLEBRUSH_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_bromya_sapling", POTTED_BROMYA_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_bubbletree_sapling", POTTED_BUBBLETREE_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_calcearb_sapling", POTTED_CALCEARB_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_cherry_sapling", POTTED_CHERRY_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_cook_pine_sapling", POTTED_COOK_PINE_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_crolood_sapling", POTTED_CROLOOD_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_dark_crolood_sapling", POTTED_DARK_CROLOOD_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_dark_fuchsitra_sapling", POTTED_DARK_FUCHSITRA_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_dark_red_elm_sapling", POTTED_DARK_RED_ELM_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_ebony_sapling", POTTED_EBONY_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_enderheart_sapling", POTTED_ENDERHEART_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_fruce_sapling", POTTED_FRUCE_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_fuchsitra_sapling", POTTED_FUCHSITRA_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_fugmos", POTTED_FUGMOS);
		Registry.register(BLOCK, "deep_trenches:potted_funeranite_sapling", POTTED_FUNERANITE_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_ghoshroom_sapling", POTTED_GHOSHROOM_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_guaiacum_sapling", POTTED_GUAIACUM_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_joshua_sapling", POTTED_JOSHUA_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_klinkii_pine_sapling", POTTED_KLINKII_PINE_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_melaleuca_sapling", POTTED_MELALEUCA_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_murkantuan_sapling", POTTED_MURKANTUAN_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_norfolk_pine_sapling", POTTED_NORFOLK_PINE_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_orhpris_sapling", POTTED_ORHPRIS_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_peltogyne_sapling", POTTED_PELTOGYNE_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_pin_cherry_sapling", POTTED_PIN_CHERRY_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_plum_sapling", POTTED_PLUM_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_purfunga_sapling", POTTED_PURFUNGA_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_rark_sapling", POTTED_RARK_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_red_elm_sapling", POTTED_RED_ELM_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_rhadi_sapling", POTTED_RHADI_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_sanguart_sapling", POTTED_SANGUART_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_sequoia_sapling", POTTED_SEQUOIA_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_sproom_sapling", POTTED_SPROOM_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_stortreean_sapling", POTTED_STORTREEAN_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_stroomean_sapling", POTTED_STROOMEAN_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_sunrise_fungus_sapling", POTTED_SUNRISE_FUNGUS_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_tark_sapling", POTTED_TARK_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_teak_sapling", POTTED_TEAK_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_thundercloud_plum_sapling", POTTED_THUNDERCLOUD_PLUM_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_vynhert_sapling", POTTED_VYNHERT_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_wenge_sapling", POTTED_WENGE_SAPLING);
		Registry.register(BLOCK, "deep_trenches:potted_yew_sapling", POTTED_YEW_SAPLING);

		Registry.register(BLOCK, "deep_trenches:potted_black_pansy", POTTED_BLACK_PANSY);
		Registry.register(BLOCK, "deep_trenches:potted_blue_pansy", POTTED_BLUE_PANSY);
		Registry.register(BLOCK, "deep_trenches:potted_blue_poppy", POTTED_BLUE_POPPY);
		Registry.register(BLOCK, "deep_trenches:potted_blue_violet", POTTED_BLUE_VIOLET);
		Registry.register(BLOCK, "deep_trenches:potted_bonnet_spurge", POTTED_BONNET_SPURGE);
		Registry.register(BLOCK, "deep_trenches:potted_brown_pansy", POTTED_BROWN_PANSY);
		Registry.register(BLOCK, "deep_trenches:potted_cactlow", POTTED_CACTLOW);
		Registry.register(BLOCK, "deep_trenches:potted_chocolate_cosmos_flower", POTTED_CHOCOLATE_COSMOS_FLOWER);
		Registry.register(BLOCK, "deep_trenches:potted_cyan_blue_violet", POTTED_CYAN_BLUE_VIOLET);
		Registry.register(BLOCK, "deep_trenches:potted_cycawler", POTTED_CYCAWLER);
		Registry.register(BLOCK, "deep_trenches:potted_drigyus", POTTED_DRIGYUS);
		Registry.register(BLOCK, "deep_trenches:potted_garden_pinks", POTTED_GARDEN_PINKS);
		Registry.register(BLOCK, "deep_trenches:potted_green_pansy", POTTED_GREEN_PANSY);
		Registry.register(BLOCK, "deep_trenches:potted_gyldelion_flower", POTTED_GYLDELION_FLOWER);
		Registry.register(BLOCK, "deep_trenches:potted_limefork", POTTED_LIMEFORK);
		Registry.register(BLOCK, "deep_trenches:potted_marsh_violet", POTTED_MARSH_VIOLET);
		Registry.register(BLOCK, "deep_trenches:potted_native_violet", POTTED_NATIVE_VIOLET);
		Registry.register(BLOCK, "deep_trenches:potted_opium_poppy", POTTED_OPIUM_POPPY);
		Registry.register(BLOCK, "deep_trenches:potted_poppy", POTTED_POPPY);
		Registry.register(BLOCK, "deep_trenches:potted_pink_and_orange_pansy", POTTED_PINK_AND_ORANGE_PANSY);
		Registry.register(BLOCK, "deep_trenches:potted_pink_braitor_flower", POTTED_PINK_BRAITOR_FLOWER);
		Registry.register(BLOCK, "deep_trenches:potted_pink_marsh_violet", POTTED_PINK_MARSH_VIOLET);
		Registry.register(BLOCK, "deep_trenches:potted_pink_rose", POTTED_PINK_ROSE);
		Registry.register(BLOCK, "deep_trenches:potted_pink_rose_bush", POTTED_PINK_ROSE_BUSH);
		Registry.register(BLOCK, "deep_trenches:potted_purple_and_orange_pansy", POTTED_PURPLE_AND_ORANGE_PANSY);
		Registry.register(BLOCK, "deep_trenches:potted_red_braitor_flower", POTTED_RED_BRAITOR_FLOWER);
		Registry.register(BLOCK, "deep_trenches:potted_red_chocolate_cosmos_flower", POTTED_RED_CHOCOLATE_COSMOS_FLOWER);
		Registry.register(BLOCK, "deep_trenches:potted_red_pansy", POTTED_RED_PANSY);
		Registry.register(BLOCK, "deep_trenches:potted_red_rose", POTTED_RED_ROSE);
		Registry.register(BLOCK, "deep_trenches:potted_rubra_blue_violet", POTTED_RUBRA_BLUE_VIOLET);
		Registry.register(BLOCK, "deep_trenches:potted_scarlet_thiorcen", POTTED_SCARLET_THIORCEN);
		Registry.register(BLOCK, "deep_trenches:potted_spidreet", POTTED_SPIDREET);
		Registry.register(BLOCK, "deep_trenches:potted_spike_lavender", POTTED_SPIKE_LAVENDER);
		Registry.register(BLOCK, "deep_trenches:potted_sproom_spike", POTTED_SPROOM_SPIKE);
		Registry.register(BLOCK, "deep_trenches:potted_squisacle", POTTED_SQUISACLE);
		Registry.register(BLOCK, "deep_trenches:potted_sweet_violet", POTTED_SWEET_VIOLET);
		Registry.register(BLOCK, "deep_trenches:potted_topped_lavender", POTTED_TOPPED_LAVENDER);
		Registry.register(BLOCK, "deep_trenches:potted_twisttrap", POTTED_TWISTTRAP);
		Registry.register(BLOCK, "deep_trenches:potted_vaslame", POTTED_VASLAME);
		Registry.register(BLOCK, "deep_trenches:potted_weepistil", POTTED_WEEPISTIL);
		Registry.register(BLOCK, "deep_trenches:potted_weepy_hollower", POTTED_WEEPY_HOLLOWER);
		Registry.register(BLOCK, "deep_trenches:potted_wheeping_azure_bloom", POTTED_WHEEPING_AZURE_BLOOM);
		Registry.register(BLOCK, "deep_trenches:potted_white_violet", POTTED_WHITE_VIOLET);
		Registry.register(BLOCK, "deep_trenches:potted_wild_pansy", POTTED_WILD_PANSY);
		Registry.register(BLOCK, "deep_trenches:potted_yellow_violet", POTTED_YELLOW_VIOLET);

		Registry.register(BLOCK, "deep_trenches:potted_gray_shag_mushroom", POTTED_GRAY_SHAG_MUSHROOM);
		Registry.register(BLOCK, "deep_trenches:potted_inky_cap_mushroom", POTTED_INKY_CAP_MUSHROOM);
		Registry.register(BLOCK, "deep_trenches:potted_puffball_mushroom", POTTED_PUFFBALL_MUSHROOM);
		Registry.register(BLOCK, "deep_trenches:potted_shelf_mushroom", POTTED_SHELF_MUSHROOM);
		Registry.register(BLOCK, "deep_trenches:potted_white_mushroom", POTTED_WHITE_MUSHROOM);
	}

}