package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.client.particle.effect.LeakParticleEffect;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import net.minecraft.util.registry.Registry;

import static github.KingVampyre.DeepTrenches.core.init.DTFluids.*;
import static net.minecraft.util.registry.Registry.PARTICLE_TYPE;

public class DTParticleTypes {

    /* ENTITY PARTICLES */
    public static final DefaultParticleType FALLING_FUCHSITRA_POLLEN;

    /* LEAK PARTICLES */
    public static final DefaultParticleType DRIPLET_ACID;
    public static final DefaultParticleType DRIPPING_ACID;
    public static final DefaultParticleType FALLING_ACID;
    public static final DefaultParticleType LANDING_ACID;

    public static final DefaultParticleType DRIPPING_AQUEAN_SAP;
    public static final DefaultParticleType FALLING_AQUEAN_SAP;
    public static final DefaultParticleType LANDING_AQUEAN_SAP;

    /* WATER LEAK PARTICLES */
    public static final ParticleType<LeakParticleEffect> DRIPPING_WATER;
    public static final ParticleType<LeakParticleEffect> FALLING_WATER;
    public static final ParticleType<LeakParticleEffect> SPLASHING_WATER;

    /* SPELL PARTICLES */
    public static final DefaultParticleType AMBIENT_NEAR_GASEOUS_ACID;
    public static final DefaultParticleType AMBIENT_CORRODED_SKULL;

    public static final DefaultParticleType ENTITY_CORRODED_SKULL;
    public static final DefaultParticleType ENTITY_NEAR_GASEOUS_ACID;

    /* MARINE SNOW PARTICLES */
    public static final DefaultParticleType MARINE_SNOW_BIG;
    public static final DefaultParticleType MARINE_SNOW_CHUNK;
    public static final DefaultParticleType MARINE_SNOW_SMALL;

    public static final DefaultParticleType STORCEAN_MARINE_SNOW_BIG;
    public static final DefaultParticleType STORCEAN_MARINE_SNOW_CHUNK;
    public static final DefaultParticleType STORCEAN_MARINE_SNOW_SMALL;

    /* PARTICLE EFFECTS */
    public static final ParticleEffect DRIPPING_ABYSSOPELAGIC_WATER;
    public static final ParticleEffect FALLING_ABYSSOPELAGIC_WATER;
    public static final ParticleEffect SPLASHING_ABYSSOPELAGIC_WATER;

    public static final ParticleEffect DRIPPING_BATHYPELAGIC_WATER;
    public static final ParticleEffect FALLING_BATHYPELAGIC_WATER;
    public static final ParticleEffect SPLASHING_BATHYPELAGIC_WATER;

    public static final ParticleEffect DRIPPING_BRINE;
    public static final ParticleEffect FALLING_BRINE;
    public static final ParticleEffect SPLASHING_BRINE;

    public static final ParticleEffect DRIPPING_CLEAR_WATER;
    public static final ParticleEffect FALLING_CLEAR_WATER;
    public static final ParticleEffect SPLASHING_CLEAR_WATER;

    public static final ParticleEffect DRIPPING_HADOPELAGIC_WATER;
    public static final ParticleEffect FALLING_HADOPELAGIC_WATER;
    public static final ParticleEffect SPLASHING_HADOPELAGIC_WATER;

    public static final ParticleEffect DRIPPING_MESOPELAGIC_WATER;
    public static final ParticleEffect FALLING_MESOPELAGIC_WATER;
    public static final ParticleEffect SPLASHING_MESOPELAGIC_WATER;

    public static final ParticleEffect DRIPPING_STORCEAN_ABYSSOPELAGIC_WATER;
    public static final ParticleEffect FALLING_STORCEAN_ABYSSOPELAGIC_WATER;
    public static final ParticleEffect SPLASHING_STORCEAN_ABYSSOPELAGIC_WATER;

    public static final ParticleEffect DRIPPING_STORCEAN_BATHYPELAGIC_WATER;
    public static final ParticleEffect FALLING_STORCEAN_BATHYPELAGIC_WATER;
    public static final ParticleEffect SPLASHING_STORCEAN_BATHYPELAGIC_WATER;

