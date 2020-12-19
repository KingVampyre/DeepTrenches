package github.KingVampyre.DeepTrenches.common.entity.ai.task;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.brain.task.Task;
import net.minecraft.server.world.ServerWorld;

import java.util.Optional;

import static github.KingVampyre.DeepTrenches.core.init.MemoryModuleTypes.TEMPTATION_COOLDOWN_TICKS;
import static net.minecraft.entity.ai.brain.MemoryModuleState.VALUE_PRESENT;

public class TemptingCooldownTask extends Task<LivingEntity> {

    public TemptingCooldownTask() {
        super(ImmutableMap.of(TEMPTATION_COOLDOWN_TICKS, VALUE_PRESENT));
    }

    @Override
    protected void finishRunning(ServerWorld world, LivingEntity entity, long time) {
        entity.getBrain().forget(TEMPTATION_COOLDOWN_TICKS);
    }

    protected Optional<Integer> getTicks(LivingEntity livingEntity) {
        return livingEntity.getBrain().getOptionalMemory(TEMPTATION_COOLDOWN_TICKS);
    }

    @Override
    protected void keepRunning(ServerWorld world, LivingEntity entity, long time) {
        Optional<Integer> optional = this.getTicks(entity).map(ticks -> ticks - 1);

        entity.getBrain().remember(TEMPTATION_COOLDOWN_TICKS, optional);
    }

    @Override
    protected boolean shouldKeepRunning(ServerWorld world, LivingEntity entity, long time) {
        return this.getTicks(entity).map(ticks -> ticks > 0).orElse(false);
    }

}
