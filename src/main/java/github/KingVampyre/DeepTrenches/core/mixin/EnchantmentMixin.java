package github.KingVampyre.DeepTrenches.core.mixin;

import github.KingVampyre.DeepTrenches.core.init.ModEnchantments;
import github.KingVampyre.DeepTrenches.core.init.ModItems;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Enchantment.class)
public class EnchantmentMixin {

    @Inject(method = "isAcceptableItem", at = @At("HEAD"), cancellable = true)
    private void isAcceptableItem(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        Enchantment enchantment = (Enchantment) (Object) this;
        Item item = stack.getItem();

        if(enchantment == ModEnchantments.SOUL_DRAINING) {

            if(item == Items.CROSSBOW)
                cir.setReturnValue(true);

            if(item == Items.TRIDENT)
                cir.setReturnValue(true);

        }

        if(item == ModItems.ADAIGGER) {

            if(enchantment == ModEnchantments.SOUL_DRAINING)
                cir.setReturnValue(true);

            if(enchantment == Enchantments.LOYALTY)
                cir.setReturnValue(true);

            if(enchantment.type == EnchantmentTarget.WEAPON)
                cir.setReturnValue(true);

        }

    }

}
