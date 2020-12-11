// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.GiantSeedShrimpEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class GiantSeedShrimpModel extends AnimatedEntityModel<GiantSeedShrimpEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer Body;
	private final AnimatedModelRenderer Antennas;
	private final AnimatedModelRenderer Leg_side_1;
	private final AnimatedModelRenderer Leg_side_2;

    public GiantSeedShrimpModel()
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
		Body.setTextureOffset(0, 0).addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		Body.setModelRendererName("Body");
		this.registerModelRenderer(Body);

		Antennas = new AnimatedModelRenderer(this);
		Antennas.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(Antennas);
		Antennas.setTextureOffset(12, 16).addBox(-2.5F, 0.0F, -6.0F, 5.0F, 0.0F, 6.0F, 0.0F, false);
		Antennas.setModelRendererName("Antennas");
		this.registerModelRenderer(Antennas);

		Leg_side_1 = new AnimatedModelRenderer(this);
		Leg_side_1.setRotationPoint(2.0F, 1.0F, 1.0F);
		Body.addChild(Leg_side_1);
		Leg_side_1.setTextureOffset(0, 17).addBox(0.0F, 0.0F, -3.0F, 5.0F, 0.0F, 5.0F, 0.0F, false);
		Leg_side_1.setModelRendererName("Leg_side_1");
		this.registerModelRenderer(Leg_side_1);

		Leg_side_2 = new AnimatedModelRenderer(this);
		Leg_side_2.setRotationPoint(-2.0F, 1.0F, 1.0F);
		Body.addChild(Leg_side_2);
		Leg_side_2.setTextureOffset(0, 17).addBox(-5.0F, 0.0F, -3.0F, 5.0F, 0.0F, 5.0F, 0.0F, true);
		Leg_side_2.setModelRendererName("Leg_side_2");
		this.registerModelRenderer(Leg_side_2);

    this.rootBones.add(root);
  }


    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation("deep_trenches", "animations/giant_seed_shrimp.json");
    }
}