package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.particle.ColoredWaterFluidParticleEffect;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleType;
import net.minecraft.util.registry.Registry;

import static net.minecraft.util.registry.Registry.PARTICLE_TYPE;

public class ParticleTypes {

    public static final DefaultParticleType ACID_DRIPLET = Registry.register(PARTICLE_TYPE, "deep_trenches:acid_driplet", FabricParticleTypes.simple());
    public static final DefaultParticleType ACID_DRIPPING = Registry.register(PARTICLE_TYPE, "deep_trenches:acid_dripping", FabricParticleTypes.simple());
    public static final DefaultParticleType ACID_FALLING = Registry.register(PARTICLE_TYPE, "deep_trenches:acid_falling", FabricParticleTypes.simple());
    public static final DefaultParticleType ACID_LANDING = Registry.register(PARTICLE_TYPE, "deep_trenches:acid_landing", FabricParticleTypes.simple());

    public static final ParticleType<ColoredWaterFluidParticleEffect> DRIPPING_COLORED_WATER = Registry.register(PARTICLE_TYPE, "deep_trenches:colored_water_dripping", FabricParticleTypes.complex(ColoredWaterFluidParticleEffect.PARAMETERS_FACTORY));
    public static final ParticleType<ColoredWaterFluidParticleEffect> FALLING_COLORED_WATER = Registry.register(PARTICLE_TYPE, "deep_trenches:colored_water_falling", FabricParticleTypes.complex(ColoredWaterFluidParticleEffect.PARAMETERS_FACTORY));

    public static final DefaultParticleType AMBIENT_NEAR_GASEOUS_ACID = Registry.register(PARTICLE_TYPE, "deep_trenches:ambient_near_gaseous_acid", FabricParticleTypes.simple());
    public static final DefaultParticleType AMBIENT_CORRODED_SKULL = Registry.register(PARTICLE_TYPE, "deep_trenches:ambient_corroded_skull", FabricParticleTypes.simple());

    public static final DefaultParticleType ENTITY_CORRODED_SKULL = Registry.register(PARTICLE_TYPE, "deep_trenches:entity_corroded_skull", FabricParticleTypes.simple());
    public static final DefaultParticleType ENTITY_NEAR_GASEOUS_ACID = Registry.register(PARTICLE_TYPE, "deep_trenches:entity_near_gaseous_acid", FabricParticleTypes.simple());

    public static final DefaultParticleType MARINE_SNOW_BIG = Registry.register(PARTICLE_TYPE, "deep_trenches:marine_snow_big", FabricParticleTypes.simple());
    public static final DefaultParticleType MARINE_SNOW_CHUNK = Registry.register(PARTICLE_TYPE, "deep_trenches:marine_snow_chunk", FabricParticleTypes.simple());
    public static final DefaultParticleType MARINE_SNOW_SMALL = Registry.register(PARTICLE_TYPE, "deep_trenches:marine_snow_small", FabricParticleTypes.simple());

    public static final DefaultParticleType STORCEAN_MARINE_SNOW_BIG = Registry.register(PARTICLE_TYPE, "deep_trenches:storcean_marine_snow_big", FabricParticleTypes.simple());
    public static final DefaultParticleType STORCEAN_MARINE_SNOW_CHUNK = Registry.register(PARTICLE_TYPE, "deep_trenches:storcean_marine_snow_chunk", FabricParticleTypes.simple());
    public static final DefaultParticleType STORCEAN_MARINE_SNOW_SMALL = Registry.register(PARTICLE_TYPE, "deep_trenches:storcean_marine_snow_small", FabricParticleTypes.simple());

}
