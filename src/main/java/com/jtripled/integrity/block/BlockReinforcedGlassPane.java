package com.jtripled.integrity.block;

import com.jtripled.integrity.Integrity;
import com.jtripled.voxen.block.BlockPane;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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
        super(Integrity.INSTANCE, color != null ? color.getName() + "_reinforced_glass_pane" : "reinforced_glass_pane", Material.GLASS, color != null ? MapColor.getBlockColor(color) : MapColor.WHITE_STAINED_HARDENED_CLAY);
        this.setTab(CreativeTabs.DECORATIONS);
        this.setHardness(80.0f);
        this.setResistance(6000.0f);
        this.setSoundType(SoundType.GLASS);
        this.setItem();
    }
 
    @SideOnly(Side.CLIENT)
    @Override
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }
}
