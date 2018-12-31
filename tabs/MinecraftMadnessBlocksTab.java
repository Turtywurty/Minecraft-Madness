package com.turtywurty.minecraftmadness.tabs;

import com.turtywurty.minecraftmadness.init.BlockInit;
import com.turtywurty.minecraftmadness.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MinecraftMadnessBlocksTab extends CreativeTabs
{
	public MinecraftMadnessBlocksTab(String label) 
	{
		super("minecraftmadnessblockstab");
		this.setBackgroundImageName("minecraftmadnessblocks.png");
	}
	
	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(BlockInit.BIRD_BATH);
	}
}