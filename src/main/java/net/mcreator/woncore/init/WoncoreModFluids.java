
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.woncore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.woncore.fluid.MercuryFluid;
import net.mcreator.woncore.WoncoreMod;

public class WoncoreModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, WoncoreMod.MODID);
	public static final RegistryObject<Fluid> MERCURY = REGISTRY.register("mercury", () -> new MercuryFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_MERCURY = REGISTRY.register("flowing_mercury", () -> new MercuryFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(MERCURY.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_MERCURY.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
