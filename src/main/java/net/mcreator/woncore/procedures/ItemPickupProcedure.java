package net.mcreator.woncore.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.woncore.init.WoncoreModItems;

import javax.annotation.Nullable;

import java.util.Random;

@Mod.EventBusSubscriber
public class ItemPickupProcedure {
	@SubscribeEvent
	public static void onPickup(EntityItemPickupEvent event) {
		execute(event, event.getPlayer(), event.getItem().getItem());
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WoncoreModItems.VOID_STONE.get())) : false) && !entity.isShiftKeyDown()) {
			if (itemstack.getItem() == Blocks.STONE.asItem() || itemstack.getItem() == Blocks.COBBLESTONE.asItem() || itemstack.getItem() == Blocks.DEEPSLATE.asItem() || itemstack.getItem() == Blocks.COBBLED_DEEPSLATE.asItem()
					|| itemstack.getItem() == Blocks.BLACKSTONE.asItem()) {
				{
					ItemStack _ist = new ItemStack(WoncoreModItems.VOID_STONE.get());
					if (_ist.hurt(1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = itemstack;
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), (itemstack).getCount(), _player.inventoryMenu.getCraftSlots());
				}
			}
		}
	}
}
