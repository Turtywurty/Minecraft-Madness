package com.turtywurty.minecraftmadness.init;

import com.turtywurty.minecraftmadness.potions.PotionRadiation;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.potion.PotionType;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class PotionInit
{
	public static final Potion RADIATION_POTION_EFFECT = new PotionRadiation("radiation_potion", true, 2204928, 0, 0);
	
	public static final PotionType RADIATION_POTION = new PotionType("radiation_potion", new PotionEffect[] {new PotionEffect(RADIATION_POTION_EFFECT, 2400)}).setRegistryName("radiation_potion");
	public static final PotionType LONG_RADIATION_POTION = new PotionType("radiation_potion", new PotionEffect[] {new PotionEffect(RADIATION_POTION_EFFECT, 4800)}).setRegistryName("long_radiation_potion");
	
	public static void registerPotions()
	{
		registerPotion(RADIATION_POTION, LONG_RADIATION_POTION, RADIATION_POTION_EFFECT);
		
		registerPotionMixes();
	}
	
	private static void registerPotion(PotionType defaultPotion, PotionType longPotion, Potion effect)
	{
		ForgeRegistries.POTIONS.register(effect);
		ForgeRegistries.POTION_TYPES.register(defaultPotion);
		ForgeRegistries.POTION_TYPES.register(longPotion);
	}
	
	private static void registerPotionMixes()
	{
		PotionHelper.addMix(RADIATION_POTION, Items.REDSTONE, LONG_RADIATION_POTION);
		PotionHelper.addMix(PotionTypes.AWKWARD, ItemInit.URANIUM_DUST, RADIATION_POTION);
	}
}
