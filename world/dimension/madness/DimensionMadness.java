package com.turtywurty.minecraftmadness.world.dimension.madness;

import java.util.Random;

import com.turtywurty.minecraftmadness.init.BiomeInit;
import com.turtywurty.minecraftmadness.init.DimensionInit;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.event.terraingen.InitNoiseGensEvent.ContextOverworld;
import net.minecraftforge.event.terraingen.TerrainGen;

public class DimensionMadness extends WorldProvider
{
	ContextOverworld ctx;
	public DimensionMadness() 
	{
		this.biomeProvider = new BiomeProviderSingle(BiomeInit.MADNESS);
	}
	
	@Override
	public DimensionType getDimensionType() 
	{
		return DimensionInit.MADNESS;
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() 
	{
		return new ChunkGeneratorMadness(world, true, 2, ctx);
	}
	
	@Override
	public boolean canRespawnHere() 
	{
		return true;
	}
	
	@Override
	public boolean isSurfaceWorld() 
	{
		return false;
	}
}
