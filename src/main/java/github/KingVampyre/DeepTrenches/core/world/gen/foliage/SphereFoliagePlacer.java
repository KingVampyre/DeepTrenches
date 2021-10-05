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

import static github.KingVampyre.DeepTrenches.core.init.DTFoliagePlacerTypes.SPHERE_FOLIAGE_PLACER;

public class SphereFoliagePlacer extends FoliagePlacer {

    public static final Codec<SphereFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    IntProvider.createValidatingCodec(-16, 16).fieldOf("radius").forGetter(placer -> placer.radius),
                    IntProvider.createValidatingCodec(-16, 16).fieldOf("offset").forGetter(placer -> placer.offset),
                    Codec.intRange(0, 16).fieldOf("height").forGetter(placer -> placer.height))
                    .apply(instance, SphereFoliagePlacer::new));

    protected final int height;

    public SphereFoliagePlacer(IntProvider radius, IntProvider offset, int height) {
        super(radius, offset);

        this.height = height;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return SPHERE_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
        var center = treeNode.getCenter();
        var giantTrunk = treeNode.isGiantTrunk();

        for(var i = -1; i >= -radius; --i)
            this.generateSquare(world, replacer, random, config, center, radius + i + 1, i + offset, giantTrunk);

        this.generateSquare(world, replacer, random, config, center, radius, offset, giantTrunk);

        for(var i = 1; i <= radius; ++i)
            this.generateSquare(world, replacer, random, config, center, radius - i + 1, i + offset, giantTrunk);
    }

    @Override
    public int getRandomHeight(Random random, int trunkHeight, TreeFeatureConfig config) {
        return this.height;
    }

    @Override
    protected boolean isInvalidForLeaves(Random random, int dx, int y, int dz, int radius, boolean giantTrunk) {

        if(dx == radius && dz == radius)
            return true;

        var absY = Math.abs(y);

        if(y != 0 && absY != radius)
            return (dx == radius && dz > 0) || (dz == radius && dx > 0);

        return false;
    }

}
