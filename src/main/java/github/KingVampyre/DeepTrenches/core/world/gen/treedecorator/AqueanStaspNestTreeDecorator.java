package github.KingVampyre.DeepTrenches.core.world.gen.treedecorator;

import com.mojang.serialization.Codec;
import github.KingVampyre.DeepTrenches.common.world.gen.treedecorator.StaspNestTreeDecorator;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;

import static github.KingVampyre.DeepTrenches.core.init.world.DTTreeDecorators.AQUEAN_TREE_STASP_NEST;
import static net.minecraft.util.math.Direction.SOUTH;

public class AqueanStaspNestTreeDecorator extends StaspNestTreeDecorator {

    public static final Codec<AqueanStaspNestTreeDecorator> CODEC = Codec.floatRange(0, 1)
            .fieldOf("probability")
            .xmap(AqueanStaspNestTreeDecorator::new, decorator -> decorator.probability)
            .codec();

    public AqueanStaspNestTreeDecorator(float probability) {
        super(probability);
    }

    @Override
    protected TreeDecoratorType<?> getType() {
        return AQUEAN_TREE_STASP_NEST;
    }

    @Override
    public void generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, List<BlockPos> logPositions, List<BlockPos> leavesPositions) {

        if (!(random.nextFloat() >= this.probability)) {
            var height = this.getRandomHeight(world, random, logPositions, leavesPositions);
            var direction = this.getRandomGenerationDirection(random);

            logPositions.stream()
                    .filter(pos -> pos.getY() == height)
                    .findAny()
                    .ifPresent(pos -> {
                        var offset = pos.offset(direction);
                        var south = offset.south();

                        if (Feature.isAir(world, offset) && Feature.isAir(world, south))
                            this.placeStaspNest(world, replacer, offset, SOUTH);
                    });
        }

    }

    @Override
    protected int getRandomHeight(TestableWorld world, Random random, List<BlockPos> logPositions, List<BlockPos> leavesPositions) {
        var lastLog = logPositions.get(logPositions.size() - 1);

        return !leavesPositions.isEmpty() ? leavesPositions.get(0).getY() : lastLog.getY();
    }

}
