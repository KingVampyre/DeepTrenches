package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.enchantment.DrainingEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class ModEnchantments {

    public static final Enchantment SOUL_DRAINING = new DrainingEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.BOW, EquipmentSlot.MAINHAND);

}
