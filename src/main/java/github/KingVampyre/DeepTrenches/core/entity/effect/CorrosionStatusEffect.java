package github.KingVampyre.DeepTrenches.core.entity.effect;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class CorrosionStatusEffect extends StatusEffect {

    public CorrosionStatusEffect(StatusEffectType type, int color) {
        super(type, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {

        if(entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entity;

            for (int i = 0; i < player.inventory.armor.size(); i++) {
                ItemStack stack = player.inventory.armor.get(i);
                int amount = 3 * (amplifier > 0 ? amplifier - 1 : 1) + 1;
                int index = i;

                stack.damage(amount, player, living -> player.sendEquipmentBreakStatus(EquipmentSlot.fromTypeIndex(EquipmentSlot.Type.ARMOR, index)));
            }

        }

    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 40 == 0;
    }

}
