package github.KingVampyre.DeepTrenches.common.entity.ai.task;

import github.KingVampyre.DeepTrenches.common.entity.TamableFishEntity;
import net.minecraft.server.world.ServerWorld;

public class TamableFishFollowOwnerTask<T extends TamableFishEntity> extends UnderwaterFollowOwnerTask<T> {

    public TamableFishFollowOwnerTask(float speed, double minTeleportDist, double minDist) {
        super(speed, minTeleportDist, minDist);
    }

    @Override
    protected boolean shouldRun(ServerWorld world, T entity) {
        return !entity.isInLove() && super.shouldRun(world, entity);
    }

}
