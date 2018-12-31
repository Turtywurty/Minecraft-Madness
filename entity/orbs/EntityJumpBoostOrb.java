package com.turtywurty.minecraftmadness.entity.orbs;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityElderGuardian;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityEvoker;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.entity.monster.EntityIllusionIllager;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.monster.EntityShulker;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityVex;
import net.minecraft.entity.monster.EntityVindicator;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.entity.monster.EntityZombieVillager;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityDonkey;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityMule;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySkeletonHorse;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.passive.EntityZombieHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityJumpBoostOrb extends EntitySnowball
{
    public EntityJumpBoostOrb(World worldIn)
    {
        super(worldIn);
    }

    public EntityJumpBoostOrb(World worldIn, EntityLivingBase throwerIn)
    {
        super(worldIn, throwerIn);
    }

    public EntityJumpBoostOrb(World worldIn, double x, double y, double z)
    {
        super(worldIn, x, y, z);
    }
	/**
	 * registers the EntityThrowable
	 */
    public static void registerFixesCustomOrb(DataFixer fixer)
    {
        EntityThrowable.registerFixesThrowable(fixer, "CustomOrb");
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(RayTraceResult result, EntityPlayer player, EntityLivingBase entity)
    {
        if (result.entityHit != null)
        {
            int i = 0;

            result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)i);
            
            if(result.entityHit instanceof EntityBlaze)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityVex)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityWolf)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityOcelot)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityCaveSpider)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityBlaze)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityBat)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityChicken)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityCow)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityCreeper)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityDonkey)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityDragon)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityElderGuardian)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityEnderman)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityEndermite)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityEvoker)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityGhast)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityGiantZombie)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityGuardian)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityIronGolem)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityHorse)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityHusk)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntitySkeletonHorse)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityZombieHorse)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityIllusionIllager)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityLlama)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityMagmaCube)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityMooshroom)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityMule)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityPig)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityPigZombie)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityParrot)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityPolarBear)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityRabbit)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntitySheep)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityShulker)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntitySilverfish)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntitySkeleton)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityWitherSkeleton)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntitySlime)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntitySnowman)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntitySpider)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntitySquid)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityWitch)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityWither)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityVillager)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityVindicator)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityZombieVillager)
            {
            	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
            
            else if(result.entityHit instanceof EntityPlayer)
            {
        		player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1200, 2));
            }
        }

        if (!this.world.isRemote)
        {
            this.world.setEntityState(this, (byte)3);
            this.setDead();
        }
    }
}