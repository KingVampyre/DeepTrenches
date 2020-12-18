package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.mixin.InvokerMemoryModuleType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.player.PlayerEntity;

import java.util.Optional;
import java.util.UUID;

import static com.mojang.serialization.Codec.BOOL;
import static com.mojang.serialization.Codec.INT;
import static net.minecraft.util.dynamic.DynamicSerializableUuid.CODEC;

public class MemoryModuleTypes {

    public static final MemoryModuleType<Integer> BREEDING_AGE = InvokerMemoryModuleType.create(Optional.of(INT));

    public static final MemoryModuleType<LivingEntity> BREEDING_TARGET = InvokerMemoryModuleType.create(Optional.empty());

    public static final MemoryModuleType<Integer> FORCED_AGE = InvokerMemoryModuleType.create(Optional.of(INT));

    public static final MemoryModuleType<Integer> HAPPY_TICKS_REMAINING = InvokerMemoryModuleType.create(Optional.of(INT));

    public static final MemoryModuleType<Integer> LOVE_TICKS = InvokerMemoryModuleType.create(Optional.of(INT));

    public static final MemoryModuleType<UUID> LOVING_PLAYER = InvokerMemoryModuleType.create(Optional.of(CODEC));

    public static final MemoryModuleType<LivingEntity> NEAREST_ADULT = InvokerMemoryModuleType.create(Optional.empty());

    public static final MemoryModuleType<UUID> OWNER = InvokerMemoryModuleType.create(Optional.of(CODEC));

    public static final MemoryModuleType<Boolean> SITTING = InvokerMemoryModuleType.create(Optional.of(BOOL));

    public static final MemoryModuleType<Boolean> TAMED = InvokerMemoryModuleType.create(Optional.of(BOOL));

    public static final MemoryModuleType<Integer> TEMPTATION_COOLDOWN_TICKS = InvokerMemoryModuleType.create(Optional.of(INT));

    public static final MemoryModuleType<Boolean> TEMPTED = InvokerMemoryModuleType.create(Optional.of(BOOL));

    public static final MemoryModuleType<PlayerEntity> TEMPTING_PLAYER = InvokerMemoryModuleType.create(Optional.empty());

}
