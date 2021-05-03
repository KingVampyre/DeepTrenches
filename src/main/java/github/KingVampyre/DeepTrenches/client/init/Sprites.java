package github.KingVampyre.DeepTrenches.client.init;

import com.google.common.collect.ImmutableList;
import github.KingVampyre.DeepTrenches.client.texture.SpriteLoader;

import static github.KingVampyre.DeepTrenches.client.init.Textures.*;

public class Sprites {

    public static final SpriteLoader ABYSSOPELAGIC_WATER = new SpriteLoader(ImmutableList.of(
            ABYSSOPELAGIC_WATER_FLOW,
            ABYSSOPELAGIC_WATER_STILL
    ));

}
