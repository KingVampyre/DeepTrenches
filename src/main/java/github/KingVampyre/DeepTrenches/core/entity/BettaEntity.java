package github.KingVampyre.DeepTrenches.core.entity;

import github.KingVampyre.DeepTrenches.common.entity.ModFishEntity;
import github.KingVampyre.DeepTrenches.core.init.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;
import software.bernie.geckolib.manager.EntityAnimationManager;

public class BettaEntity extends ModFishEntity {

    public BettaEntity(EntityType<? extends BettaEntity> type, World world) {
        super(type, world);
    }

    @Override
    public EntityAnimationManager getAnimationManager() {
        // TODO animation manager
        return null;
    }

    @Override
    protected ItemStack getFishBucketItem() {
        return new ItemStack(ModItems.BETTA_BUCKET);
    }

    @Override
    protected SoundEvent getFlopSound() {
        // TODO Auto-generated method stub
        return null;
    }

}
