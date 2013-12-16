package mods.polyblockz.common.main;

import java.util.Random;

import mods.polyblockz.common.PolyBlockz;
import mods.polyblockz.common.blocks.constructions.BlokkHouse_poly;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenerator implements IWorldGenerator 
{
	public static Block block;
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch (world.provider.dimensionId) 
		{
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	public void generateNether(World world, Random random, int chunkX, int chunkZ) 
	{
		//
	}

	private void generateSurface(World world, Random random, int chunkX, int chunkZ) 
	{
        /* --- * --- */
		for (int i = 0; i < 5; i++) 
		{
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(35);
			int zCoord = chunkZ + random.nextInt(16);

			(new WorldGenMinable(Block_Helper.MithrilOre.blockID, 4)).generate(world, random, xCoord, yCoord, zCoord);
		}

        /* --- * --- */
		for (int i = 0; i < 16; i++) 
		{
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(115);
			int zCoord = chunkZ + random.nextInt(16);

			(new WorldGenMinable(Block_Helper.BoneOre.blockID, 5)).generate(world, random, xCoord, yCoord, zCoord);
		}
		
        /* --- * --- */
		for (int i = 0; i < 12; i++) 
		{
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(85);
			int zCoord = chunkZ + random.nextInt(16);

			(new WorldGenMinable(Block_Helper.PolyamidOre.blockID, 6)).generate(world, random, xCoord, yCoord, zCoord);
		}
		
        /* --- * --- */
		for (int i = 0; i < 6; i++) 
		{
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(60);
			int zCoord = chunkZ + random.nextInt(16);

			(new WorldGenMinable(Block_Helper.CitrinOre.blockID, 3)).generate(world, random, xCoord, yCoord, zCoord);
		}

        /* --- * --- */
		for (int i = 0; i < 6; i++)
		{
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(60);
			int zCoord = chunkZ + random.nextInt(16);

			(new WorldGenMinable(Block_Helper.RubinOre.blockID, 3)).generate(world, random, xCoord, yCoord, zCoord);
		}
		
        /* --- * --- */
		for (int i = 0; i < 6; i++) 
		{
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(60);
			int zCoord = chunkZ + random.nextInt(16);

			(new WorldGenMinable(Block_Helper.SaphirOre.blockID, 3)).generate(world, random, xCoord, yCoord, zCoord);
		}
		
        /* --- * --- */
		for (int i = 0; i < 6; i++) 
		{
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(60);
			int zCoord = chunkZ + random.nextInt(16);

			(new WorldGenMinable(Block_Helper.SmokeQuartzOre.blockID, 3)).generate(world, random, xCoord, yCoord, zCoord);
		}
		
        /* --- * --- */
		for (int i = 0; i < 6; i++) 
		{
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(60);
			int zCoord = chunkZ + random.nextInt(16);

			(new WorldGenMinable(Block_Helper.SpinellOre.blockID, 3)).generate(world, random, xCoord, yCoord, zCoord);
		}
		
        /* --- * --- */
		for (int i = 0; i < 6; i++) 
		{
			int xCoord1 = chunkX + random.nextInt(16);
			int yCoord1 = random.nextInt(70);
			int zCoord1 = chunkZ + random.nextInt(16);
			  
			  (new BlokkHouse_poly()).generate(world, random, xCoord1, yCoord1, zCoord1);
		}  
		
		
	}

	public void generateEnd(World world, Random random, int chunkX, int chunkZ) 
	{
		//
	}

}