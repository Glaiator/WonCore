package net.mcreator.woncore.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.woncore.network.WoncoreModVariables;
import net.mcreator.woncore.init.WoncoreModItems;

public class NVONProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean armor = false;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == WoncoreModItems.SOLID_SUIT_X_407_BOOTS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == WoncoreModItems.SOLID_SUIT_X_407_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == WoncoreModItems.SOLID_SUIT_X_407_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == WoncoreModItems.SOLID_SUIT_X_407_HELMET.get()
				&& (entity.getCapability(WoncoreModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WoncoreModVariables.PlayerVariables())).nightvisionoption == true) {
			armor = true;
		} else {
			armor = false;
		}
		return armor;
	}
}
