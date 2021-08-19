package github.KingVampyre.DeepTrenches.core.init;

import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.fluid.Fluid;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class DTFluidTags {

    public static final Tag<Fluid> SINKING_WATER = TagRegistry.fluid(new Identifier("deep_trenches:sinking_water"));

}
