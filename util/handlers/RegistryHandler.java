package com.turtywurty.minecraftmadness.util.handlers;

import com.turtywurty.minecraftmadness.MinecraftMadness;
import com.turtywurty.minecraftmadness.commands.teleport_dim.CommandTeleportDimension;
import com.turtywurty.minecraftmadness.events.vanilla_overrides.leaves.ApplesFromLeavesEvent;
import com.turtywurty.minecraftmadness.events.vanilla_overrides.seeds.SeedsFromGrassEvent;
import com.turtywurty.minecraftmadness.init.BiomeInit;
import com.turtywurty.minecraftmadness.init.BlockInit;
import com.turtywurty.minecraftmadness.init.EntityInit;
import com.turtywurty.minecraftmadness.init.FluidInit;
import com.turtywurty.minecraftmadness.init.ItemInit;
import com.turtywurty.minecraftmadness.init.PotionInit;
import com.turtywurty.minecraftmadness.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}

	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
		TileEntityHandler.registerTileEntities();
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ItemInit.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : BlockInit.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}
	
	@SubscribeEvent
	public static void furnaceFuelBurnTime(FurnaceFuelBurnTimeEvent event)
	{
		if(event.getItemStack().getItem() == Item.getItemFromBlock(BlockInit.CHARCOAL_BLOCK))
	    {
	    	event.setBurnTime(10000);
	    }
	}
	
	public static void preInitRegistries()
	{
		SeedsFromGrassEvent seedEvent = new SeedsFromGrassEvent();
		//ApplesFromLeavesEvent appleEvent = new ApplesFromLeavesEvent();
		FluidInit.registerFluids();
		BiomeInit.registerBiomes();
		//DimensionInit.registerDimensions();
		EntityInit.registerEntities();
		RenderHandler.registerEntityRenders();
		SoundsHandler.registerSounds();
		PotionInit.registerPotions();
		MinecraftForge.EVENT_BUS.register(seedEvent);
		//MinecraftForge.EVENT_BUS.register(appleEvent);
	}
	
	public static void initRegistries()
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(MinecraftMadness.instance, new GuiHandler());
	}
	
	public static void postInitRegistries()
	{
		
	}
	
	public static void serverRegistries(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandTeleportDimension());
	}
}
