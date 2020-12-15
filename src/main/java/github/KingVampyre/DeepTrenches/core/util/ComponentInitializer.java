package github.KingVampyre.DeepTrenches.core.util;

import dev.onyxstudios.cca.api.v3.block.BlockComponentFactoryRegistry;
import dev.onyxstudios.cca.api.v3.block.BlockComponentInitializer;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentFactoryRegistry;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentInitializer;
import github.KingVampyre.DeepTrenches.common.component.animal.TamableAnimalComponent;
import github.KingVampyre.DeepTrenches.common.component.lit.LitComponent;
import github.KingVampyre.DeepTrenches.common.component.lit.BioluminiscentComponent;
import github.KingVampyre.DeepTrenches.common.component.pollen.PollenComponent;
import github.KingVampyre.DeepTrenches.core.component.StaspPollenComponent;
import github.KingVampyre.DeepTrenches.core.entity.BettaEntity;
import github.KingVampyre.DeepTrenches.core.entity.LightLoosejawEntity;
import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Identifier;

import static github.KingVampyre.DeepTrenches.core.init.Components.*;
import static net.minecraft.item.Items.COD;

public class ComponentInitializer implements BlockComponentInitializer, EntityComponentInitializer {

    @Override
    public void registerBlockComponentFactories(BlockComponentFactoryRegistry registry) {
        registry.registerFor(new Identifier("deep_trenches:stasp_nest"), POLLEN, (state, world, pos, side) -> new PollenComponent(500));
    }

    @Override
    public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
        registry.registerFor(BettaEntity.class, ANIMAL, entity -> new TamableAnimalComponent(entity, Ingredient.ofItems(COD), Ingredient.ofItems(COD)));
        registry.registerFor(LightLoosejawEntity.class, ANIMAL, entity -> new TamableAnimalComponent(entity, Ingredient.ofItems(COD), Ingredient.ofItems(COD)));
        registry.registerFor(LightLoosejawEntity.class, LIT, entity -> new BioluminiscentComponent(LitComponent.State.ALL_UNLIT));

        registry.registerFor(StaspEntity.class, POLLEN, entity -> new StaspPollenComponent(100, 150));
    }
    
}
