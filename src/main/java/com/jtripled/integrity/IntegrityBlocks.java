package com.jtripled.integrity;

import com.jtripled.integrity.block.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.item.EnumDyeColor;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 *
 * @author jtripled
 */
@Mod.EventBusSubscriber
public class IntegrityBlocks
{
    public static final Block BLACK_REINFORCED_CONCRETE      = new BlockReinforcedConcrete(EnumDyeColor.BLACK);
    public static final Block BLUE_REINFORCED_CONCRETE       = new BlockReinforcedConcrete(EnumDyeColor.BLUE);
    public static final Block BROWN_REINFORCED_CONCRETE      = new BlockReinforcedConcrete(EnumDyeColor.BROWN);
    public static final Block CYAN_REINFORCED_CONCRETE       = new BlockReinforcedConcrete(EnumDyeColor.CYAN);
    public static final Block GRAY_REINFORCED_CONCRETE       = new BlockReinforcedConcrete(EnumDyeColor.GRAY);
    public static final Block GREEN_REINFORCED_CONCRETE      = new BlockReinforcedConcrete(EnumDyeColor.GREEN);
    public static final Block LIGHT_BLUE_REINFORCED_CONCRETE = new BlockReinforcedConcrete(EnumDyeColor.LIGHT_BLUE);
    public static final Block LIME_REINFORCED_CONCRETE       = new BlockReinforcedConcrete(EnumDyeColor.LIME);
    public static final Block MAGENTA_REINFORCED_CONCRETE    = new BlockReinforcedConcrete(EnumDyeColor.MAGENTA);
    public static final Block ORANGE_REINFORCED_CONCRETE     = new BlockReinforcedConcrete(EnumDyeColor.ORANGE);
    public static final Block PINK_REINFORCED_CONCRETE       = new BlockReinforcedConcrete(EnumDyeColor.PINK);
    public static final Block PURPLE_REINFORCED_CONCRETE     = new BlockReinforcedConcrete(EnumDyeColor.PURPLE);
    public static final Block RED_REINFORCED_CONCRETE        = new BlockReinforcedConcrete(EnumDyeColor.RED);
    public static final Block SILVER_REINFORCED_CONCRETE     = new BlockReinforcedConcrete(EnumDyeColor.SILVER);
    public static final Block WHITE_REINFORCED_CONCRETE      = new BlockReinforcedConcrete(EnumDyeColor.WHITE);
    public static final Block YELLOW_REINFORCED_CONCRETE     = new BlockReinforcedConcrete(EnumDyeColor.YELLOW);
    
    public static final Block BLACK_REINFORCED_CONCRETE_POWDER      = new BlockReinforcedConcretePowder(EnumDyeColor.BLACK);
    public static final Block BLUE_REINFORCED_CONCRETE_POWDER       = new BlockReinforcedConcretePowder(EnumDyeColor.BLUE);
    public static final Block BROWN_REINFORCED_CONCRETE_POWDER      = new BlockReinforcedConcretePowder(EnumDyeColor.BROWN);
    public static final Block CYAN_REINFORCED_CONCRETE_POWDER       = new BlockReinforcedConcretePowder(EnumDyeColor.CYAN);
    public static final Block GRAY_REINFORCED_CONCRETE_POWDER       = new BlockReinforcedConcretePowder(EnumDyeColor.GRAY);
    public static final Block GREEN_REINFORCED_CONCRETE_POWDER      = new BlockReinforcedConcretePowder(EnumDyeColor.GREEN);
    public static final Block LIGHT_BLUE_REINFORCED_CONCRETE_POWDER = new BlockReinforcedConcretePowder(EnumDyeColor.LIGHT_BLUE);
    public static final Block LIME_REINFORCED_CONCRETE_POWDER       = new BlockReinforcedConcretePowder(EnumDyeColor.LIME);
    public static final Block MAGENTA_REINFORCED_CONCRETE_POWDER    = new BlockReinforcedConcretePowder(EnumDyeColor.MAGENTA);
    public static final Block ORANGE_REINFORCED_CONCRETE_POWDER     = new BlockReinforcedConcretePowder(EnumDyeColor.ORANGE);
    public static final Block PINK_REINFORCED_CONCRETE_POWDER       = new BlockReinforcedConcretePowder(EnumDyeColor.PINK);
    public static final Block PURPLE_REINFORCED_CONCRETE_POWDER     = new BlockReinforcedConcretePowder(EnumDyeColor.PURPLE);
    public static final Block RED_REINFORCED_CONCRETE_POWDER        = new BlockReinforcedConcretePowder(EnumDyeColor.RED);
    public static final Block SILVER_REINFORCED_CONCRETE_POWDER     = new BlockReinforcedConcretePowder(EnumDyeColor.SILVER);
    public static final Block WHITE_REINFORCED_CONCRETE_POWDER      = new BlockReinforcedConcretePowder(EnumDyeColor.WHITE);
    public static final Block YELLOW_REINFORCED_CONCRETE_POWDER     = new BlockReinforcedConcretePowder(EnumDyeColor.YELLOW);
    
