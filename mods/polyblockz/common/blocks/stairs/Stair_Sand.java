package mods.polyblockz.common.blocks.stairs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;

public class Stair_Sand extends BlockStairs {

	public Stair_Sand(int par1, Block par2Block, int par3) {
		super(par1, par2Block, par3);
		setStepSound(soundSandFootstep);
		this.setHardness(1.5F);
		this.setResistance(3.0F);
		this.setLightOpacity(255);

	}

}