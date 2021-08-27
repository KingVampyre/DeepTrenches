package github.KingVampyre.DeepTrenches.client.color.world;

import github.Louwind.Reload.client.color.ColorMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.level.ColorResolver;

@Environment(EnvType.CLIENT)
public class StorceanColors implements ColorMap, ColorResolver {

    private final int defaultColor;
    private int[] colorMap;

    public StorceanColors(int defaultColor) {
        this.defaultColor = defaultColor;
    }

    @Override
    public int getColor(Biome biome, double x, double z) {
        var temperature = MathHelper.clamp(biome.getTemperature(), 0, 1);
        var humidity = MathHelper.clamp(biome.getDownfall(), 0, 1);

        var factor = humidity * temperature;
        var temperatureByte = (int) ((1 - temperature) * 255);
        var humidityByte = (int) ((1 - factor) * 255);
        var index = humidityByte << 8 | temperatureByte;

        return index >= this.colorMap.length ? this.getDefaultColor() : this.colorMap[index];
    }

    @Override
    public int getDefaultColor() {
        return this.defaultColor;
    }

    @Override
    public void setColorMap(int[] pixels) {
        this.colorMap = pixels;
    }

}