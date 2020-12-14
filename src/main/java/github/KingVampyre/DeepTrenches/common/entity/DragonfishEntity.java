package github.KingVampyre.DeepTrenches.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public abstract class DragonfishEntity extends TamableFishEntity {

    public DragonfishEntity(EntityType<? extends DragonfishEntity> type, World world) {
        super(type, world);
    }

}
