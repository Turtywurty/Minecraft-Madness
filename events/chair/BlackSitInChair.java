package com.turtywurty.minecraftmadness.events.chair;

import java.util.List;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = "minecraftmadness")
public class BlackSitInChair 
{

    @SubscribeEvent
    public static void onInteractWithBlock(PlayerInteractEvent.RightClickBlock event) 
    {
        EntityPlayer player = event.getEntityPlayer();
        if (player.getRidingEntity() != null)
            return;

        World world = event.getWorld();
        BlockPos pos = event.getPos();

        Vec3d vec = new Vec3d(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5);
        double maxDist = 2;
        if ((vec.x - player.posX) * (vec.x - player.posX) + (vec.y - player.posY) * (vec.y - player.posY) + (vec.z - player.posZ) * (vec.z - player.posZ) > maxDist * maxDist)
            return;

        IBlockState state = world.getBlockState(pos);

        ItemStack stack1 = player.getHeldItemMainhand();
        ItemStack stack2 = player.getHeldItemOffhand();
        if (!stack1.isEmpty() || !stack2.isEmpty())
            return;

        if (state.getBlock() == null/*instanceof BlackChairBlock*/) 
        {
            List<SeatStair> seats = world.getEntitiesWithinAABB(SeatStair.class, new AxisAlignedBB(pos, pos.add(1, 1, 1)));

            if (seats.isEmpty()) 
            {
                SeatStair seat = new SeatStair(world, pos);
                world.spawnEntity(seat);
                event.getEntityPlayer().startRiding(seat);
            }
        }
        
    }

    public static class SeatStair extends Entity 
    {

        public SeatStair(World world, BlockPos pos) 
        {
            this(world);

            setPosition(pos.getX() + 0.5, pos.getY() + 0.4, pos.getZ() + 0.5);
        }

        public SeatStair(World par1World) 
        {
            super(par1World);

            setSize(0F, 0F);
        }

        @Override
        public void onUpdate() 
        {
            super.onUpdate();

            BlockPos pos = getPosition();
            if (!(getEntityWorld().getBlockState(pos).getBlock() == null/*instanceof BlackChairBlock*/)) 
            {
                setDead();
                return;
            }

            List<Entity> passengers = getPassengers();
            if (passengers.isEmpty())
                setDead();
            for (Entity e : passengers)
                if (e.isSneaking())
                    setDead();
        }

        @Override
        protected void entityInit() 
        {
        	
        }

        @Override
        protected void readEntityFromNBT(NBTTagCompound nbttagcompound) 
        {
        	
        }

        @Override
        protected void writeEntityToNBT(NBTTagCompound nbttagcompound) 
        {
        	
        }
    }

}