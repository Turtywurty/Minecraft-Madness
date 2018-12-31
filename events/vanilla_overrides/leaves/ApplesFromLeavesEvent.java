package com.turtywurty.minecraftmadness.events.vanilla_overrides.leaves;

import com.turtywurty.minecraftmadness.init.ItemInit;

import net.minecraft.block.BlockNewLeaf;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ApplesFromLeavesEvent 
{
	@SubscribeEvent
	public void getApplesFromLeaves(HarvestDropsEvent event)
	{
		if(event.getState().getBlock() == Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, EnumType.OAK))
		{
			event.getDrops().add(new ItemStack(ItemInit.GREEN_APPLE));
			event.setDropChance(0.05f);
		}
		
		else if(event.getState().getBlock() == Blocks.LEAVES2.getDefaultState().withProperty(BlockNewLeaf.VARIANT, EnumType.DARK_OAK))
		{
			event.getDrops().add(new ItemStack(ItemInit.GREEN_APPLE));
			event.setDropChance(0.05f);
		}
	}
}
