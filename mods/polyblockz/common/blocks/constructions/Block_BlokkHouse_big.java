package mods.polyblockz.common.blocks.constructions;

import java.util.Random;

import mods.polyblockz.common.PolyBlockz;
import mods.polyblockz.common.main.Block_Helper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Block_BlokkHouse_big extends Block {

	@SideOnly(Side.CLIENT)
	public Icon blockIconTop; // TOP
	@SideOnly(Side.CLIENT)
	public Icon blockIconBottom; // BOTTOM
	@SideOnly(Side.CLIENT)
	public Icon blockIconDoorSide; // DOOR

	public Block_BlokkHouse_big(int par1) {
		super(par1, Material.wood);

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
	
	
	public int quantityDropped(int par1) {
		return (1);
	}

	public int idDropped(int par1, Random par2Random, int par3) {
		return Block_Helper.BlokkHouse_big.blockID;
	}

	public void onBlockClicked(World world, int par2, int par3, int par4,
			EntityPlayer par5EntityPlayer) {
		Block_Helper.generateBlokkHouse_big(world, null, par2, par3, par4);
	}

	public boolean onBlockActivated(World world, int par2, int par3, int par4,
			EntityPlayer par5EntityPlayer, int par6, float par7, float par8,
			float par9) {
		Block_Helper.generateBlokkHouse_big(world, null, par2, par3, par4);
		return true;
	}
	
	
	
}
