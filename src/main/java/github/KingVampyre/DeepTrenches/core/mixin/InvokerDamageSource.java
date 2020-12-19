package github.KingVampyre.DeepTrenches.core.mixin;

import net.minecraft.entity.damage.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(DamageSource.class)
public interface InvokerDamageSource {

    @Invoker("<init>")
    static DamageSource create(String name) {
        throw new AssertionError();
    }

}
