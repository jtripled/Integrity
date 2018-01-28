package com.jtripled.integrity;

import com.jtripled.voxen.mod.ModBase;
import com.jtripled.voxen.mod.Registry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 *
 * @author jtripled
 */
@Mod(modid = Integrity.ID, name = Integrity.NAME, version = Integrity.VERSION)
@Mod.EventBusSubscriber
public class Integrity extends ModBase
{
    @Mod.Instance(Integrity.ID)
    public static Integrity INSTANCE;
    
    public static final String ID = "integrity";
    public static final String NAME = "Integrity";
    public static final String VERSION = "1.0";
    
    public static Registry REGISTRY;

    @Override
    public String getID()
    {
        return ID;
    }

    @Override
    public String getName()
    {
        return NAME;
    }

    @Override
    public String getVersion()
    {
        return VERSION;
    }
    
    @Override
    public Registry getRegistry()
    {
        return REGISTRY;
    }
    
    @EventHandler
    public void onPreInit(FMLPreInitializationEvent event)
    {
        REGISTRY = new IntegrityRegistry();
        preInit(event);
    }
    
    @EventHandler
    public void onInit(FMLInitializationEvent event)
    {
        init(event);
    }
    
    @EventHandler
    public void onPostInit(FMLPostInitializationEvent event)
    {
        postInit(event);
    }
}
