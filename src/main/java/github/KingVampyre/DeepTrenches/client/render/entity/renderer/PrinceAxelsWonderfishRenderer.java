package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import com.google.common.collect.ImmutableMap;
import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.PrinceAxelsWonderfishModel;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.LightState;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LuminousLayerFeature;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.PrinceAxelsWonderfishEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;

import java.util.Map;
import java.util.Objects;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.PrinceAxelsWonderfishModel.MODEL;
import static github.KingVampyre.DeepTrenches.core.init.LightStates.ALL_LIT;

public class PrinceAxelsWonderfishRenderer extends NoCullingEntityRenderer<PrinceAxelsWonderfishEntity> {

    private static final Map<LightState, RenderLayer> LAYERS = ImmutableMap.of(ALL_LIT, Objects.requireNonNull(CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/prince_axels_wonderfish/all_lit_layer.png")));

    public PrinceAxelsWonderfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new PrinceAxelsWonderfishModel());

        this.shadowRadius = 0.3F;
        this.addLayer(new LuminousLayerFeature<>(this, MODEL, LAYERS));
    }

}
