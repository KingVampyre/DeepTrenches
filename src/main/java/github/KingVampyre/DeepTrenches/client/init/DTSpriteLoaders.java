package github.KingVampyre.DeepTrenches.client.init;

import com.google.common.collect.ImmutableList;
import github.Louwind.Reload.client.texture.SpriteLoader;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.util.Identifier;

import static github.KingVampyre.DeepTrenches.client.init.DTTextures.*;
import static net.minecraft.resource.ResourceType.CLIENT_RESOURCES;
import static net.minecraft.screen.PlayerScreenHandler.BLOCK_ATLAS_TEXTURE;

public class DTSpriteLoaders {

    public static final SpriteLoader ACID_SPRITES;
    public static final SpriteLoader BRINE_SPRITES;
    public static final SpriteLoader CLEAR_WATER_SPRITES;
    public static final SpriteLoader ABYSSOPELAGIC_WATER_SPRITES;
    public static final SpriteLoader BATHYPELAGIC_WATER_SPRITES;
    public static final SpriteLoader HADOPELAGIC_WATER_SPRITES;
    public static final SpriteLoader MESOPELAGIC_WATER_SPRITES;
    public static final SpriteLoader STORCEAN_ABYSSOPELAGIC_WATER_SPRITES;
    public static final SpriteLoader STORCEAN_BATHYPELAGIC_WATER_SPRITES;
    public static final SpriteLoader STORCEAN_ENDERPELAGIC_WATER_SPRITES;
    public static final SpriteLoader STORCEAN_HADOPELAGIC_WATER_SPRITES;
    public static final SpriteLoader STORCEAN_GASOPELAGIC_WATER_SPRITES;
    public static final SpriteLoader STORCEAN_INFINIPELAGIC_WATER_SPRITES;
    public static final SpriteLoader STORCEAN_MESOPELAGIC_WATER_SPRITE;
    public static final SpriteLoader STORCEAN_VIRDIPELAGIC_WATER_SPRITE;
    public static final SpriteLoader STORCEAN_WATER_SPRITE;
    
