package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.PrinceAxelsWonderfishModel;
import github.KingVampyre.DeepTrenches.core.entity.PrinceAxelsWonderfishEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class PrinceAxelsWonderfishRenderer extends GeoEntityRenderer<PrinceAxelsWonderfishEntity> {

    public PrinceAxelsWonderfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new PrinceAxelsWonderfishModel());

        this.shadowRadius = 0.3F;
    }

}
