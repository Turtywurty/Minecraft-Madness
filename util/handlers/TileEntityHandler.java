package com.turtywurty.minecraftmadness.util.handlers;

import com.turtywurty.minecraftmadness.objects.blocks.quarry.TileEntityQuarryBasic;
import com.turtywurty.minecraftmadness.objects.blocks.quarry.TileEntityQuarryTier1;
import com.turtywurty.minecraftmadness.objects.blocks.tileentity.TileEntityCupboard;
import com.turtywurty.minecraftmadness.objects.blocks.tileentity.TileEntityFreezer;
import com.turtywurty.minecraftmadness.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityFreezer.class, new ResourceLocation(Reference.MOD_ID + ":freezer"));
		GameRegistry.registerTileEntity(TileEntityCupboard.class, new ResourceLocation(Reference.MOD_ID + ":cupboard"));
		GameRegistry.registerTileEntity(TileEntityQuarryBasic.class, new ResourceLocation(Reference.MOD_ID + ":quarry_basic"));
		GameRegistry.registerTileEntity(TileEntityQuarryTier1.class, new ResourceLocation(Reference.MOD_ID + ":quarry_tier1"));
	}
}
