
package net.mcreator.woncore.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.woncore.init.WoncoreModTabs;

public class VoidStoneItem extends Item {
	public VoidStoneItem() {
		super(new Item.Properties().tab(WoncoreModTabs.TAB_ITEMS).durability(7000).rarity(Rarity.UNCOMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
