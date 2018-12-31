package com.turtywurty.minecraftmadness.world;

import com.turtywurty.minecraftmadness.MinecraftMadness;

import net.minecraft.client.gui.Gui;

public class GuiRadiation extends Gui
{
	@Override
	protected void drawGradientRect(int left, int top, int right, int bottom, int startColor, int endColor) 
	{
		left = 0; 
		top = 0;
		right = 1080;
		bottom = 680;
		startColor = 3145216;
		endColor = 3145216;
		super.drawGradientRect(left, top, right, bottom, startColor, endColor);
	}
}
