package github.KingVampyre.DeepTrenches.core.entity;

import com.google.common.collect.ImmutableList;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.LightState;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Luminous;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.WaterCreatureEntity;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class CetachsalEntity extends WaterCreatureEntity implements IAnimatable, Luminous {

    public CetachsalEntity(EntityType<? extends CetachsalEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public ImmutableList<LightState> getLightContainer() {
        return null;
    }

    @Override
    public int getLightStateIndex() {
        return 0;
    }

    @Override
    public void setLightState(LightState state) {

    }

    @Override
    public void registerControllers(AnimationData data) {

    }

    @Override
    public AnimationFactory getFactory() {
        return null;
    }

}