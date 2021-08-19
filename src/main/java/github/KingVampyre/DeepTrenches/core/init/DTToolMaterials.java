package github.KingVampyre.DeepTrenches.core.init;

import static github.KingVampyre.DeepTrenches.core.init.DTItems.GYLDELION_INGOT;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class DTToolMaterials {

	public static final ToolMaterial GYLDELION = new ToolMaterial() {

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.ofItems(GYLDELION_INGOT);
		}

		@Override
		public int getMiningLevel() {
			return 0;
		}

		@Override
		public int getEnchantability() {
			return 22;
		}

		@Override
		public int getDurability() {
			return 32;
		}

		@Override
		public float getAttackDamage() {
			return 0;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 12;
		}
	};

}
