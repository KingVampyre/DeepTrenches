package github.KingVampyre.DeepTrenches.common.entity;

import net.minecraft.entity.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;

import static net.minecraft.item.Items.COD;

public abstract class AbstractLoosejawEntity extends TamableFishEntity {

    private static final TrackedData<Integer> LOOSEJAW_TYPE = DataTracker.registerData(AbstractLoosejawEntity.class, TrackedDataHandlerRegistry.INTEGER);

    protected AbstractLoosejawEntity(EntityType<? extends AbstractLoosejawEntity> type, World world) {
        super(type, world);
    }

    @Override
    public boolean canAttackWithOwner(LivingEntity target, LivingEntity owner) {
        return true;
    }

    @Override
    protected void copyDataToStack(ItemStack stack) {
        super.copyDataToStack(stack);

        CompoundTag compound = stack.getOrCreateTag();

        compound.putInt("LoosejawType", this.getLoosejawType());
    }

    @Override
    public ExperienceOrbEntity createExperienceOrb(ServerWorld server, double x, double y, double z) {
        return new ExperienceOrbEntity(server, x, y, z, this.random.nextInt(7) + 1);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        // TODO loosejaw ambient sound
        return SoundEvents.ENTITY_SALMON_AMBIENT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        // TODO loosejaw death sound
        return SoundEvents.ENTITY_SALMON_DEATH;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        // TODO loosejaw hurt sound
        return SoundEvents.ENTITY_SALMON_HURT;
    }

    @Override
    protected SoundEvent getFlopSound() {
        // TODO loosejaw flop sound
        return SoundEvents.ENTITY_SALMON_FLOP;
    }

    @Override
    public void setBaby(boolean baby) {
        this.setBreedingAge(baby ? -36000 : 0);
    }

    public int getLoosejawType() {
        return this.dataTracker.get(LOOSEJAW_TYPE);
    }

    public void setLoosejawType(int loosejawType) {
        this.dataTracker.set(LOOSEJAW_TYPE, loosejawType);
    }

    public abstract int chooseType();

    @Override
    protected void initDataTracker() {
        super.initDataTracker();

        this.dataTracker.startTracking(LOOSEJAW_TYPE, 0);
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return stack.getItem() == COD;
    }

    @Override
    public boolean isTameItem(ItemStack stack) {
        return stack.getItem() == COD;
    }

    @Override
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, EntityData entityData, CompoundTag entityTag) {
        EntityData data = super.initialize(world, difficulty, spawnReason, entityData, entityTag);

        if (entityTag != null && entityTag.contains("LoosejawType"))
            this.setLoosejawType(entityTag.getInt("LoosejawType"));

        else if (entityData instanceof LoosejawData)
            this.setLoosejawType(((LoosejawData)entityData).type);
        else {
            int loosejawType = this.chooseType();
            this.setLoosejawType(loosejawType);

            return new LoosejawData(loosejawType);
        }

        return data;
    }

    @Override
    public void readCustomDataFromTag(CompoundTag tag) {
        super.readCustomDataFromTag(tag);

        this.setLoosejawType(tag.getInt("LoosejawType"));
    }

    @Override
    public void writeCustomDataToTag(CompoundTag tag) {
        super.writeCustomDataToTag(tag);

        tag.putInt("LoosejawType", this.getLoosejawType());
    }

    public static class LoosejawData extends PassiveEntity.PassiveData {

        public final int type;

        public LoosejawData(int type) {
            super(1.0F);

            this.type = type;
        }

    }

}
