// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.FangtoothEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class FangtoothModel extends AnimatedEntityModel<FangtoothEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer Body;
	private final AnimatedModelRenderer Upper_jaw;
	private final AnimatedModelRenderer Fang_3;
	private final AnimatedModelRenderer Fang_4;
	private final AnimatedModelRenderer Teeth_3;
	private final AnimatedModelRenderer Teeth_4;
	private final AnimatedModelRenderer Lower_jaw;
	private final AnimatedModelRenderer Fang_1;
	private final AnimatedModelRenderer Fang_2;
	private final AnimatedModelRenderer Teeth_1;
	private final AnimatedModelRenderer Teeth_2;
	private final AnimatedModelRenderer Caudal_fin;
	private final AnimatedModelRenderer Dorsal_fin;
	private final AnimatedModelRenderer Pectoral_fin_1;
	private final AnimatedModelRenderer Pectoral_fin_2;
	private final AnimatedModelRenderer Ventral_fin_1;
	private final AnimatedModelRenderer Ventral_fin_2;
	private final AnimatedModelRenderer Anal_fin;

    public FangtoothModel()
    {
        textureWidth = 64;
    textureHeight = 56;
    root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, 0.0F, 0.0F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		Body = new AnimatedModelRenderer(this);
		Body.setRotationPoint(0.0F, 19.0F, -5.0F);
		root.addChild(Body);
		Body.setTextureOffset(0, 25).addBox(-2.0F, -5.0F, 0.0F, 4.0F, 10.0F, 10.0F, 0.0F, false);
		Body.setModelRendererName("Body");
		this.registerModelRenderer(Body);

		Upper_jaw = new AnimatedModelRenderer(this);
		Upper_jaw.setRotationPoint(0.0F, -1.0F, 0.0F);
		Body.addChild(Upper_jaw);
		Upper_jaw.setTextureOffset(0, 0).addBox(-2.5F, -3.5F, -7.0F, 5.0F, 7.0F, 7.0F, 0.0F, false);
		Upper_jaw.setModelRendererName("Upper_jaw");
		this.registerModelRenderer(Upper_jaw);

		Fang_3 = new AnimatedModelRenderer(this);
		Fang_3.setRotationPoint(-1.3F, 3.0F, -7.0F);
		Upper_jaw.addChild(Fang_3);
		Fang_3.setTextureOffset(15, 14).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Fang_3.setModelRendererName("Fang_3");
		this.registerModelRenderer(Fang_3);

		Fang_4 = new AnimatedModelRenderer(this);
		Fang_4.setRotationPoint(1.3F, 3.0F, -7.0F);
		Upper_jaw.addChild(Fang_4);
		Fang_4.setTextureOffset(15, 14).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Fang_4.setModelRendererName("Fang_4");
		this.registerModelRenderer(Fang_4);

		Teeth_3 = new AnimatedModelRenderer(this);
		Teeth_3.setRotationPoint(-1.38F, 3.1F, -0.5F);
		Upper_jaw.addChild(Teeth_3);
		setRotationAngle(Teeth_3, -0.0262F, 0.0F, 0.0F);
		Teeth_3.setTextureOffset(18, -2).addBox(0.0F, 0.0F, -6.0F, 0.0F, 2.0F, 6.0F, 0.0F, false);
		Teeth_3.setModelRendererName("Teeth_3");
		this.registerModelRenderer(Teeth_3);

		Teeth_4 = new AnimatedModelRenderer(this);
		Teeth_4.setRotationPoint(1.38F, 3.1F, -0.5F);
		Upper_jaw.addChild(Teeth_4);
		setRotationAngle(Teeth_4, -0.0262F, 0.0F, 0.0F);
		Teeth_4.setTextureOffset(18, -2).addBox(0.0F, 0.0F, -6.0F, 0.0F, 2.0F, 6.0F, 0.0F, false);
		Teeth_4.setModelRendererName("Teeth_4");
		this.registerModelRenderer(Teeth_4);

		Lower_jaw = new AnimatedModelRenderer(this);
		Lower_jaw.setRotationPoint(0.0F, 3.5F, 0.0F);
		Body.addChild(Lower_jaw);
		setRotationAngle(Lower_jaw, 0.182F, 0.0F, 0.0F);
		Lower_jaw.setTextureOffset(0, 15).addBox(-1.5F, -1.0F, -7.0F, 3.0F, 2.0F, 8.0F, 0.0F, false);
		Lower_jaw.setModelRendererName("Lower_jaw");
		this.registerModelRenderer(Lower_jaw);

		Fang_1 = new AnimatedModelRenderer(this);
		Fang_1.setRotationPoint(-1.0F, -0.5F, -7.0F);
		Lower_jaw.addChild(Fang_1);
		setRotationAngle(Fang_1, 0.1367F, 0.0F, 0.0F);
		Fang_1.setTextureOffset(0, 14).addBox(0.0F, -4.0F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		Fang_1.setModelRendererName("Fang_1");
		this.registerModelRenderer(Fang_1);

		Fang_2 = new AnimatedModelRenderer(this);
		Fang_2.setRotationPoint(1.0F, -0.5F, -7.0F);
		Lower_jaw.addChild(Fang_2);
		setRotationAngle(Fang_2, 0.1367F, 0.0F, 0.0F);
		Fang_2.setTextureOffset(0, 14).addBox(0.0F, -4.0F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		Fang_2.setModelRendererName("Fang_2");
		this.registerModelRenderer(Fang_2);

		Teeth_1 = new AnimatedModelRenderer(this);
		Teeth_1.setRotationPoint(-1.4F, -1.0F, -0.5F);
		Lower_jaw.addChild(Teeth_1);
		Teeth_1.setTextureOffset(15, 14).addBox(0.0F, -2.0F, -6.0F, 0.0F, 2.0F, 6.0F, 0.0F, false);
		Teeth_1.setModelRendererName("Teeth_1");
		this.registerModelRenderer(Teeth_1);

		Teeth_2 = new AnimatedModelRenderer(this);
		Teeth_2.setRotationPoint(1.4F, -1.0F, -0.5F);
		Lower_jaw.addChild(Teeth_2);
		Teeth_2.setTextureOffset(15, 14).addBox(0.0F, -2.0F, -6.0F, 0.0F, 2.0F, 6.0F, 0.0F, false);
		Teeth_2.setModelRendererName("Teeth_2");
		this.registerModelRenderer(Teeth_2);

		Caudal_fin = new AnimatedModelRenderer(this);
		Caudal_fin.setRotationPoint(0.0F, 0.0F, 10.0F);
		Body.addChild(Caudal_fin);
		Caudal_fin.setTextureOffset(0, 38).addBox(0.0F, -5.0F, 0.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
		Caudal_fin.setModelRendererName("Caudal_fin");
		this.registerModelRenderer(Caudal_fin);

		Dorsal_fin = new AnimatedModelRenderer(this);
		Dorsal_fin.setRotationPoint(0.0F, -5.0F, 1.0F);
		Body.addChild(Dorsal_fin);
		Dorsal_fin.setTextureOffset(19, 22).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 9.0F, 0.0F, false);
		Dorsal_fin.setModelRendererName("Dorsal_fin");
		this.registerModelRenderer(Dorsal_fin);

		Pectoral_fin_1 = new AnimatedModelRenderer(this);
		Pectoral_fin_1.setRotationPoint(-2.0F, 1.5F, 1.0F);
		Body.addChild(Pectoral_fin_1);
		setRotationAngle(Pectoral_fin_1, 0.0F, -0.3643F, 0.0F);
		Pectoral_fin_1.setTextureOffset(29, 31).addBox(0.0F, -3.0F, 0.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);
		Pectoral_fin_1.setModelRendererName("Pectoral_fin_1");
		this.registerModelRenderer(Pectoral_fin_1);

		Pectoral_fin_2 = new AnimatedModelRenderer(this);
		Pectoral_fin_2.setRotationPoint(2.0F, 1.5F, 1.0F);
		Body.addChild(Pectoral_fin_2);
		setRotationAngle(Pectoral_fin_2, 0.0F, 0.3643F, 0.0F);
		Pectoral_fin_2.setTextureOffset(29, 31).addBox(0.0F, -3.0F, 0.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);
		Pectoral_fin_2.setModelRendererName("Pectoral_fin_2");
		this.registerModelRenderer(Pectoral_fin_2);

		Ventral_fin_1 = new AnimatedModelRenderer(this);
		Ventral_fin_1.setRotationPoint(-1.9F, 5.0F, 0.5F);
		Body.addChild(Ventral_fin_1);
		setRotationAngle(Ventral_fin_1, 0.0F, 0.0F, 0.2276F);
		Ventral_fin_1.setTextureOffset(29, 36).addBox(0.0F, 0.0F, -0.5F, 0.0F, 5.0F, 4.0F, 0.0F, false);
		Ventral_fin_1.setModelRendererName("Ventral_fin_1");
		this.registerModelRenderer(Ventral_fin_1);

		Ventral_fin_2 = new AnimatedModelRenderer(this);
		Ventral_fin_2.setRotationPoint(1.9F, 5.0F, 0.5F);
		Body.addChild(Ventral_fin_2);
		setRotationAngle(Ventral_fin_2, 0.0F, 0.0F, -0.2276F);
		Ventral_fin_2.setTextureOffset(29, 36).addBox(0.0F, 0.0F, -0.5F, 0.0F, 5.0F, 4.0F, 0.0F, false);
		Ventral_fin_2.setModelRendererName("Ventral_fin_2");
		this.registerModelRenderer(Ventral_fin_2);

		Anal_fin = new AnimatedModelRenderer(this);
		Anal_fin.setRotationPoint(0.0F, 5.0F, 6.5F);
		Body.addChild(Anal_fin);
		Anal_fin.setTextureOffset(24, 41).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 5.0F, 0.0F, false);
		Anal_fin.setModelRendererName("Anal_fin");
		this.registerModelRenderer(Anal_fin);

    this.rootBones.add(root);
  }


    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation("deep_trenches", "animations/fangtooth.json");
    }
}