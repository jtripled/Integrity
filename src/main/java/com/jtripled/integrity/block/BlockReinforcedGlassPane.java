package com.jtripled.integrity.block;

import com.jtripled.integrity.Integrity;
import net.minecraft.block.BlockPane;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.BlockRenderLayer;

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
        super(Material.GLASS, false);
        this.setUnlocalizedName(color == null ? "reinforced_glass_pane" : color.getName() + "_reinforced_glass_pane");
        this.setRegistryName(Integrity.ID, color == null ? "reinforced_glass_pane" : color.getName() + "_reinforced_glass_pane");
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setHardness(120.0f);
        this.setResistance(4000.0f);
        this.setSoundType(SoundType.GLASS);
    }
    
    @Override
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }
}
