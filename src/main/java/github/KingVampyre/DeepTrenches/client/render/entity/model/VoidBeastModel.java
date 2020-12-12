// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.VoidBeastEntity;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class VoidBeastModel extends AnimatedEntityModel<VoidBeastEntity> {

    private final AnimatedModelRenderer root;
    private final AnimatedModelRenderer Body;
    private final AnimatedModelRenderer Shell;
    private final AnimatedModelRenderer Leg_1;
    private final AnimatedModelRenderer Leg_2;
    private final AnimatedModelRenderer Tail;
    private final AnimatedModelRenderer Upper_jaw;
    private final AnimatedModelRenderer Upper_jaw_floor;
    private final AnimatedModelRenderer Lower_jaw;
    private final AnimatedModelRenderer Tongue_1;
    private final AnimatedModelRenderer Tongue_2;

    public VoidBeastModel() {
        textureWidth = 100;
        textureHeight = 64;
        root = new AnimatedModelRenderer(this);
        root.setRotationPoint(0.0F, 0.0F, 0.0F);

        root.setModelRendererName("root");
        this.registerModelRenderer(root);

        Body = new AnimatedModelRenderer(this);
        Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        root.addChild(Body);
        Body.setTextureOffset(0, 0).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 16.0F, 0.0F, false);
        Body.setModelRendererName("Body");
        this.registerModelRenderer(Body);

        Shell = new AnimatedModelRenderer(this);
        Shell.setRotationPoint(0.0F, -3.0F, 10.0F);
        Body.addChild(Shell);
        Shell.setTextureOffset(41, 0).addBox(-4.0F, -4.0F, -5.0F, 8.0F, 8.0F, 10.0F, 0.0F, false);
        Shell.setModelRendererName("Shell");
        this.registerModelRenderer(Shell);

        Leg_1 = new AnimatedModelRenderer(this);
        Leg_1.setRotationPoint(-2.0F, 1.0F, 6.0F);
        Body.addChild(Leg_1);
        setRotationAngle(Leg_1, 0.0F, 0.0F, -1.0865F);
        Leg_1.setTextureOffset(53, 21).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 32.0F, 2.0F, 0.0F, false);
        Leg_1.setModelRendererName("Leg_1");
        this.registerModelRenderer(Leg_1);

        Leg_2 = new AnimatedModelRenderer(this);
        Leg_2.setRotationPoint(2.0F, 1.0F, 6.0F);
        Body.addChild(Leg_2);
        setRotationAngle(Leg_2, 0.0F, 0.0F, 1.0865F);
        Leg_2.setTextureOffset(53, 21).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 32.0F, 2.0F, 0.0F, false);
        Leg_2.setModelRendererName("Leg_2");
        this.registerModelRenderer(Leg_2);

        Tail = new AnimatedModelRenderer(this);
        Tail.setRotationPoint(0.0F, -0.5F, 15.0F);
        Body.addChild(Tail);
        setRotationAngle(Tail, 0.5463F, 0.0F, 0.0F);
        Tail.setTextureOffset(0, 22).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 23.0F, 0.0F, false);
        Tail.setModelRendererName("Tail");
        this.registerModelRenderer(Tail);

        Upper_jaw = new AnimatedModelRenderer(this);
        Upper_jaw.setRotationPoint(0.0F, -1.5F, 0.0F);
        Body.addChild(Upper_jaw);
        setRotationAngle(Upper_jaw, -0.182F, 0.0F, 0.0F);
        Upper_jaw.setTextureOffset(0, 21).addBox(-2.5F, -2.0F, -5.0F, 5.0F, 4.0F, 6.0F, 0.0F, false);
        Upper_jaw.setModelRendererName("Upper_jaw");
        this.registerModelRenderer(Upper_jaw);

        Upper_jaw_floor = new AnimatedModelRenderer(this);
        Upper_jaw_floor.setRotationPoint(0.0F, -1.99F, 0.0F);
        Upper_jaw.addChild(Upper_jaw_floor);
        Upper_jaw_floor.setTextureOffset(0, 49).addBox(-2.5F, 1.03F, -5.0F, 5.0F, 0.0F, 6.0F, 0.0F, false);
        Upper_jaw_floor.setModelRendererName("Upper_jaw_floor");
        this.registerModelRenderer(Upper_jaw_floor);

        Lower_jaw = new AnimatedModelRenderer(this);
        Lower_jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        Body.addChild(Lower_jaw);
        setRotationAngle(Lower_jaw, 0.2276F, 0.0F, 0.0F);
        Lower_jaw.setTextureOffset(0, 32).addBox(-2.5F, -1.0F, -5.0F, 5.0F, 2.0F, 6.0F, 0.0F, false);
        Lower_jaw.setModelRendererName("Lower_jaw");
        this.registerModelRenderer(Lower_jaw);

        Tongue_1 = new AnimatedModelRenderer(this);
        Tongue_1.setRotationPoint(0.0F, 0.0F, 8.0F);
        Body.addChild(Tongue_1);
        Tongue_1.setTextureOffset(30, 21).addBox(-0.5F, -0.5F, -8.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        Tongue_1.setModelRendererName("Tongue_1");
        this.registerModelRenderer(Tongue_1);

        Tongue_2 = new AnimatedModelRenderer(this);
        Tongue_2.setRotationPoint(0.0F, 0.0F, -8.0F);
        Tongue_1.addChild(Tongue_2);
        setRotationAngle(Tongue_2, 0.3643F, -0.2276F, 0.0F);
        Tongue_2.setTextureOffset(26, 0).addBox(-0.5F, -0.5F, -8.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        Tongue_2.setModelRendererName("Tongue_2");
        this.registerModelRenderer(Tongue_2);

        this.rootBones.add(root);
    }

    @Override
    public ResourceLocation getAnimationFileLocation() {
        return new ResourceLocation("deep_trenches:animations/void_beast.json");
    }

}