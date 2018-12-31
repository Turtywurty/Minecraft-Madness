package com.turtywurty.minecraftmadness.entity.scorpion;

import com.turtywurty.minecraftmadness.util.handlers.LootTableHandler;
import com.turtywurty.minecraftmadness.util.handlers.SoundsHandler;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityScorpion extends EntityMob
{
	public EntityScorpion(World worldIn) 
	{
		super(worldIn);
	}
	
    @Override
    protected void initEntityAI()
    {
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(4, new EntityAIAttackMelee(this, 1.0D, false));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[1]));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.tasks.addTask(1, new EntityAIWander(this, 0.3D));
    }

    @Override
    public boolean isPreventingPlayerRest(EntityPlayer playerIn)
    {
        return false;
    }

	@Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(1.5D);
    }
    
    @Override
    protected boolean canTriggerWalking()
    {
        return true;
    }
	
	public EntityScorpion createChild(EntityAgeable ageable) 
	{
		setSize(0.5F, 0.5F);
		return new EntityScorpion(world);
	}
	
	protected SoundEvent getAmbientSound() 
	{
		return SoundsHandler.SCORPION_AMBIENT;
	}
	
	protected ResourceLocation getLootTable() 
	{
		return LootTableHandler.SCORPION;
	}
	
	protected SoundEvent getHurtSound(DamageSource Source) 
	{
		return SoundsHandler.SCORPION_HURT;
	}
	
	protected SoundEvent getDeathSound() 
	{
		return SoundsHandler.SCORPION_DEATH;
	}
	
}
