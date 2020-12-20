package github.KingVampyre.DeepTrenches.core.entity;

import github.KingVampyre.DeepTrenches.common.entity.DragonfishEntity;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Lovable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.Durations;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.IntRange;
import net.minecraft.world.World;

import static github.KingVampyre.DeepTrenches.core.init.AttributeModifiers.MOVEMENT_SPEED_BOOST_215;
import static github.KingVampyre.DeepTrenches.core.init.ModItems.LIGHT_LOOSEJAW_BUCKET;
import static net.minecraft.item.Items.COD;

public class LightLoosejawEntity extends DragonfishEntity {

    protected static final IntRange ANGER_TIME_RANGE = Durations.betweenSeconds(20, 25);

    public LightLoosejawEntity(EntityType<? extends LightLoosejawEntity> type, World world) {
        super(type, world);
    }

    @Override
    public boolean canAttackWithOwner(LivingEntity target, LivingEntity owner) {
        return true;
    }

    @Override
    public Entity createChild(ServerWorld world, Lovable lovable) {
        LightLoosejawEntity loosejaw = (LightLoosejawEntity) this.getType().create(world);

        if(loosejaw != null) {
            PlayerEntity player = lovable.getLovingPlayer();

            loosejaw.setTamedBy(player);
        }

        return loosejaw;
    }

    @Override
    public ExperienceOrbEntity createExperienceOrb(ServerWorld server, double x, double y, double z) {
        return new ExperienceOrbEntity(server, x, y, z, this.random.nextInt(7) + 1);
    }

    @Override
    protected IntRange getAngerTimeRange() {
        return ANGER_TIME_RANGE;
    }

    @Override
    protected ItemStack getFishBucketItem() {
        return new ItemStack(LIGHT_LOOSEJAW_BUCKET);
    }

    @Override
    protected SoundEvent getFlopSound() {
        // TODO Light Loosejaw flop
        return SoundEvents.ENTITY_COD_FLOP;
    }

    @Override
    public EntityAttributeModifier getSpeedModifier() {
        return MOVEMENT_SPEED_BOOST_215;
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return stack.getItem() == COD;
    }

    @Override
    public boolean isTameItem(ItemStack stack) {
        return stack.getItem() == COD;
    }

    @Override
    public void setBaby(boolean baby) {
        this.setBreedingAge(baby ? -36000 : 0);
    }

}
