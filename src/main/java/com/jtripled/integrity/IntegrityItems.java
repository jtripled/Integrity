package com.jtripled.integrity;

import com.jtripled.integrity.item.IntegrityItemBlock;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 *
 * @author jtripled
 */
@Mod.EventBusSubscriber
public class IntegrityItems
{
    public static final Item BLACK_REINFORCED_CONCRETE_ITEM      = new IntegrityItemBlock(IntegrityBlocks.BLACK_REINFORCED_CONCRETE);
    public static final Item BLUE_REINFORCED_CONCRETE_ITEM       = new IntegrityItemBlock(IntegrityBlocks.BLUE_REINFORCED_CONCRETE);
    public static final Item BROWN_REINFORCED_CONCRETE_ITEM      = new IntegrityItemBlock(IntegrityBlocks.BROWN_REINFORCED_CONCRETE);
    public static final Item CYAN_REINFORCED_CONCRETE_ITEM       = new IntegrityItemBlock(IntegrityBlocks.CYAN_REINFORCED_CONCRETE);
    public static final Item GRAY_REINFORCED_CONCRETE_ITEM       = new IntegrityItemBlock(IntegrityBlocks.GRAY_REINFORCED_CONCRETE);
    public static final Item GREEN_REINFORCED_CONCRETE_ITEM      = new IntegrityItemBlock(IntegrityBlocks.GREEN_REINFORCED_CONCRETE);
    public static final Item LIGHT_BLUE_REINFORCED_CONCRETE_ITEM = new IntegrityItemBlock(IntegrityBlocks.LIGHT_BLUE_REINFORCED_CONCRETE);
    public static final Item LIME_REINFORCED_CONCRETE_ITEM       = new IntegrityItemBlock(IntegrityBlocks.LIME_REINFORCED_CONCRETE);
    public static final Item MAGENTA_REINFORCED_CONCRETE_ITEM    = new IntegrityItemBlock(IntegrityBlocks.MAGENTA_REINFORCED_CONCRETE);
    public static final Item ORANGE_REINFORCED_CONCRETE_ITEM     = new IntegrityItemBlock(IntegrityBlocks.ORANGE_REINFORCED_CONCRETE);
    public static final Item PINK_REINFORCED_CONCRETE_ITEM       = new IntegrityItemBlock(IntegrityBlocks.PINK_REINFORCED_CONCRETE);
    public static final Item PURPLE_REINFORCED_CONCRETE_ITEM     = new IntegrityItemBlock(IntegrityBlocks.PURPLE_REINFORCED_CONCRETE);
    public static final Item RED_REINFORCED_CONCRETE_ITEM        = new IntegrityItemBlock(IntegrityBlocks.RED_REINFORCED_CONCRETE);
    public static final Item SILVER_REINFORCED_CONCRETE_ITEM     = new IntegrityItemBlock(IntegrityBlocks.SILVER_REINFORCED_CONCRETE);
    public static final Item WHITE_REINFORCED_CONCRETE_ITEM      = new IntegrityItemBlock(IntegrityBlocks.WHITE_REINFORCED_CONCRETE);
    public static final Item YELLOW_REINFORCED_CONCRETE_ITEM     = new IntegrityItemBlock(IntegrityBlocks.YELLOW_REINFORCED_CONCRETE);
    
