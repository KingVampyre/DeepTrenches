package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.common.loot.condition.CheckWoodTypeCondition;
import net.minecraft.loot.condition.LootConditionType;

public class LootConditionTypes {

    public static final LootConditionType CHECK_WOOD_TYPE = new LootConditionType(new CheckWoodTypeCondition.Serializer());
    
}
