package mods.polyblockz.common.main;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenForest;
import net.minecraft.world.gen.feature.WorldGenSwamp;
import net.minecraft.world.gen.feature.WorldGenTrees;

public class Biome_MyzelumBiom extends BiomeGenBase 
{

	public Biome_MyzelumBiom(int par1) 
	{
		
		super(par1);
		this.minHeight = 0.08F;
		this.maxHeight = 0.12F;
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.topBlock = (byte) Block.grass.blockID;
		this.fillerBlock = (byte) Block.stone.blockID;
		this.setTemperatureRainfall(0.9F, 1.0F);
		this.setMinMaxHeight(0.08F, 0.12F);
		this.setBiomeName("Poly");
		this.temperature = 0.5F;
		this.rainfall = 0.01F;
		this.spawnableMonsterList = new ArrayList();
		this.spawnableCreatureList = new ArrayList();
		this.spawnableWaterCreatureList = new ArrayList();
		biomeList[par1] = this;
		this.theBiomeDecorator = this.createBiomeDecorator();
		
		this.spawnableMonsterList.add(new SpawnListEntry(EntitySpider.class,	2, 4, 4));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityZombie.class, 2, 4, 4));
		this.spawnableMonsterList.add(new SpawnListEntry(EntitySkeleton.class, 2, 4, 4));
		this.spawnableMonsterList.add(new SpawnListEntry(EntitySlime.class, 3, 4, 4));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityEnderman.class, 1, 1, 4));
		this.spawnableWaterCreatureList.add(new SpawnListEntry(EntitySquid.class, 2, 4, 4));
		this.spawnableCaveCreatureList.add(new SpawnListEntry(EntityBat.class, 2, 8, 8));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityMooshroom.class, 1, 4, 8));
		
		this.theBiomeDecorator.mushroomsPerChunk = 1;
		this.theBiomeDecorator.bigMushroomsPerChunk = 1;
		this.theBiomeDecorator.treesPerChunk = 8;
		this.theBiomeDecorator.flowersPerChunk = 6;
		this.theBiomeDecorator.grassPerChunk = 9;
		this.theBiomeDecorator.clayPerChunk = 40;
		this.theBiomeDecorator.reedsPerChunk = 5;
	}

}
