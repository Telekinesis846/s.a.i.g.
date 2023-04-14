
package net.mcreator.saig.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.saig.init.SaigModTabs;

public class SteelIngotItem extends Item {
	public SteelIngotItem() {
		super(new Item.Properties().tab(SaigModTabs.TAB_SAIG).stacksTo(64).rarity(Rarity.COMMON));
	}
}
