package github.KingVampyre.DeepTrenches.core.world.gen.foliage;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import github.KingVampyre.DeepTrenches.core.util.world.gen.TreeFeatureHelper;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

import java.util.Random;
import java.util.function.BiConsumer;

import static github.KingVampyre.DeepTrenches.core.init.DTFoliagePlacerTypes.PLUM_FOLIAGE_PLACER;
import static github.KingVampyre.DeepTrenches.common.world.gen.BlockStatePlacer.FOLIAGE;

public class PlumFoliagePlacer extends BlobFoliagePlacer {

    public static final Codec<PlumFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    IntProvider.createValidatingCodec(-16, 16).fieldOf("radius").forGetter(placer -> placer.radius),
                    IntProvider.createValidatingCodec(-16, 16).fieldOf("offset").forGetter(placer -> placer.offset),
                    Codec.intRange(0, 16).fieldOf("height").forGetter(placer -> placer.height))
                    .apply(instance, PlumFoliagePlacer::new));

    public PlumFoliagePlacer(IntProvider radius, IntProvider offset, int height) {
        super(radius, offset, height);
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return PLUM_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
        var centerPos = treeNode.getCenter();
        var pos = centerPos.up(offset);

        for(var i = 1; i <= radius; ++i)
            TreeFeatureHelper.generateRhombus(world, replacer, config, FOLIAGE, pos.up(i), random, radius - i + 1);

        TreeFeatureHelper.generateRhombus(world, replacer, config, FOLIAGE, pos, random, radius, true);

        for(var i = -1; i >= -radius; --i)
            TreeFeatureHelper.generateRhombus(world, replacer, config, FOLIAGE, pos.up(i), random, radius + i + 1);

    }

}
