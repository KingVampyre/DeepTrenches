// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.ThreadfinDragonfishEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class ThreadfinDragonfishModel extends AnimatedEntityModel<ThreadfinDragonfishEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer Body;
	private final AnimatedModelRenderer Head;
	private final AnimatedModelRenderer Upper_jaw_teeth_1;
	private final AnimatedModelRenderer Upper_jaw_teeth_2;
	private final AnimatedModelRenderer Upper_teeth_front;
	private final AnimatedModelRenderer Eye_1;
	private final AnimatedModelRenderer Eye_2;
	private final AnimatedModelRenderer Uhmmm;
	private final AnimatedModelRenderer Lower_jaw;
	private final AnimatedModelRenderer Teeth_1;
	private final AnimatedModelRenderer Teeth_2;
	private final AnimatedModelRenderer Lower_jaw_frontteeth;
	private final AnimatedModelRenderer Lower_jaw_front_tooth_1;
	private final AnimatedModelRenderer Barbel_joint;
	private final AnimatedModelRenderer Barbel;
	private final AnimatedModelRenderer Barbel_bulb;
	private final AnimatedModelRenderer Barbel_bulb_appandage;
	private final AnimatedModelRenderer Caudal;
	private final AnimatedModelRenderer Caudal_fin;
	private final AnimatedModelRenderer Pelvic_fin_1;
	private final AnimatedModelRenderer Pelvic_fin_2;
	private final AnimatedModelRenderer Dorsal_fin;
	private final AnimatedModelRenderer Anal_fin;
	private final AnimatedModelRenderer Pectoral_fin_1;
	private final AnimatedModelRenderer Pectoral_thread_1;
	private final AnimatedModelRenderer Pectoral_fin_2;
	private final AnimatedModelRenderer Pectoral_thread_2;

    public ThreadfinDragonfishModel()
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
		Body.setTextureOffset(0, 0).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 16.0F, 0.0F, false);
		Body.setModelRendererName("Body");
		this.registerModelRenderer(Body);

		Head = new AnimatedModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(Head);
		Head.setTextureOffset(0, 0).addBox(-1.5F, -1.5F, -4.8F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		Head.setModelRendererName("Head");
		this.registerModelRenderer(Head);

		Upper_jaw_teeth_1 = new AnimatedModelRenderer(this);
		Upper_jaw_teeth_1.setRotationPoint(1.4F, 0.5F, -2.5F);
		Head.addChild(Upper_jaw_teeth_1);
		setRotationAngle(Upper_jaw_teeth_1, 0.2731F, 0.0F, 0.0F);
		Upper_jaw_teeth_1.setTextureOffset(24, 8).addBox(-0.05F, -0.1F, -2.0F, 0.0F, 2.0F, 5.0F, 0.0F, false);
		Upper_jaw_teeth_1.setModelRendererName("Upper_jaw_teeth_1");
		this.registerModelRenderer(Upper_jaw_teeth_1);

		Upper_jaw_teeth_2 = new AnimatedModelRenderer(this);
		Upper_jaw_teeth_2.setRotationPoint(-1.4F, 0.5F, -2.5F);
		Head.addChild(Upper_jaw_teeth_2);
		setRotationAngle(Upper_jaw_teeth_2, 0.2731F, 0.0F, 0.0F);
		Upper_jaw_teeth_2.setTextureOffset(24, 8).addBox(-0.05F, -0.1F, -2.0F, 0.0F, 2.0F, 5.0F, 0.0F, false);
		Upper_jaw_teeth_2.setModelRendererName("Upper_jaw_teeth_2");
		this.registerModelRenderer(Upper_jaw_teeth_2);

		Upper_teeth_front = new AnimatedModelRenderer(this);
		Upper_teeth_front.setRotationPoint(0.0F, 1.3F, -4.7F);
		Head.addChild(Upper_teeth_front);
		Upper_teeth_front.setTextureOffset(24, 11).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		Upper_teeth_front.setModelRendererName("Upper_teeth_front");
		this.registerModelRenderer(Upper_teeth_front);

		Eye_1 = new AnimatedModelRenderer(this);
		Eye_1.setRotationPoint(1.5F, -0.6F, -3.3F);
		Head.addChild(Eye_1);
		Eye_1.setTextureOffset(0, 0).addBox(-0.99F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Eye_1.setModelRendererName("Eye_1");
		this.registerModelRenderer(Eye_1);

		Eye_2 = new AnimatedModelRenderer(this);
		Eye_2.setRotationPoint(-0.5F, -0.6F, -3.3F);
		Head.addChild(Eye_2);
		Eye_2.setTextureOffset(0, 0).addBox(-1.01F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Eye_2.setModelRendererName("Eye_2");
		this.registerModelRenderer(Eye_2);

		Uhmmm = new AnimatedModelRenderer(this);
		Uhmmm.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(Uhmmm);
		Uhmmm.setTextureOffset(49, 10).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		Uhmmm.setModelRendererName("Uhmmm");
		this.registerModelRenderer(Uhmmm);

		Lower_jaw = new AnimatedModelRenderer(this);
		Lower_jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(Lower_jaw);
		setRotationAngle(Lower_jaw, 0.3643F, 0.0F, 0.0F);
		Lower_jaw.setTextureOffset(0, 8).addBox(-1.5F, 0.5F, -4.8F, 3.0F, 1.0F, 5.0F, 0.0F, false);
		Lower_jaw.setModelRendererName("Lower_jaw");
		this.registerModelRenderer(Lower_jaw);

		Teeth_1 = new AnimatedModelRenderer(this);
		Teeth_1.setRotationPoint(1.48F, 1.1F, 0.2F);
		Lower_jaw.addChild(Teeth_1);
		setRotationAngle(Teeth_1, -0.1367F, 0.0F, 0.0F);
		Teeth_1.setTextureOffset(35, 8).addBox(0.0F, -2.0F, -5.0F, 0.0F, 2.0F, 5.0F, 0.0F, false);
		Teeth_1.setModelRendererName("Teeth_1");
		this.registerModelRenderer(Teeth_1);

		Teeth_2 = new AnimatedModelRenderer(this);
		Teeth_2.setRotationPoint(-1.48F, 1.2F, 0.2F);
		Lower_jaw.addChild(Teeth_2);
		setRotationAngle(Teeth_2, -0.1367F, 0.0F, 0.0F);
		Teeth_2.setTextureOffset(35, 8).addBox(0.0F, -2.0F, -5.0F, 0.0F, 2.0F, 5.0F, 0.0F, false);
		Teeth_2.setModelRendererName("Teeth_2");
		this.registerModelRenderer(Teeth_2);

		Lower_jaw_frontteeth = new AnimatedModelRenderer(this);
		Lower_jaw_frontteeth.setRotationPoint(0.0F, 0.5F, -4.7F);
		Lower_jaw.addChild(Lower_jaw_frontteeth);
		Lower_jaw_frontteeth.setTextureOffset(35, 11).addBox(-1.5F, -0.9F, 0.0F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		Lower_jaw_frontteeth.setModelRendererName("Lower_jaw_frontteeth");
		this.registerModelRenderer(Lower_jaw_frontteeth);

		Lower_jaw_front_tooth_1 = new AnimatedModelRenderer(this);
		Lower_jaw_front_tooth_1.setRotationPoint(0.0F, 0.0F, -5.0F);
		Lower_jaw.addChild(Lower_jaw_front_tooth_1);
		Lower_jaw_front_tooth_1.setTextureOffset(42, 9).addBox(0.0F, -1.5F, -0.3F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Lower_jaw_front_tooth_1.setModelRendererName("Lower_jaw_front_tooth_1");
		this.registerModelRenderer(Lower_jaw_front_tooth_1);

		Barbel_joint = new AnimatedModelRenderer(this);
		Barbel_joint.setRotationPoint(0.0F, 1.5F, -3.8F);
		Lower_jaw.addChild(Barbel_joint);
		Barbel_joint.setTextureOffset(0, 3).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, 0.0F, false);
		Barbel_joint.setModelRendererName("Barbel_joint");
		this.registerModelRenderer(Barbel_joint);

		Barbel = new AnimatedModelRenderer(this);
		Barbel.setRotationPoint(0.0F, 0.0F, 0.0F);
		Barbel_joint.addChild(Barbel);
		Barbel.setTextureOffset(37, 0).addBox(0.0F, 0.0F, -0.5F, 0.0F, 6.0F, 1.0F, 0.0F, false);
		Barbel.setModelRendererName("Barbel");
		this.registerModelRenderer(Barbel);

		Barbel_bulb = new AnimatedModelRenderer(this);
		Barbel_bulb.setRotationPoint(0.5F, 5.6F, 0.0F);
		Barbel.addChild(Barbel_bulb);
		Barbel_bulb.setTextureOffset(39, 1).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Barbel_bulb.setModelRendererName("Barbel_bulb");
		this.registerModelRenderer(Barbel_bulb);

		Barbel_bulb_appandage = new AnimatedModelRenderer(this);
		Barbel_bulb_appandage.setRotationPoint(-0.5F, 0.9F, 0.0F);
		Barbel_bulb.addChild(Barbel_bulb_appandage);
		Barbel_bulb_appandage.setTextureOffset(39, 3).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Barbel_bulb_appandage.setModelRendererName("Barbel_bulb_appandage");
		this.registerModelRenderer(Barbel_bulb_appandage);

		Caudal = new AnimatedModelRenderer(this);
		Caudal.setRotationPoint(0.0F, 0.0F, 15.7F);
		Body.addChild(Caudal);
		Caudal.setTextureOffset(0, 19).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
		Caudal.setModelRendererName("Caudal");
		this.registerModelRenderer(Caudal);

		Caudal_fin = new AnimatedModelRenderer(this);
		Caudal_fin.setRotationPoint(0.0F, 0.0F, 7.7F);
		Caudal.addChild(Caudal_fin);
		Caudal_fin.setTextureOffset(22, 8).addBox(0.0F, -4.5F, 0.0F, 0.0F, 9.0F, 13.0F, 0.0F, false);
		Caudal_fin.setModelRendererName("Caudal_fin");
		this.registerModelRenderer(Caudal_fin);

		Pelvic_fin_1 = new AnimatedModelRenderer(this);
		Pelvic_fin_1.setRotationPoint(1.5F, 1.0F, 0.1F);
		Caudal.addChild(Pelvic_fin_1);
		setRotationAngle(Pelvic_fin_1, 0.8652F, 0.0F, 0.0F);
		Pelvic_fin_1.setTextureOffset(34, 0).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		Pelvic_fin_1.setModelRendererName("Pelvic_fin_1");
		this.registerModelRenderer(Pelvic_fin_1);

		Pelvic_fin_2 = new AnimatedModelRenderer(this);
		Pelvic_fin_2.setRotationPoint(-1.5F, 1.0F, 0.1F);
		Caudal.addChild(Pelvic_fin_2);
		setRotationAngle(Pelvic_fin_2, 0.8652F, 0.0F, 0.0F);
		Pelvic_fin_2.setTextureOffset(34, 0).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		Pelvic_fin_2.setModelRendererName("Pelvic_fin_2");
		this.registerModelRenderer(Pelvic_fin_2);

		Dorsal_fin = new AnimatedModelRenderer(this);
		Dorsal_fin.setRotationPoint(0.0F, -1.5F, 4.5F);
		Caudal.addChild(Dorsal_fin);
		Dorsal_fin.setTextureOffset(14, 19).addBox(0.0F, -2.9F, -1.6F, 0.0F, 3.0F, 4.0F, 0.0F, false);
		Dorsal_fin.setModelRendererName("Dorsal_fin");
		this.registerModelRenderer(Dorsal_fin);

		Anal_fin = new AnimatedModelRenderer(this);
		Anal_fin.setRotationPoint(0.0F, 1.1F, 5.5F);
		Caudal.addChild(Anal_fin);
		Anal_fin.setTextureOffset(0, 19).addBox(0.0F, 0.0F, -1.5F, 0.0F, 3.0F, 4.0F, 0.0F, false);
		Anal_fin.setModelRendererName("Anal_fin");
		this.registerModelRenderer(Anal_fin);

		Pectoral_fin_1 = new AnimatedModelRenderer(this);
		Pectoral_fin_1.setRotationPoint(1.5F, 1.5F, 0.5F);
		Body.addChild(Pectoral_fin_1);
		setRotationAngle(Pectoral_fin_1, 0.2276F, 0.0F, 0.0F);
		Pectoral_fin_1.setTextureOffset(28, 0).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Pectoral_fin_1.setModelRendererName("Pectoral_fin_1");
		this.registerModelRenderer(Pectoral_fin_1);

		Pectoral_thread_1 = new AnimatedModelRenderer(this);
		Pectoral_thread_1.setRotationPoint(-0.1F, 0.0F, -0.5F);
		Pectoral_fin_1.addChild(Pectoral_thread_1);
		setRotationAngle(Pectoral_thread_1, 0.2731F, 0.1367F, -0.0911F);
		Pectoral_thread_1.setTextureOffset(31, 0).addBox(0.0F, 0.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, false);
		Pectoral_thread_1.setModelRendererName("Pectoral_thread_1");
		this.registerModelRenderer(Pectoral_thread_1);

		Pectoral_fin_2 = new AnimatedModelRenderer(this);
		Pectoral_fin_2.setRotationPoint(-1.5F, 1.5F, 0.5F);
		Body.addChild(Pectoral_fin_2);
		setRotationAngle(Pectoral_fin_2, 0.2276F, 0.0F, 0.0F);
		Pectoral_fin_2.setTextureOffset(28, 0).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Pectoral_fin_2.setModelRendererName("Pectoral_fin_2");
		this.registerModelRenderer(Pectoral_fin_2);

		Pectoral_thread_2 = new AnimatedModelRenderer(this);
		Pectoral_thread_2.setRotationPoint(0.1F, 0.0F, -0.5F);
		Pectoral_fin_2.addChild(Pectoral_thread_2);
		setRotationAngle(Pectoral_thread_2, 0.2731F, -0.1367F, 0.0911F);
		Pectoral_thread_2.setTextureOffset(31, 0).addBox(0.0F, 0.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, false);
		Pectoral_thread_2.setModelRendererName("Pectoral_thread_2");
		this.registerModelRenderer(Pectoral_thread_2);

    this.rootBones.add(root);
  }


    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation("deep_trenches", "animations/threadfin_dragonfish.json");
    }
}