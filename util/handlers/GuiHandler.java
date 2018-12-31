package com.turtywurty.minecraftmadness.util.handlers;

import com.turtywurty.minecraftmadness.objects.blocks.container.ContainerCupboard;
import com.turtywurty.minecraftmadness.objects.blocks.container.ContainerFreezer;
import com.turtywurty.minecraftmadness.objects.blocks.gui.GuiCupboard;
import com.turtywurty.minecraftmadness.objects.blocks.gui.GuiFreezer;
import com.turtywurty.minecraftmadness.objects.blocks.tileentity.TileEntityCupboard;
import com.turtywurty.minecraftmadness.objects.blocks.tileentity.TileEntityFreezer;
import com.turtywurty.minecraftmadness.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_FREEZER)
		{
			return new ContainerFreezer(player.inventory, (TileEntityFreezer)world.getTileEntity(new BlockPos(x, y, z)), player);
		}
		
		if(ID == Reference.GUI_CUPBOARD)
		{
			return new ContainerCupboard(player.inventory, (TileEntityCupboard)world.getTileEntity(new BlockPos(x, y, z)), player);
		}
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_FREEZER)
		{
			return new GuiFreezer(player.inventory, (TileEntityFreezer)world.getTileEntity(new BlockPos(x, y, z)), player);
		}
		
		if(ID == Reference.GUI_CUPBOARD)
		{
			return new GuiCupboard(player.inventory, (TileEntityCupboard)world.getTileEntity(new BlockPos(x, y, z)), player);
		}
		return null;
	}
	
	public static void registerGuis()
	{

	}
}

