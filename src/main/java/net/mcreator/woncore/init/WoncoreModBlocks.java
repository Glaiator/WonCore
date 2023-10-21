
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.woncore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.woncore.block.YellowCrystalBlock;
import net.mcreator.woncore.block.WhiteCrystalBlock;
import net.mcreator.woncore.block.WallSign2x3Block;
import net.mcreator.woncore.block.Sign2x3Block;
import net.mcreator.woncore.block.RenforcedConcreteBlock;
import net.mcreator.woncore.block.RenforcedConcrete2Block;
import net.mcreator.woncore.block.RenforcedConcrete1Block;
import net.mcreator.woncore.block.RedCrystalBlock;
import net.mcreator.woncore.block.PurpleCrystalBlock;
import net.mcreator.woncore.block.PinkCrystalBlock;
import net.mcreator.woncore.block.PalmLeavesBlock;
import net.mcreator.woncore.block.OrangeCrystalBlock;
import net.mcreator.woncore.block.MercuryOreBlock;
import net.mcreator.woncore.block.MercuryBlock;
import net.mcreator.woncore.block.MagentaCrystalBlock;
import net.mcreator.woncore.block.LogoWONBlock;
import net.mcreator.woncore.block.LogoRedBannerBlock;
import net.mcreator.woncore.block.Logo2DBlock;
import net.mcreator.woncore.block.LittleCrateBlock;
import net.mcreator.woncore.block.LimeCrystalBlock;
import net.mcreator.woncore.block.LightGrayCrystalBlock;
import net.mcreator.woncore.block.LightBlueCrystalBlock;
import net.mcreator.woncore.block.LampadaireBaseBlock;
import net.mcreator.woncore.block.LampadaireBarreBlock;
import net.mcreator.woncore.block.LampBlock;
import net.mcreator.woncore.block.InvilightBlock;
import net.mcreator.woncore.block.InviblockBlock;
import net.mcreator.woncore.block.GreenCrystalBlock;
import net.mcreator.woncore.block.GrayCrystalBlock;
import net.mcreator.woncore.block.DoubleLampBlock;
import net.mcreator.woncore.block.DarkSign2x3Block;
import net.mcreator.woncore.block.CypressBlock;
import net.mcreator.woncore.block.CyanCrystalBlock;
import net.mcreator.woncore.block.CrateBlock;
import net.mcreator.woncore.block.ComputerBlock;
import net.mcreator.woncore.block.CaissePremiumBlock;
import net.mcreator.woncore.block.CaisseNoelBlock;
import net.mcreator.woncore.block.CaisseClassiqueBlock;
import net.mcreator.woncore.block.BrownCrystalBlock;
import net.mcreator.woncore.block.BlueCrystalBlock;
import net.mcreator.woncore.block.BlackCrystalBlock;
import net.mcreator.woncore.block.BancBlock;
import net.mcreator.woncore.block.BambooWoodBlock;
import net.mcreator.woncore.block.BambooTrapDoorBlock;
import net.mcreator.woncore.block.BambooStairsBlock;
import net.mcreator.woncore.block.BambooSlabBlock;
import net.mcreator.woncore.block.BambooPressurePlateBlock;
import net.mcreator.woncore.block.BambooPlanksBlock;
import net.mcreator.woncore.block.BambooMosaicStairsBlock;
import net.mcreator.woncore.block.BambooMosaicSlabBlock;
import net.mcreator.woncore.block.BambooMosaicBlock;
import net.mcreator.woncore.block.BambooLogBlock;
import net.mcreator.woncore.block.BambooFencegateBlock;
import net.mcreator.woncore.block.BambooFenceBlock;
import net.mcreator.woncore.block.BambooDoorBlock;
import net.mcreator.woncore.block.BambooButtonBlock;
import net.mcreator.woncore.block.AmmunitionBlock;
import net.mcreator.woncore.WoncoreMod;

