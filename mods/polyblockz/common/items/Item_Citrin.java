package mods.polyblockz.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Item_Citrin extends Item {

	public Item_Citrin(int par1) {
		super(par1);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMaterials);

	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon("polyblockz:gem_citrin");
	}

}