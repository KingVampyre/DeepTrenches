// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BrownBearEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class BrownBearModel extends AnimatedEntityModel<BrownBearEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer Body;
	private final AnimatedModelRenderer Body_rear;
	private final AnimatedModelRenderer Leg_3;
	private final AnimatedModelRenderer Leg_4;
	private final AnimatedModelRenderer Head;
	private final AnimatedModelRenderer Snout;
	private final AnimatedModelRenderer Ear_1;
	private final AnimatedModelRenderer Ear_2;
	private final AnimatedModelRenderer Hump;
	private final AnimatedModelRenderer Leg_1;
	private final AnimatedModelRenderer Leg_2;

    public BrownBearModel()
    {
        textureWidth = 128;
    textureHeight = 64;
    root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, 0.0F, 0.0F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		Body = new AnimatedModelRenderer(this);
		Body.setRotationPoint(0.0F, 6.5F, -16.0F);
		root.addChild(Body);
		Body.setTextureOffset(47, 0).addBox(-6.5F, -6.5F, 0.0F, 13.0F, 13.0F, 14.0F, 0.0F, false);
		Body.setModelRendererName("Body");
		this.registerModelRenderer(Body);

		Body_rear = new AnimatedModelRenderer(this);
		Body_rear.setRotationPoint(0.0F, -0.5F, 14.0F);
		Body.addChild(Body_rear);
		Body_rear.setTextureOffset(0, 19).addBox(-7.5F, -7.0F, 0.0F, 15.0F, 14.0F, 16.0F, 0.0F, false);
		Body_rear.setModelRendererName("Body_rear");
		this.registerModelRenderer(Body_rear);

		Leg_3 = new AnimatedModelRenderer(this);
		Leg_3.setRotationPoint(5.2F, 1.0F, 10.0F);
		Body_rear.addChild(Leg_3);
		Leg_3.setTextureOffset(64, 28).addBox(-2.5F, 1.0F, -5.0F, 5.0F, 16.0F, 10.0F, 0.0F, false);
		Leg_3.setModelRendererName("Leg_3");
		this.registerModelRenderer(Leg_3);

		Leg_4 = new AnimatedModelRenderer(this);
		Leg_4.setRotationPoint(-5.2F, 1.0F, 10.0F);
		Body_rear.addChild(Leg_4);
		Leg_4.setTextureOffset(64, 28).addBox(-2.5F, 1.0F, -5.0F, 5.0F, 16.0F, 10.0F, 0.0F, false);
		Leg_4.setModelRendererName("Leg_4");
		this.registerModelRenderer(Leg_4);

		Head = new AnimatedModelRenderer(this);
		Head.setRotationPoint(0.0F, 2.0F, 0.0F);
		Body.addChild(Head);
		Head.setTextureOffset(0, 0).addBox(-4.5F, -4.0F, -9.0F, 9.0F, 8.0F, 9.0F, 0.0F, false);
		Head.setModelRendererName("Head");
		this.registerModelRenderer(Head);

		Snout = new AnimatedModelRenderer(this);
		Snout.setRotationPoint(0.0F, 2.0F, -9.0F);
		Head.addChild(Snout);
		Snout.setTextureOffset(0, 51).addBox(-3.5F, -2.0F, -2.5F, 7.0F, 4.0F, 3.0F, 0.0F, false);
		Snout.setModelRendererName("Snout");
		this.registerModelRenderer(Snout);

		Ear_1 = new AnimatedModelRenderer(this);
		Ear_1.setRotationPoint(4.5F, -4.0F, -6.5F);
		Head.addChild(Ear_1);
		Ear_1.setTextureOffset(28, 0).addBox(-2.0F, -1.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		Ear_1.setModelRendererName("Ear_1");
		this.registerModelRenderer(Ear_1);

		Ear_2 = new AnimatedModelRenderer(this);
		Ear_2.setRotationPoint(-4.5F, -4.0F, -6.5F);
		Head.addChild(Ear_2);
		Ear_2.setTextureOffset(28, 0).addBox(-1.0F, -1.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		Ear_2.setModelRendererName("Ear_2");
		this.registerModelRenderer(Ear_2);

		Hump = new AnimatedModelRenderer(this);
		Hump.setRotationPoint(0.0F, -6.5F, 6.0F);
		Body.addChild(Hump);
		Hump.setTextureOffset(88, 0).addBox(-4.0F, -2.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.0F, false);
		Hump.setModelRendererName("Hump");
		this.registerModelRenderer(Hump);

		Leg_1 = new AnimatedModelRenderer(this);
		Leg_1.setRotationPoint(4.0F, 5.5F, 6.0F);
		Body.addChild(Leg_1);
		Leg_1.setTextureOffset(96, 35).addBox(-2.5F, 1.0F, -4.0F, 5.0F, 11.0F, 8.0F, 0.0F, false);
		Leg_1.setModelRendererName("Leg_1");
		this.registerModelRenderer(Leg_1);

		Leg_2 = new AnimatedModelRenderer(this);
		Leg_2.setRotationPoint(-4.0F, 5.5F, 6.0F);
		Body.addChild(Leg_2);
		Leg_2.setTextureOffset(96, 35).addBox(-2.5F, 1.0F, -4.0F, 5.0F, 11.0F, 8.0F, 0.0F, true);
		Leg_2.setModelRendererName("Leg_2");
		this.registerModelRenderer(Leg_2);

    this.rootBones.add(root);
  }


    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation("deep_trenches", "animations/brown_bear.json");
    }
}