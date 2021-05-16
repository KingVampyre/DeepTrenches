package github.KingVampyre.DeepTrenches.core.particle;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.fluid.Fluid;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import net.minecraft.util.Identifier;

import static net.minecraft.util.registry.Registry.FLUID;
import static net.minecraft.util.registry.Registry.PARTICLE_TYPE;

public class ColoredWaterFluidParticleEffect implements ParticleEffect {

    public static final ParticleEffect.Factory<ColoredWaterFluidParticleEffect> PARAMETERS_FACTORY = new Factory<>() {

        @Override
        public ColoredWaterFluidParticleEffect read(ParticleType<ColoredWaterFluidParticleEffect> type, StringReader reader) throws CommandSyntaxException {
            reader.expect(' ');
            Identifier id = Identifier.tryParse(reader.readString());
            Fluid fluid = FLUID.get(id);
            reader.expect(' ');
            float red = reader.readFloat();
            reader.expect(' ');
            float green = reader.readFloat();
            reader.expect(' ');
            float blue = reader.readFloat();

            return new ColoredWaterFluidParticleEffect(type, fluid, red, green, blue);
        }

        @Override
        public ColoredWaterFluidParticleEffect read(ParticleType<ColoredWaterFluidParticleEffect> type, PacketByteBuf buf) {
            Identifier id = Identifier.tryParse(buf.readString());

            Fluid fluid = FLUID.get(id);
            float red = buf.readFloat();
            float green = buf.readFloat();
            float blue = buf.readFloat();

            return new ColoredWaterFluidParticleEffect(type, fluid, red, green, blue);
        }

    };

    public final ParticleType<ColoredWaterFluidParticleEffect> type;
    public final Fluid fluid;
    public final float red;
    public final float green;
    public final float blue;

    public ColoredWaterFluidParticleEffect(ParticleType<ColoredWaterFluidParticleEffect> type, Fluid fluid, float red, float green, float blue) {
        this.type = type;
        this.fluid = fluid;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    public ParticleType<?> getType() {
        return this.type;
    }

    @Override
    public void write(PacketByteBuf buf) {
        Identifier id = FLUID.getId(this.fluid);

        buf.writeString(id.toString());
        buf.writeFloat(this.red);
        buf.writeFloat(this.green);
        buf.writeFloat(this.blue);
    }

    @Override
    public String asString() {
        return PARTICLE_TYPE.getId(this.type) + " " + FLUID.getId(this.fluid) + " rgb(" + this.red + ", " + this.green + ", " + this.blue + ")" ;
    }

}
