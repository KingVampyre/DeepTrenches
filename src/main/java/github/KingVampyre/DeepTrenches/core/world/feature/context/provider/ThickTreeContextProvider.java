package github.KingVampyre.DeepTrenches.core.world.feature.context.provider;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import github.KingVampyre.DeepTrenches.common.block.sapling.FeaturesThickSaplingGenerator;
import github.KingVampyre.DeepTrenches.core.init.ModFeatureContextProviders;
import github.Louwind.Features.context.FeatureContextBuilder;
import github.Louwind.Features.context.override.FeatureContextOverride;
import github.Louwind.Features.context.parameter.FeatureContextParameter;
import github.Louwind.Features.context.provider.FeatureContextProviderType;
import github.Louwind.Features.impl.context.provider.TreeContextProvider;
import github.Louwind.Features.pool.FeaturePool;
import github.Louwind.Features.properties.FeatureProperties;
import github.Louwind.Features.util.FeaturesJsonHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.structure.StructurePiece;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.JsonSerializer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.StructureWorldAccess;

import java.util.List;
import java.util.Random;
import java.util.Set;

import static github.Louwind.Features.impl.init.FeatureContextParameters.*;
import static github.KingVampyre.DeepTrenches.core.init.ModFeatureContextParameters.*;

public class ThickTreeContextProvider extends TreeContextProvider {

    private final Block sapling;

    public ThickTreeContextProvider(Block sapling, FeatureContextOverride[] overrides) {
        super(overrides);

        this.sapling = sapling;
    }

    @Override
    public Set<FeatureContextParameter<?>> getRequiredParameters() {
        return ImmutableSet.of(BOX, CHUNK_POS, ORIGIN, PIECES, POS, RANDOM, ROOT, ROTATION, STRUCTURE_POOL, WORLD);
    }

    @Override
    public FeatureContextBuilder getBuilder(FeaturePool pool, List<StructurePiece> pieces, BlockRotation rotation, FeatureProperties properties, StructureWorldAccess world, Random random, BlockPos origin) {
        FeatureContextBuilder builder = super.getBuilder(pool, pieces, rotation, properties, world, random, origin);

        Set<BlockPos> saplings = FeaturesThickSaplingGenerator.getSaplings(world, this.sapling, origin);
        BlockPos pos = saplings.stream().sorted().iterator().next();

        return builder.put(ORIGIN, origin).put(POS, pos).put(ROOT, saplings);
    }

    @Override
    public FeatureContextProviderType getType() {
        return ModFeatureContextProviders.THICK_TREE;
    }

    public static class Serializer implements JsonSerializer<ThickTreeContextProvider> {

        @Override
        public void toJson(JsonObject json, ThickTreeContextProvider object, JsonSerializationContext context) {

        }

        @Override
        public ThickTreeContextProvider fromJson(JsonObject json, JsonDeserializationContext context) {
            FeatureContextOverride[] overrides = FeaturesJsonHelper.getContextOverrides(json, context, "overrides");
            Block sapling = FeaturesJsonHelper.getBlock(json, "sapling");

            return new ThickTreeContextProvider(sapling, overrides);
        }

    }

}
