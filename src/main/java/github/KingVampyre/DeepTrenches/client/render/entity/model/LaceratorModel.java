// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.LaceratorEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class LaceratorModel extends AnimatedEntityModel<LaceratorEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer Body;
	private final AnimatedModelRenderer Caudal;
	private final AnimatedModelRenderer Caudal_muscly_part;
	private final AnimatedModelRenderer Caudal_fin_upper_lobe_skin_1;
	private final AnimatedModelRenderer Caudal_fin_upper_lobe;
	private final AnimatedModelRenderer Caudal_fin_lower_lobe_skin_2;
	private final AnimatedModelRenderer Caudal_fin_lower_lobe;
	private final AnimatedModelRenderer Adipose_fin;
	private final AnimatedModelRenderer Anal_fin;
	private final AnimatedModelRenderer Head_rear;
	private final AnimatedModelRenderer Head_front;
	private final AnimatedModelRenderer Snout_rear;
	private final AnimatedModelRenderer Snout_front;
	private final AnimatedModelRenderer Teeth_9;
	private final AnimatedModelRenderer Teeth_10;
	private final AnimatedModelRenderer Tooth_front_upper;
	private final AnimatedModelRenderer Tooth_front_upper_2;
	private final AnimatedModelRenderer Tooth_front_upper_3;
	private final AnimatedModelRenderer Teeth_7;
	private final AnimatedModelRenderer Teeth_8;
	private final AnimatedModelRenderer Teeth_5;
	private final AnimatedModelRenderer Teeth_6;
	private final AnimatedModelRenderer Eye_barrel_1;
	private final AnimatedModelRenderer Eye_1;
	private final AnimatedModelRenderer Eye_lens_1;
	private final AnimatedModelRenderer Eye_barrel_2;
	private final AnimatedModelRenderer Eye_2;
	private final AnimatedModelRenderer Eye_lens_2;
	private final AnimatedModelRenderer Teeth_1;
	private final AnimatedModelRenderer Teeth_2;
	private final AnimatedModelRenderer Teeth_3;
	private final AnimatedModelRenderer Teeth_4;
	private final AnimatedModelRenderer Lower_jaw_rear;
	private final AnimatedModelRenderer Lower_jaw_part_2;
	private final AnimatedModelRenderer Lower_jaw_tip;
	private final AnimatedModelRenderer Teeth_15;
	private final AnimatedModelRenderer Teeth_16;
	private final AnimatedModelRenderer Teeth_17;
	private final AnimatedModelRenderer Teeth_13;
	private final AnimatedModelRenderer Teeth_14;
	private final AnimatedModelRenderer Teeth_11;
	private final AnimatedModelRenderer Teeth_12;
	private final AnimatedModelRenderer Pelvic_fin_1;
	private final AnimatedModelRenderer Pelvic_fin_2;
	private final AnimatedModelRenderer Dorsal_fin_skin;
	private final AnimatedModelRenderer Dorsal_fin;
	private final AnimatedModelRenderer Pectoral_fin_1_joint;
	private final AnimatedModelRenderer Pectoral_fin_skin_1;
	private final AnimatedModelRenderer Pectoral_fin_1;
	private final AnimatedModelRenderer Pectoral_fin_2_joint;
	private final AnimatedModelRenderer Pectoral_fin_skin_2;
	private final AnimatedModelRenderer Pectoral_fin_2;

    public LaceratorModel()
    {
        textureWidth = 664;
    textureHeight = 334;
    root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, 0.0F, 0.0F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		Body = new AnimatedModelRenderer(this);
		Body.setRotationPoint(8.0F, -0.1F, -24.0F);
		root.addChild(Body);
		Body.setTextureOffset(0, 0).addBox(-8.0F, -16.0F, 0.0F, 16.0F, 32.0F, 84.0F, 0.0F, false);
		Body.setModelRendererName("Body");
		this.registerModelRenderer(Body);

		Caudal = new AnimatedModelRenderer(this);
		Caudal.setRotationPoint(0.0F, -1.0F, 81.0F);
		Body.addChild(Caudal);
		Caudal.setTextureOffset(332, 119).addBox(-4.0F, -13.0F, 0.0F, 8.0F, 26.0F, 67.0F, 0.0F, false);
		Caudal.setModelRendererName("Caudal");
		this.registerModelRenderer(Caudal);

		Caudal_muscly_part = new AnimatedModelRenderer(this);
		Caudal_muscly_part.setRotationPoint(0.0F, 0.0F, 67.0F);
		Caudal.addChild(Caudal_muscly_part);
		Caudal_muscly_part.setTextureOffset(150, 164).addBox(-5.0F, -14.0F, 0.0F, 10.0F, 28.0F, 16.0F, 0.0F, false);
		Caudal_muscly_part.setModelRendererName("Caudal_muscly_part");
		this.registerModelRenderer(Caudal_muscly_part);

		Caudal_fin_upper_lobe_skin_1 = new AnimatedModelRenderer(this);
		Caudal_fin_upper_lobe_skin_1.setRotationPoint(0.0F, -14.0F, 8.5F);
		Caudal_muscly_part.addChild(Caudal_fin_upper_lobe_skin_1);
		setRotationAngle(Caudal_fin_upper_lobe_skin_1, -0.2276F, 0.0F, 0.0F);
		Caudal_fin_upper_lobe_skin_1.setTextureOffset(213, 156).addBox(-3.0F, -24.0F, 0.0F, 3.0F, 33.0F, 20.0F, 0.0F, false);
		Caudal_fin_upper_lobe_skin_1.setModelRendererName("Caudal_fin_upper_lobe_skin_1");
		this.registerModelRenderer(Caudal_fin_upper_lobe_skin_1);

		Caudal_fin_upper_lobe = new AnimatedModelRenderer(this);
		Caudal_fin_upper_lobe.setRotationPoint(-1.5F, 9.0F, 7.0F);
		Caudal_fin_upper_lobe_skin_1.addChild(Caudal_fin_upper_lobe);
		Caudal_fin_upper_lobe.setTextureOffset(155, 180).addBox(0.0F, -55.0F, 0.0F, 0.0F, 66.0F, 42.0F, 0.0F, false);
		Caudal_fin_upper_lobe.setModelRendererName("Caudal_fin_upper_lobe");
		this.registerModelRenderer(Caudal_fin_upper_lobe);

		Caudal_fin_lower_lobe_skin_2 = new AnimatedModelRenderer(this);
		Caudal_fin_lower_lobe_skin_2.setRotationPoint(0.0F, 10.0F, 2.8F);
		Caudal_muscly_part.addChild(Caudal_fin_lower_lobe_skin_2);
		setRotationAngle(Caudal_fin_lower_lobe_skin_2, 0.4098F, 0.0F, 0.0F);
		Caudal_fin_lower_lobe_skin_2.setTextureOffset(265, 156).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 32.0F, 20.0F, 0.0F, false);
		Caudal_fin_lower_lobe_skin_2.setModelRendererName("Caudal_fin_lower_lobe_skin_2");
		this.registerModelRenderer(Caudal_fin_lower_lobe_skin_2);

		Caudal_fin_lower_lobe = new AnimatedModelRenderer(this);
		Caudal_fin_lower_lobe.setRotationPoint(-1.5F, -1.1F, 7.0F);
		Caudal_fin_lower_lobe_skin_2.addChild(Caudal_fin_lower_lobe);
		Caudal_fin_lower_lobe.setTextureOffset(241, 177).addBox(0.0F, 0.0F, 0.0F, 0.0F, 66.0F, 44.0F, 0.0F, false);
		Caudal_fin_lower_lobe.setModelRendererName("Caudal_fin_lower_lobe");
		this.registerModelRenderer(Caudal_fin_lower_lobe);

		Adipose_fin = new AnimatedModelRenderer(this);
		Adipose_fin.setRotationPoint(0.0F, -13.0F, 36.0F);
		Caudal.addChild(Adipose_fin);
		Adipose_fin.setTextureOffset(0, 118).addBox(0.0F, -16.0F, 0.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);
		Adipose_fin.setModelRendererName("Adipose_fin");
		this.registerModelRenderer(Adipose_fin);

		Anal_fin = new AnimatedModelRenderer(this);
		Anal_fin.setRotationPoint(0.0F, 13.0F, 32.0F);
		Caudal.addChild(Anal_fin);
		Anal_fin.setTextureOffset(34, 193).addBox(0.0F, 0.0F, 0.0F, 0.0F, 16.0F, 32.0F, 0.0F, false);
		Anal_fin.setModelRendererName("Anal_fin");
		this.registerModelRenderer(Anal_fin);

		Head_rear = new AnimatedModelRenderer(this);
		Head_rear.setRotationPoint(0.0F, -4.0F, 0.0F);
		Body.addChild(Head_rear);
		Head_rear.setTextureOffset(361, 23).addBox(-8.0F, -12.0F, -32.0F, 16.0F, 22.0F, 35.0F, 0.0F, false);
		Head_rear.setModelRendererName("Head_rear");
		this.registerModelRenderer(Head_rear);

		Head_front = new AnimatedModelRenderer(this);
		Head_front.setRotationPoint(-1.0F, -1.0F, -32.0F);
		Head_rear.addChild(Head_front);
		Head_front.setTextureOffset(216, 28).addBox(-7.0F, -7.0F, -11.0F, 14.0F, 14.0F, 11.0F, 0.0F, false);
		Head_front.setModelRendererName("Head_front");
		this.registerModelRenderer(Head_front);

		Snout_rear = new AnimatedModelRenderer(this);
		Snout_rear.setRotationPoint(0.0F, 2.0F, -11.0F);
		Head_front.addChild(Snout_rear);
		Snout_rear.setTextureOffset(269, 27).addBox(-6.0F, -5.0F, -16.0F, 12.0F, 10.0F, 16.0F, 0.0F, false);
		Snout_rear.setModelRendererName("Snout_rear");
		this.registerModelRenderer(Snout_rear);

		Snout_front = new AnimatedModelRenderer(this);
		Snout_front.setRotationPoint(0.0F, 1.0F, -16.0F);
		Snout_rear.addChild(Snout_front);
		setRotationAngle(Snout_front, -0.0911F, 0.0F, 0.0F);
		Snout_front.setTextureOffset(300, 56).addBox(-6.0F, -4.0F, -15.0F, 12.0F, 8.0F, 16.0F, 0.0F, false);
		Snout_front.setModelRendererName("Snout_front");
		this.registerModelRenderer(Snout_front);

		Teeth_9 = new AnimatedModelRenderer(this);
		Teeth_9.setRotationPoint(5.9F, 4.0F, 1.0F);
		Snout_front.addChild(Teeth_9);
		Teeth_9.setTextureOffset(186, 61).addBox(0.0F, 0.0F, -16.0F, 0.0F, 6.0F, 16.0F, 0.0F, false);
		Teeth_9.setModelRendererName("Teeth_9");
		this.registerModelRenderer(Teeth_9);

		Teeth_10 = new AnimatedModelRenderer(this);
		Teeth_10.setRotationPoint(-5.9F, 4.0F, 1.0F);
		Snout_front.addChild(Teeth_10);
		Teeth_10.setTextureOffset(186, 61).addBox(0.0F, 0.0F, -16.0F, 0.0F, 6.0F, 16.0F, 0.0F, false);
		Teeth_10.setModelRendererName("Teeth_10");
		this.registerModelRenderer(Teeth_10);

		Tooth_front_upper = new AnimatedModelRenderer(this);
		Tooth_front_upper.setRotationPoint(0.0F, 4.0F, -14.8F);
		Snout_front.addChild(Tooth_front_upper);
		setRotationAngle(Tooth_front_upper, -0.4098F, 0.0F, 0.0F);
		Tooth_front_upper.setTextureOffset(220, 58).addBox(0.0F, 0.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, false);
		Tooth_front_upper.setModelRendererName("Tooth_front_upper");
		this.registerModelRenderer(Tooth_front_upper);

		Tooth_front_upper_2 = new AnimatedModelRenderer(this);
		Tooth_front_upper_2.setRotationPoint(3.0F, 4.0F, -14.8F);
		Snout_front.addChild(Tooth_front_upper_2);
		setRotationAngle(Tooth_front_upper_2, -0.1892F, 0.0F, 0.0F);
		Tooth_front_upper_2.setTextureOffset(213, 58).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		Tooth_front_upper_2.setModelRendererName("Tooth_front_upper_2");
		this.registerModelRenderer(Tooth_front_upper_2);

		Tooth_front_upper_3 = new AnimatedModelRenderer(this);
		Tooth_front_upper_3.setRotationPoint(-3.0F, 4.0F, -14.8F);
		Snout_front.addChild(Tooth_front_upper_3);
		setRotationAngle(Tooth_front_upper_3, -0.1892F, 0.0F, 0.0F);
		Tooth_front_upper_3.setTextureOffset(213, 58).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		Tooth_front_upper_3.setModelRendererName("Tooth_front_upper_3");
		this.registerModelRenderer(Tooth_front_upper_3);

		Teeth_7 = new AnimatedModelRenderer(this);
		Teeth_7.setRotationPoint(5.8F, 5.0F, 0.0F);
		Snout_rear.addChild(Teeth_7);
		Teeth_7.setTextureOffset(186, 53).addBox(0.0F, 0.0F, -16.0F, 0.0F, 5.0F, 16.0F, 0.0F, false);
		Teeth_7.setModelRendererName("Teeth_7");
		this.registerModelRenderer(Teeth_7);

		Teeth_8 = new AnimatedModelRenderer(this);
		Teeth_8.setRotationPoint(-5.9F, 5.0F, 0.0F);
		Snout_rear.addChild(Teeth_8);
		Teeth_8.setTextureOffset(186, 53).addBox(0.0F, 0.0F, -16.0F, 0.0F, 5.0F, 16.0F, 0.0F, false);
		Teeth_8.setModelRendererName("Teeth_8");
		this.registerModelRenderer(Teeth_8);

		Teeth_5 = new AnimatedModelRenderer(this);
		Teeth_5.setRotationPoint(6.9F, 7.0F, 1.0F);
		Head_front.addChild(Teeth_5);
		Teeth_5.setTextureOffset(186, 45).addBox(0.0F, 0.0F, -12.0F, 0.0F, 9.0F, 12.0F, 0.0F, false);
		Teeth_5.setModelRendererName("Teeth_5");
		this.registerModelRenderer(Teeth_5);

		Teeth_6 = new AnimatedModelRenderer(this);
		Teeth_6.setRotationPoint(-6.9F, 7.0F, 1.0F);
		Head_front.addChild(Teeth_6);
		Teeth_6.setTextureOffset(186, 45).addBox(0.0F, 0.0F, -12.0F, 0.0F, 9.0F, 12.0F, 0.0F, false);
		Teeth_6.setModelRendererName("Teeth_6");
		this.registerModelRenderer(Teeth_6);

		Eye_barrel_1 = new AnimatedModelRenderer(this);
		Eye_barrel_1.setRotationPoint(5.0F, -5.1F, -4.0F);
		Head_front.addChild(Eye_barrel_1);
		setRotationAngle(Eye_barrel_1, 0.0F, 0.0F, 0.8423F);
		Eye_barrel_1.setTextureOffset(185, 0).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 3.0F, 6.0F, 0.0F, false);
		Eye_barrel_1.setModelRendererName("Eye_barrel_1");
		this.registerModelRenderer(Eye_barrel_1);

		Eye_1 = new AnimatedModelRenderer(this);
		Eye_1.setRotationPoint(0.0F, -3.0F, 0.0F);
		Eye_barrel_1.addChild(Eye_1);
		Eye_1.setTextureOffset(216, 0).addBox(-2.5F, -2.0F, -2.5F, 5.0F, 2.0F, 5.0F, 0.0F, false);
		Eye_1.setModelRendererName("Eye_1");
		this.registerModelRenderer(Eye_1);

		Eye_lens_1 = new AnimatedModelRenderer(this);
		Eye_lens_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Eye_1.addChild(Eye_lens_1);
		Eye_lens_1.setTextureOffset(237, 0).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 3.0F, 6.0F, 0.0F, false);
		Eye_lens_1.setModelRendererName("Eye_lens_1");
		this.registerModelRenderer(Eye_lens_1);

		Eye_barrel_2 = new AnimatedModelRenderer(this);
		Eye_barrel_2.setRotationPoint(-5.0F, -5.1F, -4.0F);
		Head_front.addChild(Eye_barrel_2);
		setRotationAngle(Eye_barrel_2, 0.0F, 0.0F, -0.8423F);
		Eye_barrel_2.setTextureOffset(185, 0).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 3.0F, 6.0F, 0.0F, false);
		Eye_barrel_2.setModelRendererName("Eye_barrel_2");
		this.registerModelRenderer(Eye_barrel_2);

		Eye_2 = new AnimatedModelRenderer(this);
		Eye_2.setRotationPoint(0.0F, -3.0F, 0.0F);
		Eye_barrel_2.addChild(Eye_2);
		Eye_2.setTextureOffset(216, 0).addBox(-2.5F, -2.0F, -2.5F, 5.0F, 2.0F, 5.0F, 0.0F, false);
		Eye_2.setModelRendererName("Eye_2");
		this.registerModelRenderer(Eye_2);

		Eye_lens_2 = new AnimatedModelRenderer(this);
		Eye_lens_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Eye_2.addChild(Eye_lens_2);
		Eye_lens_2.setTextureOffset(237, 0).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 3.0F, 6.0F, 0.0F, false);
		Eye_lens_2.setModelRendererName("Eye_lens_2");
		this.registerModelRenderer(Eye_lens_2);

		Teeth_1 = new AnimatedModelRenderer(this);
		Teeth_1.setRotationPoint(7.9F, 10.0F, 0.0F);
		Head_rear.addChild(Teeth_1);
		setRotationAngle(Teeth_1, 0.0F, 0.0F, -0.2276F);
		Teeth_1.setTextureOffset(118, 23).addBox(0.0F, -0.5F, -32.0F, 0.0F, 4.0F, 32.0F, 0.0F, false);
		Teeth_1.setModelRendererName("Teeth_1");
		this.registerModelRenderer(Teeth_1);

		Teeth_2 = new AnimatedModelRenderer(this);
		Teeth_2.setRotationPoint(7.0F, 10.0F, 0.0F);
		Head_rear.addChild(Teeth_2);
		setRotationAngle(Teeth_2, 0.0F, 0.0F, -0.182F);
		Teeth_2.setTextureOffset(118, 30).addBox(0.0F, -0.5F, -32.0F, 0.0F, 4.0F, 32.0F, 0.0F, false);
		Teeth_2.setModelRendererName("Teeth_2");
		this.registerModelRenderer(Teeth_2);

		Teeth_3 = new AnimatedModelRenderer(this);
		Teeth_3.setRotationPoint(-7.0F, 10.0F, 0.0F);
		Head_rear.addChild(Teeth_3);
		setRotationAngle(Teeth_3, 0.0F, 0.0F, 0.182F);
		Teeth_3.setTextureOffset(118, 30).addBox(0.0F, -0.5F, -32.0F, 0.0F, 4.0F, 32.0F, 0.0F, false);
		Teeth_3.setModelRendererName("Teeth_3");
		this.registerModelRenderer(Teeth_3);

		Teeth_4 = new AnimatedModelRenderer(this);
		Teeth_4.setRotationPoint(-7.9F, 10.0F, 0.0F);
		Head_rear.addChild(Teeth_4);
		setRotationAngle(Teeth_4, 0.0F, 0.0F, 0.2276F);
		Teeth_4.setTextureOffset(118, 23).addBox(0.0F, -0.5F, -32.0F, 0.0F, 4.0F, 32.0F, 0.0F, false);
		Teeth_4.setModelRendererName("Teeth_4");
		this.registerModelRenderer(Teeth_4);

		Lower_jaw_rear = new AnimatedModelRenderer(this);
		Lower_jaw_rear.setRotationPoint(0.0F, 7.0F, 0.0F);
		Body.addChild(Lower_jaw_rear);
		setRotationAngle(Lower_jaw_rear, 0.2409F, 0.0F, 0.0F);
		Lower_jaw_rear.setTextureOffset(206, 55).addBox(-8.0F, 0.0F, -32.0F, 16.0F, 10.0F, 32.0F, 0.0F, false);
		Lower_jaw_rear.setModelRendererName("Lower_jaw_rear");
		this.registerModelRenderer(Lower_jaw_rear);

		Lower_jaw_part_2 = new AnimatedModelRenderer(this);
		Lower_jaw_part_2.setRotationPoint(0.0F, 0.0F, -32.0F);
		Lower_jaw_rear.addChild(Lower_jaw_part_2);
		Lower_jaw_part_2.setTextureOffset(219, 99).addBox(-6.5F, 0.0F, -16.0F, 13.0F, 7.0F, 16.0F, 0.0F, false);
		Lower_jaw_part_2.setModelRendererName("Lower_jaw_part_2");
		this.registerModelRenderer(Lower_jaw_part_2);

		Lower_jaw_tip = new AnimatedModelRenderer(this);
		Lower_jaw_tip.setRotationPoint(0.0F, 0.4F, -16.0F);
		Lower_jaw_part_2.addChild(Lower_jaw_tip);
		setRotationAngle(Lower_jaw_tip, -0.0911F, 0.0F, 0.0F);
		Lower_jaw_tip.setTextureOffset(216, 124).addBox(-5.0F, -0.2F, -22.0F, 10.0F, 4.0F, 22.0F, 0.0F, false);
		Lower_jaw_tip.setModelRendererName("Lower_jaw_tip");
		this.registerModelRenderer(Lower_jaw_tip);

		Teeth_15 = new AnimatedModelRenderer(this);
		Teeth_15.setRotationPoint(4.8F, 0.0F, 0.0F);
		Lower_jaw_tip.addChild(Teeth_15);
		Teeth_15.setTextureOffset(279, 89).addBox(0.0F, -4.0F, -22.0F, 0.0F, 4.0F, 22.0F, 0.0F, false);
		Teeth_15.setModelRendererName("Teeth_15");
		this.registerModelRenderer(Teeth_15);

		Teeth_16 = new AnimatedModelRenderer(this);
		Teeth_16.setRotationPoint(-4.8F, 0.0F, 0.0F);
		Lower_jaw_tip.addChild(Teeth_16);
		Teeth_16.setTextureOffset(279, 89).addBox(0.0F, -4.0F, -22.0F, 0.0F, 4.0F, 22.0F, 0.0F, false);
		Teeth_16.setModelRendererName("Teeth_16");
		this.registerModelRenderer(Teeth_16);

		Teeth_17 = new AnimatedModelRenderer(this);
		Teeth_17.setRotationPoint(0.0F, 0.0F, -21.9F);
		Lower_jaw_tip.addChild(Teeth_17);
		setRotationAngle(Teeth_17, 0.182F, 0.0F, 0.0F);
		Teeth_17.setTextureOffset(282, 117).addBox(-5.0F, -4.8F, 0.0F, 10.0F, 5.0F, 0.0F, 0.0F, false);
		Teeth_17.setModelRendererName("Teeth_17");
		this.registerModelRenderer(Teeth_17);

		Teeth_13 = new AnimatedModelRenderer(this);
		Teeth_13.setRotationPoint(6.4F, 0.0F, 0.0F);
		Lower_jaw_part_2.addChild(Teeth_13);
		Teeth_13.setTextureOffset(279, 88).addBox(0.0F, -3.0F, -16.0F, 0.0F, 3.0F, 16.0F, 0.0F, false);
		Teeth_13.setModelRendererName("Teeth_13");
		this.registerModelRenderer(Teeth_13);

		Teeth_14 = new AnimatedModelRenderer(this);
		Teeth_14.setRotationPoint(-5.4F, 0.0F, 0.0F);
		Lower_jaw_part_2.addChild(Teeth_14);
		Teeth_14.setTextureOffset(279, 88).addBox(0.0F, -3.0F, -16.0F, 0.0F, 3.0F, 16.0F, 0.0F, false);
		Teeth_14.setModelRendererName("Teeth_14");
		this.registerModelRenderer(Teeth_14);

		Teeth_11 = new AnimatedModelRenderer(this);
		Teeth_11.setRotationPoint(7.9F, 0.0F, 0.0F);
		Lower_jaw_rear.addChild(Teeth_11);
		Teeth_11.setTextureOffset(279, 67).addBox(0.0F, -2.0F, -32.0F, 0.0F, 2.0F, 32.0F, 0.0F, false);
		Teeth_11.setModelRendererName("Teeth_11");
		this.registerModelRenderer(Teeth_11);

		Teeth_12 = new AnimatedModelRenderer(this);
		Teeth_12.setRotationPoint(-7.9F, 0.0F, 0.0F);
		Lower_jaw_rear.addChild(Teeth_12);
		Teeth_12.setTextureOffset(279, 67).addBox(0.0F, -2.0F, -32.0F, 0.0F, 2.0F, 32.0F, 0.0F, false);
		Teeth_12.setModelRendererName("Teeth_12");
		this.registerModelRenderer(Teeth_12);

		Pelvic_fin_1 = new AnimatedModelRenderer(this);
		Pelvic_fin_1.setRotationPoint(8.0F, 16.0F, 76.0F);
		Body.addChild(Pelvic_fin_1);
		setRotationAngle(Pelvic_fin_1, 0.0F, 0.0F, -0.182F);
		Pelvic_fin_1.setTextureOffset(31, 197).addBox(0.0F, 0.0F, -8.0F, 0.0F, 6.0F, 16.0F, 0.0F, false);
		Pelvic_fin_1.setModelRendererName("Pelvic_fin_1");
		this.registerModelRenderer(Pelvic_fin_1);

		Pelvic_fin_2 = new AnimatedModelRenderer(this);
		Pelvic_fin_2.setRotationPoint(-8.0F, 16.0F, 76.0F);
		Body.addChild(Pelvic_fin_2);
		setRotationAngle(Pelvic_fin_2, 0.0F, 0.0F, 0.182F);
		Pelvic_fin_2.setTextureOffset(31, 197).addBox(0.0F, 0.0F, -8.0F, 0.0F, 6.0F, 16.0F, 0.0F, false);
		Pelvic_fin_2.setModelRendererName("Pelvic_fin_2");
		this.registerModelRenderer(Pelvic_fin_2);

		Dorsal_fin_skin = new AnimatedModelRenderer(this);
		Dorsal_fin_skin.setRotationPoint(0.0F, -16.0F, 6.0F);
		Body.addChild(Dorsal_fin_skin);
		Dorsal_fin_skin.setTextureOffset(0, 224).addBox(-1.5F, -10.0F, 0.0F, 3.0F, 10.0F, 8.0F, 0.0F, false);
		Dorsal_fin_skin.setModelRendererName("Dorsal_fin_skin");
		this.registerModelRenderer(Dorsal_fin_skin);

		Dorsal_fin = new AnimatedModelRenderer(this);
		Dorsal_fin.setRotationPoint(0.0F, -32.0F, 0.0F);
		Dorsal_fin_skin.addChild(Dorsal_fin);
		Dorsal_fin.setTextureOffset(0, 176).addBox(0.0F, 0.0F, 0.0F, 0.0F, 32.0F, 71.0F, 0.0F, false);
		Dorsal_fin.setModelRendererName("Dorsal_fin");
		this.registerModelRenderer(Dorsal_fin);

		Pectoral_fin_1_joint = new AnimatedModelRenderer(this);
		Pectoral_fin_1_joint.setRotationPoint(8.0F, 15.0F, 5.5F);
		Body.addChild(Pectoral_fin_1_joint);
		Pectoral_fin_1_joint.setTextureOffset(0, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Pectoral_fin_1_joint.setModelRendererName("Pectoral_fin_1_joint");
		this.registerModelRenderer(Pectoral_fin_1_joint);

		Pectoral_fin_skin_1 = new AnimatedModelRenderer(this);
		Pectoral_fin_skin_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pectoral_fin_1_joint.addChild(Pectoral_fin_skin_1);
		setRotationAngle(Pectoral_fin_skin_1, 0.0F, 0.0F, -0.1155F);
		Pectoral_fin_skin_1.setTextureOffset(85, 120).addBox(0.0F, -1.5F, -5.5F, 12.0F, 3.0F, 11.0F, 0.0F, true);
		Pectoral_fin_skin_1.setModelRendererName("Pectoral_fin_skin_1");
		this.registerModelRenderer(Pectoral_fin_skin_1);

		Pectoral_fin_1 = new AnimatedModelRenderer(this);
		Pectoral_fin_1.setRotationPoint(8.0F, 0.0F, -0.5F);
		Pectoral_fin_skin_1.addChild(Pectoral_fin_1);
		setRotationAngle(Pectoral_fin_1, -0.1862F, 0.0F, 0.1367F);
		Pectoral_fin_1.setTextureOffset(60, 138).addBox(0.0F, 0.0F, -5.0F, 64.0F, 0.0F, 22.0F, 0.0F, true);
		Pectoral_fin_1.setModelRendererName("Pectoral_fin_1");
		this.registerModelRenderer(Pectoral_fin_1);

		Pectoral_fin_2_joint = new AnimatedModelRenderer(this);
		Pectoral_fin_2_joint.setRotationPoint(-8.0F, 15.0F, 5.5F);
		Body.addChild(Pectoral_fin_2_joint);
		Pectoral_fin_2_joint.setTextureOffset(0, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Pectoral_fin_2_joint.setModelRendererName("Pectoral_fin_2_joint");
		this.registerModelRenderer(Pectoral_fin_2_joint);

		Pectoral_fin_skin_2 = new AnimatedModelRenderer(this);
		Pectoral_fin_skin_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pectoral_fin_2_joint.addChild(Pectoral_fin_skin_2);
		setRotationAngle(Pectoral_fin_skin_2, 0.0F, 0.0F, 0.1094F);
		Pectoral_fin_skin_2.setTextureOffset(85, 120).addBox(-12.0F, -1.5F, -5.5F, 12.0F, 3.0F, 11.0F, 0.0F, false);
		Pectoral_fin_skin_2.setModelRendererName("Pectoral_fin_skin_2");
		this.registerModelRenderer(Pectoral_fin_skin_2);

		Pectoral_fin_2 = new AnimatedModelRenderer(this);
		Pectoral_fin_2.setRotationPoint(-8.0F, 0.0F, -0.5F);
		Pectoral_fin_skin_2.addChild(Pectoral_fin_2);
		setRotationAngle(Pectoral_fin_2, -0.1862F, 0.0F, -0.1367F);
		Pectoral_fin_2.setTextureOffset(60, 138).addBox(-64.0F, 0.0F, -5.0F, 64.0F, 0.0F, 22.0F, 0.0F, false);
		Pectoral_fin_2.setModelRendererName("Pectoral_fin_2");
		this.registerModelRenderer(Pectoral_fin_2);

    this.rootBones.add(root);
  }


    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation("deep_trenches", "animations/lacerator.json");
    }
}