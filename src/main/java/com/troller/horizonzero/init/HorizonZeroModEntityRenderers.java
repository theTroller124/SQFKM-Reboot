/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.troller.horizonzero.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import com.troller.horizonzero.client.renderer.TrollerCreeperRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HorizonZeroModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HorizonZeroModEntities.TROLLER_CREEPER.get(), TrollerCreeperRenderer::new);
	}
}