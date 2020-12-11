// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.CetachsalEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class CetachsalModel extends AnimatedEntityModel<CetachsalEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer Body;
	private final AnimatedModelRenderer Tail;
	private final AnimatedModelRenderer Caudal_fin;
	private final AnimatedModelRenderer Forked_lure_thread;
	private final AnimatedModelRenderer Pelvic_fin_1;
	private final AnimatedModelRenderer Pelvic_fin_2;
	private final AnimatedModelRenderer Pectoral_fin_1;
	private final AnimatedModelRenderer Pectoral_fin_2;
	private final AnimatedModelRenderer Head;
	private final AnimatedModelRenderer Upper_jaw;
	private final AnimatedModelRenderer Nose_hump;
	private final AnimatedModelRenderer Mouth_top;
	private final AnimatedModelRenderer Lower_jaw;
	private final AnimatedModelRenderer Lower_jaw_tip;
	private final AnimatedModelRenderer teeth_1;
	private final AnimatedModelRenderer Teeth;
	private final AnimatedModelRenderer Tooth_1;
	private final AnimatedModelRenderer Tooth_2;

    public CetachsalModel()
    {
        textureWidth = 121;
    textureHeight = 121;
    root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, 0.0F, 0.0F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		Body = new AnimatedModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		root.addChild(Body);
		Body.setTextureOffset(60, 28).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 22.0F, 0.0F, false);
		Body.setModelRendererName("Body");
		this.registerModelRenderer(Body);

		Tail = new AnimatedModelRenderer(this);
		Tail.setRotationPoint(0.0F, 1.0F, 22.0F);
		Body.addChild(Tail);
		Tail.setTextureOffset(0, 35).addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 26.0F, 0.0F, false);
		Tail.setModelRendererName("Tail");
		this.registerModelRenderer(Tail);

		Caudal_fin = new AnimatedModelRenderer(this);
		Caudal_fin.setRotationPoint(0.0F, -1.0F, 26.0F);
		Tail.addChild(Caudal_fin);
		Caudal_fin.setTextureOffset(0, 68).addBox(-11.0F, 0.0F, 0.0F, 22.0F, 2.0F, 8.0F, 0.0F, false);
		Caudal_fin.setModelRendererName("Caudal_fin");
		this.registerModelRenderer(Caudal_fin);

		Forked_lure_thread = new AnimatedModelRenderer(this);
		Forked_lure_thread.setRotationPoint(0.0F, 1.0F, 6.2F);
		Caudal_fin.addChild(Forked_lure_thread);
		Forked_lure_thread.setTextureOffset(0, 80).addBox(-12.0F, 0.0F, 0.0F, 24.0F, 0.0F, 26.0F, 0.0F, false);
		Forked_lure_thread.setModelRendererName("Forked_lure_thread");
		this.registerModelRenderer(Forked_lure_thread);

		Pelvic_fin_1 = new AnimatedModelRenderer(this);
		Pelvic_fin_1.setRotationPoint(3.0F, 0.0F, 4.5F);
		Tail.addChild(Pelvic_fin_1);
		setRotationAngle(Pelvic_fin_1, -0.2276F, 0.0F, 0.0F);
		Pelvic_fin_1.setTextureOffset(0, 33).addBox(0.0F, -8.0F, -2.0F, 1.0F, 8.0F, 6.0F, 0.0F, false);
		Pelvic_fin_1.setModelRendererName("Pelvic_fin_1");
		this.registerModelRenderer(Pelvic_fin_1);

		Pelvic_fin_2 = new AnimatedModelRenderer(this);
		Pelvic_fin_2.setRotationPoint(-3.0F, 0.0F, 4.5F);
		Tail.addChild(Pelvic_fin_2);
		setRotationAngle(Pelvic_fin_2, -0.2276F, 0.0F, 0.0F);
		Pelvic_fin_2.setTextureOffset(0, 33).addBox(-1.0F, -8.0F, -2.0F, 1.0F, 8.0F, 6.0F, 0.0F, false);
		Pelvic_fin_2.setModelRendererName("Pelvic_fin_2");
		this.registerModelRenderer(Pelvic_fin_2);

		Pectoral_fin_1 = new AnimatedModelRenderer(this);
		Pectoral_fin_1.setRotationPoint(4.0F, -0.8F, 2.0F);
		Body.addChild(Pectoral_fin_1);
		Pectoral_fin_1.setTextureOffset(0, 24).addBox(0.0F, -0.5F, -2.0F, 8.0F, 1.0F, 6.0F, 0.0F, true);
		Pectoral_fin_1.setModelRendererName("Pectoral_fin_1");
		this.registerModelRenderer(Pectoral_fin_1);

		Pectoral_fin_2 = new AnimatedModelRenderer(this);
		Pectoral_fin_2.setRotationPoint(-4.0F, -0.8F, 2.0F);
		Body.addChild(Pectoral_fin_2);
		Pectoral_fin_2.setTextureOffset(0, 24).addBox(-8.0F, -0.5F, -2.0F, 8.0F, 1.0F, 6.0F, 0.0F, false);
		Pectoral_fin_2.setModelRendererName("Pectoral_fin_2");
		this.registerModelRenderer(Pectoral_fin_2);

		Head = new AnimatedModelRenderer(this);
		Head.setRotationPoint(0.0F, -1.0F, 0.0F);
		Body.addChild(Head);
		Head.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -8.0F, 6.0F, 4.0F, 8.0F, 0.0F, false);
		Head.setModelRendererName("Head");
		this.registerModelRenderer(Head);

		Upper_jaw = new AnimatedModelRenderer(this);
		Upper_jaw.setRotationPoint(0.0F, 0.0F, -8.0F);
		Head.addChild(Upper_jaw);
		Upper_jaw.setTextureOffset(30, 0).addBox(-2.5F, 0.0F, -16.0F, 5.0F, 3.0F, 16.0F, 0.0F, false);
		Upper_jaw.setModelRendererName("Upper_jaw");
		this.registerModelRenderer(Upper_jaw);

		Nose_hump = new AnimatedModelRenderer(this);
		Nose_hump.setRotationPoint(0.0F, 0.0F, -12.0F);
		Upper_jaw.addChild(Nose_hump);
		Nose_hump.setTextureOffset(0, 17).addBox(-2.5F, -2.0F, -4.0F, 5.0F, 2.0F, 4.0F, 0.0F, false);
		Nose_hump.setModelRendererName("Nose_hump");
		this.registerModelRenderer(Nose_hump);

		Mouth_top = new AnimatedModelRenderer(this);
		Mouth_top.setRotationPoint(0.0F, 1.0F, 0.0F);
		Upper_jaw.addChild(Mouth_top);
		Mouth_top.setTextureOffset(14, 0).addBox(-2.5F, 0.0F, -16.0F, 5.0F, 0.0F, 16.0F, 0.0F, false);
		Mouth_top.setModelRendererName("Mouth_top");
		this.registerModelRenderer(Mouth_top);

		Lower_jaw = new AnimatedModelRenderer(this);
		Lower_jaw.setRotationPoint(0.0F, 1.5F, 0.0F);
		Body.addChild(Lower_jaw);
		Lower_jaw.setTextureOffset(57, 0).addBox(-3.0F, -0.5F, -8.0F, 6.0F, 2.0F, 8.0F, 0.0F, false);
		Lower_jaw.setModelRendererName("Lower_jaw");
		this.registerModelRenderer(Lower_jaw);

		Lower_jaw_tip = new AnimatedModelRenderer(this);
		Lower_jaw_tip.setRotationPoint(0.0F, 0.0F, -8.0F);
		Lower_jaw.addChild(Lower_jaw_tip);
		setRotationAngle(Lower_jaw_tip, 0.2731F, 0.0F, 0.0F);
		Lower_jaw_tip.setTextureOffset(73, 0).addBox(-2.0F, 0.0F, -14.4F, 4.0F, 1.0F, 15.0F, 0.0F, false);
		Lower_jaw_tip.setModelRendererName("Lower_jaw_tip");
		this.registerModelRenderer(Lower_jaw_tip);

		teeth_1 = new AnimatedModelRenderer(this);
		teeth_1.setRotationPoint(1.9F, 0.0F, -14.4F);
		Lower_jaw_tip.addChild(teeth_1);
		teeth_1.setTextureOffset(0, 9).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);
		teeth_1.setModelRendererName("teeth_1");
		this.registerModelRenderer(teeth_1);

		Teeth = new AnimatedModelRenderer(this);
		Teeth.setRotationPoint(-1.9F, 0.0F, -14.4F);
		Lower_jaw_tip.addChild(Teeth);
		Teeth.setTextureOffset(0, 9).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);
		Teeth.setModelRendererName("Teeth");
		this.registerModelRenderer(Teeth);

		Tooth_1 = new AnimatedModelRenderer(this);
		Tooth_1.setRotationPoint(1.4F, 0.0F, -15.12F);
		Lower_jaw_tip.addChild(Tooth_1);
		setRotationAngle(Tooth_1, 0.2276F, 0.0F, 0.0F);
		Tooth_1.setTextureOffset(2, 12).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		Tooth_1.setModelRendererName("Tooth_1");
		this.registerModelRenderer(Tooth_1);

		Tooth_2 = new AnimatedModelRenderer(this);
		Tooth_2.setRotationPoint(-1.4F, 0.0F, -15.12F);
		Lower_jaw_tip.addChild(Tooth_2);
		setRotationAngle(Tooth_2, 0.1367F, 0.0F, 0.0F);
		Tooth_2.setTextureOffset(2, 12).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		Tooth_2.setModelRendererName("Tooth_2");
		this.registerModelRenderer(Tooth_2);

    this.rootBones.add(root);
  }


    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation("deep_trenches", "animations/cetachsal.json");
    }
}