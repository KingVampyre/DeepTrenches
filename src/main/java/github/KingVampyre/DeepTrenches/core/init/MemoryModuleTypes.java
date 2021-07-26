package github.KingVampyre.DeepTrenches.core.init;

import com.mojang.serialization.Codec;
import github.Louwind.entityutils.core.mixin.InvokerMemoryModuleType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.util.dynamic.DynamicSerializableUuid;
import net.minecraft.util.registry.Registry;

import java.util.Optional;
import java.util.UUID;

import static com.mojang.serialization.Codec.BOOL;
import static com.mojang.serialization.Codec.INT;
import static net.minecraft.util.registry.Registry.MEMORY_MODULE_TYPE;

public class MemoryModuleTypes {

    public static final MemoryModuleType<Integer> ANGRY_TICKS;
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

    private static <U> MemoryModuleType<U> createMemoryModule(String id, Codec<U> codec) {
        return Registry.register(MEMORY_MODULE_TYPE, id, InvokerMemoryModuleType.create(Optional.of(codec)));
    }

    private static <U> MemoryModuleType<U> createMemoryModule(String id) {
        return Registry.register(MEMORY_MODULE_TYPE, id, InvokerMemoryModuleType.create(Optional.empty()));
    }

    static {
        ANGRY_TICKS = createMemoryModule("deep_trenches:angry_ticks", INT);
        BREEDING_AGE = createMemoryModule("deep_trenches:breeding_age", INT);
        BREEDING_TARGET = createMemoryModule("breeding_target");
        FORCED_AGE = createMemoryModule("deep_trenches:forced_age", INT);
        HAPPY_TICKS_REMAINING = createMemoryModule("deep_trenches:happy_ticks_remaining", INT);
        LOVE_TICKS = createMemoryModule("deep_trenches:love_ticks", INT);
        LOVING_PLAYER = createMemoryModule("deep_trenches:loving_player", DynamicSerializableUuid.CODEC);
        NEAREST_ADULT = createMemoryModule("deep_trenches:nearest_adult");
        OWNER = createMemoryModule("deep_trenches:owner", DynamicSerializableUuid.CODEC);
        SITTING = createMemoryModule("deep_trenches:sitting", BOOL);
        TAMED = createMemoryModule("deep_trenches:tamed", BOOL);
    }

}
