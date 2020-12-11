// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BlobfishEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class BlobfishModel extends AnimatedEntityModel<BlobfishEntity> {

    private final AnimatedModelRenderer root;
	private final AnimatedModelRenderer Body;
	private final AnimatedModelRenderer Tail;
	private final AnimatedModelRenderer Caudal_fin;
	private final AnimatedModelRenderer Anal_fin;
	private final AnimatedModelRenderer Dorsal_fin_2;
	private final AnimatedModelRenderer Head;
	private final AnimatedModelRenderer Nose;
	private final AnimatedModelRenderer pectoral_fin_1;
	private final AnimatedModelRenderer pectoral_fin_2;
	private final AnimatedModelRenderer ventral_fin_1;
	private final AnimatedModelRenderer ventral_fin_2;
	private final AnimatedModelRenderer Dorsal_fin_1;
	private final AnimatedModelRenderer Lower_jaw;

    public BlobfishModel()
    {
        textureWidth = 80;
    textureHeight = 64;
    root = new AnimatedModelRenderer(this);
		root.setRotationPoint(0.0F, 0.0F, 0.0F);
		
		root.setModelRendererName("root");
		this.registerModelRenderer(root);

		Body = new AnimatedModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		root.addChild(Body);
		Body.setTextureOffset(0, 20).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		Body.setModelRendererName("Body");
		this.registerModelRenderer(Body);

		Tail = new AnimatedModelRenderer(this);
		Tail.setRotationPoint(0.0F, 0.0F, 8.0F);
		Body.addChild(Tail);
		Tail.setTextureOffset(0, 37).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);
		Tail.setModelRendererName("Tail");
		this.registerModelRenderer(Tail);

		Caudal_fin = new AnimatedModelRenderer(this);
		Caudal_fin.setRotationPoint(0.0F, 0.0F, 7.3F);
		Tail.addChild(Caudal_fin);
		Caudal_fin.setTextureOffset(0, 45).addBox(0.0F, -3.5F, 0.0F, 0.0F, 7.0F, 5.0F, 0.0F, false);
		Caudal_fin.setModelRendererName("Caudal_fin");
		this.registerModelRenderer(Caudal_fin);

		Anal_fin = new AnimatedModelRenderer(this);
		Anal_fin.setRotationPoint(0.0F, 2.0F, 0.0F);
		Tail.addChild(Anal_fin);
		Anal_fin.setTextureOffset(25, 38).addBox(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 6.0F, 0.0F, false);
		Anal_fin.setModelRendererName("Anal_fin");
		this.registerModelRenderer(Anal_fin);

		Dorsal_fin_2 = new AnimatedModelRenderer(this);
		Dorsal_fin_2.setRotationPoint(0.0F, -2.0F, 0.0F);
		Tail.addChild(Dorsal_fin_2);
		Dorsal_fin_2.setTextureOffset(48, -1).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 6.0F, 0.0F, false);
		Dorsal_fin_2.setModelRendererName("Dorsal_fin_2");
		this.registerModelRenderer(Dorsal_fin_2);

		Head = new AnimatedModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(Head);
		Head.setTextureOffset(0, 0).addBox(-5.0F, -5.0F, -9.8F, 10.0F, 9.0F, 10.0F, 0.0F, false);
		Head.setModelRendererName("Head");
		this.registerModelRenderer(Head);

		Nose = new AnimatedModelRenderer(this);
		Nose.setRotationPoint(0.0F, -1.5F, -9.8F);
		Head.addChild(Nose);
		setRotationAngle(Nose, -0.0911F, 0.0F, 0.0F);
		Nose.setTextureOffset(0, 3).addBox(-1.5F, 0.0F, -0.8F, 3.0F, 4.0F, 2.0F, 0.0F, false);
		Nose.setModelRendererName("Nose");
		this.registerModelRenderer(Nose);

		pectoral_fin_1 = new AnimatedModelRenderer(this);
		pectoral_fin_1.setRotationPoint(5.0F, 3.0F, -5.5F);
		Head.addChild(pectoral_fin_1);
		setRotationAngle(pectoral_fin_1, 0.0F, 0.2276F, 0.0F);
		pectoral_fin_1.setTextureOffset(41, 6).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 4.0F, 0.0F, false);
		pectoral_fin_1.setModelRendererName("pectoral_fin_1");
		this.registerModelRenderer(pectoral_fin_1);

		pectoral_fin_2 = new AnimatedModelRenderer(this);
		pectoral_fin_2.setRotationPoint(-5.0F, 3.0F, -5.5F);
		Head.addChild(pectoral_fin_2);
		setRotationAngle(pectoral_fin_2, 0.0F, -0.2276F, 0.0F);
		pectoral_fin_2.setTextureOffset(41, 6).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 4.0F, 0.0F, false);
		pectoral_fin_2.setModelRendererName("pectoral_fin_2");
		this.registerModelRenderer(pectoral_fin_2);

		ventral_fin_1 = new AnimatedModelRenderer(this);
		ventral_fin_1.setRotationPoint(4.5F, 4.5F, -5.5F);
		Head.addChild(ventral_fin_1);
		setRotationAngle(ventral_fin_1, 0.2276F, 0.0F, -0.182F);
		ventral_fin_1.setTextureOffset(50, 9).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		ventral_fin_1.setModelRendererName("ventral_fin_1");
		this.registerModelRenderer(ventral_fin_1);

		ventral_fin_2 = new AnimatedModelRenderer(this);
		ventral_fin_2.setRotationPoint(-4.5F, 4.5F, -5.5F);
		Head.addChild(ventral_fin_2);
		setRotationAngle(ventral_fin_2, 0.2276F, 0.0F, 0.182F);
		ventral_fin_2.setTextureOffset(50, 9).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		ventral_fin_2.setModelRendererName("ventral_fin_2");
		this.registerModelRenderer(ventral_fin_2);

		Dorsal_fin_1 = new AnimatedModelRenderer(this);
		Dorsal_fin_1.setRotationPoint(0.0F, -4.0F, 0.0F);
		Body.addChild(Dorsal_fin_1);
		Dorsal_fin_1.setTextureOffset(31, -3).addBox(0.0F, -3.5F, 0.0F, 0.0F, 4.0F, 8.0F, 0.0F, false);
		Dorsal_fin_1.setModelRendererName("Dorsal_fin_1");
		this.registerModelRenderer(Dorsal_fin_1);

		Lower_jaw = new AnimatedModelRenderer(this);
		Lower_jaw.setRotationPoint(0.0F, 4.0F, 0.0F);
		Body.addChild(Lower_jaw);
		Lower_jaw.setTextureOffset(31, 17).addBox(-5.0F, 0.0F, -9.8F, 10.0F, 1.0F, 10.0F, 0.0F, false);
		Lower_jaw.setModelRendererName("Lower_jaw");
		this.registerModelRenderer(Lower_jaw);

    this.rootBones.add(root);
  }


    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation("deep_trenches", "animations/blobfish.json");
    }
}