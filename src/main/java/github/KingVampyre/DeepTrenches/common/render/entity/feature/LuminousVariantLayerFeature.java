package github.KingVampyre.DeepTrenches.common.render.entity.feature;

import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Luminous;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Variant;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

import static github.KingVampyre.DeepTrenches.core.init.LightStates.ALL_UNLIT;

public class LuminousVariantLayerFeature <T extends LivingEntity & IAnimatable & Luminous & Variant> extends SingleRenderLayerFeature<T> {

    protected final RenderLayer[][] layers;

    public LuminousVariantLayerFeature(IGeoRenderer<T> renderer, Identifier model, RenderLayer[][] layers) {
        super(renderer, model);

        this.layers = layers;
    }

    @Override
    protected RenderLayer getRenderLayer(T living) {
        return living.getLightState() != ALL_UNLIT ? this.layers[living.getVariant()][living.getLightStateIndex()] : null;
    }

}
