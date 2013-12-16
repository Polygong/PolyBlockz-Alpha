package mods.polyblockz.common.blocks.glowstone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Glow_Stoneplate_darkred extends Block {

	public Glow_Stoneplate_darkred(int id, Material mat) {
		super(id, mat);

	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister iconRegister) {
		this.blockIcon = iconRegister
				.registerIcon("polyblockz:glow_stoneplate_darkred");
	}

}