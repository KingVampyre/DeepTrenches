package github.KingVampyre.DeepTrenches.client.mixin;

import net.minecraft.client.render.RenderPhase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(RenderPhase.class)
public interface AccessorRenderPhase {

    @Accessor("ADDITIVE_TRANSPARENCY")
    static RenderPhase.Transparency additiveTransparency() {
        throw new AssertionError();
    }

    @Accessor("BLACK_FOG")
    static RenderPhase.Fog blackFog() {
        throw new AssertionError();
    }

    @Accessor("COLOR_MASK")
    static RenderPhase.WriteMaskState colorMask() {
        throw new AssertionError();
    }

    @Accessor("ONE_TENTH_ALPHA")
    static RenderPhase.Alpha oneTenthAlpha() {
        throw new AssertionError();
    }

}
