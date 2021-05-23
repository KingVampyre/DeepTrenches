package github.KingVampyre.DeepTrenches.core;

import github.KingVampyre.DeepTrenches.common.event.block.BlockReplacementCallback;
import github.KingVampyre.DeepTrenches.core.event.block.AirialMossCallback;
import github.KingVampyre.DeepTrenches.core.init.*;
import github.KingVampyre.DeepTrenches.core.util.DefaultAttributeHelper;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import software.bernie.geckolib3.GeckoLib;

import static github.KingVampyre.DeepTrenches.core.init.EntityTypes.*;
import static net.minecraft.util.registry.Registry.*;

public class  DeepTrenches implements ModInitializer {

    @Override
    public void onInitialize() {
		GeckoLib.initialize();

		/* EVENTS */
		BlockReplacementCallback.EVENT.register(AirialMossCallback.INSTANCE);

		/* LOOT CONDITIONS */
		Registry.register(LOOT_CONDITION_TYPE, new Identifier("deep_trenches:check_wood_type"), LootConditionTypes.CHECK_WOOD_TYPE);

		/* SENSOR TYPE */
		Registry.register(SENSOR_TYPE, new Identifier("deep_trenches:cod_tempting"), SensorTypes.COD_TEMPTING);
		Registry.register(SENSOR_TYPE, new Identifier("deep_trenches:nearest_adult"), SensorTypes.NEAREST_ADULT);
		Registry.register(SENSOR_TYPE, new Identifier("deep_trenches:skittish_hurt_by"), SensorTypes.SKITTISH_HURT_BY);
		Registry.register(SENSOR_TYPE, new Identifier("deep_trenches:tamable_hurt_by"), SensorTypes.TAMABLE_HURT_BY);

		/* BLOCK ENTITY */
		Registry.register(BLOCK_ENTITY_TYPE, new Identifier("deep_trenches:sign"), BlockEntityTypes.SIGN);
		Registry.register(BLOCK_ENTITY_TYPE, new Identifier("deep_trenches:stasp_nest"), BlockEntityTypes.STASP_NEST);

		/* DEFAULT ATTRIBUTES */
		FabricDefaultAttributeRegistry.register(BARBELED_LOOSEJAW, DefaultAttributeHelper.createBarbeledLoosejawAttributes());
		FabricDefaultAttributeRegistry.register(BEARDED_SEADEVIL, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(BETTA, DefaultAttributeHelper.createBettaAttributes());
		FabricDefaultAttributeRegistry.register(BLACK_DRAGONFISH, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(BLACK_LOOSEJAW, DefaultAttributeHelper.createBlackLoosejawAttributes());
		FabricDefaultAttributeRegistry.register(BLACK_SCABBARD, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(BLACK_SEADEVIL, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(BLOBFISH, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(BLUE_WHALE, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(BOTTLE_FLY, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(BOTTLE_FLY_MAGGOT, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(BROWN_BEAR, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(CETACHSAL, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DEEP_LAKE_BETTA, DefaultAttributeHelper.createDeepLakeBettaAttributes());
		FabricDefaultAttributeRegistry.register(FANGTOOTH, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(FINANGITE, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(FLY, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(GIANT_HATCHETFISH, DefaultAttributeHelper.createGiantHatchetfishAttributes());
		FabricDefaultAttributeRegistry.register(GIANT_SEED_SHRIMP, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(HONEYCOMB_DRAGONFISH, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(LACERATOR, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(LANCETFISH, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(LIGHT_LOOSEJAW, DefaultAttributeHelper.createLightLoosejawAttributes());
		FabricDefaultAttributeRegistry.register(MAGGOT, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(PRINCE_AXELS_WONDERFISH, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(SMALLTOOTH_DRAGONFISH, DefaultAttributeHelper.createSmalltoothDragonfishAttributes());
		FabricDefaultAttributeRegistry.register(STASP, DefaultAttributeHelper.createStaspAttributes());
		FabricDefaultAttributeRegistry.register(TELESCOPEFISH, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(THREADFIN_DRAGONFISH, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(VIPERFISH, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(VOID_BEAST, DefaultAttributeHelper.createMobAttributes());
		FabricDefaultAttributeRegistry.register(WOLFTRAP_SEADEVIL, DefaultAttributeHelper.createMobAttributes());
    }
    
}
