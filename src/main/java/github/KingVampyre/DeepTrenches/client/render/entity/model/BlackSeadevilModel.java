// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BlackSeadevilEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class BlackSeadevilModel extends AnimatedEntityModel<BlackSeadevilEntity> {

    private final AnimatedModelRenderer root;
    private final AnimatedModelRenderer Body;
    private final AnimatedModelRenderer Upper_jaw;
    private final AnimatedModelRenderer Lure;
    private final AnimatedModelRenderer Bioluminescent_organ;
    private final AnimatedModelRenderer Upper_jaw_teeth_side_1;
    private final AnimatedModelRenderer Upper_jaw_teeth_side_2;
    private final AnimatedModelRenderer Upper_jaw_fang_1;
    private final AnimatedModelRenderer Upper_jaw_fang_2;
    private final AnimatedModelRenderer Upper_jaw_tooth_1;
    private final AnimatedModelRenderer Upper_jaw_tooth_2;
    private final AnimatedModelRenderer Eye_1;
    private final AnimatedModelRenderer Eye_2;
    private final AnimatedModelRenderer Tail;
    private final AnimatedModelRenderer Pectoral_fin_1;
    private final AnimatedModelRenderer Pectoral_fin_2;
    private final AnimatedModelRenderer Lower_jaw_joint;
    private final AnimatedModelRenderer Lower_jaw;
    private final AnimatedModelRenderer Lower_jaw_teeth_side_2;
    private final AnimatedModelRenderer Lower_jaw_teeth_side_1;
    private final AnimatedModelRenderer Lower_jaw_fang_1;
    private final AnimatedModelRenderer Lower_jaw_fang_2;
    private final AnimatedModelRenderer Lower_jaw_tooth_1;

    public BlackSeadevilModel() {
        textureWidth = 64;
        textureHeight = 32;
        root = new AnimatedModelRenderer(this);
        root.setRotationPoint(0.0F, 0.0F, 0.0F);

        root.setModelRendererName("root");
        this.registerModelRenderer(root);

        Body = new AnimatedModelRenderer(this);
        Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        root.addChild(Body);
        setRotationAngle(Body, 0.0F, 0.0F, 0.0F);
        Body.setTextureOffset(0, 0).addBox(-2.0F, -3.5F, 0.0F, 4.0F, 7.0F, 6.0F, 0.0F, false);
        Body.setModelRendererName("Body");
        this.registerModelRenderer(Body);

        Upper_jaw = new AnimatedModelRenderer(this);
        Upper_jaw.setRotationPoint(0.0F, -1.5F, 0.0F);
        Body.addChild(Upper_jaw);
        Upper_jaw.setTextureOffset(21, 7).addBox(-2.0F, -1.0F, -2.3F, 4.0F, 2.0F, 3.0F, 0.0F, false);
        Upper_jaw.setModelRendererName("Upper_jaw");
        this.registerModelRenderer(Upper_jaw);

        Lure = new AnimatedModelRenderer(this);
        Lure.setRotationPoint(0.0F, 0.0F, -3.0F);
        Upper_jaw.addChild(Lure);
        setRotationAngle(Lure, 0.182F, 0.0F, 0.0F);
        Lure.setTextureOffset(25, 2).addBox(0.0F, -2.4F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
        Lure.setModelRendererName("Lure");
        this.registerModelRenderer(Lure);

        Bioluminescent_organ = new AnimatedModelRenderer(this);
        Bioluminescent_organ.setRotationPoint(0.0F, -2.7F, 0.0F);
        Lure.addChild(Bioluminescent_organ);
        Bioluminescent_organ.setTextureOffset(24, 0).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        Bioluminescent_organ.setModelRendererName("Bioluminescent_organ");
        this.registerModelRenderer(Bioluminescent_organ);

        Upper_jaw_teeth_side_1 = new AnimatedModelRenderer(this);
        Upper_jaw_teeth_side_1.setRotationPoint(1.9F, 0.7F, -2.0F);
        Upper_jaw.addChild(Upper_jaw_teeth_side_1);
        Upper_jaw_teeth_side_1.setTextureOffset(1, 11).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
        Upper_jaw_teeth_side_1.setModelRendererName("Upper_jaw_teeth_side_1");
        this.registerModelRenderer(Upper_jaw_teeth_side_1);

        Upper_jaw_teeth_side_2 = new AnimatedModelRenderer(this);
        Upper_jaw_teeth_side_2.setRotationPoint(-1.9F, 0.7F, -2.0F);
        Upper_jaw.addChild(Upper_jaw_teeth_side_2);
        Upper_jaw_teeth_side_2.setTextureOffset(1, 11).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
        Upper_jaw_teeth_side_2.setModelRendererName("Upper_jaw_teeth_side_2");
        this.registerModelRenderer(Upper_jaw_teeth_side_2);

        Upper_jaw_fang_1 = new AnimatedModelRenderer(this);
        Upper_jaw_fang_1.setRotationPoint(-0.9F, 0.7F, -2.1F);
        Upper_jaw.addChild(Upper_jaw_fang_1);
        setRotationAngle(Upper_jaw_fang_1, 0.1367F, 0.0F, 0.0F);
        Upper_jaw_fang_1.setTextureOffset(2, 15).addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
        Upper_jaw_fang_1.setModelRendererName("Upper_jaw_fang_1");
        this.registerModelRenderer(Upper_jaw_fang_1);

        Upper_jaw_fang_2 = new AnimatedModelRenderer(this);
        Upper_jaw_fang_2.setRotationPoint(1.0F, 0.7F, -2.1F);
        Upper_jaw.addChild(Upper_jaw_fang_2);
        setRotationAngle(Upper_jaw_fang_2, 0.1367F, 0.0F, 0.0F);
        Upper_jaw_fang_2.setTextureOffset(2, 15).addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
        Upper_jaw_fang_2.setModelRendererName("Upper_jaw_fang_2");
        this.registerModelRenderer(Upper_jaw_fang_2);

        Upper_jaw_tooth_1 = new AnimatedModelRenderer(this);
        Upper_jaw_tooth_1.setRotationPoint(1.7F, 0.9F, -2.0F);
        Upper_jaw.addChild(Upper_jaw_tooth_1);
        Upper_jaw_tooth_1.setTextureOffset(0, 16).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        Upper_jaw_tooth_1.setModelRendererName("Upper_jaw_tooth_1");
        this.registerModelRenderer(Upper_jaw_tooth_1);

        Upper_jaw_tooth_2 = new AnimatedModelRenderer(this);
        Upper_jaw_tooth_2.setRotationPoint(-1.7F, 0.9F, -2.0F);
        Upper_jaw.addChild(Upper_jaw_tooth_2);
        Upper_jaw_tooth_2.setTextureOffset(0, 16).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        Upper_jaw_tooth_2.setModelRendererName("Upper_jaw_tooth_2");
        this.registerModelRenderer(Upper_jaw_tooth_2);

        Eye_1 = new AnimatedModelRenderer(this);
        Eye_1.setRotationPoint(1.3F, 0.0F, -1.0F);
        Upper_jaw.addChild(Eye_1);
        Eye_1.setTextureOffset(21, 12).addBox(0.01F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Eye_1.setModelRendererName("Eye_1");
        this.registerModelRenderer(Eye_1);

        Eye_2 = new AnimatedModelRenderer(this);
        Eye_2.setRotationPoint(-1.31F, 0.0F, -0.9F);
        Upper_jaw.addChild(Eye_2);
        Eye_2.setTextureOffset(21, 12).addBox(-1.0F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Eye_2.setModelRendererName("Eye_2");
        this.registerModelRenderer(Eye_2);

        Tail = new AnimatedModelRenderer(this);
        Tail.setRotationPoint(0.0F, -0.3F, 5.5F);
        Body.addChild(Tail);
        Tail.setTextureOffset(10, 6).addBox(0.0F, -2.8F, 0.0F, 0.0F, 6.0F, 8.0F, 0.0F, false);
        Tail.setModelRendererName("Tail");
        this.registerModelRenderer(Tail);

        Pectoral_fin_1 = new AnimatedModelRenderer(this);
        Pectoral_fin_1.setRotationPoint(1.9F, -1.0F, 1.5F);
        Body.addChild(Pectoral_fin_1);
        setRotationAngle(Pectoral_fin_1, 0.3187F, 0.2276F, 0.0F);
        Pectoral_fin_1.setTextureOffset(14, -3).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 0.0F, false);
        Pectoral_fin_1.setModelRendererName("Pectoral_fin_1");
        this.registerModelRenderer(Pectoral_fin_1);

        Pectoral_fin_2 = new AnimatedModelRenderer(this);
        Pectoral_fin_2.setRotationPoint(-1.9F, -1.0F, 1.5F);
        Body.addChild(Pectoral_fin_2);
        setRotationAngle(Pectoral_fin_2, 0.3187F, -0.2276F, 0.0F);
        Pectoral_fin_2.setTextureOffset(14, -3).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 0.0F, false);
        Pectoral_fin_2.setModelRendererName("Pectoral_fin_2");
        this.registerModelRenderer(Pectoral_fin_2);

        Lower_jaw_joint = new AnimatedModelRenderer(this);
        Lower_jaw_joint.setRotationPoint(0.0F, 3.0F, 0.0F);
        Body.addChild(Lower_jaw_joint);
        setRotationAngle(Lower_jaw_joint, 0.7285F, 0.0F, 0.0F);
        Lower_jaw_joint.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        Lower_jaw_joint.setModelRendererName("Lower_jaw_joint");
        this.registerModelRenderer(Lower_jaw_joint);

        Lower_jaw = new AnimatedModelRenderer(this);
        Lower_jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        Body.addChild(Lower_jaw);
        Lower_jaw.setTextureOffset(32, 9).addBox(-2.1F, -1.5F, -3.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
        Lower_jaw.setModelRendererName("Lower_jaw");
        this.registerModelRenderer(Lower_jaw);

        Lower_jaw_teeth_side_2 = new AnimatedModelRenderer(this);
        Lower_jaw_teeth_side_2.setRotationPoint(-1.9F, -1.0F, -1.5F);
        Lower_jaw.addChild(Lower_jaw_teeth_side_2);
        setRotationAngle(Lower_jaw_teeth_side_2, -0.2276F, 0.0F, 0.0F);
        Lower_jaw_teeth_side_2.setTextureOffset(33, 0).addBox(0.0F, -1.7F, -1.5F, 0.0F, 2.0F, 3.0F, 0.0F, false);
        Lower_jaw_teeth_side_2.setModelRendererName("Lower_jaw_teeth_side_2");
        this.registerModelRenderer(Lower_jaw_teeth_side_2);

        Lower_jaw_teeth_side_1 = new AnimatedModelRenderer(this);
        Lower_jaw_teeth_side_1.setRotationPoint(1.8F, -1.0F, -1.5F);
        Lower_jaw.addChild(Lower_jaw_teeth_side_1);
        setRotationAngle(Lower_jaw_teeth_side_1, -0.2276F, 0.0F, 0.0F);
        Lower_jaw_teeth_side_1.setTextureOffset(33, 0).addBox(0.0F, -1.7F, -1.5F, 0.0F, 2.0F, 3.0F, 0.0F, false);
        Lower_jaw_teeth_side_1.setModelRendererName("Lower_jaw_teeth_side_1");
        this.registerModelRenderer(Lower_jaw_teeth_side_1);

        Lower_jaw_fang_1 = new AnimatedModelRenderer(this);
        Lower_jaw_fang_1.setRotationPoint(1.0F, -1.0F, -2.5F);
        Lower_jaw.addChild(Lower_jaw_fang_1);
        Lower_jaw_fang_1.setTextureOffset(35, 5).addBox(0.0F, -2.6F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
        Lower_jaw_fang_1.setModelRendererName("Lower_jaw_fang_1");
        this.registerModelRenderer(Lower_jaw_fang_1);

        Lower_jaw_fang_2 = new AnimatedModelRenderer(this);
        Lower_jaw_fang_2.setRotationPoint(-1.0F, -1.0F, -2.5F);
        Lower_jaw.addChild(Lower_jaw_fang_2);
        Lower_jaw_fang_2.setTextureOffset(35, 5).addBox(0.0F, -2.6F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
        Lower_jaw_fang_2.setModelRendererName("Lower_jaw_fang_2");
        this.registerModelRenderer(Lower_jaw_fang_2);

        Lower_jaw_tooth_1 = new AnimatedModelRenderer(this);
        Lower_jaw_tooth_1.setRotationPoint(-0.2F, -1.5F, -3.0F);
        Lower_jaw.addChild(Lower_jaw_tooth_1);
        Lower_jaw_tooth_1.setTextureOffset(33, 6).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        Lower_jaw_tooth_1.setModelRendererName("Lower_jaw_tooth_1");
        this.registerModelRenderer(Lower_jaw_tooth_1);

        this.rootBones.add(root);
    }

    @Override
    public ResourceLocation getAnimationFileLocation() {
        return new ResourceLocation("deep_trenches:animations/black_seadevil.json");
    }

}