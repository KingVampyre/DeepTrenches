package github.KingVampyre.DeepTrenches.common.entity;

import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Lovable;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

import java.util.UUID;

import static github.KingVampyre.DeepTrenches.core.init.MemoryModuleTypes.LOVE_TICKS;
import static github.KingVampyre.DeepTrenches.core.init.MemoryModuleTypes.LOVING_PLAYER;

public abstract class LovingFishEntity extends AngerableFishEntity implements Lovable {

    public LovingFishEntity(EntityType<? extends LovingFishEntity> type, World world) {
        super(type, world);
    }

    @Override
    public void eat(PlayerEntity player, ItemStack stack) {
        if (!player.isCreative())
            stack.decrement(1);
    }

    @Override
    public int getLoveTicks() {
        return this.brain.getOptionalMemory(LOVE_TICKS).orElse(0);
    }

    @Override
    public UUID getLovingPlayerUuid() {
        return this.brain.getOptionalMemory(LOVING_PLAYER).orElse(null);
    }

    @Override
    public ServerPlayerEntity getLovingPlayer() {
        UUID lovingPlayer = this.getLovingPlayerUuid();

        if (lovingPlayer == null)
            return null;

        PlayerEntity playerEntity = this.world.getPlayerByUuid(lovingPlayer);

        return playerEntity instanceof ServerPlayerEntity ? (ServerPlayerEntity)playerEntity : null;
    }

    @Override
    public boolean isInLove() {
        return this.getLoveTicks() > 0;
    }

    @Override
    public void lovePlayer(PlayerEntity player) {
        this.setLoveTicks(600);

        if (player != null)
            this.setLovingPlayerUuid(player.getUuid());

        this.world.sendEntityStatus(this, (byte) 18);
    }

    @Override
    public void resetLoveTicks() {
        this.setLoveTicks(0);
    }

    @Override
    public void setLoveTicks(int loveTicks) {
        this.brain.remember(LOVE_TICKS, loveTicks);
    }

    @Override
    public void setLovingPlayerUuid(UUID uuid) {
        this.brain.remember(LOVING_PLAYER, uuid);
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
    public void breed(ServerWorld server, Lovable other) {
        Entity entity = this.createChild(server, other);

        if (entity instanceof MobEntity) {
            MobEntity mob = (MobEntity) entity;

            other.resetLoveTicks();
            this.resetLoveTicks();

            double x = this.getX();
            double y = this.getY();
            double z = this.getZ();

            mob.refreshPositionAndAngles(x, y, z, 0.0F, 0.0F);
            mob.setBaby(true);

            server.spawnEntityAndPassengers(mob);
            server.sendEntityStatus(this, (byte) 18);

            if (server.getGameRules().getBoolean(GameRules.DO_MOB_LOOT)) {
                ExperienceOrbEntity experienceOrb = this.createExperienceOrb(server, x, y, z);

                server.spawnEntity(experienceOrb);
            }

        }

    }

    @Override
    public boolean canBreedWith(LivingEntity living) {

        if(living instanceof Lovable) {
            Lovable lovable = (Lovable) living;

            if (lovable == this)
                return false;
            else if (lovable.getClass() != this.getClass())
                return false;

            return lovable.isInLove() && this.isInLove();
        }

        return false;
    }

    @Override
    public boolean damage(DamageSource source, float amount) {

        if (this.isInvulnerableTo(source))
            return false;
        else
            this.resetLoveTicks();

        return super.damage(source, amount);
    }

    @Override
    public void handleStatus(byte status) {

        if (status == 18)
            this.addEmoteParticle(true);
        else
            super.handleStatus(status);

    }

    @Override
    protected void mobTick() {

        if (this.getBreedingAge() != 0)
            this.resetLoveTicks();

        super.mobTick();
    }

    @Override
    public void tickMovement() {
        super.tickMovement();

        if (this.getBreedingAge() != 0)
            this.resetLoveTicks();

        int loveTicks = this.getLoveTicks();

        if (this.isInLove()) {
            this.setLoveTicks(--loveTicks);

            if (this.getLoveTicks() % 10 == 0)
                this.addEmoteParticle(true);
        }

    }

}
