package github.KingVampyre.DeepTrenches.core.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Entity.class)
public abstract class MixinEntity {

    @Shadow
    public World world;

    @Shadow
    public abstract boolean isTouchingWater();

    @Shadow
    public abstract Box getBoundingBox();

}
