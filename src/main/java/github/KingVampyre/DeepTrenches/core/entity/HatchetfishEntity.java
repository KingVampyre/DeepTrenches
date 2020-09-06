package github.KingVampyre.DeepTrenches.core.entity;

import github.KingVampyre.DeepTrenches.common.entity.ModFishEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public abstract class HatchetfishEntity extends ModFishEntity {

    public HatchetfishEntity(EntityType<? extends ModFishEntity> type, World world) {
        super(type, world);
    }
	
}
