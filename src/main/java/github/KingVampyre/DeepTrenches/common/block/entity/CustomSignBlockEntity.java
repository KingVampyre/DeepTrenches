package github.KingVampyre.DeepTrenches.common.block.entity;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.SignBlockEntity;

import static github.KingVampyre.DeepTrenches.core.init.BlockEntityTypes.SIGN;

public class CustomSignBlockEntity extends SignBlockEntity {

    @Override
    public BlockEntityType<?> getType() {
        return SIGN;
    }

}
