// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.FlyEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class FlyModel extends AnimatedEntityModel<FlyEntity> {

    private final AnimatedModelRenderer root;
    private final AnimatedModelRenderer Body;
    private final AnimatedModelRenderer Head;
    private final AnimatedModelRenderer Rear;
    private final AnimatedModelRenderer Leg_1;
    private final AnimatedModelRenderer Leg_2;
    private final AnimatedModelRenderer Leg_3;
    private final AnimatedModelRenderer Leg_4;
    private final AnimatedModelRenderer Leg_5;
    private final AnimatedModelRenderer Leg_6;
    private final AnimatedModelRenderer Wing_1;
    private final AnimatedModelRenderer Wing_2;

    public FlyModel() {
        textureWidth = 64;
        textureHeight = 32;
        root = new AnimatedModelRenderer(this);
        root.setRotationPoint(0.0F, 0.0F, 0.0F);

        root.setModelRendererName("root");
        this.registerModelRenderer(root);

        Body = new AnimatedModelRenderer(this);
        Body.setRotationPoint(0.0F, 20.7F, -4.0F);
        root.addChild(Body);
        Body.setTextureOffset(21, 0).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 6.0F, 0.0F, false);
        Body.setModelRendererName("Body");
        this.registerModelRenderer(Body);

        Head = new AnimatedModelRenderer(this);
        Head.setRotationPoint(0.0F, 0.7F, 0.2F);
        Body.addChild(Head);
        Head.setTextureOffset(49, 2).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
        Head.setModelRendererName("Head");
        this.registerModelRenderer(Head);

        Rear = new AnimatedModelRenderer(this);
        Rear.setRotationPoint(0.0F, 0.1F, 5.8F);
        Body.addChild(Rear);
        setRotationAngle(Rear, -0.0911F, 0.0F, 0.0F);
        Rear.setTextureOffset(40, 9).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 6.0F, 0.0F, false);
        Rear.setModelRendererName("Rear");
        this.registerModelRenderer(Rear);

        Leg_1 = new AnimatedModelRenderer(this);
        Leg_1.setRotationPoint(0.6F, 2.0F, 0.5F);
        Body.addChild(Leg_1);
        setRotationAngle(Leg_1, -0.5918F, 0.0F, -1.1383F);
        Leg_1.setTextureOffset(6, 0).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
        Leg_1.setModelRendererName("Leg_1");
        this.registerModelRenderer(Leg_1);

        Leg_2 = new AnimatedModelRenderer(this);
        Leg_2.setRotationPoint(1.6F, 2.0F, 2.2F);
        Body.addChild(Leg_2);
        setRotationAngle(Leg_2, 0.0F, 0.0F, -1.1383F);
        Leg_2.setTextureOffset(9, 0).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
        Leg_2.setModelRendererName("Leg_2");
        this.registerModelRenderer(Leg_2);

        Leg_3 = new AnimatedModelRenderer(this);
        Leg_3.setRotationPoint(1.6F, 2.0F, 3.8F);
        Body.addChild(Leg_3);
        setRotationAngle(Leg_3, 0.7741F, 0.0F, -1.1383F);
        Leg_3.setTextureOffset(12, 0).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
        Leg_3.setModelRendererName("Leg_3");
        this.registerModelRenderer(Leg_3);

        Leg_4 = new AnimatedModelRenderer(this);
        Leg_4.setRotationPoint(-0.6F, 2.0F, 0.5F);
        Body.addChild(Leg_4);
        setRotationAngle(Leg_4, -0.5918F, 0.0F, 1.1383F);
        Leg_4.setTextureOffset(6, 0).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, true);
        Leg_4.setModelRendererName("Leg_4");
        this.registerModelRenderer(Leg_4);

        Leg_5 = new AnimatedModelRenderer(this);
        Leg_5.setRotationPoint(-1.6F, 2.0F, 2.2F);
        Body.addChild(Leg_5);
        setRotationAngle(Leg_5, 0.0F, 0.0F, 1.1383F);
        Leg_5.setTextureOffset(9, 0).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, true);
        Leg_5.setModelRendererName("Leg_5");
        this.registerModelRenderer(Leg_5);

        Leg_6 = new AnimatedModelRenderer(this);
        Leg_6.setRotationPoint(-1.6F, 2.0F, 3.8F);
        Body.addChild(Leg_6);
        setRotationAngle(Leg_6, 0.7741F, 0.0F, 1.1383F);
        Leg_6.setTextureOffset(12, 0).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, true);
        Leg_6.setModelRendererName("Leg_6");
        this.registerModelRenderer(Leg_6);

        Wing_1 = new AnimatedModelRenderer(this);
        Wing_1.setRotationPoint(-0.5F, -2.0F, 0.5F);
        Body.addChild(Wing_1);
        setRotationAngle(Wing_1, 0.0456F, 0.0F, 0.0F);
        Wing_1.setTextureOffset(0, 6).addBox(-1.5F, 0.0F, 0.0F, 4.0F, 0.0F, 10.0F, 0.0F, true);
        Wing_1.setModelRendererName("Wing_1");
        this.registerModelRenderer(Wing_1);

        Wing_2 = new AnimatedModelRenderer(this);
        Wing_2.setRotationPoint(0.5F, -2.0F, 0.5F);
        Body.addChild(Wing_2);
        setRotationAngle(Wing_2, 0.0456F, 0.0F, 0.0F);
        Wing_2.setTextureOffset(0, 6).addBox(-2.5F, 0.0F, 0.0F, 4.0F, 0.0F, 10.0F, 0.0F, false);
        Wing_2.setModelRendererName("Wing_2");
        this.registerModelRenderer(Wing_2);

        this.rootBones.add(root);
    }

    @Override
    public ResourceLocation getAnimationFileLocation() {
        return new ResourceLocation("deep_trenches:animations/fly.json");
    }

}