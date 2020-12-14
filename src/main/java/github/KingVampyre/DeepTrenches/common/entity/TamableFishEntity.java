package github.KingVampyre.DeepTrenches.common.entity;

import github.KingVampyre.DeepTrenches.common.component.animal.TamableAnimalComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
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
