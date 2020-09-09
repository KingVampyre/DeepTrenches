package github.KingVampyre.DeepTrenches.common.entity;

import github.KingVampyre.DeepTrenches.core.init.EntityTypes;
import github.KingVampyre.DeepTrenches.core.init.ModLootContextParameters;
import github.KingVampyre.DeepTrenches.core.init.WoodType;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.ProjectileDamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.loot.LootManager;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.context.LootContextType;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

import static github.KingVampyre.DeepTrenches.core.init.ModLootContextParameters.WOOD_TYPE;
import static net.minecraft.entity.data.TrackedDataHandlerRegistry.STRING;
import static net.minecraft.loot.context.LootContextParameters.LAST_DAMAGE_PLAYER;
import static net.minecraft.world.GameRules.DO_ENTITY_DROPS;

public class ModBoatEntity extends BoatEntity {

	// TODO: move
	public static final LootContextType BOAT_LOOT = new LootContextType.Builder()
			.allow(LAST_DAMAGE_PLAYER)
			.require(ModLootContextParameters.WOOD_TYPE)
			.build();

	private static final TrackedData<String> BOAT_TYPE = DataTracker.registerData(ModBoatEntity.class, STRING);

	public ModBoatEntity(EntityType<? extends BoatEntity> entityType, World world) {
		super(entityType, world);

		this.inanimate = true;
	}

	public ModBoatEntity(World world, double x, double y, double z) {
		super(EntityTypes.BOAT, world);

		this.updatePosition(x, y, z);
		this.setVelocity(Vec3d.ZERO);

		this.prevX = x;
		this.prevY = y;
		this.prevZ = z;
	}

	@Override
	public boolean damage(DamageSource source, float amount) {

		if (this.isInvulnerableTo(source))
			return false;

		if (!this.world.isClient && this.isAlive()) {
			Entity attacker = source.getAttacker();
			Entity trueSource = source.getSource();

			if (source instanceof ProjectileDamageSource && attacker != null && this.hasPassenger(attacker))
				return false;

			this.setDamageWobbleSide(-this.getDamageWobbleSide());
			this.setDamageWobbleTicks(10);
			this.setDamageWobbleStrength(this.getDamageWobbleStrength() + amount * 10.0F);
			this.scheduleVelocityUpdate();

			if (trueSource instanceof PlayerEntity) {
				GameRules gameRules = this.world.getGameRules();
				PlayerEntity player = (PlayerEntity) trueSource;

				if (!player.abilities.creativeMode && gameRules.getBoolean(DO_ENTITY_DROPS)) {
					ServerWorld server = (ServerWorld) this.world;
					WoodType woodType = this.getWoodType();

					LootContext.Builder context = new LootContext.Builder(server).parameter(WOOD_TYPE, woodType)
							.optionalParameter(LAST_DAMAGE_PLAYER, player);

					if (this.getDamageWobbleStrength() > 40.0F) {
						this.dropLoot(context);
						this.remove();
					}

				}

				if (player.abilities.creativeMode)
					this.remove();

			}
		}

		return true;
	}

	public void dropLoot(LootContext.Builder context) {
		LootManager manager = this.world.getServer().getLootManager();

		Identifier id = this.getType().getLootTableId();
		LootTable table = manager.getTable(id);

		table.generateLoot(context.build(BOAT_LOOT), this::dropStack);
	}

	@Override
	protected void fall(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
		super.fall(y, onGroundIn, state, pos);

		if (!this.hasVehicle() && onGroundIn) {

			if (this.fallDistance > 3.0F) {

				if (!this.world.isClient && this.isAlive()) {
					ServerWorld server = (ServerWorld) this.world;
					WoodType woodType = this.getWoodType();

					LootContext.Builder context = new LootContext
							.Builder(server)
							.optionalParameter(LAST_DAMAGE_PLAYER, null)
							.parameter(WOOD_TYPE, woodType);

					this.dropLoot(context);
				}
			}
		}
	}

	public WoodType getWoodType() {
		return WoodType.getType(this.dataTracker.get(BOAT_TYPE));
	}

	@Override
	protected void initDataTracker() {
		super.initDataTracker();

		this.dataTracker.startTracking(BOAT_TYPE, WoodType.ALMOND.getName());
	}

	@Override
	public void setHeadYaw(float headYaw) {
		this.yaw = headYaw;
	}

	public void setWoodType(WoodType boatType) {
		this.dataTracker.set(BOAT_TYPE, boatType.getName());
	}

}