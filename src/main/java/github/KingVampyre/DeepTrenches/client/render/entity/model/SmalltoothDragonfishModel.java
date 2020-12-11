// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.SmalltoothDragonfishEntity;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;
import software.bernie.geckolib.forgetofabric.ResourceLocation;

public class SmalltoothDragonfishModel extends AnimatedEntityModel<SmalltoothDragonfishEntity> {

    private final AnimatedModelRenderer root;
    private final AnimatedModelRenderer Body;
    private final AnimatedModelRenderer Upper_Jaw;
    private final AnimatedModelRenderer Eyeinnerside1;
    private final AnimatedModelRenderer Eyeouterside1;
    private final AnimatedModelRenderer Eyeinnerside2;
    private final AnimatedModelRenderer Eyeouterside2;
    private final AnimatedModelRenderer Upper_teeth_side_2;
    private final AnimatedModelRenderer Upper_teeth_side_1;
    private final AnimatedModelRenderer Front_upper_teeth;
    private final AnimatedModelRenderer Lower_jaw;
    private final AnimatedModelRenderer Fronttooth;
    private final AnimatedModelRenderer Teeth_side_1;
    private final AnimatedModelRenderer Teeth_side_2;
    private final AnimatedModelRenderer Front_tooth_side_2;
    private final AnimatedModelRenderer Front_tooth_side_1;
    private final AnimatedModelRenderer Barbel_joint;
    private final AnimatedModelRenderer Barbel;
    private final AnimatedModelRenderer Barbel_tip;
    private final AnimatedModelRenderer Barbel_tip_appandage;
    private final AnimatedModelRenderer Tail;
    private final AnimatedModelRenderer Dorsal_fin;
    private final AnimatedModelRenderer Anal_fin;
    private final AnimatedModelRenderer Caudal_fin;
    private final AnimatedModelRenderer Pectoral_fin_side_1;
    private final AnimatedModelRenderer Pectoral_fin_side_2;
    private final AnimatedModelRenderer Pelvic_fin_side_1;
    private final AnimatedModelRenderer Pelvic_fin_side_2;

    public SmalltoothDragonfishModel() {
        textureWidth = 128;
        textureHeight = 64;
        root = new AnimatedModelRenderer(this);
        root.setRotationPoint(0.0F, 0.0F, 0.0F);

        root.setModelRendererName("root");
        this.registerModelRenderer(root);

        Body = new AnimatedModelRenderer(this);
        Body.setRotationPoint(0.0F, 16.0F, -12.0F);
        root.addChild(Body);
        Body.setTextureOffset(0, 40).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 7.0F, 16.0F, 0.0F, false);
        Body.setModelRendererName("Body");
        this.registerModelRenderer(Body);

        Upper_Jaw = new AnimatedModelRenderer(this);
        Upper_Jaw.setRotationPoint(0.0F, 3.0F, 1.0F);
        Body.addChild(Upper_Jaw);
        Upper_Jaw.setTextureOffset(0, 22).addBox(-2.5F, -3.0F, -11.7F, 5.0F, 7.0F, 11.0F, 0.0F, false);
        Upper_Jaw.setModelRendererName("Upper_Jaw");
        this.registerModelRenderer(Upper_Jaw);

        Eyeinnerside1 = new AnimatedModelRenderer(this);
        Eyeinnerside1.setRotationPoint(2.0F, -2.3F, -8.9F);
        Upper_Jaw.addChild(Eyeinnerside1);
        Eyeinnerside1.setTextureOffset(15, 16).addBox(0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, true);
        Eyeinnerside1.setModelRendererName("Eyeinnerside1");
        this.registerModelRenderer(Eyeinnerside1);

        Eyeouterside1 = new AnimatedModelRenderer(this);
        Eyeouterside1.setRotationPoint(0.0F, -0.4F, -0.4F);
        Eyeinnerside1.addChild(Eyeouterside1);
        Eyeouterside1.setTextureOffset(0, 14).addBox(-0.8F, 0.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);
        Eyeouterside1.setModelRendererName("Eyeouterside1");
        this.registerModelRenderer(Eyeouterside1);

