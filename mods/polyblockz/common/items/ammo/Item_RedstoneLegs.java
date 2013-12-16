package mods.polyblockz.common.items.ammo;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Item_RedstoneLegs extends ItemArmor {

	public Item_RedstoneLegs(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon("polyblockz:redstone_legs");
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slo,
			int layer) {
		return "polyblockz:textures/armor/redstone_2.png";
	}

}
