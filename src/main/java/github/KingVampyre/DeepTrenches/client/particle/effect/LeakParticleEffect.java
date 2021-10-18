package github.KingVampyre.DeepTrenches.client.particle.effect;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.fluid.Fluid;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.particle.AbstractDustParticleEffect;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import net.minecraft.util.Identifier;

import static net.minecraft.util.registry.Registry.FLUID;
import static net.minecraft.util.registry.Registry.PARTICLE_TYPE;

public record LeakParticleEffect(
        ParticleType<LeakParticleEffect> type,
        Fluid fluid, float red, float green, float blue) implements ParticleEffect {

    public static final ParticleEffect.Factory<LeakParticleEffect> PARAMETERS_FACTORY = new Factory<>() {

        @Override
        public LeakParticleEffect read(ParticleType<LeakParticleEffect> type, StringReader reader) throws CommandSyntaxException {
            reader.expect(' ');
            var id = Identifier.tryParse(reader.readString());
            var fluid = FLUID.get(id);
            var color = AbstractDustParticleEffect.readColor(reader);

            return new LeakParticleEffect(type, fluid, color.getX(), color.getY(), color.getZ());
        }

        @Override
        public LeakParticleEffect read(ParticleType<LeakParticleEffect> type, PacketByteBuf buf) {
            var id = Identifier.tryParse(buf.readString());
            var fluid = FLUID.get(id);
            var color = AbstractDustParticleEffect.readColor(buf);

            return new LeakParticleEffect(type, fluid, color.getX(), color.getY(), color.getZ());
        }

    };

    @Override
    public ParticleType<?> getType() {
        return this.type;
    }

    @Override
    public void write(PacketByteBuf buf) {
        var id = FLUID.getId(this.fluid);

        buf.writeString(id.toString());
        buf.writeFloat(this.red);
        buf.writeFloat(this.green);
        buf.writeFloat(this.blue);
    }

    @Override
    public String asString() {
        return PARTICLE_TYPE.getId(this.type) + " " + FLUID.getId(this.fluid) + " rgb(" + this.red + ", " + this.green + ", " + this.blue + ")";
    }

}
