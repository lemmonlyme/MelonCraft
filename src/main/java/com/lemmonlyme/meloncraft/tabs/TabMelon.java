package com.lemmonlyme.meloncraft.tabs;

import com.lemmonlyme.meloncraft.init.ModItems;
import com.lemmonlyme.meloncraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabMelon
{
    public static final CreativeTabs MelonTab = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.mbrick;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Let's Mod Reboot";
        }
    };
}
