package com.jtripled.integrity;

import com.jtripled.integrity.block.*;
import com.jtripled.voxen.block.IBlockBase;
import com.jtripled.voxen.mod.RegistrationHandler;
import com.jtripled.voxen.mod.Registry;
import com.jtripled.voxen.util.Color;
import net.minecraft.item.EnumDyeColor;

/**
 *
 * @author jtripled
 */
public class IntegrityRegistry implements Registry
{
    public static final IBlockBase BLACK_REINFORCED_CONCRETE      = new BlockReinforcedConcrete(Color.BLACK);
    public static final IBlockBase BLUE_REINFORCED_CONCRETE       = new BlockReinforcedConcrete(Color.BLUE);
    public static final IBlockBase BROWN_REINFORCED_CONCRETE      = new BlockReinforcedConcrete(Color.BROWN);
    public static final IBlockBase CYAN_REINFORCED_CONCRETE       = new BlockReinforcedConcrete(Color.CYAN);
    public static final IBlockBase GRAY_REINFORCED_CONCRETE       = new BlockReinforcedConcrete(Color.GRAY);
    public static final IBlockBase GREEN_REINFORCED_CONCRETE      = new BlockReinforcedConcrete(Color.GREEN);
    public static final IBlockBase LIGHT_BLUE_REINFORCED_CONCRETE = new BlockReinforcedConcrete(Color.LIGHT_BLUE);
    public static final IBlockBase LIME_REINFORCED_CONCRETE       = new BlockReinforcedConcrete(Color.LIME);
    public static final IBlockBase MAGENTA_REINFORCED_CONCRETE    = new BlockReinforcedConcrete(Color.MAGENTA);
    public static final IBlockBase ORANGE_REINFORCED_CONCRETE     = new BlockReinforcedConcrete(Color.ORANGE);
    public static final IBlockBase PINK_REINFORCED_CONCRETE       = new BlockReinforcedConcrete(Color.PINK);
    public static final IBlockBase PURPLE_REINFORCED_CONCRETE     = new BlockReinforcedConcrete(Color.PURPLE);
    public static final IBlockBase RED_REINFORCED_CONCRETE        = new BlockReinforcedConcrete(Color.RED);
    public static final IBlockBase SILVER_REINFORCED_CONCRETE     = new BlockReinforcedConcrete(Color.SILVER);
    public static final IBlockBase WHITE_REINFORCED_CONCRETE      = new BlockReinforcedConcrete(Color.WHITE);
    public static final IBlockBase YELLOW_REINFORCED_CONCRETE     = new BlockReinforcedConcrete(Color.YELLOW);
    
    public static final IBlockBase BLACK_REINFORCED_CONCRETE_POWDER      = new BlockReinforcedConcretePowder(Color.BLACK);
    public static final IBlockBase BLUE_REINFORCED_CONCRETE_POWDER       = new BlockReinforcedConcretePowder(Color.BLUE);
    public static final IBlockBase BROWN_REINFORCED_CONCRETE_POWDER      = new BlockReinforcedConcretePowder(Color.BROWN);
    public static final IBlockBase CYAN_REINFORCED_CONCRETE_POWDER       = new BlockReinforcedConcretePowder(Color.CYAN);
    public static final IBlockBase GRAY_REINFORCED_CONCRETE_POWDER       = new BlockReinforcedConcretePowder(Color.GRAY);
    public static final IBlockBase GREEN_REINFORCED_CONCRETE_POWDER      = new BlockReinforcedConcretePowder(Color.GREEN);
    public static final IBlockBase LIGHT_BLUE_REINFORCED_CONCRETE_POWDER = new BlockReinforcedConcretePowder(Color.LIGHT_BLUE);
    public static final IBlockBase LIME_REINFORCED_CONCRETE_POWDER       = new BlockReinforcedConcretePowder(Color.LIME);
    public static final IBlockBase MAGENTA_REINFORCED_CONCRETE_POWDER    = new BlockReinforcedConcretePowder(Color.MAGENTA);
    public static final IBlockBase ORANGE_REINFORCED_CONCRETE_POWDER     = new BlockReinforcedConcretePowder(Color.ORANGE);
    public static final IBlockBase PINK_REINFORCED_CONCRETE_POWDER       = new BlockReinforcedConcretePowder(Color.PINK);
    public static final IBlockBase PURPLE_REINFORCED_CONCRETE_POWDER     = new BlockReinforcedConcretePowder(Color.PURPLE);
    public static final IBlockBase RED_REINFORCED_CONCRETE_POWDER        = new BlockReinforcedConcretePowder(Color.RED);
    public static final IBlockBase SILVER_REINFORCED_CONCRETE_POWDER     = new BlockReinforcedConcretePowder(Color.SILVER);
    public static final IBlockBase WHITE_REINFORCED_CONCRETE_POWDER      = new BlockReinforcedConcretePowder(Color.WHITE);
    public static final IBlockBase YELLOW_REINFORCED_CONCRETE_POWDER     = new BlockReinforcedConcretePowder(Color.YELLOW);
    
