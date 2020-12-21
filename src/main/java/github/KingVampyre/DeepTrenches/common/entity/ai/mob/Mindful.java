package github.KingVampyre.DeepTrenches.common.entity.ai.mob;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.ai.brain.sensor.Sensor;
import net.minecraft.entity.ai.brain.sensor.SensorType;

import java.util.List;

public interface Mindful<T> {

    List<MemoryModuleType<?>> getMemoryModules();

    ImmutableList<? extends SensorType<? extends Sensor<? super T>>> getSensors();

}
