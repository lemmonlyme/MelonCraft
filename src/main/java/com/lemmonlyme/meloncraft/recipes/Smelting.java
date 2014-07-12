package com.lemmonlyme.meloncraft.recipes;

import com.lemmonlyme.meloncraft.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Smelting {

    public static void init(){
        GameRegistry.addSmelting(Items.melon, new ItemStack(ModItems.mbrick), 0.5F);
    }
}
