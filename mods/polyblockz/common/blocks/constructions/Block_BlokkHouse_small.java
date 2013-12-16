package mods.polyblockz.common.blocks.constructions;

import java.util.Random;

import mods.polyblockz.common.PolyBlockz;
import mods.polyblockz.common.main.Block_Helper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Block_BlokkHouse_small extends Block {

	@SideOnly(Side.CLIENT)
	public Icon blockIconTop; // TOP
	@SideOnly(Side.CLIENT)
	public Icon blockIconBottom; // BOTTOM
	@SideOnly(Side.CLIENT)
	public Icon blockIconDoorSide; // DOOR

	public Block_BlokkHouse_small(int par1) {
		super(par1, Material.wood);
		float f = 0.4125F;
		this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F,
				0.5F + f);

	}

	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2) {
		return par1 == 1 ? this.blockIconTop
				: par1 == 0 ? this.blockIconBottom
						: par1 == 4 ? this.blockIconDoorSide
								: (par1 == 0 ? Block.planks
										.getBlockTextureFromSide(par1)
										: (par1 != 2 && par1 != 4 ? this.blockIcon
												: this.blockIcon));
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1RegisterIcon) {
		this.blockIcon = par1RegisterIcon
				.registerIcon("polyblockz:blokkhouse_side");
		blockIconTop = par1RegisterIcon.registerIcon("polyblockz:blokkhouse_top"); // TOP
		blockIconBottom = par1RegisterIcon
				.registerIcon("polyblockz:blokkhouse_bottom"); // BOTTOM
		blockIconDoorSide = par1RegisterIcon
				.registerIcon("polyblockz:blokkhouse_doorside"); // DOOR
	}

	public boolean isOpaqueCube() {
		return false;
	}

	/**
	 * If this block doesn't render as an ordinary block it will return False
	 * (examples: signs, buttons, stairs, etc)
	 */
	public boolean renderAsNormalBlock() {
		return false;
	}

	public int quantityDropped(int par1) {
		return (1);
	}

	public int idDropped(int par1, Random par2Random, int par3) {
		return Block_Helper.BlokkHouse_small.blockID;
	}

	public void onBlockClicked(World world, int par2, int par3, int par4,
			EntityPlayer par5EntityPlayer) {
		Block_Helper.generateBlokkHouse_small(world, null, par2, par3, par4);
	}

	public boolean onBlockActivated(World world, int par2, int par3, int par4,
			EntityPlayer par5EntityPlayer, int par6, float par7, float par8,
			float par9) {
		Block_Helper.generateBlokkHouse_small(world, null, par2, par3, par4);
		return true;
	}
}