package github.KingVampyre.DeepTrenches.common.entity;

import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Variant;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

@Deprecated
public abstract class BugEntity extends PathAwareEntity implements IAnimatable, Variant {

    private static final TrackedData<Integer> VARIANT = DataTracker.registerData(BugEntity.class, TrackedDataHandlerRegistry.INTEGER);

    protected AnimationFactory animationFactory;

    public BugEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);

        this.animationFactory = new AnimationFactory(this);
    }

    @Override
    public int getVariant() {
        return this.dataTracker.get(VARIANT);
    }

    @Override
    public void setVariant(int variant) {
        this.dataTracker.set(VARIANT, variant);
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();

        this.dataTracker.startTracking(VARIANT, 0);
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);

        this.variantFromNbt(nbt);
    }

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);

        this.variantToNbt(nbt);
    }

    @Override
    public AnimationFactory getFactory() {
        return this.animationFactory;
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<>(this, "movementController", 0, this::getMovementAnimation));
    }

    protected abstract <E extends IAnimatable> PlayState getMovementAnimation(AnimationEvent<E> event);

}
