package com.jtripled.integrity.block;

import com.jtripled.integrity.Integrity;
import com.jtripled.voxen.block.IBlockBase;
import com.jtripled.voxen.item.IItemBase;
import com.jtripled.voxen.mod.ModBase;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

/**
 *
 * @author jtripled
 */
public final class BlockReinforcedDoor extends BlockDoor implements IBlockBase
{
    private final EnumDyeColor color;
    private boolean registered;
    private final IItemBase item;
    
    public BlockReinforcedDoor(EnumDyeColor color)
    {
        super(Material.IRON);
        this.color = color;
        this.registered = false;
        this.setHardness(200.0f);
        this.setResistance(8000.0f);
        this.setUnlocalizedName(this.getName());
        this.setRegistryName(new ResourceLocation(Integrity.ID, this.getName()));
        this.setCreativeTab(CreativeTabs.REDSTONE);
        this.item = new ItemReinforcedDoor(this);
    }

    @Override
    public ModBase getMod() {
        return Integrity.INSTANCE;
    }

    @Override
    public String getName() {
        return this.color.getName() + "_reinforced_door";
    }

    @Override
    public boolean isRegistered() {
        return this.registered;
    }

    @Override
    public void setRegistered() {
        this.registered = true;
    }

    @Override
    public IItemBase getItem() {
        return this.item;
    }

    @Override
    public boolean hasItem() {
        return true;
    }

    @Override
    public IProperty[] getIgnoredProperties() {
        return new IProperty[] { BlockDoor.POWERED };
    }

    @Override
    public boolean hasIgnoredProperties() {
        return true;
    }

    @Override
    public Class<? extends TileEntity> getTileClass() {
        return null;
    }

    @Override
    public boolean hasTile() {
        return false;
    }

    @Override
    public Class<? extends TileEntitySpecialRenderer> getTESRClass() {
        return null;
    }

    @Override
    public boolean hasTESR() {
        return false;
    }

    @Override
    public TileEntitySpecialRenderer createTESR() {
        return null;
    }

    @Override
    public boolean hasUniqueInventoryModel() {
        return false;
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
