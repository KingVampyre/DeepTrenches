package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.block.enums.AirialMossType;
import github.KingVampyre.DeepTrenches.core.block.enums.BlockThird;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.IntProperty;

import static net.minecraft.util.math.Direction.DOWN;

public class DTProperties {

    public static final EnumProperty<AirialMossType> AIRIAL_MOSS_TYPE = EnumProperty.of("type", AirialMossType.class);

    public static final EnumProperty<BlockThird> BLOCK_THIRD = EnumProperty.of("third", BlockThird.class);

    public static final DirectionProperty FACING_EXCEPT_DOWN = DirectionProperty.of("facing", facing -> facing != DOWN);

    public static final BooleanProperty FRUIT = BooleanProperty.of("fruit");

    public static final IntProperty STAGE_2 = IntProperty.of("stage", 0, 2);

}
