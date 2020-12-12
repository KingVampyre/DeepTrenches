// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BlackDragonfishEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class BlackDragonfishModel extends AnimatedEntityModel<BlackDragonfishEntity> {

    private final AnimatedModelRenderer root;
    private final AnimatedModelRenderer Body;
    private final AnimatedModelRenderer Caudal_area;
    private final AnimatedModelRenderer Caudal_fin;
    private final AnimatedModelRenderer Caudal_fin_rear;
    private final AnimatedModelRenderer Pelvic_fin_2;
    private final AnimatedModelRenderer Pelvic_fin_1;
    private final AnimatedModelRenderer Upper_jaw;
    private final AnimatedModelRenderer Snout;
    private final AnimatedModelRenderer Upper_jaw_teeth_1;
    private final AnimatedModelRenderer Upper_jaw_teeth_front;
    private final AnimatedModelRenderer Upper_jaw_teeth_3;
    private final AnimatedModelRenderer Eye_lens_1;
    private final AnimatedModelRenderer Eye_lens_2;
    private final AnimatedModelRenderer Lower_jaw;
    private final AnimatedModelRenderer Lower_jaw_teeth_1;
    private final AnimatedModelRenderer Lower_jaw_tooth;
    private final AnimatedModelRenderer Lower_jaw_teeth_2;
    private final AnimatedModelRenderer barbel_root;
    private final AnimatedModelRenderer barbel;
    private final AnimatedModelRenderer barbel_lure;

    public BlackDragonfishModel() {
        textureWidth = 70;
        textureHeight = 70;
        root = new AnimatedModelRenderer(this);
        root.setRotationPoint(0.0F, 0.0F, 0.0F);

        root.setModelRendererName("root");
        this.registerModelRenderer(root);

        Body = new AnimatedModelRenderer(this);
        Body.setRotationPoint(0.0F, 0.0F, -0.1F);
        root.addChild(Body);
        Body.setTextureOffset(0, 0).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 13.0F, 0.0F, false);
        Body.setModelRendererName("Body");
        this.registerModelRenderer(Body);

        Caudal_area = new AnimatedModelRenderer(this);
        Caudal_area.setRotationPoint(0.0F, 0.0F, 12.0F);
        Body.addChild(Caudal_area);
        Caudal_area.setTextureOffset(0, 18).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 15.0F, 0.0F, false);
        Caudal_area.setModelRendererName("Caudal_area");
        this.registerModelRenderer(Caudal_area);

        Caudal_fin = new AnimatedModelRenderer(this);
        Caudal_fin.setRotationPoint(0.0F, 0.0F, 8.0F);
        Caudal_area.addChild(Caudal_fin);
        Caudal_fin.setTextureOffset(0, 31).addBox(0.0F, -3.5F, 0.0F, 0.0F, 7.0F, 7.0F, 0.0F, false);
        Caudal_fin.setModelRendererName("Caudal_fin");
        this.registerModelRenderer(Caudal_fin);

        Caudal_fin_rear = new AnimatedModelRenderer(this);
        Caudal_fin_rear.setRotationPoint(0.0F, 0.0F, 5.0F);
        Caudal_fin.addChild(Caudal_fin_rear);
        Caudal_fin_rear.setTextureOffset(0, 28).addBox(0.0F, -3.5F, 0.0F, 0.0F, 7.0F, 18.0F, 0.0F, false);
        Caudal_fin_rear.setModelRendererName("Caudal_fin_rear");
        this.registerModelRenderer(Caudal_fin_rear);

        Pelvic_fin_2 = new AnimatedModelRenderer(this);
        Pelvic_fin_2.setRotationPoint(1.5F, 2.0F, 8.5F);
        Caudal_area.addChild(Pelvic_fin_2);
        setRotationAngle(Pelvic_fin_2, 0.2276F, 0.0F, -0.1367F);
        Pelvic_fin_2.setTextureOffset(23, 35).addBox(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 3.0F, 0.0F, false);
        Pelvic_fin_2.setModelRendererName("Pelvic_fin_2");
        this.registerModelRenderer(Pelvic_fin_2);

        Pelvic_fin_1 = new AnimatedModelRenderer(this);
        Pelvic_fin_1.setRotationPoint(-1.5F, 2.0F, 8.5F);
        Caudal_area.addChild(Pelvic_fin_1);
        setRotationAngle(Pelvic_fin_1, 0.182F, 0.0F, 0.1367F);
        Pelvic_fin_1.setTextureOffset(23, 35).addBox(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 3.0F, 0.0F, false);
        Pelvic_fin_1.setModelRendererName("Pelvic_fin_1");
        this.registerModelRenderer(Pelvic_fin_1);

        Upper_jaw = new AnimatedModelRenderer(this);
        Upper_jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        Body.addChild(Upper_jaw);
        Upper_jaw.setTextureOffset(34, 8).addBox(-1.5F, -2.0F, -4.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);
        Upper_jaw.setModelRendererName("Upper_jaw");
        this.registerModelRenderer(Upper_jaw);

        Snout = new AnimatedModelRenderer(this);
        Snout.setRotationPoint(0.0F, 0.0F, -4.0F);
        Upper_jaw.addChild(Snout);
        Snout.setTextureOffset(39, 3).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        Snout.setModelRendererName("Snout");
        this.registerModelRenderer(Snout);

        Upper_jaw_teeth_1 = new AnimatedModelRenderer(this);
        Upper_jaw_teeth_1.setRotationPoint(-1.3F, 0.5F, 0.0F);
        Upper_jaw.addChild(Upper_jaw_teeth_1);
        Upper_jaw_teeth_1.setTextureOffset(46, 2).addBox(0.0F, 0.0F, -5.0F, 0.0F, 2.0F, 5.0F, 0.0F, false);
        Upper_jaw_teeth_1.setModelRendererName("Upper_jaw_teeth_1");
        this.registerModelRenderer(Upper_jaw_teeth_1);

        Upper_jaw_teeth_front = new AnimatedModelRenderer(this);
        Upper_jaw_teeth_front.setRotationPoint(0.0F, 0.5F, -4.8F);
        Upper_jaw.addChild(Upper_jaw_teeth_front);
        Upper_jaw_teeth_front.setTextureOffset(50, 5).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 0.0F, 0.0F, false);
        Upper_jaw_teeth_front.setModelRendererName("Upper_jaw_teeth_front");
        this.registerModelRenderer(Upper_jaw_teeth_front);

        Upper_jaw_teeth_3 = new AnimatedModelRenderer(this);
        Upper_jaw_teeth_3.setRotationPoint(1.5F, 0.5F, 0.0F);
        Upper_jaw.addChild(Upper_jaw_teeth_3);
        Upper_jaw_teeth_3.setTextureOffset(46, 2).addBox(0.0F, 0.0F, -5.0F, 0.0F, 2.0F, 5.0F, 0.0F, false);
        Upper_jaw_teeth_3.setModelRendererName("Upper_jaw_teeth_3");
        this.registerModelRenderer(Upper_jaw_teeth_3);

        Eye_lens_1 = new AnimatedModelRenderer(this);
        Eye_lens_1.setRotationPoint(-1.0F, -0.5F, -2.5F);
        Upper_jaw.addChild(Eye_lens_1);
        Eye_lens_1.setTextureOffset(32, 0).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Eye_lens_1.setModelRendererName("Eye_lens_1");
        this.registerModelRenderer(Eye_lens_1);

        Eye_lens_2 = new AnimatedModelRenderer(this);
        Eye_lens_2.setRotationPoint(1.5F, -0.5F, -2.5F);
        Upper_jaw.addChild(Eye_lens_2);
        Eye_lens_2.setTextureOffset(32, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Eye_lens_2.setModelRendererName("Eye_lens_2");
        this.registerModelRenderer(Eye_lens_2);

        Lower_jaw = new AnimatedModelRenderer(this);
        Lower_jaw.setRotationPoint(0.0F, 0.5F, 0.0F);
        Body.addChild(Lower_jaw);
        setRotationAngle(Lower_jaw, 0.5463F, 0.0F, 0.0F);
        Lower_jaw.setTextureOffset(32, 17).addBox(-1.5F, 0.5F, -5.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);
        Lower_jaw.setModelRendererName("Lower_jaw");
        this.registerModelRenderer(Lower_jaw);

        Lower_jaw_teeth_1 = new AnimatedModelRenderer(this);
        Lower_jaw_teeth_1.setRotationPoint(-1.4F, 0.0F, 0.0F);
        Lower_jaw.addChild(Lower_jaw_teeth_1);
        Lower_jaw_teeth_1.setTextureOffset(58, 1).addBox(0.0F, -2.5F, -5.5F, 0.0F, 3.0F, 5.0F, 0.0F, false);
        Lower_jaw_teeth_1.setModelRendererName("Lower_jaw_teeth_1");
        this.registerModelRenderer(Lower_jaw_teeth_1);

        Lower_jaw_tooth = new AnimatedModelRenderer(this);
        Lower_jaw_tooth.setRotationPoint(0.0F, 0.0F, -5.0F);
        Lower_jaw.addChild(Lower_jaw_tooth);
        setRotationAngle(Lower_jaw_tooth, 0.2276F, 0.0F, 0.0F);
        Lower_jaw_tooth.setTextureOffset(50, 9).addBox(0.0F, -1.5F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        Lower_jaw_tooth.setModelRendererName("Lower_jaw_tooth");
        this.registerModelRenderer(Lower_jaw_tooth);

        Lower_jaw_teeth_2 = new AnimatedModelRenderer(this);
        Lower_jaw_teeth_2.setRotationPoint(1.4F, 0.0F, 0.0F);
        Lower_jaw.addChild(Lower_jaw_teeth_2);
        Lower_jaw_teeth_2.setTextureOffset(58, 1).addBox(0.0F, -2.5F, -5.5F, 0.0F, 3.0F, 5.0F, 0.0F, false);
        Lower_jaw_teeth_2.setModelRendererName("Lower_jaw_teeth_2");
        this.registerModelRenderer(Lower_jaw_teeth_2);

        barbel_root = new AnimatedModelRenderer(this);
        barbel_root.setRotationPoint(0.0F, 1.5F, -4.5F);
        Lower_jaw.addChild(barbel_root);
        barbel_root.setTextureOffset(3, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);
        barbel_root.setModelRendererName("barbel_root");
        this.registerModelRenderer(barbel_root);

        barbel = new AnimatedModelRenderer(this);
        barbel.setRotationPoint(0.0F, 0.0F, 0.5F);
        barbel_root.addChild(barbel);
        barbel.setTextureOffset(0, 3).addBox(0.0F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, 0.0F, false);
        barbel.setModelRendererName("barbel");
        this.registerModelRenderer(barbel);

        barbel_lure = new AnimatedModelRenderer(this);
        barbel_lure.setRotationPoint(0.0F, 6.0F, 0.0F);
        barbel.addChild(barbel_lure);
        barbel_lure.setTextureOffset(0, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        barbel_lure.setModelRendererName("barbel_lure");
        this.registerModelRenderer(barbel_lure);

        this.rootBones.add(root);
    }

    @Override
    public ResourceLocation getAnimationFileLocation() {
        return new ResourceLocation("deep_trenches:animations/black_dragonfish.json");
    }

}