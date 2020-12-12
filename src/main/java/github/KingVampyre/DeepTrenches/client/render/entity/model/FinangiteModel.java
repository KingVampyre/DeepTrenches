// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.FinangiteEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class FinangiteModel extends AnimatedEntityModel<FinangiteEntity> {

    private final AnimatedModelRenderer root;
    private final AnimatedModelRenderer Body;
    private final AnimatedModelRenderer Head_rear;
    private final AnimatedModelRenderer Snout;
    private final AnimatedModelRenderer Snout_teeth_1;
    private final AnimatedModelRenderer Snout_teeth_2;
    private final AnimatedModelRenderer Snout_teeth_3;
    private final AnimatedModelRenderer Teeth_1_rear;
    private final AnimatedModelRenderer Teeth_2_rear;
    private final AnimatedModelRenderer Caudal;
    private final AnimatedModelRenderer Caudal_fin;
    private final AnimatedModelRenderer Dorsal_fin;
    private final AnimatedModelRenderer Pectoral_fin_1;
    private final AnimatedModelRenderer Pectoral_fin_2;
    private final AnimatedModelRenderer Pelvic_fin_2;
    private final AnimatedModelRenderer Pelvic_fin_1;
    private final AnimatedModelRenderer Lower_jaw;
    private final AnimatedModelRenderer Teeth_1;
    private final AnimatedModelRenderer Teeth_2;
    private final AnimatedModelRenderer Teeth_3;

    public FinangiteModel() {
        textureWidth = 216;
        textureHeight = 116;
        root = new AnimatedModelRenderer(this);
        root.setRotationPoint(0.0F, 0.0F, 0.0F);

        root.setModelRendererName("root");
        this.registerModelRenderer(root);

        Body = new AnimatedModelRenderer(this);
        Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        root.addChild(Body);
        Body.setTextureOffset(0, 33).addBox(-8.0F, -5.0F, 0.0F, 16.0F, 10.0F, 32.0F, 0.0F, false);
        Body.setModelRendererName("Body");
        this.registerModelRenderer(Body);

        Head_rear = new AnimatedModelRenderer(this);
        Head_rear.setRotationPoint(0.0F, -1.0F, 0.0F);
        Body.addChild(Head_rear);
        Head_rear.setTextureOffset(0, 12).addBox(-6.5F, -3.0F, -10.0F, 13.0F, 6.0F, 12.0F, 0.0F, false);
        Head_rear.setModelRendererName("Head_rear");
        this.registerModelRenderer(Head_rear);

        Snout = new AnimatedModelRenderer(this);
        Snout.setRotationPoint(0.0F, 2.0F, -10.0F);
        Head_rear.addChild(Snout);
        Snout.setTextureOffset(50, 13).addBox(-4.0F, -3.0F, -13.0F, 8.0F, 4.0F, 13.0F, 0.0F, false);
        Snout.setModelRendererName("Snout");
        this.registerModelRenderer(Snout);

        Snout_teeth_1 = new AnimatedModelRenderer(this);
        Snout_teeth_1.setRotationPoint(3.9F, 1.0F, -5.0F);
        Snout.addChild(Snout_teeth_1);
        Snout_teeth_1.setTextureOffset(112, 19).addBox(0.0F, 0.0F, -8.0F, 0.0F, 3.0F, 8.0F, 0.0F, false);
        Snout_teeth_1.setModelRendererName("Snout_teeth_1");
        this.registerModelRenderer(Snout_teeth_1);

        Snout_teeth_2 = new AnimatedModelRenderer(this);
        Snout_teeth_2.setRotationPoint(0.0F, 1.0F, -12.9F);
        Snout.addChild(Snout_teeth_2);
        Snout_teeth_2.setTextureOffset(97, 27).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
        Snout_teeth_2.setModelRendererName("Snout_teeth_2");
        this.registerModelRenderer(Snout_teeth_2);

        Snout_teeth_3 = new AnimatedModelRenderer(this);
        Snout_teeth_3.setRotationPoint(-3.9F, 1.0F, -5.0F);
        Snout.addChild(Snout_teeth_3);
        Snout_teeth_3.setTextureOffset(112, 19).addBox(0.0F, 0.0F, -8.0F, 0.0F, 3.0F, 8.0F, 0.0F, false);
        Snout_teeth_3.setModelRendererName("Snout_teeth_3");
        this.registerModelRenderer(Snout_teeth_3);

        Teeth_1_rear = new AnimatedModelRenderer(this);
        Teeth_1_rear.setRotationPoint(5.9F, 3.0F, 0.0F);
        Head_rear.addChild(Teeth_1_rear);
        Teeth_1_rear.setTextureOffset(0, 0).addBox(0.0F, 0.0F, -6.0F, 0.0F, 3.0F, 6.0F, 0.0F, false);
        Teeth_1_rear.setModelRendererName("Teeth_1_rear");
        this.registerModelRenderer(Teeth_1_rear);

        Teeth_2_rear = new AnimatedModelRenderer(this);
        Teeth_2_rear.setRotationPoint(-5.9F, 3.0F, 0.0F);
        Head_rear.addChild(Teeth_2_rear);
        Teeth_2_rear.setTextureOffset(0, 0).addBox(0.0F, 0.0F, -6.0F, 0.0F, 3.0F, 6.0F, 0.0F, false);
        Teeth_2_rear.setModelRendererName("Teeth_2_rear");
        this.registerModelRenderer(Teeth_2_rear);

        Caudal = new AnimatedModelRenderer(this);
        Caudal.setRotationPoint(0.0F, -1.0F, 28.0F);
        Body.addChild(Caudal);
        Caudal.setTextureOffset(0, 61).addBox(0.0F, -4.0F, 0.0F, 0.0F, 8.0F, 24.0F, 0.0F, false);
        Caudal.setModelRendererName("Caudal");
        this.registerModelRenderer(Caudal);

        Caudal_fin = new AnimatedModelRenderer(this);
        Caudal_fin.setRotationPoint(0.0F, -3.0F, 18.5F);
        Caudal.addChild(Caudal_fin);
        Caudal_fin.setTextureOffset(0, 94).addBox(-16.0F, 0.0F, -5.5F, 32.0F, 0.0F, 11.0F, 0.0F, false);
        Caudal_fin.setModelRendererName("Caudal_fin");
        this.registerModelRenderer(Caudal_fin);

        Dorsal_fin = new AnimatedModelRenderer(this);
        Dorsal_fin.setRotationPoint(0.0F, -5.0F, 8.0F);
        Body.addChild(Dorsal_fin);
        Dorsal_fin.setTextureOffset(0, 53).addBox(0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 24.0F, 0.0F, false);
        Dorsal_fin.setModelRendererName("Dorsal_fin");
        this.registerModelRenderer(Dorsal_fin);

        Pectoral_fin_1 = new AnimatedModelRenderer(this);
        Pectoral_fin_1.setRotationPoint(-8.0F, 2.0F, 11.0F);
        Body.addChild(Pectoral_fin_1);
        Pectoral_fin_1.setTextureOffset(91, 65).addBox(-32.0F, 0.0F, -3.0F, 32.0F, 0.0F, 8.0F, 0.0F, false);
        Pectoral_fin_1.setModelRendererName("Pectoral_fin_1");
        this.registerModelRenderer(Pectoral_fin_1);

        Pectoral_fin_2 = new AnimatedModelRenderer(this);
        Pectoral_fin_2.setRotationPoint(8.0F, 2.0F, 11.0F);
        Body.addChild(Pectoral_fin_2);
        Pectoral_fin_2.setTextureOffset(91, 65).addBox(0.0F, 0.0F, -3.0F, 32.0F, 0.0F, 8.0F, 0.0F, true);
        Pectoral_fin_2.setModelRendererName("Pectoral_fin_2");
        this.registerModelRenderer(Pectoral_fin_2);

        Pelvic_fin_2 = new AnimatedModelRenderer(this);
        Pelvic_fin_2.setRotationPoint(8.0F, 5.0F, 30.0F);
        Body.addChild(Pelvic_fin_2);
        Pelvic_fin_2.setTextureOffset(90, 74).addBox(0.0F, 0.0F, 0.0F, 38.0F, 0.0F, 8.0F, 0.0F, true);
        Pelvic_fin_2.setModelRendererName("Pelvic_fin_2");
        this.registerModelRenderer(Pelvic_fin_2);

        Pelvic_fin_1 = new AnimatedModelRenderer(this);
        Pelvic_fin_1.setRotationPoint(-8.0F, 5.0F, 30.0F);
        Body.addChild(Pelvic_fin_1);
        Pelvic_fin_1.setTextureOffset(90, 74).addBox(-38.0F, 0.0F, 0.0F, 38.0F, 0.0F, 8.0F, 0.0F, false);
        Pelvic_fin_1.setModelRendererName("Pelvic_fin_1");
        this.registerModelRenderer(Pelvic_fin_1);

        Lower_jaw = new AnimatedModelRenderer(this);
        Lower_jaw.setRotationPoint(0.0F, 2.0F, 0.0F);
        Body.addChild(Lower_jaw);
        setRotationAngle(Lower_jaw, 0.5918F, 0.0F, 0.0F);
        Lower_jaw.setTextureOffset(66, 35).addBox(-4.0F, 0.0F, -20.9F, 8.0F, 3.0F, 25.0F, 0.0F, false);
        Lower_jaw.setModelRendererName("Lower_jaw");
        this.registerModelRenderer(Lower_jaw);

        Teeth_1 = new AnimatedModelRenderer(this);
        Teeth_1.setRotationPoint(3.9F, 0.0F, -5.0F);
        Lower_jaw.addChild(Teeth_1);
        Teeth_1.setTextureOffset(107, 28).addBox(0.0F, -6.0F, -16.0F, 0.0F, 6.0F, 16.0F, 0.0F, false);
        Teeth_1.setModelRendererName("Teeth_1");
        this.registerModelRenderer(Teeth_1);

        Teeth_2 = new AnimatedModelRenderer(this);
        Teeth_2.setRotationPoint(0.0F, 0.0F, -20.9F);
        Lower_jaw.addChild(Teeth_2);
        Teeth_2.setTextureOffset(107, 37).addBox(-4.0F, -6.0F, 0.0F, 8.0F, 6.0F, 0.0F, 0.0F, false);
        Teeth_2.setModelRendererName("Teeth_2");
        this.registerModelRenderer(Teeth_2);

        Teeth_3 = new AnimatedModelRenderer(this);
        Teeth_3.setRotationPoint(-3.9F, 0.0F, -5.0F);
        Lower_jaw.addChild(Teeth_3);
        Teeth_3.setTextureOffset(107, 28).addBox(0.0F, -6.0F, -16.0F, 0.0F, 6.0F, 16.0F, 0.0F, false);
        Teeth_3.setModelRendererName("Teeth_3");
        this.registerModelRenderer(Teeth_3);

        this.rootBones.add(root);
    }

    @Override
    public ResourceLocation getAnimationFileLocation() {
        return new ResourceLocation("deep_trenches:animations/finangite.json");
    }

}