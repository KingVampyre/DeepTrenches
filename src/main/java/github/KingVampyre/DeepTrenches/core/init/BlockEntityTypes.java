package github.KingVampyre.DeepTrenches.core.init;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.ALMOND_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.ALMOND_WALL_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.ANAMEATA_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.ANAMEATA_WALL_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.AQUEAN_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.AQUEAN_WALL_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.BARSHROOKLE_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.BARSHROOKLE_WALL_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.BLACK_BIRCH_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.BLACK_BIRCH_WALL_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.CHERRY_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.CHERRY_WALL_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.COOK_PINE_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.COOK_PINE_WALL_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.CROLOOD_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.CROLOOD_WALL_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.DARK_CROLOOD_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.DARK_CROLOOD_WALL_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.EBONY_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.EBONY_WALL_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.FUCHSITRA_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.FUCHSITRA_WALL_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.FUNERANITE_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.FUNERANITE_WALL_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.GHOSHROOM_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.GHOSHROOM_WALL_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.PELTOGYNE_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.PELTOGYNE_WALL_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.PIN_CHERRY_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.PIN_CHERRY_WALL_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.PLUM_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.PLUM_WALL_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.PURFUNGA_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.PURFUNGA_WALL_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.SPROOM_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.SPROOM_WALL_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.STORTREEAN_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.STORTREEAN_WALL_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.STROOMEAN_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.STROOMEAN_WALL_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.SUNRISE_FUNGUS_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.SUNRISE_FUNGUS_WALL_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.TEAK_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.TEAK_WALL_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.THUNDERCLOUD_PLUM_SIGN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.THUNDERCLOUD_PLUM_WALL_SIGN;

import github.KingVampyre.DeepTrenches.common.block.entity.ModSignBlockEntity;
import github.KingVampyre.DeepTrenches.core.block.entity.StaspNestBlockEntity;
import net.minecraft.block.entity.BlockEntityType;

public class BlockEntityTypes {

	public static final BlockEntityType<ModSignBlockEntity> SIGN = BlockEntityType.Builder.create(
			ModSignBlockEntity::new, ALMOND_SIGN, ALMOND_WALL_SIGN, ANAMEATA_SIGN, ANAMEATA_WALL_SIGN, AQUEAN_SIGN,
			AQUEAN_WALL_SIGN, BARSHROOKLE_SIGN, BARSHROOKLE_WALL_SIGN, BLACK_BIRCH_SIGN, BLACK_BIRCH_WALL_SIGN,
			CHERRY_SIGN, CHERRY_WALL_SIGN, COOK_PINE_SIGN, COOK_PINE_WALL_SIGN, CROLOOD_SIGN, CROLOOD_WALL_SIGN,
			DARK_CROLOOD_SIGN, DARK_CROLOOD_WALL_SIGN, EBONY_SIGN, EBONY_WALL_SIGN, FUNERANITE_SIGN,
			FUNERANITE_WALL_SIGN, FUCHSITRA_SIGN, FUCHSITRA_WALL_SIGN, GHOSHROOM_SIGN, GHOSHROOM_WALL_SIGN,
			PELTOGYNE_SIGN, PELTOGYNE_WALL_SIGN, PIN_CHERRY_SIGN, PIN_CHERRY_WALL_SIGN, PLUM_SIGN, PLUM_WALL_SIGN,
			PURFUNGA_SIGN, PURFUNGA_WALL_SIGN, SPROOM_SIGN, SPROOM_WALL_SIGN, STORTREEAN_SIGN, STORTREEAN_WALL_SIGN,
			STROOMEAN_SIGN, STROOMEAN_WALL_SIGN, SUNRISE_FUNGUS_SIGN, SUNRISE_FUNGUS_WALL_SIGN, TEAK_SIGN,
			TEAK_WALL_SIGN, THUNDERCLOUD_PLUM_SIGN, THUNDERCLOUD_PLUM_WALL_SIGN).build(null);

	public static final BlockEntityType<StaspNestBlockEntity> STASP_NEST = BlockEntityType.Builder
			.create(StaspNestBlockEntity::new, ModBlocks.STASP_NEST).build(null);

}
