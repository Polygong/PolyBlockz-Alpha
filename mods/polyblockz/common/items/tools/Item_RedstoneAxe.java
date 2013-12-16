package mods.polyblockz.common.items.tools;

import java.util.ArrayList;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.stats.StatList;
import net.minecraft.util.StringTranslate;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

public class Item_RedstoneAxe extends ItemAxe {

	public Item_RedstoneAxe(int i, EnumToolMaterial enumToolMaterial) {
		super(i, enumToolMaterial);
		this.setCreativeTab(CreativeTabs.tabTools);

	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon("polyblockz:redstone_axe");
	}

	public boolean canHarvestBlock(Block par1Block) {
		return par1Block.blockID == Block.web.blockID
				|| par1Block.blockID == Block.redstoneWire.blockID
				|| par1Block.blockID == Block.tripWire.blockID;
	}

	public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) {
		return par2Block.blockID != Block.web.blockID
				&& par2Block.blockID != Block.leaves.blockID ? (par2Block.blockID == Block.cloth.blockID ? 5.0F
				: super.getStrVsBlock(par1ItemStack, par2Block))
				: 15.0F;
	}

	public boolean func_111207_a(ItemStack itemstack, EntityPlayer player,
			EntityLivingBase entity) {
		if (entity.worldObj.isRemote) {
			return false;
		}
		if (entity instanceof IShearable) {
			IShearable target = (IShearable) entity;
			if (target.isShearable(itemstack, entity.worldObj,
					(int) entity.posX, (int) entity.posY, (int) entity.posZ)) {
				ArrayList<ItemStack> drops = target.onSheared(itemstack,
						entity.worldObj, (int) entity.posX, (int) entity.posY,
						(int) entity.posZ,
						EnchantmentHelper.getEnchantmentLevel(
								Enchantment.fortune.effectId, itemstack));

				Random rand = new Random();
				for (ItemStack stack : drops) {
					EntityItem ent = entity.entityDropItem(stack, 1.0F);
					ent.motionY += rand.nextFloat() * 0.05F;
					ent.motionX += (rand.nextFloat() - rand.nextFloat()) * 0.1F;
					ent.motionZ += (rand.nextFloat() - rand.nextFloat()) * 0.1F;
				}
				itemstack.damageItem(1, entity);
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean onBlockStartBreak(ItemStack itemstack, int x, int y, int z,
			EntityPlayer player) {
		if (player.worldObj.isRemote) {
			return false;
		}
		int id = player.worldObj.getBlockId(x, y, z);
		if (Block.blocksList[id] instanceof IShearable) {
			IShearable target = (IShearable) Block.blocksList[id];
			if (target.isShearable(itemstack, player.worldObj, x, y, z)) {
				ArrayList<ItemStack> drops = target.onSheared(itemstack,
						player.worldObj, x, y, z,
						EnchantmentHelper.getEnchantmentLevel(
								Enchantment.fortune.effectId, itemstack));
				Random rand = new Random();

				for (ItemStack stack : drops) {
					float f = 0.7F;
					double d = (double) (rand.nextFloat() * f)
							+ (double) (1.0F - f) * 0.5D;
					double d1 = (double) (rand.nextFloat() * f)
							+ (double) (1.0F - f) * 0.5D;
					double d2 = (double) (rand.nextFloat() * f)
							+ (double) (1.0F - f) * 0.5D;
					EntityItem entityitem = new EntityItem(player.worldObj,
							(double) x + d, (double) y + d1, (double) z + d2,
							stack);
					entityitem.delayBeforeCanPickup = 10;
					player.worldObj.spawnEntityInWorld(entityitem);
				}

				itemstack.damageItem(1, player);
				player.addStat(StatList.mineBlockStatArray[id], 1);
			}
		}
		return false;
	}
}