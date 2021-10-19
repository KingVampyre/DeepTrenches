package github.KingVampyre.DeepTrenches.core.init;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

import java.util.function.Supplier;

import static net.minecraft.sound.SoundEvents.ITEM_ARMOR_EQUIP_IRON;

public enum DTArmorMaterials implements ArmorMaterial {
    AQUAMARINE(17, new int[] {2, 6, 6, 2}, 15, ITEM_ARMOR_EQUIP_IRON, 1, 1, () -> Ingredient.ofItems(DTItems.AQUAMARINE)),
    BORON(39, new int[] {4, 9, 6, 3}, 9, ITEM_ARMOR_EQUIP_IRON, 4, 1, () -> Ingredient.ofItems(DTItems.BORON_INGOT)),
    CHALCEDONY(24, new int[] {2, 7, 6, 2}, 9, ITEM_ARMOR_EQUIP_IRON, 2, 2, () -> Ingredient.ofItems(DTItems.CHALCEDONY)),
    CLINOHUMITE(19, new int[] {2, 4, 5, 2}, 12, ITEM_ARMOR_EQUIP_IRON, 0, 0, () -> Ingredient.ofItems(DTItems.CLINOHUMITE)),
    DIOPSIDE(37, new int[] {3, 8, 6, 3}, 17, ITEM_ARMOR_EQUIP_IRON, 2, 0, () -> Ingredient.ofItems(DTItems.DIOPSIDE)),
    ENRON(88, new int[] {6, 16, 12, 6}, 18, ITEM_ARMOR_EQUIP_IRON, 0, 0, () -> Ingredient.ofItems(DTItems.ENRON_INGOT)),
    ENSTATITE(30, new int[] {2, 8, 7, 2}, 14, ITEM_ARMOR_EQUIP_IRON, 0, 0, () -> Ingredient.ofItems(DTItems.ENSTATITE)),
    KRALCTIUM(66, new int[] {6, 16, 12, 6}, 20, ITEM_ARMOR_EQUIP_IRON, 6, 4, () -> Ingredient.ofItems(DTItems.KRALCTIUM_INGOT)),
    MORGANITE(32, new int[] {3, 8, 6, 3}, 11, ITEM_ARMOR_EQUIP_IRON, 1, 0, () -> Ingredient.ofItems(DTItems.MORGANITE)),
    RUBY(20, new int[] {3, 7, 5, 3}, 10, ITEM_ARMOR_EQUIP_IRON, 1, 0, () -> Ingredient.ofItems(DTItems.RUBY)),
    SAPPHIRE(22, new int[] {3, 7, 5, 3}, 12, ITEM_ARMOR_EQUIP_IRON, 1, 1, () -> Ingredient.ofItems(DTItems.SAPPHIRE)),
    SILVER(17, new int[] {2, 7, 5, 2}, 20, ITEM_ARMOR_EQUIP_IRON, 1, 0, () -> Ingredient.ofItems(DTItems.SILVER_INGOT)),
    SPHENE(42, new int[] {2, 6, 7, 2}, 20, ITEM_ARMOR_EQUIP_IRON, 0, 3, () -> Ingredient.ofItems(DTItems.SPHENE)),
    SPINEL(23, new int[] {2, 7, 6, 2}, 18, ITEM_ARMOR_EQUIP_IRON, 2, 1, () -> Ingredient.ofItems(DTItems.SPINEL)),
    STROXITE(23, new int[] {2, 7, 6, 2}, 18, ITEM_ARMOR_EQUIP_IRON, 2, 1, () -> Ingredient.ofItems(DTItems.STROXITE_INGOT)),
    TANZANITE(31, new int[] {3, 8, 6, 3}, 22, ITEM_ARMOR_EQUIP_IRON, 2, 2, () -> Ingredient.ofItems(DTItems.TANZANITE)),
    TOPAZ(22, new int[] {2, 7, 6, 2}, 18, ITEM_ARMOR_EQUIP_IRON, 0, 0, () -> Ingredient.ofItems(DTItems.TOPAZ)),
    VOID_CRITTERED_DIOPSIDE(40, new int[] {3, 8, 6, 3}, 17, ITEM_ARMOR_EQUIP_IRON, 4, 10, () -> Ingredient.ofItems(DTItems.VOID_CRITTERED_DIOPSIDE))
    ;

    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};

    private final SoundEvent equipSound;
    private final Supplier<Ingredient> ingredient;

    private final int durabilityMultiplier;
    private final int enchantability;
    private final float knockbackResistance;
    private final int[] protectionAmounts;
    private final float toughness;

    DTArmorMaterials(int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> ingredient) {
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.ingredient = ingredient;
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    @Override
    public String getName() {
        return this.name().toLowerCase();
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.ingredient.get();
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

}