        Eyeinnerside2 = new AnimatedModelRenderer(this);
        Eyeinnerside2.setRotationPoint(-2.5F, -2.3F, -8.9F);
        Upper_Jaw.addChild(Eyeinnerside2);
        Eyeinnerside2.setTextureOffset(15, 16).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
        Eyeinnerside2.setModelRendererName("Eyeinnerside2");
        this.registerModelRenderer(Eyeinnerside2);

        Eyeouterside2 = new AnimatedModelRenderer(this);
        Eyeouterside2.setRotationPoint(0.0F, -0.4F, -0.4F);
        Eyeinnerside2.addChild(Eyeouterside2);
        Eyeouterside2.setTextureOffset(0, 14).addBox(-1.8F, 0.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, true);
        Eyeouterside2.setModelRendererName("Eyeouterside2");
        this.registerModelRenderer(Eyeouterside2);

        Upper_teeth_side_2 = new AnimatedModelRenderer(this);
        Upper_teeth_side_2.setRotationPoint(-2.4F, 3.2F, -11.5F);
        Upper_Jaw.addChild(Upper_teeth_side_2);
        Upper_teeth_side_2.setTextureOffset(0, 36).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 7.0F, 0.0F, false);
        Upper_teeth_side_2.setModelRendererName("Upper_teeth_side_2");
        this.registerModelRenderer(Upper_teeth_side_2);

        Upper_teeth_side_1 = new AnimatedModelRenderer(this);
        Upper_teeth_side_1.setRotationPoint(2.4F, 3.2F, -11.5F);
        Upper_Jaw.addChild(Upper_teeth_side_1);
        Upper_teeth_side_1.setTextureOffset(0, 36).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 7.0F, 0.0F, false);
        Upper_teeth_side_1.setModelRendererName("Upper_teeth_side_1");
        this.registerModelRenderer(Upper_teeth_side_1);

        Front_upper_teeth = new AnimatedModelRenderer(this);
        Front_upper_teeth.setRotationPoint(0.0F, 3.2F, -11.3F);
        Upper_Jaw.addChild(Front_upper_teeth);
        Front_upper_teeth.setTextureOffset(0, 44).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 1.0F, 0.0F, 0.0F, false);
        Front_upper_teeth.setModelRendererName("Front_upper_teeth");
        this.registerModelRenderer(Front_upper_teeth);

        Lower_jaw = new AnimatedModelRenderer(this);
        Lower_jaw.setRotationPoint(0.0F, 7.5F, 1.0F);
        Body.addChild(Lower_jaw);
        setRotationAngle(Lower_jaw, 0.3187F, 0.0F, 0.0F);
        Lower_jaw.setTextureOffset(32, 27).addBox(-2.5F, -0.5F, -11.3F, 5.0F, 1.0F, 12.0F, 0.0F, false);
        Lower_jaw.setModelRendererName("Lower_jaw");
        this.registerModelRenderer(Lower_jaw);

        Fronttooth = new AnimatedModelRenderer(this);
        Fronttooth.setRotationPoint(0.0F, -1.0F, -11.9F);
        Lower_jaw.addChild(Fronttooth);
        setRotationAngle(Fronttooth, 0.2731F, 0.0F, 0.0F);
        Fronttooth.setTextureOffset(32, 35).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        Fronttooth.setModelRendererName("Fronttooth");
        this.registerModelRenderer(Fronttooth);

        Teeth_side_1 = new AnimatedModelRenderer(this);
        Teeth_side_1.setRotationPoint(2.4F, -1.0F, -9.8F);
        Lower_jaw.addChild(Teeth_side_1);
        Teeth_side_1.setTextureOffset(0, 32).addBox(0.0F, -0.8F, 0.0F, 0.0F, 2.0F, 8.0F, 0.0F, false);
        Teeth_side_1.setModelRendererName("Teeth_side_1");
        this.registerModelRenderer(Teeth_side_1);

        Teeth_side_2 = new AnimatedModelRenderer(this);
        Teeth_side_2.setRotationPoint(-2.4F, -1.0F, -9.8F);
        Lower_jaw.addChild(Teeth_side_2);
        Teeth_side_2.setTextureOffset(0, 32).addBox(0.0F, -0.8F, 0.0F, 0.0F, 2.0F, 8.0F, 0.0F, false);
        Teeth_side_2.setModelRendererName("Teeth_side_2");
        this.registerModelRenderer(Teeth_side_2);

        Front_tooth_side_2 = new AnimatedModelRenderer(this);
        Front_tooth_side_2.setRotationPoint(-2.4F, -1.0F, -11.0F);
        Lower_jaw.addChild(Front_tooth_side_2);
        setRotationAngle(Front_tooth_side_2, 0.192F, 0.0F, 0.0F);
        Front_tooth_side_2.setTextureOffset(36, 35).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        Front_tooth_side_2.setModelRendererName("Front_tooth_side_2");
        this.registerModelRenderer(Front_tooth_side_2);

        Front_tooth_side_1 = new AnimatedModelRenderer(this);
        Front_tooth_side_1.setRotationPoint(2.4F, -1.0F, -11.0F);
        Lower_jaw.addChild(Front_tooth_side_1);
        setRotationAngle(Front_tooth_side_1, 0.192F, 0.0F, 0.0F);
        Front_tooth_side_1.setTextureOffset(36, 35).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        Front_tooth_side_1.setModelRendererName("Front_tooth_side_1");
        this.registerModelRenderer(Front_tooth_side_1);

        Barbel_joint = new AnimatedModelRenderer(this);
        Barbel_joint.setRotationPoint(0.0F, 0.5F, -5.0F);
        Lower_jaw.addChild(Barbel_joint);
        setRotationAngle(Barbel_joint, 0.8196F, 0.0F, 0.0F);
        Barbel_joint.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, 0.0F, false);
        Barbel_joint.setModelRendererName("Barbel_joint");
        this.registerModelRenderer(Barbel_joint);

        Barbel = new AnimatedModelRenderer(this);
        Barbel.setRotationPoint(0.4F, -0.5F, 0.0F);
        Barbel_joint.addChild(Barbel);
        setRotationAngle(Barbel, -0.3794F, 0.0F, 0.0F);
        Barbel.setTextureOffset(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F, false);
        Barbel.setModelRendererName("Barbel");
        this.registerModelRenderer(Barbel);

        Barbel_tip = new AnimatedModelRenderer(this);
        Barbel_tip.setRotationPoint(0.5F, 7.9F, 0.05F);
        Barbel.addChild(Barbel_tip);
        setRotationAngle(Barbel_tip, -0.0705F, 0.0F, 0.0F);
        Barbel_tip.setTextureOffset(18, 9).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        Barbel_tip.setModelRendererName("Barbel_tip");
        this.registerModelRenderer(Barbel_tip);

        Barbel_tip_appandage = new AnimatedModelRenderer(this);
        Barbel_tip_appandage.setRotationPoint(-0.5F, 1.6F, 0.0F);
        Barbel_tip.addChild(Barbel_tip_appandage);
        setRotationAngle(Barbel_tip_appandage, 0.2396F, 0.0051F, 0.0F);
        Barbel_tip_appandage.setTextureOffset(23, 7).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
        Barbel_tip_appandage.setModelRendererName("Barbel_tip_appandage");
        this.registerModelRenderer(Barbel_tip_appandage);

        Tail = new AnimatedModelRenderer(this);
        Tail.setRotationPoint(0.0F, 3.0F, 15.3F);
        Body.addChild(Tail);
        Tail.setTextureOffset(43, 45).addBox(-1.0F, -2.8F, 0.0F, 2.0F, 6.0F, 11.0F, 0.0F, false);
        Tail.setModelRendererName("Tail");
        this.registerModelRenderer(Tail);

        Dorsal_fin = new AnimatedModelRenderer(this);
        Dorsal_fin.setRotationPoint(0.0F, -3.0F, 4.4F);
        Tail.addChild(Dorsal_fin);
        Dorsal_fin.setTextureOffset(70, 37).addBox(0.0F, -3.3F, 0.0F, 0.0F, 5.0F, 6.0F, 0.0F, false);
        Dorsal_fin.setModelRendererName("Dorsal_fin");
        this.registerModelRenderer(Dorsal_fin);

        Anal_fin = new AnimatedModelRenderer(this);
        Anal_fin.setRotationPoint(0.0F, 3.0F, 5.0F);
        Tail.addChild(Anal_fin);
        Anal_fin.setTextureOffset(70, 31).addBox(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 6.0F, 0.0F, false);
        Anal_fin.setModelRendererName("Anal_fin");
        this.registerModelRenderer(Anal_fin);

        Caudal_fin = new AnimatedModelRenderer(this);
        Caudal_fin.setRotationPoint(0.0F, 0.0F, 11.0F);
        Tail.addChild(Caudal_fin);
        Caudal_fin.setTextureOffset(70, 37).addBox(0.0F, -6.5F, 0.0F, 0.0F, 13.0F, 12.0F, 0.0F, false);
        Caudal_fin.setModelRendererName("Caudal_fin");
        this.registerModelRenderer(Caudal_fin);

        Pectoral_fin_side_1 = new AnimatedModelRenderer(this);
        Pectoral_fin_side_1.setRotationPoint(2.4F, 6.9F, 1.0F);
        Body.addChild(Pectoral_fin_side_1);
        setRotationAngle(Pectoral_fin_side_1, 0.4643F, 0.0F, -0.1396F);
        Pectoral_fin_side_1.setTextureOffset(2, 0).addBox(0.0F, 0.0F, -1.0F, 0.0F, 5.0F, 3.0F, 0.0F, false);
        Pectoral_fin_side_1.setModelRendererName("Pectoral_fin_side_1");
        this.registerModelRenderer(Pectoral_fin_side_1);

        Pectoral_fin_side_2 = new AnimatedModelRenderer(this);
        Pectoral_fin_side_2.setRotationPoint(-2.4F, 6.9F, 1.0F);
        Body.addChild(Pectoral_fin_side_2);
        setRotationAngle(Pectoral_fin_side_2, 0.4643F, 0.0F, 0.1396F);
        Pectoral_fin_side_2.setTextureOffset(2, 0).addBox(0.0F, 0.0F, -1.0F, 0.0F, 5.0F, 3.0F, 0.0F, false);
        Pectoral_fin_side_2.setModelRendererName("Pectoral_fin_side_2");
        this.registerModelRenderer(Pectoral_fin_side_2);

        Pelvic_fin_side_1 = new AnimatedModelRenderer(this);
        Pelvic_fin_side_1.setRotationPoint(2.4F, 6.6F, 10.4F);
        Body.addChild(Pelvic_fin_side_1);
        setRotationAngle(Pelvic_fin_side_1, 0.0349F, 0.0F, -0.1396F);
        Pelvic_fin_side_1.setTextureOffset(8, -1).addBox(0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 5.0F, 0.0F, false);
        Pelvic_fin_side_1.setModelRendererName("Pelvic_fin_side_1");
        this.registerModelRenderer(Pelvic_fin_side_1);

        Pelvic_fin_side_2 = new AnimatedModelRenderer(this);
        Pelvic_fin_side_2.setRotationPoint(-2.4F, 6.6F, 10.4F);
        Body.addChild(Pelvic_fin_side_2);
        setRotationAngle(Pelvic_fin_side_2, 0.0349F, 0.0F, 0.1396F);
        Pelvic_fin_side_2.setTextureOffset(8, -1).addBox(0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 5.0F, 0.0F, false);
        Pelvic_fin_side_2.setModelRendererName("Pelvic_fin_side_2");
        this.registerModelRenderer(Pelvic_fin_side_2);

        this.rootBones.add(root);
    }

    @Override
    public ResourceLocation getAnimationFileLocation() {
        return new ResourceLocation("deep_trenches:animations/smalltooth_dragonfish.json");
    }

}