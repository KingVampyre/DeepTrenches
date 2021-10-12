package github.KingVampyre.DeepTrenches.core.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.Random;
import java.util.function.BiConsumer;

@Mixin(TrunkPlacer.class)
public interface InvokerTrunkPlacer {

    @Invoker("trySetState")
    static void trySetState(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, BlockPos.Mutable pos, TreeFeatureConfig config) {
        throw new AssertionError();
    }

    @Invoker("setToDirt")
    static void setToDirt(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, BlockPos pos, TreeFeatureConfig config) {
        throw new AssertionError();
    }

}