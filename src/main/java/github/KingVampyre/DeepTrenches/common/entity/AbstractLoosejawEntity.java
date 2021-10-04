package github.KingVampyre.DeepTrenches.common.entity;

import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Variant;
import net.minecraft.entity.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import static net.minecraft.item.Items.COD;

@Deprecated
public abstract class AbstractLoosejawEntity extends TamableFishEntity implements Variant {

    private static final TrackedData<Integer> LOOSEJAW_TYPE = DataTracker.registerData(AbstractLoosejawEntity.class, TrackedDataHandlerRegistry.INTEGER);

    protected AbstractLoosejawEntity(EntityType<? extends AbstractLoosejawEntity> type, World world) {
        super(type, world);
    }

    @Override
    public boolean canAttackWithOwner(LivingEntity target, LivingEntity owner) {
        return true;
    }

    @Override
    public int getVariant() {
        return this.dataTracker.get(LOOSEJAW_TYPE);
    }

    @Override
    public void setVariant(int variant) {
        this.dataTracker.set(LOOSEJAW_TYPE, variant);
    }

    @Override
    public void copyDataToStack(ItemStack stack) {
        super.copyDataToStack(stack);

        stack.getOrCreateNbt().putInt("Variant", this.getVariant());
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

    @Nullable
    @Override
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, @Nullable EntityData entityData, @Nullable NbtCompound entityNbt) {
        this.setVariant(this.chooseType());

        return super.initialize(world, difficulty, spawnReason, entityData, entityNbt);
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);

        // TODO this.variantFromTag(nbt);
    }

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);

        // TODO this.variantToTag(nbt);
    }

}
