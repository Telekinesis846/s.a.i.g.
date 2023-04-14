
package net.mcreator.saig.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.saig.init.SaigModTabs;
import net.mcreator.saig.init.SaigModItems;

public class ImpureGoldHoeItem extends HoeItem {
	public ImpureGoldHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1000;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 1.5f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 23;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SaigModItems.IMPUREGOLDINGOT.get()), new ItemStack(Items.GOLD_INGOT));
			}
		}, 0, -3.5f, new Item.Properties().tab(SaigModTabs.TAB_SAIG));
	}
}
