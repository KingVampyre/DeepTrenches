package github.KingVampyre.DeepTrenches.core.world.gen.trunk;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import github.KingVampyre.DeepTrenches.core.init.TrunkPlacerTypes;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;

public class GreatTrunkPlacer extends LargeOakTrunkPlacer {

    public static final Codec<GreatTrunkPlacer> CODEC = RecordCodecBuilder.create((instance) -> fillTrunkPlacerFields(instance).apply(instance, GreatTrunkPlacer::new));

    public GreatTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        List<FoliagePlacer.TreeNode> nodes = super.generate(world, replacer, random, height, startPos, config);

        BlockPos.Mutable mutable = new BlockPos.Mutable();
        BlockPos down = startPos.down();

        setToDirt(world, replacer, random, down, config);
        setToDirt(world, replacer, random, down.east(), config);
        setToDirt(world, replacer, random, down.south(), config);
        setToDirt(world, replacer, random, down.south().east(), config);

        for(int i = 0; i < height; ++i) {
            setLog(world, replacer, random, mutable, config, startPos, 0, i, 0);

            if (i < height - 1) {
                setLog(world, replacer, random, mutable, config, startPos, 1, i, 0);
                setLog(world, replacer, random, mutable, config, startPos, 1, i, 1);
                setLog(world, replacer, random, mutable, config, startPos, 0, i, 1);
            }

        }

        nodes.add(new FoliagePlacer.TreeNode(startPos.up(height), 0, true));

        return ImmutableList.copyOf(nodes);
    }

    protected static void setLog(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, BlockPos.Mutable pos, TreeFeatureConfig config, BlockPos startPos, int x, int y, int z) {
        TrunkPlacer.trySetState(world, replacer, random, pos.set(startPos, x, y, z), config);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return TrunkPlacerTypes.GREAT_TRUNK_PLACER;
    }

}