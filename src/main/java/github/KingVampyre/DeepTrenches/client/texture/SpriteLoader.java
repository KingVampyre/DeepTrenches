package github.KingVampyre.DeepTrenches.client.texture;

import com.google.common.collect.ImmutableList;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.texture.Sprite;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.function.Function;

@Environment(EnvType.CLIENT)
public class SpriteLoader {

    protected final ImmutableList<Identifier> textures;
    @Nullable
    protected Sprite[] sprites;

    public SpriteLoader(ImmutableList<Identifier> textures) {
        this.textures = textures;
    }

    public Sprite[] geSprites() {
        return this.sprites;
    }

    public void load(Function<Identifier, Sprite> atlas) {
        this.sprites = this.textures.stream().map(atlas).toArray(Sprite[]::new);
    }

}
