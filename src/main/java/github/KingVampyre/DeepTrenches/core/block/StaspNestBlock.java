package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.core.block.entity.StaspNestBlockEntity;
import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import github.KingVampyre.DeepTrenches.core.init.DTItems;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.*;
import net.minecraft.block.entity.BeehiveBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.TntEntity;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.WitherSkullEntity;
import net.minecraft.entity.vehicle.TntMinecartEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.context.LootContext;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.DTBlockEntityTypes.STASP_NEST;
import static net.minecraft.block.BlockRenderType.MODEL;
import static net.minecraft.item.Items.GLASS_BOTTLE;
import static net.minecraft.loot.context.LootContextParameters.BLOCK_ENTITY;
import static net.minecraft.loot.context.LootContextParameters.THIS_ENTITY;
import static net.minecraft.sound.SoundCategory.NEUTRAL;
import static net.minecraft.sound.SoundEvents.ITEM_BOTTLE_FILL;
import static net.minecraft.stat.Stats.USED;
import static net.minecraft.state.property.Properties.HORIZONTAL_FACING;
import static net.minecraft.tag.BlockTags.IMPERMEABLE;
import static net.minecraft.util.math.Direction.*;
import static net.minecraft.util.math.Direction.Axis.*;
import static net.minecraft.world.GameRules.DO_TILE_DROPS;
import static net.minecraft.world.event.GameEvent.FLUID_PICKUP;
import static net.minecraft.world.event.GameEvent.SHEAR;

public class StaspNestBlock extends BlockWithEntity {

	public static final IntProperty AQUEAN_SAP_LEVEL = IntProperty.of("aquean_sap_level", 0 ,5);

	public StaspNestBlock(Settings settings) {
		super(settings);

		this.setDefaultState(this.stateManager.getDefaultState().with(AQUEAN_SAP_LEVEL, 0).with(HORIZONTAL_FACING, NORTH));
	}

	@Override
	public boolean hasComparatorOutput(BlockState state) {
		return true;
	}

	@Override
	public int getComparatorOutput(BlockState state, World world, BlockPos pos) {
		return state.get(AQUEAN_SAP_LEVEL);
	}

