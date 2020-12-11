package github.KingVampyre.DeepTrenches.client.mixin;

import github.KingVampyre.DeepTrenches.core.init.ColorMaps;
import github.KingVampyre.DeepTrenches.core.init.ModBlocks;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModelManager;
import net.minecraft.client.texture.TextureManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemRenderer.class)
public class MixinItemRenderer {

    @Inject(method = "<init>", at = @At("RETURN"))
    private void init(TextureManager manager, BakedModelManager bakery, ItemColors colorMap, CallbackInfo ci) {
        colorMap.register((stack, tintIndex) -> ColorMaps.STORCEAN_MOSOIL.getDefaultColor(), ModBlocks.REEBLOON);
        colorMap.register((stack, tintIndex) -> ColorMaps.STORCEAN_MOSOIL.getDefaultColor(), ModBlocks.MOSOIL);

        colorMap.register((stack, tintIndex) -> 5614908, ModBlocks.ALMOND_LEAVES);
        colorMap.register((stack, tintIndex) -> 5614908, ModBlocks.BLACK_BIRCH_LEAVES);
        colorMap.register((stack, tintIndex) -> 5614908, ModBlocks.EBONY_LEAVES);
        colorMap.register((stack, tintIndex) -> 5614908, ModBlocks.PELTOGYNE_LEAVES);
        colorMap.register((stack, tintIndex) -> 5614908, ModBlocks.PLUM_LEAVES);
        colorMap.register((stack, tintIndex) -> 5614908, ModBlocks.TEAK_LEAVES);

        colorMap.register((stack, tintIndex) -> ColorMaps.STORCEAN_FOLIAGE.getDefaultColor(), ModBlocks.AQUEAN_LEAVES);
    }

}
