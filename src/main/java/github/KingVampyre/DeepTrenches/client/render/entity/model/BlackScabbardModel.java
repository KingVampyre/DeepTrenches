// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BlackScabbardEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class BlackScabbardModel extends AnimatedEntityModel<BlackScabbardEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer Body;
	private final AnimatedModelRenderer Head;
	private final AnimatedModelRenderer Snout;
	private final AnimatedModelRenderer Snout_tip;
	private final AnimatedModelRenderer Front_tooth_1;
	private final AnimatedModelRenderer Front_tooth_2;
	private final AnimatedModelRenderer Upper_jaw_front_tip_tooth;
	private final AnimatedModelRenderer Snout_teeth_1;
	private final AnimatedModelRenderer Snout_teeth_2;
	private final AnimatedModelRenderer Back_teeth_1;
	private final AnimatedModelRenderer Back_teeth_2;
	private final AnimatedModelRenderer Body_rear;
	private final AnimatedModelRenderer Caudal_fin;
	private final AnimatedModelRenderer Dorsal_fin_rear;
	private final AnimatedModelRenderer Anal_fin;
	private final AnimatedModelRenderer Lower_jaw;
	private final AnimatedModelRenderer Lower_jaw_front;
	private final AnimatedModelRenderer Lower_jaw_tip;
	private final AnimatedModelRenderer Lower_jaw_tip_teeth_1;
	private final AnimatedModelRenderer Lower_jaw_tip_teeth_2;
	private final AnimatedModelRenderer Lower_jaw_front_teeth_1;
	private final AnimatedModelRenderer Lower_jaw_front_teeth_2;
	private final AnimatedModelRenderer Lower_jaw_back_teeth_1;
	private final AnimatedModelRenderer Lower_jaw_back_teeth_2;
	private final AnimatedModelRenderer Dorsal_fin;
	private final AnimatedModelRenderer Pectoral_fin_1;
	private final AnimatedModelRenderer Pectoral_fin_2;

    public BlackScabbardModel()
    {
        textureWidth = 64;
    textureHeight = 32;
    root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, 0.0F, 0.0F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		Body = new AnimatedModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, -3.9F);
		root.addChild(Body);
		Body.setTextureOffset(25, 5).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 12.0F, 0.0F, false);
		Body.setModelRendererName("Body");
		this.registerModelRenderer(Body);

		Head = new AnimatedModelRenderer(this);
		Head.setRotationPoint(0.0F, -0.1F, 0.0F);
		Body.addChild(Head);
		Head.setTextureOffset(0, 0).addBox(-1.5F, -1.5F, -3.2F, 3.0F, 3.0F, 4.0F, 0.0F, false);
		Head.setModelRendererName("Head");
		this.registerModelRenderer(Head);

		Snout = new AnimatedModelRenderer(this);
		Snout.setRotationPoint(0.0F, 0.5F, -3.2F);
		Head.addChild(Snout);
		Snout.setTextureOffset(6, 8).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		Snout.setModelRendererName("Snout");
		this.registerModelRenderer(Snout);

		Snout_tip = new AnimatedModelRenderer(this);
		Snout_tip.setRotationPoint(0.0F, 0.3F, -3.0F);
		Snout.addChild(Snout_tip);
		Snout_tip.setTextureOffset(0, 10).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Snout_tip.setModelRendererName("Snout_tip");
		this.registerModelRenderer(Snout_tip);

		Front_tooth_1 = new AnimatedModelRenderer(this);
		Front_tooth_1.setRotationPoint(0.4F, 0.0F, -1.3F);
		Snout_tip.addChild(Front_tooth_1);
		Front_tooth_1.setTextureOffset(3, 28).addBox(0.0F, -0.3F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Front_tooth_1.setModelRendererName("Front_tooth_1");
		this.registerModelRenderer(Front_tooth_1);

		Front_tooth_2 = new AnimatedModelRenderer(this);
		Front_tooth_2.setRotationPoint(-0.4F, 0.0F, -1.3F);
		Snout_tip.addChild(Front_tooth_2);
		Front_tooth_2.setTextureOffset(3, 28).addBox(0.0F, -0.3F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Front_tooth_2.setModelRendererName("Front_tooth_2");
		this.registerModelRenderer(Front_tooth_2);

		Upper_jaw_front_tip_tooth = new AnimatedModelRenderer(this);
		Upper_jaw_front_tip_tooth.setRotationPoint(0.0F, 0.0F, -1.5F);
		Snout_tip.addChild(Upper_jaw_front_tip_tooth);
		setRotationAngle(Upper_jaw_front_tip_tooth, -0.2276F, 0.0F, 0.0F);
		Upper_jaw_front_tip_tooth.setTextureOffset(0, 28).addBox(0.0F, 0.3F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Upper_jaw_front_tip_tooth.setModelRendererName("Upper_jaw_front_tip_tooth");
		this.registerModelRenderer(Upper_jaw_front_tip_tooth);

		Snout_teeth_1 = new AnimatedModelRenderer(this);
		Snout_teeth_1.setRotationPoint(0.9F, 0.0F, 0.0F);
		Snout.addChild(Snout_teeth_1);
		Snout_teeth_1.setTextureOffset(6, 26).addBox(0.0F, 0.4F, -3.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);
		Snout_teeth_1.setModelRendererName("Snout_teeth_1");
		this.registerModelRenderer(Snout_teeth_1);

		Snout_teeth_2 = new AnimatedModelRenderer(this);
		Snout_teeth_2.setRotationPoint(-0.9F, 0.0F, 0.0F);
		Snout.addChild(Snout_teeth_2);
		Snout_teeth_2.setTextureOffset(6, 26).addBox(0.0F, 0.4F, -3.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);
		Snout_teeth_2.setModelRendererName("Snout_teeth_2");
		this.registerModelRenderer(Snout_teeth_2);

		Back_teeth_1 = new AnimatedModelRenderer(this);
		Back_teeth_1.setRotationPoint(1.4F, 0.5F, 1.0F);
		Head.addChild(Back_teeth_1);
		Back_teeth_1.setTextureOffset(13, 25).addBox(0.0F, 0.4F, -4.0F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		Back_teeth_1.setModelRendererName("Back_teeth_1");
		this.registerModelRenderer(Back_teeth_1);

		Back_teeth_2 = new AnimatedModelRenderer(this);
		Back_teeth_2.setRotationPoint(-1.4F, 0.5F, 1.0F);
		Head.addChild(Back_teeth_2);
		Back_teeth_2.setTextureOffset(13, 25).addBox(0.0F, 0.4F, -4.0F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		Back_teeth_2.setModelRendererName("Back_teeth_2");
		this.registerModelRenderer(Back_teeth_2);

		Body_rear = new AnimatedModelRenderer(this);
		Body_rear.setRotationPoint(0.0F, 0.0F, 11.9F);
		Body.addChild(Body_rear);
		Body_rear.setTextureOffset(31, 21).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 8.0F, 0.0F, false);
		Body_rear.setModelRendererName("Body_rear");
		this.registerModelRenderer(Body_rear);

		Caudal_fin = new AnimatedModelRenderer(this);
		Caudal_fin.setRotationPoint(0.0F, 0.0F, 7.9F);
		Body_rear.addChild(Caudal_fin);
		Caudal_fin.setTextureOffset(0, 16).addBox(0.0F, -2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 0.0F, false);
		Caudal_fin.setModelRendererName("Caudal_fin");
		this.registerModelRenderer(Caudal_fin);

		Dorsal_fin_rear = new AnimatedModelRenderer(this);
		Dorsal_fin_rear.setRotationPoint(0.0F, -1.5F, -1.1F);
		Body_rear.addChild(Dorsal_fin_rear);
		Dorsal_fin_rear.setTextureOffset(0, 9).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 10.0F, 0.0F, false);
		Dorsal_fin_rear.setModelRendererName("Dorsal_fin_rear");
		this.registerModelRenderer(Dorsal_fin_rear);

		Anal_fin = new AnimatedModelRenderer(this);
		Anal_fin.setRotationPoint(0.0F, 1.5F, 1.3F);
		Body_rear.addChild(Anal_fin);
		Anal_fin.setTextureOffset(0, 20).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 7.0F, 0.0F, false);
		Anal_fin.setModelRendererName("Anal_fin");
		this.registerModelRenderer(Anal_fin);

		Lower_jaw = new AnimatedModelRenderer(this);
		Lower_jaw.setRotationPoint(0.0F, 1.0F, 0.8F);
		Body.addChild(Lower_jaw);
		setRotationAngle(Lower_jaw, 0.1367F, 0.0F, 0.0F);
		Lower_jaw.setTextureOffset(14, 0).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		Lower_jaw.setModelRendererName("Lower_jaw");
		this.registerModelRenderer(Lower_jaw);

		Lower_jaw_front = new AnimatedModelRenderer(this);
		Lower_jaw_front.setRotationPoint(0.0F, 0.0F, -4.0F);
		Lower_jaw.addChild(Lower_jaw_front);
		setRotationAngle(Lower_jaw_front, 0.0F, 0.0F, 0.0063F);
		Lower_jaw_front.setTextureOffset(28, 1).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		Lower_jaw_front.setModelRendererName("Lower_jaw_front");
		this.registerModelRenderer(Lower_jaw_front);

		Lower_jaw_tip = new AnimatedModelRenderer(this);
		Lower_jaw_tip.setRotationPoint(0.0F, 0.0F, -3.0F);
		Lower_jaw_front.addChild(Lower_jaw_tip);
		Lower_jaw_tip.setTextureOffset(29, 5).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Lower_jaw_tip.setModelRendererName("Lower_jaw_tip");
		this.registerModelRenderer(Lower_jaw_tip);

		Lower_jaw_tip_teeth_1 = new AnimatedModelRenderer(this);
		Lower_jaw_tip_teeth_1.setRotationPoint(0.4F, 0.0F, -2.0F);
		Lower_jaw_tip.addChild(Lower_jaw_tip_teeth_1);
		Lower_jaw_tip_teeth_1.setTextureOffset(15, 25).addBox(0.0F, -0.4F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);
		Lower_jaw_tip_teeth_1.setModelRendererName("Lower_jaw_tip_teeth_1");
		this.registerModelRenderer(Lower_jaw_tip_teeth_1);

		Lower_jaw_tip_teeth_2 = new AnimatedModelRenderer(this);
		Lower_jaw_tip_teeth_2.setRotationPoint(-0.8F, 0.0F, 0.0F);
		Lower_jaw_tip_teeth_1.addChild(Lower_jaw_tip_teeth_2);
		Lower_jaw_tip_teeth_2.setTextureOffset(15, 25).addBox(0.0F, -0.4F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);
		Lower_jaw_tip_teeth_2.setModelRendererName("Lower_jaw_tip_teeth_2");
		this.registerModelRenderer(Lower_jaw_tip_teeth_2);

		Lower_jaw_front_teeth_1 = new AnimatedModelRenderer(this);
		Lower_jaw_front_teeth_1.setRotationPoint(0.9F, 0.0F, 0.0F);
		Lower_jaw_front.addChild(Lower_jaw_front_teeth_1);
		Lower_jaw_front_teeth_1.setTextureOffset(29, 24).addBox(0.0F, -0.8F, -3.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);
		Lower_jaw_front_teeth_1.setModelRendererName("Lower_jaw_front_teeth_1");
		this.registerModelRenderer(Lower_jaw_front_teeth_1);

		Lower_jaw_front_teeth_2 = new AnimatedModelRenderer(this);
		Lower_jaw_front_teeth_2.setRotationPoint(-0.9F, 0.0F, 0.0F);
		Lower_jaw_front.addChild(Lower_jaw_front_teeth_2);
		Lower_jaw_front_teeth_2.setTextureOffset(29, 24).addBox(0.0F, -0.8F, -3.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);
		Lower_jaw_front_teeth_2.setModelRendererName("Lower_jaw_front_teeth_2");
		this.registerModelRenderer(Lower_jaw_front_teeth_2);

		Lower_jaw_back_teeth_1 = new AnimatedModelRenderer(this);
		Lower_jaw_back_teeth_1.setRotationPoint(1.4F, 0.0F, 0.0F);
		Lower_jaw.addChild(Lower_jaw_back_teeth_1);
		Lower_jaw_back_teeth_1.setTextureOffset(20, 23).addBox(0.0F, -0.6F, -4.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);
		Lower_jaw_back_teeth_1.setModelRendererName("Lower_jaw_back_teeth_1");
		this.registerModelRenderer(Lower_jaw_back_teeth_1);

		Lower_jaw_back_teeth_2 = new AnimatedModelRenderer(this);
		Lower_jaw_back_teeth_2.setRotationPoint(-1.4F, 0.0F, 0.0F);
		Lower_jaw.addChild(Lower_jaw_back_teeth_2);
		Lower_jaw_back_teeth_2.setTextureOffset(20, 23).addBox(0.0F, -0.6F, -4.0F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		Lower_jaw_back_teeth_2.setModelRendererName("Lower_jaw_back_teeth_2");
		this.registerModelRenderer(Lower_jaw_back_teeth_2);

		Dorsal_fin = new AnimatedModelRenderer(this);
		Dorsal_fin.setRotationPoint(0.0F, -1.5F, 0.1F);
		Body.addChild(Dorsal_fin);
		Dorsal_fin.setTextureOffset(0, 4).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 12.0F, 0.0F, false);
		Dorsal_fin.setModelRendererName("Dorsal_fin");
		this.registerModelRenderer(Dorsal_fin);

		Pectoral_fin_1 = new AnimatedModelRenderer(this);
		Pectoral_fin_1.setRotationPoint(1.4F, 0.0F, 0.1F);
		Body.addChild(Pectoral_fin_1);
		setRotationAngle(Pectoral_fin_1, 0.2731F, 0.2276F, 0.0F);
		Pectoral_fin_1.setTextureOffset(19, 6).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 3.0F, 0.0F, false);
		Pectoral_fin_1.setModelRendererName("Pectoral_fin_1");
		this.registerModelRenderer(Pectoral_fin_1);

		Pectoral_fin_2 = new AnimatedModelRenderer(this);
		Pectoral_fin_2.setRotationPoint(-1.4F, 0.0F, 0.0F);
		Body.addChild(Pectoral_fin_2);
		setRotationAngle(Pectoral_fin_2, 0.2731F, -0.2276F, 0.0F);
		Pectoral_fin_2.setTextureOffset(19, 6).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 3.0F, 0.0F, false);
		Pectoral_fin_2.setModelRendererName("Pectoral_fin_2");
		this.registerModelRenderer(Pectoral_fin_2);

    this.rootBones.add(root);
  }


    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation("deep_trenches", "animations/black_scabbard.json");
    }
}