package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.common.entity.ai.sensor.NearestAdultSensor;
import github.KingVampyre.DeepTrenches.common.entity.ai.sensor.TemptingSensor;
import github.KingVampyre.DeepTrenches.core.mixin.InvokerSensorType;
import net.minecraft.entity.ai.brain.sensor.SensorType;
import net.minecraft.recipe.Ingredient;

import static net.minecraft.item.Items.COD;

public class SensorTypes {

    public static final SensorType<TemptingSensor> BETTA_TEMPTING = InvokerSensorType.create(() -> new TemptingSensor(Ingredient.ofItems(COD), 10.0F));

    public static final SensorType<NearestAdultSensor> NEAREST_ADULT = InvokerSensorType.create(() -> new NearestAdultSensor());

}
