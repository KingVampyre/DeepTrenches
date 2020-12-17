package github.KingVampyre.DeepTrenches.common.entity.ai.goal;

import github.KingVampyre.DeepTrenches.common.component.animal.AnimalComponent;
import github.KingVampyre.DeepTrenches.common.component.animal.TamableAnimalComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;

import java.util.Optional;

import static github.KingVampyre.DeepTrenches.core.init.Components.ANIMAL;

public class TamedAnimalMateGoal extends AnimalMateGoal {

    public TamedAnimalMateGoal(MobEntity mob, AnimalComponent animal, double chance, double maxDist, double minDist, int adultAge, int childAge, int timeout) {
        super(mob, animal, chance, maxDist, minDist, adultAge, childAge, timeout);
    }

    @Override
    protected Entity createChild(AnimalComponent mate) {
        Entity child = super.createChild(mate);

        if(child != null) {
            TamableAnimalComponent mateTamable = (TamableAnimalComponent) mate;
            TamableAnimalComponent animal = (TamableAnimalComponent) ANIMAL.get(child);

            PlayerEntity player = mateTamable.getLovingPlayer();

            animal.setTamedBy(player);
            child.calculateDimensions();
        }

        return child;
    }

    @Override
    protected TargetPredicate getTargetPredicate() {
        return new TargetPredicate().setBaseMaxDistance(this.maxDist).includeInvulnerable().includeTeammates().includeHidden().setPredicate(living -> {
            Optional<TamableAnimalComponent> component = ANIMAL.maybeGet(living).map(TamableAnimalComponent.class::cast);

            if(component.isPresent()) {
                TamableAnimalComponent animal = component.get();

                return !animal.isBaby() && animal.isInLove() && animal.getIsTamed();
            }

            return false;
        });
    }

}
