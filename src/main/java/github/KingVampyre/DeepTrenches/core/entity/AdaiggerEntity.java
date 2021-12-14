package github.KingVampyre.DeepTrenches.core.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import static github.KingVampyre.DeepTrenches.core.init.entity.DTEntityTypes.ADAIGGER;

public class AdaiggerEntity extends TridentEntity {

	public AdaiggerEntity(EntityType<? extends AdaiggerEntity> entityType, World world) {
		super(entityType, world);
	}

	public AdaiggerEntity(World world, LivingEntity owner, ItemStack stack) {
		super(world, owner, stack);
	}

	@Override
	public EntityType<?> getType() {
		return ADAIGGER;
	}

}
