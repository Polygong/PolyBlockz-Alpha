package mods.polyblockz.common.blocks.wood;

import mods.polyblockz.common.PolyBlockz;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Wood_Reet extends Block {

	public Wood_Reet(int id, Material mat) {
		super(id, mat);
		this.setCreativeTab(PolyBlockz.tabPolyBlockzBlocks);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon("polyblockz:reet");
	}

	public String getTextureFile() {
		return "/mods/polyblockz/textures/blocks/reet.png";
	}

	protected boolean canSilkHarvest() {
		return true;
	}
}
