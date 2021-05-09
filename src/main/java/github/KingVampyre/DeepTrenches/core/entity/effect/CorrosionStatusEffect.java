package github.KingVampyre.DeepTrenches.core.entity.effect;

import com.google.common.collect.ImmutableList;
import github.KingVampyre.DeepTrenches.common.entity.effect.ArmorDamageStatusEffect;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.Random;

public class CorrosionStatusEffect extends ArmorDamageStatusEffect {

    public CorrosionStatusEffect(StatusEffectType type, int color) {
        super(type, color);
    }

    @Override
    protected List<ItemStack> getArmorItems(LivingEntity entity) {
        return ImmutableList.copyOf(entity.getArmorItems());
    }

    @Override
    protected int getDamageAmount(ItemStack stack, int amplifier, Random random) {
        return 3 * (amplifier > 0 ? amplifier - 1 : 1) + 1;
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 40 == 0;
    }

}
