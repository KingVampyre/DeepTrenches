package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.enchantment.SoulDrainingEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.registry.Registry;

import static net.minecraft.enchantment.Enchantment.Rarity.RARE;
import static net.minecraft.entity.EquipmentSlot.MAINHAND;
import static net.minecraft.util.registry.Registry.ENCHANTMENT;

public class ModEnchantments {

    public static final Enchantment SOUL_DRAINING = Registry.register(ENCHANTMENT, "deep_trenches:soul_draining", new SoulDrainingEnchantment(RARE, MAINHAND));

}