public class WoncoreModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WoncoreMod.MODID);
	public static final RegistryObject<Block> INVIBLOCK = REGISTRY.register("inviblock", () -> new InviblockBlock());
	public static final RegistryObject<Block> INVILIGHT = REGISTRY.register("invilight", () -> new InvilightBlock());
	public static final RegistryObject<Block> LOGO_WON = REGISTRY.register("logo_won", () -> new LogoWONBlock());
	public static final RegistryObject<Block> WALL_SIGN_2X_3 = REGISTRY.register("wall_sign_2x_3", () -> new WallSign2x3Block());
	public static final RegistryObject<Block> SIGN_2X_3 = REGISTRY.register("sign_2x_3", () -> new Sign2x3Block());
	public static final RegistryObject<Block> DARK_SIGN_2X_3 = REGISTRY.register("dark_sign_2x_3", () -> new DarkSign2x3Block());
	public static final RegistryObject<Block> PALM_LEAVES = REGISTRY.register("palm_leaves", () -> new PalmLeavesBlock());
	public static final RegistryObject<Block> LAMPADAIRE_BASE = REGISTRY.register("lampadaire_base", () -> new LampadaireBaseBlock());
	public static final RegistryObject<Block> LAMPADAIRE_BARRE = REGISTRY.register("lampadaire_barre", () -> new LampadaireBarreBlock());
	public static final RegistryObject<Block> LAMP = REGISTRY.register("lamp", () -> new LampBlock());
	public static final RegistryObject<Block> DOUBLE_LAMP = REGISTRY.register("double_lamp", () -> new DoubleLampBlock());
	public static final RegistryObject<Block> LOGO_2_D = REGISTRY.register("logo_2_d", () -> new Logo2DBlock());
	public static final RegistryObject<Block> LOGO_RED_BANNER = REGISTRY.register("logo_red_banner", () -> new LogoRedBannerBlock());
	public static final RegistryObject<Block> CAISSE_CLASSIQUE = REGISTRY.register("caisse_classique", () -> new CaisseClassiqueBlock());
	public static final RegistryObject<Block> CAISSE_PREMIUM = REGISTRY.register("caisse_premium", () -> new CaissePremiumBlock());
	public static final RegistryObject<Block> CAISSE_NOEL = REGISTRY.register("caisse_noel", () -> new CaisseNoelBlock());
	public static final RegistryObject<Block> MERCURY_ORE = REGISTRY.register("mercury_ore", () -> new MercuryOreBlock());
	public static final RegistryObject<Block> MERCURY = REGISTRY.register("mercury", () -> new MercuryBlock());
	public static final RegistryObject<Block> RENFORCED_CONCRETE = REGISTRY.register("renforced_concrete", () -> new RenforcedConcreteBlock());
	public static final RegistryObject<Block> RENFORCED_CONCRETE_1 = REGISTRY.register("renforced_concrete_1", () -> new RenforcedConcrete1Block());
	public static final RegistryObject<Block> RENFORCED_CONCRETE_2 = REGISTRY.register("renforced_concrete_2", () -> new RenforcedConcrete2Block());
	public static final RegistryObject<Block> CRATE = REGISTRY.register("crate", () -> new CrateBlock());
	public static final RegistryObject<Block> LITTLE_CRATE = REGISTRY.register("little_crate", () -> new LittleCrateBlock());
	public static final RegistryObject<Block> COMPUTER = REGISTRY.register("computer", () -> new ComputerBlock());
	public static final RegistryObject<Block> BAMBOO_WOOD = REGISTRY.register("bamboo_wood", () -> new BambooWoodBlock());
	public static final RegistryObject<Block> BAMBOO_LOG = REGISTRY.register("bamboo_log", () -> new BambooLogBlock());
	public static final RegistryObject<Block> BAMBOO_PLANKS = REGISTRY.register("bamboo_planks", () -> new BambooPlanksBlock());
	public static final RegistryObject<Block> BAMBOO_STAIRS = REGISTRY.register("bamboo_stairs", () -> new BambooStairsBlock());
	public static final RegistryObject<Block> BAMBOO_SLAB = REGISTRY.register("bamboo_slab", () -> new BambooSlabBlock());
	public static final RegistryObject<Block> BAMBOO_FENCE = REGISTRY.register("bamboo_fence", () -> new BambooFenceBlock());
	public static final RegistryObject<Block> BAMBOO_FENCEGATE = REGISTRY.register("bamboo_fencegate", () -> new BambooFencegateBlock());
	public static final RegistryObject<Block> BAMBOO_BUTTON = REGISTRY.register("bamboo_button", () -> new BambooButtonBlock());
	public static final RegistryObject<Block> BAMBOO_DOOR = REGISTRY.register("bamboo_door", () -> new BambooDoorBlock());
	public static final RegistryObject<Block> BAMBOO_TRAP_DOOR = REGISTRY.register("bamboo_trap_door", () -> new BambooTrapDoorBlock());
	public static final RegistryObject<Block> BAMBOO_MOSAIC = REGISTRY.register("bamboo_mosaic", () -> new BambooMosaicBlock());
	public static final RegistryObject<Block> BAMBOO_MOSAIC_STAIRS = REGISTRY.register("bamboo_mosaic_stairs", () -> new BambooMosaicStairsBlock());
	public static final RegistryObject<Block> BAMBOO_MOSAIC_SLAB = REGISTRY.register("bamboo_mosaic_slab", () -> new BambooMosaicSlabBlock());
	public static final RegistryObject<Block> BAMBOO_PRESSURE_PLATE = REGISTRY.register("bamboo_pressure_plate", () -> new BambooPressurePlateBlock());
	public static final RegistryObject<Block> CYPRESS = REGISTRY.register("cypress", () -> new CypressBlock());
	public static final RegistryObject<Block> BANC = REGISTRY.register("banc", () -> new BancBlock());
	public static final RegistryObject<Block> AMMUNITION = REGISTRY.register("ammunition", () -> new AmmunitionBlock());
	public static final RegistryObject<Block> WHITE_CRYSTAL = REGISTRY.register("white_crystal", () -> new WhiteCrystalBlock());
	public static final RegistryObject<Block> YELLOW_CRYSTAL = REGISTRY.register("yellow_crystal", () -> new YellowCrystalBlock());
	public static final RegistryObject<Block> RED_CRYSTAL = REGISTRY.register("red_crystal", () -> new RedCrystalBlock());
	public static final RegistryObject<Block> PURPLE_CRYSTAL = REGISTRY.register("purple_crystal", () -> new PurpleCrystalBlock());
	public static final RegistryObject<Block> PINK_CRYSTAL = REGISTRY.register("pink_crystal", () -> new PinkCrystalBlock());
	public static final RegistryObject<Block> ORANGE_CRYSTAL = REGISTRY.register("orange_crystal", () -> new OrangeCrystalBlock());
	public static final RegistryObject<Block> MAGENTA_CRYSTAL = REGISTRY.register("magenta_crystal", () -> new MagentaCrystalBlock());
	public static final RegistryObject<Block> LIME_CRYSTAL = REGISTRY.register("lime_crystal", () -> new LimeCrystalBlock());
	public static final RegistryObject<Block> LIGHT_GRAY_CRYSTAL = REGISTRY.register("light_gray_crystal", () -> new LightGrayCrystalBlock());
	public static final RegistryObject<Block> LIGHT_BLUE_CRYSTAL = REGISTRY.register("light_blue_crystal", () -> new LightBlueCrystalBlock());
	public static final RegistryObject<Block> GREEN_CRYSTAL = REGISTRY.register("green_crystal", () -> new GreenCrystalBlock());
	public static final RegistryObject<Block> GRAY_CRYSTAL = REGISTRY.register("gray_crystal", () -> new GrayCrystalBlock());
	public static final RegistryObject<Block> CYAN_CRYSTAL = REGISTRY.register("cyan_crystal", () -> new CyanCrystalBlock());
	public static final RegistryObject<Block> BROWN_CRYSTAL = REGISTRY.register("brown_crystal", () -> new BrownCrystalBlock());
	public static final RegistryObject<Block> BLUE_CRYSTAL = REGISTRY.register("blue_crystal", () -> new BlueCrystalBlock());
	public static final RegistryObject<Block> BLACK_CRYSTAL = REGISTRY.register("black_crystal", () -> new BlackCrystalBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			InviblockBlock.registerRenderLayer();
			InvilightBlock.registerRenderLayer();
			LogoWONBlock.registerRenderLayer();
			WallSign2x3Block.registerRenderLayer();
			PalmLeavesBlock.registerRenderLayer();
			LampadaireBaseBlock.registerRenderLayer();
			LampadaireBarreBlock.registerRenderLayer();
			LampBlock.registerRenderLayer();
			DoubleLampBlock.registerRenderLayer();
			Logo2DBlock.registerRenderLayer();
			LogoRedBannerBlock.registerRenderLayer();
			CaisseClassiqueBlock.registerRenderLayer();
			CaissePremiumBlock.registerRenderLayer();
			CaisseNoelBlock.registerRenderLayer();
			CrateBlock.registerRenderLayer();
			LittleCrateBlock.registerRenderLayer();
			ComputerBlock.registerRenderLayer();
			CypressBlock.registerRenderLayer();
			BancBlock.registerRenderLayer();
			AmmunitionBlock.registerRenderLayer();
			WhiteCrystalBlock.registerRenderLayer();
			YellowCrystalBlock.registerRenderLayer();
			RedCrystalBlock.registerRenderLayer();
			PurpleCrystalBlock.registerRenderLayer();
			PinkCrystalBlock.registerRenderLayer();
			OrangeCrystalBlock.registerRenderLayer();
			MagentaCrystalBlock.registerRenderLayer();
			LimeCrystalBlock.registerRenderLayer();
			LightGrayCrystalBlock.registerRenderLayer();
			LightBlueCrystalBlock.registerRenderLayer();
			GreenCrystalBlock.registerRenderLayer();
			GrayCrystalBlock.registerRenderLayer();
			CyanCrystalBlock.registerRenderLayer();
			BrownCrystalBlock.registerRenderLayer();
			BlueCrystalBlock.registerRenderLayer();
			BlackCrystalBlock.registerRenderLayer();
		}
	}
}
