package github.KingVampyre.DeepTrenches.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.world.World;

public abstract class ModFishEntity extends FishEntity {

	protected ModFishEntity(EntityType<? extends ModFishEntity> type, World world) {
		super(type, world);
	}

}
