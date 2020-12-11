package github.KingVampyre.DeepTrenches.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.world.World;
import software.bernie.geckolib.entity.IAnimatedEntity;

public abstract class ModFishEntity extends FishEntity implements IAnimatedEntity {

	protected ModFishEntity(EntityType<? extends ModFishEntity> type, World world) {
		super(type, world);
	}

}
