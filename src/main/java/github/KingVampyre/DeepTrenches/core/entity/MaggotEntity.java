package github.KingVampyre.DeepTrenches.core.entity;

import github.KingVampyre.DeepTrenches.common.entity.CrawlingBugEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class MaggotEntity extends CrawlingBugEntity {

    public MaggotEntity(EntityType<? extends CrawlingBugEntity> entityType, World world) {
        super(entityType, world);
    }

}