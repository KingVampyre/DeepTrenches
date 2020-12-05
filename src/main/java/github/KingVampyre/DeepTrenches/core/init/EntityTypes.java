package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.common.entity.ModBoatEntity;
import github.KingVampyre.DeepTrenches.core.entity.AdaiggerEntity;
import github.KingVampyre.DeepTrenches.core.entity.BarbeledLoosejawEntity;
import github.KingVampyre.DeepTrenches.core.entity.BettaEntity;
import github.KingVampyre.DeepTrenches.core.entity.BlackLoosejawEntity;
import github.KingVampyre.DeepTrenches.core.entity.DeepLakeBettaEntity;
import github.KingVampyre.DeepTrenches.core.entity.GiantHatchetfishEntity;
import github.KingVampyre.DeepTrenches.core.entity.LightLoosejawEntity;
import github.KingVampyre.DeepTrenches.core.entity.SmalltoothDragonfishEntity;
import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;

public class EntityTypes {

	public static final EntityType<AdaiggerEntity> ADAIGGER = FabricEntityTypeBuilder
			.<AdaiggerEntity>create(SpawnGroup.MISC, AdaiggerEntity::new).dimensions(EntityDimensions.fixed(0.5F, 0.5F))
			.build();

	public static final EntityType<BettaEntity> BLUE_BETTA = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, BettaEntity::new)
			.dimensions(EntityDimensions.fixed(0.55F, 0.5F))
			.build();

	public static final EntityType<BettaEntity> COLORFUL_BETTA = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, BettaEntity::new)
			.dimensions(EntityDimensions.fixed(0.55F, 0.5F))
			.build();

	public static final EntityType<BettaEntity> ICARUS = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, BettaEntity::new)
			.dimensions(EntityDimensions.fixed(0.55F, 0.5F))
			.build();

	public static final EntityType<BettaEntity> ICARUS_JUNIOR = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, BettaEntity::new)
			.dimensions(EntityDimensions.fixed(0.55F, 0.5F))
			.build();

	public static final EntityType<BettaEntity> RED_BETTA = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, BettaEntity::new)
			.dimensions(EntityDimensions.fixed(0.55F, 0.5F))
			.build();

	public static final EntityType<BlackLoosejawEntity> NORTHERN_BLACK_LOOSEJAW = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, BlackLoosejawEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<BlackLoosejawEntity> SOUTHERN_BLACK_LOOSEJAW = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, BlackLoosejawEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<ModBoatEntity> BOAT = FabricEntityTypeBuilder
			.<ModBoatEntity>create(SpawnGroup.MISC, ModBoatEntity::new)
			.dimensions(EntityDimensions.fixed(1.375F, 0.5625F))
			.build();

	public static final EntityType<DeepLakeBettaEntity> DEEP_LAKE_BETTA = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, DeepLakeBettaEntity::new)
			.dimensions(EntityDimensions.fixed(0.6F, 0.4F))
			.build();

	public static final EntityType<GiantHatchetfishEntity> GIANT_HATCHETFISH = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, GiantHatchetfishEntity::new)
			.dimensions(EntityDimensions.fixed(0.2F, 0.4F))
			.build();

	public static final EntityType<BarbeledLoosejawEntity> ATLANTIC_BARBELED_LOOSEJAW = FabricEntityTypeBuilder
			.create(SpawnGroup.CREATURE, BarbeledLoosejawEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<BarbeledLoosejawEntity> GLOWING_BARBELED_LOOSEJAW = FabricEntityTypeBuilder
			.create(SpawnGroup.CREATURE, BarbeledLoosejawEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<BarbeledLoosejawEntity> GRIMALDIS_BARBELED_LOOSEJAW = FabricEntityTypeBuilder
			.create(SpawnGroup.CREATURE, BarbeledLoosejawEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<BarbeledLoosejawEntity> MANY_RAYED_BARBELED_LOOSEJAW = FabricEntityTypeBuilder
			.create(SpawnGroup.CREATURE, BarbeledLoosejawEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<BarbeledLoosejawEntity> SHINY_BARBELED_LOOSEJAW = FabricEntityTypeBuilder
			.create(SpawnGroup.CREATURE, BarbeledLoosejawEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<BarbeledLoosejawEntity> TITTMANNS_BARBELED_LOOSEJAW = FabricEntityTypeBuilder
			.create(SpawnGroup.CREATURE, BarbeledLoosejawEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<LightLoosejawEntity> BIGLAMP_LIGHT_LOOSEJAW = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, LightLoosejawEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<LightLoosejawEntity> GOODYEARS_LIGHT_LOOSEJAW = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, LightLoosejawEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<LightLoosejawEntity> GUERNES_LIGHT_LOOSEJAW = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, LightLoosejawEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<LightLoosejawEntity> LIEMS_LIGHT_LOOSEJAW = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, LightLoosejawEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<LightLoosejawEntity> REMARKABLE_LIGHT_LOOSEJAW = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, LightLoosejawEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<LightLoosejawEntity> SMALL_LIGHT_LOOSEJAW = FabricEntityTypeBuilder
			.create(SpawnGroup.WATER_CREATURE, LightLoosejawEntity::new)
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

}
