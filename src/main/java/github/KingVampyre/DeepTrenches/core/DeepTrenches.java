package github.KingVampyre.DeepTrenches.core;

import github.KingVampyre.DeepTrenches.common.event.block.BlockReplacementCallback;
import github.KingVampyre.DeepTrenches.core.event.block.AirialMossCallback;
import github.KingVampyre.DeepTrenches.core.event.block.IlmiumCallback;
import github.KingVampyre.DeepTrenches.core.event.entity.AllowSleepyStatusEffect;
import github.KingVampyre.DeepTrenches.core.init.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents;
import net.minecraft.util.registry.Registry;
import software.bernie.geckolib3.GeckoLib;

import static net.minecraft.util.registry.Registry.*;

public class  DeepTrenches implements ModInitializer {

	@Override
    public void onInitialize() {
		/* GECKO LIB */
		GeckoLib.initialize();
		/* GAME OBJECTS */
		DTBlocks.initialize();
		DTItems.initialize();
		DTFuelRegistry.initialize();
		/* WORLD GEN */
		DTConfiguredFeatures.initialize();
		DTBiomes.initialize();

		/* EVENT */
		BlockReplacementCallback.EVENT.register(AirialMossCallback.INSTANCE);
		BlockReplacementCallback.EVENT.register(IlmiumCallback.INSTANCE);
		EntitySleepEvents.ALLOW_SLEEPING.register(AllowSleepyStatusEffect.INSTANCE);

		/* BLOCK ENTITY */
		Registry.register(BLOCK_ENTITY_TYPE, "deep_trenches:sign", DTBlockEntityTypes.SIGN);
		Registry.register(BLOCK_ENTITY_TYPE, "deep_trenches:stasp_nest", DTBlockEntityTypes.STASP_NEST);

		/* ENCHANTMENT */
		Registry.register(ENCHANTMENT, "deep_trenches:soul_draining", DTEnchantments.SOUL_DRAINING);

		/* FOLIAGE PLACER */
		Registry.register(FOLIAGE_PLACER_TYPE, "deep_trenches:aquean_foliage_placer", DTFoliagePlacerTypes.AQUEAN_FOLIAGE_PLACER);
		Registry.register(FOLIAGE_PLACER_TYPE, "deep_trenches:fancy_aquean_foliage_placer", DTFoliagePlacerTypes.FANCY_AQUEAN_FOLIAGE_PLACER);
		Registry.register(FOLIAGE_PLACER_TYPE, "deep_trenches:great_aquean_foliage_placer", DTFoliagePlacerTypes.GREAT_AQUEAN_FOLIAGE_PLACER);
		Registry.register(FOLIAGE_PLACER_TYPE, "deep_trenches:plum_foliage_placer", DTFoliagePlacerTypes.PLUM_FOLIAGE_PLACER);

		/* TRUNK PLACER */
		Registry.register(TRUNK_PLACER_TYPE, "deep_trenches:great_trunk_placer", DTTrunkPlacerTypes.GREAT_TRUNK_PLACER);
    }

}