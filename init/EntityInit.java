package com.turtywurty.minecraftmadness.init;

import com.turtywurty.minecraftmadness.MinecraftMadness;
import com.turtywurty.minecraftmadness.entity.frog.EntityFrog;
import com.turtywurty.minecraftmadness.entity.scorpion.EntityScorpion;
import com.turtywurty.minecraftmadness.entity.smoke.EntitySmoke;
import com.turtywurty.minecraftmadness.entity.tadpole.EntityTadpole;
import com.turtywurty.minecraftmadness.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	public static void registerEntities()
	{
		registerEntity("frog", EntityFrog.class, Reference.ENTITY_FROG, 50, 65280, 17664);
		registerEntity("tadpole", EntityTadpole.class, Reference.ENTITY_TADOPLE, 51, 5124658, 65280);
		registerEntity("scorpion", EntityScorpion.class, Reference.ENTITY_SCORPION, 52, 4460800, 10318703);	
		registerEntity("smoke", EntitySmoke.class, Reference.ENTITY_SMOKE, 53, 16777215, 13750737);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, MinecraftMadness.instance, range, 1, true, color1, color2);
	}
}