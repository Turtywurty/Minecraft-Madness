package com.turtywurty.minecraftmadness.entity.tadpole;

import com.turtywurty.minecraftmadness.entity.frog.EntityFrog;
import com.turtywurty.minecraftmadness.entity.frog.ModelFrog;
import com.turtywurty.minecraftmadness.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTadpole extends RenderLiving<EntityTadpole>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/tadpole/tadpole.png");
	
	public RenderTadpole(RenderManager manager) 
	{
		super(manager, new ModelTadpole(), 0.1F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityTadpole entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityTadpole entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
