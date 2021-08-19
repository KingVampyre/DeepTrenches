package github.KingVampyre.DeepTrenches.common.entity.ai.sensor;

import com.google.common.collect.ImmutableSet;
import github.KingVampyre.DeepTrenches.common.entity.NourishFishEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.brain.Brain;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.ai.brain.sensor.Sensor;
import net.minecraft.server.world.ServerWorld;

import java.util.Set;
import java.util.function.Predicate;

import static github.KingVampyre.DeepTrenches.core.init.DTMemoryModuleTypes.NEAREST_ADULT;
import static net.minecraft.entity.ai.brain.MemoryModuleType.VISIBLE_MOBS;

public class NearestAdultSensor extends Sensor<NourishFishEntity> {

    @Override
    public Set<MemoryModuleType<?>> getOutputMemoryModules() {
        return ImmutableSet.of(NEAREST_ADULT, VISIBLE_MOBS);
    }

    @Override
    protected void sense(ServerWorld serverWorld, NourishFishEntity entity) {
        Brain<?> brain = entity.getBrain();

        brain.getOptionalMemory(VISIBLE_MOBS).flatMap(visibleMobs -> visibleMobs.stream()
                .filter(living -> living.getType() == entity.getType())
                .filter(Predicate.not(LivingEntity::isBaby))
                .findFirst())
                .ifPresent(nourish -> brain.remember(NEAREST_ADULT, nourish));
    }

}
