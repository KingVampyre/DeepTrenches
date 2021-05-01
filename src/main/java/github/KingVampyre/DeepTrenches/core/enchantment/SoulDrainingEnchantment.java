package github.KingVampyre.DeepTrenches.core.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static github.KingVampyre.DeepTrenches.core.init.ModItems.ADAIGGER;
import static net.minecraft.enchantment.EnchantmentTarget.*;
import static net.minecraft.enchantment.Enchantments.MULTISHOT;
import static net.minecraft.enchantment.Enchantments.PIERCING;

public class SoulDrainingEnchantment extends Enchantment {

    public SoulDrainingEnchantment(Rarity weight, EquipmentSlot ...slotTypes) {
        super(weight, BOW, slotTypes);
    }

    @Override
    protected boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != MULTISHOT && other != PIERCING;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public int getMaxPower(int enchantmentLevel) {
        return 50;
    }

    @Override
    public int getMinPower(int enchantmentLevel) {
        return 25;
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        Item item = stack.getItem();

        return super.isAcceptableItem(stack) || CROSSBOW.isAcceptableItem(item) || TRIDENT.isAcceptableItem(item) || item == ADAIGGER;
    }

}
