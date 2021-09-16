package github.KingVampyre.DeepTrenches.core.entity.effect;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

import java.util.UUID;

import static github.KingVampyre.DeepTrenches.core.init.DTDamageSources.ACID;
import static github.KingVampyre.DeepTrenches.core.init.DTDamageSources.GAS;
import static github.KingVampyre.DeepTrenches.core.init.DTStatusEffects.ACID_CORROSION;
import static net.minecraft.entity.EquipmentSlot.Type.ARMOR;
import static net.minecraft.entity.attribute.EntityAttributes.GENERIC_MAX_HEALTH;

public class CorrosionStatusEffect extends StatusEffect {

    public CorrosionStatusEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        var armorItems = ImmutableList.copyOf(entity.getArmorItems());
        var amount = 2 * amplifier + 1;

        for (var i = 0; i < armorItems.size(); i++) {
            var slot = EquipmentSlot.fromTypeIndex(ARMOR, i);
            var stack = armorItems.get(i);

            if(!stack.isEmpty())
                stack.damage(amount, entity, living -> entity.sendEquipmentBreakStatus(slot));
        }

        entity.damage(this == ACID_CORROSION ? ACID :  GAS, amount);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 40 == 0;
    }

    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        super.onRemoved(entity, attributes, amplifier);

        var attributeInstance = attributes.getCustomInstance(GENERIC_MAX_HEALTH);

        if(attributeInstance != null) {
            var modifier = attributeInstance.getModifier(UUID.fromString("d5fd30f3-3e18-4d37-8754-2ff20a71dec4"));

            if(modifier != null) {
                var maxHealth = attributeInstance.getBaseValue();
                var value = modifier.getValue();
                var health = entity.getHealth();
                var newHealth = (float) (maxHealth + value);

                if(health >= newHealth)
                    entity.setHealth(newHealth);

                attributeInstance.removeModifier(modifier);
            }

        }

    }

}