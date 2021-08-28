package github.KingVampyre.DeepTrenches.core.item;

import net.minecraft.item.ItemStack;
import net.minecraft.item.RangedWeaponItem;

import java.util.function.Predicate;

public class StaffItem extends RangedWeaponItem {

    public StaffItem(Settings settings) {
        super(settings);
    }

    @Override
    public Predicate<ItemStack> getProjectiles() {
        return null;
    }

    @Override
    public int getRange() {
        return 0;
    }

}