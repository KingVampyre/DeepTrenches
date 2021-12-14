package github.KingVampyre.DeepTrenches.core.entity;

import github.KingVampyre.DeepTrenches.common.entity.AbstractBettaEntity;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Lovable;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Variant;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import static github.KingVampyre.DeepTrenches.core.init.entity.DTAttributeModifiers.MOVEMENT_SPEED_BOOST_235;
import static github.KingVampyre.DeepTrenches.core.init.item.DTItems.BETTA_BUCKET;

public class BettaEntity extends AbstractBettaEntity implements Variant {

    private static final TrackedData<Integer> BETTA_TYPE = DataTracker.registerData(BettaEntity.class, TrackedDataHandlerRegistry.INTEGER);

    public BettaEntity(EntityType<? extends BettaEntity> type, World world) {
        super(type, world);
    }

    @Override
    public int getVariant() {
        return this.dataTracker.get(BETTA_TYPE);
    }

    @Override
    public void setVariant(int bettaType) {
        this.dataTracker.set(BETTA_TYPE, bettaType);
    }

    @Override
    public void copyDataToStack(ItemStack stack) {
        super.copyDataToStack(stack);

        stack.getOrCreateNbt().putInt("Variant", this.getVariant());
    }

    @Override
    public Entity createChild(ServerWorld world, Lovable lovable) {
        BettaEntity betta = (BettaEntity) super.createChild(world, lovable);

        if(betta != null)
            betta.setVariant(this.random.nextInt(7));

        return betta;
    }

    @Override
    public ItemStack getBucketItem() {
        return new ItemStack(BETTA_BUCKET);
    }

    @Override
    public EntityAttributeModifier getSpeedModifier() {
        return MOVEMENT_SPEED_BOOST_235;
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();

        this.dataTracker.startTracking(BETTA_TYPE, 0);
    }

    @Nullable
    @Override
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, @Nullable EntityData entityData, @Nullable NbtCompound entityNbt) {
        this.setVariant(this.random.nextInt(7));

        return super.initialize(world, difficulty, spawnReason, entityData, entityNbt);
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);

        this.variantFromNbt(nbt);
    }

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);

        this.variantToNbt(nbt);
    }

}
