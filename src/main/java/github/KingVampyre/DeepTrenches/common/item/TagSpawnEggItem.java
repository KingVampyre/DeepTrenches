package github.KingVampyre.DeepTrenches.common.item;

import net.minecraft.entity.EntityType;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.tag.Tag;

import java.util.Random;

public class TagSpawnEggItem extends SpawnEggItem {

    protected final Tag<EntityType<?>> tag;
    protected final EntityType<?> type;

    public TagSpawnEggItem(EntityType<?> type, Tag<EntityType<?>> tag, int primaryColor, int secondaryColor, Settings settings) {
        super(type, primaryColor, secondaryColor, settings);

        this.tag = tag;
        this.type = type;
    }

    @Override
    public EntityType<?> getEntityType(CompoundTag tag) {

        if (tag != null && tag.contains("EntityTag", 10)) {
            CompoundTag compoundTag = tag.getCompound("EntityTag");

            if (compoundTag.contains("id", 8)) {
                String id = compoundTag.getString("id");

                return EntityType.get(id).orElse(this.type);
            }

        }

        return this.tag != null ? this.tag.getRandom(new Random()) : this.type;
    }

}
