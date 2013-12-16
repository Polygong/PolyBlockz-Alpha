package mods.polyblockz.common.blocks.stairs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;

public class Stair_Dirtwall extends BlockStairs {

	public Stair_Dirtwall(int par1, Block par2Block, int par3) {
		super(par1, par2Block, par3);
		setStepSound(soundGravelFootstep);

	}

}