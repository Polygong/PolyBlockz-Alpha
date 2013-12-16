package mods.polyblockz.common.blocks.ore;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.polyblockz.common.main.Block_Helper;
import mods.polyblockz.common.main.Item_Helper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Ore_Mithril extends Block {

	private boolean requiresNoTool;

	public Ore_Mithril(int id, Material mat) {
		super(id, mat);

	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon("polyblockz:ore_mithril");
	}

	@Override
	public int idDropped(int par1, Random rand, int par2) {
		return Item_Helper.Mithrilflake.itemID;
	}

	@Override
	public int quantityDropped(Random par1Random) {
		return this.blockID == Item_Helper.Mithrilflake.itemID ? 4 + par1Random
				.nextInt(3) : 2;
	}

	@Override
	public int quantityDroppedWithBonus(int par1, Random par2Random) {
		if (par1 > 0 && this.blockID != this.idDropped(0, par2Random, par1)) {
			int j = par2Random.nextInt(par1 + 2) - 1;
			if (j < 0) {
				j = 0;
			}
			return this.quantityDropped(par2Random) * (j + 1);
		} else {
			return this.quantityDropped(par2Random);
		}
	}

	@Override
	public void dropBlockAsItemWithChance(World par1World, int par2, int par3,
			int par4, int par5, float par6, int par7) {
		super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5,
				par6, par7);

		if (this.idDropped(par5, par1World.rand, par7) != this.blockID) {
			int j1 = 0;
			if (this.blockID == Block_Helper.MithrilOre.blockID) {
				j1 = MathHelper.getRandomIntegerInRange(par1World.rand, 3, 7);
			}
			this.dropXpOnBlockBreak(par1World, par2, par3, par4, j1);
		}
	}

	@Override
	public int damageDropped(int par1) {
		return this.blockID == Block_Helper.MithrilOre.blockID ? 4 : 0;
	}

	@Override
	public int idPicked(World par1World, int par2, int par3, int par4) {
		return 0;
	}

	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z,
			int meta) {
		this.dropXpOnBlockBreak(world, x, y, z, 4);
	}

	protected Ore_Mithril setRequiresTool() {
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
