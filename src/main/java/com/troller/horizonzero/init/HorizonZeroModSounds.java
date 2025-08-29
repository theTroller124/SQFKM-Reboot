/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.troller.horizonzero.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import com.troller.horizonzero.HorizonZeroMod;

public class HorizonZeroModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, HorizonZeroMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> TROLLER_CREEPER_HURT = REGISTRY.register("troller_creeper_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("horizon_zero", "troller_creeper_hurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> TROLLER_CREEPER_TROLLING = REGISTRY.register("troller_creeper_trolling",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("horizon_zero", "troller_creeper_trolling")));
}