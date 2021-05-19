package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.CetachsalModel;
import github.KingVampyre.DeepTrenches.core.entity.CetachsalEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class CetachsalRenderer extends GeoEntityRenderer<CetachsalEntity> {

    public CetachsalRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new CetachsalModel());

        this.shadowRadius = 0.3F;
    }

}
