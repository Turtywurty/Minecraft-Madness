package com.turtywurty.minecraftmadness.events.vanilla_overrides.seeds;

import com.turtywurty.minecraftmadness.init.ItemInit;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SeedsFromGrassEvent 
{
    @SubscribeEvent
	public void getSeedsFromGrass(HarvestDropsEvent event)
	{
    	if(event.getState().getBlock() == Blocks.GRASS)
    	{
    		event.getDrops().add(new ItemStack(ItemInit.TOMATO_SEEDS));
    		event.getDrops().add(new ItemStack(ItemInit.LEMON_SEEDS));
    		event.setDropChance(0.07f);
    	}
    	
    	else if(event.getState().getBlock() == Blocks.TALLGRASS)
    	{
    		event.getDrops().add(new ItemStack(ItemInit.TOMATO_SEEDS));
    		event.getDrops().add(new ItemStack(ItemInit.LEMON_SEEDS));
    		event.setDropChance(0.14f);
    	}
	}
}