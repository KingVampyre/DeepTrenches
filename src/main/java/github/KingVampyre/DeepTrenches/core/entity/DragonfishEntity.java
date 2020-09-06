package github.KingVampyre.DeepTrenches.core.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public abstract class DragonfishEntity extends HatchetfishEntity {

    public DragonfishEntity(EntityType<? extends DragonfishEntity> type, World world) {
        super(type, world);
    }

}
