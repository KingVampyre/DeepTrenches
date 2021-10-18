package github.KingVampyre.DeepTrenches.client.color;

import github.Louwind.Reload.client.color.ColorMap;
import net.minecraft.block.BlockState;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.BlockRenderView;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.level.ColorResolver;
import org.jetbrains.annotations.Nullable;

public class StorceanColorMap implements ColorMap, ColorResolver, BlockColorProvider, ItemColorProvider {

    protected final int defaultColor;
    protected final Identifier texture;
    protected int[] pixels;

    public StorceanColorMap(int defaultColor, Identifier texture) {
        this.defaultColor = defaultColor;
        this.texture = texture;
    }

    @Override
    public int getColor(BlockState blockState, @Nullable BlockRenderView blockRenderView, @Nullable BlockPos blockPos, int i) {
        return this.defaultColor;
    }

    @Override
    public int getColor(ItemStack itemStack, int i) {
        return this.defaultColor;
    }

    @Override
    public int getColor(Biome biome, double d, double e) {
        var temperature = MathHelper.clamp(biome.getTemperature(), 0, 1);
        var humidity = MathHelper.clamp(biome.getDownfall(), 0, 1);

        var factor = humidity * temperature;
        var temperatureByte = (int) ((1 - temperature) * 255);
        var humidityByte = (int) ((1 - factor) * 255);
        var index = humidityByte << 8 | temperatureByte;

        return index >= this.pixels.length ? this.defaultColor : this.pixels[index];
    }

    public int getDefaultColor() {
        return this.defaultColor;
    }

    @Override
    public Identifier getTexture() {
        return this.texture;
    }

    @Override
    public void setPixels(int[] pixels) {
        this.pixels = pixels;
    }

}
