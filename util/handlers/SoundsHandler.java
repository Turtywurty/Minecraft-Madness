package com.turtywurty.minecraftmadness.util.handlers;

import com.turtywurty.minecraftmadness.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler 
{
	public static SoundEvent FROG_AMBIENT;
	public static SoundEvent FROG_HURT;
	public static SoundEvent FROG_DEATH;
	
	public static SoundEvent SCORPION_AMBIENT;
	public static SoundEvent SCORPION_HURT;
	public static SoundEvent SCORPION_DEATH;
	
	public static SoundEvent BEAVER_AMBIENT;
	public static SoundEvent BEAVER_HURT;
	public static SoundEvent BEAVER_DEATH;
	
	public static SoundEvent MONEY_MAKER;
	
	public static void registerSounds()
	{
		FROG_AMBIENT = registerSound("entity.frog.frog_ambient");
		FROG_HURT = registerSound("entity.frog.frog_hurt");
		FROG_DEATH = registerSound("entity.frog.frog_death");
		
		SCORPION_AMBIENT = registerSound("entity.scorpion.scorpion_ambient");
		SCORPION_HURT = registerSound("entity.scorpion.scorpion_hurt");
		SCORPION_DEATH = registerSound("entity.scorpion.scorpion_death");
		
		MONEY_MAKER = registerSound("machines.money_maker.machine_sound");
	}
	
	private static SoundEvent registerSound(String name)
	{
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}
