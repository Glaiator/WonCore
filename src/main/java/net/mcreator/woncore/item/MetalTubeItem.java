
package net.mcreator.woncore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.woncore.init.WoncoreModTabs;

public class MetalTubeItem extends Item {
	public MetalTubeItem() {
		super(new Item.Properties().tab(WoncoreModTabs.TAB_COMPONENTS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
