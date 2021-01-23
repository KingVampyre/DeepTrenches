package github.KingVampyre.DeepTrenches.common.entity.ai.sensor;

import github.KingVampyre.DeepTrenches.common.entity.TamableFishEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.server.world.ServerWorld;

import java.util.Optional;

import static net.minecraft.entity.ai.brain.MemoryModuleType.HURT_BY_ENTITY;
import static net.minecraft.entity.attribute.EntityAttributes.GENERIC_MOVEMENT_SPEED;

public class TamableHurtBySensor extends SkittishHurtBySensor {

    public TamableHurtBySensor(double safeDistance) {
        super(safeDistance);
    }

    @Override
    protected void sense(ServerWorld world, LivingEntity entity) {
        super.sense(world, entity);

        if(entity instanceof TamableFishEntity) {
            TamableFishEntity tamable = (TamableFishEntity) entity;

            Optional<LivingEntity> living = entity.getBrain().getOptionalMemory(HURT_BY_ENTITY);

            if(living.isPresent()) {
                EntityAttributeInstance instance = entity.getAttributeInstance(GENERIC_MOVEMENT_SPEED);

                if(instance != null) {
                    EntityAttributeModifier modifier = tamable.getSpeedModifier();

                    if(tamable.isOwner(living.get()))
                        instance.removeModifier(modifier);
                }

            }

        }

    }

}
