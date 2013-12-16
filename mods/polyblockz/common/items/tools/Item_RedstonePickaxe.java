package mods.polyblockz.common.items.tools;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class Item_RedstonePickaxe extends ItemPickaxe {

	public Item_RedstonePickaxe(int i, EnumToolMaterial enumToolMaterial) {
		super(i, enumToolMaterial);

	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon("polyblockz:redstone_pickaxe");
	}

}
