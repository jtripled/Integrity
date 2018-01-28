package com.jtripled.integrity.block;

import com.jtripled.integrity.Integrity;
import com.jtripled.voxen.block.BlockBase;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 *
 * @author jtripled
 */
public final class BlockReinforcedGlass extends BlockBase
{
    public BlockReinforcedGlass()
    {
        this(null);
    }
    
    public BlockReinforcedGlass(EnumDyeColor color)
    {
        super(Integrity.INSTANCE, color != null ? color.getName() + "_reinforced_glass" : "reinforced_glass", Material.GLASS, color != null ? MapColor.getBlockColor(color) : MapColor.WHITE_STAINED_HARDENED_CLAY);
        this.setTab(CreativeTabs.BUILDING_BLOCKS);
        this.setHardness(100.0f);
        this.setResistance(6000.0f);
        this.setSoundType(SoundType.GLASS);
        this.setItem();
    }
    
    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @Override
    protected boolean canSilkHarvest()
    {
        return false;
    }
     
    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune)
    {
        return null;
    }
 
    @SideOnly(Side.CLIENT)
    @Override
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
    {
        IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
        Block block = iblockstate.getBlock();
        
        if (block instanceof BlockReinforcedGlass)
        {
            return false;
        }

        return block == this ? false : super.shouldSideBeRendered(blockState, blockAccess, pos, side);
    }
}
