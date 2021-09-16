package github.KingVampyre.DeepTrenches.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

@Deprecated
public abstract class HatchetfishEntity extends LuminousFishEntity {

    public HatchetfishEntity(EntityType<? extends HatchetfishEntity> type, World world) {
        super(type, world);
    }
	
}
