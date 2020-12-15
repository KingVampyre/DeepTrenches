package github.KingVampyre.DeepTrenches.common.component.lit;

import net.minecraft.nbt.CompoundTag;

public class BioluminiscentComponent implements LitComponent {

    protected State state;

    public BioluminiscentComponent(State state) {
        this.state = state;
    }

    @Override
    public State getState() {
        return this.state;
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void readFromNbt(CompoundTag tag) {
        this.state = State.getState(tag.getString("State"));
    }

    @Override
    public void writeToNbt(CompoundTag tag) {
        tag.putString("State", this.state.toString());
    }

}
