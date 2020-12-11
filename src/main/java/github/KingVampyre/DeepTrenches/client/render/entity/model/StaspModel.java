// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class StaspModel extends AnimatedEntityModel<StaspEntity> {

    private final AnimatedModelRenderer root;
    private final AnimatedModelRenderer Body;
    private final AnimatedModelRenderer Trunk;
    private final AnimatedModelRenderer Abdomen;
    private final AnimatedModelRenderer Dart;
    private final AnimatedModelRenderer Eyes;
    private final AnimatedModelRenderer Antenas;
    private final AnimatedModelRenderer Legs_1;
    private final AnimatedModelRenderer Legs_2;
    private final AnimatedModelRenderer Legs_3;
    private final AnimatedModelRenderer Wing_1;
    private final AnimatedModelRenderer Wing_2;

    public StaspModel() {
        textureWidth = 64;
        textureHeight = 32;
        root = new AnimatedModelRenderer(this);
        root.setRotationPoint(0.0F, 0.0F, 0.0F);

        root.setModelRendererName("root");
        this.registerModelRenderer(root);

        Body = new AnimatedModelRenderer(this);
        Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        root.addChild(Body);
        Body.setTextureOffset(0, 8).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 4.0F, 6.0F, 0.0F, false);
        Body.setModelRendererName("Body");
        this.registerModelRenderer(Body);

        Trunk = new AnimatedModelRenderer(this);
        Trunk.setRotationPoint(-2.0F, 2.0F, 6.0F);
        Body.addChild(Trunk);
        setRotationAngle(Trunk, -0.3185F, 0.0F, 0.0F);
        Trunk.setTextureOffset(18, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        Trunk.setModelRendererName("Trunk");
        this.registerModelRenderer(Trunk);

        Abdomen = new AnimatedModelRenderer(this);
        Abdomen.setRotationPoint(0.0F, 0.0F, 6.0F);
        Trunk.addChild(Abdomen);
        Abdomen.setTextureOffset(36, 0).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 7.0F, 0.0F, false);
        Abdomen.setModelRendererName("Abdomen");
        this.registerModelRenderer(Abdomen);

        Dart = new AnimatedModelRenderer(this);
        Dart.setRotationPoint(-0.5F, 0.0F, 6.2F);
        Abdomen.addChild(Dart);
        setRotationAngle(Dart, 0.6829F, 0.0F, 0.0F);
        Dart.setTextureOffset(53, 9).addBox(0.5F, 0.0F, 0.0F, 0.0F, 7.0F, 1.0F, 0.0F, false);
        Dart.setModelRendererName("Dart");
        this.registerModelRenderer(Dart);

        Eyes = new AnimatedModelRenderer(this);
        Eyes.setRotationPoint(1.0F, -1.0F, -1.0F);
        Body.addChild(Eyes);
        Eyes.setTextureOffset(0, 0).addBox(-6.0F, 0.0F, 0.0F, 6.0F, 4.0F, 4.0F, 0.0F, false);
        Eyes.setModelRendererName("Eyes");
        this.registerModelRenderer(Eyes);

        Antenas = new AnimatedModelRenderer(this);
        Antenas.setRotationPoint(-3.0F, 0.4F, 0.0F);
        Eyes.addChild(Antenas);
        setRotationAngle(Antenas, -0.0456F, 0.0F, 0.0F);
        Antenas.setTextureOffset(22, 17).addBox(-4.0F, -0.4F, -12.7F, 8.0F, 0.0F, 13.0F, 0.0F, false);
        Antenas.setModelRendererName("Antenas");
        this.registerModelRenderer(Antenas);

        Legs_1 = new AnimatedModelRenderer(this);
        Legs_1.setRotationPoint(-2.0F, 4.0F, 0.8F);
        Body.addChild(Legs_1);
        setRotationAngle(Legs_1, 0.182F, 0.0F, 0.0F);
        Legs_1.setTextureOffset(0, 19).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 0.0F, 0.0F, false);
        Legs_1.setModelRendererName("Legs_1");
        this.registerModelRenderer(Legs_1);

        Legs_2 = new AnimatedModelRenderer(this);
        Legs_2.setRotationPoint(-2.0F, 4.0F, 1.7F);
        Body.addChild(Legs_2);
        setRotationAngle(Legs_2, 0.182F, 0.0F, 0.0F);
        Legs_2.setTextureOffset(0, 24).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 0.0F, 0.0F, false);
        Legs_2.setModelRendererName("Legs_2");
        this.registerModelRenderer(Legs_2);

        Legs_3 = new AnimatedModelRenderer(this);
        Legs_3.setRotationPoint(-2.0F, 4.0F, 2.6F);
        Body.addChild(Legs_3);
        setRotationAngle(Legs_3, 0.182F, 0.0F, 0.0F);
        Legs_3.setTextureOffset(9, 24).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 0.0F, 0.0F, false);
        Legs_3.setModelRendererName("Legs_3");
        this.registerModelRenderer(Legs_3);

        Wing_1 = new AnimatedModelRenderer(this);
        Wing_1.setRotationPoint(-2.0F, 1.0F, 4.8F);
        Body.addChild(Wing_1);
        setRotationAngle(Wing_1, 0.2276F, 0.0F, 0.0F);
        Wing_1.setTextureOffset(8, 17).addBox(0.0F, -0.6F, 0.0F, 6.0F, 0.0F, 13.0F, 0.0F, true);
        Wing_1.setModelRendererName("Wing_1");
        this.registerModelRenderer(Wing_1);

        Wing_2 = new AnimatedModelRenderer(this);
        Wing_2.setRotationPoint(-2.0F, 1.0F, 4.8F);
        Body.addChild(Wing_2);
        setRotationAngle(Wing_2, 0.2276F, 0.0F, 0.0F);
        Wing_2.setTextureOffset(8, 17).addBox(-6.0F, -0.6F, 0.0F, 6.0F, 0.0F, 13.0F, 0.0F, false);
        Wing_2.setModelRendererName("Wing_2");
        this.registerModelRenderer(Wing_2);

        this.rootBones.add(root);
    }

    @Override
    public ResourceLocation getAnimationFileLocation() {
        return new ResourceLocation("deep_trenches:animations/stasp.json");
    }

}