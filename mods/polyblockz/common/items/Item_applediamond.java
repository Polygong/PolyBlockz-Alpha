package mods.polyblockz.common.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Item_applediamond extends ItemFood {

	public Item_applediamond(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
		this.setUnlocalizedName("Diamond Apple");
		setMaxStackSize(64);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon("polyblockz:applediamond");
	}
	
		public void onFoodEaten (ItemStack stack, World world, EntityPlayer player)
    {
        if (!world.isRemote)
        {
            int duration = 0;
            PotionEffect potion;

            potion = player.getActivePotionEffect(Potion.resistance);
            if (potion != null)
                duration = potion.duration;
            player.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, duration + 60 * 40, 4));

            potion = player.getActivePotionEffect(Potion.resistance);
            if (potion != null)
                duration = potion.duration;
            player.addPotionEffect(new PotionEffect(Potion.resistance.id, duration + 60 * 20, 0));

            potion = player.getActivePotionEffect(Potion.digSpeed);
            if (potion != null)
                duration = potion.duration;
            player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, duration + 60 * 20, 0));

            potion = player.getActivePotionEffect(Potion.damageBoost);
            if (potion != null)
                duration = potion.duration;
            player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, duration + 60 * 20, 0));
        }
    }
}
