package com.jtripled.integrity.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

/**
 *
 * @author jtripled
 */
public class IntegrityItemBlock extends ItemBlock
{
    public IntegrityItemBlock(Block block)
    {
        super(block);
        this.setUnlocalizedName(block.getUnlocalizedName());
        this.setRegistryName(block.getRegistryName());
    }
}
