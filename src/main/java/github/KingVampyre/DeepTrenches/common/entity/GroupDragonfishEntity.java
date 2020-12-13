package github.KingVampyre.DeepTrenches.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public abstract class GroupDragonfishEntity extends DragonfishEntity {

    public GroupDragonfishEntity(EntityType<? extends GroupDragonfishEntity> type, World world) {
        super(type, world);
    }

}
