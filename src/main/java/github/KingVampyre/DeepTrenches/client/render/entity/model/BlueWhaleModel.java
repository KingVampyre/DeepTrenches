// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BlueWhaleEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class BlueWhaleModel extends AnimatedEntityModel<BlueWhaleEntity> {

    private final AnimatedModelRenderer root;
    private final AnimatedModelRenderer Body;
    private final AnimatedModelRenderer Caudal;
    private final AnimatedModelRenderer Caudal_fin;
    private final AnimatedModelRenderer Caudal_fin_lalalee;
    private final AnimatedModelRenderer Caudal_fin_lalala_bottom;
    private final AnimatedModelRenderer Dorsal_fin;
    private final AnimatedModelRenderer Upper_jaw;
    private final AnimatedModelRenderer Blowhole;
    private final AnimatedModelRenderer Mouth_inside_top;
    private final AnimatedModelRenderer Pectoral_fin_1;
    private final AnimatedModelRenderer Pectoral_fin_2;
    private final AnimatedModelRenderer Lower_jaw_thing;
    private final AnimatedModelRenderer Lower_jaw;
    private final AnimatedModelRenderer Mouth_inside_front;
    private final AnimatedModelRenderer Mouth_inside_rear;

    public BlueWhaleModel() {
        textureWidth = 820;
        textureHeight = 664;
        root = new AnimatedModelRenderer(this);
        root.setRotationPoint(0.0F, 0.0F, 0.0F);

        root.setModelRendererName("root");
        this.registerModelRenderer(root);

        Body = new AnimatedModelRenderer(this);
        Body.setRotationPoint(0.0F, -10.0F, -80.0F);
        root.addChild(Body);
        Body.setTextureOffset(0, 130).addBox(-26.5F, -32.0F, 0.0F, 53.0F, 50.0F, 188.0F, 0.0F, false);
        Body.setModelRendererName("Body");
        this.registerModelRenderer(Body);

        Caudal = new AnimatedModelRenderer(this);
        Caudal.setRotationPoint(0.0F, 0.0F, 177.0F);
        Body.addChild(Caudal);
        Caudal.setTextureOffset(0, 385).addBox(-16.0F, -24.0F, 0.0F, 32.0F, 34.0F, 123.0F, 0.0F, false);
        Caudal.setModelRendererName("Caudal");
        this.registerModelRenderer(Caudal);

        Caudal_fin = new AnimatedModelRenderer(this);
        Caudal_fin.setRotationPoint(0.0F, -16.0F, 122.0F);
        Caudal.addChild(Caudal_fin);
        Caudal_fin.setTextureOffset(0, 554).addBox(-40.0F, 0.0F, 0.0F, 80.0F, 3.0F, 32.0F, 0.0F, false);
        Caudal_fin.setModelRendererName("Caudal_fin");
        this.registerModelRenderer(Caudal_fin);

        Caudal_fin_lalalee = new AnimatedModelRenderer(this);
        Caudal_fin_lalalee.setRotationPoint(0.0F, 1.5F, 8.0F);
        Caudal_fin.addChild(Caudal_fin_lalalee);
        Caudal_fin_lalalee.setTextureOffset(200, 554).addBox(-66.0F, 0.0F, 0.0F, 132.0F, 0.0F, 40.0F, 0.0F, false);
        Caudal_fin_lalalee.setModelRendererName("Caudal_fin_lalalee");
        this.registerModelRenderer(Caudal_fin_lalalee);

        Caudal_fin_lalala_bottom = new AnimatedModelRenderer(this);
        Caudal_fin_lalala_bottom.setRotationPoint(0.0F, 0.01F, 0.0F);
        Caudal_fin_lalalee.addChild(Caudal_fin_lalala_bottom);
        Caudal_fin_lalala_bottom.setTextureOffset(200, 600).addBox(-66.0F, 0.0F, 0.0F, 132.0F, 0.0F, 40.0F, 0.0F, false);
        Caudal_fin_lalala_bottom.setModelRendererName("Caudal_fin_lalala_bottom");
        this.registerModelRenderer(Caudal_fin_lalala_bottom);

        Dorsal_fin = new AnimatedModelRenderer(this);
        Dorsal_fin.setRotationPoint(0.0F, -24.0F, 22.0F);
        Caudal.addChild(Dorsal_fin);
        Dorsal_fin.setTextureOffset(0, 400).addBox(0.0F, -12.0F, 0.0F, 0.0F, 12.0F, 22.0F, 0.0F, false);
        Dorsal_fin.setModelRendererName("Dorsal_fin");
        this.registerModelRenderer(Dorsal_fin);

        Upper_jaw = new AnimatedModelRenderer(this);
        Upper_jaw.setRotationPoint(0.0F, 0.0F, 1.0F);
        Body.addChild(Upper_jaw);
        setRotationAngle(Upper_jaw, 0.0456F, 0.0F, 0.0F);
        Upper_jaw.setTextureOffset(0, 0).addBox(-22.0F, -28.0F, -96.0F, 45.0F, 28.0F, 97.0F, 0.0F, false);
        Upper_jaw.setModelRendererName("Upper_jaw");
        this.registerModelRenderer(Upper_jaw);

        Blowhole = new AnimatedModelRenderer(this);
        Blowhole.setRotationPoint(0.0F, -28.0F, -48.0F);
        Upper_jaw.addChild(Blowhole);
        setRotationAngle(Blowhole, 0.0911F, 0.0F, 0.0F);
        Blowhole.setTextureOffset(0, 57).addBox(-6.0F, -2.5F, 0.0F, 12.0F, 5.0F, 22.0F, 0.0F, false);
        Blowhole.setModelRendererName("Blowhole");
        this.registerModelRenderer(Blowhole);

        Mouth_inside_top = new AnimatedModelRenderer(this);
        Mouth_inside_top.setRotationPoint(0.0F, 0.0F, 0.0F);
        Upper_jaw.addChild(Mouth_inside_top);
        Mouth_inside_top.setTextureOffset(507, 0).addBox(-21.5F, -25.0F, -95.9F, 44.0F, 25.0F, 97.0F, 0.0F, false);
        Mouth_inside_top.setModelRendererName("Mouth_inside_top");
        this.registerModelRenderer(Mouth_inside_top);

        Pectoral_fin_1 = new AnimatedModelRenderer(this);
        Pectoral_fin_1.setRotationPoint(-26.0F, 2.0F, 26.0F);
        Body.addChild(Pectoral_fin_1);
        setRotationAngle(Pectoral_fin_1, 0.0911F, 0.0F, 0.3187F);
        Pectoral_fin_1.setTextureOffset(0, 144).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 44.0F, 16.0F, 0.0F, true);
        Pectoral_fin_1.setModelRendererName("Pectoral_fin_1");
        this.registerModelRenderer(Pectoral_fin_1);

        Pectoral_fin_2 = new AnimatedModelRenderer(this);
        Pectoral_fin_2.setRotationPoint(26.0F, 2.0F, 26.0F);
        Body.addChild(Pectoral_fin_2);
        setRotationAngle(Pectoral_fin_2, 0.0911F, 0.0F, -0.3187F);
        Pectoral_fin_2.setTextureOffset(0, 144).addBox(0.0F, 0.0F, 0.0F, 1.0F, 44.0F, 16.0F, 0.0F, false);
        Pectoral_fin_2.setModelRendererName("Pectoral_fin_2");
        this.registerModelRenderer(Pectoral_fin_2);

        Lower_jaw_thing = new AnimatedModelRenderer(this);
        Lower_jaw_thing.setRotationPoint(0.0F, 16.0F, 32.0F);
        Body.addChild(Lower_jaw_thing);
        Lower_jaw_thing.setTextureOffset(350, 108).addBox(-21.5F, -32.0F, -69.0F, 44.0F, 27.0F, 60.0F, 0.0F, false);
        Lower_jaw_thing.setModelRendererName("Lower_jaw_thing");
        this.registerModelRenderer(Lower_jaw_thing);

        Lower_jaw = new AnimatedModelRenderer(this);
        Lower_jaw.setRotationPoint(0.0F, -13.5F, -60.0F);
        Lower_jaw_thing.addChild(Lower_jaw);
        Lower_jaw.setTextureOffset(316, 0).addBox(-22.5F, -18.5F, -68.0F, 46.0F, 27.0F, 60.0F, 0.0F, false);
        Lower_jaw.setModelRendererName("Lower_jaw");
        this.registerModelRenderer(Lower_jaw);

        Mouth_inside_front = new AnimatedModelRenderer(this);
        Mouth_inside_front.setRotationPoint(0.0F, -13.7F, 0.0F);
        Lower_jaw.addChild(Mouth_inside_front);
        Mouth_inside_front.setTextureOffset(560, 268).addBox(-22.0F, -5.0F, -67.5F, 45.0F, 26.0F, 59.0F, 0.0F, false);
        Mouth_inside_front.setModelRendererName("Mouth_inside_front");
        this.registerModelRenderer(Mouth_inside_front);

        Mouth_inside_rear = new AnimatedModelRenderer(this);
        Mouth_inside_rear.setRotationPoint(0.0F, -13.7F, 0.0F);
        Lower_jaw_thing.addChild(Mouth_inside_rear);
        Mouth_inside_rear.setTextureOffset(560, 152).addBox(-21.0F, -18.5F, -72.0F, 43.0F, 26.0F, 62.0F, 0.0F, false);
        Mouth_inside_rear.setModelRendererName("Mouth_inside_rear");
        this.registerModelRenderer(Mouth_inside_rear);

        this.rootBones.add(root);
    }

    @Override
    public ResourceLocation getAnimationFileLocation() {
        return new ResourceLocation("deep_trenches:animations/blue_whale.json");
    }

}