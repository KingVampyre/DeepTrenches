package github.KingVampyre.DeepTrenches.core.world.gen.foliage;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import github.KingVampyre.DeepTrenches.core.util.world.gen.biome.TreeFeatureHelper;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

import java.util.Random;
import java.util.function.BiConsumer;

import static github.KingVampyre.DeepTrenches.core.init.world.DTFoliagePlacerTypes.FANCY_AQUEAN_FOLIAGE_PLACER;
import static github.KingVampyre.DeepTrenches.common.world.gen.BlockStatePlacer.FOLIAGE;

public class FancyAqueanFoliagePlacer extends BlobFoliagePlacer {

    public static final Codec<FancyAqueanFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    IntProvider.createValidatingCodec(-16, 16).fieldOf("radius").forGetter(placer -> placer.radius),
                    IntProvider.createValidatingCodec(-16, 16).fieldOf("offset").forGetter(placer -> placer.offset),
                    Codec.intRange(0, 16).fieldOf("height").forGetter(placer -> placer.height))
                    .apply(instance, FancyAqueanFoliagePlacer::new));

    public FancyAqueanFoliagePlacer(IntProvider radius, IntProvider offset, int height) {
        super(radius, offset, height);
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return FANCY_AQUEAN_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
        var centerPos = treeNode.getCenter();
        var pos = centerPos.up(offset);

        for(var i = 0; i < foliageHeight; ++i)
            TreeFeatureHelper.generateRhombus(world, replacer, config, FOLIAGE, pos.up(i + 1), random, radius - i, false);

        TreeFeatureHelper.generateRhombus(world, replacer, config, FOLIAGE, pos, random, radius, true);
    }

}
