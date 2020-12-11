// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.HoneycombDragonfishEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class HoneycombDragonfishModel extends AnimatedEntityModel<HoneycombDragonfishEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer Body;
	private final AnimatedModelRenderer Head;
	private final AnimatedModelRenderer Upper_jaw_teeth_1;
	private final AnimatedModelRenderer Upper_jaw_teeth_2;
	private final AnimatedModelRenderer Upper_jaw_teeth_3;
	private final AnimatedModelRenderer Eye_1;
	private final AnimatedModelRenderer Eye_lens_1;
	private final AnimatedModelRenderer Eye_2;
	private final AnimatedModelRenderer Eye_lens_2;
	private final AnimatedModelRenderer Eupper_jaw_snout;
	private final AnimatedModelRenderer Lower_jaw;
	private final AnimatedModelRenderer Barbel;
	private final AnimatedModelRenderer Bioluminescent_organ;
	private final AnimatedModelRenderer Lower_jaw_teeth_1;
	private final AnimatedModelRenderer Lower_jaw_teeth_2;
	private final AnimatedModelRenderer Lower_jaw_teeth_3;
	private final AnimatedModelRenderer Body_rear;
	private final AnimatedModelRenderer Caudal_fin;
	private final AnimatedModelRenderer Pelvic_fin_1;
	private final AnimatedModelRenderer Pelvic_fin_2;
	private final AnimatedModelRenderer Pectoral_fin_2;
	private final AnimatedModelRenderer Pectoral_fin_1;

    public HoneycombDragonfishModel()
    {
        textureWidth = 90;
    textureHeight = 64;
    root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, 0.0F, 0.0F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		Body = new AnimatedModelRenderer(this);
		Body.setRotationPoint(0.0F, 21.5F, -6.5F);
		root.addChild(Body);
		Body.setTextureOffset(25, 1).addBox(-2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 13.0F, 0.0F, false);
		Body.setModelRendererName("Body");
		this.registerModelRenderer(Body);

		Head = new AnimatedModelRenderer(this);
		Head.setRotationPoint(0.0F, -0.5F, 0.0F);
		Body.addChild(Head);
		Head.setTextureOffset(0, 1).addBox(-2.0F, -2.0F, -5.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);
		Head.setModelRendererName("Head");
		this.registerModelRenderer(Head);

		Upper_jaw_teeth_1 = new AnimatedModelRenderer(this);
		Upper_jaw_teeth_1.setRotationPoint(0.0F, 1.5F, -5.9F);
		Head.addChild(Upper_jaw_teeth_1);
		Upper_jaw_teeth_1.setTextureOffset(18, 32).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 0.0F, 0.0F, false);
		Upper_jaw_teeth_1.setModelRendererName("Upper_jaw_teeth_1");
		this.registerModelRenderer(Upper_jaw_teeth_1);

		Upper_jaw_teeth_2 = new AnimatedModelRenderer(this);
		Upper_jaw_teeth_2.setRotationPoint(1.9F, 1.5F, 0.0F);
		Head.addChild(Upper_jaw_teeth_2);
		Upper_jaw_teeth_2.setTextureOffset(27, 26).addBox(0.0F, 0.0F, -6.0F, 0.0F, 2.0F, 6.0F, 0.0F, false);
		Upper_jaw_teeth_2.setModelRendererName("Upper_jaw_teeth_2");
		this.registerModelRenderer(Upper_jaw_teeth_2);

		Upper_jaw_teeth_3 = new AnimatedModelRenderer(this);
		Upper_jaw_teeth_3.setRotationPoint(-1.9F, 1.5F, 0.0F);
		Head.addChild(Upper_jaw_teeth_3);
		Upper_jaw_teeth_3.setTextureOffset(27, 26).addBox(0.0F, 0.0F, -6.0F, 0.0F, 2.0F, 6.0F, 0.0F, false);
		Upper_jaw_teeth_3.setModelRendererName("Upper_jaw_teeth_3");
		this.registerModelRenderer(Upper_jaw_teeth_3);

		Eye_1 = new AnimatedModelRenderer(this);
		Eye_1.setRotationPoint(2.0F, -0.1F, -3.9F);
		Head.addChild(Eye_1);
		Eye_1.setTextureOffset(6, 34).addBox(-0.38F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Eye_1.setModelRendererName("Eye_1");
		this.registerModelRenderer(Eye_1);

		Eye_lens_1 = new AnimatedModelRenderer(this);
		Eye_lens_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Eye_1.addChild(Eye_lens_1);
		Eye_lens_1.setTextureOffset(6, 29).addBox(-1.1F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Eye_lens_1.setModelRendererName("Eye_lens_1");
		this.registerModelRenderer(Eye_lens_1);

		Eye_2 = new AnimatedModelRenderer(this);
		Eye_2.setRotationPoint(-2.0F, -0.1F, -3.9F);
		Head.addChild(Eye_2);
		Eye_2.setTextureOffset(6, 34).addBox(-0.68F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Eye_2.setModelRendererName("Eye_2");
		this.registerModelRenderer(Eye_2);

		Eye_lens_2 = new AnimatedModelRenderer(this);
		Eye_lens_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Eye_2.addChild(Eye_lens_2);
		Eye_lens_2.setTextureOffset(6, 29).addBox(-0.9F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Eye_lens_2.setModelRendererName("Eye_lens_2");
		this.registerModelRenderer(Eye_lens_2);

		Eupper_jaw_snout = new AnimatedModelRenderer(this);
		Eupper_jaw_snout.setRotationPoint(0.0F, 0.5F, -5.0F);
		Head.addChild(Eupper_jaw_snout);
		Eupper_jaw_snout.setTextureOffset(15, 0).addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		Eupper_jaw_snout.setModelRendererName("Eupper_jaw_snout");
		this.registerModelRenderer(Eupper_jaw_snout);

		Lower_jaw = new AnimatedModelRenderer(this);
		Lower_jaw.setRotationPoint(0.0F, 1.5F, 0.0F);
		Body.addChild(Lower_jaw);
		Lower_jaw.setTextureOffset(0, 11).addBox(-2.0F, 0.0F, -5.3F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		Lower_jaw.setModelRendererName("Lower_jaw");
		this.registerModelRenderer(Lower_jaw);

		Barbel = new AnimatedModelRenderer(this);
		Barbel.setRotationPoint(0.0F, 0.0F, -4.0F);
		Lower_jaw.addChild(Barbel);
		setRotationAngle(Barbel, 0.1396F, 0.0F, 0.0F);
		Barbel.setTextureOffset(0, 28).addBox(0.0F, 0.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, false);
		Barbel.setModelRendererName("Barbel");
		this.registerModelRenderer(Barbel);

		Bioluminescent_organ = new AnimatedModelRenderer(this);
		Bioluminescent_organ.setRotationPoint(0.5F, 7.5F, 0.0F);
		Barbel.addChild(Bioluminescent_organ);
		Bioluminescent_organ.setTextureOffset(0, 38).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Bioluminescent_organ.setModelRendererName("Bioluminescent_organ");
		this.registerModelRenderer(Bioluminescent_organ);

		Lower_jaw_teeth_1 = new AnimatedModelRenderer(this);
		Lower_jaw_teeth_1.setRotationPoint(1.9F, 0.0F, 0.0F);
		Lower_jaw.addChild(Lower_jaw_teeth_1);
		Lower_jaw_teeth_1.setTextureOffset(27, 23).addBox(0.0F, -2.0F, -5.0F, 0.0F, 2.0F, 6.0F, 0.0F, false);
		Lower_jaw_teeth_1.setModelRendererName("Lower_jaw_teeth_1");
		this.registerModelRenderer(Lower_jaw_teeth_1);

		Lower_jaw_teeth_2 = new AnimatedModelRenderer(this);
		Lower_jaw_teeth_2.setRotationPoint(0.0F, 0.0F, -5.2F);
		Lower_jaw.addChild(Lower_jaw_teeth_2);
		Lower_jaw_teeth_2.setTextureOffset(18, 29).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 2.0F, 0.0F, 0.0F, false);
		Lower_jaw_teeth_2.setModelRendererName("Lower_jaw_teeth_2");
		this.registerModelRenderer(Lower_jaw_teeth_2);

		Lower_jaw_teeth_3 = new AnimatedModelRenderer(this);
		Lower_jaw_teeth_3.setRotationPoint(-1.9F, 0.0F, 0.0F);
		Lower_jaw.addChild(Lower_jaw_teeth_3);
		Lower_jaw_teeth_3.setTextureOffset(27, 23).addBox(0.0F, -2.0F, -5.0F, 0.0F, 2.0F, 6.0F, 0.0F, false);
		Lower_jaw_teeth_3.setModelRendererName("Lower_jaw_teeth_3");
		this.registerModelRenderer(Lower_jaw_teeth_3);

		Body_rear = new AnimatedModelRenderer(this);
		Body_rear.setRotationPoint(0.0F, 0.0F, 13.0F);
		Body.addChild(Body_rear);
		Body_rear.setTextureOffset(43, 3).addBox(-2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 17.0F, 0.0F, false);
		Body_rear.setModelRendererName("Body_rear");
		this.registerModelRenderer(Body_rear);

		Caudal_fin = new AnimatedModelRenderer(this);
		Caudal_fin.setRotationPoint(0.0F, 0.0F, 15.9F);
		Body_rear.addChild(Caudal_fin);
		Caudal_fin.setTextureOffset(0, 4).addBox(0.0F, -4.0F, 0.0F, 0.0F, 8.0F, 16.0F, 0.0F, false);
		Caudal_fin.setModelRendererName("Caudal_fin");
		this.registerModelRenderer(Caudal_fin);

		Pelvic_fin_1 = new AnimatedModelRenderer(this);
		Pelvic_fin_1.setRotationPoint(2.0F, 2.3F, 13.5F);
		Body_rear.addChild(Pelvic_fin_1);
		setRotationAngle(Pelvic_fin_1, 0.4554F, 0.0F, 0.0F);
		Pelvic_fin_1.setTextureOffset(33, 6).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		Pelvic_fin_1.setModelRendererName("Pelvic_fin_1");
		this.registerModelRenderer(Pelvic_fin_1);

		Pelvic_fin_2 = new AnimatedModelRenderer(this);
		Pelvic_fin_2.setRotationPoint(-2.0F, 2.3F, 13.5F);
		Body_rear.addChild(Pelvic_fin_2);
		setRotationAngle(Pelvic_fin_2, 0.4554F, 0.0F, 0.0F);
		Pelvic_fin_2.setTextureOffset(33, 6).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		Pelvic_fin_2.setModelRendererName("Pelvic_fin_2");
		this.registerModelRenderer(Pelvic_fin_2);

		Pectoral_fin_2 = new AnimatedModelRenderer(this);
		Pectoral_fin_2.setRotationPoint(-2.0F, 2.3F, 0.5F);
		Body.addChild(Pectoral_fin_2);
		setRotationAngle(Pectoral_fin_2, 0.1396F, 0.0F, 0.0F);
		Pectoral_fin_2.setTextureOffset(33, 0).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 2.0F, 0.0F, false);
		Pectoral_fin_2.setModelRendererName("Pectoral_fin_2");
		this.registerModelRenderer(Pectoral_fin_2);

		Pectoral_fin_1 = new AnimatedModelRenderer(this);
		Pectoral_fin_1.setRotationPoint(-2.0F, 2.3F, 0.5F);
		Body.addChild(Pectoral_fin_1);
		setRotationAngle(Pectoral_fin_1, 0.1396F, 0.0F, 0.0F);
		Pectoral_fin_1.setTextureOffset(33, 0).addBox(4.0F, 0.0F, -0.5F, 0.0F, 4.0F, 2.0F, 0.0F, false);
		Pectoral_fin_1.setModelRendererName("Pectoral_fin_1");
		this.registerModelRenderer(Pectoral_fin_1);

    this.rootBones.add(root);
  }


    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation("deep_trenches", "animations/honeycomb_dragonfish.json");
    }
}