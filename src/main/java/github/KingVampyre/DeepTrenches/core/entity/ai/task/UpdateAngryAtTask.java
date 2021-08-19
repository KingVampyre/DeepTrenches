package github.KingVampyre.DeepTrenches.core.entity.ai.task;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.brain.task.Task;
import net.minecraft.entity.mob.Angerable;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Box;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static github.KingVampyre.DeepTrenches.core.init.DTMemoryModuleTypes.ANGRY_TICKS;
import static net.minecraft.entity.ai.brain.MemoryModuleState.REGISTERED;
import static net.minecraft.entity.ai.brain.MemoryModuleState.VALUE_ABSENT;
import static net.minecraft.entity.ai.brain.MemoryModuleType.*;
import static net.minecraft.entity.attribute.EntityAttributes.GENERIC_FOLLOW_RANGE;
import static net.minecraft.predicate.entity.EntityPredicates.EXCEPT_SPECTATOR;

public class UpdateAngryAtTask<E extends MobEntity & Angerable> extends Task<E> {

    protected final Predicate<E> startCondition;
    protected final Function<E, Optional<? extends LivingEntity>> targetGetter;

    public UpdateAngryAtTask(Predicate<E> startCondition, Function<E, Optional<? extends LivingEntity>> targetGetter) {
        super(ImmutableMap.of(ANGRY_AT, VALUE_ABSENT, ANGRY_TICKS, VALUE_ABSENT, ATTACK_TARGET, VALUE_ABSENT, CANT_REACH_WALK_TARGET_SINCE, REGISTERED));

        this.startCondition = startCondition;
        this.targetGetter = targetGetter;
    }

    public UpdateAngryAtTask(Function<E, Optional<? extends LivingEntity>> targetGetter) {
        this(mobEntity -> true, targetGetter);
    }

    @Override
    protected void run(ServerWorld serverWorld, E mobEntity, long l) {
        this.targetGetter.apply(mobEntity).ifPresent(target -> {
            var uuid = target.getUuid();

            this.getOthersInRange(mobEntity).forEach(angerable -> {
                var brain = angerable.getBrain();

                angerable.universallyAnger();

                brain.remember(ATTACK_TARGET, target);
                brain.remember(ANGRY_AT, uuid);
                brain.remember(ANGRY_TICKS, angerable.getAngerTime());
                brain.forget(CANT_REACH_WALK_TARGET_SINCE);
            });

        });

    }

    @Override
    protected boolean shouldRun(ServerWorld serverWorld, E mobEntity) {

        if (!this.startCondition.test(mobEntity))
            return false;

        var target = this.targetGetter.apply(mobEntity);

        return target.isPresent() && mobEntity.canTarget(target.get());
    }

    @SuppressWarnings("unchecked")
    protected List<E> getOthersInRange(E mobEntity) {
        var followRange = mobEntity.getAttributeValue(GENERIC_FOLLOW_RANGE);
        var box = Box.from(mobEntity.getPos()).expand(followRange, 10, followRange);

        return mobEntity.world.getEntitiesByClass(mobEntity.getClass(), box, EXCEPT_SPECTATOR)
                .stream()
                .map(mob -> (E) mob)
                .collect(Collectors.toList());
    }

}