    public static final ParticleEffect DRIPPING_STORCEAN_ENDERPELAGIC_WATER;
    public static final ParticleEffect FALLING_STORCEAN_ENDERPELAGIC_WATER;
    public static final ParticleEffect SPLASHING_STORCEAN_ENDERPELAGIC_WATER;

    public static final ParticleEffect DRIPPING_STORCEAN_GASOPELAGIC_WATER;
    public static final ParticleEffect FALLING_STORCEAN_GASOPELAGIC_WATER;
    public static final ParticleEffect SPLASHING_STORCEAN_GASOPELAGIC_WATER;

    public static final ParticleEffect DRIPPING_STORCEAN_HADOPELAGIC_WATER;
    public static final ParticleEffect FALLING_STORCEAN_HADOPELAGIC_WATER;
    public static final ParticleEffect SPLASHING_STORCEAN_HADOPELAGIC_WATER;

    public static final ParticleEffect DRIPPING_STORCEAN_INFINIPELAGIC_WATER;
    public static final ParticleEffect FALLING_STORCEAN_INFINIPELAGIC_WATER;
    public static final ParticleEffect SPLASHING_STORCEAN_INFINIPELAGIC_WATER;

    public static final ParticleEffect DRIPPING_STORCEAN_MESOPELAGIC_WATER;
    public static final ParticleEffect FALLING_STORCEAN_MESOPELAGIC_WATER;
    public static final ParticleEffect SPLASHING_STORCEAN_MESOPELAGIC_WATER;

    public static final ParticleEffect DRIPPING_STORCEAN_VIRDIPELAGIC_WATER;
    public static final ParticleEffect FALLING_STORCEAN_VIRDIPELAGIC_WATER;
    public static final ParticleEffect SPLASHING_STORCEAN_VIRDIPELAGIC_WATER;

    public static final ParticleEffect DRIPPING_STORCEAN_WATER;
    public static final ParticleEffect FALLING_STORCEAN_WATER;
    public static final ParticleEffect SPLASHING_STORCEAN_WATER;

