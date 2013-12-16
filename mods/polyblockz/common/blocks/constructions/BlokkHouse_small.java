package mods.polyblockz.common.blocks.constructions;

import ibxm.Player;

import java.util.Random;

import mods.polyblockz.common.PolyBlockz;
import mods.polyblockz.common.main.Block_Helper;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.StructureBoundingBox;

public class BlokkHouse_small extends WorldGenerator {

	public boolean generate(World world, Random par2Random, int i,
			int j, int k) {


		if (world.getBlockId(i, j, k) == Block_Helper.BlokkHouse_small.blockID) {
			
			/*
			 * Blokk House
	
			 */
			
			world.setBlock(i + 2, j + 0, k + 2,
					Block_Helper.GlowBlokker.blockID);
			world.setBlock(i + 0, j - 1, k + 1,
					Block.waterStill.blockID);
			world.setBlock(i - 1, j - 1, k + 1, 60);
			world.setBlock(i - 1, j + 0, k + 1,
					Block.melonStem.blockID);

			world.setBlock(i + 0, j - 1, k + 4, 4);
			world.setBlock(i + 0, j - 1, k + 3, 4);
			world.setBlock(i + 0, j - 1, k + 2, 4);
			world.setBlock(i + 0, j - 1, k + 1, 4);
			world.setBlock(i + 0, j - 1, k + 0, 4);
			world.setBlock(i + 1, j - 1, k + 4, 4);
			world.setBlock(i + 1, j - 1, k + 3, 4);
			world.setBlock(i + 1, j - 1, k + 2, 4);
			world.setBlock(i + 1, j - 1, k + 1, 4);
			world.setBlock(i + 1, j - 1, k + 0, 4);
			world.setBlock(i + 2, j - 1, k + 4, 4);
			world.setBlock(i + 2, j - 1, k + 3, 4);
			world.setBlock(i + 2, j - 1, k + 2, 4);
			world.setBlock(i + 2, j - 1, k + 1, 4);
			world.setBlock(i + 2, j - 1, k + 0, 4);
			world.setBlock(i + 3, j - 1, k + 4, 4);
			world.setBlock(i + 3, j - 1, k + 3, 4);
			world.setBlock(i + 3, j - 1, k + 2, 4);
			world.setBlock(i + 3, j - 1, k + 1, 4);
			world.setBlock(i + 3, j - 1, k + 0, 4);
			world.setBlock(i + 4, j - 1, k + 4, 4);
			world.setBlock(i + 4, j - 1, k + 3, 4);
			world.setBlock(i + 4, j - 1, k + 2, 4);
			world.setBlock(i + 4, j - 1, k + 1, 4);
			world.setBlock(i + 4, j - 1, k + 0, 4);
			world.setBlock(i + 0, j + 0, k + 4, 17);
			world.setBlock(i + 0, j + 0, k + 3, 5);
			world.setBlock(i + 0, j + 0, k + 1, 5);
			world.setBlock(i + 0, j + 0, k + 0, 17);
			world.setBlock(i + 1, j + 0, k + 4, 5);
			world.setBlock(i + 1, j + 0, k + 1, 61);
			world.setBlock(i + 1, j + 0, k + 0, 5);
			world.setBlock(i + 2, j + 0, k + 4, 5);
			world.setBlock(i + 2, j + 0, k + 0, 5);
			world.setBlock(i + 3, j + 0, k + 4, 5);
			world.setBlock(i + 3, j + 0, k + 1, 54);
			world.setBlock(i + 3, j + 0, k + 0, 5);
			world.setBlock(i + 4, j + 0, k + 4, 17);
			world.setBlock(i + 4, j + 0, k + 3, 5);
			world.setBlock(i + 4, j + 0, k + 2, 5);
			world.setBlock(i + 4, j + 0, k + 1, 5);
			world.setBlock(i + 4, j + 0, k + 0, 17);
			world.setBlock(i + 0, j + 1, k + 4, 17);
			world.setBlock(i + 0, j + 1, k + 3, 5);
			world.setBlock(i + 0, j + 1, k + 1, 5);
			world.setBlock(i + 0, j + 1, k + 0, 17);
			world.setBlock(i + 1, j + 1, k + 4, 5);
			world.setBlock(i + 1, j + 1, k + 0, 5);
			world.setBlock(i + 2, j + 1, k + 4, 20);
			world.setBlock(i + 2, j + 1, k + 0, 20);
			world.setBlock(i + 3, j + 1, k + 4, 5);
			world.setBlock(i + 3, j + 1, k + 0, 5);
			world.setBlock(i + 4, j + 1, k + 4, 17);
			world.setBlock(i + 4, j + 1, k + 3, 5);
			world.setBlock(i + 4, j + 1, k + 2, 5);
			world.setBlock(i + 4, j + 1, k + 1, 5);
			world.setBlock(i + 4, j + 1, k + 0, 17);
			world.setBlock(i + 0, j + 2, k + 4, 17);
			world.setBlock(i + 0, j + 2, k + 3, 5);
			world.setBlock(i + 0, j + 2, k + 2, 5);
			world.setBlock(i + 0, j + 2, k + 1, 5);
			world.setBlock(i + 0, j + 2, k + 0, 17);
			world.setBlock(i + 1, j + 2, k + 4, 5);
			world.setBlock(i + 1, j + 2, k + 0, 5);
			world.setBlock(i + 2, j + 2, k + 4, 5);
			world.setBlock(i + 2, j + 2, k + 0, 5);
			world.setBlock(i + 3, j + 2, k + 4, 5);
			world.setBlock(i + 3, j + 2, k + 0, 5);
			world.setBlock(i + 4, j + 2, k + 4, 17);
			world.setBlock(i + 4, j + 2, k + 3, 5);
			world.setBlock(i + 4, j + 2, k + 2, 5);
			world.setBlock(i + 4, j + 2, k + 1, 5);
			world.setBlock(i + 4, j + 2, k + 0, 17);
			world.setBlock(i + 0, j + 3, k + 3, 5);
			world.setBlock(i + 0, j + 3, k + 2, 5);
			world.setBlock(i + 0, j + 3, k + 1, 5);
			world.setBlock(i + 1, j + 3, k + 4, 5);
			world.setBlock(i + 1, j + 3, k + 3, 5);
			world.setBlock(i + 1, j + 3, k + 1, 5);
			world.setBlock(i + 1, j + 3, k + 0, 5);
			world.setBlock(i + 2, j + 3, k + 4, 5);
			world.setBlock(i + 2, j + 3, k + 0, 5);
			world.setBlock(i + 3, j + 3, k + 4, 5);
			world.setBlock(i + 3, j + 3, k + 3, 5);
			world.setBlock(i + 3, j + 3, k + 1, 5);
			world.setBlock(i + 3, j + 3, k + 0, 5);
			world.setBlock(i + 4, j + 3, k + 3, 5);
			world.setBlock(i + 4, j + 3, k + 2, 5);
			world.setBlock(i + 4, j + 3, k + 1, 5);
			world.setBlock(i + 1, j + 4, k + 2, 5);
			world.setBlock(i + 2, j + 4, k + 3, 5);
			world.setBlock(i + 2, j + 4, k + 2, 5);
			world.setBlock(i + 2, j + 4, k + 1, 5);
			world.setBlock(i + 3, j + 4, k + 2, 5);

		}

		return true;
	}

	
        
}