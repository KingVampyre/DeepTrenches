package github.KingVampyre.DeepTrenches.core.util.entity.attribute;

import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.mob.MobEntity;

import static github.KingVampyre.DeepTrenches.core.init.entity.DTEntityAttributes.*;
import static net.minecraft.entity.attribute.EntityAttributes.*;

public class DefaultAttributeHelper {

    public static DefaultAttributeContainer.Builder createMobAttributes() {
        return MobEntity.createMobAttributes();
    }

    public static DefaultAttributeContainer.Builder createBarbeledLoosejawAttributes() {
        return MobEntity.createMobAttributes()
                .add(GENERIC_ATTACK_DAMAGE, 6)
                .add(GENERIC_FOLLOW_RANGE, 4) // 16
                .add(GENERIC_MAX_HEALTH, 16)
                .add(GENERIC_MOVEMENT_SPEED, 1.24F)
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
                .add(SUBORBITAL_MIN_LIT, 40);
    }

    public static DefaultAttributeContainer.Builder createBeardedSeadevilAttributes() {
        return createMobAttributes();
    }

    public static DefaultAttributeContainer.Builder createBettaAttributes() {
        return MobEntity.createMobAttributes()
                .add(GENERIC_ATTACK_DAMAGE, 3)
                .add(GENERIC_MAX_HEALTH, 4)
                .add(GENERIC_MOVEMENT_SPEED, 0.9);
    }

    public static DefaultAttributeContainer.Builder createBlackDragonfishAttributes() {
        return createMobAttributes();
    }

    public static DefaultAttributeContainer.Builder createBlackLoosejawAttributes() {
        return MobEntity.createMobAttributes()
                .add(GENERIC_ATTACK_DAMAGE, 8)
                .add(GENERIC_FOLLOW_RANGE, 6) // 16
                .add(GENERIC_MAX_HEALTH, 18)
                .add(GENERIC_MOVEMENT_SPEED, 1.26F)
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
                .add(SUBORBITAL_MIN_LIT, 100);
    }

    public static DefaultAttributeContainer.Builder createBlackScabbardAttributes() {
        return createMobAttributes();
    }

    public static DefaultAttributeContainer.Builder createBlackSeadevilAttributes() {
        return createMobAttributes();
    }

    public static DefaultAttributeContainer.Builder createBlobfishAttributes() {
        return createMobAttributes();
    }

    public static DefaultAttributeContainer.Builder createBlueWhaleAttributes() {
        return createMobAttributes();
    }

    public static DefaultAttributeContainer.Builder createBottleFlyAttributes() {
        return createMobAttributes();
    }

    public static DefaultAttributeContainer.Builder createBottleFlyMaggotAttributes() {
        return createMobAttributes();
    }

    public static DefaultAttributeContainer.Builder createBrownBearAttributes() {
        return createMobAttributes();
    }

    public static DefaultAttributeContainer.Builder createCetachsalAttributes() {
        return createMobAttributes();
    }

    public static DefaultAttributeContainer.Builder createDeepLakeBettaAttributes() {
        return MobEntity.createMobAttributes()
                .add(GENERIC_ATTACK_DAMAGE, 4)
                .add(GENERIC_FOLLOW_RANGE, 6)
                .add(GENERIC_MAX_HEALTH, 5)
                .add(GENERIC_MOVEMENT_SPEED, 1.2);
    }

    public static DefaultAttributeContainer.Builder createFangtoothAttributes() {
        return createMobAttributes();
    }

    public static DefaultAttributeContainer.Builder createFinangiteAttributes() {
        return createMobAttributes();
    }

    public static DefaultAttributeContainer.Builder createFlyAttributes() {
        return createMobAttributes();
    }

    public static DefaultAttributeContainer.Builder createGiantHatchetfishAttributes() {
        return MobEntity.createMobAttributes()
                .add(GENERIC_MAX_HEALTH, 16)
                .add(GENERIC_MOVEMENT_SPEED, 1.8);
    }

    public static DefaultAttributeContainer.Builder createGiantSeedShrimpAttributes() {
        return MobEntity.createMobAttributes();
    }

    public static DefaultAttributeContainer.Builder createHoneycombDragonfishAttributes() {
        return MobEntity.createMobAttributes();
    }

    public static DefaultAttributeContainer.Builder createLaceratorAttributes() {
        return MobEntity.createMobAttributes();
    }

    public static DefaultAttributeContainer.Builder createLancetfishAttributes() {
        return MobEntity.createMobAttributes();
    }

    public static DefaultAttributeContainer.Builder createLightLoosejawAttributes() {
        return MobEntity.createMobAttributes()
                .add(GENERIC_ATTACK_DAMAGE, 7F)
                .add(GENERIC_FOLLOW_RANGE, 8) // 16
                .add(GENERIC_MAX_HEALTH, 16F)
                .add(GENERIC_MOVEMENT_SPEED, 1.31F)
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
                .add(PREY_DETECTION, 1.6); // 4
    }

    public static DefaultAttributeContainer.Builder createMaggotAttributes() {
        return MobEntity.createMobAttributes();
    }

    public static DefaultAttributeContainer.Builder createPrinceAxelsWonderfishAttributes() {
        return MobEntity.createMobAttributes();
    }

    public static DefaultAttributeContainer.Builder createSmalltoothDragonfishAttributes() {
        return MobEntity.createMobAttributes()
                .add(GENERIC_ATTACK_DAMAGE, 4)
                .add(GENERIC_FOLLOW_RANGE, 6) // 16
                .add(GENERIC_MAX_HEALTH, 18)
                .add(GENERIC_MOVEMENT_SPEED, 1.24F)
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
                .add(SUBORBITAL_MIN_LIT, 20);
    }

    public static DefaultAttributeContainer.Builder createStaspAttributes() {
        return MobEntity.createMobAttributes()
                .add(GENERIC_FOLLOW_RANGE, 48F)
                .add(GENERIC_MAX_HEALTH, 10F)
                .add(GENERIC_ATTACK_DAMAGE, 3F)
                .add(GENERIC_FLYING_SPEED, 1.85F)
                .add(GENERIC_MOVEMENT_SPEED, 0.2F);
    }

    public static DefaultAttributeContainer.Builder createTelescopefishAttributes() {
        return MobEntity.createMobAttributes();
    }

    public static DefaultAttributeContainer.Builder createThreadfinDragonfishAttributes() {
        return MobEntity.createMobAttributes();
    }

    public static DefaultAttributeContainer.Builder createViperfishAttributes() {
        return MobEntity.createMobAttributes();
    }

    public static DefaultAttributeContainer.Builder createVoidBeastAttributes() {
        return MobEntity.createMobAttributes();
    }

    public static DefaultAttributeContainer.Builder createWolftrapSeadevilAttributes() {
        return MobEntity.createMobAttributes();
    }

}