    public static final Item BLACK_REINFORCED_DOOR_ITEM      = new IntegrityItemBlock(IntegrityBlocks.BLACK_REINFORCED_DOOR);
    public static final Item BLUE_REINFORCED_DOOR_ITEM       = new IntegrityItemBlock(IntegrityBlocks.BLUE_REINFORCED_DOOR);
    public static final Item BROWN_REINFORCED_DOOR_ITEM      = new IntegrityItemBlock(IntegrityBlocks.BROWN_REINFORCED_DOOR);
    public static final Item CYAN_REINFORCED_DOOR_ITEM       = new IntegrityItemBlock(IntegrityBlocks.CYAN_REINFORCED_DOOR);
    public static final Item GRAY_REINFORCED_DOOR_ITEM       = new IntegrityItemBlock(IntegrityBlocks.GRAY_REINFORCED_DOOR);
    public static final Item GREEN_REINFORCED_DOOR_ITEM      = new IntegrityItemBlock(IntegrityBlocks.GREEN_REINFORCED_DOOR);
    public static final Item LIGHT_BLUE_REINFORCED_DOOR_ITEM = new IntegrityItemBlock(IntegrityBlocks.LIGHT_BLUE_REINFORCED_DOOR);
    public static final Item LIME_REINFORCED_DOOR_ITEM       = new IntegrityItemBlock(IntegrityBlocks.LIME_REINFORCED_DOOR);
    public static final Item MAGENTA_REINFORCED_DOOR_ITEM    = new IntegrityItemBlock(IntegrityBlocks.MAGENTA_REINFORCED_DOOR);
    public static final Item ORANGE_REINFORCED_DOOR_ITEM     = new IntegrityItemBlock(IntegrityBlocks.ORANGE_REINFORCED_DOOR);
    public static final Item PINK_REINFORCED_DOOR_ITEM       = new IntegrityItemBlock(IntegrityBlocks.PINK_REINFORCED_DOOR);
    public static final Item PURPLE_REINFORCED_DOOR_ITEM     = new IntegrityItemBlock(IntegrityBlocks.PURPLE_REINFORCED_DOOR);
    public static final Item RED_REINFORCED_DOOR_ITEM        = new IntegrityItemBlock(IntegrityBlocks.RED_REINFORCED_DOOR);
    public static final Item SILVER_REINFORCED_DOOR_ITEM     = new IntegrityItemBlock(IntegrityBlocks.SILVER_REINFORCED_DOOR);
    public static final Item WHITE_REINFORCED_DOOR_ITEM      = new IntegrityItemBlock(IntegrityBlocks.WHITE_REINFORCED_DOOR);
    public static final Item YELLOW_REINFORCED_DOOR_ITEM     = new IntegrityItemBlock(IntegrityBlocks.YELLOW_REINFORCED_DOOR);
    
    public static final Item BLACK_REINFORCED_TRAPDOOR_ITEM      = new IntegrityItemBlock(IntegrityBlocks.BLACK_REINFORCED_TRAPDOOR);
    public static final Item BLUE_REINFORCED_TRAPDOOR_ITEM       = new IntegrityItemBlock(IntegrityBlocks.BLUE_REINFORCED_TRAPDOOR);
    public static final Item BROWN_REINFORCED_TRAPDOOR_ITEM      = new IntegrityItemBlock(IntegrityBlocks.BROWN_REINFORCED_TRAPDOOR);
    public static final Item CYAN_REINFORCED_TRAPDOOR_ITEM       = new IntegrityItemBlock(IntegrityBlocks.CYAN_REINFORCED_TRAPDOOR);
    public static final Item GRAY_REINFORCED_TRAPDOOR_ITEM       = new IntegrityItemBlock(IntegrityBlocks.GRAY_REINFORCED_TRAPDOOR);
    public static final Item GREEN_REINFORCED_TRAPDOOR_ITEM      = new IntegrityItemBlock(IntegrityBlocks.GREEN_REINFORCED_TRAPDOOR);
    public static final Item LIGHT_BLUE_REINFORCED_TRAPDOOR_ITEM = new IntegrityItemBlock(IntegrityBlocks.LIGHT_BLUE_REINFORCED_TRAPDOOR);
    public static final Item LIME_REINFORCED_TRAPDOOR_ITEM       = new IntegrityItemBlock(IntegrityBlocks.LIME_REINFORCED_TRAPDOOR);
    public static final Item MAGENTA_REINFORCED_TRAPDOOR_ITEM    = new IntegrityItemBlock(IntegrityBlocks.MAGENTA_REINFORCED_TRAPDOOR);
    public static final Item ORANGE_REINFORCED_TRAPDOOR_ITEM     = new IntegrityItemBlock(IntegrityBlocks.ORANGE_REINFORCED_TRAPDOOR);
    public static final Item PINK_REINFORCED_TRAPDOOR_ITEM       = new IntegrityItemBlock(IntegrityBlocks.PINK_REINFORCED_TRAPDOOR);
    public static final Item PURPLE_REINFORCED_TRAPDOOR_ITEM     = new IntegrityItemBlock(IntegrityBlocks.PURPLE_REINFORCED_TRAPDOOR);
    public static final Item RED_REINFORCED_TRAPDOOR_ITEM        = new IntegrityItemBlock(IntegrityBlocks.RED_REINFORCED_TRAPDOOR);
    public static final Item SILVER_REINFORCED_TRAPDOOR_ITEM     = new IntegrityItemBlock(IntegrityBlocks.SILVER_REINFORCED_TRAPDOOR);
    public static final Item WHITE_REINFORCED_TRAPDOOR_ITEM      = new IntegrityItemBlock(IntegrityBlocks.WHITE_REINFORCED_TRAPDOOR);
    public static final Item YELLOW_REINFORCED_TRAPDOOR_ITEM     = new IntegrityItemBlock(IntegrityBlocks.YELLOW_REINFORCED_TRAPDOOR);
    
