
package net.mcreator.woncore.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.woncore.entity.Airdrop1Entity;
import net.mcreator.woncore.client.model.Modelcaisse_de_larguage;

public class Airdrop1Renderer extends MobRenderer<Airdrop1Entity, Modelcaisse_de_larguage<Airdrop1Entity>> {
	public Airdrop1Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelcaisse_de_larguage(context.bakeLayer(Modelcaisse_de_larguage.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(Airdrop1Entity entity) {
		return new ResourceLocation("woncore:textures/entities/caisse_de_larguage.png");
	}
}
