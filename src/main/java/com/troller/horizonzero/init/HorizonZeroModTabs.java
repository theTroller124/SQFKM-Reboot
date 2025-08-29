/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.troller.horizonzero.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import com.troller.horizonzero.HorizonZeroMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class HorizonZeroModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HorizonZeroMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(HorizonZeroModItems.TROLLER_CREEPER_SPAWN_EGG.get());
		}
	}
}