package github.KingVampyre.DeepTrenches.core.init;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum DTToolMaterials implements ToolMaterial {
	/* METALLIC MATERIALS */
	AQUAMARINE(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.AQUAMARINE)),
	BORON(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.BORON_INGOT)),
	CHALCEDONY(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.CHALCEDONY)),
	CLINOHUMITE(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.CLINOHUMITE)),
	DIOPSIDE(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.DIOPSIDE)),
	ENRON(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.ENRON_INGOT)),
	ENSTATITE(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.ENSTATITE)),
	GYLDELION(MiningLevels.WOOD, 32, 12F, 0, 22, () -> Ingredient.ofItems(DTItems.GYLDELION_INGOT)),
	KRALCTIUM(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.KRALCTIUM_INGOT)),
	MORGANITE(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.MORGANITE)),
	RUBY(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.RUBY)),
	SAPPHIRE(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.SAPPHIRE)),
	SILVER(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.SILVER_INGOT)),
	SPHENE(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.SPHENE)),
	SPINEL(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.SPINEL)),
	STROXITE(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.STROXITE_INGOT)),
	TANZANITE(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.TANZANITE)),
	TOPAZ(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.TOPAZ)),
	VOID_CRITTERED_DIOPSIDE(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.VOID_CRITTERED_DIOPSIDE)),
	/* WOOD MATERIALS */
	ALMOND(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.ALMOND_PLANKS)),
	ANAMEATA(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.ANAMEATA_PLANKS)),
	ANGELS_TRUMPET(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.ANGELS_TRUMPET_PLANKS)),
	AQUEAN(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.AQUEAN_PLANKS)),
	BARSHROOKLE(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.BARSHROOKLE_PLANKS)),
	BLACK_BIRCH(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.BLACK_BIRCH_PLANKS)),
	BLUE_MAHOE(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.BLUE_MAHOE_PLANKS)),
	BLUE_SPRUCE(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.BLUE_SPRUCE_PLANKS)),
	BOTTLEBRUSH(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.BOTTLEBRUSH_PLANKS)),
	BROMYA(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.BROMYA_PLANKS)),
	BUBBLETREE(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.BUBBLETREE_PLANKS)),
	CALCEARB(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.CALCEARB_PLANKS)),
	CHERRY(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.CHERRY_PLANKS)),
	CHOTORN(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.CHOTORN_PLANKS)),
	COOK_PINE(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.COOK_PINE_PLANKS)),
	CROLOOD(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.CROLOOD_PLANKS)),
	DARK_CROLOOD(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.DARK_CROLOOD_PLANKS)),
	DARK_FUCHSITRA(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.DARK_FUCHSITRA_PLANKS)),
	DARK_RED_ELM(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.DARK_RED_ELM_PLANKS)),
	DEAD_WART_TREE(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.DEAD_WART_TREE_PLANKS)),
	DRIGYUS(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.DRIGYUS_PLANKS)),
	EBONY(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.EBONY_PLANKS)),
	ENDERHEART(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.ENDERHEART_PLANKS)),
	FLALM(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.FLALM_PLANKS)),
	FRUCE(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.FRUCE_PLANKS)),
	FUCHSITRA(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.FUCHSITRA_PLANKS)),
	FUGMOS(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.FUGMOS_PLANKS)),
	FUNERANITE(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.FUNERANITE_PLANKS)),
	GHOSHROOM(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.GHOSHROOM_PLANKS)),
	GIANT_VIOLET(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.GIANT_VIOLET_PLANKS)),
	GUAIACUM(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.GUAIACUM_PLANKS)),
	JOSHUA(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.JOSHUA_PLANKS)),
	KLINKII_PINE(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.KLINKII_PINE_PLANKS)),
	MELALEUCA(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.MELALEUCA_PLANKS)),
	MURKANTUAN(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.MURKANTUAN_PLANKS)),
	NORFOLK_PINE(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.NORFOLK_PINE_PLANKS)),
	OBSCRUS(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.OBSCRUS_PLANKS)),
	ORHPRIS(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.ORHPRIS_PLANKS)),
	PELTOGYNE(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.PELTOGYNE_PLANKS)),
	PIN_CHERRY(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.PIN_CHERRY_PLANKS)),
	PLUM(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.PLUM_PLANKS)),
	PURFUNGA(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.PURFUNGA_PLANKS)),
	RARK(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.RARK_PLANKS)),
	RED_ELM(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.RED_ELM_PLANKS)),
	RHADI(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.RHADI_PLANKS)),
	SANGUART(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.SANGUART_PLANKS)),
	SCARLET_THIORCEN(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.SCARLET_THIORCEN_PLANKS)),
	SEQUOIA(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.SEQUOIA_PLANKS)),
	SPROOM(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.SPROOM_PLANKS)),
	STORTREEAN(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.STORTREEAN_PLANKS)),
	STROOMEAN(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.STROOMEAN_PLANKS)),
	SUNRISE_FUNGUS(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.SUNRISE_FUNGUS_PLANKS)),
	TARK(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.TARK_PLANKS)),
	TEAK(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.TEAK_PLANKS)),
	THUNDERCLOUD_PLUM(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.THUNDERCLOUD_PLUM_PLANKS)),
	VYNHERT(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.VYNHERT_PLANKS)),
	WART_TREE(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.WART_TREE_PLANKS)),
	WENGE(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.WENGE_PLANKS)),
	YEW(MiningLevels.WOOD, 59, 2F, 0F, 15, () -> Ingredient.ofItems(DTBlocks.YEW_PLANKS));

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