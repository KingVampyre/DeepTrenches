package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.mixin.InvokerMemoryModuleType;
import net.minecraft.entity.ai.brain.MemoryModuleType;

import java.util.Optional;
import java.util.UUID;

import static com.mojang.serialization.Codec.*;
import static net.minecraft.util.dynamic.DynamicSerializableUuid.CODEC;

public class MemoryModuleTypes {

    public static final MemoryModuleType<Integer> BREEDING_AGE = InvokerMemoryModuleType.create(Optional.of(INT));

    public static final MemoryModuleType<Integer> FORCED_AGE = InvokerMemoryModuleType.create(Optional.of(INT));

    public static final MemoryModuleType<Integer> HAPPY_TICKS_REMAINING = InvokerMemoryModuleType.create(Optional.of(INT));

    public static final MemoryModuleType<Integer> LOVE_TICKS = InvokerMemoryModuleType.create(Optional.of(INT));

    public static final MemoryModuleType<UUID> LOVING_PLAYER = InvokerMemoryModuleType.create(Optional.of(CODEC));

    public static final MemoryModuleType<UUID> OWNER = InvokerMemoryModuleType.create(Optional.of(CODEC));

    public static final MemoryModuleType<Boolean> SITTING = InvokerMemoryModuleType.create(Optional.of(BOOL));

    public static final MemoryModuleType<Boolean> TAMED = InvokerMemoryModuleType.create(Optional.of(BOOL));

}
