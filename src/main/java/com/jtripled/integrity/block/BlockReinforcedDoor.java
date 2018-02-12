package com.jtripled.integrity.block;

import com.jtripled.integrity.Integrity;
import com.jtripled.voxen.block.BlockDoor;
import com.jtripled.voxen.item.IItemBase;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemStack;

/**
 *
 * @author jtripled
 */
public final class BlockReinforcedDoor extends BlockDoor
{
    public BlockReinforcedDoor(EnumDyeColor color)
    {
        super(Integrity.INSTANCE, color.getName() + "_reinforced_door", Material.IRON);
        this.setHardness(200.0f);
        this.setResistance(8000.0f);
        this.setTab(CreativeTabs.REDSTONE);
        this.setItem(new ItemReinforcedDoor(this));
    }
    
    public static class ItemReinforcedDoor extends ItemDoor implements IItemBase
    {
        private final BlockReinforcedDoor block;
        private boolean registered;
        
        public ItemReinforcedDoor(BlockReinforcedDoor block)
        {
            super(block);
            this.block = block;
            this.registered = false;
            this.setUnlocalizedName(block.getUnlocalizedName());
            this.setRegistryName(block.getRegistryName());
        }
        
        @Override
        public String getUnlocalizedName() {
            return block.getUnlocalizedName();
        }
        
        @Override
        public String getUnlocalizedName(ItemStack stack) {
            return block.getUnlocalizedName();
        }
        
        @Override
        public String getName() {
            return this.getUnlocalizedName();
        }

        @Override
        public boolean isRegistered() {
            return this.registered;
        }

        @Override
        public void setRegistered() {
            this.registered = true;
        }
    }
}
