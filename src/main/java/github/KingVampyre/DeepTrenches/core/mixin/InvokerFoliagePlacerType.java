package github.KingVampyre.DeepTrenches.core.mixin;

import com.mojang.serialization.Codec;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(FoliagePlacerType.class)
public interface InvokerFoliagePlacerType {

    @Invoker("<init>")
    static <P extends FoliagePlacer> FoliagePlacerType<P> create(Codec<P> codec) {
        throw new AssertionError();
    }

}