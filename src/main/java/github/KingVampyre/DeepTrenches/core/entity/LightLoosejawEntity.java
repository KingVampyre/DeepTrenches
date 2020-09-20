package github.KingVampyre.DeepTrenches.core.entity;

import github.KingVampyre.DeepTrenches.core.init.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;
import software.bernie.geckolib.animation.controller.EntityAnimationController;
import software.bernie.geckolib.entity.IAnimatedEntity;
import software.bernie.geckolib.manager.EntityAnimationManager;

public class LightLoosejawEntity extends TamableDragonfishEntity implements IAnimatedEntity {

    protected EntityAnimationManager animationManager;

    public LightLoosejawEntity(EntityType<? extends LightLoosejawEntity> type, World world) {
        super(type, world);

        this.animationManager = new EntityAnimationManager();
    }

    @Override
    public EntityAnimationManager getAnimationManager() {
        return this.animationManager;
    }

    @Override
    protected ItemStack getFishBucketItem() {
        return new ItemStack(ModItems.LIGHT_LOOSEJAW_BUCKET);
    }

    @Override
    protected SoundEvent getFlopSound() {
        // TODO Auto-generated method stub
        return null;
    }

}
