package com.jtripled.integrity.block;

import com.jtripled.integrity.Integrity;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;

/**
 *
 * @author jtripled
 */
public final class BlockReinforcedConcrete extends Block
{
    public BlockReinforcedConcrete(EnumDyeColor color)
    {
        super(Material.ROCK, color == null ? null : MapColor.getBlockColor(color));
        this.setUnlocalizedName(color == null ? "reinforced_concrete" : color.getName() + "_reinforced_concrete");
        this.setRegistryName(Integrity.getID(), color == null ? "reinforced_concrete" : color.getName() + "_reinforced_concrete");
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setHardness(200.0f);
        this.setResistance(8000.0f);
        this.setSoundType(SoundType.STONE);
    }
}
