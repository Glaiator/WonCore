
package net.mcreator.woncore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.woncore.init.WoncoreModTabs;

public class NuclearBatteryItem extends Item {
	public NuclearBatteryItem() {
		super(new Item.Properties().tab(WoncoreModTabs.TAB_ITEMS).stacksTo(64).rarity(Rarity.RARE));
	}
}
