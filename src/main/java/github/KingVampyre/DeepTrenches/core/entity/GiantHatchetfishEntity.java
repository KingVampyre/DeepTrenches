package github.KingVampyre.DeepTrenches.core.entity;

import com.google.common.collect.ImmutableList;
import github.KingVampyre.DeepTrenches.common.entity.HatchetfishEntity;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.LightState;
import github.KingVampyre.DeepTrenches.core.init.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

import static github.KingVampyre.DeepTrenches.core.init.AttributeModifiers.MOVEMENT_SPEED_BOOST_150;
import static github.KingVampyre.DeepTrenches.core.init.LightStates.*;

public class GiantHatchetfishEntity extends HatchetfishEntity {

	private static final ImmutableList<LightState> CONTAINER = ImmutableList.of(ALL_LIT);

	public GiantHatchetfishEntity(EntityType<? extends GiantHatchetfishEntity> type, World world) {
		super(type, world);
	}

	@Override
	public ItemStack getBucketItem() {
		return new ItemStack(ModItems.GIANT_HATCHETFISH_BUCKET);
	}

	@Override
	public ImmutableList<LightState> getLightStates() {
		return CONTAINER;
	}

	@Override
	protected SoundEvent getFlopSound() {
		return SoundEvents.ENTITY_SALMON_FLOP;
	}

	@Override
    public EntityAttributeModifier getSpeedModifier() {
		return MOVEMENT_SPEED_BOOST_150;
	}

}
