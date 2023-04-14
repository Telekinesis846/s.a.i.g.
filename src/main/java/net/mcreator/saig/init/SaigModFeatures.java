
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.saig.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.saig.world.features.ores.SteeloreFeature;
import net.mcreator.saig.SaigMod;

@Mod.EventBusSubscriber
public class SaigModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, SaigMod.MODID);
	public static final RegistryObject<Feature<?>> STEELORE = REGISTRY.register("steelore", SteeloreFeature::feature);
}
