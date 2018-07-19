package com.jtripled.integrity.block;

import com.jtripled.integrity.Integrity;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;

/**
 *
 * @author jtripled
 */
public final class BlockReinforcedDoor extends BlockDoor
{
    public BlockReinforcedDoor(EnumDyeColor color)
    {
        super(Material.IRON);
        this.setUnlocalizedName(color == null ? "reinforced_door" : color.getName() + "_reinforced_door");
        this.setRegistryName(Integrity.ID, color == null ? "reinforced_door" : color.getName() + "_reinforced_door");
        this.setHardness(200.0f);
        this.setResistance(8000.0f);
        this.setCreativeTab(CreativeTabs.REDSTONE);
    }
}
