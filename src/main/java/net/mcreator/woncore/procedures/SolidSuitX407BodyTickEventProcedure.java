package net.mcreator.woncore.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.woncore.network.WoncoreModVariables;
import net.mcreator.woncore.init.WoncoreModItems;

public class SolidSuitX407BodyTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == WoncoreModItems.SOLID_SUIT_X_407_BOOTS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == WoncoreModItems.SOLID_SUIT_X_407_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == WoncoreModItems.SOLID_SUIT_X_407_HELMET.get()) {
			if ((entity.getCapability(WoncoreModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WoncoreModVariables.PlayerVariables())).nightvisionoption == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 200, 0, false, false));
			}
		}
	}
}
