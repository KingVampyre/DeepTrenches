package github.KingVampyre.DeepTrenches.common.entity.effect;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.Random;

public abstract class ArmorDamageStatusEffect extends StatusEffect {

    public ArmorDamageStatusEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        var armorItems = this.getArmorItems(entity);

        for (var i = 0; i < armorItems.size(); i++) {
            var stack = armorItems.get(i);
            var amount = this.getDamageAmount(stack, amplifier, entity.world.random);
            var index = i;

            if(!stack.isEmpty())
                stack.damage(amount, entity, living -> entity.sendEquipmentBreakStatus(EquipmentSlot.fromTypeIndex(EquipmentSlot.Type.ARMOR, index)));
        }

    }

    protected abstract List<ItemStack> getArmorItems(LivingEntity entity);

    protected abstract int getDamageAmount(ItemStack stack, int amplifier, Random random);

}
