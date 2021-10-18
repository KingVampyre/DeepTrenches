package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.entity.*;
import github.KingVampyre.DeepTrenches.core.util.entity.attribute.DefaultAttributeHelper;
import github.Louwind.entityutils.core.entity.FabricBoatEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.registry.Registry;

import static net.minecraft.entity.SpawnGroup.CREATURE;
import static net.minecraft.entity.SpawnGroup.WATER_CREATURE;
import static net.minecraft.util.registry.Registry.ENTITY_TYPE;

public class DTEntityTypes {

	public static final EntityType<AdaiggerEntity> ADAIGGER;
	public static final EntityType<BarbeledLoosejawEntity> BARBELED_LOOSEJAW;
	public static final EntityType<BeardedSeadevilEntity> BEARDED_SEADEVIL;
	public static final EntityType<BettaEntity> BETTA;
	public static final EntityType<FabricBoatEntity> BOAT;
	public static final EntityType<BlackDragonfishEntity> BLACK_DRAGONFISH;
	public static final EntityType<BlackLoosejawEntity> BLACK_LOOSEJAW;
	public static final EntityType<BlackScabbardEntity> BLACK_SCABBARD;
	public static final EntityType<BlackSeadevilEntity> BLACK_SEADEVIL;
	public static final EntityType<BlobfishEntity> BLOBFISH;
	public static final EntityType<BlueWhaleEntity> BLUE_WHALE;
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

	static {
		ADAIGGER = FabricEntityTypeBuilder
				.<AdaiggerEntity>create(SpawnGroup.MISC, AdaiggerEntity::new)
				.dimensions(EntityDimensions.fixed(0.5F, 0.5F))
				.build();

		BARBELED_LOOSEJAW = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createBarbeledLoosejawAttributes)
				.dimensions(EntityDimensions.fixed(1.35F, 0.5F))
				.entityFactory(BarbeledLoosejawEntity::new)
				.spawnGroup(WATER_CREATURE)
				.build();

