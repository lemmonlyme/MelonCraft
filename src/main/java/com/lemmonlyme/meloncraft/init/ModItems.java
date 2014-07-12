package com.lemmonlyme.meloncraft.init;

import com.lemmonlyme.meloncraft.item.ItemMelon;
import com.lemmonlyme.meloncraft.item.ItemMelonBall;
import com.lemmonlyme.meloncraft.item.ItemMelonBrick;
import com.lemmonlyme.meloncraft.item.ItemMelonScoop;
import com.lemmonlyme.meloncraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemMelon mball = new ItemMelonBall();
    public static final ItemMelon mbrick = new ItemMelonBrick();
    public static final ItemMelon mscoop = new ItemMelonScoop();

    public static void init()
    {
        GameRegistry.registerItem(mball, "melonBall");
        GameRegistry.registerItem(mbrick, "melonBrick");
        GameRegistry.registerItem(mscoop, "melonScoop");
    }
}