package com.lemmonlyme.meloncraft.item;

//import com.lemmonlyme.meloncraft.init.ModItems;
//import net.minecraft.entity.item.EntityItem;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
//import net.minecraft.util.MovingObjectPosition;
//import net.minecraft.world.World;

public class ItemMelonScoop extends ItemMelon
{
    public ItemMelonScoop()
    {
        super();
        this.setUnlocalizedName("melonScoop");
        this.setMaxStackSize(1);
        this.setMaxDamage(100);
    }

    @Override
    public boolean canItemEditBlocks()
    {
        return true;
    }

    @Override
    public boolean isItemTool(ItemStack itemStack)
    {
        return this.getItemStackLimit(itemStack) == 1 && this.isDamageable();
    }

    //Incomplete
    /*
    @Override
    public boolean hasContainerItem(ItemStack stack)
    {
        return hasContainerItem();
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        if (!hasContainerItem(itemStack))
        {
            return null;
        }
        ItemStack item = new ItemMelonScoop();
        return getContainerItem().setDamage(this.getDamage(this) - 1);
    }
    */

    //Do not use! Will crash game when right clicking melon w/ scoop.
    /*@Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer)
    {
        MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(world, entityPlayer, false);

        if (movingobjectposition != null && movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && world.getBlock(movingobjectposition.blockX, movingobjectposition.blockY, movingobjectposition.blockZ) == Blocks.melon_block)
        {
            ItemStack stack = new ItemStack(ModItems.mball, 1);
            EntityItem entityitem = new EntityItem(world, movingobjectposition.blockX, movingobjectposition.blockY, movingobjectposition.blockZ, stack);
            entityitem.delayBeforeCanPickup = 2;
            world.spawnEntityInWorld(entityitem);
        }
        return null;
    }*/
}
