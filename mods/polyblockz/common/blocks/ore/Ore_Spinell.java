package mods.polyblockz.common.blocks.ore;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.polyblockz.common.PolyBlockz;
import mods.polyblockz.common.main.Item_Helper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Ore_Spinell extends Block {

	private boolean requiresNoTool;

	public Ore_Spinell(int id, Material mat) {
		super(id, mat);
		this.setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon("polyblockz:ore_spinell");
	}

	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		return Item_Helper.Spinell.itemID;

	}

	public int idDropped2(int par1, Random par2Random, int par3) {
		return Block.netherrack.blockID;

	}

	@Override
	public int quantityDroppedWithBonus(int par1, Random par2Random) {
		if (par1 > 0 && this.blockID != this.idDropped(0, par2Random, par1)) {
			int j = par2Random.nextInt(par1 + 1) - 1;
			if (j < 0) {
				j = 0;
			}
			return this.quantityDropped(par2Random) * (j + 2);
		} else {
			return this.quantityDropped(par2Random);
		}
	}

	@Override
	public void dropBlockAsItemWithChance(World par1World, int par2, int par3,
			int par4, int par5, float par6, int par7) {
		if (!par1World.isRemote) {
			int var8 = this.quantityDroppedWithBonus(par7, par1World.rand);
			for (int var9 = 0; var9 < var8; ++var9) {
				if (par1World.rand.nextFloat() <= par6) {
					int var10 = this.idDropped2(par5, par1World.rand, par7);
					int var11 = this.idDropped(par5, par1World.rand, par7);
					if (var10 > 0) {
						this.dropBlockAsItem_do(
								par1World,
								par2,
								par3,
								par4,
								new ItemStack(var10, 1, this
										.damageDropped(par5)));
						this.dropBlockAsItem_do(
								par1World,
								par2,
								par3,
								par4,
								new ItemStack(var11, 1, this
										.damageDropped(par5)));
					}
				}
			}
		}
	}

	@Override
	public int idPicked(World par1World, int par2, int par3, int par4) {
		return 0;
	}

	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z,
			int meta) {
		this.dropXpOnBlockBreak(world, x, y, z, 1);
	}

	protected Ore_Spinell setRequiresTool() {
		this.requiresNoTool = true;
		return this;
	}

	/**
	 * The type of render function that is called for this block
	 */
	@Override
	public int getRenderType() {
		return 0;
	}

}
