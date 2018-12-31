package com.turtywurty.minecraftmadness.util.handlers;

import com.turtywurty.minecraftmadness.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTableHandler 
{
	public static final ResourceLocation FROG =	LootTableList.register(new ResourceLocation(Reference.MOD_ID + ":loot_tables/entity/frog/frog"));
	public static final ResourceLocation SCORPION =	LootTableList.register(new ResourceLocation(Reference.MOD_ID + ":loot_tables/entity/scorpion/scorpion"));
}
