package com.jtripled.integrity.block;

import com.jtripled.voxen.block.BlockPane;
import com.jtripled.voxen.util.HarvestLevel;
import com.jtripled.voxen.util.Tab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

/**
 *
 * @author jtripled
 */
public final class BlockReinforcedGlassPane extends BlockPane
{
    public BlockReinforcedGlassPane()
    {
        this(null);
    }
    
    public BlockReinforcedGlassPane(EnumDyeColor color)
    {
        super(color != null ? color.getName() + "_reinforced_glass_pane" : "reinforced_glass_pane", Material.GLASS, color != null ? MapColor.getBlockColor(color) : MapColor.WHITE_STAINED_HARDENED_CLAY);
        this.setTab(Tab.BUILDING);
        this.setHardness(120.0f);
        this.setResistance(4000.0f);
        this.setSoundType(SoundType.GLASS);
        this.setItem();
        this.setHarvestable(false);
        this.setOpaque(false);
        this.setFullCube(false);
        this.setRenderLayer(BlockRenderLayer.TRANSLUCENT);
        this.setHarvestLevel(HarvestLevel.DIAMOND);
    }

    @Override
    public boolean canConnect(BlockPos pos, IBlockState state, IBlockAccess world, BlockPos otherPos, IBlockState otherState, EnumFacing face)
    {
        return otherState.getBlock() instanceof BlockReinforcedGlassPane ||
                otherState.getBlock() instanceof net.minecraft.block.BlockPane;
    }
}
