package github.KingVampyre.DeepTrenches.core.entity;

import github.KingVampyre.DeepTrenches.common.component.animal.TamableAnimalComponent;
import github.KingVampyre.DeepTrenches.common.entity.TamableFishEntity;
import github.KingVampyre.DeepTrenches.core.init.ModItems;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.Durations;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.IntRange;
import net.minecraft.world.World;

import java.util.Optional;

import static github.KingVampyre.DeepTrenches.core.init.AttributeModifiers.MOVEMENT_SPEED_BOOST_235;
import static github.KingVampyre.DeepTrenches.core.init.Components.ANIMAL;
import static net.minecraft.entity.attribute.EntityAttributes.GENERIC_MOVEMENT_SPEED;

public class BettaEntity extends TamableFishEntity {

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
    protected ActionResult interactMob(PlayerEntity player, Hand hand) {
        Optional<TamableAnimalComponent> component = ANIMAL.maybeGet(this).map(TamableAnimalComponent.class::cast);

        if(component.isPresent()) {
            TamableAnimalComponent tamable = component.get();

            ItemStack stack = player.getStackInHand(hand);
            Item item = stack.getItem();

            if (this.world.isClient) {
                boolean bl = tamable.isOwner(player) || tamable.getIsTamed() || item == Items.BONE && !tamable.getIsTamed() && !this.hasAngerTime();
                return bl ? ActionResult.CONSUME : ActionResult.PASS;
            }

            if (tamable.getIsTamed()) {

                if (tamable.isBreedingItem(stack) && this.getHealth() < this.getMaxHealth()) {
                    if (!player.abilities.creativeMode)
                        stack.decrement(1);

                    FoodComponent food = item.getFoodComponent();

                    if(food != null) {
                        int hunger = food.getHunger();

                        this.heal(hunger);
                        return ActionResult.SUCCESS;
                    }

                }

            } else if (tamable.isTameItem(stack) && !this.hasAngerTime()) {

                if (!player.abilities.creativeMode)
                    stack.decrement(1);

                if (this.random.nextInt(3) == 0) {
                    tamable.setTamedBy(player);

                    this.showEmoteParticle(true);
                } else
                    this.showEmoteParticle(false);

                return ActionResult.SUCCESS;
            }

        }

        return super.interactMob(player, hand);
    }

    protected void showEmoteParticle(boolean positive) {
        ParticleEffect particleEffect = ParticleTypes.HEART;
        if (!positive) {
            particleEffect = ParticleTypes.SMOKE;
        }

        for(int i = 0; i < 7; ++i) {
            double d = this.random.nextGaussian() * 0.02D;
            double e = this.random.nextGaussian() * 0.02D;
            double f = this.random.nextGaussian() * 0.02D;
            MinecraftClient.getInstance().particleManager.addParticle(particleEffect, this.getParticleX(1.0D), this.getRandomBodyY() + 0.5D, this.getParticleZ(1.0D), d, e, f);
        }

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
