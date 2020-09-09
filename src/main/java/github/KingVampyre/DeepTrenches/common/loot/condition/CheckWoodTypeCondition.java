package github.KingVampyre.DeepTrenches.common.loot.condition;

import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import github.KingVampyre.DeepTrenches.core.init.LootConditionTypes;
import github.KingVampyre.DeepTrenches.core.init.WoodType;
import net.minecraft.loot.LootTableReporter;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.LootConditionType;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.context.LootContextParameter;
import net.minecraft.util.JsonSerializer;

import java.util.Set;

import static github.KingVampyre.DeepTrenches.core.init.ModLootContextParameters.WOOD_TYPE;

public class CheckWoodTypeCondition implements LootCondition {

    private final WoodType woodType;

    public CheckWoodTypeCondition(WoodType woodType) {
        this.woodType = woodType;
    }

    @Override
    public LootConditionType getType() {
        return LootConditionTypes.CHECK_WOOD_TYPE;
    }

    @Override
    public Set<LootContextParameter<?>> getRequiredParameters() {
        return ImmutableSet.of(WOOD_TYPE);
    }

    @Override
    public boolean test(LootContext lootContext) {

        if (lootContext.hasParameter(WOOD_TYPE))
            return this.woodType == lootContext.get(WOOD_TYPE);

        return false;
    }

    @Override
    public void validate(LootTableReporter reporter) {

    }

    public static class Serializer implements JsonSerializer<CheckWoodTypeCondition> {

        @Override
        public void toJson(JsonObject json, CheckWoodTypeCondition object, JsonSerializationContext context) {
            json.addProperty("wood_type", object.woodType.getName());
        }

        @Override
        public CheckWoodTypeCondition fromJson(JsonObject json, JsonDeserializationContext context) {
            WoodType woodType = WoodType.getType(json.get("wood_type").getAsString());

            return new CheckWoodTypeCondition(woodType);
        }

    }

}