    public static final Item REINFORCED_GLASS_ITEM            = new IntegrityItemBlock(IntegrityBlocks.REINFORCED_GLASS);
    public static final Item BLACK_REINFORCED_GLASS_ITEM      = new IntegrityItemBlock(IntegrityBlocks.BLACK_REINFORCED_GLASS);
    public static final Item BLUE_REINFORCED_GLASS_ITEM       = new IntegrityItemBlock(IntegrityBlocks.BLUE_REINFORCED_GLASS);
    public static final Item BROWN_REINFORCED_GLASS_ITEM      = new IntegrityItemBlock(IntegrityBlocks.BROWN_REINFORCED_GLASS);
    public static final Item CYAN_REINFORCED_GLASS_ITEM       = new IntegrityItemBlock(IntegrityBlocks.CYAN_REINFORCED_GLASS);
    public static final Item GRAY_REINFORCED_GLASS_ITEM       = new IntegrityItemBlock(IntegrityBlocks.GRAY_REINFORCED_GLASS);
    public static final Item GREEN_REINFORCED_GLASS_ITEM      = new IntegrityItemBlock(IntegrityBlocks.GREEN_REINFORCED_GLASS);
    public static final Item LIGHT_BLUE_REINFORCED_GLASS_ITEM = new IntegrityItemBlock(IntegrityBlocks.LIGHT_BLUE_REINFORCED_GLASS);
    public static final Item LIME_REINFORCED_GLASS_ITEM       = new IntegrityItemBlock(IntegrityBlocks.LIME_REINFORCED_GLASS);
    public static final Item MAGENTA_REINFORCED_GLASS_ITEM    = new IntegrityItemBlock(IntegrityBlocks.MAGENTA_REINFORCED_GLASS);
    public static final Item ORANGE_REINFORCED_GLASS_ITEM     = new IntegrityItemBlock(IntegrityBlocks.ORANGE_REINFORCED_GLASS);
    public static final Item PINK_REINFORCED_GLASS_ITEM       = new IntegrityItemBlock(IntegrityBlocks.PINK_REINFORCED_GLASS);
    public static final Item PURPLE_REINFORCED_GLASS_ITEM     = new IntegrityItemBlock(IntegrityBlocks.PURPLE_REINFORCED_GLASS);
    public static final Item RED_REINFORCED_GLASS_ITEM        = new IntegrityItemBlock(IntegrityBlocks.RED_REINFORCED_GLASS);
    public static final Item SILVER_REINFORCED_GLASS_ITEM     = new IntegrityItemBlock(IntegrityBlocks.SILVER_REINFORCED_GLASS);
    public static final Item WHITE_REINFORCED_GLASS_ITEM      = new IntegrityItemBlock(IntegrityBlocks.WHITE_REINFORCED_GLASS);
    public static final Item YELLOW_REINFORCED_GLASS_ITEM     = new IntegrityItemBlock(IntegrityBlocks.YELLOW_REINFORCED_GLASS);
    
