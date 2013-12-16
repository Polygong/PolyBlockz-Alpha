package mods.polyblockz.common.items.tools;

import mods.polyblockz.common.items.EntityGrenade;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Item_Grenade extends Item {
	public Item_Grenade(int par1) {
		super(par1);
		this.maxStackSize = 64; // maximum size in a stack
		this.setUnlocalizedName("granade");
		this.setTextureName("granade");
		this.setCreativeTab(CreativeTabs.tabCombat);

	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon("polyblockz:granade");

	}

	public ItemStack onItemRightClick(ItemStack itemstack, World world,
			EntityPlayer entityplayer) {
		if (!entityplayer.capabilities.isCreativeMode) {
			--itemstack.stackSize; // removes one when right clicked if not in
									// creative
		}

		if (!world.isRemote) {
			world.spawnEntityInWorld(new EntityGrenade(world, entityplayer)); // spawns
																				// the
																				// grenade
																				// entity
		}
		return itemstack;
	}

}