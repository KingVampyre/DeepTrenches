package github.KingVampyre.DeepTrenches.client.render.entity.model;

import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class DummyModel<T extends Entity> extends EntityModel<T> {

    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw,
            float headPitch) {
        // TODO Auto-generated method stub

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green,
            float blue, float alpha) {
        // TODO Auto-generated method stub

    }
    
}
