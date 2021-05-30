package github.KingVampyre.DeepTrenches.core.entity;

import github.KingVampyre.DeepTrenches.common.entity.FlyingBugEntity;
import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

public class FlyEntity extends FlyingBugEntity {

    public FlyEntity(EntityType<? extends FlyingBugEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected <E extends IAnimatable> PlayState getMovementAnimation(AnimationEvent<E> event) {

        if(this.isEating())
            event.getController().setAnimation(new AnimationBuilder().addAnimation("eating"));

        return super.getMovementAnimation(event);
    }

    public boolean isEating() {
        return false;
    }

    @Nullable
    @Override
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, @Nullable EntityData entityData, @Nullable NbtCompound entityNbt) {
        this.setVariant(this.random.nextInt(4));

        return super.initialize(world, difficulty, spawnReason, entityData, entityNbt);
    }

}
