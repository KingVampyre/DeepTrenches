package github.KingVampyre.DeepTrenches.core.mixin;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import static github.KingVampyre.DeepTrenches.core.init.item.DTItems.ADAIGGER;
import static net.minecraft.enchantment.EnchantmentTarget.WEAPON;
import static net.minecraft.enchantment.Enchantments.LOYALTY;

@Mixin(EnchantmentHelper.class)
public class MixinEnchantmentHelper {

    @Unique
    private static Enchantment currentEnchantment;

    @Redirect(method = "getPossibleEntries", at = @At(value = "INVOKE", target = "Lnet/minecraft/enchantment/Enchantment;isAvailableForRandomSelection()Z"))
    private static boolean isAvailableForRandomSelection(Enchantment enchantment) {
        currentEnchantment = enchantment;

        return enchantment.isAvailableForRandomSelection();
    }

    @Redirect(method = "getPossibleEntries", at = @At(value = "INVOKE", target = "Lnet/minecraft/enchantment/EnchantmentTarget;isAcceptableItem(Lnet/minecraft/item/Item;)Z"))
    private static boolean isAcceptableItem(EnchantmentTarget enchantmentTarget, Item item) {
        ItemStack stack = new ItemStack(item);

        if(item == ADAIGGER)
            return currentEnchantment.isAcceptableItem(stack) || currentEnchantment.type == WEAPON || currentEnchantment == LOYALTY;

        return enchantmentTarget.isAcceptableItem(item);
    }

}
