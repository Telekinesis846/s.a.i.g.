
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.saig.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.saig.block.SteeloreBlock;
import net.mcreator.saig.SaigMod;

public class SaigModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SaigMod.MODID);
	public static final RegistryObject<Block> STEELORE = REGISTRY.register("steelore", () -> new SteeloreBlock());
}
