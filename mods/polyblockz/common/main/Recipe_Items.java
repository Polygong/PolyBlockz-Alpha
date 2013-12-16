package mods.polyblockz.common.main;

import mods.polyblockz.common.PolyBlockz;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipe_Items 
{

	public static void setupItemsRecepies() 
	{
		/*
		 * Items
		 * */

		GameRegistry.addRecipe(new ItemStack(Item_Helper.grenade, 9),
				new Object[] { "xyx", "yyy", "xyx", 'x', Item.gunpowder, 'y', Item.ingotIron });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Block.commandBlock, 2),
				new Object[] { "ttt", "tzt", "ttt", 't', Item.redstone, 'z', Block.blockGold });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.Diamondform, 1),
				new Object[] { "ttt", "tkt", "ttt", 't', Block.blockIron, 'k', Block_Helper.BoneOre });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.beefRaw, 1), new Object[] {
				"kb", 'b', Item.sugar, 'k', Item.rottenFlesh });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.Mithrilvermit, 1),
				new Object[] { "mn", 'n', Item.ingotIron, 'm', Item_Helper.Mithrilflake });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.Emerald_Ingot, 2),
				new Object[] { "nn", 'n', Item.emerald });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.Redstone_Ingot, 2),
				new Object[] { "nn", 'n', Item.redstone });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.ingotIron, 1), new Object[] {
				"nnn", 'n', Item_Helper.Raspberry });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.ApplePie, 1),
				new Object[] { "nmb", 'n', Item.appleRed, 'm', Item.wheat, 'b', Item.sugar, 'e', Item.egg });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.Emeraldvermit, 1),
				new Object[] { "mn", 'n', Item.ingotIron, 'm', Item.emerald });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.Redstonevermit, 1),
				new Object[] { "mn", 'n', Item.ingotIron, 'm', Item.redstone });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.saddle, 1), new Object[] {
				"mmm", "m.m", "n.n", 'n', Item.ingotIron, 'm', Item.leather });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.BlokkHouseParts, 1),
				new Object[] { "wpw", "ppp", "ccc", 'c', Block.cobblestone, 'p', Block.planks, 'w', Block.wood });

		
		/*
		 * Blokk House
		 */

		GameRegistry.addRecipe(new ItemStack(Block_Helper.BlokkHouse_small, 1),
				new Object[] { "xxx", 'x', Item_Helper.BlokkHouseParts });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Block_Helper.BlokkHouse_middl, 1),
				new Object[] { "xxx", "xxx", 'x', Item_Helper.BlokkHouseParts });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Block_Helper.BlokkHouse_big, 1),
				new Object[] { "xxx", "xxx", "xxx", 'x', Item_Helper.BlokkHouseParts });

		/* 
		 * Spwan EGGs 
		 */

		GameRegistry.addRecipe(new ItemStack(Item.monsterPlacer, 1, 92),
				new Object[] { "bn", 'b', Item.egg, 'n', Item.beefRaw });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.monsterPlacer, 1, 90),
				new Object[] { "bn", 'b', Item.egg, 'n', Item.porkRaw });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.monsterPlacer, 1, 50),
				new Object[] { "bn", 'b', Item.egg, 'n', Item.gunpowder });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.monsterPlacer, 1, 51),
				new Object[] { "bn", 'b', Item.egg, 'n', Item.bone });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.monsterPlacer, 1, 52),
				new Object[] { "bn", 'b', Item.egg, 'n', Item.spiderEye });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.monsterPlacer, 1, 54),
				new Object[] { "bn", 'b', Item.egg, 'n', Item.rottenFlesh });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.monsterPlacer, 1, 55),
				new Object[] { "bn", 'b', Item.egg, 'n', Item.slimeBall });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.monsterPlacer, 1, 56),
				new Object[] { "bn", 'b', Item.egg, 'n', Item.ghastTear });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.monsterPlacer, 1, 57),
				new Object[] { "bnm", 'b', Item.egg, 'n', Item.rottenFlesh, 'm', Item.bone });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.monsterPlacer, 1, 58),
				new Object[] { "bn", 'b', Item.egg, 'n', Item.enderPearl });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.monsterPlacer, 1, 60),
				new Object[] { "bn", 'b', Item.egg, 'n', Block.cobblestone });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.monsterPlacer, 1, 61),
				new Object[] { "bn", 'b', Item.egg, 'n', Item.blazeRod });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.monsterPlacer, 1, 62),
				new Object[] { "bn", 'b', Item.egg, 'n', Item.magmaCream });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.monsterPlacer, 1, 66),
				new Object[] { "bn", 'b', Item.egg, 'n', Item.glassBottle });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.monsterPlacer, 1, 91),
				new Object[] { "bn", 'b', Item.egg, 'n', Block.cloth });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.monsterPlacer, 1, 93),
				new Object[] { "bn", 'b', Item.egg, 'n', Item.feather });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.monsterPlacer, 1, 96),
				new Object[] { "bn", "ml", 'b', Item.egg, 'n', Item.beefRaw, 'm', Block.mushroomBrown, 'l', Block.mushroomRed });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.monsterPlacer, 1, 94),
				new Object[] { "bn", 'b', Item.egg, 'n', new ItemStack(Item.dyePowder, 1, 0) });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.monsterPlacer, 1, 99),
				new Object[] { "bn", 'b', Item.egg, 'n', Block.blockIron });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.monsterPlacer, 1, 100),
				new Object[] { "bn", 'b', Item.egg, 'n', Item.saddle });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.monsterPlacer, 1, 120),
				new Object[] { "bn", 'b', Item.egg, 'n', Item.book });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.monsterPlacer, 1, 98),
				new Object[] { "bn", 'b', Item.egg, 'n', Item.fishCooked });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.monsterPlacer, 1, 95),
				new Object[] { "bn", 'b', Item.egg, 'n', Item.beefCooked });

		/*
		 * Tools
		 */

		GameRegistry.addRecipe(new ItemStack(Item_Helper.MithrilPickaxe, 1),
				new Object[] { "nnn", ".j.", ".j.", 'n', Item_Helper.Mithril_Ingot, 'j', Item.ingotIron });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.MithrilShovel, 1),
				new Object[] { ".n.", ".j.", ".j.", 'n', Item_Helper.Mithril_Ingot, 'j', Item.ingotIron });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.MithrilHoe, 1),
				new Object[] { "nn ", " j ", " j ", 'n', 	Item_Helper.Mithril_Ingot, 'j', Item.ingotIron });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.MithrilAxe, 1),
				new Object[] { "nnm", "nj ", " j ", 'n', Item_Helper.Mithril_Ingot, 'j', Item.ingotIron, 'm', Item_Helper.Mithrilflake });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.MithrilSword, 1),
				new Object[] { ".n.", ".n.", ".j.", 'n', Item_Helper.Mithril_Ingot, 'j', Item.ingotIron });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.EmeraldPickaxe, 1),
				new Object[] { "nnn", ".j.", ".j.", 'n', Item_Helper.Emerald_Ingot, 'j', Item.stick });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.EmeraldShovel, 1),
				new Object[] { ".n.", ".j.", ".j.", 'n', Item_Helper.Emerald_Ingot, 'j', Item.stick });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.EmeraldHoe, 1),
				new Object[] { "nn ", " j ", " j ", 'n', Item_Helper.Emerald_Ingot, 'j', Item.stick });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.EmeraldAxe, 1),
				new Object[] { "nn ", "nj ", " j ", 'n', Item_Helper.Emerald_Ingot, 'j', Item.stick });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.EmeraldSword, 1),
				new Object[] { ".n.", ".n.", ".j.", 'n', Item_Helper.Emerald_Ingot, 'j', Item.stick });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.RedstonePickaxe, 1),
				new Object[] { "nnn", ".j.", ".j.", 'n', Item_Helper.Redstone_Ingot, 'j', Item.stick });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.RedstoneShovel, 1),
				new Object[] { ".n.", ".j.", ".j.", 'n', Item_Helper.Redstone_Ingot, 'j', Item.stick });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.RedstoneHoe, 1),
				new Object[] { "nn ", " j ", " j ", 'n', Item_Helper.Redstone_Ingot, 'j', Item.stick });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.RedstoneAxe, 1),
				new Object[] { "nn ", "nj ", " j ", 'n', Item_Helper.Redstone_Ingot, 'j', Item.stick });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.RedstoneSword, 1),
				new Object[] { ".n.", ".n.", ".j.", 'n', Item_Helper.Redstone_Ingot, 'j', Item.stick });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.CobbleMace, 1),
				new Object[] { "nnn", ".n.", ".j.", 'n', Block.cobblestone, 'j', Item.stick });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.CobbleClub, 1),
				new Object[] { "nn.", ".n.", ".j.", 'n', Block.cobblestone, 'j', Item.stick });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.pickaxeIron, 1),
				new Object[] { "nnn", ".j.", ".j.", 'n', Item_Helper.Polyamid_Ingot, 'j', Item.stick });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.shovelIron, 1),
				new Object[] { ".n.", ".j.", ".j.", 'n', Item_Helper.Polyamid_Ingot, 'j', Item.stick });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.hoeIron, 1),
				new Object[] { "nn ", " j ", " j ", 'n', Item_Helper.Polyamid_Ingot, 'j', Item.stick });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.axeIron, 1),
				new Object[] { "nn e", "nj ", " j ", 'n', Item_Helper.Polyamid_Ingot, 'j', Item.stick });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.swordIron, 1),
				new Object[] { ".n.", ".n.", ".j.", 'n', Item_Helper.Polyamid_Ingot, 'j', Item.stick });

		
		/*
		 * Armor
		 */

		GameRegistry.addRecipe(new ItemStack(Item_Helper.MithrilHelm, 1),
				new Object[] { "nnn", "n.n", 'n', Item_Helper.Mithril_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.MithrilPlate, 1),
				new Object[] { "nnn", "nnn", "n.n", 'n', Item_Helper.Mithril_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.MithrilLegs, 1),
				new Object[] { "nnn", "n.n", "n.n", 'n', Item_Helper.Mithril_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.MithrilBoots, 1),
				new Object[] { "...", "n.n", "n.n", 'n', Item_Helper.Mithril_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.EmeraldHelm, 1),
				new Object[] { "nnn", "n.n", 'n', Item_Helper.Emerald_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.EmeraldPlate, 1),
				new Object[] { "nnn", "nnn", "n.n", 'n', Item_Helper.Emerald_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.EmeraldLegs, 1),
				new Object[] { "nnn", "n.n", "n.n", 'n', Item_Helper.Emerald_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.EmeraldBoots, 1),
				new Object[] { "...", "n.n", "n.n", 'n', Item_Helper.Emerald_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.RedstoneHelm, 1),
				new Object[] { "nnn", "n.n", 'n', Item_Helper.Redstone_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.RedstonePlate, 1),
				new Object[] { "nnn", "nnn", "n.n", 'n', Item_Helper.Redstone_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.RedstoneLegs, 1),
				new Object[] { "nnn", "n.n", "n.n", 'n', Item_Helper.Redstone_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.RedstoneBoots, 1),
				new Object[] { "...", "n.n", "n.n", 'n', Item_Helper.Redstone_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.CobbleHelm, 1),
				new Object[] { "nnn", "n.n", 'n', Block.cobblestone });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.CobblePlate, 1),
				new Object[] { "nnn", "nnn", "n.n", 'n', Block.cobblestone });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.CobbleLegs, 1),
				new Object[] { "nnn", "n.n", "n.n", 'n', Block.cobblestone });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item_Helper.CobbleBoots, 1),
				new Object[] { "...", "n.n", "n.n", 'n', Block.cobblestone });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.helmetIron, 1),
				new Object[] { "nnn", "n.n", 'n', Item_Helper.Polyamid_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.plateIron, 1),
				new Object[] { "nnn", "nnn", "n.n", 'n', Item_Helper.Polyamid_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.legsIron, 1),
				new Object[] { "nnn", "n.n", "n.n", 'n', Item_Helper.Polyamid_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.bootsIron, 1),
				new Object[] { "...", "n.n", "n.n", 'n', Item_Helper.Polyamid_Ingot });
        /* --- * --- */
		
		
		
		/*
		 * Custom Recepies
		 */
		
		GameRegistry.addRecipe(new ItemStack(Block_Helper.Polyamid_Block, 1),
				new Object[] { "nnn", "nnn", "nnn", 'n', Item_Helper.Polyamid_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Block.doorIron, 1),
				new Object[] { "nn.", "nn.", "nn.", 'n', Item_Helper.Polyamid_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.bucketEmpty, 1),
				new Object[] { "...", "n.n", ".n.", 'n', Item_Helper.Polyamid_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Block.cauldron, 1),
				new Object[] { "n.n", "n.n", "nnn", 'n', Item_Helper.Polyamid_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.shears, 1),
				new Object[] { "n..", ".n.", "...", 'n', Item_Helper.Polyamid_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.minecartEmpty, 1),
				new Object[] { "...", "n.n", "nnn", 'n', Item_Helper.Polyamid_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Block.fenceIron, 16),
				new Object[] { "...", "nnn", "nnn", 'n', Item_Helper.Polyamid_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Block.pressurePlateIron, 1),
				new Object[] { "...", "nn.", "...", 'n', Item_Helper.Polyamid_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.helmetIron, 1),
				new Object[] { "nnn", "n.n", "...", 'n', Item_Helper.Polyamid_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.plateIron, 1),
				new Object[] { "...", "...", "...", 'n', Item_Helper.Polyamid_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.legsIron, 1),
				new Object[] { "nnn", "n.n", "n.n", 'n', Item_Helper.Polyamid_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.bootsIron, 1),
				new Object[] { "...", "n.n", "n.n", 'n', Item_Helper.Polyamid_Ingot });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.shovelIron, 1),
				new Object[] { ".n.", ".j.", ".j.", 'n', Item_Helper.Polyamid_Ingot, 'j', Item.stick });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.pickaxeIron, 1),
				new Object[] { "nnn", ".j.", ".j.", 'n', Item_Helper.Polyamid_Ingot, 'j', Item.stick });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.axeIron, 1),
				new Object[] { "nn.", "nj.", ".j.", 'n', Item_Helper.Polyamid_Ingot, 'j', Item.stick });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.hoeIron, 1),
				new Object[] { "nn.", ".j.", ".j.", 'n', Item_Helper.Polyamid_Ingot, 'j', Item.stick });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.swordIron, 1),
				new Object[] { ".n.", ".n.", ".j.", 'n', Item_Helper.Polyamid_Ingot, 'j', Item.stick });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Block.rail, 16),
				new Object[] { "n.n", "njn", "n.n", 'n', Item_Helper.Polyamid_Ingot, 'j', Item.stick});
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Block.railDetector, 6),
				new Object[] { "n.n", "ndn", "nrn", 'n', Item_Helper.Polyamid_Ingot, 'n', Item.redstone, 'd', Block.pressurePlateStone });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.flintAndSteel, 1),
				new Object[] { "...", "n..", ".g.", 'n', Item_Helper.Polyamid_Ingot, 'g', Item.flint });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Item.compass, 1),
				new Object[] { ".n.", "nrn", ".n.", 'n', Item_Helper.Polyamid_Ingot, 'r', Item.redstone });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Block.pistonBase, 1),
				new Object[] { "ppp", "cnc", "crc", 'n', Item_Helper.Polyamid_Ingot, 'p', Block.planks, 'c', Block.cobblestone, 'r', Item.redstone});
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Block.anvil, 1),
				new Object[] { "ppp", ".n.", "nnn", 'n', Item_Helper.Polyamid_Ingot, 'p', Block_Helper.Polyamid_Block});
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Block.hopperBlock, 1),
				new Object[] { "n.n", "ntn", ".n.", 'n', Item_Helper.Polyamid_Ingot, 't', Block.chest });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Block.railActivator, 1),
				new Object[] { "njn", "ntn", "njn", 'n', Item_Helper.Polyamid_Ingot, 'j', Item.stick, 't', Block.torchRedstoneActive });
        /* --- * --- */
		GameRegistry.addRecipe(new ItemStack(Block.railPowered, 6),
				new Object[] { "n.n", "njn", "nrn", 'n', Item_Helper.Polyamid_Ingot, 'j', Item.stick , 'r', Item.redstone});
		
	}

}
