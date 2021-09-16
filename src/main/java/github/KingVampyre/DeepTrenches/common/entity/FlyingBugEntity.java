package github.KingVampyre.DeepTrenches.common.entity;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

import static software.bernie.geckolib3.core.PlayState.CONTINUE;

@Deprecated
public class FlyingBugEntity extends AggressiveBugEntity {

    public FlyingBugEntity(EntityType<? extends AggressiveBugEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void fall(double heightDifference, boolean onGround, BlockState landedState, BlockPos landedPosition) {

    }

    @Override
    protected <E extends IAnimatable> PlayState getMovementAnimation(AnimationEvent<E> event) {
        AnimationController<?> controller = event.getController();

        if(this.isFlying())
            controller.setAnimation(new AnimationBuilder().addAnimation("flying"));
        else if(this.getMoveControl().isMoving())
            controller.setAnimation(new AnimationBuilder().addAnimation("walking"));

        return CONTINUE;
    }

    @Override
    public float getPathfindingFavor(BlockPos pos, WorldView world) {
        return world.isAir(pos) ? 10.0F : 0.0F;
    }

    public boolean isFlying() {
        return !this.onGround;
    }

}