package github.KingVampyre.DeepTrenches.core.util;

import dev.onyxstudios.cca.api.v3.block.BlockComponentFactoryRegistry;
import dev.onyxstudios.cca.api.v3.block.BlockComponentInitializer;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentFactoryRegistry;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentInitializer;
import github.KingVampyre.DeepTrenches.common.component.pollen.PollenComponent;
import github.KingVampyre.DeepTrenches.core.component.StaspPollenComponent;
import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import github.KingVampyre.DeepTrenches.core.init.Components;
import net.minecraft.util.Identifier;

public class ComponentInitializer implements BlockComponentInitializer, EntityComponentInitializer {

    @Override
    public void registerBlockComponentFactories(BlockComponentFactoryRegistry registry) {
        registry.registerFor(new Identifier("deep_trenches:stasp_nest"), Components.POLLEN, (state, world, pos, side) -> new PollenComponent(500));
    }

    @Override
    public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
        registry.registerFor(StaspEntity.class, Components.POLLEN, entity -> new StaspPollenComponent(100, 150));
    }
    
}
