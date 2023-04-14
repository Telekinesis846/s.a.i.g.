
package net.mcreator.saig.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.saig.init.SaigModTabs;
import net.mcreator.saig.init.SaigModItems;

public class ImpureGoldAxeItem extends AxeItem {
	public ImpureGoldAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SaigModItems.IMPUREGOLDINGOT.get()), new ItemStack(Items.GOLD_INGOT));
			}
		}, 1, -3f, new Item.Properties().tab(SaigModTabs.TAB_SAIG));
	}
}
