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

public class SchoolingAnimalComponent extends WildAnimalComponent {

    public static final int SET_SCHOOL_MEMBERS = 7;
    public static final int SET_SCHOOL_LEADER = 8;

    protected final int maxSchoolSize;

    protected SchoolingAnimalComponent schoolLeader;
    protected Set<SchoolingAnimalComponent> schoolMembers;

    public SchoolingAnimalComponent(MobEntity mob, Ingredient breedItems, int maxSchoolSize) {
        super(mob, breedItems);

        this.maxSchoolSize = maxSchoolSize;
        this.schoolMembers = Sets.newHashSet();
    }

    public MobEntity getGroupLeader() {
        return this.schoolLeader.mob;
    }

    public int getSchoolSize() {
        return this.hasSchoolLeader() ? this.schoolLeader.schoolMembers.size() : 1;
    }

    public int getMaxSchoolSize() {
        return this.maxSchoolSize;
    }

    public boolean hasSchoolLeader() {
        return this.schoolLeader != null;
    }

    public boolean isCloseEnoughToLeader() {
        return this.mob.squaredDistanceTo(this.schoolLeader.mob) <= 121.0D;
    }

    public boolean isAlone() {
        return !this.hasSchoolLeader();
    }

    public boolean isSchoolLeader() {
        return this.schoolLeader.mob == this.mob;
    }

    public void joinSchoolOf(SchoolingAnimalComponent schoolLeader) {
        this.schoolLeader = schoolLeader;
        this.schoolLeader.schoolMembers.add(this);
    }

    public void pullIn(Stream<SchoolingAnimalComponent> fish) {
        int limit = this.maxSchoolSize - this.schoolMembers.size();

        fish.limit(limit).filter(schooling -> schooling != this).forEach(schooling -> schooling.joinSchoolOf(this));
    }

    @Override
    public void readFromPacket(PacketByteBuf buf, int syncOp) {
        World world = this.mob.getEntityWorld();

        switch (syncOp) {
            case SET_SCHOOL_LEADER:
                int id = buf.readInt();
                Entity entity = world.getEntityById(id);

                this.schoolLeader = Components.ANIMAL.maybeGet(entity).map(SchoolingAnimalComponent.class::cast).get();
                break;
            case SET_SCHOOL_MEMBERS:
                int[] array = buf.readIntArray();

                this.schoolMembers = Arrays.stream(array)
                        .mapToObj(world::getEntityById)
                        .map(Components.ANIMAL::maybeGet)
                        .filter(Optional::isPresent)
                        .map(Optional::get)
                        .map(SchoolingAnimalComponent.class::cast)
                        .collect(Collectors.toSet());
                break;
        }

    }

    @Override
    public void readFromNbt(CompoundTag compoundTag) {
        super.readFromNbt(compoundTag);

        World world = this.mob.getEntityWorld();

        int schoolLeaderId = compoundTag.getInt("SchoolLeader");
        Entity entity = world.getEntityById(schoolLeaderId);

        this.schoolLeader = Components.ANIMAL.maybeGet(entity).map(SchoolingAnimalComponent.class::cast).get();
        this.schoolMembers = Arrays.stream(compoundTag.getIntArray("SchoolMembers"))
                .mapToObj(world::getEntityById)
                .map(Components.ANIMAL::maybeGet)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .map(SchoolingAnimalComponent.class::cast)
                .collect(Collectors.toSet());

    }

    @Override
    public void writeToPacket(PacketByteBuf buf, ServerPlayerEntity recipient, int syncOp) {

        switch (syncOp) {
            case SET_SCHOOL_LEADER:
                buf.writeInt(syncOp);
                buf.writeInt(this.schoolLeader.mob.getEntityId());
                break;
            case SET_SCHOOL_MEMBERS:
                buf.writeInt(syncOp);
                int[] members = this.schoolMembers.stream()
                        .map(AnimalComponent::getMob)
                        .mapToInt(MobEntity::getEntityId)
                        .toArray();

                buf.writeIntArray(members);
                break;
            default:
                super.writeToPacket(buf, recipient, syncOp);
        }

    }

    @Override
    public void writeToNbt(CompoundTag compoundTag) {
        super.writeToNbt(compoundTag);

        compoundTag.putInt("SchoolLeader", this.schoolLeader.mob.getEntityId());

        int[] members = this.schoolMembers.stream()
                .map(AnimalComponent::getMob)
                .mapToInt(MobEntity::getEntityId)
                .toArray();

        compoundTag.putIntArray("SchoolMembers", members);
    }

}
