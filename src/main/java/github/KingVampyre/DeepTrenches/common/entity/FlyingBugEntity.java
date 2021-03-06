package github.KingVampyre.DeepTrenches.common.entity;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

public class FlyingBugEntity extends AngryBugEntity {

    public FlyingBugEntity(EntityType<? extends AngryBugEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void fall(double heightDifference, boolean onGround, BlockState landedState, BlockPos landedPosition) {

    }

    @Override
    protected <E extends IAnimatable> PlayState getMovementAnimation(AnimationEvent<E> event) {
        AnimationController<?> controller = event.getController();

        if(this.isInAir())
            controller.setAnimation(new AnimationBuilder().addAnimation("flying"));
        else if(this.getMoveControl().isMoving())
            controller.setAnimation(new AnimationBuilder().addAnimation("walking"));

        return PlayState.CONTINUE;
    }

    @Override
    public float getPathfindingFavor(BlockPos pos, WorldView world) {
        BlockState state = world.getBlockState(pos);

        return state.isAir() ? 10.0F : 0.0F;
    }

    @Override
    public boolean handleFallDamage(float fallDistance, float damageMultiplier, DamageSource damageSource) {
        return super.handleFallDamage(fallDistance, damageMultiplier, damageSource);
    }

    public boolean isInAir() {
        return !this.onGround;
    }

}