
package net.mcreator.saig.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.saig.init.SaigModTabs;
import net.mcreator.saig.init.SaigModItems;

public class ImpureGoldSwordItem extends SwordItem {
	public ImpureGoldSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1000;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 2f;
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
		}, 3, -3f, new Item.Properties().tab(SaigModTabs.TAB_SAIG));
	}
}
