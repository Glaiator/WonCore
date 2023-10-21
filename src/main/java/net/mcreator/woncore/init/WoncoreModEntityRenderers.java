
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.woncore.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.woncore.client.renderer.Airdrop2Renderer;
import net.mcreator.woncore.client.renderer.Airdrop1Renderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WoncoreModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(WoncoreModEntities.AIRDROP_1.get(), Airdrop1Renderer::new);
		event.registerEntityRenderer(WoncoreModEntities.AIRDROP_2.get(), Airdrop2Renderer::new);
	}
}
