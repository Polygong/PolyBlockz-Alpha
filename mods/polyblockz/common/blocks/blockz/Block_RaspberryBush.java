package mods.polyblockz.common.blocks.blockz;

import mods.polyblockz.common.main.Block_Helper;
import mods.polyblockz.common.main.Item_Helper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Block_RaspberryBush extends BlockCrops {
	@SideOnly(Side.CLIENT)
	private Icon[] iconArray;

	public Block_RaspberryBush(int par1) {
		super(par1);
		this.setTickRandomly(true);
	}

	public Block setTickRandomly(boolean par1) {
		this.needsRandomTick = par1;
		return this;
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x,
			int y, int z) {
		return null;
	}

	@Override
	public int getRenderType() {
		return 6;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2) {
		if (par2 < 7) {
			if (par2 == 6) {
				par2 = 5;
			}

			return this.iconArray[par2 >> 1];
		} else {
			return this.iconArray[3];
		}
	}

	protected int getSeedItem() {
		return Item_Helper.Raspberry.itemID;
	}

	protected int getCropItem() {
		return Item_Helper.Raspberry.itemID;
	}

	@SideOnly(Side.CLIENT)
	public void dropBlockAsItemWithChance(World par1World, int par2, int par3,
			int par4, int par5, float par6, int par7) {
		super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5,
				par6, par7);

		if (!par1World.isRemote) {
			if (par5 >= 7 && par1World.rand.nextInt(75) == 2) {
				this.dropBlockAsItem_do(par1World, par2, par3, par4,
						new ItemStack(Item_Helper.Raspberry));
			}
		}
	}

	public void registerIcons(IconRegister par1IconRegister) {
		this.iconArray = new Icon[4];

		for (int i = 0; i < this.iconArray.length; ++i) {
			this.iconArray[i] = par1IconRegister.registerIcon("polyblockz:"
					+ "stage_raspberry_" + i);
		}
	}
}
