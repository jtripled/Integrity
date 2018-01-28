package com.jtripled.integrity;

import com.jtripled.integrity.block.*;
import com.jtripled.voxen.block.IBlockBase;
import com.jtripled.voxen.mod.RegistrationHandler;
import com.jtripled.voxen.mod.Registry;
import net.minecraft.item.EnumDyeColor;

/**
 *
 * @author jtripled
 */
public class IntegrityRegistry implements Registry
{
    public static final IBlockBase BLACK_REINFORCED_CONCRETE      = new BlockReinforcedConcrete(EnumDyeColor.BLACK);
    public static final IBlockBase BLUE_REINFORCED_CONCRETE       = new BlockReinforcedConcrete(EnumDyeColor.BLUE);
    public static final IBlockBase BROWN_REINFORCED_CONCRETE      = new BlockReinforcedConcrete(EnumDyeColor.BROWN);
    public static final IBlockBase CYAN_REINFORCED_CONCRETE       = new BlockReinforcedConcrete(EnumDyeColor.CYAN);
    public static final IBlockBase GRAY_REINFORCED_CONCRETE       = new BlockReinforcedConcrete(EnumDyeColor.GRAY);
    public static final IBlockBase GREEN_REINFORCED_CONCRETE      = new BlockReinforcedConcrete(EnumDyeColor.GREEN);
    public static final IBlockBase LIGHT_BLUE_REINFORCED_CONCRETE = new BlockReinforcedConcrete(EnumDyeColor.LIGHT_BLUE);
    public static final IBlockBase LIME_REINFORCED_CONCRETE       = new BlockReinforcedConcrete(EnumDyeColor.LIME);
    public static final IBlockBase MAGENTA_REINFORCED_CONCRETE    = new BlockReinforcedConcrete(EnumDyeColor.MAGENTA);
    public static final IBlockBase ORANGE_REINFORCED_CONCRETE     = new BlockReinforcedConcrete(EnumDyeColor.ORANGE);
    public static final IBlockBase PINK_REINFORCED_CONCRETE       = new BlockReinforcedConcrete(EnumDyeColor.PINK);
    public static final IBlockBase PURPLE_REINFORCED_CONCRETE     = new BlockReinforcedConcrete(EnumDyeColor.PURPLE);
    public static final IBlockBase RED_REINFORCED_CONCRETE        = new BlockReinforcedConcrete(EnumDyeColor.RED);
    public static final IBlockBase SILVER_REINFORCED_CONCRETE     = new BlockReinforcedConcrete(EnumDyeColor.SILVER);
    public static final IBlockBase WHITE_REINFORCED_CONCRETE      = new BlockReinforcedConcrete(EnumDyeColor.WHITE);
    public static final IBlockBase YELLOW_REINFORCED_CONCRETE     = new BlockReinforcedConcrete(EnumDyeColor.YELLOW);
    
