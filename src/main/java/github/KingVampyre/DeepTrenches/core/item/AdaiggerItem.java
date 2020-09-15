package github.KingVampyre.DeepTrenches.core.item;

import github.KingVampyre.DeepTrenches.core.entity.AdaiggerEntity;
import github.KingVampyre.DeepTrenches.core.util.ModEnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.stat.Stats;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

import static github.KingVampyre.DeepTrenches.core.init.ModToolMaterials.GYLDELION;

public class AdaiggerItem extends SwordItem {

	public AdaiggerItem(Settings settings) {
		super(GYLDELION, 4, 4, settings);
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

		if (user instanceof PlayerEntity) {
			PlayerEntity player = (PlayerEntity) user;
			int duration = this.getMaxUseTime(stack) - remainingUseTicks;

			if (duration >= 10 && !world.isClient) {
				stack.damage(1, player, playerIn -> playerIn.sendToolBreakStatus(user.getActiveHand()));

				AdaiggerEntity adaigger = new AdaiggerEntity(world, player, stack);

				adaigger.setProperties(player, player.pitch, player.yaw, 0, 3, 1);

				if (player.abilities.creativeMode)
					adaigger.pickupType = PersistentProjectileEntity.PickupPermission.CREATIVE_ONLY;

				world.spawnEntity(adaigger);

				if (!player.abilities.creativeMode)
					player.inventory.removeOne(stack);
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
