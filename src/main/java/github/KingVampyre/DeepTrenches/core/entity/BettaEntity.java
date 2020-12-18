package github.KingVampyre.DeepTrenches.core.entity;

import github.KingVampyre.DeepTrenches.common.entity.TamableFishEntity;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Lovable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.Durations;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.IntRange;
import net.minecraft.world.World;

import static github.KingVampyre.DeepTrenches.core.init.AttributeModifiers.MOVEMENT_SPEED_BOOST_235;
import static github.KingVampyre.DeepTrenches.core.init.ModItems.BETTA_BUCKET;
import static net.minecraft.entity.attribute.EntityAttributes.GENERIC_MOVEMENT_SPEED;
import static net.minecraft.item.Items.COD;

public class BettaEntity extends TamableFishEntity {

    private static final IntRange ANGER_TIME_RANGE = Durations.betweenSeconds(10, 15);

    public BettaEntity(EntityType<? extends BettaEntity> type, World world) {
        super(type, world);
    }

    @Override
    public boolean canAttackWithOwner(LivingEntity target, LivingEntity owner) {
        return false;
    }

    @Override
    public Entity createChild(ServerWorld world, Lovable lovable) {
        BettaEntity betta = (BettaEntity) this.getType().create(world);

        if(betta != null) {
            PlayerEntity player = lovable.getLovingPlayer();

            betta.setTamedBy(player);
        }

        return betta;
    }

    @Override
    public ExperienceOrbEntity createExperienceOrb(ServerWorld server, double x, double y, double z) {
        return new ExperienceOrbEntity(server, x, y, z, this.random.nextInt(7) + 1);
    }

    @Override
    protected IntRange getAngerTimeRange() {
        return ANGER_TIME_RANGE;
    }

    @Override
    protected ItemStack getFishBucketItem() {
        return new ItemStack(BETTA_BUCKET);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        // TODO betta ambient sound
        return SoundEvents.ENTITY_SALMON_AMBIENT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        // TODO betta death sound
        return SoundEvents.ENTITY_SALMON_DEATH;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        // TODO betta hurt sound
        return SoundEvents.ENTITY_SALMON_HURT;
    }

    @Override
    protected SoundEvent getFlopSound() {
        // TODO betta flop sound
        return SoundEvents.ENTITY_SALMON_FLOP;
    }

    @Override
    protected EntityAttributeModifier getSpeedModifier() {
        return MOVEMENT_SPEED_BOOST_235;
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
    protected void mobTick() {
        super.mobTick();

        EntityAttributeInstance instance = this.getAttributeInstance(GENERIC_MOVEMENT_SPEED);

        if (instance != null) {
            EntityAttributeModifier modifier = this.getSpeedModifier();

            if (this.getAttacker() != null && !instance.hasModifier(modifier))
                instance.addTemporaryModifier(modifier);

            if (this.getAttacker() == null && instance.hasModifier(modifier))
                instance.removeModifier(modifier);
        }

    }

    @Override
    public void setBaby(boolean baby) {
        this.setBreedingAge(baby ? -24000 : 0);
    }

}
