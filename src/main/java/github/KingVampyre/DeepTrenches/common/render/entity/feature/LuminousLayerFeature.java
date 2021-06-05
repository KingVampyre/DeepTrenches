package github.KingVampyre.DeepTrenches.common.render.entity.feature;

import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Luminous;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

import static github.KingVampyre.DeepTrenches.core.init.LightStates.ALL_UNLIT;

public class LuminousLayerFeature<T extends LivingEntity & IAnimatable & Luminous> extends SingleRenderLayerFeature<T> {

    protected final RenderLayer[] layers;

    public LuminousLayerFeature(IGeoRenderer<T> renderer, Identifier model, RenderLayer[] layers) {
        super(renderer, model);

        this.layers = layers;
    }

    @Override
    protected RenderLayer getRenderLayer(T living) {
        return living.getLightState() != ALL_UNLIT ? this.layers[living.getLightStateIndex()] : null;
    }

}
