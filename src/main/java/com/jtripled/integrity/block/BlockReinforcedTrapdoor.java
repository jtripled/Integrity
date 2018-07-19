package com.jtripled.integrity.block;

import com.jtripled.integrity.Integrity;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;

/**
 *
 * @author jtripled
 */
public final class BlockReinforcedTrapdoor extends BlockTrapDoor
{
    public BlockReinforcedTrapdoor(EnumDyeColor color)
    {
        super(Material.IRON);
        this.setUnlocalizedName(color == null ? "reinforced_trapdoor" : color.getName() + "_reinforced_trapdoor");
        this.setRegistryName(Integrity.ID, color == null ? "reinforced_trapdoor" : color.getName() + "_reinforced_trapdoor");
        this.setHardness(200.0f);
        this.setResistance(8000.0f);
        this.setCreativeTab(CreativeTabs.REDSTONE);
    }
}
