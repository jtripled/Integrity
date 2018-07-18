package com.jtripled.integrity.block;

import com.jtripled.voxen.block.BlockColored;
import com.jtripled.voxen.util.Color;
import com.jtripled.voxen.util.HarvestLevel;
import com.jtripled.voxen.util.Tab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 *
 * @author jtripled
 */
public final class BlockReinforcedConcrete extends BlockColored
{
    public BlockReinforcedConcrete(Color color)
    {
        super("reinforced_concrete", Material.ROCK, color);
        this.setTab(Tab.BUILDING);
        this.setHardness(200.0f);
        this.setResistance(8000.0f);
        this.setSoundType(SoundType.STONE);
        this.setItem();
        this.setHarvestable(false);
        this.setHarvestLevel(HarvestLevel.DIAMOND);
    }
}
