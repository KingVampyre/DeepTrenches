package github.KingVampyre.DeepTrenches.core.init;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum DTToolMaterials implements ToolMaterial {
	CHALCEDONY(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.CHALCEDONY)),
	ENSTATITE(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.ENSTATITE)),
	GYLDELION(MiningLevels.WOOD, 32, 12F, 0, 22, () -> Ingredient.ofItems(DTItems.GYLDELION_INGOT)),
	KRALCTIUM(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.KRALCTIUM)),
	MORGANITE(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.MORGANITE)),
	RUBY(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.RUBY)),
	SPHENE(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.SPHENE)),
	SPINEL(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.SPINEL)),
	STROXITE(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.STROXITE_INGOT)),
	TANZANITE(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.TANZANITE)),
	TOPAZ(MiningLevels.IRON, 250, 6F, 2F, 14, () -> Ingredient.ofItems(DTItems.TOPAZ));

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