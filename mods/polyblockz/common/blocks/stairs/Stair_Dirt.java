package mods.polyblockz.common.blocks.stairs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;

public class Stair_Dirt extends BlockStairs {

	public Stair_Dirt(int par1, Block par2Block, int par3) {
		super(par1, par2Block, par3);
		setStepSound(soundStoneFootstep);

	}

}