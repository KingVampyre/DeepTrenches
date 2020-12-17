package github.KingVampyre.DeepTrenches.core.mixin;

import com.mojang.serialization.Codec;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.Optional;

@Mixin(MemoryModuleType.class)
public interface InvokerMemoryModuleType {

    @Invoker("<init>")
    static <U> MemoryModuleType<U> create(Optional<Codec<U>> codec) {
        throw new AssertionError();
    }

}
