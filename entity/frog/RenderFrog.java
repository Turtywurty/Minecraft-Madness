package com.turtywurty.minecraftmadness.entity.frog;

import com.turtywurty.minecraftmadness.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFrog extends RenderLiving<EntityFrog>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/frog/frog.png");
	
	public RenderFrog(RenderManager manager) 
	{
		super(manager, new ModelFrog(), 0.1F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityFrog entity) 
	{
		return TEXTURES;
	}
}
