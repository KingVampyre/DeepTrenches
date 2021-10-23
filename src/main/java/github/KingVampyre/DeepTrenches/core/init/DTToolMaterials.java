package github.KingVampyre.DeepTrenches.core.init;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum DTToolMaterials implements ToolMaterial {
	/* METALLIC MATERIALS */
	AQUAMARINE(MiningLevels.IRON, 420, 7F, 2F, 15, () -> Ingredient.ofItems(DTItems.AQUAMARINE)),
	BORON(MiningLevels.NETHERITE, 2161, 8F, 4F, 9, () -> Ingredient.ofItems(DTItems.BORON_INGOT)),
	CHALCEDONY(MiningLevels.DIAMOND, 1401, 14F, 3F, 9, () -> Ingredient.ofItems(DTItems.CHALCEDONY)),
	CLINOHUMITE(MiningLevels.IRON, 935, 8F, 2F, 12, () -> Ingredient.ofItems(DTItems.CLINOHUMITE)),
	DIOPSIDE(MiningLevels.NETHERITE, 1930, 10F, 3F, 17, () -> Ingredient.ofItems(DTItems.DIOPSIDE)),
	ENRON(MiningLevels.IRON, 5224, 9F, 6F, 18, () -> Ingredient.ofItems(DTItems.ENRON_INGOT)),
	ENSTATITE(MiningLevels.IRON, 1250, 12F, 3F, 14, () -> Ingredient.ofItems(DTItems.ENSTATITE)),
	GYLDELION(MiningLevels.IRON, 32, 12F, 0, 22, () -> Ingredient.ofItems(DTItems.GYLDELION_INGOT)),
	KRALCTIUM(MiningLevels.IRON, 3112, 10F, 5F, 20, () -> Ingredient.ofItems(DTItems.KRALCTIUM_INGOT)),
	MORGANITE(MiningLevels.DIAMOND, 1472, 8F, 3F, 11, () -> Ingredient.ofItems(DTItems.MORGANITE)),
	RUBY(MiningLevels.DIAMOND, 972, 7F, 3F, 10, () -> Ingredient.ofItems(DTItems.RUBY)),
	SAPPHIRE(MiningLevels.DIAMOND, 994, 7F, 3F, 12, () -> Ingredient.ofItems(DTItems.SAPPHIRE)),
	SILVER(MiningLevels.IRON, 440, 7F, 3F, 20, () -> Ingredient.ofItems(DTItems.SILVER_INGOT)),
	SPHENE(MiningLevels.IRON, 2402, 6F, 2F, 20, () -> Ingredient.ofItems(DTItems.SPHENE)),
	SPINEL(MiningLevels.DIAMOND, 1502, 7F, 3F, 18, () -> Ingredient.ofItems(DTItems.SPINEL)),
	STROXITE(MiningLevels.IRON, 362, 10F, 2F, 20, () -> Ingredient.ofItems(DTItems.STROXITE_INGOT)),
	TANZANITE(MiningLevels.DIAMOND, 1321, 6F, 3F, 22, () -> Ingredient.ofItems(DTItems.TANZANITE)),
	TOPAZ(MiningLevels.IRON, 992, 5F, 2F, 18, () -> Ingredient.ofItems(DTItems.TOPAZ)),
	VOID_CRITTERED_DIOPSIDE(MiningLevels.IRON, 2000, 16F, 5F, 17, () -> Ingredient.ofItems(DTItems.VOID_CRITTERED_DIOPSIDE)),
	/* WOOD MATERIALS */
	ALMOND(MiningLevels.STONE, 132, 3F, 1F, 30, () -> Ingredient.ofItems(DTBlocks.ALMOND_PLANKS)),
	ANAMEATA(MiningLevels.WOOD, 45, 2F, 0F, 19, () -> Ingredient.ofItems(DTBlocks.ANAMEATA_PLANKS)),
	ANGELS_TRUMPET(MiningLevels.WOOD, 30, 3F, 0F, 17, () -> Ingredient.ofItems(DTBlocks.ANGELS_TRUMPET_PLANKS)),
	AQUEAN(MiningLevels.WOOD, 70, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.AQUEAN_PLANKS)),
	BARSHROOKLE(MiningLevels.STONE, 200, 4F, 1F, 12, () -> Ingredient.ofItems(DTBlocks.BARSHROOKLE_PLANKS)),
	BLACK_BIRCH(MiningLevels.WOOD, 59, 2F, 0F, 17, () -> Ingredient.ofItems(DTBlocks.BLACK_BIRCH_PLANKS)),
	BLUE_MAHOE(MiningLevels.STONE, 130, 2F, 1F, 16, () -> Ingredient.ofItems(DTBlocks.BLUE_MAHOE_PLANKS)),
	BLUE_SPRUCE(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.BLUE_SPRUCE_PLANKS)),
	BOTTLEBRUSH(MiningLevels.STONE, 145, 2F, 1F, 15, () -> Ingredient.ofItems(DTBlocks.BOTTLEBRUSH_PLANKS)),
	BROMYA(MiningLevels.WOOD, 80, 3F, 1F, 17, () -> Ingredient.ofItems(DTBlocks.BROMYA_PLANKS)),
	BUBBLETREE(MiningLevels.WOOD, 20, 1F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.BUBBLETREE_PLANKS)),
	CALCEARB(MiningLevels.STONE, 275, 7F, 2F, 12, () -> Ingredient.ofItems(DTBlocks.CALCEARB_PLANKS)),
	CHERRY(MiningLevels.WOOD, 90, 3F, 1F, 15, () -> Ingredient.ofItems(DTBlocks.CHERRY_PLANKS)),
	CHOTORN(MiningLevels.STONE, 185, 3F, 1F, 17, () -> Ingredient.ofItems(DTBlocks.CHOTORN_PLANKS)),
	COOK_PINE(MiningLevels.WOOD, 62, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.COOK_PINE_PLANKS)),
	CROLOOD(MiningLevels.WOOD, 75, 2F, 0F, 20, () -> Ingredient.ofItems(DTBlocks.CROLOOD_PLANKS)),
	DARK_CROLOOD(MiningLevels.WOOD, 75, 2F, 0F, 20, () -> Ingredient.ofItems(DTBlocks.DARK_CROLOOD_PLANKS)),
	DARK_FUCHSITRA(MiningLevels.WOOD, 77, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.DARK_FUCHSITRA_PLANKS)),
	DARK_RED_ELM(MiningLevels.WOOD, 86, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.DARK_RED_ELM_PLANKS)),
	DEAD_WART_TREE(MiningLevels.WOOD, 72, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.DEAD_WART_TREE_PLANKS)),
	DRIGYUS(MiningLevels.STONE, 187, 3F, 1F, 17, () -> Ingredient.ofItems(DTBlocks.DRIGYUS_PLANKS)),
	EBONY(MiningLevels.STONE, 192, 3F, 1F, 15, () -> Ingredient.ofItems(DTBlocks.EBONY_PLANKS)),
	ENDERHEART(MiningLevels.STONE, 435, 3F, 3F, 19, () -> Ingredient.ofItems(DTBlocks.ENDERHEART_PLANKS)),
	FLALM(MiningLevels.STONE, 125, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.FLALM_PLANKS)),
	FRUCE(MiningLevels.WOOD, 64, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.FRUCE_PLANKS)),
	FUCHSITRA(MiningLevels.WOOD, 77, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.FUCHSITRA_PLANKS)),
	FUGMOS(MiningLevels.WOOD, 40, 2F, 0F, 17, () -> Ingredient.ofItems(DTBlocks.FUGMOS_PLANKS)),
	FUNERANITE(MiningLevels.STONE, 92, 2F, 2F, 22, () -> Ingredient.ofItems(DTBlocks.FUNERANITE_PLANKS)),
	GHOSHROOM(MiningLevels.STONE, 92, 4F, 1F, 22, () -> Ingredient.ofItems(DTBlocks.GHOSHROOM_PLANKS)),
	GIANT_VIOLET(MiningLevels.WOOD, 46, 2F, 0F, 17, () -> Ingredient.ofItems(DTBlocks.GIANT_VIOLET_PLANKS)),
	GUAIACUM(MiningLevels.STONE, 450, 4F, 2F, 15, () -> Ingredient.ofItems(DTBlocks.GUAIACUM_PLANKS)),
	JOSHUA(MiningLevels.WOOD, 61, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.JOSHUA_PLANKS)),
	KLINKII_PINE(MiningLevels.WOOD, 53, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.KLINKII_PINE_PLANKS)),
	MELALEUCA(MiningLevels.STONE, 153, 2F, 1F, 15, () -> Ingredient.ofItems(DTBlocks.MELALEUCA_PLANKS)),
	MURKANTUAN(MiningLevels.WOOD, 74, 2F, 1F, 15, () -> Ingredient.ofItems(DTBlocks.MURKANTUAN_PLANKS)),
	NORFOLK_PINE(MiningLevels.WOOD, 65, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.NORFOLK_PINE_PLANKS)),
	OBSCRUS(MiningLevels.WOOD, 74, 3F, 1F, 17, () -> Ingredient.ofItems(DTBlocks.OBSCRUS_PLANKS)),
	ORHPRIS(MiningLevels.WOOD, 76, 3F, 1F, 17, () -> Ingredient.ofItems(DTBlocks.ORHPRIS_PLANKS)),
	PELTOGYNE(MiningLevels.STONE, 186, 2F, 2F, 17, () -> Ingredient.ofItems(DTBlocks.PELTOGYNE_PLANKS)),
	PIN_CHERRY(MiningLevels.WOOD, 90, 3F, 1F, 15, () -> Ingredient.ofItems(DTBlocks.PIN_CHERRY_PLANKS)),
	PLUM(MiningLevels.STONE, 155, 3F, 1F, 17, () -> Ingredient.ofItems(DTBlocks.PLUM_PLANKS)),
	PURFUNGA(MiningLevels.WOOD, 39, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.PURFUNGA_PLANKS)),
	RARK(MiningLevels.STONE, 200, 4F, 2F, 30, () -> Ingredient.ofItems(DTBlocks.RARK_PLANKS)),
	RED_ELM(MiningLevels.WOOD, 86, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.RED_ELM_PLANKS)),
	RHADI(MiningLevels.WOOD, 87, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.RHADI_PLANKS)),
	SANGUART(MiningLevels.WOOD, 80, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.SANGUART_PLANKS)),
	SCARLET_THIORCEN(MiningLevels.STONE, 290, 6F, 1F, 15, () -> Ingredient.ofItems(DTBlocks.SCARLET_THIORCEN_PLANKS)),
	SEQUOIA(MiningLevels.STONE, 420, 4F, 2F, 12, () -> Ingredient.ofItems(DTBlocks.SEQUOIA_PLANKS)),
	SPROOM(MiningLevels.STONE, 312, 3F, 2F, 15, () -> Ingredient.ofItems(DTBlocks.SPROOM_PLANKS)),
	STORTREEAN(MiningLevels.WOOD, 153, 20F, 3F, 18, () -> Ingredient.ofItems(DTBlocks.STORTREEAN_PLANKS)),
	STROOMEAN(MiningLevels.WOOD, 46, 3F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.STROOMEAN_PLANKS)),
	SUNRISE_FUNGUS(MiningLevels.WOOD, 69, 2F, 1F, 13, () -> Ingredient.ofItems(DTBlocks.SUNRISE_FUNGUS_PLANKS)),
	TARK(MiningLevels.WOOD, 88, 8F, 2F, 20, () -> Ingredient.ofItems(DTBlocks.TARK_PLANKS)),
	TEAK(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.TEAK_PLANKS)),
	THUNDERCLOUD_PLUM(MiningLevels.WOOD, 155, 6F, 1F, 22, () -> Ingredient.ofItems(DTBlocks.THUNDERCLOUD_PLUM_PLANKS)),
	VYNHERT(MiningLevels.WOOD, 313, 3F, 1F, 16, () -> Ingredient.ofItems(DTBlocks.VYNHERT_PLANKS)),
	WART_TREE(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.WART_TREE_PLANKS)),
	WENGE(MiningLevels.WOOD, 74, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.WENGE_PLANKS)),
	YEW(MiningLevels.STONE, 152, 3F, 1F, 20, () -> Ingredient.ofItems(DTBlocks.YEW_PLANKS));

    private final int miningLevel;
	private final int itemDurability;
	private final float miningSpeed;
	private final float attackDamage;
	private final int enchantability;
	private final Supplier<Ingredient> repairIngredient;

	DTToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
		this.miningLevel = miningLevel;
		this.itemDurability = itemDurability;
		this.miningSpeed = miningSpeed;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairIngredient = repairIngredient;
	}

	@Override
	public int getDurability() {
		return this.itemDurability;
	}

	@Override
	public float getMiningSpeedMultiplier() {
		return this.miningSpeed;
	}

	@Override
	public float getAttackDamage() {
		return this.attackDamage;
	}

	@Override
	public int getMiningLevel() {
		return this.miningLevel;
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairIngredient.get();
	}

}