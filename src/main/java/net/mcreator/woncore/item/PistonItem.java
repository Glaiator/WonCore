
package net.mcreator.woncore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.woncore.init.WoncoreModTabs;

public class PistonItem extends Item {
	public PistonItem() {
		super(new Item.Properties().tab(WoncoreModTabs.TAB_COMPONENTS).stacksTo(16).rarity(Rarity.COMMON));
	}
}
