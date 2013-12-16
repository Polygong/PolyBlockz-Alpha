package mods.polyblockz.common.main;

import mods.polyblockz.common.CommonProxy;
import mods.polyblockz.common.PolyBlockz;
import mods.polyblockz.common.items.*;
import mods.polyblockz.common.items.ammo.*;
import mods.polyblockz.common.items.tools.*;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidContainerRegistry;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Item_Helper 
{
	public static EnumToolMaterial Mithril = EnumHelper.addToolMaterial("Mithril", 3, 2475, 13.0F, 4.5F, 25);
	public static EnumArmorMaterial MithrilArmorMat = EnumHelper.addArmorMaterial("MithrilArmorMat", 46, new int[] { 5, 12, 9, 5 },	25);
   
	/* --- * --- */
	
	public static EnumToolMaterial Emerald = EnumHelper.addToolMaterial("Emerald", 3, 1661, 8.0F, 3.5F, 22);
	public static EnumArmorMaterial EmeraldArmorMat = EnumHelper.addArmorMaterial("EmeraldArmorMat", 46, new int[] { 3, 8, 6, 3 }, 10);
   
	/* --- * --- */
	
	public static EnumToolMaterial Redstone = EnumHelper.addToolMaterial("Redstone", 3, 612, 11.0F, 2.5F, 16);
	public static EnumArmorMaterial RedstoneArmorMat = EnumHelper.addArmorMaterial("RedstoneArmorMat", 46, new int[] { 2, 6, 5, 2 }, 9);
   
	/* --- * --- */
	
	public static EnumToolMaterial Cobble = EnumHelper.addToolMaterial("Cobble", 1, 212, 5F, 1.5F, 12);
	public static EnumArmorMaterial CobbleArmorMat = EnumHelper.addArmorMaterial("CobbleArmorMat", 4, new int[] { 1, 3, 2, 1 }, 15);
   
	/* --- * --- */
	
	public static EnumToolMaterial Cobbleweak = EnumHelper.addToolMaterial("CobbleWeak", 1, 182, 5F, 1.0F, 12);
	public static EnumArmorMaterial CobbleArmorWeakMat = EnumHelper.addArmorMaterial("CobbleArmorWeakMat", 4, new int[] { 1, 3, 2, 1 }, 15);

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	
	/*
	 * ItemIDs
	 */

	public static Item Mithrilflake;
	public static Item Mithril_Ingot;
	public static Item Mithrilvermit;
	public static Item Diamondform;
	public static Item Raspberry;
	public static Item grenade;
	public static Item Emerald_Ingot;
	public static Item Redstone_Ingot;
	public static Item Polyamid_Ingot;
	public static Item SewerageWaterBucket;
	public static Item RaspberryPie;
	public static Item ApplePie;
	public static Item Emeraldvermit;
	public static Item Redstonevermit;
	public static Item BlokkHouseParts;
	public static Item Citrin;
	public static Item Rubin;
	public static Item Saphir;
	public static Item SmokeQuartz;
	public static Item Spinell;
	public static Item AppleDiamond;

	
	/*
	 * Tool IDs
	 */

	public static Item MithrilAxe;
	public static Item MithrilHoe;
	public static Item MithrilShovel;
	public static Item MithrilSword;
	public static Item MithrilPickaxe;
	public static Item EmeraldAxe;
	public static Item EmeraldHoe;
	public static Item EmeraldShovel;
	public static Item EmeraldSword;
	public static Item EmeraldPickaxe;
	public static Item RedstoneAxe;
	public static Item RedstoneHoe;
	public static Item RedstoneShovel;
	public static Item RedstoneSword;
	public static Item RedstonePickaxe;
	public static Item CobbleMace;
	public static Item CobbleClub;

	
	/*
	 * Hores Armor
	 */

	public static Item Redstone_Horse_ArmorID;
	public static Item Emerald_Horse_ArmorID;
	public static Item Mithril_Horse_ArmorID;

	
	/*
	 * Armor IDs
	 */

	public static Item MithrilHelm;
	public static Item MithrilPlate;
	public static Item MithrilLegs;
	public static Item MithrilBoots;
	public static Item EmeraldHelm;
	public static Item EmeraldPlate;
	public static Item EmeraldLegs;
	public static Item EmeraldBoots;
	public static Item RedstoneHelm;
	public static Item RedstonePlate;
	public static Item RedstoneLegs;
	public static Item RedstoneBoots;
	public static Item CobbleHelm;
	public static Item CobblePlate;
	public static Item CobbleLegs;
	public static Item CobbleBoots;


	public static void setupItems() 
	{
		/*
		 * ItemIDs
		 */
		
		Mithrilflake = new Item_Mithrilflake(ID_Helper.MithrilflakeID)
				.setUnlocalizedName("polyblockz:mithril_flake").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(Mithrilflake, "Mithrilflake");
        /* --- * --- */
		Mithril_Ingot = new Item_Mithril_Ingot(ID_Helper.Mithril_IngotID)
				.setUnlocalizedName("polyblockz:mithril_ingot").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(Mithril_Ingot, "Mithril_Ingot");
        /* --- * --- */
		Mithrilvermit = new Item_Mithrilvermit(ID_Helper.MithrilvermitID)
				.setUnlocalizedName("polyblockz:mithril_vermit")
				.setCreativeTab(PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(Mithrilvermit, "Mithrilvermit");
        /* --- * --- */
		Diamondform = new Item_Diamondform(ID_Helper.DiamondformID)
				.setUnlocalizedName("polyblockz:raw_diamond").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(Diamondform, "Diamondform");
        /* --- * --- */
		Raspberry = new ItemSeedFood(ID_Helper.RaspberryID, 4, 0.6F,
				Block_Helper.BlockRaspberry.blockID, Block.tilledField.blockID)
				.setTextureName("polyblockz:raspberry")
				.setUnlocalizedName("polyblockz:raspberry")
				.setCreativeTab(CreativeTabs.tabFood);
		LanguageRegistry.addName(Raspberry, "Raspberry");
        /* --- * --- */
		grenade = new Item_Grenade(ID_Helper.grenadeID)
				.setCreativeTab(PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(grenade, "Grenade");
        /* --- * --- */
		Emerald_Ingot = new Item_Emerald_Ingot(ID_Helper.Emerald_IngotID)
				.setUnlocalizedName("polyblockz:emerald_ingot").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(Emerald_Ingot, "Emerald Ingot");
        /* --- * --- */
		Redstone_Ingot = new Item_Redstone_Ingot(ID_Helper.Redstone_IngotID)
				.setUnlocalizedName("polyblockz:redstone_ingot")
				.setCreativeTab(PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(Redstone_Ingot, "Redstone Ingot");
        /* --- * --- */
		Polyamid_Ingot = new Item_Polyamid_Ingot(ID_Helper.Polyamid_IngotID)
				.setUnlocalizedName("polyblockz:polyamid_ingot")
				.setCreativeTab(PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(Polyamid_Ingot, "Polyamid Ingot");
        /* --- * --- */
		ApplePie = new Item_ApplePie(ID_Helper.ApplePieID, 8, 6.0F, true)
				.setCreativeTab(CreativeTabs.tabFood);
		GameRegistry.registerItem(ApplePie, "Apple Pie");
        /* --- * --- */
		RaspberryPie = new Item_RaspberryPie(ID_Helper.RaspberryPieID, 8, 6.0F,
				true).setCreativeTab(CreativeTabs.tabFood);
		LanguageRegistry.addName(ApplePie, "Raspberry Pie");
        /* --- * --- */
		Emeraldvermit = new Item_Emeraldvermit(ID_Helper.EmeraldvermitID)
				.setUnlocalizedName("polyblockz:emerald_vermit")
				.setCreativeTab(PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(Emeraldvermit, "Emeraldvermit");
        /* --- * --- */
		Redstonevermit = new Item_Redstonevermit(ID_Helper.RedstonevermitID)
				.setUnlocalizedName("polyblockz:redstone_vermit")
				.setCreativeTab(PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(Redstonevermit, "Redstonevermit");
        /* --- * --- */
		BlokkHouseParts = new Item_BlokkHouseParts(ID_Helper.BlokkHousePartsID)
				.setUnlocalizedName("polyblockz:blokkhouse_parts")
				.setCreativeTab(PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(BlokkHouseParts, "BlokkHouseParts");
        /* --- * --- */
		Citrin = new Item_Citrin(ID_Helper.CitrinID).setUnlocalizedName(
				"polyblockz:gem_citrin").setCreativeTab(
				PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(Citrin, "Citrin");
        /* --- * --- */
		Rubin = new Item_Rubin(ID_Helper.RubinID).setUnlocalizedName(
				"polyblockz:gem_rubin").setCreativeTab(
				PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(Rubin, "Rubin");
        /* --- * --- */
		Saphir = new Item_Saphir(ID_Helper.SaphirID).setUnlocalizedName(
				"polyblockz:gem_saphir").setCreativeTab(
				PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(Saphir, "Saphir");
        /* --- * --- */
		SmokeQuartz = new Item_SmokeQuartz(ID_Helper.SmokeQuartzID)
				.setUnlocalizedName("polyblockz:gem_smokequartz")
				.setCreativeTab(PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(SmokeQuartz, "SmokeQuartz");
        /* --- * --- */
		Spinell = new Item_Spinell(ID_Helper.SpinellID).setUnlocalizedName(
				"polyblockz:gem_spinell").setCreativeTab(
				PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(Spinell, "Spinell");
        /* --- * --- */
		AppleDiamond = new Item_applediamond(ID_Helper.AppleDiamondID, 7, 5.0F, true)
		.setCreativeTab(CreativeTabs.tabFood);
		LanguageRegistry.addName(AppleDiamond, "Apple Diamond");

		
		/*
		 * Tool IDs
		 */
		
		MithrilAxe = new Item_MithrilAxe(ID_Helper.MithrilAxeID, Mithril)
				.setUnlocalizedName("polyblockz:mithril_axe").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(MithrilAxe, "MithrilAxe");
        /* --- * --- */
		MithrilHoe = new Item_MithrilHoe(ID_Helper.MithrilHoeID, Mithril)
				.setUnlocalizedName("polyblockz:mithril_hoe").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(MithrilHoe, "MithrilHoe");
        /* --- * --- */
		MithrilShovel = new Item_MithrilShovel(ID_Helper.MithrilShovelID,
				Mithril).setUnlocalizedName("polyblockz:mithril_shovel")
				.setCreativeTab(PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(MithrilShovel, "MithrilShovel");
        /* --- * --- */
		MithrilSword = new Item_MithrilSword(ID_Helper.MithrilSwordID, Mithril)
				.setUnlocalizedName("polyblockz:mithril_sword").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(MithrilSword, "MithrilSword");
        /* --- * --- */
		MithrilPickaxe = new Item_MithrilPickaxe(ID_Helper.MithrilPickaxeID,
				Mithril).setUnlocalizedName("polyblockz:mithril_pickaxe")
				.setCreativeTab(PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(MithrilPickaxe, "MithrilPickaxe");
        /* --- * --- */
		EmeraldAxe = new Item_EmeraldAxe(ID_Helper.EmeraldAxeID, Emerald)
				.setUnlocalizedName("polyblockz:emerald_axe").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(EmeraldAxe, "EmeraldAxe");
        /* --- * --- */
		EmeraldHoe = new Item_EmeraldHoe(ID_Helper.EmeraldHoeID, Emerald)
				.setUnlocalizedName("polyblockz:emerald_hoe").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(EmeraldHoe, "EmeraldHoe");
        /* --- * --- */
		EmeraldShovel = new Item_EmeraldShovel(ID_Helper.EmeraldShovelID,
				Emerald).setUnlocalizedName("polyblockz:emerald_shovel")
				.setCreativeTab(PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(EmeraldShovel, "EmeraldShovel");
        /* --- * --- */
		EmeraldSword = new Item_EmeraldSword(ID_Helper.EmeraldSwordID, Emerald)
				.setUnlocalizedName("polyblockz:emerald_sword").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(EmeraldSword, "EmeraldSword");
        /* --- * --- */
		EmeraldPickaxe = new Item_EmeraldPickaxe(ID_Helper.EmeraldPickaxeID,
				Emerald).setUnlocalizedName("polyblockz:emerald_pickaxe")
				.setCreativeTab(PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(EmeraldPickaxe, "EmeraldPickaxe");
        /* --- * --- */
		RedstoneAxe = new Item_RedstoneAxe(ID_Helper.RedstoneAxeID, Redstone)
				.setUnlocalizedName("polyblockz:redstone_axe").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(RedstoneAxe, "RedstoneAxe");
        /* --- * --- */
		RedstoneHoe = new Item_RedstoneHoe(ID_Helper.RedstoneHoeID, Redstone)
				.setUnlocalizedName("polyblockz:redstone_hoe").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(RedstoneHoe, "RedstoneHoe");
        /* --- * --- */
		RedstoneShovel = new Item_RedstoneShovel(ID_Helper.RedstoneShovelID,
				Redstone).setUnlocalizedName("polyblockz:redstone_shovel")
				.setCreativeTab(PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(RedstoneShovel, "RedstoneShovel");
        /* --- * --- */
		RedstoneSword = new Item_RedstoneSword(ID_Helper.RedstoneSwordID,
				Redstone).setUnlocalizedName("polyblockz:redstone_sword")
				.setCreativeTab(PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(RedstoneSword, "RedstoneSword");
        /* --- * --- */
		RedstonePickaxe = new Item_RedstonePickaxe(ID_Helper.RedstonePickaxeID,
				Redstone).setUnlocalizedName("polyblockz:redstone_pickaxe")
				.setCreativeTab(PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(RedstonePickaxe, "RedstonePickaxe");
        /* --- * --- */
		CobbleMace = new Item_CobbleMace(ID_Helper.CobbleMaceID, Cobble)
				.setUnlocalizedName("polyblockz:cobble_mace").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(CobbleMace, "Cobble Mace");
        /* --- * --- */
		CobbleClub = new Item_CobbleClub(ID_Helper.CobbleClubID, Cobbleweak)
				.setUnlocalizedName("polyblockz:cobble_club").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		LanguageRegistry.addName(CobbleClub, "Cobble Club");

		
		/*
		 *  Horse Armor
		 *
		 * Redstone_Horse_Armor = new
		 * Redstone_Horse_Armor(IDHelper.Redstone_Horse_ArmorID)
		 * .setUnlocalizedName
		 * ("polyblockz:redstone_horse_armor").setCreativeTab(
		 * PolyBlockz.tabPolyBlockzItems);
		 * LanguageRegistry.addName(Redstone_Horse_Armor,
		 * "Redstone Horse Armor");
		 * 
		 * Emerald_Horse_Armor = new
		 * Emerald_Horse_Armor(IDHelper.Emerald_Horse_ArmorID)
		 * .setUnlocalizedName
		 * ("polyblockz:emerald_horse_armor").setCreativeTab(PolyBlockz
		 * .tabPolyBlockzItems); LanguageRegistry.addName(Emerald_Horse_Armor,
		 * "Emerald Horse Armor");
		 * 
		 * Mithril_Horse_Armor = new
		 * Mithril_Horse_Armor(IDHelper.Mithril_Horse_ArmorID)
		 * .setUnlocalizedName
		 * ("polyblockz:mithril_horse_armor").setCreativeTab(PolyBlockz
		 * .tabPolyBlockzItems); LanguageRegistry.addName(Mithril_Horse_Armor,
		 * "Mithril Horse Armor");
		 */

		
		/*
		 * Armor IDs
		 */

		MithrilHelm = new Item_MithrilHelm(ID_Helper.MithrilHelmID,
				MithrilArmorMat, ModLoader.addArmor("Mithril"), 0)
				.setUnlocalizedName("polyblockz:mithril_helm").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		// GameRegistry.registerItem(MithrilHelm, "MithrilHelm");
		LanguageRegistry.addName(MithrilHelm, "MithrilHelm");
        /* --- * --- */
		MithrilPlate = new Item_MithrilPlate(ID_Helper.MithrilPlateID,
				MithrilArmorMat, ModLoader.addArmor("Mithril"), 1)
				.setUnlocalizedName("polyblockz:mithril_plate").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		// GameRegistry.registerItem(MithrilPlate, "MithrilHelm");
		LanguageRegistry.addName(MithrilPlate, "MithrilPlate");
        /* --- * --- */
		MithrilLegs = new Item_MithrilLegs(ID_Helper.MithrilLegsID,
				MithrilArmorMat, ModLoader.addArmor("Mithril"), 2)
				.setUnlocalizedName("polyblockz:mithril_legs").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		// GameRegistry.registerItem(MithrilLegs, "MithrilHelm");
		LanguageRegistry.addName(MithrilLegs, "MithrilLegs");
        /* --- * --- */
		MithrilBoots = new Item_MithrilBoots(ID_Helper.MithrilBootsID,
				MithrilArmorMat, ModLoader.addArmor("Mithril"), 3)
				.setUnlocalizedName("polyblockz:mithril_boots").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		// GameRegistry.registerItem(MithrilBoots, "MithrilHelm");
		LanguageRegistry.addName(MithrilBoots, "MithrilBoots");
        /* --- * --- */
		EmeraldHelm = new Item_EmeraldHelm(ID_Helper.EmeraldHelmID,
				EmeraldArmorMat, ModLoader.addArmor("Emerald"), 0)
				.setUnlocalizedName("polyblockz:emerald_helm").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		// GameRegistry.registerItem(EmeraldHelm, "EmeraldHelm");
		LanguageRegistry.addName(EmeraldHelm, "EmeraldHelm");
        /* --- * --- */
		EmeraldPlate = new Item_EmeraldPlate(ID_Helper.EmeraldPlateID,
				EmeraldArmorMat, ModLoader.addArmor("Emerald"), 1)
				.setUnlocalizedName("polyblockz:emerald_plate").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		// GameRegistry.registerItem(EmeraldHelm, "EmeraldHelm");
		LanguageRegistry.addName(EmeraldPlate, "EmeraldPlate");
        /* --- * --- */
		EmeraldLegs = new Item_EmeraldLegs(ID_Helper.EmeraldLegsID,
				EmeraldArmorMat, ModLoader.addArmor("Emerald"), 2)
				.setUnlocalizedName("polyblockz:emerald_legs").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		// GameRegistry.registerItem(EmeraldHelm, "EmeraldHelm");
		LanguageRegistry.addName(EmeraldLegs, "EmeraldLegs");
        /* --- * --- */
		EmeraldBoots = new Item_EmeraldBoots(ID_Helper.EmeraldBootsID,
				EmeraldArmorMat, ModLoader.addArmor("Emerald"), 3)
				.setUnlocalizedName("polyblockz:emerald_boots").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		// GameRegistry.registerItem(EmeraldHelm, "EmeraldHelm");
		LanguageRegistry.addName(EmeraldBoots, "EmeraldBoots");
        /* --- * --- */
		RedstoneHelm = new Item_RedstoneHelm(ID_Helper.RedstoneHelmID,
				RedstoneArmorMat, ModLoader.addArmor("Redstone"), 0)
				.setUnlocalizedName("polyblockz:redstone_helm").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		// GameRegistry.registerItem(RedstoneHelm, "RedstoneHelm");
		LanguageRegistry.addName(RedstoneHelm, "RedstoneHelm");
        /* --- * --- */
		RedstonePlate = new Item_RedstonePlate(ID_Helper.RedstonePlateID,
				RedstoneArmorMat, ModLoader.addArmor("Redstone"), 1)
				.setUnlocalizedName("polyblockz:redstone_plate")
				.setCreativeTab(PolyBlockz.tabPolyBlockzItems);
		// dGameRegistry.registerItem(RedstoneHelm, "RedstoneHelm");
		LanguageRegistry.addName(RedstonePlate, "RedstonePlate");
        /* --- * --- */
		RedstoneLegs = new Item_RedstoneLegs(ID_Helper.RedstoneLegsID,
				RedstoneArmorMat, ModLoader.addArmor("Redstone"), 2)
				.setUnlocalizedName("polyblockz:redstone_legs").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		// GameRegistry.registerItem(RedstoneHelm, "RedstoneHelm");
		LanguageRegistry.addName(RedstoneLegs, "RedstoneLegs");
        /* --- * --- */
		RedstoneBoots = new Item_RedstoneBoots(ID_Helper.RedstoneBootsID,
				RedstoneArmorMat, ModLoader.addArmor("Redstone"), 3)
				.setUnlocalizedName("polyblockz:redstone_boots")
				.setCreativeTab(PolyBlockz.tabPolyBlockzItems);
		// GameRegistry.registerItem(RedstoneHelm, "RedstoneHelm");
		LanguageRegistry.addName(RedstoneBoots, "RedstoneBoots");
        /* --- * --- */
		CobbleHelm = new Item_CobbleHelm(ID_Helper.CobbleHelmID,
				CobbleArmorMat, ModLoader.addArmor("Cobble"), 0)
				.setUnlocalizedName("polyblockz:cobble_helm").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		// GameRegistry.registerItem(CobbleHelm, "CobbleHelm");
		LanguageRegistry.addName(CobbleHelm, "CobbleHelm");
        /* --- * --- */
		CobblePlate = new Item_CobblePlate(ID_Helper.CobblePlateID,
				CobbleArmorMat, ModLoader.addArmor("Cobble"), 1)
				.setUnlocalizedName("polyblockz:cobble_plate").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		// dGameRegistry.registerItem(CobbleHelm, "CobbleHelm");
		LanguageRegistry.addName(CobblePlate, "CobblePlate");
        /* --- * --- */
		CobbleLegs = new Item_CobbleLegs(ID_Helper.CobbleLegsID,
				CobbleArmorMat, ModLoader.addArmor("Cobble"), 2)
				.setUnlocalizedName("polyblockz:cobble_legs").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		// GameRegistry.registerItem(CobbleHelm, "CobbleHelm");
		LanguageRegistry.addName(CobbleLegs, "CobbleLegs");
        /* --- * --- */
		CobbleBoots = new Item_CobbleBoots(ID_Helper.CobbleBootsID,
				CobbleArmorMat, ModLoader.addArmor("Cobble"), 3)
				.setUnlocalizedName("polyblockz:cobble_boots").setCreativeTab(
						PolyBlockz.tabPolyBlockzItems);
		// GameRegistry.registerItem(CobbleHelm, "CobbleHelm");
		LanguageRegistry.addName(CobbleBoots, "CobbleBoots");

		
		proxy.registerRenderThings();

		
		MinecraftForge.setBlockHarvestLevel(Block_Helper.MithrilOre, "pickaxe",	3);

		MinecraftForge.setToolClass(MithrilAxe, "axe", 1);
			MinecraftForge.setToolClass(MithrilSword, "sword", 1);
				MinecraftForge.setToolClass(MithrilPickaxe, "pickaxe", 4);
					MinecraftForge.setToolClass(MithrilHoe, "hoe", 1);
						MinecraftForge.setToolClass(MithrilShovel, "shovel", 1);

		MinecraftForge.setToolClass(EmeraldAxe, "axe", 1);
			MinecraftForge.setToolClass(EmeraldSword, "sword", 1);
				MinecraftForge.setToolClass(EmeraldPickaxe, "pickaxe", 3);
					MinecraftForge.setToolClass(EmeraldHoe, "hoe", 1);
						MinecraftForge.setToolClass(EmeraldShovel, "shovel", 1);

		MinecraftForge.setToolClass(RedstoneAxe, "axe", 1);
			MinecraftForge.setToolClass(RedstoneSword, "sword", 1);
				MinecraftForge.setToolClass(RedstonePickaxe, "pickaxe", 3);
					MinecraftForge.setToolClass(RedstoneHoe, "hoe", 1);
						MinecraftForge.setToolClass(RedstoneShovel, "shovel", 1);

	}

	private static void initializeContainers() 
	{
		FluidContainerRegistry.registerFluidContainer(Block_Helper.Sewerage_Water, new ItemStack(Item_Helper.SewerageWaterBucket, 1, 1), new ItemStack(Item.bucketEmpty));
	}

	public static void setupSmeltingRecepies() 
	{
		/*
		 * Smelting Recepies
		 */
		
		GameRegistry.addSmelting(Item_Helper.Mithrilvermit.itemID, new ItemStack(Item_Helper.Mithril_Ingot, 1), 1.75F);
        /* --- * --- */
		GameRegistry.addSmelting(Item_Helper.Diamondform.itemID, new ItemStack(Item.diamond, 1), 4.5F);
        /* --- * --- */
		GameRegistry.addSmelting(Item_Helper.Emeraldvermit.itemID, new ItemStack(Item_Helper.Emerald_Ingot, 2), 1.5F);
        /* --- * --- */
		GameRegistry.addSmelting(Item_Helper.Redstonevermit.itemID,	new ItemStack(Item_Helper.Redstone_Ingot, 1), 1.0F);
        /* --- * --- */
		GameRegistry.addSmelting(Block_Helper.PolyamidOre.blockID, new ItemStack(Item_Helper.Polyamid_Ingot, 1), 0.5F);

	}
}
