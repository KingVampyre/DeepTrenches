package github.KingVampyre.DeepTrenches.common.item;

import static net.minecraft.stat.Stats.USED;
import static net.minecraft.util.ActionResult.FAIL;
import static net.minecraft.util.ActionResult.PASS;
import static net.minecraft.util.ActionResult.SUCCESS;
import static net.minecraft.util.hit.HitResult.Type.BLOCK;
import static net.minecraft.util.hit.HitResult.Type.MISS;

import java.util.List;
import java.util.function.Predicate;

import github.KingVampyre.DeepTrenches.common.entity.ModBoatEntity;
import github.KingVampyre.DeepTrenches.core.init.WoodType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BoatItem;
import net.minecraft.item.ItemStack;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;

public class ModBoatItem extends BoatItem {

	protected static final Predicate<Entity> RIDERS = EntityPredicates.EXCEPT_SPECTATOR.and(Entity::collides);
	protected WoodType woodType;

	public ModBoatItem(WoodType woodType, Settings settings) {
		super(null, settings);
		
		this.woodType = woodType;
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		ItemStack itemStack = user.getStackInHand(hand);
		HitResult hitResult = raycast(world, user, RaycastContext.FluidHandling.ANY);

		if (hitResult.getType() == MISS)
			return new TypedActionResult<ItemStack>(PASS, itemStack);

		Vec3d vec3d = user.getRotationVec(1.0F);
		Box searchBox = user.getBoundingBox().stretch(vec3d.multiply(5)).expand(1);
		
		List<Entity> list = world.getOtherEntities(user, searchBox, RIDERS);

		if (!list.isEmpty()) {
			Vec3d camera = user.getCameraPosVec(1.0F);

			for (Entity entity : list) {
				Box box = entity.getBoundingBox().expand(entity.getTargetingMargin());

				if (box.contains(camera))
					return new TypedActionResult<ItemStack>(PASS, itemStack);
			}

		}

		if (hitResult.getType() == BLOCK) {
			Vec3d pos = hitResult.getPos();

			ModBoatEntity boatEntity = new ModBoatEntity(world, pos.x, pos.y, pos.z);

			boatEntity.setWoodType(this.woodType);
			boatEntity.yaw = user.yaw;

			if (!world.isSpaceEmpty(boatEntity, boatEntity.getBoundingBox().expand(-0.1D)))
				return new TypedActionResult<ItemStack>(FAIL, itemStack);
			else {
				if (!world.isClient)
					world.spawnEntity(boatEntity);

				if (!user.abilities.creativeMode)
					itemStack.decrement(1);

				user.incrementStat(USED.getOrCreateStat(this));

				return new TypedActionResult<ItemStack>(SUCCESS, itemStack);
			}
		} else {
			return new TypedActionResult<ItemStack>(PASS, itemStack);
		}

	}

}
