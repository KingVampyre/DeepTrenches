package github.KingVampyre.DeepTrenches.core.world.gen.foliage;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import github.KingVampyre.DeepTrenches.core.util.world.gen.feature.TreeFeatureHelper;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

import java.util.Random;
import java.util.function.BiConsumer;

import static github.KingVampyre.DeepTrenches.core.init.DTFoliagePlacerTypes.GREAT_AQUEAN_FOLIAGE_PLACER;
import static github.KingVampyre.DeepTrenches.core.util.world.gen.feature.FoliagePositionPredicate.NOT_CORNER;

public class GreatAqueanFoliagePlacer extends BlobFoliagePlacer {

    public static final Codec<GreatAqueanFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    IntProvider.createValidatingCodec(-16, 16).fieldOf("radius").forGetter(placer -> placer.radius),
                    IntProvider.createValidatingCodec(-16, 16).fieldOf("offset").forGetter(placer -> placer.offset),
                    Codec.intRange(0, 16).fieldOf("height").forGetter(placer -> placer.height))
                    .apply(instance, GreatAqueanFoliagePlacer::new));

    public GreatAqueanFoliagePlacer(IntProvider radius, IntProvider offset, int height) {
        super(radius, offset, height);
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return GREAT_AQUEAN_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
        var centerPos = treeNode.getCenter();
        var giantTrunk = treeNode.isGiantTrunk();

        var quarter = MathHelper.ceilDiv(radius, 2);

        for(var i = 1; i <= radius; ++i) {
            var ceil = i > quarter ? MathHelper.ceilDiv(radius, i - 1) : radius;

            TreeFeatureHelper.generateRhombus(world, replacer, random, config, centerPos, ceil, i + offset, giantTrunk, i < quarter);
        }

        TreeFeatureHelper.generateSquare(world, replacer, random, config, centerPos, NOT_CORNER, radius, offset, giantTrunk);

        for(var i = -1; i >= -radius; --i) {
            var ceil = i < -quarter ? MathHelper.ceilDiv(radius, -i - 1) : radius;

            TreeFeatureHelper.generateRhombus(world, replacer, random, config, centerPos, ceil, i + offset, giantTrunk, i > -quarter);
        }

    }

}
