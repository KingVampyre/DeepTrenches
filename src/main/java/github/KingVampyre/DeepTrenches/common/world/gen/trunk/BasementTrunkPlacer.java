package github.KingVampyre.DeepTrenches.common.world.gen.trunk;

import com.google.common.collect.ImmutableList;
import github.KingVampyre.DeepTrenches.core.util.world.gen.TreeFeatureHelper;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;

import static github.KingVampyre.DeepTrenches.common.world.gen.BlockStatePlacer.DIRT;

public abstract class BasementTrunkPlacer extends TrunkPlacer {

    protected final int basementHeight;
    protected final int basementOffsetXZ;
    protected final int basementThickness;

    public BasementTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight, int basementHeight, int basementOffsetXZ, int basementThickness) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);

        this.basementHeight = basementHeight;
        this.basementOffsetXZ = basementOffsetXZ;
        this.basementThickness = basementThickness;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        var basementPos = this.getBasementStartPos(startPos);
        var trunkPos = this.getTrunkStartPos(startPos);

        this.generateSoil(world, replacer, random, basementPos, config);

        var basementNodes = this.generateBasement(world, replacer, random, height, basementPos, config);
        var trunkNodes = this.generateTrunk(world, replacer, random, height, trunkPos, config);

        return ImmutableList.<FoliagePlacer.TreeNode>builder()
                .addAll(trunkNodes)
                .addAll(basementNodes)
                .build();
    }

    protected BlockPos getBasementStartPos(BlockPos startPos) {
        return startPos.north(this.basementOffsetXZ).west(this.basementOffsetXZ);
    }

    protected BlockPos getTrunkStartPos(BlockPos startPos) {
        return startPos.up(this.basementHeight);
    }

    protected void generateSoil(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, BlockPos basementPos, TreeFeatureConfig config) {
        TreeFeatureHelper.generateSquare(world, replacer, config, DIRT, basementPos.down(), random, this.basementThickness);
    }

    protected abstract List<FoliagePlacer.TreeNode> generateBasement(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos basementStartPos, TreeFeatureConfig config);

    protected abstract List<FoliagePlacer.TreeNode> generateTrunk(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos trunkStartPos, TreeFeatureConfig config);

}
