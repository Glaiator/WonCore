
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.woncore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.woncore.item.WheelItem;
import net.mcreator.woncore.item.VoidStoneItem;
import net.mcreator.woncore.item.USBKeyItem;
import net.mcreator.woncore.item.TankguncannonItem;
import net.mcreator.woncore.item.TankcannonItem;
import net.mcreator.woncore.item.TankTrackItem;
import net.mcreator.woncore.item.TacticalItem;
import net.mcreator.woncore.item.TacticalArmorItem;
import net.mcreator.woncore.item.SteelShieldItem;
import net.mcreator.woncore.item.StatuetteItem;
import net.mcreator.woncore.item.SpringItem;
import net.mcreator.woncore.item.SolidSuitX407Item;
import net.mcreator.woncore.item.SoldierItem;
import net.mcreator.woncore.item.SkullItem;
import net.mcreator.woncore.item.SeatItem;
import net.mcreator.woncore.item.SatchelItem;
import net.mcreator.woncore.item.SaphireItem;
import net.mcreator.woncore.item.SabreItem;
import net.mcreator.woncore.item.RubyItem;
import net.mcreator.woncore.item.RingItem;
import net.mcreator.woncore.item.ReinforcedPlatingItem;
import net.mcreator.woncore.item.ReceiverItem;
import net.mcreator.woncore.item.ProcessorItem;
import net.mcreator.woncore.item.PlaneChassisItem;
import net.mcreator.woncore.item.PistonItem;
import net.mcreator.woncore.item.PieceOrItem;
import net.mcreator.woncore.item.PieceFerItem;
import net.mcreator.woncore.item.PieceEmeraudeItem;
import net.mcreator.woncore.item.PieceDiamantItem;
import net.mcreator.woncore.item.PieceBronzeItem;
import net.mcreator.woncore.item.PhoneItem;
import net.mcreator.woncore.item.NuclearBatteryItem;
import net.mcreator.woncore.item.MultitoolPickaxeItem;
import net.mcreator.woncore.item.MultitoolFarmerItem;
import net.mcreator.woncore.item.MultitoolAxeItem;
import net.mcreator.woncore.item.MultiToolsItem;
import net.mcreator.woncore.item.MorphineItem;
import net.mcreator.woncore.item.MoneyItem;
import net.mcreator.woncore.item.MetalTubeItem;
import net.mcreator.woncore.item.MetalRodItem;
import net.mcreator.woncore.item.MetalPlateItem;
import net.mcreator.woncore.item.MercuryItem;
import net.mcreator.woncore.item.MediumTankChassisItem;
import net.mcreator.woncore.item.MedicalKitItem;
import net.mcreator.woncore.item.MedicalBagItem;
import net.mcreator.woncore.item.MatraqueItem;
import net.mcreator.woncore.item.MastodonteItem;
import net.mcreator.woncore.item.ManaItem;
import net.mcreator.woncore.item.MagazineItem;
import net.mcreator.woncore.item.LightTankChassisItem;
import net.mcreator.woncore.item.LeatherClothesItem;
import net.mcreator.woncore.item.KeyItem;
import net.mcreator.woncore.item.Key2Item;
import net.mcreator.woncore.item.KevlarItem;
import net.mcreator.woncore.item.KatanaItem;
import net.mcreator.woncore.item.InfantryItem;
import net.mcreator.woncore.item.HighVoltageBatteryItem;
import net.mcreator.woncore.item.HighCapacityBatteryItem;
import net.mcreator.woncore.item.HeavyTankChassisItem;
import net.mcreator.woncore.item.HardenedLeatherItem;
import net.mcreator.woncore.item.HardenedLeatherIngotItem;
import net.mcreator.woncore.item.GunBarrelItem;
import net.mcreator.woncore.item.GripItem;
import net.mcreator.woncore.item.GlassLensItem;
import net.mcreator.woncore.item.GachetteItem;
import net.mcreator.woncore.item.FuturisticEngineItem;
import net.mcreator.woncore.item.FuturisteArmorItem;
import net.mcreator.woncore.item.FlagItem;
import net.mcreator.woncore.item.EvolvedProcessorItem;
import net.mcreator.woncore.item.EngrenageItem;
import net.mcreator.woncore.item.EngineItem;
import net.mcreator.woncore.item.DelimitationFlagItem;
import net.mcreator.woncore.item.CrownItem;
import net.mcreator.woncore.item.Crown2Item;
import net.mcreator.woncore.item.CrosseItem;
import net.mcreator.woncore.item.CrankShaftItem;
import net.mcreator.woncore.item.CarChassisItem;
import net.mcreator.woncore.item.BurningPickaxeItem;
import net.mcreator.woncore.item.BlueprintItem;
import net.mcreator.woncore.item.BatonninjaItem;
import net.mcreator.woncore.item.BandageItem;
import net.mcreator.woncore.item.BagItem;
import net.mcreator.woncore.item.ArmorPlateItem;
import net.mcreator.woncore.item.AgentArmorItem;
import net.mcreator.woncore.item.AerogelItem;
import net.mcreator.woncore.item.AdvancedProcessorItem;
import net.mcreator.woncore.item.AdvancedEngineItem;
import net.mcreator.woncore.WoncoreMod;

