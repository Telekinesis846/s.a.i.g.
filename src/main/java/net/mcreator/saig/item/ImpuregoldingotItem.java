
package net.mcreator.saig.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.saig.init.SaigModTabs;

public class ImpuregoldingotItem extends Item {
	public ImpuregoldingotItem() {
		super(new Item.Properties().tab(SaigModTabs.TAB_SAIG).stacksTo(64).rarity(Rarity.COMMON));
	}
}
