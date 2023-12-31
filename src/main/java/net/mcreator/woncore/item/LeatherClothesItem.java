
package net.mcreator.woncore.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.woncore.init.WoncoreModTabs;

public abstract class LeatherClothesItem extends ArmorItem {
	public LeatherClothesItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 20;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 4, 5, 2}[slot.getIndex()];
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
				return "leather_clothes";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends LeatherClothesItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(WoncoreModTabs.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "woncore:textures/models/armor/assassin_layer_1.png";
		}
	}

	public static class Chestplate extends LeatherClothesItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(WoncoreModTabs.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "woncore:textures/models/armor/assassin_layer_1.png";
		}
	}

	public static class Leggings extends LeatherClothesItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(WoncoreModTabs.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "woncore:textures/models/armor/assassin_layer_2.png";
		}
	}

	public static class Boots extends LeatherClothesItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(WoncoreModTabs.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "woncore:textures/models/armor/assassin_layer_1.png";
		}
	}
}
