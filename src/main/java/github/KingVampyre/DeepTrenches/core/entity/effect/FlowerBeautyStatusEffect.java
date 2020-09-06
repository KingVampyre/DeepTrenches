package github.KingVampyre.DeepTrenches.core.entity.effect;

import static net.minecraft.entity.attribute.EntityAttributeModifier.Operation.MULTIPLY_TOTAL;
import static net.minecraft.entity.attribute.EntityAttributes.GENERIC_MOVEMENT_SPEED;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class FlowerBeautyStatusEffect extends StatusEffect {

	public FlowerBeautyStatusEffect(StatusEffectType statusEffectType, int i) {
		super(statusEffectType, i);

		this.addAttributeModifier(GENERIC_MOVEMENT_SPEED, "91AEAA56-376B-4498-935B-2F7F68070635", 0.2F, MULTIPLY_TOTAL);
	}

	@Override
	public void applyUpdateEffect(LivingEntity entityLiving, int amplifier) {
		World world = entityLiving.getEntityWorld();

		if (entityLiving instanceof PlayerEntity) {
			PlayerEntity player = (PlayerEntity) entityLiving;

			if (!world.isClient())
				player.getHungerManager().add(amplifier + 1, 1.0F);
		}
	}

}
