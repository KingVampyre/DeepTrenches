package github.KingVampyre.DeepTrenches.core.util.world.gen.feature;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.TestableWorld;

import java.util.Random;

@FunctionalInterface
public interface PositionPredicate {

    PositionPredicate ALWAYS_TRUE = (world, random, startPos, endPos, pos, dx, dz) -> true;

    PositionPredicate NOT_CORNER = (world, random, startPos, endPos, pos, dx, dz) -> {
        var lengthX = Math.abs(startPos.getX() - endPos.getX()) - 1;
        var lengthZ = Math.abs(startPos.getZ() - endPos.getZ()) - 1;

        if(dx == 0 || dx == lengthX)
            return !(dz == lengthZ || dz == 0);

        return true;
    };

    PositionPredicate CLOCKWISE_SUN = (world, random, startPos, endPos, pos, dx, dz) -> {
        var lengthX = Math.abs(startPos.getX() - endPos.getX()) - 1;
        var lengthZ = Math.abs(startPos.getZ() - endPos.getZ()) - 1;

        var halfLengthX = (lengthX + 1) / 2;
        var halfLengthZ = (lengthZ + 1) / 2;

        if(dx == 0 && dz == halfLengthZ - 1)
            return false;
        else if(dz == 0 && dx == halfLengthX)
            return false;
        else if(dz == halfLengthZ && dx == lengthX)
            return false;
        else if(dz == lengthZ && dx == halfLengthX - 1)
            return false;

        return NOT_CORNER.isValidPosition(world, random, startPos, endPos, pos, dx, dz);
    };

    PositionPredicate COUNTERCLOCKWISE_SUN = (world, random, startPos, endPos, pos, dx, dz) -> {
        var lengthX = Math.abs(startPos.getX() - endPos.getX()) - 1;
        var lengthZ = Math.abs(startPos.getZ() - endPos.getZ()) - 1;

        var halfLengthX = (lengthX + 1) / 2;
        var halfLengthZ = (lengthZ + 1) / 2;

        if(dx == 0 && dz == halfLengthZ)
            return false;
        else if(dz == lengthZ && dx == halfLengthX)
            return false;
        else if(dz == halfLengthZ - 1 && dx == lengthX)
            return false;
        else if(dz == 0 && dx == halfLengthX - 1)
            return false;

        return NOT_CORNER.isValidPosition(world, random, startPos, endPos, pos, dx, dz);
    };

    static PositionPredicate ignore(int ignoreDx, int ignoreDz) {
        return (world, random, startPos, endPos, pos, dx, dz) -> !(dx == ignoreDx && dz == ignoreDz);
    }

    boolean isValidPosition(TestableWorld world, Random random, BlockPos startPos, BlockPos endPos, BlockPos pos, int dx, int dz);

}
