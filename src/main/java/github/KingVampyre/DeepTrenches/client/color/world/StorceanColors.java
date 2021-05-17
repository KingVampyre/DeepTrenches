package github.KingVampyre.DeepTrenches.client.color.world;

import github.Louwind.Reload.client.color.ColorMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class StorceanColors implements ColorMap {

    private final int defaultColor;
    private int[] colorMap;

    public StorceanColors(int defaultColor) {
        this.defaultColor = defaultColor;
    }

    public int getColor(double temperature, double humidity) {
        int i = (int) ((1 - temperature) * 255);
        int j = (int) ((1 - humidity * temperature) * 255);

        return this.colorMap[j << 8 | i];
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
