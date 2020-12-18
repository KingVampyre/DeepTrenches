package github.KingVampyre.DeepTrenches.core.component;

import github.KingVampyre.DeepTrenches.common.component.pollen.PollenComponent;
import net.minecraft.nbt.CompoundTag;

public class StaspPollenComponent extends PollenComponent {

    protected final int maxAqueanSap;

    protected int aqueanSap;
    protected int ticksSincePollination;

    public StaspPollenComponent(int maxAqueanSap, int maxPollen) {
        super(maxPollen);

        this.maxAqueanSap = maxAqueanSap;
    }

    public int getAqueanSap() {
        return this.aqueanSap;
    }

    public int getMaxAqueanSap() {
        return this.maxAqueanSap;
    }

    public int getTicksSincePollination() {
        return this.ticksSincePollination;
    }

    public boolean hasAqueanSap() {
        return this.aqueanSap > 0;
    }

    public boolean hasAqueanSapCapacity() {
        return this.maxAqueanSap > this.aqueanSap;
    }

    public void setAqueanSap(int aqueanSap) {
        this.aqueanSap = Math.min(aqueanSap, this.maxAqueanSap);
    }

    public void setTicksSincePollination(int ticksSincePollination) {
        this.ticksSincePollination = ticksSincePollination;
    }

    @Override
    public void readFromNbt(CompoundTag tag) {
        super.readFromNbt(tag);

        this.aqueanSap = tag.getInt("AqueanSap");
        this.ticksSincePollination = tag.getInt("TicksSincePollination");
    }

    @Override
    public void writeToNbt(CompoundTag tag) {
        super.writeToNbt(tag);

        tag.putInt("AqueanSap", this.aqueanSap);
        tag.putInt("TicksSincePollination", this.ticksSincePollination);
    }

}
