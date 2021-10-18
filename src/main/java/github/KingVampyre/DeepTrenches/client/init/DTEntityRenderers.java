package github.KingVampyre.DeepTrenches.client.init;

import github.KingVampyre.DeepTrenches.client.render.entity.renderer.*;
import github.Louwind.entityutils.core.entity.render.FabricBoatEntityRenderer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

import static github.KingVampyre.DeepTrenches.core.init.DTEntityTypes.*;

public class DTEntityRenderers {

    public static void initialize() {
        EntityRendererRegistry.register(ADAIGGER, AdaiggerRenderer::new);
        EntityRendererRegistry.register(BEARDED_SEADEVIL, BeardedSeadevilRenderer::new);
        EntityRendererRegistry.register(BARBELED_LOOSEJAW, BarbeledLoosejawRenderer::new);
        EntityRendererRegistry.register(BOAT, FabricBoatEntityRenderer::new);
        EntityRendererRegistry.register(BETTA, BettaRenderer::new);
        EntityRendererRegistry.register(BLACK_DRAGONFISH, BlackDragonfishRenderer::new);
        EntityRendererRegistry.register(BLACK_SCABBARD, BlackScabbardRenderer::new);
        EntityRendererRegistry.register(BLACK_SEADEVIL, BlackSeadevilRenderer::new);
        EntityRendererRegistry.register(BLOBFISH, BlobfishRenderer::new);
        EntityRendererRegistry.register(BLUE_WHALE, BlueWhaleRenderer::new);
        EntityRendererRegistry.register(BOTTLE_FLY, BottleFlyRenderer::new);
        EntityRendererRegistry.register(BOTTLE_FLY_MAGGOT, BottleFlyMaggotRenderer::new);
        EntityRendererRegistry.register(BROWN_BEAR, BrownBearRenderer::new);
        EntityRendererRegistry.register(CETACHSAL, CetachsalRenderer::new);
        EntityRendererRegistry.register(DEEP_LAKE_BETTA, DeepLakeBettaRenderer::new);
        EntityRendererRegistry.register(FANGTOOTH, FangtoothRenderer::new);
        EntityRendererRegistry.register(FINANGITE, FinangiteRenderer::new);
        EntityRendererRegistry.register(FLY, FlyRenderer::new);
        EntityRendererRegistry.register(GIANT_HATCHETFISH, GiantHatchetfishRenderer::new);
        EntityRendererRegistry.register(GIANT_SEED_SHRIMP, GiantSeedShrimpRenderer::new);
        EntityRendererRegistry.register(HONEYCOMB_DRAGONFISH, HoneycombDragonfishRenderer::new);
        EntityRendererRegistry.register(LACERATOR, LaceratorRenderer::new);
        EntityRendererRegistry.register(LANCETFISH, LancetfishRenderer::new);
        EntityRendererRegistry.register(BLACK_LOOSEJAW, BlackLoosejawRenderer::new);
        EntityRendererRegistry.register(LIGHT_LOOSEJAW, LightLoosejawRenderer::new);
        EntityRendererRegistry.register(MAGGOT, MaggotRenderer::new);
        EntityRendererRegistry.register(PRINCE_AXELS_WONDERFISH, PrinceAxelsWonderfishRenderer::new);
        EntityRendererRegistry.register(SMALLTOOTH_DRAGONFISH, SmalltoothDragonfishRenderer::new);
        EntityRendererRegistry.register(STASP, StaspRenderer::new);
        EntityRendererRegistry.register(TELESCOPEFISH, TelescopefishEntityRenderer::new);
        EntityRendererRegistry.register(THREADFIN_DRAGONFISH, ThreadfinDragonfishRenderer::new);
        EntityRendererRegistry.register(VIPERFISH, ViperfishRenderer::new);
        EntityRendererRegistry.register(VOID_BEAST, VoidBeastRenderer::new);
        EntityRendererRegistry.register(WOLFTRAP_SEADEVIL, WolftrapSeadevilRenderer::new);
    }

}
