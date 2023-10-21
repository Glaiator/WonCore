
package net.mcreator.woncore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.woncore.init.WoncoreModTabs;

public class RingItem extends Item {
	public RingItem() {
		super(new Item.Properties().tab(WoncoreModTabs.TAB_WON_ITEMS).stacksTo(1).rarity(Rarity.COMMON));
	}
}
