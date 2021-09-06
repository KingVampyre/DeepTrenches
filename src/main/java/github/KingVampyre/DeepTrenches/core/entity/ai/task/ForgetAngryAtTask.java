package github.KingVampyre.DeepTrenches.core.entity.ai.task;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.brain.Brain;
import net.minecraft.entity.ai.brain.task.LookTargetUtil;
import net.minecraft.entity.ai.brain.task.Task;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.server.world.ServerWorld;

import static github.KingVampyre.DeepTrenches.core.init.DTMemoryModuleTypes.ANGRY_TICKS;
import static net.minecraft.entity.ai.brain.MemoryModuleState.REGISTERED;
import static net.minecraft.entity.ai.brain.MemoryModuleState.VALUE_PRESENT;
import static net.minecraft.entity.ai.brain.MemoryModuleType.*;
import static net.minecraft.world.GameRules.FORGIVE_DEAD_PLAYERS;

public class ForgetAngryAtTask<E extends MobEntity> extends Task<E> {

    public ForgetAngryAtTask() {
        super(ImmutableMap.of(ANGRY_AT, VALUE_PRESENT, ANGRY_TICKS, VALUE_PRESENT, ATTACK_TARGET, VALUE_PRESENT, CANT_REACH_WALK_TARGET_SINCE, REGISTERED));
    }

    @Override
    protected void run(ServerWorld serverWorld, E mobEntity, long l) {
        var brain = mobEntity.getBrain();

        var angryAt  = this.getAngryAt(mobEntity);
        var target = this.getAttackTarget(mobEntity);
        var ticks = this.getAngryTicks(mobEntity);

        brain.remember(ANGRY_TICKS, --ticks);

        if(angryAt != target)
            this.forgetAttackTarget(mobEntity);
        else if (!mobEntity.canTarget(target))
            this.forgetAttackTarget(mobEntity);
        else if (cannotReachTarget(mobEntity))
            this.forgetAttackTarget(mobEntity);
        else if (target.isDead() && serverWorld.getGameRules().getBoolean(FORGIVE_DEAD_PLAYERS))
            this.forgetAttackTarget(mobEntity);
        else if (target.world != mobEntity.world)
            this.forgetAttackTarget(mobEntity);
        else if(ticks <= 0)
            this.forgetAttackTarget(mobEntity);

    }

    protected static <E extends LivingEntity> boolean cannotReachTarget(E entity) {
        var optional = entity.getBrain().getOptionalMemory(CANT_REACH_WALK_TARGET_SINCE);

        return optional.isPresent() && entity.world.getTime() - optional.get() > 200L;
    }

    protected void forgetAttackTarget(E entity) {
        var brain = entity.getBrain();

        brain.forget(ANGRY_AT);
        brain.forget(ANGRY_TICKS);
        brain.forget(ATTACK_TARGET);
        brain.forget(HURT_BY);
        brain.forget(HURT_BY_ENTITY);
    }

    protected LivingEntity getAngryAt(E entity) {
        return LookTargetUtil.getEntity(entity, ANGRY_AT).orElseThrow();
    }

    protected int getAngryTicks(E entity) {
        return entity.getBrain().getOptionalMemory(ANGRY_TICKS).orElseThrow();
    }

    protected LivingEntity getAttackTarget(E entity) {
        return entity.getBrain().getOptionalMemory(ATTACK_TARGET).orElseThrow();
    }

}