    public static final Block BLACK_REINFORCED_DOOR      = new BlockReinforcedDoor(EnumDyeColor.BLACK);
    public static final Block BLUE_REINFORCED_DOOR       = new BlockReinforcedDoor(EnumDyeColor.BLUE);
    public static final Block BROWN_REINFORCED_DOOR      = new BlockReinforcedDoor(EnumDyeColor.BROWN);
    public static final Block CYAN_REINFORCED_DOOR       = new BlockReinforcedDoor(EnumDyeColor.CYAN);
    public static final Block GRAY_REINFORCED_DOOR       = new BlockReinforcedDoor(EnumDyeColor.GRAY);
    public static final Block GREEN_REINFORCED_DOOR      = new BlockReinforcedDoor(EnumDyeColor.GREEN);
    public static final Block LIGHT_BLUE_REINFORCED_DOOR = new BlockReinforcedDoor(EnumDyeColor.LIGHT_BLUE);
    public static final Block LIME_REINFORCED_DOOR       = new BlockReinforcedDoor(EnumDyeColor.LIME);
    public static final Block MAGENTA_REINFORCED_DOOR    = new BlockReinforcedDoor(EnumDyeColor.MAGENTA);
    public static final Block ORANGE_REINFORCED_DOOR     = new BlockReinforcedDoor(EnumDyeColor.ORANGE);
    public static final Block PINK_REINFORCED_DOOR       = new BlockReinforcedDoor(EnumDyeColor.PINK);
    public static final Block PURPLE_REINFORCED_DOOR     = new BlockReinforcedDoor(EnumDyeColor.PURPLE);
    public static final Block RED_REINFORCED_DOOR        = new BlockReinforcedDoor(EnumDyeColor.RED);
    public static final Block SILVER_REINFORCED_DOOR     = new BlockReinforcedDoor(EnumDyeColor.SILVER);
    public static final Block WHITE_REINFORCED_DOOR      = new BlockReinforcedDoor(EnumDyeColor.WHITE);
    public static final Block YELLOW_REINFORCED_DOOR     = new BlockReinforcedDoor(EnumDyeColor.YELLOW);
    