public class WoncoreModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WoncoreMod.MODID);
	public static final RegistryObject<Item> VOID_STONE = REGISTRY.register("void_stone", () -> new VoidStoneItem());
	public static final RegistryObject<Item> MASTODONTE_HELMET = REGISTRY.register("mastodonte_helmet", () -> new MastodonteItem.Helmet());
	public static final RegistryObject<Item> MASTODONTE_CHESTPLATE = REGISTRY.register("mastodonte_chestplate", () -> new MastodonteItem.Chestplate());
	public static final RegistryObject<Item> MASTODONTE_LEGGINGS = REGISTRY.register("mastodonte_leggings", () -> new MastodonteItem.Leggings());
	public static final RegistryObject<Item> MASTODONTE_BOOTS = REGISTRY.register("mastodonte_boots", () -> new MastodonteItem.Boots());
	public static final RegistryObject<Item> DELIMITATION_FLAG = REGISTRY.register("delimitation_flag", () -> new DelimitationFlagItem());
	public static final RegistryObject<Item> INVIBLOCK = block(WoncoreModBlocks.INVIBLOCK, WoncoreModTabs.TAB_ADMIN);
	public static final RegistryObject<Item> INVILIGHT = block(WoncoreModBlocks.INVILIGHT, WoncoreModTabs.TAB_ADMIN);
	public static final RegistryObject<Item> MONEY = REGISTRY.register("money", () -> new MoneyItem());
	public static final RegistryObject<Item> PHONE = REGISTRY.register("phone", () -> new PhoneItem());
	public static final RegistryObject<Item> SABRE = REGISTRY.register("sabre", () -> new SabreItem());
	public static final RegistryObject<Item> USB_KEY = REGISTRY.register("usb_key", () -> new USBKeyItem());
	public static final RegistryObject<Item> HARDENED_LEATHER_HELMET = REGISTRY.register("hardened_leather_helmet", () -> new HardenedLeatherItem.Helmet());
	public static final RegistryObject<Item> HARDENED_LEATHER_CHESTPLATE = REGISTRY.register("hardened_leather_chestplate", () -> new HardenedLeatherItem.Chestplate());
	public static final RegistryObject<Item> HARDENED_LEATHER_LEGGINGS = REGISTRY.register("hardened_leather_leggings", () -> new HardenedLeatherItem.Leggings());
	public static final RegistryObject<Item> HARDENED_LEATHER_BOOTS = REGISTRY.register("hardened_leather_boots", () -> new HardenedLeatherItem.Boots());
	public static final RegistryObject<Item> LOGO_WON = block(WoncoreModBlocks.LOGO_WON, WoncoreModTabs.TAB_ADMIN);
	public static final RegistryObject<Item> WALL_SIGN_2X_3 = block(WoncoreModBlocks.WALL_SIGN_2X_3, WoncoreModTabs.TAB_ADMIN);
	public static final RegistryObject<Item> SIGN_2X_3 = block(WoncoreModBlocks.SIGN_2X_3, WoncoreModTabs.TAB_ADMIN);
	public static final RegistryObject<Item> DARK_SIGN_2X_3 = block(WoncoreModBlocks.DARK_SIGN_2X_3, WoncoreModTabs.TAB_ADMIN);
	public static final RegistryObject<Item> PALM_LEAVES = block(WoncoreModBlocks.PALM_LEAVES, WoncoreModTabs.TAB_ADMIN);
	public static final RegistryObject<Item> BANDAGE = REGISTRY.register("bandage", () -> new BandageItem());
	public static final RegistryObject<Item> MEDICAL_BAG = REGISTRY.register("medical_bag", () -> new MedicalBagItem());
	public static final RegistryObject<Item> MEDICAL_KIT = REGISTRY.register("medical_kit", () -> new MedicalKitItem());
	public static final RegistryObject<Item> MORPHINE = REGISTRY.register("morphine", () -> new MorphineItem());
	public static final RegistryObject<Item> LAMPADAIRE_BASE = block(WoncoreModBlocks.LAMPADAIRE_BASE, WoncoreModTabs.TAB_ADMIN);
	public static final RegistryObject<Item> LAMPADAIRE_BARRE = block(WoncoreModBlocks.LAMPADAIRE_BARRE, WoncoreModTabs.TAB_ADMIN);
	public static final RegistryObject<Item> LAMP = block(WoncoreModBlocks.LAMP, WoncoreModTabs.TAB_ADMIN);
	public static final RegistryObject<Item> DOUBLE_LAMP = block(WoncoreModBlocks.DOUBLE_LAMP, WoncoreModTabs.TAB_ADMIN);
	public static final RegistryObject<Item> LOGO_2_D = block(WoncoreModBlocks.LOGO_2_D, WoncoreModTabs.TAB_ADMIN);
	public static final RegistryObject<Item> LOGO_RED_BANNER = block(WoncoreModBlocks.LOGO_RED_BANNER, WoncoreModTabs.TAB_ADMIN);
	public static final RegistryObject<Item> METAL_PLATE = REGISTRY.register("metal_plate", () -> new MetalPlateItem());
	public static final RegistryObject<Item> KEVLAR = REGISTRY.register("kevlar", () -> new KevlarItem());
	public static final RegistryObject<Item> AEROGEL = REGISTRY.register("aerogel", () -> new AerogelItem());
	public static final RegistryObject<Item> NUCLEAR_BATTERY = REGISTRY.register("nuclear_battery", () -> new NuclearBatteryItem());
	public static final RegistryObject<Item> HIGH_CAPACITY_BATTERY = REGISTRY.register("high_capacity_battery", () -> new HighCapacityBatteryItem());
	public static final RegistryObject<Item> HIGH_VOLTAGE_BATTERY = REGISTRY.register("high_voltage_battery", () -> new HighVoltageBatteryItem());
	public static final RegistryObject<Item> GUN_BARREL = REGISTRY.register("gun_barrel", () -> new GunBarrelItem());
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> SAPHIRE = REGISTRY.register("saphire", () -> new SaphireItem());
	public static final RegistryObject<Item> SOLDIER_HELMET = REGISTRY.register("soldier_helmet", () -> new SoldierItem.Helmet());
	public static final RegistryObject<Item> SOLDIER_CHESTPLATE = REGISTRY.register("soldier_chestplate", () -> new SoldierItem.Chestplate());
	public static final RegistryObject<Item> SOLDIER_BOOTS = REGISTRY.register("soldier_boots", () -> new SoldierItem.Boots());
	public static final RegistryObject<Item> LEATHER_CLOTHES_HELMET = REGISTRY.register("leather_clothes_helmet", () -> new LeatherClothesItem.Helmet());
	public static final RegistryObject<Item> LEATHER_CLOTHES_CHESTPLATE = REGISTRY.register("leather_clothes_chestplate", () -> new LeatherClothesItem.Chestplate());
	public static final RegistryObject<Item> LEATHER_CLOTHES_LEGGINGS = REGISTRY.register("leather_clothes_leggings", () -> new LeatherClothesItem.Leggings());
	public static final RegistryObject<Item> LEATHER_CLOTHES_BOOTS = REGISTRY.register("leather_clothes_boots", () -> new LeatherClothesItem.Boots());
	public static final RegistryObject<Item> TACTICAL_HELMET = REGISTRY.register("tactical_helmet", () -> new TacticalItem.Helmet());
	public static final RegistryObject<Item> TACTICAL_CHESTPLATE = REGISTRY.register("tactical_chestplate", () -> new TacticalItem.Chestplate());
	public static final RegistryObject<Item> INFANTRY_HELMET = REGISTRY.register("infantry_helmet", () -> new InfantryItem.Helmet());
	public static final RegistryObject<Item> SOLID_SUIT_X_407_HELMET = REGISTRY.register("solid_suit_x_407_helmet", () -> new SolidSuitX407Item.Helmet());
	public static final RegistryObject<Item> SOLID_SUIT_X_407_CHESTPLATE = REGISTRY.register("solid_suit_x_407_chestplate", () -> new SolidSuitX407Item.Chestplate());
	public static final RegistryObject<Item> SOLID_SUIT_X_407_LEGGINGS = REGISTRY.register("solid_suit_x_407_leggings", () -> new SolidSuitX407Item.Leggings());
	public static final RegistryObject<Item> SOLID_SUIT_X_407_BOOTS = REGISTRY.register("solid_suit_x_407_boots", () -> new SolidSuitX407Item.Boots());
	public static final RegistryObject<Item> CROWN_HELMET = REGISTRY.register("crown_helmet", () -> new CrownItem.Helmet());
	public static final RegistryObject<Item> CROWN_2_HELMET = REGISTRY.register("crown_2_helmet", () -> new Crown2Item.Helmet());
	public static final RegistryObject<Item> CAISSE_CLASSIQUE = block(WoncoreModBlocks.CAISSE_CLASSIQUE, WoncoreModTabs.TAB_ADMIN);
	public static final RegistryObject<Item> CAISSE_PREMIUM = block(WoncoreModBlocks.CAISSE_PREMIUM, WoncoreModTabs.TAB_ADMIN);
	public static final RegistryObject<Item> CAISSE_NOEL = block(WoncoreModBlocks.CAISSE_NOEL, WoncoreModTabs.TAB_ADMIN);
	public static final RegistryObject<Item> MERCURY_ORE = block(WoncoreModBlocks.MERCURY_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MERCURY_BUCKET = REGISTRY.register("mercury_bucket", () -> new MercuryItem());
	public static final RegistryObject<Item> MANA = REGISTRY.register("mana", () -> new ManaItem());
	public static final RegistryObject<Item> RING = REGISTRY.register("ring", () -> new RingItem());
	public static final RegistryObject<Item> KEY = REGISTRY.register("key", () -> new KeyItem());
	public static final RegistryObject<Item> KEY_2 = REGISTRY.register("key_2", () -> new Key2Item());
	public static final RegistryObject<Item> SATCHEL = REGISTRY.register("satchel", () -> new SatchelItem());
	public static final RegistryObject<Item> BAG = REGISTRY.register("bag", () -> new BagItem());
	public static final RegistryObject<Item> HARDENED_LEATHER_INGOT = REGISTRY.register("hardened_leather_ingot", () -> new HardenedLeatherIngotItem());
	public static final RegistryObject<Item> FLAG = REGISTRY.register("flag", () -> new FlagItem());
	public static final RegistryObject<Item> SKULL = REGISTRY.register("skull", () -> new SkullItem());
	public static final RegistryObject<Item> BLUEPRINT = REGISTRY.register("blueprint", () -> new BlueprintItem());
	public static final RegistryObject<Item> RENFORCED_CONCRETE = block(WoncoreModBlocks.RENFORCED_CONCRETE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RENFORCED_CONCRETE_1 = block(WoncoreModBlocks.RENFORCED_CONCRETE_1, null);
	public static final RegistryObject<Item> RENFORCED_CONCRETE_2 = block(WoncoreModBlocks.RENFORCED_CONCRETE_2, null);
	public static final RegistryObject<Item> CRATE = block(WoncoreModBlocks.CRATE, WoncoreModTabs.TAB_WORLD_OF_NATIONS_BLOCKS);
	public static final RegistryObject<Item> LITTLE_CRATE = block(WoncoreModBlocks.LITTLE_CRATE, WoncoreModTabs.TAB_WORLD_OF_NATIONS_BLOCKS);
	public static final RegistryObject<Item> COMPUTER = block(WoncoreModBlocks.COMPUTER, WoncoreModTabs.TAB_WORLD_OF_NATIONS_BLOCKS);
	public static final RegistryObject<Item> BAMBOO_WOOD = block(WoncoreModBlocks.BAMBOO_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAMBOO_LOG = block(WoncoreModBlocks.BAMBOO_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAMBOO_PLANKS = block(WoncoreModBlocks.BAMBOO_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAMBOO_STAIRS = block(WoncoreModBlocks.BAMBOO_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAMBOO_SLAB = block(WoncoreModBlocks.BAMBOO_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAMBOO_FENCE = block(WoncoreModBlocks.BAMBOO_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BAMBOO_FENCEGATE = block(WoncoreModBlocks.BAMBOO_FENCEGATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> BAMBOO_BUTTON = block(WoncoreModBlocks.BAMBOO_BUTTON, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> BAMBOO_DOOR = doubleBlock(WoncoreModBlocks.BAMBOO_DOOR, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> BAMBOO_TRAP_DOOR = block(WoncoreModBlocks.BAMBOO_TRAP_DOOR, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> BAMBOO_MOSAIC = block(WoncoreModBlocks.BAMBOO_MOSAIC, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAMBOO_MOSAIC_STAIRS = block(WoncoreModBlocks.BAMBOO_MOSAIC_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAMBOO_MOSAIC_SLAB = block(WoncoreModBlocks.BAMBOO_MOSAIC_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAMBOO_PRESSURE_PLATE = block(WoncoreModBlocks.BAMBOO_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> CYPRESS = block(WoncoreModBlocks.CYPRESS, WoncoreModTabs.TAB_WORLD_OF_NATIONS_BLOCKS);
	public static final RegistryObject<Item> BANC = block(WoncoreModBlocks.BANC, WoncoreModTabs.TAB_WORLD_OF_NATIONS_BLOCKS);
	public static final RegistryObject<Item> AMMUNITION = block(WoncoreModBlocks.AMMUNITION, WoncoreModTabs.TAB_WORLD_OF_NATIONS_BLOCKS);
	public static final RegistryObject<Item> GLASS_LENS = REGISTRY.register("glass_lens", () -> new GlassLensItem());
	public static final RegistryObject<Item> REINFORCED_PLATING = REGISTRY.register("reinforced_plating", () -> new ReinforcedPlatingItem());
	public static final RegistryObject<Item> SPRING = REGISTRY.register("spring", () -> new SpringItem());
	public static final RegistryObject<Item> WHITE_CRYSTAL = block(WoncoreModBlocks.WHITE_CRYSTAL, WoncoreModTabs.TAB_WORLD_OF_NATIONS_BLOCKS);
	public static final RegistryObject<Item> YELLOW_CRYSTAL = block(WoncoreModBlocks.YELLOW_CRYSTAL, WoncoreModTabs.TAB_WORLD_OF_NATIONS_BLOCKS);
	public static final RegistryObject<Item> RED_CRYSTAL = block(WoncoreModBlocks.RED_CRYSTAL, WoncoreModTabs.TAB_WORLD_OF_NATIONS_BLOCKS);
	public static final RegistryObject<Item> PURPLE_CRYSTAL = block(WoncoreModBlocks.PURPLE_CRYSTAL, WoncoreModTabs.TAB_WORLD_OF_NATIONS_BLOCKS);
	public static final RegistryObject<Item> PINK_CRYSTAL = block(WoncoreModBlocks.PINK_CRYSTAL, WoncoreModTabs.TAB_WORLD_OF_NATIONS_BLOCKS);
	public static final RegistryObject<Item> ORANGE_CRYSTAL = block(WoncoreModBlocks.ORANGE_CRYSTAL, WoncoreModTabs.TAB_WORLD_OF_NATIONS_BLOCKS);
	public static final RegistryObject<Item> MAGENTA_CRYSTAL = block(WoncoreModBlocks.MAGENTA_CRYSTAL, WoncoreModTabs.TAB_WORLD_OF_NATIONS_BLOCKS);
	public static final RegistryObject<Item> LIME_CRYSTAL = block(WoncoreModBlocks.LIME_CRYSTAL, WoncoreModTabs.TAB_WORLD_OF_NATIONS_BLOCKS);
	public static final RegistryObject<Item> LIGHT_GRAY_CRYSTAL = block(WoncoreModBlocks.LIGHT_GRAY_CRYSTAL, WoncoreModTabs.TAB_WORLD_OF_NATIONS_BLOCKS);
	public static final RegistryObject<Item> LIGHT_BLUE_CRYSTAL = block(WoncoreModBlocks.LIGHT_BLUE_CRYSTAL, WoncoreModTabs.TAB_WORLD_OF_NATIONS_BLOCKS);
	public static final RegistryObject<Item> GREEN_CRYSTAL = block(WoncoreModBlocks.GREEN_CRYSTAL, WoncoreModTabs.TAB_WORLD_OF_NATIONS_BLOCKS);
	public static final RegistryObject<Item> GRAY_CRYSTAL = block(WoncoreModBlocks.GRAY_CRYSTAL, WoncoreModTabs.TAB_WORLD_OF_NATIONS_BLOCKS);
	public static final RegistryObject<Item> CYAN_CRYSTAL = block(WoncoreModBlocks.CYAN_CRYSTAL, WoncoreModTabs.TAB_WORLD_OF_NATIONS_BLOCKS);
	public static final RegistryObject<Item> BROWN_CRYSTAL = block(WoncoreModBlocks.BROWN_CRYSTAL, WoncoreModTabs.TAB_WORLD_OF_NATIONS_BLOCKS);
	public static final RegistryObject<Item> BLUE_CRYSTAL = block(WoncoreModBlocks.BLUE_CRYSTAL, WoncoreModTabs.TAB_WORLD_OF_NATIONS_BLOCKS);
	public static final RegistryObject<Item> BLACK_CRYSTAL = block(WoncoreModBlocks.BLACK_CRYSTAL, WoncoreModTabs.TAB_WORLD_OF_NATIONS_BLOCKS);
	public static final RegistryObject<Item> KATANA = REGISTRY.register("katana", () -> new KatanaItem());
	public static final RegistryObject<Item> MAGAZINE = REGISTRY.register("magazine", () -> new MagazineItem());
	public static final RegistryObject<Item> GACHETTE = REGISTRY.register("gachette", () -> new GachetteItem());
	public static final RegistryObject<Item> FUTURISTE_ARMOR_HELMET = REGISTRY.register("futuriste_armor_helmet", () -> new FuturisteArmorItem.Helmet());
	public static final RegistryObject<Item> FUTURISTE_ARMOR_CHESTPLATE = REGISTRY.register("futuriste_armor_chestplate", () -> new FuturisteArmorItem.Chestplate());
	public static final RegistryObject<Item> FUTURISTE_ARMOR_LEGGINGS = REGISTRY.register("futuriste_armor_leggings", () -> new FuturisteArmorItem.Leggings());
	public static final RegistryObject<Item> FUTURISTE_ARMOR_BOOTS = REGISTRY.register("futuriste_armor_boots", () -> new FuturisteArmorItem.Boots());
	public static final RegistryObject<Item> GRIP = REGISTRY.register("grip", () -> new GripItem());
	public static final RegistryObject<Item> TACTICAL_ARMOR_HELMET = REGISTRY.register("tactical_armor_helmet", () -> new TacticalArmorItem.Helmet());
	public static final RegistryObject<Item> TACTICAL_ARMOR_CHESTPLATE = REGISTRY.register("tactical_armor_chestplate", () -> new TacticalArmorItem.Chestplate());
	public static final RegistryObject<Item> TACTICAL_ARMOR_LEGGINGS = REGISTRY.register("tactical_armor_leggings", () -> new TacticalArmorItem.Leggings());
	public static final RegistryObject<Item> TACTICAL_ARMOR_BOOTS = REGISTRY.register("tactical_armor_boots", () -> new TacticalArmorItem.Boots());
	public static final RegistryObject<Item> CROSSE = REGISTRY.register("crosse", () -> new CrosseItem());
	public static final RegistryObject<Item> AGENT_ARMOR_HELMET = REGISTRY.register("agent_armor_helmet", () -> new AgentArmorItem.Helmet());
	public static final RegistryObject<Item> AGENT_ARMOR_CHESTPLATE = REGISTRY.register("agent_armor_chestplate", () -> new AgentArmorItem.Chestplate());
	public static final RegistryObject<Item> AGENT_ARMOR_LEGGINGS = REGISTRY.register("agent_armor_leggings", () -> new AgentArmorItem.Leggings());
	public static final RegistryObject<Item> AGENT_ARMOR_BOOTS = REGISTRY.register("agent_armor_boots", () -> new AgentArmorItem.Boots());
	public static final RegistryObject<Item> RECEIVER = REGISTRY.register("receiver", () -> new ReceiverItem());
	public static final RegistryObject<Item> MATRAQUE = REGISTRY.register("matraque", () -> new MatraqueItem());
	public static final RegistryObject<Item> BATONNINJA = REGISTRY.register("batonninja", () -> new BatonninjaItem());
	public static final RegistryObject<Item> STATUETTE = REGISTRY.register("statuette", () -> new StatuetteItem());
	public static final RegistryObject<Item> PIECE_DIAMANT = REGISTRY.register("piece_diamant", () -> new PieceDiamantItem());
	public static final RegistryObject<Item> PIECE_EMERAUDE = REGISTRY.register("piece_emeraude", () -> new PieceEmeraudeItem());
	public static final RegistryObject<Item> PIECE_OR = REGISTRY.register("piece_or", () -> new PieceOrItem());
	public static final RegistryObject<Item> PIECE_FER = REGISTRY.register("piece_fer", () -> new PieceFerItem());
	public static final RegistryObject<Item> PIECE_BRONZE = REGISTRY.register("piece_bronze", () -> new PieceBronzeItem());
	public static final RegistryObject<Item> ENGINE = REGISTRY.register("engine", () -> new EngineItem());
	public static final RegistryObject<Item> ADVANCED_ENGINE = REGISTRY.register("advanced_engine", () -> new AdvancedEngineItem());
	public static final RegistryObject<Item> CAR_CHASSIS = REGISTRY.register("car_chassis", () -> new CarChassisItem());
	public static final RegistryObject<Item> PLANE_CHASSIS = REGISTRY.register("plane_chassis", () -> new PlaneChassisItem());
	public static final RegistryObject<Item> LIGHT_TANK_CHASSIS = REGISTRY.register("light_tank_chassis", () -> new LightTankChassisItem());
	public static final RegistryObject<Item> MEDIUM_TANK_CHASSIS = REGISTRY.register("medium_tank_chassis", () -> new MediumTankChassisItem());
	public static final RegistryObject<Item> HEAVY_TANK_CHASSIS = REGISTRY.register("heavy_tank_chassis", () -> new HeavyTankChassisItem());
	public static final RegistryObject<Item> WHEEL = REGISTRY.register("wheel", () -> new WheelItem());
	public static final RegistryObject<Item> SEAT = REGISTRY.register("seat", () -> new SeatItem());
	public static final RegistryObject<Item> PISTON = REGISTRY.register("piston", () -> new PistonItem());
	public static final RegistryObject<Item> TANKCANNON = REGISTRY.register("tankcannon", () -> new TankcannonItem());
	public static final RegistryObject<Item> TANKGUNCANNON = REGISTRY.register("tankguncannon", () -> new TankguncannonItem());
	public static final RegistryObject<Item> ENGRENAGE = REGISTRY.register("engrenage", () -> new EngrenageItem());
	public static final RegistryObject<Item> PROCESSOR = REGISTRY.register("processor", () -> new ProcessorItem());
	public static final RegistryObject<Item> ADVANCED_PROCESSOR = REGISTRY.register("advanced_processor", () -> new AdvancedProcessorItem());
	public static final RegistryObject<Item> EVOLVED_PROCESSOR = REGISTRY.register("evolved_processor", () -> new EvolvedProcessorItem());
	public static final RegistryObject<Item> STEEL_SHIELD = REGISTRY.register("steel_shield", () -> new SteelShieldItem());
	public static final RegistryObject<Item> CRANK_SHAFT = REGISTRY.register("crank_shaft", () -> new CrankShaftItem());
	public static final RegistryObject<Item> TANK_TRACK = REGISTRY.register("tank_track", () -> new TankTrackItem());
	public static final RegistryObject<Item> METAL_TUBE = REGISTRY.register("metal_tube", () -> new MetalTubeItem());
	public static final RegistryObject<Item> METAL_ROD = REGISTRY.register("metal_rod", () -> new MetalRodItem());
	public static final RegistryObject<Item> FUTURISTIC_ENGINE = REGISTRY.register("futuristic_engine", () -> new FuturisticEngineItem());
	public static final RegistryObject<Item> ARMOR_PLATE = REGISTRY.register("armor_plate", () -> new ArmorPlateItem());
	public static final RegistryObject<Item> MULTI_TOOLS = REGISTRY.register("multi_tools", () -> new MultiToolsItem());
	public static final RegistryObject<Item> BURNING_PICKAXE = REGISTRY.register("burning_pickaxe", () -> new BurningPickaxeItem());
	public static final RegistryObject<Item> MULTITOOL_PICKAXE = REGISTRY.register("multitool_pickaxe", () -> new MultitoolPickaxeItem());
	public static final RegistryObject<Item> MULTITOOL_AXE = REGISTRY.register("multitool_axe", () -> new MultitoolAxeItem());
	public static final RegistryObject<Item> MULTITOOL_FARMER = REGISTRY.register("multitool_farmer", () -> new MultitoolFarmerItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
