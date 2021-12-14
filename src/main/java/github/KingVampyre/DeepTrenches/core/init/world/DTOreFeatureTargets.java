package github.KingVampyre.DeepTrenches.core.init.world;

import com.google.common.collect.ImmutableList;
import net.minecraft.block.Block;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

import static github.KingVampyre.DeepTrenches.core.init.block.DTBlocks.*;
import static github.KingVampyre.DeepTrenches.core.init.world.DTRuleTests.*;

public class DTOreFeatureTargets {

    public static final List<OreFeatureConfig.Target> ACTINIUM_ORES;
    public static final List<OreFeatureConfig.Target> AQUAMARINE_ORES;
    public static final List<OreFeatureConfig.Target> BLACK_OPAL_ORES;
    public static final List<OreFeatureConfig.Target> BORON_ORES;
    public static final List<OreFeatureConfig.Target> CHALCEDONY_ORES;
    public static final List<OreFeatureConfig.Target> CHARGED_TUNGSTEN_ORES;
    public static final List<OreFeatureConfig.Target> CLINOHUMITE_ORES;
    public static final List<OreFeatureConfig.Target> COAL_ORES;
    public static final List<OreFeatureConfig.Target> COPPER_ORES;
    public static final List<OreFeatureConfig.Target> DIAMOND_ORES;
    public static final List<OreFeatureConfig.Target> DIOPSIDE_ORES;
    public static final List<OreFeatureConfig.Target> ENSTATITE_ORES;
    public static final List<OreFeatureConfig.Target> EMERALD_ORES;
    public static final List<OreFeatureConfig.Target> GARNET_ORES;
    public static final List<OreFeatureConfig.Target> GOLD_ORES;
    public static final List<OreFeatureConfig.Target> IRON_ORES;
    public static final List<OreFeatureConfig.Target> LAPIS_ORES;
    public static final List<OreFeatureConfig.Target> MORGANITE_ORES;
    public static final List<OreFeatureConfig.Target> OPAL_ORES;
    public static final List<OreFeatureConfig.Target> REDSTONE_ORES;
    public static final List<OreFeatureConfig.Target> RUBY_ORES;
    public static final List<OreFeatureConfig.Target> SAPPHIRE_ORES;
    public static final List<OreFeatureConfig.Target> SILICON_ORES;
    public static final List<OreFeatureConfig.Target> SILVER_ORES;
    public static final List<OreFeatureConfig.Target> SPHENE_ORES;
    public static final List<OreFeatureConfig.Target> SPINEL_ORES;
    public static final List<OreFeatureConfig.Target> STORCEAN_SAPPHIRE_ORES;
    public static final List<OreFeatureConfig.Target> STORCEAN_SILICON_ORES;
    public static final List<OreFeatureConfig.Target> STORCEAN_TUNGSTEN_ORES;
    public static final List<OreFeatureConfig.Target> STROXITE_ORES;
    public static final List<OreFeatureConfig.Target> SUGILITE_ORES;
    public static final List<OreFeatureConfig.Target> TANZANITE_ORES;
    public static final List<OreFeatureConfig.Target> TOPAZ_ORES;
    public static final List<OreFeatureConfig.Target> TUNGSTEN_ORES;
    public static final List<OreFeatureConfig.Target> URANIUM_ORES;
    public static final List<OreFeatureConfig.Target> URANOLUMEN_ORES;
    public static final List<OreFeatureConfig.Target> VOID_CRITTERED_DIOPSIDE_ORES;

    protected static OreFeatureConfig.Target createTarget(RuleTest test, Block block) {
        return OreFeatureConfig.createTarget(test, block.getDefaultState());
    }