    public static final Block BLACK_REINFORCED_TRAPDOOR      = new BlockReinforcedTrapdoor(EnumDyeColor.BLACK);
    public static final Block BLUE_REINFORCED_TRAPDOOR       = new BlockReinforcedTrapdoor(EnumDyeColor.BLUE);
    public static final Block BROWN_REINFORCED_TRAPDOOR      = new BlockReinforcedTrapdoor(EnumDyeColor.BROWN);
    public static final Block CYAN_REINFORCED_TRAPDOOR       = new BlockReinforcedTrapdoor(EnumDyeColor.CYAN);
    public static final Block GRAY_REINFORCED_TRAPDOOR       = new BlockReinforcedTrapdoor(EnumDyeColor.GRAY);
    public static final Block GREEN_REINFORCED_TRAPDOOR      = new BlockReinforcedTrapdoor(EnumDyeColor.GREEN);
    public static final Block LIGHT_BLUE_REINFORCED_TRAPDOOR = new BlockReinforcedTrapdoor(EnumDyeColor.LIGHT_BLUE);
    public static final Block LIME_REINFORCED_TRAPDOOR       = new BlockReinforcedTrapdoor(EnumDyeColor.LIME);
    public static final Block MAGENTA_REINFORCED_TRAPDOOR    = new BlockReinforcedTrapdoor(EnumDyeColor.MAGENTA);
    public static final Block ORANGE_REINFORCED_TRAPDOOR     = new BlockReinforcedTrapdoor(EnumDyeColor.ORANGE);
    public static final Block PINK_REINFORCED_TRAPDOOR       = new BlockReinforcedTrapdoor(EnumDyeColor.PINK);
    public static final Block PURPLE_REINFORCED_TRAPDOOR     = new BlockReinforcedTrapdoor(EnumDyeColor.PURPLE);
    public static final Block RED_REINFORCED_TRAPDOOR        = new BlockReinforcedTrapdoor(EnumDyeColor.RED);
    public static final Block SILVER_REINFORCED_TRAPDOOR     = new BlockReinforcedTrapdoor(EnumDyeColor.SILVER);
    public static final Block WHITE_REINFORCED_TRAPDOOR      = new BlockReinforcedTrapdoor(EnumDyeColor.WHITE);
    public static final Block YELLOW_REINFORCED_TRAPDOOR     = new BlockReinforcedTrapdoor(EnumDyeColor.YELLOW);
    
    public static final Block REINFORCED_GLASS            = new BlockReinforcedGlass();
    public static final Block BLACK_REINFORCED_GLASS      = new BlockReinforcedGlass(EnumDyeColor.BLACK);
    public static final Block BLUE_REINFORCED_GLASS       = new BlockReinforcedGlass(EnumDyeColor.BLUE);
    public static final Block BROWN_REINFORCED_GLASS      = new BlockReinforcedGlass(EnumDyeColor.BROWN);
    public static final Block CYAN_REINFORCED_GLASS       = new BlockReinforcedGlass(EnumDyeColor.CYAN);
    public static final Block GRAY_REINFORCED_GLASS       = new BlockReinforcedGlass(EnumDyeColor.GRAY);
    public static final Block GREEN_REINFORCED_GLASS      = new BlockReinforcedGlass(EnumDyeColor.GREEN);
    public static final Block LIGHT_BLUE_REINFORCED_GLASS = new BlockReinforcedGlass(EnumDyeColor.LIGHT_BLUE);
    public static final Block LIME_REINFORCED_GLASS       = new BlockReinforcedGlass(EnumDyeColor.LIME);
    public static final Block MAGENTA_REINFORCED_GLASS    = new BlockReinforcedGlass(EnumDyeColor.MAGENTA);
    public static final Block ORANGE_REINFORCED_GLASS     = new BlockReinforcedGlass(EnumDyeColor.ORANGE);
    public static final Block PINK_REINFORCED_GLASS       = new BlockReinforcedGlass(EnumDyeColor.PINK);
    public static final Block PURPLE_REINFORCED_GLASS     = new BlockReinforcedGlass(EnumDyeColor.PURPLE);
    public static final Block RED_REINFORCED_GLASS        = new BlockReinforcedGlass(EnumDyeColor.RED);
    public static final Block SILVER_REINFORCED_GLASS     = new BlockReinforcedGlass(EnumDyeColor.SILVER);
    public static final Block WHITE_REINFORCED_GLASS      = new BlockReinforcedGlass(EnumDyeColor.WHITE);
    public static final Block YELLOW_REINFORCED_GLASS     = new BlockReinforcedGlass(EnumDyeColor.YELLOW);
    
