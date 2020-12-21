package github.KingVampyre.DeepTrenches.client.render.entity.feature;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.SmalltoothDragonfishModel;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.SingleRenderLayerFeature;
import github.KingVampyre.DeepTrenches.core.entity.SmalltoothDragonfishEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.util.Identifier;

public class SmalltoothDragonfishFinsFeature extends SingleRenderLayerFeature<SmalltoothDragonfishEntity, SmalltoothDragonfishModel> {

    private static final RenderLayer TEXTURE = CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/translucent_layer.png"));

    public SmalltoothDragonfishFinsFeature(FeatureRendererContext<SmalltoothDragonfishEntity, SmalltoothDragonfishModel> context) {
        super(context);
    }

    @Override
    protected RenderLayer getRenderLayer(SmalltoothDragonfishEntity entity) {
        return TEXTURE;
    }

}
