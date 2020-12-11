// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.GiantHatchetfishEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class GiantHatchetfishModel extends AnimatedEntityModel<GiantHatchetfishEntity> {

    private final AnimatedModelRenderer root;
    private final AnimatedModelRenderer Body;
    private final AnimatedModelRenderer Head;
    private final AnimatedModelRenderer Eyes;
    private final AnimatedModelRenderer Metallic_eye_thing_bottom;
    private final AnimatedModelRenderer Metallic_eye_thing_rear;
    private final AnimatedModelRenderer Lower_jaw;
    private final AnimatedModelRenderer Snout;
    private final AnimatedModelRenderer Caudal_fin;
    private final AnimatedModelRenderer Dorsal_fin;
    private final AnimatedModelRenderer Pectoral_fin_2;
    private final AnimatedModelRenderer Pectoral_fin_1;
    private final AnimatedModelRenderer Pelvic_fin_2;
    private final AnimatedModelRenderer Pelvic_fin_1;

    public GiantHatchetfishModel() {
        textureWidth = 64;
        textureHeight = 32;
        root = new AnimatedModelRenderer(this);
        root.setRotationPoint(0.0F, 0.0F, 0.0F);

        root.setModelRendererName("root");
        this.registerModelRenderer(root);

        Body = new AnimatedModelRenderer(this);
        Body.setRotationPoint(0.0F, 18.0F, -5.0F);
        root.addChild(Body);
        Body.setTextureOffset(0, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 6.0F, 0.0F, false);
        Body.setModelRendererName("Body");
        this.registerModelRenderer(Body);

        Head = new AnimatedModelRenderer(this);
        Head.setRotationPoint(0.0F, 3.0F, 1.0F);
        Body.addChild(Head);
        Head.setTextureOffset(14, 4).addBox(-0.5F, -3.1F, -3.8F, 1.0F, 5.0F, 3.0F, 0.0F, false);
        Head.setModelRendererName("Head");
        this.registerModelRenderer(Head);

        Eyes = new AnimatedModelRenderer(this);
        Eyes.setRotationPoint(0.0F, -1.5F, -3.79F);
        Head.addChild(Eyes);
        Eyes.setTextureOffset(17, 14).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
        Eyes.setModelRendererName("Eyes");
        this.registerModelRenderer(Eyes);

        Metallic_eye_thing_bottom = new AnimatedModelRenderer(this);
        Metallic_eye_thing_bottom.setRotationPoint(0.0F, 2.0F, 0.0F);
        Eyes.addChild(Metallic_eye_thing_bottom);
        Metallic_eye_thing_bottom.setTextureOffset(35, 15).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        Metallic_eye_thing_bottom.setModelRendererName("Metallic_eye_thing_bottom");
        this.registerModelRenderer(Metallic_eye_thing_bottom);

        Metallic_eye_thing_rear = new AnimatedModelRenderer(this);
        Metallic_eye_thing_rear.setRotationPoint(0.0F, 0.0F, 2.0F);
        Eyes.addChild(Metallic_eye_thing_rear);
        Metallic_eye_thing_rear.setTextureOffset(28, 15).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        Metallic_eye_thing_rear.setModelRendererName("Metallic_eye_thing_rear");
        this.registerModelRenderer(Metallic_eye_thing_rear);

        Lower_jaw = new AnimatedModelRenderer(this);
        Lower_jaw.setRotationPoint(0.0F, 3.9F, 1.0F);
        Body.addChild(Lower_jaw);
        Lower_jaw.setTextureOffset(22, 7).addBox(-0.5F, 0.0F, -3.8F, 1.0F, 2.0F, 3.0F, 0.0F, false);
        Lower_jaw.setModelRendererName("Lower_jaw");
        this.registerModelRenderer(Lower_jaw);

        Snout = new AnimatedModelRenderer(this);
        Snout.setRotationPoint(0.0F, 0.0F, -3.8F);
        Lower_jaw.addChild(Snout);
        Snout.setTextureOffset(30, 8).addBox(-0.5F, -1.7F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        Snout.setModelRendererName("Snout");
        this.registerModelRenderer(Snout);

        Caudal_fin = new AnimatedModelRenderer(this);
        Caudal_fin.setRotationPoint(0.0F, 3.0F, 6.0F);
        Body.addChild(Caudal_fin);
        Caudal_fin.setTextureOffset(0, 4).addBox(0.0F, -3.4F, 0.0F, 0.0F, 6.0F, 8.0F, 0.0F, false);
        Caudal_fin.setModelRendererName("Caudal_fin");
        this.registerModelRenderer(Caudal_fin);

        Dorsal_fin = new AnimatedModelRenderer(this);
        Dorsal_fin.setRotationPoint(0.0F, 0.0F, 0.0F);
        Body.addChild(Dorsal_fin);
        Dorsal_fin.setTextureOffset(3, 13).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 6.0F, 0.0F, false);
        Dorsal_fin.setModelRendererName("Dorsal_fin");
        this.registerModelRenderer(Dorsal_fin);

        Pectoral_fin_2 = new AnimatedModelRenderer(this);
        Pectoral_fin_2.setRotationPoint(0.5F, 4.8F, 0.0F);
        Body.addChild(Pectoral_fin_2);
        setRotationAngle(Pectoral_fin_2, 0.0F, 0.1018F, 0.0F);
        Pectoral_fin_2.setTextureOffset(8, 2).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);
        Pectoral_fin_2.setModelRendererName("Pectoral_fin_2");
        this.registerModelRenderer(Pectoral_fin_2);

        Pectoral_fin_1 = new AnimatedModelRenderer(this);
        Pectoral_fin_1.setRotationPoint(-0.5F, 4.8F, 0.0F);
        Body.addChild(Pectoral_fin_1);
        setRotationAngle(Pectoral_fin_1, 0.0F, -0.1018F, 0.0F);
        Pectoral_fin_1.setTextureOffset(8, 2).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);
        Pectoral_fin_1.setModelRendererName("Pectoral_fin_1");
        this.registerModelRenderer(Pectoral_fin_1);

        Pelvic_fin_2 = new AnimatedModelRenderer(this);
        Pelvic_fin_2.setRotationPoint(0.5F, 4.0F, 5.7F);
        Body.addChild(Pelvic_fin_2);
        Pelvic_fin_2.setTextureOffset(2, 1).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
        Pelvic_fin_2.setModelRendererName("Pelvic_fin_2");
        this.registerModelRenderer(Pelvic_fin_2);

        Pelvic_fin_1 = new AnimatedModelRenderer(this);
        Pelvic_fin_1.setRotationPoint(-0.5F, 4.0F, 5.7F);
        Body.addChild(Pelvic_fin_1);
        Pelvic_fin_1.setTextureOffset(2, 1).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
        Pelvic_fin_1.setModelRendererName("Pelvic_fin_1");
        this.registerModelRenderer(Pelvic_fin_1);

        this.rootBones.add(root);
    }


    @Override
    public ResourceLocation getAnimationFileLocation() {
        return new ResourceLocation("deep_trenches:animations/giant_hatchetfish.json");
    }

}