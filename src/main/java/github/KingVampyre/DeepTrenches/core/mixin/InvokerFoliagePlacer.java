package github.KingVampyre.DeepTrenches.core.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.Random;
import java.util.function.BiConsumer;

@Mixin(FoliagePlacer.class)
public interface InvokerFoliagePlacer {

    @Invoker("placeFoliageBlock")
    static void placeFoliageBlock(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, TreeFeatureConfig config, BlockPos pos) {
        throw new AssertionError();
    }

}