package github.KingVampyre.DeepTrenches.common.entity.ai.task;

import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Lovable;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.server.world.ServerWorld;

public class LoveTemptingTask<T extends PathAwareEntity & Lovable> extends TemptingTask<T> {

    public LoveTemptingTask(float speed) {
        super(speed);
    }

    @Override
    protected boolean shouldRun(ServerWorld world, T entity) {
        return !entity.isInLove() && super.shouldRun(world, entity);
    }

}
