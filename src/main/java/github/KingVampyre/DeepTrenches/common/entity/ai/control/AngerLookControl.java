package github.KingVampyre.DeepTrenches.common.entity.ai.control;

import net.minecraft.entity.ai.control.LookControl;
import net.minecraft.entity.mob.Angerable;
import net.minecraft.entity.mob.MobEntity;

public class AngerLookControl<T extends MobEntity & Angerable> extends LookControl {

    public AngerLookControl(MobEntity mob) {
        super(mob);
    }

    @Override
    public void tick() {
        Angerable angerable = (Angerable) this.entity;

        if(!angerable.isUniversallyAngry(this.entity.world))
            super.tick();
    }

}
