
package net.mcreator.woncore.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.mcreator.woncore.procedures.MedicalKitRightclickedProcedure;
import net.mcreator.woncore.init.WoncoreModTabs;

public class MedicalKitItem extends Item {
	public MedicalKitItem() {
		super(new Item.Properties().tab(WoncoreModTabs.TAB_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		MedicalKitRightclickedProcedure.execute(entity);
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		MedicalKitRightclickedProcedure.execute(context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
