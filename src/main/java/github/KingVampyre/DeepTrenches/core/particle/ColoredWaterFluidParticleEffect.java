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
            int red = reader.readInt();
            reader.expect(' ');
            int green = reader.readInt();
            reader.expect(' ');
            int blue = reader.readInt();

            return new ColoredWaterFluidParticleEffect(type, fluid, red, green, blue);
        }

        @Override
        public ColoredWaterFluidParticleEffect read(ParticleType<ColoredWaterFluidParticleEffect> type, PacketByteBuf buf) {
            Identifier id = Identifier.tryParse(buf.readString());

            Fluid fluid = FLUID.get(id);
            int red = buf.readInt();
            int green = buf.readInt();
            int blue = buf.readInt();

            return new ColoredWaterFluidParticleEffect(type, fluid, red, green, blue);
        }

    };

    public final ParticleType<ColoredWaterFluidParticleEffect> type;
    public final Fluid fluid;
    public final int red;
    public final int green;
    public final int blue;

    public ColoredWaterFluidParticleEffect(ParticleType<ColoredWaterFluidParticleEffect> type, Fluid fluid, int red, int green, int blue) {
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
        buf.writeInt(this.red);
        buf.writeInt(this.green);
        buf.writeInt(this.blue);
    }

    @Override
    public String asString() {
        return PARTICLE_TYPE.getId(this.type) + " " + FLUID.getId(this.fluid) + " rgb(" + this.red + ", " + this.green + ", " + this.blue + ")" ;
    }

}
