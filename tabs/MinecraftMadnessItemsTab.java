package com.turtywurty.minecraftmadness.tabs;

import com.turtywurty.minecraftmadness.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MinecraftMadnessItemsTab extends CreativeTabs
{
	public MinecraftMadnessItemsTab(String label) 
	{
		super("minecraftmadnessitemstab");
		this.setBackgroundImageName("minecraftmadnessitems.png");
	}
	
	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.HASTE_ORB);
	}
}