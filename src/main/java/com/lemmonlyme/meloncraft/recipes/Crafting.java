package com.lemmonlyme.meloncraft.recipes;

import com.lemmonlyme.meloncraft.init.ModBlocks;
import com.lemmonlyme.meloncraft.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Crafting {

    public static void init(){
        ItemStack mbrick = new ItemStack(ModItems.mbrick);
        ItemStack mscoop = new ItemStack(ModItems.mscoop);
        ItemStack melon = new ItemStack(Items.melon);
        ItemStack iron = new ItemStack(Items.iron_ingot);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.mbricks, 1), "xx", "xx", 'x', mbrick);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.mscoop, 1), " x", "x ", 'x', iron);

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.mball, 2), mscoop, melon);

    }
}