	/*
	@Override
	public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack stack) {
		super.afterBreak(world, player, pos, state, blockEntity, stack);

		if (!world.isClient && player instanceof ServerPlayerEntity serverPlayer && blockEntity instanceof StaspNestBlockEntity staspNestBlockEntity) {

			if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
				staspNestBlockEntity.angerStasps(player, state, StaspNestBlockEntity.StaspState.EMERGENCY);
				world.updateComparators(pos, this);

				this.angerNearbyStasps(world, pos);
			}

			Criteria.STASP_NEST_DESTROYED.trigger(serverPlayer, state, stack, staspNestBlockEntity.getStaspCount());
		}

	}

	private void angerNearbyStasps(World world, BlockPos pos) {
		var stasps = world.getNonSpectatingEntities(StaspEntity.class, new Box(pos).expand(8.0D, 6.0D, 8.0D));

		if (!stasps.isEmpty()) {
			var players = world.getNonSpectatingEntities(PlayerEntity.class, new Box(pos).expand(8.0D, 6.0D, 8.0D));
			var size = players.size();

			for (var staspEntity : stasps) {
				if (staspEntity.getTarget() == null)
					staspEntity.setTarget(players.get(world.random.nextInt(size)));
			}
		}

	}

	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		var aqueanSapLevel = state.get(AQUEAN_SAP_LEVEL);
		var itemStack = player.getStackInHand(hand);
		var bl = false;

		if (aqueanSapLevel >= 5) {
			var item = itemStack.getItem();

			if (itemStack.isOf(Items.SHEARS)) {
				world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.BLOCK_BEEHIVE_SHEAR, SoundCategory.NEUTRAL, 1.0F, 1.0F);
				dropHoneycomb(world, pos);
				itemStack.damage(1, player, playerx -> playerx.sendToolBreakStatus(hand));
				bl = true;
				world.emitGameEvent(player, SHEAR, pos);
			}

			if (itemStack.isOf(GLASS_BOTTLE)) {
				itemStack.decrement(1);
				world.playSound(player, player.getBlockPos(), ITEM_BOTTLE_FILL, NEUTRAL, 1.0F, 1.0F);

				var aqueanSapBottle = new ItemStack(DTItems.AQUEAN_SAP_BOTTLE);

				if (itemStack.isEmpty())
					player.setStackInHand(hand, aqueanSapBottle);
				else if (!player.getInventory().insertStack(aqueanSapBottle))
					player.dropItem(aqueanSapBottle, false);

				bl = true;
				world.emitGameEvent(player, FLUID_PICKUP, pos);
			}

			if (!world.isClient() && bl)
				player.incrementStat(USED.getOrCreateStat(item));

		}

		if (bl) {
			if (!CampfireBlock.isLitCampfireInRange(world, pos)) {
				if (this.hasStasps(world, pos))
					this.angerNearbyStasps(world, pos);

				this.takeHoney(world, state, pos, player, BeehiveBlockEntity.BeeState.EMERGENCY);
			} else
				this.takeHoney(world, state, pos);

			return ActionResult.success(world.isClient);
		} else
			return super.onUse(state, world, pos, player, hand, hit);
	}

	private void dropHoneycomb(World world, BlockPos pos) {
	}

	private boolean hasStasps(World world, BlockPos pos) {
		return world.getBlockEntity(pos) instanceof StaspNestBlockEntity staspNestBlockEntity && !staspNestBlockEntity.hasNoBees();
	}

	public void takeHoney(World world, BlockState state, BlockPos pos, @Nullable PlayerEntity player, BeehiveBlockEntity.BeeState beeState) {
		this.takeHoney(world, state, pos);
		var blockEntity = world.getBlockEntity(pos);

		if (blockEntity instanceof StaspNestBlockEntity staspNestBlockEntity)
			staspNestBlockEntity.angerStasps(player, state, beeState);

	}

	public void takeHoney(World world, BlockState state, BlockPos pos) {
		world.setBlockState(pos, state.with(AQUEAN_SAP_LEVEL, 0), NOTIFY_ALL);
	}

	@Override
	public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {

		if (state.get(AQUEAN_SAP_LEVEL) >= 5) {
			for(int i = 0; i < random.nextInt(1) + 1; ++i) {

				if (state.getFluidState().isEmpty() && !(world.random.nextFloat() < 0.3F)) {
					var voxelShape = state.getCollisionShape(world, pos);
					var maxY = voxelShape.getMax(Y);

					if (maxY >= 1 && !state.isIn(IMPERMEABLE)) {
						var minY = voxelShape.getMin(Y);

						if (minY > 0)
							this.addAqueanSapParticle(world, pos, voxelShape, pos.getY() + minY - 0.05D);
						else {
							var down = pos.down();
							var downState = world.getBlockState(down);
							var downVoxelShape = downState.getCollisionShape(world, down);
							var downMaxY = downVoxelShape.getMax(Y);

							if ((downMaxY < 1.0D || !downState.isFullCube(world, down)) && downState.getFluidState().isEmpty())
								this.addAqueanSapParticle(world, pos, voxelShape, pos.getY() - 0.05D);

						}

					}

				}

			}

		}

	}

	private void addAqueanSapParticle(World world, BlockPos pos, VoxelShape shape, double height) {
		this.addAqueanSapParticle(world, pos.getX() + shape.getMin(X), pos.getX() + shape.getMax(X), pos.getZ() + shape.getMin(Z), pos.getZ() + shape.getMax(Z), height);
	}

	private void addAqueanSapParticle(World world, double minX, double maxX, double minZ, double maxZ, double height) {
		world.addParticle(ParticleTypes.DRIPPING_HONEY, MathHelper.lerp(world.random.nextDouble(), minX, maxX), height, MathHelper.lerp(world.random.nextDouble(), minZ, maxZ), 0, 0, 0);
	}

	@Override
	public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {

		if (!world.isClient && player.isCreative() && world.getGameRules().getBoolean(DO_TILE_DROPS)) {
			var blockEntity = world.getBlockEntity(pos);

			if (blockEntity instanceof StaspNestBlockEntity staspNestBlockEntity) {
				var itemStack = new ItemStack(this);
				var aqueanSapLevel = (Integer)state.get(AQUEAN_SAP_LEVEL);
				var bl = !staspNestBlockEntity.hasNoStasps();

				if (bl || aqueanSapLevel > 0) {
					NbtCompound nbtCompound2;
					if (bl) {
						nbtCompound2 = new NbtCompound();
						nbtCompound2.put("Bees", staspNestBlockEntity.getStasps());
						BlockItem.setBlockEntityNbt(itemStack, BlockEntityType.BEEHIVE, nbtCompound2);
					}

					nbtCompound2 = new NbtCompound();
					nbtCompound2.putInt("honey_level", aqueanSapLevel);
					itemStack.setSubNbt("BlockStateTag", nbtCompound2);
					ItemEntity itemEntity = new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), itemStack);
					itemEntity.setToDefaultPickupDelay();

					world.spawnEntity(itemEntity);
				}
			}
		}

		super.onBreak(world, pos, state, player);
	}

	@Override
	public List<ItemStack> getDroppedStacks(BlockState state, LootContext.Builder builder) {
		var entity = builder.getNullable(THIS_ENTITY);

		if (entity instanceof TntEntity || entity instanceof CreeperEntity || entity instanceof WitherSkullEntity || entity instanceof WitherEntity || entity instanceof TntMinecartEntity) {
			var blockEntity = builder.getNullable(BLOCK_ENTITY);

			if (blockEntity instanceof StaspNestBlockEntity staspNestBlockEntity)
				staspNestBlockEntity.angerStasps(null, state, StaspNestBlockEntity.StaspState.EMERGENCY);

		}

		return super.getDroppedStacks(state, builder);
	}

	@Override
	public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {

		if (world.getBlockState(neighborPos).getBlock() instanceof FireBlock) {
			var blockEntity = world.getBlockEntity(pos);

			if (blockEntity instanceof StaspNestBlockEntity staspNestBlockEntity)
				staspNestBlockEntity.angerStasps(null, state, StaspNestBlockEntity.StaspState.EMERGENCY);
		}

		return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
	}*/

	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return this.getDefaultState().with(HORIZONTAL_FACING, ctx.getPlayerFacing().getOpposite());
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(AQUEAN_SAP_LEVEL, HORIZONTAL_FACING);
	}

	@Override
	public BlockRenderType getRenderType(BlockState state) {
		return MODEL;
	}

	@Nullable
	public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		return new StaspNestBlockEntity(pos, state);
	}

	@Nullable
	public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
		return world.isClient ? null : checkType(type, STASP_NEST, StaspNestBlockEntity::serverTick);
	}

}
