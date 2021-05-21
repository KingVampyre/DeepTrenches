package github.KingVampyre.DeepTrenches.common.render.entity.feature;

import github.KingVampyre.DeepTrenches.client.render.entity.renderer.BeardedSeadevilRenderer;
import github.KingVampyre.DeepTrenches.common.entity.LuminousFishEntity;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.LightState;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Luminous;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.renderer.geo.IGeoRenderer;

import java.util.Map;

public class LuminousLayerFeature<T extends LivingEntity & IAnimatable & Luminous> extends SingleRenderLayerFeature<T>{

    protected final Identifier model;
    protected final Map<LightState, RenderLayer> layers;

    public LuminousLayerFeature(IGeoRenderer<T> renderer, Identifier model, Map<LightState, RenderLayer> layers) {
        super(renderer);

        this.model = model;
        this.layers = layers;
    }

    @Override
    protected GeoModel getModel(T living) {
        return this.getEntityModel().getModel(this.model);
    }

    @Override
    protected RenderLayer getRenderLayer(T living) {
        return this.layers.getOrDefault(living.getLightState(), null);
    }

}