    public static final Block REINFORCED_GLASS_PANE            = new BlockReinforcedGlassPane();
    public static final Block BLACK_REINFORCED_GLASS_PANE      = new BlockReinforcedGlassPane(EnumDyeColor.BLACK);
    public static final Block BLUE_REINFORCED_GLASS_PANE       = new BlockReinforcedGlassPane(EnumDyeColor.BLUE);
    public static final Block BROWN_REINFORCED_GLASS_PANE      = new BlockReinforcedGlassPane(EnumDyeColor.BROWN);
    public static final Block CYAN_REINFORCED_GLASS_PANE       = new BlockReinforcedGlassPane(EnumDyeColor.CYAN);
    public static final Block GRAY_REINFORCED_GLASS_PANE       = new BlockReinforcedGlassPane(EnumDyeColor.GRAY);
    public static final Block GREEN_REINFORCED_GLASS_PANE      = new BlockReinforcedGlassPane(EnumDyeColor.GREEN);
    public static final Block LIGHT_BLUE_REINFORCED_GLASS_PANE = new BlockReinforcedGlassPane(EnumDyeColor.LIGHT_BLUE);
    public static final Block LIME_REINFORCED_GLASS_PANE       = new BlockReinforcedGlassPane(EnumDyeColor.LIME);
    public static final Block MAGENTA_REINFORCED_GLASS_PANE    = new BlockReinforcedGlassPane(EnumDyeColor.MAGENTA);
    public static final Block ORANGE_REINFORCED_GLASS_PANE     = new BlockReinforcedGlassPane(EnumDyeColor.ORANGE);
    public static final Block PINK_REINFORCED_GLASS_PANE       = new BlockReinforcedGlassPane(EnumDyeColor.PINK);
    public static final Block PURPLE_REINFORCED_GLASS_PANE     = new BlockReinforcedGlassPane(EnumDyeColor.PURPLE);
    public static final Block RED_REINFORCED_GLASS_PANE        = new BlockReinforcedGlassPane(EnumDyeColor.RED);
    public static final Block SILVER_REINFORCED_GLASS_PANE     = new BlockReinforcedGlassPane(EnumDyeColor.SILVER);
    public static final Block WHITE_REINFORCED_GLASS_PANE      = new BlockReinforcedGlassPane(EnumDyeColor.WHITE);
    public static final Block YELLOW_REINFORCED_GLASS_PANE     = new BlockReinforcedGlassPane(EnumDyeColor.YELLOW);
    
