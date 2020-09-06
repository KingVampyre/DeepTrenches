package github.KingVampyre.DeepTrenches.core.entity;

import static github.KingVampyre.DeepTrenches.core.init.EntityTypes.ADAIGGER;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.world.World;

public class AdaiggerEntity extends TridentEntity {

	public AdaiggerEntity(EntityType<? extends AdaiggerEntity> entityType, World world) {
		super(entityType, world);
	}

	@Override
	public EntityType<?> getType() {
		return ADAIGGER;
	}

}
