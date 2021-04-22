package github.KingVampyre.DeepTrenches.client.color.world;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class StorceanColors {

    private final int defaultColor;
    private int[] colorMap;

    public StorceanColors(int defaultColor) {
        this.defaultColor = defaultColor;
    }

    public int getColor(double temperature, double humidity) {
        int i = (int)((1 - temperature) * 255);
        int j = (int)((1 - humidity * temperature) * 255);

        return colorMap[j << 8 | i];
    }

    public int getDefaultColor() {
        return this.defaultColor;
    }

    public void setColorMap(int[] pixels) {
        colorMap = pixels;
    }

}