    static {
        ABYSSOPELAGIC_WATER_SPRITES = new SpriteLoader(new Identifier("deep_trenches:abyssopelagic_water_sprites"), BLOCK_ATLAS_TEXTURE, ImmutableList.of(
                ABYSSOPELAGIC_WATER_FLOW,
                ABYSSOPELAGIC_WATER_STILL
        ));

        ACID_SPRITES = new SpriteLoader(new Identifier("deep_trenches:acid_sprites"), BLOCK_ATLAS_TEXTURE, ImmutableList.of(
                ACID_FLOW,
                ACID_STILL
        ));

        BATHYPELAGIC_WATER_SPRITES = new SpriteLoader(new Identifier("deep_trenches:bathypelagic_water_sprites"), BLOCK_ATLAS_TEXTURE, ImmutableList.of(
                BATHYPELAGIC_WATER_FLOW,
                BATHYPELAGIC_WATER_STILL
        ));

        BRINE_SPRITES = new SpriteLoader(new Identifier("deep_trenches:brine_water_sprites"), BLOCK_ATLAS_TEXTURE, ImmutableList.of(
                BRINE_FLOW,
                BRINE_STILL
        ));

        CLEAR_WATER_SPRITES = new SpriteLoader(new Identifier("deep_trenches:clear_water_sprites"), BLOCK_ATLAS_TEXTURE, ImmutableList.of(
                CLEAR_WATER_FLOW,
                CLEAR_WATER_STILL
        ));

        HADOPELAGIC_WATER_SPRITES = new SpriteLoader(new Identifier("deep_trenches:hadopelagic_water_sprites"), BLOCK_ATLAS_TEXTURE, ImmutableList.of(
                HADOPELAGIC_WATER_FLOW,
                HADOPELAGIC_WATER_STILL
        ));

        MESOPELAGIC_WATER_SPRITES = new SpriteLoader(new Identifier("deep_trenches:mesopelagic_water_sprites"), BLOCK_ATLAS_TEXTURE, ImmutableList.of(
                MESOPELAGIC_WATER_FLOW,
                MESOPELAGIC_WATER_STILL
        ));

        STORCEAN_ABYSSOPELAGIC_WATER_SPRITES = new SpriteLoader(new Identifier("deep_trenches:storcean_abyssopelagic_water_sprites"), BLOCK_ATLAS_TEXTURE, ImmutableList.of(
                STORCEAN_ABYSSOPELAGIC_WATER_FLOW,
                STORCEAN_ABYSSOPELAGIC_WATER_STILL
        ));

        STORCEAN_BATHYPELAGIC_WATER_SPRITES = new SpriteLoader(new Identifier("deep_trenches:storcean_bathypelagic_water_sprites"), BLOCK_ATLAS_TEXTURE, ImmutableList.of(
                STORCEAN_BATHYPELAGIC_WATER_FLOW,
                STORCEAN_BATHYPELAGIC_WATER_STILL
        ));

        STORCEAN_ENDERPELAGIC_WATER_SPRITES = new SpriteLoader(new Identifier("deep_trenches:storcean_enderpelagic_water_sprites"), BLOCK_ATLAS_TEXTURE, ImmutableList.of(
                STORCEAN_ENDERPELAGIC_WATER_FLOW,
                STORCEAN_ENDERPELAGIC_WATER_STILL
        ));

        STORCEAN_GASOPELAGIC_WATER_SPRITES = new SpriteLoader(new Identifier("deep_trenches:storcean_gasopelagic_water_sprites"), BLOCK_ATLAS_TEXTURE, ImmutableList.of(
                STORCEAN_GASOPELAGIC_WATER_FLOW,
                STORCEAN_GASOPELAGIC_WATER_STILL
        ));

        STORCEAN_HADOPELAGIC_WATER_SPRITES = new SpriteLoader(new Identifier("deep_trenches:storcean_hadopelagic_water_sprites"), BLOCK_ATLAS_TEXTURE, ImmutableList.of(
                STORCEAN_HADOPELAGIC_WATER_FLOW,
                STORCEAN_HADOPELAGIC_WATER_STILL
        ));

        STORCEAN_INFINIPELAGIC_WATER_SPRITES = new SpriteLoader(new Identifier("deep_trenches:storcean_infinipelagic_water_sprites"), BLOCK_ATLAS_TEXTURE, ImmutableList.of(
                STORCEAN_INFINIPELAGIC_WATER_FLOW,
                STORCEAN_INFINIPELAGIC_WATER_STILL
        ));

        STORCEAN_MESOPELAGIC_WATER_SPRITE = new SpriteLoader(new Identifier("deep_trenches:storcean_mesopelagic_water_sprites"), BLOCK_ATLAS_TEXTURE, ImmutableList.of(
                STORCEAN_MESOPELAGIC_WATER_FLOW,
                STORCEAN_MESOPELAGIC_WATER_STILL
        ));

        STORCEAN_VIRDIPELAGIC_WATER_SPRITE = new SpriteLoader(new Identifier("deep_trenches:storcean_virdipelagic_water_sprites"), BLOCK_ATLAS_TEXTURE, ImmutableList.of(
                STORCEAN_VIRDIPELAGIC_WATER_FLOW,
                STORCEAN_VIRDIPELAGIC_WATER_STILL
        ));

        STORCEAN_WATER_SPRITE = new SpriteLoader(new Identifier("deep_trenches:storcean_water_sprites"), BLOCK_ATLAS_TEXTURE, ImmutableList.of(
                STORCEAN_WATER_FLOW,
                STORCEAN_WATER_STILL
        ));
    }

    public static void initialize() {
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(ACID_SPRITES);
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(BRINE_SPRITES);
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(CLEAR_WATER_SPRITES);
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(ABYSSOPELAGIC_WATER_SPRITES);
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(BATHYPELAGIC_WATER_SPRITES);
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(HADOPELAGIC_WATER_SPRITES);
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(MESOPELAGIC_WATER_SPRITES);
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(STORCEAN_ABYSSOPELAGIC_WATER_SPRITES);
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(STORCEAN_BATHYPELAGIC_WATER_SPRITES);
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(STORCEAN_ENDERPELAGIC_WATER_SPRITES);
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(STORCEAN_HADOPELAGIC_WATER_SPRITES);
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(STORCEAN_GASOPELAGIC_WATER_SPRITES);
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(STORCEAN_INFINIPELAGIC_WATER_SPRITES);
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(STORCEAN_MESOPELAGIC_WATER_SPRITE);
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(STORCEAN_VIRDIPELAGIC_WATER_SPRITE);
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(STORCEAN_WATER_SPRITE);
    }

}
