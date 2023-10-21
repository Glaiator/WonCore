
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.woncore.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class WoncoreModTabs {
	public static CreativeModeTab TAB_WON_STUFF;
	public static CreativeModeTab TAB_ADMIN;
	public static CreativeModeTab TAB_WON_ITEMS;
	public static CreativeModeTab TAB_WORLD_OF_NATIONS_BLOCKS;

	public static void load() {
		TAB_WON_STUFF = new CreativeModeTab("tabwon_stuff") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(WoncoreModItems.MASTODONTE_HELMET.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
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
		TAB_WON_ITEMS = new CreativeModeTab("tabwon_items") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(WoncoreModItems.USB_KEY.get());
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
	}
}
