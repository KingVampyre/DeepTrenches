package github.KingVampyre.DeepTrenches.common.entity;

import github.KingVampyre.DeepTrenches.common.component.animal.TamableAnimalComponent;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.scoreboard.AbstractTeam;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Util;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

import java.util.Optional;

import static github.KingVampyre.DeepTrenches.core.init.Components.ANIMAL;

public abstract class TamableFishEntity extends AngerableFishEntity {

    protected TamableFishEntity(EntityType<? extends TamableFishEntity> type, World world) {
        super(type, world);
    }

    @Override
    public boolean canTarget(LivingEntity target) {
        Optional<TamableAnimalComponent> component = ANIMAL.maybeGet(this).map(TamableAnimalComponent.class::cast);
        boolean canTarget = super.canTarget(target);

        return component.map(tamable -> !tamable.isOwner(target) && canTarget).orElse(canTarget);

    }

    @Override
    public AbstractTeam getScoreboardTeam() {
        Optional<TamableAnimalComponent> component = ANIMAL.maybeGet(this).map(TamableAnimalComponent.class::cast);

        if(component.isPresent()) {
            TamableAnimalComponent tamable = component.get();

            if (tamable.getIsTamed()) {
                LivingEntity owner = tamable.getOwner();

                if (owner != null)
                    return owner.getScoreboardTeam();
            }
        }

        return super.getScoreboardTeam();
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
                float health = this.getHealth();
                float maxHealth = this.getMaxHealth();

                if (tamable.isBreedingItem(stack) && health < maxHealth) {
                    FoodComponent food = item.getFoodComponent();

                    if (!player.abilities.creativeMode)
                        stack.decrement(1);

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

                    this.world.sendEntityStatus(this, (byte) 7);
                } else
                    this.world.sendEntityStatus(this, (byte) 6);

                return ActionResult.SUCCESS;
            }

        }

        return super.interactMob(player, hand);
    }

    @Override
    public void handleStatus(byte status) {

        switch (status) {
            case 18:
            case 7:
                this.addEmoteParticle(true);
                break;
            case 6:
                this.addEmoteParticle(false);
                break;
            default:
                super.handleStatus(status);
        }

    }

    @Environment(EnvType.CLIENT)
    protected void addEmoteParticle(boolean positive) {
        ParticleEffect particleEffect = positive ? ParticleTypes.HEART : ParticleTypes.SMOKE;

        for(int i = 0; i < 7; ++i) {
            double x = this.getParticleX(1.0D);
            double y = this.getRandomBodyY() + 0.5D;
            double z = this.getParticleZ(1.0D);

            double velocityX = random.nextGaussian() * 0.02D;
            double velocityY = random.nextGaussian() * 0.02D;
            double velocityZ = random.nextGaussian() * 0.02D;

            MinecraftClient.getInstance().particleManager.addParticle(particleEffect, x, y, z, velocityX, velocityY, velocityZ);
        }

    }

    @Override
    public boolean isTeammate(Entity other) {
        Optional<TamableAnimalComponent> component = ANIMAL.maybeGet(this).map(TamableAnimalComponent.class::cast);

        if(component.isPresent()) {
            TamableAnimalComponent tamable = component.get();

            if (tamable.getIsTamed()) {
                LivingEntity owner = tamable.getOwner();

                if (other == owner)
                    return true;

                if (owner != null)
                    return owner.isTeammate(other);
            }

        }

        return super.isTeammate(other);
    }

    @Deprecated
    public void onDeath(DamageSource source) {
        Optional<TamableAnimalComponent> component = ANIMAL.maybeGet(this).map(TamableAnimalComponent.class::cast);

        if(component.isPresent()) {
            TamableAnimalComponent tamable = component.get();

            if (!this.world.isClient() && this.world.getGameRules().getBoolean(GameRules.SHOW_DEATH_MESSAGES)) {
                LivingEntity owner = tamable.getOwner();

                if(owner instanceof ServerPlayerEntity)
                    owner.sendSystemMessage(this.getDamageTracker().getDeathMessage(), Util.NIL_UUID);
            }

        }

        super.onDeath(source);
    }

}
