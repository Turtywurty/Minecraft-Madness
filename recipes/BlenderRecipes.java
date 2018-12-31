package com.turtywurty.minecraftmadness.recipes;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.turtywurty.minecraftmadness.init.ItemInit;

import net.minecraft.item.ItemStack;

public class BlenderRecipes 
{	
	private static final BlenderRecipes INSTANCE = new BlenderRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> blendingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static BlenderRecipes getInstance()
	{
		return INSTANCE;
	}
	
	private BlenderRecipes() 
	{
		//addBlenderRecipe(new ItemStack(ItemInit.KIWI), new ItemStack(ItemInit.BANANA), new ItemStack(ItemInit.KIWI_BANANA_S), 0.0F);
	}

	
	public void addBlenderRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) 
	{
		if(getBlendingResult(input1, input2) != ItemStack.EMPTY) return;
		this.blendingList.put(input1, input2, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getBlendingResult(ItemStack input1, ItemStack input2) 
	{
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.blendingList.columnMap().entrySet()) 
		{
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey())) 
			{
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
				{
					if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) 
					{
						return (ItemStack)ent.getValue();
					}
				}
			}
		}
		return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() 
	{
		return this.blendingList;
	}
	
	public float getBlendingExperience(ItemStack stack)
	{
		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) 
		{
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) 
			{
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return 0.0F;
	}
}