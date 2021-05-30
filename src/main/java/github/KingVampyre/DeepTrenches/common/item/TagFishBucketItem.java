package github.KingVampyre.DeepTrenches.common.item;

import net.minecraft.entity.Bucketable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.EntityBucketItem;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.tag.Tag;
import net.minecraft.util.math.BlockPos;

public class TagFishBucketItem extends EntityBucketItem {

	protected final Tag<EntityType<?>> tag;
	protected final EntityType<?> type;

	public TagFishBucketItem(EntityType<?> type, Tag<EntityType<?>> tag, Fluid fluid, SoundEvent emptyingSound, Settings settings) {
		super(type, fluid, emptyingSound, settings);

		this.tag = tag;
		this.type = type;
	}

	@Override
	public void spawnEntity(ServerWorld world, ItemStack stack, BlockPos pos) {
		EntityType<?> type = this.tag != null ? this.tag.getRandom(world.random) : this.type;
		Entity entity = type.spawnFromItemStack(world, stack, null, pos, SpawnReason.BUCKET, true, false);

		if (entity instanceof Bucketable) {
			Bucketable bucketable = (Bucketable)entity;
			bucketable.copyDataFromNbt(stack.getOrCreateTag());
			bucketable.setFromBucket(true);
		}

	}

}