    public static final IBlockBase BLACK_REINFORCED_DOOR      = new BlockReinforcedDoor(EnumDyeColor.BLACK);
    public static final IBlockBase BLUE_REINFORCED_DOOR       = new BlockReinforcedDoor(EnumDyeColor.BLUE);
    public static final IBlockBase BROWN_REINFORCED_DOOR      = new BlockReinforcedDoor(EnumDyeColor.BROWN);
    public static final IBlockBase CYAN_REINFORCED_DOOR       = new BlockReinforcedDoor(EnumDyeColor.CYAN);
    public static final IBlockBase GRAY_REINFORCED_DOOR       = new BlockReinforcedDoor(EnumDyeColor.GRAY);
    public static final IBlockBase GREEN_REINFORCED_DOOR      = new BlockReinforcedDoor(EnumDyeColor.GREEN);
    public static final IBlockBase LIGHT_BLUE_REINFORCED_DOOR = new BlockReinforcedDoor(EnumDyeColor.LIGHT_BLUE);
    public static final IBlockBase LIME_REINFORCED_DOOR       = new BlockReinforcedDoor(EnumDyeColor.LIME);
    public static final IBlockBase MAGENTA_REINFORCED_DOOR    = new BlockReinforcedDoor(EnumDyeColor.MAGENTA);
    public static final IBlockBase ORANGE_REINFORCED_DOOR     = new BlockReinforcedDoor(EnumDyeColor.ORANGE);
    public static final IBlockBase PINK_REINFORCED_DOOR       = new BlockReinforcedDoor(EnumDyeColor.PINK);
    public static final IBlockBase PURPLE_REINFORCED_DOOR     = new BlockReinforcedDoor(EnumDyeColor.PURPLE);
    public static final IBlockBase RED_REINFORCED_DOOR        = new BlockReinforcedDoor(EnumDyeColor.RED);
    public static final IBlockBase SILVER_REINFORCED_DOOR     = new BlockReinforcedDoor(EnumDyeColor.SILVER);
    public static final IBlockBase WHITE_REINFORCED_DOOR      = new BlockReinforcedDoor(EnumDyeColor.WHITE);
    public static final IBlockBase YELLOW_REINFORCED_DOOR     = new BlockReinforcedDoor(EnumDyeColor.YELLOW);
    
    public static final IBlockBase BLACK_REINFORCED_TRAPDOOR      = new BlockReinforcedTrapdoor(EnumDyeColor.BLACK);
    public static final IBlockBase BLUE_REINFORCED_TRAPDOOR       = new BlockReinforcedTrapdoor(EnumDyeColor.BLUE);
    public static final IBlockBase BROWN_REINFORCED_TRAPDOOR      = new BlockReinforcedTrapdoor(EnumDyeColor.BROWN);
    public static final IBlockBase CYAN_REINFORCED_TRAPDOOR       = new BlockReinforcedTrapdoor(EnumDyeColor.CYAN);
    public static final IBlockBase GRAY_REINFORCED_TRAPDOOR       = new BlockReinforcedTrapdoor(EnumDyeColor.GRAY);
    public static final IBlockBase GREEN_REINFORCED_TRAPDOOR      = new BlockReinforcedTrapdoor(EnumDyeColor.GREEN);
    public static final IBlockBase LIGHT_BLUE_REINFORCED_TRAPDOOR = new BlockReinforcedTrapdoor(EnumDyeColor.LIGHT_BLUE);
    public static final IBlockBase LIME_REINFORCED_TRAPDOOR       = new BlockReinforcedTrapdoor(EnumDyeColor.LIME);
    public static final IBlockBase MAGENTA_REINFORCED_TRAPDOOR    = new BlockReinforcedTrapdoor(EnumDyeColor.MAGENTA);
    public static final IBlockBase ORANGE_REINFORCED_TRAPDOOR     = new BlockReinforcedTrapdoor(EnumDyeColor.ORANGE);
    public static final IBlockBase PINK_REINFORCED_TRAPDOOR       = new BlockReinforcedTrapdoor(EnumDyeColor.PINK);
    public static final IBlockBase PURPLE_REINFORCED_TRAPDOOR     = new BlockReinforcedTrapdoor(EnumDyeColor.PURPLE);
    public static final IBlockBase RED_REINFORCED_TRAPDOOR        = new BlockReinforcedTrapdoor(EnumDyeColor.RED);
    public static final IBlockBase SILVER_REINFORCED_TRAPDOOR     = new BlockReinforcedTrapdoor(EnumDyeColor.SILVER);
    public static final IBlockBase WHITE_REINFORCED_TRAPDOOR      = new BlockReinforcedTrapdoor(EnumDyeColor.WHITE);
    public static final IBlockBase YELLOW_REINFORCED_TRAPDOOR     = new BlockReinforcedTrapdoor(EnumDyeColor.YELLOW);
    
