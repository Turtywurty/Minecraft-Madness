package com.turtywurty.minecraftmadness.util.helpers;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.turtywurty.minecraftmadness.objects.blocks.quarry.TileEntityQuarryBasic;
import com.turtywurty.minecraftmadness.objects.blocks.quarry.TileEntityQuarryTier1;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class NBTHelper 
{
	public static NBTTagCompound toNBT(Object o) 
	{
		if(o instanceof ItemStack)
		{
			return writeItemStack((ItemStack)o);
		}
		
		if(o instanceof TileEntityQuarryBasic)
		{
			return writeQuarry((TileEntityQuarryBasic)o);
		}
		
		if(o instanceof TileEntityQuarryTier1)
		{
			return writeQuarry((TileEntityQuarryTier1)o);
		}
		return null;
	}
	
	private static NBTTagCompound writeQuarry(TileEntityQuarryBasic o) 
	{
		NBTTagCompound compound = new NBTTagCompound();
		compound.setInteger("y", o.y);
		compound.setInteger("x", o.x);
		compound.setInteger("z", o.z);
		return compound;
	}
	
	private static NBTTagCompound writeQuarry(TileEntityQuarryTier1 o) 
	{
		NBTTagCompound compound = new NBTTagCompound();
		compound.setInteger("y", o.y);
		compound.setInteger("x", o.x);
		compound.setInteger("z", o.z);
		return compound;
	}

	private static NBTTagCompound writeItemStack(ItemStack i) 
	{
		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setInteger("count", i.getCount());
		nbt.setString("item", i.getItem().getRegistryName().toString());
		nbt.setByte("type", (byte) 0);
		return nbt;
	}
	
	@Nullable
	public static Object fromNBT(@Nonnull NBTTagCompound compound) 
	{
		switch (compound.getByte("type")) {
		case 0:
			return readItemStack(compound);
		default:
			return null;
		}
	}
	
	private static ItemStack readItemStack(NBTTagCompound compound) 
	{
		Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation(compound.getString("item")));
		int count = compound.getInteger("count");
		return new ItemStack(item, count);
	}
}