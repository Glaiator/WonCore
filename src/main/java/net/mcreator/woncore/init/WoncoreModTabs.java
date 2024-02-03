
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.woncore.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class WoncoreModTabs {
	public static CreativeModeTab TAB_ADMIN;
	public static CreativeModeTab TAB_WORLD_OF_NATIONS_BLOCKS;
	public static CreativeModeTab TAB_TOOLS;
	public static CreativeModeTab TAB_ITEMS;
	public static CreativeModeTab TAB_COMBAT;
	public static CreativeModeTab TAB_COMPONENTS;

	public static void load() {
		TAB_ADMIN = new CreativeModeTab("tabadmin") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(WoncoreModBlocks.INVIBLOCK.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_WORLD_OF_NATIONS_BLOCKS = new CreativeModeTab("tabworld_of_nations_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(WoncoreModBlocks.RENFORCED_CONCRETE_2.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TOOLS = new CreativeModeTab("tabtools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(WoncoreModItems.MULTITOOL.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ITEMS = new CreativeModeTab("tabitems") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(WoncoreModItems.MONEY.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_COMBAT = new CreativeModeTab("tabcombat") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(WoncoreModItems.MASTODONTE_CHESTPLATE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_COMPONENTS = new CreativeModeTab("tabcomponents") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(WoncoreModItems.ADVANCED_ENGINE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
