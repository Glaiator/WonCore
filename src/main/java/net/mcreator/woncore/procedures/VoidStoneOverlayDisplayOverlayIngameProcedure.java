package net.mcreator.woncore.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.woncore.init.WoncoreModItems;

public class VoidStoneOverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WoncoreModItems.VOID_STONE.get())) : false) {
			return true;
		}
		return false;
	}
}
