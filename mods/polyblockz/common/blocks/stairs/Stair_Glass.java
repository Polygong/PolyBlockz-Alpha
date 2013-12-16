package mods.polyblockz.common.blocks.stairs;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;

public class Stair_Glass extends BlockStairs {

	public Stair_Glass(int par1, Block par2Block, int par3) {
		super(par1, par2Block, par3);
		setStepSound(soundGlassFootstep);

	}

	public int quantityDropped(Random par1Random) {
		return 0;
	}

	public int getRenderBlockPass() {
		return 0;
	}

	protected boolean canSilkHarvest() {
		return true;
	}
}