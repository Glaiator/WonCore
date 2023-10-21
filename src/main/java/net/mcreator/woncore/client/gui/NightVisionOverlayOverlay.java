
package net.mcreator.woncore.client.gui;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.client.Minecraft;

import net.mcreator.woncore.procedures.NightVisionOverlayDisplayOverlayIngameProcedure;
import net.mcreator.woncore.procedures.NVONProcedure;
import net.mcreator.woncore.procedures.NVOFFProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class NightVisionOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGameOverlayEvent.Pre event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.ALL) {
			int w = event.getWindow().getGuiScaledWidth();
			int h = event.getWindow().getGuiScaledHeight();
			int posX = w / 2;
			int posY = h / 2;
			Level world = null;
			double x = 0;
			double y = 0;
			double z = 0;
			Player entity = Minecraft.getInstance().player;
			if (entity != null) {
				world = entity.level;
				x = entity.getX();
				y = entity.getY();
				z = entity.getZ();
			}
			if (NightVisionOverlayDisplayOverlayIngameProcedure.execute(entity)) {
				Minecraft.getInstance().font.draw(event.getMatrixStack(), new TranslatableComponent("gui.woncore.night_vision_overlay.label_nightvision_on"), w/40, h/30, -1);
				if (NVONProcedure.execute(entity))
					Minecraft.getInstance().font.draw(event.getMatrixStack(), new TranslatableComponent("gui.woncore.night_vision_overlay.label_on"), w/7, h/30, -13369600);
				if (NVOFFProcedure.execute(entity))
					Minecraft.getInstance().font.draw(event.getMatrixStack(), new TranslatableComponent("gui.woncore.night_vision_overlay.label_off"), w/7, h/30, -3407872);
			}
		}
	}
}
