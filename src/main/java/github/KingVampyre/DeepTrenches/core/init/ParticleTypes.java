package github.KingVampyre.DeepTrenches.core.init;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.registry.Registry;

import static net.minecraft.util.registry.Registry.PARTICLE_TYPE;

public class ParticleTypes {

    public static final DefaultParticleType AMBIENT_CORRODED_SKULL = Registry.register(PARTICLE_TYPE, "deep_trenches:ambient_corroded_skull", FabricParticleTypes.simple());

    public static final DefaultParticleType ENTITY_CORRODED_SKULL = Registry.register(PARTICLE_TYPE, "deep_trenches:entity_corroded_skull", FabricParticleTypes.simple());

}
