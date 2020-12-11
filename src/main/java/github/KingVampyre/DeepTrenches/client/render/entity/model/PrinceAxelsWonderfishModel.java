// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.PrinceAxelsWonderfishEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class PrinceAxelsWonderfishModel extends AnimatedEntityModel<PrinceAxelsWonderfishEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer Body;
	private final AnimatedModelRenderer Upper_jaw;
	private final AnimatedModelRenderer Upper_jaw_tip;
	private final AnimatedModelRenderer Upper_jaw_teeth_1;
	private final AnimatedModelRenderer Upper_jaw_teeth_2;
	private final AnimatedModelRenderer Upper_jaw_lure_top;
	private final AnimatedModelRenderer Upper_jaw_lure;
	private final AnimatedModelRenderer Appandages;
	private final AnimatedModelRenderer Lower_jaw;
	private final AnimatedModelRenderer Lower_jaw_teeth;
	private final AnimatedModelRenderer Pectoral_fin_1;
	private final AnimatedModelRenderer Pectoral_fin_2;
	private final AnimatedModelRenderer Caudal_and_such;

    public PrinceAxelsWonderfishModel()
    {
        textureWidth = 64;
    textureHeight = 64;
    root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, 0.0F, 0.0F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		Body = new AnimatedModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		root.addChild(Body);
		Body.setTextureOffset(29, 9).addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 11.0F, 0.0F, false);
		Body.setModelRendererName("Body");
		this.registerModelRenderer(Body);

		Upper_jaw = new AnimatedModelRenderer(this);
		Upper_jaw.setRotationPoint(0.0F, -1.0F, 0.0F);
		Body.addChild(Upper_jaw);
		setRotationAngle(Upper_jaw, -0.0702F, 0.0F, 0.0F);
		Upper_jaw.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -4.0F, 6.0F, 4.0F, 5.0F, 0.0F, false);
		Upper_jaw.setModelRendererName("Upper_jaw");
		this.registerModelRenderer(Upper_jaw);

		Upper_jaw_tip = new AnimatedModelRenderer(this);
		Upper_jaw_tip.setRotationPoint(0.0F, 0.0F, -4.0F);
		Upper_jaw.addChild(Upper_jaw_tip);
		Upper_jaw_tip.setTextureOffset(22, 1).addBox(-3.0F, -1.0F, -4.0F, 6.0F, 3.0F, 4.0F, 0.0F, false);
		Upper_jaw_tip.setModelRendererName("Upper_jaw_tip");
		this.registerModelRenderer(Upper_jaw_tip);

		Upper_jaw_teeth_1 = new AnimatedModelRenderer(this);
		Upper_jaw_teeth_1.setRotationPoint(2.9F, 2.0F, 0.0F);
		Upper_jaw_tip.addChild(Upper_jaw_teeth_1);
		setRotationAngle(Upper_jaw_teeth_1, 0.0F, 0.0F, -0.2276F);
		Upper_jaw_teeth_1.setTextureOffset(42, -3).addBox(0.0F, 0.0F, -3.8F, 0.0F, 2.0F, 8.0F, 0.0F, false);
		Upper_jaw_teeth_1.setModelRendererName("Upper_jaw_teeth_1");
		this.registerModelRenderer(Upper_jaw_teeth_1);

		Upper_jaw_teeth_2 = new AnimatedModelRenderer(this);
		Upper_jaw_teeth_2.setRotationPoint(-2.9F, 2.0F, 0.0F);
		Upper_jaw_tip.addChild(Upper_jaw_teeth_2);
		setRotationAngle(Upper_jaw_teeth_2, 0.0F, 0.0F, 0.2276F);
		Upper_jaw_teeth_2.setTextureOffset(42, -3).addBox(0.0F, 0.0F, -3.8F, 0.0F, 2.0F, 8.0F, 0.0F, false);
		Upper_jaw_teeth_2.setModelRendererName("Upper_jaw_teeth_2");
		this.registerModelRenderer(Upper_jaw_teeth_2);

		Upper_jaw_lure_top = new AnimatedModelRenderer(this);
		Upper_jaw_lure_top.setRotationPoint(0.0F, 1.5F, -2.5F);
		Upper_jaw_tip.addChild(Upper_jaw_lure_top);
		Upper_jaw_lure_top.setTextureOffset(0, 20).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Upper_jaw_lure_top.setModelRendererName("Upper_jaw_lure_top");
		this.registerModelRenderer(Upper_jaw_lure_top);

		Upper_jaw_lure = new AnimatedModelRenderer(this);
		Upper_jaw_lure.setRotationPoint(0.0F, 1.5F, -0.5F);
		Upper_jaw_lure_top.addChild(Upper_jaw_lure);
		Upper_jaw_lure.setTextureOffset(0, 22).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Upper_jaw_lure.setModelRendererName("Upper_jaw_lure");
		this.registerModelRenderer(Upper_jaw_lure);

		Appandages = new AnimatedModelRenderer(this);
		Appandages.setRotationPoint(0.0F, 1.5F, 0.5F);
		Upper_jaw_lure.addChild(Appandages);
		Appandages.setTextureOffset(0, 26).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, false);
		Appandages.setModelRendererName("Appandages");
		this.registerModelRenderer(Appandages);

		Lower_jaw = new AnimatedModelRenderer(this);
		Lower_jaw.setRotationPoint(0.0F, 2.0F, 0.0F);
		Body.addChild(Lower_jaw);
		setRotationAngle(Lower_jaw, 0.4438F, 0.0F, 0.0F);
		Lower_jaw.setTextureOffset(18, 9).addBox(-3.0F, -1.0F, -3.7F, 6.0F, 2.0F, 5.0F, 0.0F, false);
		Lower_jaw.setModelRendererName("Lower_jaw");
		this.registerModelRenderer(Lower_jaw);

		Lower_jaw_teeth = new AnimatedModelRenderer(this);
		Lower_jaw_teeth.setRotationPoint(0.0F, -1.5F, -3.7F);
		Lower_jaw.addChild(Lower_jaw_teeth);
		Lower_jaw_teeth.setTextureOffset(8, 16).addBox(-3.0F, -0.5F, 0.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);
		Lower_jaw_teeth.setModelRendererName("Lower_jaw_teeth");
		this.registerModelRenderer(Lower_jaw_teeth);

		Pectoral_fin_1 = new AnimatedModelRenderer(this);
		Pectoral_fin_1.setRotationPoint(3.0F, 0.0F, 1.0F);
		Body.addChild(Pectoral_fin_1);
		setRotationAngle(Pectoral_fin_1, 0.0F, 0.182F, 0.0F);
		Pectoral_fin_1.setTextureOffset(0, 7).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		Pectoral_fin_1.setModelRendererName("Pectoral_fin_1");
		this.registerModelRenderer(Pectoral_fin_1);

		Pectoral_fin_2 = new AnimatedModelRenderer(this);
		Pectoral_fin_2.setRotationPoint(-3.0F, 0.0F, 1.0F);
		Body.addChild(Pectoral_fin_2);
		setRotationAngle(Pectoral_fin_2, 0.0F, -0.182F, 0.0F);
		Pectoral_fin_2.setTextureOffset(0, 7).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		Pectoral_fin_2.setModelRendererName("Pectoral_fin_2");
		this.registerModelRenderer(Pectoral_fin_2);

		Caudal_and_such = new AnimatedModelRenderer(this);
		Caudal_and_such.setRotationPoint(0.0F, 0.0F, 11.0F);
		Body.addChild(Caudal_and_such);
		Caudal_and_such.setTextureOffset(1, 17).addBox(0.0F, -5.0F, 0.0F, 0.0F, 8.0F, 13.0F, 0.0F, false);
		Caudal_and_such.setModelRendererName("Caudal_and_such");
		this.registerModelRenderer(Caudal_and_such);

    this.rootBones.add(root);
  }


    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation("deep_trenches", "animations/prince_axels_wonderfish.json");
    }
}