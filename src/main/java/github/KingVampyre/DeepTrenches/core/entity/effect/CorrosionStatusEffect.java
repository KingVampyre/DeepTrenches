package github.KingVampyre.DeepTrenches.core.entity.effect;

import com.google.common.collect.ImmutableList;
import github.KingVampyre.DeepTrenches.common.entity.effect.ArmorDamageStatusEffect;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import static github.KingVampyre.DeepTrenches.core.init.DamageSources.ACID;
import static github.KingVampyre.DeepTrenches.core.init.DamageSources.GAS;
import static github.KingVampyre.DeepTrenches.core.init.StatusEffects.ACID_CORROSION;
import static net.minecraft.entity.attribute.EntityAttributes.GENERIC_MAX_HEALTH;

public class CorrosionStatusEffect extends ArmorDamageStatusEffect {

    public CorrosionStatusEffect(StatusEffectType type, int color) {
        super(type, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        super.applyUpdateEffect(entity, amplifier);

        entity.damage(this == ACID_CORROSION ? ACID :  GAS, (amplifier + 1) * 2.0F);
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

    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        super.onRemoved(entity, attributes, amplifier);

        EntityAttributeInstance attributeInstance = attributes.getCustomInstance(GENERIC_MAX_HEALTH);

        if(attributeInstance != null) {
            EntityAttributeModifier modifier = attributeInstance.getModifier(UUID.fromString("d5fd30f3-3e18-4d37-8754-2ff20a71dec4"));

            if(modifier != null) {
                double maxHealth = attributeInstance.getBaseValue();
                double value = modifier.getValue();
                float health = entity.getHealth();
                float newHealth = (float) (maxHealth + value);

                if(health >= newHealth)
                    entity.setHealth(newHealth);

                attributeInstance.removeModifier(modifier);
            }

        }

    }

}
