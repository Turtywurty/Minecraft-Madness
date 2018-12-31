package com.turtywurty.minecraftmadness.world.biomes.madness;
import net.minecraft.world.biome.Biome;

public class BiomeMadness extends Biome
{

	public BiomeMadness(BiomeProperties properties) 
	{
		super(new BiomeProperties("Madness").setBaseHeight(0.4F).setHeightVariation(0.5F).setRainDisabled().setTemperature(1.0F));
		
	
	}	
}
