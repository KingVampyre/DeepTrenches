package github.KingVampyre.DeepTrenches.core.init;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.PIPE_ORGAN_CORAL;

public class ItemGroups {

    public static final ItemGroup GENERAL = FabricItemGroupBuilder.build(
            new Identifier("deep_trenches:general"),
            () -> new ItemStack(PIPE_ORGAN_CORAL));

}
