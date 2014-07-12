package com.lemmonlyme.meloncraft;

import com.lemmonlyme.meloncraft.handler.ConfigurationHandler;
import com.lemmonlyme.meloncraft.init.ModBlocks;
import com.lemmonlyme.meloncraft.init.ModItems;
import com.lemmonlyme.meloncraft.proxy.IProxy;
import com.lemmonlyme.meloncraft.recipes.Crafting;
import com.lemmonlyme.meloncraft.recipes.Smelting;
import com.lemmonlyme.meloncraft.reference.Reference;
import com.lemmonlyme.meloncraft.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class MelonCraft
{
    @Mod.Instance(Reference.MOD_NAME)
    public static MelonCraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Preinitialization complete.");

        ModItems.init();
        ModBlocks.init();
        Crafting.init();
        Smelting.init();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization complete.");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Postinitialization complete.");
    }
}
