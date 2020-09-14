package github.KingVampyre.DeepTrenches.core.enchantment;

import static net.minecraft.enchantment.Enchantments.MULTISHOT;
import static net.minecraft.enchantment.Enchantments.PIERCING;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class DrainingEnchantment extends Enchantment {

    public DrainingEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot ...slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    protected boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != MULTISHOT && other != PIERCING;
    }

    @Override
    public int getMaxPower(int enchantmentLevel) {
        return 50;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public int getMinPower(int enchantmentLevel) {
        return 25;
    }

}
