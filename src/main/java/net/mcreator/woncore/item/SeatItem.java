
package net.mcreator.woncore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.woncore.init.WoncoreModTabs;

public class SeatItem extends Item {
	public SeatItem() {
		super(new Item.Properties().tab(WoncoreModTabs.TAB_COMPONENTS).stacksTo(8).rarity(Rarity.COMMON));
	}

	@Override
	public int getEnchantmentValue() {
		return -1;
	}
}
