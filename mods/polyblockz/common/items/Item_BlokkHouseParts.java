package mods.polyblockz.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.polyblockz.common.PolyBlockz;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Item_BlokkHouseParts extends Item {

	public Item_BlokkHouseParts(int par1) {
		super(par1);
		setMaxStackSize(64);
		setCreativeTab(PolyBlockz.tabPolyBlockzItems);

	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon("polyblockz:blokkhouse_parts");
	}

}