package github.KingVampyre.DeepTrenches.client.init;

import github.KingVampyre.DeepTrenches.client.particle.MarineSnowParticle;
import github.KingVampyre.DeepTrenches.client.particle.factory.*;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.SpellParticle;

import static github.KingVampyre.DeepTrenches.core.init.DTParticleTypes.*;

public class DTParticleFactories {

    public static void initialize() {
        var instance = ParticleFactoryRegistry.getInstance();

        instance.register(FALLING_FUCHSITRA_POLLEN, FallingFuchsitraPollenFactory::new);

        instance.register(DRIPLET_ACID, DrippingAcidFactory::new);
        instance.register(DRIPPING_ACID, DrippingAcidFactory::new);
        instance.register(FALLING_ACID, DrippingAcidFactory.Falling::new);
        instance.register(LANDING_ACID, DrippingAcidFactory.Landing::new);

        instance.register(DRIPPING_AQUEAN_SAP, DrippingAqueanSapFactory::new);
        instance.register(FALLING_AQUEAN_SAP, DrippingAqueanSapFactory.Falling::new);
        instance.register(LANDING_AQUEAN_SAP, DrippingAqueanSapFactory.Landing::new);

        instance.register(DRIPPING_WATER, DrippingWaterFactory::new);
        instance.register(FALLING_WATER, DrippingWaterFactory.Falling::new);
        instance.register(SPLASHING_WATER, DrippingWaterFactory.SplashingFactory::new);

        instance.register(AMBIENT_CORRODED_SKULL, AmbientEntitySpellParticleFactory::new);
        instance.register(AMBIENT_NEAR_GASEOUS_ACID, AmbientEntitySpellParticleFactory::new);

        instance.register(ENTITY_CORRODED_SKULL, SpellParticle.DefaultFactory::new);
        instance.register(ENTITY_NEAR_GASEOUS_ACID, SpellParticle.DefaultFactory::new);

        instance.register(MARINE_SNOW_BIG, MarineSnowParticle.Factory::new);
        instance.register(MARINE_SNOW_CHUNK, MarineSnowParticle.Factory::new);
        instance.register(MARINE_SNOW_SMALL, MarineSnowParticle.Factory::new);

        instance.register(STORCEAN_MARINE_SNOW_BIG, MarineSnowParticle.Factory::new);
        instance.register(STORCEAN_MARINE_SNOW_CHUNK, MarineSnowParticle.Factory::new);
        instance.register(STORCEAN_MARINE_SNOW_SMALL, MarineSnowParticle.Factory::new);
    }

}
