// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.MaggotEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class MaggotModel extends AnimatedEntityModel<MaggotEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer Body;
	private final AnimatedModelRenderer Head_rear;
	private final AnimatedModelRenderer Head_front;
	private final AnimatedModelRenderer Claw_1;
	private final AnimatedModelRenderer Claw_2;
	private final AnimatedModelRenderer Body_rear;
	private final AnimatedModelRenderer Weird_1;
	private final AnimatedModelRenderer Weird_2;

    public MaggotModel()
    {
        textureWidth = 64;
    textureHeight = 32;
    root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, 0.0F, 0.0F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		Body = new AnimatedModelRenderer(this);
		Body.setRotationPoint(1.0F, 22.0F, -3.3F);
		root.addChild(Body);
		Body.setTextureOffset(5, 0).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 6.0F, 0.0F, false);
		Body.setModelRendererName("Body");
		this.registerModelRenderer(Body);

		Head_rear = new AnimatedModelRenderer(this);
		Head_rear.setRotationPoint(0.0F, 0.4F, -0.3F);
		Body.addChild(Head_rear);
		Head_rear.setTextureOffset(25, 4).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		Head_rear.setModelRendererName("Head_rear");
		this.registerModelRenderer(Head_rear);

		Head_front = new AnimatedModelRenderer(this);
		Head_front.setRotationPoint(0.0F, 0.5F, -1.7F);
		Head_rear.addChild(Head_front);
		Head_front.setTextureOffset(37, 6).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Head_front.setModelRendererName("Head_front");
		this.registerModelRenderer(Head_front);

		Claw_1 = new AnimatedModelRenderer(this);
		Claw_1.setRotationPoint(0.9F, 0.15F, -1.5F);
		Head_front.addChild(Claw_1);
		setRotationAngle(Claw_1, 0.2531F, -0.1449F, -0.0028F);
		Claw_1.setTextureOffset(37, 9).addBox(0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Claw_1.setModelRendererName("Claw_1");
		this.registerModelRenderer(Claw_1);

		Claw_2 = new AnimatedModelRenderer(this);
		Claw_2.setRotationPoint(-0.9F, 0.15F, -1.5F);
		Head_front.addChild(Claw_2);
		setRotationAngle(Claw_2, 0.2531F, 0.1449F, 0.0F);
		Claw_2.setTextureOffset(37, 9).addBox(0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Claw_2.setModelRendererName("Claw_2");
		this.registerModelRenderer(Claw_2);

		Body_rear = new AnimatedModelRenderer(this);
		Body_rear.setRotationPoint(0.0F, 0.4F, 5.7F);
		Body.addChild(Body_rear);
		Body_rear.setTextureOffset(0, 10).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		Body_rear.setModelRendererName("Body_rear");
		this.registerModelRenderer(Body_rear);

		Weird_1 = new AnimatedModelRenderer(this);
		Weird_1.setRotationPoint(1.51F, 0.2F, 2.6F);
		Body_rear.addChild(Weird_1);
		setRotationAngle(Weird_1, -0.0332F, 0.0F, 0.0F);
		Weird_1.setTextureOffset(0, 11).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Weird_1.setModelRendererName("Weird_1");
		this.registerModelRenderer(Weird_1);

		Weird_2 = new AnimatedModelRenderer(this);
		Weird_2.setRotationPoint(-1.51F, 0.2F, 2.6F);
		Body_rear.addChild(Weird_2);
		setRotationAngle(Weird_2, -0.0332F, -0.0911F, 0.0F);
		Weird_2.setTextureOffset(0, 11).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Weird_2.setModelRendererName("Weird_2");
		this.registerModelRenderer(Weird_2);

    this.rootBones.add(root);
  }


    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation("deep_trenches", "animations/maggot.json");
    }
}