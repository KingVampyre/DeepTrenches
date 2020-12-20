package github.KingVampyre.DeepTrenches.core.entity;

import github.KingVampyre.DeepTrenches.common.entity.AnimatedFishEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;
import software.bernie.geckolib.manager.EntityAnimationManager;

public class PrinceAxelsWonderfishEntity extends AnimatedFishEntity {

    public PrinceAxelsWonderfishEntity(EntityType<? extends AnimatedFishEntity> type, World world) {
        super(type, world);
    }

    @Override
    protected ItemStack getFishBucketItem() {
        return null;
    }

    @Override
    protected SoundEvent getFlopSound() {
        return null;
    }

    @Override
    public EntityAnimationManager getAnimationManager() {
        return null;
    }

    @Override
    public EntityAttributeModifier getSpeedModifier() {
        return null;
    }

}
