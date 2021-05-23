package github.KingVampyre.DeepTrenches.core.init;

import com.mojang.serialization.Codec;
import github.KingVampyre.DeepTrenches.core.mixin.InvokerMemoryModuleType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.registry.Registry;

import java.util.Optional;
import java.util.UUID;

import static com.mojang.serialization.Codec.BOOL;
import static com.mojang.serialization.Codec.INT;
import static net.minecraft.util.dynamic.DynamicSerializableUuid.CODEC;
import static net.minecraft.util.registry.Registry.MEMORY_MODULE_TYPE;

public class MemoryModuleTypes {

    public static final MemoryModuleType<Integer> BREEDING_AGE;
    public static final MemoryModuleType<LivingEntity> BREEDING_TARGET;
    public static final MemoryModuleType<Integer> FORCED_AGE;
    public static final MemoryModuleType<Integer> HAPPY_TICKS_REMAINING;
    public static final MemoryModuleType<Integer> LOVE_TICKS;
    public static final MemoryModuleType<UUID> LOVING_PLAYER;
    public static final MemoryModuleType<LivingEntity> NEAREST_ADULT;
    public static final MemoryModuleType<UUID> OWNER;
    public static final MemoryModuleType<Boolean> SITTING;
    public static final MemoryModuleType<Boolean> TAMED;
    public static final MemoryModuleType<Integer> TEMPTATION_COOLDOWN_TICKS;
    public static final MemoryModuleType<Boolean> TEMPTED;
    public static final MemoryModuleType<PlayerEntity> TEMPTING_PLAYER;

    private static <U> MemoryModuleType<U> createMemoryModule(String id, Codec<U> codec) {
        return Registry.register(MEMORY_MODULE_TYPE, id, InvokerMemoryModuleType.create(Optional.of(codec)));
    }

    private static <U> MemoryModuleType<U> createMemoryModule(String id) {
        return Registry.register(MEMORY_MODULE_TYPE, id, InvokerMemoryModuleType.create(Optional.empty()));
    }

    static {
        BREEDING_AGE = createMemoryModule("deep_trenches:breeding_age", INT);
        BREEDING_TARGET = createMemoryModule("breeding_target");
        FORCED_AGE = createMemoryModule("deep_trenches:forced_age", INT);
        HAPPY_TICKS_REMAINING = createMemoryModule("deep_trenches:happy_ticks_remaining", INT);
        LOVE_TICKS = createMemoryModule("deep_trenches:love_ticks", INT);
        LOVING_PLAYER = createMemoryModule("deep_trenches:loving_player", CODEC);
        NEAREST_ADULT = createMemoryModule("deep_trenches:nearest_adult");
        OWNER = createMemoryModule("deep_trenches:owner", CODEC);
        SITTING = createMemoryModule("deep_trenches:sitting", BOOL);
        TAMED = createMemoryModule("deep_trenches:tamed", BOOL);
        TEMPTATION_COOLDOWN_TICKS = createMemoryModule("deep_trenches:temptation_cooldown_ticks", INT);
        TEMPTED = createMemoryModule("deep_trenches:tempted", BOOL);
        TEMPTING_PLAYER = createMemoryModule("deep_trenches:tempting_player");
    }

}
