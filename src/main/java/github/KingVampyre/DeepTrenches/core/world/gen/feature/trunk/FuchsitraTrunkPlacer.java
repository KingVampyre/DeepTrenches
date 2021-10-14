package github.KingVampyre.DeepTrenches.core.world.gen.feature.trunk;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import github.KingVampyre.DeepTrenches.core.util.world.gen.feature.PositionPredicate;
import github.KingVampyre.DeepTrenches.core.util.world.gen.feature.TreeFeatureHelper;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;

import static github.KingVampyre.DeepTrenches.core.init.DTTrunkPlacerTypes.FUCHSITRA_TRUNK_PLACER;
import static github.KingVampyre.DeepTrenches.core.util.world.gen.feature.BlockStatePlacer.DIRT;
import static github.KingVampyre.DeepTrenches.core.util.world.gen.feature.BlockStatePlacer.TRUNK;
import static github.KingVampyre.DeepTrenches.core.util.world.gen.feature.PositionPredicate.*;

public class FuchsitraTrunkPlacer extends TrunkPlacer {

    public static final Codec<FuchsitraTrunkPlacer> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    Codec.intRange(0, 32).fieldOf("base_height").forGetter(placer -> placer.baseHeight),
                    Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter(placer -> placer.firstRandomHeight),
                    Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter(placer -> placer.secondRandomHeight),
                    Codec.intRange(0, 16).fieldOf("basement_height").forGetter(placer -> placer.basementHeight),
                    Codec.intRange(0, 16).fieldOf("basement_offset_xz").forGetter(placer -> placer.basementOffsetXZ),
                    Codec.intRange(0, 16).fieldOf("basement_thickness").forGetter(placer -> placer.basementThickness),
                    Codec.intRange(0, 16).fieldOf("trunk_thickness").forGetter(placer -> placer.trunkThickness)
                    ).apply(instance, FuchsitraTrunkPlacer::new));

    private final int basementHeight;
    private final int basementOffsetXZ;
    private final int basementThickness;
    private final int trunkThickness;

    public FuchsitraTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight, int basementHeight, int basementOffsetXZ, int basementThickness, int trunkThickness) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);

        this.basementHeight = basementHeight;
        this.basementOffsetXZ = basementOffsetXZ;
        this.basementThickness = basementThickness;
        this.trunkThickness = trunkThickness;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        var basementPos = startPos.north(this.basementOffsetXZ).west(basementOffsetXZ);
        var basementPredicate = random.nextBoolean() ? CLOCKWISE_SUN : COUNTERCLOCKWISE_SUN;

        for (var y = 0; y < this.basementHeight; y++)
             TreeFeatureHelper.generateSquare(world, replacer, config, TRUNK, this.basementHeight / 2 > y ? NOT_CORNER : basementPredicate, basementPos.up(y), random, this.basementThickness);

        TreeFeatureHelper.generateSquare(world, replacer, config, DIRT, NOT_CORNER, basementPos.down(), random, this.basementThickness);

        var randomDx = random.nextInt(this.trunkThickness);
        var randomDy = random.nextInt(this.trunkThickness) + 1;
        var randomDz = random.nextInt(this.trunkThickness);
        var prevDx = -1;
        var prevDz = -1;

        for(var y = 0; y < height; ++y) {
            var pos = startPos.up(y + this.basementHeight);

            if(y > 0) {
                if(randomDy < 0) {
                    prevDx = randomDx;
                    prevDz = randomDz;

                    do {
                        randomDx = random.nextInt(this.trunkThickness);
                        randomDy = random.nextInt(this.trunkThickness) + 2 * this.trunkThickness;
                        randomDz = random.nextInt(this.trunkThickness);
                    } while (randomDx == prevDx && randomDz == prevDz);
                }

                var predicate = randomDy != 0 ? PositionPredicate.ignore(randomDx, randomDz) : ALWAYS_TRUE;

                TreeFeatureHelper.generateSquare(world, replacer, config, TRUNK, predicate, pos, random, this.trunkThickness);
                randomDy--;
            } else
                TreeFeatureHelper.generateSquare(world, replacer, config, TRUNK, pos, random, this.trunkThickness);

        }

        return ImmutableList.of(new FoliagePlacer.TreeNode(startPos.up(height + this.basementHeight), 0, false));
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return FUCHSITRA_TRUNK_PLACER;
    }

}