    public static final IBlockBase BLACK_REINFORCED_CONCRETE_POWDER      = new BlockReinforcedConcretePowder(EnumDyeColor.BLACK);
    public static final IBlockBase BLUE_REINFORCED_CONCRETE_POWDER       = new BlockReinforcedConcretePowder(EnumDyeColor.BLUE);
    public static final IBlockBase BROWN_REINFORCED_CONCRETE_POWDER      = new BlockReinforcedConcretePowder(EnumDyeColor.BROWN);
    public static final IBlockBase CYAN_REINFORCED_CONCRETE_POWDER       = new BlockReinforcedConcretePowder(EnumDyeColor.CYAN);
    public static final IBlockBase GRAY_REINFORCED_CONCRETE_POWDER       = new BlockReinforcedConcretePowder(EnumDyeColor.GRAY);
    public static final IBlockBase GREEN_REINFORCED_CONCRETE_POWDER      = new BlockReinforcedConcretePowder(EnumDyeColor.GREEN);
    public static final IBlockBase LIGHT_BLUE_REINFORCED_CONCRETE_POWDER = new BlockReinforcedConcretePowder(EnumDyeColor.LIGHT_BLUE);
    public static final IBlockBase LIME_REINFORCED_CONCRETE_POWDER       = new BlockReinforcedConcretePowder(EnumDyeColor.LIME);
    public static final IBlockBase MAGENTA_REINFORCED_CONCRETE_POWDER    = new BlockReinforcedConcretePowder(EnumDyeColor.MAGENTA);
    public static final IBlockBase ORANGE_REINFORCED_CONCRETE_POWDER     = new BlockReinforcedConcretePowder(EnumDyeColor.ORANGE);
    public static final IBlockBase PINK_REINFORCED_CONCRETE_POWDER       = new BlockReinforcedConcretePowder(EnumDyeColor.PINK);
    public static final IBlockBase PURPLE_REINFORCED_CONCRETE_POWDER     = new BlockReinforcedConcretePowder(EnumDyeColor.PURPLE);
    public static final IBlockBase RED_REINFORCED_CONCRETE_POWDER        = new BlockReinforcedConcretePowder(EnumDyeColor.RED);
    public static final IBlockBase SILVER_REINFORCED_CONCRETE_POWDER     = new BlockReinforcedConcretePowder(EnumDyeColor.SILVER);
    public static final IBlockBase WHITE_REINFORCED_CONCRETE_POWDER      = new BlockReinforcedConcretePowder(EnumDyeColor.WHITE);
    public static final IBlockBase YELLOW_REINFORCED_CONCRETE_POWDER     = new BlockReinforcedConcretePowder(EnumDyeColor.YELLOW);
    
    public static final IBlockBase REINFORCED_GLASS            = new BlockReinforcedGlass();
    public static final IBlockBase BLACK_REINFORCED_GLASS      = new BlockReinforcedGlass(EnumDyeColor.BLACK);
    public static final IBlockBase BLUE_REINFORCED_GLASS       = new BlockReinforcedGlass(EnumDyeColor.BLUE);
    public static final IBlockBase BROWN_REINFORCED_GLASS      = new BlockReinforcedGlass(EnumDyeColor.BROWN);
    public static final IBlockBase CYAN_REINFORCED_GLASS       = new BlockReinforcedGlass(EnumDyeColor.CYAN);
    public static final IBlockBase GRAY_REINFORCED_GLASS       = new BlockReinforcedGlass(EnumDyeColor.GRAY);
    public static final IBlockBase GREEN_REINFORCED_GLASS      = new BlockReinforcedGlass(EnumDyeColor.GREEN);
    public static final IBlockBase LIGHT_BLUE_REINFORCED_GLASS = new BlockReinforcedGlass(EnumDyeColor.LIGHT_BLUE);
    public static final IBlockBase LIME_REINFORCED_GLASS       = new BlockReinforcedGlass(EnumDyeColor.LIME);
    public static final IBlockBase MAGENTA_REINFORCED_GLASS    = new BlockReinforcedGlass(EnumDyeColor.MAGENTA);
    public static final IBlockBase ORANGE_REINFORCED_GLASS     = new BlockReinforcedGlass(EnumDyeColor.ORANGE);
    public static final IBlockBase PINK_REINFORCED_GLASS       = new BlockReinforcedGlass(EnumDyeColor.PINK);
    public static final IBlockBase PURPLE_REINFORCED_GLASS     = new BlockReinforcedGlass(EnumDyeColor.PURPLE);
    public static final IBlockBase RED_REINFORCED_GLASS        = new BlockReinforcedGlass(EnumDyeColor.RED);
    public static final IBlockBase SILVER_REINFORCED_GLASS     = new BlockReinforcedGlass(EnumDyeColor.SILVER);
    public static final IBlockBase WHITE_REINFORCED_GLASS      = new BlockReinforcedGlass(EnumDyeColor.WHITE);
    public static final IBlockBase YELLOW_REINFORCED_GLASS     = new BlockReinforcedGlass(EnumDyeColor.YELLOW);
    
