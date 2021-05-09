package github.KingVampyre.DeepTrenches.core.mixin;

import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Entity.class)
public abstract class MixinEntity {

    @Shadow
    public abstract boolean isTouchingWater();

}
