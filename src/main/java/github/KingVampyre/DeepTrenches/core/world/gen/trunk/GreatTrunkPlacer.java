package github.KingVampyre.DeepTrenches.core.world.gen.trunk;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
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

import static github.KingVampyre.DeepTrenches.core.init.DTTrunkPlacerTypes.GREAT_TRUNK_PLACER;

public class GreatTrunkPlacer extends LargeOakTrunkPlacer {

    public static final Codec<GreatTrunkPlacer> CODEC = RecordCodecBuilder.create((instance) -> fillTrunkPlacerFields(instance).apply(instance, GreatTrunkPlacer::new));

    public GreatTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        var mutable = new BlockPos.Mutable();
        var down = startPos.down();

        setToDirt(world, replacer, random, down, config);
        setToDirt(world, replacer, random, down.east(), config);
        setToDirt(world, replacer, random, down.south(), config);
        setToDirt(world, replacer, random, down.south().east(), config);

        for(int i = 0; i < height; ++i) {
            TrunkPlacer.trySetState(world, replacer, random, mutable.set(startPos, 0, i, 0), config);

            if (i < height - 1) {
                TrunkPlacer.trySetState(world, replacer, random, mutable.set(startPos, 1, i, 0), config);
                TrunkPlacer.trySetState(world, replacer, random, mutable.set(startPos, 1, i, 1), config);
                TrunkPlacer.trySetState(world, replacer, random, mutable.set(startPos, 0, i, 1), config);
            }

        }

        return super.generate(world, replacer, random, height, startPos, config);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return GREAT_TRUNK_PLACER;
    }

}