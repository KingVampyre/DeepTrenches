package github.KingVampyre.DeepTrenches.common.entity.ai.sensor;

import com.google.common.collect.ImmutableSet;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Skittish;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.ai.brain.sensor.HurtBySensor;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.server.world.ServerWorld;

import java.util.Set;

import static net.minecraft.entity.ai.brain.MemoryModuleType.HURT_BY;
import static net.minecraft.entity.ai.brain.MemoryModuleType.HURT_BY_ENTITY;
import static net.minecraft.entity.attribute.EntityAttributes.GENERIC_MOVEMENT_SPEED;

public class SkittishHurtBySensor extends HurtBySensor {

    protected final double safeDistance;

    public SkittishHurtBySensor(double safeDistance) {
        this.safeDistance = safeDistance;
    }

    @Override
    public Set<MemoryModuleType<?>> getOutputMemoryModules() {
        return ImmutableSet.of(HURT_BY, HURT_BY_ENTITY);
    }

    @Override
    protected void sense(ServerWorld world, LivingEntity entity) {
        super.sense(world, entity);

        if(entity instanceof Skittish skittish) {

            EntityAttributeInstance instance = entity.getAttributeInstance(GENERIC_MOVEMENT_SPEED);

            if(instance != null) {
                EntityAttributeModifier modifier = skittish.getSpeedModifier();

                if(this.wasHurt(entity) && !instance.hasModifier(modifier))
                    instance.addTemporaryModifier(modifier);

                if(!this.wasHurtBy(entity) && !this.wasHurtByNearbyEntity(entity) && instance.hasModifier(modifier)) {
                    entity.getBrain().forget(HURT_BY_ENTITY);
                    instance.removeModifier(modifier);
                }

            }

        }

    }

    protected boolean wasHurtBy(LivingEntity entity) {
        return entity.getBrain().hasMemoryModule(HURT_BY);
    }

    protected boolean wasHurt(LivingEntity entity) {
        return this.wasHurtBy(entity) || entity.getBrain().hasMemoryModule(HURT_BY_ENTITY);
    }

    protected boolean wasHurtByNearbyEntity(LivingEntity entity) {
        return entity.getBrain().getOptionalMemory(HURT_BY_ENTITY).filter(living -> living.distanceTo(entity) <= this.safeDistance).isPresent();
    }

}
