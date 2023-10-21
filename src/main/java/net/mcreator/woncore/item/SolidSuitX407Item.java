
package net.mcreator.woncore.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.woncore.procedures.SolidSuitX407BodyTickEventProcedure;
import net.mcreator.woncore.init.WoncoreModTabs;

public abstract class SolidSuitX407Item extends ArmorItem {
	public SolidSuitX407Item(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 6, 8, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 0;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}

			@Override
			public String getName() {
				return "solid_suit_x_407";
			}

			@Override
			public float getToughness() {
				return 1.8f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.3f;
			}
		}, slot, properties);
	}

	public static class Helmet extends SolidSuitX407Item {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(WoncoreModTabs.TAB_WON_STUFF));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "woncore:textures/models/armor/x407_layer_1.png";
		}
	}

	public static class Chestplate extends SolidSuitX407Item {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(WoncoreModTabs.TAB_WON_STUFF));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "woncore:textures/models/armor/x407_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			SolidSuitX407BodyTickEventProcedure.execute(entity);
		}
	}

	public static class Leggings extends SolidSuitX407Item {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(WoncoreModTabs.TAB_WON_STUFF));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "woncore:textures/models/armor/x407_layer_2.png";
		}
	}

	public static class Boots extends SolidSuitX407Item {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(WoncoreModTabs.TAB_WON_STUFF));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "woncore:textures/models/armor/x407_layer_1.png";
		}
	}
}
