package com.turtywurty.minecraftmadness.tabs;

import com.turtywurty.minecraftmadness.init.BlockInit;
import com.turtywurty.minecraftmadness.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MinecraftMadnessPlushiesTab extends CreativeTabs
{
	public MinecraftMadnessPlushiesTab(String label) 
	{
		super("minecraftmadnessplushiestab");
		this.setBackgroundImageName("minecraftmadnessplushies.png");
	}
	
	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(BlockInit.IVANDPF_PLUSHIE);
	}
}