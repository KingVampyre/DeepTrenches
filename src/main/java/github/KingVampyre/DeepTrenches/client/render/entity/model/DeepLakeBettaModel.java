// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.DeepLakeBettaEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class DeepLakeBettaModel extends AnimatedEntityModel<DeepLakeBettaEntity> {

    private final AnimatedModelRenderer root;
    private final AnimatedModelRenderer Body;
    private final AnimatedModelRenderer Lower_jaw;
    private final AnimatedModelRenderer Lower_jaw_tip;
    private final AnimatedModelRenderer Lower_jaw_front_side_teeth_1;
    private final AnimatedModelRenderer Lower_jaw_front_side_teeth_side_2;
    private final AnimatedModelRenderer Lower_jaw_front_teeth;
    private final AnimatedModelRenderer Lower_jaw_side_teeth_1;
    private final AnimatedModelRenderer Lower_jaw_side_teeth_2;
    private final AnimatedModelRenderer Head;
    private final AnimatedModelRenderer Snout;
    private final AnimatedModelRenderer Dorsal_fin;
    private final AnimatedModelRenderer Caudal_fin;
    private final AnimatedModelRenderer Pectoral_fin_1;
    private final AnimatedModelRenderer Bioluminescent_appandage_1;
    private final AnimatedModelRenderer Pectoral_fin_2;
    private final AnimatedModelRenderer Bioluminescent_appandage_2;

    public DeepLakeBettaModel() {
        textureWidth = 64;
        textureHeight = 32;
        root = new AnimatedModelRenderer(this);
        root.setRotationPoint(0.0F, 0.0F, 0.0F);

        root.setModelRendererName("root");
        this.registerModelRenderer(root);

        Body = new AnimatedModelRenderer(this);
        Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        root.addChild(Body);
        Body.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 6.0F, 6.0F, 0.0F, false);
        Body.setModelRendererName("Body");
        this.registerModelRenderer(Body);

        Lower_jaw = new AnimatedModelRenderer(this);
        Lower_jaw.setRotationPoint(0.0F, 4.1F, 2.0F);
        Body.addChild(Lower_jaw);
        setRotationAngle(Lower_jaw, 0.0F, 0.0F, 0.0F);
        Lower_jaw.setTextureOffset(20, 9).addBox(-2.0F, -1.0F, -5.7F, 4.0F, 2.0F, 4.0F, 0.0F, false);
        Lower_jaw.setModelRendererName("Lower_jaw");
        this.registerModelRenderer(Lower_jaw);

        Lower_jaw_tip = new AnimatedModelRenderer(this);
        Lower_jaw_tip.setRotationPoint(0.0F, -1.0F, -5.7F);
        Lower_jaw.addChild(Lower_jaw_tip);
        Lower_jaw_tip.setTextureOffset(36, 11).addBox(-1.5F, 0.0F, -1.8F, 3.0F, 1.0F, 2.0F, 0.0F, false);
        Lower_jaw_tip.setModelRendererName("Lower_jaw_tip");
        this.registerModelRenderer(Lower_jaw_tip);

        Lower_jaw_front_side_teeth_1 = new AnimatedModelRenderer(this);
        Lower_jaw_front_side_teeth_1.setRotationPoint(1.4F, 0.0F, 0.0F);
        Lower_jaw_tip.addChild(Lower_jaw_front_side_teeth_1);
        Lower_jaw_front_side_teeth_1.setTextureOffset(29, 14).addBox(0.0F, -1.5F, -1.7F, 0.0F, 2.0F, 2.0F, 0.0F, false);
        Lower_jaw_front_side_teeth_1.setModelRendererName("Lower_jaw_front_side_teeth_1");
        this.registerModelRenderer(Lower_jaw_front_side_teeth_1);

        Lower_jaw_front_side_teeth_side_2 = new AnimatedModelRenderer(this);
        Lower_jaw_front_side_teeth_side_2.setRotationPoint(-1.4F, 0.0F, 0.0F);
        Lower_jaw_tip.addChild(Lower_jaw_front_side_teeth_side_2);
        Lower_jaw_front_side_teeth_side_2.setTextureOffset(29, 14).addBox(0.0F, -1.5F, -1.7F, 0.0F, 2.0F, 2.0F, 0.0F, false);
        Lower_jaw_front_side_teeth_side_2.setModelRendererName("Lower_jaw_front_side_teeth_side_2");
        this.registerModelRenderer(Lower_jaw_front_side_teeth_side_2);

        Lower_jaw_front_teeth = new AnimatedModelRenderer(this);
        Lower_jaw_front_teeth.setRotationPoint(0.0F, 0.0F, -1.69F);
        Lower_jaw_tip.addChild(Lower_jaw_front_teeth);
        Lower_jaw_front_teeth.setTextureOffset(34, 16).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, false);
        Lower_jaw_front_teeth.setModelRendererName("Lower_jaw_front_teeth");
        this.registerModelRenderer(Lower_jaw_front_teeth);

        Lower_jaw_side_teeth_1 = new AnimatedModelRenderer(this);
        Lower_jaw_side_teeth_1.setRotationPoint(1.9F, -1.0F, -1.0F);
        Lower_jaw.addChild(Lower_jaw_side_teeth_1);
        Lower_jaw_side_teeth_1.setTextureOffset(20, 12).addBox(0.0F, -1.7F, -4.0F, 0.0F, 2.0F, 4.0F, 0.0F, false);
        Lower_jaw_side_teeth_1.setModelRendererName("Lower_jaw_side_teeth_1");
        this.registerModelRenderer(Lower_jaw_side_teeth_1);

        Lower_jaw_side_teeth_2 = new AnimatedModelRenderer(this);
        Lower_jaw_side_teeth_2.setRotationPoint(-1.9F, -1.0F, -1.0F);
        Lower_jaw.addChild(Lower_jaw_side_teeth_2);
        Lower_jaw_side_teeth_2.setTextureOffset(20, 12).addBox(0.0F, -1.7F, -4.0F, 0.0F, 2.0F, 4.0F, 0.0F, false);
        Lower_jaw_side_teeth_2.setModelRendererName("Lower_jaw_side_teeth_2");
        this.registerModelRenderer(Lower_jaw_side_teeth_2);

        Head = new AnimatedModelRenderer(this);
        Head.setRotationPoint(0.0F, 2.0F, 2.0F);
        Body.addChild(Head);
        Head.setTextureOffset(20, 2).addBox(-2.0F, -1.4F, -5.7F, 4.0F, 3.0F, 4.0F, 0.0F, false);
        Head.setModelRendererName("Head");
        this.registerModelRenderer(Head);

        Snout = new AnimatedModelRenderer(this);
        Snout.setRotationPoint(0.0F, 0.0F, -5.6F);
        Head.addChild(Snout);
        Snout.setTextureOffset(36, 4).addBox(-1.5F, -0.4F, -1.8F, 3.0F, 2.0F, 2.0F, 0.0F, false);
        Snout.setModelRendererName("Snout");
        this.registerModelRenderer(Snout);

        Dorsal_fin = new AnimatedModelRenderer(this);
        Dorsal_fin.setRotationPoint(0.0F, 0.0F, 0.0F);
        Body.addChild(Dorsal_fin);
        Dorsal_fin.setTextureOffset(0, 7).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F, false);
        Dorsal_fin.setModelRendererName("Dorsal_fin");
        this.registerModelRenderer(Dorsal_fin);

        Caudal_fin = new AnimatedModelRenderer(this);
        Caudal_fin.setRotationPoint(0.0F, 2.5F, 4.0F);
        Body.addChild(Caudal_fin);
        Caudal_fin.setTextureOffset(0, 8).addBox(0.0F, -5.5F, 0.0F, 0.0F, 11.0F, 11.0F, 0.0F, false);
        Caudal_fin.setModelRendererName("Caudal_fin");
        this.registerModelRenderer(Caudal_fin);

        Pectoral_fin_1 = new AnimatedModelRenderer(this);
        Pectoral_fin_1.setRotationPoint(-1.9F, 5.3F, 0.0F);
        Body.addChild(Pectoral_fin_1);
        Pectoral_fin_1.setTextureOffset(48, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 4.0F, 0.0F, false);
        Pectoral_fin_1.setModelRendererName("Pectoral_fin_1");
        this.registerModelRenderer(Pectoral_fin_1);

        Bioluminescent_appandage_1 = new AnimatedModelRenderer(this);
        Bioluminescent_appandage_1.setRotationPoint(0.5F, 7.5F, 0.0F);
        Pectoral_fin_1.addChild(Bioluminescent_appandage_1);
        Bioluminescent_appandage_1.setTextureOffset(48, 13).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        Bioluminescent_appandage_1.setModelRendererName("Bioluminescent_appandage_1");
        this.registerModelRenderer(Bioluminescent_appandage_1);

        Pectoral_fin_2 = new AnimatedModelRenderer(this);
        Pectoral_fin_2.setRotationPoint(1.9F, 5.3F, -0.1F);
        Body.addChild(Pectoral_fin_2);
        Pectoral_fin_2.setTextureOffset(48, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 4.0F, 0.0F, false);
        Pectoral_fin_2.setModelRendererName("Pectoral_fin_2");
        this.registerModelRenderer(Pectoral_fin_2);

        Bioluminescent_appandage_2 = new AnimatedModelRenderer(this);
        Bioluminescent_appandage_2.setRotationPoint(0.5F, 7.5F, 0.0F);
        Pectoral_fin_2.addChild(Bioluminescent_appandage_2);
        Bioluminescent_appandage_2.setTextureOffset(48, 13).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        Bioluminescent_appandage_2.setModelRendererName("Bioluminescent_appandage_2");
        this.registerModelRenderer(Bioluminescent_appandage_2);

        this.rootBones.add(root);
    }


    @Override
    public ResourceLocation getAnimationFileLocation() {
        return new ResourceLocation("deep_trenches:animations/deep_lake_betta.json");
    }
}