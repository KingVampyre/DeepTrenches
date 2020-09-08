package github.KingVampyre.DeepTrenches.common.entity.renderer;

import github.KingVampyre.DeepTrenches.common.entity.ModBoatEntity;
import net.minecraft.client.render.entity.BoatEntityRenderer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.util.Identifier;

public class ModBoatEntityRenderer extends BoatEntityRenderer {

	public ModBoatEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
		super(entityRenderDispatcher);
	}

	@Override
	public Identifier getTexture(BoatEntity boatEntity) {
		ModBoatEntity boat = (ModBoatEntity) boatEntity;

		return new Identifier("deep_trenches", "textures/entity/boat/" + boat.getWoodType().getName() + ".png");
	}

}
