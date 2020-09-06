package github.KingVampyre.DeepTrenches.common.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.FishBucketItem;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ModFishBucketItem extends FishBucketItem {

	protected final EntityType<?> type;

	public ModFishBucketItem(EntityType<?> type, Fluid fluid, Settings settings) {
		super(type, fluid, settings);

		this.type = type;
	}

	@Override
	public void onEmptied(World world, ItemStack stack, BlockPos pos) {

		if (world instanceof ServerWorld) {
			ServerWorld server = (ServerWorld) world;

			if (!world.isClient) {
				Entity entity = this.type.spawn(server, null, null, null, pos, SpawnReason.BUCKET, true, false);
	
				if (entity instanceof FishEntity) {
					FishEntity fishEntity = (FishEntity) entity;
	
					fishEntity.setFromBucket(true);
				}
			}
		}
	}

}
