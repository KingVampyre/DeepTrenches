package github.KingVampyre.DeepTrenches.common.component.animal;

import dev.onyxstudios.cca.api.v3.component.sync.AutoSyncedComponent;
import github.KingVampyre.DeepTrenches.core.init.Components;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface SchoolingComponent extends AutoSyncedComponent {

    int getMaxSchoolSize();

    Set<SchoolingComponent> getSchoolMembers();

    MobEntity getMob();

    SchoolingComponent getSchoolLeader();

    int getSchoolSize();

    default boolean hasSchoolLeader() {
        return this.getSchoolLeader() != null;
    }

    default boolean isAlone() {
        return !this.hasSchoolLeader();
    }

    default boolean isSchoolLeader() {
        return this.hasSchoolLeader() && this.getSchoolLeader().getMob() == this.getMob();
    }

    void joinSchoolOf(SchoolingComponent schoolLeader);

    void setSchoolMembers(Set<SchoolingComponent> schoolMembers);

    void setSchoolLeader(SchoolingComponent schoolLeader);

    void pullIn(Stream<SchoolingComponent> school);

    default void schoolingToTag(CompoundTag tag) {
        Set<SchoolingComponent> schoolMembers = this.getSchoolMembers();

        if(this.hasSchoolLeader())
            tag.putInt("SchoolLeader", this.getSchoolLeader().getMob().getEntityId());

        if(!schoolMembers.isEmpty()) {
            int[] members = schoolMembers.stream()
                    .map(SchoolingComponent::getMob)
                    .mapToInt(MobEntity::getEntityId)
                    .toArray();

            tag.putIntArray("SchoolMembers", members);
        }

    }

    default void schoolingFromTag(World world, CompoundTag tag) {

        if(tag.contains("SchoolLeader")) {
            Entity entity = world.getEntityById(tag.getInt("SchoolLeader"));
            SchoolingComponent schoolLeader = Components.SCHOOLING.maybeGet(entity).orElseThrow();

            this.setSchoolLeader(schoolLeader);
        }

        if(tag.contains("SchoolMembers")) {
            Set<SchoolingComponent> schoolMembers = Arrays.stream(tag.getIntArray("SchoolMembers"))
                    .mapToObj(world::getEntityById)
                    .map(Components.SCHOOLING::maybeGet)
                    .map(Optional::orElseThrow)
                    .collect(Collectors.toSet());

            this.setSchoolMembers(schoolMembers);
        }

    }

}
