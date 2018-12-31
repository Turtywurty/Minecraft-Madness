package com.turtywurty.minecraftmadness.entity.tadpole;

import com.turtywurty.minecraftmadness.util.handlers.SoundsHandler;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityTadpole extends EntitySquid
{
	public EntityTadpole(World worldIn) 
	{
		super(worldIn);
	}
	
	@Override
	protected void initEntityAI()
	{
        this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 10.0F));
        this.tasks.addTask(1, new AIMoveRandom(this));
	}
	
	static class AIMoveRandom extends EntityAIBase
    {
        private final EntityTadpole tadpole;

        public AIMoveRandom(EntityTadpole p_i45859_1_)
        {
            this.tadpole = p_i45859_1_;
        }

        /**
         * Returns whether the EntityAIBase should begin execution.
         */
        public boolean shouldExecute()
        {
            return true;
        }

        /**
         * Keep ticking a continuous task that has already been started
         */
        public void updateTask()
        {
            int i = this.tadpole.getIdleTime();

            if (i > 100)
            {
                this.tadpole.setMovementVector(0.0F, 0.0F, 0.0F);
            }
            else if (this.tadpole.getRNG().nextInt(50) == 0 || !this.tadpole.inWater || !this.tadpole.hasMovementVector())
            {
                float f = this.tadpole.getRNG().nextFloat() * ((float)Math.PI * 2F);
                float f1 = MathHelper.cos(f) * 0.2F;
                float f2 = -0.1F + this.tadpole.getRNG().nextFloat() * 0.2F;
                float f3 = MathHelper.sin(f) * 0.2F;
                this.tadpole.setMovementVector(f1, f2, f3);
            }
        }
    }
	
	@Override
    protected void applyEntityAttributes() 
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.9D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(35.0D); 
    }
	
	protected SoundEvent getHurtSound(DamageSource Source) 
	{
		return SoundsHandler.FROG_HURT;
	}
	
	protected SoundEvent getDeathSound() 
	{
		return SoundsHandler.FROG_DEATH;
	}
}
