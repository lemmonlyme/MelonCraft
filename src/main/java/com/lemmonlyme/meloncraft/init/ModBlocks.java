package com.lemmonlyme.meloncraft.init;

import com.lemmonlyme.meloncraft.block.BlockMelon;
import com.lemmonlyme.meloncraft.block.BlockMelonBricks;
import com.lemmonlyme.meloncraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockMelon mbricks = new BlockMelonBricks();

    public static void init()
    {
        GameRegistry.registerBlock(mbricks, "melonBricks");

    }
}
