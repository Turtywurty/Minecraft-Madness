package com.turtywurty.minecraftmadness.tabs;

import com.turtywurty.minecraftmadness.init.BlockInit;
import com.turtywurty.minecraftmadness.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MinecraftMadnessDyedBlocksTab extends CreativeTabs
{
	public MinecraftMadnessDyedBlocksTab(String label) 
	{
		super("minecraftmadnessdyedblockstab");
		this.setBackgroundImageName("minecraftmadnessdyedblocks.png");
	}
	
	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(BlockInit.LIME_COBBLESTONE);
	}
}