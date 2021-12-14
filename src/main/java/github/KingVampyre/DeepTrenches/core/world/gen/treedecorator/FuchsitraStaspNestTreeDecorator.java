package github.KingVampyre.DeepTrenches.core.world.gen.treedecorator;

import com.mojang.serialization.Codec;
import github.KingVampyre.DeepTrenches.common.world.gen.treedecorator.StaspNestTreeDecorator;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;

import static github.KingVampyre.DeepTrenches.core.init.block.DTBlocks.FUCHSITRA_LOG;
import static github.KingVampyre.DeepTrenches.core.init.block.DTBlocks.STASP_NEST;
import static github.KingVampyre.DeepTrenches.core.init.world.DTTreeDecorators.FUCHSITRA_TREE_STASP_NEST;

public class FuchsitraStaspNestTreeDecorator extends StaspNestTreeDecorator {

    public static final Codec<FuchsitraStaspNestTreeDecorator> CODEC = Codec.floatRange(0, 1)
            .fieldOf("probability")
            .xmap(FuchsitraStaspNestTreeDecorator::new, decorator -> decorator.probability)
            .codec();

    public FuchsitraStaspNestTreeDecorator(float probability) {
        super(probability);
    }

    @Override
    protected TreeDecoratorType<?> getType() {
        return FUCHSITRA_TREE_STASP_NEST;
    }

    @Override
    public void generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, List<BlockPos> logPositions, List<BlockPos> leavesPositions) {

        if (!(random.nextFloat() >= this.probability)) {
            var height = this.getRandomHeight(world, random, logPositions, leavesPositions);
            var direction = this.getRandomGenerationDirection(random);

            logPositions.stream()
                    .filter(pos -> pos.getY() < height)
                    .filter(pos -> world.testBlockState(pos.down(), state -> state.isOf(FUCHSITRA_LOG) || state.isOf(STASP_NEST)))
                    .filter(pos -> random.nextInt(5) == 0)
                    .forEach(pos -> this.placeStaspNest(world, replacer, pos, direction));
        }

    }

    @Override
    protected int getRandomHeight(TestableWorld world, Random random, List<BlockPos> logPositions, List<BlockPos> leavesPositions) {
        var firstLog = logPositions.get(0);

        return firstLog.getY() + random.nextInt(5);
    }

}
