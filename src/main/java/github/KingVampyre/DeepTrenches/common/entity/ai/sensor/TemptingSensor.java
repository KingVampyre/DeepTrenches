package github.KingVampyre.DeepTrenches.common.entity.ai.sensor;

import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.ai.brain.Brain;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.ai.brain.sensor.Sensor;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;

import java.util.Comparator;
import java.util.Set;
import java.util.function.Predicate;

import static github.KingVampyre.DeepTrenches.core.init.MemoryModuleTypes.TEMPTING_PLAYER;
import static net.minecraft.predicate.entity.EntityPredicates.EXCEPT_SPECTATOR;

public class TemptingSensor extends Sensor<PathAwareEntity> {

    private static final TargetPredicate TARGET_PREDICATE = new TargetPredicate().includeInvulnerable().includeTeammates().ignoreEntityTargetRules().includeHidden();

    protected final double maxDistance;
    protected final Ingredient tempting;

    public TemptingSensor(Ingredient tempting, double maxDistance) {
        this.maxDistance = maxDistance;
        this.tempting = tempting;
    }

    @Override
    public Set<MemoryModuleType<?>> getOutputMemoryModules() {
        return ImmutableSet.of(TEMPTING_PLAYER);
    }

    protected boolean isHoldingTempting(PlayerEntity player) {
        ItemStack mainHandStack = player.getMainHandStack();
        ItemStack offHandStack = player.getOffHandStack();

        return this.tempting.test(mainHandStack) || this.tempting.test(offHandStack);
    }

    @Override
    protected void sense(ServerWorld server, PathAwareEntity entity) {
        Brain<?> brain = entity.getBrain();

        server.getPlayers()
                .stream()
                .filter(EXCEPT_SPECTATOR)
                .filter(player -> TARGET_PREDICATE.test(entity, player))
                .filter(player -> entity.isInRange(player, this.maxDistance))
                .filter(this::isHoldingTempting)
                .min(Comparator.comparingDouble(entity::squaredDistanceTo))
                .ifPresentOrElse(player -> brain.remember(TEMPTING_PLAYER, player), () -> brain.forget(TEMPTING_PLAYER));
    }

}
