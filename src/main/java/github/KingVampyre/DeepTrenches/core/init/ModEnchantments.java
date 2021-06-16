package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.enchantment.SoulDrainingEnchantment;
import net.minecraft.enchantment.Enchantment;

import static net.minecraft.enchantment.Enchantment.Rarity.RARE;
import static net.minecraft.entity.EquipmentSlot.MAINHAND;

public class ModEnchantments {

    public static final Enchantment SOUL_DRAINING = new SoulDrainingEnchantment(RARE, MAINHAND);

}