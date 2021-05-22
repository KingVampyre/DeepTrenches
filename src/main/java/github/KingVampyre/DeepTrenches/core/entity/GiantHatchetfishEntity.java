package github.KingVampyre.DeepTrenches.core.entity;

import com.google.common.collect.ImmutableList;
import github.KingVampyre.DeepTrenches.common.entity.HatchetfishEntity;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.LightState;
import github.KingVampyre.DeepTrenches.core.init.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;

import static github.KingVampyre.DeepTrenches.core.init.AttributeModifiers.MOVEMENT_SPEED_BOOST_150;
import static github.KingVampyre.DeepTrenches.core.init.LightStates.*;

public class GiantHatchetfishEntity extends HatchetfishEntity {

	public GiantHatchetfishEntity(EntityType<? extends GiantHatchetfishEntity> type, World world) {
		super(type, world);
	}

	@Override
	protected ItemStack getFishBucketItem() {
		return new ItemStack(ModItems.GIANT_HATCHETFISH_BUCKET);
	}

	@Override
	public ImmutableList<LightState> getLightContainer() {
		return ImmutableList.of(ALL_LIT, ALL_UNLIT);
	}

	@Override
	protected SoundEvent getFlopSound() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public EntityAttributeModifier getSpeedModifier() {
		return MOVEMENT_SPEED_BOOST_150;
	}

}
