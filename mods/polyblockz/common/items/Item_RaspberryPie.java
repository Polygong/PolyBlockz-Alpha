package mods.polyblockz.common.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Item_RaspberryPie extends ItemFood {

	public Item_RaspberryPie(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
		this.setUnlocalizedName("RaspberryPie");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon("polyblockz:raspberrypie");
	}

}