		BEARDED_SEADEVIL = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createBeardedSeadevilAttributes)
				.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
				.entityFactory(BeardedSeadevilEntity::new)
				.spawnGroup(WATER_CREATURE)
				.build();

		BETTA = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createBettaAttributes)
				.dimensions(EntityDimensions.fixed(0.55F, 0.5F))
				.entityFactory(BettaEntity::new)
				.spawnGroup(WATER_CREATURE)
				.build();

		BOAT = FabricEntityTypeBuilder
				.<FabricBoatEntity>create(SpawnGroup.MISC, FabricBoatEntity::new)
				.dimensions(EntityDimensions.fixed(1.375F, 0.5625F))
				.build();

		BLACK_DRAGONFISH = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createBlackDragonfishAttributes)
				.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
				.entityFactory(BlackDragonfishEntity::new)
				.spawnGroup(WATER_CREATURE)
				.build();

		BLACK_LOOSEJAW = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createBlackLoosejawAttributes)
				.dimensions(EntityDimensions.fixed(1.35F, 0.4255F))
				.entityFactory(BlackLoosejawEntity::new)
				.spawnGroup(WATER_CREATURE)
				.build();

		BLACK_SCABBARD = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createBlackScabbardAttributes)
				.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
				.entityFactory(BlackScabbardEntity::new)
				.spawnGroup(CREATURE)
				.build();

		BLACK_SEADEVIL = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createBlackSeadevilAttributes)
				.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
				.entityFactory(BlackSeadevilEntity::new)
				.spawnGroup(WATER_CREATURE)
				.build();

		BLOBFISH = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createBlobfishAttributes)
				.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
				.entityFactory(BlobfishEntity::new)
				.spawnGroup(WATER_CREATURE)
				.build();

		BLUE_WHALE = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createBlueWhaleAttributes)
				.dimensions(EntityDimensions.fixed(1F, 1F))
				.entityFactory(BlueWhaleEntity::new)
				.spawnGroup(WATER_CREATURE)
				.build();

		BOTTLE_FLY = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createBottleFlyAttributes)
				.dimensions(EntityDimensions.fixed(0.7F, 0.6F))
				.entityFactory(BottleFlyEntity::new)
				.spawnGroup(CREATURE)
				.build();

		BOTTLE_FLY_MAGGOT = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createBottleFlyMaggotAttributes)
				.dimensions(EntityDimensions.fixed(0.7F, 0.6F))
				.entityFactory(BottleFlyMaggotEntity::new)
				.spawnGroup(CREATURE)
				.build();

		BROWN_BEAR = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createBrownBearAttributes)
				.dimensions(EntityDimensions.fixed(0.7F, 0.6F))
				.entityFactory(BrownBearEntity::new)
				.spawnGroup(CREATURE)
				.build();

		CETACHSAL = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createCetachsalAttributes)
				.dimensions(EntityDimensions.fixed(0.7F, 0.6F))
				.entityFactory(CetachsalEntity::new)
				.spawnGroup(WATER_CREATURE)
				.build();

		DEEP_LAKE_BETTA = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createDeepLakeBettaAttributes)
				.dimensions(EntityDimensions.fixed(0.6F, 0.4F))
				.entityFactory(DeepLakeBettaEntity::new)
				.spawnGroup(WATER_CREATURE)
				.build();

		FANGTOOTH = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createFangtoothAttributes)
				.dimensions(EntityDimensions.fixed(0.6F, 0.4F))
				.entityFactory(FangtoothEntity::new)
				.spawnGroup(WATER_CREATURE)
				.build();

		FINANGITE = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createFinangiteAttributes)
				.dimensions(EntityDimensions.fixed(0.6F, 0.4F))
				.entityFactory(FinangiteEntity::new)
				.spawnGroup(WATER_CREATURE)
				.build();

		FLY = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createFlyAttributes)
				.dimensions(EntityDimensions.fixed(0.6F, 0.4F))
				.entityFactory(FlyEntity::new)
				.spawnGroup(CREATURE)
				.build();

		GIANT_HATCHETFISH = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createGiantHatchetfishAttributes)
				.dimensions(EntityDimensions.fixed(0.6F, 0.4F))
				.entityFactory(GiantHatchetfishEntity::new)
				.spawnGroup(WATER_CREATURE)
				.build();

		GIANT_SEED_SHRIMP = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createGiantSeedShrimpAttributes)
				.dimensions(EntityDimensions.fixed(0.2F, 0.4F))
				.entityFactory(GiantSeedShrimpEntity::new)
				.spawnGroup(WATER_CREATURE)
				.build();

		HONEYCOMB_DRAGONFISH = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createHoneycombDragonfishAttributes)
				.dimensions(EntityDimensions.fixed(0.2F, 0.4F))
				.entityFactory(HoneycombDragonfishEntity::new)
				.spawnGroup(WATER_CREATURE)
				.build();

		LACERATOR = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createLaceratorAttributes)
				.dimensions(EntityDimensions.fixed(0.2F, 0.4F))
				.entityFactory(LaceratorEntity::new)
				.spawnGroup(WATER_CREATURE)
				.build();

		LANCETFISH = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createLancetfishAttributes)
				.dimensions(EntityDimensions.fixed(0.2F, 0.4F))
				.entityFactory(LancetfishEntity::new)
				.spawnGroup(WATER_CREATURE)
				.build();

		LIGHT_LOOSEJAW = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createLightLoosejawAttributes)
				.dimensions(EntityDimensions.fixed(1.35F, 0.4255F))
				.entityFactory(LightLoosejawEntity::new)
				.spawnGroup(WATER_CREATURE)
				.build();

		MAGGOT = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createMaggotAttributes)
				.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
				.entityFactory(MaggotEntity::new)
				.spawnGroup(CREATURE)
				.build();

		PRINCE_AXELS_WONDERFISH = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createPrinceAxelsWonderfishAttributes)
				.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
				.entityFactory(PrinceAxelsWonderfishEntity::new)
				.spawnGroup(WATER_CREATURE)
				.build();

		SMALLTOOTH_DRAGONFISH = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createSmalltoothDragonfishAttributes)
				.dimensions(EntityDimensions.fixed(1.35F, 0.4255F))
				.entityFactory(SmalltoothDragonfishEntity::new)
				.spawnGroup(WATER_CREATURE)
				.build();

		STASP = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createStaspAttributes)
				.dimensions(EntityDimensions.fixed(0.7F, 0.6F))
				.entityFactory(StaspEntity::new)
				.spawnGroup(CREATURE)
				.build();

		TELESCOPEFISH = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createTelescopefishAttributes)
				.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
				.entityFactory(TelescopefishEntity::new)
				.spawnGroup(WATER_CREATURE)
				.build();

		THREADFIN_DRAGONFISH = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createThreadfinDragonfishAttributes)
				.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
				.entityFactory(ThreadfinDragonfishEntity::new)
				.spawnGroup(WATER_CREATURE)
				.build();

		VIPERFISH = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createViperfishAttributes)
				.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
				.entityFactory(ViperfishEntity::new)
				.spawnGroup(WATER_CREATURE)
				.build();

		VOID_BEAST = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createVoidBeastAttributes)
				.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
				.entityFactory(VoidBeastEntity::new)
				.spawnGroup(WATER_CREATURE)
				.build();

		WOLFTRAP_SEADEVIL = FabricEntityTypeBuilder
				.createMob()
				.defaultAttributes(DefaultAttributeHelper::createWolftrapSeadevilAttributes)
				.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
				.entityFactory(WolftrapSeadevilEntity::new)
				.spawnGroup(WATER_CREATURE)
				.build();
	}

	public static void initialize() {
		Registry.register(ENTITY_TYPE, "deep_trenches:adaigger", ADAIGGER);
		Registry.register(ENTITY_TYPE, "deep_trenches:barbeled_loosejaw", BARBELED_LOOSEJAW);
		Registry.register(ENTITY_TYPE, "deep_trenches:bearded_seadevil", BEARDED_SEADEVIL);
		Registry.register(ENTITY_TYPE, "deep_trenches:betta", BETTA);
		Registry.register(ENTITY_TYPE, "deep_trenches:boat", BOAT);
		Registry.register(ENTITY_TYPE, "deep_trenches:black_dragonfish", BLACK_DRAGONFISH);
		Registry.register(ENTITY_TYPE, "deep_trenches:black_loosejaw", BLACK_LOOSEJAW);
		Registry.register(ENTITY_TYPE, "deep_trenches:black_scabbard", BLACK_SCABBARD);
		Registry.register(ENTITY_TYPE, "deep_trenches:black_seadevil", BLACK_SEADEVIL);
		Registry.register(ENTITY_TYPE, "deep_trenches:blobfish", BLOBFISH);
		Registry.register(ENTITY_TYPE, "deep_trenches:blue_whale", BLUE_WHALE);
		Registry.register(ENTITY_TYPE, "deep_trenches:bottle_fly", BOTTLE_FLY);
		Registry.register(ENTITY_TYPE, "deep_trenches:bottle_fly_maggot", BOTTLE_FLY_MAGGOT);
		Registry.register(ENTITY_TYPE, "deep_trenches:brown_bear", BROWN_BEAR);
		Registry.register(ENTITY_TYPE, "deep_trenches:cetachsal", CETACHSAL);
		Registry.register(ENTITY_TYPE, "deep_trenches:deep_lake_betta", DEEP_LAKE_BETTA);
		Registry.register(ENTITY_TYPE, "deep_trenches:fangtooth", FANGTOOTH);
		Registry.register(ENTITY_TYPE, "deep_trenches:finangite", FINANGITE);
		Registry.register(ENTITY_TYPE, "deep_trenches:fly", FLY);
		Registry.register(ENTITY_TYPE, "deep_trenches:giant_hatchetfish", GIANT_HATCHETFISH);
		Registry.register(ENTITY_TYPE, "deep_trenches:giant_seed_shrimp", GIANT_SEED_SHRIMP);
		Registry.register(ENTITY_TYPE, "deep_trenches:honeycomb_dragonfish", HONEYCOMB_DRAGONFISH);
		Registry.register(ENTITY_TYPE, "deep_trenches:lacerator", LACERATOR);
		Registry.register(ENTITY_TYPE, "deep_trenches:lancetfish", LANCETFISH);
		Registry.register(ENTITY_TYPE, "deep_trenches:light_loosejaw", LIGHT_LOOSEJAW);
		Registry.register(ENTITY_TYPE, "deep_trenches:maggot", MAGGOT);
		Registry.register(ENTITY_TYPE, "deep_trenches:prince_axels_wonderfish", PRINCE_AXELS_WONDERFISH);
		Registry.register(ENTITY_TYPE, "deep_trenches:smalltooth_dragonfish", SMALLTOOTH_DRAGONFISH);
		Registry.register(ENTITY_TYPE, "deep_trenches:stasp", STASP);
		Registry.register(ENTITY_TYPE, "deep_trenches:telescopefish", TELESCOPEFISH);
		Registry.register(ENTITY_TYPE, "deep_trenches:threadfin_dragonfish", THREADFIN_DRAGONFISH);
		Registry.register(ENTITY_TYPE, "deep_trenches:viperfish", VIPERFISH);
		Registry.register(ENTITY_TYPE, "deep_trenches:void_beast", VOID_BEAST);
		Registry.register(ENTITY_TYPE, "deep_trenches:wolftrap_seadevil", WOLFTRAP_SEADEVIL);
	}

}