    public static final IBlockBase REINFORCED_GLASS_PANE            = new BlockReinforcedGlassPane();
    public static final IBlockBase BLACK_REINFORCED_GLASS_PANE      = new BlockReinforcedGlassPane(EnumDyeColor.BLACK);
    public static final IBlockBase BLUE_REINFORCED_GLASS_PANE       = new BlockReinforcedGlassPane(EnumDyeColor.BLUE);
    public static final IBlockBase BROWN_REINFORCED_GLASS_PANE      = new BlockReinforcedGlassPane(EnumDyeColor.BROWN);
    public static final IBlockBase CYAN_REINFORCED_GLASS_PANE       = new BlockReinforcedGlassPane(EnumDyeColor.CYAN);
    public static final IBlockBase GRAY_REINFORCED_GLASS_PANE       = new BlockReinforcedGlassPane(EnumDyeColor.GRAY);
    public static final IBlockBase GREEN_REINFORCED_GLASS_PANE      = new BlockReinforcedGlassPane(EnumDyeColor.GREEN);
    public static final IBlockBase LIGHT_BLUE_REINFORCED_GLASS_PANE = new BlockReinforcedGlassPane(EnumDyeColor.LIGHT_BLUE);
    public static final IBlockBase LIME_REINFORCED_GLASS_PANE       = new BlockReinforcedGlassPane(EnumDyeColor.LIME);
    public static final IBlockBase MAGENTA_REINFORCED_GLASS_PANE    = new BlockReinforcedGlassPane(EnumDyeColor.MAGENTA);
    public static final IBlockBase ORANGE_REINFORCED_GLASS_PANE     = new BlockReinforcedGlassPane(EnumDyeColor.ORANGE);
    public static final IBlockBase PINK_REINFORCED_GLASS_PANE       = new BlockReinforcedGlassPane(EnumDyeColor.PINK);
    public static final IBlockBase PURPLE_REINFORCED_GLASS_PANE     = new BlockReinforcedGlassPane(EnumDyeColor.PURPLE);
    public static final IBlockBase RED_REINFORCED_GLASS_PANE        = new BlockReinforcedGlassPane(EnumDyeColor.RED);
    public static final IBlockBase SILVER_REINFORCED_GLASS_PANE     = new BlockReinforcedGlassPane(EnumDyeColor.SILVER);
    public static final IBlockBase WHITE_REINFORCED_GLASS_PANE      = new BlockReinforcedGlassPane(EnumDyeColor.WHITE);
    public static final IBlockBase YELLOW_REINFORCED_GLASS_PANE     = new BlockReinforcedGlassPane(EnumDyeColor.YELLOW);
    
