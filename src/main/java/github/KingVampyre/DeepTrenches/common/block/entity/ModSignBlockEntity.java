package github.KingVampyre.DeepTrenches.common.block.entity;

import github.KingVampyre.DeepTrenches.core.init.BlockEntityTypes;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.SignBlockEntity;

public class ModSignBlockEntity extends SignBlockEntity {

    @Override
    public BlockEntityType<?> getType() {
        return BlockEntityTypes.SIGN;
    }

}
