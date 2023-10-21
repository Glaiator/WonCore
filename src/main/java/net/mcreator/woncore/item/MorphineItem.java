
package net.mcreator.woncore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class MorphineItem extends Item {
	public MorphineItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_BREWING).stacksTo(1).rarity(Rarity.COMMON));
	}
}
