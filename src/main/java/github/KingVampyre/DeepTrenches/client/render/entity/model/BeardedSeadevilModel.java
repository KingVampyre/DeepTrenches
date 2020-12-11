// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BeardedSeadevilEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class BeardedSeadevilModel extends AnimatedEntityModel<BeardedSeadevilEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer Body;
	private final AnimatedModelRenderer Upper_jaw;
	private final AnimatedModelRenderer Upper_jaw_teeth_1;
	private final AnimatedModelRenderer Upper_jaw_teeth_front;
	private final AnimatedModelRenderer Upper_jaw_teeth_3;
	private final AnimatedModelRenderer Upper_jaw_lure_stem;
	private final AnimatedModelRenderer Upper_jaw_lure_bulb;
	private final AnimatedModelRenderer Appendages_op_upper_jaw_lure_bulb;
	private final AnimatedModelRenderer Horn_1;
	private final AnimatedModelRenderer Horn_2;
	private final AnimatedModelRenderer Lower_jaw;
	private final AnimatedModelRenderer Lower_jaw_teeth_1;
	private final AnimatedModelRenderer Lower_jaw_teeth_2;
	private final AnimatedModelRenderer Lower_jaw_teeth_3;
	private final AnimatedModelRenderer Lower_jaw_lure_connection;
	private final AnimatedModelRenderer Lower_jaw_lure_1;
	private final AnimatedModelRenderer Lower_jaw_lure_2;
	private final AnimatedModelRenderer Caudal_area;
	private final AnimatedModelRenderer Pectoral_fin_1;
	private final AnimatedModelRenderer Pectoral_fin_2;

    public BeardedSeadevilModel()
    {
        textureWidth = 90;
    textureHeight = 64;
    root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, 0.0F, 0.0F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		Body = new AnimatedModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		root.addChild(Body);
		Body.setTextureOffset(0, 0).addBox(-2.5F, -3.5F, 0.0F, 5.0F, 8.0F, 9.0F, 0.0F, false);
		Body.setModelRendererName("Body");
		this.registerModelRenderer(Body);

		Upper_jaw = new AnimatedModelRenderer(this);
		Upper_jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(Upper_jaw);
		Upper_jaw.setTextureOffset(29, 0).addBox(-2.0F, -3.0F, -6.0F, 4.0F, 4.0F, 7.0F, 0.0F, false);
		Upper_jaw.setModelRendererName("Upper_jaw");
		this.registerModelRenderer(Upper_jaw);

		Upper_jaw_teeth_1 = new AnimatedModelRenderer(this);
		Upper_jaw_teeth_1.setRotationPoint(-1.7F, 0.8F, 0.0F);
		Upper_jaw.addChild(Upper_jaw_teeth_1);
		Upper_jaw_teeth_1.setTextureOffset(23, -6).addBox(0.0F, 0.0F, -6.0F, 0.0F, 3.0F, 6.0F, 0.0F, false);
		Upper_jaw_teeth_1.setModelRendererName("Upper_jaw_teeth_1");
		this.registerModelRenderer(Upper_jaw_teeth_1);

		Upper_jaw_teeth_front = new AnimatedModelRenderer(this);
		Upper_jaw_teeth_front.setRotationPoint(0.0F, 0.8F, -5.7F);
		Upper_jaw.addChild(Upper_jaw_teeth_front);
		Upper_jaw_teeth_front.setTextureOffset(23, 4).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 0.0F, 0.0F, false);
		Upper_jaw_teeth_front.setModelRendererName("Upper_jaw_teeth_front");
		this.registerModelRenderer(Upper_jaw_teeth_front);

		Upper_jaw_teeth_3 = new AnimatedModelRenderer(this);
		Upper_jaw_teeth_3.setRotationPoint(1.9F, 0.8F, 0.0F);
		Upper_jaw.addChild(Upper_jaw_teeth_3);
		Upper_jaw_teeth_3.setTextureOffset(23, -6).addBox(0.0F, 0.0F, -6.0F, 0.0F, 3.0F, 6.0F, 0.0F, false);
		Upper_jaw_teeth_3.setModelRendererName("Upper_jaw_teeth_3");
		this.registerModelRenderer(Upper_jaw_teeth_3);

		Upper_jaw_lure_stem = new AnimatedModelRenderer(this);
		Upper_jaw_lure_stem.setRotationPoint(0.0F, -3.0F, -5.5F);
		Upper_jaw.addChild(Upper_jaw_lure_stem);
		setRotationAngle(Upper_jaw_lure_stem, 0.2731F, 0.0F, 0.0F);
		Upper_jaw_lure_stem.setTextureOffset(20, 17).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		Upper_jaw_lure_stem.setModelRendererName("Upper_jaw_lure_stem");
		this.registerModelRenderer(Upper_jaw_lure_stem);

		Upper_jaw_lure_bulb = new AnimatedModelRenderer(this);
		Upper_jaw_lure_bulb.setRotationPoint(0.0F, -3.0F, 0.0F);
		Upper_jaw_lure_stem.addChild(Upper_jaw_lure_bulb);
		Upper_jaw_lure_bulb.setTextureOffset(19, 22).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Upper_jaw_lure_bulb.setModelRendererName("Upper_jaw_lure_bulb");
		this.registerModelRenderer(Upper_jaw_lure_bulb);

		Appendages_op_upper_jaw_lure_bulb = new AnimatedModelRenderer(this);
		Appendages_op_upper_jaw_lure_bulb.setRotationPoint(0.0F, -1.0F, 0.0F);
		Upper_jaw_lure_bulb.addChild(Appendages_op_upper_jaw_lure_bulb);
		Appendages_op_upper_jaw_lure_bulb.setTextureOffset(18, 21).addBox(0.0F, -3.0F, -1.5F, 0.0F, 4.0F, 4.0F, 0.0F, false);
		Appendages_op_upper_jaw_lure_bulb.setModelRendererName("Appendages_op_upper_jaw_lure_bulb");
		this.registerModelRenderer(Appendages_op_upper_jaw_lure_bulb);

		Horn_1 = new AnimatedModelRenderer(this);
		Horn_1.setRotationPoint(-1.5F, -2.8F, -3.0F);
		Upper_jaw.addChild(Horn_1);
		setRotationAngle(Horn_1, 0.0F, 0.0F, -0.2731F);
		Horn_1.setTextureOffset(16, 17).addBox(0.0F, -2.2F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Horn_1.setModelRendererName("Horn_1");
		this.registerModelRenderer(Horn_1);

		Horn_2 = new AnimatedModelRenderer(this);
		Horn_2.setRotationPoint(1.5F, -2.8F, -3.0F);
		Upper_jaw.addChild(Horn_2);
		setRotationAngle(Horn_2, 0.0F, 0.0F, 0.2731F);
		Horn_2.setTextureOffset(16, 20).addBox(0.0F, -2.2F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Horn_2.setModelRendererName("Horn_2");
		this.registerModelRenderer(Horn_2);

		Lower_jaw = new AnimatedModelRenderer(this);
		Lower_jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(Lower_jaw);
		setRotationAngle(Lower_jaw, 0.5009F, 0.0F, 0.0F);
		Lower_jaw.setTextureOffset(29, 12).addBox(-2.0F, 1.0F, -6.0F, 4.0F, 3.0F, 7.0F, 0.0F, false);
		Lower_jaw.setModelRendererName("Lower_jaw");
		this.registerModelRenderer(Lower_jaw);

		Lower_jaw_teeth_1 = new AnimatedModelRenderer(this);
		Lower_jaw_teeth_1.setRotationPoint(-1.9F, 1.2F, 0.0F);
		Lower_jaw.addChild(Lower_jaw_teeth_1);
		Lower_jaw_teeth_1.setTextureOffset(29, 17).addBox(0.0F, -3.0F, -6.0F, 0.0F, 3.0F, 6.0F, 0.0F, false);
		Lower_jaw_teeth_1.setModelRendererName("Lower_jaw_teeth_1");
		this.registerModelRenderer(Lower_jaw_teeth_1);

		Lower_jaw_teeth_2 = new AnimatedModelRenderer(this);
		Lower_jaw_teeth_2.setRotationPoint(0.0F, 1.2F, -5.9F);
		Lower_jaw.addChild(Lower_jaw_teeth_2);
		Lower_jaw_teeth_2.setTextureOffset(42, 23).addBox(-2.0F, -3.5F, 0.0F, 4.0F, 4.0F, 0.0F, 0.0F, false);
		Lower_jaw_teeth_2.setModelRendererName("Lower_jaw_teeth_2");
		this.registerModelRenderer(Lower_jaw_teeth_2);

		Lower_jaw_teeth_3 = new AnimatedModelRenderer(this);
		Lower_jaw_teeth_3.setRotationPoint(1.9F, 1.2F, 0.0F);
		Lower_jaw.addChild(Lower_jaw_teeth_3);
		Lower_jaw_teeth_3.setTextureOffset(29, 17).addBox(0.0F, -3.2F, -6.0F, 0.0F, 3.0F, 6.0F, 0.0F, false);
		Lower_jaw_teeth_3.setModelRendererName("Lower_jaw_teeth_3");
		this.registerModelRenderer(Lower_jaw_teeth_3);

		Lower_jaw_lure_connection = new AnimatedModelRenderer(this);
		Lower_jaw_lure_connection.setRotationPoint(0.0F, 4.0F, -4.5F);
		Lower_jaw.addChild(Lower_jaw_lure_connection);
		Lower_jaw_lure_connection.setTextureOffset(0, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, 0.0F, false);
		Lower_jaw_lure_connection.setModelRendererName("Lower_jaw_lure_connection");
		this.registerModelRenderer(Lower_jaw_lure_connection);

		Lower_jaw_lure_1 = new AnimatedModelRenderer(this);
		Lower_jaw_lure_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Lower_jaw_lure_connection.addChild(Lower_jaw_lure_1);
		Lower_jaw_lure_1.setTextureOffset(53, 22).addBox(-5.5F, 0.0F, 0.0F, 11.0F, 11.0F, 0.0F, 0.0F, false);
		Lower_jaw_lure_1.setModelRendererName("Lower_jaw_lure_1");
		this.registerModelRenderer(Lower_jaw_lure_1);

		Lower_jaw_lure_2 = new AnimatedModelRenderer(this);
		Lower_jaw_lure_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Lower_jaw_lure_connection.addChild(Lower_jaw_lure_2);
		Lower_jaw_lure_2.setTextureOffset(53, -7).addBox(0.0F, 0.0F, -5.5F, 0.0F, 11.0F, 11.0F, 0.0F, false);
		Lower_jaw_lure_2.setModelRendererName("Lower_jaw_lure_2");
		this.registerModelRenderer(Lower_jaw_lure_2);

		Caudal_area = new AnimatedModelRenderer(this);
		Caudal_area.setRotationPoint(0.0F, 0.0F, 9.0F);
		Body.addChild(Caudal_area);
		Caudal_area.setTextureOffset(0, 10).addBox(0.0F, -3.0F, 0.0F, 0.0F, 7.0F, 8.0F, 0.0F, false);
		Caudal_area.setModelRendererName("Caudal_area");
		this.registerModelRenderer(Caudal_area);

		Pectoral_fin_1 = new AnimatedModelRenderer(this);
		Pectoral_fin_1.setRotationPoint(-2.5F, 0.0F, 1.0F);
		Body.addChild(Pectoral_fin_1);
		setRotationAngle(Pectoral_fin_1, 0.182F, -0.2731F, 0.0F);
		Pectoral_fin_1.setTextureOffset(0, 0).addBox(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);
		Pectoral_fin_1.setModelRendererName("Pectoral_fin_1");
		this.registerModelRenderer(Pectoral_fin_1);

		Pectoral_fin_2 = new AnimatedModelRenderer(this);
		Pectoral_fin_2.setRotationPoint(2.5F, 0.0F, 1.0F);
		Body.addChild(Pectoral_fin_2);
		setRotationAngle(Pectoral_fin_2, 0.182F, 0.2731F, 0.0F);
		Pectoral_fin_2.setTextureOffset(0, 0).addBox(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);
		Pectoral_fin_2.setModelRendererName("Pectoral_fin_2");
		this.registerModelRenderer(Pectoral_fin_2);

    this.rootBones.add(root);
  }


    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation("deep_trenches", "animations/bearded_seadevil.json");
    }
}