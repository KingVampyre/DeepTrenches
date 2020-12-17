package github.KingVampyre.DeepTrenches.common.entity.ai.goal;

import github.KingVampyre.DeepTrenches.common.component.animal.AnimalComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

import java.util.EnumSet;
import java.util.Optional;

import static github.KingVampyre.DeepTrenches.core.init.Components.ANIMAL;

public class AnimalMateGoal extends Goal {

    protected final AnimalComponent animal;
    protected final int adultAge;
    protected final int childAge;
    protected final int timeout;
    protected final double chance;
    protected final double maxDist;
    protected final double minDist;
    protected final MobEntity mob;
    protected final World world;

    protected MobEntity mate;
    protected int timer;

    public AnimalMateGoal(MobEntity mob, AnimalComponent animal, double chance, double maxDist, double minDist, int adultAge, int childAge, int timeout) {
        this.mob = mob;
        this.chance = chance;
        this.animal = animal;
        this.adultAge = adultAge;
        this.childAge = childAge;
        this.timeout = timeout;
        this.maxDist = maxDist;
        this.minDist = minDist;
        this.world = mob.world;

        this.setControls(EnumSet.of(Goal.Control.MOVE, Goal.Control.LOOK));
    }

    @Override
    public boolean canStart() {

        if (!this.animal.isInLove())
            return false;
        else if(this.animal.getPlayerInLove() == null)
            return false;

        this.mate = this.findMate();

        return this.mate != null;
    }

    @Override
    public boolean shouldContinue() {
        return this.mate.isAlive() && this.animal.isInLove() && this.timer < this.timeout;
    }

    @Override
    public void stop() {
        this.mate = null;
        this.timer = 0;
    }

    @Override
    public void tick() {
        this.mob.getLookControl().lookAt(this.mate, 10.0F, this.mob.getLookPitchSpeed());
        this.mob.getNavigation().startMovingTo(this.mate, this.chance);

        if (++this.timer >= this.timeout && this.isCloseEnough()) {
            AnimalComponent mate = ANIMAL.get(this.mate);
            ServerWorld server = (ServerWorld) this.world;

            this.breed(server, mate);
        }

    }

    protected void breed(ServerWorld server, AnimalComponent mate) {
        Entity child = this.createChild(mate);

        if (child != null) {
            this.animal.setGrowingAge(this.adultAge);
            this.animal.resetInLove();

            mate.setGrowingAge(this.adultAge);
            mate.resetInLove();

            double x = this.mob.getX();
            double y = this.mob.getY();
            double z = this.mob.getZ();

            child.refreshPositionAndAngles(x, y, z, 0.0F, 0.0F);

            server.spawnEntityAndPassengers(child);
            server.sendEntityStatus(this.mob, (byte) 18);

            if (server.getGameRules().getBoolean(GameRules.DO_MOB_LOOT)) {
                ExperienceOrbEntity experienceOrb = this.createExperienceOrb(server, x, y, z);

                server.spawnEntity(experienceOrb);
            }

        }

    }

    protected Entity createChild(AnimalComponent mate) {
        EntityType<?> type = mate.getMob().getType();
        Entity child = type.create(this.world);

        if(child != null) {
            AnimalComponent animal = ANIMAL.get(child);

            animal.setGrowingAge(this.childAge);
        }

        return child;
    }

    protected ExperienceOrbEntity createExperienceOrb(ServerWorld server, double x, double y, double z) {
        return new ExperienceOrbEntity(server, x, y, z, this.mob.getRandom().nextInt(7) + 1);
    }

    protected MobEntity findMate() {
        BlockPos pos = this.mob.getBlockPos();

        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();

        TargetPredicate predicate = this.getTargetPredicate();
        Box box = new Box(pos).expand(this.maxDist);

        return this.world.getClosestEntity(this.mob.getClass(), predicate, this.mob, x, y, z, box);
    }

    protected TargetPredicate getTargetPredicate() {
        return new TargetPredicate().setBaseMaxDistance(this.maxDist).includeInvulnerable().includeTeammates().includeHidden().setPredicate(living -> {
            Optional<AnimalComponent> component = ANIMAL.maybeGet(living);

            if(component.isPresent()) {
                AnimalComponent animal = component.get();

                return !animal.isBaby() && animal.isInLove();
            }

            return false;
        });
    }

    protected boolean isCloseEnough() {
        return this.mob.distanceTo(this.mate) < this.minDist;
    }

}
