package github.KingVampyre.DeepTrenches.core.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.DefaultAttributeRegistry;
import net.minecraft.entity.mob.MobEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static github.KingVampyre.DeepTrenches.core.init.EntityTypes.*;
import static github.KingVampyre.DeepTrenches.core.init.ModEntityAttributes.*;
import static net.minecraft.entity.attribute.EntityAttributes.*;

@Mixin(DefaultAttributeRegistry.class)
public class MixinDefaultAttributeRegistry {

    @Inject(method = "get", at = @At("HEAD"), cancellable = true)
    private static void get(EntityType<? extends LivingEntity> type, CallbackInfoReturnable<DefaultAttributeContainer> cir) {

        if (type == BLUE_BETTA || type == COLORFUL_BETTA || type == ICARUS || type == ICARUS_JUNIOR || type == RED_BETTA)
            cir.setReturnValue(MobEntity.createMobAttributes()
                    .add(GENERIC_ATTACK_DAMAGE, 3)
                    .add(GENERIC_MAX_HEALTH, 4)
                    .add(GENERIC_MOVEMENT_SPEED, 0.9)
                    .add(MOVEMENT_SPEED_BOOST, 2.13)
                    .build());

        if (type == NORTHERN_BLACK_LOOSEJAW || type == SOUTHERN_BLACK_LOOSEJAW)
            cir.setReturnValue(MobEntity.createMobAttributes()
                    .add(GENERIC_ATTACK_DAMAGE, 8)
                    .add(GENERIC_FOLLOW_RANGE, 6) // 16
                    .add(GENERIC_MAX_HEALTH, 18)
                    .add(GENERIC_MOVEMENT_SPEED, 1.26F)
                    .add(MOVEMENT_SPEED_BOOST, 2.6F)
                    .add(BLINK_INTERVAL, 3)
                    .add(BLINK_RANGE, 14)
                    .add(BLINK_DELAY, 110)
                    .add(MAX_BLINKS, 13)
                    .add(MIN_BLINKS, 5)
                    .add(LURE_MAX_LIT, 60) // 600
                    .add(LURE_MIN_LIT, 40) // 400
                    .add(LURE_MAX_UNLIT, 50) // 500
                    .add(LURE_MIN_UNLIT, 23) // 230
                    .add(LURE_ATTRACTION, 10)
                    .add(LURE_DELAY, 2025) // 4050
                    .add(MAX_LURING, 9) // 3
                    .add(MIN_LURING, 6) // 2
                    .add(PREY_DETECTION, 1.25F) // 3
                    .add(SUBORBITAL_DELAY, 300)
                    .add(SUBORBITAL_MAX_LIT, 240)
                    .add(SUBORBITAL_MIN_LIT, 100)
                    .build());

        if (type == DEEP_LAKE_BETTA)
            cir.setReturnValue(MobEntity.createMobAttributes()
                    .add(GENERIC_ATTACK_DAMAGE, 4)
                    .add(GENERIC_FOLLOW_RANGE, 6)
                    .add(GENERIC_MAX_HEALTH, 5)
                    .add(GENERIC_MOVEMENT_SPEED, 1.2)
                    .add(MOVEMENT_SPEED_BOOST, 3.15)
                    .build());

        if (type == GIANT_HATCHETFISH)
            cir.setReturnValue(MobEntity.createMobAttributes()
                    .add(GENERIC_MAX_HEALTH, 16)
                    .add(GENERIC_MOVEMENT_SPEED, 2.17)
                    .add(MOVEMENT_SPEED_BOOST, 2.53)
                    .build());

        if (type == BIGLAMP_LIGHT_LOOSEJAW || type == GOODYEARS_LIGHT_LOOSEJAW || type == GUERNES_LIGHT_LOOSEJAW || type == LIEMS_LIGHT_LOOSEJAW || type == REMARKABLE_LIGHT_LOOSEJAW || type == SMALL_LIGHT_LOOSEJAW)
            cir.setReturnValue(MobEntity.createMobAttributes()
                    .add(GENERIC_ATTACK_DAMAGE, 7F)
                    .add(GENERIC_FOLLOW_RANGE, 8) // 16
                    .add(GENERIC_MAX_HEALTH, 16F)
                    .add(GENERIC_MOVEMENT_SPEED, 1.31F)
                    .add(MOVEMENT_SPEED_BOOST, 2.68F) // 2.68
                    .add(BLINK_INTERVAL, 3)
                    .add(BLINK_RANGE, 5)
                    .add(BLINK_DELAY, 115)
                    .add(MAX_BLINKS, 4)
                    .add(MIN_BLINKS, 2)
                    .add(LURE_MAX_LIT, 16) // 160
                    .add(LURE_MIN_LIT, 12) // 120
                    .add(LURE_MAX_UNLIT, 22) // 220
                    .add(LURE_MIN_UNLIT, 20) // 200
                    .add(LURE_ATTRACTION, 10)
                    .add(LURE_DELAY, 650) // 1300
                    .add(MAX_LURING, 12) // 4
                    .add(MIN_LURING, 6) // 2
                    .add(PREY_DETECTION, 1.6) // 4
                    .build());

        if (type == ATLANTIC_BARBELED_LOOSEJAW || type == GLOWING_BARBELED_LOOSEJAW || type == GRIMALDIS_BARBELED_LOOSEJAW || type == MANY_RAYED_BARBELED_LOOSEJAW || type == SHINY_BARBELED_LOOSEJAW || type == TITTMANNS_BARBELED_LOOSEJAW)
            cir.setReturnValue(MobEntity.createMobAttributes()
                    .add(GENERIC_ATTACK_DAMAGE, 6)
                    .add(GENERIC_FOLLOW_RANGE, 4) // 16
                    .add(GENERIC_MAX_HEALTH, 16)
                    .add(GENERIC_MOVEMENT_SPEED, 1.24F)
                    .add(MOVEMENT_SPEED_BOOST, 2.58F)
                    .add(BLINK_INTERVAL, 6) // 3
                    .add(BLINK_RANGE, 12)
                    .add(BLINK_DELAY, 440) // 60
                    .add(MAX_BLINKS, 9)
                    .add(MIN_BLINKS, 3)
                    .add(LURE_MAX_LIT, 20) // 200
                    .add(LURE_MIN_LIT, 12) // 120
                    .add(LURE_MAX_UNLIT, 7) // 70
                    .add(LURE_MIN_UNLIT, 6) // 60
                    .add(LURE_ATTRACTION, 16)
                    .add(LURE_DELAY, 640)
                    .add(MAX_LURING, 18) // 6
                    .add(MIN_LURING, 9) // 3
                    .add(PREY_DETECTION, 1.25F) // 2
                    .add(SUBORBITAL_DELAY, 230)
                    .add(SUBORBITAL_MAX_LIT, 140)
                    .add(SUBORBITAL_MIN_LIT, 40)
                    .build());

        if (type == SMALLTOOTH_DRAGONFISH)
            cir.setReturnValue(MobEntity.createMobAttributes()
                    .add(GENERIC_ATTACK_DAMAGE, 4)
                    .add(GENERIC_FOLLOW_RANGE, 6) // 16
                    .add(GENERIC_MAX_HEALTH, 18)
                    .add(GENERIC_MOVEMENT_SPEED, 1.24F)
                    .add(MOVEMENT_SPEED_BOOST, 2.58F)
                    .add(BLINK_INTERVAL, 3)
                    .add(BLINK_RANGE, 12)
                    .add(BLINK_DELAY, 120)
                    .add(MAX_BLINKS, 9)
                    .add(MIN_BLINKS, 3)
                    .add(LURE_MAX_LIT, 24) // 240
                    .add(LURE_MIN_LIT, 14) // 140
                    .add(LURE_MAX_UNLIT, 8) // 80
                    .add(LURE_MIN_UNLIT, 7) // 70
                    .add(LURE_ATTRACTION, 8)
                    .add(LURE_DELAY, 720)
                    .add(MAX_LURING, 2) // 6
                    .add(MIN_LURING, 1) // 3
                    .add(PREY_DETECTION, 1.25F) // 3
                    .add(SUBORBITAL_DELAY, 270)
                    .add(SUBORBITAL_MAX_LIT, 100)
                    .add(SUBORBITAL_MIN_LIT, 20)
                    .build());

        if (type == BLACK_STASP || type == BLUE_WINGED_STASP || type == FUCHSITRA_STASP || type == ORANGE_WINGED_STASP)
            cir.setReturnValue(MobEntity.createMobAttributes()
                    .add(GENERIC_ARMOR, 5F)
                    .add(GENERIC_FOLLOW_RANGE, 48F)
                    .add(GENERIC_MAX_HEALTH, 10F)
                    .add(GENERIC_ATTACK_DAMAGE, 3F)
                    .add(GENERIC_FLYING_SPEED, 0.175F)
                    .add(MOVEMENT_SPEED_BOOST, 0.2F)
                    .build());
    }

}
