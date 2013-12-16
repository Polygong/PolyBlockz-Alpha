package mods.polyblockz.common;

import java.util.Random;

import mods.polyblockz.common.blocks.*;
import mods.polyblockz.common.blocks.constructions.Block_BlokkHouse_big;
import mods.polyblockz.common.blocks.constructions.Block_BlokkHouse_hidingplace;
import mods.polyblockz.common.blocks.constructions.Block_BlokkHouse_middl;
import mods.polyblockz.common.blocks.constructions.Block_BlokkHouse_poly;
import mods.polyblockz.common.blocks.constructions.Block_BlokkHouse_small;
import mods.polyblockz.common.blocks.constructions.BlokkHouse_big;
import mods.polyblockz.common.blocks.constructions.BlokkHouse_hidingplace;
import mods.polyblockz.common.blocks.constructions.BlokkHouse_middl;
import mods.polyblockz.common.blocks.constructions.BlokkHouse_poly;
import mods.polyblockz.common.blocks.constructions.BlokkHouse_small;
import mods.polyblockz.common.main.Block_Helper;
import mods.polyblockz.common.main.CreativeTab_PolyBlockz;
import mods.polyblockz.common.main.CreativeTab_PolyBlockz_Dekoration;
import mods.polyblockz.common.main.CreativeTab_PolyBlockz_Items;
import mods.polyblockz.common.main.FuelHandler;
import mods.polyblockz.common.main.ID_Helper;
import mods.polyblockz.common.main.Item_Helper;
import mods.polyblockz.common.main.Locale_Helper;
import mods.polyblockz.common.main.Recipe_Blocks;
import mods.polyblockz.common.main.Recipe_Enchanted;
import mods.polyblockz.common.main.Recipe_Items;
import mods.polyblockz.common.main.Reference;
import mods.polyblockz.common.main.WorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER)

@NetworkMod(clientSideRequired = true, serverSideRequired = false, channels = { Reference.CHANNEL_NAME })


public class PolyBlockz 
{
	/*
	 * Register CreativTabs from PolyBlockz
	 */
	
	public static CreativeTabs tabPolyBlockzBlocks = new CreativeTab_PolyBlockz
			(CreativeTabs.getNextID(), "PolyBlockzBlocks");
	
	public static CreativeTabs tabPolyBlockzItems = new CreativeTab_PolyBlockz_Items
			(CreativeTabs.getNextID(), "PolyBlockzItems");
	
	public static CreativeTabs tabPolyBlockzDekoration = new CreativeTab_PolyBlockz_Dekoration
			(CreativeTabs.getNextID(), "PolyBlockzDekoration");

	
	/*	 
	 * Register Biome	 
	 */
	
	//public static BiomeGenBase MyzelumBiom;

	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	
	public static CommonProxy proxy;

	
	@Instance(Reference.MOD_ID)
	public static PolyBlockz instance;

	@EventHandler
	public void Load(FMLPreInitializationEvent Eevent) 
	{
		/* 
		 * Myzil Biom from PolyBlockz
		 * MyzelumBiom = new Biome_MyzelumBiom(ID_Helper.MyzelumBiomID);
		 * GameRegistry.addBiome(MyzelumBiom);
		 */

		
		/*
		 * Configuration File
		 */
		
		Configuration config = new Configuration(Eevent.getSuggestedConfigurationFile());
		
		config.load();
		
		ID_Helper.runConfiguration(config);
		
		config.save();
		
	}

	
	@Init
	public void load(FMLInitializationEvent event) 
	{
		proxy.registerRenderThings();
		
		//proxy.registerServerTickHandler();

		NetworkRegistry.instance().registerConnectionHandler(new ConnectionHandler());
		
		Locale_Helper.loadLanguages();

		
		Block_Helper.setupBlocks();
			Recipe_Blocks.setupBlocksRecepies();

		Item_Helper.setupItems();
			Recipe_Items.setupItemsRecepies();

		Recipe_Enchanted.setupEnchantedRecepies();
		
		Item_Helper.setupSmeltingRecepies();
		

		GameRegistry.registerWorldGenerator(new WorldGenerator());
		
		GameRegistry.registerFuelHandler(new FuelHandler());

		
		/*
		 * Grass Seeds with minimal Droprate
		 */

		MinecraftForge.addGrassSeed(new ItemStack(Item.potato), 1);
			MinecraftForge.addGrassSeed(new ItemStack(Item.pumpkinSeeds), 1);
				MinecraftForge.addGrassSeed(new ItemStack(Item.melonSeeds), 1);
					MinecraftForge.addGrassSeed(new ItemStack(Item.carrot), 1);
						MinecraftForge.addGrassSeed(new ItemStack(Item_Helper.Raspberry), 1);
	}
}
