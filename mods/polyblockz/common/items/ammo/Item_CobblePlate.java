package mods.polyblockz.common.items.ammo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.polyblockz.common.main.Item_Helper;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class Item_CobblePlate extends ItemArmor {

	public Item_CobblePlate(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon("polyblockz:cobble_plate");
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slo,
			int layer) {
		return "polyblockz:textures/armor/cobble_1.png";
	}

}