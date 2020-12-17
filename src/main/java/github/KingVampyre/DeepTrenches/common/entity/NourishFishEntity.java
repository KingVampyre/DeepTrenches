package github.KingVampyre.DeepTrenches.common.entity;

import github.KingVampyre.DeepTrenches.common.component.animal.AnimalComponent;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.EntityType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.World;

import java.util.Optional;

import static github.KingVampyre.DeepTrenches.core.init.Components.*;

public abstract class NourishFishEntity extends AnimatedFishEntity {

    protected NourishFishEntity(EntityType<? extends NourishFishEntity> type, World world) {
        super(type, world);
    }

    @Override
    public void tickMovement() {
        super.tickMovement();

        Optional<AnimalComponent> animalComponent = ANIMAL.maybeGet(this);

        if(animalComponent.isPresent()) {
            AnimalComponent animal = animalComponent.get();
            int happyTicksRemaining = animal.getHappyTicksRemaining();

            if (happyTicksRemaining > 0) {
                if (happyTicksRemaining % 4 == 0)
                    this.world.sendEntityStatus(this, (byte) 19);

                animal.setHappyTicksRemaining(--happyTicksRemaining);
            } else if (this.isAlive()) {
                int growingAge = animal.getGrowingAge();

                if (growingAge < 0)
                    animal.setGrowingAge(++growingAge);
                else if (growingAge > 0)
                    animal.setGrowingAge(--growingAge);
            }

        }

    }

    @Override
    public void handleStatus(byte status) {

        if (status == 19) {
            double x = this.getParticleX(1.0D);
            double y = this.getRandomBodyY() + 0.5D;
            double z = this.getParticleZ(1.0D);

            MinecraftClient.getInstance().particleManager.addParticle(ParticleTypes.HAPPY_VILLAGER, x, y, z, 0.0F, 0.0F, 0.0F);
        } else
            super.handleStatus(status);

    }

}
