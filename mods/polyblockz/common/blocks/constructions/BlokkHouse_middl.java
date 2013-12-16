package mods.polyblockz.common.blocks.constructions;

import java.util.Random;

import mods.polyblockz.common.PolyBlockz;
import mods.polyblockz.common.main.Block_Helper;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BlokkHouse_middl extends WorldGenerator {

	public boolean generate(World par1World, Random par2Random, int X_Coord,
			int Y_Coord, int Z_Coord) {

		if (par1World.getBlockId(X_Coord, Y_Coord, Z_Coord) == Block_Helper.BlokkHouse_middl.blockID) {
			/*
			 * Blokk House
			 */

			par1World.setBlock(X_Coord + 2, Y_Coord + 0, Z_Coord + 2,
					Block_Helper.GlowBlokker.blockID);
			par1World.setBlock(X_Coord + 0, Y_Coord - 1, Z_Coord + 1,
					Block.waterStill.blockID);
			par1World.setBlock(X_Coord - 1, Y_Coord - 1, Z_Coord + 1, 60);
			par1World.setBlock(X_Coord - 1, Y_Coord + 0, Z_Coord + 1,
					Block.melonStem.blockID);

			par1World.setBlock(X_Coord + 0, Y_Coord - 1, Z_Coord + 5, 4);
			par1World.setBlock(X_Coord + 0, Y_Coord - 1, Z_Coord + 4, 4);
			par1World.setBlock(X_Coord + 0, Y_Coord - 1, Z_Coord + 3, 4);
			par1World.setBlock(X_Coord + 0, Y_Coord - 1, Z_Coord + 2, 4);
			par1World.setBlock(X_Coord + 0, Y_Coord - 1, Z_Coord + 1, 4);
			par1World.setBlock(X_Coord + 0, Y_Coord - 1, Z_Coord + 0, 4);
			par1World.setBlock(X_Coord + 1, Y_Coord - 1, Z_Coord + 5, 4);
			par1World.setBlock(X_Coord + 1, Y_Coord - 1, Z_Coord + 4, 4);
			par1World.setBlock(X_Coord + 1, Y_Coord - 1, Z_Coord + 3, 4);
			par1World.setBlock(X_Coord + 1, Y_Coord - 1, Z_Coord + 2, 4);
			par1World.setBlock(X_Coord + 1, Y_Coord - 1, Z_Coord + 1, 4);
			par1World.setBlock(X_Coord + 1, Y_Coord - 1, Z_Coord + 0, 4);
			par1World.setBlock(X_Coord + 2, Y_Coord - 1, Z_Coord + 5, 4);
			par1World.setBlock(X_Coord + 2, Y_Coord - 1, Z_Coord + 4, 4);
			par1World.setBlock(X_Coord + 2, Y_Coord - 1, Z_Coord + 3, 4);
			par1World.setBlock(X_Coord + 2, Y_Coord - 1, Z_Coord + 2, 4);
			par1World.setBlock(X_Coord + 2, Y_Coord - 1, Z_Coord + 1, 4);
			par1World.setBlock(X_Coord + 2, Y_Coord - 1, Z_Coord + 0, 4);
			par1World.setBlock(X_Coord + 3, Y_Coord - 1, Z_Coord + 5, 4);
			par1World.setBlock(X_Coord + 3, Y_Coord - 1, Z_Coord + 4, 4);
			par1World.setBlock(X_Coord + 3, Y_Coord - 1, Z_Coord + 3, 4);
			par1World.setBlock(X_Coord + 3, Y_Coord - 1, Z_Coord + 2, 4);
			par1World.setBlock(X_Coord + 3, Y_Coord - 1, Z_Coord + 1, 4);
			par1World.setBlock(X_Coord + 3, Y_Coord - 1, Z_Coord + 0, 4);
			par1World.setBlock(X_Coord + 4, Y_Coord - 1, Z_Coord + 5, 4);
			par1World.setBlock(X_Coord + 4, Y_Coord - 1, Z_Coord + 4, 4);
			par1World.setBlock(X_Coord + 4, Y_Coord - 1, Z_Coord + 3, 4);
			par1World.setBlock(X_Coord + 4, Y_Coord - 1, Z_Coord + 2, 4);
			par1World.setBlock(X_Coord + 4, Y_Coord - 1, Z_Coord + 1, 4);
			par1World.setBlock(X_Coord + 4, Y_Coord - 1, Z_Coord + 0, 4);
			par1World.setBlock(X_Coord + 5, Y_Coord - 1, Z_Coord + 5, 4);
			par1World.setBlock(X_Coord + 5, Y_Coord - 1, Z_Coord + 4, 4);
			par1World.setBlock(X_Coord + 5, Y_Coord - 1, Z_Coord + 3, 4);
			par1World.setBlock(X_Coord + 5, Y_Coord - 1, Z_Coord + 2, 4);
			par1World.setBlock(X_Coord + 5, Y_Coord - 1, Z_Coord + 1, 4);
			par1World.setBlock(X_Coord + 5, Y_Coord - 1, Z_Coord + 0, 4);
			par1World.setBlock(X_Coord + 0, Y_Coord + 0, Z_Coord + 5, 17);
			par1World.setBlock(X_Coord + 0, Y_Coord + 0, Z_Coord + 4, 5);
			par1World.setBlock(X_Coord + 0, Y_Coord + 0, Z_Coord + 3, 5);
			par1World.setBlock(X_Coord + 0, Y_Coord + 0, Z_Coord + 1, 5);
			par1World.setBlock(X_Coord + 0, Y_Coord + 0, Z_Coord + 0, 17);
			par1World.setBlock(X_Coord + 1, Y_Coord + 0, Z_Coord + 5, 5);
			par1World.setBlock(X_Coord + 1, Y_Coord + 0, Z_Coord + 1, 61);
			par1World.setBlock(X_Coord + 1, Y_Coord + 0, Z_Coord + 0, 5);
			par1World.setBlock(X_Coord + 2, Y_Coord + 0, Z_Coord + 5, 5);
			par1World.setBlock(X_Coord + 2, Y_Coord + 0, Z_Coord + 0, 5);
			par1World.setBlock(X_Coord + 3, Y_Coord + 0, Z_Coord + 5, 5);
			par1World.setBlock(X_Coord + 3, Y_Coord + 0, Z_Coord + 0, 5);
			par1World.setBlock(X_Coord + 4, Y_Coord + 0, Z_Coord + 5, 5);
			par1World.setBlock(X_Coord + 4, Y_Coord + 0, Z_Coord + 1, 54);
			par1World.setBlock(X_Coord + 4, Y_Coord + 0, Z_Coord + 0, 5);
			par1World.setBlock(X_Coord + 5, Y_Coord + 0, Z_Coord + 5, 17);
			par1World.setBlock(X_Coord + 5, Y_Coord + 0, Z_Coord + 4, 5);
			par1World.setBlock(X_Coord + 5, Y_Coord + 0, Z_Coord + 3, 5);
			par1World.setBlock(X_Coord + 5, Y_Coord + 0, Z_Coord + 2, 5);
			par1World.setBlock(X_Coord + 5, Y_Coord + 0, Z_Coord + 1, 5);
			par1World.setBlock(X_Coord + 5, Y_Coord + 0, Z_Coord + 0, 17);
			par1World.setBlock(X_Coord + 0, Y_Coord + 1, Z_Coord + 5, 17);
			par1World.setBlock(X_Coord + 0, Y_Coord + 1, Z_Coord + 4, 5);
			par1World.setBlock(X_Coord + 0, Y_Coord + 1, Z_Coord + 3, 5);
			par1World.setBlock(X_Coord + 0, Y_Coord + 1, Z_Coord + 1, 5);
			par1World.setBlock(X_Coord + 0, Y_Coord + 1, Z_Coord + 0, 17);
			par1World.setBlock(X_Coord + 1, Y_Coord + 1, Z_Coord + 5, 5);
			par1World.setBlock(X_Coord + 1, Y_Coord + 1, Z_Coord + 0, 5);
			par1World.setBlock(X_Coord + 2, Y_Coord + 1, Z_Coord + 5, 20);
			par1World.setBlock(X_Coord + 2, Y_Coord + 1, Z_Coord + 0, 20);
			par1World.setBlock(X_Coord + 3, Y_Coord + 1, Z_Coord + 5, 20);
			par1World.setBlock(X_Coord + 3, Y_Coord + 1, Z_Coord + 0, 20);
			par1World.setBlock(X_Coord + 4, Y_Coord + 1, Z_Coord + 5, 5);
			par1World.setBlock(X_Coord + 4, Y_Coord + 1, Z_Coord + 0, 5);
			par1World.setBlock(X_Coord + 5, Y_Coord + 1, Z_Coord + 5, 17);
			par1World.setBlock(X_Coord + 5, Y_Coord + 1, Z_Coord + 4, 5);
			par1World.setBlock(X_Coord + 5, Y_Coord + 1, Z_Coord + 3, 5);
			par1World.setBlock(X_Coord + 5, Y_Coord + 1, Z_Coord + 2, 5);
			par1World.setBlock(X_Coord + 5, Y_Coord + 1, Z_Coord + 1, 5);
			par1World.setBlock(X_Coord + 5, Y_Coord + 1, Z_Coord + 0, 17);
			par1World.setBlock(X_Coord + 0, Y_Coord + 2, Z_Coord + 5, 17);
			par1World.setBlock(X_Coord + 0, Y_Coord + 2, Z_Coord + 4, 5);
			par1World.setBlock(X_Coord + 0, Y_Coord + 2, Z_Coord + 3, 5);
			par1World.setBlock(X_Coord + 0, Y_Coord + 2, Z_Coord + 2, 5);
			par1World.setBlock(X_Coord + 0, Y_Coord + 2, Z_Coord + 1, 5);
			par1World.setBlock(X_Coord + 0, Y_Coord + 2, Z_Coord + 0, 17);
			par1World.setBlock(X_Coord + 1, Y_Coord + 2, Z_Coord + 5, 5);
			par1World.setBlock(X_Coord + 1, Y_Coord + 2, Z_Coord + 4, 5);
			par1World.setBlock(X_Coord + 1, Y_Coord + 2, Z_Coord + 1, 5);
			par1World.setBlock(X_Coord + 1, Y_Coord + 2, Z_Coord + 0, 5);
			par1World.setBlock(X_Coord + 2, Y_Coord + 2, Z_Coord + 5, 5);
			par1World.setBlock(X_Coord + 2, Y_Coord + 2, Z_Coord + 0, 5);
			par1World.setBlock(X_Coord + 3, Y_Coord + 2, Z_Coord + 5, 5);
			par1World.setBlock(X_Coord + 3, Y_Coord + 2, Z_Coord + 0, 5);
			par1World.setBlock(X_Coord + 4, Y_Coord + 2, Z_Coord + 5, 5);
			par1World.setBlock(X_Coord + 4, Y_Coord + 2, Z_Coord + 4, 5);
			par1World.setBlock(X_Coord + 4, Y_Coord + 2, Z_Coord + 1, 5);
			par1World.setBlock(X_Coord + 4, Y_Coord + 2, Z_Coord + 0, 5);
			par1World.setBlock(X_Coord + 5, Y_Coord + 2, Z_Coord + 5, 17);
			par1World.setBlock(X_Coord + 5, Y_Coord + 2, Z_Coord + 4, 5);
			par1World.setBlock(X_Coord + 5, Y_Coord + 2, Z_Coord + 3, 5);
			par1World.setBlock(X_Coord + 5, Y_Coord + 2, Z_Coord + 2, 5);
			par1World.setBlock(X_Coord + 5, Y_Coord + 2, Z_Coord + 1, 5);
			par1World.setBlock(X_Coord + 5, Y_Coord + 2, Z_Coord + 0, 17);
			par1World.setBlock(X_Coord + 0, Y_Coord + 3, Z_Coord + 3, 5);
			par1World.setBlock(X_Coord + 0, Y_Coord + 3, Z_Coord + 2, 5);
			par1World.setBlock(X_Coord + 1, Y_Coord + 3, Z_Coord + 5, 5);
			par1World.setBlock(X_Coord + 1, Y_Coord + 3, Z_Coord + 4, 5);
			par1World.setBlock(X_Coord + 1, Y_Coord + 3, Z_Coord + 3, 5);
			par1World.setBlock(X_Coord + 1, Y_Coord + 3, Z_Coord + 2, 5);
			par1World.setBlock(X_Coord + 1, Y_Coord + 3, Z_Coord + 1, 5);
			par1World.setBlock(X_Coord + 1, Y_Coord + 3, Z_Coord + 0, 5);
			par1World.setBlock(X_Coord + 2, Y_Coord + 3, Z_Coord + 5, 5);
			par1World.setBlock(X_Coord + 2, Y_Coord + 3, Z_Coord + 4, 5);
			par1World.setBlock(X_Coord + 2, Y_Coord + 3, Z_Coord + 3, 5);
			par1World.setBlock(X_Coord + 2, Y_Coord + 3, Z_Coord + 2, 5);
			par1World.setBlock(X_Coord + 2, Y_Coord + 3, Z_Coord + 1, 5);
			par1World.setBlock(X_Coord + 2, Y_Coord + 3, Z_Coord + 0, 5);
			par1World.setBlock(X_Coord + 3, Y_Coord + 3, Z_Coord + 5, 5);
			par1World.setBlock(X_Coord + 3, Y_Coord + 3, Z_Coord + 4, 5);
			par1World.setBlock(X_Coord + 3, Y_Coord + 3, Z_Coord + 3, 5);
			par1World.setBlock(X_Coord + 3, Y_Coord + 3, Z_Coord + 2, 5);
			par1World.setBlock(X_Coord + 3, Y_Coord + 3, Z_Coord + 1, 5);
			par1World.setBlock(X_Coord + 3, Y_Coord + 3, Z_Coord + 0, 5);
			par1World.setBlock(X_Coord + 4, Y_Coord + 3, Z_Coord + 5, 5);
			par1World.setBlock(X_Coord + 4, Y_Coord + 3, Z_Coord + 4, 5);
			par1World.setBlock(X_Coord + 4, Y_Coord + 3, Z_Coord + 3, 5);
			par1World.setBlock(X_Coord + 4, Y_Coord + 3, Z_Coord + 2, 5);
			par1World.setBlock(X_Coord + 4, Y_Coord + 3, Z_Coord + 1, 5);
			par1World.setBlock(X_Coord + 4, Y_Coord + 3, Z_Coord + 0, 5);
			par1World.setBlock(X_Coord + 5, Y_Coord + 3, Z_Coord + 3, 5);
			par1World.setBlock(X_Coord + 5, Y_Coord + 3, Z_Coord + 2, 5);
			par1World.setBlock(X_Coord + 2, Y_Coord + 4, Z_Coord + 3, 5);
			par1World.setBlock(X_Coord + 2, Y_Coord + 4, Z_Coord + 2, 5);
			par1World.setBlock(X_Coord + 3, Y_Coord + 4, Z_Coord + 3, 5);
			par1World.setBlock(X_Coord + 3, Y_Coord + 4, Z_Coord + 2, 5);

		}

		return true;
	}
}