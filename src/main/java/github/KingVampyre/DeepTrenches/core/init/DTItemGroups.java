package github.KingVampyre.DeepTrenches.core.init;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static github.KingVampyre.DeepTrenches.core.init.DTBlocks.FUCHSITRA_LOG;
import static github.KingVampyre.DeepTrenches.core.init.DTBlocks.PIPE_ORGAN_CORAL;
import static github.KingVampyre.DeepTrenches.core.init.DTItems.ADAIGGER;
import static github.KingVampyre.DeepTrenches.core.init.DTItems.BARBELED_LOOSEJAW;

public class DTItemGroups {

    public static final ItemGroup COMBAT = FabricItemGroupBuilder.build(
            new Identifier("deep_trenches:combat"),
            () -> new ItemStack(ADAIGGER));

    public static final ItemGroup MISC = FabricItemGroupBuilder.build(
            new Identifier("deep_trenches:misc"),
            () -> new ItemStack(BARBELED_LOOSEJAW));

    public static final ItemGroup SEA_BLOCKS = FabricItemGroupBuilder.build(
            new Identifier("deep_trenches:sea_blocks"),
            () -> new ItemStack(PIPE_ORGAN_CORAL));

    public static final ItemGroup WOODS = FabricItemGroupBuilder.build(
            new Identifier("deep_trenches:woods"),
            () -> new ItemStack(FUCHSITRA_LOG));

}
