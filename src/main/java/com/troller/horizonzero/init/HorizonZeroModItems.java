/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.troller.horizonzero.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;

import java.util.function.Function;

import com.troller.horizonzero.HorizonZeroMod;

public class HorizonZeroModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(HorizonZeroMod.MODID);
	public static final DeferredItem<Item> TROLLER_CREEPER_SPAWN_EGG = register("troller_creeper_spawn_egg", properties -> new SpawnEggItem(HorizonZeroModEntities.TROLLER_CREEPER.get(), properties));

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}