package com.turtywurty.minecraftmadness.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidInit 
{
	public static final List<Fluid> FLUIDS = new ArrayList<Fluid>();
	
	//public static final Fluid RAW_OIL = new FluidBase("raw_fluid", new ResourceLocation("minecraftmadness:blocks/raw_oil_still"), new ResourceLocation("minecraftmadness:blocks/raw_oil_flow"));

	public static void registerFluids()
	{
		//registerFluid(RAW_OIL);
	}
	
	public static void registerFluid(Fluid fluid)
	{
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluid);
	}
}