    public static final IBlockBase REINFORCED_GLASS            = new BlockReinforcedGlass();
    public static final IBlockBase BLACK_REINFORCED_GLASS      = new BlockReinforcedGlass(Color.BLACK);
    public static final IBlockBase BLUE_REINFORCED_GLASS       = new BlockReinforcedGlass(Color.BLUE);
    public static final IBlockBase BROWN_REINFORCED_GLASS      = new BlockReinforcedGlass(Color.BROWN);
    public static final IBlockBase CYAN_REINFORCED_GLASS       = new BlockReinforcedGlass(Color.CYAN);
    public static final IBlockBase GRAY_REINFORCED_GLASS       = new BlockReinforcedGlass(Color.GRAY);
    public static final IBlockBase GREEN_REINFORCED_GLASS      = new BlockReinforcedGlass(Color.GREEN);
    public static final IBlockBase LIGHT_BLUE_REINFORCED_GLASS = new BlockReinforcedGlass(Color.LIGHT_BLUE);
    public static final IBlockBase LIME_REINFORCED_GLASS       = new BlockReinforcedGlass(Color.LIME);
    public static final IBlockBase MAGENTA_REINFORCED_GLASS    = new BlockReinforcedGlass(Color.MAGENTA);
    public static final IBlockBase ORANGE_REINFORCED_GLASS     = new BlockReinforcedGlass(Color.ORANGE);
    public static final IBlockBase PINK_REINFORCED_GLASS       = new BlockReinforcedGlass(Color.PINK);
    public static final IBlockBase PURPLE_REINFORCED_GLASS     = new BlockReinforcedGlass(Color.PURPLE);
    public static final IBlockBase RED_REINFORCED_GLASS        = new BlockReinforcedGlass(Color.RED);
    public static final IBlockBase SILVER_REINFORCED_GLASS     = new BlockReinforcedGlass(Color.SILVER);
    public static final IBlockBase WHITE_REINFORCED_GLASS      = new BlockReinforcedGlass(Color.WHITE);
    public static final IBlockBase YELLOW_REINFORCED_GLASS     = new BlockReinforcedGlass(Color.YELLOW);
    
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
        
        handler.registerBlock(BLACK_REINFORCED_DOOR);
        handler.registerBlock(BLUE_REINFORCED_DOOR);
        handler.registerBlock(BROWN_REINFORCED_DOOR);
        handler.registerBlock(CYAN_REINFORCED_DOOR);
        handler.registerBlock(GRAY_REINFORCED_DOOR);
        handler.registerBlock(GREEN_REINFORCED_DOOR);
        handler.registerBlock(LIGHT_BLUE_REINFORCED_DOOR);
        handler.registerBlock(LIME_REINFORCED_DOOR);
        handler.registerBlock(MAGENTA_REINFORCED_DOOR);
        handler.registerBlock(ORANGE_REINFORCED_DOOR);
        handler.registerBlock(PINK_REINFORCED_DOOR);
        handler.registerBlock(PURPLE_REINFORCED_DOOR);
        handler.registerBlock(RED_REINFORCED_DOOR);
        handler.registerBlock(SILVER_REINFORCED_DOOR);
        handler.registerBlock(WHITE_REINFORCED_DOOR);
        handler.registerBlock(YELLOW_REINFORCED_DOOR);
        
        handler.registerBlock(BLACK_REINFORCED_TRAPDOOR);
        handler.registerBlock(BLUE_REINFORCED_TRAPDOOR);
        handler.registerBlock(BROWN_REINFORCED_TRAPDOOR);
        handler.registerBlock(CYAN_REINFORCED_TRAPDOOR);
        handler.registerBlock(GRAY_REINFORCED_TRAPDOOR);
        handler.registerBlock(GREEN_REINFORCED_TRAPDOOR);
        handler.registerBlock(LIGHT_BLUE_REINFORCED_TRAPDOOR);
        handler.registerBlock(LIME_REINFORCED_TRAPDOOR);
        handler.registerBlock(MAGENTA_REINFORCED_TRAPDOOR);
        handler.registerBlock(ORANGE_REINFORCED_TRAPDOOR);
        handler.registerBlock(PINK_REINFORCED_TRAPDOOR);
        handler.registerBlock(PURPLE_REINFORCED_TRAPDOOR);
        handler.registerBlock(RED_REINFORCED_TRAPDOOR);
        handler.registerBlock(SILVER_REINFORCED_TRAPDOOR);
        handler.registerBlock(WHITE_REINFORCED_TRAPDOOR);
        handler.registerBlock(YELLOW_REINFORCED_TRAPDOOR);
        
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
    
    @Override
    public void onRegisterRecipes(RegistrationHandler handler)
    {
        handler.removeRecipe("minecraft", "iron_bars");
    }
}
