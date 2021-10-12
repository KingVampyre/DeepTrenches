package github.KingVampyre.DeepTrenches.core.util.world.gen.feature;

import java.util.Random;

@FunctionalInterface
public interface FoliagePositionPredicate {

    FoliagePositionPredicate ALWAYS_TRUE = (random, dx, y, dz, radius, giantTrunk) -> true;

    FoliagePositionPredicate NOT_CORNER = (random, dx, y, dz, radius, giantTrunk) -> {
        var absDx = Math.abs(dx);
        var absDz = Math.abs(dz);

        if (giantTrunk) {
            var minDx = Math.min(absDx, Math.abs(dx - 1));
            var minDz = Math.min(absDz, Math.abs(dz - 1));

            return !(minDx == radius && minDz == radius);
        }

        return !(absDx == radius && absDz == radius);
    };

    boolean isValidForLeaves(Random random, int dx, int y, int dz, int radius, boolean giantTrunk);

}
