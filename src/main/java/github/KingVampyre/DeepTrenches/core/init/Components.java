package github.KingVampyre.DeepTrenches.core.init;

import dev.onyxstudios.cca.api.v3.component.ComponentKey;
import dev.onyxstudios.cca.api.v3.component.ComponentRegistryV3;
import github.KingVampyre.DeepTrenches.common.component.animal.AnimalComponent;
import github.KingVampyre.DeepTrenches.common.component.animal.SchoolingComponent;
import github.KingVampyre.DeepTrenches.common.component.animal.TamableComponent;
import github.KingVampyre.DeepTrenches.common.component.pollen.IPollenComponent;
import net.minecraft.util.Identifier;

public class Components {

    public static final ComponentKey<AnimalComponent> ANIMAL = ComponentRegistryV3.INSTANCE.getOrCreate(new Identifier("deep_trenches:animal"), AnimalComponent.class);

    public static final ComponentKey<IPollenComponent> POLLEN = ComponentRegistryV3.INSTANCE.getOrCreate(new Identifier("deep_trenches:pollen"), IPollenComponent.class);

    public static final ComponentKey<SchoolingComponent> SCHOOLING = ComponentRegistryV3.INSTANCE.getOrCreate(new Identifier("deep_trenches:schooling"), SchoolingComponent.class);

    public static final ComponentKey<TamableComponent> TAMABLE = ComponentRegistryV3.INSTANCE.getOrCreate(new Identifier("deep_trenches:tamable"), TamableComponent.class);

}