    static {
        /* ENTITY PARTICLES */
        FALLING_FUCHSITRA_POLLEN = FabricParticleTypes.simple();

        /* LEAK PARTICLES */
        DRIPLET_ACID = FabricParticleTypes.simple();
        DRIPPING_ACID = FabricParticleTypes.simple();
        FALLING_ACID = FabricParticleTypes.simple();
        LANDING_ACID = FabricParticleTypes.simple();

        DRIPPING_AQUEAN_SAP = FabricParticleTypes.simple();
        FALLING_AQUEAN_SAP = FabricParticleTypes.simple();
        LANDING_AQUEAN_SAP = FabricParticleTypes.simple();

        /* WATER LEAK PARTICLES */
        DRIPPING_WATER = FabricParticleTypes.complex(LeakParticleEffect.PARAMETERS_FACTORY);
        FALLING_WATER = FabricParticleTypes.complex(LeakParticleEffect.PARAMETERS_FACTORY);
        SPLASHING_WATER = FabricParticleTypes.complex(LeakParticleEffect.PARAMETERS_FACTORY);

        /* SPELL PARTICLES */
        AMBIENT_NEAR_GASEOUS_ACID = FabricParticleTypes.simple();
        AMBIENT_CORRODED_SKULL = FabricParticleTypes.simple();

        ENTITY_CORRODED_SKULL = FabricParticleTypes.simple();
        ENTITY_NEAR_GASEOUS_ACID = FabricParticleTypes.simple();

        /* MARINE SNOW PARTICLES */
        MARINE_SNOW_BIG = FabricParticleTypes.simple();
        MARINE_SNOW_CHUNK = FabricParticleTypes.simple();
        MARINE_SNOW_SMALL = FabricParticleTypes.simple();

        STORCEAN_MARINE_SNOW_BIG = FabricParticleTypes.simple();
        STORCEAN_MARINE_SNOW_CHUNK = FabricParticleTypes.simple();
        STORCEAN_MARINE_SNOW_SMALL = FabricParticleTypes.simple();

        /* PARTICLE EFFECTS */
        DRIPPING_ABYSSOPELAGIC_WATER = new LeakParticleEffect(DRIPPING_WATER, ABYSSOPELAGIC_WATER, 0.145F, 0.239F, 0.470F);
        FALLING_ABYSSOPELAGIC_WATER = new LeakParticleEffect(FALLING_WATER, ABYSSOPELAGIC_WATER, 0.145F, 0.239F, 0.470F);
        SPLASHING_ABYSSOPELAGIC_WATER = new LeakParticleEffect(SPLASHING_WATER, ABYSSOPELAGIC_WATER, 0.145F, 0.239F, 0.470F);

        /* PARTICLE EFFECTS */
        DRIPPING_BATHYPELAGIC_WATER = new LeakParticleEffect(DRIPPING_WATER, BATHYPELAGIC_WATER, 0.137F, 0.313F, 0.501F);
        FALLING_BATHYPELAGIC_WATER = new LeakParticleEffect(FALLING_WATER, BATHYPELAGIC_WATER, 0.137F, 0.313F, 0.501F);
        SPLASHING_BATHYPELAGIC_WATER = new LeakParticleEffect(SPLASHING_WATER, BATHYPELAGIC_WATER, 0.137F, 0.313F, 0.501F);

        DRIPPING_BRINE = new LeakParticleEffect(DRIPPING_WATER, BRINE, 0.309F, 0.525F, 0.576F);
        FALLING_BRINE = new LeakParticleEffect(FALLING_WATER, BRINE, 0.309F, 0.525F, 0.576F);
        SPLASHING_BRINE = new LeakParticleEffect(SPLASHING_WATER, BRINE, 0.309F, 0.525F, 0.576F);

        DRIPPING_CLEAR_WATER = new LeakParticleEffect(DRIPPING_WATER, CLEAR_WATER, 0.525F, 0.729F, 0.725F);
        FALLING_CLEAR_WATER = new LeakParticleEffect(FALLING_WATER, CLEAR_WATER, 0.525F, 0.729F, 0.725F);
        SPLASHING_CLEAR_WATER = new LeakParticleEffect(SPLASHING_WATER, CLEAR_WATER, 0.525F, 0.729F, 0.725F);

        DRIPPING_HADOPELAGIC_WATER = new LeakParticleEffect(DRIPPING_WATER, HADOPELAGIC_WATER, 0.141F, 0.211F, 0.439F);
        FALLING_HADOPELAGIC_WATER = new LeakParticleEffect(FALLING_WATER, HADOPELAGIC_WATER, 0.141F, 0.211F, 0.439F);
        SPLASHING_HADOPELAGIC_WATER = new LeakParticleEffect(SPLASHING_WATER, HADOPELAGIC_WATER, 0.141F, 0.211F, 0.439F);

        DRIPPING_MESOPELAGIC_WATER = new LeakParticleEffect(DRIPPING_WATER, MESOPELAGIC_WATER, 0.176F, 0.474F, 0.509F);
        FALLING_MESOPELAGIC_WATER = new LeakParticleEffect(FALLING_WATER, MESOPELAGIC_WATER, 0.176F, 0.474F, 0.509F);
        SPLASHING_MESOPELAGIC_WATER = new LeakParticleEffect(SPLASHING_WATER, MESOPELAGIC_WATER, 0.176F, 0.474F, 0.509F);

        DRIPPING_STORCEAN_ABYSSOPELAGIC_WATER = new LeakParticleEffect(DRIPPING_WATER, STORCEAN_ABYSSOPELAGIC_WATER, 0.121F, 0.294F, 0.427F);
        FALLING_STORCEAN_ABYSSOPELAGIC_WATER = new LeakParticleEffect(FALLING_WATER, STORCEAN_ABYSSOPELAGIC_WATER, 0.121F, 0.294F, 0.427F);
        SPLASHING_STORCEAN_ABYSSOPELAGIC_WATER = new LeakParticleEffect(SPLASHING_WATER, STORCEAN_ABYSSOPELAGIC_WATER, 0.121F, 0.294F, 0.427F);

        DRIPPING_STORCEAN_BATHYPELAGIC_WATER = new LeakParticleEffect(DRIPPING_WATER, STORCEAN_BATHYPELAGIC_WATER, 0.364F, 0.635F, 0.737F);
        FALLING_STORCEAN_BATHYPELAGIC_WATER = new LeakParticleEffect(FALLING_WATER, STORCEAN_BATHYPELAGIC_WATER, 0.364F, 0.635F, 0.737F);
        SPLASHING_STORCEAN_BATHYPELAGIC_WATER = new LeakParticleEffect(SPLASHING_WATER, STORCEAN_BATHYPELAGIC_WATER, 0.364F, 0.635F, 0.737F);

        DRIPPING_STORCEAN_ENDERPELAGIC_WATER = new LeakParticleEffect(DRIPPING_WATER, STORCEAN_ENDERPELAGIC_WATER, 0.8F, 0.576F, 0.949F);
        FALLING_STORCEAN_ENDERPELAGIC_WATER = new LeakParticleEffect(FALLING_WATER, STORCEAN_ENDERPELAGIC_WATER, 0.8F, 0.576F, 0.949F);
        SPLASHING_STORCEAN_ENDERPELAGIC_WATER = new LeakParticleEffect(SPLASHING_WATER, STORCEAN_ENDERPELAGIC_WATER, 0.8F, 0.576F, 0.949F);

        DRIPPING_STORCEAN_GASOPELAGIC_WATER = new LeakParticleEffect(DRIPPING_WATER, STORCEAN_GASOPELAGIC_WATER, 1.0F, 0.749F, 0.839F);
        FALLING_STORCEAN_GASOPELAGIC_WATER = new LeakParticleEffect(FALLING_WATER, STORCEAN_GASOPELAGIC_WATER, 1.0F, 0.749F, 0.839F);
        SPLASHING_STORCEAN_GASOPELAGIC_WATER = new LeakParticleEffect(SPLASHING_WATER, STORCEAN_GASOPELAGIC_WATER, 1.0F, 0.749F, 0.839F);

        DRIPPING_STORCEAN_HADOPELAGIC_WATER = new LeakParticleEffect(DRIPPING_WATER, STORCEAN_HADOPELAGIC_WATER, 0.133F, 0.470F, 0.466F);
        FALLING_STORCEAN_HADOPELAGIC_WATER = new LeakParticleEffect(FALLING_WATER, STORCEAN_HADOPELAGIC_WATER, 0.133F, 0.470F, 0.466F);
        SPLASHING_STORCEAN_HADOPELAGIC_WATER = new LeakParticleEffect(SPLASHING_WATER, STORCEAN_HADOPELAGIC_WATER, 0.133F, 0.470F, 0.466F);

        DRIPPING_STORCEAN_INFINIPELAGIC_WATER = new LeakParticleEffect(DRIPPING_WATER, STORCEAN_INFINIPELAGIC_WATER, 0.152F, 0.552F, 0.505F);
        FALLING_STORCEAN_INFINIPELAGIC_WATER = new LeakParticleEffect(FALLING_WATER, STORCEAN_INFINIPELAGIC_WATER, 0.152F, 0.552F, 0.505F);
        SPLASHING_STORCEAN_INFINIPELAGIC_WATER = new LeakParticleEffect(SPLASHING_WATER, STORCEAN_INFINIPELAGIC_WATER, 0.152F, 0.552F, 0.505F);

        DRIPPING_STORCEAN_MESOPELAGIC_WATER = new LeakParticleEffect(DRIPPING_WATER, STORCEAN_MESOPELAGIC_WATER, 0.454F, 0.376F, 0.858F);
        FALLING_STORCEAN_MESOPELAGIC_WATER = new LeakParticleEffect(FALLING_WATER, STORCEAN_MESOPELAGIC_WATER, 0.454F, 0.376F, 0.858F);
        SPLASHING_STORCEAN_MESOPELAGIC_WATER = new LeakParticleEffect(SPLASHING_WATER, STORCEAN_MESOPELAGIC_WATER, 0.454F, 0.376F, 0.858F);

        DRIPPING_STORCEAN_VIRDIPELAGIC_WATER = new LeakParticleEffect(DRIPPING_WATER, STORCEAN_VIRDIPELAGIC_WATER, 0.266F, 0.768F, 0.486F);
        FALLING_STORCEAN_VIRDIPELAGIC_WATER = new LeakParticleEffect(FALLING_WATER, STORCEAN_VIRDIPELAGIC_WATER, 0.266F, 0.768F, 0.486F);
        SPLASHING_STORCEAN_VIRDIPELAGIC_WATER = new LeakParticleEffect(SPLASHING_WATER, STORCEAN_VIRDIPELAGIC_WATER, 0.266F, 0.768F, 0.486F);

        DRIPPING_STORCEAN_WATER = new LeakParticleEffect(DRIPPING_WATER, STORCEAN_WATER, 0.450F, 0.450F, 0.776F);
        FALLING_STORCEAN_WATER = new LeakParticleEffect(FALLING_WATER, STORCEAN_WATER, 0.450F, 0.450F, 0.776F);
        SPLASHING_STORCEAN_WATER = new LeakParticleEffect(SPLASHING_WATER, STORCEAN_WATER, 0.450F, 0.450F, 0.776F);
    }

