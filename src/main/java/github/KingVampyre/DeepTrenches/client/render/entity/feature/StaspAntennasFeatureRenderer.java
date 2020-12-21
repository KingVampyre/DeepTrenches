package github.KingVampyre.DeepTrenches.client.render.entity.feature;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.StaspModel;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.SingleRenderLayerFeature;
import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import github.KingVampyre.DeepTrenches.core.init.EntityTypes;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class StaspAntennasFeatureRenderer extends SingleRenderLayerFeature<StaspEntity, StaspModel> {

    private static final RenderLayer BRIGHT_BLACK_ANTENNAS = CustomRenderLayer.getBrightTexture(new Identifier("deep_trenches:textures/entity/black_stasp_antennas.png"));
    private static final RenderLayer BRIGHT_STASP_ANTENNAS = CustomRenderLayer.getBrightTexture(new Identifier("deep_trenches:textures/entity/stasp_antennas.png"));

    private static final RenderLayer BLACK_STASP_ANTENNAS = RenderLayer.getEntityCutout(new Identifier("deep_trenches:textures/entity/black_stasp_antennas.png"));
    private static final RenderLayer STASP_ANTENNAS = RenderLayer.getEntityCutout(new Identifier("deep_trenches:textures/entity/stasp_antennas.png"));

    public StaspAntennasFeatureRenderer(FeatureRendererContext<StaspEntity, StaspModel> context) {
        super(context);
    }

    @Override
    protected RenderLayer getRenderLayer(StaspEntity entity) {

        if(entity.getType() == EntityTypes.BLACK_STASP)
            return entity.isInvisible() ? BLACK_STASP_ANTENNAS : BRIGHT_BLACK_ANTENNAS;

        return entity.isInvisible() ? STASP_ANTENNAS : BRIGHT_STASP_ANTENNAS;
    }

}
