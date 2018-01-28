package com.jtripled.integrity.block;

import com.jtripled.integrity.Integrity;
import com.jtripled.integrity.IntegrityRegistry;
import com.jtripled.voxen.block.BlockBase;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 *
 * @author jtripled
 */
public final class BlockReinforcedConcretePowder extends BlockBase
{
    private final EnumDyeColor color;
    
    public BlockReinforcedConcretePowder(EnumDyeColor color)
    {
        super(Integrity.INSTANCE, color.getName() + "_reinforced_concrete_powder", Material.SAND, MapColor.getBlockColor(color));
        this.setHardness(0.75f);
        this.setResistance(5.0f);
        this.setSoundType(SoundType.SAND);
        this.setRenderLayer(BlockRenderLayer.CUTOUT);
        this.setHarvestable(false);
        this.color = color;
    }
    
    @Override
    public void getDrops(NonNullList<ItemStack> list, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        list.add(new ItemStack(Blocks.IRON_BARS, 1));
        list.add(getConcretePowderDrop(color));
    }
    
    @Override
    public void neighborChanged(IBlockState state, World world, BlockPos pos, Block block, BlockPos fromPos)
    {
        if (!this.tryTouchWater(world, pos, state))
        {
            world.scheduleUpdate(pos, this, this.tickRate(world));
            super.neighborChanged(state, world, pos, block, fromPos);
        }
    }
    
    @Override
    public void onBlockAdded(World world, BlockPos pos, IBlockState state)
    {
        if (!this.tryTouchWater(world, pos, state))
        {
            world.scheduleUpdate(pos, this, this.tickRate(world));
            super.onBlockAdded(world, pos, state);
        }
    }

    protected boolean tryTouchWater(World world, BlockPos pos, IBlockState state)
    {
        boolean flag = false;
        for (EnumFacing enumfacing : EnumFacing.values())
        {
            if (enumfacing != EnumFacing.DOWN)
            {
                BlockPos blockpos = pos.offset(enumfacing);
                if (world.getBlockState(blockpos).getMaterial() == Material.WATER)
                {
                    flag = true;
                    break;
                }
            }
        }
        if (flag)
            world.setBlockState(pos, getConcreteBlock(color).getDefaultState(), 3);
        return flag;
    }
    
    @Override
    public void updateTick(World world, BlockPos pos, IBlockState state, Random rand)
    {
        if (!world.isRemote)
        {
            IBlockState downState = world.getBlockState(pos.down());
            Block downBlock = downState.getBlock();
            Material downMaterial = downState.getMaterial();
            if (downBlock == Blocks.IRON_BARS)
            {
                world.setBlockState(pos.down(), state, 3);
                world.setBlockState(pos, Blocks.IRON_BARS.getDefaultState(), 3);
            }
            else if (downBlock == Blocks.FIRE || downMaterial == Material.AIR || downMaterial == Material.WATER || downMaterial == Material.LAVA)
            {
                world.setBlockState(pos.down(), Blocks.CONCRETE_POWDER.getStateFromMeta(getConcretePowderDrop(color).getMetadata()), 3);
                world.setBlockState(pos, Blocks.IRON_BARS.getDefaultState(), 3);
            }
        }
    }
    
    private static Block getConcreteBlock(EnumDyeColor color)
    {
        switch (color)
        {
            case BLACK: return (Block) IntegrityRegistry.BLACK_REINFORCED_CONCRETE;
            case BLUE: return (Block) IntegrityRegistry.BLUE_REINFORCED_CONCRETE;
            case BROWN: return (Block) IntegrityRegistry.BROWN_REINFORCED_CONCRETE;
            case CYAN: return (Block) IntegrityRegistry.CYAN_REINFORCED_CONCRETE;
            case GRAY: return (Block) IntegrityRegistry.GRAY_REINFORCED_CONCRETE;
            case GREEN: return (Block) IntegrityRegistry.GREEN_REINFORCED_CONCRETE;
            case LIGHT_BLUE: return (Block) IntegrityRegistry.LIGHT_BLUE_REINFORCED_CONCRETE;
            case LIME: return (Block) IntegrityRegistry.LIME_REINFORCED_CONCRETE;
            case MAGENTA: return (Block) IntegrityRegistry.MAGENTA_REINFORCED_CONCRETE;
            case ORANGE: return (Block) IntegrityRegistry.ORANGE_REINFORCED_CONCRETE;
            case PINK: return (Block) IntegrityRegistry.PINK_REINFORCED_CONCRETE;
            case PURPLE: return (Block) IntegrityRegistry.PURPLE_REINFORCED_CONCRETE;
            case RED: return (Block) IntegrityRegistry.RED_REINFORCED_CONCRETE;
            case SILVER: return (Block) IntegrityRegistry.SILVER_REINFORCED_CONCRETE;
            case WHITE: return (Block) IntegrityRegistry.WHITE_REINFORCED_CONCRETE;
            case YELLOW: return (Block) IntegrityRegistry.YELLOW_REINFORCED_CONCRETE;
            default: return (Block) IntegrityRegistry.WHITE_REINFORCED_CONCRETE;
        }
    }
    
    private static ItemStack getConcretePowderDrop(EnumDyeColor color)
    {
        switch (color)
        {
            case BLACK: return new ItemStack(Blocks.CONCRETE_POWDER, 1, 15);
            case BLUE: return new ItemStack(Blocks.CONCRETE_POWDER, 1, 11);
            case BROWN: return new ItemStack(Blocks.CONCRETE_POWDER, 1, 12);
            case CYAN: return new ItemStack(Blocks.CONCRETE_POWDER, 1, 9);
            case GRAY: return new ItemStack(Blocks.CONCRETE_POWDER, 1, 7);
            case GREEN: return new ItemStack(Blocks.CONCRETE_POWDER, 1, 13);
            case LIGHT_BLUE: return new ItemStack(Blocks.CONCRETE_POWDER, 1, 3);
            case LIME: return new ItemStack(Blocks.CONCRETE_POWDER, 1, 5);
            case MAGENTA: return new ItemStack(Blocks.CONCRETE_POWDER, 1, 2);
            case ORANGE: return new ItemStack(Blocks.CONCRETE_POWDER, 1, 1);
            case PINK: return new ItemStack(Blocks.CONCRETE_POWDER, 1, 6);
            case PURPLE: return new ItemStack(Blocks.CONCRETE_POWDER, 1, 10);
            case RED: return new ItemStack(Blocks.CONCRETE_POWDER, 1, 14);
            case SILVER: return new ItemStack(Blocks.CONCRETE_POWDER, 1, 8);
            case WHITE: return new ItemStack(Blocks.CONCRETE_POWDER, 1, 0);
            case YELLOW: return new ItemStack(Blocks.CONCRETE_POWDER, 1, 4);
            default: return new ItemStack(Blocks.CONCRETE_POWDER, 1, 0);
        }
    }
}
