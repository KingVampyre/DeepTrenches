package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.component.StaspPollenComponent;
import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import github.KingVampyre.DeepTrenches.core.init.Components;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

import static net.minecraft.util.registry.Registry.ENTITY_TYPE;

public class StaspModel extends AnimatedGeoModel<StaspEntity> {

    @Override
    public Identifier getAnimationFileLocation(StaspEntity animatable) {
        return new Identifier("deep_trenches:animations/stasp.json");
    }

    @Override
    public Identifier getModelLocation(StaspEntity object) {
        return new Identifier("deep_trenches:geo/entity/stasp.geo.json");
    }

    @Override
    public Identifier getTextureLocation(StaspEntity object) {
        EntityType<?> entityType = object.getType();
        Identifier id = ENTITY_TYPE.getId(entityType);

        StaspPollenComponent pollen = (StaspPollenComponent) Components.POLLEN.get(object);

        String namespace = id.getNamespace();
        String path = id.getPath();

        if(object.hasAngerTime()) {

            if(pollen.hasAqueanSap())
                return new Identifier(namespace + ":textures/entity/stasp/" + path + "/angry/with_aquean_sap.png");

            if(pollen.hasPollen())
                return new Identifier(namespace + ":textures/entity/stasp/" + path + "/angry/with_pollen.png");

            return new Identifier(namespace + ":textures/entity/stasp/" + path + "/angry/" + path + ".png");
        }

        if(pollen.hasAqueanSap())
            return new Identifier(namespace + ":textures/entity/stasp/" + path + "/with_aquean_sap.png");

        if(pollen.hasPollen())
            return new Identifier(namespace + ":textures/entity/stasp/" + path + "/with_pollen.png");

        return new Identifier(namespace + ":textures/entity/stasp/" + path + "/" + path + ".png");
    }

}