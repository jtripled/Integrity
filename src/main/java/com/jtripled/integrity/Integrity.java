package com.jtripled.integrity;

import com.jtripled.integrity.proxy.Proxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

/**
 *
 * @author jtripled
 */
@Mod(modid = "@mod_id@", name = "@mod_name@", version = "@mod_version@", dependencies = "@mod_depends@")
public class Integrity
{
    protected static final String ID = "@mod_id@";
    protected static final String NAME = "@mod_name@";
    protected static final String VERSION = "@mod_version@";
    protected static final String DEPENDS = "@mod_depends@";
    
    @Mod.Instance(ID)
    protected static Integrity INSTANCE;
    
    @SidedProxy(serverSide = "com.jtripled." + ID + ".proxy.ProxyServer", clientSide = "com.jtripled." + ID + ".proxy.ProxyClient")
    protected static Proxy PROXY;
    
    protected static final SimpleNetworkWrapper NETWORK = new SimpleNetworkWrapper(ID);
    
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
    
    public static SimpleNetworkWrapper getNetwork()
    {
        return NETWORK;
    }
    
    @Mod.EventHandler
    protected void onPreInit(FMLPreInitializationEvent event)
    {
        PROXY.onPreInit(event);
    }
    
    @Mod.EventHandler
    protected void onInit(FMLInitializationEvent event)
    {
        PROXY.onInit(event);
    }
    
    @Mod.EventHandler
    protected void onPostInit(FMLPostInitializationEvent event)
    {
        PROXY.onPostInit(event);
    }
}
