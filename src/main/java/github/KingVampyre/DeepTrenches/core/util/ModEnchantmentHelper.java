package github.KingVampyre.DeepTrenches.core.util;

import github.KingVampyre.DeepTrenches.core.init.StatusEffects;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;

import static github.KingVampyre.DeepTrenches.core.init.ModEnchantments.SOUL_DRAINING;
import static github.KingVampyre.DeepTrenches.core.init.StatusEffects.SOUL_RAVENING;

public class ModEnchantmentHelper {

    public static void applySoulDraining(LivingEntity attacker, LivingEntity entity, ItemStack stack) {

        if(ModEnchantmentHelper.hasSoulDraining(stack)) {
            int modifier = ModEnchantmentHelper.getSoulDrainingModifier(stack);

            if(attacker != entity) {
                int amplifier = modifier - 1;

                attacker.addStatusEffect(new StatusEffectInstance(SOUL_RAVENING, 200, amplifier));
                StatusEffectHelper.addSoulDrainingEffect(entity, attacker, StatusEffects.SOUL_DRAINING, 200, amplifier);
            }

        }

    }

    public static boolean hasSoulDraining(ItemStack stack) {
        return getSoulDrainingModifier(stack) > 0;
    }

    public static int getSoulDrainingModifier(ItemStack stack) {
        return EnchantmentHelper.getLevel(SOUL_DRAINING, stack);
    }

}
