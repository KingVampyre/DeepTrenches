package github.KingVampyre.DeepTrenches.common.entity;

import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Tamable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.scoreboard.AbstractTeam;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Util;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

import java.util.List;
import java.util.UUID;

import static github.KingVampyre.DeepTrenches.core.init.MemoryModuleTypes.*;

public abstract class TamableFishEntity extends LovingFishEntity implements Tamable {

    protected TamableFishEntity(EntityType<? extends TamableFishEntity> type, World world) {
        super(type, world);
    }

    @Override
    public boolean canTarget(LivingEntity target) {
        return !this.isOwner(target) && super.canTarget(target);
    }

    @Override
    public AbstractTeam getScoreboardTeam() {

        if(this.isTamed()) {
            LivingEntity owner = this.getOwner();

            if(owner != null)
                return owner.getScoreboardTeam();
        }

        return super.getScoreboardTeam();
    }

    @Override
    public List<MemoryModuleType<?>> getMemoryModules() {
        List<MemoryModuleType<?>> memoryModules = super.getMemoryModules();

        memoryModules.add(OWNER);
        memoryModules.add(SITTING);
        memoryModules.add(TAMED);

        return memoryModules;
    }

    @Override
    public UUID getOwnerUuid() {
        return this.brain.getOptionalMemory(OWNER).orElse(null);
    }

    @Override
    public LivingEntity getOwner() {
        return this.brain.getOptionalMemory(OWNER).map(this.world::getPlayerByUuid).orElse(null);
    }

    @Override
    public boolean isOwner(LivingEntity entity) {
        return entity == this.getOwner();
    }

    @Override
    public boolean isSitting() {
        return this.brain.getOptionalMemory(SITTING).orElse(false);
    }

    @Override
    public boolean isTamed() {
        return this.brain.getOptionalMemory(TAMED).orElse(false);
    }

    @Override
    public void setOwnerUuid(UUID ownerUuid) {
        this.brain.remember(OWNER, ownerUuid);
    }

    @Override
    public void setSitting(boolean sitting) {
        this.brain.remember(SITTING, sitting);
    }

    @Override
    public void setTamed(boolean tamed) {
        this.brain.remember(TAMED, tamed);
    }

    @Override
    public void setTamedBy(PlayerEntity player) {
        this.setOwnerUuid(player.getUuid());
        this.setTamed(true);
    }

    @Override
    protected ActionResult interactMob(PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(hand);
        Item item = stack.getItem();

        if (this.world.isClient) {
            boolean bl = this.isOwner(player) || this.isTamed() || this.isTameItem(stack) && !this.isTamed() && !this.hasAngerTime();

            return bl ? ActionResult.CONSUME : ActionResult.PASS;
        }

        if (this.isTamed()) {
            float health = this.getHealth();
            float maxHealth = this.getMaxHealth();

            if (this.isBreedingItem(stack) && health < maxHealth) {
                FoodComponent food = item.getFoodComponent();

                this.eat(player, stack);

                if(food != null) {
                    int hunger = food.getHunger();

                    this.heal(hunger);
                    return ActionResult.SUCCESS;
                }

            }

        } else if (this.isTameItem(stack) && !this.hasAngerTime()) {

            this.eat(player, stack);

            if (this.random.nextInt(3) == 0) {
                this.setTamedBy(player);

                this.world.sendEntityStatus(this, (byte) 7);
            } else
                this.world.sendEntityStatus(this, (byte) 6);

            return ActionResult.SUCCESS;
        }

        if (this.isBreedingItem(stack)) {
            int growingAge = this.getBreedingAge();

            if (!this.world.isClient && growingAge == 0 && this.getLoveTicks() <= 0) {
                this.eat(player, stack);
                this.lovePlayer(player);

                return ActionResult.SUCCESS;
            }

            if (this.isBaby()) {
                this.growUp(400, true);
                this.eat(player, stack);

                return ActionResult.success(this.world.isClient);
            }

            if (this.world.isClient)
                return ActionResult.CONSUME;
        }

        return super.interactMob(player, hand);
    }

    @Override
    public void handleStatus(byte status) {

        switch (status) {
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

    @Override
    public boolean isTeammate(Entity other) {

        if (this.isTamed()) {
            LivingEntity owner = this.getOwner();

            if (other == owner)
                return true;

            if (owner != null)
                return owner.isTeammate(other);
        }

        return super.isTeammate(other);
    }

    @Deprecated
    public void onDeath(DamageSource source) {

        if (!this.world.isClient() && this.world.getGameRules().getBoolean(GameRules.SHOW_DEATH_MESSAGES)) {
            LivingEntity owner = this.getOwner();

            if(owner instanceof ServerPlayerEntity)
                owner.sendSystemMessage(this.getDamageTracker().getDeathMessage(), Util.NIL_UUID);
        }

        super.onDeath(source);
    }

}
