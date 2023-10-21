package net.mcreator.woncore.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.woncore.network.WoncoreModVariables;

public class NightVisionOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(WoncoreModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WoncoreModVariables.PlayerVariables())).nightvisionoption == false) {
			{
				boolean _setval = true;
				entity.getCapability(WoncoreModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.nightvisionoption = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				boolean _setval = false;
				entity.getCapability(WoncoreModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.nightvisionoption = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
