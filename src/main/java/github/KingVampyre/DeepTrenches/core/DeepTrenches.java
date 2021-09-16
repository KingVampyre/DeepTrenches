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

		/* SENSOR TYPE */
		Registry.register(SENSOR_TYPE, "deep_trenches:cod_tempting", DTSensorTypes.COD_TEMPTING);
		Registry.register(SENSOR_TYPE, "deep_trenches:skittish_hurt_by", DTSensorTypes.SKITTISH_HURT_BY);
		Registry.register(SENSOR_TYPE, "deep_trenches:tamable_hurt_by", DTSensorTypes.TAMABLE_HURT_BY);

		/* TRUNK PLACER */
		Registry.register(TRUNK_PLACER_TYPE, "deep_trenches:great_trunk_placer", DTTrunkPlacerTypes.GREAT_TRUNK_PLACER);
    }

}