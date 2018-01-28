package com.jtripled.integrity.asm;

import java.util.Map;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

/**
 *
 * @author jtripled
 */
public class IntegrityCorePlugin implements IFMLLoadingPlugin
{
    @Override
    public String[] getASMTransformerClass()
    {
        return new String[] {
            "com.jtripled.integrity.asm.IntegrityTransformer"
        };
    }

    @Override
    public String getModContainerClass()
    {
        return null;
    }

    @Override
    public String getSetupClass()
    {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data)
    {
        
    }

    @Override
    public String getAccessTransformerClass()
    {
        return null;
    }
    
}
