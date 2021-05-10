package github.KingVampyre.DeepTrenches.common.fluid;

import net.minecraft.entity.LivingEntity;

import java.util.Random;

public interface OxygenatedFluid {

    int getNextAirUnderwater(LivingEntity living, Random random, int air);

}
