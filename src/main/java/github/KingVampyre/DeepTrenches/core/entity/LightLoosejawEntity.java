package github.KingVampyre.DeepTrenches.core.entity;

import github.KingVampyre.DeepTrenches.common.component.animal.TamableAnimalComponent;
import github.KingVampyre.DeepTrenches.common.entity.DragonfishEntity;
import github.KingVampyre.DeepTrenches.common.entity.ai.goal.TamedAnimalMateGoal;
import github.KingVampyre.DeepTrenches.common.entity.ai.goal.UnderwaterFollowOwnerGoal;
import github.KingVampyre.DeepTrenches.core.init.Components;
import github.KingVampyre.DeepTrenches.core.init.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.Durations;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.IntRange;
import net.minecraft.world.World;

import static github.KingVampyre.DeepTrenches.core.init.AttributeModifiers.MOVEMENT_SPEED_BOOST_215;

public class LightLoosejawEntity extends DragonfishEntity {

    protected static final IntRange ANGER_TIME_RANGE = Durations.betweenSeconds(20, 25);

    public LightLoosejawEntity(EntityType<? extends LightLoosejawEntity> type, World world) {
        super(type, world);
    }

    @Override
    protected IntRange getAngerTimeRange() {
        return ANGER_TIME_RANGE;
    }

    @Override
    protected ItemStack getFishBucketItem() {
        return new ItemStack(ModItems.LIGHT_LOOSEJAW_BUCKET);
    }

    @Override
    protected SoundEvent getFlopSound() {
        // TODO Light Loosejaw flop
        return SoundEvents.ENTITY_COD_FLOP;
    }

    @Override
    protected EntityAttributeModifier getSpeedModifier() {
        return MOVEMENT_SPEED_BOOST_215;
    }

    @Override
    protected void initGoals() {
        super.initGoals();

        TamableAnimalComponent tamable = (TamableAnimalComponent) Components.ANIMAL.get(this);
        double speed = this.getAttributeValue(EntityAttributes.GENERIC_MOVEMENT_SPEED);

        this.goalSelector.add(3, new TamedAnimalMateGoal(this, tamable, 1.0F, 8.0F, 3.0F, 6000, -24000, 60));
        this.goalSelector.add(3, new UnderwaterFollowOwnerGoal(this, tamable, speed, 12.0F, 4.0F, 2.0F, false));
    }

}
