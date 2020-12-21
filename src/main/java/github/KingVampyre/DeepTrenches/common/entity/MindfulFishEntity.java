package github.KingVampyre.DeepTrenches.common.entity;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Mindful;
import github.KingVampyre.DeepTrenches.core.entity.BettaEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.brain.Activity;
import net.minecraft.entity.ai.brain.Brain;
import net.minecraft.entity.ai.brain.task.Task;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;

public abstract class MindfulFishEntity extends AnimatedFishEntity implements Mindful<MindfulFishEntity> {

    protected MindfulFishEntity(EntityType<? extends AnimatedFishEntity> type, World world) {
        super(type, world);
    }

    @Override
    protected Brain.Profile<BettaEntity> createBrainProfile() {
        return Brain.createProfile(this.getMemoryModules(), this.getSensors());
    }

    @Override
    protected void initGoals() {

    }

    @SuppressWarnings("unchecked")
    @Override
    protected void mobTick() {
        super.mobTick();

        Brain<MindfulFishEntity> brain = (Brain<MindfulFishEntity>) this.getBrain();
        ServerWorld server = (ServerWorld) this.world;

        this.world.getProfiler().push("mindfulFishBrain");
        brain.tick(server, this);
        this.world.getProfiler().pop();
        this.world.getProfiler().push("mindfulFishActivityUpdate");
        brain.resetPossibleActivities(ImmutableList.of(Activity.IDLE));
        this.world.getProfiler().pop();
    }

}
