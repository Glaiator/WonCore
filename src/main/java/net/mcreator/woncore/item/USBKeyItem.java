
package net.mcreator.woncore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.woncore.init.WoncoreModTabs;

public class USBKeyItem extends Item {
	public USBKeyItem() {
		super(new Item.Properties().tab(WoncoreModTabs.TAB_WON_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}
}