    @Override
    public void onRegisterBlocks(RegistrationHandler handler)
    {
        handler.registerBlock(BLACK_REINFORCED_CONCRETE);
        handler.registerBlock(BLUE_REINFORCED_CONCRETE);
        handler.registerBlock(BROWN_REINFORCED_CONCRETE);
        handler.registerBlock(CYAN_REINFORCED_CONCRETE);
        handler.registerBlock(GRAY_REINFORCED_CONCRETE);
        handler.registerBlock(GREEN_REINFORCED_CONCRETE);
        handler.registerBlock(LIGHT_BLUE_REINFORCED_CONCRETE);
        handler.registerBlock(LIME_REINFORCED_CONCRETE);
        handler.registerBlock(MAGENTA_REINFORCED_CONCRETE);
        handler.registerBlock(ORANGE_REINFORCED_CONCRETE);
        handler.registerBlock(PINK_REINFORCED_CONCRETE);
        handler.registerBlock(PURPLE_REINFORCED_CONCRETE);
        handler.registerBlock(RED_REINFORCED_CONCRETE);
        handler.registerBlock(SILVER_REINFORCED_CONCRETE);
        handler.registerBlock(WHITE_REINFORCED_CONCRETE);
        handler.registerBlock(YELLOW_REINFORCED_CONCRETE);
        
        handler.registerBlock(BLACK_REINFORCED_CONCRETE_POWDER);
        handler.registerBlock(BLUE_REINFORCED_CONCRETE_POWDER);
        handler.registerBlock(BROWN_REINFORCED_CONCRETE_POWDER);
        handler.registerBlock(CYAN_REINFORCED_CONCRETE_POWDER);
        handler.registerBlock(GRAY_REINFORCED_CONCRETE_POWDER);
        handler.registerBlock(GREEN_REINFORCED_CONCRETE_POWDER);
        handler.registerBlock(LIGHT_BLUE_REINFORCED_CONCRETE_POWDER);
        handler.registerBlock(LIME_REINFORCED_CONCRETE_POWDER);
        handler.registerBlock(MAGENTA_REINFORCED_CONCRETE_POWDER);
        handler.registerBlock(ORANGE_REINFORCED_CONCRETE_POWDER);
        handler.registerBlock(PINK_REINFORCED_CONCRETE_POWDER);
        handler.registerBlock(PURPLE_REINFORCED_CONCRETE_POWDER);
        handler.registerBlock(RED_REINFORCED_CONCRETE_POWDER);
        handler.registerBlock(SILVER_REINFORCED_CONCRETE_POWDER);
        handler.registerBlock(WHITE_REINFORCED_CONCRETE_POWDER);
        handler.registerBlock(YELLOW_REINFORCED_CONCRETE_POWDER);
        
        handler.registerBlock(REINFORCED_GLASS);
        handler.registerBlock(BLACK_REINFORCED_GLASS);
        handler.registerBlock(BLUE_REINFORCED_GLASS);
        handler.registerBlock(BROWN_REINFORCED_GLASS);
        handler.registerBlock(CYAN_REINFORCED_GLASS);
        handler.registerBlock(GRAY_REINFORCED_GLASS);
        handler.registerBlock(GREEN_REINFORCED_GLASS);
        handler.registerBlock(LIGHT_BLUE_REINFORCED_GLASS);
        handler.registerBlock(LIME_REINFORCED_GLASS);
        handler.registerBlock(MAGENTA_REINFORCED_GLASS);
        handler.registerBlock(ORANGE_REINFORCED_GLASS);
        handler.registerBlock(PINK_REINFORCED_GLASS);
        handler.registerBlock(PURPLE_REINFORCED_GLASS);
        handler.registerBlock(RED_REINFORCED_GLASS);
        handler.registerBlock(SILVER_REINFORCED_GLASS);
        handler.registerBlock(WHITE_REINFORCED_GLASS);
        handler.registerBlock(YELLOW_REINFORCED_GLASS);
        
        handler.registerBlock(REINFORCED_GLASS_PANE);
        handler.registerBlock(BLACK_REINFORCED_GLASS_PANE);
        handler.registerBlock(BLUE_REINFORCED_GLASS_PANE);
        handler.registerBlock(BROWN_REINFORCED_GLASS_PANE);
        handler.registerBlock(CYAN_REINFORCED_GLASS_PANE);
        handler.registerBlock(GRAY_REINFORCED_GLASS_PANE);
        handler.registerBlock(GREEN_REINFORCED_GLASS_PANE);
        handler.registerBlock(LIGHT_BLUE_REINFORCED_GLASS_PANE);
        handler.registerBlock(LIME_REINFORCED_GLASS_PANE);
        handler.registerBlock(MAGENTA_REINFORCED_GLASS_PANE);
        handler.registerBlock(ORANGE_REINFORCED_GLASS_PANE);
        handler.registerBlock(PINK_REINFORCED_GLASS_PANE);
        handler.registerBlock(PURPLE_REINFORCED_GLASS_PANE);
        handler.registerBlock(RED_REINFORCED_GLASS_PANE);
        handler.registerBlock(SILVER_REINFORCED_GLASS_PANE);
        handler.registerBlock(WHITE_REINFORCED_GLASS_PANE);
        handler.registerBlock(YELLOW_REINFORCED_GLASS_PANE);
    }
}
