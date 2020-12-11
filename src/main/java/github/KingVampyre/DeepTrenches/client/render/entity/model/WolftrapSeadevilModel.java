// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.WolftrapSeadevilEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class WolftrapSeadevilModel extends AnimatedEntityModel<WolftrapSeadevilEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer Body;
	private final AnimatedModelRenderer Caudal;
	private final AnimatedModelRenderer Upper_jaw;
	private final AnimatedModelRenderer Lure_bottom;
	private final AnimatedModelRenderer Lure_top;
	private final AnimatedModelRenderer Lure;
	private final AnimatedModelRenderer Lure_decoration_1;
	private final AnimatedModelRenderer Lure_decoration_2;
	private final AnimatedModelRenderer Lure_tooth;
	private final AnimatedModelRenderer Horn;
	private final AnimatedModelRenderer Joint_1;
	private final AnimatedModelRenderer Upper_jaw_trap_2;
	private final AnimatedModelRenderer Joint_2;
	private final AnimatedModelRenderer Upper_jaw_trap_1;
	private final AnimatedModelRenderer Pectoral_fin_1;
	private final AnimatedModelRenderer Lower_jaw;
	private final AnimatedModelRenderer Lower_jaw_teeth_1;
	private final AnimatedModelRenderer Lower_jaw_teeth_2;
	private final AnimatedModelRenderer Lower_jaw_teeth_front;
	private final AnimatedModelRenderer Pectoral_fin_2;

    public WolftrapSeadevilModel()
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
		Body.setTextureOffset(16, 0).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 6.0F, 11.0F, 0.0F, false);
		Body.setModelRendererName("Body");
		this.registerModelRenderer(Body);

		Caudal = new AnimatedModelRenderer(this);
		Caudal.setRotationPoint(0.0F, 0.0F, 10.7F);
		Body.addChild(Caudal);
		Caudal.setTextureOffset(0, 10).addBox(0.0F, -3.5F, 0.0F, 0.0F, 7.0F, 8.0F, 0.0F, false);
		Caudal.setModelRendererName("Caudal");
		this.registerModelRenderer(Caudal);

		Upper_jaw = new AnimatedModelRenderer(this);
		Upper_jaw.setRotationPoint(0.0F, -1.0F, 0.0F);
		Body.addChild(Upper_jaw);
		Upper_jaw.setTextureOffset(42, 21).addBox(-1.5F, -1.5F, -7.8F, 3.0F, 3.0F, 8.0F, 0.0F, false);
		Upper_jaw.setModelRendererName("Upper_jaw");
		this.registerModelRenderer(Upper_jaw);

		Lure_bottom = new AnimatedModelRenderer(this);
		Lure_bottom.setRotationPoint(0.0F, 0.0F, -4.0F);
		Upper_jaw.addChild(Lure_bottom);
		setRotationAngle(Lure_bottom, -0.5009F, 0.0F, 0.0F);
		Lure_bottom.setTextureOffset(46, 0).addBox(0.0F, -12.8F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, false);
		Lure_bottom.setModelRendererName("Lure_bottom");
		this.registerModelRenderer(Lure_bottom);

		Lure_top = new AnimatedModelRenderer(this);
		Lure_top.setRotationPoint(0.0F, -12.3F, 0.0F);
		Lure_bottom.addChild(Lure_top);
		setRotationAngle(Lure_top, 0.7285F, 0.0F, 0.0F);
		Lure_top.setTextureOffset(0, 17).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 14.0F, 0.0F, false);
		Lure_top.setModelRendererName("Lure_top");
		this.registerModelRenderer(Lure_top);

		Lure = new AnimatedModelRenderer(this);
		Lure.setRotationPoint(0.5F, 0.0F, 13.4F);
		Lure_top.addChild(Lure);
		Lure.setTextureOffset(0, 29).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Lure.setModelRendererName("Lure");
		this.registerModelRenderer(Lure);

		Lure_decoration_1 = new AnimatedModelRenderer(this);
		Lure_decoration_1.setRotationPoint(-0.5F, 0.0F, 0.0F);
		Lure.addChild(Lure_decoration_1);
		setRotationAngle(Lure_decoration_1, 0.6374F, 0.0F, 0.0F);
		Lure_decoration_1.setTextureOffset(3, 25).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		Lure_decoration_1.setModelRendererName("Lure_decoration_1");
		this.registerModelRenderer(Lure_decoration_1);

		Lure_decoration_2 = new AnimatedModelRenderer(this);
		Lure_decoration_2.setRotationPoint(-0.5F, 0.0F, 0.0F);
		Lure.addChild(Lure_decoration_2);
		setRotationAngle(Lure_decoration_2, 0.0911F, 0.0F, 0.0F);
		Lure_decoration_2.setTextureOffset(3, 23).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		Lure_decoration_2.setModelRendererName("Lure_decoration_2");
		this.registerModelRenderer(Lure_decoration_2);

		Lure_tooth = new AnimatedModelRenderer(this);
		Lure_tooth.setRotationPoint(-0.5F, 0.2F, 0.5F);
		Lure.addChild(Lure_tooth);
		setRotationAngle(Lure_tooth, -0.6374F, 0.0F, 0.0F);
		Lure_tooth.setTextureOffset(0, 26).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Lure_tooth.setModelRendererName("Lure_tooth");
		this.registerModelRenderer(Lure_tooth);

		Horn = new AnimatedModelRenderer(this);
		Horn.setRotationPoint(0.0F, -1.0F, -1.1F);
		Upper_jaw.addChild(Horn);
		setRotationAngle(Horn, -0.4098F, 0.0F, 0.0F);
		Horn.setTextureOffset(50, 17).addBox(0.0F, -2.3F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Horn.setModelRendererName("Horn");
		this.registerModelRenderer(Horn);

		Joint_1 = new AnimatedModelRenderer(this);
		Joint_1.setRotationPoint(-1.5F, 0.5F, -4.0F);
		Upper_jaw.addChild(Joint_1);
		Joint_1.setTextureOffset(0, 0).addBox(0.0F, -0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Joint_1.setModelRendererName("Joint_1");
		this.registerModelRenderer(Joint_1);

		Upper_jaw_trap_2 = new AnimatedModelRenderer(this);
		Upper_jaw_trap_2.setRotationPoint(0.0F, 0.5F, 0.0F);
		Joint_1.addChild(Upper_jaw_trap_2);
		setRotationAngle(Upper_jaw_trap_2, 0.0F, 0.0F, -0.267F);
		Upper_jaw_trap_2.setTextureOffset(34, 14).addBox(-0.1F, -6.5F, -3.7F, 0.0F, 7.0F, 8.0F, 0.0F, true);
		Upper_jaw_trap_2.setModelRendererName("Upper_jaw_trap_2");
		this.registerModelRenderer(Upper_jaw_trap_2);

		Joint_2 = new AnimatedModelRenderer(this);
		Joint_2.setRotationPoint(1.5F, 0.5F, -4.0F);
		Upper_jaw.addChild(Joint_2);
		Joint_2.setTextureOffset(0, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Joint_2.setModelRendererName("Joint_2");
		this.registerModelRenderer(Joint_2);

		Upper_jaw_trap_1 = new AnimatedModelRenderer(this);
		Upper_jaw_trap_1.setRotationPoint(0.0F, 0.5F, 0.0F);
		Joint_2.addChild(Upper_jaw_trap_1);
		setRotationAngle(Upper_jaw_trap_1, 0.0433F, 0.0F, 0.267F);
		Upper_jaw_trap_1.setTextureOffset(34, 14).addBox(0.1F, -6.5F, -3.7F, 0.0F, 7.0F, 8.0F, 0.0F, false);
		Upper_jaw_trap_1.setModelRendererName("Upper_jaw_trap_1");
		this.registerModelRenderer(Upper_jaw_trap_1);

		Pectoral_fin_1 = new AnimatedModelRenderer(this);
		Pectoral_fin_1.setRotationPoint(2.0F, 0.0F, 3.5F);
		Body.addChild(Pectoral_fin_1);
		setRotationAngle(Pectoral_fin_1, 0.2276F, 0.182F, 0.0F);
		Pectoral_fin_1.setTextureOffset(35, 5).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		Pectoral_fin_1.setModelRendererName("Pectoral_fin_1");
		this.registerModelRenderer(Pectoral_fin_1);

		Lower_jaw = new AnimatedModelRenderer(this);
		Lower_jaw.setRotationPoint(0.0F, 1.5F, 0.0F);
		Body.addChild(Lower_jaw);
		setRotationAngle(Lower_jaw, 0.0506F, 0.0F, 0.0F);
		Lower_jaw.setTextureOffset(0, 0).addBox(-1.0F, -0.8F, -7.8F, 2.0F, 2.0F, 8.0F, 0.0F, false);
		Lower_jaw.setModelRendererName("Lower_jaw");
		this.registerModelRenderer(Lower_jaw);

		Lower_jaw_teeth_1 = new AnimatedModelRenderer(this);
		Lower_jaw_teeth_1.setRotationPoint(0.5F, -0.5F, 0.0F);
		Lower_jaw.addChild(Lower_jaw_teeth_1);
		setRotationAngle(Lower_jaw_teeth_1, 0.0456F, 0.0F, 0.0F);
		Lower_jaw_teeth_1.setTextureOffset(0, 7).addBox(0.4F, -1.0F, -7.8F, 0.0F, 1.0F, 8.0F, 0.0F, false);
		Lower_jaw_teeth_1.setModelRendererName("Lower_jaw_teeth_1");
		this.registerModelRenderer(Lower_jaw_teeth_1);

		Lower_jaw_teeth_2 = new AnimatedModelRenderer(this);
		Lower_jaw_teeth_2.setRotationPoint(-0.5F, -0.5F, 0.0F);
		Lower_jaw.addChild(Lower_jaw_teeth_2);
		setRotationAngle(Lower_jaw_teeth_2, 0.0456F, 0.0F, 0.0F);
		Lower_jaw_teeth_2.setTextureOffset(0, 7).addBox(-0.4F, -1.0F, -7.7F, 0.0F, 1.0F, 8.0F, 0.0F, false);
		Lower_jaw_teeth_2.setModelRendererName("Lower_jaw_teeth_2");
		this.registerModelRenderer(Lower_jaw_teeth_2);

		Lower_jaw_teeth_front = new AnimatedModelRenderer(this);
		Lower_jaw_teeth_front.setRotationPoint(0.0F, -0.5F, -7.7F);
		Lower_jaw.addChild(Lower_jaw_teeth_front);
		Lower_jaw_teeth_front.setTextureOffset(0, 13).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, false);
		Lower_jaw_teeth_front.setModelRendererName("Lower_jaw_teeth_front");
		this.registerModelRenderer(Lower_jaw_teeth_front);

		Pectoral_fin_2 = new AnimatedModelRenderer(this);
		Pectoral_fin_2.setRotationPoint(-2.0F, 0.0F, 3.5F);
		Body.addChild(Pectoral_fin_2);
		setRotationAngle(Pectoral_fin_2, 0.2276F, -0.182F, 0.0F);
		Pectoral_fin_2.setTextureOffset(35, 5).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		Pectoral_fin_2.setModelRendererName("Pectoral_fin_2");
		this.registerModelRenderer(Pectoral_fin_2);

    this.rootBones.add(root);
  }


    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation("deep_trenches", "animations/wolftrap_seadevil.json");
    }
}