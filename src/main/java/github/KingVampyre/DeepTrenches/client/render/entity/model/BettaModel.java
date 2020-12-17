// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.common.render.entity.model.AnimalModel;
import github.KingVampyre.DeepTrenches.core.entity.BettaEntity;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;
import software.bernie.geckolib.forgetofabric.ResourceLocation;

public class BettaModel extends AnimalModel<BettaEntity> {

    private final AnimatedModelRenderer root;
    private final AnimatedModelRenderer Body;
    private final AnimatedModelRenderer Head;
    private final AnimatedModelRenderer Snout;
    private final AnimatedModelRenderer Dorsal_fin;
    private final AnimatedModelRenderer Caudal_fin;
    private final AnimatedModelRenderer Ventral_fin_1;
    private final AnimatedModelRenderer Ventral_fin_2;
    private final AnimatedModelRenderer Pectoral_fin_1;
    private final AnimatedModelRenderer Pectoral_fin_2;

    public BettaModel() {
        textureWidth = 64;
        textureHeight = 32;
        root = new AnimatedModelRenderer(this);
        root.setRotationPoint(0.0F, 0.0F, 0.0F);

        root.setModelRendererName("root");
        this.registerModelRenderer(root);

        Body = new AnimatedModelRenderer(this);
        Body.setRotationPoint(0.0F, 20.0F, 0.0F);
        root.addChild(Body);
        Body.setTextureOffset(12, 0).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 6.0F, 0.0F, false);
        Body.setModelRendererName("Body");
        this.registerModelRenderer(Body);

        Head = new AnimatedModelRenderer(this);
        Head.setRotationPoint(0.0F, 0.3F, -2.8F);
        Body.addChild(Head);
        Head.setTextureOffset(0, 4).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
        Head.setModelRendererName("Head");
        this.registerModelRenderer(Head);

        Snout = new AnimatedModelRenderer(this);
        Snout.setRotationPoint(0.0F, 0.4F, -1.0F);
        Head.addChild(Snout);
        Snout.setTextureOffset(0, 11).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        Snout.setModelRendererName("Snout");
        this.registerModelRenderer(Snout);

        Dorsal_fin = new AnimatedModelRenderer(this);
        Dorsal_fin.setRotationPoint(0.0F, 0.0F, 0.5F);
        Body.addChild(Dorsal_fin);
        setRotationAngle(Dorsal_fin, -0.1367F, 0.0F, 0.0F);
        Dorsal_fin.setTextureOffset(10, 3).addBox(0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 7.0F, 0.0F, false);
        Dorsal_fin.setModelRendererName("Dorsal_fin");
        this.registerModelRenderer(Dorsal_fin);

        Caudal_fin = new AnimatedModelRenderer(this);
        Caudal_fin.setRotationPoint(0.0F, 1.0F, 2.8F);
        Body.addChild(Caudal_fin);
        Caudal_fin.setTextureOffset(11, 5).addBox(0.0F, -5.0F, 0.0F, 0.0F, 12.0F, 11.0F, 0.0F, false);
        Caudal_fin.setModelRendererName("Caudal_fin");
        this.registerModelRenderer(Caudal_fin);

        Ventral_fin_1 = new AnimatedModelRenderer(this);
        Ventral_fin_1.setRotationPoint(1.2F, 3.1F, 0.0F);
        Body.addChild(Ventral_fin_1);
        setRotationAngle(Ventral_fin_1, 0.0456F, 0.0F, -0.2276F);
        Ventral_fin_1.setTextureOffset(35, 11).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 2.0F, 0.0F, false);
        Ventral_fin_1.setModelRendererName("Ventral_fin_1");
        this.registerModelRenderer(Ventral_fin_1);

        Ventral_fin_2 = new AnimatedModelRenderer(this);
        Ventral_fin_2.setRotationPoint(-1.4F, 3.1F, -0.1F);
        Body.addChild(Ventral_fin_2);
        setRotationAngle(Ventral_fin_2, 0.0456F, 0.0F, 0.2276F);
        Ventral_fin_2.setTextureOffset(35, 11).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 2.0F, 0.0F, false);
        Ventral_fin_2.setModelRendererName("Ventral_fin_2");
        this.registerModelRenderer(Ventral_fin_2);

        Pectoral_fin_1 = new AnimatedModelRenderer(this);
        Pectoral_fin_1.setRotationPoint(2.0F, 1.0F, 0.4F);
        Body.addChild(Pectoral_fin_1);
        setRotationAngle(Pectoral_fin_1, 0.0F, 0.2276F, 0.0F);
        Pectoral_fin_1.setTextureOffset(27, -1).addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);
        Pectoral_fin_1.setModelRendererName("Pectoral_fin_1");
        this.registerModelRenderer(Pectoral_fin_1);

        Pectoral_fin_2 = new AnimatedModelRenderer(this);
        Pectoral_fin_2.setRotationPoint(-2.0F, 1.0F, 0.4F);
        Body.addChild(Pectoral_fin_2);
        setRotationAngle(Pectoral_fin_2, 0.0F, -0.2276F, 0.0F);
        Pectoral_fin_2.setTextureOffset(27, -1).addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);
        Pectoral_fin_2.setModelRendererName("Pectoral_fin_2");
        this.registerModelRenderer(Pectoral_fin_2);

        this.rootBones.add(root);
    }

    @Override
    public ResourceLocation getAnimationFileLocation() {
        return new ResourceLocation("deep_trenches:animations/betta.json");
    }

}