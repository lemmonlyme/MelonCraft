package com.lemmonlyme.meloncraft.block;

import net.minecraft.block.material.Material;

public class BlockMelonBricks extends BlockMelon
{
    public BlockMelonBricks()
    {
        super(Material.wood);
        this.setBlockName("melonBricks");
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel("axe", 0);
        this.setResistance(2);
        this.setHardness(2);
    }
}
