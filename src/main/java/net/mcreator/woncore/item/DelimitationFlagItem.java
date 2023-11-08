
package net.mcreator.woncore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.woncore.init.WoncoreModTabs;

public class DelimitationFlagItem extends Item {
	public DelimitationFlagItem() {
		super(new Item.Properties().tab(WoncoreModTabs.TAB_TOOLS).stacksTo(1).rarity(Rarity.COMMON));
	}
}
