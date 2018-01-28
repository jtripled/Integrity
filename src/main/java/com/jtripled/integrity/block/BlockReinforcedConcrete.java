package com.jtripled.integrity.block;

import com.jtripled.integrity.Integrity;
import com.jtripled.voxen.block.BlockBase;
import com.jtripled.voxen.util.HarvestLevel;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;

/**
 *
 * @author jtripled
 */
public final class BlockReinforcedConcrete extends BlockBase
{
    public BlockReinforcedConcrete(EnumDyeColor color)
    {
        super(Integrity.INSTANCE, color.getName() + "_reinforced_concrete", Material.ROCK, MapColor.getBlockColor(color));
        this.setTab(CreativeTabs.BUILDING_BLOCKS);
        this.setHardness(200.0f);
        this.setResistance(8000.0f);
        this.setSoundType(SoundType.STONE);
        this.setItem();
        this.setHarvestable(false);
        this.setHarvestLevel(HarvestLevel.DIAMOND);
    }
}
