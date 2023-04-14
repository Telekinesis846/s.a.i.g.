
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.saig.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SaigModTabs {
	public static CreativeModeTab TAB_SAIG;

	public static void load() {
		TAB_SAIG = new CreativeModeTab("tabsaig") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SaigModItems.IMPUREGOLDINGOT.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