    public static void initialize() {
        /* ENTITY PARTICLES */
        Registry.register(PARTICLE_TYPE, "deep_trenches:falling_fuchsitra_pollen", FALLING_FUCHSITRA_POLLEN);

        /* LEAK PARTICLES */
        Registry.register(PARTICLE_TYPE, "deep_trenches:driplet_acid", DRIPLET_ACID);
        Registry.register(PARTICLE_TYPE, "deep_trenches:dripping_acid", DRIPPING_ACID);
        Registry.register(PARTICLE_TYPE, "deep_trenches:falling_acid", FALLING_ACID);
        Registry.register(PARTICLE_TYPE, "deep_trenches:landing_acid", LANDING_ACID);

        Registry.register(PARTICLE_TYPE, "deep_trenches:dripping_aquean_sap", DRIPPING_AQUEAN_SAP);
        Registry.register(PARTICLE_TYPE, "deep_trenches:falling_aquean_sap", FALLING_AQUEAN_SAP);
        Registry.register(PARTICLE_TYPE, "deep_trenches:landing_aquean_sap", LANDING_AQUEAN_SAP);

        /* WATER LEAK PARTICLES */
        Registry.register(PARTICLE_TYPE, "deep_trenches:dripping_water", DRIPPING_WATER);
        Registry.register(PARTICLE_TYPE, "deep_trenches:falling_water", FALLING_WATER);
        Registry.register(PARTICLE_TYPE, "deep_trenches:splashing_water", SPLASHING_WATER);

        /* SPELL PARTICLES */
        Registry.register(PARTICLE_TYPE, "deep_trenches:ambient_near_gaseous_acid", AMBIENT_NEAR_GASEOUS_ACID);
        Registry.register(PARTICLE_TYPE, "deep_trenches:ambient_corroded_skull", AMBIENT_CORRODED_SKULL);

        Registry.register(PARTICLE_TYPE, "deep_trenches:entity_corroded_skull", ENTITY_CORRODED_SKULL);
        Registry.register(PARTICLE_TYPE, "deep_trenches:entity_near_gaseous_acid", ENTITY_NEAR_GASEOUS_ACID);

        /* MARINE SNOW PARTICLES */
        Registry.register(PARTICLE_TYPE, "deep_trenches:marine_snow_big", MARINE_SNOW_BIG);
        Registry.register(PARTICLE_TYPE, "deep_trenches:marine_snow_chunk", MARINE_SNOW_CHUNK);
        Registry.register(PARTICLE_TYPE, "deep_trenches:marine_snow_small", MARINE_SNOW_SMALL);

        Registry.register(PARTICLE_TYPE, "deep_trenches:storcean_marine_snow_big", STORCEAN_MARINE_SNOW_BIG);
        Registry.register(PARTICLE_TYPE, "deep_trenches:storcean_marine_snow_chunk", STORCEAN_MARINE_SNOW_CHUNK);
        Registry.register(PARTICLE_TYPE, "deep_trenches:storcean_marine_snow_small", STORCEAN_MARINE_SNOW_SMALL);
    }

}
