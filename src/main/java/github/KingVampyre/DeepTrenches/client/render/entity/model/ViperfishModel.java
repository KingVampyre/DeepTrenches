// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.ViperfishEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class ViperfishModel extends AnimatedEntityModel<ViperfishEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer Body;
	private final AnimatedModelRenderer Caudal;
	private final AnimatedModelRenderer Caudal_fin;
	private final AnimatedModelRenderer Adipose_fin;
	private final AnimatedModelRenderer Anal_fin;
	private final AnimatedModelRenderer Head;
	private final AnimatedModelRenderer Upper_teeth_1;
	private final AnimatedModelRenderer Upper_teeth_2;
	private final AnimatedModelRenderer Lower_jaw;
	private final AnimatedModelRenderer Lower_jaw_fang_1;
	private final AnimatedModelRenderer Lower_jaw_fang_2;
	private final AnimatedModelRenderer Lower_jaw_teeth_1;
	private final AnimatedModelRenderer Lower_jaw_teeth_2;
	private final AnimatedModelRenderer Dorsal_fin;
	private final AnimatedModelRenderer Dorsal_fin_thread;
	private final AnimatedModelRenderer Dorsal_thread_bioluminescent_organ;
	private final AnimatedModelRenderer Pectoral_fin_1;
	private final AnimatedModelRenderer Pectoral_fin_2;
	private final AnimatedModelRenderer Pelvic_fin_1;
	private final AnimatedModelRenderer Pelvic_fin_2;

    public ViperfishModel()
    {
        textureWidth = 64;
    textureHeight = 32;
    root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, 0.0F, 0.0F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		Body = new AnimatedModelRenderer(this);
		Body.setRotationPoint(0.0F, 21.5F, -8.0F);
		root.addChild(Body);
		Body.setTextureOffset(24, 0).addBox(-2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 16.0F, 0.0F, false);
		Body.setModelRendererName("Body");
		this.registerModelRenderer(Body);

		Caudal = new AnimatedModelRenderer(this);
		Caudal.setRotationPoint(0.0F, 0.0F, 15.0F);
		Body.addChild(Caudal);
		Caudal.setTextureOffset(18, 6).addBox(-2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 5.0F, 0.0F, false);
		Caudal.setModelRendererName("Caudal");
		this.registerModelRenderer(Caudal);

		Caudal_fin = new AnimatedModelRenderer(this);
		Caudal_fin.setRotationPoint(0.0F, 0.0F, 5.0F);
		Caudal.addChild(Caudal_fin);
		Caudal_fin.setTextureOffset(14, 8).addBox(0.0F, -5.5F, 0.0F, 0.0F, 11.0F, 13.0F, 0.0F, false);
		Caudal_fin.setModelRendererName("Caudal_fin");
		this.registerModelRenderer(Caudal_fin);

		Adipose_fin = new AnimatedModelRenderer(this);
		Adipose_fin.setRotationPoint(0.0F, -2.5F, 1.2F);
		Caudal.addChild(Adipose_fin);
		Adipose_fin.setTextureOffset(40, 20).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 5.0F, 0.0F, false);
		Adipose_fin.setModelRendererName("Adipose_fin");
		this.registerModelRenderer(Adipose_fin);

		Anal_fin = new AnimatedModelRenderer(this);
		Anal_fin.setRotationPoint(0.0F, 2.5F, -1.0F);
		Caudal.addChild(Anal_fin);
		Anal_fin.setTextureOffset(40, 16).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 6.0F, 0.0F, false);
		Anal_fin.setModelRendererName("Anal_fin");
		this.registerModelRenderer(Anal_fin);

		Head = new AnimatedModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, -0.2F);
		Body.addChild(Head);
		Head.setTextureOffset(0, 0).addBox(-1.5F, -2.5F, -5.0F, 3.0F, 4.0F, 6.0F, 0.0F, false);
		Head.setModelRendererName("Head");
		this.registerModelRenderer(Head);

		Upper_teeth_1 = new AnimatedModelRenderer(this);
		Upper_teeth_1.setRotationPoint(1.35F, -0.2F, -1.0F);
		Head.addChild(Upper_teeth_1);
		setRotationAngle(Upper_teeth_1, 0.2339F, 0.0F, 0.0F);
		Upper_teeth_1.setTextureOffset(12, 0).addBox(0.0F, 0.0F, -4.0F, 0.0F, 2.0F, 4.0F, 0.0F, false);
		Upper_teeth_1.setModelRendererName("Upper_teeth_1");
		this.registerModelRenderer(Upper_teeth_1);

		Upper_teeth_2 = new AnimatedModelRenderer(this);
		Upper_teeth_2.setRotationPoint(-1.35F, -0.2F, -1.0F);
		Head.addChild(Upper_teeth_2);
		setRotationAngle(Upper_teeth_2, 0.2339F, 0.0F, 0.0F);
		Upper_teeth_2.setTextureOffset(12, 0).addBox(0.0F, 0.0F, -4.0F, 0.0F, 2.0F, 4.0F, 0.0F, false);
		Upper_teeth_2.setModelRendererName("Upper_teeth_2");
		this.registerModelRenderer(Upper_teeth_2);

		Lower_jaw = new AnimatedModelRenderer(this);
		Lower_jaw.setRotationPoint(0.0F, 1.5F, -0.2F);
		Body.addChild(Lower_jaw);
		setRotationAngle(Lower_jaw, 0.0436F, 0.0F, 0.0F);
		Lower_jaw.setTextureOffset(0, 10).addBox(-1.5F, -1.0F, -5.3F, 3.0F, 2.0F, 6.0F, 0.0F, false);
		Lower_jaw.setModelRendererName("Lower_jaw");
		this.registerModelRenderer(Lower_jaw);

		Lower_jaw_fang_1 = new AnimatedModelRenderer(this);
		Lower_jaw_fang_1.setRotationPoint(1.45F, -1.0F, -4.5F);
		Lower_jaw.addChild(Lower_jaw_fang_1);
		setRotationAngle(Lower_jaw_fang_1, -0.0541F, 0.0611F, 0.0456F);
		Lower_jaw_fang_1.setTextureOffset(0, 0).addBox(0.0F, -3.7F, -0.8F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		Lower_jaw_fang_1.setModelRendererName("Lower_jaw_fang_1");
		this.registerModelRenderer(Lower_jaw_fang_1);

		Lower_jaw_fang_2 = new AnimatedModelRenderer(this);
		Lower_jaw_fang_2.setRotationPoint(-1.45F, -1.0F, -4.5F);
		Lower_jaw.addChild(Lower_jaw_fang_2);
		setRotationAngle(Lower_jaw_fang_2, -0.0541F, -0.0611F, -0.0456F);
		Lower_jaw_fang_2.setTextureOffset(0, 0).addBox(0.0F, -3.7F, -0.8F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		Lower_jaw_fang_2.setModelRendererName("Lower_jaw_fang_2");
		this.registerModelRenderer(Lower_jaw_fang_2);

		Lower_jaw_teeth_1 = new AnimatedModelRenderer(this);
		Lower_jaw_teeth_1.setRotationPoint(1.4F, -0.6F, -1.0F);
		Lower_jaw.addChild(Lower_jaw_teeth_1);
		setRotationAngle(Lower_jaw_teeth_1, -0.1473F, 0.0F, 0.0F);
		Lower_jaw_teeth_1.setTextureOffset(0, 2).addBox(0.0F, -0.71F, -4.3F, 0.0F, 1.0F, 3.0F, 0.0F, false);
		Lower_jaw_teeth_1.setModelRendererName("Lower_jaw_teeth_1");
		this.registerModelRenderer(Lower_jaw_teeth_1);

		Lower_jaw_teeth_2 = new AnimatedModelRenderer(this);
		Lower_jaw_teeth_2.setRotationPoint(-1.4F, -0.6F, -1.0F);
		Lower_jaw.addChild(Lower_jaw_teeth_2);
		setRotationAngle(Lower_jaw_teeth_2, -0.1473F, 0.0F, 0.0F);
		Lower_jaw_teeth_2.setTextureOffset(0, 2).addBox(0.0F, -0.71F, -4.3F, 0.0F, 1.0F, 3.0F, 0.0F, false);
		Lower_jaw_teeth_2.setModelRendererName("Lower_jaw_teeth_2");
		this.registerModelRenderer(Lower_jaw_teeth_2);

		Dorsal_fin = new AnimatedModelRenderer(this);
		Dorsal_fin.setRotationPoint(0.0F, -2.5F, 1.9F);
		Body.addChild(Dorsal_fin);
		Dorsal_fin.setTextureOffset(48, -4).addBox(0.0F, -8.0F, 0.0F, 0.0F, 8.0F, 4.0F, 0.0F, false);
		Dorsal_fin.setModelRendererName("Dorsal_fin");
		this.registerModelRenderer(Dorsal_fin);

		Dorsal_fin_thread = new AnimatedModelRenderer(this);
		Dorsal_fin_thread.setRotationPoint(0.0F, 0.0F, -1.2F);
		Dorsal_fin.addChild(Dorsal_fin_thread);
		setRotationAngle(Dorsal_fin_thread, 0.1361F, 0.0F, 0.0F);
		Dorsal_fin_thread.setTextureOffset(62, -1).addBox(0.0F, -16.0F, 0.0F, 0.0F, 16.0F, 1.0F, 0.0F, true);
		Dorsal_fin_thread.setModelRendererName("Dorsal_fin_thread");
		this.registerModelRenderer(Dorsal_fin_thread);

		Dorsal_thread_bioluminescent_organ = new AnimatedModelRenderer(this);
		Dorsal_thread_bioluminescent_organ.setRotationPoint(0.0F, -16.0F, 0.5F);
		Dorsal_fin_thread.addChild(Dorsal_thread_bioluminescent_organ);
		Dorsal_thread_bioluminescent_organ.setTextureOffset(58, 0).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Dorsal_thread_bioluminescent_organ.setModelRendererName("Dorsal_thread_bioluminescent_organ");
		this.registerModelRenderer(Dorsal_thread_bioluminescent_organ);

		Pectoral_fin_1 = new AnimatedModelRenderer(this);
		Pectoral_fin_1.setRotationPoint(2.0F, 2.3F, 0.0F);
		Body.addChild(Pectoral_fin_1);
		setRotationAngle(Pectoral_fin_1, 0.0F, 0.0F, -0.182F);
		Pectoral_fin_1.setTextureOffset(48, 5).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 3.0F, 0.0F, false);
		Pectoral_fin_1.setModelRendererName("Pectoral_fin_1");
		this.registerModelRenderer(Pectoral_fin_1);

		Pectoral_fin_2 = new AnimatedModelRenderer(this);
		Pectoral_fin_2.setRotationPoint(-2.0F, 2.3F, 0.0F);
		Body.addChild(Pectoral_fin_2);
		setRotationAngle(Pectoral_fin_2, 0.0F, 0.0F, 0.182F);
		Pectoral_fin_2.setTextureOffset(48, 5).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 3.0F, 0.0F, false);
		Pectoral_fin_2.setModelRendererName("Pectoral_fin_2");
		this.registerModelRenderer(Pectoral_fin_2);

		Pelvic_fin_1 = new AnimatedModelRenderer(this);
		Pelvic_fin_1.setRotationPoint(2.0F, 2.3F, 8.0F);
		Body.addChild(Pelvic_fin_1);
		setRotationAngle(Pelvic_fin_1, 0.0F, 0.0F, -0.3117F);
		Pelvic_fin_1.setTextureOffset(31, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 4.0F, 0.0F, false);
		Pelvic_fin_1.setModelRendererName("Pelvic_fin_1");
		this.registerModelRenderer(Pelvic_fin_1);

		Pelvic_fin_2 = new AnimatedModelRenderer(this);
		Pelvic_fin_2.setRotationPoint(-2.0F, 2.3F, 8.0F);
		Body.addChild(Pelvic_fin_2);
		setRotationAngle(Pelvic_fin_2, 0.0F, 0.0F, 0.3117F);
		Pelvic_fin_2.setTextureOffset(31, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 4.0F, 0.0F, true);
		Pelvic_fin_2.setModelRendererName("Pelvic_fin_2");
		this.registerModelRenderer(Pelvic_fin_2);

    this.rootBones.add(root);
  }


    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation("deep_trenches", "animations/viperfish.json");
    }
}