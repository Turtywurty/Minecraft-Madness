package com.turtywurty.minecraftmadness.world;

import com.turtywurty.minecraftmadness.MinecraftMadness;
import com.turtywurty.minecraftmadness.init.PotionInit;
import com.turtywurty.minecraftmadness.util.Reference;

import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

@EventBusSubscriber
public class WorldEvents 
{
	@SubscribeEvent
	public static void radioactivePotionActive(PlayerTickEvent event)
	{
		boolean isActive = false;
		if(event.player.isPotionActive(PotionInit.RADIATION_POTION_EFFECT))
		{
			isActive = true;
		}
		
		if(isActive)
		{
            event.player.attackEntityFrom(DamageSource.WITHER, 0.1f);
		}
	}
}
