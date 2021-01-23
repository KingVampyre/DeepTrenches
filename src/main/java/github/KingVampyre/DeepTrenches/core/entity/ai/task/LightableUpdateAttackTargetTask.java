package github.KingVampyre.DeepTrenches.core.entity.ai.task;

import github.KingVampyre.DeepTrenches.common.entity.AbstractLoosejawEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.brain.task.UpdateAttackTargetTask;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

import static github.KingVampyre.DeepTrenches.core.init.LightStates.ALL_LIT;
import static github.KingVampyre.DeepTrenches.core.init.LightStates.ALL_UNLIT;
import static net.minecraft.entity.ai.brain.MemoryModuleType.HURT_BY_ENTITY;

public class LightableUpdateAttackTargetTask extends UpdateAttackTargetTask<AbstractLoosejawEntity> {

    public static final Function<MobEntity, Optional<LivingEntity>> HURT_BY_GETTER = mobEntity -> mobEntity.getBrain().getOptionalMemory(HURT_BY_ENTITY);

    public static final Function<MobEntity, Optional<? extends LivingEntity>> HURT_BY_EXCLUDE_CREATIVE_PLAYER_GETTER = mobEntity -> HURT_BY_GETTER.apply(mobEntity).filter(living -> living instanceof PlayerEntity && !(((PlayerEntity) living).isCreative()));

    public static final Function<AbstractLoosejawEntity, Optional<? extends LivingEntity>> HURT_BY_EXCEPT_OWNER_GETTER = mobEntity -> HURT_BY_EXCLUDE_CREATIVE_PLAYER_GETTER.apply(mobEntity).filter(Predicate.not(mobEntity::isOwner));

    public LightableUpdateAttackTargetTask(Function<AbstractLoosejawEntity, Optional<? extends LivingEntity>> targetGetter) {
        super(targetGetter);
    }

    @Override
    protected void run(ServerWorld serverWorld, AbstractLoosejawEntity mobEntity, long l) {
        super.run(serverWorld, mobEntity, l);

        mobEntity.setLightState(ALL_LIT);
    }

    @Override
    protected void finishRunning(ServerWorld world, AbstractLoosejawEntity entity, long time) {
        entity.setLightState(ALL_UNLIT);
    }

}
