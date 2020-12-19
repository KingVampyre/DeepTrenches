package github.KingVampyre.DeepTrenches.core.util;

import dev.onyxstudios.cca.api.v3.entity.EntityComponentFactoryRegistry;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentInitializer;
import github.KingVampyre.DeepTrenches.core.component.StaspPollenComponent;
import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;

import static github.KingVampyre.DeepTrenches.core.init.Components.POLLEN;

public class ComponentInitializer implements EntityComponentInitializer {

    @Override
    public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
        registry.registerFor(StaspEntity.class, POLLEN, entity -> new StaspPollenComponent(100, 150));
    }
    
}
