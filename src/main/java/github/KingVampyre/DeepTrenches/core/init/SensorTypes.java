package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.common.entity.ai.sensor.NearestAdultSensor;
import github.KingVampyre.DeepTrenches.common.entity.ai.sensor.SkittishHurtBySensor;
import github.KingVampyre.DeepTrenches.common.entity.ai.sensor.TamableHurtBySensor;
import github.Louwind.entityutils.core.mixin.SensorTypeInvoker;
import net.minecraft.entity.ai.brain.sensor.SensorType;
import net.minecraft.entity.ai.brain.sensor.TemptationsSensor;
import net.minecraft.recipe.Ingredient;

import static net.minecraft.item.Items.COD;

public class SensorTypes {

    public static final SensorType<TemptationsSensor> COD_TEMPTING = SensorTypeInvoker.create(() -> new TemptationsSensor(Ingredient.ofItems(COD)));

    public static final SensorType<NearestAdultSensor> NEAREST_ADULT = SensorTypeInvoker.create(NearestAdultSensor::new);

    public static final SensorType<SkittishHurtBySensor> SKITTISH_HURT_BY = SensorTypeInvoker.create(() -> new SkittishHurtBySensor(16F));

    public static final SensorType<TamableHurtBySensor> TAMABLE_HURT_BY = SensorTypeInvoker.create(() -> new TamableHurtBySensor(16F));

}
