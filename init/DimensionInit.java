package com.turtywurty.minecraftmadness.init;

import com.turtywurty.minecraftmadness.world.dimension.madness.DimensionMadness;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionInit 
{
	public static final DimensionType MADNESS = DimensionType.register("Madness", "_madness", 2, DimensionMadness.class, false);
	
	public static void registerDimensions()
	{
		DimensionManager.registerDimension(2, MADNESS);
	}
}
