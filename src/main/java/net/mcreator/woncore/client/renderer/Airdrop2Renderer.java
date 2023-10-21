
package net.mcreator.woncore.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.woncore.entity.Airdrop2Entity;
import net.mcreator.woncore.client.model.Modelcaisse_de_larguage_sans_parachute;

public class Airdrop2Renderer extends MobRenderer<Airdrop2Entity, Modelcaisse_de_larguage_sans_parachute<Airdrop2Entity>> {
	public Airdrop2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelcaisse_de_larguage_sans_parachute(context.bakeLayer(Modelcaisse_de_larguage_sans_parachute.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(Airdrop2Entity entity) {
		return new ResourceLocation("woncore:textures/entities/caisse_de_larguage.png");
	}
}
