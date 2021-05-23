package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.common.entity.ModBoatEntity;
import github.KingVampyre.DeepTrenches.core.entity.*;
import github.KingVampyre.DeepTrenches.core.util.DefaultAttributeHelper;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.registry.Registry;

import static net.minecraft.util.registry.Registry.ENTITY_TYPE;

public class EntityTypes {

	public static final EntityType<AdaiggerEntity> ADAIGGER;
	public static final EntityType<BarbeledLoosejawEntity> BARBELED_LOOSEJAW;
	public static final EntityType<BeardedSeadevilEntity> BEARDED_SEADEVIL;
	public static final EntityType<BettaEntity> BETTA;
	public static final EntityType<BlackDragonfishEntity> BLACK_DRAGONFISH;
	public static final EntityType<BlackLoosejawEntity> BLACK_LOOSEJAW;
	public static final EntityType<BlackScabbardEntity> BLACK_SCABBARD;
	public static final EntityType<BlackSeadevilEntity> BLACK_SEADEVIL;
	public static final EntityType<BlobfishEntity> BLOBFISH;
	public static final EntityType<BlueWhaleEntity> BLUE_WHALE;
	public static final EntityType<ModBoatEntity> BOAT;
	public static final EntityType<BottleFlyEntity> BOTTLE_FLY;
	public static final EntityType<BottleFlyMaggotEntity> BOTTLE_FLY_MAGGOT;
	public static final EntityType<BrownBearEntity> BROWN_BEAR;
	public static final EntityType<CetachsalEntity> CETACHSAL;
	public static final EntityType<DeepLakeBettaEntity> DEEP_LAKE_BETTA;
	public static final EntityType<FangtoothEntity> FANGTOOTH;
	public static final EntityType<FinangiteEntity> FINANGITE;
	public static final EntityType<FlyEntity> FLY;
	public static final EntityType<GiantHatchetfishEntity> GIANT_HATCHETFISH;
	public static final EntityType<GiantSeedShrimpEntity> GIANT_SEED_SHRIMP;
	public static final EntityType<HoneycombDragonfishEntity> HONEYCOMB_DRAGONFISH;
	public static final EntityType<LaceratorEntity> LACERATOR;
	public static final EntityType<LancetfishEntity> LANCETFISH;
	public static final EntityType<LightLoosejawEntity> LIGHT_LOOSEJAW;
	public static final EntityType<MaggotEntity> MAGGOT;
	public static final EntityType<PrinceAxelsWonderfishEntity> PRINCE_AXELS_WONDERFISH;
	public static final EntityType<SmalltoothDragonfishEntity> SMALLTOOTH_DRAGONFISH;
	public static final EntityType<StaspEntity> STASP;
	public static final EntityType<TelescopefishEntity> TELESCOPEFISH;
	public static final EntityType<ThreadfinDragonfishEntity> THREADFIN_DRAGONFISH;
	public static final EntityType<ViperfishEntity> VIPERFISH;
	public static final EntityType<VoidBeastEntity> VOID_BEAST;
	public static final EntityType<WolftrapSeadevilEntity> WOLFTRAP_SEADEVIL;

	private static <T extends Entity> EntityType<T> createEntityType(String id, EntityType<T> type) {
		return Registry.register(ENTITY_TYPE, id, type);
	}

