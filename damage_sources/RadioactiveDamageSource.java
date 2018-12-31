package com.turtywurty.minecraftmadness.damage_sources;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.ITextComponent;

public class RadioactiveDamageSource extends DamageSource
{
	public static String RADIOACTIVE;
	public RadioactiveDamageSource(String damageTypeIn) 
	{
		super(damageTypeIn);
		this.setDamageBypassesArmor();
	}	
	
	@Override
	public boolean isUnblockable() 
	{
		return true;
	}
}
