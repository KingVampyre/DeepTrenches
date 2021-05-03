package github.KingVampyre.DeepTrenches.client.resource.listener;

import github.KingVampyre.DeepTrenches.client.texture.SpriteLoader;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.texture.Sprite;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;

import java.util.function.Function;

import static net.minecraft.screen.PlayerScreenHandler.BLOCK_ATLAS_TEXTURE;

public class SpritesResourceReloadLoader implements SimpleSynchronousResourceReloadListener {

    protected final Identifier id;
    protected final SpriteLoader sprites;

    public SpritesResourceReloadLoader(String id, SpriteLoader sprites) {
        this.id = Identifier.tryParse(id);
        this.sprites = sprites;
    }

    @Override
    public void apply(ResourceManager manager) {
        Function<Identifier, Sprite> atlas = MinecraftClient.getInstance().getSpriteAtlas(BLOCK_ATLAS_TEXTURE);

        this.sprites.load(atlas);
    }

    @Override
    public Identifier getFabricId() {
        return this.id;
    }

}
