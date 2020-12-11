// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BottleFlyMaggotEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class BottleFlyMaggotModel extends AnimatedEntityModel<BottleFlyMaggotEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer Body;
	private final AnimatedModelRenderer Head;
	private final AnimatedModelRenderer Mouth_hook_1;
	private final AnimatedModelRenderer Mouth_hook_2;
	private final AnimatedModelRenderer Rear_part;
	private final AnimatedModelRenderer Rear_protudences;

    public BottleFlyMaggotModel()
    {
        textureWidth = 64;
    textureHeight = 32;
    root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, 0.0F, 0.0F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		Body = new AnimatedModelRenderer(this);
		Body.setRotationPoint(0.0F, 22.3F, -2.0F);
		root.addChild(Body);
		Body.setTextureOffset(0, 5).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);
		Body.setModelRendererName("Body");
		this.registerModelRenderer(Body);

		Head = new AnimatedModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.5F, -3.0F);
		Body.addChild(Head);
		Head.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		Head.setModelRendererName("Head");
		this.registerModelRenderer(Head);

		Mouth_hook_1 = new AnimatedModelRenderer(this);
		Mouth_hook_1.setRotationPoint(-0.9F, 0.2F, -1.6F);
		Head.addChild(Mouth_hook_1);
		setRotationAngle(Mouth_hook_1, 0.5463F, 0.0F, 0.0F);
		Mouth_hook_1.setTextureOffset(9, 0).addBox(0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Mouth_hook_1.setModelRendererName("Mouth_hook_1");
		this.registerModelRenderer(Mouth_hook_1);

		Mouth_hook_2 = new AnimatedModelRenderer(this);
		Mouth_hook_2.setRotationPoint(0.9F, 0.2F, -1.6F);
		Head.addChild(Mouth_hook_2);
		setRotationAngle(Mouth_hook_2, 0.5463F, 0.0F, 0.0F);
		Mouth_hook_2.setTextureOffset(12, 0).addBox(0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Mouth_hook_2.setModelRendererName("Mouth_hook_2");
		this.registerModelRenderer(Mouth_hook_2);

		Rear_part = new AnimatedModelRenderer(this);
		Rear_part.setRotationPoint(0.0F, -0.5F, 0.0F);
		Body.addChild(Rear_part);
		Rear_part.setTextureOffset(0, 13).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);
		Rear_part.setModelRendererName("Rear_part");
		this.registerModelRenderer(Rear_part);

		Rear_protudences = new AnimatedModelRenderer(this);
		Rear_protudences.setRotationPoint(0.0F, 0.0F, 8.0F);
		Rear_part.addChild(Rear_protudences);
		Rear_protudences.setTextureOffset(0, 26).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Rear_protudences.setModelRendererName("Rear_protudences");
		this.registerModelRenderer(Rear_protudences);

    this.rootBones.add(root);
  }


    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation("deep_trenches", "animations/bottlefly_maggot.json");
    }
}