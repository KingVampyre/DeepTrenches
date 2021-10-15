package github.KingVampyre.DeepTrenches.common.world.gen.treedecorator;

import github.KingVampyre.DeepTrenches.core.init.DTBlocks;
import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.treedecorator.TreeDecorator;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;

import static net.minecraft.state.property.Properties.HORIZONTAL_FACING;

public abstract  class StaspNestTreeDecorator extends TreeDecorator {

    protected final float probability;

    public StaspNestTreeDecorator(float probability) {
        this.probability = probability;
    }

    protected Direction getRandomGenerationDirection(Random random) {
        return BeehiveBlock.getRandomGenerationDirection(random);
    }

    protected void placeStaspNest(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, BlockPos pos, Direction direction) {
        // TODO STASPS!
        replacer.accept(pos, DTBlocks.STASP_NEST.getDefaultState().with(HORIZONTAL_FACING, direction));
        /*
        world.getBlockEntity(blockPos2, BlockEntityType.BEEHIVE).ifPresent((blockEntity) -> {
						int i = 2 + random.nextInt(2);

						for(int j = 0; j < i; ++j) {
							NbtCompound nbtCompound = new NbtCompound();
							nbtCompound.putString("id", Registry.ENTITY_TYPE.getId(EntityType.BEE).toString());
							blockEntity.addBee(nbtCompound, random.nextInt(599), false);
						}

					});
        */
    }

    protected abstract int getRandomHeight(TestableWorld world, Random random, List<BlockPos> logPositions, List<BlockPos> leavesPositions);

}
