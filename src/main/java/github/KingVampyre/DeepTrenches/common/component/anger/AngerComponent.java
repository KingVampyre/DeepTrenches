package github.KingVampyre.DeepTrenches.common.component.anger;

import net.minecraft.nbt.CompoundTag;

public class AngerComponent implements IAngerComponent {

    private int anger;

    @Override
    public int getAnger() {
        return this.anger;
    }

    @Override
    public boolean isAngry() {
        return this.anger > 0;
    }

    @Override
    public void setAnger(int anger) {
        this.anger = anger;
    }

    @Override
    public void readFromNbt(CompoundTag compoundTag) {
        this.anger = compoundTag.getInt("Anger");
    }

    @Override
    public void writeToNbt(CompoundTag compoundTag) {
        compoundTag.putInt("Anger", this.anger);
    }

}
