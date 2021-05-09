package github.KingVampyre.DeepTrenches.common.entity.effect;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.Random;

public abstract class ArmorDamageStatusEffect extends StatusEffect {

    public ArmorDamageStatusEffect(StatusEffectType type, int color) {
        super(type, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        List<ItemStack> armorItems = this.getArmorItems(entity);

        for (int i = 0; i < armorItems.size(); i++) {
            ItemStack stack = armorItems.get(i);
            int amount = this.getDamageAmount(stack, amplifier, entity.world.random);
            int index = i;

            if(!stack.isEmpty())
                stack.damage(amount, entity, living -> entity.sendEquipmentBreakStatus(EquipmentSlot.fromTypeIndex(EquipmentSlot.Type.ARMOR, index)));
        }

    }

    protected abstract List<ItemStack> getArmorItems(LivingEntity entity);

    protected abstract int getDamageAmount(ItemStack stack, int amplifier, Random random);

}
