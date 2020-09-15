package github.KingVampyre.DeepTrenches.core.init;

import static net.minecraft.entity.effect.StatusEffectType.*;
import static net.minecraft.entity.effect.StatusEffects.NAUSEA;
import static net.minecraft.entity.effect.StatusEffects.POISON;

import github.KingVampyre.DeepTrenches.common.entity.effect.CurativeStatusEffect;
import github.KingVampyre.DeepTrenches.core.entity.effect.CycawlerBeautyStatusEffect;
import github.KingVampyre.DeepTrenches.core.entity.effect.DrainingStatusEffect;
import github.KingVampyre.DeepTrenches.core.entity.effect.FlowerBeautyStatusEffect;
import github.KingVampyre.DeepTrenches.core.entity.effect.SleepyStatusEffect;
import github.KingVampyre.DeepTrenches.core.entity.effect.SoftBonesStatusEffect;
import net.minecraft.entity.effect.StatusEffect;

public class StatusEffects {

	public static final StatusEffect BRAITOR_BEAUTY = new CurativeStatusEffect(BENEFICIAL, NAUSEA, 1.0F, 8983661);
	public static final StatusEffect COSMOS_BEAUTY = new CurativeStatusEffect(BENEFICIAL, POISON, 1.0F, 1969163);
	public static final StatusEffect CYCAWLER_BEAUTY = new CycawlerBeautyStatusEffect(BENEFICIAL, 7689983);
	public static final StatusEffect FLOWER_BEAUTY = new FlowerBeautyStatusEffect(NEUTRAL, 12001933);
	public static final StatusEffect SLEEPY = new SleepyStatusEffect(NEUTRAL, 3549040);
	public static final StatusEffect SOFTBONES = new SoftBonesStatusEffect(NEUTRAL, 10592434);
	public static final StatusEffect SOUL_DRAINING = new DrainingStatusEffect(HARMFUL, 4004144);
	public static final StatusEffect SOUL_RAVENING = new DrainingStatusEffect(BENEFICIAL, 6830240);

}
