
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.saig.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.saig.item.SteelIngotItem;
import net.mcreator.saig.item.MastersswordItem;
import net.mcreator.saig.item.ImpuregoldrodItem;
import net.mcreator.saig.item.ImpuregoldingotItem;
import net.mcreator.saig.item.ImpureGoldSwordItem;
import net.mcreator.saig.item.ImpureGoldShovelItem;
import net.mcreator.saig.item.ImpureGoldPickaxeItem;
import net.mcreator.saig.item.ImpureGoldItem;
import net.mcreator.saig.item.ImpureGoldHoeItem;
import net.mcreator.saig.item.ImpureGoldAxeItem;
import net.mcreator.saig.SaigMod;

public class SaigModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SaigMod.MODID);
	public static final RegistryObject<Item> STEELORE = block(SaigModBlocks.STEELORE, SaigModTabs.TAB_SAIG);
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> IMPUREGOLDINGOT = REGISTRY.register("impuregoldingot", () -> new ImpuregoldingotItem());
	public static final RegistryObject<Item> IMPUREGOLDROD = REGISTRY.register("impuregoldrod", () -> new ImpuregoldrodItem());
	public static final RegistryObject<Item> MASTERSSWORD = REGISTRY.register("masterssword", () -> new MastersswordItem());
	public static final RegistryObject<Item> IMPURE_GOLD_HELMET = REGISTRY.register("impure_gold_helmet", () -> new ImpureGoldItem.Helmet());
	public static final RegistryObject<Item> IMPURE_GOLD_CHESTPLATE = REGISTRY.register("impure_gold_chestplate", () -> new ImpureGoldItem.Chestplate());
	public static final RegistryObject<Item> IMPURE_GOLD_LEGGINGS = REGISTRY.register("impure_gold_leggings", () -> new ImpureGoldItem.Leggings());
	public static final RegistryObject<Item> IMPURE_GOLD_BOOTS = REGISTRY.register("impure_gold_boots", () -> new ImpureGoldItem.Boots());
	public static final RegistryObject<Item> IMPURE_GOLD_PICKAXE = REGISTRY.register("impure_gold_pickaxe", () -> new ImpureGoldPickaxeItem());
	public static final RegistryObject<Item> IMPURE_GOLD_SWORD = REGISTRY.register("impure_gold_sword", () -> new ImpureGoldSwordItem());
	public static final RegistryObject<Item> IMPURE_GOLD_AXE = REGISTRY.register("impure_gold_axe", () -> new ImpureGoldAxeItem());
	public static final RegistryObject<Item> IMPURE_GOLD_SHOVEL = REGISTRY.register("impure_gold_shovel", () -> new ImpureGoldShovelItem());
	public static final RegistryObject<Item> IMPURE_GOLD_HOE = REGISTRY.register("impure_gold_hoe", () -> new ImpureGoldHoeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