    static {
        ACTINIUM_ORES = ImmutableList.of(
                createTarget(STORCENDITE_TEST, STORCENDITE_ACTINIUM_ORE)
        );
        
        AQUAMARINE_ORES = ImmutableList.of(
                createTarget(ANDESITE_TEST, ANDESITE_AQUAMARINE_ORE),
                createTarget(DIORITE_TEST, DIORITE_AQUAMARINE_ORE),
                createTarget(DEEPSLATE_TEST, DEEPSLATE_AQUAMARINE_ORE),
                createTarget(HADAL_STONE_TEST, HADAL_STONE_AQUAMARINE_ORE),
                createTarget(INFINITAL_STONE_TEST, INFINITAL_STONE_AQUAMARINE_ORE),
                createTarget(LIMESTONE_TEST, LIMESTONE_AQUAMARINE_ORE),
                createTarget(PINKINE_TEST, PINKINE_AQUAMARINE_ORE),
                createTarget(STORCENDITE_TEST, STORCENDITE_AQUAMARINE_ORE),
                createTarget(STORCERACK_TEST, STORCERACK_AQUAMARINE_ORE),
                createTarget(VIRDAL_STONE_TEST, VIRDAL_STONE_AQUAMARINE_ORE),
                createTarget(STONE_TEST, AQUAMARINE_ORE)
        );

        BLACK_OPAL_ORES = ImmutableList.of(
                createTarget(ANDESITE_TEST, ANDESITE_BLACK_OPAL_ORE),
                createTarget(BLUE_STORCERACK_TEST, BLUE_STORCERACK_BLACK_OPAL_ORE),
                createTarget(DIORITE_TEST, DIORITE_AQUAMARINE_ORE),
                createTarget(DEEPSLATE_TEST, DEEPSLATE_BLACK_OPAL_ORE),
                createTarget(GRANITE_TEST, GRANITE_BLACK_OPAL_ORE),
                createTarget(HADAL_STONE_TEST, HADAL_STONE_BLACK_OPAL_ORE),
                createTarget(INFINITAL_STONE_TEST, INFINITAL_STONE_BLACK_OPAL_ORE),
                createTarget(LIMESTONE_TEST, LIMESTONE_BLACK_OPAL_ORE),
                createTarget(PINKINE_TEST, PINKINE_BLACK_OPAL_ORE),
                createTarget(STORCENDITE_TEST, STORCENDITE_BLACK_OPAL_ORE),
                createTarget(STORCERACK_TEST, STORCERACK_BLACK_OPAL_ORE),
                createTarget(VIRDAL_STONE_TEST, VIRDAL_STONE_BLACK_OPAL_ORE),
                createTarget(STONE_TEST, BLACK_OPAL_ORE)
        );

        BORON_ORES = ImmutableList.of(
                createTarget(NETHERRACK_TEST, NETHERRACK_BORON_ORE)
        );

        CHALCEDONY_ORES = ImmutableList.of(
                createTarget(ANDESITE_TEST, ANDESITE_CHALCEDONY_ORE),
                createTarget(BLACK_BASALT_TEST, BLACK_BASALT_CHALCEDONY_ORE),
                createTarget(CALCITE_TEST, CALCITE_CHALCEDONY_ORE),
                createTarget(DEEPSLATE_TEST, DEEPSLATE_CHALCEDONY_ORE),
                createTarget(DIORITE_TEST, DIORITE_CHALCEDONY_ORE),
                createTarget(GRANITE_TEST, GRANITE_CHALCEDONY_ORE),
                createTarget(SMOOTH_BASALT_TEST, SMOOTH_BASALT_CHALCEDONY_ORE),
                createTarget(SULFUR_STONE_TEST, SULFUR_STONE_CHALCEDONY_ORE),
                createTarget(TUFF_TEST, TUFF_CHALCEDONY_ORE)
        );

        CHARGED_TUNGSTEN_ORES = ImmutableList.of(
                createTarget(BLUE_STORCERACK_TEST, BLUE_STORCERACK_CHARGED_TUNGSTEN_ORE)
        );

        CLINOHUMITE_ORES = ImmutableList.of(
                createTarget(ANDESITE_TEST, ANDESITE_CLINOHUMITE_ORE),
                createTarget(BASALT_TEST, BASALT_CLINOHUMITE_ORE),
                createTarget(BLACK_BASALT_TEST, BLACK_BASALT_CLINOHUMITE_ORE),
                createTarget(CALCITE_TEST, CALCITE_CLINOHUMITE_ORE),
                createTarget(DEEPSLATE_TEST, DEEPSLATE_CLINOHUMITE_ORE),
                createTarget(DIORITE_TEST, DIORITE_CLINOHUMITE_ORE),
                createTarget(GRANITE_TEST, GRANITE_CLINOHUMITE_ORE),
                createTarget(HADAL_STONE_TEST, HADAL_STONE_CLINOHUMITE_ORE),
                createTarget(NETHERRACK_TEST, NETHERRACK_CLINOHUMITE_ORE),
                createTarget(SMOOTH_BASALT_TEST, SMOOTH_BASALT_CLINOHUMITE_ORE),
                createTarget(SULFUR_STONE_TEST, SULFUR_STONE_CLINOHUMITE_ORE),
                createTarget(TUFF_TEST, TUFF_CLINOHUMITE_ORE),
                createTarget(WAVEITE_TEST, WAVEITE_CLINOHUMITE_ORE),
                createTarget(STONE_TEST, CLINOHUMITE_ORE)
        );

        COAL_ORES = ImmutableList.of(
                createTarget(ANDESITE_TEST, ANDESITE_COAL_ORE),
                createTarget(BASALT_TEST, BASALT_COAL_ORE),
                createTarget(BLACK_BASALT_TEST, BLACK_BASALT_COAL_ORE),
                createTarget(BLUE_STORCERACK_TEST, BLUE_STORCERACK_COAL_ORE),
                createTarget(CALCITE_TEST, CALCITE_COAL_ORE),
                createTarget(DIORITE_TEST, DIORITE_COAL_ORE),
                createTarget(GRANITE_TEST, GRANITE_COAL_ORE),
                createTarget(HADAL_STONE_TEST, HADAL_STONE_COAL_ORE),
                createTarget(INFINITAL_STONE_TEST, INFINITAL_STONE_COAL_ORE),
                createTarget(LIMESTONE_TEST, LIMESTONE_COAL_ORE),
                createTarget(PINKINE_TEST, PINKINE_COAL_ORE),
                createTarget(STORCENDITE_TEST, STORCENDITE_COAL_ORE),
                createTarget(STORCERACK_TEST, STORCERACK_COAL_ORE),
                createTarget(SULFUR_STONE_TEST, SULFUR_STONE_COAL_ORE),
                createTarget(TUFF_TEST, TUFF_COAL_ORE),
                createTarget(VERDINE_TEST, VERDINE_COAL_ORE),
                createTarget(VIRDAL_STONE_TEST, VIRDAL_STONE_COAL_ORE),
                createTarget(WAVEITE_TEST, WAVEITE_COAL_ORE)
        );

        COPPER_ORES = ImmutableList.of(
                createTarget(ANDESITE_TEST, ANDESITE_COPPER_ORE),
                createTarget(BLUE_STORCERACK_TEST, BLUE_STORCERACK_COPPER_ORE),
                createTarget(DIORITE_TEST, DIORITE_COPPER_ORE),
                createTarget(GRANITE_TEST, GRANITE_COPPER_ORE),
                createTarget(HADAL_STONE_TEST, HADAL_STONE_COPPER_ORE),
                createTarget(INFINITAL_STONE_TEST, INFINITAL_STONE_COPPER_ORE),
                createTarget(LIMESTONE_TEST, LIMESTONE_COPPER_ORE),
                createTarget(PINKINE_TEST, PINKINE_COPPER_ORE),
                createTarget(STORCENDITE_TEST, STORCENDITE_COPPER_ORE),
                createTarget(STORCENDITE_TEST, STORCERACK_COPPER_ORE),
                createTarget(VIRDAL_STONE_TEST, VIRDAL_STONE_COPPER_ORE),
                createTarget(WAVEITE_TEST, WAVEITE_COPPER_ORE)
        );

        DIAMOND_ORES = ImmutableList.of(
                createTarget(ANDESITE_TEST, ANDESITE_DIAMOND_ORE),
                createTarget(BEDROCK_TEST, BEDROCK_DIAMOND_ORE),
                createTarget(BLACK_BASALT_TEST, BLACK_BASALT_DIAMOND_ORE),
                createTarget(BLUE_STORCERACK_TEST, BLUE_STORCERACK_DIAMOND_ORE),
                createTarget(CALCITE_TEST, CALCITE_DIAMOND_ORE),
                createTarget(DIORITE_TEST, DIORITE_DIAMOND_ORE),
                createTarget(GRAY_MARBLE_TEST, GRAY_MARBLE_DIAMOND_ORE),
                createTarget(GRANITE_TEST, GRANITE_DIAMOND_ORE),
                createTarget(HADAL_STONE_TEST, HADAL_STONE_DIAMOND_ORE),
                createTarget(INFINITAL_STONE_TEST, INFINITAL_STONE_DIAMOND_ORE),
                createTarget(LIMESTONE_TEST, LIMESTONE_DIAMOND_ORE),
                createTarget(MARBLE_TEST, MARBLE_DIAMOND_ORE),
                createTarget(PINKINE_TEST, PINKINE_DIAMOND_ORE),
                createTarget(SMOOTH_BASALT_TEST, SMOOTH_BASALT_DIAMOND_ORE),
                createTarget(STORCENDITE_TEST, STORCENDITE_DIAMOND_ORE),
                createTarget(STORCERACK_TEST, STORCERACK_DIAMOND_ORE),
                createTarget(TUFF_TEST, TUFF_DIAMOND_ORE),
                createTarget(VIRDAL_STONE_TEST, VIRDAL_STONE_DIAMOND_ORE),
                createTarget(WAVED_BEDROCK_TEST, WAVED_BEDROCK_DIAMOND_ORE),
                createTarget(WAVEITE_TEST, WAVEITE_DIAMOND_ORE)
        );

        DIOPSIDE_ORES = ImmutableList.of(
                createTarget(BEDROCK_TEST, BEDROCK_DIOPSIDE_ORE),
                createTarget(END_STONE_TEST, END_STONE_DIOPSIDE_ORE),
                createTarget(PINKINE_TEST, PINKINE_DIOPSIDE_ORE),
                createTarget(WAVED_BEDROCK_TEST, WAVED_BEDROCK_DIOPSIDE_ORE)
        );

        ENSTATITE_ORES = ImmutableList.of(
                createTarget(INFINITAL_STONE_TEST, INFINITAL_STONE_ENSTATITE_ORE),
                createTarget(PINKINE_TEST, PINKINE_ENSTATITE_ORE),
                createTarget(STORCENDITE_TEST, STORCENDITE_ENSTATITE_ORE),
                createTarget(STORCERACK_TEST, STORCERACK_ENSTATITE_ORE)
        );

        EMERALD_ORES = ImmutableList.of(
                createTarget(ANDESITE_TEST, ANDESITE_EMERALD_ORE),
                createTarget(DIORITE_TEST, DIORITE_EMERALD_ORE),
                createTarget(GRANITE_TEST, GRANITE_EMERALD_ORE),
                createTarget(HADAL_STONE_TEST, HADAL_STONE_EMERALD_ORE),
                createTarget(WAVEITE_TEST, WAVEITE_EMERALD_ORE)
        );

        GARNET_ORES = ImmutableList.of(
                createTarget(ANDESITE_TEST, ANDESITE_GARNET_ORE),
                createTarget(DEEPSLATE_TEST, DEEPSLATE_GARNET_ORE),
                createTarget(DIORITE_TEST, DIORITE_GARNET_ORE),
                createTarget(GRANITE_TEST, GRANITE_GARNET_ORE),
                createTarget(HADAL_STONE_TEST, HADAL_STONE_GARNET_ORE),
                createTarget(RHODONITE_TEST, RHODONITE_GARNET_ORE),
                createTarget(WAVEITE_TEST, WAVEITE_GARNET_ORE)
        );

        GOLD_ORES = ImmutableList.of(
                createTarget(ANDESITE_TEST, ANDESITE_GOLD_ORE),
                createTarget(BLACK_BASALT_TEST, BLACK_BASALT_GOLD_ORE),
                createTarget(BLUE_STORCERACK_TEST, BLUE_STORCERACK_GOLD_ORE),
                createTarget(CALCITE_TEST, CALCITE_GOLD_ORE),
                createTarget(DIORITE_TEST, DIORITE_GOLD_ORE),
                createTarget(GRANITE_TEST, GRANITE_GOLD_ORE),
                createTarget(HADAL_STONE_TEST, HADAL_STONE_GOLD_ORE),
                createTarget(SMOOTH_BASALT_TEST, SMOOTH_BASALT_GOLD_ORE),
                createTarget(STORCERACK_TEST, STORCERACK_GOLD_ORE),
                createTarget(TUFF_TEST, TUFF_GOLD_ORE),
                createTarget(WAVEITE_TEST, WAVEITE_GOLD_ORE)
        );

        IRON_ORES = ImmutableList.of(
                createTarget(ANDESITE_TEST, ANDESITE_IRON_ORE),
                createTarget(BLACK_BASALT_TEST, BLACK_BASALT_IRON_ORE),
                createTarget(BLUE_STORCERACK_TEST, BLUE_STORCERACK_IRON_ORE),
                createTarget(DIORITE_TEST, DIORITE_IRON_ORE),
                createTarget(GRANITE_TEST, GRANITE_IRON_ORE),
                createTarget(HADAL_STONE_TEST, HADAL_STONE_IRON_ORE),
                createTarget(INFINITAL_STONE_TEST, INFINITAL_STONE_IRON_ORE),
                createTarget(LIMESTONE_TEST, LIMESTONE_IRON_ORE),
                createTarget(PINKINE_TEST, PINKINE_IRON_ORE),
                createTarget(STORCENDITE_TEST, STORCENDITE_IRON_ORE),
                createTarget(STORCERACK_TEST, STORCERACK_IRON_ORE),
                createTarget(VIRDAL_STONE_TEST, VIRDAL_STONE_IRON_ORE),
                createTarget(WAVEITE_TEST, WAVEITE_IRON_ORE)
        );

        LAPIS_ORES = ImmutableList.of(
                createTarget(ANDESITE_TEST, ANDESITE_LAPIS_ORE),
                createTarget(DIORITE_TEST, DIORITE_LAPIS_ORE),
                createTarget(GRANITE_TEST, GRANITE_LAPIS_ORE),
                createTarget(HADAL_STONE_TEST, HADAL_STONE_LAPIS_ORE),
                createTarget(WAVEITE_TEST, WAVEITE_LAPIS_ORE)
        );

        MORGANITE_ORES = ImmutableList.of(
                createTarget(ANDESITE_TEST, ANDESITE_MORGANITE_ORE),
                createTarget(BEDROCK_TEST, BEDROCK_MORGANITE_ORE),
                createTarget(DEEPSLATE_TEST, DEEPSLATE_MORGANITE_ORE),
                createTarget(DIORITE_TEST, DIORITE_MORGANITE_ORE),
                createTarget(GRANITE_TEST, GRANITE_MORGANITE_ORE),
                createTarget(HADAL_STONE_TEST, HADAL_STONE_MORGANITE_ORE),
                createTarget(WAVED_BEDROCK_TEST, WAVED_BEDROCK_MORGANITE_ORE),
                createTarget(WAVEITE_TEST, WAVEITE_MORGANITE_ORE),
                createTarget(STONE_TEST, MORGANITE_ORE)
        );

        OPAL_ORES = ImmutableList.of(
                createTarget(DEEPSLATE_TEST, DEEPSLATE_OPAL_ORE),
                createTarget(INFINITAL_STONE_TEST, INFINITAL_STONE_OPAL_ORE),
                createTarget(LIMESTONE_TEST, LIMESTONE_OPAL_ORE),
                createTarget(PINKINE_TEST, PINKINE_OPAL_ORE),
                createTarget(SKYSTONE_TEST, SKYSTONE_OPAL_ORE),
                createTarget(STORCENDITE_TEST, STORCENDITE_OPAL_ORE),
                createTarget(STORCERACK_TEST, STORCERACK_OPAL_ORE),
                createTarget(VIRDAL_STONE_TEST, VIRDAL_STONE_OPAL_ORE),
                createTarget(STONE_TEST, OPAL_ORE)
        );

        REDSTONE_ORES = ImmutableList.of(
                createTarget(ANDESITE_TEST, ANDESITE_REDSTONE_ORE),
                createTarget(BLUE_STORCERACK_TEST, BLUE_STORCERACK_REDSTONE_ORE),
                createTarget(DIORITE_TEST, DIORITE_REDSTONE_ORE),
                createTarget(GRANITE_TEST, GRANITE_REDSTONE_ORE),
                createTarget(HADAL_STONE_TEST, HADAL_STONE_REDSTONE_ORE),
                createTarget(STORCERACK_TEST, STORCERACK_REDSTONE_ORE),
                createTarget(WAVEITE_TEST, WAVEITE_REDSTONE_ORE)
        );

        RUBY_ORES = ImmutableList.of(
                createTarget(ANDESITE_TEST, ANDESITE_RUBY_ORE),
                createTarget(BLUE_STORCERACK_TEST, BLUE_STORCERACK_RUBY_ORE),
                createTarget(DEEPSLATE_TEST, DEEPSLATE_RUBY_ORE),
                createTarget(DIORITE_TEST, DIORITE_RUBY_ORE),
                createTarget(GRANITE_TEST, GRANITE_RUBY_ORE),
                createTarget(HADAL_STONE_TEST, HADAL_STONE_RUBY_ORE),
                createTarget(INFINITAL_STONE_TEST, INFINITAL_STONE_RUBY_ORE),
                createTarget(PINKINE_TEST, PINKINE_RUBY_ORE),
                createTarget(STORCENDITE_TEST, STORCENDITE_RUBY_ORE),
                createTarget(STORCERACK_TEST, STORCERACK_RUBY_ORE),
                createTarget(VIRDAL_STONE_TEST, VIRDAL_STONE_RUBY_ORE),
                createTarget(WAVEITE_TEST, WAVEITE_RUBY_ORE),
                createTarget(STONE_TEST, RUBY_ORE)
        );

        SAPPHIRE_ORES = ImmutableList.of(
                createTarget(DEEPSLATE_TEST, DEEPSLATE_SAPPHIRE_ORE),
                createTarget(HADAL_STONE_TEST, HADAL_STONE_SAPPHIRE_ORE),
                createTarget(INFINITAL_STONE_TEST, INFINITAL_STONE_SAPPHIRE_ORE),
                createTarget(LIMESTONE_TEST, LIMESTONE_SAPPHIRE_ORE),
                createTarget(LUSTERED_WAVEITE_TEST, LUSTERED_WAVEITE_SAPPHIRE_ORE),
                createTarget(PINKINE_TEST, PINKINE_SAPPHIRE_ORE),
                createTarget(RINGWOODITE_TEST, RINGWOODITE_SAPPHIRE_ORE),
                createTarget(STORCENDITE_TEST, STORCENDITE_SAPPHIRE_ORE),
                createTarget(STORCERACK_TEST, STORCERACK_SAPPHIRE_ORE),
                createTarget(VIRDAL_STONE_TEST, VIRDAL_STONE_SAPPHIRE_ORE),
                createTarget(WAVEITE_TEST, WAVEITE_SAPPHIRE_ORE),
                createTarget(STONE_TEST, SAPPHIRE_ORE)
        );

        SILICON_ORES = ImmutableList.of(
                createTarget(FLINT_STONE_TEST, FLINT_STONE_SILICON_ORE),
                createTarget(INFINITAL_STONE_TEST, INFINITAL_STONE_SILICON_ORE),
                createTarget(PINKINE_TEST, PINKINE_SILICON_ORE),
                createTarget(STORCENDITE_TEST, STORCENDITE_SILICON_ORE),
                createTarget(STORCERACK_TEST, STORCERACK_SILICON_ORE),
                createTarget(VIRDAL_STONE_TEST, VIRDAL_STONE_SILICON_ORE),
                createTarget(WAVEITE_TEST, WAVEITE_SILICON_ORE)
        );

        SILVER_ORES = ImmutableList.of(
                createTarget(ANDESITE_TEST, ANDESITE_SILVER_ORE),
                createTarget(DEEPSLATE_TEST, DEEPSLATE_SILVER_ORE),
                createTarget(DIORITE_TEST, DIORITE_SILVER_ORE),
                createTarget(GRANITE_TEST, GRANITE_SILVER_ORE),
                createTarget(HADAL_STONE_TEST, HADAL_STONE_SILVER_ORE),
                createTarget(WAVEITE_TEST, WAVEITE_SILVER_ORE)
        );

        SPHENE_ORES = ImmutableList.of(
                createTarget(ANDESITE_TEST, ANDESITE_SPHENE_ORE),
                createTarget(BLUE_STORCERACK_TEST, BLUE_STORCERACK_SPHENE_ORE),
                createTarget(DEEPSLATE_TEST, DEEPSLATE_SPHENE_ORE),
                createTarget(DIORITE_TEST, DIORITE_SPHENE_ORE),
                createTarget(GRANITE_TEST, GRANITE_SPHENE_ORE),
                createTarget(HADAL_STONE_TEST, HADAL_STONE_SPHENE_ORE),
                createTarget(INFINITAL_STONE_TEST, INFINITAL_STONE_SPHENE_ORE),
                createTarget(LIMESTONE_TEST, LIMESTONE_SPHENE_ORE),
                createTarget(PINKINE_TEST, PINKINE_SPHENE_ORE),
                createTarget(STORCENDITE_TEST, STORCENDITE_SPHENE_ORE),
                createTarget(STORCERACK_TEST, STORCERACK_SPHENE_ORE),
                createTarget(VIRDAL_STONE_TEST, VIRDAL_STONE_SPHENE_ORE),
                createTarget(WAVEITE_TEST, WAVEITE_SPHENE_ORE),
                createTarget(STONE_TEST, SPHENE_ORE)
        );

        SPINEL_ORES = ImmutableList.of(
                createTarget(ANDESITE_TEST, ANDESITE_SPINEL_ORE),
                createTarget(BLUE_STORCERACK_TEST, BLUE_STORCERACK_SPINEL_ORE),
                createTarget(DEEPSLATE_TEST, DEEPSLATE_SPINEL_ORE),
                createTarget(DIORITE_TEST, DIORITE_SPINEL_ORE),
                createTarget(END_STONE_TEST, END_STONE_SPINEL_ORE),
                createTarget(GRANITE_TEST, GRANITE_SPINEL_ORE),
                createTarget(HADAL_STONE_TEST, HADAL_STONE_SPINEL_ORE),
                createTarget(INFINITAL_STONE_TEST, INFINITAL_STONE_SPINEL_ORE),
                createTarget(LIMESTONE_TEST, LIMESTONE_SPINEL_ORE),
                createTarget(PINKINE_TEST, PINKINE_SPINEL_ORE),
                createTarget(STORCENDITE_TEST, STORCENDITE_SPINEL_ORE),
                createTarget(STORCERACK_TEST, STORCERACK_SPINEL_ORE),
                createTarget(VIRDAL_STONE_TEST, VIRDAL_STONE_SPINEL_ORE),
                createTarget(WAVEITE_TEST, WAVEITE_SPINEL_ORE),
                createTarget(STONE_TEST, SPINEL_ORE)
        );

        STORCEAN_SAPPHIRE_ORES = ImmutableList.of(
                createTarget(STORCERACK_TEST, STORCEAN_SAPPHIRE_ORE)
        );

        STORCEAN_SILICON_ORES = ImmutableList.of(
                createTarget(STORCERACK_TEST, STORCEAN_SILICON_ORE)
        );

        STORCEAN_TUNGSTEN_ORES = ImmutableList.of(
                createTarget(STORCERACK_TEST, STORCEAN_TUNGSTEN_ORE)
        );

        STROXITE_ORES = ImmutableList.of(
                createTarget(BLUE_STORCERACK_TEST, BLUE_STORCERACK_STROXITE_ORE)
        );

        SUGILITE_ORES = ImmutableList.of(
                createTarget(DEEPSLATE_TEST, DEEPSLATE_SUGILITE_ORE),
                createTarget(HADAL_STONE_TEST, HADAL_STONE_SUGILITE_ORE),
                createTarget(INFINITAL_STONE_TEST, INFINITAL_STONE_SUGILITE_ORE),
                createTarget(LIMESTONE_TEST, LIMESTONE_SUGILITE_ORE),
                createTarget(PINKINE_TEST, PINKINE_SUGILITE_ORE),
                createTarget(STORCENDITE_TEST, STORCENDITE_SUGILITE_ORE),
                createTarget(STORCERACK_TEST, STORCERACK_SUGILITE_ORE),
                createTarget(VIRDAL_STONE_TEST, VIRDAL_STONE_SUGILITE_ORE),
                createTarget(WAVEITE_TEST, WAVEITE_SUGILITE_ORE),
                createTarget(STONE_TEST, SUGILITE_ORE)
        );

        TANZANITE_ORES = ImmutableList.of(
                createTarget(ANDESITE_TEST, ANDESITE_TANZANITE_ORE),
                createTarget(DEEPSLATE_TEST, DEEPSLATE_TANZANITE_ORE),
                createTarget(DIORITE_TEST, DIORITE_TANZANITE_ORE),
                createTarget(GRANITE_TEST, GRANITE_TANZANITE_ORE),
                createTarget(HADAL_STONE_TEST, HADAL_STONE_TANZANITE_ORE),
                createTarget(LUSTERED_WAVEITE_TEST, LUSTERED_WAVEITE_TANZANITE_ORE),
                createTarget(WAVED_BEDROCK_TEST, WAVED_BEDROCK_TANZANITE_ORE),
                createTarget(WAVEITE_TEST, WAVEITE_TANZANITE_ORE),
                createTarget(STONE_TEST, TANZANITE_ORE)
        );

        TOPAZ_ORES = ImmutableList.of(
                createTarget(ANDESITE_TEST, ANDESITE_TOPAZ_ORE),
                createTarget(DEEPSLATE_TEST, DEEPSLATE_TOPAZ_ORE),
                createTarget(DIORITE_TEST, DIORITE_TOPAZ_ORE),
                createTarget(GRANITE_TEST, GRANITE_TOPAZ_ORE),
                createTarget(HADAL_STONE_TEST, HADAL_STONE_TOPAZ_ORE),
                createTarget(WAVEITE_TEST, WAVEITE_TOPAZ_ORE),
                createTarget(STONE_TEST, TOPAZ_ORE)
        );

        TUNGSTEN_ORES = ImmutableList.of(
                createTarget(STORCERACK_TEST, STORCERACK_TUNGSTEN_ORE)
        );

        URANIUM_ORES = ImmutableList.of(
                createTarget(PINKINE_TEST, PINKINE_URANIUM_ORE),
                createTarget(STORCENDITE_TEST, STORCENDITE_URANIUM_ORE)
        );

        URANOLUMEN_ORES = ImmutableList.of(
                createTarget(FLINT_STONE_TEST, FLINT_STONE_URANOLUMEN_ORE),
                createTarget(INFINITAL_STONE_TEST, INFINITAL_STONE_URANOLUMEN_ORE),
                createTarget(PINKINE_TEST, PINKINE_URANOLUMEN_ORE),
                createTarget(STORCENDITE_TEST, STORCENDITE_URANOLUMEN_ORE),
                createTarget(STORCERACK_TEST, STORCERACK_URANOLUMEN_ORE),
                createTarget(VIRDAL_STONE_TEST, VIRDAL_STONE_URANOLUMEN_ORE)
        );

        VOID_CRITTERED_DIOPSIDE_ORES = ImmutableList.of(
                createTarget(BEDROCK_TEST, BEDROCK_VOID_CRITTERED_DIOPSIDE_ORE),
                createTarget(END_STONE_TEST, END_STONE_VOID_CRITTERED_DIOPSIDE_ORE),
                createTarget(PINKINE_TEST, PINKINE_VOID_CRITTERED_DIOPSIDE_ORE)
        );

    }

}
