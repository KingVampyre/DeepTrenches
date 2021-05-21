package github.KingVampyre.DeepTrenches.core.entity;

import github.KingVampyre.DeepTrenches.common.entity.LuminousFishEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class VoidBeastEntity extends LuminousFishEntity {

    public VoidBeastEntity(EntityType<? extends LuminousFishEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public AnimationFactory getFactory() {
        return null;
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
    public EntityAttributeModifier getSpeedModifier() {
        return null;
    }

    @Override
    public void registerControllers(AnimationData data) {

    }

}
