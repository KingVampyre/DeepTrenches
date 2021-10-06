package github.KingVampyre.DeepTrenches.core.world.gen.foliage;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

import java.util.Random;
import java.util.function.BiConsumer;

import static github.KingVampyre.DeepTrenches.core.init.DTFoliagePlacerTypes.PLUM_FOLIAGE_PLACER;

public class PlumFoliagePlacer extends FoliagePlacer {

    public static final Codec<PlumFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    IntProvider.createValidatingCodec(-16, 16).fieldOf("radius").forGetter(placer -> placer.radius),
                    IntProvider.createValidatingCodec(-16, 16).fieldOf("offset").forGetter(placer -> placer.offset),
                    Codec.intRange(0, 16).fieldOf("height").forGetter(placer -> placer.height))
                    .apply(instance, PlumFoliagePlacer::new));

    protected final int height;

    public PlumFoliagePlacer(IntProvider radius, IntProvider offset, int height) {
        super(radius, offset);

        this.height = height;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return PLUM_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
        var center = treeNode.getCenter();
        var giantTrunk = treeNode.isGiantTrunk();

        for(var i = -1; i >= -radius; --i)
            this.generateRhombus(world, replacer, random, config, center, radius + i + 1, i + offset, giantTrunk);

        this.generateSquare(world, replacer, random, config, center, radius, offset, giantTrunk);

        for(var i = 1; i <= radius; ++i)
            this.generateRhombus(world, replacer, random, config, center, radius - i + 1, i + offset, giantTrunk);
    }

    protected void generateRhombus(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, TreeFeatureConfig config, BlockPos centerPos, int radius, int y, boolean giantTrunk) {
        this.generateRhombus(world, replacer, random, config, centerPos, radius, y, giantTrunk, false);
    }

    protected void generateRhombus(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, TreeFeatureConfig config, BlockPos centerPos, int radius, int y, boolean giantTrunk, boolean round) {
        var mutable = new BlockPos.Mutable();
        var roundOffset = round ? 1 : 0;
        var i = giantTrunk ? 1 : 0;

        for(var x = -radius; x <= radius + i; ++x) {
            var range = Math.abs(Math.abs(x) - radius - roundOffset);

            for(var z = -radius; z <= radius + i; ++z) {

                if(x == 0 || z <= range && z >= -range)
                    if (!this.isPositionInvalid(random, x, y, z, radius, giantTrunk)) {
                        mutable.set(centerPos, x, y, z);
                        placeFoliageBlock(world, replacer, random, config, mutable);
                    }

            }

        }

    }

    @Override
    protected void generateSquare(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, TreeFeatureConfig config, BlockPos centerPos, int radius, int y, boolean giantTrunk) {
        this.generateRhombus(world, replacer, random, config, centerPos, radius, y, giantTrunk, true);
    }

    @Override
    public int getRandomHeight(Random random, int trunkHeight, TreeFeatureConfig config) {
        return this.height;
    }

    @Override
    protected boolean isInvalidForLeaves(Random random, int dx, int y, int dz, int radius, boolean giantTrunk) {
        return false;
    }

}
