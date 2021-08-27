package github.KingVampyre.DeepTrenches.core.entity.effect;

import static net.minecraft.entity.attribute.EntityAttributeModifier.Operation.ADDITION;
import static net.minecraft.entity.attribute.EntityAttributeModifier.Operation.MULTIPLY_TOTAL;
import static net.minecraft.entity.attribute.EntityAttributes.GENERIC_MAX_HEALTH;
import static net.minecraft.entity.attribute.EntityAttributes.GENERIC_MOVEMENT_SPEED;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class CycawlerBeautyStatusEffect extends StatusEffect {

	public CycawlerBeautyStatusEffect(StatusEffectCategory category, int i) {
		super(category, i);

		this.addAttributeModifier(GENERIC_MAX_HEALTH, "5D6F0BA2-1186-46AC-B896-C61C5CEE99CC", 4.0F, ADDITION);
		this.addAttributeModifier(GENERIC_MOVEMENT_SPEED, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.15F, MULTIPLY_TOTAL);
	}

}