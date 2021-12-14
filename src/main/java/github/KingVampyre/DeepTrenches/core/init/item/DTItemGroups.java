package github.KingVampyre.DeepTrenches.core.init.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static github.KingVampyre.DeepTrenches.core.init.block.DTBlocks.*;
import static github.KingVampyre.DeepTrenches.core.init.item.DTItems.*;

public class DTItemGroups {

    public static final ItemGroup ARBOROLOGY = FabricItemGroupBuilder.build(
            new Identifier("deep_trenches:arborology"),
            () -> new ItemStack(FUCHSITRA_LOG));

    public static final ItemGroup COMBAT = FabricItemGroupBuilder.build(
            new Identifier("deep_trenches:combat"),
            () -> new ItemStack(ENRON_SWORD));

    public static final ItemGroup MINERALOGY = FabricItemGroupBuilder.build(
            new Identifier("deep_trenches:mineralogy"),
            () -> new ItemStack(WAVEITE));

    public static final ItemGroup MISC = FabricItemGroupBuilder.build(
            new Identifier("deep_trenches:misc"),
            () -> new ItemStack(BARBELED_LOOSEJAW));

    public static final ItemGroup PHYTOLOGY = FabricItemGroupBuilder.build(
            new Identifier("deep_trenches:phytology"),
            () -> new ItemStack(BLUE_VIOLET));

    public static final ItemGroup SEA_BLOCKS = FabricItemGroupBuilder.build(
            new Identifier("deep_trenches:sea_blocks"),
            () -> new ItemStack(PIPE_ORGAN_CORAL));

    public static final ItemGroup TOOLS = FabricItemGroupBuilder.build(
            new Identifier("deep_trenches:tools"),
            () -> new ItemStack(CHALCEDONY_AXE));

}