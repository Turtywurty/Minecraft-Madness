package com.turtywurty.minecraftmadness;

import java.io.File;

import com.turtywurty.minecraftmadness.commands.teleport_dim.CommandTeleportDimension;
import com.turtywurty.minecraftmadness.events.vanilla_overrides.leaves.ApplesFromLeavesEvent;
import com.turtywurty.minecraftmadness.events.vanilla_overrides.seeds.SeedsFromGrassEvent;
import com.turtywurty.minecraftmadness.init.BiomeInit;
import com.turtywurty.minecraftmadness.init.EntityInit;
import com.turtywurty.minecraftmadness.init.FluidInit;
import com.turtywurty.minecraftmadness.init.PotionInit;
import com.turtywurty.minecraftmadness.proxy.CommonProxy;
import com.turtywurty.minecraftmadness.recipes.CraftingRecipes;
import com.turtywurty.minecraftmadness.recipes.SmeltingRecipes;
import com.turtywurty.minecraftmadness.tabs.MinecraftMadnessBlocksTab;
import com.turtywurty.minecraftmadness.tabs.MinecraftMadnessDyedBlocksTab;
import com.turtywurty.minecraftmadness.tabs.MinecraftMadnessItemsTab;
import com.turtywurty.minecraftmadness.tabs.MinecraftMadnessPlushiesTab;
import com.turtywurty.minecraftmadness.util.Reference;
import com.turtywurty.minecraftmadness.util.handlers.RegistryHandler;
import com.turtywurty.minecraftmadness.util.handlers.RenderHandler;
import com.turtywurty.minecraftmadness.util.handlers.SoundsHandler;
import com.turtywurty.minecraftmadness.world.gen.WorldGenCustomOres;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

//Declaring that classes are a mod!
@Mod(modid= Reference.MOD_ID, version = Reference.VERSION, name = Reference.NAME)
public class MinecraftMadness 
{
	//Mod Instance
	@Instance
	public static MinecraftMadness instance;
	
	//Register Proxy
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	//Tabs
	public static final CreativeTabs MINECRAFTMADNESSITEMSTAB = new MinecraftMadnessItemsTab("minecraftmadnessitemstab");
	public static final CreativeTabs MINECRAFTMADNESSBLOCKSTAB = new MinecraftMadnessBlocksTab("minecraftmadnessblockstab");
	public static final CreativeTabs MINECRAFTMADNESSDYEDBLOCKSTAB = new MinecraftMadnessDyedBlocksTab("minecraftmadnessdyedblockstab");
	public static final CreativeTabs MINECRAFTMADNESSPLUSHIESTAB = new MinecraftMadnessPlushiesTab("minecraftmadnessplushiestab");
	
	public static File config;
	
	static 
	{
		FluidRegistry.enableUniversalBucket();
	}
	
	//Pre-Initialization Registration
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		SeedsFromGrassEvent seedEvent = new SeedsFromGrassEvent();
		//ApplesFromLeavesEvent appleEvent = new ApplesFromLeavesEvent();
		FluidInit.registerFluids();
		BiomeInit.registerBiomes();
		//DimensionInit.registerDimensions();
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 3);
		EntityInit.registerEntities();
		RenderHandler.registerEntityRenders();
		SoundsHandler.registerSounds();
		PotionInit.registerPotions();
		MinecraftForge.EVENT_BUS.register(seedEvent);
		//MinecraftForge.EVENT_BUS.register(appleEvent);
	}
	
	//Initialization Registration
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		RegistryHandler.initRegistries();
		SmeltingRecipes.init();
		CraftingRecipes.init();
	}
	
	//Post-Initialization Registration
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void serverInit(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandTeleportDimension());
	}
}
