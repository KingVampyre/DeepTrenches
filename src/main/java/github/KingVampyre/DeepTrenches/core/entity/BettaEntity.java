package github.KingVampyre.DeepTrenches.core.entity;

import github.KingVampyre.DeepTrenches.common.entity.AngerableFishEntity;
import github.KingVampyre.DeepTrenches.core.init.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.Durations;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.IntRange;
import net.minecraft.world.World;

import static github.KingVampyre.DeepTrenches.core.init.AttributeModifiers.MOVEMENT_SPEED_BOOST_235;
import static net.minecraft.entity.attribute.EntityAttributes.GENERIC_MOVEMENT_SPEED;

public class BettaEntity extends AngerableFishEntity {

    private static final IntRange ANGER_TIME_RANGE = Durations.betweenSeconds(10, 15);

    public BettaEntity(EntityType<? extends BettaEntity> type, World world) {
        super(type, world);
    }

    @Override
    protected IntRange getAngerTimeRange() {
        return ANGER_TIME_RANGE;
    }

    @Override
    protected ItemStack getFishBucketItem() {
        return new ItemStack(ModItems.BETTA_BUCKET);
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
    protected void mobTick() {
        super.mobTick();

        EntityAttributeInstance instance = this.getAttributeInstance(GENERIC_MOVEMENT_SPEED);

        if(instance != null) {
            EntityAttributeModifier modifier = this.getSpeedModifier();

            if(this.getAttacker() != null && !instance.hasModifier(modifier))
                instance.addTemporaryModifier(modifier);

            if(this.getAttacker() == null && instance.hasModifier(modifier))
                instance.removeModifier(modifier);
        }

    }

}
