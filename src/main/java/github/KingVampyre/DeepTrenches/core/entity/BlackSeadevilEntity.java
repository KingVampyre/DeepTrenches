package github.KingVampyre.DeepTrenches.core.entity;

import github.KingVampyre.DeepTrenches.common.entity.LuminousFishEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;

public class BlackSeadevilEntity extends LuminousFishEntity {

    public BlackSeadevilEntity(EntityType<? extends LuminousFishEntity> type, World world) {
        super(type, world);
    }

    @Override
    public ItemStack getBucketItem() {
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

}
