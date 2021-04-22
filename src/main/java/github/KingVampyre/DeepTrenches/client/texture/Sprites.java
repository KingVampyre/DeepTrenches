package github.KingVampyre.DeepTrenches.client.texture;

import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.util.Identifier;
import net.minecraft.util.SignType;

import static net.minecraft.client.render.TexturedRenderLayers.SIGNS_ATLAS_TEXTURE;

public class Sprites {

    public static SpriteIdentifier getSignTexture(SignType signType) {
        return new SpriteIdentifier(SIGNS_ATLAS_TEXTURE, new Identifier("deep_trenches:entity/signs/" + signType.getName()));
    }

}
