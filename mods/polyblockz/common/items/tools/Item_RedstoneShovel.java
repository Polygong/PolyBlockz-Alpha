package mods.polyblockz.common.items.tools;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemTool;

public class Item_RedstoneShovel extends ItemSpade {

	public Item_RedstoneShovel(int i, EnumToolMaterial enumToolMaterial) {
		super(i, enumToolMaterial);

	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon("polyblockz:redstone_shovel");
	}

}
