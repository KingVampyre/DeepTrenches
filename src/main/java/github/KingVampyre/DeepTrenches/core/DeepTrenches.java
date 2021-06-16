package github.KingVampyre.DeepTrenches.core;

import github.KingVampyre.DeepTrenches.common.event.block.BlockReplacementCallback;
import github.KingVampyre.DeepTrenches.core.event.block.AirialMossCallback;
import github.KingVampyre.DeepTrenches.core.init.BlockEntityTypes;
import github.KingVampyre.DeepTrenches.core.init.ModEnchantments;
import github.KingVampyre.DeepTrenches.core.init.SensorTypes;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import software.bernie.geckolib3.GeckoLib;

import static net.minecraft.util.registry.Registry.*;

public class  DeepTrenches implements ModInitializer {

    @Override
    public void onInitialize() {
		GeckoLib.initialize();

		/* EVENTS */
		BlockReplacementCallback.EVENT.register(AirialMossCallback.INSTANCE);

		/* BLOCK ENTITY */
		Registry.register(BLOCK_ENTITY_TYPE, new Identifier("deep_trenches:sign"), BlockEntityTypes.SIGN);
		Registry.register(BLOCK_ENTITY_TYPE, new Identifier("deep_trenches:stasp_nest"), BlockEntityTypes.STASP_NEST);

		/* ENCHANTMENT */
		Registry.register(ENCHANTMENT, "deep_trenches:soul_draining", ModEnchantments.SOUL_DRAINING);

		/* SENSOR TYPE */
		Registry.register(SENSOR_TYPE, new Identifier("deep_trenches:cod_tempting"), SensorTypes.COD_TEMPTING);
		Registry.register(SENSOR_TYPE, new Identifier("deep_trenches:nearest_adult"), SensorTypes.NEAREST_ADULT);
		Registry.register(SENSOR_TYPE, new Identifier("deep_trenches:skittish_hurt_by"), SensorTypes.SKITTISH_HURT_BY);
		Registry.register(SENSOR_TYPE, new Identifier("deep_trenches:tamable_hurt_by"), SensorTypes.TAMABLE_HURT_BY);
    }
    
}
