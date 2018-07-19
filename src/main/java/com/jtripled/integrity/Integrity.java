package com.jtripled.integrity;

import com.jtripled.integrity.proxy.Proxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 *
 * @author jtripled
 */
@Mod(modid = Integrity.ID, name = Integrity.NAME, version = Integrity.VERSION, dependencies = Integrity.DEPENDS)
public class Integrity
{
    public static final String ID = "integrity";
    public static final String NAME = "Integrity";
    public static final String VERSION = "1.0";
    public static final String DEPENDS = "";
    
    @Mod.Instance(ID)
    public static Integrity INSTANCE;
    
    @SidedProxy(serverSide = "com.jtripled." + ID + ".proxy.ProxyServer", clientSide = "com.jtripled." + ID + ".proxy.ProxyClient")
    public static Proxy PROXY;
    
    public static Integrity getInstance()
    {
        return INSTANCE;
    }

    public static String getID()
    {
        return ID;
    }

    public static String getName()
    {
        return NAME;
    }

    public static String getVersion()
    {
        return VERSION;
    }
    
    public static Proxy getProxy()
    {
        return PROXY;
    }
    
    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event)
    {
        
    }
    
    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event)
    {
        
    }
    
    @Mod.EventHandler
    public void onPostInit(FMLPostInitializationEvent event)
    {
        
    }
}
