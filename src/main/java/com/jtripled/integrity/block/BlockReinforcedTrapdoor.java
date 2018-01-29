package com.jtripled.integrity.block;

import com.jtripled.integrity.Integrity;
import com.jtripled.voxen.block.IBlockBase;
import com.jtripled.voxen.item.IItemBase;
import com.jtripled.voxen.item.ItemBlockBase;
import com.jtripled.voxen.mod.ModBase;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

/**
 *
 * @author jtripled
 */
public class BlockReinforcedTrapdoor extends BlockTrapDoor implements IBlockBase
{
    private final EnumDyeColor color;
    private boolean registered;
    private final IItemBase item;
    
    public BlockReinforcedTrapdoor(EnumDyeColor color)
    {
        super(Material.IRON);
        this.color = color;
        this.registered = false;
        this.setHardness(200.0f);
        this.setResistance(8000.0f);
        this.setUnlocalizedName(this.getName());
        this.setRegistryName(new ResourceLocation(Integrity.ID, this.getName()));
        this.setCreativeTab(CreativeTabs.REDSTONE);
        this.item = new ItemBlockBase(this);
    }

    @Override
    public ModBase getMod() {
        return Integrity.INSTANCE;
    }

    @Override
    public String getName() {
        return this.color.getName() + "_reinforced_trapdoor";
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
        return null;
    }

    @Override
    public boolean hasIgnoredProperties() {
        return false;
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
}