    public static final Item REINFORCED_GLASS_PANE_ITEM            = new IntegrityItemBlock(IntegrityBlocks.REINFORCED_GLASS_PANE);
    public static final Item BLACK_REINFORCED_GLASS_PANE_ITEM      = new IntegrityItemBlock(IntegrityBlocks.BLACK_REINFORCED_GLASS_PANE);
    public static final Item BLUE_REINFORCED_GLASS_PANE_ITEM       = new IntegrityItemBlock(IntegrityBlocks.BLUE_REINFORCED_GLASS_PANE);
    public static final Item BROWN_REINFORCED_GLASS_PANE_ITEM      = new IntegrityItemBlock(IntegrityBlocks.BROWN_REINFORCED_GLASS_PANE);
    public static final Item CYAN_REINFORCED_GLASS_PANE_ITEM       = new IntegrityItemBlock(IntegrityBlocks.CYAN_REINFORCED_GLASS_PANE);
    public static final Item GRAY_REINFORCED_GLASS_PANE_ITEM       = new IntegrityItemBlock(IntegrityBlocks.GRAY_REINFORCED_GLASS_PANE);
    public static final Item GREEN_REINFORCED_GLASS_PANE_ITEM      = new IntegrityItemBlock(IntegrityBlocks.GREEN_REINFORCED_GLASS_PANE);
    public static final Item LIGHT_BLUE_REINFORCED_GLASS_PANE_ITEM = new IntegrityItemBlock(IntegrityBlocks.LIGHT_BLUE_REINFORCED_GLASS_PANE);
    public static final Item LIME_REINFORCED_GLASS_PANE_ITEM       = new IntegrityItemBlock(IntegrityBlocks.LIME_REINFORCED_GLASS_PANE);
    public static final Item MAGENTA_REINFORCED_GLASS_PANE_ITEM    = new IntegrityItemBlock(IntegrityBlocks.MAGENTA_REINFORCED_GLASS_PANE);
    public static final Item ORANGE_REINFORCED_GLASS_PANE_ITEM     = new IntegrityItemBlock(IntegrityBlocks.ORANGE_REINFORCED_GLASS_PANE);
    public static final Item PINK_REINFORCED_GLASS_PANE_ITEM       = new IntegrityItemBlock(IntegrityBlocks.PINK_REINFORCED_GLASS_PANE);
    public static final Item PURPLE_REINFORCED_GLASS_PANE_ITEM     = new IntegrityItemBlock(IntegrityBlocks.PURPLE_REINFORCED_GLASS_PANE);
    public static final Item RED_REINFORCED_GLASS_PANE_ITEM        = new IntegrityItemBlock(IntegrityBlocks.RED_REINFORCED_GLASS_PANE);
    public static final Item SILVER_REINFORCED_GLASS_PANE_ITEM     = new IntegrityItemBlock(IntegrityBlocks.SILVER_REINFORCED_GLASS_PANE);
    public static final Item WHITE_REINFORCED_GLASS_PANE_ITEM      = new IntegrityItemBlock(IntegrityBlocks.WHITE_REINFORCED_GLASS_PANE);
    public static final Item YELLOW_REINFORCED_GLASS_PANE_ITEM     = new IntegrityItemBlock(IntegrityBlocks.YELLOW_REINFORCED_GLASS_PANE);
    
    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event)
    {
        Integrity.getProxy().registerItem(event, BLACK_REINFORCED_CONCRETE_ITEM);
        Integrity.getProxy().registerItem(event, BLUE_REINFORCED_CONCRETE_ITEM);
        Integrity.getProxy().registerItem(event, BROWN_REINFORCED_CONCRETE_ITEM);
        Integrity.getProxy().registerItem(event, CYAN_REINFORCED_CONCRETE_ITEM);
        Integrity.getProxy().registerItem(event, GRAY_REINFORCED_CONCRETE_ITEM);
        Integrity.getProxy().registerItem(event, GREEN_REINFORCED_CONCRETE_ITEM);
        Integrity.getProxy().registerItem(event, LIGHT_BLUE_REINFORCED_CONCRETE_ITEM);
        Integrity.getProxy().registerItem(event, LIME_REINFORCED_CONCRETE_ITEM);
        Integrity.getProxy().registerItem(event, MAGENTA_REINFORCED_CONCRETE_ITEM);
        Integrity.getProxy().registerItem(event, ORANGE_REINFORCED_CONCRETE_ITEM);
        Integrity.getProxy().registerItem(event, PINK_REINFORCED_CONCRETE_ITEM);
        Integrity.getProxy().registerItem(event, PURPLE_REINFORCED_CONCRETE_ITEM);
        Integrity.getProxy().registerItem(event, RED_REINFORCED_CONCRETE_ITEM);
        Integrity.getProxy().registerItem(event, SILVER_REINFORCED_CONCRETE_ITEM);
        Integrity.getProxy().registerItem(event, WHITE_REINFORCED_CONCRETE_ITEM);
        Integrity.getProxy().registerItem(event, YELLOW_REINFORCED_CONCRETE_ITEM);
        
        Integrity.getProxy().registerItem(event, BLACK_REINFORCED_DOOR_ITEM);
        Integrity.getProxy().registerItem(event, BLUE_REINFORCED_DOOR_ITEM);
        Integrity.getProxy().registerItem(event, BROWN_REINFORCED_DOOR_ITEM);
        Integrity.getProxy().registerItem(event, CYAN_REINFORCED_DOOR_ITEM);
        Integrity.getProxy().registerItem(event, GRAY_REINFORCED_DOOR_ITEM);
        Integrity.getProxy().registerItem(event, GREEN_REINFORCED_DOOR_ITEM);
        Integrity.getProxy().registerItem(event, LIGHT_BLUE_REINFORCED_DOOR_ITEM);
        Integrity.getProxy().registerItem(event, LIME_REINFORCED_DOOR_ITEM);
        Integrity.getProxy().registerItem(event, MAGENTA_REINFORCED_DOOR_ITEM);
        Integrity.getProxy().registerItem(event, ORANGE_REINFORCED_DOOR_ITEM);
        Integrity.getProxy().registerItem(event, PINK_REINFORCED_DOOR_ITEM);
        Integrity.getProxy().registerItem(event, PURPLE_REINFORCED_DOOR_ITEM);
        Integrity.getProxy().registerItem(event, RED_REINFORCED_DOOR_ITEM);
        Integrity.getProxy().registerItem(event, SILVER_REINFORCED_DOOR_ITEM);
        Integrity.getProxy().registerItem(event, WHITE_REINFORCED_DOOR_ITEM);
        Integrity.getProxy().registerItem(event, YELLOW_REINFORCED_DOOR_ITEM);
        
        Integrity.getProxy().registerItem(event, BLACK_REINFORCED_TRAPDOOR_ITEM);
        Integrity.getProxy().registerItem(event, BLUE_REINFORCED_TRAPDOOR_ITEM);
        Integrity.getProxy().registerItem(event, BROWN_REINFORCED_TRAPDOOR_ITEM);
        Integrity.getProxy().registerItem(event, CYAN_REINFORCED_TRAPDOOR_ITEM);
        Integrity.getProxy().registerItem(event, GRAY_REINFORCED_TRAPDOOR_ITEM);
        Integrity.getProxy().registerItem(event, GREEN_REINFORCED_TRAPDOOR_ITEM);
        Integrity.getProxy().registerItem(event, LIGHT_BLUE_REINFORCED_TRAPDOOR_ITEM);
        Integrity.getProxy().registerItem(event, LIME_REINFORCED_TRAPDOOR_ITEM);
        Integrity.getProxy().registerItem(event, MAGENTA_REINFORCED_TRAPDOOR_ITEM);
        Integrity.getProxy().registerItem(event, ORANGE_REINFORCED_TRAPDOOR_ITEM);
        Integrity.getProxy().registerItem(event, PINK_REINFORCED_TRAPDOOR_ITEM);
        Integrity.getProxy().registerItem(event, PURPLE_REINFORCED_TRAPDOOR_ITEM);
        Integrity.getProxy().registerItem(event, RED_REINFORCED_TRAPDOOR_ITEM);
        Integrity.getProxy().registerItem(event, SILVER_REINFORCED_TRAPDOOR_ITEM);
        Integrity.getProxy().registerItem(event, WHITE_REINFORCED_TRAPDOOR_ITEM);
        Integrity.getProxy().registerItem(event, YELLOW_REINFORCED_TRAPDOOR_ITEM);
        
        Integrity.getProxy().registerItem(event, REINFORCED_GLASS_ITEM);
        Integrity.getProxy().registerItem(event, BLACK_REINFORCED_GLASS_ITEM);
        Integrity.getProxy().registerItem(event, BLUE_REINFORCED_GLASS_ITEM);
        Integrity.getProxy().registerItem(event, BROWN_REINFORCED_GLASS_ITEM);
        Integrity.getProxy().registerItem(event, CYAN_REINFORCED_GLASS_ITEM);
        Integrity.getProxy().registerItem(event, GRAY_REINFORCED_GLASS_ITEM);
        Integrity.getProxy().registerItem(event, GREEN_REINFORCED_GLASS_ITEM);
        Integrity.getProxy().registerItem(event, LIGHT_BLUE_REINFORCED_GLASS_ITEM);
        Integrity.getProxy().registerItem(event, LIME_REINFORCED_GLASS_ITEM);
        Integrity.getProxy().registerItem(event, MAGENTA_REINFORCED_GLASS_ITEM);
        Integrity.getProxy().registerItem(event, ORANGE_REINFORCED_GLASS_ITEM);
        Integrity.getProxy().registerItem(event, PINK_REINFORCED_GLASS_ITEM);
        Integrity.getProxy().registerItem(event, PURPLE_REINFORCED_GLASS_ITEM);
        Integrity.getProxy().registerItem(event, RED_REINFORCED_GLASS_ITEM);
        Integrity.getProxy().registerItem(event, SILVER_REINFORCED_GLASS_ITEM);
        Integrity.getProxy().registerItem(event, WHITE_REINFORCED_GLASS_ITEM);
        Integrity.getProxy().registerItem(event, YELLOW_REINFORCED_GLASS_ITEM);
        
        Integrity.getProxy().registerItem(event, REINFORCED_GLASS_PANE_ITEM);
        Integrity.getProxy().registerItem(event, BLACK_REINFORCED_GLASS_PANE_ITEM);
        Integrity.getProxy().registerItem(event, BLUE_REINFORCED_GLASS_PANE_ITEM);
        Integrity.getProxy().registerItem(event, BROWN_REINFORCED_GLASS_PANE_ITEM);
        Integrity.getProxy().registerItem(event, CYAN_REINFORCED_GLASS_PANE_ITEM);
        Integrity.getProxy().registerItem(event, GRAY_REINFORCED_GLASS_PANE_ITEM);
        Integrity.getProxy().registerItem(event, GREEN_REINFORCED_GLASS_PANE_ITEM);
        Integrity.getProxy().registerItem(event, LIGHT_BLUE_REINFORCED_GLASS_PANE_ITEM);
        Integrity.getProxy().registerItem(event, LIME_REINFORCED_GLASS_PANE_ITEM);
        Integrity.getProxy().registerItem(event, MAGENTA_REINFORCED_GLASS_PANE_ITEM);
        Integrity.getProxy().registerItem(event, ORANGE_REINFORCED_GLASS_PANE_ITEM);
        Integrity.getProxy().registerItem(event, PINK_REINFORCED_GLASS_PANE_ITEM);
        Integrity.getProxy().registerItem(event, PURPLE_REINFORCED_GLASS_PANE_ITEM);
        Integrity.getProxy().registerItem(event, RED_REINFORCED_GLASS_PANE_ITEM);
        Integrity.getProxy().registerItem(event, SILVER_REINFORCED_GLASS_PANE_ITEM);
        Integrity.getProxy().registerItem(event, WHITE_REINFORCED_GLASS_PANE_ITEM);
        Integrity.getProxy().registerItem(event, YELLOW_REINFORCED_GLASS_PANE_ITEM);
    }
}
