package github.KingVampyre.DeepTrenches.core.world.gen.feature.trunk;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
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

public class FuchsitraTrunkPlacer extends TrunkPlacer {

    public static final Codec<FuchsitraTrunkPlacer> CODEC = RecordCodecBuilder.create(instance -> fillTrunkPlacerFields(instance).apply(instance, FuchsitraTrunkPlacer::new));

    public FuchsitraTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        TreeFeatureHelper.generateSquare(world, replacer, config, DIRT, startPos.down(), random, 2, false);

        var mutable = startPos.mutableCopy();

        var randomX = random.nextInt(2);
        var randomY = 2;
        var randomZ = random.nextInt(2);

        for(var y = 0; y < height; ++y) {

            if(randomY < 0) {
                randomX = random.nextInt(2);
                randomY = random.nextInt(2) + 1;
                randomZ = random.nextInt(2);
            }

            for (var x = 0; x < 2; x++) {

                for (var z = 0; z < 2; z++) {

                    if(y > 0 && randomX == x && randomZ == z) {
                        randomY--;
                        continue;
                    }

                    mutable.set(startPos, x, y, z);

                    trySetState(world, replacer, random, mutable, config);
                }

            }

        }

        return ImmutableList.of(new FoliagePlacer.TreeNode(startPos.up(height), 0, false));
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return FUCHSITRA_TRUNK_PLACER;
    }

}