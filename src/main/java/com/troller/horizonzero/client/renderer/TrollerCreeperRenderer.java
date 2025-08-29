package com.troller.horizonzero.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.CreeperRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import com.troller.horizonzero.entity.TrollerCreeperEntity;

public class TrollerCreeperRenderer extends MobRenderer<TrollerCreeperEntity, CreeperRenderState, CreeperModel> {
	private TrollerCreeperEntity entity = null;

	public TrollerCreeperRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public CreeperRenderState createRenderState() {
		return new CreeperRenderState();
	}

	@Override
	public void extractRenderState(TrollerCreeperEntity entity, CreeperRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(CreeperRenderState state) {
		return ResourceLocation.parse("horizon_zero:textures/entities/troller_creeper.png");
	}
}