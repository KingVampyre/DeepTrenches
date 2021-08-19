package github.KingVampyre.DeepTrenches.core.init;

import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.chunk.*;

import static net.minecraft.util.registry.Registry.CHUNK_GENERATOR_SETTINGS_KEY;

public class DTChunkGeneratorSettings {

    public static final RegistryKey<ChunkGeneratorSettings> THE_DREAM_KEY;
    public static final ChunkGeneratorSettings THE_DREAM;

    static {
        THE_DREAM_KEY = RegistryKey.of(CHUNK_GENERATOR_SETTINGS_KEY, new Identifier("deep_trenches:the_dream"));
        THE_DREAM = new ChunkGeneratorSettings(new StructuresConfig(true), GenerationShapeConfig.create(0, 256, new NoiseSamplingConfig(0.9999999814507745D, 0.9999999814507745D, 80.0D, 160.0D), new SlideConfig(-10, 3, 0), new SlideConfig(15, 3, 0), 1, 2, 1.0D, -0.46875D, true, true, false, false), Blocks.STONE.getDefaultState(), Blocks.WATER.getDefaultState(), Integer.MIN_VALUE, 0, 63, 0, false, false, false, false, false, false);
    }

}