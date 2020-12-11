// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.LancetfishEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class LancetfishModel extends AnimatedEntityModel<LancetfishEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer Body_front_part;
	private final AnimatedModelRenderer Body_rear_part;
	private final AnimatedModelRenderer Caudal;
	private final AnimatedModelRenderer Dorsal_rear;
	private final AnimatedModelRenderer Pelvic_fin_1;
	private final AnimatedModelRenderer Pelvic_fin_2;
	private final AnimatedModelRenderer Anal_fin;
	private final AnimatedModelRenderer Dorsal_front;
	private final AnimatedModelRenderer Head;
	private final AnimatedModelRenderer Head_nose;
	private final AnimatedModelRenderer Upper_tooth_1;
	private final AnimatedModelRenderer Upper_tooth_2;
	private final AnimatedModelRenderer Upper_jaw_teeth_front_1;
	private final AnimatedModelRenderer Upper_jaw_teeth_front_2;
	private final AnimatedModelRenderer Upper_jaw_teeth_front;
	private final AnimatedModelRenderer Upper_tooth_small_1;
	private final AnimatedModelRenderer Upper_tooth_small_2;
	private final AnimatedModelRenderer Upper_teeth_rear_1;
	private final AnimatedModelRenderer Upper_jaw_rear_teeth_2;
	private final AnimatedModelRenderer Lower_jaw;
	private final AnimatedModelRenderer Lower_jaw_pointy;
	private final AnimatedModelRenderer Tooth_3;
	private final AnimatedModelRenderer Tooth_4;
	private final AnimatedModelRenderer Lower_jaw_teeth_front_1;
	private final AnimatedModelRenderer Lower_jaw_teeth_front_2;
	private final AnimatedModelRenderer Tooth_3_2;
	private final AnimatedModelRenderer Tooth_2;
	private final AnimatedModelRenderer Tooth_1_2;
	private final AnimatedModelRenderer Tooth_2_2;
	private final AnimatedModelRenderer Tooth_1;
	private final AnimatedModelRenderer Lower_jaw_teeth_front;
	private final AnimatedModelRenderer Lower_jaw_teeth_rear_1;
	private final AnimatedModelRenderer Lower_jaw_rear_teeth_2;
	private final AnimatedModelRenderer Pectoral_fin_1;
	private final AnimatedModelRenderer Pectoral_fin_2;

    public LancetfishModel()
    {
        textureWidth = 72;
    textureHeight = 45;
    root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, 0.0F, 0.0F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		Body_front_part = new AnimatedModelRenderer(this);
		Body_front_part.setRotationPoint(0.0F, 0.0F, 0.0F);
		root.addChild(Body_front_part);
		Body_front_part.setTextureOffset(17, 0).addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 13.0F, 0.0F, false);
		Body_front_part.setModelRendererName("Body_front_part");
		this.registerModelRenderer(Body_front_part);

		Body_rear_part = new AnimatedModelRenderer(this);
		Body_rear_part.setRotationPoint(0.0F, 0.0F, 12.9F);
		Body_front_part.addChild(Body_rear_part);
		Body_rear_part.setTextureOffset(40, 5).addBox(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 13.0F, 0.0F, false);
		Body_rear_part.setModelRendererName("Body_rear_part");
		this.registerModelRenderer(Body_rear_part);

		Caudal = new AnimatedModelRenderer(this);
		Caudal.setRotationPoint(0.0F, 0.0F, 13.0F);
		Body_rear_part.addChild(Caudal);
		Caudal.setTextureOffset(23, 16).addBox(0.0F, -5.0F, 0.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
		Caudal.setModelRendererName("Caudal");
		this.registerModelRenderer(Caudal);

		Dorsal_rear = new AnimatedModelRenderer(this);
		Dorsal_rear.setRotationPoint(0.0F, -2.0F, 0.0F);
		Body_rear_part.addChild(Dorsal_rear);
		Dorsal_rear.setTextureOffset(40, 19).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 12.0F, 0.0F, false);
		Dorsal_rear.setModelRendererName("Dorsal_rear");
		this.registerModelRenderer(Dorsal_rear);

		Pelvic_fin_1 = new AnimatedModelRenderer(this);
		Pelvic_fin_1.setRotationPoint(1.5F, 2.0F, 0.0F);
		Body_rear_part.addChild(Pelvic_fin_1);
		Pelvic_fin_1.setTextureOffset(68, 22).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 2.0F, 0.0F, false);
		Pelvic_fin_1.setModelRendererName("Pelvic_fin_1");
		this.registerModelRenderer(Pelvic_fin_1);

		Pelvic_fin_2 = new AnimatedModelRenderer(this);
		Pelvic_fin_2.setRotationPoint(-1.5F, 2.0F, 0.0F);
		Body_rear_part.addChild(Pelvic_fin_2);
		setRotationAngle(Pelvic_fin_2, 0.0178F, 0.0F, 0.0F);
		Pelvic_fin_2.setTextureOffset(68, 21).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 2.0F, 0.0F, false);
		Pelvic_fin_2.setModelRendererName("Pelvic_fin_2");
		this.registerModelRenderer(Pelvic_fin_2);

		Anal_fin = new AnimatedModelRenderer(this);
		Anal_fin.setRotationPoint(0.0F, 2.5F, 9.5F);
		Body_rear_part.addChild(Anal_fin);
		Anal_fin.setTextureOffset(64, 32).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 0.0F, false);
		Anal_fin.setModelRendererName("Anal_fin");
		this.registerModelRenderer(Anal_fin);

		Dorsal_front = new AnimatedModelRenderer(this);
		Dorsal_front.setRotationPoint(0.0F, -2.0F, 0.0F);
		Body_front_part.addChild(Dorsal_front);
		Dorsal_front.setTextureOffset(40, 10).addBox(0.0F, -8.0F, 0.0F, 0.0F, 8.0F, 13.0F, 0.0F, false);
		Dorsal_front.setModelRendererName("Dorsal_front");
		this.registerModelRenderer(Dorsal_front);

		Head = new AnimatedModelRenderer(this);
		Head.setRotationPoint(0.0F, -1.0F, 0.0F);
		Body_front_part.addChild(Head);
		Head.setTextureOffset(6, 3).addBox(-2.5F, -1.5F, -6.4F, 5.0F, 3.0F, 7.0F, 0.0F, false);
		Head.setModelRendererName("Head");
		this.registerModelRenderer(Head);

		Head_nose = new AnimatedModelRenderer(this);
		Head_nose.setRotationPoint(0.0F, 1.0F, -6.4F);
		Head.addChild(Head_nose);
		Head_nose.setTextureOffset(6, 36).addBox(-2.0F, -1.5F, -5.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);
		Head_nose.setModelRendererName("Head_nose");
		this.registerModelRenderer(Head_nose);

		Upper_tooth_1 = new AnimatedModelRenderer(this);
		Upper_tooth_1.setRotationPoint(1.6F, -0.1F, -3.5F);
		Head_nose.addChild(Upper_tooth_1);
		setRotationAngle(Upper_tooth_1, -0.182F, 0.0F, 0.0F);
		Upper_tooth_1.setTextureOffset(40, 6).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		Upper_tooth_1.setModelRendererName("Upper_tooth_1");
		this.registerModelRenderer(Upper_tooth_1);

		Upper_tooth_2 = new AnimatedModelRenderer(this);
		Upper_tooth_2.setRotationPoint(-1.6F, -0.1F, -3.5F);
		Head_nose.addChild(Upper_tooth_2);
		setRotationAngle(Upper_tooth_2, -0.182F, 0.0F, 0.0F);
		Upper_tooth_2.setTextureOffset(40, 6).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		Upper_tooth_2.setModelRendererName("Upper_tooth_2");
		this.registerModelRenderer(Upper_tooth_2);

		Upper_jaw_teeth_front_1 = new AnimatedModelRenderer(this);
		Upper_jaw_teeth_front_1.setRotationPoint(1.9F, 0.0F, -5.0F);
		Head_nose.addChild(Upper_jaw_teeth_front_1);
		Upper_jaw_teeth_front_1.setTextureOffset(40, 32).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 0.0F, false);
		Upper_jaw_teeth_front_1.setModelRendererName("Upper_jaw_teeth_front_1");
		this.registerModelRenderer(Upper_jaw_teeth_front_1);

		Upper_jaw_teeth_front_2 = new AnimatedModelRenderer(this);
		Upper_jaw_teeth_front_2.setRotationPoint(-1.9F, 0.0F, -5.0F);
		Head_nose.addChild(Upper_jaw_teeth_front_2);
		Upper_jaw_teeth_front_2.setTextureOffset(40, 32).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 0.0F, false);
		Upper_jaw_teeth_front_2.setModelRendererName("Upper_jaw_teeth_front_1");
		this.registerModelRenderer(Upper_jaw_teeth_front_2);

		Upper_jaw_teeth_front = new AnimatedModelRenderer(this);
		Upper_jaw_teeth_front.setRotationPoint(0.0F, 0.0F, -4.9F);
		Head_nose.addChild(Upper_jaw_teeth_front);
		Upper_jaw_teeth_front.setTextureOffset(31, 19).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 0.0F, 0.0F, false);
		Upper_jaw_teeth_front.setModelRendererName("Upper_jaw_teeth_front");
		this.registerModelRenderer(Upper_jaw_teeth_front);

		Upper_tooth_small_1 = new AnimatedModelRenderer(this);
		Upper_tooth_small_1.setRotationPoint(2.49F, 1.4F, -5.3F);
		Head.addChild(Upper_tooth_small_1);
		setRotationAngle(Upper_tooth_small_1, -0.2105F, 0.0F, 0.0F);
		Upper_tooth_small_1.setTextureOffset(43, 8).addBox(0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Upper_tooth_small_1.setModelRendererName("Upper_tooth_small_1");
		this.registerModelRenderer(Upper_tooth_small_1);

		Upper_tooth_small_2 = new AnimatedModelRenderer(this);
		Upper_tooth_small_2.setRotationPoint(-2.49F, 1.4F, -5.3F);
		Head.addChild(Upper_tooth_small_2);
		setRotationAngle(Upper_tooth_small_2, -0.2105F, 0.0F, 0.0F);
		Upper_tooth_small_2.setTextureOffset(43, 8).addBox(0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Upper_tooth_small_2.setModelRendererName("Upper_tooth_small_2");
		this.registerModelRenderer(Upper_tooth_small_2);

		Upper_teeth_rear_1 = new AnimatedModelRenderer(this);
		Upper_teeth_rear_1.setRotationPoint(2.4F, 0.8F, -6.4F);
		Head.addChild(Upper_teeth_rear_1);
		Upper_teeth_rear_1.setTextureOffset(40, 5).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 6.0F, 0.0F, false);
		Upper_teeth_rear_1.setModelRendererName("Upper_teeth_rear_1");
		this.registerModelRenderer(Upper_teeth_rear_1);

		Upper_jaw_rear_teeth_2 = new AnimatedModelRenderer(this);
		Upper_jaw_rear_teeth_2.setRotationPoint(-2.4F, 0.8F, -6.4F);
		Head.addChild(Upper_jaw_rear_teeth_2);
		Upper_jaw_rear_teeth_2.setTextureOffset(40, 5).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 6.0F, 0.0F, false);
		Upper_jaw_rear_teeth_2.setModelRendererName("Upper_jaw_rear_teeth_2");
		this.registerModelRenderer(Upper_jaw_rear_teeth_2);

		Lower_jaw = new AnimatedModelRenderer(this);
		Lower_jaw.setRotationPoint(0.0F, 1.5F, 0.2F);
		Body_front_part.addChild(Lower_jaw);
		setRotationAngle(Lower_jaw, 0.1367F, 0.0F, 0.0F);
		Lower_jaw.setTextureOffset(6, 27).addBox(-2.5F, -1.0F, -7.0F, 5.0F, 2.0F, 7.0F, 0.0F, false);
		Lower_jaw.setModelRendererName("Lower_jaw");
		this.registerModelRenderer(Lower_jaw);

		Lower_jaw_pointy = new AnimatedModelRenderer(this);
		Lower_jaw_pointy.setRotationPoint(0.0F, -0.2F, -7.0F);
		Lower_jaw.addChild(Lower_jaw_pointy);
		Lower_jaw_pointy.setTextureOffset(24, 36).addBox(-2.0F, -0.5F, -5.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		Lower_jaw_pointy.setModelRendererName("Lower_jaw_pointy");
		this.registerModelRenderer(Lower_jaw_pointy);

		Tooth_3 = new AnimatedModelRenderer(this);
		Tooth_3.setRotationPoint(1.2F, 0.0F, -2.8F);
		Lower_jaw_pointy.addChild(Tooth_3);
		setRotationAngle(Tooth_3, 0.182F, 0.0F, 0.0F);
		Tooth_3.setTextureOffset(46, 40).addBox(0.0F, -1.7F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Tooth_3.setModelRendererName("Tooth_3");
		this.registerModelRenderer(Tooth_3);

		Tooth_4 = new AnimatedModelRenderer(this);
		Tooth_4.setRotationPoint(0.0F, -0.7F, -4.9F);
		Lower_jaw_pointy.addChild(Tooth_4);
		setRotationAngle(Tooth_4, 0.3643F, 0.0F, 0.0F);
		Tooth_4.setTextureOffset(43, 40).addBox(0.0F, -1.6F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Tooth_4.setModelRendererName("Tooth_4");
		this.registerModelRenderer(Tooth_4);

		Lower_jaw_teeth_front_1 = new AnimatedModelRenderer(this);
		Lower_jaw_teeth_front_1.setRotationPoint(1.9F, -0.5F, -5.0F);
		Lower_jaw_pointy.addChild(Lower_jaw_teeth_front_1);
		setRotationAngle(Lower_jaw_teeth_front_1, 0.0F, 0.0F, 0.014F);
		Lower_jaw_teeth_front_1.setTextureOffset(40, 31).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 0.0F, false);
		Lower_jaw_teeth_front_1.setModelRendererName("Lower_jaw_teeth_front_1");
		this.registerModelRenderer(Lower_jaw_teeth_front_1);

		Lower_jaw_teeth_front_2 = new AnimatedModelRenderer(this);
		Lower_jaw_teeth_front_2.setRotationPoint(-1.9F, -0.5F, -5.0F);
		Lower_jaw_pointy.addChild(Lower_jaw_teeth_front_2);
		setRotationAngle(Lower_jaw_teeth_front_2, 0.0F, 0.0F, -0.014F);
		Lower_jaw_teeth_front_2.setTextureOffset(40, 31).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 0.0F, false);
		Lower_jaw_teeth_front_2.setModelRendererName("Lower_jaw_teeth_front_2");
		this.registerModelRenderer(Lower_jaw_teeth_front_2);

		Tooth_3_2 = new AnimatedModelRenderer(this);
		Tooth_3_2.setRotationPoint(-1.2F, 0.0F, -2.8F);
		Lower_jaw_pointy.addChild(Tooth_3_2);
		setRotationAngle(Tooth_3_2, 0.182F, 0.0F, 0.0F);
		Tooth_3_2.setTextureOffset(46, 40).addBox(0.0F, -1.7F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Tooth_3_2.setModelRendererName("Tooth_3_2");
		this.registerModelRenderer(Tooth_3_2);

		Tooth_2 = new AnimatedModelRenderer(this);
		Tooth_2.setRotationPoint(1.5F, 0.0F, -0.2F);
		Lower_jaw_pointy.addChild(Tooth_2);
		Tooth_2.setTextureOffset(52, 40).addBox(0.0F, -1.6F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Tooth_2.setModelRendererName("Tooth_2");
		this.registerModelRenderer(Tooth_2);

		Tooth_1_2 = new AnimatedModelRenderer(this);
		Tooth_1_2.setRotationPoint(-1.3F, 0.0F, -1.4F);
		Lower_jaw_pointy.addChild(Tooth_1_2);
		setRotationAngle(Tooth_1_2, 0.2339F, 0.0F, 0.0F);
		Tooth_1_2.setTextureOffset(49, 40).addBox(0.0F, -2.6F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		Tooth_1_2.setModelRendererName("Tooth_1_2");
		this.registerModelRenderer(Tooth_1_2);

		Tooth_2_2 = new AnimatedModelRenderer(this);
		Tooth_2_2.setRotationPoint(-1.5F, 0.0F, -0.2F);
		Lower_jaw_pointy.addChild(Tooth_2_2);
		Tooth_2_2.setTextureOffset(52, 40).addBox(0.0F, -1.6F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Tooth_2_2.setModelRendererName("Tooth_2_2");
		this.registerModelRenderer(Tooth_2_2);

		Tooth_1 = new AnimatedModelRenderer(this);
		Tooth_1.setRotationPoint(1.3F, 0.0F, -1.2F);
		Lower_jaw_pointy.addChild(Tooth_1);
		setRotationAngle(Tooth_1, 0.2339F, 0.0F, 0.0F);
		Tooth_1.setTextureOffset(49, 40).addBox(0.0F, -2.6F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		Tooth_1.setModelRendererName("Tooth_1");
		this.registerModelRenderer(Tooth_1);

		Lower_jaw_teeth_front = new AnimatedModelRenderer(this);
		Lower_jaw_teeth_front.setRotationPoint(0.0F, 0.0F, -4.9F);
		Lower_jaw_pointy.addChild(Lower_jaw_teeth_front);
		Lower_jaw_teeth_front.setTextureOffset(31, 20).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, 0.0F, false);
		Lower_jaw_teeth_front.setModelRendererName("Lower_jaw_teeth_front");
		this.registerModelRenderer(Lower_jaw_teeth_front);

		Lower_jaw_teeth_rear_1 = new AnimatedModelRenderer(this);
		Lower_jaw_teeth_rear_1.setRotationPoint(2.4F, -1.0F, -6.8F);
		Lower_jaw.addChild(Lower_jaw_teeth_rear_1);
		Lower_jaw_teeth_rear_1.setTextureOffset(40, 33).addBox(0.0F, -0.4F, 0.0F, 0.0F, 1.0F, 6.0F, 0.0F, false);
		Lower_jaw_teeth_rear_1.setModelRendererName("Lower_jaw_teeth_rear_1");
		this.registerModelRenderer(Lower_jaw_teeth_rear_1);

		Lower_jaw_rear_teeth_2 = new AnimatedModelRenderer(this);
		Lower_jaw_rear_teeth_2.setRotationPoint(-2.4F, -1.0F, -6.8F);
		Lower_jaw.addChild(Lower_jaw_rear_teeth_2);
		Lower_jaw_rear_teeth_2.setTextureOffset(40, 33).addBox(0.0F, -0.4F, 0.0F, 0.0F, 1.0F, 6.0F, 0.0F, false);
		Lower_jaw_rear_teeth_2.setModelRendererName("Lower_jaw_rear_teeth_2");
		this.registerModelRenderer(Lower_jaw_rear_teeth_2);

		Pectoral_fin_1 = new AnimatedModelRenderer(this);
		Pectoral_fin_1.setRotationPoint(2.5F, 2.1F, 1.5F);
		Body_front_part.addChild(Pectoral_fin_1);
		setRotationAngle(Pectoral_fin_1, 0.182F, 0.0F, 0.0F);
		Pectoral_fin_1.setTextureOffset(7, 15).addBox(0.0F, 0.0F, -1.5F, 0.0F, 8.0F, 4.0F, 0.0F, false);
		Pectoral_fin_1.setModelRendererName("Pectoral_fin_1");
		this.registerModelRenderer(Pectoral_fin_1);

		Pectoral_fin_2 = new AnimatedModelRenderer(this);
		Pectoral_fin_2.setRotationPoint(-2.5F, 2.1F, 1.5F);
		Body_front_part.addChild(Pectoral_fin_2);
		setRotationAngle(Pectoral_fin_2, 0.182F, 0.0F, 0.0F);
		Pectoral_fin_2.setTextureOffset(7, 15).addBox(0.0F, 0.0F, -1.5F, 0.0F, 8.0F, 4.0F, 0.0F, false);
		Pectoral_fin_2.setModelRendererName("Pectoral_fin_2");
		this.registerModelRenderer(Pectoral_fin_2);

    this.rootBones.add(root);
  }


    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation("deep_trenches", "animations/lancetfish.json");
    }
}