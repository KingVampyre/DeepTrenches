package github.KingVampyre.DeepTrenches.common.entity;

import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Nourish;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.World;

import static github.KingVampyre.DeepTrenches.core.init.DTMemoryModuleTypes.*;

public abstract class NourishFishEntity extends LuminousFishEntity implements Nourish {

    private static final TrackedData<Boolean> BABY = DataTracker.registerData(NourishFishEntity.class, TrackedDataHandlerRegistry.BOOLEAN);

    public NourishFishEntity(EntityType<? extends NourishFishEntity> type, World world) {
        super(type, world);
    }

    @Override
    public int getBreedingAge() {
        return this.brain.getOptionalMemory(BREEDING_AGE).orElse(0);
    }

    @Override
    public int getForcedAge() {
        return this.brain.getOptionalMemory(FORCED_AGE).orElse(0);
    }

    @Override
    public int getHappyTicksRemaining() {
        return this.brain.getOptionalMemory(HAPPY_TICKS_REMAINING).orElse(0);
    }

    @Override
    public void growUp(int age, boolean overGrow) {
        int breedingAge = this.getBreedingAge();
        int newAge = age * 20 + breedingAge;

        if (newAge > 0)
            newAge = 0;

        this.setBreedingAge(newAge);

        if (overGrow) {
            this.setForcedAge(newAge - breedingAge);

            if (this.getHappyTicksRemaining() == 0)
                this.setHappyTicksRemaining(40);
        }

        if (this.getBreedingAge() == 0) {
            int forcedAge = this.getForcedAge();

            this.setBreedingAge(forcedAge);
        }

    }

    @Override
    public void onGrowUp() {

    }

    @Override
    public void setForcedAge(int forcedAge) {
        this.brain.remember(FORCED_AGE, forcedAge);
    }

    @Override
    public void setBreedingAge(int breedingAge) {
        int i = this.getBreedingAge();
        this.brain.remember(BREEDING_AGE, breedingAge);

        if (i < 0 && breedingAge >= 0 || i >= 0 && breedingAge < 0) {
            this.dataTracker.set(BABY, breedingAge < 0);
            this.onGrowUp();
        }

    }

    @Override
    public void setHappyTicksRemaining(int happyTicksRemaining) {
        this.brain.remember(HAPPY_TICKS_REMAINING, happyTicksRemaining);
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

    @Override
    public boolean isBaby() {
        return this.dataTracker.get(BABY);
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();

        this.dataTracker.startTracking(BABY, false);
    }

    @Override
    public void onTrackedDataSet(TrackedData<?> data) {
        if (BABY.equals(data))
            this.calculateDimensions();

        super.onTrackedDataSet(data);
    }

    @Override
    public void tickMovement() {
        super.tickMovement();

        int happyTicksRemaining = this.getHappyTicksRemaining();

        if (happyTicksRemaining > 0) {
            if (happyTicksRemaining % 4 == 0)
                this.world.sendEntityStatus(this, (byte) 19);

            this.setHappyTicksRemaining(--happyTicksRemaining);
        } else if (this.isAlive()) {
            int growingAge = this.getBreedingAge();

            if (growingAge < 0)
                this.setBreedingAge(++growingAge);
            else if (growingAge > 0)
                this.setBreedingAge(--growingAge);
        }

    }

}
