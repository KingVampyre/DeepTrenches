package github.KingVampyre.DeepTrenches.core.block.entity;

import github.KingVampyre.DeepTrenches.core.init.block.DTBlockEntityTypes;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.util.math.BlockPos;

public class CustomSignBlockEntity extends SignBlockEntity {

    public CustomSignBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public BlockEntityType<?> getType() {
        return DTBlockEntityTypes.SIGN;
    }

}