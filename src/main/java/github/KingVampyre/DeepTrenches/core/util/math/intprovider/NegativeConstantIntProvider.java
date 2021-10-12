package github.KingVampyre.DeepTrenches.core.util.math.intprovider;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.IntProviderType;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.DTIntProviderType.NEGATIVE_CONSTANT;

public class NegativeConstantIntProvider extends IntProvider {

    public static final Codec<NegativeConstantIntProvider> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.INT.fieldOf("value").forGetter(provider -> provider.value)).apply(instance, NegativeConstantIntProvider::new));

    protected final int value;

    public static NegativeConstantIntProvider create(int value) {

        if(value >= 0)
            throw new IllegalArgumentException("Constant is not negative!");

        return new NegativeConstantIntProvider(value);
    }

    private NegativeConstantIntProvider(int value) {
        this.value = value;
    }

    @Override
    public int get(Random random) {
        return this.value;
    }

    @Override
    public int getMin() {
        return this.value;
    }

    @Override
    public int getMax() {
        return this.value;
    }

    @Override
    public IntProviderType<?> getType() {
        return NEGATIVE_CONSTANT;
    }

    @Override
    public String toString() {
        return Integer.toString(this.value);
    }

}
