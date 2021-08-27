package github.KingVampyre.DeepTrenches.core.init;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

import java.util.function.Supplier;

import static net.minecraft.sound.SoundEvents.ITEM_ARMOR_EQUIP_IRON;

public enum DTArmorMaterials implements ArmorMaterial {
    CHALCEDONY(15, new int[] {2, 5, 6, 2}, 9, ITEM_ARMOR_EQUIP_IRON, 0, 0, () -> Ingredient.ofItems(DTItems.CHALCEDONY)),
    ENSTATITE(15, new int[] {2, 5, 6, 2}, 9, ITEM_ARMOR_EQUIP_IRON, 0, 0, () -> Ingredient.ofItems(DTItems.ENSTATITE)),
    MORGANITE(15, new int[] {2, 5, 6, 2}, 9, ITEM_ARMOR_EQUIP_IRON, 0, 0, () -> Ingredient.ofItems(DTItems.MORGANITE)),
    RUBY(15, new int[] {2, 5, 6, 2}, 9, ITEM_ARMOR_EQUIP_IRON, 0, 0, () -> Ingredient.ofItems(DTItems.RUBY)),
    SAPPHIRE(15, new int[] {2, 5, 6, 2}, 9, ITEM_ARMOR_EQUIP_IRON, 0, 0, () -> Ingredient.ofItems(DTItems.SAPPHIRE)),
    SPHENE(15, new int[] {2, 5, 6, 2}, 9, ITEM_ARMOR_EQUIP_IRON, 0, 0, () -> Ingredient.ofItems(DTItems.SPHENE)),
    SPINEL(15, new int[] {2, 5, 6, 2}, 9, ITEM_ARMOR_EQUIP_IRON, 0, 0, () -> Ingredient.ofItems(DTItems.SPINEL)),
    TANZANITE(15, new int[] {2, 5, 6, 2}, 9, ITEM_ARMOR_EQUIP_IRON, 0, 0, () -> Ingredient.ofItems(DTItems.TANZANITE)),
    TOPAZ(15, new int[] {2, 5, 6, 2}, 9, ITEM_ARMOR_EQUIP_IRON, 0, 0, () -> Ingredient.ofItems(DTItems.TOPAZ))
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