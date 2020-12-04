package github.KingVampyre.DeepTrenches.core.mixin;

import github.KingVampyre.DeepTrenches.client.entity.renderer.*;
import github.KingVampyre.DeepTrenches.core.entity.BarbeledLoosejawEntity;
import github.KingVampyre.DeepTrenches.core.entity.BettaEntity;
import github.KingVampyre.DeepTrenches.core.init.EntityTypes;
import net.minecraft.client.render.entity.BoatEntityRenderer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.resource.ReloadableResourceManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityRenderDispatcher.class)
public abstract class EntityRenderDispatcherMixin {

    @Shadow
    protected abstract <T extends Entity> void register(EntityType<T> entityType, EntityRenderer<? super T> entityRenderer);

    @Inject(method = "registerRenderers", at = @At("HEAD"))
    private void registerRenderers(ItemRenderer itemRenderer, ReloadableResourceManager reloadableResourceManager, CallbackInfo ci) {
        EntityRenderDispatcher dispatcher = (EntityRenderDispatcher) (Object) this;

        this.register(EntityTypes.ADAIGGER, new AdaiggerRenderer(dispatcher));
        this.register(EntityTypes.BARBELED_LOOSEJAW, new BarbeledLoosejawRenderer(dispatcher));
        this.register(EntityTypes.BETTA, new BettaRenderer(dispatcher));
        this.register(EntityTypes.BLACK_LOOSEJAW, new BlackLoosejawRenderer(dispatcher));
        this.register(EntityTypes.BOAT, new BoatEntityRenderer(dispatcher));
        this.register(EntityTypes.DEEP_LAKE_BETTA, new DeepLakeBettaRenderer(dispatcher));
        this.register(EntityTypes.GIANT_HATCHETFISH, new GiantHatchetfishRenderer(dispatcher));
        this.register(EntityTypes.LIGHT_LOOSEJAW, new LightLoosejawRenderer(dispatcher));
        this.register(EntityTypes.SMALLTOOTH_DRAGONFISH, new SmalltoothDragonfishRenderer(dispatcher));
        this.register(EntityTypes.STASP, new StaspRenderer(dispatcher));
    }

}
