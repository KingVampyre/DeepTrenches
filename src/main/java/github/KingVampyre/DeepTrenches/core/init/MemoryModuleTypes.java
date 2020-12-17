package github.KingVampyre.DeepTrenches.core.init;

import com.mojang.serialization.Codec;
import github.KingVampyre.DeepTrenches.core.mixin.InvokerMemoryModuleType;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.util.dynamic.DynamicSerializableUuid;

import java.util.Optional;
import java.util.UUID;

public class MemoryModuleTypes {

    public static final MemoryModuleType<Boolean> SITTING = InvokerMemoryModuleType.create(Optional.of(Codec.BOOL));

    public static final MemoryModuleType<Boolean> TAMED = InvokerMemoryModuleType.create(Optional.of(Codec.BOOL));

    public static final MemoryModuleType<UUID> OWNER = InvokerMemoryModuleType.create(Optional.of(DynamicSerializableUuid.CODEC));

}
