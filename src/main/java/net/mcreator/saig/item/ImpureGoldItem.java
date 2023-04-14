
package net.mcreator.saig.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.saig.init.SaigModTabs;
import net.mcreator.saig.init.SaigModItems;

public abstract class ImpureGoldItem extends ArmorItem {
	public ImpureGoldItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 10;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 4, 6, 3}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_gold"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SaigModItems.IMPUREGOLDINGOT.get()), new ItemStack(Items.GOLD_INGOT));
			}

			@Override
			public String getName() {
				return "impure_gold";
			}

			@Override
			public float getToughness() {
				return 1f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends ImpureGoldItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(SaigModTabs.TAB_SAIG));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "saig:textures/models/armor/impuregoldarmor_layer_1.png";
		}
	}

	public static class Chestplate extends ImpureGoldItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(SaigModTabs.TAB_SAIG));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "saig:textures/models/armor/impuregoldarmor_layer_1.png";
		}
	}

	public static class Leggings extends ImpureGoldItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(SaigModTabs.TAB_SAIG));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "saig:textures/models/armor/impuregoldarmor_layer_2.png";
		}
	}

	public static class Boots extends ImpureGoldItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(SaigModTabs.TAB_SAIG));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "saig:textures/models/armor/impuregoldarmor_layer_1.png";
		}
	}
}
