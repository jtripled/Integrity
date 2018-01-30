package com.jtripled.integrity.event;

import com.jtripled.integrity.IntegrityRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockConcretePowder;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IWorldEventListener;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 *
 * @author jtripled
 */
@Mod.EventBusSubscriber
public class IntegrityEventListener implements IWorldEventListener
{
    public IntegrityEventListener()
    {
        
    }
    
    @SubscribeEvent
    public static void onPlayerInteract(PlayerInteractEvent.RightClickBlock event)
    {
        EntityPlayer player = event.getEntityPlayer();
        World world = player.world;
        ItemStack stack = event.getItemStack();
        IBlockState state = world.getBlockState(event.getPos());
        
        if (state.getBlock() == Blocks.IRON_BARS && stack.getItem().getUnlocalizedName().contains("concretePowder"))
        {
            event.setCanceled(true);
            if (world.isRemote)
            {
                return;
            }
            world.setBlockState(event.getPos(), getReinforcedState(Blocks.CONCRETE_POWDER.getStateFromMeta(stack.getMetadata())), 3);
            if (!player.isCreative())
                player.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, stack.splitStack(stack.getCount() - 1));
        }
    }
    
    @SubscribeEvent
    public static void onWorldLoad(WorldEvent.Load event)
    {
        event.getWorld().addEventListener(new IntegrityEventListener());
    }

    @Override
    public void notifyBlockUpdate(World world, BlockPos pos, IBlockState oldState, IBlockState newState, int flags)
    {
        if (newState.getBlock() == Blocks.CONCRETE_POWDER && oldState.getBlock() == Blocks.AIR)
        {
            IBlockState downState = world.getBlockState(pos.down());
            if (downState.getBlock() == Blocks.IRON_BARS)
            {
                world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
                world.setBlockState(pos.down(), getReinforcedState(newState), 3);
            }
        }
    }

    @Override
    public void notifyLightSet(BlockPos pos) {
        
    }

    @Override
    public void markBlockRangeForRenderUpdate(int x1, int y1, int z1, int x2, int y2, int z2) {
        
    }

    @Override
    public void playSoundToAllNearExcept(EntityPlayer player, SoundEvent soundIn, SoundCategory category, double x, double y, double z, float volume, float pitch) {
        
    }

    @Override
    public void playRecord(SoundEvent soundIn, BlockPos pos) {
        
    }

    @Override
    public void spawnParticle(int particleID, boolean ignoreRange, double xCoord, double yCoord, double zCoord, double xSpeed, double ySpeed, double zSpeed, int... parameters) {

    }

    @Override
    public void spawnParticle(int id, boolean ignoreRange, boolean p_190570_3_, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed, int... parameters) {
        
    }

    @Override
    public void onEntityAdded(Entity entityIn) {
        
    }

    @Override
    public void onEntityRemoved(Entity entityIn) {
        
    }

    @Override
    public void broadcastSound(int soundID, BlockPos pos, int data) {
        
    }

    @Override
    public void playEvent(EntityPlayer player, int type, BlockPos blockPosIn, int data) {
        
    }

    @Override
    public void sendBlockBreakProgress(int breakerId, BlockPos pos, int progress) {
        
    }
    
    private static IBlockState getReinforcedState(IBlockState state)
    {
        switch (state.getValue(BlockConcretePowder.COLOR))
        {
            case BLACK: return ((Block) IntegrityRegistry.BLACK_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case BLUE: return ((Block) IntegrityRegistry.BLUE_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case BROWN: return ((Block) IntegrityRegistry.BROWN_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case CYAN: return ((Block) IntegrityRegistry.CYAN_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case GRAY: return ((Block) IntegrityRegistry.GRAY_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case GREEN: return ((Block) IntegrityRegistry.GREEN_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case LIGHT_BLUE: return ((Block) IntegrityRegistry.LIGHT_BLUE_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case LIME: return ((Block) IntegrityRegistry.LIME_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case MAGENTA: return ((Block) IntegrityRegistry.MAGENTA_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case ORANGE: return ((Block) IntegrityRegistry.ORANGE_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case PINK: return ((Block) IntegrityRegistry.PINK_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case PURPLE: return ((Block) IntegrityRegistry.PURPLE_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case RED: return ((Block) IntegrityRegistry.RED_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case SILVER: return ((Block) IntegrityRegistry.SILVER_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case WHITE: return ((Block) IntegrityRegistry.WHITE_REINFORCED_CONCRETE_POWDER).getDefaultState();
            case YELLOW: return ((Block) IntegrityRegistry.YELLOW_REINFORCED_CONCRETE_POWDER).getDefaultState();
            default: return ((Block) IntegrityRegistry.WHITE_REINFORCED_CONCRETE_POWDER).getDefaultState();
        }
    }
}
