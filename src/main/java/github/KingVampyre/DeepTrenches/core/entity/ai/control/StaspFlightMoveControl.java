package github.KingVampyre.DeepTrenches.core.entity.ai.control;

import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.control.FlightMoveControl;
import net.minecraft.entity.ai.control.MoveControl;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import static net.minecraft.entity.attribute.EntityAttributes.*;

public class StaspFlightMoveControl extends FlightMoveControl {

    protected int maxPitchChange;
    protected float maxYawChange;

    public StaspFlightMoveControl(StaspEntity stasp, int maxPitchChange, float maxYawChange, boolean noGravity) {
        super(stasp, maxPitchChange, noGravity);

        this.maxPitchChange = maxPitchChange;
        this.maxYawChange = maxYawChange;
    }

    @Override
    public void tick() {
        StaspEntity stasp = (StaspEntity) this.entity;

        if (this.state == MoveControl.State.MOVE_TO) {
            this.state = MoveControl.State.WAIT;

            stasp.setNoGravity(true);

            float dx = (float) (this.targetX - stasp.getX());
            float dy = (float) (this.targetY - stasp.getY());
            float dz = (float) (this.targetZ - stasp.getZ());

            double area = dx * dx + dy * dy + dz * dz;

            if (area < 2.500000277905201E-7D) {
                stasp.setUpwardSpeed(0.0F);
                stasp.setForwardSpeed(0.0F);

                return;
            }

            float speed = (float) (this.speed * (this.entity.isOnGround() ? this.entity.getAttributeValue(GENERIC_MOVEMENT_SPEED) : this.entity.getAttributeValue(GENERIC_FLYING_SPEED)));

            LivingEntity target = stasp.getTarget();

            if (!stasp.isUniversallyAngry(this.entity.world)) {
                BlockPos pos = stasp.getNavigation().getTargetPos();

                double adx = pos.getX() - stasp.getX();
                double adz = pos.getZ() - stasp.getZ();

                float angle = (float) (MathHelper.atan2(adx, adz) * 57.2957763671875D) - this.maxYawChange;
                float yaw = -this.wrapDegrees(this.entity.getYaw(), angle, this.maxYawChange);

                this.entity.setYaw(yaw);

            } else if (target != null) {
                double adx = target.getX() - stasp.getX();
                double adz = target.getZ() - stasp.getZ();

                float angle = (float) (MathHelper.atan2(adx, adz) * 57.2957763671875D) - this.maxYawChange;
                float yaw = -this.wrapDegrees(this.entity.getPitch(), angle, this.maxYawChange);

                this.entity.setYaw(yaw);
            }

            this.entity.setMovementSpeed(speed);

            double sqrt = MathHelper.sqrt(dx * dx + dz * dz);
            float angle = (float) (MathHelper.atan2(dy, sqrt) * 57.2957763671875D);

            float pitch = this.wrapDegrees(this.entity.getPitch(), angle, this.maxPitchChange);

            this.entity.setPitch(pitch);
            this.entity.setUpwardSpeed(dy > 0.0D ? speed : -speed);

        } else {
            stasp.setNoGravity(false);
            stasp.setUpwardSpeed(0.0F);
            stasp.setForwardSpeed(0.0F);
        }

    }
}
