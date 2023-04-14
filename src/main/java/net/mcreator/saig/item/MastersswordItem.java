
package net.mcreator.saig.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.saig.procedures.MastersswordLivingEntityIsHitWithToolProcedure;
import net.mcreator.saig.init.SaigModTabs;
import net.mcreator.saig.init.SaigModItems;

public class MastersswordItem extends SwordItem {
	public MastersswordItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SaigModItems.IMPUREGOLDINGOT.get()), new ItemStack(SaigModItems.STEEL_INGOT.get()));
			}
		}, 3, -3f, new Item.Properties().tab(SaigModTabs.TAB_SAIG));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		MastersswordLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}
}
