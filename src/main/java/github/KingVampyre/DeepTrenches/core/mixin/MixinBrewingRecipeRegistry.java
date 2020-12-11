package github.KingVampyre.DeepTrenches.core.mixin;

import static github.KingVampyre.DeepTrenches.core.init.ModItems.LOOSEJAW_TOOTH;
import static github.KingVampyre.DeepTrenches.core.init.ModPotions.*;
import static net.minecraft.item.Items.GLOWSTONE_DUST;
import static net.minecraft.item.Items.GUNPOWDER;
import static net.minecraft.item.Items.REDSTONE;
import static net.minecraft.potion.Potions.AWKWARD;

import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.recipe.BrewingRecipeRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BrewingRecipeRegistry.class)
public abstract class MixinBrewingRecipeRegistry {

    @Shadow
    protected static void registerPotionRecipe(Potion input, Item item, Potion output) {

    }

    @Inject(method = "registerDefaults", at = @At("HEAD"))
    private static void register(CallbackInfo ci) {
        registerPotionRecipe(AWKWARD, LOOSEJAW_TOOTH, SOFTBONES);
        registerPotionRecipe(SOFTBONES, GUNPOWDER, SOFTBONES);
        registerPotionRecipe(LONG_SOFTBONES, GUNPOWDER, LONG_SOFTBONES);
        registerPotionRecipe(LONG_STRONG_SOFTBONES, GUNPOWDER, LONG_STRONG_SOFTBONES);
        registerPotionRecipe(STRONG_SOFTBONES, GUNPOWDER, STRONG_SOFTBONES);
        registerPotionRecipe(SOFTBONES, REDSTONE, LONG_SOFTBONES);
        registerPotionRecipe(STRONG_SOFTBONES, REDSTONE, LONG_STRONG_SOFTBONES);
        registerPotionRecipe(LONG_SOFTBONES, GLOWSTONE_DUST, LONG_STRONG_SOFTBONES);
        registerPotionRecipe(SOFTBONES, GLOWSTONE_DUST, STRONG_SOFTBONES);
    }

}
