package net.mcreator.woncore.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.woncore.init.WoncoreModItems;

public class MedicalBagRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(WoncoreModItems.MEDICAL_BAG.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(WoncoreModItems.BANDAGE.get());
			_setstack.setCount(2);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		if (Math.random() < 0.6) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(WoncoreModItems.MEDICAL_KIT.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (Math.random() < 0.2) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(WoncoreModItems.MEDICAL_KIT.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (Math.random() < 0.2) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(WoncoreModItems.MORPHINE.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
		if (Math.random() < 0.4) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(WoncoreModItems.MORPHINE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (Math.random() < 0.3) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(WoncoreModItems.MEDICAL_KIT.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(WoncoreModItems.BANDAGE.get());
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (Math.random() < 0.1) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(WoncoreModItems.MEDICAL_BAG.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
	}
}
