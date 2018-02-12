package com.jtripled.integrity.block;

import com.jtripled.integrity.Integrity;
import com.jtripled.voxen.block.BlockTrapdoor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;

/**
 *
 * @author jtripled
 */
public final class BlockReinforcedTrapdoor extends BlockTrapdoor
{
    public BlockReinforcedTrapdoor(EnumDyeColor color)
    {
        super(Integrity.INSTANCE, color.getName() + "_reinforced_trapdoor", Material.IRON);
        this.setHardness(200.0f);
        this.setResistance(8000.0f);
        this.setTab(CreativeTabs.REDSTONE);
        this.setItem();
    }
}
