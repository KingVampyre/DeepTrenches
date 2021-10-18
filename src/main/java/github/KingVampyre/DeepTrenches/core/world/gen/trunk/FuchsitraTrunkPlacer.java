package github.KingVampyre.DeepTrenches.core.world.gen.trunk;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import github.KingVampyre.DeepTrenches.common.world.gen.trunk.BasementTrunkPlacer;
import github.KingVampyre.DeepTrenches.core.util.math.BlockPosHelper;
import github.KingVampyre.DeepTrenches.core.util.serialization.CodecHelper;
import github.KingVampyre.DeepTrenches.common.world.gen.PositionPredicate;
import github.KingVampyre.DeepTrenches.core.util.world.gen.TreeFeatureHelper;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;

import static github.KingVampyre.DeepTrenches.core.init.DTTrunkPlacerTypes.FUCHSITRA_TRUNK_PLACER;
import static github.KingVampyre.DeepTrenches.common.world.gen.BlockStatePlacer.DIRT;
import static github.KingVampyre.DeepTrenches.common.world.gen.BlockStatePlacer.TRUNK;
import static github.KingVampyre.DeepTrenches.common.world.gen.PositionPredicate.*;

public class FuchsitraTrunkPlacer extends BasementTrunkPlacer {

    public static final Codec<FuchsitraTrunkPlacer> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    Codec.intRange(0, 32).fieldOf("base_height").forGetter(placer -> placer.baseHeight),
                    Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter(placer -> placer.firstRandomHeight),
                    Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter(placer -> placer.secondRandomHeight),
                    Codec.intRange(0, 16).fieldOf("basement_height").forGetter(placer -> placer.basementHeight),
                    Codec.intRange(0, 16).fieldOf("basement_offset_xz").forGetter(placer -> placer.basementOffsetXZ),
                    Codec.intRange(0, 16).fieldOf("basement_thickness").forGetter(placer -> placer.basementThickness),
                    Codec.intRange(0, 16).fieldOf("trunk_thickness").forGetter(placer -> placer.trunkThickness),
                    CodecHelper.horizontalAxis().fieldOf("axis").forGetter(placer -> placer.axis)
                    ).apply(instance, FuchsitraTrunkPlacer::new));

    private final Direction.Axis axis;
    private final int trunkThickness;

    public FuchsitraTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight, int basementHeight, int basementOffsetXZ, int basementThickness, int trunkThickness, Direction.Axis axis) {
        super(baseHeight, firstRandomHeight, secondRandomHeight, basementHeight, basementOffsetXZ, basementThickness);

        this.axis = axis;
        this.trunkThickness = trunkThickness;
    }

    @Override
    protected void generateSoil(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, BlockPos basementPos, TreeFeatureConfig config) {
        TreeFeatureHelper.generateSquare(world, replacer, config, DIRT, NOT_CORNER, basementPos.down(), random, this.basementThickness);
    }

    @Override
    protected List<FoliagePlacer.TreeNode> generateBasement(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos basementStartPos, TreeFeatureConfig config) {
        var basementPredicate = random.nextBoolean() ? CLOCKWISE_SUN : COUNTERCLOCKWISE_SUN;

        for (var y = 0; y < this.basementHeight; y++) {
            var pos = basementStartPos.up(y);

            if(this.basementHeight / 2 > y)
                TreeFeatureHelper.generateSquare(world, replacer, config, TRUNK, NOT_CORNER, pos, random, this.basementThickness);
            else
                TreeFeatureHelper.generateSquare(world, replacer, config, TRUNK, basementPredicate, pos, random, this.basementThickness);

        }

        return ImmutableList.of();
    }

    @Override
    protected List<FoliagePlacer.TreeNode> generateTrunk(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos trunkStartPos, TreeFeatureConfig config) {
        var randomPos = BlockPosHelper.nextMutable(random, this.trunkThickness, this.trunkThickness + 1, 0, this.trunkThickness);

        for(var y = 0; y < height; ++y) {
            var trunkPos = trunkStartPos.up(y);

            if(y > 0 && randomPos.getY() < 0)
                randomPos = BlockPosHelper.nextMutable(random, randomPos, this.trunkThickness, this.trunkThickness + 1, 0, this.trunkThickness);

            if(y > 0 && randomPos.getY() > 0)
                TreeFeatureHelper.generateSquare(world, replacer, config, TRUNK, PositionPredicate.ignore(randomPos), trunkPos, random, this.trunkThickness);
            else
               TreeFeatureHelper.generateSquare(world, replacer, config, TRUNK, trunkPos, random, this.trunkThickness);

            if(y > 0 && randomPos.getY() >= 0)
                randomPos.move(0, -1, 0);
        }

        return ImmutableList.of(new FoliagePlacer.TreeNode(trunkStartPos.up(height), 0, false));
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return FUCHSITRA_TRUNK_PLACER;
    }

}