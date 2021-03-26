package github.KingVampyre.DeepTrenches.core.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.NyliumBlock;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;

public class EnrotiumBlock extends NyliumBlock {

    public static final BooleanProperty END = BooleanProperty.of("end");

    public EnrotiumBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState > builder) {
        super.appendProperties(builder);

        builder.add(END);
    }

}
