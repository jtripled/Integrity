package com.jtripled.integrity.block;

import com.jtripled.integrity.Integrity;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
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
public final class BlockReinforcedGlass extends Block
{
    public BlockReinforcedGlass()
    {
        this(null);
    }
    
    public BlockReinforcedGlass(EnumDyeColor color)
    {
        super(Material.GLASS, color == null ? null : MapColor.getBlockColor(color));
        this.setUnlocalizedName(color == null ? "reinforced_glass" : color.getName() + "_reinforced_glass");
        this.setRegistryName(Integrity.getID(), color == null ? "reinforced_glass" : color.getName() + "_reinforced_glass");
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setHardness(160.0f);
        this.setResistance(6000.0f);
        this.setSoundType(SoundType.GLASS);
    }
    
    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
    
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
