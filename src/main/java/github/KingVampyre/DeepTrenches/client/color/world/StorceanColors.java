package github.KingVampyre.DeepTrenches.client.color.world;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class StorceanColors {
    private int[] colorMap;
    private int defaultColor;

    public StorceanColors(int defaultColor) {
        this.defaultColor = defaultColor;
    }

    public int getColor(double temperature, double humidity) {
        int i = (int)((1.0D - temperature) * 255.0D);
        int j = (int)((1.0D - humidity * temperature) * 255.0D);

        return colorMap[j << 8 | i];
    }

    public int getDefaultColor() {
        return this.defaultColor;
    }

    public void setColorMap(int[] pixels) {
        colorMap = pixels;
    }

}
