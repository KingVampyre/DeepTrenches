package github.KingVampyre.DeepTrenches.common.render.entity.model;

import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.entity.IAnimatedEntity;

public abstract class AnimalModel<T extends Entity & IAnimatedEntity> extends AnimatedEntityModel<T> {

    @Override
    public void render(MatrixStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {

        if (this.child) {
            matrixStackIn.push();
            matrixStackIn.scale(0.5F, 0.5F, 0.5F);
            super.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
            matrixStackIn.pop();
        } else
            super.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);

    }

}
