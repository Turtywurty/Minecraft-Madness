package com.turtywurty.minecraftmadness.entity.smoke;

import com.turtywurty.minecraftmadness.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSmoke extends RenderLiving<EntitySmoke>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/smoke/smoke.png");
	
	public RenderSmoke(RenderManager manager) 
	{
		super(manager, new ModelSmoke(), 0.1F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntitySmoke entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntitySmoke entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
