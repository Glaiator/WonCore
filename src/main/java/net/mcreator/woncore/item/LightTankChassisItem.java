
package net.mcreator.woncore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.woncore.init.WoncoreModTabs;

public class LightTankChassisItem extends Item {
	public LightTankChassisItem() {
		super(new Item.Properties().tab(WoncoreModTabs.TAB_COMPONENTS).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public int getEnchantmentValue() {
		return -1;
	}
}
