package com.jtripled.integrity.block;

import com.jtripled.voxen.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.BlockRenderLayer;

/**
 *
 * @author jtripled
 */
public final class BlockReinforcedDoor extends BlockDoor
{
    public BlockReinforcedDoor(EnumDyeColor color)
    {
        super(color.getName() + "_reinforced_door", Material.IRON);
        this.setHardness(200.0f);
        this.setResistance(8000.0f);
        this.setTab(CreativeTabs.REDSTONE);
        this.setItem();
        this.setRenderLayer(BlockRenderLayer.CUTOUT);
        this.setFullCube(false);
        this.setOpaque(false);
    }
}
