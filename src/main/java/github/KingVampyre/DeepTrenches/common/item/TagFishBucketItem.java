package github.KingVampyre.DeepTrenches.common.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.FishBucketItem;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.Tag;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TagFishBucketItem extends FishBucketItem {

	protected final Tag<EntityType<?>> tag;
	protected final EntityType<?> type;

	public TagFishBucketItem(EntityType<?> type, Tag<EntityType<?>> tag, Fluid fluid, Settings settings) {
		super(type, fluid, settings);

		this.tag = tag;
		this.type = type;
	}

	@Override
	public void onEmptied(World world, ItemStack stack, BlockPos pos) {

		if (world instanceof ServerWorld) {
			ServerWorld server = (ServerWorld) world;

			if (!world.isClient) {
				EntityType<?> type = this.tag != null ? this.tag.getRandom(server.random) : this.type;
				Entity entity = type.spawn(server, null, null, null, pos, SpawnReason.BUCKET, true, false);
	
				if (entity instanceof FishEntity) {
					FishEntity fishEntity = (FishEntity) entity;
	
					fishEntity.setFromBucket(true);
				}
			}
		}
	}

}
