package github.KingVampyre.DeepTrenches.core.world.gen.feature.trunk;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import github.KingVampyre.DeepTrenches.core.util.world.gen.feature.TreeFeatureHelper;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;

import static github.KingVampyre.DeepTrenches.core.init.DTTrunkPlacerTypes.GREAT_TRUNK_PLACER;
import static github.KingVampyre.DeepTrenches.core.util.world.gen.feature.BlockStatePlacer.DIRT;
import static github.KingVampyre.DeepTrenches.core.util.world.gen.feature.BlockStatePlacer.TRUNK;

public class GreatTrunkPlacer extends LargeOakTrunkPlacer {

    public static final Codec<GreatTrunkPlacer> CODEC = RecordCodecBuilder.create(instance -> fillTrunkPlacerFields(instance).apply(instance, GreatTrunkPlacer::new));

    public GreatTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        TreeFeatureHelper.generateSquare(world, replacer, config, DIRT, startPos.down(), random, 2);

        for(var y = 0; y < height; ++y)
            TreeFeatureHelper.generateSquare(world, replacer, config, TRUNK, startPos.up(y), random, 2);

        return super.generate(world, replacer, random, height, startPos, config);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return GREAT_TRUNK_PLACER;
    }

}