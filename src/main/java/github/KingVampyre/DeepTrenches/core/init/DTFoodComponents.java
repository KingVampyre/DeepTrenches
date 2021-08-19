package github.KingVampyre.DeepTrenches.core.init;

import static net.minecraft.entity.effect.StatusEffects.HUNGER;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;

public class DTFoodComponents {

	public static final FoodComponent COOKED_GIANT_HATCHETFISH = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();

    public static final FoodComponent GIANT_HATCHETFISH = new FoodComponent.Builder().hunger(4).saturationModifier(0).build();

    public static final FoodComponent STORCEAN_FISH = new FoodComponent.Builder().hunger(2).saturationModifier(0).statusEffect(new StatusEffectInstance(HUNGER, 600), 0.35F).build();

}
