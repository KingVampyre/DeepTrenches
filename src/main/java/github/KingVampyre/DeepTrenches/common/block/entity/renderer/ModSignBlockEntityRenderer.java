package github.KingVampyre.DeepTrenches.common.block.entity.renderer;

import github.KingVampyre.DeepTrenches.common.block.entity.ModSignBlockEntity;
import net.minecraft.block.*;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.SignBlockEntityRenderer;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.Vector3f;
import net.minecraft.text.OrderedText;
import net.minecraft.util.Identifier;
import net.minecraft.util.SignType;

import java.util.List;

public class ModSignBlockEntityRenderer extends BlockEntityRenderer<ModSignBlockEntity> {

    private final SignBlockEntityRenderer.SignModel model = new SignBlockEntityRenderer.SignModel();

    public ModSignBlockEntityRenderer(BlockEntityRenderDispatcher dispatcher) {
        super(dispatcher);
    }

    @Override
    public void render(ModSignBlockEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        BlockState blockState = entity.getCachedState();

        matrices.push();
        float h;

        if (blockState.getBlock() instanceof SignBlock) {
            matrices.translate(0.5D, 0.5D, 0.5D);
            h = -((float)(Integer)(blockState.get(SignBlock.ROTATION) * 360) / 16.0F);
            matrices.multiply(Vector3f.POSITIVE_Y.getDegreesQuaternion(h));
            this.model.foot.visible = true;
        } else {
            matrices.translate(0.5D, 0.5D, 0.5D);
            h = -blockState.get(WallSignBlock.FACING).asRotation();
            matrices.multiply(Vector3f.POSITIVE_Y.getDegreesQuaternion(h));
            matrices.translate(0.0D, -0.3125D, -0.4375D);
            this.model.foot.visible = false;
        }

        matrices.push();
        matrices.scale(0.6666667F, -0.6666667F, -0.6666667F);

        AbstractSignBlock block = (AbstractSignBlock) blockState.getBlock();

        Identifier texture = ModSignBlockEntityRenderer.getTexture(block);
        RenderLayer renderLayer = RenderLayer.getEntityCutout(texture);
        VertexConsumer vertexConsumer = vertexConsumers.getBuffer(renderLayer);

        this.model.field.render(matrices, vertexConsumer, light, overlay);
        this.model.foot.render(matrices, vertexConsumer, light, overlay);

        matrices.pop();

        TextRenderer textRenderer = this.dispatcher.getTextRenderer();
        matrices.translate(0.0D, 0.3333333432674408D, 0.046666666865348816D);
        matrices.scale(0.010416667F, -0.010416667F, 0.010416667F);

        int m = entity.getTextColor().getSignColor();
        int n = (int)((double) NativeImage.getRed(m) * 0.4D);
        int o = (int)((double)NativeImage.getGreen(m) * 0.4D);
        int p = (int)((double)NativeImage.getBlue(m) * 0.4D);
        int q = NativeImage.getAbgrColor(0, p, o, n);

        for(int s = 0; s < 4; ++s) {
            OrderedText orderedText = entity.getTextBeingEditedOnRow(s, (text) -> {
                List<OrderedText> list = textRenderer.wrapLines(text, 90);
                return list.isEmpty() ? OrderedText.EMPTY : list.get(0);
            });
            if (orderedText != null) {
                float t = (float)(-textRenderer.getWidth(orderedText) / 2);
                textRenderer.draw(orderedText, t, (float)(s * 10 - 20), q, false, matrices.peek().getModel(), vertexConsumers, false, 0, light);
            }
        }

        matrices.pop();
    }

    public static Identifier getTexture(AbstractSignBlock block) {
        SignType signType = block.getSignType();

        return new Identifier("deep_trenches:textures/entity/signs/" + signType.getName() + ".png");
    }

}
