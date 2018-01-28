package com.jtripled.integrity.block;

import com.jtripled.integrity.Integrity;
import com.jtripled.voxen.block.BlockPane;
import com.jtripled.voxen.util.HarvestLevel;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
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
        super(Integrity.INSTANCE, color != null ? color.getName() + "_reinforced_glass_pane" : "reinforced_glass_pane", Material.GLASS, color != null ? MapColor.getBlockColor(color) : MapColor.WHITE_STAINED_HARDENED_CLAY);
        this.setTab(CreativeTabs.DECORATIONS);
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
}
