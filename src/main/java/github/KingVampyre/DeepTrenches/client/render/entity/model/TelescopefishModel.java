// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.TelescopefishEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class TelescopefishModel extends AnimatedEntityModel<TelescopefishEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer Body;
	private final AnimatedModelRenderer Head;
	private final AnimatedModelRenderer Eye_1;
	private final AnimatedModelRenderer Eye_2;
	private final AnimatedModelRenderer Snout;
	private final AnimatedModelRenderer Upper_jaw_teeth_1;
	private final AnimatedModelRenderer Upper_jaw_teeth_2;
	private final AnimatedModelRenderer Upper_jaw_teeth_3;
	private final AnimatedModelRenderer Lower_jaw;
	private final AnimatedModelRenderer Lower_jaw_teeth_1;
	private final AnimatedModelRenderer Lower_jaw_teeth_2;
	private final AnimatedModelRenderer Lower_jaw_3;
	private final AnimatedModelRenderer Caudal_part;
	private final AnimatedModelRenderer Caudal_fin_upper_lobe;
	private final AnimatedModelRenderer Caudal_fin_lower_lobe;
	private final AnimatedModelRenderer Dorsal_fin;
	private final AnimatedModelRenderer Anal_fin;
	private final AnimatedModelRenderer Pectoral_fin_1;
	private final AnimatedModelRenderer Pectoral_fin_2;

    public TelescopefishModel()
    {
        textureWidth = 64;
    textureHeight = 32;
    root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, 0.0F, 0.0F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		Body = new AnimatedModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		root.addChild(Body);
		Body.setTextureOffset(0, 0).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
		Body.setModelRendererName("Body");
		this.registerModelRenderer(Body);

		Head = new AnimatedModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(Head);
		Head.setTextureOffset(15, 0).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		Head.setModelRendererName("Head");
		this.registerModelRenderer(Head);

		Eye_1 = new AnimatedModelRenderer(this);
		Eye_1.setRotationPoint(1.0F, -1.0F, -4.0F);
		Head.addChild(Eye_1);
		Eye_1.setTextureOffset(0, 0).addBox(-0.51F, -0.49F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		Eye_1.setModelRendererName("Eye_1");
		this.registerModelRenderer(Eye_1);

		Eye_2 = new AnimatedModelRenderer(this);
		Eye_2.setRotationPoint(-1.0F, -1.0F, -4.0F);
		Head.addChild(Eye_2);
		Eye_2.setTextureOffset(0, 0).addBox(-0.49F, -0.49F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		Eye_2.setModelRendererName("Eye_2");
		this.registerModelRenderer(Eye_2);

		Snout = new AnimatedModelRenderer(this);
		Snout.setRotationPoint(0.0F, 0.5F, -3.0F);
		Head.addChild(Snout);
		Snout.setTextureOffset(26, 1).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		Snout.setModelRendererName("Snout");
		this.registerModelRenderer(Snout);

		Upper_jaw_teeth_1 = new AnimatedModelRenderer(this);
		Upper_jaw_teeth_1.setRotationPoint(-1.4F, 0.0F, -2.5F);
		Head.addChild(Upper_jaw_teeth_1);
		Upper_jaw_teeth_1.setTextureOffset(15, 1).addBox(0.0F, 0.5F, -2.5F, 0.0F, 1.0F, 5.0F, 0.0F, false);
		Upper_jaw_teeth_1.setModelRendererName("Upper_jaw_teeth_1");
		this.registerModelRenderer(Upper_jaw_teeth_1);

		Upper_jaw_teeth_2 = new AnimatedModelRenderer(this);
		Upper_jaw_teeth_2.setRotationPoint(0.0F, 0.0F, -4.9F);
		Head.addChild(Upper_jaw_teeth_2);
		Upper_jaw_teeth_2.setTextureOffset(23, 8).addBox(-1.5F, 0.5F, 0.0F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		Upper_jaw_teeth_2.setModelRendererName("Upper_jaw_teeth_2");
		this.registerModelRenderer(Upper_jaw_teeth_2);

		Upper_jaw_teeth_3 = new AnimatedModelRenderer(this);
		Upper_jaw_teeth_3.setRotationPoint(1.4F, 0.0F, -2.5F);
		Head.addChild(Upper_jaw_teeth_3);
		Upper_jaw_teeth_3.setTextureOffset(15, 1).addBox(0.0F, 0.4F, -2.5F, 0.0F, 1.0F, 5.0F, 0.0F, false);
		Upper_jaw_teeth_3.setModelRendererName("Upper_jaw_teeth_3");
		this.registerModelRenderer(Upper_jaw_teeth_3);

		Lower_jaw = new AnimatedModelRenderer(this);
		Lower_jaw.setRotationPoint(0.0F, 0.5F, 0.0F);
		Body.addChild(Lower_jaw);
		Lower_jaw.setTextureOffset(31, 0).addBox(-1.5F, 0.0F, -5.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);
		Lower_jaw.setModelRendererName("Lower_jaw");
		this.registerModelRenderer(Lower_jaw);

		Lower_jaw_teeth_1 = new AnimatedModelRenderer(this);
		Lower_jaw_teeth_1.setRotationPoint(-1.49F, 0.0F, -2.5F);
		Lower_jaw.addChild(Lower_jaw_teeth_1);
		Lower_jaw_teeth_1.setTextureOffset(31, 3).addBox(0.0F, -1.0F, -2.5F, 0.0F, 1.0F, 5.0F, 0.0F, false);
		Lower_jaw_teeth_1.setModelRendererName("Lower_jaw_teeth_1");
		this.registerModelRenderer(Lower_jaw_teeth_1);

		Lower_jaw_teeth_2 = new AnimatedModelRenderer(this);
		Lower_jaw_teeth_2.setRotationPoint(0.0F, 0.0F, -2.5F);
		Lower_jaw.addChild(Lower_jaw_teeth_2);
		Lower_jaw_teeth_2.setTextureOffset(31, 3).addBox(1.49F, -1.0F, -2.5F, 0.0F, 1.0F, 5.0F, 0.0F, false);
		Lower_jaw_teeth_2.setModelRendererName("Lower_jaw_teeth_2");
		this.registerModelRenderer(Lower_jaw_teeth_2);

		Lower_jaw_3 = new AnimatedModelRenderer(this);
		Lower_jaw_3.setRotationPoint(0.0F, 0.0F, -4.99F);
		Lower_jaw.addChild(Lower_jaw_3);
		Lower_jaw_3.setTextureOffset(31, 10).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		Lower_jaw_3.setModelRendererName("Lower_jaw_3");
		this.registerModelRenderer(Lower_jaw_3);

		Caudal_part = new AnimatedModelRenderer(this);
		Caudal_part.setRotationPoint(0.0F, 0.0F, 7.0F);
		Body.addChild(Caudal_part);
		Caudal_part.setTextureOffset(0, 12).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 7.0F, 0.0F, false);
		Caudal_part.setModelRendererName("Caudal_part");
		this.registerModelRenderer(Caudal_part);

		Caudal_fin_upper_lobe = new AnimatedModelRenderer(this);
		Caudal_fin_upper_lobe.setRotationPoint(0.0F, 0.0F, 6.0F);
		Caudal_part.addChild(Caudal_fin_upper_lobe);
		Caudal_fin_upper_lobe.setTextureOffset(0, 19).addBox(0.0F, -3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 0.0F, false);
		Caudal_fin_upper_lobe.setModelRendererName("Caudal_fin_upper_lobe");
		this.registerModelRenderer(Caudal_fin_upper_lobe);

		Caudal_fin_lower_lobe = new AnimatedModelRenderer(this);
		Caudal_fin_lower_lobe.setRotationPoint(0.0F, 1.5F, 5.0F);
		Caudal_fin_upper_lobe.addChild(Caudal_fin_lower_lobe);
		Caudal_fin_lower_lobe.setTextureOffset(13, 8).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 17.0F, 0.0F, false);
		Caudal_fin_lower_lobe.setModelRendererName("Caudal_fin_lower_lobe");
		this.registerModelRenderer(Caudal_fin_lower_lobe);

		Dorsal_fin = new AnimatedModelRenderer(this);
		Dorsal_fin.setRotationPoint(0.0F, -1.0F, 3.0F);
		Caudal_part.addChild(Dorsal_fin);
		Dorsal_fin.setTextureOffset(28, 19).addBox(0.0F, -2.5F, -1.5F, 0.0F, 2.0F, 3.0F, 0.0F, false);
		Dorsal_fin.setModelRendererName("Dorsal_fin");
		this.registerModelRenderer(Dorsal_fin);

		Anal_fin = new AnimatedModelRenderer(this);
		Anal_fin.setRotationPoint(0.0F, 1.0F, 4.0F);
		Caudal_part.addChild(Anal_fin);
		Anal_fin.setTextureOffset(21, 18).addBox(0.0F, 0.5F, -1.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		Anal_fin.setModelRendererName("Anal_fin");
		this.registerModelRenderer(Anal_fin);

		Pectoral_fin_1 = new AnimatedModelRenderer(this);
		Pectoral_fin_1.setRotationPoint(-1.5F, -0.5F, 0.0F);
		Body.addChild(Pectoral_fin_1);
		setRotationAngle(Pectoral_fin_1, 0.0F, 0.6829F, 0.5463F);
		Pectoral_fin_1.setTextureOffset(15, 12).addBox(-5.0F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, 0.0F, false);
		Pectoral_fin_1.setModelRendererName("Pectoral_fin_1");
		this.registerModelRenderer(Pectoral_fin_1);

		Pectoral_fin_2 = new AnimatedModelRenderer(this);
		Pectoral_fin_2.setRotationPoint(1.5F, -0.5F, 0.0F);
		Body.addChild(Pectoral_fin_2);
		setRotationAngle(Pectoral_fin_2, 0.0F, -0.6829F, -0.5463F);
		Pectoral_fin_2.setTextureOffset(15, 12).addBox(0.0F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, 0.0F, true);
		Pectoral_fin_2.setModelRendererName("Pectoral_fin_2");
		this.registerModelRenderer(Pectoral_fin_2);

    this.rootBones.add(root);
  }


    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation("deep_trenches", "animations/telescopefish.json");
    }
}