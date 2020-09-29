package github.KingVampyre.DeepTrenches.core.world.feature.function;

import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import github.KingVampyre.DeepTrenches.core.util.OptionalBlockPos;
import github.Louwind.Features.condition.FeatureCondition;
import github.Louwind.Features.context.FeatureContext;
import github.Louwind.Features.context.parameter.FeatureContextParameter;
import github.Louwind.Features.context.parameter.OptionalContextParameter;
import github.Louwind.Features.function.FeatureFunction;
import github.Louwind.Features.function.FeatureFunctionType;
import github.Louwind.Features.impl.init.FeatureContextParameters;
import github.Louwind.Features.util.FeaturesJsonHelper;
import net.minecraft.structure.PoolStructurePiece;
import net.minecraft.structure.StructurePiece;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.JsonSerializer;
import net.minecraft.util.math.BlockPos;
import sun.jvm.hotspot.opto.Block;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static github.KingVampyre.DeepTrenches.core.init.ModFeatureFunctions.PIVOT;

public class PivotFunction implements FeatureFunction {

    private final List<FeatureCondition> conditions;
    private final OptionalBlockPos pos;
    private final Map<BlockRotation, OptionalBlockPos> when;

    public PivotFunction(OptionalBlockPos pos, Map<BlockRotation, OptionalBlockPos> when, FeatureCondition[] conditions) {
        this.conditions = Arrays.asList(conditions);
        this.pos = pos;
        this.when = when;
    }

    @Override
    public FeatureFunctionType getType() {
        return PIVOT;
    }

    @Override
    public List<FeatureCondition> getConditions() {
        return this.conditions;
    }

    @Override
    public PoolStructurePiece apply(PoolStructurePiece poolStructurePiece, FeatureContext context) {
        List<StructurePiece> pieces = context.get(FeatureContextParameters.PIECES);
        BlockRotation rotation = context.get(FeatureContextParameters.ROTATION);

        OptionalBlockPos optional = this.when.get(rotation);

        BlockPos addition = optional.isPresent() ? optional.get(context) : BlockPos.ORIGIN;

        BlockPos pos = this.pos.get(context);
        BlockPos add = pos.add(addition);

        int x = add.getX();
        int y = add.getY();
        int z = add.getZ();

        for(StructurePiece piece : pieces)
            piece.translate(x, y, z);

        return poolStructurePiece;
    }

    public static class Serializer implements JsonSerializer<PivotFunction> {

        @Override
        public void toJson(JsonObject json, PivotFunction object, JsonSerializationContext context) {

        }

        @Override
        public PivotFunction fromJson(JsonObject json, JsonDeserializationContext context) {
            JsonObject object = json.getAsJsonObject("when");

            Map<BlockRotation, OptionalBlockPos> when = Maps.newEnumMap(BlockRotation.class);

            when.put(BlockRotation.NONE, this.getOptionalBlockPos(object, "none"));
            when.put(BlockRotation.CLOCKWISE_90, this.getOptionalBlockPos(object, "clockwise_90"));
            when.put(BlockRotation.CLOCKWISE_180, this.getOptionalBlockPos(object, "clockwise_180"));
            when.put(BlockRotation.COUNTERCLOCKWISE_90, this.getOptionalBlockPos(object, "counterclockwise_90"));

            FeatureCondition[] conditions = FeaturesJsonHelper.getConditions(json, context, "conditions");

            OptionalBlockPos pos = this.getOptionalBlockPos(object, "all");

            return new PivotFunction(pos, when, conditions);
        }

        private OptionalBlockPos getOptionalBlockPos(JsonObject object, String name) {

            if(object.has(name)) {
                JsonElement element = object.get(name);

                if(element.isJsonObject()) {
                    JsonObject pos = element.getAsJsonObject();

                    if(pos.has("parameter")) {
                        FeatureContextParameter<BlockPos> parameter = FeaturesJsonHelper.getContextParameter(pos, "parameter");
                        OptionalContextParameter<BlockPos> optional = OptionalContextParameter.of(parameter);

                        return OptionalBlockPos.of(optional);
                    }

                    if(pos.has("x") || pos.has("y") || pos.has("z")) {
                        OptionalContextParameter<Integer> x = FeaturesJsonHelper.getOptionalContextParameter(pos, "x", JsonElement::getAsInt);
                        OptionalContextParameter<Integer> y = FeaturesJsonHelper.getOptionalContextParameter(pos, "y", JsonElement::getAsInt);
                        OptionalContextParameter<Integer> z = FeaturesJsonHelper.getOptionalContextParameter(pos, "z", JsonElement::getAsInt);

                        return OptionalBlockPos.of(x, y, z);
                    }

                }

            }

            return OptionalBlockPos.empty();
        }

    }

}
