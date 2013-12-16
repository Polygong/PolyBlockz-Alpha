package mods.polyblockz.common.items.tools;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Item_MithrilPickaxe extends ItemPickaxe {

	public Item_MithrilPickaxe(int i, EnumToolMaterial enumToolMaterial) {
		super(i, enumToolMaterial);

	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon("polyblockz:mithril_pickaxe");
	}
	
	public boolean onBlockDestroyed(ItemStack itemstack, World world, int i, int j, int k, int l, EntityLivingBase entity) {
			
			super.onBlockDestroyed(itemstack, world, i, j, k, l, entity);
			entity.addPotionEffect(new PotionEffect(3, 100, k));
			
			return true;
		}
		
	}

