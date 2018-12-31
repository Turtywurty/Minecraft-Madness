package com.turtywurty.minecraftmadness.util.handlers;

import com.turtywurty.minecraftmadness.entity.frog.EntityFrog;
import com.turtywurty.minecraftmadness.entity.frog.RenderFrog;
import com.turtywurty.minecraftmadness.entity.scorpion.EntityScorpion;
import com.turtywurty.minecraftmadness.entity.scorpion.RenderScorpion;
import com.turtywurty.minecraftmadness.entity.tadpole.EntityTadpole;
import com.turtywurty.minecraftmadness.entity.tadpole.RenderTadpole;
import com.turtywurty.minecraftmadness.init.BlockInit;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	/*public static void registerCustomMeshesAndStates()
	{
		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(BlockInit.RAW_OIL), new ItemMeshDefinition()
		{
			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack)
			{
				return new ModelResourceLocation("minecraftmadness:raw_oil", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(BlockInit.RAW_OIL, new StateMapperBase()
		{
			@Override
			public ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("minecraftmadness:raw_oil", "fluid");
			}
		});
	}*/
	
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityFrog.class, new IRenderFactory<EntityFrog>()
		{
			@Override
			public Render<? super EntityFrog> createRenderFor(RenderManager manager) 
			{
				return new RenderFrog(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTadpole.class, new IRenderFactory<EntityTadpole>()
		{
			@Override
			public Render<? super EntityTadpole> createRenderFor(RenderManager manager) 
			{
				return new RenderTadpole(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityScorpion.class, new IRenderFactory<EntityScorpion>()
		{
			@Override
			public Render<? super EntityScorpion> createRenderFor(RenderManager manager) 
			{
				return new RenderScorpion(manager);
			}
		});
	}
}