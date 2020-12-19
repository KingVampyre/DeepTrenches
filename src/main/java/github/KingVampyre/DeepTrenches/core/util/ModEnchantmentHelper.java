package github.KingVampyre.DeepTrenches.core.util;

import github.KingVampyre.DeepTrenches.common.entity.effect.EntityStatusEffectInstance;
import github.KingVampyre.DeepTrenches.core.init.DamageSources;
import github.KingVampyre.DeepTrenches.core.init.StatusEffects;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;

import static github.KingVampyre.DeepTrenches.core.init.ModEnchantments.SOUL_DRAINING;

public class ModEnchantmentHelper {

    public static void applySoulDraining(LivingEntity attacker, LivingEntity entity, ItemStack stack) {

        if(ModEnchantmentHelper.hasSoulDraining(stack)) {
            int modifier = ModEnchantmentHelper.getSoulDrainingModifier(stack);

            if(attacker != entity) {
                int amplifier = modifier - 1;

                attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.SOUL_RAVENING, 200, amplifier));

                entity.addStatusEffect(new EntityStatusEffectInstance(StatusEffects.SOUL_DRAINING, 200, modifier, living -> {
                    DamageSource source = DamageSources.soulDraining(attacker);

                    float hearts = 1 << amplifier;
                    float amount = 2 + hearts;

                    living.damage(source, amount);
                }));

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
