package github.KingVampyre.DeepTrenches.core;

import github.KingVampyre.DeepTrenches.client.init.DTGeneratorTypes;
import github.KingVampyre.DeepTrenches.common.event.block.BlockReplacementCallback;
import github.KingVampyre.DeepTrenches.core.event.block.AirialMossCallback;
import github.KingVampyre.DeepTrenches.core.event.block.IlmiumCallback;
import github.KingVampyre.DeepTrenches.core.event.entity.AllowSleepyStatusEffect;
import github.KingVampyre.DeepTrenches.core.init.*;
import github.KingVampyre.DeepTrenches.core.mixin.AccessorGeneratorType;
import github.KingVampyre.DeepTrenches.core.world.gen.chunk.TheDreamChunkGenerator;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biome.v1.OverworldClimate;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents;
import net.minecraft.util.registry.Registry;
import software.bernie.geckolib3.GeckoLib;

import static net.minecraft.util.registry.BuiltinRegistries.*;
import static net.minecraft.util.registry.Registry.*;

public class  DeepTrenches implements ModInitializer {

    @Override
    public void onInitialize() {
		GeckoLib.initialize();
		DTBlocks.initialize();
		DTItems.initialize();
		DTFuelRegistry.initialize();

		/* GENERATOR TYPE */
		AccessorGeneratorType.getValues().add(DTGeneratorTypes.THE_DREAM);

		/* EVENT */
		BlockReplacementCallback.EVENT.register(AirialMossCallback.INSTANCE);
		BlockReplacementCallback.EVENT.register(IlmiumCallback.INSTANCE);
		EntitySleepEvents.ALLOW_SLEEPING.register(AllowSleepyStatusEffect.INSTANCE);

		/* BIOME */
		Registry.register(BIOME, "deep_trenches:almond_forest", DTBiomes.ALMOND_FOREST);
		Registry.register(BIOME, "deep_trenches:almond_plus_forest", DTBiomes.ALMOND_PLUS_FOREST);

		/* OVERWORLD BIOME */
		OverworldBiomes.addContinentalBiome(DTBiomes.ALMOND_FOREST_KEY, OverworldClimate.TEMPERATE, 1);
		OverworldBiomes.addContinentalBiome(DTBiomes.ALMOND_PLUS_FOREST_KEY, OverworldClimate.TEMPERATE, 1);

		/* BLOCK ENTITY */
		Registry.register(BLOCK_ENTITY_TYPE, "deep_trenches:sign", DTBlockEntityTypes.SIGN);
		Registry.register(BLOCK_ENTITY_TYPE, "deep_trenches:stasp_nest", DTBlockEntityTypes.STASP_NEST);

		/* CHUNK GENERATOR */
		Registry.register(CHUNK_GENERATOR, "deep_trenches:the_dream", TheDreamChunkGenerator.CODEC);

		/* CHUNK GENERATOR SETTINGS */
		Registry.register(CHUNK_GENERATOR_SETTINGS, "deep_trenches:the_dream", DTChunkGeneratorSettings.THE_DREAM);

		/* ENCHANTMENT */
		Registry.register(ENCHANTMENT, "deep_trenches:soul_draining", DTEnchantments.SOUL_DRAINING);

		/* CONFIGURED FEATURE */
		Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond", DTConfiguredFeatures.ALMOND);
		Registry.register(CONFIGURED_FEATURE, "deep_trenches:cherry", DTConfiguredFeatures.CHERRY);
		Registry.register(CONFIGURED_FEATURE, "deep_trenches:pin_cherry", DTConfiguredFeatures.PIN_CHERRY);

		Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_almond", DTConfiguredFeatures.FANCY_ALMOND);
		Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_cherry", DTConfiguredFeatures.FANCY_CHERRY);
		Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_pin_cherry", DTConfiguredFeatures.FANCY_PIN_CHERRY);

		Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_almond", DTConfiguredFeatures.GREAT_ALMOND);
		Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_cherry", DTConfiguredFeatures.GREAT_CHERRY);
		Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_pin_cherry", DTConfiguredFeatures.GREAT_PIN_CHERRY);

		Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_forest_flower", DTConfiguredFeatures.ALMOND_FOREST_FLOWER);
		Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_forest_flower_vegetation", DTConfiguredFeatures.ALMOND_FOREST_FLOWER_VEGETATION);
		Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_forest_tree", DTConfiguredFeatures.ALMOND_FOREST_TREE);

		Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_very_rare_beehives", DTConfiguredFeatures.ALMOND_VERY_RARE_BEEHIVES);
		Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_regular_beehives", DTConfiguredFeatures.ALMOND_REGULAR_BEEHIVES);
		Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_more_beehives", DTConfiguredFeatures.ALMOND_MORE_BEEHIVES);

		Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_almond_very_rare_beehives", DTConfiguredFeatures.FANCY_ALMOND_VERY_RARE_BEEHIVES);
		Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_almond_regular_beehives", DTConfiguredFeatures.FANCY_ALMOND_REGULAR_BEEHIVES);
		Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_almond_more_beehives", DTConfiguredFeatures.FANCY_ALMOND_MORE_BEEHIVES);

		Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_almond_very_rare_beehives", DTConfiguredFeatures.GREAT_ALMOND_VERY_RARE_BEEHIVES);
		Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_almond_regular_beehives", DTConfiguredFeatures.GREAT_ALMOND_REGULAR_BEEHIVES);
		Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_almond_more_beehives", DTConfiguredFeatures.GREAT_ALMOND_MORE_BEEHIVES);

		Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_plus_forest_flower", DTConfiguredFeatures.ALMOND_PLUS_FOREST_FLOWER);
		Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_plus_forest_flower_vegetation", DTConfiguredFeatures.ALMOND_PLUS_FOREST_FLOWER_VEGETATION);
		Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_plus_tree", DTConfiguredFeatures.ALMOND_PLUS_TREE);

		Registry.register(CONFIGURED_FEATURE, "deep_trenches:lake_clear_water", DTConfiguredFeatures.LAKE_CLEAR_WATER);
		Registry.register(CONFIGURED_FEATURE, "deep_trenches:spring_clear_water", DTConfiguredFeatures.SPRING_CLEAR_WATER);

		Registry.register(CONFIGURED_FEATURE, "deep_trenches:ore_calcite", DTConfiguredFeatures.ORE_CALCITE);

		/* SENSOR TYPE */
		Registry.register(SENSOR_TYPE, "deep_trenches:cod_tempting", DTSensorTypes.COD_TEMPTING);
		Registry.register(SENSOR_TYPE, "deep_trenches:skittish_hurt_by", DTSensorTypes.SKITTISH_HURT_BY);
		Registry.register(SENSOR_TYPE, "deep_trenches:tamable_hurt_by", DTSensorTypes.TAMABLE_HURT_BY);

		/* TRUNK PLACER */
		Registry.register(TRUNK_PLACER_TYPE, "deep_trenches:great_trunk_placer", DTTrunkPlacerTypes.GREAT_TRUNK_PLACER);
    }

}