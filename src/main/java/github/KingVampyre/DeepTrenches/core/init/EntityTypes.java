package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.common.entity.ModBoatEntity;
import github.KingVampyre.DeepTrenches.core.entity.*;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;

public class EntityTypes {

	public static final EntityType<AdaiggerEntity> ADAIGGER = FabricEntityTypeBuilder
			.<AdaiggerEntity>create(SpawnGroup.MISC, AdaiggerEntity::new)
			.dimensions(EntityDimensions.fixed(0.5F, 0.5F))
			.build();

	public static final EntityType<BarbeledLoosejawEntity> BARBELED_LOOSEJAW = FabricEntityTypeBuilder
			.create(SpawnGroup.CREATURE, BarbeledLoosejawEntity::new)
			.dimensions(EntityDimensions.fixed(1.35F, 0.4255F))
			.build();

	public static final EntityType<BeardedSeadevilEntity> BEARDED_SEADEVIL = FabricEntityTypeBuilder
			.create(SpawnGroup.CREATURE, BeardedSeadevilEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<BettaEntity> BETTA = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, BettaEntity::new)
			.dimensions(EntityDimensions.fixed(0.55F, 0.5F))
			.build();

	public static final EntityType<BlackDragonfishEntity> BLACK_DRAGONFISH = FabricEntityTypeBuilder
			.create(SpawnGroup.CREATURE, BlackDragonfishEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<BlackLoosejawEntity> BLACK_LOOSEJAW = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, BlackLoosejawEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<BlackScabbardEntity> BLACK_SCABBARD = FabricEntityTypeBuilder
			.create(SpawnGroup.CREATURE, BlackScabbardEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<BlackSeadevilEntity> BLACK_SEADEVIL = FabricEntityTypeBuilder
			.create(SpawnGroup.CREATURE, BlackSeadevilEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<BlobfishEntity> BLOBFISH = FabricEntityTypeBuilder
			.create(SpawnGroup.CREATURE, BlobfishEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<BlueWhaleEntity> BLUE_WHALE = FabricEntityTypeBuilder
			.create(SpawnGroup.CREATURE, BlueWhaleEntity::new)
			.dimensions(EntityDimensions.fixed(1F, 1F))
			.build();

	public static final EntityType<ModBoatEntity> BOAT = FabricEntityTypeBuilder
			.<ModBoatEntity>create(SpawnGroup.MISC, ModBoatEntity::new)
			.dimensions(EntityDimensions.fixed(1.375F, 0.5625F))
			.build();

	public static final EntityType<BottleFlyEntity> BOTTLE_FLY = FabricEntityTypeBuilder
			.create(SpawnGroup.CREATURE, BottleFlyEntity::new)
			.dimensions(EntityDimensions.fixed(0.7F, 0.6F))
			.build();

	public static final EntityType<BottleFlyMaggotEntity> BOTTLE_FLY_MAGGOT = FabricEntityTypeBuilder
			.create(SpawnGroup.CREATURE, BottleFlyMaggotEntity::new)
			.dimensions(EntityDimensions.fixed(0.7F, 0.6F))
			.build();

	public static final EntityType<BrownBearEntity> BROWN_BEAR = FabricEntityTypeBuilder
			.create(SpawnGroup.CREATURE, BrownBearEntity::new)
			.dimensions(EntityDimensions.fixed(0.7F, 0.6F))
			.build();

	public static final EntityType<CetachsalEntity> CETACHSAL = FabricEntityTypeBuilder
			.create(SpawnGroup.CREATURE, CetachsalEntity::new)
			.dimensions(EntityDimensions.fixed(0.7F, 0.6F))
			.build();

	public static final EntityType<DeepLakeBettaEntity> DEEP_LAKE_BETTA = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, DeepLakeBettaEntity::new)
			.dimensions(EntityDimensions.fixed(0.6F, 0.4F))
			.build();

	public static final EntityType<FangtoothEntity> FANGTOOTH = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, FangtoothEntity::new)
			.dimensions(EntityDimensions.fixed(0.6F, 0.4F))
			.build();

	public static final EntityType<FinangiteEntity> FINANGITE = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, FinangiteEntity::new)
			.dimensions(EntityDimensions.fixed(0.6F, 0.4F))
			.build();

	public static final EntityType<FlyEntity> FLY = FabricEntityTypeBuilder
			.create(SpawnGroup.CREATURE, FlyEntity::new)
			.dimensions(EntityDimensions.fixed(0.6F, 0.4F))
			.build();

	public static final EntityType<GiantHatchetfishEntity> GIANT_HATCHETFISH = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, GiantHatchetfishEntity::new)
			.dimensions(EntityDimensions.fixed(0.2F, 0.4F))
			.build();

	public static final EntityType<GiantSeedShrimpEntity> GIANT_SEED_SHRIMP = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, GiantSeedShrimpEntity::new)
			.dimensions(EntityDimensions.fixed(0.2F, 0.4F))
			.build();

	public static final EntityType<HoneycombDragonfishEntity> HONEYCOMB_DRAGONFISH = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, HoneycombDragonfishEntity::new)
			.dimensions(EntityDimensions.fixed(0.2F, 0.4F))
			.build();

	public static final EntityType<LaceratorEntity> LACERATOR = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, LaceratorEntity::new)
			.dimensions(EntityDimensions.fixed(0.2F, 0.4F))
			.build();

	public static final EntityType<LancetfishEntity> LANCETFISH = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, LancetfishEntity::new)
			.dimensions(EntityDimensions.fixed(0.2F, 0.4F))
			.build();

	public static final EntityType<LightLoosejawEntity> LIGHT_LOOSEJAW = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, LightLoosejawEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<MaggotEntity> MAGGOT = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, MaggotEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<PrinceAxelsWonderfishEntity> PRINCE_AXELS_WONDERFISH = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, PrinceAxelsWonderfishEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<SmalltoothDragonfishEntity> SMALLTOOTH_DRAGONFISH = FabricEntityTypeBuilder
			.create(SpawnGroup.CREATURE, SmalltoothDragonfishEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<StaspEntity> BLACK_STASP = FabricEntityTypeBuilder
			.create(SpawnGroup.CREATURE, StaspEntity::new)
			.dimensions(EntityDimensions.fixed(0.7F, 0.6F))
			.build();

	public static final EntityType<StaspEntity> BLUE_WINGED_STASP = FabricEntityTypeBuilder
			.create(SpawnGroup.CREATURE, StaspEntity::new)
			.dimensions(EntityDimensions.fixed(0.7F, 0.6F))
			.build();

	public static final EntityType<StaspEntity> FUCHSITRA_STASP = FabricEntityTypeBuilder
			.create(SpawnGroup.CREATURE, StaspEntity::new)
			.dimensions(EntityDimensions.fixed(0.7F, 0.6F))
			.build();

	public static final EntityType<StaspEntity> ORANGE_WINGED_STASP = FabricEntityTypeBuilder
			.create(SpawnGroup.CREATURE, StaspEntity::new)
			.dimensions(EntityDimensions.fixed(0.7F, 0.6F))
			.build();

	public static final EntityType<TelescopefishEntity> TELESCOPEFISH = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, TelescopefishEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<ThreadfinDragonfishEntity> THREADFIN_DRAGONFISH = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, ThreadfinDragonfishEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<ViperfishEntity> VIPERFISH = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, ViperfishEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<VoidBeastEntity> VOID_BEAST = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, VoidBeastEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<WolftrapSeadevilEntity> WOLFTRAP_SEADEVIL = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, WolftrapSeadevilEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();
}
