package github.KingVampyre.DeepTrenches.core.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public abstract class TamableDragonfishEntity extends GroupDragonfishEntity {

    public TamableDragonfishEntity(EntityType<? extends TamableDragonfishEntity> type, World world) {
        super(type, world);
    }

}
