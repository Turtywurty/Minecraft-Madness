package com.turtywurty.minecraftmadness.potions;

import com.turtywurty.minecraftmadness.util.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionRadiation extends Potion 
{
	public PotionRadiation(String name, boolean isBadPotion, int colour, int iconIdexX, int iconIndexY) 
	{
		super(isBadPotion, colour);
		setPotionName("effect." + name);
		setIconIndex(iconIdexX, iconIndexY);
		setRegistryName(new ResourceLocation(Reference.MOD_ID + ":" + name));
	}
	
	@Override
	public boolean hasStatusIcon() 
	{
		Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(Reference.MOD_ID + "textures/gui/potion_effects.png"));
		return true;
	}
}
