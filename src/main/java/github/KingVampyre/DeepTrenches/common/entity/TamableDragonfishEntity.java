package github.KingVampyre.DeepTrenches.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public abstract class TamableDragonfishEntity extends GroupDragonfishEntity {

    public TamableDragonfishEntity(EntityType<? extends TamableDragonfishEntity> type, World world) {
        super(type, world);
    }

}
