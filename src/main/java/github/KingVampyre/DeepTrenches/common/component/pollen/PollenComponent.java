package github.KingVampyre.DeepTrenches.common.component.pollen;

import net.minecraft.nbt.CompoundTag;

public class PollenComponent implements IPollenComponent {

    protected final int maxPollen;
    protected int pollen;

    public PollenComponent(int maxPollen) {
        this.maxPollen = maxPollen;
    }

    @Override
    public int getMaxPollen() {
        return this.maxPollen;
    }

    @Override
    public int getPollen() {
        return this.pollen;
    }

    @Override
    public boolean hasPollen() {
        return this.pollen > 0;
    }

    @Override
    public boolean hasPollenCapacity() {
        return this.maxPollen > this.pollen;
    }

    @Override
    public void setPollen(int pollen) {

        if (pollen >= this.maxPollen)
            this.pollen = this.maxPollen;
        else
            this.pollen = pollen;

    }

    @Override
    public void readFromNbt(CompoundTag tag) {
        this.pollen = tag.getInt("Pollen");
    }

    @Override
    public void writeToNbt(CompoundTag tag) {
        tag.putInt("Pollen", this.pollen);
    }

}
