package github.KingVampyre.DeepTrenches.core.world.gen.foliage;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import github.KingVampyre.DeepTrenches.core.util.serialization.CodecHelper;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

import java.util.Random;
import java.util.function.BiConsumer;

import static github.KingVampyre.DeepTrenches.core.init.world.DTFoliagePlacerTypes.FUCHSITRA_FOLIAGE_PLACER;

public class FuchsitraFoliagePlacer extends BlobFoliagePlacer {

    public static final Codec<FuchsitraFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    IntProvider.createValidatingCodec(-16, 16).fieldOf("radius").forGetter(placer -> placer.radius),
                    IntProvider.createValidatingCodec(-16, 16).fieldOf("offset").forGetter(placer -> placer.offset),
                    CodecHelper.horizontalAxis().fieldOf("axis").forGetter(placer -> placer.axis),
                    Codec.intRange(0, 16).fieldOf("height").forGetter(placer -> placer.height)
                    ).apply(instance, FuchsitraFoliagePlacer::new));

    protected final Direction.Axis axis;

    public FuchsitraFoliagePlacer(IntProvider radius, IntProvider offset, Direction.Axis axis, int height) {
        super(radius, offset, height);

        this.axis = axis;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return FUCHSITRA_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {

    }

}
