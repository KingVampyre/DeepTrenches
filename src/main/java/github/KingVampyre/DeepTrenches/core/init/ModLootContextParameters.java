package github.KingVampyre.DeepTrenches.core.init;

import net.minecraft.loot.context.LootContextParameter;
import net.minecraft.util.Identifier;

public class ModLootContextParameters {

	public static final LootContextParameter<WoodType> WOOD_TYPE = new LootContextParameter<>(new Identifier("deep_trenches:wood_type"));

}