    @SubscribeEvent
    public static void onRegisterBlocks(RegistryEvent.Register<Block> event)
    {
        Integrity.getProxy().registerBlock(event, BLACK_REINFORCED_CONCRETE);
        Integrity.getProxy().registerBlock(event, BLUE_REINFORCED_CONCRETE);
        Integrity.getProxy().registerBlock(event, BROWN_REINFORCED_CONCRETE);
        Integrity.getProxy().registerBlock(event, CYAN_REINFORCED_CONCRETE);
        Integrity.getProxy().registerBlock(event, GRAY_REINFORCED_CONCRETE);
        Integrity.getProxy().registerBlock(event, GREEN_REINFORCED_CONCRETE);
        Integrity.getProxy().registerBlock(event, LIGHT_BLUE_REINFORCED_CONCRETE);
        Integrity.getProxy().registerBlock(event, LIME_REINFORCED_CONCRETE);
        Integrity.getProxy().registerBlock(event, MAGENTA_REINFORCED_CONCRETE);
        Integrity.getProxy().registerBlock(event, ORANGE_REINFORCED_CONCRETE);
        Integrity.getProxy().registerBlock(event, PINK_REINFORCED_CONCRETE);
        Integrity.getProxy().registerBlock(event, PURPLE_REINFORCED_CONCRETE);
        Integrity.getProxy().registerBlock(event, RED_REINFORCED_CONCRETE);
        Integrity.getProxy().registerBlock(event, SILVER_REINFORCED_CONCRETE);
        Integrity.getProxy().registerBlock(event, WHITE_REINFORCED_CONCRETE);
        Integrity.getProxy().registerBlock(event, YELLOW_REINFORCED_CONCRETE);
        
        Integrity.getProxy().registerBlock(event, BLACK_REINFORCED_CONCRETE_POWDER);
        Integrity.getProxy().registerBlock(event, BLUE_REINFORCED_CONCRETE_POWDER);
        Integrity.getProxy().registerBlock(event, BROWN_REINFORCED_CONCRETE_POWDER);
        Integrity.getProxy().registerBlock(event, CYAN_REINFORCED_CONCRETE_POWDER);
        Integrity.getProxy().registerBlock(event, GRAY_REINFORCED_CONCRETE_POWDER);
        Integrity.getProxy().registerBlock(event, GREEN_REINFORCED_CONCRETE_POWDER);
        Integrity.getProxy().registerBlock(event, LIGHT_BLUE_REINFORCED_CONCRETE_POWDER);
        Integrity.getProxy().registerBlock(event, LIME_REINFORCED_CONCRETE_POWDER);
        Integrity.getProxy().registerBlock(event, MAGENTA_REINFORCED_CONCRETE_POWDER);
        Integrity.getProxy().registerBlock(event, ORANGE_REINFORCED_CONCRETE_POWDER);
        Integrity.getProxy().registerBlock(event, PINK_REINFORCED_CONCRETE_POWDER);
        Integrity.getProxy().registerBlock(event, PURPLE_REINFORCED_CONCRETE_POWDER);
        Integrity.getProxy().registerBlock(event, RED_REINFORCED_CONCRETE_POWDER);
        Integrity.getProxy().registerBlock(event, SILVER_REINFORCED_CONCRETE_POWDER);
        Integrity.getProxy().registerBlock(event, WHITE_REINFORCED_CONCRETE_POWDER);
        Integrity.getProxy().registerBlock(event, YELLOW_REINFORCED_CONCRETE_POWDER);
        
        Integrity.getProxy().registerBlock(event, BLACK_REINFORCED_DOOR, BlockDoor.POWERED);
        Integrity.getProxy().registerBlock(event, BLUE_REINFORCED_DOOR, BlockDoor.POWERED);
        Integrity.getProxy().registerBlock(event, BROWN_REINFORCED_DOOR, BlockDoor.POWERED);
        Integrity.getProxy().registerBlock(event, CYAN_REINFORCED_DOOR, BlockDoor.POWERED);
        Integrity.getProxy().registerBlock(event, GRAY_REINFORCED_DOOR, BlockDoor.POWERED);
        Integrity.getProxy().registerBlock(event, GREEN_REINFORCED_DOOR, BlockDoor.POWERED);
        Integrity.getProxy().registerBlock(event, LIGHT_BLUE_REINFORCED_DOOR, BlockDoor.POWERED);
        Integrity.getProxy().registerBlock(event, LIME_REINFORCED_DOOR, BlockDoor.POWERED);
        Integrity.getProxy().registerBlock(event, MAGENTA_REINFORCED_DOOR, BlockDoor.POWERED);
        Integrity.getProxy().registerBlock(event, ORANGE_REINFORCED_DOOR, BlockDoor.POWERED);
        Integrity.getProxy().registerBlock(event, PINK_REINFORCED_DOOR, BlockDoor.POWERED);
        Integrity.getProxy().registerBlock(event, PURPLE_REINFORCED_DOOR, BlockDoor.POWERED);
        Integrity.getProxy().registerBlock(event, RED_REINFORCED_DOOR, BlockDoor.POWERED);
        Integrity.getProxy().registerBlock(event, SILVER_REINFORCED_DOOR, BlockDoor.POWERED);
        Integrity.getProxy().registerBlock(event, WHITE_REINFORCED_DOOR, BlockDoor.POWERED);
        Integrity.getProxy().registerBlock(event, YELLOW_REINFORCED_DOOR, BlockDoor.POWERED);
        
        Integrity.getProxy().registerBlock(event, BLACK_REINFORCED_TRAPDOOR);
        Integrity.getProxy().registerBlock(event, BLUE_REINFORCED_TRAPDOOR);
        Integrity.getProxy().registerBlock(event, BROWN_REINFORCED_TRAPDOOR);
        Integrity.getProxy().registerBlock(event, CYAN_REINFORCED_TRAPDOOR);
        Integrity.getProxy().registerBlock(event, GRAY_REINFORCED_TRAPDOOR);
        Integrity.getProxy().registerBlock(event, GREEN_REINFORCED_TRAPDOOR);
        Integrity.getProxy().registerBlock(event, LIGHT_BLUE_REINFORCED_TRAPDOOR);
        Integrity.getProxy().registerBlock(event, LIME_REINFORCED_TRAPDOOR);
        Integrity.getProxy().registerBlock(event, MAGENTA_REINFORCED_TRAPDOOR);
        Integrity.getProxy().registerBlock(event, ORANGE_REINFORCED_TRAPDOOR);
        Integrity.getProxy().registerBlock(event, PINK_REINFORCED_TRAPDOOR);
        Integrity.getProxy().registerBlock(event, PURPLE_REINFORCED_TRAPDOOR);
        Integrity.getProxy().registerBlock(event, RED_REINFORCED_TRAPDOOR);
        Integrity.getProxy().registerBlock(event, SILVER_REINFORCED_TRAPDOOR);
        Integrity.getProxy().registerBlock(event, WHITE_REINFORCED_TRAPDOOR);
        Integrity.getProxy().registerBlock(event, YELLOW_REINFORCED_TRAPDOOR);
        
        Integrity.getProxy().registerBlock(event, REINFORCED_GLASS);
        Integrity.getProxy().registerBlock(event, BLACK_REINFORCED_GLASS);
        Integrity.getProxy().registerBlock(event, BLUE_REINFORCED_GLASS);
        Integrity.getProxy().registerBlock(event, BROWN_REINFORCED_GLASS);
        Integrity.getProxy().registerBlock(event, CYAN_REINFORCED_GLASS);
        Integrity.getProxy().registerBlock(event, GRAY_REINFORCED_GLASS);
        Integrity.getProxy().registerBlock(event, GREEN_REINFORCED_GLASS);
        Integrity.getProxy().registerBlock(event, LIGHT_BLUE_REINFORCED_GLASS);
        Integrity.getProxy().registerBlock(event, LIME_REINFORCED_GLASS);
        Integrity.getProxy().registerBlock(event, MAGENTA_REINFORCED_GLASS);
        Integrity.getProxy().registerBlock(event, ORANGE_REINFORCED_GLASS);
        Integrity.getProxy().registerBlock(event, PINK_REINFORCED_GLASS);
        Integrity.getProxy().registerBlock(event, PURPLE_REINFORCED_GLASS);
        Integrity.getProxy().registerBlock(event, RED_REINFORCED_GLASS);
        Integrity.getProxy().registerBlock(event, SILVER_REINFORCED_GLASS);
        Integrity.getProxy().registerBlock(event, WHITE_REINFORCED_GLASS);
        Integrity.getProxy().registerBlock(event, YELLOW_REINFORCED_GLASS);
        
        Integrity.getProxy().registerBlock(event, REINFORCED_GLASS_PANE);
        Integrity.getProxy().registerBlock(event, BLACK_REINFORCED_GLASS_PANE);
        Integrity.getProxy().registerBlock(event, BLUE_REINFORCED_GLASS_PANE);
        Integrity.getProxy().registerBlock(event, BROWN_REINFORCED_GLASS_PANE);
        Integrity.getProxy().registerBlock(event, CYAN_REINFORCED_GLASS_PANE);
        Integrity.getProxy().registerBlock(event, GRAY_REINFORCED_GLASS_PANE);
        Integrity.getProxy().registerBlock(event, GREEN_REINFORCED_GLASS_PANE);
        Integrity.getProxy().registerBlock(event, LIGHT_BLUE_REINFORCED_GLASS_PANE);
        Integrity.getProxy().registerBlock(event, LIME_REINFORCED_GLASS_PANE);
        Integrity.getProxy().registerBlock(event, MAGENTA_REINFORCED_GLASS_PANE);
        Integrity.getProxy().registerBlock(event, ORANGE_REINFORCED_GLASS_PANE);
        Integrity.getProxy().registerBlock(event, PINK_REINFORCED_GLASS_PANE);
        Integrity.getProxy().registerBlock(event, PURPLE_REINFORCED_GLASS_PANE);
        Integrity.getProxy().registerBlock(event, RED_REINFORCED_GLASS_PANE);
        Integrity.getProxy().registerBlock(event, SILVER_REINFORCED_GLASS_PANE);
        Integrity.getProxy().registerBlock(event, WHITE_REINFORCED_GLASS_PANE);
        Integrity.getProxy().registerBlock(event, YELLOW_REINFORCED_GLASS_PANE);
    }
}
