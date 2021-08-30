package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.common.entity.effect.CurativeStatusEffect;
import github.KingVampyre.DeepTrenches.core.entity.effect.*;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.registry.Registry;

import static net.minecraft.entity.effect.StatusEffectCategory.*;
import static net.minecraft.entity.effect.StatusEffects.NAUSEA;
import static net.minecraft.entity.effect.StatusEffects.POISON;
import static net.minecraft.util.registry.Registry.STATUS_EFFECT;

public class DTStatusEffects {

	public static final StatusEffect ACID_CORROSION = register("deep_trenches:acid_corrosion", new CorrosionStatusEffect(HARMFUL, 11654073));
	public static final StatusEffect BRAITOR_BEAUTY = register("deep_trenches:braitor_beauty", new CurativeStatusEffect(BENEFICIAL, NAUSEA, 1.0F, 8983661));
	public static final StatusEffect COSMOS_BEAUTY = register("deep_trenches:cosmos_beauty", new CurativeStatusEffect(BENEFICIAL, POISON, 1.0F, 1969163));
	public static final StatusEffect CYCAWLER_BEAUTY = register("deep_trenches:cycawler_beauty", new CycawlerBeautyStatusEffect(BENEFICIAL, 7689983));
	public static final StatusEffect FLOWER_BEAUTY = register("deep_trenches:flower_beauty", new FlowerBeautyStatusEffect(NEUTRAL, 12001933));
	public static final StatusEffect GAS_CORROSION = register("deep_trenches:gas_corrosion", new CorrosionStatusEffect(HARMFUL, 735782));
	public static final StatusEffect PRESSURE = register("deep_trenches:pressure", new PressureStatusEffect(HARMFUL, 728094));
	public static final StatusEffect RADIATION = register("deep_trenches:radiation", new StatusEffect(NEUTRAL, 3858175));
	public static final StatusEffect SINKING = register("deep_trenches:sinking", new StatusEffect(NEUTRAL, 728094));
	public static final StatusEffect SLEEPY = register("deep_trenches:sleepy", new SleepyStatusEffect(NEUTRAL, 3549040));
	public static final StatusEffect SOFTBONES = register("deep_trenches:softbones", new SoftBonesStatusEffect(NEUTRAL, 10592434));
	public static final StatusEffect SOUL_DRAINING = register("deep_trenches:soul_draining", new DrainingStatusEffect(HARMFUL, 4004144));
	public static final StatusEffect SOUL_RAVENING = register("deep_trenches:soul_ravening", new DrainingStatusEffect(BENEFICIAL, 6830240));

	private static StatusEffect register(String id, StatusEffect effect) {
		return Registry.register(STATUS_EFFECT, id, effect);
	}

}
