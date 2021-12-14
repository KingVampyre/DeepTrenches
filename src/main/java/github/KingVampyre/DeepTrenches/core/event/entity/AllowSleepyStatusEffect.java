package github.KingVampyre.DeepTrenches.core.event.entity;

import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

import static github.KingVampyre.DeepTrenches.core.init.entity.DTStatusEffects.SLEEPY;
import static net.minecraft.entity.player.PlayerEntity.SleepFailureReason.NOT_POSSIBLE_NOW;

public class AllowSleepyStatusEffect implements EntitySleepEvents.AllowSleeping {

    public static final AllowSleepyStatusEffect INSTANCE = new AllowSleepyStatusEffect();

    @Override
    public PlayerEntity.@Nullable SleepFailureReason allowSleep(PlayerEntity player, BlockPos sleepingPos) {
        return player.world.isDay() && player.hasStatusEffect(SLEEPY) ? null : NOT_POSSIBLE_NOW;
    }

}