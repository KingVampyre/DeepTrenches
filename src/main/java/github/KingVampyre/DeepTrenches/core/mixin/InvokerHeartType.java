package github.KingVampyre.DeepTrenches.core.mixin;

import net.minecraft.client.gui.hud.InGameHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(InGameHud.HeartType.class)
public interface InvokerHeartType {

    @Invoker("<init>")
    static InGameHud.HeartType create(int textureIndex, boolean hasBlinkingTexture) {
        throw new AssertionError();
    }

}
