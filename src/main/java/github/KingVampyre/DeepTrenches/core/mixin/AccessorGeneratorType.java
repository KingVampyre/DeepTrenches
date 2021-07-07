package github.KingVampyre.DeepTrenches.core.mixin;

import net.minecraft.client.world.GeneratorType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(GeneratorType.class)
public interface AccessorGeneratorType {

    @Accessor("VALUES")
    static List<GeneratorType> getValues() {
        throw new AssertionError();
    }

}