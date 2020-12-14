package github.KingVampyre.DeepTrenches.common.component.animal;

import com.google.common.collect.Sets;
import github.KingVampyre.DeepTrenches.core.init.Components;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static github.KingVampyre.DeepTrenches.common.component.ComponentSyncOperations.*;

public class SchoolingAnimalComponent extends WildAnimalComponent implements SchoolingComponent {

    protected final int maxSchoolSize;

    protected SchoolingComponent schoolLeader;
    protected Set<SchoolingComponent> schoolMembers;

    public SchoolingAnimalComponent(MobEntity mob, Ingredient breedItems, int maxSchoolSize) {
        super(mob, breedItems);

        this.maxSchoolSize = maxSchoolSize;
        this.schoolMembers = Sets.newHashSet();
    }

    @Override
    public int getMaxSchoolSize() {
        return this.maxSchoolSize;
    }

    @Override
    public Set<SchoolingComponent> getSchoolMembers() {
        return this.schoolMembers;
    }

    @Override
    public SchoolingComponent getSchoolLeader() {
        return this.schoolLeader;
    }

    @Override
    public int getSchoolSize() {
        return this.schoolMembers.size();
    }

    @Override
    public void joinSchoolOf(SchoolingComponent schoolLeader) {
        this.setSchoolLeader(schoolLeader);

        this.schoolLeader.getSchoolMembers().add(this);
    }

    @Override
    public void setSchoolMembers(Set<SchoolingComponent> schoolMembers) {
        this.schoolMembers = schoolMembers;
    }

    @Override
    public void setSchoolLeader(SchoolingComponent schoolLeader) {
        this.schoolLeader = schoolLeader;
    }

    @Override
    public void pullIn(Stream<SchoolingComponent> school) {
        school.limit(this.maxSchoolSize - this.schoolMembers.size())
                .filter(schooling -> schooling != this)
                .forEach(schooling -> schooling.joinSchoolOf(this));
    }

    @Override
    public void readFromNbt(CompoundTag tag) {
        super.readFromNbt(tag);

        this.schoolingFromTag(this.mob.world, tag);
    }

    @Override
    public void writeToNbt(CompoundTag tag) {
        super.writeToNbt(tag);

        this.schoolingToTag(tag);
    }

    @Override
    public void applySyncPacket(PacketByteBuf buf, int syncOp) {
        World world = this.mob.getEntityWorld();

        switch (syncOp) {
            case SET_SCHOOL_LEADER:
                Entity entity = world.getEntityById(buf.readInt());

                this.schoolLeader = Components.SCHOOLING.maybeGet(entity).orElseThrow();
                break;
            case SET_SCHOOL_MEMBERS:
                int[] array = buf.readIntArray();

                this.schoolMembers = Arrays.stream(array)
                        .mapToObj(world::getEntityById)
                        .map(Components.SCHOOLING::maybeGet)
                        .map(Optional::orElseThrow)
                        .collect(Collectors.toSet());
                break;
            default:
                super.applySyncPacket(buf, syncOp);
        }

    }

}
