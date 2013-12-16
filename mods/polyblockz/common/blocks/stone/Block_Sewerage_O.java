package mods.polyblockz.common.blocks.stone;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

public class Block_Sewerage_O extends Block {

	public Block_Sewerage_O(int id, Material mat) {
		super(id, mat);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon("polyblockz:sewerage_o");
	}

}