	static {
		ADAIGGER = createEntityType("deep_trenches:adaigger", FabricEntityTypeBuilder
				.<AdaiggerEntity>create(SpawnGroup.MISC, AdaiggerEntity::new)
				.dimensions(EntityDimensions.fixed(0.5F, 0.5F))
				.build());

		BARBELED_LOOSEJAW = createEntityType("deep_trenches:barbeled_loosejaw", FabricEntityTypeBuilder
				.create(SpawnGroup.CREATURE, BarbeledLoosejawEntity::new)
				.dimensions(EntityDimensions.fixed(1.35F, 0.5F))
				.build());

		BEARDED_SEADEVIL = createEntityType("deep_trenches:bearded_seadevil", FabricEntityTypeBuilder
				.create(SpawnGroup.CREATURE, BeardedSeadevilEntity::new)
				.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
				.build());

		BETTA = createEntityType("deep_trenches:betta", FabricEntityTypeBuilder
				.create(SpawnGroup.WATER_CREATURE, BettaEntity::new)
				.dimensions(EntityDimensions.fixed(0.55F, 0.5F))
				.build());

		BLACK_DRAGONFISH = createEntityType("deep_trenches:black_dragonfish", FabricEntityTypeBuilder
				.create(SpawnGroup.CREATURE, BlackDragonfishEntity::new)
				.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
				.build());

		BLACK_LOOSEJAW = createEntityType("deep_trenches:black_loosejaw", FabricEntityTypeBuilder
				.create(SpawnGroup.WATER_CREATURE, BlackLoosejawEntity::new)
				.dimensions(EntityDimensions.fixed(1.35F, 0.4255F))
				.build());

		BLACK_SCABBARD = createEntityType("deep_trenches:black_scabbard", FabricEntityTypeBuilder
				.create(SpawnGroup.CREATURE, BlackScabbardEntity::new)
				.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
				.build());

		BLACK_SEADEVIL = createEntityType("deep_trenches:black_seadevil", FabricEntityTypeBuilder
				.create(SpawnGroup.CREATURE, BlackSeadevilEntity::new)
				.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
				.build());

		BLOBFISH = createEntityType("deep_trenches:blobfish", FabricEntityTypeBuilder
				.create(SpawnGroup.CREATURE, BlobfishEntity::new)
				.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
				.build());

		BLUE_WHALE = createEntityType("deep_trenches:blue_whale", FabricEntityTypeBuilder
				.create(SpawnGroup.CREATURE, BlueWhaleEntity::new)
				.dimensions(EntityDimensions.fixed(1F, 1F))
				.build());

		BOAT = createEntityType("deep_trenches:boat", FabricEntityTypeBuilder
				.<ModBoatEntity>create(SpawnGroup.MISC, ModBoatEntity::new)
				.dimensions(EntityDimensions.fixed(1.375F, 0.5625F))
				.build());

		BOTTLE_FLY = createEntityType("deep_trenches:bottle_fly", FabricEntityTypeBuilder
				.create(SpawnGroup.CREATURE, BottleFlyEntity::new)
				.dimensions(EntityDimensions.fixed(0.7F, 0.6F))
				.build());

		BOTTLE_FLY_MAGGOT = createEntityType("deep_trenches:bottle_fly_maggot", FabricEntityTypeBuilder
				.create(SpawnGroup.CREATURE, BottleFlyMaggotEntity::new)
				.dimensions(EntityDimensions.fixed(0.7F, 0.6F))
				.build());

		BROWN_BEAR = createEntityType("deep_trenches:brown_bear", FabricEntityTypeBuilder
				.create(SpawnGroup.CREATURE, BrownBearEntity::new)
				.dimensions(EntityDimensions.fixed(0.7F, 0.6F))
				.build());

		CETACHSAL = createEntityType("deep_trenches:cetachsal", FabricEntityTypeBuilder
				.create(SpawnGroup.CREATURE, CetachsalEntity::new)
				.dimensions(EntityDimensions.fixed(0.7F, 0.6F))
				.build());

		DEEP_LAKE_BETTA = createEntityType("deep_trenches:deep_lake_betta", FabricEntityTypeBuilder
				.create(SpawnGroup.WATER_CREATURE, DeepLakeBettaEntity::new)
				.dimensions(EntityDimensions.fixed(0.6F, 0.4F))
				.build());

		FANGTOOTH = createEntityType("deep_trenches:fangtooth", FabricEntityTypeBuilder
				.create(SpawnGroup.WATER_CREATURE, FangtoothEntity::new)
				.dimensions(EntityDimensions.fixed(0.6F, 0.4F))
				.build());

		FINANGITE = createEntityType("deep_trenches:finangite", FabricEntityTypeBuilder
				.create(SpawnGroup.WATER_CREATURE, FinangiteEntity::new)
				.dimensions(EntityDimensions.fixed(0.6F, 0.4F))
				.build());

		FLY = createEntityType("deep_trenches:fly", FabricEntityTypeBuilder
				.create(SpawnGroup.CREATURE, FlyEntity::new)
				.dimensions(EntityDimensions.fixed(0.6F, 0.4F))
				.build());

		GIANT_HATCHETFISH = createEntityType("deep_trenches:giant_hatchetfish", FabricEntityTypeBuilder
				.create(SpawnGroup.WATER_CREATURE, GiantHatchetfishEntity::new)
				.dimensions(EntityDimensions.fixed(0.6F, 0.4F))
				.build());

		GIANT_SEED_SHRIMP = createEntityType("deep_trenches:giant_seed_shrimp", FabricEntityTypeBuilder
				.create(SpawnGroup.WATER_CREATURE, GiantSeedShrimpEntity::new)
				.dimensions(EntityDimensions.fixed(0.2F, 0.4F))
				.build());

		HONEYCOMB_DRAGONFISH = createEntityType("deep_trenches:honeycomb_dragonfish", FabricEntityTypeBuilder
				.create(SpawnGroup.WATER_CREATURE, HoneycombDragonfishEntity::new)
				.dimensions(EntityDimensions.fixed(0.2F, 0.4F))
				.build());

		LACERATOR = createEntityType("deep_trenches:lacerator", FabricEntityTypeBuilder
				.create(SpawnGroup.WATER_CREATURE, LaceratorEntity::new)
				.dimensions(EntityDimensions.fixed(0.2F, 0.4F))
				.build());

		LANCETFISH = createEntityType("deep_trenches:lancetfish", FabricEntityTypeBuilder
				.create(SpawnGroup.WATER_CREATURE, LancetfishEntity::new)
				.dimensions(EntityDimensions.fixed(0.2F, 0.4F))
				.build());

		LIGHT_LOOSEJAW = createEntityType("deep_trenches:light_loosejaw", FabricEntityTypeBuilder
				.create(SpawnGroup.WATER_CREATURE, LightLoosejawEntity::new)
				.dimensions(EntityDimensions.fixed(1.35F, 0.4255F))
				.build());

		MAGGOT = createEntityType("deep_trenches:maggot", FabricEntityTypeBuilder
				.create(SpawnGroup.WATER_CREATURE, MaggotEntity::new)
				.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
				.build());

		PRINCE_AXELS_WONDERFISH = createEntityType("deep_trenches:prince_axels_wonderfish", FabricEntityTypeBuilder
				.create(SpawnGroup.WATER_CREATURE, PrinceAxelsWonderfishEntity::new)
				.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
				.build());

		SMALLTOOTH_DRAGONFISH = createEntityType("deep_trenches:smalltooth_dragonfish", FabricEntityTypeBuilder
				.create(SpawnGroup.CREATURE, SmalltoothDragonfishEntity::new)
				.dimensions(EntityDimensions.fixed(1.35F, 0.4255F))
				.build());

		STASP = createEntityType("deep_trenches:stasp", FabricEntityTypeBuilder
				.create(SpawnGroup.CREATURE, StaspEntity::new)
				.dimensions(EntityDimensions.fixed(0.7F, 0.6F))
				.build());

		TELESCOPEFISH = createEntityType("deep_trenches:telescopefish", FabricEntityTypeBuilder
				.create(SpawnGroup.WATER_CREATURE, TelescopefishEntity::new)
				.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
				.build());

		THREADFIN_DRAGONFISH = createEntityType("deep_trenches:threadfin_dragonfish", FabricEntityTypeBuilder
				.create(SpawnGroup.WATER_CREATURE, ThreadfinDragonfishEntity::new)
				.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
				.build());

		VIPERFISH = createEntityType("deep_trenches:viperfish", FabricEntityTypeBuilder
				.create(SpawnGroup.WATER_CREATURE, ViperfishEntity::new)
				.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
				.build());

		VOID_BEAST = createEntityType("deep_trenches:void_beast", FabricEntityTypeBuilder
				.create(SpawnGroup.WATER_CREATURE, VoidBeastEntity::new)
				.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
				.build());

		WOLFTRAP_SEADEVIL = createEntityType("deep_trenches:wolftrap_seadevil", FabricEntityTypeBuilder
				.create(SpawnGroup.WATER_CREATURE, WolftrapSeadevilEntity::new)
				.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
				.build());

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
