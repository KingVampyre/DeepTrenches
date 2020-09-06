package github.KingVampyre.DeepTrenches.core.init;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.PIPE_ORGAN_CORAL;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroups {

	public static final ItemGroup GENERAL = new ItemGroup(0, "deep_trenches") {

		@Override
		public ItemStack createIcon() {
			return new ItemStack(PIPE_ORGAN_CORAL);
		}
	};

}
