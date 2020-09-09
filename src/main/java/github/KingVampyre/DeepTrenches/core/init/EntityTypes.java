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

	public static final EntityType<BettaEntity> BETTA = FabricEntityTypeBuilder
			.<BettaEntity>create(SpawnGroup.WATER_CREATURE, BettaEntity::new)
			.dimensions(EntityDimensions.fixed(0.55F, 0.5F))
			.build();

	public static final EntityType<BlackLoosejawEntity> BLACK_LOOSEJAW = FabricEntityTypeBuilder
			.<BlackLoosejawEntity>create(SpawnGroup.WATER_CREATURE, BlackLoosejawEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<ModBoatEntity> BOAT = FabricEntityTypeBuilder
			.<ModBoatEntity>create(SpawnGroup.MISC, (EntityType.EntityFactory<ModBoatEntity>) ModBoatEntity::new)
			.dimensions(EntityDimensions.fixed(1.375F, 0.5625F))
			.build();

	public static final EntityType<DeepLakeBettaEntity> DEEP_LAKE_BETTA = FabricEntityTypeBuilder
			.<DeepLakeBettaEntity>create(SpawnGroup.WATER_CREATURE, DeepLakeBettaEntity::new)
			.dimensions(EntityDimensions.fixed(0.6F, 0.4F))
			.build();

	public static final EntityType<GiantHatchetfishEntity> GIANT_HATCHETFISH = FabricEntityTypeBuilder
			.<GiantHatchetfishEntity>create(SpawnGroup.WATER_CREATURE, GiantHatchetfishEntity::new)
			.dimensions(EntityDimensions.fixed(0.2F, 0.4F))
			.build();

	public static final EntityType<LightLoosejawEntity> LIGHT_LOOSEJAW = FabricEntityTypeBuilder
			.<LightLoosejawEntity>create(SpawnGroup.WATER_CREATURE, LightLoosejawEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<BarbeledLoosejawEntity> BARBELED_LOOSEJAW = FabricEntityTypeBuilder
			.<BarbeledLoosejawEntity>create(SpawnGroup.CREATURE, BarbeledLoosejawEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<SmalltoothDragonfishEntity> SMALLTOOTH_DRAGONFISH = FabricEntityTypeBuilder
			.<SmalltoothDragonfishEntity>create(SpawnGroup.CREATURE, SmalltoothDragonfishEntity::new)
			.dimensions(EntityDimensions.fixed(0.35F, 0.4255F))
			.build();

	public static final EntityType<StaspEntity> STASP = FabricEntityTypeBuilder
			.<StaspEntity>create(SpawnGroup.CREATURE, StaspEntity::new)
			.dimensions(EntityDimensions.fixed(0.7F, 0.6F))
			.build();

}
