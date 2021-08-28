package github.KingVampyre.DeepTrenches.core.item;

import github.KingVampyre.DeepTrenches.core.entity.AdaiggerEntity;
import github.KingVampyre.DeepTrenches.core.util.ModEnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.stat.Stats;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class AdaiggerItem extends SwordItem {

	public AdaiggerItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
		super(toolMaterial, attackDamage, attackSpeed, settings);
	}

	@Override
	public int getMaxUseTime(ItemStack stack) {
		return 72000;
	}

	@Override
	public UseAction getUseAction(ItemStack stack) {
		return UseAction.BOW;
	}

	@Override
	public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {

		if (user instanceof PlayerEntity player) {
			var duration = this.getMaxUseTime(stack) - remainingUseTicks;

			if (duration >= 10 && !world.isClient) {
				stack.damage(1, player, playerIn -> playerIn.sendToolBreakStatus(user.getActiveHand()));

				var adaigger = new AdaiggerEntity(world, player, stack);

				adaigger.setProperties(player, player.getPitch(), player.getYaw(), 0, 3, 1);

				if (player.isCreative())
					adaigger.pickupType = PersistentProjectileEntity.PickupPermission.CREATIVE_ONLY;

				world.spawnEntity(adaigger);

				if (!player.isCreative())
					player.getInventory().removeOne(stack);
			}

			player.incrementStat(Stats.USED.getOrCreateStat(this));
		}

	}


	@Override
	public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		ModEnchantmentHelper.applySoulDraining(attacker, target, stack);

		return super.postHit(stack, target, attacker);
	}

}
