package github.KingVampyre.DeepTrenches.core.entity.effect;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class CorrosionStatusEffect extends StatusEffect {

    public CorrosionStatusEffect(StatusEffectType type) {
        super(type, 0);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        int amount = 3 * (amplifier - 1) + 1;

        if(amplifier > 0  && entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entity;

            for (int i = 0; i < player.inventory.armor.size(); i++) {
                ItemStack stack = player.inventory.armor.get(i);
                int index = i;

                stack.damage(amount, player, living -> player.sendEquipmentBreakStatus(EquipmentSlot.fromTypeIndex(EquipmentSlot.Type.ARMOR, index)));
            }

        }

    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 40 == 0;
    }

    @Override
    public double adjustModifierAmount(int amplifier, EntityAttributeModifier modifier) {
        double amount = 1.5 * amplifier + modifier.getValue();

        return amount >= 20 ? -19 : -amount;
    }

}
